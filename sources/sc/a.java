package sc;

import android.os.AsyncTask;
import java.util.Locale;
import lf.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.lo0;
import org.telegram.ui.pl0;
import org.telegram.ui.wo0;
import tc.g;
import w7.r8;
public final class a extends AsyncTask {
    public final String f42889a;
    public final uc.a f42890b;
    public final lo0 f42891c;
    public final ia d;

    public a(ia iaVar, String str, uc.a aVar, lo0 lo0Var) {
        this.d = iaVar;
        this.f42889a = str;
        this.f42890b = aVar;
        this.f42891c = lo0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        ia iaVar = this.d;
        try {
            String str = this.f42889a;
            ?? obj = new Object();
            obj.f3897a = str;
            i c10 = vc.b.c(r8.a(this.f42890b), obj);
            Object obj2 = iaVar.f20260b;
            return new b(c10, null);
        } catch (g e) {
            Object obj3 = iaVar.f20260b;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f20260b;
        i iVar = bVar.f42892a;
        lo0 lo0Var = this.f42891c;
        if (iVar != null) {
            wo0 wo0Var = lo0Var.f35524a;
            if (wo0Var.Q0) {
                return;
            }
            wo0Var.f39337w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) iVar.f14022c, (String) iVar.f14021b);
            AndroidUtilities.runOnUIThread(new pl0(lo0Var, 8));
            return;
        }
        Exception exc = bVar.f42893b;
        if (exc != null) {
            lo0Var.a(exc);
        } else {
            lo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
