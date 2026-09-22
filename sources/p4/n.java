package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f40616a;
    public r f40617b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f40616a = bundle;
            this.f40617b = rVar;
            bundle.putBundle("selector", rVar.f40639a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f40617b == null) {
            r b10 = r.b(this.f40616a.getBundle("selector"));
            this.f40617b = b10;
            if (b10 == null) {
                this.f40617b = r.f40638c;
            }
        }
    }

    public final boolean b() {
        return this.f40616a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f40617b;
            nVar.a();
            if (rVar.equals(nVar.f40617b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f40617b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f40617b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f40617b;
        rVar.a();
        sb2.append(!rVar.f40640b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
