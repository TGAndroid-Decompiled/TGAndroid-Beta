package qg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import w7.a6;
public final class p1 extends FrameLayout {
    public float f40856a;
    public final o1 f40857b;
    public final ImageReceiver f40858c;
    public final ImageReceiver d;
    public boolean e;
    public boolean f40859f;
    public float h;
    public float f40860n;
    public TLRPC.Document f40861r;
    public boolean f40862s;
    public final v0 v;

    public p1(v0 v0Var, Context context) {
        super(context);
        this.v = v0Var;
        this.f40859f = true;
        o1 o1Var = new o1(this, context);
        this.f40857b = o1Var;
        ImageReceiver imageReceiver = new ImageReceiver(o1Var);
        this.f40858c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(o1Var);
        this.d = imageReceiver2;
        imageReceiver.setAllowStartAnimation(false);
        imageReceiver2.setAllowStartAnimation(false);
        setClipChildren(false);
        addView(o1Var, a6.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        float f7;
        boolean z13 = this.e;
        o1 o1Var = this.f40857b;
        float f10 = 0.0f;
        if (z13 != z11) {
            this.e = z11;
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
        if (this.f40859f != z10) {
            this.f40859f = z10;
            if (!z12) {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f40860n = f10;
            }
            o1Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40858c.onAttachedToWindow();
        this.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40858c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) (this.v.f40877k3 * 0.6f);
        o1 o1Var = this.f40857b;
        ViewGroup.LayoutParams layoutParams = o1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = o1Var.getLayoutParams();
        int dp = i12 - AndroidUtilities.dp(16.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i12 * 0.7f), 1073741824));
    }
}
