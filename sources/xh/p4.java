package xh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class p4 implements Runnable {
    public final int f51681a;
    public final TLRPC.User f51682b;

    public p4(int i10, TLRPC.User user) {
        this.f51681a = i10;
        this.f51682b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f51681a;
        TLRPC.User user = this.f51682b;
        switch (i10) {
            case 0:
                tg.i0.d0(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                tg.i0.d0(new ArrayList(Arrays.asList(user)));
                return;
            default:
                tg.i0.d0(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
