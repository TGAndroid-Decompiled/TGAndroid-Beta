package sc;

import android.os.AsyncTask;
import c8.pd;
import g9.l;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.n;
import org.telegram.ui.ef0;
import org.telegram.ui.f;
import org.telegram.ui.hl0;
import org.telegram.ui.hy0;
import tc.g;
public final class a extends AsyncTask {
    public final String f54905a;
    public final uc.a f54906b;
    public final f f54907c;
    public final n d;

    public a(n nVar, String str, uc.a aVar, f fVar) {
        this.d = nVar;
        this.f54905a = str;
        this.f54906b = aVar;
        this.f54907c = fVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        n nVar = this.d;
        try {
            hy0 c10 = vc.b.c(pd.a(this.f54906b), new l(this.f54905a, 2));
            Object obj = nVar.f36142a;
            return new b(c10, null);
        } catch (g e10) {
            Object obj2 = nVar.f36142a;
            return new b(null, e10);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f36142a;
        hy0 hy0Var = bVar.f54908a;
        f fVar = this.f54907c;
        if (hy0Var != null) {
            hl0 hl0Var = (hl0) fVar.f45450b;
            if (hl0Var.Q0) {
                return;
            }
            hl0Var.f46442w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) hy0Var.f46528c, (String) hy0Var.f46527b);
            g0.h3(new ef0(fVar, 11));
            return;
        }
        Exception exc = bVar.f54909b;
        if (exc != null) {
            fVar.Y1(exc);
        } else {
            fVar.Y1(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
