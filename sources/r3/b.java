package r3;

import a8.yb;
import b2.r0;
import b2.t0;
import b2.x;
import java.util.ArrayList;
public final class b implements t0 {
    public final ArrayList f47275a;

    public b(ArrayList arrayList) {
        this.f47275a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((a) arrayList.get(0)).f47273b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((a) arrayList.get(i10)).f47272a < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((a) arrayList.get(i10)).f47273b;
                    i10++;
                }
            }
        }
        yb.g(!z10);
    }

    @Override
    public final x a() {
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
            return this.f47275a.equals(((b) obj).f47275a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47275a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f47275a;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
