package s4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import org.telegram.ui.Components.nd0;
public final class u {
    public final h3 f57162a;
    public final ArrayList f57163b = new ArrayList();
    public final boolean f57164c;
    public final nd0 d;
    public ca.i f57165e;

    public u(h3 h3Var, boolean z10) {
        this.f57162a = h3Var;
        this.d = (nd0) h3Var.d;
        this.f57164c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f57163b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (vVar.f57167b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f37766b).getPackageName() + " }";
    }
}
