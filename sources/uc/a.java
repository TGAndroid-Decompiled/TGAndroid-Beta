package uc;

import android.os.AsyncTask;
import d9.l;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ho0;
import org.telegram.ui.nj0;
import org.telegram.ui.wn0;
import u2.c;
import vc.g;
import w7.n9;
public final class a extends AsyncTask {
    public final String f48074a;
    public final wc.a f48075b;
    public final wn0 f48076c;
    public final le.b d;

    public a(le.b bVar, String str, wc.a aVar, wn0 wn0Var) {
        this.d = bVar;
        this.f48074a = str;
        this.f48075b = aVar;
        this.f48076c = wn0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        le.b bVar = this.d;
        try {
            c c10 = xc.b.c(n9.a(this.f48075b), new l(this.f48074a, 3));
            Object obj = bVar.f16072b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = bVar.f16072b;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f16072b;
        c cVar = bVar.f48077a;
        wn0 wn0Var = this.f48076c;
        if (cVar != null) {
            ho0 ho0Var = wn0Var.f43378a;
            if (ho0Var.Q0) {
                return;
            }
            ho0Var.f37949w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) cVar.f47712c, (String) cVar.f47711b);
            AndroidUtilities.runOnUIThread(new nj0(wn0Var, 10));
            return;
        }
        Exception exc = bVar.f48078b;
        if (exc != null) {
            wn0Var.a(exc);
        } else {
            wn0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
