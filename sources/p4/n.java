package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f44772a;
    public s f44773b;

    public n(s sVar, boolean z10) {
        if (sVar != null) {
            Bundle bundle = new Bundle();
            this.f44772a = bundle;
            this.f44773b = sVar;
            bundle.putBundle("selector", sVar.f44803a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f44773b == null) {
            s b10 = s.b(this.f44772a.getBundle("selector"));
            this.f44773b = b10;
            if (b10 == null) {
                this.f44773b = s.f44802c;
            }
        }
    }

    public final boolean b() {
        return this.f44772a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            s sVar = this.f44773b;
            nVar.a();
            if (sVar.equals(nVar.f44773b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f44773b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f44773b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        s sVar = this.f44773b;
        sVar.a();
        sb2.append(!sVar.f44804b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
