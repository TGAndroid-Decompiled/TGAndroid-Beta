package p4;

import android.os.Bundle;
import j$.util.Objects;
public final class v {
    public final q4.r f55442a;
    public final int f55443b;
    public final int f55444c;
    public final u d;
    public final Bundle f55445e;

    public v(q4.r rVar, int i7, int i10, boolean z10, u uVar, Bundle bundle) {
        this.f55442a = rVar;
        this.f55443b = i7;
        this.f55444c = i10;
        this.d = uVar;
        this.f55445e = bundle;
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
            return this.f55442a.equals(vVar.f55442a);
        }
        return Objects.equals(uVar2, uVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f55442a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        q4.r rVar = this.f55442a;
        sb2.append(rVar.f55828a.f55829a);
        sb2.append(", uid=");
        return a8.p0.n(rVar.f55828a.f55831c, "}", sb2);
    }
}
