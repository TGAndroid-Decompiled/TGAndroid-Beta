package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.rz;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.qv0;
public final class b0 extends ha {
    public static final int[] f46652p2 = {21600, 43200, 86400, 129600, 172800, 259200};
    public int P1;
    public final a Q1;
    public final TL_stars.TL_starGiftUnique R1;
    public final String S1;
    public final long T1;
    public final t30 U1;
    public final ec0 V1;
    public final EditTextBoldCursor W1;
    public final TextView X1;
    public final z Y1;
    public final TextView Z1;
    public final vh.d a2;
    public final org.telegram.ui.Components.f6 f46653b2;
    public final ImageView f46654c2;
    public final ImageView f46655d2;
    public final m2.t f46656e2;
    public sf.a f46657f2;
    public int f46658g2;
    public int f46659h2;
    public boolean f46660i2;
    public final w0 f46661j2;
    public final dq[] f46662k2;
    public final dq[] f46663l2;
    public boolean f46664m2;
    public q51 f46665n2;
    public final b51 f46666o2;

    public b0(final Context context, final int i10, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.p6 p6Var, w0 w0Var) {
        super(context, null, true, false, 2, p6Var);
        float f7;
        boolean z10;
        org.telegram.ui.ActionBar.p6 p6Var2;
        m2.t tVar = new m2.t(26);
        m4.c[] cVarArr = (m4.c[]) tVar.f12685b;
        this.f46656e2 = tVar;
        this.f46662k2 = new dq[1];
        this.f46663l2 = new dq[1];
        this.C1 = false;
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        this.f26730r1 = 0.2f;
        this.T1 = j10;
        this.R1 = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.S1 = i0.a.k(tL_starGiftUnique.num, ',', sb2);
        this.f46661j2 = w0Var;
        this.D = true;
        this.P0 = true;
        boolean j11 = e6.y(i10, true).j();
        if (j10 > 0 && wp.r1(i10).a2(j10) == null) {
            f7 = 12.0f;
            TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(j10));
            if (Z1 != null) {
                wp.r1(i10).U2(Z1, 0, false, null);
            }
        } else {
            f7 = 12.0f;
        }
        org.telegram.messenger.s0 s0Var = wp.r1(i10).f19300y7;
        sf.b bVar = sf.b.f48267a;
        sf.a g10 = sf.a.g(tL_starGiftUnique.offer_min_stars, bVar);
        sf.a g11 = sf.a.g(Math.max(g10.a() * 2, ((org.telegram.messenger.l0) s0Var.f18043q.f10701a).f16855c), bVar);
        sf.b bVar2 = sf.b.f48268b;
        sf.a i11 = sf.a.i(Math.max(g10.e(bVar2).n(2).f48266b, s0Var.f18044r.f17366a.f17238c), bVar2);
        sf.a i12 = sf.a.i(Math.max(i11.f48266b * 2, s0Var.f18045s.f17366a.f17238c), bVar2);
        sf.b bVar3 = g10.f48265a;
        if (bVar3 != g11.f48265a) {
            z10 = false;
        } else {
            z10 = false;
            cVarArr[bVar3.ordinal()] = new m4.c(g10, g11, false, 28);
        }
        sf.b bVar4 = i11.f48265a;
        if (bVar4 == i12.f48265a) {
            cVarArr[bVar4.ordinal()] = new m4.c(i11, i12, z10, 28);
        }
        a aVar = new a(i10, context, p6Var);
        this.Q1 = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(z10);
        aVar.setClickable(z10);
        this.f21590c.addView(aVar, w7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.e6.a(aVar);
        aVar.setOnClickListener(new ag.i(this, context, p6Var, 29));
        Q(org.telegram.ui.ActionBar.t6.f21002h5);
        this.P1 = this.G0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.W1 = editTextBoldCursor;
        if (j11) {
            t30 t30Var = new t30(context, p6Var);
            this.U1 = t30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(dd.L0(2131744403, null));
            arrayList.add(dd.L0(2131744402, null));
            t30Var.b(arrayList, new x(this, 0));
            linearLayout.addView(t30Var, w7.b6.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
            p6Var2 = null;
        } else {
            p6Var2 = null;
            this.U1 = null;
        }
        LinearLayout f10 = org.telegram.messenger.m5.f(context, 1);
        linearLayout.addView(f10, w7.b6.l(1.0f, -1, -2));
        ec0 ec0Var = new ec0(context, p6Var2);
        this.V1 = ec0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i13, null);
        editTextBoldCursor.requestFocus();
        ec0Var.setLeftPadding(org.telegram.messenger.i0.L(28.0f));
        ec0Var.e(editTextBoldCursor);
        ec0Var.b(1.0f, 0.0f, false);
        ec0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new bi.g6(this, 4));
        ec0Var.addView(editTextBoldCursor, w7.b6.e(-1, -2, 48));
        f10.addView(ec0Var, w7.b6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f46654c2 = imageView;
        imageView.setImageResource(2131232749);
        ec0Var.addView(imageView, w7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f46655d2 = imageView2;
        imageView2.setImageResource(2131231956);
        ec0Var.addView(imageView2, w7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.f46653b2 = f6Var;
        int i14 = org.telegram.ui.ActionBar.t6.f21312y6;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i14, null);
        f6Var.setTextSize(org.telegram.messenger.i0.L(13.0f));
        f6Var.setGravity(5);
        ec0Var.addView(f6Var, w7.b6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.X1 = textView;
        textView.setTextSize(1, 13.0f);
        f10.addView(textView, w7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.Y1 = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor2, i13, null);
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        ec0 ec0Var2 = new ec0(context, null);
        ec0Var2.setText(dd.L0(2131749739, null));
        ec0Var2.e(editTextBoldCursor2);
        ec0Var2.addView((View) editTextBoldCursor2, w7.b6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.e6.b(ec0Var2, 0.02f, 1.2f);
        ec0Var2.setOnClickListener(new qv0(25, this, context));
        f10.addView(ec0Var2, w7.b6.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(2131230871);
        org.telegram.ui.ActionBar.a7.t(imageView3, org.telegram.ui.ActionBar.t6.W5, p6Var, PorterDuff.Mode.SRC_IN);
        ec0Var2.addView(imageView3, w7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.Z1 = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, i14, null);
        textView2.setTextSize(1, 13.0f);
        f10.addView(textView2, w7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        vh.d dVar = new vh.d(context, p6Var, true);
        this.a2 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                sf.a aVar2;
                String str;
                boolean z11;
                String a02;
                int i15;
                boolean z12;
                long j12;
                int i16;
                final b0 b0Var = b0.this;
                if (b0Var.a2.f51070c0) {
                    int i17 = i10;
                    if (wp.r1(i17).u2()) {
                        org.telegram.ui.b.b(i17);
                        return;
                    }
                    e6 x10 = e6.x(i17, b0Var.f46657f2.f48265a);
                    if (x10.e) {
                        aVar2 = sf.a.l(x10.p());
                    } else {
                        aVar2 = null;
                    }
                    sf.b bVar5 = sf.b.f48267a;
                    sf.b bVar6 = sf.b.f48268b;
                    if (aVar2 != null) {
                        long j13 = aVar2.f48266b;
                        sf.a aVar3 = b0Var.f46657f2;
                        if (j13 >= aVar3.f48266b) {
                            String str2 = b0Var.S1;
                            long j14 = b0Var.T1;
                            String d = aVar3.d();
                            if (b0Var.f46657f2.f48265a == bVar6) {
                                str = str2;
                                z11 = true;
                            } else {
                                str = str2;
                                z11 = false;
                            }
                            LinearLayout linearLayout2 = new LinearLayout(b0Var.getContext());
                            linearLayout2.setOrientation(1);
                            TextView textView3 = new TextView(b0Var.getContext());
                            textView3.setText(dd.L0(2131749741, null));
                            int i18 = org.telegram.ui.ActionBar.t6.f21038j5;
                            org.telegram.messenger.m5.m(textView3, i18, b0Var.I0, 1, 20.0f);
                            linearLayout2.addView(textView3, w7.b6.t(-1, -2, 48, 24, 4, 24, 14));
                            TextView textView4 = new TextView(b0Var.getContext());
                            org.telegram.ui.ActionBar.a7.V(textView4, i18, b0Var.I0);
                            textView4.setTextSize(1, 16.0f);
                            if (b0Var.f46657f2.f48265a == bVar5) {
                                a02 = dd.a0(null, null, 2131749692, d, org.telegram.messenger.o5.t(j14), str);
                            } else {
                                a02 = dd.a0(null, null, 2131749691, d, org.telegram.messenger.o5.t(j14), str);
                            }
                            textView4.setText(org.telegram.messenger.i0.W2(a02));
                            linearLayout2.addView(textView4, w7.b6.t(-1, -2, 48, 24, 4, 24, 4));
                            xy0 xy0Var = new xy0(b0Var.getContext(), b0Var.I0);
                            final long M1 = wp.r1(b0Var.f21584a).M1(j14);
                            final sf.a g12 = sf.a.g(M1, bVar5);
                            xy0Var.c(dd.L0(2131749713, null), h8.a1(z11, dd.a0(null, null, 2131749749, d), 0.8f, null), null, null);
                            int i19 = (M1 > 0L ? 1 : (M1 == 0L ? 0 : -1));
                            if (i19 > 0) {
                                i15 = 0;
                                xy0Var.c(dd.L0(2131749714, null), h8.a1(false, dd.a0(null, null, 2131749749, g12.d()), 0.8f, null), null, null);
                            } else {
                                i15 = 0;
                            }
                            xy0Var.c(dd.L0(2131749715, null), dd.G(b0Var.f46658g2 / 3600, "GiftOfferHours", new Object[i15]), null, null);
                            linearLayout2.addView(xy0Var, w7.b6.t(-1, -2, 48, 23, 16, 23, 4));
                            rz.C(b0Var.f21584a);
                            long E = rz.E();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (i19 == 0) {
                                spannableStringBuilder.append((CharSequence) h8.V0(dd.a0(null, null, 2131749721, d), z11));
                                z12 = z11;
                                j12 = E;
                                i16 = 0;
                            } else if (z11) {
                                spannableStringBuilder.append(dd.V(null, null, 2131749720, h8.V0(dd.a0(null, null, 2131749719, d), true), h8.T0(dd.a0(null, null, 2131749719, g12.d()))));
                                z12 = z11;
                                j12 = E;
                                i16 = 0;
                            } else {
                                z12 = z11;
                                j12 = E;
                                i16 = 0;
                                spannableStringBuilder.append((CharSequence) h8.T0(dd.a0(null, null, 2131749721, sf.a.i(b0Var.f46657f2.f48266b + g12.f48266b, bVar5).d())));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i16, b0Var.getContext(), b0Var.I0);
                            alertDialog$Builder.o(linearLayout2);
                            final boolean z13 = z12;
                            final long j15 = j12;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.u1() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i20) {
                                    sf.a aVar4;
                                    sf.a i21;
                                    long j16 = M1;
                                    int i22 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                                    b0 b0Var2 = b0.this;
                                    if (i22 > 0) {
                                        int i23 = b0Var2.f21584a;
                                        sf.b bVar7 = sf.b.f48267a;
                                        e6 x11 = e6.x(i23, bVar7);
                                        if (x11.e) {
                                            aVar4 = sf.a.l(x11.p());
                                        } else {
                                            aVar4 = null;
                                        }
                                        if (z13) {
                                            i21 = sf.a.g(j16, bVar7);
                                        } else {
                                            i21 = sf.a.i(b0Var2.f46657f2.f48266b + g12.f48266b, bVar7);
                                        }
                                        if (aVar4 == null || aVar4.f48266b < i21.f48266b) {
                                            new x7(b0Var2.getContext(), b0Var2.I0, i21.a(), 14, null, null, b0Var2.T1).show();
                                            return;
                                        }
                                    }
                                    gf.e h = x1Var.h(-1, true, true);
                                    h.d();
                                    TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
                                    tL_sendStarGiftOffer.price = b0Var2.f46657f2.o();
                                    tL_sendStarGiftOffer.peer = wp.r1(b0Var2.f21584a).i1(b0Var2.T1);
                                    tL_sendStarGiftOffer.duration = b0Var2.f46658g2;
                                    tL_sendStarGiftOffer.slug = b0Var2.R1.slug;
                                    tL_sendStarGiftOffer.random_id = j15;
                                    if (i22 > 0) {
                                        tL_sendStarGiftOffer.flags |= 1;
                                        tL_sendStarGiftOffer.allow_paid_stars = j16;
                                    }
                                    ConnectionsManager.getInstance(b0Var2.f21584a).sendRequestTyped(tL_sendStarGiftOffer, new org.telegram.tgnet.e(b0Var2, h, x1Var, 7));
                                }
                            });
                            alertDialog$Builder.h(dd.L0(2131752589, null), null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                            x1Var.Z0 = true;
                            x1Var.show();
                            return;
                        }
                    }
                    sf.a aVar4 = b0Var.f46657f2;
                    sf.b bVar7 = aVar4.f48265a;
                    Context context2 = context;
                    org.telegram.ui.ActionBar.p6 p6Var3 = p6Var;
                    if (bVar7 == bVar5) {
                        new x7(context2, p6Var3, aVar4.a(), 14, null, null, j10).show();
                    } else if (bVar7 == bVar6) {
                        new wh.f(context2, p6Var3, aVar4, true, null).show();
                    }
                }
            }
        });
        f1(sf.a.i(0L, bVar), false, true, false);
        if (this.f46658g2 != 86400) {
            this.f46658g2 = 86400;
            editTextBoldCursor2.setText(dd.G(24, "GiftOfferHours", new Object[0]));
        }
        e1(false);
        editTextBoldCursor.addTextChangedListener(new a0(this));
        FrameLayout.LayoutParams d = w7.b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.f21616t0;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.f21587b.addView(dVar, d);
        uk0 uk0Var = this.f26724k1;
        int i17 = this.f21616t0;
        uk0Var.setPadding(i17, 0, i17, org.telegram.messenger.i0.L(64.0f));
        this.f26724k1.setOverScrollMode(2);
        this.f46666o2 = b51.k(linearLayout);
        this.f46665n2.O(false);
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(this.f26724k1, getContext(), this.f21584a, 0, true, new qh.d(this, 4), this.I0);
        this.f46665n2 = q51Var;
        q51Var.f29638r = false;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        return dd.L0(2131749695, null);
    }

