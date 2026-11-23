package s4;

import android.os.Bundle;
public final class n {
    public final Bundle f57007a;
    public r f57008b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f57007a = bundle;
            this.f57008b = rVar;
            bundle.putBundle("selector", rVar.f57033a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f57008b == null) {
            r b10 = r.b(this.f57007a.getBundle("selector"));
            this.f57008b = b10;
            if (b10 == null) {
                this.f57008b = r.f57032c;
            }
        }
    }

    public final boolean b() {
        return this.f57007a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f57008b;
            nVar.a();
            if (rVar.equals(nVar.f57008b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f57008b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f57008b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f57008b;
        rVar.a();
        sb2.append(!rVar.f57034b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
