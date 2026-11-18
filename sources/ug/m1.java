package ug;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class m1 extends FrameLayout {
    public float f58765a;
    public final l1 f58766b;
    public final ImageReceiver f58767c;
    public final ImageReceiver d;
    public boolean f58768e;
    public boolean f58769f;
    public float h;
    public float f58770n;
    public TLRPC.Document f58771r;
    public boolean f58772s;
    public final v0 f58773w;

    public m1(v0 v0Var, Context context) {
        super(context);
        this.f58773w = v0Var;
        this.f58769f = true;
        l1 l1Var = new l1(this, context);
        this.f58766b = l1Var;
        ImageReceiver imageReceiver = new ImageReceiver(l1Var);
        this.f58767c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(l1Var);
        this.d = imageReceiver2;
        imageReceiver.f22667u0 = false;
        imageReceiver2.f22667u0 = false;
        setClipChildren(false);
        addView(l1Var, ma.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        float f10;
        boolean z13 = this.f58768e;
        l1 l1Var = this.f58766b;
        float f11 = 0.0f;
        if (z13 != z11) {
            this.f58768e = z11;
            if (!z12) {
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.h = f10;
            }
            l1Var.invalidate();
        }
        if (this.f58769f != z10) {
            this.f58769f = z10;
            if (!z12) {
                if (z10) {
                    f11 = 1.0f;
                }
                this.f58770n = f11;
            }
            l1Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f58767c.P();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58767c.R();
        this.d.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = (int) (this.f58773w.f58796s3 * 0.6f);
        l1 l1Var = this.f58766b;
        ViewGroup.LayoutParams layoutParams = l1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = l1Var.getLayoutParams();
        int L = i11 - org.telegram.messenger.g0.L(16.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i11 * 0.7f), 1073741824));
    }
}