    @Override
    public final boolean Y(float f7, float f10) {
        a aVar;
        if (this.f46660i2 && (aVar = this.Q1) != null && f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
            return false;
        }
        return super.Y(f7, f10);
    }

    public final void d1() {
        boolean z10;
        float f7;
        boolean z11 = this.f46664m2;
        a aVar = this.Q1;
        if ((z11 && !this.I && aVar != null && this.f21587b.getY() > org.telegram.messenger.i0.L(32.0f)) || this.U1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f46660i2 != z10) {
            this.f46660i2 = z10;
            if (aVar != null) {
                aVar.setEnabled(z10);
                aVar.setClickable(z10);
                ViewPropertyAnimator animate = aVar.animate();
                float f10 = 0.6f;
                float f11 = 1.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (z10) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!z10) {
                    f11 = 0.0f;
                }
                a30.l(scaleY, f11, 180L);
            }
        }
    }

    public final void e1(boolean z10) {
        boolean z11;
        if (this.f46659h2 == 0 && this.f46657f2.f48266b > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        vh.d dVar = this.a2;
        if (dVar.f51070c0 != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f7 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f7 = 1.0f;
                }
                a30.l(animate, f7, 180L);
                return;
            }
            if (z11) {
                f7 = 1.0f;
            }
            dVar.setAlpha(f7);
        }
    }

    public final void f1(sf.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ?? r19;
        boolean z17;
        String E;
        dq[] dqVarArr;
        double d;
        boolean z18;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i16;
        sf.a aVar2 = this.f46657f2;
        int i17 = this.f46659h2;
        this.f46659h2 = 0;
        if (aVar != null) {
            this.f46657f2 = aVar;
        } else {
            this.f46657f2 = sf.a.i(0L, aVar2.f48265a);
            this.f46659h2 |= 1;
        }
        sf.b bVar = this.f46657f2.f48265a;
        m2.t tVar = this.f46656e2;
        m4.c[] cVarArr = (m4.c[]) tVar.f12685b;
        long j10 = ((sf.a) ((m4.c[]) tVar.f12685b)[bVar.ordinal()].f12707c).f48266b;
        sf.a aVar3 = this.f46657f2;
        if (j10 < aVar3.f48266b) {
            this.f46659h2 |= 4;
        }
        if (!aVar3.k() && ((sf.a) cVarArr[this.f46657f2.f48265a.ordinal()].f12706b).f48266b > this.f46657f2.f48266b) {
            this.f46659h2 |= 2;
        }
        if (!z11 && aVar2.f48265a == this.f46657f2.f48265a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar2.f48266b == this.f46657f2.f48266b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i17 == this.f46659h2) {
            z15 = false;
        } else {
            z15 = true;
        }
        sf.b bVar2 = sf.b.f48267a;
        EditTextBoldCursor editTextBoldCursor = this.W1;
        sf.b bVar3 = sf.b.f48268b;
        if (z13) {
            t30 t30Var = this.U1;
            if (t30Var != null) {
                if (this.f46657f2.f48265a == bVar2) {
                    i16 = 0;
                } else {
                    i16 = 1;
                }
                t30Var.a(i16, z12);
            }
            String t10 = org.telegram.messenger.o5.t(this.T1);
            sf.b bVar4 = this.f46657f2.f48265a;
            TextView textView = this.Z1;
            if (bVar4 == bVar2) {
                org.telegram.messenger.m5.q(null, null, 2131749738, new Object[]{t10}, textView);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((sf.a) cVarArr[this.f46657f2.f48265a.ordinal()].f12707c).a()).length())});
            } else if (bVar4 == bVar3) {
                org.telegram.messenger.m5.q(null, null, 2131749737, new Object[]{t10}, textView);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((sf.a) cVarArr[this.f46657f2.f48265a.ordinal()].f12707c).a()).length() + 3)});
            }
            ImageView imageView = this.f46655d2;
            ImageView imageView2 = this.f46654c2;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.f46657f2.f48265a == bVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.f46657f2.f48265a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.f46657f2.f48265a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f13);
                z18 = false;
                i10 = 1;
                scaleY.setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f46657f2.f48265a == bVar3) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.f46657f2.f48265a == bVar3) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.f46657f2.f48265a == bVar3) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                z18 = false;
                i10 = 1;
                if (this.f46657f2.f48265a == bVar2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                imageView2.setAlpha(f7);
                if (this.f46657f2.f48265a == bVar3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            a aVar4 = this.Q1;
            z16 = z18;
            if (aVar4 != null) {
                sf.b bVar5 = this.f46657f2.f48265a;
                z16 = z18;
                if (aVar4.e != bVar5) {
                    aVar4.e = bVar5;
                    aVar4.a();
                    z16 = z18;
                }
            }
        } else {
            z16 = false;
            i10 = 1;
        }
        if (!z13 && !z15) {
            r19 = z16;
        } else {
            if (this.f46657f2.f48265a == bVar2) {
                i11 = 2131749708;
            } else {
                i11 = 2131749700;
            }
            this.V1.setText(dd.L0(i11, null));
            sf.b bVar6 = this.f46657f2.f48265a;
            int i18 = this.f46659h2;
            int i19 = i18 & 4;
            String str = this.S1;
            boolean z19 = z16;
            TextView textView2 = this.X1;
            if (i19 != 0) {
                if (bVar6 == bVar2) {
                    i15 = 2131749706;
                } else {
                    i15 = 2131749698;
                }
                String d10 = ((sf.a) cVarArr[bVar6.ordinal()].f12707c).d();
                Object[] objArr = new Object[2];
                objArr[z19 ? 1 : 0] = d10;
                objArr[i10] = str;
                org.telegram.messenger.m5.q(null, null, i15, objArr, textView2);
            } else if ((i18 & 2) != 0) {
                if (bVar6 == bVar2) {
                    i13 = 2131749705;
                } else {
                    i13 = 2131749697;
                }
                String d11 = ((sf.a) cVarArr[bVar6.ordinal()].f12706b).d();
                Object[] objArr2 = new Object[2];
                objArr2[z19 ? 1 : 0] = d11;
                objArr2[i10] = str;
                org.telegram.messenger.m5.q(null, null, i13, objArr2, textView2);
            } else {
                if (bVar6 == bVar2) {
                    i12 = 2131749707;
                } else {
                    i12 = 2131749699;
                }
                Object[] objArr3 = new Object[i10];
                objArr3[z19 ? 1 : 0] = str;
                org.telegram.messenger.m5.q(null, null, i12, objArr3, textView2);
            }
            if ((this.f46659h2 & (-9)) == 0) {
                i14 = org.telegram.ui.ActionBar.t6.f21312y6;
            } else {
                i14 = org.telegram.ui.ActionBar.t6.f21171q7;
            }
            org.telegram.ui.ActionBar.a7.V(textView2, i14, this.I0);
            r19 = z19;
        }
        if (z13 || z14 || z15) {
            sf.a aVar5 = this.f46657f2;
            if (aVar5.f48265a == bVar3) {
                z17 = true;
            } else {
                z17 = r19;
            }
            if (z17) {
                E = aVar5.b();
            } else {
                E = dd.E(aVar5.a(), ',');
            }
            Object[] objArr4 = new Object[1];
            objArr4[r19] = E;
            String a02 = dd.a0(null, null, 2131749742, objArr4);
            if (z17) {
                dqVarArr = this.f46663l2;
            } else {
                dqVarArr = this.f46662k2;
            }
            this.a2.i(h8.s1(h8.Y0(z17, a02, dqVarArr), z17), z12, true);
            e1(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.f46657f2.f48265a == bVar3) {
                d = ((org.telegram.messenger.k0) wp.r1(this.f21584a).f19300y7.f18036l.f13481b).f16536a;
            } else {
                d = wp.r1(this.f21584a).f19111d6 * 1.0E-5d;
            }
            org.telegram.messenger.u1.i().getClass();
            sb2.append(org.telegram.messenger.u1.g("USD", 2, (long) (this.f46657f2.c() * d * 100.0d), r19));
            this.f46653b2.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.f46657f2.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final void g0(float f7) {
        super.g0(f7);
        d1();
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 == this.P1 && (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, this.I0)) != this.G0) {
                P(w02);
                this.P1 = this.G0;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.i0.h3(new ph.x1(this, 10), 50L);
    }

    @Override
    public final void w() {
        this.f46664m2 = true;
        d1();
    }
}
