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
    public final String f46767a;
    public final uc.a f46768b;
    public final ho0 f46769c;
    public final c d;

    public a(c cVar, String str, uc.a aVar, ho0 ho0Var) {
        this.d = cVar;
        this.f46767a = str;
        this.f46768b = aVar;
        this.f46769c = ho0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        c cVar = this.d;
        try {
            h c10 = vc.b.c(t8.a(this.f46768b), new i(this.f46767a));
            Object obj = cVar.f16522b;
            return new b(c10, null);
        } catch (g e7) {
            Object obj2 = cVar.f16522b;
            return new b(null, e7);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f16522b;
        h hVar = bVar.f46770a;
        ho0 ho0Var = this.f46769c;
        if (hVar != null) {
            so0 so0Var = ho0Var.f37123a;
            if (so0Var.Q0) {
                return;
            }
            so0Var.f40575w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) hVar.f15398c, (String) hVar.f15397b);
            AndroidUtilities.runOnUIThread(new nl0(ho0Var, 8));
            return;
        }
        Exception exc = bVar.f46771b;
        if (exc != null) {
            ho0Var.a(exc);
        } else {
            ho0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
