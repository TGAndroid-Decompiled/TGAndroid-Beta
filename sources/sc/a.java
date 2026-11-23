package sc;

import android.os.AsyncTask;
import c8.td;
import ee.t;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Components.i61;
import org.telegram.ui.f;
import org.telegram.ui.gf0;
import org.telegram.ui.kl0;
import tc.g;
public final class a extends AsyncTask {
    public final String f57263a;
    public final uc.a f57264b;
    public final f f57265c;
    public final i5 d;

    public a(i5 i5Var, String str, uc.a aVar, f fVar) {
        this.d = i5Var;
        this.f57263a = str;
        this.f57264b = aVar;
        this.f57265c = fVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        i5 i5Var = this.d;
        try {
            i61 c10 = vc.b.c(td.a(this.f57264b), new t(this.f57263a, 2));
            Object obj = i5Var.f29095a;
            return new b(c10, null);
        } catch (g e10) {
            Object obj2 = i5Var.f29095a;
            return new b(null, e10);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f29095a;
        i61 i61Var = bVar.f57266a;
        f fVar = this.f57265c;
        if (i61Var != null) {
            kl0 kl0Var = (kl0) fVar.f47651b;
            if (kl0Var.R0) {
                return;
            }
            kl0Var.f49492x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) i61Var.f35959c, (String) i61Var.f35958b);
            g0.g3(new gf0(fVar, 11));
            return;
        }
        Exception exc = bVar.f57267b;
        if (exc != null) {
            fVar.v1(exc);
        } else {
            fVar.v1(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
