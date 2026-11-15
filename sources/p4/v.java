package p4;

import android.os.Bundle;
import j$.util.Objects;
public final class v {
    public final q4.r f54868a;
    public final int f54869b;
    public final int f54870c;
    public final u d;
    public final Bundle f54871e;

    public v(q4.r rVar, int i7, int i10, boolean z10, u uVar, Bundle bundle) {
        this.f54868a = rVar;
        this.f54869b = i7;
        this.f54870c = i10;
        this.d = uVar;
        this.f54871e = bundle;
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
            return this.f54868a.equals(vVar.f54868a);
        }
        return Objects.equals(uVar2, uVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f54868a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        q4.r rVar = this.f54868a;
        sb2.append(rVar.f55254a.f55255a);
        sb2.append(", uid=");
        return a8.p0.n(rVar.f55254a.f55257c, "}", sb2);
    }
}
