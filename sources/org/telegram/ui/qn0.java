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
public final class qn0 extends View implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f41007a;
    public final Paint f41008b;
    public final int f41009c;
    public final int d;
    public boolean e;
    public pn0[] f41010f;
    public final int[] h;
    public final Paint f41011n;
    public boolean f41012r;
    public int f41013s;
    public org.telegram.messenger.q20 f41014w;
    public pn0 f41015x;

    public qn0(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f41008b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f41011n = new Paint(1);
        this.f41012r = true;
        this.f41013s = 0;
        this.f41009c = i10;
        this.d = i11;
        this.f41007a = p6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f41013s = i10;
        if (this.f41010f != null) {
            int i11 = 0;
            while (true) {
                pn0[] pn0VarArr = this.f41010f;
                if (i11 < pn0VarArr.length) {
                    pn0 pn0Var = pn0VarArr[i11];
                    if (pn0Var.f40702o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    pn0Var.f40700m = z11;
                    if (!z10) {
                        pn0Var.f40701n.f(z11, true);
                    }
                    pn0Var.f40705r.invalidate();
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f41010f != null) {
            int i10 = 0;
            while (true) {
                pn0[] pn0VarArr = this.f41010f;
                if (i10 >= pn0VarArr.length) {
                    break;
                }
                pn0 pn0Var = pn0VarArr[i10];
                qn0 qn0Var = pn0Var.f40705r;
                Path path = pn0Var.e;
                canvas.save();
                float a2 = pn0Var.f40699l.a(0.05f);
                RectF rectF = pn0Var.f40703p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = pn0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(pn0Var.f40691a);
                if (pn0Var.f40694f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, pn0Var.f40692b);
                }
                canvas.restore();
                if (pn0Var.f40695g) {
                    canvas.save();
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(2.33f), org.telegram.messenger.i0.L(2.33f), pn0Var.f40693c);
                    canvas.restore();
                }
                float d = pn0Var.f40701n.d(pn0Var.f40700m);
                if (d > 0.0f) {
                    Paint paint = qn0Var.f41008b;
                    Paint paint2 = qn0Var.f41008b;
                    paint.setStrokeWidth(org.telegram.messenger.i0.N(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, qn0Var.f41007a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (org.telegram.messenger.i0.T1(0.5f, -2.0f, d) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (pn0Var.h) {
                    if (qn0Var.e) {
                        if (pn0Var.f40698k == null) {
                            Drawable drawable = qn0Var.getContext().getResources().getDrawable(2131232242);
                            pn0Var.f40698k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        pn0Var.f40698k.setBounds((int) org.telegram.messenger.z20.v(pn0Var.f40698k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.z20.v(pn0Var.f40698k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a1.g.c(pn0Var.f40698k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a1.g.c(pn0Var.f40698k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        pn0Var.f40698k.draw(canvas);
                    } else {
                        if (pn0Var.f40696i == null) {
                            pn0Var.f40696i = new Path();
                        }
                        if (pn0Var.f40697j == null) {
                            Paint paint3 = new Paint(1);
                            pn0Var.f40697j = paint3;
                            paint3.setColor(-1);
                            pn0Var.f40697j.setStyle(Paint.Style.STROKE);
                            pn0Var.f40697j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        pn0Var.f40697j.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
                        pn0Var.f40696i.rewind();
                        float W1 = org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(4.0f));
                        pn0Var.f40696i.moveTo(rectF.centerX() - W1, rectF.centerY() - W1);
                        pn0Var.f40696i.lineTo(rectF.centerX() + W1, rectF.centerY() + W1);
                        pn0Var.f40696i.moveTo(rectF.centerX() + W1, rectF.centerY() - W1);
                        pn0Var.f40696i.lineTo(rectF.centerX() - W1, rectF.centerY() + W1);
                        canvas.drawPath(pn0Var.f40696i, pn0Var.f40697j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f41012r) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d7, this.f41007a);
            Paint paint4 = this.f41011n;
            paint4.setColor(w02);
            canvas.drawRect(org.telegram.messenger.i0.L(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.i0.L(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f41013s;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.messenger.lp lpVar;
        int size;
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        int size2 = View.MeasureSpec.getSize(i10);
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.d);
        int i14 = this.f41009c;
        if (i14 == 1) {
            lpVar = r12.f18888r4;
        } else {
            lpVar = r12.f18898s4;
        }
        if (lpVar == null) {
            size = 0;
        } else {
            size = lpVar.f16782c.size();
        }
        int i15 = 8;
        int i16 = 2;
        if (i14 == 2) {
            size = 8;
        }
        if (i14 != 2 && i14 == 1) {
            i15 = 7;
        }
        float f7 = size2;
        float f10 = i15;
        float f11 = i15 + 1;
        float min = Math.min(org.telegram.messenger.i0.L(54.0f), f7 / ((f11 * 0.28947f) + f10));
        float min2 = Math.min(0.28947f * min, org.telegram.messenger.i0.L(8.0f));
        float min3 = Math.min(0.31578946f * min, org.telegram.messenger.i0.L(11.33f));
        boolean z12 = true;
        setMeasuredDimension(size2, (int) (((i12 + 1) * min3) + ((size / i15) * min)));
        pn0[] pn0VarArr = this.f41010f;
        if (pn0VarArr == null || pn0VarArr.length != size) {
            this.f41010f = new pn0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f41010f[i17] = new pn0(this);
                if (i14 == i16) {
                    pn0 pn0Var = this.f41010f[i17];
                    int i18 = this.h[i17];
                    pn0Var.f40702o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pn0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.t6.f20912c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.t6.f21188r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.t6.w0(i13, this.f41007a);
                    pn0Var.f40695g = false;
                    pn0Var.f40694f = false;
                    pn0Var.f40691a.setColor(w02);
                } else if (lpVar != null) {
                    ArrayList arrayList = lpVar.f16782c;
                    if (i17 >= 0 && i17 < arrayList.size()) {
                        this.f41010f[i17].f40702o = ((org.telegram.messenger.kp) arrayList.get(i17)).f16621c;
                        this.f41010f[i17].a((org.telegram.messenger.kp) arrayList.get(i17));
                    }
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f41010f != null) {
            int i19 = 0;
            float f13 = f12;
            float f14 = min3;
            while (i19 < this.f41010f.length) {
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f41010f[i19].f40703p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f41010f[i19].f40704q.set(rectF);
                pn0 pn0Var2 = this.f41010f[i19];
                if (pn0Var2.f40702o == this.f41013s) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                pn0Var2.f40700m = z11;
                boolean z13 = z12;
                pn0Var2.f40701n.f(z11, z13);
                pn0Var2.f40705r.invalidate();
                if (i19 % i15 == i15 - 1) {
                    f14 += min + min3;
                    f13 = f12;
                } else {
                    f13 = min + min2 + f13;
                }
                i19++;
                z12 = z13;
            }
        }
    }

    public void setCloseAsLock(boolean z10) {
        this.e = z10;
    }

    public void setDivider(boolean z10) {
        this.f41012r = z10;
        invalidate();
    }

    public void setOnColorClick(org.telegram.messenger.q20 q20Var) {
        this.f41014w = q20Var;
    }

    @Override
    public final void updateColors() {
        org.telegram.messenger.lp lpVar;
        boolean z10;
        int i10;
        if (this.f41010f == null) {
            return;
        }
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.d);
        int i11 = this.f41009c;
        if (i11 == 1) {
            lpVar = r12.f18888r4;
        } else {
            lpVar = r12.f18898s4;
        }
        int i12 = 0;
        while (true) {
            pn0[] pn0VarArr = this.f41010f;
            if (i12 < pn0VarArr.length) {
                org.telegram.ui.ActionBar.p6 p6Var = this.f41007a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    pn0 pn0Var = pn0VarArr[i12];
                    int i13 = iArr[i12];
                    pn0Var.f40702o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pn0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.t6.f20912c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.t6.f21188r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
                    pn0Var.f40695g = false;
                    pn0Var.f40694f = false;
                    pn0Var.f40691a.setColor(w02);
                } else if (i12 < 7 && i11 == 1) {
                    pn0 pn0Var2 = pn0VarArr[i12];
                    int i14 = iArr[i12];
                    pn0Var2.f40702o = i14;
                    int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21188r8[i14], p6Var);
                    pn0Var2.f40695g = false;
                    pn0Var2.f40694f = false;
                    pn0Var2.f40691a.setColor(w03);
                } else if (lpVar != null) {
                    ArrayList arrayList = lpVar.f16782c;
                    if (i12 >= 0 && i12 < arrayList.size()) {
                        this.f41010f[i12].f40702o = ((org.telegram.messenger.kp) arrayList.get(i12)).f16621c;
                        this.f41010f[i12].a((org.telegram.messenger.kp) arrayList.get(i12));
                    }
                }
                i12++;
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
