package uc;

import android.os.AsyncTask;
import d9.l;
import java.util.Locale;
import ji.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cp0;
import org.telegram.ui.ro0;
import org.telegram.ui.yk0;
import u2.c;
import vc.g;
import w7.n9;
public final class a extends AsyncTask {
    public final String f46238a;
    public final wc.a f46239b;
    public final ro0 f46240c;
    public final h5 d;

    public a(h5 h5Var, String str, wc.a aVar, ro0 ro0Var) {
        this.d = h5Var;
        this.f46238a = str;
        this.f46239b = aVar;
        this.f46240c = ro0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        h5 h5Var = this.d;
        try {
            c c10 = xc.b.c(n9.a(this.f46239b), new l(this.f46238a, false));
            Object obj = h5Var.f13312b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = h5Var.f13312b;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f13312b;
        c cVar = bVar.f46241a;
        ro0 ro0Var = this.f46240c;
        if (cVar != null) {
            cp0 cp0Var = ro0Var.f39839a;
            if (cp0Var.Q0) {
                return;
            }
            cp0Var.f35030w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) cVar.f45876c, (String) cVar.f45875b);
            AndroidUtilities.runOnUIThread(new yk0(ro0Var, 9));
            return;
        }
        Exception exc = bVar.f46242b;
        if (exc != null) {
            ro0Var.a(exc);
        } else {
            ro0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
