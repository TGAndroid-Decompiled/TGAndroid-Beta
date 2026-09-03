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
public abstract class y51 extends org.telegram.ui.Components.sl0 {
    public final SparseArray U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public boolean Z2;
    public final LongSparseArray f43556a3;
    public final w61 f43557b3;

    public y51(w61 w61Var, Context context) {
        super(context, null);
        this.f43557b3 = w61Var;
        this.U2 = new SparseArray();
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.f43556a3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, this.f31106m2));
    }

    public static void v1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((x51) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y51.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z4;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        x51 x51Var;
        int i10;
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
            this.Z2 = false;
            int saveCount = canvas2.getSaveCount();
            w61 w61Var = this.f43557b3;
            int i11 = w61Var.T;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.D1;
                if (!rect.isEmpty()) {
                    this.A1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f31104l2;
                    if (aVar != null) {
                        aVar.accept(canvas2);
                    }
                    this.A1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i13 = 0;
            while (true) {
                sparseArray = this.U2;
                int size = sparseArray.size();
                arrayList = this.V2;
                if (i13 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i13++;
            }
            sparseArray.clear();
            if (w61Var.M1 > 0 && SystemClock.elapsedRealtime() - w61Var.M1 < w61Var.g() && w61Var.J1 != null && w61Var.K1 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.f43556a3 != null) {
                int i14 = 0;
                boolean z11 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof f61) {
                        f61 f61Var = (f61) childAt;
                        w61 w61Var2 = f61Var.S;
                        int i15 = w61Var2.T;
                        if (f61Var.isPressed()) {
                            float f14 = f61Var.K;
                            if (f14 != 1.0f && i15 != i12) {
                                f61Var.K = Utilities.clamp(f14 + 0.16f, 1.0f, 0.0f);
                                f61Var.invalidate();
                            }
                        }
                        int i16 = f61Var.f36679c;
                        if (w61Var.f42347t1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(f61Var.getX(), f61Var.getY());
                        if (f61Var.f36685w != null) {
                            mh.wa collectionParticles = w61Var.getCollectionParticles();
                            i10 = i14;
                            boolean z12 = z11;
                            collectionParticles.f(0, 0, f61Var.getWidth(), f61Var.getHeight());
                            if (!z12) {
                                collectionParticles.d();
                                z10 = true;
                            } else {
                                z10 = z12;
                            }
                            canvas2.save();
                            int i17 = i16 % 6;
                            boolean z13 = z10;
                            if (i17 == 2) {
                                f12 = -1.0f;
                            } else {
                                f12 = 1.0f;
                            }
                            if (i17 == 2) {
                                f13 = -1.0f;
                            } else {
                                f13 = 1.0f;
                            }
                            view = childAt;
                            canvas2.scale(f12, f13, f61Var.getWidth() / 2.0f, f61Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, f61Var.getWidth() / 2.0f, f61Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, f61Var.f36685w.intValue());
                            canvas2.restore();
                            z11 = z13;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z14 = f61Var.I;
                        if ((z14 || f61Var.J || f61Var.P > 0.0f) && !f61Var.f36678b) {
                            if (z14 || f61Var.J) {
                                float f15 = f61Var.O;
                                if (f15 < 1.0f) {
                                    f61Var.O = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f15;
                                    invalidate();
                                }
                            }
                            if (!f61Var.I && !f61Var.J) {
                                float f16 = f61Var.O;
                                if (f16 > 0.0f) {
                                    f61Var.O = f16 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (f61Var.I) {
                                interpolation = org.telegram.ui.Components.pr.h.getInterpolation(f61Var.O);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.pr.h.getInterpolation(1.0f - f61Var.O);
                            }
                            f61Var.P = Utilities.clamp(interpolation, 1.0f, 0.0f);
                            if (i15 == 6) {
                                f10 = 1.5f;
                            } else {
                                f10 = 1.0f;
                            }
                            int dp = AndroidUtilities.dp(f10);
                            if (i15 == 6) {
                                f11 = 6.0f;
                            } else {
                                f11 = 4.0f;
                            }
                            int dp2 = AndroidUtilities.dp(f11);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(0.0f, 0.0f, f61Var.getMeasuredWidth(), f61Var.getMeasuredHeight());
                            float f17 = dp;
                            rectF.inset(f17, f17);
                            if (!f61Var.f36677a) {
                                Drawable drawable = f61Var.B;
                                if (!(drawable instanceof org.telegram.ui.Components.l5) || !((org.telegram.ui.Components.l5) drawable).c()) {
                                    paint = w61Var2.I;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (f61Var.getAlpha() * alpha * f61Var.P));
                                    float f18 = dp2;
                                    canvas2.drawRoundRect(rectF, f18, f18, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = w61Var2.J;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (f61Var.getAlpha() * alpha2 * f61Var.P));
                            float f182 = dp2;
                            canvas2.drawRoundRect(rectF, f182, f182, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (f61Var.getBackground() != null) {
                            f61Var.getBackground().setBounds((int) f61Var.getX(), (int) f61Var.getY(), f61Var.getWidth() + ((int) f61Var.getX()), f61Var.getHeight() + ((int) f61Var.getY()));
                            f61Var.getBackground().setAlpha((int) (f61Var.getAlpha() * 255));
                            f61Var.getBackground().draw(canvas2);
                            f61Var.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) e2.c.g(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(f61Var);
                        e61 e61Var = f61Var.G;
                        if (e61Var != null && e61Var.getVisibility() == 0 && f61Var.G.getImageReceiver() == null && (imageReceiver2 = f61Var.f36683r) != null) {
                            f61Var.G.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z15 = z11;
                    if (z4 && view != null) {
                        int R = RecyclerView.R(view);
                        int i18 = w61Var.K1;
                        List list = w61.W1;
                        if (R == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.pr.f30169g.getInterpolation(k7.o.a(((float) (SystemClock.elapsedRealtime() - w61Var.M1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f19 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f19), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f20 = (f19 * 0.5f) + 0.5f;
                                canvas2.scale(f20, f20, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                w61Var.J1.draw(canvas2);
                                canvas2.restore();
                                i14 = i10 + 1;
                                z11 = z15;
                                i12 = 14;
                            }
                        }
                    }
                    i14 = i10 + 1;
                    z11 = z15;
                    i12 = 14;
                }
            }
            ArrayList arrayList6 = this.Y2;
            arrayList6.clear();
            ArrayList arrayList7 = this.X2;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i19 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.W2;
                if (i19 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i19);
                f61 f61Var2 = (f61) arrayList8.get(0);
                int R2 = RecyclerView.R(f61Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((x51) arrayList6.get(i20)).J == R2) {
                            x51Var = (x51) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        x51Var = null;
                        break;
                    }
                }
                if (x51Var == null) {
                    if (!arrayList2.isEmpty()) {
                        x51Var = (x51) e2.c.g(1, arrayList2);
                    } else {
                        x51Var = new x51(this);
                        x51Var.l(7);
                    }
                    x51Var.J = R2;
                    x51Var.e();
                }
                arrayList7.add(x51Var);
                x51Var.L = arrayList8;
                canvas2.save();
                canvas2.translate(f61Var2.getLeft(), f61Var2.getY());
                x51Var.K = f61Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (f61Var2.getLeft() * 2);
                int measuredHeight = f61Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    x51Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((x51) arrayList6.get(i21));
                    ((x51) arrayList6.get(i21)).L = null;
                    ((x51) arrayList6.get(i21)).k();
                } else {
                    ((x51) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof f61) {
                    f61 f61Var3 = (f61) childAt2;
                    e61 e61Var2 = f61Var3.G;
                    if (e61Var2 != null && e61Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((f61Var3.getX() + f61Var3.getMeasuredWidth()) - f61Var3.G.getMeasuredWidth()), (int) ((f61Var3.getY() + f61Var3.getMeasuredHeight()) - f61Var3.G.getMeasuredHeight()));
                        Drawable drawable2 = f61Var3.B;
                        if (drawable2 instanceof org.telegram.ui.Components.l5) {
                            imageReceiver = ((org.telegram.ui.Components.l5) drawable2).f28637k;
                        } else {
                            imageReceiver = f61Var3.h;
                        }
                        e61 e61Var3 = f61Var3.G;
                        if (!e61Var3.h) {
                            e61Var3.setImageReceiver(imageReceiver);
                        }
                        f61Var3.G.draw(canvas2);
                        canvas2.restore();
                    }
                    if (f61Var3.H != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f21 = dp3;
                        canvas2.translate((int) ((f61Var3.getX() + f61Var3.getMeasuredWidth()) - f21), (int) ((f61Var3.getY() + f61Var3.getMeasuredHeight()) - f21));
                        f61Var3.H.setBounds(0, 0, dp3, dp3);
                        f61Var3.H.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != w61Var.J1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = ng.g0.f16071c;
            if (runnable != null) {
                runnable.run();
                ng.g0.f16071c = null;
            }
        }
    }

    @Override
    public final void e1() {
        if (ng.g0.b(this)) {
            return;
        }
        super.e1();
    }

    @Override
    public final void invalidate() {
        if (ng.g0.b(this) || this.Z2) {
            return;
        }
        this.Z2 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w61 w61Var = this.f43557b3;
        if (this == w61Var.f42314e0) {
            w61Var.S0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w61 w61Var = this.f43557b3;
        if (this == w61Var.f42314e0) {
            w61Var.S0.onDetachedFromWindow();
        }
        v1(this.W2);
        v1(this.X2);
        v1(this.Y2);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        invalidate();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ng.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
