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
import org.telegram.messenger.kz;
import org.telegram.messenger.u10;
import org.telegram.ui.e51;
public final class z0 extends AsyncTask {
    public final int f51130a = 1;
    public final HashMap f51131b = new HashMap();
    public Exception f51132c;
    public final u10 d;

    public z0(u10 u10Var) {
        this.d = u10Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        BufferedReader bufferedReader;
        switch (this.f51130a) {
            case 0:
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
                    for (Map.Entry entry : this.f51131b.entrySet()) {
                        if (entry.getKey() != null && entry.getValue() != null) {
                            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setDoInput(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode >= 200 && responseCode < 300) {
                        if (httpURLConnection.getContentType() != null && httpURLConnection.getContentType().contains("svg")) {
                            return kz.g(new BufferedInputStream(httpURLConnection.getInputStream()), 64, 64);
                        }
                        return BitmapFactory.decodeStream(new BufferedInputStream(httpURLConnection.getInputStream()));
                    }
                    httpURLConnection.disconnect();
                    return null;
                } catch (Exception e10) {
                    this.f51132c = e10;
                    return null;
                }
            default:
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
                    for (Map.Entry entry2 : this.f51131b.entrySet()) {
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
                    this.f51132c = e11;
                    return null;
                }
                break;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        switch (this.f51130a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                e51 e51Var = (e51) this.d;
                if (e51Var != null) {
                    if (this.f51132c == null) {
                        e51Var.a(bitmap);
                        return;
                    } else {
                        e51Var.a(null);
                        return;
                    }
                }
                return;
            default:
                String str = (String) obj;
                u10 u10Var = this.d;
                if (u10Var != null) {
                    if (this.f51132c == null) {
                        u10Var.a(str);
                        return;
                    } else {
                        u10Var.a(null);
                        return;
                    }
                }
                return;
        }
    }

    public z0(e51 e51Var) {
        this.d = e51Var;
    }
}
