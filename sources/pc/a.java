package pc;

import android.os.AsyncTask;
import be.t;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.dl0;
import org.telegram.ui.f;
import org.telegram.ui.sg0;
import p7.d;
import qc.g;
import x7.c5;
public final class a extends AsyncTask {
    public final String f53439a;
    public final rc.a f53440b;
    public final f f53441c;
    public final i9 d;

    public a(i9 i9Var, String str, rc.a aVar, f fVar) {
        this.d = i9Var;
        this.f53439a = str;
        this.f53440b = aVar;
        this.f53441c = fVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        i9 i9Var = this.d;
        try {
            d c2 = sc.b.c(c5.a(this.f53440b), new t(this.f53439a, 2));
            Object obj = i9Var.f34636b;
            return new b(c2, null);
        } catch (g e10) {
            Object obj2 = i9Var.f34636b;
            return new b(null, e10);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f34636b;
        d dVar = bVar.f53442a;
        f fVar = this.f53441c;
        if (dVar != null) {
            dl0 dl0Var = (dl0) fVar.f45115b;
            if (dl0Var.R0) {
                return;
            }
            dl0Var.f44775x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) dVar.d, (String) dVar.f53345b);
            g0.h3(new sg0(fVar, 10));
            return;
        }
        Exception exc = bVar.f53443b;
        if (exc != null) {
            fVar.R1(exc);
        } else {
            fVar.R1(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
