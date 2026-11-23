package s4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import org.telegram.ui.Components.jn;
public final class u {
    public final h3 f57083a;
    public final ArrayList f57084b = new ArrayList();
    public final boolean f57085c;
    public final jn d;
    public ca.i f57086e;

    public u(h3 h3Var, boolean z10) {
        this.f57083a = h3Var;
        this.d = (jn) h3Var.d;
        this.f57085c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f57084b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (vVar.f57088b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f36567b).getPackageName() + " }";
    }
}
