package s4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
import org.telegram.ui.Components.vy;
public final class u {
    public final g3 f54896a;
    public final ArrayList f54897b = new ArrayList();
    public final boolean f54898c;
    public final vy d;
    public ca.i f54899e;

    public u(g3 g3Var, boolean z9) {
        this.f54896a = g3Var;
        this.d = (vy) g3Var.d;
        this.f54898c = z9;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f54897b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (vVar.f54901b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f39747b).getPackageName() + " }";
    }
}
