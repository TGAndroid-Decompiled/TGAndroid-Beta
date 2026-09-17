package yh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class o4 implements Runnable {
    public final int f50505a;
    public final TLRPC.User f50506b;

    public o4(int i10, TLRPC.User user) {
        this.f50505a = i10;
        this.f50506b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f50505a;
        TLRPC.User user = this.f50506b;
        switch (i10) {
            case 0:
                ug.k0.c0(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                ug.k0.c0(new ArrayList(Arrays.asList(user)));
                return;
            default:
                ug.k0.c0(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
