package yh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class o4 implements Runnable {
    public final int f50447a;
    public final TLRPC.User f50448b;

    public o4(int i10, TLRPC.User user) {
        this.f50447a = i10;
        this.f50448b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f50447a;
        TLRPC.User user = this.f50448b;
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
