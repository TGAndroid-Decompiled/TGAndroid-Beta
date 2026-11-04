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
public final class y0 extends View implements org.telegram.messenger.x5, org.telegram.ui.Cells.g9 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final int K;
    public TL_iv.pageBlockAudio L;
    public TLRPC.Document M;
    public org.telegram.messenger.zi N;
    public final i50 f52138a;
    public final g4 f52139b;
    public a3 f52140c;
    public a3 d;
    public final RadialProgress2 f52141e;
    public final org.telegram.ui.Components.mm0 f52142f;
    public boolean h;
    public int f52143n;
    public final int f52144r;
    public int f52145s;
    public String f52146w;
    public a3 f52147x;
    public StaticLayout f52148y;

    public y0(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f52144r = org.telegram.messenger.g0.L(58.0f);
        this.f52138a = i50Var;
        this.f52139b = g4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f52141e = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        this.K = org.telegram.messenger.z5.q(((i4) i50Var).Y).k();
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(this);
        this.f52142f = mm0Var;
        mm0Var.h = new x0(this, 0);
    }

    private int getIconForCurrentState() {
        int i3 = this.I;
        if (i3 == 1) {
            return 1;
        }
        if (i3 == 2) {
            return 2;
        }
        if (i3 == 3) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void C(boolean z10) {
        a(true);
    }

    @Override
    public final void M(String str) {
        this.f52141e.p(true, 1.0f);
        a(true);
    }

    public final void a(boolean z10) {
        int i3 = ((i4) this.f52138a).Y;
        String r5 = org.telegram.messenger.w7.r(null, this.M);
        org.telegram.messenger.w7.G(i3);
        boolean exists = org.telegram.messenger.w7.K(this.M, null, true, true).exists();
        boolean isEmpty = TextUtils.isEmpty(r5);
        RadialProgress2 radialProgress2 = this.f52141e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            org.telegram.messenger.z5.q(i3).v(this);
            boolean I = MediaController.B().I(this.N);
            if (I && (!I || !MediaController.B().H())) {
                this.I = 1;
            } else {
                this.I = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.z5.q(i3).a(r5, null, this);
            if (!org.telegram.messenger.w7.G(i3).T(r5)) {
                this.I = 2;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.I = 3;
                Float w10 = org.telegram.messenger.zb.D().w(r5);
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
        org.telegram.messenger.zi ziVar;
        int i3;
        if (this.M != null && (ziVar = this.N) != null) {
            org.telegram.ui.Components.mm0 mm0Var = this.f52142f;
            if (!mm0Var.f36191e) {
                mm0Var.h(ziVar.f26828b0);
            }
            if (MediaController.B().I(this.N)) {
                i3 = this.N.f26851g0;
            } else {
                int i10 = 0;
                while (true) {
                    if (i10 < this.M.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = this.M.attributes.get(i10);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            i3 = (int) documentAttribute.duration;
                            break;
                        }
                        i10++;
                    } else {
                        i3 = 0;
                        break;
                    }
                }
            }
            String g02 = org.telegram.messenger.g0.g0(i3, false, false);
            String str = this.f52146w;
            if (str == null || !str.equals(g02)) {
                this.f52146w = g02;
                TextPaint textPaint = i4.f46059g1;
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                this.f52148y = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            TextPaint textPaint2 = i4.f46059g1;
            ((i4) this.f52138a).getClass();
            textPaint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
            invalidate();
        }
    }

    public org.telegram.messenger.zi getMessageObject() {
        return this.N;
    }

    @Override
    public int getObserverTag() {
        return this.K;
    }

    @Override
    public final void i(long j10, long j11) {
        this.f52141e.p(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.I != 3) {
            a(true);
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f52147x;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.f52140c;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
        a3 a3Var3 = this.d;
        if (a3Var3 != null) {
            arrayList.add(a3Var3);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        a3 a3Var = this.f52147x;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.f52140c;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
        a3 a3Var3 = this.d;
        if (a3Var3 != null) {
            a3Var3.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.z5.q(((i4) this.f52138a).Y).v(this);
        a3 a3Var = this.f52147x;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.f52140c;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
        a3 a3Var3 = this.d;
        if (a3Var3 != null) {
            a3Var3.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.L == null) {
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.We;
        int i10 = org.telegram.ui.ActionBar.k6.Xe;
        int i11 = org.telegram.ui.ActionBar.k6.f27979id;
        int i12 = org.telegram.ui.ActionBar.k6.f27995jd;
        RadialProgress2 radialProgress2 = this.f52141e;
        radialProgress2.g(i3, i10, i11, i12);
        int i13 = org.telegram.ui.ActionBar.k6.f28109pe;
        i50 i50Var = this.f52138a;
        ((i4) i50Var).getClass();
        radialProgress2.d = org.telegram.ui.ActionBar.k6.v0(i13);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.E, this.F);
        int i14 = org.telegram.ui.ActionBar.k6.ie;
        ((i4) i50Var).getClass();
        int v02 = org.telegram.ui.ActionBar.k6.v0(i14);
        int i15 = org.telegram.ui.ActionBar.k6.f27996je;
        ((i4) i50Var).getClass();
        int v03 = org.telegram.ui.ActionBar.k6.v0(i15);
        int i16 = org.telegram.ui.ActionBar.k6.f28033le;
        ((i4) i50Var).getClass();
        int v04 = org.telegram.ui.ActionBar.k6.v0(i16);
        ((i4) i50Var).getClass();
        int v05 = org.telegram.ui.ActionBar.k6.v0(i16);
        int i17 = org.telegram.ui.ActionBar.k6.ke;
        ((i4) i50Var).getClass();
        int v06 = org.telegram.ui.ActionBar.k6.v0(i17);
        org.telegram.ui.Components.mm0 mm0Var = this.f52142f;
        mm0Var.g(v02, v03, v04, v05, v06);
        mm0Var.b(canvas);
        canvas.restore();
        if (this.f52148y != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.G, org.telegram.messenger.g0.L(6.0f) + this.F);
            this.f52148y.draw(canvas);
            canvas.restore();
        }
        int i18 = 0;
        if (this.f52147x != null) {
            canvas.save();
            this.f52147x.f43579s = org.telegram.messenger.g0.L(54.0f) + this.G;
            this.f52147x.f43580w = this.F - org.telegram.messenger.g0.L(16.0f);
            a3 a3Var = this.f52147x;
            canvas.translate(a3Var.f43579s, a3Var.f43580w);
            i4.t(i50Var, canvas, this, 0);
            this.f52147x.d(canvas, this);
            canvas.restore();
            i18 = 1;
        }
        a3 a3Var2 = this.f52140c;
        int i19 = this.f52144r;
        if (a3Var2 != null) {
            canvas.save();
            a3 a3Var3 = this.f52140c;
            int i20 = this.f52143n;
            a3Var3.f43579s = i20;
            a3Var3.f43580w = i19;
            canvas.translate(i20, i19);
            i4.t(i50Var, canvas, this, i18);
            this.f52140c.d(canvas, this);
            canvas.restore();
            i18++;
        }
        if (this.d != null) {
            canvas.save();
            a3 a3Var4 = this.d;
            int i21 = this.f52143n;
            a3Var4.f43579s = i21;
            int i22 = this.f52145s;
            a3Var4.f43580w = i19 + i22;
            canvas.translate(i21, i19 + i22);
            i4.t(i50Var, canvas, this, i18);
            this.d.d(canvas, this);
            canvas.restore();
        }
        i4.s(canvas, i50Var, this.L, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131754874, null));
        if (this.f52147x != null) {
            sb2.append(", ");
            sb2.append(this.f52147x.d.getText());
        }
        if (this.f52140c != null) {
            sb2.append(", ");
            sb2.append(this.f52140c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        Layout.Alignment alignment;
        SpannableStringBuilder spannableStringBuilder;
        int size = View.MeasureSpec.getSize(i3);
        int L = org.telegram.messenger.g0.L(54.0f);
        TL_iv.pageBlockAudio pageblockaudio = this.L;
        if (pageblockaudio != null) {
            int i12 = pageblockaudio.level;
            if (i12 > 0) {
                this.f52143n = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(i12 * 14);
            } else {
                this.f52143n = org.telegram.messenger.g0.L(18.0f);
            }
            int L2 = (size - this.f52143n) - org.telegram.messenger.g0.L(18.0f);
            int L3 = org.telegram.messenger.g0.L(44.0f);
            this.G = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(5.0f);
            this.H = L4;
            int i13 = this.G;
            this.f52141e.r(i13, L4, i13 + L3, L4 + L3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.L;
            a3 o10 = i4.o(this.f52138a, this, null, pageblockaudio2.caption.text, L2, this.f52144r, pageblockaudio2, this.f52139b);
            this.f52140c = o10;
            if (o10 != null) {
                int height = this.f52140c.d.getHeight() + org.telegram.messenger.g0.L(8.0f);
                this.f52145s = height;
                L = org.telegram.messenger.k5.C(8.0f, height, L);
            }
            i11 = L;
            TL_iv.pageBlockAudio pageblockaudio3 = this.L;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i14 = this.f52144r + this.f52145s;
            if (this.f52139b.H) {
                alignment = org.telegram.ui.Components.lu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            a3 n4 = i4.n(this.f52138a, this, null, richText, L2, i14, pageblockaudio3, alignment2, 0, this.f52139b);
            this.d = n4;
            if (n4 != null) {
                i11 += this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
            }
            if (!this.h && this.L.level <= 0) {
                i11 += org.telegram.messenger.g0.L(8.0f);
            }
            String x12 = this.N.x1(false);
            String z12 = this.N.z1(false);
            int C = org.telegram.messenger.k5.C(50.0f, this.G, L3);
            this.E = C;
            int L5 = (size - C) - org.telegram.messenger.g0.L(18.0f);
            if (TextUtils.isEmpty(z12) && TextUtils.isEmpty(x12)) {
                this.f52147x = null;
                this.F = ((L3 - org.telegram.messenger.g0.L(30.0f)) / 2) + this.H;
            } else {
                if (!TextUtils.isEmpty(z12) && !TextUtils.isEmpty(x12)) {
                    spannableStringBuilder = new SpannableStringBuilder(a1.g.C(x12, " - ", z12));
                } else if (!TextUtils.isEmpty(z12)) {
                    spannableStringBuilder = new SpannableStringBuilder(z12);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(x12);
                }
                if (!TextUtils.isEmpty(x12)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), 0, x12.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.k6.O2, L5, TextUtils.TruncateAt.END);
                a3 a3Var = new a3(this.f52138a);
                this.f52147x = a3Var;
                a3Var.d = new StaticLayout(ellipsize, i4.f46059g1, L5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f52147x.f43577n = this.L;
                this.F = org.telegram.messenger.g0.L(11.0f) + ((L3 - org.telegram.messenger.g0.L(30.0f)) / 2) + this.H;
            }
            this.f52142f.i(L5, org.telegram.messenger.g0.L(30.0f));
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
        b();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
