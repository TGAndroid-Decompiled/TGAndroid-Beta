package vg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class l1 extends FrameLayout {
    public float f56702a;
    public final k1 f56703b;
    public final ImageReceiver f56704c;
    public final ImageReceiver d;
    public boolean f56705e;
    public boolean f56706f;
    public float h;
    public float f56707n;
    public TLRPC.Document f56708r;
    public boolean f56709s;
    public final r0 f56710w;

    public l1(r0 r0Var, Context context) {
        super(context);
        this.f56710w = r0Var;
        this.f56706f = true;
        k1 k1Var = new k1(this, context);
        this.f56703b = k1Var;
        ImageReceiver imageReceiver = new ImageReceiver(k1Var);
        this.f56704c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(k1Var);
        this.d = imageReceiver2;
        imageReceiver.f21272u0 = false;
        imageReceiver2.f21272u0 = false;
        setClipChildren(false);
        addView(k1Var, mf.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        float f10;
        boolean z13 = this.f56705e;
        k1 k1Var = this.f56703b;
        float f11 = 0.0f;
        if (z13 != z11) {
            this.f56705e = z11;
            if (!z12) {
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.h = f10;
            }
            k1Var.invalidate();
        }
        if (this.f56706f != z10) {
            this.f56706f = z10;
            if (!z12) {
                if (z10) {
                    f11 = 1.0f;
                }
                this.f56707n = f11;
            }
            k1Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f56704c.P();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f56704c.R();
        this.d.R();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11 = (int) (this.f56710w.f56736s3 * 0.6f);
        k1 k1Var = this.f56703b;
        ViewGroup.LayoutParams layoutParams = k1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = k1Var.getLayoutParams();
        int L = i11 - org.telegram.messenger.g0.L(16.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i11 * 0.7f), 1073741824));
    }
}
