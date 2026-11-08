package s4;

import android.os.Bundle;
public final class n {
    public final Bundle f54857a;
    public r f54858b;

    public n(r rVar, boolean z9) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f54857a = bundle;
            this.f54858b = rVar;
            bundle.putBundle("selector", rVar.f54883a);
            bundle.putBoolean("activeScan", z9);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f54858b == null) {
            r b10 = r.b(this.f54857a.getBundle("selector"));
            this.f54858b = b10;
            if (b10 == null) {
                this.f54858b = r.f54882c;
            }
        }
    }

    public final boolean b() {
        return this.f54857a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f54858b;
            nVar.a();
            if (rVar.equals(nVar.f54858b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f54858b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f54858b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f54858b;
        rVar.a();
        sb2.append(!rVar.f54884b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
