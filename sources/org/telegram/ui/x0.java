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
public final class x0 extends View implements org.telegram.messenger.y5, org.telegram.ui.Cells.h9 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final int K;
    public TL_iv.pageBlockAudio L;
    public TLRPC.Document M;
    public org.telegram.messenger.fj N;
    public final p50 f53565a;
    public final e4 f53566b;
    public z2 f53567c;
    public z2 d;
    public final RadialProgress2 f53568e;
    public final org.telegram.ui.Components.vm0 f53569f;
    public boolean h;
    public int f53570n;
    public final int f53571r;
    public int f53572s;
    public String f53573w;
    public z2 f53574x;
    public StaticLayout f53575y;

    public x0(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f53571r = org.telegram.messenger.g0.L(58.0f);
        this.f53565a = p50Var;
        this.f53566b = e4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f53568e = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        this.K = org.telegram.messenger.a6.q(((g4) p50Var).Y).k();
        org.telegram.ui.Components.vm0 vm0Var = new org.telegram.ui.Components.vm0(this);
        this.f53569f = vm0Var;
        vm0Var.h = new w0(this, 0);
    }

    private int getIconForCurrentState() {
        int i7 = this.I;
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        if (i7 == 3) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void C(boolean z10) {
        a(true);
    }

    @Override
    public final void N(String str) {
        this.f53568e.p(true, 1.0f);
        a(true);
    }

    public final void a(boolean z10) {
        int i7 = ((g4) this.f53565a).Y;
        String r10 = org.telegram.messenger.w7.r(null, this.M);
        org.telegram.messenger.w7.G(i7);
        boolean exists = org.telegram.messenger.w7.J(this.M, null, true, true).exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.f53568e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            org.telegram.messenger.a6.q(i7).v(this);
            boolean I = MediaController.B().I(this.N);
            if (I && (!I || !MediaController.B().H())) {
                this.I = 1;
            } else {
                this.I = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.a6.q(i7).a(r10, null, this);
            if (!org.telegram.messenger.w7.G(i7).S(r10)) {
                this.I = 2;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.I = 3;
                Float w10 = org.telegram.messenger.ec.D().w(r10);
                if (w10 != null) {
                    radialProgress2.p(z10, w10.floatValue());
                } else {
                    radialProgress2.p(z10, 0.0f);
                }
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            }
        }
        b();
    }

    public final void b() {
        org.telegram.messenger.fj fjVar;
        int i7;
        if (this.M != null && (fjVar = this.N) != null) {
            org.telegram.ui.Components.vm0 vm0Var = this.f53569f;
            if (!vm0Var.f40710e) {
                vm0Var.h(fjVar.f23928b0);
            }
            if (MediaController.B().I(this.N)) {
                i7 = this.N.f23960i0;
            } else {
                int i10 = 0;
                while (true) {
                    if (i10 < this.M.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = this.M.attributes.get(i10);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            i7 = (int) documentAttribute.duration;
                            break;
                        }
                        i10++;
                    } else {
                        i7 = 0;
                        break;
                    }
                }
            }
            String g02 = org.telegram.messenger.g0.g0(i7, false, false);
            String str = this.f53573w;
            if (str == null || !str.equals(g02)) {
                this.f53573w = g02;
                TextPaint textPaint = g4.f47894g1;
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                this.f53575y = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            TextPaint textPaint2 = g4.f47894g1;
            ((g4) this.f53565a).getClass();
            textPaint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
            invalidate();
        }
    }

    public org.telegram.messenger.fj getMessageObject() {
        return this.N;
    }

    @Override
    public int getObserverTag() {
        return this.K;
    }

    @Override
    public final void i(long j3, long j10) {
        this.f53568e.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.I != 3) {
            a(true);
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f53574x;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.f53567c;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
        z2 z2Var3 = this.d;
        if (z2Var3 != null) {
            arrayList.add(z2Var3);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        z2 z2Var = this.f53574x;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.f53567c;
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
        org.telegram.messenger.a6.q(((g4) this.f53565a).Y).v(this);
        z2 z2Var = this.f53574x;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.f53567c;
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
        if (this.L == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.n6.Ze;
        int i10 = org.telegram.ui.ActionBar.n6.f29347af;
        int i11 = org.telegram.ui.ActionBar.n6.f29550ld;
        int i12 = org.telegram.ui.ActionBar.n6.f29566md;
        RadialProgress2 radialProgress2 = this.f53568e;
        radialProgress2.g(i7, i10, i11, i12);
        int i13 = org.telegram.ui.ActionBar.n6.f29681se;
        p50 p50Var = this.f53565a;
        ((g4) p50Var).getClass();
        radialProgress2.d = org.telegram.ui.ActionBar.n6.v0(i13);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.E, this.F);
        int i14 = org.telegram.ui.ActionBar.n6.le;
        ((g4) p50Var).getClass();
        int v02 = org.telegram.ui.ActionBar.n6.v0(i14);
        int i15 = org.telegram.ui.ActionBar.n6.f29567me;
        ((g4) p50Var).getClass();
        int v03 = org.telegram.ui.ActionBar.n6.v0(i15);
        int i16 = org.telegram.ui.ActionBar.n6.f29604oe;
        ((g4) p50Var).getClass();
        int v04 = org.telegram.ui.ActionBar.n6.v0(i16);
        ((g4) p50Var).getClass();
        int v05 = org.telegram.ui.ActionBar.n6.v0(i16);
        int i17 = org.telegram.ui.ActionBar.n6.ne;
        ((g4) p50Var).getClass();
        int v06 = org.telegram.ui.ActionBar.n6.v0(i17);
        org.telegram.ui.Components.vm0 vm0Var = this.f53569f;
        vm0Var.g(v02, v03, v04, v05, v06);
        vm0Var.b(canvas);
        canvas.restore();
        if (this.f53575y != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.G, org.telegram.messenger.g0.L(6.0f) + this.F);
            this.f53575y.draw(canvas);
            canvas.restore();
        }
        int i18 = 0;
        if (this.f53574x != null) {
            canvas.save();
            this.f53574x.f54373s = org.telegram.messenger.g0.L(54.0f) + this.G;
            this.f53574x.f54374w = this.F - org.telegram.messenger.g0.L(16.0f);
            z2 z2Var = this.f53574x;
            canvas.translate(z2Var.f54373s, z2Var.f54374w);
            g4.t(p50Var, canvas, this, 0);
            this.f53574x.d(canvas, this);
            canvas.restore();
            i18 = 1;
        }
        z2 z2Var2 = this.f53567c;
        int i19 = this.f53571r;
        if (z2Var2 != null) {
            canvas.save();
            z2 z2Var3 = this.f53567c;
            int i20 = this.f53570n;
            z2Var3.f54373s = i20;
            z2Var3.f54374w = i19;
            canvas.translate(i20, i19);
            g4.t(p50Var, canvas, this, i18);
            this.f53567c.d(canvas, this);
            canvas.restore();
            i18++;
        }
        if (this.d != null) {
            canvas.save();
            z2 z2Var4 = this.d;
            int i21 = this.f53570n;
            z2Var4.f54373s = i21;
            int i22 = this.f53572s;
            z2Var4.f54374w = i19 + i22;
            canvas.translate(i21, i19 + i22);
            g4.t(p50Var, canvas, this, i18);
            this.d.d(canvas, this);
            canvas.restore();
        }
        g4.s(canvas, p50Var, this.L, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.gd.M0(2131754874, null));
        if (this.f53574x != null) {
            sb2.append(", ");
            sb2.append(this.f53574x.d.getText());
        }
        if (this.f53567c != null) {
            sb2.append(", ");
            sb2.append(this.f53567c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        SpannableStringBuilder spannableStringBuilder;
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(54.0f);
        TL_iv.pageBlockAudio pageblockaudio = this.L;
        if (pageblockaudio != null) {
            int i12 = pageblockaudio.level;
            if (i12 > 0) {
                this.f53570n = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(i12 * 14);
            } else {
                this.f53570n = org.telegram.messenger.g0.L(18.0f);
            }
            int L2 = (size - this.f53570n) - org.telegram.messenger.g0.L(18.0f);
            int L3 = org.telegram.messenger.g0.L(44.0f);
            this.G = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(5.0f);
            this.H = L4;
            int i13 = this.G;
            this.f53568e.r(i13, L4, i13 + L3, L4 + L3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.L;
            z2 o4 = g4.o(this.f53565a, this, null, pageblockaudio2.caption.text, L2, this.f53571r, pageblockaudio2, this.f53566b);
            this.f53567c = o4;
            if (o4 != null) {
                int height = this.f53567c.d.getHeight() + org.telegram.messenger.g0.L(8.0f);
                this.f53572s = height;
                L = org.telegram.messenger.f3.C(8.0f, height, L);
            }
            i11 = L;
            TL_iv.pageBlockAudio pageblockaudio3 = this.L;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i14 = this.f53571r + this.f53572s;
            if (this.f53566b.H) {
                alignment = org.telegram.ui.Components.wu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            z2 n10 = g4.n(this.f53565a, this, null, richText, L2, i14, pageblockaudio3, alignment2, 0, this.f53566b);
            this.d = n10;
            if (n10 != null) {
                i11 += this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
            }
            if (!this.h && this.L.level <= 0) {
                i11 += org.telegram.messenger.g0.L(8.0f);
            }
            String w12 = this.N.w1(false);
            String y12 = this.N.y1(false);
            int C = org.telegram.messenger.f3.C(50.0f, this.G, L3);
            this.E = C;
            int L5 = (size - C) - org.telegram.messenger.g0.L(18.0f);
            if (TextUtils.isEmpty(y12) && TextUtils.isEmpty(w12)) {
                this.f53574x = null;
                this.F = ((L3 - org.telegram.messenger.g0.L(30.0f)) / 2) + this.H;
            } else {
                if (!TextUtils.isEmpty(y12) && !TextUtils.isEmpty(w12)) {
                    spannableStringBuilder = new SpannableStringBuilder(a8.p0.E(w12, " - ", y12));
                } else if (!TextUtils.isEmpty(y12)) {
                    spannableStringBuilder = new SpannableStringBuilder(y12);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(w12);
                }
                if (!TextUtils.isEmpty(w12)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(org.telegram.messenger.g0.o()), 0, w12.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.n6.O2, L5, TextUtils.TruncateAt.END);
                z2 z2Var = new z2(this.f53565a);
                this.f53574x = z2Var;
                z2Var.d = new StaticLayout(ellipsize, g4.f47894g1, L5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f53574x.f54371n = this.L;
                this.F = org.telegram.messenger.g0.L(11.0f) + ((L3 - org.telegram.messenger.g0.L(30.0f)) / 2) + this.H;
            }
            this.f53569f.i(L5, org.telegram.messenger.g0.L(30.0f));
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
        b();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
