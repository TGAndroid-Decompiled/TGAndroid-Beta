package sc;

import android.os.AsyncTask;
import ee.v;
import java.util.Locale;
import m.e3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.lo0;
import org.telegram.ui.ql0;
import org.telegram.ui.wo0;
import tc.g;
import w7.r8;
public final class a extends AsyncTask {
    public final String f41828a;
    public final uc.a f41829b;
    public final lo0 f41830c;
    public final o0.b d;

    public a(o0.b bVar, String str, uc.a aVar, lo0 lo0Var) {
        this.d = bVar;
        this.f41828a = str;
        this.f41829b = aVar;
        this.f41830c = lo0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        o0.b bVar = this.d;
        try {
            e3 c10 = vc.b.c(r8.a(this.f41829b), new v(this.f41828a, 2));
            Object obj = bVar.f14084a;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = bVar.f14084a;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f14084a;
        e3 e3Var = bVar.f41831a;
        lo0 lo0Var = this.f41830c;
        if (e3Var != null) {
            wo0 wo0Var = lo0Var.f34747a;
            if (wo0Var.Q0) {
                return;
            }
            wo0Var.f38289w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) e3Var.f13002c, (String) e3Var.f13001b);
            AndroidUtilities.runOnUIThread(new ql0(lo0Var, 8));
            return;
        }
        Exception exc = bVar.f41832b;
        if (exc != null) {
            lo0Var.a(exc);
        } else {
            lo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
