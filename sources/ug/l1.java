package ug;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class l1 extends FrameLayout {
    public float f58794a;
    public final k1 f58795b;
    public final ImageReceiver f58796c;
    public final ImageReceiver d;
    public boolean f58797e;
    public boolean f58798f;
    public float h;
    public float f58799n;
    public TLRPC.Document f58800r;
    public boolean f58801s;
    public final u0 f58802w;

    public l1(u0 u0Var, Context context) {
        super(context);
        this.f58802w = u0Var;
        this.f58798f = true;
        k1 k1Var = new k1(this, context);
        this.f58795b = k1Var;
        ImageReceiver imageReceiver = new ImageReceiver(k1Var);
        this.f58796c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(k1Var);
        this.d = imageReceiver2;
        imageReceiver.f22692u0 = false;
        imageReceiver2.f22692u0 = false;
        setClipChildren(false);
        addView(k1Var, ma.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        float f10;
        boolean z13 = this.f58797e;
        k1 k1Var = this.f58795b;
        float f11 = 0.0f;
        if (z13 != z11) {
            this.f58797e = z11;
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
        if (this.f58798f != z10) {
            this.f58798f = z10;
            if (!z12) {
                if (z10) {
                    f11 = 1.0f;
                }
                this.f58799n = f11;
            }
            k1Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f58796c.P();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58796c.R();
        this.d.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = (int) (this.f58802w.f58830s3 * 0.6f);
        k1 k1Var = this.f58795b;
        ViewGroup.LayoutParams layoutParams = k1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = k1Var.getLayoutParams();
        int L = i11 - org.telegram.messenger.g0.L(16.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i11 * 0.7f), 1073741824));
    }
}
