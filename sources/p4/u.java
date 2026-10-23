package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
public final class u {
    public final g3 f44624a;
    public final ArrayList f44625b = new ArrayList();
    public final boolean f44626c;
    public final le.b d;
    public b2.t e;

    public u(g3 g3Var, boolean z10) {
        this.f44624a = g3Var;
        this.d = (le.b) g3Var.d;
        this.f44626c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f44625b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f44628b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f16072b).getPackageName() + " }";
    }
}
