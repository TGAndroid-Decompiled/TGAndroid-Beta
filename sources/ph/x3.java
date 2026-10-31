package ph;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class x3 implements Runnable {
    public final int f45354a;
    public final TLRPC.User f45355b;

    public x3(int i10, TLRPC.User user) {
        this.f45354a = i10;
        this.f45355b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f45354a;
        TLRPC.User user = this.f45355b;
        switch (i10) {
            case 0:
                mg.f1.l1(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                mg.f1.l1(new ArrayList(Arrays.asList(user)));
                return;
            default:
                mg.f1.l1(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
