package p4;

import android.os.Bundle;
public final class n {
    public final Bundle f43070a;
    public s f43071b;

    public n(s sVar, boolean z10) {
        if (sVar != null) {
            Bundle bundle = new Bundle();
            this.f43070a = bundle;
            this.f43071b = sVar;
            bundle.putBundle("selector", sVar.f43100a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f43071b == null) {
            s b10 = s.b(this.f43070a.getBundle("selector"));
            this.f43071b = b10;
            if (b10 == null) {
                this.f43071b = s.f43099c;
            }
        }
    }

    public final boolean b() {
        return this.f43070a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            s sVar = this.f43071b;
            nVar.a();
            if (sVar.equals(nVar.f43071b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f43071b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f43071b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        s sVar = this.f43071b;
        sVar.a();
        sb2.append(!sVar.f43101b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
