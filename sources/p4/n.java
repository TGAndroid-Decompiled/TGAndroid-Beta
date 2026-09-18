package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f40873a;
    public r f40874b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f40873a = bundle;
            this.f40874b = rVar;
            bundle.putBundle("selector", rVar.f40896a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f40874b == null) {
            r b10 = r.b(this.f40873a.getBundle("selector"));
            this.f40874b = b10;
            if (b10 == null) {
                this.f40874b = r.f40895c;
            }
        }
    }

    public final boolean b() {
        return this.f40873a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f40874b;
            nVar.a();
            if (rVar.equals(nVar.f40874b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f40874b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f40874b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f40874b;
        rVar.a();
        sb2.append(!rVar.f40897b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
