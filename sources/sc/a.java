package sc;

import android.os.AsyncTask;
import java.util.Locale;
import lf.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.no0;
import org.telegram.ui.sl0;
import org.telegram.ui.yo0;
import tc.g;
import w7.r8;
public final class a extends AsyncTask {
    public final String f42920a;
    public final uc.a f42921b;
    public final no0 f42922c;
    public final ia d;

    public a(ia iaVar, String str, uc.a aVar, no0 no0Var) {
        this.d = iaVar;
        this.f42920a = str;
        this.f42921b = aVar;
        this.f42922c = no0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        ia iaVar = this.d;
        try {
            String str = this.f42920a;
            ?? obj = new Object();
            obj.f3900a = str;
            i c10 = vc.b.c(r8.a(this.f42921b), obj);
            Object obj2 = iaVar.f20291b;
            return new b(c10, null);
        } catch (g e) {
            Object obj3 = iaVar.f20291b;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f20291b;
        i iVar = bVar.f42923a;
        no0 no0Var = this.f42922c;
        if (iVar != null) {
            yo0 yo0Var = no0Var.f36145a;
            if (yo0Var.Q0) {
                return;
            }
            yo0Var.f39984w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) iVar.f14034c, (String) iVar.f14033b);
            AndroidUtilities.runOnUIThread(new sl0(no0Var, 8));
            return;
        }
        Exception exc = bVar.f42924b;
        if (exc != null) {
            no0Var.a(exc);
        } else {
            no0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
