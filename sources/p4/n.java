package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f43903a;
    public r f43904b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f43903a = bundle;
            this.f43904b = rVar;
            bundle.putBundle("selector", rVar.f43929a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f43904b == null) {
            r b10 = r.b(this.f43903a.getBundle("selector"));
            this.f43904b = b10;
            if (b10 == null) {
                this.f43904b = r.f43928c;
            }
        }
    }

    public final boolean b() {
        return this.f43903a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f43904b;
            nVar.a();
            if (rVar.equals(nVar.f43904b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f43904b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f43904b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f43904b;
        rVar.a();
        sb2.append(!rVar.f43930b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
