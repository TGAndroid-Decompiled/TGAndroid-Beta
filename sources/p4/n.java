package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f46723a;
    public r f46724b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f46723a = bundle;
            this.f46724b = rVar;
            bundle.putBundle("selector", rVar.f46746a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f46724b == null) {
            r b10 = r.b(this.f46723a.getBundle("selector"));
            this.f46724b = b10;
            if (b10 == null) {
                this.f46724b = r.f46745c;
            }
        }
    }

    public final boolean b() {
        return this.f46723a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f46724b;
            nVar.a();
            if (rVar.equals(nVar.f46724b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f46724b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f46724b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f46724b;
        rVar.a();
        sb2.append(!rVar.f46747b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
