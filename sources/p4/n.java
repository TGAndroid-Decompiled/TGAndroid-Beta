package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f45397a;
    public r f45398b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f45397a = bundle;
            this.f45398b = rVar;
            bundle.putBundle("selector", rVar.f45423a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f45398b == null) {
            r b10 = r.b(this.f45397a.getBundle("selector"));
            this.f45398b = b10;
            if (b10 == null) {
                this.f45398b = r.f45422c;
            }
        }
    }

    public final boolean b() {
        return this.f45397a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f45398b;
            nVar.a();
            if (rVar.equals(nVar.f45398b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f45398b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f45398b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f45398b;
        rVar.a();
        sb2.append(!rVar.f45424b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
