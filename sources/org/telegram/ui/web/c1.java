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
import org.telegram.messenger.d00;
import org.telegram.messenger.q20;
import org.telegram.ui.f11;
public final class c1 extends AsyncTask {
    public final int f43004a = 1;
    public final HashMap f43005b = new HashMap();
    public Exception f43006c;
    public final q20 d;

    public c1(q20 q20Var) {
        this.d = q20Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        BufferedReader bufferedReader;
        switch (this.f43004a) {
            case 0:
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
                    for (Map.Entry entry : this.f43005b.entrySet()) {
                        if (entry.getKey() != null && entry.getValue() != null) {
                            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setDoInput(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode >= 200 && responseCode < 300) {
                        if (httpURLConnection.getContentType() != null && httpURLConnection.getContentType().contains("svg")) {
                            return d00.g(new BufferedInputStream(httpURLConnection.getInputStream()), 64, 64);
                        }
                        return BitmapFactory.decodeStream(new BufferedInputStream(httpURLConnection.getInputStream()));
                    }
                    httpURLConnection.disconnect();
                    return null;
                } catch (Exception e) {
                    this.f43006c = e;
                    return null;
                }
            default:
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
                    for (Map.Entry entry2 : this.f43005b.entrySet()) {
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
                    this.f43006c = e7;
                    return null;
                }
                break;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        switch (this.f43004a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                f11 f11Var = (f11) this.d;
                if (f11Var != null) {
                    if (this.f43006c == null) {
                        f11Var.a(bitmap);
                        return;
                    } else {
                        f11Var.a(null);
                        return;
                    }
                }
                return;
            default:
                String str = (String) obj;
                q20 q20Var = this.d;
                if (q20Var != null) {
                    if (this.f43006c == null) {
                        q20Var.a(str);
                        return;
                    } else {
                        q20Var.a(null);
                        return;
                    }
                }
                return;
        }
    }

    public c1(f11 f11Var) {
        this.d = f11Var;
    }
}
