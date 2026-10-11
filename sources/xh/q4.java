package xh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class q4 implements Runnable {
    public final int f51558a;
    public final TLRPC.User f51559b;

    public q4(int i10, TLRPC.User user) {
        this.f51558a = i10;
        this.f51559b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f51558a;
        TLRPC.User user = this.f51559b;
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
