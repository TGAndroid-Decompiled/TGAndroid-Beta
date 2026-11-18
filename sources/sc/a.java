package sc;

import android.os.AsyncTask;
import c8.sd;
import ee.t;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.f;
import org.telegram.ui.if0;
import org.telegram.ui.ml0;
import org.telegram.ui.nd0;
import tc.g;
public final class a extends AsyncTask {
    public final String f57139a;
    public final uc.a f57140b;
    public final f f57141c;
    public final c5 d;

    public a(c5 c5Var, String str, uc.a aVar, f fVar) {
        this.d = c5Var;
        this.f57139a = str;
        this.f57140b = aVar;
        this.f57141c = fVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        c5 c5Var = this.d;
        try {
            nd0 c10 = vc.b.c(sd.a(this.f57140b), new t(this.f57139a, 2));
            Object obj = c5Var.f30477a;
            return new b(c10, null);
        } catch (g e10) {
            Object obj2 = c5Var.f30477a;
            return new b(null, e10);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f30477a;
        nd0 nd0Var = bVar.f57142a;
        f fVar = this.f57141c;
        if (nd0Var != null) {
            ml0 ml0Var = (ml0) fVar.f47360b;
            if (ml0Var.R0) {
                return;
            }
            ml0Var.f49892x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) nd0Var.f50148b, (String) nd0Var.d);
            g0.g3(new if0(fVar, 11));
            return;
        }
        Exception exc = bVar.f57143b;
        if (exc != null) {
            fVar.y1(exc);
        } else {
            fVar.y1(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
