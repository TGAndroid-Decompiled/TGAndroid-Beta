package xh;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.f8;
public final class y extends AsyncTask {
    public String f54130a;
    public long f54131b;
    public final String f54132c;
    public final qh.d d;

    public y(String str, qh.d dVar) {
        this.f54132c = str;
        this.d = dVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f54132c).openConnection();
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
                this.f54131b = httpURLConnection.getContentLengthLong();
            } else {
                this.f54131b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f54130a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f54130a;
                this.f54130a = str.substring(0, str.indexOf("; "));
            }
            httpURLConnection.getInputStream().close();
            return null;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        f0.h.put(this.f54132c, new Pair(this.f54130a, Long.valueOf(this.f54131b)));
        this.d.a(this.f54130a, Long.valueOf(this.f54131b));
    }
}
