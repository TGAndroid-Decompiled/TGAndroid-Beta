package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f44216a;
    public r f44217b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f44216a = bundle;
            this.f44217b = rVar;
            bundle.putBundle("selector", rVar.f44242a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f44217b == null) {
            r b10 = r.b(this.f44216a.getBundle("selector"));
            this.f44217b = b10;
            if (b10 == null) {
                this.f44217b = r.f44241c;
            }
        }
    }

    public final boolean b() {
        return this.f44216a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f44217b;
            nVar.a();
            if (rVar.equals(nVar.f44217b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f44217b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f44217b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f44217b;
        rVar.a();
        sb2.append(!rVar.f44243b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
