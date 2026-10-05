package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
public final class u {
    public final h3 f44276a;
    public final ArrayList f44277b = new ArrayList();
    public final boolean f44278c;
    public final l2.g d;
    public b2.p f44279e;

    public u(h3 h3Var, boolean z10) {
        this.f44276a = h3Var;
        this.d = (l2.g) h3Var.d;
        this.f44278c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f44277b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f44281b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f15268b).getPackageName() + " }";
    }
}
