package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f45277a;
    public s f45278b;

    public n(s sVar, boolean z10) {
        if (sVar != null) {
            Bundle bundle = new Bundle();
            this.f45277a = bundle;
            this.f45278b = sVar;
            bundle.putBundle("selector", sVar.f45311a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f45278b == null) {
            s b10 = s.b(this.f45277a.getBundle("selector"));
            this.f45278b = b10;
            if (b10 == null) {
                this.f45278b = s.f45310c;
            }
        }
    }

    public final boolean b() {
        return this.f45277a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            s sVar = this.f45278b;
            nVar.a();
            if (sVar.equals(nVar.f45278b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f45278b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f45278b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        s sVar = this.f45278b;
        sVar.a();
        sb2.append(!sVar.f45312b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
