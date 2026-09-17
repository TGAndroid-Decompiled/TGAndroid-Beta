package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f43876a;
    public r f43877b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f43876a = bundle;
            this.f43877b = rVar;
            bundle.putBundle("selector", rVar.f43902a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f43877b == null) {
            r b10 = r.b(this.f43876a.getBundle("selector"));
            this.f43877b = b10;
            if (b10 == null) {
                this.f43877b = r.f43901c;
            }
        }
    }

    public final boolean b() {
        return this.f43876a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f43877b;
            nVar.a();
            if (rVar.equals(nVar.f43877b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f43877b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f43877b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f43877b;
        rVar.a();
        sb2.append(!rVar.f43903b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
