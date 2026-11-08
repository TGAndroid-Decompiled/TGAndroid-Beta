package ug;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class i1 extends FrameLayout {
    public float f56629a;
    public final h1 f56630b;
    public final ImageReceiver f56631c;
    public final ImageReceiver d;
    public boolean f56632e;
    public boolean f56633f;
    public float h;
    public float f56634n;
    public TLRPC.Document f56635r;
    public boolean f56636s;
    public final s0 f56637w;

    public i1(s0 s0Var, Context context) {
        super(context);
        this.f56637w = s0Var;
        this.f56633f = true;
        h1 h1Var = new h1(this, context);
        this.f56630b = h1Var;
        ImageReceiver imageReceiver = new ImageReceiver(h1Var);
        this.f56631c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(h1Var);
        this.d = imageReceiver2;
        imageReceiver.f21220t0 = false;
        imageReceiver2.f21220t0 = false;
        setClipChildren(false);
        addView(h1Var, ha.e(-1, -2, 21));
    }

    public final void a(boolean z9, boolean z10, boolean z11) {
        float f10;
        boolean z12 = this.f56632e;
        h1 h1Var = this.f56630b;
        float f11 = 0.0f;
        if (z12 != z10) {
            this.f56632e = z10;
            if (!z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.h = f10;
            }
            h1Var.invalidate();
        }
        if (this.f56633f != z9) {
            this.f56633f = z9;
            if (!z11) {
                if (z9) {
                    f11 = 1.0f;
                }
                this.f56634n = f11;
            }
            h1Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f56631c.P();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f56631c.R();
        this.d.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = (int) (this.f56637w.f56659r3 * 0.6f);
        h1 h1Var = this.f56630b;
        ViewGroup.LayoutParams layoutParams = h1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = h1Var.getLayoutParams();
        int L = i11 - org.telegram.messenger.g0.L(16.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i11 * 0.7f), 1073741824));
    }
}
