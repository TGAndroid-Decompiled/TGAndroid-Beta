package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import ji.u4;
public final class u {
    public final h3 f43947a;
    public final ArrayList f43948b = new ArrayList();
    public final boolean f43949c;
    public final u4 d;
    public b2.p f43950e;

    public u(h3 h3Var, boolean z10) {
        this.f43947a = h3Var;
        this.d = (u4) h3Var.d;
        this.f43949c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f43948b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f43952b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f14247b).getPackageName() + " }";
    }
}
