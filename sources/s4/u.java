package s4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
import org.telegram.ui.Components.uy;
public final class u {
    public final g3 f54805a;
    public final ArrayList f54806b = new ArrayList();
    public final boolean f54807c;
    public final uy d;
    public ca.i f54808e;

    public u(g3 g3Var, boolean z9) {
        this.f54805a = g3Var;
        this.d = (uy) g3Var.d;
        this.f54807c = z9;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f54806b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (vVar.f54810b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f38757b).getPackageName() + " }";
    }
}
