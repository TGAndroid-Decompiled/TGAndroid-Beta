package p4;

import android.os.Bundle;
import j$.util.Objects;
public final class v {
    public final q4.r f53333a;
    public final int f53334b;
    public final int f53335c;
    public final u d;
    public final Bundle f53336e;

    public v(q4.r rVar, int i7, int i10, boolean z9, u uVar, Bundle bundle) {
        this.f53333a = rVar;
        this.f53334b = i7;
        this.f53335c = i10;
        this.d = uVar;
        this.f53336e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        v vVar = (v) obj;
        u uVar = vVar.d;
        u uVar2 = this.d;
        if (uVar2 == null && uVar == null) {
            return this.f53333a.equals(vVar.f53333a);
        }
        return Objects.equals(uVar2, uVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f53333a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        q4.r rVar = this.f53333a;
        sb2.append(rVar.f53688a.f53689a);
        sb2.append(", uid=");
        return a8.p0.n(rVar.f53688a.f53691c, "}", sb2);
    }
}
