package zh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.fi1;
public final class k2 {
    public final l2 f50748a;
    public j1 d;
    public int f50751f;
    public int f50752g;
    public float f50754j;
    public float f50755k;
    public final ArrayList f50749b = new ArrayList();
    public int f50750c = 0;
    public boolean e = false;
    public final float[] h = new float[16];
    public float[] f50753i = new float[16];
    public boolean f50756l = false;

    public k2(l2 l2Var) {
        this.f50748a = l2Var;
    }

    public final void a(int i10) {
        this.f50749b.add(new j2(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        j1 j1Var;
        boolean z10 = this.e;
        l2 l2Var = this.f50748a;
        if (!z10) {
            int i10 = this.f50750c;
            ArrayList arrayList = this.f50749b;
            if (i10 < arrayList.size()) {
                j2 j2Var = (j2) arrayList.get(this.f50750c);
                boolean z11 = true;
                this.f50750c++;
                int i11 = j2Var.f50691a;
                int i12 = j2Var.e;
                float f7 = j2Var.f50692b;
                int i13 = j2Var.d;
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
                                        l2Var.f50786f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f50756l = true;
                                View view = j2Var.f50695g;
                                ValueAnimator valueAnimator = l2Var.G;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    l2Var.G = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - l2Var.getX();
                                rectF.top = view.getY() - l2Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                AndroidUtilities.removeFromParent(view);
                                int childCount = l2Var.getChildCount();
                                l2Var.addView(view, w7.z5.e(64, 64, 17));
                                l2Var.v.add(Integer.valueOf(i12));
                                l2Var.f50790w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                l2Var.f50791x.put(Integer.valueOf(childCount), rectF);
                                l2Var.F = childCount;
                                l2Var.E = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                l2Var.G = ofFloat;
                                ofFloat.addUpdateListener(new ki.a(l2Var, 23));
                                l2Var.G.addListener(new fi1(l2Var, 21));
                                l2Var.G.setDuration(i13 * 16);
                                l2Var.G.setInterpolator(es.h);
                                l2Var.G.start();
                                return;
                            }
                            System.arraycopy(l2Var.f50785c, 0, this.h, 0, 16);
                            float f10 = j2Var.f50694f;
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
                            this.f50753i = fArr;
                            this.f50752g = i13;
                            this.f50751f = i13;
                            this.f50754j = l2Var.d;
                            this.f50755k = l2Var.e;
                            return;
                        }
                        this.f50751f = i13;
                        this.f50752g = i13;
                        return;
                    }
                    l2Var.d = (j2Var.f50693c * 0.01f) + l2Var.d;
                    l2Var.e = (f7 * 0.01f) + l2Var.e;
                    this.f50751f = 1;
                    this.f50752g = 1;
                    return;
                }
                Runnable runnable = j2Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        l2Var.H = null;
        if (!this.e && (j1Var = this.d) != null) {
            j1Var.run();
        }
    }

    public final void c(float f7, float f10) {
        this.f50749b.add(new j2(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        this.f50749b.add(new j2(6, f7, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(q2 q2Var, int i10, float f7) {
        this.f50749b.add(new j2(5, 0.0f, 0.0f, 32, i10, f7, q2Var, null));
    }
}
