package sc;

import android.os.AsyncTask;
import c8.pd;
import f5.g;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.cf;
import org.telegram.ui.ef0;
import org.telegram.ui.f;
import org.telegram.ui.jl0;
import org.telegram.ui.ld0;
public final class a extends AsyncTask {
    public final String f56565a;
    public final uc.a f56566b;
    public final f f56567c;
    public final cf d;

    public a(cf cfVar, String str, uc.a aVar, f fVar) {
        this.d = cfVar;
        this.f56565a = str;
        this.f56566b = aVar;
        this.f56567c = fVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        cf cfVar = this.d;
        try {
            ld0 c10 = vc.b.c(pd.a(this.f56566b), new g(this.f56565a, 3));
            Object obj = cfVar.f33543a;
            return new b(c10, null);
        } catch (tc.g e10) {
            Object obj2 = cfVar.f33543a;
            return new b(null, e10);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f33543a;
        ld0 ld0Var = bVar.f56568a;
        f fVar = this.f56567c;
        if (ld0Var != null) {
            jl0 jl0Var = (jl0) fVar.f46946b;
            if (jl0Var.R0) {
                return;
            }
            jl0Var.f48421x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) ld0Var.f48976b, (String) ld0Var.d);
            g0.h3(new ef0(fVar, 11));
            return;
        }
        Exception exc = bVar.f56569b;
        if (exc != null) {
            fVar.y1(exc);
        } else {
            fVar.y1(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
