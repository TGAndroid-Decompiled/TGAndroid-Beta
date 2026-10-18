package uc;

import android.os.AsyncTask;
import com.google.android.gms.internal.clearcut.e;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ek0;
import org.telegram.ui.go0;
import org.telegram.ui.vn0;
import t0.h;
import vc.g;
import w7.o9;
public final class a extends AsyncTask {
    public final String f47667a;
    public final wc.a f47668b;
    public final vn0 f47669c;
    public final b d;

    public a(b bVar, String str, wc.a aVar, vn0 vn0Var) {
        this.d = bVar;
        this.f47667a = str;
        this.f47668b = aVar;
        this.f47669c = vn0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        b bVar = this.d;
        try {
            h c10 = xc.b.c(o9.a(this.f47668b), new e(this.f47667a, 3));
            Object obj = bVar.f47670a;
            return new c(c10, null);
        } catch (g e) {
            Object obj2 = bVar.f47670a;
            return new c(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        c cVar = (c) obj;
        Object obj2 = this.d.f47670a;
        h hVar = cVar.f47671a;
        vn0 vn0Var = this.f47669c;
        if (hVar != null) {
            go0 go0Var = vn0Var.f42261a;
            if (go0Var.Q0) {
                return;
            }
            go0Var.f37288w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) hVar.f46912c, (String) hVar.f46911b);
            AndroidUtilities.runOnUIThread(new ek0(vn0Var, 9));
            return;
        }
        Exception exc = cVar.f47672b;
        if (exc != null) {
            vn0Var.a(exc);
        } else {
            vn0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
