package rh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ms0;
import org.telegram.ui.ox0;
public final class u2 {
    public final v2 f47535a;
    public ox0 d;
    public int f47538f;
    public int f47539g;
    public float f47541j;
    public float f47542k;
    public final ArrayList f47536b = new ArrayList();
    public int f47537c = 0;
    public boolean e = false;
    public final float[] h = new float[16];
    public float[] f47540i = new float[16];
    public boolean f47543l = false;

    public u2(v2 v2Var) {
        this.f47535a = v2Var;
    }

    public final void a(int i10) {
        this.f47536b.add(new t2(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        ox0 ox0Var;
        boolean z10 = this.e;
        v2 v2Var = this.f47535a;
        if (!z10) {
            int i10 = this.f47537c;
            ArrayList arrayList = this.f47536b;
            if (i10 < arrayList.size()) {
                t2 t2Var = (t2) arrayList.get(this.f47537c);
                boolean z11 = true;
                this.f47537c++;
                int i11 = t2Var.f47503a;
                int i12 = t2Var.e;
                float f7 = t2Var.f47504b;
                int i13 = t2Var.d;
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
                                        v2Var.f47579f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f47543l = true;
                                View view = t2Var.f47507g;
                                ValueAnimator valueAnimator = v2Var.G;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    v2Var.G = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - v2Var.getX();
                                rectF.top = view.getY() - v2Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                org.telegram.messenger.i0.E2(view);
                                int childCount = v2Var.getChildCount();
                                v2Var.addView(view, w7.b6.e(64, 64, 17));
                                v2Var.f47583w.add(Integer.valueOf(i12));
                                v2Var.f47584x.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                v2Var.f47585y.put(Integer.valueOf(childCount), rectF);
                                v2Var.F = childCount;
                                v2Var.E = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                v2Var.G = ofFloat;
                                ofFloat.addUpdateListener(new qh.e0(v2Var, 3));
                                v2Var.G.addListener(new ms0(v2Var, 26));
                                v2Var.G.setDuration(i13 * 16);
                                v2Var.G.setInterpolator(gr.h);
                                v2Var.G.start();
                                return;
                            }
                            System.arraycopy(v2Var.f47578c, 0, this.h, 0, 16);
                            float f10 = t2Var.f47506f;
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
                            this.f47540i = fArr;
                            this.f47539g = i13;
                            this.f47538f = i13;
                            this.f47541j = v2Var.d;
                            this.f47542k = v2Var.e;
                            return;
                        }
                        this.f47538f = i13;
                        this.f47539g = i13;
                        return;
                    }
                    v2Var.d = (t2Var.f47505c * 0.01f) + v2Var.d;
                    v2Var.e = (f7 * 0.01f) + v2Var.e;
                    this.f47538f = 1;
                    this.f47539g = 1;
                    return;
                }
                Runnable runnable = t2Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        v2Var.H = null;
        if (!this.e && (ox0Var = this.d) != null) {
            ox0Var.run();
        }
    }

    public final void c(float f7, float f10) {
        this.f47536b.add(new t2(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        this.f47536b.add(new t2(6, f7, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(z2 z2Var, int i10, float f7) {
        this.f47536b.add(new t2(5, 0.0f, 0.0f, 32, i10, f7, z2Var, null));
    }
}
