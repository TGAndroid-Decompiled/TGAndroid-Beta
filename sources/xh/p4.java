package xh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class p4 implements Runnable {
    public final int f51689a;
    public final TLRPC.User f51690b;

    public p4(int i10, TLRPC.User user) {
        this.f51689a = i10;
        this.f51690b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f51689a;
        TLRPC.User user = this.f51690b;
        switch (i10) {
            case 0:
                tg.j0.d0(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                tg.j0.d0(new ArrayList(Arrays.asList(user)));
                return;
            default:
                tg.j0.d0(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
