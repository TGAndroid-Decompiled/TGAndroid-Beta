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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public abstract class t01 extends org.telegram.ui.Components.ek0 {
    public final SparseArray f52198f3;
    public final ArrayList f52199g3;
    public final ArrayList f52200h3;
    public final ArrayList f52201i3;
    public final ArrayList j3;
    public boolean f52202k3;
    public final LongSparseArray f52203l3;
    public final q11 f52204m3;

    public t01(q11 q11Var, Context context) {
        super(context, null);
        this.f52204m3 = q11Var;
        this.f52198f3 = new SparseArray();
        this.f52199g3 = new ArrayList();
        this.f52200h3 = new ArrayList();
        this.f52201i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f52203l3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.u6.l(this, 20, org.telegram.ui.ActionBar.n6.f29543i6, this.f34767o2);
    }

    public static void z1(ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((s01) arrayList.get(i7)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t01.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        s01 s01Var;
        int i7;
        View view;
        int top;
        float interpolation;
        float f10;
        float f11;
        Paint paint;
        ArrayList arrayList3;
        ImageReceiver imageReceiver2;
        boolean z11;
        float f12;
        float f13;
        Canvas canvas2 = canvas;
        if (getVisibility() == 0) {
            this.f52202k3 = false;
            int saveCount = canvas2.getSaveCount();
            q11 q11Var = this.f52204m3;
            int i10 = q11Var.f51226a0;
            int i11 = 14;
            if (i10 != 6 && i10 != 14 && i10 != 13) {
                Rect rect = this.F1;
                if (!rect.isEmpty()) {
                    this.C1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f34765n2;
                    if (aVar != null) {
                        aVar.accept(canvas2);
                    }
                    this.C1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i12 = 0;
            while (true) {
                sparseArray = this.f52198f3;
                int size = sparseArray.size();
                arrayList = this.f52199g3;
                if (i12 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i12);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i12++;
            }
            sparseArray.clear();
            if (q11Var.R1 > 0 && SystemClock.elapsedRealtime() - q11Var.R1 < q11Var.g() && q11Var.O1 != null && q11Var.P1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f52203l3 != null) {
                int i13 = 0;
                boolean z12 = false;
                while (i13 < getChildCount()) {
                    View childAt = getChildAt(i13);
                    if (childAt instanceof a11) {
                        a11 a11Var = (a11) childAt;
                        q11 q11Var2 = a11Var.W;
                        int i14 = q11Var2.f51226a0;
                        if (a11Var.isPressed()) {
                            float f14 = a11Var.O;
                            if (f14 != 1.0f && i14 != i11) {
                                a11Var.O = Utilities.i(f14 + 0.16f, 1.0f, 0.0f);
                                a11Var.invalidate();
                            }
                        }
                        int i15 = a11Var.f45548c;
                        if (q11Var.f51283y1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(a11Var.getX(), a11Var.getY());
                        if (a11Var.f45555x != null) {
                            di.ec collectionParticles = q11Var.getCollectionParticles();
                            i7 = i13;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, a11Var.getWidth(), a11Var.getHeight());
                            if (!z13) {
                                collectionParticles.d();
                                z11 = true;
                            } else {
                                z11 = z13;
                            }
                            canvas2.save();
                            int i16 = i15 % 6;
                            boolean z14 = z11;
                            if (i16 == 2) {
                                f12 = -1.0f;
                            } else {
                                f12 = 1.0f;
                            }
                            if (i16 == 2) {
                                f13 = -1.0f;
                            } else {
                                f13 = 1.0f;
                            }
                            view = childAt;
                            canvas2.scale(f12, f13, a11Var.getWidth() / 2.0f, a11Var.getHeight() / 2.0f);
                            canvas2.rotate((i15 % 4) * 90, a11Var.getWidth() / 2.0f, a11Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, a11Var.f45555x.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i7 = i13;
                            view = childAt;
                        }
                        boolean z15 = a11Var.M;
                        if ((z15 || a11Var.N || a11Var.T > 0.0f) && !a11Var.f45547b) {
                            if (z15 || a11Var.N) {
                                float f15 = a11Var.S;
                                if (f15 < 1.0f) {
                                    a11Var.S = ((1000.0f / org.telegram.messenger.g0.f24227r) / 240.0f) + f15;
                                    invalidate();
                                }
                            }
                            if (!a11Var.M && !a11Var.N) {
                                float f16 = a11Var.S;
                                if (f16 > 0.0f) {
                                    a11Var.S = f16 - ((1000.0f / org.telegram.messenger.g0.f24227r) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (a11Var.M) {
                                interpolation = org.telegram.ui.Components.kr.h.getInterpolation(a11Var.S);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.kr.h.getInterpolation(1.0f - a11Var.S);
                            }
                            a11Var.T = Utilities.i(interpolation, 1.0f, 0.0f);
                            if (i14 == 6) {
                                f10 = 1.5f;
                            } else {
                                f10 = 1.0f;
                            }
                            int L = org.telegram.messenger.g0.L(f10);
                            if (i14 == 6) {
                                f11 = 6.0f;
                            } else {
                                f11 = 4.0f;
                            }
                            int L2 = org.telegram.messenger.g0.L(f11);
                            RectF rectF = org.telegram.messenger.g0.P;
                            rectF.set(0.0f, 0.0f, a11Var.getMeasuredWidth(), a11Var.getMeasuredHeight());
                            float f17 = L;
                            rectF.inset(f17, f17);
                            if (!a11Var.f45546a) {
                                Drawable drawable = a11Var.F;
                                if (!(drawable instanceof org.telegram.ui.Components.o5) || !((org.telegram.ui.Components.o5) drawable).c()) {
                                    paint = q11Var2.M;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (a11Var.getAlpha() * alpha * a11Var.T));
                                    float f18 = L2;
                                    canvas2.drawRoundRect(rectF, f18, f18, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = q11Var2.N;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (a11Var.getAlpha() * alpha2 * a11Var.T));
                            float f182 = L2;
                            canvas2.drawRoundRect(rectF, f182, f182, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (a11Var.getBackground() != null) {
                            a11Var.getBackground().setBounds((int) a11Var.getX(), (int) a11Var.getY(), a11Var.getWidth() + ((int) a11Var.getX()), a11Var.getHeight() + ((int) a11Var.getY()));
                            a11Var.getBackground().setAlpha((int) (a11Var.getAlpha() * 255));
                            a11Var.getBackground().draw(canvas2);
                            a11Var.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) p5.c.g(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(a11Var);
                        z01 z01Var = a11Var.K;
                        if (z01Var != null && z01Var.getVisibility() == 0 && a11Var.K.getImageReceiver() == null && (imageReceiver2 = a11Var.f45552r) != null) {
                            a11Var.K.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i7 = i13;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i17 = q11Var.P1;
                        List list = q11.f51222b2;
                        if (R == i17 - 1) {
                            float interpolation2 = org.telegram.ui.Components.kr.f36859g.getInterpolation(c8.m9.a(((float) (SystemClock.elapsedRealtime() - q11Var.R1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f19 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f19), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f20 = (f19 * 0.5f) + 0.5f;
                                canvas2.scale(f20, f20, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                q11Var.O1.draw(canvas2);
                                canvas2.restore();
                                i13 = i7 + 1;
                                z12 = z16;
                                i11 = 14;
                            }
                        }
                    }
                    i13 = i7 + 1;
                    z12 = z16;
                    i11 = 14;
                }
            }
            ArrayList arrayList6 = this.j3;
            arrayList6.clear();
            ArrayList arrayList7 = this.f52201i3;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i18 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f52200h3;
                if (i18 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i18);
                a11 a11Var2 = (a11) arrayList8.get(0);
                int R2 = RecyclerView.R(a11Var2);
                int i19 = 0;
                while (true) {
                    if (i19 < arrayList6.size()) {
                        if (((s01) arrayList6.get(i19)).N == R2) {
                            s01Var = (s01) arrayList6.get(i19);
                            arrayList6.remove(i19);
                            break;
                        }
                        i19++;
                    } else {
                        s01Var = null;
                        break;
                    }
                }
                if (s01Var == null) {
                    if (!arrayList2.isEmpty()) {
                        s01Var = (s01) p5.c.g(1, arrayList2);
                    } else {
                        s01Var = new s01(this);
                        s01Var.l(7);
                    }
                    s01Var.N = R2;
                    s01Var.e();
                }
                arrayList7.add(s01Var);
                s01Var.P = arrayList8;
                canvas2.save();
                canvas2.translate(a11Var2.getLeft(), a11Var2.getY());
                s01Var.O = a11Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (a11Var2.getLeft() * 2);
                int measuredHeight = a11Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    s01Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i18++;
            }
            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((s01) arrayList6.get(i20));
                    ((s01) arrayList6.get(i20)).P = null;
                    ((s01) arrayList6.get(i20)).k();
                } else {
                    ((s01) arrayList6.get(i20)).f();
                }
            }
            arrayList6.clear();
            for (int i21 = 0; i21 < getChildCount(); i21++) {
                View childAt2 = getChildAt(i21);
                if (childAt2 instanceof a11) {
                    a11 a11Var3 = (a11) childAt2;
                    z01 z01Var2 = a11Var3.K;
                    if (z01Var2 != null && z01Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((a11Var3.getX() + a11Var3.getMeasuredWidth()) - a11Var3.K.getMeasuredWidth()), (int) ((a11Var3.getY() + a11Var3.getMeasuredHeight()) - a11Var3.K.getMeasuredHeight()));
                        Drawable drawable2 = a11Var3.F;
                        if (drawable2 instanceof org.telegram.ui.Components.o5) {
                            imageReceiver = ((org.telegram.ui.Components.o5) drawable2).f38028k;
                        } else {
                            imageReceiver = a11Var3.h;
                        }
                        z01 z01Var3 = a11Var3.K;
                        if (!z01Var3.h) {
                            z01Var3.setImageReceiver(imageReceiver);
                        }
                        a11Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                    if (a11Var3.L != null) {
                        canvas2.save();
                        int L3 = org.telegram.messenger.g0.L(17.0f);
                        float f21 = L3;
                        canvas2.translate((int) ((a11Var3.getX() + a11Var3.getMeasuredWidth()) - f21), (int) ((a11Var3.getY() + a11Var3.getMeasuredHeight()) - f21));
                        a11Var3.L.setBounds(0, 0, L3, L3);
                        a11Var3.L.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != q11Var.O1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = ch.f0.f5347c;
            if (runnable != null) {
                runnable.run();
                ch.f0.f5347c = null;
            }
        }
    }

    @Override
    public final void g1() {
        if (ch.f0.b(this)) {
            return;
        }
        super.g1();
    }

    @Override
    public final void invalidate() {
        if (ch.f0.b(this) || this.f52202k3) {
            return;
        }
        this.f52202k3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q11 q11Var = this.f52204m3;
        if (this == q11Var.f51247i0) {
            q11Var.W0.Q();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q11 q11Var = this.f52204m3;
        if (this == q11Var.f51247i0) {
            q11Var.W0.S();
        }
        z1(this.f52200h3);
        z1(this.f52201i3);
        z1(this.j3);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        invalidate();
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.f0.b(this)) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
