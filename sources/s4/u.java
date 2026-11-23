package s4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import org.telegram.ui.Components.jn;
public final class u {
    public final h3 f57048a;
    public final ArrayList f57049b = new ArrayList();
    public final boolean f57050c;
    public final jn d;
    public ca.i f57051e;

    public u(h3 h3Var, boolean z10) {
        this.f57048a = h3Var;
        this.d = (jn) h3Var.d;
        this.f57050c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f57049b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (vVar.f57053b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f36522b).getPackageName() + " }";
    }
}
