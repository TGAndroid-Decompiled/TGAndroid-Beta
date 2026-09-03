package sh;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.FileLog;
import qh.c4;
public final class b0 extends AsyncTask {
    public String f47400a;
    public long f47401b;
    public final String f47402c;
    public final c4 d;

    public b0(String str, c4 c4Var) {
        this.f47402c = str;
        this.d = c4Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f47402c).openConnection();
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
                this.f47401b = httpURLConnection.getContentLengthLong();
            } else {
                this.f47401b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f47400a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f47400a;
                this.f47400a = str.substring(0, str.indexOf("; "));
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
        h0.h.put(this.f47402c, new Pair(this.f47400a, Long.valueOf(this.f47401b)));
        this.d.run(this.f47400a, Long.valueOf(this.f47401b));
    }
}
