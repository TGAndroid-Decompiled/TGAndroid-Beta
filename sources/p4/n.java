package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f40986a;
    public r f40987b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f40986a = bundle;
            this.f40987b = rVar;
            bundle.putBundle("selector", rVar.f41009a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f40987b == null) {
            r b10 = r.b(this.f40986a.getBundle("selector"));
            this.f40987b = b10;
            if (b10 == null) {
                this.f40987b = r.f41008c;
            }
        }
    }

    public final boolean b() {
        return this.f40986a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f40987b;
            nVar.a();
            if (rVar.equals(nVar.f40987b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f40987b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f40987b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f40987b;
        rVar.a();
        sb2.append(!rVar.f41010b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
