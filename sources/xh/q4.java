package xh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class q4 implements Runnable {
    public final int f51592a;
    public final TLRPC.User f51593b;

    public q4(int i10, TLRPC.User user) {
        this.f51592a = i10;
        this.f51593b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f51592a;
        TLRPC.User user = this.f51593b;
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
