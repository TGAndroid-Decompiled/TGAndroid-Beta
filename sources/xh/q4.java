package xh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class q4 implements Runnable {
    public final int f51469a;
    public final TLRPC.User f51470b;

    public q4(int i10, TLRPC.User user) {
        this.f51469a = i10;
        this.f51470b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f51469a;
        TLRPC.User user = this.f51470b;
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
