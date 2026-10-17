package yh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class p4 implements Runnable {
    public final int f50482a;
    public final TLRPC.User f50483b;

    public p4(int i10, TLRPC.User user) {
        this.f50482a = i10;
        this.f50483b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f50482a;
        TLRPC.User user = this.f50483b;
        switch (i10) {
            case 0:
                ug.h0.d0(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                ug.h0.d0(new ArrayList(Arrays.asList(user)));
                return;
            default:
                ug.h0.d0(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
