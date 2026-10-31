package rh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ns0;
import org.telegram.ui.px0;
public final class t2 {
    public final u2 f47491a;
    public px0 d;
    public int f47494f;
    public int f47495g;
    public float f47497j;
    public float f47498k;
    public final ArrayList f47492b = new ArrayList();
    public int f47493c = 0;
    public boolean e = false;
    public final float[] h = new float[16];
    public float[] f47496i = new float[16];
    public boolean f47499l = false;

    public t2(u2 u2Var) {
        this.f47491a = u2Var;
    }

    public final void a(int i10) {
        this.f47492b.add(new s2(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        px0 px0Var;
        boolean z10 = this.e;
        u2 u2Var = this.f47491a;
        if (!z10) {
            int i10 = this.f47493c;
            ArrayList arrayList = this.f47492b;
            if (i10 < arrayList.size()) {
                s2 s2Var = (s2) arrayList.get(this.f47493c);
                boolean z11 = true;
                this.f47493c++;
                int i11 = s2Var.f47439a;
                int i12 = s2Var.e;
                float f7 = s2Var.f47440b;
                int i13 = s2Var.d;
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
                                        u2Var.f47530f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f47499l = true;
                                View view = s2Var.f47443g;
                                ValueAnimator valueAnimator = u2Var.G;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    u2Var.G = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - u2Var.getX();
                                rectF.top = view.getY() - u2Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                org.telegram.messenger.i0.E2(view);
                                int childCount = u2Var.getChildCount();
                                u2Var.addView(view, w7.b6.e(64, 64, 17));
                                u2Var.f47534w.add(Integer.valueOf(i12));
                                u2Var.f47535x.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                u2Var.f47536y.put(Integer.valueOf(childCount), rectF);
                                u2Var.F = childCount;
                                u2Var.E = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                u2Var.G = ofFloat;
                                ofFloat.addUpdateListener(new qh.e0(u2Var, 3));
                                u2Var.G.addListener(new ns0(u2Var, 26));
                                u2Var.G.setDuration(i13 * 16);
                                u2Var.G.setInterpolator(gr.h);
                                u2Var.G.start();
                                return;
                            }
                            System.arraycopy(u2Var.f47529c, 0, this.h, 0, 16);
                            float f10 = s2Var.f47442f;
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
                            this.f47496i = fArr;
                            this.f47495g = i13;
                            this.f47494f = i13;
                            this.f47497j = u2Var.d;
                            this.f47498k = u2Var.e;
                            return;
                        }
                        this.f47494f = i13;
                        this.f47495g = i13;
                        return;
                    }
                    u2Var.d = (s2Var.f47441c * 0.01f) + u2Var.d;
                    u2Var.e = (f7 * 0.01f) + u2Var.e;
                    this.f47494f = 1;
                    this.f47495g = 1;
                    return;
                }
                Runnable runnable = s2Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        u2Var.H = null;
        if (!this.e && (px0Var = this.d) != null) {
            px0Var.run();
        }
    }

    public final void c(float f7, float f10) {
        this.f47492b.add(new s2(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        this.f47492b.add(new s2(6, f7, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(y2 y2Var, int i10, float f7) {
        this.f47492b.add(new s2(5, 0.0f, 0.0f, 32, i10, f7, y2Var, null));
    }
}
