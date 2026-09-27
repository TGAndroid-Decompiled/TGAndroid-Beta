package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
public final class u {
    public final h3 f40925a;
    public final ArrayList f40926b = new ArrayList();
    public final boolean f40927c;
    public final o0.c d;
    public b2.p e;

    public u(h3 h3Var, boolean z10) {
        this.f40925a = h3Var;
        this.d = (o0.c) h3Var.d;
        this.f40927c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f40926b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f40929b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f15522b).getPackageName() + " }";
    }
}
