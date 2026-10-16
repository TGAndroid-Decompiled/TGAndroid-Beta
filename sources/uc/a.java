package uc;

import android.os.AsyncTask;
import d9.l;
import java.util.Locale;
import ji.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ap0;
import org.telegram.ui.po0;
import org.telegram.ui.xk0;
import u2.c;
import vc.g;
import w7.n9;
public final class a extends AsyncTask {
    public final String f46237a;
    public final wc.a f46238b;
    public final po0 f46239c;
    public final h5 d;

    public a(h5 h5Var, String str, wc.a aVar, po0 po0Var) {
        this.d = h5Var;
        this.f46237a = str;
        this.f46238b = aVar;
        this.f46239c = po0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        h5 h5Var = this.d;
        try {
            c c10 = xc.b.c(n9.a(this.f46238b), new l(this.f46237a, false));
            Object obj = h5Var.f13315b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = h5Var.f13315b;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f13315b;
        c cVar = bVar.f46240a;
        po0 po0Var = this.f46239c;
        if (cVar != null) {
            ap0 ap0Var = po0Var.f38981a;
            if (ap0Var.Q0) {
                return;
            }
            ap0Var.f34042w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) cVar.f45876c, (String) cVar.f45875b);
            AndroidUtilities.runOnUIThread(new xk0(po0Var, 9));
            return;
        }
        Exception exc = bVar.f46241b;
        if (exc != null) {
            po0Var.a(exc);
        } else {
            po0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
