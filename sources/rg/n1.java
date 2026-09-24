package rg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import w7.y5;
public final class n1 extends FrameLayout {
    public float f42664a;
    public final m1 f42665b;
    public final ImageReceiver f42666c;
    public final ImageReceiver d;
    public boolean e;
    public boolean f42667f;
    public float h;
    public float f42668n;
    public TLRPC.Document f42669r;
    public boolean f42670s;
    public final s0 v;

    public n1(s0 s0Var, Context context) {
        super(context);
        this.v = s0Var;
        this.f42667f = true;
        m1 m1Var = new m1(this, context);
        this.f42665b = m1Var;
        ImageReceiver imageReceiver = new ImageReceiver(m1Var);
        this.f42666c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(m1Var);
        this.d = imageReceiver2;
        imageReceiver.setAllowStartAnimation(false);
        imageReceiver2.setAllowStartAnimation(false);
        setClipChildren(false);
        addView(m1Var, y5.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        float f7;
        boolean z13 = this.e;
        m1 m1Var = this.f42665b;
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
            m1Var.invalidate();
        }
        if (this.f42667f != z10) {
            this.f42667f = z10;
            if (!z12) {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f42668n = f10;
            }
            m1Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42666c.onAttachedToWindow();
        this.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42666c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) (this.v.f42684k3 * 0.6f);
        m1 m1Var = this.f42665b;
        ViewGroup.LayoutParams layoutParams = m1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = m1Var.getLayoutParams();
        int dp = i12 - AndroidUtilities.dp(16.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i12 * 0.7f), 1073741824));
    }
}
