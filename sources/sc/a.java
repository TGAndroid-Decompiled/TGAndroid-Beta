package sc;

import android.os.AsyncTask;
import c5.i;
import java.util.Locale;
import m2.t;
import mg.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mo0;
import org.telegram.ui.rl0;
import org.telegram.ui.xo0;
import tc.g;
import w7.r8;
public final class a extends AsyncTask {
    public final String f45983a;
    public final uc.a f45984b;
    public final mo0 f45985c;
    public final n d;

    public a(n nVar, String str, uc.a aVar, mo0 mo0Var) {
        this.d = nVar;
        this.f45983a = str;
        this.f45984b = aVar;
        this.f45985c = mo0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        n nVar = this.d;
        try {
            t c10 = vc.b.c(r8.a(this.f45984b), new i(this.f45983a));
            Object obj = nVar.f16292b;
            return new b(c10, null);
        } catch (g e7) {
            Object obj2 = nVar.f16292b;
            return new b(null, e7);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f16292b;
        t tVar = bVar.f45986a;
        mo0 mo0Var = this.f45985c;
        if (tVar != null) {
            xo0 xo0Var = mo0Var.f38744a;
            if (xo0Var.Q0) {
                return;
            }
            xo0Var.f42842w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) tVar.f15818c, (String) tVar.f15817b);
            AndroidUtilities.runOnUIThread(new rl0(mo0Var, 8));
            return;
        }
        Exception exc = bVar.f45987b;
        if (exc != null) {
            mo0Var.a(exc);
        } else {
            mo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
