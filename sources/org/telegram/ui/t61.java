package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public abstract class t61 extends org.telegram.ui.Components.mm0 {
    public final SparseArray V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public boolean f40012a3;
    public final LongSparseArray f40013b3;
    public final r71 f40014c3;

    public t61(r71 r71Var, Context context) {
        super(context, null);
        this.f40014c3 = r71Var;
        this.V2 = new SparseArray();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f40013b3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, this.f27148n2));
    }

    public static void x1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((s61) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t61.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        s61 s61Var;
        int i10;
        View view;
        int top;
        float interpolation;
        float f7;
        float f10;
        Paint paint;
        ArrayList arrayList3;
        ImageReceiver imageReceiver2;
        boolean z11;
        float f11;
        float f12;
        Canvas canvas2 = canvas;
        if (getVisibility() == 0) {
            this.f40012a3 = false;
            int saveCount = canvas2.getSaveCount();
            r71 r71Var = this.f40014c3;
            int i11 = r71Var.W;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.E1;
                if (!rect.isEmpty()) {
                    this.B1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f27146m2;
                    if (aVar != null) {
                        aVar.accept(canvas2);
                    }
                    this.B1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i13 = 0;
            while (true) {
                sparseArray = this.V2;
                int size = sparseArray.size();
                arrayList = this.W2;
                if (i13 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i13++;
            }
            sparseArray.clear();
            if (r71Var.P1 > 0 && SystemClock.elapsedRealtime() - r71Var.P1 < r71Var.g() && r71Var.M1 != null && r71Var.N1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f40013b3 != null) {
                int i14 = 0;
                boolean z12 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof a71) {
                        a71 a71Var = (a71) childAt;
                        r71 r71Var2 = a71Var.V;
                        int i15 = r71Var2.W;
                        if (a71Var.isPressed()) {
                            float f13 = a71Var.N;
                            if (f13 != 1.0f && i15 != i12) {
                                a71Var.N = Utilities.clamp(f13 + 0.16f, 1.0f, 0.0f);
                                a71Var.invalidate();
                            }
                        }
                        int i16 = a71Var.f33768c;
                        if (r71Var.f39363w1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(a71Var.getX(), a71Var.getY());
                        if (a71Var.f33773w != null) {
                            zh.b8 collectionParticles = r71Var.getCollectionParticles();
                            i10 = i14;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, a71Var.getWidth(), a71Var.getHeight());
                            if (!z13) {
                                collectionParticles.d();
                                z11 = true;
                            } else {
                                z11 = z13;
                            }
                            canvas2.save();
                            int i17 = i16 % 6;
                            boolean z14 = z11;
                            if (i17 == 2) {
                                f11 = -1.0f;
                            } else {
                                f11 = 1.0f;
                            }
                            if (i17 == 2) {
                                f12 = -1.0f;
                            } else {
                                f12 = 1.0f;
                            }
                            view = childAt;
                            canvas2.scale(f11, f12, a71Var.getWidth() / 2.0f, a71Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, a71Var.getWidth() / 2.0f, a71Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, a71Var.f33773w.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z15 = a71Var.L;
                        if ((z15 || a71Var.M || a71Var.S > 0.0f) && !a71Var.f33767b) {
                            if (z15 || a71Var.M) {
                                float f14 = a71Var.R;
                                if (f14 < 1.0f) {
                                    a71Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f14;
                                    invalidate();
                                }
                            }
                            if (!a71Var.L && !a71Var.M) {
                                float f15 = a71Var.R;
                                if (f15 > 0.0f) {
                                    a71Var.R = f15 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (a71Var.L) {
                                interpolation = org.telegram.ui.Components.es.h.getInterpolation(a71Var.R);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.es.h.getInterpolation(1.0f - a71Var.R);
                            }
                            a71Var.S = Utilities.clamp(interpolation, 1.0f, 0.0f);
                            if (i15 == 6) {
                                f7 = 1.5f;
                            } else {
                                f7 = 1.0f;
                            }
                            int dp = AndroidUtilities.dp(f7);
                            if (i15 == 6) {
                                f10 = 6.0f;
                            } else {
                                f10 = 4.0f;
                            }
                            int dp2 = AndroidUtilities.dp(f10);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(0.0f, 0.0f, a71Var.getMeasuredWidth(), a71Var.getMeasuredHeight());
                            float f16 = dp;
                            rectF.inset(f16, f16);
                            if (!a71Var.f33766a) {
                                Drawable drawable = a71Var.E;
                                if (!(drawable instanceof org.telegram.ui.Components.s5) || !((org.telegram.ui.Components.s5) drawable).c()) {
                                    paint = r71Var2.L;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (a71Var.getAlpha() * alpha * a71Var.S));
                                    float f17 = dp2;
                                    canvas2.drawRoundRect(rectF, f17, f17, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = r71Var2.M;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (a71Var.getAlpha() * alpha2 * a71Var.S));
                            float f172 = dp2;
                            canvas2.drawRoundRect(rectF, f172, f172, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (a71Var.getBackground() != null) {
                            a71Var.getBackground().setBounds((int) a71Var.getX(), (int) a71Var.getY(), a71Var.getWidth() + ((int) a71Var.getX()), a71Var.getHeight() + ((int) a71Var.getY()));
                            a71Var.getBackground().setAlpha((int) (a71Var.getAlpha() * 255));
                            a71Var.getBackground().draw(canvas2);
                            a71Var.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) i2.d.A(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(a71Var);
                        z61 z61Var = a71Var.J;
                        if (z61Var != null && z61Var.getVisibility() == 0 && a71Var.J.getImageReceiver() == null && (imageReceiver2 = a71Var.f33771r) != null) {
                            a71Var.J.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i18 = r71Var.N1;
                        List list = r71.Z1;
                        if (R == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.es.f24466g.getInterpolation(w7.r.a(((float) (SystemClock.elapsedRealtime() - r71Var.P1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f18 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f18), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f19 = (f18 * 0.5f) + 0.5f;
                                canvas2.scale(f19, f19, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                r71Var.M1.draw(canvas2);
                                canvas2.restore();
                                i14 = i10 + 1;
                                z12 = z16;
                                i12 = 14;
                            }
                        }
                    }
                    i14 = i10 + 1;
                    z12 = z16;
                    i12 = 14;
                }
            }
            ArrayList arrayList6 = this.Z2;
            arrayList6.clear();
            ArrayList arrayList7 = this.Y2;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i19 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.X2;
                if (i19 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i19);
                a71 a71Var2 = (a71) arrayList8.get(0);
                int R2 = RecyclerView.R(a71Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((s61) arrayList6.get(i20)).M == R2) {
                            s61Var = (s61) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        s61Var = null;
                        break;
                    }
                }
                if (s61Var == null) {
                    if (!arrayList2.isEmpty()) {
                        s61Var = (s61) i2.d.A(1, arrayList2);
                    } else {
                        s61Var = new s61(this);
                        s61Var.l(7);
                    }
                    s61Var.M = R2;
                    s61Var.e();
                }
                arrayList7.add(s61Var);
                s61Var.O = arrayList8;
                canvas2.save();
                canvas2.translate(a71Var2.getLeft(), a71Var2.getY());
                s61Var.N = a71Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (a71Var2.getLeft() * 2);
                int measuredHeight = a71Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    s61Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((s61) arrayList6.get(i21));
                    ((s61) arrayList6.get(i21)).O = null;
                    ((s61) arrayList6.get(i21)).k();
                } else {
                    ((s61) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof a71) {
                    a71 a71Var3 = (a71) childAt2;
                    z61 z61Var2 = a71Var3.J;
                    if (z61Var2 != null && z61Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((a71Var3.getX() + a71Var3.getMeasuredWidth()) - a71Var3.J.getMeasuredWidth()), (int) ((a71Var3.getY() + a71Var3.getMeasuredHeight()) - a71Var3.J.getMeasuredHeight()));
                        Drawable drawable2 = a71Var3.E;
                        if (drawable2 instanceof org.telegram.ui.Components.s5) {
                            imageReceiver = ((org.telegram.ui.Components.s5) drawable2).f28739k;
                        } else {
                            imageReceiver = a71Var3.h;
                        }
                        z61 z61Var3 = a71Var3.J;
                        if (!z61Var3.h) {
                            z61Var3.setImageReceiver(imageReceiver);
                        }
                        a71Var3.J.draw(canvas2);
                        canvas2.restore();
                    }
                    if (a71Var3.K != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f20 = dp3;
                        canvas2.translate((int) ((a71Var3.getX() + a71Var3.getMeasuredWidth()) - f20), (int) ((a71Var3.getY() + a71Var3.getMeasuredHeight()) - f20));
                        a71Var3.K.setBounds(0, 0, dp3, dp3);
                        a71Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != r71Var.M1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = ah.x0.f902c;
            if (runnable != null) {
                runnable.run();
                ah.x0.f902c = null;
            }
        }
    }

    @Override
    public final void f1() {
        if (ah.x0.b(this)) {
            return;
        }
        super.f1();
    }

    @Override
    public final void invalidate() {
        if (ah.x0.b(this) || this.f40012a3) {
            return;
        }
        this.f40012a3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r71 r71Var = this.f40014c3;
        if (this == r71Var.f39330h0) {
            r71Var.V0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r71 r71Var = this.f40014c3;
        if (this == r71Var.f39330h0) {
            r71Var.V0.onDetachedFromWindow();
        }
        x1(this.X2);
        x1(this.Y2);
        x1(this.Z2);
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        invalidate();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ah.x0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
