package uc;

import android.os.AsyncTask;
import d9.l;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.io0;
import org.telegram.ui.oj0;
import org.telegram.ui.xn0;
import u2.c;
import vc.g;
import w7.n9;
public final class a extends AsyncTask {
    public final String f48075a;
    public final wc.a f48076b;
    public final xn0 f48077c;
    public final le.b d;

    public a(le.b bVar, String str, wc.a aVar, xn0 xn0Var) {
        this.d = bVar;
        this.f48075a = str;
        this.f48076b = aVar;
        this.f48077c = xn0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        le.b bVar = this.d;
        try {
            c c10 = xc.b.c(n9.a(this.f48076b), new l(this.f48075a, 3));
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
        c cVar = bVar.f48078a;
        xn0 xn0Var = this.f48077c;
        if (cVar != null) {
            io0 io0Var = xn0Var.f43625a;
            if (io0Var.Q0) {
                return;
            }
            io0Var.f38322w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) cVar.f47713c, (String) cVar.f47712b);
            AndroidUtilities.runOnUIThread(new oj0(xn0Var, 10));
            return;
        }
        Exception exc = bVar.f48079b;
        if (exc != null) {
            xn0Var.a(exc);
        } else {
            xn0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
