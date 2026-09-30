package xh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class q4 implements Runnable {
    public final int f46363a;
    public final TLRPC.User f46364b;

    public q4(int i10, TLRPC.User user) {
        this.f46363a = i10;
        this.f46364b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f46363a;
        TLRPC.User user = this.f46364b;
        switch (i10) {
            case 0:
                tg.j0.c0(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                tg.j0.c0(new ArrayList(Arrays.asList(user)));
                return;
            default:
                tg.j0.c0(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
