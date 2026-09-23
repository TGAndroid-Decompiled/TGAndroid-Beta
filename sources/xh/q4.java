package xh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class q4 implements Runnable {
    public final int f46033a;
    public final TLRPC.User f46034b;

    public q4(int i10, TLRPC.User user) {
        this.f46033a = i10;
        this.f46034b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f46033a;
        TLRPC.User user = this.f46034b;
        switch (i10) {
            case 0:
                tg.k0.c0(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                tg.k0.c0(new ArrayList(Arrays.asList(user)));
                return;
            default:
                tg.k0.c0(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
