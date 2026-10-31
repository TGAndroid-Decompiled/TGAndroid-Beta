package rh;

import j$.util.Objects;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
public final class x5 {
    public final long f47691a;
    public final int f47692b;

    public x5(long j10, int i10) {
        this.f47691a = j10;
        this.f47692b = i10;
    }

    public static x5 a(int i10, long j10) {
        return new x5(j10, i10);
    }

    public static x5 b(jj jjVar) {
        if (jjVar == null) {
            return null;
        }
        TLRPC.Message message = jjVar.f16337k;
        if (message != null && ((message.isThreadMessage || jjVar.k3()) && jjVar.f16337k.fwd_from != null)) {
            return new x5(jjVar.Z0(), jjVar.f16337k.fwd_from.saved_from_msg_id);
        }
        return new x5(jj.B0(jjVar.f16337k), jjVar.f1());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x5) {
            x5 x5Var = (x5) obj;
            if (x5Var.f47691a == this.f47691a && x5Var.f47692b == this.f47692b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47691a), Integer.valueOf(this.f47692b));
    }
}
