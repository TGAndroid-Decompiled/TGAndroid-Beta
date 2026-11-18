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
public abstract class u01 extends org.telegram.ui.Components.ck0 {
    public final SparseArray f52399f3;
    public final ArrayList f52400g3;
    public final ArrayList f52401h3;
    public final ArrayList f52402i3;
    public final ArrayList j3;
    public boolean f52403k3;
    public final LongSparseArray f52404l3;
    public final r11 f52405m3;

    public u01(r11 r11Var, Context context) {
        super(context, null);
        this.f52405m3 = r11Var;
        this.f52399f3 = new SparseArray();
        this.f52400g3 = new ArrayList();
        this.f52401h3 = new ArrayList();
        this.f52402i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f52404l3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.u6.l(this, 20, org.telegram.ui.ActionBar.n6.f29486i6, this.f34074o2);
    }

    public static void z1(ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((t01) arrayList.get(i7)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u01.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        t01 t01Var;
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
            this.f52403k3 = false;
            int saveCount = canvas2.getSaveCount();
            r11 r11Var = this.f52405m3;
            int i10 = r11Var.f51377a0;
            int i11 = 14;
            if (i10 != 6 && i10 != 14 && i10 != 13) {
                Rect rect = this.F1;
                if (!rect.isEmpty()) {
                    this.C1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f34072n2;
                    if (aVar != null) {
                        aVar.accept(canvas2);
                    }
                    this.C1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i12 = 0;
            while (true) {
                sparseArray = this.f52399f3;
                int size = sparseArray.size();
                arrayList = this.f52400g3;
                if (i12 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i12);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i12++;
            }
            sparseArray.clear();
            if (r11Var.R1 > 0 && SystemClock.elapsedRealtime() - r11Var.R1 < r11Var.g() && r11Var.O1 != null && r11Var.P1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f52404l3 != null) {
                int i13 = 0;
                boolean z12 = false;
                while (i13 < getChildCount()) {
                    View childAt = getChildAt(i13);
                    if (childAt instanceof b11) {
                        b11 b11Var = (b11) childAt;
                        r11 r11Var2 = b11Var.W;
                        int i14 = r11Var2.f51377a0;
                        if (b11Var.isPressed()) {
                            float f14 = b11Var.O;
                            if (f14 != 1.0f && i14 != i11) {
                                b11Var.O = Utilities.i(f14 + 0.16f, 1.0f, 0.0f);
                                b11Var.invalidate();
                            }
                        }
                        int i15 = b11Var.f45713c;
                        if (r11Var.f51434y1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(b11Var.getX(), b11Var.getY());
                        if (b11Var.f45720x != null) {
                            di.ec collectionParticles = r11Var.getCollectionParticles();
                            i7 = i13;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, b11Var.getWidth(), b11Var.getHeight());
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
                            canvas2.scale(f12, f13, b11Var.getWidth() / 2.0f, b11Var.getHeight() / 2.0f);
                            canvas2.rotate((i15 % 4) * 90, b11Var.getWidth() / 2.0f, b11Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, b11Var.f45720x.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i7 = i13;
                            view = childAt;
                        }
                        boolean z15 = b11Var.M;
                        if ((z15 || b11Var.N || b11Var.T > 0.0f) && !b11Var.f45712b) {
                            if (z15 || b11Var.N) {
                                float f15 = b11Var.S;
                                if (f15 < 1.0f) {
                                    b11Var.S = ((1000.0f / org.telegram.messenger.g0.f24119r) / 240.0f) + f15;
                                    invalidate();
                                }
                            }
                            if (!b11Var.M && !b11Var.N) {
                                float f16 = b11Var.S;
                                if (f16 > 0.0f) {
                                    b11Var.S = f16 - ((1000.0f / org.telegram.messenger.g0.f24119r) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (b11Var.M) {
                                interpolation = org.telegram.ui.Components.lr.h.getInterpolation(b11Var.S);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.lr.h.getInterpolation(1.0f - b11Var.S);
                            }
                            b11Var.T = Utilities.i(interpolation, 1.0f, 0.0f);
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
                            rectF.set(0.0f, 0.0f, b11Var.getMeasuredWidth(), b11Var.getMeasuredHeight());
                            float f17 = L;
                            rectF.inset(f17, f17);
                            if (!b11Var.f45711a) {
                                Drawable drawable = b11Var.F;
                                if (!(drawable instanceof org.telegram.ui.Components.o5) || !((org.telegram.ui.Components.o5) drawable).c()) {
                                    paint = r11Var2.M;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (b11Var.getAlpha() * alpha * b11Var.T));
                                    float f18 = L2;
                                    canvas2.drawRoundRect(rectF, f18, f18, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = r11Var2.N;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (b11Var.getAlpha() * alpha2 * b11Var.T));
                            float f182 = L2;
                            canvas2.drawRoundRect(rectF, f182, f182, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (b11Var.getBackground() != null) {
                            b11Var.getBackground().setBounds((int) b11Var.getX(), (int) b11Var.getY(), b11Var.getWidth() + ((int) b11Var.getX()), b11Var.getHeight() + ((int) b11Var.getY()));
                            b11Var.getBackground().setAlpha((int) (b11Var.getAlpha() * 255));
                            b11Var.getBackground().draw(canvas2);
                            b11Var.getBackground().setAlpha(255);
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
                        arrayList3.add(b11Var);
                        a11 a11Var = b11Var.K;
                        if (a11Var != null && a11Var.getVisibility() == 0 && b11Var.K.getImageReceiver() == null && (imageReceiver2 = b11Var.f45717r) != null) {
                            b11Var.K.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i7 = i13;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i17 = r11Var.P1;
                        List list = r11.f51373b2;
                        if (R == i17 - 1) {
                            float interpolation2 = org.telegram.ui.Components.lr.f37209g.getInterpolation(c8.l9.a(((float) (SystemClock.elapsedRealtime() - r11Var.R1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f19 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f19), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f20 = (f19 * 0.5f) + 0.5f;
                                canvas2.scale(f20, f20, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                r11Var.O1.draw(canvas2);
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
            ArrayList arrayList7 = this.f52402i3;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i18 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f52401h3;
                if (i18 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i18);
                b11 b11Var2 = (b11) arrayList8.get(0);
                int R2 = RecyclerView.R(b11Var2);
                int i19 = 0;
                while (true) {
                    if (i19 < arrayList6.size()) {
                        if (((t01) arrayList6.get(i19)).N == R2) {
                            t01Var = (t01) arrayList6.get(i19);
                            arrayList6.remove(i19);
                            break;
                        }
                        i19++;
                    } else {
                        t01Var = null;
                        break;
                    }
                }
                if (t01Var == null) {
                    if (!arrayList2.isEmpty()) {
                        t01Var = (t01) p5.c.g(1, arrayList2);
                    } else {
                        t01Var = new t01(this);
                        t01Var.l(7);
                    }
                    t01Var.N = R2;
                    t01Var.e();
                }
                arrayList7.add(t01Var);
                t01Var.P = arrayList8;
                canvas2.save();
                canvas2.translate(b11Var2.getLeft(), b11Var2.getY());
                t01Var.O = b11Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (b11Var2.getLeft() * 2);
                int measuredHeight = b11Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    t01Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i18++;
            }
            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((t01) arrayList6.get(i20));
                    ((t01) arrayList6.get(i20)).P = null;
                    ((t01) arrayList6.get(i20)).k();
                } else {
                    ((t01) arrayList6.get(i20)).f();
                }
            }
            arrayList6.clear();
            for (int i21 = 0; i21 < getChildCount(); i21++) {
                View childAt2 = getChildAt(i21);
                if (childAt2 instanceof b11) {
                    b11 b11Var3 = (b11) childAt2;
                    a11 a11Var2 = b11Var3.K;
                    if (a11Var2 != null && a11Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((b11Var3.getX() + b11Var3.getMeasuredWidth()) - b11Var3.K.getMeasuredWidth()), (int) ((b11Var3.getY() + b11Var3.getMeasuredHeight()) - b11Var3.K.getMeasuredHeight()));
                        Drawable drawable2 = b11Var3.F;
                        if (drawable2 instanceof org.telegram.ui.Components.o5) {
                            imageReceiver = ((org.telegram.ui.Components.o5) drawable2).f37976k;
                        } else {
                            imageReceiver = b11Var3.h;
                        }
                        a11 a11Var3 = b11Var3.K;
                        if (!a11Var3.h) {
                            a11Var3.setImageReceiver(imageReceiver);
                        }
                        b11Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                    if (b11Var3.L != null) {
                        canvas2.save();
                        int L3 = org.telegram.messenger.g0.L(17.0f);
                        float f21 = L3;
                        canvas2.translate((int) ((b11Var3.getX() + b11Var3.getMeasuredWidth()) - f21), (int) ((b11Var3.getY() + b11Var3.getMeasuredHeight()) - f21));
                        b11Var3.L.setBounds(0, 0, L3, L3);
                        b11Var3.L.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != r11Var.O1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = ch.f0.f5352c;
            if (runnable != null) {
                runnable.run();
                ch.f0.f5352c = null;
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
        if (ch.f0.b(this) || this.f52403k3) {
            return;
        }
        this.f52403k3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r11 r11Var = this.f52405m3;
        if (this == r11Var.f51398i0) {
            r11Var.W0.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r11 r11Var = this.f52405m3;
        if (this == r11Var.f51398i0) {
            r11Var.W0.R();
        }
        z1(this.f52401h3);
        z1(this.f52402i3);
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
