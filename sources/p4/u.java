package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
import li.e3;
public final class u {
    public final g3 f46766a;
    public final ArrayList f46767b = new ArrayList();
    public final boolean f46768c;
    public final e3 d;
    public b2.u e;

    public u(g3 g3Var, boolean z10) {
        this.f46766a = g3Var;
        this.d = (e3) g3Var.d;
        this.f46768c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f46767b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f46770b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f17210b).getPackageName() + " }";
    }
}
