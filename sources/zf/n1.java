package zf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class n1 extends FrameLayout {
    public float f50621a;
    public final m1 f50622b;
    public final ImageReceiver f50623c;
    public final ImageReceiver d;
    public boolean f50624e;
    public boolean f50625f;
    public float h;
    public float f50626n;
    public TLRPC.Document f50627r;
    public boolean f50628s;
    public final s0 v;

    public n1(s0 s0Var, Context context) {
        super(context);
        this.v = s0Var;
        this.f50625f = true;
        m1 m1Var = new m1(this, context);
        this.f50622b = m1Var;
        ImageReceiver imageReceiver = new ImageReceiver(m1Var);
        this.f50623c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(m1Var);
        this.d = imageReceiver2;
        imageReceiver.setAllowStartAnimation(false);
        imageReceiver2.setAllowStartAnimation(false);
        setClipChildren(false);
        addView(m1Var, e6.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        float f10;
        boolean z13 = this.f50624e;
        m1 m1Var = this.f50622b;
        float f11 = 0.0f;
        if (z13 != z11) {
            this.f50624e = z11;
            if (!z12) {
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.h = f10;
            }
            m1Var.invalidate();
        }
        if (this.f50625f != z10) {
            this.f50625f = z10;
            if (!z12) {
                if (z10) {
                    f11 = 1.0f;
                }
                this.f50626n = f11;
            }
            m1Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50623c.onAttachedToWindow();
        this.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50623c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11 = (int) (this.v.f50638g3 * 0.6f);
        m1 m1Var = this.f50622b;
        ViewGroup.LayoutParams layoutParams = m1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = m1Var.getLayoutParams();
        int dp = i11 - AndroidUtilities.dp(16.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i11 * 0.7f), 1073741824));
    }
}
