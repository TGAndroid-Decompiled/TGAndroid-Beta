package vh;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.jc;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.ts;
public final class z0 extends ts {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final boolean Q = sc.e(8200);
    public final b1 R;

    public z0(b1 b1Var) {
        this.R = b1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.f5 f5Var, a1 a1Var, float f7) {
        if (f5Var != null) {
            f5Var.setAlpha((int) (f7 * 255.0f));
            f5Var.draw(canvas);
        } else if (a1Var.f50897f != null) {
            canvas.save();
            ImageReceiver imageReceiver = a1Var.f50897f;
            canvas.clipRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), a1Var.f50897f.A());
            a1Var.f50897f.setAlpha(f7);
            a1Var.f50897f.h(canvas, null);
            canvas.restore();
        }
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        boolean z10;
        if (this.O == null) {
            return;
        }
        boolean z11 = true;
        if (!this.R.b0() && this.O.size() > 4 && this.Q) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            for (int i12 = 0; i12 < this.O.size(); i12++) {
                if (((a1) this.O.get(i12)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z11 = z10;
        if (z11) {
            i(System.currentTimeMillis());
            d(canvas, f7);
            k();
            return;
        }
        super.a(canvas, j10, i10, i11, f7);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                a1 a1Var = (a1) arrayList.get(i10);
                a1Var.getClass();
                org.telegram.ui.Components.f5 f5Var = a1Var.d;
                if (f5Var != null) {
                    f5Var.setColorFilter(this.R.f50947o3);
                }
                a1Var.f50899r.h(canvas, a1Var.f50898n[this.K]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f7) {
        org.telegram.ui.Components.f5 f5Var;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            for (int i10 = 0; i10 < this.O.size(); i10++) {
                a1 a1Var = (a1) this.O.get(i10);
                a1Var.getClass();
                float scale = a1Var.getScale();
                float alpha = a1Var.getAlpha() * f7;
                Rect rect = org.telegram.messenger.i0.Q;
                rect.set(a1Var.getPaddingLeft() + ((int) a1Var.getX()), a1Var.getPaddingTop(), (a1Var.getWidth() + ((int) a1Var.getX())) - a1Var.getPaddingRight(), a1Var.getHeight() - a1Var.getPaddingBottom());
                org.telegram.ui.Components.f5 f5Var2 = a1Var.d;
                if (f5Var2 != null) {
                    f5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = a1Var.f50897f;
                if (imageReceiver != null) {
                    imageReceiver.z0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.R.f50947o3;
                if (porterDuffColorFilter != null && (f5Var = a1Var.d) != null) {
                    f5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, f5Var2, a1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, f5Var2, a1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                jc jcVar = ((a1) arrayList.get(i10)).f50898n[this.K];
                if (jcVar != null) {
                    jcVar.a();
                }
                i10++;
            } else {
                this.R.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r14) {
        throw new UnsupportedOperationException("Method not decompiled: vh.z0.i(long):void");
    }
}
