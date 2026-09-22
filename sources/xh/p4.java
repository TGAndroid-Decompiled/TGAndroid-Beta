package xh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class p4 implements Runnable {
    public final int f46064a;
    public final TLRPC.User f46065b;

    public p4(int i10, TLRPC.User user) {
        this.f46064a = i10;
        this.f46065b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f46064a;
        TLRPC.User user = this.f46065b;
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
