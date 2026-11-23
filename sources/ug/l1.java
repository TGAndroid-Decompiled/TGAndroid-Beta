package ug;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class l1 extends FrameLayout {
    public float f58763a;
    public final k1 f58764b;
    public final ImageReceiver f58765c;
    public final ImageReceiver d;
    public boolean f58766e;
    public boolean f58767f;
    public float h;
    public float f58768n;
    public TLRPC.Document f58769r;
    public boolean f58770s;
    public final u0 f58771w;

    public l1(u0 u0Var, Context context) {
        super(context);
        this.f58771w = u0Var;
        this.f58767f = true;
        k1 k1Var = new k1(this, context);
        this.f58764b = k1Var;
        ImageReceiver imageReceiver = new ImageReceiver(k1Var);
        this.f58765c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(k1Var);
        this.d = imageReceiver2;
        imageReceiver.f22659u0 = false;
        imageReceiver2.f22659u0 = false;
        setClipChildren(false);
        addView(k1Var, na.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        float f10;
        boolean z13 = this.f58766e;
        k1 k1Var = this.f58764b;
        float f11 = 0.0f;
        if (z13 != z11) {
            this.f58766e = z11;
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
        if (this.f58767f != z10) {
            this.f58767f = z10;
            if (!z12) {
                if (z10) {
                    f11 = 1.0f;
                }
                this.f58768n = f11;
            }
            k1Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f58765c.P();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58765c.R();
        this.d.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = (int) (this.f58771w.f58799s3 * 0.6f);
        k1 k1Var = this.f58764b;
        ViewGroup.LayoutParams layoutParams = k1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = k1Var.getLayoutParams();
        int L = i11 - org.telegram.messenger.g0.L(16.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i11 * 0.7f), 1073741824));
    }
}
