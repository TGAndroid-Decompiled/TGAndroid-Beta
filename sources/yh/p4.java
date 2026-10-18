package yh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class p4 implements Runnable {
    public final int f50507a;
    public final TLRPC.User f50508b;

    public p4(int i10, TLRPC.User user) {
        this.f50507a = i10;
        this.f50508b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f50507a;
        TLRPC.User user = this.f50508b;
        switch (i10) {
            case 0:
                ug.i0.d0(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                ug.i0.d0(new ArrayList(Arrays.asList(user)));
                return;
            default:
                ug.i0.d0(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
