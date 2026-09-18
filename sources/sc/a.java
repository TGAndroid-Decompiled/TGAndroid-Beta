package sc;

import android.os.AsyncTask;
import ee.v;
import java.util.Locale;
import k2.u;
import lf.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mo0;
import org.telegram.ui.sl0;
import org.telegram.ui.xo0;
import tc.g;
import w7.s8;
public final class a extends AsyncTask {
    public final String f43151a;
    public final uc.a f43152b;
    public final mo0 f43153c;
    public final u d;

    public a(u uVar, String str, uc.a aVar, mo0 mo0Var) {
        this.d = uVar;
        this.f43151a = str;
        this.f43152b = aVar;
        this.f43153c = mo0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        u uVar = this.d;
        try {
            i c10 = vc.b.c(s8.a(this.f43152b), new v(this.f43151a, 3));
            Object obj = uVar.f13383b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = uVar.f13383b;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f13383b;
        i iVar = bVar.f43154a;
        mo0 mo0Var = this.f43153c;
        if (iVar != null) {
            xo0 xo0Var = mo0Var.f35705a;
            if (xo0Var.Q0) {
                return;
            }
            xo0Var.f39573w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) iVar.f14180c, (String) iVar.f14179b);
            AndroidUtilities.runOnUIThread(new sl0(mo0Var, 8));
            return;
        }
        Exception exc = bVar.f43155b;
        if (exc != null) {
            mo0Var.a(exc);
        } else {
            mo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
