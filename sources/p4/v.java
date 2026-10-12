package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
public final class v {
    public final h3 f45330a;
    public final ArrayList f45331b = new ArrayList();
    public final boolean f45332c;
    public final k2.g0 d;
    public b2.p f45333e;

    public v(h3 h3Var, boolean z10) {
        this.f45330a = h3Var;
        this.d = (k2.g0) h3Var.d;
        this.f45332c = z10;
    }

    public final w a(String str) {
        ArrayList arrayList = this.f45331b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w wVar = (w) obj;
            if (wVar.f45337b.equals(str)) {
                return wVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f14466b).getPackageName() + " }";
    }
}
