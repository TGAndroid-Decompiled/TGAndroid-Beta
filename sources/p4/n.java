package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f44155a;
    public r f44156b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f44155a = bundle;
            this.f44156b = rVar;
            bundle.putBundle("selector", rVar.f44178a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f44156b == null) {
            r b10 = r.b(this.f44155a.getBundle("selector"));
            this.f44156b = b10;
            if (b10 == null) {
                this.f44156b = r.f44177c;
            }
        }
    }

    public final boolean b() {
        return this.f44155a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f44156b;
            nVar.a();
            if (rVar.equals(nVar.f44156b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f44156b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f44156b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f44156b;
        rVar.a();
        sb2.append(!rVar.f44179b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
