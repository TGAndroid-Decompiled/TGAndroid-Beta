package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import m.f3;
public final class u {
    public final h3 f45510a;
    public final ArrayList f45511b = new ArrayList();
    public final boolean f45512c;
    public final f3 d;
    public b2.p f45513e;

    public u(h3 h3Var, boolean z10) {
        this.f45510a = h3Var;
        this.d = (f3) h3Var.d;
        this.f45512c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f45511b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f45515b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f15729b).getPackageName() + " }";
    }
}
