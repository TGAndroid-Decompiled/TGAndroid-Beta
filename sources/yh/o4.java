package yh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class o4 implements Runnable {
    public final int f50913a;
    public final TLRPC.User f50914b;

    public o4(int i10, TLRPC.User user) {
        this.f50913a = i10;
        this.f50914b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f50913a;
        TLRPC.User user = this.f50914b;
        switch (i10) {
            case 0:
                ug.h0.i0(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                ug.h0.i0(new ArrayList(Arrays.asList(user)));
                return;
            default:
                ug.h0.i0(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
