package vc;

import a8.s0;
import android.os.AsyncTask;
import he.v;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.eo0;
import org.telegram.ui.lj0;
import org.telegram.ui.po0;
import s4.d;
import s4.o0;
import wc.g;
public final class a extends AsyncTask {
    public final String f50102a;
    public final xc.a f50103b;
    public final eo0 f50104c;
    public final o0 d;

    public a(o0 o0Var, String str, xc.a aVar, eo0 eo0Var) {
        this.d = o0Var;
        this.f50102a = str;
        this.f50103b = aVar;
        this.f50104c = eo0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        o0 o0Var = this.d;
        try {
            d c10 = yc.b.c(s0.a(this.f50103b), new v(this.f50102a, 1));
            Object obj = o0Var.f47816a;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = o0Var.f47816a;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f47816a;
        d dVar = bVar.f50105a;
        eo0 eo0Var = this.f50104c;
        if (dVar != null) {
            po0 po0Var = eo0Var.f39153a;
            if (po0Var.Q0) {
                return;
            }
            po0Var.f42621w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) dVar.f47721c, (String) dVar.f47720b);
            AndroidUtilities.runOnUIThread(new lj0(eo0Var, 10));
            return;
        }
        Exception exc = bVar.f50106b;
        if (exc != null) {
            eo0Var.a(exc);
        } else {
            eo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
