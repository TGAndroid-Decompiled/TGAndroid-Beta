package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f46761a;
    public r f46762b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f46761a = bundle;
            this.f46762b = rVar;
            bundle.putBundle("selector", rVar.f46784a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f46762b == null) {
            r b10 = r.b(this.f46761a.getBundle("selector"));
            this.f46762b = b10;
            if (b10 == null) {
                this.f46762b = r.f46783c;
            }
        }
    }

    public final boolean b() {
        return this.f46761a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f46762b;
            nVar.a();
            if (rVar.equals(nVar.f46762b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f46762b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f46762b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f46762b;
        rVar.a();
        sb2.append(!rVar.f46785b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
