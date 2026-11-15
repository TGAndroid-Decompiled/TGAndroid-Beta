package ug;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class j1 extends FrameLayout {
    public float f58155a;
    public final i1 f58156b;
    public final ImageReceiver f58157c;
    public final ImageReceiver d;
    public boolean f58158e;
    public boolean f58159f;
    public float h;
    public float f58160n;
    public TLRPC.Document f58161r;
    public boolean f58162s;
    public final t0 f58163w;

    public j1(t0 t0Var, Context context) {
        super(context);
        this.f58163w = t0Var;
        this.f58159f = true;
        i1 i1Var = new i1(this, context);
        this.f58156b = i1Var;
        ImageReceiver imageReceiver = new ImageReceiver(i1Var);
        this.f58157c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(i1Var);
        this.d = imageReceiver2;
        imageReceiver.f22301u0 = false;
        imageReceiver2.f22301u0 = false;
        setClipChildren(false);
        addView(i1Var, ja.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        float f10;
        boolean z13 = this.f58158e;
        i1 i1Var = this.f58156b;
        float f11 = 0.0f;
        if (z13 != z11) {
            this.f58158e = z11;
            if (!z12) {
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.h = f10;
            }
            i1Var.invalidate();
        }
        if (this.f58159f != z10) {
            this.f58159f = z10;
            if (!z12) {
                if (z10) {
                    f11 = 1.0f;
                }
                this.f58160n = f11;
            }
            i1Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f58157c.P();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58157c.R();
        this.d.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = (int) (this.f58163w.f58190s3 * 0.6f);
        i1 i1Var = this.f58156b;
        ViewGroup.LayoutParams layoutParams = i1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = i1Var.getLayoutParams();
        int L = i11 - org.telegram.messenger.g0.L(16.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i11 * 0.7f), 1073741824));
    }
}
