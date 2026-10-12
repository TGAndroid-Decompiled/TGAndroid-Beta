package yh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.js;
public final class l2 {
    public final m2 f53050a;
    public i1 d;
    public int f53054f;
    public int f53055g;
    public float f53057j;
    public float f53058k;
    public final ArrayList f53051b = new ArrayList();
    public int f53052c = 0;
    public boolean f53053e = false;
    public final float[] h = new float[16];
    public float[] f53056i = new float[16];
    public boolean f53059l = false;

    public l2(m2 m2Var) {
        this.f53050a = m2Var;
    }

    public final void a(int i10) {
        this.f53051b.add(new k2(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        i1 i1Var;
        boolean z10 = this.f53053e;
        m2 m2Var = this.f53050a;
        if (!z10) {
            int i10 = this.f53052c;
            ArrayList arrayList = this.f53051b;
            if (i10 < arrayList.size()) {
                k2 k2Var = (k2) arrayList.get(this.f53052c);
                boolean z11 = true;
                this.f53052c++;
                int i11 = k2Var.f53003a;
                int i12 = k2Var.f53006e;
                float f7 = k2Var.f53004b;
                int i13 = k2Var.d;
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
                                        m2Var.f53092f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f53059l = true;
                                View view = k2Var.f53008g;
                                ValueAnimator valueAnimator = m2Var.G;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    m2Var.G = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - m2Var.getX();
                                rectF.top = view.getY() - m2Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                AndroidUtilities.removeFromParent(view);
                                int childCount = m2Var.getChildCount();
                                m2Var.addView(view, w7.w5.e(64, 64, 17));
                                m2Var.v.add(Integer.valueOf(i12));
                                m2Var.f53096w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                m2Var.f53097x.put(Integer.valueOf(childCount), rectF);
                                m2Var.F = childCount;
                                m2Var.E = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                m2Var.G = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.s0(m2Var, 22));
                                m2Var.G.addListener(new org.telegram.ui.Wallet.z4(m2Var, 18));
                                m2Var.G.setDuration(i13 * 16);
                                m2Var.G.setInterpolator(js.h);
                                m2Var.G.start();
                                return;
                            }
                            System.arraycopy(m2Var.f53090c, 0, this.h, 0, 16);
                            float f10 = k2Var.f53007f;
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
                            this.f53056i = fArr;
                            this.f53055g = i13;
                            this.f53054f = i13;
                            this.f53057j = m2Var.d;
                            this.f53058k = m2Var.f53091e;
                            return;
                        }
                        this.f53054f = i13;
                        this.f53055g = i13;
                        return;
                    }
                    m2Var.d = (k2Var.f53005c * 0.01f) + m2Var.d;
                    m2Var.f53091e = (f7 * 0.01f) + m2Var.f53091e;
                    this.f53054f = 1;
                    this.f53055g = 1;
                    return;
                }
                Runnable runnable = k2Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        m2Var.H = null;
        if (!this.f53053e && (i1Var = this.d) != null) {
            i1Var.run();
        }
    }

    public final void c(float f7, float f10) {
        this.f53051b.add(new k2(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        this.f53051b.add(new k2(6, f7, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(r2 r2Var, int i10, float f7) {
        this.f53051b.add(new k2(5, 0.0f, 0.0f, 32, i10, f7, r2Var, null));
    }
}
