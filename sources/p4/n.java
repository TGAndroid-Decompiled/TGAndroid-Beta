package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f46726a;
    public r f46727b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f46726a = bundle;
            this.f46727b = rVar;
            bundle.putBundle("selector", rVar.f46749a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f46727b == null) {
            r b10 = r.b(this.f46726a.getBundle("selector"));
            this.f46727b = b10;
            if (b10 == null) {
                this.f46727b = r.f46748c;
            }
        }
    }

    public final boolean b() {
        return this.f46726a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f46727b;
            nVar.a();
            if (rVar.equals(nVar.f46727b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f46727b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f46727b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f46727b;
        rVar.a();
        sb2.append(!rVar.f46750b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
