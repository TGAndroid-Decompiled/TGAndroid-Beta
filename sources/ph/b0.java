package ph;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import nh.t4;
import org.telegram.messenger.FileLog;
public final class b0 extends AsyncTask {
    public String f45741a;
    public long f45742b;
    public final String f45743c;
    public final t4 d;

    public b0(String str, t4 t4Var) {
        this.f45743c = str;
        this.d = t4Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f45743c).openConnection();
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
                this.f45742b = httpURLConnection.getContentLengthLong();
            } else {
                this.f45742b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f45741a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f45741a;
                this.f45741a = str.substring(0, str.indexOf("; "));
            }
            httpURLConnection.getInputStream().close();
            return null;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        h0.h.put(this.f45743c, new Pair(this.f45741a, Long.valueOf(this.f45742b)));
        this.d.run(this.f45741a, Long.valueOf(this.f45742b));
    }
}
