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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
public final class b0 extends cb {
    public static final int[] f51118w0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final a X;
    public final TL_stars.TL_starGiftUnique Y;
    public final String Z;
    public final long f51119a0;
    public final p40 f51120b0;
    public final ld0 f51121c0;
    public final EditTextBoldCursor f51122d0;
    public final TextView f51123e0;
    public final z f51124f0;
    public final TextView f51125g0;
    public final ci.d f51126h0;
    public final org.telegram.ui.Components.p6 f51127i0;
    public final ImageView f51128j0;
    public final ImageView f51129k0;
    public final w9.k f51130l0;
    public zf.a m0;
    public int f51131n0;
    public int f51132o0;
    public boolean f51133p0;
    public final d1 f51134q0;
    public final rq[] f51135r0;
    public final rq[] f51136s0;
    public boolean f51137t0;
    public w61 f51138u0;
    public final h61 f51139v0;

    public b0(final Context context, final int i10, final long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.d6 d6Var, d1 d1Var) {
        super(context, null, true, false, 2, d6Var);
        TLRPC.User user;
        w9.k kVar = new w9.k(4);
        n7.z0[] z0VarArr = (n7.z0[]) kVar.f48956a;
        this.f51130l0 = kVar;
        this.f51135r0 = new rq[1];
        this.f51136s0 = new rq[1];
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.f51119a0 = j3;
        this.Y = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.Z = org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2);
        this.f51134q0 = d1Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j10 = u5.y(i10, true).j();
        if (j3 > 0 && MessagesController.getInstance(i10).getUserFull(j3) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = tL_starGiftUnique.offer_min_stars;
        zf.b bVar = zf.b.f53323a;
        zf.a g10 = zf.a.g(j11, bVar);
        zf.a g11 = zf.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        zf.b bVar2 = zf.b.f53324b;
        zf.a i11 = zf.a.i(Math.max(g10.e(bVar2).n(2).f53322b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        zf.a i12 = zf.a.i(Math.max(i11.f53322b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        zf.b bVar3 = g10.f53321a;
        if (bVar3 == g11.f53321a) {
            z0VarArr[bVar3.ordinal()] = new n7.z0(29, g10, g11);
        }
        zf.b bVar4 = i11.f53321a;
        if (bVar4 == i12.f53321a) {
            z0VarArr[bVar4.ordinal()] = new n7.z0(29, i11, i12);
        }
        a aVar = new a(context, i10, d6Var);
        this.X = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(false);
        aVar.setClickable(false);
        this.container.addView(aVar, w7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.b6.a(aVar);
        aVar.setOnClickListener(new xg.e(this, context, d6Var, 6));
        fixNavigationBar(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20899h5, d6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f51122d0 = editTextBoldCursor;
        if (j10) {
            p40 p40Var = new p40(context, d6Var);
            this.f51120b0 = p40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            p40Var.b(arrayList, new w(this, 0));
            linearLayout.addView(p40Var, w7.z5.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.f51120b0 = null;
        }
        LinearLayout e7 = bi.e(context, 1);
        linearLayout.addView(e7, w7.z5.l(1.0f, -1, -2));
        ld0 ld0Var = new ld0(context, null);
        this.f51121c0 = ld0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        ld0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        ld0Var.e(editTextBoldCursor);
        ld0Var.b(1.0f, 0.0f, false);
        ld0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ii.x5(this, 4));
        ld0Var.addView(editTextBoldCursor, w7.z5.e(-1, -2, 48));
        e7.addView(ld0Var, w7.z5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f51128j0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        ld0Var.addView(imageView, w7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f51129k0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        ld0Var.addView(imageView2, w7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, false, false);
        this.f51127i0 = p6Var;
        int i14 = org.telegram.ui.ActionBar.i6.f21214y6;
        p6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        p6Var.setTextSize(AndroidUtilities.dp(13.0f));
        p6Var.setGravity(5);
        ld0Var.addView(p6Var, w7.z5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f51123e0 = textView;
        textView.setTextSize(1, 13.0f);
        e7.addView(textView, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f51124f0 = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        ld0 ld0Var2 = new ld0(context, null);
        ld0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        ld0Var2.e(editTextBoldCursor2);
        ld0Var2.addView((View) editTextBoldCursor2, w7.z5.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.b6.b(ld0Var2, 0.02f, 1.2f);
        ld0Var2.setOnClickListener(new x(0, this, context));
        e7.addView(ld0Var2, w7.z5.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.W5, d6Var), PorterDuff.Mode.SRC_IN));
        ld0Var2.addView(imageView3, w7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f51125g0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        e7.addView(textView2, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        ci.d dVar = new ci.d(context, d6Var, true);
        this.f51126h0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                b0.O(b0.this, i10, context, d6Var, j3);
            }
        });
        S(zf.a.i(0L, bVar), false, true, false);
        if (this.f51131n0 != 86400) {
            this.f51131n0 = 86400;
            editTextBoldCursor2.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        R(false);
        editTextBoldCursor.addTextChangedListener(new a0(this));
        FrameLayout.LayoutParams d = w7.z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(dVar, d);
        zl0 zl0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.f51139v0 = h61.k(linearLayout);
        this.f51138u0.N(false);
    }

    public static void N(b0 b0Var, long j3, boolean z10, zf.a aVar, long j10, org.telegram.ui.ActionBar.b2 b2Var) {
        zf.a aVar2;
        zf.a i10;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 > 0) {
            int i12 = b0Var.currentAccount;
            zf.b bVar = zf.b.f53323a;
            u5 x10 = u5.x(i12, bVar);
            if (x10.f52088e) {
                aVar2 = zf.a.l(x10.p());
            } else {
                aVar2 = null;
            }
            if (z10) {
                i10 = zf.a.g(j3, bVar);
            } else {
                i10 = zf.a.i(b0Var.m0.f53322b + aVar.f53322b, bVar);
            }
            if (aVar2 == null || aVar2.f53322b < i10.f53322b) {
                new n7(b0Var.getContext(), b0Var.resourcesProvider, i10.a(), 14, null, null, b0Var.f51119a0).show();
                return;
            }
        }
        nf.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = b0Var.m0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(b0Var.currentAccount).getInputPeer(b0Var.f51119a0);
        tL_sendStarGiftOffer.duration = b0Var.f51131n0;
        tL_sendStarGiftOffer.slug = b0Var.Y.slug;
        tL_sendStarGiftOffer.random_id = j10;
        if (i11 > 0) {
            tL_sendStarGiftOffer.flags = 1 | tL_sendStarGiftOffer.flags;
            tL_sendStarGiftOffer.allow_paid_stars = j3;
        }
        ConnectionsManager.getInstance(b0Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new org.telegram.tgnet.e(b0Var, g10, b2Var, 7));
    }

    public static void O(b0 b0Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3) {
        zf.a aVar;
        String str;
        boolean z10;
        String formatString;
        ?? r14;
        boolean z11;
        if (b0Var.f51126h0.W) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.b.b(i10);
                return;
            }
            u5 x10 = u5.x(i10, b0Var.m0.f53321a);
            if (x10.f52088e) {
                aVar = zf.a.l(x10.p());
            } else {
                aVar = null;
            }
            zf.b bVar = zf.b.f53323a;
            zf.b bVar2 = zf.b.f53324b;
            if (aVar != null) {
                long j10 = aVar.f53322b;
                zf.a aVar2 = b0Var.m0;
                if (j10 >= aVar2.f53322b) {
                    String str2 = b0Var.Z;
                    long j11 = b0Var.f51119a0;
                    String d = aVar2.d();
                    if (b0Var.m0.f53321a == bVar2) {
                        str = str2;
                        z10 = true;
                    } else {
                        str = str2;
                        z10 = false;
                    }
                    LinearLayout linearLayout = new LinearLayout(b0Var.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(b0Var.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i11 = org.telegram.ui.ActionBar.i6.f20935j5;
                    org.telegram.ui.Cells.c1.p(i11, b0Var.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, w7.z5.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(b0Var.getContext());
                    bi.m(i11, b0Var.resourcesProvider, textView2, 1, 16.0f);
                    if (b0Var.m0.f53321a == bVar) {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j11), str);
                    } else {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j11), str);
                    }
                    textView2.setText(AndroidUtilities.replaceTags(formatString));
                    linearLayout.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
                    l01 l01Var = new l01(b0Var.getContext(), b0Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(b0Var.currentAccount).getSendPaidMessagesStars(j11);
                    final zf.a g10 = zf.a.g(sendPaidMessagesStars, bVar);
                    l01Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), z7.d1(z10, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    int i12 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
                    if (i12 > 0) {
                        r14 = 0;
                        l01Var.c(LocaleController.getString(R.string.GiftOfferRowFee), z7.d1(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    l01Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", b0Var.f51131n0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(l01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(b0Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i12 == 0) {
                        spannableStringBuilder.append((CharSequence) z7.Y0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else if (z10) {
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, z7.Y0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), z7.W0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    } else {
                        z11 = z10;
                        spannableStringBuilder.append((CharSequence) z7.W0(LocaleController.formatString(R.string.GiftOfferPay, zf.a.i(b0Var.m0.f53322b + g10.f53322b, bVar).d())));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b0Var.getContext(), 0, b0Var.resourcesProvider);
                        alertDialog$Builder.n(linearLayout);
                        final boolean z12 = z11;
                        alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.a2() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i13) {
                                b0.N(b0.this, sendPaidMessagesStars, z12, g10, nextRandomId, b2Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                        b2Var.X0 = true;
                        b2Var.show();
                        return;
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(b0Var.getContext(), 0, b0Var.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.a2() {
                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i13) {
                            b0.N(b0.this, sendPaidMessagesStars, z122, g10, nextRandomId, b2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20377a;
                    b2Var2.X0 = true;
                    b2Var2.show();
                    return;
                }
            }
            zf.a aVar3 = b0Var.m0;
            zf.b bVar3 = aVar3.f53321a;
            if (bVar3 == bVar) {
                new n7(context, d6Var, aVar3.a(), 14, null, null, j3).show();
            } else if (bVar3 == bVar2) {
                new di.j(context, d6Var, aVar3, true, null).show();
            }
        }
    }

    public static void P(b0 b0Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(b0Var.currentAccount).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new v(b0Var, eVar, b2Var, updates, tL_error, 0));
    }

    public final void Q() {
        boolean z10;
        float f7;
        boolean z11 = this.f51137t0;
        a aVar = this.X;
        if ((z11 && !isDismissed() && aVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.f51120b0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f51133p0 != z10) {
            this.f51133p0 = z10;
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
                bi.q(scaleY, f11, 180L);
            }
        }
    }

    public final void R(boolean z10) {
        boolean z11;
        if (this.f51132o0 == 0 && this.m0.f53322b > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ci.d dVar = this.f51126h0;
        if (dVar.W != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f7 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f7 = 1.0f;
                }
                bi.q(animate, f7, 180L);
                return;
            }
            if (z11) {
                f7 = 1.0f;
            }
            dVar.setAlpha(f7);
        }
    }

    public final void S(zf.a aVar, boolean z10, boolean z11, boolean z12) {
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
        rq[] rqVarArr;
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
        int i16 = this.f51132o0;
        this.f51132o0 = 0;
        if (aVar != null) {
            this.m0 = aVar;
        } else {
            this.m0 = zf.a.i(0L, aVar2.f53321a);
            this.f51132o0 |= 1;
        }
        zf.b bVar2 = this.m0.f53321a;
        w9.k kVar = this.f51130l0;
        n7.z0[] z0VarArr = (n7.z0[]) kVar.f48956a;
        long j3 = ((zf.a) ((n7.z0[]) kVar.f48956a)[bVar2.ordinal()].f16857c).f53322b;
        zf.a aVar3 = this.m0;
        if (j3 < aVar3.f53322b) {
            this.f51132o0 |= 4;
        }
        if (!aVar3.k() && ((zf.a) z0VarArr[this.m0.f53321a.ordinal()].f16856b).f53322b > this.m0.f53322b) {
            this.f51132o0 |= 2;
        }
        if (!z11 && aVar2.f53321a == this.m0.f53321a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar2.f53322b == this.m0.f53322b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i16 == this.f51132o0) {
            z15 = false;
        } else {
            z15 = true;
        }
        zf.b bVar3 = zf.b.f53323a;
        EditTextBoldCursor editTextBoldCursor = this.f51122d0;
        zf.b bVar4 = zf.b.f53324b;
        if (z13) {
            p40 p40Var = this.f51120b0;
            if (p40Var != null) {
                if (this.m0.f53321a == bVar3) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                p40Var.a(i15, z12);
            }
            String shortName = DialogObject.getShortName(this.f51119a0);
            zf.b bVar5 = this.m0.f53321a;
            TextView textView = this.f51125g0;
            if (bVar5 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((zf.a) z0VarArr[this.m0.f53321a.ordinal()].f16857c).a()).length())});
            } else if (bVar5 == bVar4) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((zf.a) z0VarArr[this.m0.f53321a.ordinal()].f16857c).a()).length() + 3)});
            }
            ImageView imageView = this.f51129k0;
            ImageView imageView2 = this.f51128j0;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                c10 = 0;
                if (this.m0.f53321a == bVar3) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.m0.f53321a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.m0.f53321a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.m0.f53321a == bVar4) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.m0.f53321a == bVar4) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.m0.f53321a == bVar4) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                c10 = 0;
                if (this.m0.f53321a == bVar3) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                imageView2.setAlpha(f7);
                if (this.m0.f53321a == bVar4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            a aVar4 = this.X;
            if (aVar4 != null && aVar4.f51067e != (bVar = this.m0.f53321a)) {
                aVar4.f51067e = bVar;
                aVar4.a();
            }
        } else {
            c10 = 0;
        }
        if (z13 || z15) {
            if (this.m0.f53321a == bVar3) {
                i10 = R.string.GiftOfferStarsToOffer;
            } else {
                i10 = R.string.GiftOfferTONToOffer;
            }
            this.f51121c0.setText(LocaleController.getString(i10));
            zf.b bVar6 = this.m0.f53321a;
            int i17 = this.f51132o0;
            int i18 = i17 & 4;
            String str = this.Z;
            TextView textView2 = this.f51123e0;
            if (i18 != 0) {
                if (bVar6 == bVar3) {
                    i14 = R.string.GiftOfferStarsToOfferInfoIsHigh;
                } else {
                    i14 = R.string.GiftOfferTONToOfferInfoIsHigh;
                }
                Object[] objArr = new Object[2];
                objArr[c10] = ((zf.a) z0VarArr[bVar6.ordinal()].f16857c).d();
                objArr[1] = str;
                bi.p(i14, objArr, textView2);
            } else if ((i17 & 2) != 0) {
                if (bVar6 == bVar3) {
                    i12 = R.string.GiftOfferStarsToOfferInfoIsLow;
                } else {
                    i12 = R.string.GiftOfferTONToOfferInfoIsLow;
                }
                Object[] objArr2 = new Object[2];
                objArr2[c10] = ((zf.a) z0VarArr[bVar6.ordinal()].f16856b).d();
                objArr2[1] = str;
                bi.p(i12, objArr2, textView2);
            } else {
                if (bVar6 == bVar3) {
                    i11 = R.string.GiftOfferStarsToOfferInfo;
                } else {
                    i11 = R.string.GiftOfferTONToOfferInfo;
                }
                Object[] objArr3 = new Object[1];
                objArr3[c10] = str;
                bi.p(i11, objArr3, textView2);
            }
            if ((this.f51132o0 & (-9)) == 0) {
                i13 = org.telegram.ui.ActionBar.i6.f21214y6;
            } else {
                i13 = org.telegram.ui.ActionBar.i6.f21068q7;
            }
            textView2.setTextColor(getThemedColor(i13));
        }
        if (z13 || z14 || z15) {
            zf.a aVar5 = this.m0;
            if (aVar5.f53321a == bVar4) {
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
                rqVarArr = this.f51136s0;
            } else {
                rqVarArr = this.f51135r0;
            }
            this.f51126h0.g(z7.b1(z16, formatString, rqVarArr), z12, true);
            R(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.m0.f53321a == bVar4) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.m0.c() * d * 100.0d), "USD", 2));
            this.f51127i0.c(sb2, z12, true);
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
        if (this.f51133p0 && (aVar = this.X) != null && f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f7, f10);
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        Q();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f51137t0 = true;
        Q();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new rg.s1(this, 24), 50L);
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        w61 w61Var = new w61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 24), this.resourcesProvider);
        this.f51138u0 = w61Var;
        w61Var.f32531r = false;
        return w61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }
}
