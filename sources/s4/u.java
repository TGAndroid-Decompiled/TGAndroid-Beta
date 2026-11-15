package s4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import org.telegram.messenger.ou;
public final class u {
    public final h3 f56464a;
    public final ArrayList f56465b = new ArrayList();
    public final boolean f56466c;
    public final ou d;
    public ca.i f56467e;

    public u(h3 h3Var, boolean z10) {
        this.f56464a = h3Var;
        this.d = (ou) h3Var.d;
        this.f56466c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.f56465b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (vVar.f56469b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f25806b).getPackageName() + " }";
    }
}
