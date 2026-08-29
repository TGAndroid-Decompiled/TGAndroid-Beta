package org.telegram.ui.web;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.Utilities;
public final class f1 extends AsyncTask {
    public final HashMap f44029a = new HashMap();
    public final Utilities.Callback f44030b;
    public Exception f44031c;

    public f1(Utilities.Callback callback) {
        this.f44030b = callback;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        BufferedReader bufferedReader;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
            for (Map.Entry entry : this.f44029a.entrySet()) {
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
        } catch (Exception e10) {
            this.f44031c = e10;
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        Utilities.Callback callback = this.f44030b;
        if (callback != null) {
            if (this.f44031c == null) {
                callback.run(str);
            } else {
                callback.run(null);
            }
        }
    }
}
