package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
public final class u {
    public final h3 f41026a;
    public final ArrayList f41027b = new ArrayList();
    public final boolean f41028c;
    public final n2.e d;
    public b2.p e;

    public u(h3 h3Var, boolean z10) {
        this.f41026a = h3Var;
        this.d = (n2.e) h3Var.d;
        this.f41028c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f41027b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f41030b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f15132b).getPackageName() + " }";
    }
}
