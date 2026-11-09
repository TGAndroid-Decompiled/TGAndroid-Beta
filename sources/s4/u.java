package s4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
import org.telegram.ui.Components.vy;
public final class u {
    public final g3 f54909a;
    public final ArrayList f54910b = new ArrayList();
    public final boolean f54911c;
    public final vy d;
    public ca.i f54912e;

    public u(g3 g3Var, boolean z9) {
        this.f54909a = g3Var;
        this.d = (vy) g3Var.d;
        this.f54911c = z9;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f54910b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (vVar.f54914b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f39835b).getPackageName() + " }";
    }
}
