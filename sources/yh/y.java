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
import org.telegram.messenger.ai;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.t01;
import z7.ce;
public final class y extends db {
    public static final int[] f53469w0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final a X;
    public final TL_stars.TL_starGiftUnique Y;
    public final String Z;
    public final long f53470a0;
    public final d50 f53471b0;
    public final be0 f53472c0;
    public final EditTextBoldCursor f53473d0;
    public final TextView f53474e0;
    public final w f53475f0;
    public final TextView f53476g0;
    public final ci.d f53477h0;
    public final org.telegram.ui.Components.r6 f53478i0;
    public final ImageView f53479j0;
    public final ImageView f53480k0;
    public final m.f3 f53481l0;
    public zf.a m0;
    public int f53482n0;
    public int f53483o0;
    public boolean f53484p0;
    public final a1 f53485q0;
    public final er[] f53486r0;
    public final er[] f53487s0;
    public boolean f53488t0;
    public e71 f53489u0;
    public final r61 f53490v0;

    public y(final Context context, final int i10, final long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.d6 d6Var, a1 a1Var) {
        super(context, null, true, false, 2, d6Var);
        TLRPC.User user;
        m.f3 f3Var = new m.f3(26);
        ce[] ceVarArr = (ce[]) f3Var.f15693b;
        this.f53481l0 = f3Var;
        this.f53486r0 = new er[1];
        this.f53487s0 = new er[1];
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.f53470a0 = j3;
        this.Y = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.Z = org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2);
        this.f53485q0 = a1Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j10 = n5.y(i10, true).j();
        if (j3 > 0 && MessagesController.getInstance(i10).getUserFull(j3) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = tL_starGiftUnique.offer_min_stars;
        zf.b bVar = zf.b.f54530a;
        zf.a g10 = zf.a.g(j11, bVar);
        zf.a g11 = zf.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        zf.b bVar2 = zf.b.f54531b;
        zf.a i11 = zf.a.i(Math.max(g10.e(bVar2).n(2).f54529b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        zf.a i12 = zf.a.i(Math.max(i11.f54529b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        zf.b bVar3 = g10.f54528a;
        if (bVar3 == g11.f54528a) {
            ceVarArr[bVar3.ordinal()] = new ce(g10, g11);
        }
        zf.b bVar4 = i11.f54528a;
        if (bVar4 == i12.f54528a) {
            ceVarArr[bVar4.ordinal()] = new ce(i11, i12);
        }
        a aVar = new a(context, i10, d6Var);
        this.X = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(false);
        aVar.setClickable(false);
        this.container.addView(aVar, w7.x5.a(-2.0f, 0.0f, 48.0f, 0.0f, 0.0f, -2, 49));
        w7.z5.a(aVar);
        aVar.setOnClickListener(new xg.e(this, context, d6Var, 6));
        fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20857h5, d6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f53473d0 = editTextBoldCursor;
        if (j10) {
            d50 d50Var = new d50(context, d6Var);
            this.f53471b0 = d50Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            d50Var.b(arrayList, new u(this, 0));
            linearLayout.addView(d50Var, w7.x5.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.f53471b0 = null;
        }
        LinearLayout e7 = ai.e(context, 1);
        linearLayout.addView(e7, w7.x5.l(1.0f, -1, -2));
        be0 be0Var = new be0(context, null);
        this.f53472c0 = be0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        editTextBoldCursor.requestFocus();
        be0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        be0Var.e(editTextBoldCursor);
        be0Var.b(1.0f, 0.0f, false);
        be0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ii.x5(this, 4));
        be0Var.addView(editTextBoldCursor, w7.x5.e(-1, -2, 48));
        e7.addView(be0Var, w7.x5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f53479j0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        be0Var.addView(imageView, w7.x5.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        ImageView imageView2 = new ImageView(context);
        this.f53480k0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        be0Var.addView(imageView2, w7.x5.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, false, false);
        this.f53478i0 = r6Var;
        int i14 = org.telegram.ui.ActionBar.h6.f21171y6;
        r6Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        r6Var.setTextSize(AndroidUtilities.dp(13.0f));
        r6Var.setGravity(5);
        be0Var.addView(r6Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 16.0f, 0.0f, -2, 21));
        TextView textView = new TextView(context);
        this.f53474e0 = textView;
        textView.setTextSize(1, 13.0f);
        e7.addView(textView, w7.x5.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f53475f0 = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        be0 be0Var2 = new be0(context, null);
        be0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        be0Var2.e(editTextBoldCursor2);
        be0Var2.addView((View) editTextBoldCursor2, w7.x5.a(-2.0f, 0.0f, 0.0f, 48.0f, 0.0f, -1, 48));
        w7.z5.b(be0Var2, 0.02f, 1.2f);
        be0Var2.setOnClickListener(new xh.a(6, this, context));
        e7.addView(be0Var2, w7.x5.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.W5, d6Var), PorterDuff.Mode.SRC_IN));
        be0Var2.addView(imageView3, w7.x5.a(24.0f, 0.0f, 0.0f, 14.0f, 0.0f, 24, 21));
        TextView textView2 = new TextView(context);
        this.f53476g0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        e7.addView(textView2, w7.x5.t(-1, -2, 55, 33, 4, 33, 0));
        ci.d dVar = new ci.d(context, d6Var, true);
        this.f53477h0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                y.R(y.this, i10, context, d6Var, j3);
            }
        });
        V(zf.a.i(0L, bVar), false, true, false);
        if (this.f53482n0 != 86400) {
            this.f53482n0 = 86400;
            editTextBoldCursor2.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        U(false);
        editTextBoldCursor.addTextChangedListener(new x(this));
        FrameLayout.LayoutParams a2 = w7.x5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80);
        int i15 = a2.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        a2.leftMargin = i15 + i16;
        a2.rightMargin += i16;
        this.containerView.addView(dVar, a2);
        sm0 sm0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        sm0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.f53490v0 = r61.k(linearLayout);
        this.f53489u0.N(false);
    }

    public static void Q(y yVar, long j3, boolean z10, zf.a aVar, long j10, org.telegram.ui.ActionBar.a2 a2Var) {
        zf.a aVar2;
        zf.a i10;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 > 0) {
            int i12 = yVar.currentAccount;
            zf.b bVar = zf.b.f54530a;
            n5 x10 = n5.x(i12, bVar);
            if (x10.f53000e) {
                aVar2 = zf.a.l(x10.p());
            } else {
                aVar2 = null;
            }
            if (z10) {
                i10 = zf.a.g(j3, bVar);
            } else {
                i10 = zf.a.i(yVar.m0.f54529b + aVar.f54529b, bVar);
            }
            if (aVar2 == null || aVar2.f54529b < i10.f54529b) {
                new e7(yVar.getContext(), yVar.resourcesProvider, i10.a(), 14, null, null, yVar.f53470a0).show();
                return;
            }
        }
        of.e g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = yVar.m0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(yVar.currentAccount).getInputPeer(yVar.f53470a0);
        tL_sendStarGiftOffer.duration = yVar.f53482n0;
        tL_sendStarGiftOffer.slug = yVar.Y.slug;
        tL_sendStarGiftOffer.random_id = j10;
        if (i11 > 0) {
            tL_sendStarGiftOffer.flags |= 1;
            tL_sendStarGiftOffer.allow_paid_stars = j3;
        }
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new org.telegram.tgnet.e(yVar, g10, a2Var, 7));
    }

    public static void R(y yVar, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3) {
        zf.a aVar;
        String str;
        boolean z10;
        String formatString;
        ?? r14;
        boolean z11;
        if (yVar.f53477h0.W) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.b.b(i10);
                return;
            }
            n5 x10 = n5.x(i10, yVar.m0.f54528a);
            if (x10.f53000e) {
                aVar = zf.a.l(x10.p());
            } else {
                aVar = null;
            }
            zf.b bVar = zf.b.f54530a;
            zf.b bVar2 = zf.b.f54531b;
            if (aVar != null) {
                long j10 = aVar.f54529b;
                zf.a aVar2 = yVar.m0;
                if (j10 >= aVar2.f54529b) {
                    String str2 = yVar.Z;
                    long j11 = yVar.f53470a0;
                    String d = aVar2.d();
                    if (yVar.m0.f54528a == bVar2) {
                        str = str2;
                        z10 = true;
                    } else {
                        str = str2;
                        z10 = false;
                    }
                    LinearLayout linearLayout = new LinearLayout(yVar.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(yVar.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i11 = org.telegram.ui.ActionBar.h6.f20894j5;
                    org.telegram.ui.Cells.c1.n(i11, yVar.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, w7.x5.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(yVar.getContext());
                    ai.o(i11, yVar.resourcesProvider, textView2, 1, 16.0f);
                    if (yVar.m0.f54528a == bVar) {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j11), str);
                    } else {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j11), str);
                    }
                    textView2.setText(AndroidUtilities.replaceTags(formatString));
                    linearLayout.addView(textView2, w7.x5.t(-1, -2, 48, 24, 4, 24, 4));
                    t01 t01Var = new t01(yVar.getContext(), yVar.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(yVar.currentAccount).getSendPaidMessagesStars(j11);
                    final zf.a g10 = zf.a.g(sendPaidMessagesStars, bVar);
                    t01Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), p7.Y0(z10, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    int i12 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
                    if (i12 > 0) {
                        r14 = 0;
                        t01Var.c(LocaleController.getString(R.string.GiftOfferRowFee), p7.Y0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    t01Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", yVar.f53482n0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(t01Var, w7.x5.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(yVar.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i12 == 0) {
                        spannableStringBuilder.append((CharSequence) p7.T0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else if (z10) {
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, p7.T0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), p7.R0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    } else {
                        z11 = z10;
                        spannableStringBuilder.append((CharSequence) p7.R0(LocaleController.formatString(R.string.GiftOfferPay, zf.a.i(yVar.m0.f54529b + g10.f54529b, bVar).d())));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yVar.getContext(), 0, yVar.resourcesProvider);
                        alertDialog$Builder.n(linearLayout);
                        final boolean z12 = z11;
                        alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.z1() {
                            @Override
                            public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i13) {
                                y.Q(y.this, sendPaidMessagesStars, z12, g10, nextRandomId, a2Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                        a2Var.X0 = true;
                        a2Var.show();
                        return;
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(yVar.getContext(), 0, yVar.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.z1() {
                        @Override
                        public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i13) {
                            y.Q(y.this, sendPaidMessagesStars, z122, g10, nextRandomId, a2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20368a;
                    a2Var2.X0 = true;
                    a2Var2.show();
                    return;
                }
            }
            zf.a aVar3 = yVar.m0;
            zf.b bVar3 = aVar3.f54528a;
            if (bVar3 == bVar) {
                new e7(context, d6Var, aVar3.a(), 14, null, null, j3).show();
            } else if (bVar3 == bVar2) {
                new di.h(context, d6Var, aVar3, true, null).show();
            }
        }
    }

    public static void S(y yVar, of.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(yVar.currentAccount).lambda$processUpdates$377(updates, false);
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s6(yVar, eVar, a2Var, updates, tL_error, 6));
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }

    public final void T() {
        boolean z10;
        float f7;
        boolean z11 = this.f53488t0;
        a aVar = this.X;
        if ((z11 && !isDismissed() && aVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.f53471b0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f53484p0 != z10) {
            this.f53484p0 = z10;
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
                ai.s(scaleY, f11, 180L);
            }
        }
    }

    public final void U(boolean z10) {
        boolean z11;
        if (this.f53483o0 == 0 && this.m0.f54529b > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ci.d dVar = this.f53477h0;
        if (dVar.W != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f7 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f7 = 1.0f;
                }
                ai.s(animate, f7, 180L);
                return;
            }
            if (z11) {
                f7 = 1.0f;
            }
            dVar.setAlpha(f7);
        }
    }

    public final void V(zf.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r16;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z16;
        String formatNumber;
        er[] erVarArr;
        double d;
        boolean z17;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i15;
        zf.a aVar2 = this.m0;
        int i16 = this.f53483o0;
        this.f53483o0 = 0;
        if (aVar != null) {
            this.m0 = aVar;
        } else {
            this.m0 = zf.a.i(0L, aVar2.f54528a);
            this.f53483o0 |= 1;
        }
        zf.b bVar = this.m0.f54528a;
        m.f3 f3Var = this.f53481l0;
        ce[] ceVarArr = (ce[]) f3Var.f15693b;
        long j3 = ((zf.a) ((ce[]) f3Var.f15693b)[bVar.ordinal()].f53708b).f54529b;
        zf.a aVar3 = this.m0;
        if (j3 < aVar3.f54529b) {
            this.f53483o0 |= 4;
        }
        if (!aVar3.k() && ((zf.a) ceVarArr[this.m0.f54528a.ordinal()].f53707a).f54529b > this.m0.f54529b) {
            this.f53483o0 |= 2;
        }
        if (!z11 && aVar2.f54528a == this.m0.f54528a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar2.f54529b == this.m0.f54529b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i16 == this.f53483o0) {
            z15 = false;
        } else {
            z15 = true;
        }
        zf.b bVar2 = zf.b.f54530a;
        EditTextBoldCursor editTextBoldCursor = this.f53473d0;
        zf.b bVar3 = zf.b.f54531b;
        if (z13) {
            d50 d50Var = this.f53471b0;
            if (d50Var != null) {
                if (this.m0.f54528a == bVar2) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                d50Var.a(i15, z12);
            }
            String shortName = DialogObject.getShortName(this.f53470a0);
            zf.b bVar4 = this.m0.f54528a;
            TextView textView = this.f53476g0;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((zf.a) ceVarArr[this.m0.f54528a.ordinal()].f53708b).a()).length())});
            } else if (bVar4 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((zf.a) ceVarArr[this.m0.f54528a.ordinal()].f53708b).a()).length() + 3)});
            }
            ImageView imageView = this.f53480k0;
            ImageView imageView2 = this.f53479j0;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                z17 = false;
                if (this.m0.f54528a == bVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.m0.f54528a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.m0.f54528a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.m0.f54528a == bVar3) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.m0.f54528a == bVar3) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.m0.f54528a == bVar3) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                z17 = false;
                if (this.m0.f54528a == bVar2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                imageView2.setAlpha(f7);
                if (this.m0.f54528a == bVar3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            a aVar4 = this.X;
            r16 = z17;
            if (aVar4 != null) {
                zf.b bVar5 = this.m0.f54528a;
                r16 = z17;
                if (aVar4.f52324e != bVar5) {
                    aVar4.f52324e = bVar5;
                    aVar4.a();
                    r16 = z17;
                }
            }
        } else {
            r16 = 0;
        }
        if (z13 || z15) {
            if (this.m0.f54528a == bVar2) {
                i10 = R.string.GiftOfferStarsToOffer;
            } else {
                i10 = R.string.GiftOfferTONToOffer;
            }
            this.f53472c0.setText(LocaleController.getString(i10));
            zf.b bVar6 = this.m0.f54528a;
            int i17 = this.f53483o0;
            int i18 = i17 & 4;
            String str = this.Z;
            TextView textView2 = this.f53474e0;
            if (i18 != 0) {
                if (bVar6 == bVar2) {
                    i14 = R.string.GiftOfferStarsToOfferInfoIsHigh;
                } else {
                    i14 = R.string.GiftOfferTONToOfferInfoIsHigh;
                }
                Object[] objArr = new Object[2];
                objArr[r16] = ((zf.a) ceVarArr[bVar6.ordinal()].f53708b).d();
                objArr[1] = str;
                ai.r(i14, objArr, textView2);
            } else if ((i17 & 2) != 0) {
                if (bVar6 == bVar2) {
                    i12 = R.string.GiftOfferStarsToOfferInfoIsLow;
                } else {
                    i12 = R.string.GiftOfferTONToOfferInfoIsLow;
                }
                Object[] objArr2 = new Object[2];
                objArr2[r16] = ((zf.a) ceVarArr[bVar6.ordinal()].f53707a).d();
                objArr2[1] = str;
                ai.r(i12, objArr2, textView2);
            } else {
                if (bVar6 == bVar2) {
                    i11 = R.string.GiftOfferStarsToOfferInfo;
                } else {
                    i11 = R.string.GiftOfferTONToOfferInfo;
                }
                Object[] objArr3 = new Object[1];
                objArr3[r16] = str;
                ai.r(i11, objArr3, textView2);
            }
            if ((this.f53483o0 & (-9)) == 0) {
                i13 = org.telegram.ui.ActionBar.h6.f21171y6;
            } else {
                i13 = org.telegram.ui.ActionBar.h6.f21026q7;
            }
            textView2.setTextColor(getThemedColor(i13));
        }
        if (z13 || z14 || z15) {
            zf.a aVar5 = this.m0;
            if (aVar5.f54528a == bVar3) {
                z16 = true;
            } else {
                z16 = r16;
            }
            int i19 = R.string.GiftOfferButtonStars;
            if (z16) {
                formatNumber = aVar5.b();
            } else {
                formatNumber = LocaleController.formatNumber(aVar5.a(), ',');
            }
            Object[] objArr4 = new Object[1];
            objArr4[r16] = formatNumber;
            String formatString = LocaleController.formatString(i19, objArr4);
            if (z16) {
                erVarArr = this.f53487s0;
            } else {
                erVarArr = this.f53486r0;
            }
            this.f53477h0.g(p7.W0(z16, formatString, erVarArr), z12, true);
            U(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.m0.f54528a == bVar3) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.m0.c() * d * 100.0d), "USD", 2));
            this.f53478i0.c(sb2, z12, true);
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
        if (this.f53484p0 && (aVar = this.X) != null && f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f7, f10);
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        T();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f53488t0 = true;
        T();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new rg.x1(this, 28), 50L);
    }

    @Override
    public final rm0 x(sm0 sm0Var) {
        e71 e71Var = new e71(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 23), this.resourcesProvider);
        this.f53489u0 = e71Var;
        e71Var.f25890r = false;
        return e71Var;
    }
}
