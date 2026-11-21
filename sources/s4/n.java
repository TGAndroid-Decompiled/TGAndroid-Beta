package s4;

import android.os.Bundle;
public final class n {
    public final Bundle f57038a;
    public r f57039b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f57038a = bundle;
            this.f57039b = rVar;
            bundle.putBundle("selector", rVar.f57064a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f57039b == null) {
            r b10 = r.b(this.f57038a.getBundle("selector"));
            this.f57039b = b10;
            if (b10 == null) {
                this.f57039b = r.f57063c;
            }
        }
    }

    public final boolean b() {
        return this.f57038a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f57039b;
            nVar.a();
            if (rVar.equals(nVar.f57039b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f57039b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f57039b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f57039b;
        rVar.a();
        sb2.append(!rVar.f57065b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
