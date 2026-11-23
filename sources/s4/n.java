package s4;

import android.os.Bundle;
public final class n {
    public final Bundle f57123a;
    public r f57124b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f57123a = bundle;
            this.f57124b = rVar;
            bundle.putBundle("selector", rVar.f57149a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f57124b == null) {
            r b10 = r.b(this.f57123a.getBundle("selector"));
            this.f57124b = b10;
            if (b10 == null) {
                this.f57124b = r.f57148c;
            }
        }
    }

    public final boolean b() {
        return this.f57123a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f57124b;
            nVar.a();
            if (rVar.equals(nVar.f57124b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f57124b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f57124b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f57124b;
        rVar.a();
        sb2.append(!rVar.f57150b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
