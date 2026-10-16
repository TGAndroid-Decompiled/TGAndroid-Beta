package yh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class o4 implements Runnable {
    public final int f49049a;
    public final TLRPC.User f49050b;

    public o4(int i10, TLRPC.User user) {
        this.f49049a = i10;
        this.f49050b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f49049a;
        TLRPC.User user = this.f49050b;
        switch (i10) {
            case 0:
                ug.j0.d0(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                ug.j0.d0(new ArrayList(Arrays.asList(user)));
                return;
            default:
                ug.j0.d0(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
