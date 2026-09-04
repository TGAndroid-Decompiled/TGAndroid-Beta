package yh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class o4 implements Runnable {
    public final int f50475a;
    public final TLRPC.User f50476b;

    public o4(int i10, TLRPC.User user) {
        this.f50475a = i10;
        this.f50476b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f50475a;
        TLRPC.User user = this.f50476b;
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
