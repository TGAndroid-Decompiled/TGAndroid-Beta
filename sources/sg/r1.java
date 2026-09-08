package sg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import w7.x5;
public final class r1 extends FrameLayout {
    public float f46274a;
    public final q1 f46275b;
    public final ImageReceiver f46276c;
    public final ImageReceiver d;
    public boolean f46277e;
    public boolean f46278f;
    public float h;
    public float f46279n;
    public TLRPC.Document f46280r;
    public boolean f46281s;
    public final u0 v;

    public r1(u0 u0Var, Context context) {
        super(context);
        this.v = u0Var;
        this.f46278f = true;
        q1 q1Var = new q1(this, context);
        this.f46275b = q1Var;
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        this.f46276c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(q1Var);
        this.d = imageReceiver2;
        imageReceiver.setAllowStartAnimation(false);
        imageReceiver2.setAllowStartAnimation(false);
        setClipChildren(false);
        addView(q1Var, x5.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        float f7;
        boolean z13 = this.f46277e;
        q1 q1Var = this.f46275b;
        float f10 = 0.0f;
        if (z13 != z11) {
            this.f46277e = z11;
            if (!z12) {
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.h = f7;
            }
            q1Var.invalidate();
        }
        if (this.f46278f != z10) {
            this.f46278f = z10;
            if (!z12) {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f46279n = f10;
            }
            q1Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46276c.onAttachedToWindow();
        this.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46276c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) (this.v.f46304k3 * 0.6f);
        q1 q1Var = this.f46275b;
        ViewGroup.LayoutParams layoutParams = q1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = q1Var.getLayoutParams();
        int dp = i12 - AndroidUtilities.dp(16.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i12 * 0.7f), 1073741824));
    }
}
