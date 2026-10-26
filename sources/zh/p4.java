package zh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class p4 implements Runnable {
    public final int f53214a;
    public final TLRPC.User f53215b;

    public p4(int i10, TLRPC.User user) {
        this.f53214a = i10;
        this.f53215b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f53214a;
        TLRPC.User user = this.f53215b;
        switch (i10) {
            case 0:
                vg.j0.i0(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                vg.j0.i0(new ArrayList(Arrays.asList(user)));
                return;
            default:
                vg.j0.i0(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
