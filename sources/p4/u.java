package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
public final class u {
    public final h3 f40687a;
    public final ArrayList f40688b = new ArrayList();
    public final boolean f40689c;
    public final k2.u d;
    public b2.p e;

    public u(h3 h3Var, boolean z10) {
        this.f40687a = h3Var;
        this.d = (k2.u) h3Var.d;
        this.f40689c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f40688b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f40691b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f13385b).getPackageName() + " }";
    }
}
