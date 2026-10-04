package yh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
public final class p2 {
    public final q2 f51789a;
    public j1 d;
    public int f51793f;
    public int f51794g;
    public float f51796j;
    public float f51797k;
    public final ArrayList f51790b = new ArrayList();
    public int f51791c = 0;
    public boolean f51792e = false;
    public final float[] h = new float[16];
    public float[] f51795i = new float[16];
    public boolean f51798l = false;

    public p2(q2 q2Var) {
        this.f51789a = q2Var;
    }

    public final void a(int i10) {
        this.f51790b.add(new o2(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        j1 j1Var;
        boolean z10 = this.f51792e;
        q2 q2Var = this.f51789a;
        if (!z10) {
            int i10 = this.f51791c;
            ArrayList arrayList = this.f51790b;
            if (i10 < arrayList.size()) {
                o2 o2Var = (o2) arrayList.get(this.f51791c);
                boolean z11 = true;
                this.f51791c++;
                int i11 = o2Var.f51734a;
                int i12 = o2Var.f51737e;
                float f7 = o2Var.f51735b;
                int i13 = o2Var.d;
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
                                        q2Var.f51853f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f51798l = true;
                                View view = o2Var.f51739g;
                                ValueAnimator valueAnimator = q2Var.G;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    q2Var.G = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - q2Var.getX();
                                rectF.top = view.getY() - q2Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                AndroidUtilities.removeFromParent(view);
                                int childCount = q2Var.getChildCount();
                                q2Var.addView(view, w7.z5.e(64, 64, 17));
                                q2Var.v.add(Integer.valueOf(i12));
                                q2Var.f51857w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                q2Var.f51858x.put(Integer.valueOf(childCount), rectF);
                                q2Var.F = childCount;
                                q2Var.E = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                q2Var.G = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(q2Var, 22));
                                q2Var.G.addListener(new pg.d0(q2Var, 10));
                                q2Var.G.setDuration(i13 * 16);
                                q2Var.G.setInterpolator(tr.h);
                                q2Var.G.start();
                                return;
                            }
                            System.arraycopy(q2Var.f51851c, 0, this.h, 0, 16);
                            float f10 = o2Var.f51738f;
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
                            this.f51795i = fArr;
                            this.f51794g = i13;
                            this.f51793f = i13;
                            this.f51796j = q2Var.d;
                            this.f51797k = q2Var.f51852e;
                            return;
                        }
                        this.f51793f = i13;
                        this.f51794g = i13;
                        return;
                    }
                    q2Var.d = (o2Var.f51736c * 0.01f) + q2Var.d;
                    q2Var.f51852e = (f7 * 0.01f) + q2Var.f51852e;
                    this.f51793f = 1;
                    this.f51794g = 1;
                    return;
                }
                Runnable runnable = o2Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        q2Var.H = null;
        if (!this.f51792e && (j1Var = this.d) != null) {
            j1Var.run();
        }
    }

    public final void c(float f7, float f10) {
        this.f51790b.add(new o2(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        this.f51790b.add(new o2(6, f7, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(v2 v2Var, int i10, float f7) {
        this.f51790b.add(new o2(5, 0.0f, 0.0f, 32, i10, f7, v2Var, null));
    }
}
