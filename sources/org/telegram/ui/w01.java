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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public abstract class w01 extends org.telegram.ui.Components.pj0 {
    public final SparseArray f50856e3;
    public final ArrayList f50857f3;
    public final ArrayList f50858g3;
    public final ArrayList f50859h3;
    public final ArrayList f50860i3;
    public boolean j3;
    public final LongSparseArray f50861k3;
    public final t11 f50862l3;

    public w01(t11 t11Var, Context context) {
        super(context, null);
        this.f50862l3 = t11Var;
        this.f50856e3 = new SparseArray();
        this.f50857f3 = new ArrayList();
        this.f50858g3 = new ArrayList();
        this.f50859h3 = new ArrayList();
        this.f50860i3 = new ArrayList();
        this.f50861k3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.t6.l(this, 20, org.telegram.ui.ActionBar.m6.f27982i6, this.f36980n2);
    }

    public static void z1(ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((v01) arrayList.get(i7)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w01.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z9;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        v01 v01Var;
        int i7;
        View view;
        int top;
        float interpolation;
        float f10;
        float f11;
        Paint paint;
        ArrayList arrayList3;
        ImageReceiver imageReceiver2;
        boolean z10;
        float f12;
        float f13;
        Canvas canvas2 = canvas;
        if (getVisibility() == 0) {
            this.j3 = false;
            int saveCount = canvas2.getSaveCount();
            t11 t11Var = this.f50862l3;
            int i10 = t11Var.W;
            int i11 = 14;
            if (i10 != 6 && i10 != 14 && i10 != 13) {
                Rect rect = this.E1;
                if (!rect.isEmpty()) {
                    this.B1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f36979m2;
                    if (aVar != null) {
                        aVar.accept(canvas2);
                    }
                    this.B1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i12 = 0;
            while (true) {
                sparseArray = this.f50856e3;
                int size = sparseArray.size();
                arrayList = this.f50857f3;
                if (i12 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i12);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i12++;
            }
            sparseArray.clear();
            if (t11Var.Q1 > 0 && SystemClock.elapsedRealtime() - t11Var.Q1 < t11Var.g() && t11Var.N1 != null && t11Var.O1 >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (this.f50861k3 != null) {
                int i13 = 0;
                boolean z11 = false;
                while (i13 < getChildCount()) {
                    View childAt = getChildAt(i13);
                    if (childAt instanceof d11) {
                        d11 d11Var = (d11) childAt;
                        t11 t11Var2 = d11Var.V;
                        int i14 = t11Var2.W;
                        if (d11Var.isPressed()) {
                            float f14 = d11Var.N;
                            if (f14 != 1.0f && i14 != i11) {
                                d11Var.N = Utilities.i(f14 + 0.16f, 1.0f, 0.0f);
                                d11Var.invalidate();
                            }
                        }
                        int i15 = d11Var.f44873c;
                        if (t11Var.f50071x1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(d11Var.getX(), d11Var.getY());
                        if (d11Var.f44880x != null) {
                            bi.ud collectionParticles = t11Var.getCollectionParticles();
                            i7 = i13;
                            boolean z12 = z11;
                            collectionParticles.f(0, 0, d11Var.getWidth(), d11Var.getHeight());
                            if (!z12) {
                                collectionParticles.d();
                                z10 = true;
                            } else {
                                z10 = z12;
                            }
                            canvas2.save();
                            int i16 = i15 % 6;
                            boolean z13 = z10;
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
                            canvas2.scale(f12, f13, d11Var.getWidth() / 2.0f, d11Var.getHeight() / 2.0f);
                            canvas2.rotate((i15 % 4) * 90, d11Var.getWidth() / 2.0f, d11Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, d11Var.f44880x.intValue());
                            canvas2.restore();
                            z11 = z13;
                        } else {
                            i7 = i13;
                            view = childAt;
                        }
                        boolean z14 = d11Var.L;
                        if ((z14 || d11Var.M || d11Var.S > 0.0f) && !d11Var.f44872b) {
                            if (z14 || d11Var.M) {
                                float f15 = d11Var.R;
                                if (f15 < 1.0f) {
                                    d11Var.R = ((1000.0f / org.telegram.messenger.g0.f22568r) / 240.0f) + f15;
                                    invalidate();
                                }
                            }
                            if (!d11Var.L && !d11Var.M) {
                                float f16 = d11Var.R;
                                if (f16 > 0.0f) {
                                    d11Var.R = f16 - ((1000.0f / org.telegram.messenger.g0.f22568r) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (d11Var.L) {
                                interpolation = org.telegram.ui.Components.wq.h.getInterpolation(d11Var.R);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.wq.h.getInterpolation(1.0f - d11Var.R);
                            }
                            d11Var.S = Utilities.i(interpolation, 1.0f, 0.0f);
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
                            rectF.set(0.0f, 0.0f, d11Var.getMeasuredWidth(), d11Var.getMeasuredHeight());
                            float f17 = L;
                            rectF.inset(f17, f17);
                            if (!d11Var.f44871a) {
                                Drawable drawable = d11Var.E;
                                if (!(drawable instanceof org.telegram.ui.Components.h5) || !((org.telegram.ui.Components.h5) drawable).c()) {
                                    paint = t11Var2.L;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (d11Var.getAlpha() * alpha * d11Var.S));
                                    float f18 = L2;
                                    canvas2.drawRoundRect(rectF, f18, f18, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = t11Var2.M;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (d11Var.getAlpha() * alpha2 * d11Var.S));
                            float f182 = L2;
                            canvas2.drawRoundRect(rectF, f182, f182, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (d11Var.getBackground() != null) {
                            d11Var.getBackground().setBounds((int) d11Var.getX(), (int) d11Var.getY(), d11Var.getWidth() + ((int) d11Var.getX()), d11Var.getHeight() + ((int) d11Var.getY()));
                            d11Var.getBackground().setAlpha((int) (d11Var.getAlpha() * 255));
                            d11Var.getBackground().draw(canvas2);
                            d11Var.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) org.telegram.ui.Cells.f1.k(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(d11Var);
                        c11 c11Var = d11Var.J;
                        if (c11Var != null && c11Var.getVisibility() == 0 && d11Var.J.getImageReceiver() == null && (imageReceiver2 = d11Var.f44877r) != null) {
                            d11Var.J.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i7 = i13;
                        view = childAt;
                    }
                    boolean z15 = z11;
                    if (z9 && view != null && RecyclerView.R(view) == t11Var.O1 - 1) {
                        float interpolation2 = org.telegram.ui.Components.wq.f40047g.getInterpolation(c8.j9.a(((float) (SystemClock.elapsedRealtime() - t11Var.Q1)) / 200.0f, 0.0f, 1.0f));
                        if (interpolation2 < 1.0f) {
                            float f19 = 1.0f - interpolation2;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f19), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f20 = (f19 * 0.5f) + 0.5f;
                            canvas2.scale(f20, f20, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            t11Var.N1.draw(canvas2);
                            canvas2.restore();
                            i13 = i7 + 1;
                            z11 = z15;
                            i11 = 14;
                        }
                    }
                    i13 = i7 + 1;
                    z11 = z15;
                    i11 = 14;
                }
            }
            ArrayList arrayList6 = this.f50860i3;
            arrayList6.clear();
            ArrayList arrayList7 = this.f50859h3;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i17 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f50858g3;
                if (i17 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i17);
                d11 d11Var2 = (d11) arrayList8.get(0);
                int R = RecyclerView.R(d11Var2);
                int i18 = 0;
                while (true) {
                    if (i18 < arrayList6.size()) {
                        if (((v01) arrayList6.get(i18)).M == R) {
                            v01Var = (v01) arrayList6.get(i18);
                            arrayList6.remove(i18);
                            break;
                        }
                        i18++;
                    } else {
                        v01Var = null;
                        break;
                    }
                }
                if (v01Var == null) {
                    if (!arrayList2.isEmpty()) {
                        v01Var = (v01) org.telegram.ui.Cells.f1.k(1, arrayList2);
                    } else {
                        v01Var = new v01(this);
                        v01Var.l(7);
                    }
                    v01Var.M = R;
                    v01Var.e();
                }
                arrayList7.add(v01Var);
                v01Var.O = arrayList8;
                canvas2.save();
                canvas2.translate(d11Var2.getLeft(), d11Var2.getY());
                v01Var.N = d11Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (d11Var2.getLeft() * 2);
                int measuredHeight = d11Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    v01Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i17++;
            }
            for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((v01) arrayList6.get(i19));
                    ((v01) arrayList6.get(i19)).O = null;
                    ((v01) arrayList6.get(i19)).k();
                } else {
                    ((v01) arrayList6.get(i19)).f();
                }
            }
            arrayList6.clear();
            for (int i20 = 0; i20 < getChildCount(); i20++) {
                View childAt2 = getChildAt(i20);
                if (childAt2 instanceof d11) {
                    d11 d11Var3 = (d11) childAt2;
                    c11 c11Var2 = d11Var3.J;
                    if (c11Var2 != null && c11Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((d11Var3.getX() + d11Var3.getMeasuredWidth()) - d11Var3.J.getMeasuredWidth()), (int) ((d11Var3.getY() + d11Var3.getMeasuredHeight()) - d11Var3.J.getMeasuredHeight()));
                        Drawable drawable2 = d11Var3.E;
                        if (drawable2 instanceof org.telegram.ui.Components.h5) {
                            imageReceiver = ((org.telegram.ui.Components.h5) drawable2).f34176k;
                        } else {
                            imageReceiver = d11Var3.h;
                        }
                        c11 c11Var3 = d11Var3.J;
                        if (!c11Var3.h) {
                            c11Var3.setImageReceiver(imageReceiver);
                        }
                        d11Var3.J.draw(canvas2);
                        canvas2.restore();
                    }
                    if (d11Var3.K != null) {
                        canvas2.save();
                        int L3 = org.telegram.messenger.g0.L(17.0f);
                        float f21 = L3;
                        canvas2.translate((int) ((d11Var3.getX() + d11Var3.getMeasuredWidth()) - f21), (int) ((d11Var3.getY() + d11Var3.getMeasuredHeight()) - f21));
                        d11Var3.K.setBounds(0, 0, L3, L3);
                        d11Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != t11Var.N1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = ch.e0.f6236c;
            if (runnable != null) {
                runnable.run();
                ch.e0.f6236c = null;
            }
        }
    }

    @Override
    public final void g1() {
        if (ch.e0.b(this)) {
            return;
        }
        super.g1();
    }

    @Override
    public final void invalidate() {
        if (ch.e0.b(this) || this.j3) {
            return;
        }
        this.j3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t11 t11Var = this.f50862l3;
        if (this == t11Var.f50036h0) {
            t11Var.V0.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t11 t11Var = this.f50862l3;
        if (this == t11Var.f50036h0) {
            t11Var.V0.R();
        }
        z1(this.f50858g3);
        z1(this.f50859h3);
        z1(this.f50860i3);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        invalidate();
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.e0.b(this)) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
