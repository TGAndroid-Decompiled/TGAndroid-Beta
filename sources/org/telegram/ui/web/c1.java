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
import org.telegram.messenger.e00;
import org.telegram.messenger.r20;
import org.telegram.ui.d01;
public final class c1 extends AsyncTask {
    public final int f42806a = 1;
    public final HashMap f42807b = new HashMap();
    public Exception f42808c;
    public final r20 d;

    public c1(r20 r20Var) {
        this.d = r20Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        BufferedReader bufferedReader;
        switch (this.f42806a) {
            case 0:
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
                    for (Map.Entry entry : this.f42807b.entrySet()) {
                        if (entry.getKey() != null && entry.getValue() != null) {
                            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setDoInput(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode >= 200 && responseCode < 300) {
                        if (httpURLConnection.getContentType() != null && httpURLConnection.getContentType().contains("svg")) {
                            return e00.g(new BufferedInputStream(httpURLConnection.getInputStream()), 64, 64);
                        }
                        return BitmapFactory.decodeStream(new BufferedInputStream(httpURLConnection.getInputStream()));
                    }
                    httpURLConnection.disconnect();
                    return null;
                } catch (Exception e) {
                    this.f42808c = e;
                    return null;
                }
            default:
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
                    for (Map.Entry entry2 : this.f42807b.entrySet()) {
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
                } catch (Exception e7) {
                    this.f42808c = e7;
                    return null;
                }
                break;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        switch (this.f42806a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                d01 d01Var = (d01) this.d;
                if (d01Var != null) {
                    if (this.f42808c == null) {
                        d01Var.a(bitmap);
                        return;
                    } else {
                        d01Var.a(null);
                        return;
                    }
                }
                return;
            default:
                String str = (String) obj;
                r20 r20Var = this.d;
                if (r20Var != null) {
                    if (this.f42808c == null) {
                        r20Var.a(str);
                        return;
                    } else {
                        r20Var.a(null);
                        return;
                    }
                }
                return;
        }
    }

    public c1(d01 d01Var) {
        this.d = d01Var;
    }
}
