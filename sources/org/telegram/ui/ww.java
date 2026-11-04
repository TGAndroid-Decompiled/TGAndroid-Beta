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
public final class ww extends View implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public int F;
    public final Paint f51612a;
    public final Paint f51613b;
    public final int f51614c;
    public final ArrayList d;
    public float f51615e;
    public float f51616f;
    public float h;
    public final ImageReceiver f51617n;
    public final ImageReceiver f51618r;
    public final org.telegram.ui.Components.ch0 f51619s;
    public final org.telegram.ui.Components.ch0 f51620w;
    public boolean f51621x;
    public int f51622y;

    public ww(Context context, int i3) {
        super(context);
        this.f51612a = new Paint(1);
        this.f51613b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f51617n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f51618r = imageReceiver2;
        this.f51614c = i3;
        imageReceiver.f21282y = true;
        imageReceiver2.f21282y = true;
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624004, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f51619s = ch0Var;
        org.telegram.ui.Components.ch0 ch0Var2 = new org.telegram.ui.Components.ch0(2131624003, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f51620w = ch0Var2;
        imageReceiver.w0(ch0Var);
        imageReceiver2.w0(ch0Var2);
        imageReceiver.W(1);
        ch0Var.K(1);
        ch0Var.start();
    }

    public final void a() {
        ArrayList arrayList;
        int i3 = this.f51614c;
        ArrayList arrayList2 = org.telegram.messenger.z5.q(i3).H;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            hashMap.put(((vw) arrayList.get(i10)).f50623c, (vw) arrayList.get(i10));
            org.telegram.messenger.z5.q(i3).v((org.telegram.messenger.x5) arrayList.get(i10));
            i10++;
        }
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            String S0 = ((org.telegram.messenger.zi) arrayList2.get(i11)).S0();
            if (org.telegram.messenger.w7.G(i3).T(S0)) {
                vw vwVar = (vw) hashMap.get(S0);
                if (vwVar == null) {
                    vwVar = new vw(this, S0);
                }
                org.telegram.messenger.z5.q(i3).a(S0, null, vwVar);
                arrayList.add(vwVar);
            }
        }
        if (arrayList.size() == 0 && !this.E) {
            if (org.telegram.messenger.z5.q(i3).J.size() > 0) {
                this.f51615e = 1.0f;
                this.f51616f = 1.0f;
                this.f51621x = true;
                return;
            }
            this.f51615e = 0.0f;
            this.f51616f = 0.0f;
            this.f51621x = false;
        }
    }

    public final void b() {
        org.telegram.messenger.qr.a0(this.f51614c);
        int i3 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i3 >= arrayList.size()) {
                break;
            }
            j10 += ((vw) arrayList.get(i3)).f50621a;
            j11 += ((vw) arrayList.get(i3)).f50622b;
            i3++;
        }
        if (j10 == 0) {
            this.f51615e = 1.0f;
        } else {
            this.f51615e = ((float) j11) / ((float) j10);
        }
        float f10 = this.f51615e;
        if (f10 > 1.0f) {
            this.f51615e = 1.0f;
        } else if (f10 < 0.0f) {
            this.f51615e = 0.0f;
        }
        this.h = ((this.f51615e - this.f51616f) * 16.0f) / 150.0f;
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23207b5) {
            a();
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.hs.f(this.f51614c).c(this, org.telegram.messenger.hs.f23207b5);
        this.f51617n.P();
        this.f51618r.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i10 = this.f51614c;
            if (i3 < size) {
                org.telegram.messenger.z5.q(i10).v((org.telegram.messenger.x5) arrayList.get(i3));
                i3++;
            } else {
                arrayList.clear();
                org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.f23207b5);
                this.f51617n.R();
                this.f51618r.R();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i3 = this.f51622y;
            int i10 = org.telegram.ui.ActionBar.k6.f28216v8;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            ImageReceiver imageReceiver = this.f51618r;
            ImageReceiver imageReceiver2 = this.f51617n;
            Paint paint = this.f51612a;
            Paint paint2 = this.f51613b;
            if (i3 != x02) {
                this.f51622y = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
                paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.f21261p1 = new PorterDuffColorFilter(x03, mode);
                imageReceiver.f21261p1 = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, i10, false), mode);
                paint2.setAlpha(100);
            }
            float f10 = this.f51616f;
            float f11 = this.f51615e;
            if (f10 != f11) {
                float f12 = this.h;
                float f13 = f10 + f12;
                this.f51616f = f13;
                if (f12 > 0.0f && f13 > f11) {
                    this.f51616f = f11;
                } else if (f12 < 0.0f && f13 < f11) {
                    this.f51616f = f11;
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
            rectF.set(L3, f14, ((getMeasuredWidth() - (2.0f * L3)) * this.f51616f) + L3, f15);
            canvas.drawRoundRect(rectF, L2, L2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f14);
            if (this.f51615e != 1.0f) {
                this.f51621x = false;
            }
            if (this.f51621x) {
                imageReceiver.h(canvas, null);
            } else {
                imageReceiver2.h(canvas, null);
            }
            if (this.f51615e == 1.0f && !this.f51621x && this.f51619s.f32721b0 == 0) {
                org.telegram.ui.Components.ch0 ch0Var = this.f51620w;
                ch0Var.N(0, false, false);
                ch0Var.start();
                this.f51621x = true;
            }
            canvas.restore();
            if (getAlpha() != 0.0f) {
                this.E = true;
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
        int L = org.telegram.messenger.g0.L(15.0f);
        float f10 = L;
        this.f51617n.y0(f10, f10, getMeasuredWidth() - i11, getMeasuredHeight() - i11);
        this.f51618r.y0(f10, f10, getMeasuredWidth() - i11, getMeasuredHeight() - (L * 2));
    }

    @Override
    public void setAlpha(float f10) {
        if (f10 == 0.0f) {
            this.E = false;
        }
        super.setAlpha(f10);
    }

    @Override
    public void setVisibility(int i3) {
        if (i3 != 0) {
            this.E = false;
        }
        super.setVisibility(i3);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.ch0 ch0Var;
        org.telegram.ui.Components.ch0 ch0Var2 = this.f51619s;
        if (ch0Var2 != null && (ch0Var = this.f51620w) != null) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28216v8, false);
            if (x02 != this.F || ch0Var2.getColorFilter() == null) {
                this.F = x02;
                ch0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                ch0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC));
                invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
