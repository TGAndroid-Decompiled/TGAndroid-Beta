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
    public final String f43181a;
    public final uc.a f43182b;
    public final do0 f43183c;
    public final u d;

    public a(u uVar, String str, uc.a aVar, do0 do0Var) {
        this.d = uVar;
        this.f43181a = str;
        this.f43182b = aVar;
        this.f43183c = do0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        u uVar = this.d;
        try {
            h c10 = vc.b.c(s8.a(this.f43182b), new v(this.f43181a, 3));
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
        h hVar = bVar.f43184a;
        do0 do0Var = this.f43183c;
        if (hVar != null) {
            oo0 oo0Var = do0Var.f33166a;
            if (oo0Var.Q0) {
                return;
            }
            oo0Var.f36312w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) hVar.f14167c, (String) hVar.f14166b);
            AndroidUtilities.runOnUIThread(new il0(do0Var, 8));
            return;
        }
        Exception exc = bVar.f43185b;
        if (exc != null) {
            do0Var.a(exc);
        } else {
            do0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
