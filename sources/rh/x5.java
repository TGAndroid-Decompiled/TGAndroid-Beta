package rh;

import j$.util.Objects;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
public final class x5 {
    public final long f47705a;
    public final int f47706b;

    public x5(long j10, int i10) {
        this.f47705a = j10;
        this.f47706b = i10;
    }

    public static x5 a(int i10, long j10) {
        return new x5(j10, i10);
    }

    public static x5 b(kj kjVar) {
        if (kjVar == null) {
            return null;
        }
        TLRPC.Message message = kjVar.f16690k;
        if (message != null && ((message.isThreadMessage || kjVar.k3()) && kjVar.f16690k.fwd_from != null)) {
            return new x5(kjVar.Z0(), kjVar.f16690k.fwd_from.saved_from_msg_id);
        }
        return new x5(kj.B0(kjVar.f16690k), kjVar.f1());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x5) {
            x5 x5Var = (x5) obj;
            if (x5Var.f47705a == this.f47705a && x5Var.f47706b == this.f47706b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47705a), Integer.valueOf(this.f47706b));
    }
}
