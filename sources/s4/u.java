package s4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import org.telegram.ui.Components.jn;
public final class u {
    public final h3 f57079a;
    public final ArrayList f57080b = new ArrayList();
    public final boolean f57081c;
    public final jn d;
    public ca.i f57082e;

    public u(h3 h3Var, boolean z10) {
        this.f57079a = h3Var;
        this.d = (jn) h3Var.d;
        this.f57081c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f57080b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (vVar.f57084b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f36572b).getPackageName() + " }";
    }
}
