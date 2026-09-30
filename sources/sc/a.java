package sc;

import android.os.AsyncTask;
import ee.v;
import java.util.Locale;
import k2.u;
import la.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.co0;
import org.telegram.ui.il0;
import org.telegram.ui.no0;
import tc.g;
import w7.s8;
public final class a extends AsyncTask {
    public final String f43289a;
    public final uc.a f43290b;
    public final co0 f43291c;
    public final u d;

    public a(u uVar, String str, uc.a aVar, co0 co0Var) {
        this.d = uVar;
        this.f43289a = str;
        this.f43290b = aVar;
        this.f43291c = co0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        u uVar = this.d;
        try {
            h c10 = vc.b.c(s8.a(this.f43290b), new v(this.f43289a, 3));
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
        h hVar = bVar.f43292a;
        co0 co0Var = this.f43291c;
        if (hVar != null) {
            no0 no0Var = co0Var.f32843a;
            if (no0Var.Q0) {
                return;
            }
            no0Var.f36084w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) hVar.f14183c, (String) hVar.f14182b);
            AndroidUtilities.runOnUIThread(new il0(co0Var, 8));
            return;
        }
        Exception exc = bVar.f43293b;
        if (exc != null) {
            co0Var.a(exc);
        } else {
            co0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
