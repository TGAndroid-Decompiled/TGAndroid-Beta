package rg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import w7.x5;
public final class o1 extends FrameLayout {
    public float f47412a;
    public final n1 f47413b;
    public final ImageReceiver f47414c;
    public final ImageReceiver d;
    public boolean f47415e;
    public boolean f47416f;
    public float h;
    public float f47417n;
    public TLRPC.Document f47418r;
    public boolean f47419s;
    public final s0 v;

    public o1(s0 s0Var, Context context) {
        super(context);
        this.v = s0Var;
        this.f47416f = true;
        n1 n1Var = new n1(this, context);
        this.f47413b = n1Var;
        ImageReceiver imageReceiver = new ImageReceiver(n1Var);
        this.f47414c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(n1Var);
        this.d = imageReceiver2;
        imageReceiver.setAllowStartAnimation(false);
        imageReceiver2.setAllowStartAnimation(false);
        setClipChildren(false);
        addView(n1Var, x5.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        float f7;
        boolean z13 = this.f47415e;
        n1 n1Var = this.f47413b;
        float f10 = 0.0f;
        if (z13 != z11) {
            this.f47415e = z11;
            if (!z12) {
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.h = f7;
            }
            n1Var.invalidate();
        }
        if (this.f47416f != z10) {
            this.f47416f = z10;
            if (!z12) {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f47417n = f10;
            }
            n1Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47414c.onAttachedToWindow();
        this.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47414c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) (this.v.f47442i3 * 0.6f);
        n1 n1Var = this.f47413b;
        ViewGroup.LayoutParams layoutParams = n1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = n1Var.getLayoutParams();
        int dp = i12 - AndroidUtilities.dp(16.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i12 * 0.7f), 1073741824));
    }
}
