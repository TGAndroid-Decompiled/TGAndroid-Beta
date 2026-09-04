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
    public final String f45982a;
    public final uc.a f45983b;
    public final mo0 f45984c;
    public final n d;

    public a(n nVar, String str, uc.a aVar, mo0 mo0Var) {
        this.d = nVar;
        this.f45982a = str;
        this.f45983b = aVar;
        this.f45984c = mo0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        n nVar = this.d;
        try {
            t c10 = vc.b.c(r8.a(this.f45983b), new i(this.f45982a));
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
        t tVar = bVar.f45985a;
        mo0 mo0Var = this.f45984c;
        if (tVar != null) {
            xo0 xo0Var = mo0Var.f38743a;
            if (xo0Var.Q0) {
                return;
            }
            xo0Var.f42841w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) tVar.f15818c, (String) tVar.f15817b);
            AndroidUtilities.runOnUIThread(new rl0(mo0Var, 8));
            return;
        }
        Exception exc = bVar.f45986b;
        if (exc != null) {
            mo0Var.a(exc);
        } else {
            mo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
