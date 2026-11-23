package p4;

import android.os.Bundle;
import j$.util.Objects;
public final class v {
    public final q4.r f55567a;
    public final int f55568b;
    public final int f55569c;
    public final u d;
    public final Bundle f55570e;

    public v(q4.r rVar, int i7, int i10, boolean z10, u uVar, Bundle bundle) {
        this.f55567a = rVar;
        this.f55568b = i7;
        this.f55569c = i10;
        this.d = uVar;
        this.f55570e = bundle;
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
            return this.f55567a.equals(vVar.f55567a);
        }
        return Objects.equals(uVar2, uVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f55567a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        q4.r rVar = this.f55567a;
        sb2.append(rVar.f55951a.f55952a);
        sb2.append(", uid=");
        return a8.p0.n(rVar.f55951a.f55954c, "}", sb2);
    }
}
