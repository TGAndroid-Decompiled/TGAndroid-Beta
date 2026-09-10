package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q6 implements Utilities.Callback {
    public final int f48819a;
    public final r6 f48820b;

    public q6(r6 r6Var, int i10) {
        this.f48819a = i10;
        this.f48820b = r6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48819a) {
            case 0:
                r6.c(this.f48820b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                r6.b(this.f48820b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
