package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
public final class u {
    public final g3 f44200a;
    public final ArrayList f44201b = new ArrayList();
    public final boolean f44202c;
    public final k0.b d;
    public b2.t e;

    public u(g3 g3Var, boolean z10) {
        this.f44200a = g3Var;
        this.d = (k0.b) g3Var.d;
        this.f44202c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f44201b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f44204b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f14564b).getPackageName() + " }";
    }
}
