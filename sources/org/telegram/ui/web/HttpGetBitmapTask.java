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
import org.telegram.messenger.Utilities;

public class HttpGetBitmapTask extends AsyncTask {
    private final Utilities.Callback callback;
    private Exception exception;
    private final HashMap headers = new HashMap();

    public HttpGetBitmapTask(Utilities.Callback callback) {
        this.callback = callback;
    }

    @Override
    public Bitmap doInBackground(String... strArr) {
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
    public void onPostExecute(Bitmap bitmap) {
        Utilities.Callback callback = this.callback;
        if (callback != null) {
            if (this.exception != null) {
                bitmap = null;
            }
            callback.run(bitmap);
        }
    }
}
