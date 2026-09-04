package org.telegram.ui.web;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.Utilities;
public final class k1 extends AsyncTask {
    public final HashMap f42153a = new HashMap();
    public final Utilities.Callback f42154b;
    public Exception f42155c;

    public k1(Utilities.Callback callback) {
        this.f42154b = callback;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        BufferedReader bufferedReader;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
            for (Map.Entry entry : this.f42153a.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200 && responseCode < 300) {
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            } else {
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            }
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                } else {
                    bufferedReader.close();
                    return sb2.toString();
                }
            }
        } catch (Exception e7) {
            this.f42155c = e7;
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        Utilities.Callback callback = this.f42154b;
        if (callback != null) {
            if (this.f42155c == null) {
                callback.run(str);
            } else {
                callback.run(null);
            }
        }
    }
}
