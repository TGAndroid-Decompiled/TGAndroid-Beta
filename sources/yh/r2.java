package yh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class r2 {
    public final s2 f47696a;
    public k1 d;
    public int f47699f;
    public int f47700g;
    public float f47702j;
    public float f47703k;
    public final ArrayList f47697b = new ArrayList();
    public int f47698c = 0;
    public boolean e = false;
    public final float[] h = new float[16];
    public float[] f47701i = new float[16];
    public boolean f47704l = false;

    public r2(s2 s2Var) {
        this.f47696a = s2Var;
    }

    public final void a(int i10) {
        this.f47697b.add(new q2(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        k1 k1Var;
        boolean z10 = this.e;
        s2 s2Var = this.f47696a;
        if (!z10) {
            int i10 = this.f47698c;
            ArrayList arrayList = this.f47697b;
            if (i10 < arrayList.size()) {
                q2 q2Var = (q2) arrayList.get(this.f47698c);
                boolean z11 = true;
                this.f47698c++;
                int i11 = q2Var.f47651a;
                int i12 = q2Var.e;
                float f7 = q2Var.f47652b;
                int i13 = q2Var.d;
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
                                        s2Var.f47768f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f47704l = true;
                                View view = q2Var.f47655g;
                                ValueAnimator valueAnimator = s2Var.G;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    s2Var.G = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - s2Var.getX();
                                rectF.top = view.getY() - s2Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                AndroidUtilities.removeFromParent(view);
                                int childCount = s2Var.getChildCount();
                                s2Var.addView(view, w7.x5.e(64, 64, 17));
                                s2Var.v.add(Integer.valueOf(i12));
                                s2Var.f47772w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                s2Var.f47773x.put(Integer.valueOf(childCount), rectF);
                                s2Var.F = childCount;
                                s2Var.E = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                s2Var.G = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(s2Var, 22));
                                s2Var.G.addListener(new qg.n0(s2Var, 9));
                                s2Var.G.setDuration(i13 * 16);
                                s2Var.G.setInterpolator(qr.h);
                                s2Var.G.start();
                                return;
                            }
                            System.arraycopy(s2Var.f47767c, 0, this.h, 0, 16);
                            float f10 = q2Var.f47654f;
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
                            this.f47701i = fArr;
                            this.f47700g = i13;
                            this.f47699f = i13;
                            this.f47702j = s2Var.d;
                            this.f47703k = s2Var.e;
                            return;
                        }
                        this.f47699f = i13;
                        this.f47700g = i13;
                        return;
                    }
                    s2Var.d = (q2Var.f47653c * 0.01f) + s2Var.d;
                    s2Var.e = (f7 * 0.01f) + s2Var.e;
                    this.f47699f = 1;
                    this.f47700g = 1;
                    return;
                }
                Runnable runnable = q2Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        s2Var.H = null;
        if (!this.e && (k1Var = this.d) != null) {
            k1Var.run();
        }
    }

    public final void c(float f7, float f10) {
        this.f47697b.add(new q2(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        this.f47697b.add(new q2(6, f7, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(x2 x2Var, int i10, float f7) {
        this.f47697b.add(new q2(5, 0.0f, 0.0f, 32, i10, f7, x2Var, null));
    }
}
