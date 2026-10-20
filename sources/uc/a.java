package uc;

import android.os.AsyncTask;
import d9.l;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ck0;
import org.telegram.ui.eo0;
import org.telegram.ui.tn0;
import u2.c;
import vc.g;
import w7.n9;
public final class a extends AsyncTask {
    public final String f47631a;
    public final wc.a f47632b;
    public final tn0 f47633c;
    public final le.b d;

    public a(le.b bVar, String str, wc.a aVar, tn0 tn0Var) {
        this.d = bVar;
        this.f47631a = str;
        this.f47632b = aVar;
        this.f47633c = tn0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        le.b bVar = this.d;
        try {
            c c10 = xc.b.c(n9.a(this.f47632b), new l(this.f47631a, 3));
            Object obj = bVar.f16009b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = bVar.f16009b;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f16009b;
        c cVar = bVar.f47634a;
        tn0 tn0Var = this.f47633c;
        if (cVar != null) {
            eo0 eo0Var = tn0Var.f41711a;
            if (eo0Var.Q0) {
                return;
            }
            eo0Var.f36733w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) cVar.f47270c, (String) cVar.f47269b);
            AndroidUtilities.runOnUIThread(new ck0(tn0Var, 9));
            return;
        }
        Exception exc = bVar.f47635b;
        if (exc != null) {
            tn0Var.a(exc);
        } else {
            tn0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
