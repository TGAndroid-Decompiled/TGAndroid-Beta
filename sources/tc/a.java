package tc;

import android.os.AsyncTask;
import java.util.Locale;
import m.f3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ko0;
import org.telegram.ui.tk0;
import org.telegram.ui.vo0;
import uc.g;
import v7.k;
import w7.y8;
public final class a extends AsyncTask {
    public final String f48291a;
    public final vc.a f48292b;
    public final ko0 f48293c;
    public final f3 d;

    public a(f3 f3Var, String str, vc.a aVar, ko0 ko0Var) {
        this.d = f3Var;
        this.f48291a = str;
        this.f48292b = aVar;
        this.f48293c = ko0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        f3 f3Var = this.d;
        try {
            k c10 = wc.b.c(y8.a(this.f48292b), new f2.a(this.f48291a));
            Object obj = f3Var.f15672b;
            return new b(c10, null);
        } catch (g e7) {
            Object obj2 = f3Var.f15672b;
            return new b(null, e7);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f15672b;
        k kVar = bVar.f48294a;
        ko0 ko0Var = this.f48293c;
        if (kVar != null) {
            vo0 vo0Var = ko0Var.f39367a;
            if (vo0Var.Q0) {
                return;
            }
            vo0Var.f42993w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) kVar.f49291c, (String) kVar.f49290b);
            AndroidUtilities.runOnUIThread(new tk0(ko0Var, 9));
            return;
        }
        Exception exc = bVar.f48295b;
        if (exc != null) {
            ko0Var.a(exc);
        } else {
            ko0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
