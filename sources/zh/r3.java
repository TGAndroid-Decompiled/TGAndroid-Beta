package zh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class r3 implements Runnable {
    public final int f60514a;
    public final TLRPC.User f60515b;

    public r3(int i7, TLRPC.User user) {
        this.f60514a = i7;
        this.f60515b = user;
    }

    @Override
    public final void run() {
        int i7 = this.f60514a;
        TLRPC.User user = this.f60515b;
        switch (i7) {
            case 0:
                wg.j0.l1(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                wg.j0.l1(new ArrayList(Arrays.asList(user)));
                return;
            default:
                wg.j0.l1(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
