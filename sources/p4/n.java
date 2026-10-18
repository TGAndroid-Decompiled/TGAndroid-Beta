package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f44160a;
    public r f44161b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f44160a = bundle;
            this.f44161b = rVar;
            bundle.putBundle("selector", rVar.f44183a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f44161b == null) {
            r b10 = r.b(this.f44160a.getBundle("selector"));
            this.f44161b = b10;
            if (b10 == null) {
                this.f44161b = r.f44182c;
            }
        }
    }

    public final boolean b() {
        return this.f44160a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f44161b;
            nVar.a();
            if (rVar.equals(nVar.f44161b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f44161b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f44161b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f44161b;
        rVar.a();
        sb2.append(!rVar.f44184b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
