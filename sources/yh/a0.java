package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.ok;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xl0;
public final class a0 extends bb {
    public static final int[] f47171w0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final a X;
    public final TL_stars.TL_starGiftUnique Y;
    public final String Z;
    public final long f47172a0;
    public final n40 f47173b0;
    public final kd0 f47174c0;
    public final EditTextBoldCursor f47175d0;
    public final TextView f47176e0;
    public final y f47177f0;
    public final TextView f47178g0;
    public final ci.d f47179h0;
    public final org.telegram.ui.Components.p6 f47180i0;
    public final ImageView f47181j0;
    public final ImageView f47182k0;
    public final l.d f47183l0;
    public zf.a m0;
    public int f47184n0;
    public int f47185o0;
    public boolean f47186p0;
    public final b1 f47187q0;
    public final qq[] f47188r0;
    public final qq[] f47189s0;
    public boolean f47190t0;
    public k61 f47191u0;
    public final w51 f47192v0;

    public a0(final Context context, final int i10, final long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.d6 d6Var, b1 b1Var) {
        super(context, null, true, false, 2, d6Var);
        TLRPC.User user;
        l.d dVar = new l.d(27);
        n7.z0[] z0VarArr = (n7.z0[]) dVar.f13924a;
        this.f47183l0 = dVar;
        this.f47188r0 = new qq[1];
        this.f47189s0 = new qq[1];
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.f47172a0 = j3;
        this.Y = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.Z = org.telegram.messenger.f0.h(tL_starGiftUnique.num, ',', sb2);
        this.f47187q0 = b1Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j10 = s5.y(i10, true).j();
        if (j3 > 0 && MessagesController.getInstance(i10).getUserFull(j3) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = tL_starGiftUnique.offer_min_stars;
        zf.b bVar = zf.b.f49226a;
        zf.a g10 = zf.a.g(j11, bVar);
        zf.a g11 = zf.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        zf.b bVar2 = zf.b.f49227b;
        zf.a i11 = zf.a.i(Math.max(g10.e(bVar2).n(2).f49225b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        zf.a i12 = zf.a.i(Math.max(i11.f49225b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        zf.b bVar3 = g10.f49224a;
        if (bVar3 == g11.f49224a) {
            z0VarArr[bVar3.ordinal()] = new n7.z0(29, g10, g11);
        }
        zf.b bVar4 = i11.f49224a;
        if (bVar4 == i12.f49224a) {
            z0VarArr[bVar4.ordinal()] = new n7.z0(29, i11, i12);
        }
        a aVar = new a(context, i10, d6Var);
        this.X = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(false);
        aVar.setClickable(false);
        this.container.addView(aVar, w7.y5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.a6.a(aVar);
        aVar.setOnClickListener(new xg.e(this, context, d6Var, 6));
        fixNavigationBar(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19129h5, d6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f47175d0 = editTextBoldCursor;
        if (j10) {
            n40 n40Var = new n40(context, d6Var);
            this.f47173b0 = n40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            n40Var.b(arrayList, new v(this, 0));
            linearLayout.addView(n40Var, w7.y5.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.f47173b0 = null;
        }
        LinearLayout f7 = ok.f(context, 1);
        linearLayout.addView(f7, w7.y5.l(1.0f, -1, -2));
        kd0 kd0Var = new kd0(context, null);
        this.f47174c0 = kd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        kd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        kd0Var.e(editTextBoldCursor);
        kd0Var.b(1.0f, 0.0f, false);
        kd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ii.w5(this, 4));
        kd0Var.addView(editTextBoldCursor, w7.y5.e(-1, -2, 48));
        f7.addView(kd0Var, w7.y5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f47181j0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        kd0Var.addView(imageView, w7.y5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f47182k0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        kd0Var.addView(imageView2, w7.y5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, false, false);
        this.f47180i0 = p6Var;
        int i14 = org.telegram.ui.ActionBar.h6.f19442y6;
        p6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        p6Var.setTextSize(AndroidUtilities.dp(13.0f));
        p6Var.setGravity(5);
        kd0Var.addView(p6Var, w7.y5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f47176e0 = textView;
        textView.setTextSize(1, 13.0f);
        f7.addView(textView, w7.y5.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f47177f0 = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        kd0 kd0Var2 = new kd0(context, null);
        kd0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        kd0Var2.e(editTextBoldCursor2);
        kd0Var2.addView((View) editTextBoldCursor2, w7.y5.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.a6.b(kd0Var2, 0.02f, 1.2f);
        kd0Var2.setOnClickListener(new w(0, this, context));
        f7.addView(kd0Var2, w7.y5.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.W5, d6Var), PorterDuff.Mode.SRC_IN));
        kd0Var2.addView(imageView3, w7.y5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f47178g0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        f7.addView(textView2, w7.y5.t(-1, -2, 55, 33, 4, 33, 0));
        ci.d dVar2 = new ci.d(context, d6Var, true);
        this.f47179h0 = dVar2;
        dVar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                a0.Q(a0.this, i10, context, d6Var, j3);
            }
        });
        U(zf.a.i(0L, bVar), false, true, false);
        if (this.f47184n0 != 86400) {
            this.f47184n0 = 86400;
            editTextBoldCursor2.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        T(false);
        editTextBoldCursor.addTextChangedListener(new z(this));
        FrameLayout.LayoutParams d = w7.y5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(dVar2, d);
        xl0 xl0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        xl0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.f47192v0 = w51.k(linearLayout);
        this.f47191u0.N(false);
    }

    public static void P(a0 a0Var, long j3, boolean z10, zf.a aVar, long j10, org.telegram.ui.ActionBar.a2 a2Var) {
        zf.a aVar2;
        zf.a i10;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 > 0) {
            int i12 = a0Var.currentAccount;
            zf.b bVar = zf.b.f49226a;
            s5 x10 = s5.x(i12, bVar);
            if (x10.e) {
                aVar2 = zf.a.l(x10.p());
            } else {
                aVar2 = null;
            }
            if (z10) {
                i10 = zf.a.g(j3, bVar);
            } else {
                i10 = zf.a.i(a0Var.m0.f49225b + aVar.f49225b, bVar);
            }
            if (aVar2 == null || aVar2.f49225b < i10.f49225b) {
                new l7(a0Var.getContext(), a0Var.resourcesProvider, i10.a(), 14, null, null, a0Var.f47172a0).show();
                return;
            }
        }
        nf.e g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = a0Var.m0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(a0Var.currentAccount).getInputPeer(a0Var.f47172a0);
        tL_sendStarGiftOffer.duration = a0Var.f47184n0;
        tL_sendStarGiftOffer.slug = a0Var.Y.slug;
        tL_sendStarGiftOffer.random_id = j10;
        if (i11 > 0) {
            tL_sendStarGiftOffer.flags = 1 | tL_sendStarGiftOffer.flags;
            tL_sendStarGiftOffer.allow_paid_stars = j3;
        }
        ConnectionsManager.getInstance(a0Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new org.telegram.tgnet.e(a0Var, g10, a2Var, 7));
    }

    public static void Q(a0 a0Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3) {
        zf.a aVar;
        String str;
        boolean z10;
        String formatString;
        ?? r14;
        boolean z11;
        if (a0Var.f47179h0.W) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.b.b(i10);
                return;
            }
            s5 x10 = s5.x(i10, a0Var.m0.f49224a);
            if (x10.e) {
                aVar = zf.a.l(x10.p());
            } else {
                aVar = null;
            }
            zf.b bVar = zf.b.f49226a;
            zf.b bVar2 = zf.b.f49227b;
            if (aVar != null) {
                long j10 = aVar.f49225b;
                zf.a aVar2 = a0Var.m0;
                if (j10 >= aVar2.f49225b) {
                    String str2 = a0Var.Z;
                    long j11 = a0Var.f47172a0;
                    String d = aVar2.d();
                    if (a0Var.m0.f49224a == bVar2) {
                        str = str2;
                        z10 = true;
                    } else {
                        str = str2;
                        z10 = false;
                    }
                    LinearLayout linearLayout = new LinearLayout(a0Var.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(a0Var.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i11 = org.telegram.ui.ActionBar.h6.f19165j5;
                    org.telegram.ui.Cells.c1.p(i11, a0Var.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, w7.y5.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(a0Var.getContext());
                    ok.n(i11, a0Var.resourcesProvider, textView2, 1, 16.0f);
                    if (a0Var.m0.f49224a == bVar) {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j11), str);
                    } else {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j11), str);
                    }
                    textView2.setText(AndroidUtilities.replaceTags(formatString));
                    linearLayout.addView(textView2, w7.y5.t(-1, -2, 48, 24, 4, 24, 4));
                    a01 a01Var = new a01(a0Var.getContext(), a0Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(a0Var.currentAccount).getSendPaidMessagesStars(j11);
                    final zf.a g10 = zf.a.g(sendPaidMessagesStars, bVar);
                    a01Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), w7.X0(z10, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    int i12 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
                    if (i12 > 0) {
                        r14 = 0;
                        a01Var.c(LocaleController.getString(R.string.GiftOfferRowFee), w7.X0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    a01Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", a0Var.f47184n0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(a01Var, w7.y5.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(a0Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i12 == 0) {
                        spannableStringBuilder.append((CharSequence) w7.S0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else if (z10) {
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, w7.S0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), w7.Q0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    } else {
                        z11 = z10;
                        spannableStringBuilder.append((CharSequence) w7.Q0(LocaleController.formatString(R.string.GiftOfferPay, zf.a.i(a0Var.m0.f49225b + g10.f49225b, bVar).d())));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a0Var.getContext(), 0, a0Var.resourcesProvider);
                        alertDialog$Builder.n(linearLayout);
                        final boolean z12 = z11;
                        alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.z1() {
                            @Override
                            public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i13) {
                                a0.P(a0.this, sendPaidMessagesStars, z12, g10, nextRandomId, a2Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
                        a2Var.X0 = true;
                        a2Var.show();
                        return;
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(a0Var.getContext(), 0, a0Var.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.z1() {
                        @Override
                        public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i13) {
                            a0.P(a0.this, sendPaidMessagesStars, z122, g10, nextRandomId, a2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f18661a;
                    a2Var2.X0 = true;
                    a2Var2.show();
                    return;
                }
            }
            zf.a aVar3 = a0Var.m0;
            zf.b bVar3 = aVar3.f49224a;
            if (bVar3 == bVar) {
                new l7(context, d6Var, aVar3.a(), 14, null, null, j3).show();
            } else if (bVar3 == bVar2) {
                new di.h(context, d6Var, aVar3, true, null).show();
            }
        }
    }

    public static void R(a0 a0Var, nf.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(a0Var.currentAccount).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new u(a0Var, eVar, a2Var, updates, tL_error, 0));
    }

    public final void S() {
        boolean z10;
        float f7;
        boolean z11 = this.f47190t0;
        a aVar = this.X;
        if ((z11 && !isDismissed() && aVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.f47173b0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f47186p0 != z10) {
            this.f47186p0 = z10;
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
                ok.r(scaleY, f11, 180L);
            }
        }
    }

    public final void T(boolean z10) {
        boolean z11;
        if (this.f47185o0 == 0 && this.m0.f49225b > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ci.d dVar = this.f47179h0;
        if (dVar.W != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f7 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f7 = 1.0f;
                }
                ok.r(animate, f7, 180L);
                return;
            }
            if (z11) {
                f7 = 1.0f;
            }
            dVar.setAlpha(f7);
        }
    }

    public final void U(zf.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        char c10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z16;
        String formatNumber;
        qq[] qqVarArr;
        double d;
        float f7;
        float f10;
        zf.b bVar;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i15;
        zf.a aVar2 = this.m0;
        int i16 = this.f47185o0;
        this.f47185o0 = 0;
        if (aVar != null) {
            this.m0 = aVar;
        } else {
            this.m0 = zf.a.i(0L, aVar2.f49224a);
            this.f47185o0 |= 1;
        }
        zf.b bVar2 = this.m0.f49224a;
        l.d dVar = this.f47183l0;
        n7.z0[] z0VarArr = (n7.z0[]) dVar.f13924a;
        long j3 = ((zf.a) ((n7.z0[]) dVar.f13924a)[bVar2.ordinal()].f15411c).f49225b;
        zf.a aVar3 = this.m0;
        if (j3 < aVar3.f49225b) {
            this.f47185o0 |= 4;
        }
        if (!aVar3.k() && ((zf.a) z0VarArr[this.m0.f49224a.ordinal()].f15410b).f49225b > this.m0.f49225b) {
            this.f47185o0 |= 2;
        }
        if (!z11 && aVar2.f49224a == this.m0.f49224a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar2.f49225b == this.m0.f49225b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i16 == this.f47185o0) {
            z15 = false;
        } else {
            z15 = true;
        }
        zf.b bVar3 = zf.b.f49226a;
        EditTextBoldCursor editTextBoldCursor = this.f47175d0;
        zf.b bVar4 = zf.b.f49227b;
        if (z13) {
            n40 n40Var = this.f47173b0;
            if (n40Var != null) {
                if (this.m0.f49224a == bVar3) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                n40Var.a(i15, z12);
            }
            String shortName = DialogObject.getShortName(this.f47172a0);
            zf.b bVar5 = this.m0.f49224a;
            TextView textView = this.f47178g0;
            if (bVar5 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((zf.a) z0VarArr[this.m0.f49224a.ordinal()].f15411c).a()).length())});
            } else if (bVar5 == bVar4) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((zf.a) z0VarArr[this.m0.f49224a.ordinal()].f15411c).a()).length() + 3)});
            }
            ImageView imageView = this.f47182k0;
            ImageView imageView2 = this.f47181j0;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                c10 = 0;
                if (this.m0.f49224a == bVar3) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.m0.f49224a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.m0.f49224a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.m0.f49224a == bVar4) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.m0.f49224a == bVar4) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.m0.f49224a == bVar4) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                c10 = 0;
                if (this.m0.f49224a == bVar3) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                imageView2.setAlpha(f7);
                if (this.m0.f49224a == bVar4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            a aVar4 = this.X;
            if (aVar4 != null && aVar4.e != (bVar = this.m0.f49224a)) {
                aVar4.e = bVar;
                aVar4.a();
            }
        } else {
            c10 = 0;
        }
        if (z13 || z15) {
            if (this.m0.f49224a == bVar3) {
                i10 = R.string.GiftOfferStarsToOffer;
            } else {
                i10 = R.string.GiftOfferTONToOffer;
            }
            this.f47174c0.setText(LocaleController.getString(i10));
            zf.b bVar6 = this.m0.f49224a;
            int i17 = this.f47185o0;
            int i18 = i17 & 4;
            String str = this.Z;
            TextView textView2 = this.f47176e0;
            if (i18 != 0) {
                if (bVar6 == bVar3) {
                    i14 = R.string.GiftOfferStarsToOfferInfoIsHigh;
                } else {
                    i14 = R.string.GiftOfferTONToOfferInfoIsHigh;
                }
                Object[] objArr = new Object[2];
                objArr[c10] = ((zf.a) z0VarArr[bVar6.ordinal()].f15411c).d();
                objArr[1] = str;
                ok.q(i14, objArr, textView2);
            } else if ((i17 & 2) != 0) {
                if (bVar6 == bVar3) {
                    i12 = R.string.GiftOfferStarsToOfferInfoIsLow;
                } else {
                    i12 = R.string.GiftOfferTONToOfferInfoIsLow;
                }
                Object[] objArr2 = new Object[2];
                objArr2[c10] = ((zf.a) z0VarArr[bVar6.ordinal()].f15410b).d();
                objArr2[1] = str;
                ok.q(i12, objArr2, textView2);
            } else {
                if (bVar6 == bVar3) {
                    i11 = R.string.GiftOfferStarsToOfferInfo;
                } else {
                    i11 = R.string.GiftOfferTONToOfferInfo;
                }
                Object[] objArr3 = new Object[1];
                objArr3[c10] = str;
                ok.q(i11, objArr3, textView2);
            }
            if ((this.f47185o0 & (-9)) == 0) {
                i13 = org.telegram.ui.ActionBar.h6.f19442y6;
            } else {
                i13 = org.telegram.ui.ActionBar.h6.f19298q7;
            }
            textView2.setTextColor(getThemedColor(i13));
        }
        if (z13 || z14 || z15) {
            zf.a aVar5 = this.m0;
            if (aVar5.f49224a == bVar4) {
                z16 = true;
            } else {
                z16 = false;
            }
            int i19 = R.string.GiftOfferButtonStars;
            if (z16) {
                formatNumber = aVar5.b();
            } else {
                formatNumber = LocaleController.formatNumber(aVar5.a(), ',');
            }
            Object[] objArr4 = new Object[1];
            objArr4[c10] = formatNumber;
            String formatString = LocaleController.formatString(i19, objArr4);
            if (z16) {
                qqVarArr = this.f47189s0;
            } else {
                qqVarArr = this.f47188r0;
            }
            this.f47179h0.g(w7.V0(z16, formatString, qqVarArr), z12, true);
            T(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.m0.f49224a == bVar4) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.m0.c() * d * 100.0d), "USD", 2));
            this.f47180i0.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.m0.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        a aVar;
        if (this.f47186p0 && (aVar = this.X) != null && f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f7, f10);
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        S();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f47190t0 = true;
        S();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new rg.q1(this, 24), 50L);
    }

    @Override
    public final wl0 v(xl0 xl0Var) {
        k61 k61Var = new k61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 23), this.resourcesProvider);
        this.f47191u0 = k61Var;
        k61Var.f25644r = false;
        return k61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }
}
