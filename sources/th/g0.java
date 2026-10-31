package th;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
public final class g0 extends FrameLayout {
    public final d0 f48982a;
    public final g9 f48983b;
    public final r8 f48984c;
    public final ImageView d;
    public final e0 e;
    public i0 f48985f;

    public g0(Context context) {
        super(context);
        w7.e6.a(this);
        d0 d0Var = new d0(this, context);
        this.f48982a = d0Var;
        d0Var.setOrientation(0);
        addView(d0Var, w7.b6.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.f48984c = new r8((org.telegram.ui.ActionBar.p6) null);
        g9 g9Var = new g9(context);
        this.f48983b = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(11.0f));
        d0Var.addView(g9Var, w7.b6.q(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        d0Var.addView(imageView, w7.b6.t(18, 18, 19, 0, 0, 3, 0));
        e0 e0Var = new e0(context);
        this.e = e0Var;
        e0Var.setLines(1);
        e0Var.setSingleLine();
        e0Var.setTextColor(-1);
        e0Var.setTextSize(1, 14.0f);
        e0Var.setTypeface(org.telegram.messenger.i0.o());
        d0Var.addView(e0Var, w7.b6.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(i0 i0Var) {
        this.f48985f = i0Var;
        int i10 = (i0Var.f49052b > 0L ? 1 : (i0Var.f49052b == 0L ? 0 : -1));
        g9 g9Var = this.f48983b;
        r8 r8Var = this.f48984c;
        if (i10 >= 0) {
            TLRPC.User Z1 = vp.r1(d20.f15147s0).Z1(Long.valueOf(i0Var.f49052b));
            r8Var.r(Z1);
            g9Var.e(Z1, r8Var);
        } else {
            TLRPC.Chat L0 = vp.r1(d20.f15147s0).L0(Long.valueOf(-i0Var.f49052b));
            r8Var.q(L0);
            g9Var.e(L0, r8Var);
        }
        int i11 = i0Var.e;
        ImageView imageView = this.d;
        if (i11 > 0) {
            imageView.setImageDrawable(new fq(getContext(), i0Var.e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e.setText(org.telegram.messenger.o5.l(d20.f15147s0, i0Var.f49052b));
        this.f48982a.invalidate();
    }
}
