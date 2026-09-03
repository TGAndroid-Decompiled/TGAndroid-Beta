package rh;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.FileLog;
import ph.d4;
public final class b0 extends AsyncTask {
    public String f43533a;
    public long f43534b;
    public final String f43535c;
    public final d4 d;

    public b0(String str, d4 d4Var) {
        this.f43535c = str;
        this.d = d4Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f43535c).openConnection();
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
                this.f43534b = httpURLConnection.getContentLengthLong();
            } else {
                this.f43534b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.f43533a = contentType;
            if (contentType.contains("; ")) {
                String str = this.f43533a;
                this.f43533a = str.substring(0, str.indexOf("; "));
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
        h0.h.put(this.f43535c, new Pair(this.f43533a, Long.valueOf(this.f43534b)));
        this.d.run(this.f43533a, Long.valueOf(this.f43534b));
    }
}
