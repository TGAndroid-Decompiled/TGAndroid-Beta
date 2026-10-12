package tc;

import android.os.AsyncTask;
import java.util.Locale;
import n4.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mo0;
import org.telegram.ui.uk0;
import org.telegram.ui.xo0;
import uc.g;
import v7.k;
import w7.y8;
public final class a extends AsyncTask {
    public final String f48486a;
    public final vc.a f48487b;
    public final mo0 f48488c;
    public final l d;

    public a(l lVar, String str, vc.a aVar, mo0 mo0Var) {
        this.d = lVar;
        this.f48486a = str;
        this.f48487b = aVar;
        this.f48488c = mo0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        l lVar = this.d;
        try {
            k c10 = wc.b.c(y8.a(this.f48487b), new f2.a(this.f48486a));
            Object obj = lVar.f16326a;
            return new b(c10, null);
        } catch (g e7) {
            Object obj2 = lVar.f16326a;
            return new b(null, e7);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f16326a;
        k kVar = bVar.f48489a;
        mo0 mo0Var = this.f48488c;
        if (kVar != null) {
            xo0 xo0Var = mo0Var.f40103a;
            if (xo0Var.Q0) {
                return;
            }
            xo0Var.f44126w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) kVar.f49483c, (String) kVar.f49482b);
            AndroidUtilities.runOnUIThread(new uk0(mo0Var, 9));
            return;
        }
        Exception exc = bVar.f48490b;
        if (exc != null) {
            mo0Var.a(exc);
        } else {
            mo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
