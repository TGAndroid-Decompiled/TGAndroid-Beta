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
import org.telegram.ui.Wallet.z6;
public final class i1 extends AsyncTask {
    public final HashMap f41074a = new HashMap();
    public final z6 f41075b;
    public Exception f41076c;

    public i1(z6 z6Var) {
        this.f41075b = z6Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
            for (Map.Entry entry : this.f41074a.entrySet()) {
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
            this.f41076c = e;
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        z6 z6Var = this.f41075b;
        if (z6Var != null) {
            if (this.f41076c == null) {
                z6Var.run(bitmap);
            } else {
                z6Var.run(null);
            }
        }
    }
}
