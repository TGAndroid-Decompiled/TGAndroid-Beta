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
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda51;

public final class HttpGetBitmapTask extends AsyncTask {
    public final RichEditor$$ExternalSyntheticLambda51 callback;
    public Exception exception;
    public final HashMap headers = new HashMap();

    public HttpGetBitmapTask(RichEditor$$ExternalSyntheticLambda51 richEditor$$ExternalSyntheticLambda51) {
        this.callback = richEditor$$ExternalSyntheticLambda51;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
            for (Map.Entry entry : this.headers.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200 && responseCode < 300) {
                return (httpURLConnection.getContentType() == null || !httpURLConnection.getContentType().contains("svg")) ? BitmapFactory.decodeStream(new BufferedInputStream(httpURLConnection.getInputStream())) : SvgHelper.getBitmap((InputStream) new BufferedInputStream(httpURLConnection.getInputStream()), 64, 64, false);
            }
            httpURLConnection.disconnect();
            return null;
        } catch (Exception e) {
            this.exception = e;
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        RichEditor$$ExternalSyntheticLambda51 richEditor$$ExternalSyntheticLambda51 = this.callback;
        if (richEditor$$ExternalSyntheticLambda51 != null) {
            if (this.exception == null) {
                richEditor$$ExternalSyntheticLambda51.run(bitmap);
            } else {
                richEditor$$ExternalSyntheticLambda51.run(null);
            }
        }
    }
}
