package r4;

import android.os.Bundle;
public final class n {
    public final Bundle f54320a;
    public r f54321b;

    public n(r rVar, boolean z10) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f54320a = bundle;
            this.f54321b = rVar;
            bundle.putBundle("selector", rVar.f54347a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f54321b == null) {
            r b10 = r.b(this.f54320a.getBundle("selector"));
            this.f54321b = b10;
            if (b10 == null) {
                this.f54321b = r.f54346c;
            }
        }
    }

    public final boolean b() {
        return this.f54320a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            r rVar = this.f54321b;
            nVar.a();
            if (rVar.equals(nVar.f54321b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f54321b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f54321b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        r rVar = this.f54321b;
        rVar.a();
        sb2.append(!rVar.f54348b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
