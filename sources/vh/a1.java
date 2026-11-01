package vh;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.kc;
import org.telegram.messenger.tc;
import org.telegram.ui.Components.ts;
public final class a1 extends ts {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final boolean Q = tc.e(8200);
    public final c1 R;

    public a1(c1 c1Var) {
        this.R = c1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.f5 f5Var, b1 b1Var, float f7) {
        if (f5Var != null) {
            f5Var.setAlpha((int) (f7 * 255.0f));
            f5Var.draw(canvas);
        } else if (b1Var.f50950f != null) {
            canvas.save();
            ImageReceiver imageReceiver = b1Var.f50950f;
            canvas.clipRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), b1Var.f50950f.A());
            b1Var.f50950f.setAlpha(f7);
            b1Var.f50950f.h(canvas, null);
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
                if (((b1) this.O.get(i12)).getScale() != 1.0f) {
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
                b1 b1Var = (b1) arrayList.get(i10);
                b1Var.getClass();
                org.telegram.ui.Components.f5 f5Var = b1Var.d;
                if (f5Var != null) {
                    f5Var.setColorFilter(this.R.f51042o3);
                }
                b1Var.f50952r.h(canvas, b1Var.f50951n[this.K]);
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
                b1 b1Var = (b1) this.O.get(i10);
                b1Var.getClass();
                float scale = b1Var.getScale();
                float alpha = b1Var.getAlpha() * f7;
                Rect rect = org.telegram.messenger.i0.Q;
                rect.set(b1Var.getPaddingLeft() + ((int) b1Var.getX()), b1Var.getPaddingTop(), (b1Var.getWidth() + ((int) b1Var.getX())) - b1Var.getPaddingRight(), b1Var.getHeight() - b1Var.getPaddingBottom());
                org.telegram.ui.Components.f5 f5Var2 = b1Var.d;
                if (f5Var2 != null) {
                    f5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = b1Var.f50950f;
                if (imageReceiver != null) {
                    imageReceiver.z0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.R.f51042o3;
                if (porterDuffColorFilter != null && (f5Var = b1Var.d) != null) {
                    f5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, f5Var2, b1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, f5Var2, b1Var, alpha);
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
                kc kcVar = ((b1) arrayList.get(i10)).f50951n[this.K];
                if (kcVar != null) {
                    kcVar.a();
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
        throw new UnsupportedOperationException("Method not decompiled: vh.a1.i(long):void");
    }
}
