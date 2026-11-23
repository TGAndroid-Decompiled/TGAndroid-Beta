package p4;

import android.os.Bundle;
import j$.util.Objects;
public final class v {
    public final q4.r f55452a;
    public final int f55453b;
    public final int f55454c;
    public final u d;
    public final Bundle f55455e;

    public v(q4.r rVar, int i7, int i10, boolean z10, u uVar, Bundle bundle) {
        this.f55452a = rVar;
        this.f55453b = i7;
        this.f55454c = i10;
        this.d = uVar;
        this.f55455e = bundle;
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
            return this.f55452a.equals(vVar.f55452a);
        }
        return Objects.equals(uVar2, uVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.f55452a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        q4.r rVar = this.f55452a;
        sb2.append(rVar.f55838a.f55839a);
        sb2.append(", uid=");
        return a8.p0.n(rVar.f55838a.f55841c, "}", sb2);
    }
}
