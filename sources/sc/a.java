package sc;

import android.os.AsyncTask;
import d9.f;
import java.util.Locale;
import k2.e;
import lf.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mo0;
import org.telegram.ui.sl0;
import org.telegram.ui.xo0;
import tc.g;
import w7.s8;
public final class a extends AsyncTask {
    public final String f43216a;
    public final uc.a f43217b;
    public final mo0 f43218c;
    public final e d;

    public a(e eVar, String str, uc.a aVar, mo0 mo0Var) {
        this.d = eVar;
        this.f43216a = str;
        this.f43217b = aVar;
        this.f43218c = mo0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        e eVar = this.d;
        try {
            h c10 = vc.b.c(s8.a(this.f43217b), new f(this.f43216a, 2));
            Object obj = eVar.f13244b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = eVar.f13244b;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f13244b;
        h hVar = bVar.f43219a;
        mo0 mo0Var = this.f43218c;
        if (hVar != null) {
            xo0 xo0Var = mo0Var.f35801a;
            if (xo0Var.Q0) {
                return;
            }
            xo0Var.f39698w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) hVar.f14231c, (String) hVar.f14230b);
            AndroidUtilities.runOnUIThread(new sl0(mo0Var, 8));
            return;
        }
        Exception exc = bVar.f43220b;
        if (exc != null) {
            mo0Var.a(exc);
        } else {
            mo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
