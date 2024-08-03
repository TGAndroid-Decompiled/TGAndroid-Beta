package org.telegram.ui.web;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.Utilities;
public class HttpPostTask extends AsyncTask<String, Void, String> {
    private final Utilities.Callback<String> callback;
    private final String data;
    private final String dataMime;
    private Exception exception;
    private final HashMap<String, String> headers = new HashMap<>();

    public HttpPostTask(String str, String str2, Utilities.Callback<String> callback) {
        this.dataMime = str;
        this.data = str2;
        this.callback = callback;
    }

    public HttpPostTask setHeader(String str, String str2) {
        this.headers.put(str, str2);
        return this;
    }

    @Override
    public String doInBackground(String... strArr) {
        BufferedReader bufferedReader;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
            httpURLConnection.setRequestMethod("POST");
            for (Map.Entry<String, String> entry : this.headers.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", this.dataMime);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            byte[] bytes = this.data.getBytes("utf-8");
            outputStream.write(bytes, 0, bytes.length);
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200 && responseCode < 300) {
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            } else {
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    return sb.toString();
                }
            }
        } catch (Exception e) {
            this.exception = e;
            return null;
        }
    }

    @Override
    public void onPostExecute(String str) {
        Utilities.Callback<String> callback = this.callback;
        if (callback != null) {
            if (this.exception == null) {
                callback.run(str);
            } else {
                callback.run(null);
            }
        }
    }
}
