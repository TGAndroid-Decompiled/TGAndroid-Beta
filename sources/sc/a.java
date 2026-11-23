package sc;

import android.os.AsyncTask;
import c8.td;
import ee.t;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.f;
import org.telegram.ui.hf0;
import org.telegram.ui.md0;
import org.telegram.ui.ml0;
import tc.g;
public final class a extends AsyncTask {
    public final String f57149a;
    public final uc.a f57150b;
    public final f f57151c;
    public final c5 d;

    public a(c5 c5Var, String str, uc.a aVar, f fVar) {
        this.d = c5Var;
        this.f57149a = str;
        this.f57150b = aVar;
        this.f57151c = fVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        c5 c5Var = this.d;
        try {
            md0 c10 = vc.b.c(td.a(this.f57150b), new t(this.f57149a, 2));
            Object obj = c5Var.f30474a;
            return new b(c10, null);
        } catch (g e10) {
            Object obj2 = c5Var.f30474a;
            return new b(null, e10);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f30474a;
        md0 md0Var = bVar.f57152a;
        f fVar = this.f57151c;
        if (md0Var != null) {
            ml0 ml0Var = (ml0) fVar.f47394b;
            if (ml0Var.R0) {
                return;
            }
            ml0Var.f49906x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) md0Var.f49830b, (String) md0Var.d);
            g0.g3(new hf0(fVar, 11));
            return;
        }
        Exception exc = bVar.f57153b;
        if (exc != null) {
            fVar.y1(exc);
        } else {
            fVar.y1(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
