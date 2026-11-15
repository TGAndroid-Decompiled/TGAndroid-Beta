package s4;

import android.os.Bundle;
public final class n {
    public final Bundle f56423a;
    public r f56424b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f56423a = bundle;
            this.f56424b = rVar;
            bundle.putBundle("selector", rVar.f56449a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f56424b == null) {
            r b10 = r.b(this.f56423a.getBundle("selector"));
            this.f56424b = b10;
            if (b10 == null) {
                this.f56424b = r.f56448c;
            }
        }
    }

    public final boolean b() {
        return this.f56423a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f56424b;
            nVar.a();
            if (rVar.equals(nVar.f56424b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f56424b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f56424b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f56424b;
        rVar.a();
        sb2.append(!rVar.f56450b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
