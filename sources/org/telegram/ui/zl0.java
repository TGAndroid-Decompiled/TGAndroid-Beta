package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public final class zl0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f52696a;
    public final Paint f52697b;
    public final int f52698c;
    public final int d;
    public boolean f52699e;
    public yl0[] f52700f;
    public final int[] h;
    public final Paint f52701n;
    public boolean f52702r;
    public int f52703s;
    public org.telegram.messenger.u10 f52704w;
    public yl0 f52705x;

    public zl0(int i3, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f52697b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f52701n = new Paint(1);
        this.f52702r = true;
        this.f52703s = 0;
        this.f52698c = i3;
        this.d = i10;
        this.f52696a = e6Var;
    }

    public final void a(int i3, boolean z10) {
        boolean z11;
        this.f52703s = i3;
        if (this.f52700f != null) {
            int i10 = 0;
            while (true) {
                yl0[] yl0VarArr = this.f52700f;
                if (i10 < yl0VarArr.length) {
                    yl0 yl0Var = yl0VarArr[i10];
                    if (yl0Var.f52359o == i3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    yl0Var.f52357m = z11;
                    if (!z10) {
                        yl0Var.f52358n.f(z11, true);
                    }
                    yl0Var.f52362r.invalidate();
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f52700f != null) {
            int i3 = 0;
            while (true) {
                yl0[] yl0VarArr = this.f52700f;
                if (i3 >= yl0VarArr.length) {
                    break;
                }
                yl0 yl0Var = yl0VarArr[i3];
                zl0 zl0Var = yl0Var.f52362r;
                Path path = yl0Var.f52350e;
                canvas.save();
                float a10 = yl0Var.f52356l.a(0.05f);
                RectF rectF = yl0Var.f52360p;
                canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = yl0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(yl0Var.f52347a);
                if (yl0Var.f52351f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, yl0Var.f52348b);
                }
                canvas.restore();
                if (yl0Var.f52352g) {
                    canvas.save();
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), yl0Var.f52349c);
                    canvas.restore();
                }
                float d = yl0Var.f52358n.d(yl0Var.f52357m);
                if (d > 0.0f) {
                    Paint paint = zl0Var.f52697b;
                    Paint paint2 = zl0Var.f52697b;
                    paint.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, zl0Var.f52696a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (org.telegram.messenger.g0.T1(0.5f, -2.0f, d) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (yl0Var.h) {
                    if (zl0Var.f52699e) {
                        if (yl0Var.f52355k == null) {
                            Drawable drawable = zl0Var.getContext().getResources().getDrawable(2131232243);
                            yl0Var.f52355k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        yl0Var.f52355k.setBounds((int) org.telegram.messenger.camera.q.v(yl0Var.f52355k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.camera.q.v(yl0Var.f52355k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a1.g.A(yl0Var.f52355k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a1.g.A(yl0Var.f52355k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        yl0Var.f52355k.draw(canvas);
                    } else {
                        if (yl0Var.f52353i == null) {
                            yl0Var.f52353i = new Path();
                        }
                        if (yl0Var.f52354j == null) {
                            Paint paint3 = new Paint(1);
                            yl0Var.f52354j = paint3;
                            paint3.setColor(-1);
                            yl0Var.f52354j.setStyle(Paint.Style.STROKE);
                            yl0Var.f52354j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        yl0Var.f52354j.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                        yl0Var.f52353i.rewind();
                        float W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(4.0f));
                        yl0Var.f52353i.moveTo(rectF.centerX() - W1, rectF.centerY() - W1);
                        yl0Var.f52353i.lineTo(rectF.centerX() + W1, rectF.centerY() + W1);
                        yl0Var.f52353i.moveTo(rectF.centerX() + W1, rectF.centerY() - W1);
                        yl0Var.f52353i.lineTo(rectF.centerX() - W1, rectF.centerY() + W1);
                        canvas.drawPath(yl0Var.f52353i, yl0Var.f52354j);
                    }
                }
                canvas.restore();
                i3++;
            }
        }
        if (this.f52702r) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27879d7, this.f52696a);
            Paint paint4 = this.f52701n;
            paint4.setColor(w02);
            canvas.drawRect(org.telegram.messenger.g0.L(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zl0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f52703s;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        org.telegram.messenger.xo xoVar;
        int size;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int size2 = View.MeasureSpec.getSize(i3);
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.d);
        int i13 = this.f52698c;
        if (i13 == 1) {
            xoVar = s12.f23099q4;
        } else {
            xoVar = s12.f23109r4;
        }
        if (xoVar == null) {
            size = 0;
        } else {
            size = xoVar.f26419c.size();
        }
        int i14 = 8;
        int i15 = 2;
        if (i13 == 2) {
            size = 8;
        }
        if (i13 != 2 && i13 == 1) {
            i14 = 7;
        }
        float f10 = size2;
        float f11 = i14;
        float f12 = i14 + 1;
        float min = Math.min(org.telegram.messenger.g0.L(54.0f), f10 / ((f12 * 0.28947f) + f11));
        float min2 = Math.min(0.28947f * min, org.telegram.messenger.g0.L(8.0f));
        float min3 = Math.min(0.31578946f * min, org.telegram.messenger.g0.L(11.33f));
        boolean z12 = true;
        setMeasuredDimension(size2, (int) (((i11 + 1) * min3) + ((size / i14) * min)));
        yl0[] yl0VarArr = this.f52700f;
        if (yl0VarArr == null || yl0VarArr.length != size) {
            this.f52700f = new yl0[size];
            int i16 = 0;
            while (i16 < size) {
                this.f52700f[i16] = new yl0(this);
                if (i13 == i15) {
                    yl0 yl0Var = this.f52700f[i16];
                    int i17 = this.h[i16];
                    yl0Var.f52359o = i17;
                    if (i17 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yl0Var.h = z10;
                    if (i17 < 0) {
                        i12 = org.telegram.ui.ActionBar.k6.f27863c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.k6.f28142r8;
                        i12 = iArr[i17 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i12, this.f52696a);
                    yl0Var.f52352g = false;
                    yl0Var.f52351f = false;
                    yl0Var.f52347a.setColor(w02);
                } else if (xoVar != null) {
                    ArrayList arrayList = xoVar.f26419c;
                    if (i16 >= 0 && i16 < arrayList.size()) {
                        this.f52700f[i16].f52359o = ((org.telegram.messenger.wo) arrayList.get(i16)).f26239c;
                        this.f52700f[i16].a((org.telegram.messenger.wo) arrayList.get(i16));
                    }
                }
                i16++;
                i15 = 2;
            }
        }
        float f13 = ((f10 - ((f12 * min2) + (f11 * min))) / 2.0f) + min2;
        if (this.f52700f != null) {
            int i18 = 0;
            float f14 = f13;
            float f15 = min3;
            while (i18 < this.f52700f.length) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f14, f15, f14 + min, f15 + min);
                this.f52700f[i18].f52360p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f52700f[i18].f52361q.set(rectF);
                yl0 yl0Var2 = this.f52700f[i18];
                if (yl0Var2.f52359o == this.f52703s) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                yl0Var2.f52357m = z11;
                boolean z13 = z12;
                yl0Var2.f52358n.f(z11, z13);
                yl0Var2.f52362r.invalidate();
                if (i18 % i14 == i14 - 1) {
                    f15 += min + min3;
                    f14 = f13;
                } else {
                    f14 = min + min2 + f14;
                }
                i18++;
                z12 = z13;
            }
        }
    }

    public void setCloseAsLock(boolean z10) {
        this.f52699e = z10;
    }

    public void setDivider(boolean z10) {
        this.f52702r = z10;
        invalidate();
    }

    public void setOnColorClick(org.telegram.messenger.u10 u10Var) {
        this.f52704w = u10Var;
    }

    @Override
    public final void updateColors() {
        org.telegram.messenger.xo xoVar;
        boolean z10;
        int i3;
        if (this.f52700f == null) {
            return;
        }
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.d);
        int i10 = this.f52698c;
        if (i10 == 1) {
            xoVar = s12.f23099q4;
        } else {
            xoVar = s12.f23109r4;
        }
        int i11 = 0;
        while (true) {
            yl0[] yl0VarArr = this.f52700f;
            if (i11 < yl0VarArr.length) {
                org.telegram.ui.ActionBar.e6 e6Var = this.f52696a;
                int[] iArr = this.h;
                if (i10 == 2) {
                    yl0 yl0Var = yl0VarArr[i11];
                    int i12 = iArr[i11];
                    yl0Var.f52359o = i12;
                    if (i12 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yl0Var.h = z10;
                    if (i12 < 0) {
                        i3 = org.telegram.ui.ActionBar.k6.f27863c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.k6.f28142r8;
                        i3 = iArr2[i12 % iArr2.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
                    yl0Var.f52352g = false;
                    yl0Var.f52351f = false;
                    yl0Var.f52347a.setColor(w02);
                } else if (i11 < 7 && i10 == 1) {
                    yl0 yl0Var2 = yl0VarArr[i11];
                    int i13 = iArr[i11];
                    yl0Var2.f52359o = i13;
                    int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28142r8[i13], e6Var);
                    yl0Var2.f52352g = false;
                    yl0Var2.f52351f = false;
                    yl0Var2.f52347a.setColor(w03);
                } else if (xoVar != null) {
                    ArrayList arrayList = xoVar.f26419c;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        this.f52700f[i11].f52359o = ((org.telegram.messenger.wo) arrayList.get(i11)).f26239c;
                        this.f52700f[i11].a((org.telegram.messenger.wo) arrayList.get(i11));
                    }
                }
                i11++;
            } else {
                invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
