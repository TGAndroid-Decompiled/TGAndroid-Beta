package ph;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class x3 implements Runnable {
    public final int f45365a;
    public final TLRPC.User f45366b;

    public x3(int i10, TLRPC.User user) {
        this.f45365a = i10;
        this.f45366b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f45365a;
        TLRPC.User user = this.f45366b;
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
