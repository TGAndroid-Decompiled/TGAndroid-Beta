package uc;

import android.os.AsyncTask;
import com.google.android.gms.internal.clearcut.e;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ek0;
import org.telegram.ui.fo0;
import org.telegram.ui.un0;
import vc.g;
import w7.o9;
public final class a extends AsyncTask {
    public final String f47645a;
    public final wc.a f47646b;
    public final un0 f47647c;
    public final b d;

    public a(b bVar, String str, wc.a aVar, un0 un0Var) {
        this.d = bVar;
        this.f47645a = str;
        this.f47646b = aVar;
        this.f47647c = un0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        b bVar = this.d;
        try {
            u2.c c10 = xc.b.c(o9.a(this.f47646b), new e(this.f47645a, 3));
            Object obj = bVar.f47648a;
            return new c(c10, null);
        } catch (g e) {
            Object obj2 = bVar.f47648a;
            return new c(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        c cVar = (c) obj;
        Object obj2 = this.d.f47648a;
        u2.c cVar2 = cVar.f47649a;
        un0 un0Var = this.f47647c;
        if (cVar2 != null) {
            fo0 fo0Var = un0Var.f42019a;
            if (fo0Var.Q0) {
                return;
            }
            fo0Var.f37005w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) cVar2.f47283c, (String) cVar2.f47282b);
            AndroidUtilities.runOnUIThread(new ek0(un0Var, 9));
            return;
        }
        Exception exc = cVar.f47650b;
        if (exc != null) {
            un0Var.a(exc);
        } else {
            un0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
