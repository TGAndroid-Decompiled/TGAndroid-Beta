package xh;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nb1;
import org.telegram.ui.zx;
public final class h1 implements r20 {
    public final nb1 f53799a;
    public final zx f53800b;
    public final long f53801c;
    public final int d;

    public h1(nb1 nb1Var, zx zxVar, long j10, int i10) {
        this.f53799a = nb1Var;
        this.f53800b = zxVar;
        this.f53801c = j10;
        this.d = i10;
    }

    @Override
    public final void a(Object obj) {
        String str;
        TLRPC.User user;
        int i10;
        Boolean bool = (Boolean) obj;
        nb1 nb1Var = this.f53799a;
        zx zxVar = this.f53800b;
        if (nb1Var != null) {
            nb1Var.finishFragment();
            zxVar.removeSelfFromStack();
        } else {
            zxVar.finishFragment();
        }
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        long j10 = this.f53801c;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i12 = this.d;
        if (i11 >= 0) {
            TLRPC.User Z1 = wp.r1(i12).Z1(Long.valueOf(j10));
            str = i20.k(Z1);
            user = Z1;
        } else {
            TLRPC.Chat L0 = wp.r1(i12).L0(Long.valueOf(-j10));
            if (L0 == null) {
                str = "";
                user = L0;
            } else {
                str = L0.title;
                user = L0;
            }
        }
        cc a02 = cc.a0(T);
        if (bool.booleanValue()) {
            i10 = 2131752988;
        } else {
            i10 = 2131752987;
        }
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(dd.a0(null, null, i10, str));
        a02.getClass();
        a02.V(Arrays.asList(user), W2, null, null).k(false);
    }
}
