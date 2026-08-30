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
public abstract class r51 extends org.telegram.ui.Components.sl0 {
    public final SparseArray U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public boolean Z2;
    public final LongSparseArray f37923a3;
    public final q61 f37924b3;

    public r51(q61 q61Var, Context context) {
        super(context, null);
        this.f37924b3 = q61Var;
        this.U2 = new SparseArray();
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.f37923a3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, this.f28750m2));
    }

    public static void w1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((q51) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r51.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z4;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        q51 q51Var;
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
            q61 q61Var = this.f37924b3;
            int i11 = q61Var.T;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.D1;
                if (!rect.isEmpty()) {
                    this.A1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f28748l2;
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
            if (q61Var.M1 > 0 && SystemClock.elapsedRealtime() - q61Var.M1 < q61Var.g() && q61Var.J1 != null && q61Var.K1 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.f37923a3 != null) {
                int i14 = 0;
                boolean z11 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof y51) {
                        y51 y51Var = (y51) childAt;
                        q61 q61Var2 = y51Var.S;
                        int i15 = q61Var2.T;
                        if (y51Var.isPressed()) {
                            float f14 = y51Var.K;
                            if (f14 != 1.0f && i15 != i12) {
                                y51Var.K = Utilities.clamp(f14 + 0.16f, 1.0f, 0.0f);
                                y51Var.invalidate();
                            }
                        }
                        int i16 = y51Var.f40401c;
                        if (q61Var.f37638t1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(y51Var.getX(), y51Var.getY());
                        if (y51Var.f40406w != null) {
                            lh.wa collectionParticles = q61Var.getCollectionParticles();
                            i10 = i14;
                            boolean z12 = z11;
                            collectionParticles.f(0, 0, y51Var.getWidth(), y51Var.getHeight());
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
                            canvas2.scale(f12, f13, y51Var.getWidth() / 2.0f, y51Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, y51Var.getWidth() / 2.0f, y51Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, y51Var.f40406w.intValue());
                            canvas2.restore();
                            z11 = z13;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z14 = y51Var.I;
                        if ((z14 || y51Var.J || y51Var.P > 0.0f) && !y51Var.f40400b) {
                            if (z14 || y51Var.J) {
                                float f15 = y51Var.O;
                                if (f15 < 1.0f) {
                                    y51Var.O = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f15;
                                    invalidate();
                                }
                            }
                            if (!y51Var.I && !y51Var.J) {
                                float f16 = y51Var.O;
                                if (f16 > 0.0f) {
                                    y51Var.O = f16 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (y51Var.I) {
                                interpolation = org.telegram.ui.Components.nr.h.getInterpolation(y51Var.O);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.nr.h.getInterpolation(1.0f - y51Var.O);
                            }
                            y51Var.P = Utilities.clamp(interpolation, 1.0f, 0.0f);
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
                            rectF.set(0.0f, 0.0f, y51Var.getMeasuredWidth(), y51Var.getMeasuredHeight());
                            float f17 = dp;
                            rectF.inset(f17, f17);
                            if (!y51Var.f40399a) {
                                Drawable drawable = y51Var.B;
                                if (!(drawable instanceof org.telegram.ui.Components.l5) || !((org.telegram.ui.Components.l5) drawable).c()) {
                                    paint = q61Var2.I;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (y51Var.getAlpha() * alpha * y51Var.P));
                                    float f18 = dp2;
                                    canvas2.drawRoundRect(rectF, f18, f18, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = q61Var2.J;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (y51Var.getAlpha() * alpha2 * y51Var.P));
                            float f182 = dp2;
                            canvas2.drawRoundRect(rectF, f182, f182, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (y51Var.getBackground() != null) {
                            y51Var.getBackground().setBounds((int) y51Var.getX(), (int) y51Var.getY(), y51Var.getWidth() + ((int) y51Var.getX()), y51Var.getHeight() + ((int) y51Var.getY()));
                            y51Var.getBackground().setAlpha((int) (y51Var.getAlpha() * 255));
                            y51Var.getBackground().draw(canvas2);
                            y51Var.getBackground().setAlpha(255);
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
                        arrayList3.add(y51Var);
                        x51 x51Var = y51Var.G;
                        if (x51Var != null && x51Var.getVisibility() == 0 && y51Var.G.getImageReceiver() == null && (imageReceiver2 = y51Var.f40404r) != null) {
                            y51Var.G.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z15 = z11;
                    if (z4 && view != null) {
                        int R = RecyclerView.R(view);
                        int i18 = q61Var.K1;
                        List list = q61.W1;
                        if (R == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.nr.f27347g.getInterpolation(k7.n.a(((float) (SystemClock.elapsedRealtime() - q61Var.M1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f19 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f19), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f20 = (f19 * 0.5f) + 0.5f;
                                canvas2.scale(f20, f20, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                q61Var.J1.draw(canvas2);
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
                y51 y51Var2 = (y51) arrayList8.get(0);
                int R2 = RecyclerView.R(y51Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((q51) arrayList6.get(i20)).J == R2) {
                            q51Var = (q51) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        q51Var = null;
                        break;
                    }
                }
                if (q51Var == null) {
                    if (!arrayList2.isEmpty()) {
                        q51Var = (q51) e2.c.g(1, arrayList2);
                    } else {
                        q51Var = new q51(this);
                        q51Var.l(7);
                    }
                    q51Var.J = R2;
                    q51Var.e();
                }
                arrayList7.add(q51Var);
                q51Var.L = arrayList8;
                canvas2.save();
                canvas2.translate(y51Var2.getLeft(), y51Var2.getY());
                q51Var.K = y51Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (y51Var2.getLeft() * 2);
                int measuredHeight = y51Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    q51Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((q51) arrayList6.get(i21));
                    ((q51) arrayList6.get(i21)).L = null;
                    ((q51) arrayList6.get(i21)).k();
                } else {
                    ((q51) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof y51) {
                    y51 y51Var3 = (y51) childAt2;
                    x51 x51Var2 = y51Var3.G;
                    if (x51Var2 != null && x51Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((y51Var3.getX() + y51Var3.getMeasuredWidth()) - y51Var3.G.getMeasuredWidth()), (int) ((y51Var3.getY() + y51Var3.getMeasuredHeight()) - y51Var3.G.getMeasuredHeight()));
                        Drawable drawable2 = y51Var3.B;
                        if (drawable2 instanceof org.telegram.ui.Components.l5) {
                            imageReceiver = ((org.telegram.ui.Components.l5) drawable2).f26569k;
                        } else {
                            imageReceiver = y51Var3.h;
                        }
                        x51 x51Var3 = y51Var3.G;
                        if (!x51Var3.h) {
                            x51Var3.setImageReceiver(imageReceiver);
                        }
                        y51Var3.G.draw(canvas2);
                        canvas2.restore();
                    }
                    if (y51Var3.H != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f21 = dp3;
                        canvas2.translate((int) ((y51Var3.getX() + y51Var3.getMeasuredWidth()) - f21), (int) ((y51Var3.getY() + y51Var3.getMeasuredHeight()) - f21));
                        y51Var3.H.setBounds(0, 0, dp3, dp3);
                        y51Var3.H.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != q61Var.J1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = mg.g0.f14005c;
            if (runnable != null) {
                runnable.run();
                mg.g0.f14005c = null;
            }
        }
    }

    @Override
    public final void f1() {
        if (mg.g0.b(this)) {
            return;
        }
        super.f1();
    }

    @Override
    public final void invalidate() {
        if (mg.g0.b(this) || this.Z2) {
            return;
        }
        this.Z2 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q61 q61Var = this.f37924b3;
        if (this == q61Var.f37605e0) {
            q61Var.S0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q61 q61Var = this.f37924b3;
        if (this == q61Var.f37605e0) {
            q61Var.S0.onDetachedFromWindow();
        }
        w1(this.W2);
        w1(this.X2);
        w1(this.Y2);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        invalidate();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (mg.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
