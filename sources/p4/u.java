package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
import ji.h5;
public final class u {
    public final g3 f42813a;
    public final ArrayList f42814b = new ArrayList();
    public final boolean f42815c;
    public final h5 d;
    public b2.u e;

    public u(g3 g3Var, boolean z10) {
        this.f42813a = g3Var;
        this.d = (h5) g3Var.d;
        this.f42815c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f42814b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f42819b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f13315b).getPackageName() + " }";
    }
}
