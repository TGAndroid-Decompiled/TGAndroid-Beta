package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f43902a;
    public r f43903b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f43902a = bundle;
            this.f43903b = rVar;
            bundle.putBundle("selector", rVar.f43928a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f43903b == null) {
            r b10 = r.b(this.f43902a.getBundle("selector"));
            this.f43903b = b10;
            if (b10 == null) {
                this.f43903b = r.f43927c;
            }
        }
    }

    public final boolean b() {
        return this.f43902a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f43903b;
            nVar.a();
            if (rVar.equals(nVar.f43903b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f43903b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f43903b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f43903b;
        rVar.a();
        sb2.append(!rVar.f43929b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
