package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import m.g3;
public final class u {
    public final h3 f39785a;
    public final ArrayList f39786b = new ArrayList();
    public final boolean f39787c;
    public final g3 d;
    public b2.p e;

    public u(h3 h3Var, boolean z10) {
        this.f39785a = h3Var;
        this.d = (g3) h3Var.d;
        this.f39787c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f39786b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f39789b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f13018b).getPackageName() + " }";
    }
}
