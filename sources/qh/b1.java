package qh;

import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.gt;
public final class b1 extends gt {
    public int J;
    public int K;
    public ArrayList L;
    public final ArrayList M = new ArrayList();
    public final boolean N = LiteMode.isEnabled(8200);
    public final d1 O;

    public b1(d1 d1Var) {
        this.O = d1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.l5 l5Var, c1 c1Var, float f10) {
        if (l5Var != null) {
            l5Var.setAlpha((int) (f10 * 255.0f));
            l5Var.draw(canvas);
        } else if (c1Var.f45142e != null) {
            canvas.save();
            canvas.clipRect(c1Var.f45142e.getImageX(), c1Var.f45142e.getImageY(), c1Var.f45142e.getImageX2(), c1Var.f45142e.getImageY2());
            c1Var.f45142e.setAlpha(f10);
            c1Var.f45142e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        boolean z4;
        if (this.L == null) {
            return;
        }
        f2.u0 u0Var = this.O.W;
        boolean z10 = true;
        if ((u0Var == null || !u0Var.k()) && this.L.size() > 4 && this.N) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            for (int i12 = 0; i12 < this.L.size(); i12++) {
                if (((c1) this.L.get(i12)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z4;
        if (z10) {
            i(System.currentTimeMillis());
            d(canvas, f10);
            k();
            return;
        }
        super.a(canvas, j10, i10, i11, f10);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 < arrayList.size()) {
                c1 c1Var = (c1) arrayList.get(i10);
                c1Var.getClass();
                org.telegram.ui.Components.l5 l5Var = c1Var.f45141c;
                if (l5Var != null) {
                    l5Var.setColorFilter(this.O.f45220e3);
                }
                c1Var.f45144n.draw(canvas, c1Var.h[this.H]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        org.telegram.ui.Components.l5 l5Var;
        if (this.L != null) {
            canvas.save();
            canvas.translate(-this.K, 0.0f);
            for (int i10 = 0; i10 < this.L.size(); i10++) {
                c1 c1Var = (c1) this.L.get(i10);
                c1Var.getClass();
                float scale = c1Var.getScale();
                float alpha = c1Var.getAlpha() * f10;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(c1Var.getPaddingLeft() + ((int) c1Var.getX()), c1Var.getPaddingTop(), (c1Var.getWidth() + ((int) c1Var.getX())) - c1Var.getPaddingRight(), c1Var.getHeight() - c1Var.getPaddingBottom());
                org.telegram.ui.Components.l5 l5Var2 = c1Var.f45141c;
                if (l5Var2 != null) {
                    l5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = c1Var.f45142e;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.O.f45220e3;
                if (porterDuffColorFilter != null && (l5Var = c1Var.f45141c) != null) {
                    l5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, l5Var2, c1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, l5Var2, c1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((c1) arrayList.get(i10)).h[this.H];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.O.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r14) {
        throw new UnsupportedOperationException("Method not decompiled: qh.b1.i(long):void");
    }
}
