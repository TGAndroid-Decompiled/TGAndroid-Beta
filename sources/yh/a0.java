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
import org.telegram.messenger.rk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class a0 extends ab {
    public static final int[] f47198w0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final a X;
    public final TL_stars.TL_starGiftUnique Y;
    public final String Z;
    public final long f47199a0;
    public final l40 f47200b0;
    public final hd0 f47201c0;
    public final EditTextBoldCursor f47202d0;
    public final TextView f47203e0;
    public final y f47204f0;
    public final TextView f47205g0;
    public final ci.d f47206h0;
    public final org.telegram.ui.Components.o6 f47207i0;
    public final ImageView f47208j0;
    public final ImageView f47209k0;
    public final l.d f47210l0;
    public zf.a m0;
    public int f47211n0;
    public int f47212o0;
    public boolean f47213p0;
    public final b1 f47214q0;
    public final oq[] f47215r0;
    public final oq[] f47216s0;
    public boolean f47217t0;
    public k61 f47218u0;
    public final w51 f47219v0;

    public a0(final Context context, final int i10, final long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.f6 f6Var, b1 b1Var) {
        super(context, null, true, false, 2, f6Var);
        TLRPC.User user;
        l.d dVar = new l.d(27);
        org.telegram.ui.Cells.f3[] f3VarArr = (org.telegram.ui.Cells.f3[]) dVar.f13898a;
        this.f47210l0 = dVar;
        this.f47215r0 = new oq[1];
        this.f47216s0 = new oq[1];
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.f47199a0 = j3;
        this.Y = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.Z = hg.k0.j(tL_starGiftUnique.num, ',', sb2);
        this.f47214q0 = b1Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j10 = u5.y(i10, true).j();
        if (j3 > 0 && MessagesController.getInstance(i10).getUserFull(j3) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = tL_starGiftUnique.offer_min_stars;
        zf.b bVar = zf.b.f49254a;
        zf.a g10 = zf.a.g(j11, bVar);
        zf.a g11 = zf.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        zf.b bVar2 = zf.b.f49255b;
        zf.a i11 = zf.a.i(Math.max(g10.e(bVar2).n(2).f49253b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        zf.a i12 = zf.a.i(Math.max(i11.f49253b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        zf.b bVar3 = g10.f49252a;
        if (bVar3 == g11.f49252a) {
            f3VarArr[bVar3.ordinal()] = new org.telegram.ui.Cells.f3(g10, g11, false, 26);
        }
        zf.b bVar4 = i11.f49252a;
        if (bVar4 == i12.f49252a) {
            f3VarArr[bVar4.ordinal()] = new org.telegram.ui.Cells.f3(i11, i12, false, 26);
        }
        a aVar = new a(context, i10, f6Var);
        this.X = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(false);
        aVar.setClickable(false);
        this.container.addView(aVar, w7.y5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.b6.a(aVar);
        aVar.setOnClickListener(new xg.e(this, context, f6Var, 6));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19165h5, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f47202d0 = editTextBoldCursor;
        if (j10) {
            l40 l40Var = new l40(context, f6Var);
            this.f47200b0 = l40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            l40Var.b(arrayList, new v(this, 0));
            linearLayout.addView(l40Var, w7.y5.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.f47200b0 = null;
        }
        LinearLayout f7 = rk.f(context, 1);
        linearLayout.addView(f7, w7.y5.l(1.0f, -1, -2));
        hd0 hd0Var = new hd0(context, null);
        this.f47201c0 = hd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        hd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        hd0Var.e(editTextBoldCursor);
        hd0Var.b(1.0f, 0.0f, false);
        hd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ii.v5(this, 4));
        hd0Var.addView(editTextBoldCursor, w7.y5.e(-1, -2, 48));
        f7.addView(hd0Var, w7.y5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f47208j0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        hd0Var.addView(imageView, w7.y5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f47209k0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        hd0Var.addView(imageView2, w7.y5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f47207i0 = o6Var;
        int i14 = org.telegram.ui.ActionBar.j6.f19477y6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var.setGravity(5);
        hd0Var.addView(o6Var, w7.y5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f47203e0 = textView;
        textView.setTextSize(1, 13.0f);
        f7.addView(textView, w7.y5.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f47204f0 = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        hd0 hd0Var2 = new hd0(context, null);
        hd0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        hd0Var2.e(editTextBoldCursor2);
        hd0Var2.addView((View) editTextBoldCursor2, w7.y5.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.b6.b(hd0Var2, 0.02f, 1.2f);
        hd0Var2.setOnClickListener(new w(0, this, context));
        f7.addView(hd0Var2, w7.y5.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, f6Var), PorterDuff.Mode.SRC_IN));
        hd0Var2.addView(imageView3, w7.y5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f47205g0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        f7.addView(textView2, w7.y5.t(-1, -2, 55, 33, 4, 33, 0));
        ci.d dVar2 = new ci.d(context, f6Var, true);
        this.f47206h0 = dVar2;
        dVar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                a0.Q(a0.this, i10, context, f6Var, j3);
            }
        });
        U(zf.a.i(0L, bVar), false, true, false);
        if (this.f47211n0 != 86400) {
            this.f47211n0 = 86400;
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
        vl0 vl0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.f47219v0 = w51.k(linearLayout);
        this.f47218u0.N(false);
    }

    public static void P(a0 a0Var, long j3, boolean z10, zf.a aVar, long j10, org.telegram.ui.ActionBar.b2 b2Var) {
        zf.a aVar2;
        zf.a i10;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 > 0) {
            int i12 = a0Var.currentAccount;
            zf.b bVar = zf.b.f49254a;
            u5 x10 = u5.x(i12, bVar);
            if (x10.e) {
                aVar2 = zf.a.l(x10.p());
            } else {
                aVar2 = null;
            }
            if (z10) {
                i10 = zf.a.g(j3, bVar);
            } else {
                i10 = zf.a.i(a0Var.m0.f49253b + aVar.f49253b, bVar);
            }
            if (aVar2 == null || aVar2.f49253b < i10.f49253b) {
                new l7(a0Var.getContext(), a0Var.resourcesProvider, i10.a(), 14, null, null, a0Var.f47199a0).show();
                return;
            }
        }
        nf.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = a0Var.m0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(a0Var.currentAccount).getInputPeer(a0Var.f47199a0);
        tL_sendStarGiftOffer.duration = a0Var.f47211n0;
        tL_sendStarGiftOffer.slug = a0Var.Y.slug;
        tL_sendStarGiftOffer.random_id = j10;
        if (i11 > 0) {
            tL_sendStarGiftOffer.flags = 1 | tL_sendStarGiftOffer.flags;
            tL_sendStarGiftOffer.allow_paid_stars = j3;
        }
        ConnectionsManager.getInstance(a0Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new org.telegram.tgnet.e(a0Var, g10, b2Var, 7));
    }

    public static void Q(a0 a0Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3) {
        zf.a aVar;
        String str;
        boolean z10;
        String formatString;
        ?? r14;
        boolean z11;
        if (a0Var.f47206h0.W) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.b.b(i10);
                return;
            }
            u5 x10 = u5.x(i10, a0Var.m0.f49252a);
            if (x10.e) {
                aVar = zf.a.l(x10.p());
            } else {
                aVar = null;
            }
            zf.b bVar = zf.b.f49254a;
            zf.b bVar2 = zf.b.f49255b;
            if (aVar != null) {
                long j10 = aVar.f49253b;
                zf.a aVar2 = a0Var.m0;
                if (j10 >= aVar2.f49253b) {
                    String str2 = a0Var.Z;
                    long j11 = a0Var.f47199a0;
                    String d = aVar2.d();
                    if (a0Var.m0.f49252a == bVar2) {
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
                    int i11 = org.telegram.ui.ActionBar.j6.f19201j5;
                    org.telegram.ui.Cells.c1.q(i11, a0Var.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, w7.y5.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(a0Var.getContext());
                    rk.n(i11, a0Var.resourcesProvider, textView2, 1, 16.0f);
                    if (a0Var.m0.f49252a == bVar) {
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
                    a01Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", a0Var.f47211n0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(a01Var, w7.y5.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(a0Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i12 == 0) {
                        spannableStringBuilder.append((CharSequence) w7.S0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else if (z10) {
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, w7.S0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), w7.Q0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    } else {
                        z11 = z10;
                        spannableStringBuilder.append((CharSequence) w7.Q0(LocaleController.formatString(R.string.GiftOfferPay, zf.a.i(a0Var.m0.f49253b + g10.f49253b, bVar).d())));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a0Var.getContext(), 0, a0Var.resourcesProvider);
                        alertDialog$Builder.n(linearLayout);
                        final boolean z12 = z11;
                        alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.a2() {
                            @Override
                            public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i13) {
                                a0.P(a0.this, sendPaidMessagesStars, z12, g10, nextRandomId, b2Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                        b2Var.X0 = true;
                        b2Var.show();
                        return;
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(a0Var.getContext(), 0, a0Var.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.a2() {
                        @Override
                        public final void k(org.telegram.ui.ActionBar.b2 b2Var2, int i13) {
                            a0.P(a0.this, sendPaidMessagesStars, z122, g10, nextRandomId, b2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18654a;
                    b2Var2.X0 = true;
                    b2Var2.show();
                    return;
                }
            }
            zf.a aVar3 = a0Var.m0;
            zf.b bVar3 = aVar3.f49252a;
            if (bVar3 == bVar) {
                new l7(context, f6Var, aVar3.a(), 14, null, null, j3).show();
            } else if (bVar3 == bVar2) {
                new di.h(context, f6Var, aVar3, true, null).show();
            }
        }
    }

    public static void R(a0 a0Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(a0Var.currentAccount).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new u(a0Var, eVar, b2Var, updates, tL_error, 0));
    }

    public final void S() {
        boolean z10;
        float f7;
        boolean z11 = this.f47217t0;
        a aVar = this.X;
        if ((z11 && !isDismissed() && aVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.f47200b0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f47213p0 != z10) {
            this.f47213p0 = z10;
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
                rk.r(scaleY, f11, 180L);
            }
        }
    }

    public final void T(boolean z10) {
        boolean z11;
        if (this.f47212o0 == 0 && this.m0.f49253b > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ci.d dVar = this.f47206h0;
        if (dVar.W != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f7 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f7 = 1.0f;
                }
                rk.r(animate, f7, 180L);
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
        oq[] oqVarArr;
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
        int i16 = this.f47212o0;
        this.f47212o0 = 0;
        if (aVar != null) {
            this.m0 = aVar;
        } else {
            this.m0 = zf.a.i(0L, aVar2.f49252a);
            this.f47212o0 |= 1;
        }
        zf.b bVar2 = this.m0.f49252a;
        l.d dVar = this.f47210l0;
        org.telegram.ui.Cells.f3[] f3VarArr = (org.telegram.ui.Cells.f3[]) dVar.f13898a;
        long j3 = ((zf.a) ((org.telegram.ui.Cells.f3[]) dVar.f13898a)[bVar2.ordinal()].f20270c).f49253b;
        zf.a aVar3 = this.m0;
        if (j3 < aVar3.f49253b) {
            this.f47212o0 |= 4;
        }
        if (!aVar3.k() && ((zf.a) f3VarArr[this.m0.f49252a.ordinal()].f20269b).f49253b > this.m0.f49253b) {
            this.f47212o0 |= 2;
        }
        if (!z11 && aVar2.f49252a == this.m0.f49252a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar2.f49253b == this.m0.f49253b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i16 == this.f47212o0) {
            z15 = false;
        } else {
            z15 = true;
        }
        zf.b bVar3 = zf.b.f49254a;
        EditTextBoldCursor editTextBoldCursor = this.f47202d0;
        zf.b bVar4 = zf.b.f49255b;
        if (z13) {
            l40 l40Var = this.f47200b0;
            if (l40Var != null) {
                if (this.m0.f49252a == bVar3) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                l40Var.a(i15, z12);
            }
            String shortName = DialogObject.getShortName(this.f47199a0);
            zf.b bVar5 = this.m0.f49252a;
            TextView textView = this.f47205g0;
            if (bVar5 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((zf.a) f3VarArr[this.m0.f49252a.ordinal()].f20270c).a()).length())});
            } else if (bVar5 == bVar4) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((zf.a) f3VarArr[this.m0.f49252a.ordinal()].f20270c).a()).length() + 3)});
            }
            ImageView imageView = this.f47209k0;
            ImageView imageView2 = this.f47208j0;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                c10 = 0;
                if (this.m0.f49252a == bVar3) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.m0.f49252a == bVar3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.m0.f49252a == bVar3) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.m0.f49252a == bVar4) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.m0.f49252a == bVar4) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.m0.f49252a == bVar4) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                c10 = 0;
                if (this.m0.f49252a == bVar3) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                imageView2.setAlpha(f7);
                if (this.m0.f49252a == bVar4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            a aVar4 = this.X;
            if (aVar4 != null && aVar4.e != (bVar = this.m0.f49252a)) {
                aVar4.e = bVar;
                aVar4.a();
            }
        } else {
            c10 = 0;
        }
        if (z13 || z15) {
            if (this.m0.f49252a == bVar3) {
                i10 = R.string.GiftOfferStarsToOffer;
            } else {
                i10 = R.string.GiftOfferTONToOffer;
            }
            this.f47201c0.setText(LocaleController.getString(i10));
            zf.b bVar6 = this.m0.f49252a;
            int i17 = this.f47212o0;
            int i18 = i17 & 4;
            String str = this.Z;
            TextView textView2 = this.f47203e0;
            if (i18 != 0) {
                if (bVar6 == bVar3) {
                    i14 = R.string.GiftOfferStarsToOfferInfoIsHigh;
                } else {
                    i14 = R.string.GiftOfferTONToOfferInfoIsHigh;
                }
                Object[] objArr = new Object[2];
                objArr[c10] = ((zf.a) f3VarArr[bVar6.ordinal()].f20270c).d();
                objArr[1] = str;
                rk.q(i14, objArr, textView2);
            } else if ((i17 & 2) != 0) {
                if (bVar6 == bVar3) {
                    i12 = R.string.GiftOfferStarsToOfferInfoIsLow;
                } else {
                    i12 = R.string.GiftOfferTONToOfferInfoIsLow;
                }
                Object[] objArr2 = new Object[2];
                objArr2[c10] = ((zf.a) f3VarArr[bVar6.ordinal()].f20269b).d();
                objArr2[1] = str;
                rk.q(i12, objArr2, textView2);
            } else {
                if (bVar6 == bVar3) {
                    i11 = R.string.GiftOfferStarsToOfferInfo;
                } else {
                    i11 = R.string.GiftOfferTONToOfferInfo;
                }
                Object[] objArr3 = new Object[1];
                objArr3[c10] = str;
                rk.q(i11, objArr3, textView2);
            }
            if ((this.f47212o0 & (-9)) == 0) {
                i13 = org.telegram.ui.ActionBar.j6.f19477y6;
            } else {
                i13 = org.telegram.ui.ActionBar.j6.f19333q7;
            }
            textView2.setTextColor(getThemedColor(i13));
        }
        if (z13 || z14 || z15) {
            zf.a aVar5 = this.m0;
            if (aVar5.f49252a == bVar4) {
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
                oqVarArr = this.f47216s0;
            } else {
                oqVarArr = this.f47215r0;
            }
            this.f47206h0.g(w7.V0(z16, formatString, oqVarArr), z12, true);
            T(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.m0.f49252a == bVar4) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.m0.c() * d * 100.0d), "USD", 2));
            this.f47207i0.c(sb2, z12, true);
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
        if (this.f47213p0 && (aVar = this.X) != null && f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
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
        this.f47217t0 = true;
        S();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new rg.q1(this, 24), 50L);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        k61 k61Var = new k61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 23), this.resourcesProvider);
        this.f47218u0 = k61Var;
        k61Var.f25678r = false;
        return k61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }
}
