package u3;

import a8.la;
import e2.n0;
import e2.p0;
import e2.u;
import java.util.ArrayList;
public final class b implements p0 {
    public final ArrayList f58432a;

    public b(ArrayList arrayList) {
        this.f58432a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j3 = ((a) arrayList.get(0)).f58430b;
            int i7 = 1;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                } else if (((a) arrayList.get(i7)).f58429a < j3) {
                    z10 = true;
                    break;
                } else {
                    j3 = ((a) arrayList.get(i7)).f58430b;
                    i7++;
                }
            }
        }
        la.f(!z10);
    }

    @Override
    public final u a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            return this.f58432a.equals(((b) obj).f58432a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f58432a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f58432a;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
