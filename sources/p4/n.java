package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f44183a;
    public r f44184b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f44183a = bundle;
            this.f44184b = rVar;
            bundle.putBundle("selector", rVar.f44206a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f44184b == null) {
            r b10 = r.b(this.f44183a.getBundle("selector"));
            this.f44184b = b10;
            if (b10 == null) {
                this.f44184b = r.f44205c;
            }
        }
    }

    public final boolean b() {
        return this.f44183a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f44184b;
            nVar.a();
            if (rVar.equals(nVar.f44184b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f44184b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f44184b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f44184b;
        rVar.a();
        sb2.append(!rVar.f44207b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
