package p4;

import android.os.Bundle;
import j$.util.Objects;
public final class v {
    public final q4.r f53357a;
    public final int f53358b;
    public final int f53359c;
    public final u d;
    public final Bundle f53360e;

    public v(q4.r rVar, int i7, int i10, boolean z9, u uVar, Bundle bundle) {
        this.f53357a = rVar;
        this.f53358b = i7;
        this.f53359c = i10;
        this.d = uVar;
        this.f53360e = bundle;
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
            return this.f53357a.equals(vVar.f53357a);
        }
        return Objects.equals(uVar2, uVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f53357a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        q4.r rVar = this.f53357a;
        sb2.append(rVar.f53712a.f53713a);
        sb2.append(", uid=");
        return a8.p0.n(rVar.f53712a.f53715c, "}", sb2);
    }
}
