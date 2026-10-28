package zh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class p4 implements Runnable {
    public final int f53272a;
    public final TLRPC.User f53273b;

    public p4(int i10, TLRPC.User user) {
        this.f53272a = i10;
        this.f53273b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f53272a;
        TLRPC.User user = this.f53273b;
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
