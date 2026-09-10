package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f39745a;
    public r f39746b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f39745a = bundle;
            this.f39746b = rVar;
            bundle.putBundle("selector", rVar.f39768a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f39746b == null) {
            r b10 = r.b(this.f39745a.getBundle("selector"));
            this.f39746b = b10;
            if (b10 == null) {
                this.f39746b = r.f39767c;
            }
        }
    }

    public final boolean b() {
        return this.f39745a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f39746b;
            nVar.a();
            if (rVar.equals(nVar.f39746b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f39746b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f39746b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f39746b;
        rVar.a();
        sb2.append(!rVar.f39769b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
