package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f40620a;
    public r f40621b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f40620a = bundle;
            this.f40621b = rVar;
            bundle.putBundle("selector", rVar.f40643a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f40621b == null) {
            r b10 = r.b(this.f40620a.getBundle("selector"));
            this.f40621b = b10;
            if (b10 == null) {
                this.f40621b = r.f40642c;
            }
        }
    }

    public final boolean b() {
        return this.f40620a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f40621b;
            nVar.a();
            if (rVar.equals(nVar.f40621b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f40621b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f40621b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f40621b;
        rVar.a();
        sb2.append(!rVar.f40644b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
