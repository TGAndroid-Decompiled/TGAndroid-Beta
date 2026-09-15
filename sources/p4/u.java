package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
public final class u {
    public final h3 f40660a;
    public final ArrayList f40661b = new ArrayList();
    public final boolean f40662c;
    public final k2.u d;
    public b2.p e;

    public u(h3 h3Var, boolean z10) {
        this.f40660a = h3Var;
        this.d = (k2.u) h3Var.d;
        this.f40662c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f40661b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f40664b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f13382b).getPackageName() + " }";
    }
}
