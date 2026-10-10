package xh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class q4 implements Runnable {
    public final int f51515a;
    public final TLRPC.User f51516b;

    public q4(int i10, TLRPC.User user) {
        this.f51515a = i10;
        this.f51516b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f51515a;
        TLRPC.User user = this.f51516b;
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
