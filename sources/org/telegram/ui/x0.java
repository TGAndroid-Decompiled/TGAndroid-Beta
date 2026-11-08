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
public final class x0 extends View implements org.telegram.messenger.x5, org.telegram.ui.Cells.h9 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public TL_iv.pageBlockAudio K;
    public TLRPC.Document L;
    public org.telegram.messenger.ij M;
    public final o50 f51702a;
    public final e4 f51703b;
    public z2 f51704c;
    public z2 d;
    public final RadialProgress2 f51705e;
    public final org.telegram.ui.Components.jm0 f51706f;
    public boolean h;
    public int f51707n;
    public final int f51708r;
    public int f51709s;
    public String f51710w;
    public z2 f51711x;
    public StaticLayout f51712y;

    public x0(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.f51708r = org.telegram.messenger.g0.L(58.0f);
        this.f51702a = o50Var;
        this.f51703b = e4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f51705e = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        this.J = org.telegram.messenger.z5.q(((g4) o50Var).X).k();
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(this);
        this.f51706f = jm0Var;
        jm0Var.h = new w0(this, 0);
    }

    private int getIconForCurrentState() {
        int i7 = this.H;
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
    public final void C(boolean z9) {
        a(true);
    }

    @Override
    public final void M(String str) {
        this.f51705e.p(true, 1.0f);
        a(true);
    }

    public final void a(boolean z9) {
        int i7 = ((g4) this.f51702a).X;
        String r10 = org.telegram.messenger.w7.r(null, this.L);
        org.telegram.messenger.w7.G(i7);
        boolean exists = org.telegram.messenger.w7.J(this.L, null, true, true).exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.f51705e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            org.telegram.messenger.z5.q(i7).v(this);
            boolean I = MediaController.B().I(this.M);
            if (I && (!I || !MediaController.B().H())) {
                this.H = 1;
            } else {
                this.H = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z9);
        } else {
            org.telegram.messenger.z5.q(i7).a(r10, null, this);
            if (!org.telegram.messenger.w7.G(i7).S(r10)) {
                this.H = 2;
                radialProgress2.p(z9, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z9);
            } else {
                this.H = 3;
                Float w10 = org.telegram.messenger.gc.D().w(r10);
                if (w10 != null) {
                    radialProgress2.p(z9, w10.floatValue());
                } else {
                    radialProgress2.p(z9, 0.0f);
                }
                radialProgress2.setIcon(getIconForCurrentState(), true, z9);
            }
        }
        b();
    }

    public final void b() {
        org.telegram.messenger.ij ijVar;
        int i7;
        if (this.L != null && (ijVar = this.M) != null) {
            org.telegram.ui.Components.jm0 jm0Var = this.f51706f;
            if (!jm0Var.f35023e) {
                jm0Var.h(ijVar.f23222b0);
            }
            if (MediaController.B().I(this.M)) {
                i7 = this.M.f23245g0;
            } else {
                int i10 = 0;
                while (true) {
                    if (i10 < this.L.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = this.L.attributes.get(i10);
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
            String str = this.f51710w;
            if (str == null || !str.equals(g02)) {
                this.f51710w = g02;
                TextPaint textPaint = g4.f45779f1;
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                this.f51712y = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            TextPaint textPaint2 = g4.f45779f1;
            ((g4) this.f51702a).getClass();
            textPaint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
            invalidate();
        }
    }

    public org.telegram.messenger.ij getMessageObject() {
        return this.M;
    }

    @Override
    public int getObserverTag() {
        return this.J;
    }

    @Override
    public final void i(long j3, long j10) {
        this.f51705e.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.H != 3) {
            a(true);
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f51711x;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.f51704c;
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
        z2 z2Var = this.f51711x;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.f51704c;
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
        org.telegram.messenger.z5.q(((g4) this.f51702a).X).v(this);
        z2 z2Var = this.f51711x;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.f51704c;
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
        int i7 = org.telegram.ui.ActionBar.k6.We;
        int i10 = org.telegram.ui.ActionBar.k6.Xe;
        int i11 = org.telegram.ui.ActionBar.k6.f27950id;
        int i12 = org.telegram.ui.ActionBar.k6.f27968jd;
        RadialProgress2 radialProgress2 = this.f51705e;
        radialProgress2.g(i7, i10, i11, i12);
        int i13 = org.telegram.ui.ActionBar.k6.f28080pe;
        o50 o50Var = this.f51702a;
        ((g4) o50Var).getClass();
        radialProgress2.d = org.telegram.ui.ActionBar.k6.v0(i13);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.D, this.E);
        int i14 = org.telegram.ui.ActionBar.k6.f27951ie;
        ((g4) o50Var).getClass();
        int v02 = org.telegram.ui.ActionBar.k6.v0(i14);
        int i15 = org.telegram.ui.ActionBar.k6.f27969je;
        ((g4) o50Var).getClass();
        int v03 = org.telegram.ui.ActionBar.k6.v0(i15);
        int i16 = org.telegram.ui.ActionBar.k6.le;
        ((g4) o50Var).getClass();
        int v04 = org.telegram.ui.ActionBar.k6.v0(i16);
        ((g4) o50Var).getClass();
        int v05 = org.telegram.ui.ActionBar.k6.v0(i16);
        int i17 = org.telegram.ui.ActionBar.k6.f27988ke;
        ((g4) o50Var).getClass();
        int v06 = org.telegram.ui.ActionBar.k6.v0(i17);
        org.telegram.ui.Components.jm0 jm0Var = this.f51706f;
        jm0Var.g(v02, v03, v04, v05, v06);
        jm0Var.b(canvas);
        canvas.restore();
        if (this.f51712y != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.F, org.telegram.messenger.g0.L(6.0f) + this.E);
            this.f51712y.draw(canvas);
            canvas.restore();
        }
        int i18 = 0;
        if (this.f51711x != null) {
            canvas.save();
            this.f51711x.f52421s = org.telegram.messenger.g0.L(54.0f) + this.F;
            this.f51711x.f52422w = this.E - org.telegram.messenger.g0.L(16.0f);
            z2 z2Var = this.f51711x;
            canvas.translate(z2Var.f52421s, z2Var.f52422w);
            g4.t(o50Var, canvas, this, 0);
            this.f51711x.d(canvas, this);
            canvas.restore();
            i18 = 1;
        }
        z2 z2Var2 = this.f51704c;
        int i19 = this.f51708r;
        if (z2Var2 != null) {
            canvas.save();
            z2 z2Var3 = this.f51704c;
            int i20 = this.f51707n;
            z2Var3.f52421s = i20;
            z2Var3.f52422w = i19;
            canvas.translate(i20, i19);
            g4.t(o50Var, canvas, this, i18);
            this.f51704c.d(canvas, this);
            canvas.restore();
            i18++;
        }
        if (this.d != null) {
            canvas.save();
            z2 z2Var4 = this.d;
            int i21 = this.f51707n;
            z2Var4.f52421s = i21;
            int i22 = this.f51709s;
            z2Var4.f52422w = i19 + i22;
            canvas.translate(i21, i19 + i22);
            g4.t(o50Var, canvas, this, i18);
            this.d.d(canvas, this);
            canvas.restore();
        }
        g4.s(canvas, o50Var, this.K, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.id.M0(2131754874, null));
        if (this.f51711x != null) {
            sb2.append(", ");
            sb2.append(this.f51711x.d.getText());
        }
        if (this.f51704c != null) {
            sb2.append(", ");
            sb2.append(this.f51704c.d.getText());
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
        TL_iv.pageBlockAudio pageblockaudio = this.K;
        if (pageblockaudio != null) {
            int i12 = pageblockaudio.level;
            if (i12 > 0) {
                this.f51707n = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(i12 * 14);
            } else {
                this.f51707n = org.telegram.messenger.g0.L(18.0f);
            }
            int L2 = (size - this.f51707n) - org.telegram.messenger.g0.L(18.0f);
            int L3 = org.telegram.messenger.g0.L(44.0f);
            this.F = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(5.0f);
            this.G = L4;
            int i13 = this.F;
            this.f51705e.r(i13, L4, i13 + L3, L4 + L3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.K;
            z2 o4 = g4.o(this.f51702a, this, null, pageblockaudio2.caption.text, L2, this.f51708r, pageblockaudio2, this.f51703b);
            this.f51704c = o4;
            if (o4 != null) {
                int height = this.f51704c.d.getHeight() + org.telegram.messenger.g0.L(8.0f);
                this.f51709s = height;
                L = org.telegram.messenger.k5.C(8.0f, height, L);
            }
            i11 = L;
            TL_iv.pageBlockAudio pageblockaudio3 = this.K;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i14 = this.f51708r + this.f51709s;
            if (this.f51703b.G) {
                alignment = org.telegram.ui.Components.mu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            z2 n10 = g4.n(this.f51702a, this, null, richText, L2, i14, pageblockaudio3, alignment2, 0, this.f51703b);
            this.d = n10;
            if (n10 != null) {
                i11 += this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
            }
            if (!this.h && this.K.level <= 0) {
                i11 += org.telegram.messenger.g0.L(8.0f);
            }
            String x12 = this.M.x1(false);
            String z12 = this.M.z1(false);
            int C = org.telegram.messenger.k5.C(50.0f, this.F, L3);
            this.D = C;
            int L5 = (size - C) - org.telegram.messenger.g0.L(18.0f);
            if (TextUtils.isEmpty(z12) && TextUtils.isEmpty(x12)) {
                this.f51711x = null;
                this.E = ((L3 - org.telegram.messenger.g0.L(30.0f)) / 2) + this.G;
            } else {
                if (!TextUtils.isEmpty(z12) && !TextUtils.isEmpty(x12)) {
                    spannableStringBuilder = new SpannableStringBuilder(a8.p0.D(x12, " - ", z12));
                } else if (!TextUtils.isEmpty(z12)) {
                    spannableStringBuilder = new SpannableStringBuilder(z12);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(x12);
                }
                if (!TextUtils.isEmpty(x12)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0, x12.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.k6.O2, L5, TextUtils.TruncateAt.END);
                z2 z2Var = new z2(this.f51702a);
                this.f51711x = z2Var;
                z2Var.d = new StaticLayout(ellipsize, g4.f45779f1, L5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f51711x.f52419n = this.K;
                this.E = org.telegram.messenger.g0.L(11.0f) + ((L3 - org.telegram.messenger.g0.L(30.0f)) / 2) + this.G;
            }
            this.f51706f.i(L5, org.telegram.messenger.g0.L(30.0f));
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
