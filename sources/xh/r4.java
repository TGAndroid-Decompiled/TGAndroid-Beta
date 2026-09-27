package xh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class r4 implements Runnable {
    public final int f46456a;
    public final TLRPC.User f46457b;

    public r4(int i10, TLRPC.User user) {
        this.f46456a = i10;
        this.f46457b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f46456a;
        TLRPC.User user = this.f46457b;
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
