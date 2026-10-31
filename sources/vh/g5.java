package vh;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.yv0;
public final class g5 extends FrameLayout {
    public final int f51197a;
    public final org.telegram.ui.Components.r8 f51198b;
    public final org.telegram.ui.Components.g9 f51199c;
    public final TextView d;
    public ViewPropertyAnimator e;

    public g5(Activity activity, int i10) {
        super(activity);
        this.f51197a = i10;
        this.f51198b = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(activity);
        this.f51199c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(15.0f));
        addView(g9Var, w7.b6.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.b6.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.85f, -1));
        addView(textView2, w7.b6.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(org.telegram.messenger.i0.I2(cd.L0(2131748817, null), false, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(0.33f), 1.0f, 2131232240));
        set(null);
    }

    public final void a(boolean z10, boolean z11) {
        ViewPropertyAnimator viewPropertyAnimator = this.e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.e = null;
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            ViewPropertyAnimator animate = animate();
            if (z10) {
                f7 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f7).setInterpolator(gr.h).withEndAction(new yv0(13, this, z10)).setDuration(320L);
            this.e = duration;
            duration.start();
            return;
        }
        if (!z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f7 = 1.0f;
        }
        setAlpha(f7);
    }

    public void set(TLRPC.InputPeer inputPeer) {
        long n10;
        String str;
        int i10 = this.f51197a;
        if (inputPeer == null) {
            n10 = d20.i(i10).e();
        } else {
            n10 = org.telegram.messenger.o5.n(inputPeer);
        }
        int i11 = (n10 > 0L ? 1 : (n10 == 0L ? 0 : -1));
        TextView textView = this.d;
        org.telegram.ui.Components.g9 g9Var = this.f51199c;
        org.telegram.ui.Components.r8 r8Var = this.f51198b;
        if (i11 >= 0) {
            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(n10));
            r8Var.r(Z1);
            g9Var.e(Z1, r8Var);
            textView.setText(h20.p(Z1));
            return;
        }
        TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-n10));
        r8Var.q(L0);
        g9Var.e(L0, r8Var);
        if (L0 == null) {
            str = "";
        } else {
            str = L0.title;
        }
        textView.setText(str);
    }
}
