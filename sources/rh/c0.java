package rh;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.FileLog;
import ph.d4;
public final class c0 extends AsyncTask {
    public String f43482a;
    public long f43483b;
    public final String f43484c;
    public final d4 d;

    public c0(String str, d4 d4Var) {
        this.f43484c = str;
        this.d = d4Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f43484c).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setConnectTimeout(1000);
            httpURLConnection.setReadTimeout(1000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.setDoInput(false);
            httpURLConnection.getResponseCode();
            if (Build.VERSION.SDK_INT >= 24) {
                this.f43483b = httpURLConnection.getContentLengthLong();
            } else {
                this.f43483b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f43482a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f43482a;
                this.f43482a = str.substring(0, str.indexOf("; "));
            }
            httpURLConnection.getInputStream().close();
            return null;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        i0.h.put(this.f43484c, new Pair(this.f43482a, Long.valueOf(this.f43483b)));
        this.d.run(this.f43482a, Long.valueOf(this.f43483b));
    }
}
