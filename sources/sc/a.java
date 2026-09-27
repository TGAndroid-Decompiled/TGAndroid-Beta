package sc;

import android.os.AsyncTask;
import ee.v;
import java.util.Locale;
import k2.u;
import la.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.go0;
import org.telegram.ui.ml0;
import org.telegram.ui.ro0;
import tc.g;
import w7.s8;
public final class a extends AsyncTask {
    public final String f43226a;
    public final uc.a f43227b;
    public final go0 f43228c;
    public final u d;

    public a(u uVar, String str, uc.a aVar, go0 go0Var) {
        this.d = uVar;
        this.f43226a = str;
        this.f43227b = aVar;
        this.f43228c = go0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        u uVar = this.d;
        try {
            h c10 = vc.b.c(s8.a(this.f43227b), new v(this.f43226a, 3));
            Object obj = uVar.f13371a;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = uVar.f13371a;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f13371a;
        h hVar = bVar.f43229a;
        go0 go0Var = this.f43228c;
        if (hVar != null) {
            ro0 ro0Var = go0Var.f33984a;
            if (ro0Var.Q0) {
                return;
            }
            ro0Var.f37202w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) hVar.f14169c, (String) hVar.f14168b);
            AndroidUtilities.runOnUIThread(new ml0(go0Var, 8));
            return;
        }
        Exception exc = bVar.f43230b;
        if (exc != null) {
            go0Var.a(exc);
        } else {
            go0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
