package yh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
public final class q2 {
    public final r2 f51853a;
    public z0 d;
    public int f51857f;
    public int f51858g;
    public float f51860j;
    public float f51861k;
    public final ArrayList f51854b = new ArrayList();
    public int f51855c = 0;
    public boolean f51856e = false;
    public final float[] h = new float[16];
    public float[] f51859i = new float[16];
    public boolean f51862l = false;

    public q2(r2 r2Var) {
        this.f51853a = r2Var;
    }

    public final void a(int i10) {
        this.f51854b.add(new p2(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        z0 z0Var;
        boolean z10 = this.f51856e;
        r2 r2Var = this.f51853a;
        if (!z10) {
            int i10 = this.f51855c;
            ArrayList arrayList = this.f51854b;
            if (i10 < arrayList.size()) {
                p2 p2Var = (p2) arrayList.get(this.f51855c);
                boolean z11 = true;
                this.f51855c++;
                int i11 = p2Var.f51786a;
                int i12 = p2Var.f51789e;
                float f7 = p2Var.f51787b;
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
                                        r2Var.f51907f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f51862l = true;
                                View view = p2Var.f51791g;
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
                                r2Var.addView(view, w7.z5.e(64, 64, 17));
                                r2Var.v.add(Integer.valueOf(i12));
                                r2Var.f51911w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                r2Var.f51912x.put(Integer.valueOf(childCount), rectF);
                                r2Var.F = childCount;
                                r2Var.E = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                r2Var.G = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(r2Var, 22));
                                r2Var.G.addListener(new pg.d0(r2Var, 10));
                                r2Var.G.setDuration(i13 * 16);
                                r2Var.G.setInterpolator(tr.h);
                                r2Var.G.start();
                                return;
                            }
                            System.arraycopy(r2Var.f51905c, 0, this.h, 0, 16);
                            float f10 = p2Var.f51790f;
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
                            this.f51859i = fArr;
                            this.f51858g = i13;
                            this.f51857f = i13;
                            this.f51860j = r2Var.d;
                            this.f51861k = r2Var.f51906e;
                            return;
                        }
                        this.f51857f = i13;
                        this.f51858g = i13;
                        return;
                    }
                    r2Var.d = (p2Var.f51788c * 0.01f) + r2Var.d;
                    r2Var.f51906e = (f7 * 0.01f) + r2Var.f51906e;
                    this.f51857f = 1;
                    this.f51858g = 1;
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
        if (!this.f51856e && (z0Var = this.d) != null) {
            z0Var.run();
        }
    }

    public final void c(float f7, float f10) {
        this.f51854b.add(new p2(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        this.f51854b.add(new p2(6, f7, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(w2 w2Var, int i10, float f7) {
        this.f51854b.add(new p2(5, 0.0f, 0.0f, 32, i10, f7, w2Var, null));
    }
}
