package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.oj0;
public final class j1 extends AsyncTask {
    public final HashMap f42139a = new HashMap();
    public final oj0 f42140b;
    public Exception f42141c;

    public j1(oj0 oj0Var) {
        this.f42140b = oj0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
            for (Map.Entry entry : this.f42139a.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200 && responseCode < 300) {
                if (httpURLConnection.getContentType() != null && httpURLConnection.getContentType().contains("svg")) {
                    return SvgHelper.getBitmap((InputStream) new BufferedInputStream(httpURLConnection.getInputStream()), 64, 64, false);
                }
                return BitmapFactory.decodeStream(new BufferedInputStream(httpURLConnection.getInputStream()));
            }
            httpURLConnection.disconnect();
            return null;
        } catch (Exception e7) {
            this.f42141c = e7;
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        oj0 oj0Var = this.f42140b;
        if (oj0Var != null) {
            if (this.f42141c == null) {
                oj0Var.run(bitmap);
            } else {
                oj0Var.run(null);
            }
        }
    }
}
