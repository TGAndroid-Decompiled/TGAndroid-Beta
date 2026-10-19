package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f44157a;
    public r f44158b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f44157a = bundle;
            this.f44158b = rVar;
            bundle.putBundle("selector", rVar.f44180a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f44158b == null) {
            r b10 = r.b(this.f44157a.getBundle("selector"));
            this.f44158b = b10;
            if (b10 == null) {
                this.f44158b = r.f44179c;
            }
        }
    }

    public final boolean b() {
        return this.f44157a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f44158b;
            nVar.a();
            if (rVar.equals(nVar.f44158b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f44158b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f44158b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f44158b;
        rVar.a();
        sb2.append(!rVar.f44181b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
