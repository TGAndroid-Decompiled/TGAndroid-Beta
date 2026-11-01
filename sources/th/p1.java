package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.mb0;
public final class p1 extends j0 {
    public final o7 f49367h0;
    public final z2 f49368i0;

    public p1(z2 z2Var, Context context, o7 o7Var, d7 d7Var, View view, FrameLayout frameLayout, o7 o7Var2) {
        super(context, o7Var, d7Var, view, frameLayout);
        this.f49368i0 = z2Var;
        this.f49367h0 = o7Var2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        s0 s0Var = this.f49367h0.A0;
        if (s0Var != null) {
            return s0Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j10) {
        d1 d1Var = this.f49368i0.H1;
        if (d1Var != null) {
            ArrayList arrayList = d1Var.h;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((c1) arrayList.get(i10)).f48836a == j10) {
                    ((c1) arrayList.get(i10)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i10, int i11, long j10) {
        boolean z10;
        d1 d1Var = this.f49368i0.H1;
        if (d1Var == null) {
            return;
        }
        int i12 = d1Var.f48879a;
        ArrayList arrayList = d1Var.h;
        if (arrayList.size() < 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        arrayList.add(new c1(d1Var, d1Var, i12, j10, i11, z10));
        d1Var.invalidate();
    }

    @Override
    public final void j() {
        boolean z10;
        z2 z2Var = this.f49368i0;
        z2Var.I1.setCount((int) getStarsCount());
        e1 e1Var = z2Var.I1;
        if (this.W != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e1Var.setFilled(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11) {
        float f7;
        if (!z11 || this.f49102f0 != z10) {
            this.f49102f0 = z10;
            ValueAnimator valueAnimator = this.f49100e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f49100e0 = null;
            }
            mb0 mb0Var = this.f49097c;
            mb0Var.invalidate();
            float f10 = 1.0f;
            if (z11) {
                float alpha = mb0Var.getAlpha();
                if (z10) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                this.f49100e0 = ofFloat;
                ofFloat.addUpdateListener(new qh.e0(this, 12));
                this.f49100e0.addListener(new sg.y(2, this, z10));
                this.f49100e0.setDuration(420L);
                this.f49100e0.setInterpolator(gr.h);
                this.f49100e0.start();
            } else {
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 0.5f;
                }
                this.f49093a.setAlpha(f7);
                if (z10) {
                    f10 = 0.0f;
                }
                mb0Var.setAlpha(f10);
            }
            invalidate();
        }
        a aVar = this.f49368i0.G1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f49368i0.f49781v0.setVisibility(i10);
    }
}
