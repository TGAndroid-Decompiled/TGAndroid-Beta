package sh;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.FileLog;
import qh.d4;
public final class b0 extends AsyncTask {
    public String f47364a;
    public long f47365b;
    public final String f47366c;
    public final d4 d;

    public b0(String str, d4 d4Var) {
        this.f47366c = str;
        this.d = d4Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f47366c).openConnection();
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
                this.f47365b = httpURLConnection.getContentLengthLong();
            } else {
                this.f47365b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f47364a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f47364a;
                this.f47364a = str.substring(0, str.indexOf("; "));
            }
            httpURLConnection.getInputStream().close();
            return null;
        } catch (Exception e6) {
            FileLog.e(e6);
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        h0.h.put(this.f47366c, new Pair(this.f47364a, Long.valueOf(this.f47365b)));
        this.d.run(this.f47364a, Long.valueOf(this.f47365b));
    }
}
