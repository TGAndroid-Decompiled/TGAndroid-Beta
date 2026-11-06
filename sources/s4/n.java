package s4;

import android.os.Bundle;
public final class n {
    public final Bundle f54766a;
    public r f54767b;

    public n(r rVar, boolean z9) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f54766a = bundle;
            this.f54767b = rVar;
            bundle.putBundle("selector", rVar.f54792a);
            bundle.putBoolean("activeScan", z9);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f54767b == null) {
            r b10 = r.b(this.f54766a.getBundle("selector"));
            this.f54767b = b10;
            if (b10 == null) {
                this.f54767b = r.f54791c;
            }
        }
    }

    public final boolean b() {
        return this.f54766a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f54767b;
            nVar.a();
            if (rVar.equals(nVar.f54767b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f54767b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f54767b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f54767b;
        rVar.a();
        sb2.append(!rVar.f54793b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
