package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import m.f3;
public final class u {
    public final h3 f45440a;
    public final ArrayList f45441b = new ArrayList();
    public final boolean f45442c;
    public final f3 d;
    public b2.p f45443e;

    public u(h3 h3Var, boolean z10) {
        this.f45440a = h3Var;
        this.d = (f3) h3Var.d;
        this.f45442c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f45441b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f45445b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f15668b).getPackageName() + " }";
    }
}
