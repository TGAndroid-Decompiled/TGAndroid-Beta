package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
import li.e3;
public final class u {
    public final g3 f46801a;
    public final ArrayList f46802b = new ArrayList();
    public final boolean f46803c;
    public final e3 d;
    public b2.u e;

    public u(g3 g3Var, boolean z10) {
        this.f46801a = g3Var;
        this.d = (e3) g3Var.d;
        this.f46803c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f46802b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f46805b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f17209b).getPackageName() + " }";
    }
}
