package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f40935a;
    public r f40936b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f40935a = bundle;
            this.f40936b = rVar;
            bundle.putBundle("selector", rVar.f40958a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f40936b == null) {
            r b10 = r.b(this.f40935a.getBundle("selector"));
            this.f40936b = b10;
            if (b10 == null) {
                this.f40936b = r.f40957c;
            }
        }
    }

    public final boolean b() {
        return this.f40935a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f40936b;
            nVar.a();
            if (rVar.equals(nVar.f40936b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f40936b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f40936b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f40936b;
        rVar.a();
        sb2.append(!rVar.f40959b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
