package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public final class z0 extends View implements org.telegram.messenger.z5, org.telegram.ui.Cells.j9 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public TL_iv.pageBlockAudio K;
    public TLRPC.Document L;
    public org.telegram.messenger.kj M;
    public final l60 f43759a;
    public final f4 f43760b;
    public z2 f43761c;
    public z2 d;
    public final RadialProgress2 e;
    public final org.telegram.ui.Components.ln0 f43762f;
    public boolean h;
    public int f43763n;
    public final int f43764r;
    public int f43765s;
    public String f43766w;
    public z2 f43767x;
    public StaticLayout f43768y;

    public z0(Context context, l60 l60Var, f4 f4Var) {
        super(context);
        this.f43764r = org.telegram.messenger.i0.L(58.0f);
        this.f43759a = l60Var;
        this.f43760b = f4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.e = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.i0.L(24.0f));
        this.J = org.telegram.messenger.b6.q(((h4) l60Var).X).k();
        org.telegram.ui.Components.ln0 ln0Var = new org.telegram.ui.Components.ln0(this);
        this.f43762f = ln0Var;
        ln0Var.h = new y0(this, 0);
    }

    private int getIconForCurrentState() {
        int i10 = this.H;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void D(boolean z10) {
        a(true);
    }

    @Override
    public final void N(String str) {
        this.e.p(true, 1.0f);
        a(true);
    }

    public final void a(boolean z10) {
        int i10 = ((h4) this.f43759a).X;
        String r10 = org.telegram.messenger.b8.r(null, this.L);
        org.telegram.messenger.b8.G(i10);
        boolean exists = org.telegram.messenger.b8.K(this.L, null, true, true).exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            org.telegram.messenger.b6.q(i10).v(this);
            boolean I = MediaController.B().I(this.M);
            if (I && (!I || !MediaController.B().H())) {
                this.H = 1;
            } else {
                this.H = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.b6.q(i10).a(r10, null, this);
            if (!org.telegram.messenger.b8.G(i10).T(r10)) {
                this.H = 2;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.H = 3;
                Float w9 = org.telegram.messenger.ic.D().w(r10);
                if (w9 != null) {
                    radialProgress2.p(z10, w9.floatValue());
                } else {
                    radialProgress2.p(z10, 0.0f);
                }
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            }
        }
        b();
    }

    public final void b() {
        org.telegram.messenger.kj kjVar;
        int i10;
        if (this.L != null && (kjVar = this.M) != null) {
            org.telegram.ui.Components.ln0 ln0Var = this.f43762f;
            if (!ln0Var.e) {
                ln0Var.h(kjVar.f16652b0);
            }
            if (MediaController.B().I(this.M)) {
                i10 = this.M.f16675g0;
            } else {
                int i11 = 0;
                while (true) {
                    if (i11 < this.L.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = this.L.attributes.get(i11);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            i10 = (int) documentAttribute.duration;
                            break;
                        }
                        i11++;
                    } else {
                        i10 = 0;
                        break;
                    }
                }
            }
            String g02 = org.telegram.messenger.i0.g0(i10, false, false);
            String str = this.f43766w;
            if (str == null || !str.equals(g02)) {
                this.f43766w = g02;
                TextPaint textPaint = h4.f37650f1;
                textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
                this.f43768y = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            TextPaint textPaint2 = h4.f37650f1;
            ((h4) this.f43759a).getClass();
            textPaint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
            invalidate();
        }
    }

    public org.telegram.messenger.kj getMessageObject() {
        return this.M;
    }

    @Override
    public int getObserverTag() {
        return this.J;
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f43767x;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.f43761c;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
        z2 z2Var3 = this.d;
        if (z2Var3 != null) {
            arrayList.add(z2Var3);
        }
    }

    @Override
    public final void i(long j10, long j11) {
        this.e.p(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.H != 3) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        z2 z2Var = this.f43767x;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.f43761c;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
        z2 z2Var3 = this.d;
        if (z2Var3 != null) {
            z2Var3.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.b6.q(((h4) this.f43759a).X).v(this);
        z2 z2Var = this.f43767x;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.f43761c;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
        z2 z2Var3 = this.d;
        if (z2Var3 != null) {
            z2Var3.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.K == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.We;
        int i11 = org.telegram.ui.ActionBar.t6.Xe;
        int i12 = org.telegram.ui.ActionBar.t6.f21027id;
        int i13 = org.telegram.ui.ActionBar.t6.f21046jd;
        RadialProgress2 radialProgress2 = this.e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.t6.f21160pe;
        l60 l60Var = this.f43759a;
        ((h4) l60Var).getClass();
        radialProgress2.d = org.telegram.ui.ActionBar.t6.v0(i14);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.D, this.E);
        int i15 = org.telegram.ui.ActionBar.t6.f21028ie;
        ((h4) l60Var).getClass();
        int v02 = org.telegram.ui.ActionBar.t6.v0(i15);
        int i16 = org.telegram.ui.ActionBar.t6.f21047je;
        ((h4) l60Var).getClass();
        int v03 = org.telegram.ui.ActionBar.t6.v0(i16);
        int i17 = org.telegram.ui.ActionBar.t6.f21085le;
        ((h4) l60Var).getClass();
        int v04 = org.telegram.ui.ActionBar.t6.v0(i17);
        ((h4) l60Var).getClass();
        int v05 = org.telegram.ui.ActionBar.t6.v0(i17);
        int i18 = org.telegram.ui.ActionBar.t6.f21067ke;
        ((h4) l60Var).getClass();
        int v06 = org.telegram.ui.ActionBar.t6.v0(i18);
        org.telegram.ui.Components.ln0 ln0Var = this.f43762f;
        ln0Var.g(v02, v03, v04, v05, v06);
        ln0Var.b(canvas);
        canvas.restore();
        if (this.f43768y != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(54.0f) + this.F, org.telegram.messenger.i0.L(6.0f) + this.E);
            this.f43768y.draw(canvas);
            canvas.restore();
        }
        int i19 = 0;
        if (this.f43767x != null) {
            canvas.save();
            this.f43767x.f43793s = org.telegram.messenger.i0.L(54.0f) + this.F;
            this.f43767x.f43794w = this.E - org.telegram.messenger.i0.L(16.0f);
            z2 z2Var = this.f43767x;
            canvas.translate(z2Var.f43793s, z2Var.f43794w);
            h4.t(l60Var, canvas, this, 0);
            this.f43767x.d(canvas, this);
            canvas.restore();
            i19 = 1;
        }
        z2 z2Var2 = this.f43761c;
        int i20 = this.f43764r;
        if (z2Var2 != null) {
            canvas.save();
            z2 z2Var3 = this.f43761c;
            int i21 = this.f43763n;
            z2Var3.f43793s = i21;
            z2Var3.f43794w = i20;
            canvas.translate(i21, i20);
            h4.t(l60Var, canvas, this, i19);
            this.f43761c.d(canvas, this);
            canvas.restore();
            i19++;
        }
        if (this.d != null) {
            canvas.save();
            z2 z2Var4 = this.d;
            int i22 = this.f43763n;
            z2Var4.f43793s = i22;
            int i23 = this.f43765s;
            z2Var4.f43794w = i20 + i23;
            canvas.translate(i22, i20 + i23);
            h4.t(l60Var, canvas, this, i19);
            this.d.d(canvas, this);
            canvas.restore();
        }
        h4.s(canvas, l60Var, this.K, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.dd.L0(2131754874, null));
        if (this.f43767x != null) {
            sb2.append(", ");
            sb2.append(this.f43767x.d.getText());
        }
        if (this.f43761c != null) {
            sb2.append(", ");
            sb2.append(this.f43761c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        SpannableStringBuilder spannableStringBuilder;
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(54.0f);
        TL_iv.pageBlockAudio pageblockaudio = this.K;
        if (pageblockaudio != null) {
            int i13 = pageblockaudio.level;
            if (i13 > 0) {
                this.f43763n = org.telegram.messenger.i0.L(18.0f) + org.telegram.messenger.i0.L(i13 * 14);
            } else {
                this.f43763n = org.telegram.messenger.i0.L(18.0f);
            }
            int L2 = (size - this.f43763n) - org.telegram.messenger.i0.L(18.0f);
            int L3 = org.telegram.messenger.i0.L(44.0f);
            this.F = org.telegram.messenger.i0.L(16.0f);
            int L4 = org.telegram.messenger.i0.L(5.0f);
            this.G = L4;
            int i14 = this.F;
            this.e.r(i14, L4, i14 + L3, L4 + L3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.K;
            z2 o10 = h4.o(this.f43759a, this, null, pageblockaudio2.caption.text, L2, this.f43764r, pageblockaudio2, this.f43760b);
            this.f43761c = o10;
            if (o10 != null) {
                int height = this.f43761c.d.getHeight() + org.telegram.messenger.i0.L(8.0f);
                this.f43765s = height;
                L = org.telegram.messenger.m5.C(8.0f, height, L);
            }
            i12 = L;
            TL_iv.pageBlockAudio pageblockaudio3 = this.K;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i15 = this.f43764r + this.f43765s;
            if (this.f43760b.G) {
                alignment = org.telegram.ui.Components.pv0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            z2 n10 = h4.n(this.f43759a, this, null, richText, L2, i15, pageblockaudio3, alignment2, 0, this.f43760b);
            this.d = n10;
            if (n10 != null) {
                i12 += this.d.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
            }
            if (!this.h && this.K.level <= 0) {
                i12 += org.telegram.messenger.i0.L(8.0f);
            }
            String x12 = this.M.x1(false);
            String z12 = this.M.z1(false);
            int C = org.telegram.messenger.m5.C(50.0f, this.F, L3);
            this.D = C;
            int L5 = (size - C) - org.telegram.messenger.i0.L(18.0f);
            if (TextUtils.isEmpty(z12) && TextUtils.isEmpty(x12)) {
                this.f43767x = null;
                this.E = ((L3 - org.telegram.messenger.i0.L(30.0f)) / 2) + this.G;
            } else {
                if (!TextUtils.isEmpty(z12) && !TextUtils.isEmpty(x12)) {
                    spannableStringBuilder = new SpannableStringBuilder(a1.g.C(x12, " - ", z12));
                } else if (!TextUtils.isEmpty(z12)) {
                    spannableStringBuilder = new SpannableStringBuilder(z12);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(x12);
                }
                if (!TextUtils.isEmpty(x12)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.y41(org.telegram.messenger.i0.o()), 0, x12.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.t6.O2, L5, TextUtils.TruncateAt.END);
                z2 z2Var = new z2(this.f43759a);
                this.f43767x = z2Var;
                z2Var.d = new StaticLayout(ellipsize, h4.f37650f1, L5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f43767x.f43791n = this.K;
                this.E = org.telegram.messenger.i0.L(11.0f) + ((L3 - org.telegram.messenger.i0.L(30.0f)) / 2) + this.G;
            }
            this.f43762f.i(L5, org.telegram.messenger.i0.L(30.0f));
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        b();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
