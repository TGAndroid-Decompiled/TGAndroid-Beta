package r4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
import org.telegram.ui.Components.nh;
public final class v {
    public final g3 f54368a;
    public final ArrayList f54369b = new ArrayList();
    public final boolean f54370c;
    public final nh d;
    public ba.i f54371e;

    public v(g3 g3Var, boolean z10) {
        this.f54368a = g3Var;
        this.d = (nh) g3Var.d;
        this.f54370c = z10;
    }

    public final w a(String str) {
        ArrayList arrayList = this.f54369b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            w wVar = (w) obj;
            if (wVar.f54373b.equals(str)) {
                return wVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f36540b).getPackageName() + " }";
    }
}
