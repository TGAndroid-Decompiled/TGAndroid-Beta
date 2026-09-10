package wh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class p4 implements Runnable {
    public final int f44308a;
    public final TLRPC.User f44309b;

    public p4(int i10, TLRPC.User user) {
        this.f44308a = i10;
        this.f44309b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f44308a;
        TLRPC.User user = this.f44309b;
        switch (i10) {
            case 0:
                sg.k0.c0(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                sg.k0.c0(new ArrayList(Arrays.asList(user)));
                return;
            default:
                sg.k0.c0(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
