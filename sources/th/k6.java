package th;

import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
public final class k6 implements r20 {
    public final int f49161a;
    public final l6 f49162b;

    public k6(l6 l6Var, int i10) {
        this.f49161a = i10;
        this.f49162b = l6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49161a) {
            case 0:
                l6.c(this.f49162b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                l6.b(this.f49162b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
