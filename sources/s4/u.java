package s4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import org.telegram.ui.Components.hn;
public final class u {
    public final h3 f57038a;
    public final ArrayList f57039b = new ArrayList();
    public final boolean f57040c;
    public final hn d;
    public ca.i f57041e;

    public u(h3 h3Var, boolean z10) {
        this.f57038a = h3Var;
        this.d = (hn) h3Var.d;
        this.f57040c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f57039b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (vVar.f57043b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f35933b).getPackageName() + " }";
    }
}
