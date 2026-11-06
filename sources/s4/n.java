package s4;

import android.os.Bundle;
public final class n {
    public final Bundle f54741a;
    public r f54742b;

    public n(r rVar, boolean z9) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f54741a = bundle;
            this.f54742b = rVar;
            bundle.putBundle("selector", rVar.f54767a);
            bundle.putBoolean("activeScan", z9);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f54742b == null) {
            r b10 = r.b(this.f54741a.getBundle("selector"));
            this.f54742b = b10;
            if (b10 == null) {
                this.f54742b = r.f54766c;
            }
        }
    }

    public final boolean b() {
        return this.f54741a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f54742b;
            nVar.a();
            if (rVar.equals(nVar.f54742b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f54742b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f54742b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f54742b;
        rVar.a();
        sb2.append(!rVar.f54768b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
