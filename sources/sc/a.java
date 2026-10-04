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
    public final String f46768a;
    public final uc.a f46769b;
    public final ho0 f46770c;
    public final c d;

    public a(c cVar, String str, uc.a aVar, ho0 ho0Var) {
        this.d = cVar;
        this.f46768a = str;
        this.f46769b = aVar;
        this.f46770c = ho0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        c cVar = this.d;
        try {
            h c10 = vc.b.c(t8.a(this.f46769b), new i(this.f46768a));
            Object obj = cVar.f16523b;
            return new b(c10, null);
        } catch (g e7) {
            Object obj2 = cVar.f16523b;
            return new b(null, e7);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f16523b;
        h hVar = bVar.f46771a;
        ho0 ho0Var = this.f46770c;
        if (hVar != null) {
            so0 so0Var = ho0Var.f37124a;
            if (so0Var.Q0) {
                return;
            }
            so0Var.f40576w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) hVar.f15399c, (String) hVar.f15398b);
            AndroidUtilities.runOnUIThread(new nl0(ho0Var, 8));
            return;
        }
        Exception exc = bVar.f46772b;
        if (exc != null) {
            ho0Var.a(exc);
        } else {
            ho0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
