package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wr;
import org.telegram.ui.iw0;
import org.telegram.ui.zp0;
public final class o1 extends m0 {
    public final u7 f48734h0;
    public final a3 f48735i0;

    public o1(a3 a3Var, Context context, u7 u7Var, j7 j7Var, View view, FrameLayout frameLayout, u7 u7Var2) {
        super(context, u7Var, j7Var, view, frameLayout);
        this.f48735i0 = a3Var;
        this.f48734h0 = u7Var2;
    }

    @Override
    public final TLRPC.Peer getDefaultSendAs() {
        t0 t0Var = this.f48734h0.A0;
        if (t0Var != null) {
            return t0Var.i();
        }
        return null;
    }

    @Override
    public final void h(long j3) {
        e1 e1Var = this.f48735i0.Y1;
        if (e1Var != null) {
            ArrayList arrayList = e1Var.h;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((d1) arrayList.get(i10)).f48338a == j3) {
                    ((d1) arrayList.get(i10)).h = true;
                }
            }
        }
    }

    @Override
    public final void i(int i10, int i11, long j3) {
        boolean z10;
        e1 e1Var = this.f48735i0.Y1;
        if (e1Var == null) {
            return;
        }
        int i12 = e1Var.f48361a;
        ArrayList arrayList = e1Var.h;
        if (arrayList.size() < 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        arrayList.add(new d1(e1Var, e1Var, i12, j3, i11, z10));
        e1Var.invalidate();
    }

    @Override
    public final void j() {
        boolean z10;
        a3 a3Var = this.f48735i0;
        a3Var.Z1.setCount((int) getStarsCount());
        f1 f1Var = a3Var.Z1;
        if (this.W != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f1Var.setFilled(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11) {
        float f7;
        if (!z11 || this.f48670f0 != z10) {
            this.f48670f0 = z10;
            ValueAnimator valueAnimator = this.f48668e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f48668e0 = null;
            }
            zp0 zp0Var = this.f48665c;
            zp0Var.invalidate();
            float f10 = 1.0f;
            if (z11) {
                float alpha = zp0Var.getAlpha();
                if (z10) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                this.f48668e0 = ofFloat;
                ofFloat.addUpdateListener(new qg.o(this, 17));
                this.f48668e0.addListener(new iw0(15, this, z10));
                this.f48668e0.setDuration(420L);
                this.f48668e0.setInterpolator(wr.h);
                this.f48668e0.start();
            } else {
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 0.5f;
                }
                this.f48661a.setAlpha(f7);
                if (z10) {
                    f10 = 0.0f;
                }
                zp0Var.setAlpha(f10);
            }
            invalidate();
        }
        a aVar = this.f48735i0.X1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f48735i0.M0.setVisibility(i10);
    }
}
