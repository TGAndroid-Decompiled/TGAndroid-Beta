package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class z0 extends View implements org.telegram.ui.Cells.g9, d3 {
    public final i50 f52479a;
    public final g4 f52480b;
    public a3 f52481c;
    public int d;
    public final int f52482e;
    public TL_iv.pageBlockAuthorDate f52483f;

    public z0(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f52482e = org.telegram.messenger.g0.L(8.0f);
        this.f52479a = i50Var;
        this.f52480b = g4Var;
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f52481c;
        if (a3Var == null) {
            return -1;
        }
        int k10 = a3Var.k() + a3Var.f43579s;
        this.f52479a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f52481c;
        if (a3Var == null) {
            return -1;
        }
        int l10 = a3Var.l() + a3Var.f43579s;
        this.f52479a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f52481c;
        if (a3Var == null) {
            return -1;
        }
        int m10 = a3Var.m() + a3Var.f43579s;
        this.f52479a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f52481c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f52481c;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f52481c;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f52483f != null && this.f52481c != null) {
            canvas.save();
            canvas.translate(this.d, this.f52482e);
            i4.t(this.f52479a, canvas, this, 0);
            this.f52481c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f52481c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.h(this.f52479a, this.f52480b, a3Var));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        TLRPC.WebPage webPage;
        Spannable spannable;
        MetricAffectingSpan[] metricAffectingSpanArr;
        ?? r42;
        int indexOf;
        int size = View.MeasureSpec.getSize(i3);
        TL_iv.pageBlockAuthorDate pageblockauthordate = this.f52483f;
        int i12 = 1;
        if (pageblockauthordate != null) {
            TL_iv.RichText richText = pageblockauthordate.author;
            g4 g4Var = this.f52480b;
            if (g4Var != null) {
                HashSet hashSet = i4.f46056d1;
                webPage = g4Var.F;
            } else {
                webPage = null;
            }
            CharSequence A = i4.A(this.f52479a, webPage, this, richText, richText, pageblockauthordate, size);
            i11 = size;
            if (A instanceof Spannable) {
                spannable = (Spannable) A;
                metricAffectingSpanArr = (MetricAffectingSpan[]) spannable.getSpans(0, A.length(), MetricAffectingSpan.class);
            } else {
                spannable = null;
                metricAffectingSpanArr = null;
            }
            if (this.f52483f.published_date != 0 && !TextUtils.isEmpty(A)) {
                r42 = org.telegram.messenger.bd.a0(null, null, 2131754040, org.telegram.messenger.bd.E0().h0().format(this.f52483f.published_date * 1000), A);
            } else if (!TextUtils.isEmpty(A)) {
                r42 = org.telegram.messenger.bd.a0(null, null, 2131754056, A);
            } else {
                r42 = org.telegram.messenger.bd.E0().h0().format(this.f52483f.published_date * 1000);
            }
            if (metricAffectingSpanArr != null) {
                try {
                    if (metricAffectingSpanArr.length > 0 && (indexOf = TextUtils.indexOf((CharSequence) r42, A)) != -1) {
                        r42 = Spannable.Factory.getInstance().newSpannable(r42);
                        for (int i13 = 0; i13 < metricAffectingSpanArr.length; i13++) {
                            MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i13];
                            r42.setSpan(metricAffectingSpan, spannable.getSpanStart(metricAffectingSpan) + indexOf, spannable.getSpanEnd(metricAffectingSpanArr[i13]) + indexOf, 33);
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            a3 o10 = i4.o(this.f52479a, this, r42, null, i11 - org.telegram.messenger.g0.L(36.0f), this.f52482e, this.f52483f, this.f52480b);
            this.f52481c = o10;
            if (o10 != null) {
                int height = this.f52481c.d.getHeight() + org.telegram.messenger.g0.L(16.0f);
                if (g4Var != null && g4Var.H) {
                    this.d = (int) Math.floor(((i11 - this.f52481c.d.getLineLeft(0)) - this.f52481c.d.getLineWidth(0)) - org.telegram.messenger.g0.L(16.0f));
                } else {
                    this.d = org.telegram.messenger.g0.L(18.0f);
                }
                a3 a3Var = this.f52481c;
                a3Var.f43579s = this.d;
                a3Var.f43580w = this.f52482e;
                i12 = height;
            } else {
                i12 = 0;
            }
        } else {
            i11 = size;
        }
        setMeasuredDimension(i11, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.j(this.f52479a, this.f52480b, motionEvent, this, this.f52481c, this.d, this.f52482e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
        this.f52483f = pageblockauthordate;
        requestLayout();
    }
}
