package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f44783a;
    public s f44784b;

    public n(s sVar, boolean z10) {
        if (sVar != null) {
            Bundle bundle = new Bundle();
            this.f44783a = bundle;
            this.f44784b = sVar;
            bundle.putBundle("selector", sVar.f44814a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f44784b == null) {
            s b10 = s.b(this.f44783a.getBundle("selector"));
            this.f44784b = b10;
            if (b10 == null) {
                this.f44784b = s.f44813c;
            }
        }
    }

    public final boolean b() {
        return this.f44783a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            s sVar = this.f44784b;
            nVar.a();
            if (sVar.equals(nVar.f44784b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f44784b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f44784b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        s sVar = this.f44784b;
        sVar.a();
        sb2.append(!sVar.f44815b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
