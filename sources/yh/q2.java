package yh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class q2 {
    public final r2 f47600a;
    public k1 d;
    public int f47603f;
    public int f47604g;
    public float f47606j;
    public float f47607k;
    public final ArrayList f47601b = new ArrayList();
    public int f47602c = 0;
    public boolean e = false;
    public final float[] h = new float[16];
    public float[] f47605i = new float[16];
    public boolean f47608l = false;

    public q2(r2 r2Var) {
        this.f47600a = r2Var;
    }

    public final void a(int i10) {
        this.f47601b.add(new p2(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        k1 k1Var;
        boolean z10 = this.e;
        r2 r2Var = this.f47600a;
        if (!z10) {
            int i10 = this.f47602c;
            ArrayList arrayList = this.f47601b;
            if (i10 < arrayList.size()) {
                p2 p2Var = (p2) arrayList.get(this.f47602c);
                boolean z11 = true;
                this.f47602c++;
                int i11 = p2Var.f47554a;
                int i12 = p2Var.e;
                float f7 = p2Var.f47555b;
                int i13 = p2Var.d;
                int c10 = m1.j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    if (c10 == 5) {
                                        if (f7 <= 0.0f) {
                                            z11 = false;
                                        }
                                        r2Var.f47654f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f47608l = true;
                                View view = p2Var.f47558g;
                                ValueAnimator valueAnimator = r2Var.G;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    r2Var.G = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - r2Var.getX();
                                rectF.top = view.getY() - r2Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                AndroidUtilities.removeFromParent(view);
                                int childCount = r2Var.getChildCount();
                                r2Var.addView(view, w7.x5.e(64, 64, 17));
                                r2Var.v.add(Integer.valueOf(i12));
                                r2Var.f47658w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                r2Var.f47659x.put(Integer.valueOf(childCount), rectF);
                                r2Var.F = childCount;
                                r2Var.E = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                r2Var.G = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(r2Var, 22));
                                r2Var.G.addListener(new qg.n0(r2Var, 9));
                                r2Var.G.setDuration(i13 * 16);
                                r2Var.G.setInterpolator(qr.h);
                                r2Var.G.start();
                                return;
                            }
                            System.arraycopy(r2Var.f47653c, 0, this.h, 0, 16);
                            float f10 = p2Var.f47557f;
                            float[] fArr = new float[16];
                            Matrix.setIdentityM(fArr, 0);
                            if (f10 != 0.0f) {
                                Matrix.rotateM(fArr, 0, -f10, 0.0f, 0.0f, 1.0f);
                            }
                            if (i12 != 0) {
                                if (i12 != 1) {
                                    if (i12 != 2) {
                                        if (i12 != 3) {
                                            if (i12 == 4) {
                                                Matrix.rotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
                                            }
                                        } else {
                                            Matrix.rotateM(fArr, 0, -90.0f, 1.0f, 0.0f, 0.0f);
                                        }
                                    } else {
                                        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
                                    }
                                } else {
                                    Matrix.rotateM(fArr, 0, -90.0f, 0.0f, 1.0f, 0.0f);
                                }
                            } else {
                                Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 1.0f, 0.0f);
                            }
                            this.f47605i = fArr;
                            this.f47604g = i13;
                            this.f47603f = i13;
                            this.f47606j = r2Var.d;
                            this.f47607k = r2Var.e;
                            return;
                        }
                        this.f47603f = i13;
                        this.f47604g = i13;
                        return;
                    }
                    r2Var.d = (p2Var.f47556c * 0.01f) + r2Var.d;
                    r2Var.e = (f7 * 0.01f) + r2Var.e;
                    this.f47603f = 1;
                    this.f47604g = 1;
                    return;
                }
                Runnable runnable = p2Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        r2Var.H = null;
        if (!this.e && (k1Var = this.d) != null) {
            k1Var.run();
        }
    }

    public final void c(float f7, float f10) {
        this.f47601b.add(new p2(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        this.f47601b.add(new p2(6, f7, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(w2 w2Var, int i10, float f7) {
        this.f47601b.add(new p2(5, 0.0f, 0.0f, 32, i10, f7, w2Var, null));
    }
}
