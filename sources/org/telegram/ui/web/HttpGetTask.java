package org.telegram.ui.web;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.Utilities;

public class HttpGetTask extends AsyncTask {
    private final Utilities.Callback callback;
    private Exception exception;
    private final HashMap headers = new HashMap();

    public HttpGetTask(Utilities.Callback callback) {
        this.callback = callback;
    }

    @Override
    public String doInBackground(String... strArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
            for (Map.Entry entry : this.headers.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            int responseCode = httpURLConnection.getResponseCode();
            BufferedReader bufferedReader = (responseCode < 200 || responseCode >= 300) ? new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream())) : new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append(readLine);
            }
        } catch (Exception e) {
            this.exception = e;
            return null;
        }
    }

    @Override
    public void onPostExecute(String str) {
        Utilities.Callback callback = this.callback;
        if (callback != null) {
            if (this.exception != null) {
                str = null;
            }
            callback.run(str);
        }
    }
}
