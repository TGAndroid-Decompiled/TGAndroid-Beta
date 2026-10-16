package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f42773a;
    public r f42774b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f42773a = bundle;
            this.f42774b = rVar;
            bundle.putBundle("selector", rVar.f42796a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f42774b == null) {
            r b10 = r.b(this.f42773a.getBundle("selector"));
            this.f42774b = b10;
            if (b10 == null) {
                this.f42774b = r.f42795c;
            }
        }
    }

    public final boolean b() {
        return this.f42773a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f42774b;
            nVar.a();
            if (rVar.equals(nVar.f42774b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f42774b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f42774b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f42774b;
        rVar.a();
        sb2.append(!rVar.f42797b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
