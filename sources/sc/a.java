package sc;

import android.os.AsyncTask;
import java.util.Locale;
import m.e3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.lo0;
import org.telegram.ui.pl0;
import org.telegram.ui.wo0;
import tc.g;
import w7.r8;
public final class a extends AsyncTask {
    public final String f42893a;
    public final uc.a f42894b;
    public final lo0 f42895c;
    public final ia d;

    public a(ia iaVar, String str, uc.a aVar, lo0 lo0Var) {
        this.d = iaVar;
        this.f42893a = str;
        this.f42894b = aVar;
        this.f42895c = lo0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        ia iaVar = this.d;
        try {
            String str = this.f42893a;
            ?? obj = new Object();
            obj.f3895a = str;
            e3 c10 = vc.b.c(r8.a(this.f42894b), obj);
            Object obj2 = iaVar.f20280b;
            return new b(c10, null);
        } catch (g e) {
            Object obj3 = iaVar.f20280b;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f20280b;
        e3 e3Var = bVar.f42896a;
        lo0 lo0Var = this.f42895c;
        if (e3Var != null) {
            wo0 wo0Var = lo0Var.f35541a;
            if (wo0Var.Q0) {
                return;
            }
            wo0Var.f39341w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) e3Var.f14166c, (String) e3Var.f14165b);
            AndroidUtilities.runOnUIThread(new pl0(lo0Var, 8));
            return;
        }
        Exception exc = bVar.f42897b;
        if (exc != null) {
            lo0Var.a(exc);
        } else {
            lo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
