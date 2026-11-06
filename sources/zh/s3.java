package zh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class s3 implements Runnable {
    public final int f60435a;
    public final TLRPC.User f60436b;

    public s3(int i7, TLRPC.User user) {
        this.f60435a = i7;
        this.f60436b = user;
    }

    @Override
    public final void run() {
        int i7 = this.f60435a;
        TLRPC.User user = this.f60436b;
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
