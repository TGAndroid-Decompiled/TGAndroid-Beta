package ug;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class m1 extends FrameLayout {
    public float f58766a;
    public final l1 f58767b;
    public final ImageReceiver f58768c;
    public final ImageReceiver d;
    public boolean f58769e;
    public boolean f58770f;
    public float h;
    public float f58771n;
    public TLRPC.Document f58772r;
    public boolean f58773s;
    public final v0 f58774w;

    public m1(v0 v0Var, Context context) {
        super(context);
        this.f58774w = v0Var;
        this.f58770f = true;
        l1 l1Var = new l1(this, context);
        this.f58767b = l1Var;
        ImageReceiver imageReceiver = new ImageReceiver(l1Var);
        this.f58768c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(l1Var);
        this.d = imageReceiver2;
        imageReceiver.f22664u0 = false;
        imageReceiver2.f22664u0 = false;
        setClipChildren(false);
        addView(l1Var, ma.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        float f10;
        boolean z13 = this.f58769e;
        l1 l1Var = this.f58767b;
        float f11 = 0.0f;
        if (z13 != z11) {
            this.f58769e = z11;
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
        if (this.f58770f != z10) {
            this.f58770f = z10;
            if (!z12) {
                if (z10) {
                    f11 = 1.0f;
                }
                this.f58771n = f11;
            }
            l1Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f58768c.P();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58768c.R();
        this.d.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = (int) (this.f58774w.f58797s3 * 0.6f);
        l1 l1Var = this.f58767b;
        ViewGroup.LayoutParams layoutParams = l1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = l1Var.getLayoutParams();
        int L = i11 - org.telegram.messenger.g0.L(16.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i11 * 0.7f), 1073741824));
    }
}
