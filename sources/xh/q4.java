package xh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class q4 implements Runnable {
    public final int f46361a;
    public final TLRPC.User f46362b;

    public q4(int i10, TLRPC.User user) {
        this.f46361a = i10;
        this.f46362b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f46361a;
        TLRPC.User user = this.f46362b;
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
