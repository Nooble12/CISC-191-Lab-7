package edu.sdccd.cisc191;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *
 * @author Tim Tran
 */
public class IOLab
{
    public static String readTestResults(String path)
    {
        StringBuilder results = new StringBuilder();
        ClassLoader classLoader = IOLab.class.getClassLoader();
        URL resource = classLoader.getResource(path);
        BufferedReader reader;
        try
        {
            if (resource != null)
            {
                reader = new BufferedReader(new InputStreamReader(resource.openStream()));
            }
            else
            {
               reader = new BufferedReader(new FileReader(path));
            }

            String line;
            while ((line = reader.readLine()) != null)
            {
                results.append(line).append("\n");
            }
        }
        catch (Exception e)
        {
            return "";
        }
        return results.toString().trim();
    }

    public static void appendTestResult(String fileName, String newLine)
    {
        File file = new File(fileName);

        try (FileWriter writer = new FileWriter(file, true);
             PrintWriter printWriter = new PrintWriter(writer))
        {
            printWriter.println(newLine);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static String readDateTime(String url)
    {
        try
        {
            // Creates URL using the input string.
            URL url1 = new URL(url);

            // Creates a HttpURLConnection and opens using url1.
            HttpURLConnection connection = (HttpURLConnection) url1.openConnection();

            // Sets the request to get the data from the url.
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            // Checks if the server response is ok.
            if (responseCode == HttpURLConnection.HTTP_OK)
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String response = reader.readLine();
                String prefix = "\"datetime\":\"";

                // Find the starting index of the datetime value by locating the prefix and adjusting for its length
                int startIndex = response.indexOf(prefix) + prefix.length();

                // Finds when the date time string ends.
                int endIndex = response.indexOf("\"", startIndex);

                // Ensure indices are valid before extracting the substring
                if (startIndex > prefix.length() && endIndex > startIndex)
                {
                    return response.substring(startIndex, endIndex);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}

/**
 *     What abstractions make it possible to use similar code to read from/write to a file, console, or webpage?
 *     How is data buffered in transit?
 *     What are the similarities and differences between Character and Byte streams? Which did you use and why?
 *           java.io.InputStream and java.io.OutputStream
 *     What are Buffered streams used for? Did you use and why?
 */