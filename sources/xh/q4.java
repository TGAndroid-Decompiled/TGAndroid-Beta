package xh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class q4 implements Runnable {
    public final int f46362a;
    public final TLRPC.User f46363b;

    public q4(int i10, TLRPC.User user) {
        this.f46362a = i10;
        this.f46363b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f46362a;
        TLRPC.User user = this.f46363b;
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
