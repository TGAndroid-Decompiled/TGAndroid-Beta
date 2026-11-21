package sc;

import android.os.AsyncTask;
import c8.sd;
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
    public final String f57180a;
    public final uc.a f57181b;
    public final f f57182c;
    public final c5 d;

    public a(c5 c5Var, String str, uc.a aVar, f fVar) {
        this.d = c5Var;
        this.f57180a = str;
        this.f57181b = aVar;
        this.f57182c = fVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        c5 c5Var = this.d;
        try {
            md0 c10 = vc.b.c(sd.a(this.f57181b), new t(this.f57180a, 2));
            Object obj = c5Var.f30505a;
            return new b(c10, null);
        } catch (g e10) {
            Object obj2 = c5Var.f30505a;
            return new b(null, e10);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f30505a;
        md0 md0Var = bVar.f57183a;
        f fVar = this.f57182c;
        if (md0Var != null) {
            ml0 ml0Var = (ml0) fVar.f47429b;
            if (ml0Var.R0) {
                return;
            }
            ml0Var.f49933x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) md0Var.f49853b, (String) md0Var.d);
            g0.g3(new hf0(fVar, 11));
            return;
        }
        Exception exc = bVar.f57184b;
        if (exc != null) {
            fVar.y1(exc);
        } else {
            fVar.y1(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
