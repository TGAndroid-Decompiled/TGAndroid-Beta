package sc;

import android.os.AsyncTask;
import c8.sd;
import ee.t;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.b5;
import org.telegram.ui.f;
import org.telegram.ui.hf0;
import org.telegram.ui.md0;
import org.telegram.ui.ml0;
import tc.g;
public final class a extends AsyncTask {
    public final String f57139a;
    public final uc.a f57140b;
    public final f f57141c;
    public final b5 d;

    public a(b5 b5Var, String str, uc.a aVar, f fVar) {
        this.d = b5Var;
        this.f57139a = str;
        this.f57140b = aVar;
        this.f57141c = fVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        b5 b5Var = this.d;
        try {
            md0 c10 = vc.b.c(sd.a(this.f57140b), new t(this.f57139a, 2));
            Object obj = b5Var.f30431a;
            return new b(c10, null);
        } catch (g e10) {
            Object obj2 = b5Var.f30431a;
            return new b(null, e10);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f30431a;
        md0 md0Var = bVar.f57142a;
        f fVar = this.f57141c;
        if (md0Var != null) {
            ml0 ml0Var = (ml0) fVar.f47404b;
            if (ml0Var.R0) {
                return;
            }
            ml0Var.f49918x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) md0Var.f49838b, (String) md0Var.d);
            g0.g3(new hf0(fVar, 11));
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
