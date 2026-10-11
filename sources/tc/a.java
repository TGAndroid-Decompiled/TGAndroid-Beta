package tc;

import android.os.AsyncTask;
import java.util.Locale;
import m.f3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.jo0;
import org.telegram.ui.sk0;
import org.telegram.ui.uo0;
import uc.g;
import v7.k;
import w7.y8;
public final class a extends AsyncTask {
    public final String f48337a;
    public final vc.a f48338b;
    public final jo0 f48339c;
    public final f3 d;

    public a(f3 f3Var, String str, vc.a aVar, jo0 jo0Var) {
        this.d = f3Var;
        this.f48337a = str;
        this.f48338b = aVar;
        this.f48339c = jo0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        f3 f3Var = this.d;
        try {
            k c10 = wc.b.c(y8.a(this.f48338b), new f2.a(this.f48337a));
            Object obj = f3Var.f15693b;
            return new b(c10, null);
        } catch (g e7) {
            Object obj2 = f3Var.f15693b;
            return new b(null, e7);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f15693b;
        k kVar = bVar.f48340a;
        jo0 jo0Var = this.f48339c;
        if (kVar != null) {
            uo0 uo0Var = jo0Var.f39092a;
            if (uo0Var.Q0) {
                return;
            }
            uo0Var.f42728w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) kVar.f49334c, (String) kVar.f49333b);
            AndroidUtilities.runOnUIThread(new sk0(jo0Var, 9));
            return;
        }
        Exception exc = bVar.f48341b;
        if (exc != null) {
            jo0Var.a(exc);
        } else {
            jo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
