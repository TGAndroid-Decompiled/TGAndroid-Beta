package p4;

import android.os.Bundle;
import j$.util.Objects;
public final class v {
    public final q4.r f53462a;
    public final int f53463b;
    public final int f53464c;
    public final u d;
    public final Bundle f53465e;

    public v(q4.r rVar, int i7, int i10, boolean z9, u uVar, Bundle bundle) {
        this.f53462a = rVar;
        this.f53463b = i7;
        this.f53464c = i10;
        this.d = uVar;
        this.f53465e = bundle;
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
            return this.f53462a.equals(vVar.f53462a);
        }
        return Objects.equals(uVar2, uVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f53462a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        q4.r rVar = this.f53462a;
        sb2.append(rVar.f53817a.f53818a);
        sb2.append(", uid=");
        return a8.p0.n(rVar.f53817a.f53820c, "}", sb2);
    }
}
