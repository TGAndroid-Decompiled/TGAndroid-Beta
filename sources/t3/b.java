package t3;

import b8.zb;
import d2.p0;
import d2.r0;
import d2.v;
import java.util.ArrayList;
public final class b implements r0 {
    public final ArrayList f54905a;

    public b(ArrayList arrayList) {
        this.f54905a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((a) arrayList.get(0)).f54903b;
            int i3 = 1;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                } else if (((a) arrayList.get(i3)).f54902a < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((a) arrayList.get(i3)).f54903b;
                    i3++;
                }
            }
        }
        zb.f(!z10);
    }

    @Override
    public final v b() {
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
            return this.f54905a.equals(((b) obj).f54905a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f54905a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f54905a;
    }

    @Override
    public final void a(p0 p0Var) {
    }
}
