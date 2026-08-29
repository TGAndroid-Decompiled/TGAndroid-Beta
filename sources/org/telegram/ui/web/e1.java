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
import org.telegram.ui.yu0;
public final class e1 extends AsyncTask {
    public final HashMap f44018a = new HashMap();
    public final yu0 f44019b;
    public Exception f44020c;

    public e1(yu0 yu0Var) {
        this.f44019b = yu0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
            for (Map.Entry entry : this.f44018a.entrySet()) {
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
        } catch (Exception e10) {
            this.f44020c = e10;
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        yu0 yu0Var = this.f44019b;
        if (yu0Var != null) {
            if (this.f44020c == null) {
                yu0Var.run(bitmap);
            } else {
                yu0Var.run(null);
            }
        }
    }
}
