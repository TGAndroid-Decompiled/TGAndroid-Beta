package sc;

import android.os.AsyncTask;
import c8.pd;
import g9.l;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.m;
import org.telegram.ui.f;
import org.telegram.ui.hf0;
import org.telegram.ui.kl0;
import org.telegram.ui.ly0;
import tc.g;
public final class a extends AsyncTask {
    public final String f55009a;
    public final uc.a f55010b;
    public final f f55011c;
    public final m d;

    public a(m mVar, String str, uc.a aVar, f fVar) {
        this.d = mVar;
        this.f55009a = str;
        this.f55010b = aVar;
        this.f55011c = fVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        m mVar = this.d;
        try {
            ly0 c10 = vc.b.c(pd.a(this.f55010b), new l(this.f55009a, 2));
            Object obj = mVar.f35778a;
            return new b(c10, null);
        } catch (g e10) {
            Object obj2 = mVar.f35778a;
            return new b(null, e10);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f35778a;
        ly0 ly0Var = bVar.f55012a;
        f fVar = this.f55011c;
        if (ly0Var != null) {
            kl0 kl0Var = (kl0) fVar.f45464b;
            if (kl0Var.Q0) {
                return;
            }
            kl0Var.f47361w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) ly0Var.f47747c, (String) ly0Var.f47746b);
            g0.h3(new hf0(fVar, 11));
            return;
        }
        Exception exc = bVar.f55013b;
        if (exc != null) {
            fVar.Y1(exc);
        } else {
            fVar.Y1(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
