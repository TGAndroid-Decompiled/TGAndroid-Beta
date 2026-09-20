package sc;

import android.os.AsyncTask;
import ee.v;
import java.util.Locale;
import k2.u;
import lf.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mo0;
import org.telegram.ui.sl0;
import org.telegram.ui.xo0;
import tc.g;
import w7.t8;
public final class a extends AsyncTask {
    public final String f43195a;
    public final uc.a f43196b;
    public final mo0 f43197c;
    public final u d;

    public a(u uVar, String str, uc.a aVar, mo0 mo0Var) {
        this.d = uVar;
        this.f43195a = str;
        this.f43196b = aVar;
        this.f43197c = mo0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        u uVar = this.d;
        try {
            h c10 = vc.b.c(t8.a(this.f43196b), new v(this.f43195a, 3));
            Object obj = uVar.f13384b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = uVar.f13384b;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f13384b;
        h hVar = bVar.f43198a;
        mo0 mo0Var = this.f43197c;
        if (hVar != null) {
            xo0 xo0Var = mo0Var.f35780a;
            if (xo0Var.Q0) {
                return;
            }
            xo0Var.f39678w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) hVar.f14216c, (String) hVar.f14215b);
            AndroidUtilities.runOnUIThread(new sl0(mo0Var, 8));
            return;
        }
        Exception exc = bVar.f43199b;
        if (exc != null) {
            mo0Var.a(exc);
        } else {
            mo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
