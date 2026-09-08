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
    public final String f46010a;
    public final uc.a f46011b;
    public final mo0 f46012c;
    public final n d;

    public a(n nVar, String str, uc.a aVar, mo0 mo0Var) {
        this.d = nVar;
        this.f46010a = str;
        this.f46011b = aVar;
        this.f46012c = mo0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        n nVar = this.d;
        try {
            t c10 = vc.b.c(r8.a(this.f46011b), new i(this.f46010a));
            Object obj = nVar.f16319b;
            return new b(c10, null);
        } catch (g e7) {
            Object obj2 = nVar.f16319b;
            return new b(null, e7);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f16319b;
        t tVar = bVar.f46013a;
        mo0 mo0Var = this.f46012c;
        if (tVar != null) {
            xo0 xo0Var = mo0Var.f38770a;
            if (xo0Var.Q0) {
                return;
            }
            xo0Var.f42868w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) tVar.f15845c, (String) tVar.f15844b);
            AndroidUtilities.runOnUIThread(new rl0(mo0Var, 8));
            return;
        }
        Exception exc = bVar.f46014b;
        if (exc != null) {
            mo0Var.a(exc);
        } else {
            mo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
