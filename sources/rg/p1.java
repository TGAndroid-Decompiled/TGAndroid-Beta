package rg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import w7.z5;
public final class p1 extends FrameLayout {
    public float f46249a;
    public final o1 f46250b;
    public final ImageReceiver f46251c;
    public final ImageReceiver d;
    public boolean f46252e;
    public boolean f46253f;
    public float h;
    public float f46254n;
    public TLRPC.Document f46255r;
    public boolean f46256s;
    public final t0 v;

    public p1(t0 t0Var, Context context) {
        super(context);
        this.v = t0Var;
        this.f46253f = true;
        o1 o1Var = new o1(this, context);
        this.f46250b = o1Var;
        ImageReceiver imageReceiver = new ImageReceiver(o1Var);
        this.f46251c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(o1Var);
        this.d = imageReceiver2;
        imageReceiver.setAllowStartAnimation(false);
        imageReceiver2.setAllowStartAnimation(false);
        setClipChildren(false);
        addView(o1Var, z5.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        float f7;
        boolean z13 = this.f46252e;
        o1 o1Var = this.f46250b;
        float f10 = 0.0f;
        if (z13 != z11) {
            this.f46252e = z11;
            if (!z12) {
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.h = f7;
            }
            o1Var.invalidate();
        }
        if (this.f46253f != z10) {
            this.f46253f = z10;
            if (!z12) {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f46254n = f10;
            }
            o1Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46251c.onAttachedToWindow();
        this.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46251c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) (this.v.f46283r3 * 0.6f);
        o1 o1Var = this.f46250b;
        ViewGroup.LayoutParams layoutParams = o1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = o1Var.getLayoutParams();
        int dp = i12 - AndroidUtilities.dp(16.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i12 * 0.7f), 1073741824));
    }
}
