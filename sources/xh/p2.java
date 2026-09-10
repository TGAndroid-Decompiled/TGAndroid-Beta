package xh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;
import org.telegram.ui.fy0;
import org.telegram.ui.mv0;
public final class p2 {
    public final q2 f45857a;
    public fy0 d;
    public int f45860f;
    public int f45861g;
    public float f45863j;
    public float f45864k;
    public final ArrayList f45858b = new ArrayList();
    public int f45859c = 0;
    public boolean e = false;
    public final float[] h = new float[16];
    public float[] f45862i = new float[16];
    public boolean f45865l = false;

    public p2(q2 q2Var) {
        this.f45857a = q2Var;
    }

    public final void a(int i10) {
        this.f45858b.add(new o2(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        fy0 fy0Var;
        boolean z10 = this.e;
        q2 q2Var = this.f45857a;
        if (!z10) {
            int i10 = this.f45859c;
            ArrayList arrayList = this.f45858b;
            if (i10 < arrayList.size()) {
                o2 o2Var = (o2) arrayList.get(this.f45859c);
                boolean z11 = true;
                this.f45859c++;
                int i11 = o2Var.f45793a;
                int i12 = o2Var.e;
                float f7 = o2Var.f45794b;
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
                                        q2Var.f45915f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f45865l = true;
                                View view = o2Var.f45797g;
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
                                q2Var.addView(view, w7.a6.e(64, 64, 17));
                                q2Var.v.add(Integer.valueOf(i12));
                                q2Var.f45919w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                q2Var.f45920x.put(Integer.valueOf(childCount), rectF);
                                q2Var.F = childCount;
                                q2Var.E = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                q2Var.G = ofFloat;
                                ofFloat.addUpdateListener(new qg.o(q2Var, 8));
                                q2Var.G.addListener(new mv0(q2Var, 28));
                                q2Var.G.setDuration(i13 * 16);
                                q2Var.G.setInterpolator(wr.h);
                                q2Var.G.start();
                                return;
                            }
                            System.arraycopy(q2Var.f45914c, 0, this.h, 0, 16);
                            float f10 = o2Var.f45796f;
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
                            this.f45862i = fArr;
                            this.f45861g = i13;
                            this.f45860f = i13;
                            this.f45863j = q2Var.d;
                            this.f45864k = q2Var.e;
                            return;
                        }
                        this.f45860f = i13;
                        this.f45861g = i13;
                        return;
                    }
                    q2Var.d = (o2Var.f45795c * 0.01f) + q2Var.d;
                    q2Var.e = (f7 * 0.01f) + q2Var.e;
                    this.f45860f = 1;
                    this.f45861g = 1;
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
        if (!this.e && (fy0Var = this.d) != null) {
            fy0Var.run();
        }
    }

    public final void c(float f7, float f10) {
        this.f45858b.add(new o2(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        this.f45858b.add(new o2(6, f7, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(v2 v2Var, int i10, float f7) {
        this.f45858b.add(new o2(5, 0.0f, 0.0f, 32, i10, f7, v2Var, null));
    }
}
