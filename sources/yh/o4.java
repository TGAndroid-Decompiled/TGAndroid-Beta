package yh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class o4 implements Runnable {
    public final int f50914a;
    public final TLRPC.User f50915b;

    public o4(int i10, TLRPC.User user) {
        this.f50914a = i10;
        this.f50915b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f50914a;
        TLRPC.User user = this.f50915b;
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
