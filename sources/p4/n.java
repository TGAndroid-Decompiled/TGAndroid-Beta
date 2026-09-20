package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f40914a;
    public r f40915b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f40914a = bundle;
            this.f40915b = rVar;
            bundle.putBundle("selector", rVar.f40937a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f40915b == null) {
            r b10 = r.b(this.f40914a.getBundle("selector"));
            this.f40915b = b10;
            if (b10 == null) {
                this.f40915b = r.f40936c;
            }
        }
    }

    public final boolean b() {
        return this.f40914a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f40915b;
            nVar.a();
            if (rVar.equals(nVar.f40915b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f40915b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f40915b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f40915b;
        rVar.a();
        sb2.append(!rVar.f40938b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
