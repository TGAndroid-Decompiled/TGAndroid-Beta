package xh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class p4 implements Runnable {
    public final int f46091a;
    public final TLRPC.User f46092b;

    public p4(int i10, TLRPC.User user) {
        this.f46091a = i10;
        this.f46092b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f46091a;
        TLRPC.User user = this.f46092b;
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
