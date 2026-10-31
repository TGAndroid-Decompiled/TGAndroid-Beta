package xh;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ay;
import org.telegram.ui.pb1;
public final class h1 implements q20 {
    public final pb1 f53778a;
    public final ay f53779b;
    public final long f53780c;
    public final int d;

    public h1(pb1 pb1Var, ay ayVar, long j10, int i10) {
        this.f53778a = pb1Var;
        this.f53779b = ayVar;
        this.f53780c = j10;
        this.d = i10;
    }

    @Override
    public final void a(Object obj) {
        String str;
        TLRPC.User user;
        int i10;
        Boolean bool = (Boolean) obj;
        pb1 pb1Var = this.f53778a;
        ay ayVar = this.f53779b;
        if (pb1Var != null) {
            pb1Var.finishFragment();
            ayVar.removeSelfFromStack();
        } else {
            ayVar.finishFragment();
        }
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        long j10 = this.f53780c;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i12 = this.d;
        if (i11 >= 0) {
            TLRPC.User Z1 = vp.r1(i12).Z1(Long.valueOf(j10));
            str = h20.k(Z1);
            user = Z1;
        } else {
            TLRPC.Chat L0 = vp.r1(i12).L0(Long.valueOf(-j10));
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
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.a0(null, null, i10, str));
        a02.getClass();
        a02.V(Arrays.asList(user), W2, null, null).k(false);
    }
}
