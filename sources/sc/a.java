package sc;

import android.os.AsyncTask;
import java.util.Locale;
import lf.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.ja;
import org.telegram.ui.fo0;
import org.telegram.ui.jl0;
import org.telegram.ui.qo0;
import tc.g;
import w7.r8;
public final class a extends AsyncTask {
    public final String f42845a;
    public final uc.a f42846b;
    public final fo0 f42847c;
    public final ja d;

    public a(ja jaVar, String str, uc.a aVar, fo0 fo0Var) {
        this.d = jaVar;
        this.f42845a = str;
        this.f42846b = aVar;
        this.f42847c = fo0Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        ja jaVar = this.d;
        try {
            String str = this.f42845a;
            ?? obj = new Object();
            obj.f3892a = str;
            i c10 = vc.b.c(r8.a(this.f42846b), obj);
            Object obj2 = jaVar.f20300b;
            return new b(c10, null);
        } catch (g e) {
            Object obj3 = jaVar.f20300b;
            return new b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.f20300b;
        i iVar = bVar.f42848a;
        fo0 fo0Var = this.f42847c;
        if (iVar != null) {
            qo0 qo0Var = fo0Var.f33352a;
            if (qo0Var.Q0) {
                return;
            }
            qo0Var.f36518w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) iVar.f14012c, (String) iVar.f14011b);
            AndroidUtilities.runOnUIThread(new jl0(fo0Var, 8));
            return;
        }
        Exception exc = bVar.f42849b;
        if (exc != null) {
            fo0Var.a(exc);
        } else {
            fo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
