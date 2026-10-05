package sc;

import android.os.AsyncTask;
import c5.i;
import java.util.Locale;
import la.h;
import n2.c;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ho0;
import org.telegram.ui.nl0;
import org.telegram.ui.so0;
import tc.g;
import w7.t8;
public final class a extends AsyncTask {
    public final String f46782a;
    public final uc.a f46783b;
    public final ho0 f46784c;
    public final c d;

    public a(c cVar, String str, uc.a aVar, ho0 ho0Var) {
        this.d = cVar;
        this.f46782a = str;
        this.f46783b = aVar;
        this.f46784c = ho0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        c cVar = this.d;
        try {
            h c10 = vc.b.c(t8.a(this.f46783b), new i(this.f46782a));
            Object obj = cVar.f16532b;
            return new b(c10, null);
        } catch (g e7) {
            Object obj2 = cVar.f16532b;
            return new b(null, e7);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f16532b;
        h hVar = bVar.f46785a;
        ho0 ho0Var = this.f46784c;
        if (hVar != null) {
            so0 so0Var = ho0Var.f37129a;
            if (so0Var.Q0) {
                return;
            }
            so0Var.f40594w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) hVar.f15400c, (String) hVar.f15399b);
            AndroidUtilities.runOnUIThread(new nl0(ho0Var, 8));
            return;
        }
        Exception exc = bVar.f46786b;
        if (exc != null) {
            ho0Var.a(exc);
        } else {
            ho0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
