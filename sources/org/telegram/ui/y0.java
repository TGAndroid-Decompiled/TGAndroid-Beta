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
public final class y0 extends View implements org.telegram.ui.Cells.i9, c3 {
    public final p50 f53946a;
    public final e4 f53947b;
    public z2 f53948c;
    public int d;
    public final int f53949e;
    public TL_iv.pageBlockAuthorDate f53950f;

    public y0(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f53949e = org.telegram.messenger.g0.L(8.0f);
        this.f53946a = p50Var;
        this.f53947b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f53948c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f54332s;
        this.f53946a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f53948c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.f54332s;
        this.f53946a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f53948c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f54332s;
        this.f53946a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.n10.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f53948c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f53948c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f53948c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f53950f != null && this.f53948c != null) {
            canvas.save();
            canvas.translate(this.d, this.f53949e);
            g4.t(this.f53946a, canvas, this, 0);
            this.f53948c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f53948c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f53946a, this.f53947b, z2Var));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        TLRPC.WebPage webPage;
        Spannable spannable;
        MetricAffectingSpan[] metricAffectingSpanArr;
        ?? r42;
        int indexOf;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockAuthorDate pageblockauthordate = this.f53950f;
        int i12 = 1;
        if (pageblockauthordate != null) {
            TL_iv.RichText richText = pageblockauthordate.author;
            e4 e4Var = this.f53947b;
            if (e4Var != null) {
                HashSet hashSet = g4.f47855d1;
                webPage = e4Var.F;
            } else {
                webPage = null;
            }
            CharSequence A = g4.A(this.f53946a, webPage, this, richText, richText, pageblockauthordate, size);
            i11 = size;
            if (A instanceof Spannable) {
                spannable = (Spannable) A;
                metricAffectingSpanArr = (MetricAffectingSpan[]) spannable.getSpans(0, A.length(), MetricAffectingSpan.class);
            } else {
                spannable = null;
                metricAffectingSpanArr = null;
            }
            if (this.f53950f.published_date != 0 && !TextUtils.isEmpty(A)) {
                r42 = org.telegram.messenger.gd.a0(null, null, 2131754038, org.telegram.messenger.gd.E0().h0().format(this.f53950f.published_date * 1000), A);
            } else if (!TextUtils.isEmpty(A)) {
                r42 = org.telegram.messenger.gd.a0(null, null, 2131754054, A);
            } else {
                r42 = org.telegram.messenger.gd.E0().h0().format(this.f53950f.published_date * 1000);
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
            z2 o4 = g4.o(this.f53946a, this, r42, null, i11 - org.telegram.messenger.g0.L(36.0f), this.f53949e, this.f53950f, this.f53947b);
            this.f53948c = o4;
            if (o4 != null) {
                int height = this.f53948c.d.getHeight() + org.telegram.messenger.g0.L(16.0f);
                if (e4Var != null && e4Var.H) {
                    this.d = (int) Math.floor(((i11 - this.f53948c.d.getLineLeft(0)) - this.f53948c.d.getLineWidth(0)) - org.telegram.messenger.g0.L(16.0f));
                } else {
                    this.d = org.telegram.messenger.g0.L(18.0f);
                }
                z2 z2Var = this.f53948c;
                z2Var.f54332s = this.d;
                z2Var.f54333w = this.f53949e;
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
        if (!g4.j(this.f53946a, this.f53947b, motionEvent, this, this.f53948c, this.d, this.f53949e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
        this.f53950f = pageblockauthordate;
        requestLayout();
    }
}
