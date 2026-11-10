package s4;

import android.os.Bundle;
public final class n {
    public final Bundle f54869a;
    public r f54870b;

    public n(r rVar, boolean z9) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f54869a = bundle;
            this.f54870b = rVar;
            bundle.putBundle("selector", rVar.f54895a);
            bundle.putBoolean("activeScan", z9);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f54870b == null) {
            r b10 = r.b(this.f54869a.getBundle("selector"));
            this.f54870b = b10;
            if (b10 == null) {
                this.f54870b = r.f54894c;
            }
        }
    }

    public final boolean b() {
        return this.f54869a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f54870b;
            nVar.a();
            if (rVar.equals(nVar.f54870b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f54870b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f54870b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f54870b;
        rVar.a();
        sb2.append(!rVar.f54896b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
