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
import org.telegram.ui.bt;
public final class h1 extends AsyncTask {
    public final HashMap f39175a = new HashMap();
    public final bt f39176b;
    public Exception f39177c;

    public h1(bt btVar) {
        this.f39176b = btVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
            for (Map.Entry entry : this.f39175a.entrySet()) {
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
        } catch (Exception e) {
            this.f39177c = e;
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bt btVar = this.f39176b;
        if (btVar != null) {
            if (this.f39177c == null) {
                btVar.run(bitmap);
            } else {
                btVar.run(null);
            }
        }
    }
}
