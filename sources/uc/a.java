package uc;

import android.os.AsyncTask;
import com.google.android.gms.internal.clearcut.e;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ek0;
import org.telegram.ui.go0;
import org.telegram.ui.vn0;
import vc.g;
import w7.o9;
public final class a extends AsyncTask {
    public final String f47623a;
    public final wc.a f47624b;
    public final vn0 f47625c;
    public final b d;

    public a(b bVar, String str, wc.a aVar, vn0 vn0Var) {
        this.d = bVar;
        this.f47623a = str;
        this.f47624b = aVar;
        this.f47625c = vn0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        b bVar = this.d;
        try {
            u2.c c10 = xc.b.c(o9.a(this.f47624b), new e(this.f47623a, 3));
            Object obj = bVar.f47626a;
            return new c(c10, null);
        } catch (g e) {
            Object obj2 = bVar.f47626a;
            return new c(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        c cVar = (c) obj;
        Object obj2 = this.d.f47626a;
        u2.c cVar2 = cVar.f47627a;
        vn0 vn0Var = this.f47625c;
        if (cVar2 != null) {
            go0 go0Var = vn0Var.f42234a;
            if (go0Var.Q0) {
                return;
            }
            go0Var.f37250w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) cVar2.f47261c, (String) cVar2.f47260b);
            AndroidUtilities.runOnUIThread(new ek0(vn0Var, 9));
            return;
        }
        Exception exc = cVar.f47628b;
        if (exc != null) {
            vn0Var.a(exc);
        } else {
            vn0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
