package th;

import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
public final class k6 implements q20 {
    public final int f49147a;
    public final l6 f49148b;

    public k6(l6 l6Var, int i10) {
        this.f49147a = i10;
        this.f49148b = l6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49147a) {
            case 0:
                l6.c(this.f49148b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                l6.b(this.f49148b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
