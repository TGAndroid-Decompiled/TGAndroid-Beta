package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f44224a;
    public r f44225b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f44224a = bundle;
            this.f44225b = rVar;
            bundle.putBundle("selector", rVar.f44250a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f44225b == null) {
            r b10 = r.b(this.f44224a.getBundle("selector"));
            this.f44225b = b10;
            if (b10 == null) {
                this.f44225b = r.f44249c;
            }
        }
    }

    public final boolean b() {
        return this.f44224a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f44225b;
            nVar.a();
            if (rVar.equals(nVar.f44225b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f44225b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f44225b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f44225b;
        rVar.a();
        sb2.append(!rVar.f44251b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
