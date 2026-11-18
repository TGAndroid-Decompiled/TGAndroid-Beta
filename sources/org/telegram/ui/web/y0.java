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
import org.telegram.messenger.mz;
import org.telegram.messenger.x10;
import org.telegram.ui.p51;
public final class y0 extends AsyncTask {
    public final int f53363a = 1;
    public final HashMap f53364b = new HashMap();
    public Exception f53365c;
    public final x10 d;

    public y0(x10 x10Var) {
        this.d = x10Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        BufferedReader bufferedReader;
        switch (this.f53363a) {
            case 0:
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
                    for (Map.Entry entry : this.f53364b.entrySet()) {
                        if (entry.getKey() != null && entry.getValue() != null) {
                            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setDoInput(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode >= 200 && responseCode < 300) {
                        if (httpURLConnection.getContentType() != null && httpURLConnection.getContentType().contains("svg")) {
                            return mz.g(new BufferedInputStream(httpURLConnection.getInputStream()), 64, 64);
                        }
                        return BitmapFactory.decodeStream(new BufferedInputStream(httpURLConnection.getInputStream()));
                    }
                    httpURLConnection.disconnect();
                    return null;
                } catch (Exception e10) {
                    this.f53365c = e10;
                    return null;
                }
            default:
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
                    for (Map.Entry entry2 : this.f53364b.entrySet()) {
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
                    this.f53365c = e11;
                    return null;
                }
                break;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        switch (this.f53363a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                p51 p51Var = (p51) this.d;
                if (p51Var != null) {
                    if (this.f53365c == null) {
                        p51Var.a(bitmap);
                        return;
                    } else {
                        p51Var.a(null);
                        return;
                    }
                }
                return;
            default:
                String str = (String) obj;
                x10 x10Var = this.d;
                if (x10Var != null) {
                    if (this.f53365c == null) {
                        x10Var.a(str);
                        return;
                    } else {
                        x10Var.a(null);
                        return;
                    }
                }
                return;
        }
    }

    public y0(p51 p51Var) {
        this.d = p51Var;
    }
}
