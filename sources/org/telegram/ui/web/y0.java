package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.qz;
import org.telegram.messenger.z10;
import org.telegram.ui.x21;
public final class y0 extends AsyncTask {
    public final int f52883a = 1;
    public final HashMap f52884b = new HashMap();
    public Exception f52885c;
    public final z10 d;

    public y0(z10 z10Var) {
        this.d = z10Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        BufferedReader bufferedReader;
        switch (this.f52883a) {
            case 0:
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
                    for (Map.Entry entry : this.f52884b.entrySet()) {
                        if (entry.getKey() != null && entry.getValue() != null) {
                            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setDoInput(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode >= 200 && responseCode < 300) {
                        if (httpURLConnection.getContentType() != null && httpURLConnection.getContentType().contains("svg")) {
                            return qz.g(new BufferedInputStream(httpURLConnection.getInputStream()), 64, 64);
                        }
                        return BitmapFactory.decodeStream(new BufferedInputStream(httpURLConnection.getInputStream()));
                    }
                    httpURLConnection.disconnect();
                    return null;
                } catch (Exception e10) {
                    this.f52885c = e10;
                    return null;
                }
            default:
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
                    for (Map.Entry entry2 : this.f52884b.entrySet()) {
                        if (entry2.getKey() != null && entry2.getValue() != null) {
                            httpURLConnection2.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    }
                    httpURLConnection2.setRequestMethod("GET");
                    httpURLConnection2.setDoInput(true);
                    int responseCode2 = httpURLConnection2.getResponseCode();
                    if (responseCode2 >= 200 && responseCode2 < 300) {
                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream()));
                    } else {
                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getErrorStream()));
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
                } catch (Exception e11) {
                    this.f52885c = e11;
                    return null;
                }
                break;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        switch (this.f52883a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                x21 x21Var = (x21) this.d;
                if (x21Var != null) {
                    if (this.f52885c == null) {
                        x21Var.a(bitmap);
                        return;
                    } else {
                        x21Var.a(null);
                        return;
                    }
                }
                return;
            default:
                String str = (String) obj;
                z10 z10Var = this.d;
                if (z10Var != null) {
                    if (this.f52885c == null) {
                        z10Var.a(str);
                        return;
                    } else {
                        z10Var.a(null);
                        return;
                    }
                }
                return;
        }
    }

    public y0(x21 x21Var) {
        this.d = x21Var;
    }
}
