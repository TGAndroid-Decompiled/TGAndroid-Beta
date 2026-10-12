package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f45282a;
    public s f45283b;

    public n(s sVar, boolean z10) {
        if (sVar != null) {
            Bundle bundle = new Bundle();
            this.f45282a = bundle;
            this.f45283b = sVar;
            bundle.putBundle("selector", sVar.f45316a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f45283b == null) {
            s b10 = s.b(this.f45282a.getBundle("selector"));
            this.f45283b = b10;
            if (b10 == null) {
                this.f45283b = s.f45315c;
            }
        }
    }

    public final boolean b() {
        return this.f45282a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            s sVar = this.f45283b;
            nVar.a();
            if (sVar.equals(nVar.f45283b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f45283b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f45283b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        s sVar = this.f45283b;
        sVar.a();
        sb2.append(!sVar.f45317b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
