package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f45441a;
    public r f45442b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f45441a = bundle;
            this.f45442b = rVar;
            bundle.putBundle("selector", rVar.f45467a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f45442b == null) {
            r b10 = r.b(this.f45441a.getBundle("selector"));
            this.f45442b = b10;
            if (b10 == null) {
                this.f45442b = r.f45466c;
            }
        }
    }

    public final boolean b() {
        return this.f45441a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f45442b;
            nVar.a();
            if (rVar.equals(nVar.f45442b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f45442b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f45442b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f45442b;
        rVar.a();
        sb2.append(!rVar.f45468b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
