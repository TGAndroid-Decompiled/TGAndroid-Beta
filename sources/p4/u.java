package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
public final class u {
    public final h3 f40927a;
    public final ArrayList f40928b = new ArrayList();
    public final boolean f40929c;
    public final n2.e d;
    public b2.p e;

    public u(h3 h3Var, boolean z10) {
        this.f40927a = h3Var;
        this.d = (n2.e) h3Var.d;
        this.f40929c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f40928b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f40931b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f15116b).getPackageName() + " }";
    }
}
