package sc;

import android.os.AsyncTask;
import ee.v;
import java.util.Locale;
import k2.u;
import la.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.do0;
import org.telegram.ui.il0;
import org.telegram.ui.oo0;
import tc.g;
import w7.s8;
public final class a extends AsyncTask {
    public final String f43182a;
    public final uc.a f43183b;
    public final do0 f43184c;
    public final u d;

    public a(u uVar, String str, uc.a aVar, do0 do0Var) {
        this.d = uVar;
        this.f43182a = str;
        this.f43183b = aVar;
        this.f43184c = do0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        u uVar = this.d;
        try {
            h c10 = vc.b.c(s8.a(this.f43183b), new v(this.f43182a, 3));
            Object obj = uVar.f13369b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = uVar.f13369b;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f13369b;
        h hVar = bVar.f43185a;
        do0 do0Var = this.f43184c;
        if (hVar != null) {
            oo0 oo0Var = do0Var.f33167a;
            if (oo0Var.Q0) {
                return;
            }
            oo0Var.f36313w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) hVar.f14167c, (String) hVar.f14166b);
            AndroidUtilities.runOnUIThread(new il0(do0Var, 8));
            return;
        }
        Exception exc = bVar.f43186b;
        if (exc != null) {
            do0Var.a(exc);
        } else {
            do0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
