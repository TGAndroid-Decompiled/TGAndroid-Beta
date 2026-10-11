package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import m.f3;
public final class u {
    public final h3 f45476a;
    public final ArrayList f45477b = new ArrayList();
    public final boolean f45478c;
    public final f3 d;
    public b2.p f45479e;

    public u(h3 h3Var, boolean z10) {
        this.f45476a = h3Var;
        this.d = (f3) h3Var.d;
        this.f45478c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f45477b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f45481b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f15693b).getPackageName() + " }";
    }
}
