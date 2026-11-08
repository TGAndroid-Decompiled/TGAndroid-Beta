package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
public final class yw extends View implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.a6 {
    public boolean D;
    public int E;
    public final Paint f52323a;
    public final Paint f52324b;
    public final int f52325c;
    public final ArrayList d;
    public float f52326e;
    public float f52327f;
    public float h;
    public final ImageReceiver f52328n;
    public final ImageReceiver f52329r;
    public final org.telegram.ui.Components.zg0 f52330s;
    public final org.telegram.ui.Components.zg0 f52331w;
    public boolean f52332x;
    public int f52333y;

    public yw(Context context, int i7) {
        super(context);
        this.f52323a = new Paint(1);
        this.f52324b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f52328n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f52329r = imageReceiver2;
        this.f52325c = i7;
        imageReceiver.f21232y = true;
        imageReceiver2.f21232y = true;
        org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(2131624004, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f52330s = zg0Var;
        org.telegram.ui.Components.zg0 zg0Var2 = new org.telegram.ui.Components.zg0(2131624003, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f52331w = zg0Var2;
        imageReceiver.w0(zg0Var);
        imageReceiver2.w0(zg0Var2);
        imageReceiver.W(1);
        zg0Var.K(1);
        zg0Var.start();
    }

    public final void a() {
        ArrayList arrayList;
        int i7 = this.f52325c;
        ArrayList arrayList2 = org.telegram.messenger.z5.q(i7).G;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            hashMap.put(((xw) arrayList.get(i10)).f51992c, (xw) arrayList.get(i10));
            org.telegram.messenger.z5.q(i7).v((org.telegram.messenger.x5) arrayList.get(i10));
            i10++;
        }
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            String S0 = ((org.telegram.messenger.ij) arrayList2.get(i11)).S0();
            if (org.telegram.messenger.w7.G(i7).S(S0)) {
                xw xwVar = (xw) hashMap.get(S0);
                if (xwVar == null) {
                    xwVar = new xw(this, S0);
                }
                org.telegram.messenger.z5.q(i7).a(S0, null, xwVar);
                arrayList.add(xwVar);
            }
        }
        if (arrayList.size() == 0 && !this.D) {
            if (org.telegram.messenger.z5.q(i7).I.size() > 0) {
                this.f52326e = 1.0f;
                this.f52327f = 1.0f;
                this.f52332x = true;
                return;
            }
            this.f52326e = 0.0f;
            this.f52327f = 0.0f;
            this.f52332x = false;
        }
    }

    public final void b() {
        org.telegram.messenger.yr.a0(this.f52325c);
        int i7 = 0;
        long j3 = 0;
        long j10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 >= arrayList.size()) {
                break;
            }
            j3 += ((xw) arrayList.get(i7)).f51990a;
            j10 += ((xw) arrayList.get(i7)).f51991b;
            i7++;
        }
        if (j3 == 0) {
            this.f52326e = 1.0f;
        } else {
            this.f52326e = ((float) j10) / ((float) j3);
        }
        float f10 = this.f52326e;
        if (f10 > 1.0f) {
            this.f52326e = 1.0f;
        } else if (f10 < 0.0f) {
            this.f52326e = 0.0f;
        }
        this.h = ((this.f52326e - this.f52327f) * 16.0f) / 150.0f;
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f24978b5) {
            a();
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.qs.f(this.f52325c).c(this, org.telegram.messenger.qs.f24978b5);
        this.f52328n.P();
        this.f52329r.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i10 = this.f52325c;
            if (i7 < size) {
                org.telegram.messenger.z5.q(i10).v((org.telegram.messenger.x5) arrayList.get(i7));
                i7++;
            } else {
                arrayList.clear();
                org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f24978b5);
                this.f52328n.R();
                this.f52329r.R();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i7 = this.f52333y;
            int i10 = org.telegram.ui.ActionBar.k6.f28189v8;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            ImageReceiver imageReceiver = this.f52329r;
            ImageReceiver imageReceiver2 = this.f52328n;
            Paint paint = this.f52323a;
            Paint paint2 = this.f52324b;
            if (i7 != x02) {
                this.f52333y = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
                paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.f21209o1 = new PorterDuffColorFilter(x03, mode);
                imageReceiver.f21209o1 = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, i10, false), mode);
                paint2.setAlpha(100);
            }
            float f10 = this.f52327f;
            float f11 = this.f52326e;
            if (f10 != f11) {
                float f12 = this.h;
                float f13 = f10 + f12;
                this.f52327f = f13;
                if (f12 > 0.0f && f13 > f11) {
                    this.f52327f = f11;
                } else if (f12 < 0.0f && f13 < f11) {
                    this.f52327f = f11;
                } else {
                    invalidate();
                }
            }
            int L = org.telegram.messenger.g0.L(8.0f);
            float L2 = org.telegram.messenger.g0.L(1.0f);
            float L3 = org.telegram.messenger.g0.L(16.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            float measuredHeight = L + (getMeasuredHeight() / 2);
            float f14 = measuredHeight - L2;
            float f15 = measuredHeight + L2;
            rectF.set(L3, f14, getMeasuredWidth() - L3, f15);
            canvas.drawRoundRect(rectF, L2, L2, paint2);
            rectF.set(L3, f14, ((getMeasuredWidth() - (2.0f * L3)) * this.f52327f) + L3, f15);
            canvas.drawRoundRect(rectF, L2, L2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f14);
            if (this.f52326e != 1.0f) {
                this.f52332x = false;
            }
            if (this.f52332x) {
                imageReceiver.h(canvas, null);
            } else {
                imageReceiver2.h(canvas, null);
            }
            if (this.f52326e == 1.0f && !this.f52332x && this.f52330s.f40989a0 == 0) {
                org.telegram.ui.Components.zg0 zg0Var = this.f52331w;
                zg0Var.N(0, false, false);
                zg0Var.start();
                this.f52332x = true;
            }
            canvas.restore();
            if (getAlpha() != 0.0f) {
                this.D = true;
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
        int L = org.telegram.messenger.g0.L(15.0f);
        float f10 = L;
        this.f52328n.y0(f10, f10, getMeasuredWidth() - i11, getMeasuredHeight() - i11);
        this.f52329r.y0(f10, f10, getMeasuredWidth() - i11, getMeasuredHeight() - (L * 2));
    }

    @Override
    public void setAlpha(float f10) {
        if (f10 == 0.0f) {
            this.D = false;
        }
        super.setAlpha(f10);
    }

    @Override
    public void setVisibility(int i7) {
        if (i7 != 0) {
            this.D = false;
        }
        super.setVisibility(i7);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.zg0 zg0Var;
        org.telegram.ui.Components.zg0 zg0Var2 = this.f52330s;
        if (zg0Var2 != null && (zg0Var = this.f52331w) != null) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28189v8, false);
            if (x02 != this.E || zg0Var2.getColorFilter() == null) {
                this.E = x02;
                zg0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                zg0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC));
                invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
