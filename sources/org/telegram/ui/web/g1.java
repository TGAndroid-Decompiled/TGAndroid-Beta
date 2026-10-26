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
public final class g1 extends AsyncTask {
    public final HashMap f45249a = new HashMap();
    public final org.telegram.ui.Wallet.s f45250b;
    public Exception f45251c;

    public g1(org.telegram.ui.Wallet.s sVar) {
        this.f45250b = sVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
            for (Map.Entry entry : this.f45249a.entrySet()) {
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
            this.f45251c = e;
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        org.telegram.ui.Wallet.s sVar = this.f45250b;
        if (sVar != null) {
            if (this.f45251c == null) {
                sVar.run(bitmap);
            } else {
                sVar.run(null);
            }
        }
    }
}
