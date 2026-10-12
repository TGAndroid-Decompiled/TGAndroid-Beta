package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
import ji.d4;
public final class v {
    public final g3 f43117a;
    public final ArrayList f43118b = new ArrayList();
    public final boolean f43119c;
    public final d4 d;
    public b2.u e;

    public v(g3 g3Var, boolean z10) {
        this.f43117a = g3Var;
        this.d = (d4) g3Var.d;
        this.f43119c = z10;
    }

    public final w a(String str) {
        ArrayList arrayList = this.f43118b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w wVar = (w) obj;
            if (wVar.f43121b.equals(str)) {
                return wVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f13233b).getPackageName() + " }";
    }
}
