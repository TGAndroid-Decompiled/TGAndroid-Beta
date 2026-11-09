package sc;

import android.os.AsyncTask;
import c8.pd;
import g9.l;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.n;
import org.telegram.ui.f;
import org.telegram.ui.gf0;
import org.telegram.ui.jl0;
import org.telegram.ui.ky0;
import tc.g;
public final class a extends AsyncTask {
    public final String f55010a;
    public final uc.a f55011b;
    public final f f55012c;
    public final n d;

    public a(n nVar, String str, uc.a aVar, f fVar) {
        this.d = nVar;
        this.f55010a = str;
        this.f55011b = aVar;
        this.f55012c = fVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        n nVar = this.d;
        try {
            ky0 c10 = vc.b.c(pd.a(this.f55011b), new l(this.f55010a, 2));
            Object obj = nVar.f36185a;
            return new b(c10, null);
        } catch (g e10) {
            Object obj2 = nVar.f36185a;
            return new b(null, e10);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f36185a;
        ky0 ky0Var = bVar.f55013a;
        f fVar = this.f55012c;
        if (ky0Var != null) {
            jl0 jl0Var = (jl0) fVar.f45545b;
            if (jl0Var.Q0) {
                return;
            }
            jl0Var.f47029w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) ky0Var.f47423c, (String) ky0Var.f47422b);
            g0.h3(new gf0(fVar, 11));
            return;
        }
        Exception exc = bVar.f55014b;
        if (exc != null) {
            fVar.Y1(exc);
        } else {
            fVar.Y1(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
