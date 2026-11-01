package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
public final class v {
    public final g3 f44831a;
    public final ArrayList f44832b = new ArrayList();
    public final boolean f44833c;
    public final l2.f d;
    public b2.u e;

    public v(g3 g3Var, boolean z10) {
        this.f44831a = g3Var;
        this.d = (l2.f) g3Var.d;
        this.f44833c = z10;
    }

    public final w a(String str) {
        ArrayList arrayList = this.f44832b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w wVar = (w) obj;
            if (wVar.f44835b.equals(str)) {
                return wVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f11588b).getPackageName() + " }";
    }
}
