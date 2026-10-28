package vc;

import a8.s0;
import android.os.AsyncTask;
import he.v;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.go0;
import org.telegram.ui.nj0;
import org.telegram.ui.ro0;
import s4.d;
import s4.o0;
import wc.g;
public final class a extends AsyncTask {
    public final String f50137a;
    public final xc.a f50138b;
    public final go0 f50139c;
    public final o0 d;

    public a(o0 o0Var, String str, xc.a aVar, go0 go0Var) {
        this.d = o0Var;
        this.f50137a = str;
        this.f50138b = aVar;
        this.f50139c = go0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        o0 o0Var = this.d;
        try {
            d c10 = yc.b.c(s0.a(this.f50138b), new v(this.f50137a, 1));
            Object obj = o0Var.f47851a;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = o0Var.f47851a;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f47851a;
        d dVar = bVar.f50140a;
        go0 go0Var = this.f50139c;
        if (dVar != null) {
            ro0 ro0Var = go0Var.f39663a;
            if (ro0Var.Q0) {
                return;
            }
            ro0Var.f43132w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) dVar.f47756c, (String) dVar.f47755b);
            AndroidUtilities.runOnUIThread(new nj0(go0Var, 10));
            return;
        }
        Exception exc = bVar.f50141b;
        if (exc != null) {
            go0Var.a(exc);
        } else {
            go0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
