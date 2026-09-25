package yh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;
public final class o2 {
    public final p2 f47801a;
    public j1 d;
    public int f47804f;
    public int f47805g;
    public float f47807j;
    public float f47808k;
    public final ArrayList f47802b = new ArrayList();
    public int f47803c = 0;
    public boolean e = false;
    public final float[] h = new float[16];
    public float[] f47806i = new float[16];
    public boolean f47809l = false;

    public o2(p2 p2Var) {
        this.f47801a = p2Var;
    }

    public final void a(int i10) {
        this.f47802b.add(new n2(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        j1 j1Var;
        boolean z10 = this.e;
        p2 p2Var = this.f47801a;
        if (!z10) {
            int i10 = this.f47803c;
            ArrayList arrayList = this.f47802b;
            if (i10 < arrayList.size()) {
                n2 n2Var = (n2) arrayList.get(this.f47803c);
                boolean z11 = true;
                this.f47803c++;
                int i11 = n2Var.f47759a;
                int i12 = n2Var.e;
                float f7 = n2Var.f47760b;
                int i13 = n2Var.d;
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
                                        p2Var.f47863f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f47809l = true;
                                View view = n2Var.f47763g;
                                ValueAnimator valueAnimator = p2Var.G;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    p2Var.G = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - p2Var.getX();
                                rectF.top = view.getY() - p2Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                AndroidUtilities.removeFromParent(view);
                                int childCount = p2Var.getChildCount();
                                p2Var.addView(view, w7.y5.e(64, 64, 17));
                                p2Var.v.add(Integer.valueOf(i12));
                                p2Var.f47867w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                p2Var.f47868x.put(Integer.valueOf(childCount), rectF);
                                p2Var.F = childCount;
                                p2Var.E = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                p2Var.G = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(p2Var, 22));
                                p2Var.G.addListener(new pg.d0(p2Var, 10));
                                p2Var.G.setDuration(i13 * 16);
                                p2Var.G.setInterpolator(rr.h);
                                p2Var.G.start();
                                return;
                            }
                            System.arraycopy(p2Var.f47862c, 0, this.h, 0, 16);
                            float f10 = n2Var.f47762f;
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
                            this.f47806i = fArr;
                            this.f47805g = i13;
                            this.f47804f = i13;
                            this.f47807j = p2Var.d;
                            this.f47808k = p2Var.e;
                            return;
                        }
                        this.f47804f = i13;
                        this.f47805g = i13;
                        return;
                    }
                    p2Var.d = (n2Var.f47761c * 0.01f) + p2Var.d;
                    p2Var.e = (f7 * 0.01f) + p2Var.e;
                    this.f47804f = 1;
                    this.f47805g = 1;
                    return;
                }
                Runnable runnable = n2Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        p2Var.H = null;
        if (!this.e && (j1Var = this.d) != null) {
            j1Var.run();
        }
    }

    public final void c(float f7, float f10) {
        this.f47802b.add(new n2(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        this.f47802b.add(new n2(6, f7, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(v2 v2Var, int i10, float f7) {
        this.f47802b.add(new n2(5, 0.0f, 0.0f, 32, i10, f7, v2Var, null));
    }
}
