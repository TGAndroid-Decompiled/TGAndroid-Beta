package zh;

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
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.Components.z61;
public final class z extends db {
    public static final int[] f51342w0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final a X;
    public final TL_stars.TL_starGiftUnique Y;
    public final String Z;
    public final long f51343a0;
    public final y40 f51344b0;
    public final yd0 f51345c0;
    public final EditTextBoldCursor f51346d0;
    public final TextView f51347e0;
    public final x f51348f0;
    public final TextView f51349g0;
    public final di.d f51350h0;
    public final org.telegram.ui.Components.s6 f51351i0;
    public final ImageView f51352j0;
    public final ImageView f51353k0;
    public final k6.h f51354l0;
    public ag.a m0;
    public int f51355n0;
    public int f51356o0;
    public boolean f51357p0;
    public final a1 f51358q0;
    public final br[] f51359r0;
    public final br[] f51360s0;
    public boolean f51361t0;
    public z61 f51362u0;
    public final l61 f51363v0;

    public z(final Context context, final int i10, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.c6 c6Var, a1 a1Var) {
        super(context, null, true, false, 2, c6Var);
        TLRPC.User user;
        k6.h hVar = new k6.h(2);
        n4.s[] sVarArr = (n4.s[]) hVar.f14176b;
        this.f51354l0 = hVar;
        this.f51359r0 = new br[1];
        this.f51360s0 = new br[1];
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.f51343a0 = j10;
        this.Y = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.Z = org.telegram.messenger.q.i(tL_starGiftUnique.num, ',', sb2);
        this.f51358q0 = a1Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j11 = n5.y(i10, true).j();
        if (j10 > 0 && MessagesController.getInstance(i10).getUserFull(j10) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j12 = tL_starGiftUnique.offer_min_stars;
        ag.b bVar = ag.b.f629a;
        ag.a g10 = ag.a.g(j12, bVar);
        ag.a g11 = ag.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        ag.b bVar2 = ag.b.f630b;
        ag.a i11 = ag.a.i(Math.max(g10.e(bVar2).n(2).f628b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        ag.a i12 = ag.a.i(Math.max(i11.f628b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        ag.b bVar3 = g10.f627a;
        if (bVar3 == g11.f627a) {
            sVarArr[bVar3.ordinal()] = new n4.s(4, g10, g11);
        }
        ag.b bVar4 = i11.f627a;
        if (bVar4 == i12.f627a) {
            sVarArr[bVar4.ordinal()] = new n4.s(4, i11, i12);
        }
        a aVar = new a(context, i10, c6Var);
        this.X = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(false);
        aVar.setClickable(false);
        this.container.addView(aVar, w7.a6.a(-2.0f, 0.0f, 48.0f, 0.0f, 0.0f, -2, 49));
        w7.c6.a(aVar);
        aVar.setOnClickListener(new yg.e(this, context, c6Var, 6));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f51346d0 = editTextBoldCursor;
        if (j11) {
            y40 y40Var = new y40(context, c6Var);
            this.f51344b0 = y40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            y40Var.b(arrayList, new v(this, 0));
            linearLayout.addView(y40Var, w7.a6.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.f51344b0 = null;
        }
        LinearLayout e = yh.e(context, 1);
        linearLayout.addView(e, w7.a6.l(1.0f, -1, -2));
        yd0 yd0Var = new yd0(context, null);
        this.f51345c0 = yd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        editTextBoldCursor.requestFocus();
        yd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        yd0Var.e(editTextBoldCursor);
        yd0Var.b(1.0f, 0.0f, false);
        yd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 5));
        yd0Var.addView(editTextBoldCursor, w7.a6.e(-1, -2, 48));
        e.addView(yd0Var, w7.a6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f51352j0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        yd0Var.addView(imageView, w7.a6.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        ImageView imageView2 = new ImageView(context);
        this.f51353k0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        yd0Var.addView(imageView2, w7.a6.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.f51351i0 = s6Var;
        int i14 = org.telegram.ui.ActionBar.g6.f20288y6;
        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        s6Var.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var.setGravity(5);
        yd0Var.addView(s6Var, w7.a6.a(-1.0f, 0.0f, 0.0f, 16.0f, 0.0f, -2, 21));
        TextView textView = new TextView(context);
        this.f51347e0 = textView;
        textView.setTextSize(1, 13.0f);
        e.addView(textView, w7.a6.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f51348f0 = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        yd0 yd0Var2 = new yd0(context, null);
        yd0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        yd0Var2.e(editTextBoldCursor2);
        yd0Var2.addView((View) editTextBoldCursor2, w7.a6.a(-2.0f, 0.0f, 0.0f, 48.0f, 0.0f, -1, 48));
        w7.c6.b(yd0Var2, 0.02f, 1.2f);
        yd0Var2.setOnClickListener(new yh.a(6, this, context));
        e.addView(yd0Var2, w7.a6.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.W5, c6Var), PorterDuff.Mode.SRC_IN));
        yd0Var2.addView(imageView3, w7.a6.a(24.0f, 0.0f, 0.0f, 14.0f, 0.0f, 24, 21));
        TextView textView2 = new TextView(context);
        this.f51349g0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        e.addView(textView2, w7.a6.t(-1, -2, 55, 33, 4, 33, 0));
        di.d dVar = new di.d(context, c6Var, true);
        this.f51350h0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                z.R(z.this, i10, context, c6Var, j10);
            }
        });
        V(ag.a.i(0L, bVar), false, true, false);
        if (this.f51355n0 != 86400) {
            this.f51355n0 = 86400;
            editTextBoldCursor2.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        U(false);
        editTextBoldCursor.addTextChangedListener(new y(this));
        FrameLayout.LayoutParams a2 = w7.a6.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80);
        int i15 = a2.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        a2.leftMargin = i15 + i16;
        a2.rightMargin += i16;
        this.containerView.addView(dVar, a2);
        mm0 mm0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.f51363v0 = l61.k(linearLayout);
        this.f51362u0.N(false);
    }

    public static void Q(z zVar, long j10, boolean z10, ag.a aVar, long j11, org.telegram.ui.ActionBar.a2 a2Var) {
        ag.a aVar2;
        ag.a i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 > 0) {
            int i12 = zVar.currentAccount;
            ag.b bVar = ag.b.f629a;
            n5 x10 = n5.x(i12, bVar);
            if (x10.e) {
                aVar2 = ag.a.l(x10.p());
            } else {
                aVar2 = null;
            }
            if (z10) {
                i10 = ag.a.g(j10, bVar);
            } else {
                i10 = ag.a.i(zVar.m0.f628b + aVar.f628b, bVar);
            }
            if (aVar2 == null || aVar2.f628b < i10.f628b) {
                new e7(zVar.getContext(), zVar.resourcesProvider, i10.a(), 14, null, null, zVar.f51343a0).show();
                return;
            }
        }
        pf.c g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = zVar.m0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(zVar.currentAccount).getInputPeer(zVar.f51343a0);
        tL_sendStarGiftOffer.duration = zVar.f51355n0;
        tL_sendStarGiftOffer.slug = zVar.Y.slug;
        tL_sendStarGiftOffer.random_id = j11;
        if (i11 > 0) {
            tL_sendStarGiftOffer.flags |= 1;
            tL_sendStarGiftOffer.allow_paid_stars = j10;
        }
        ConnectionsManager.getInstance(zVar.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new org.telegram.tgnet.e(zVar, g10, a2Var, 7));
    }

    public static void R(z zVar, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10) {
        ag.a aVar;
        String str;
        boolean z10;
        String formatString;
        ?? r14;
        boolean z11;
        if (zVar.f51350h0.W) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.b.b(i10);
                return;
            }
            n5 x10 = n5.x(i10, zVar.m0.f627a);
            if (x10.e) {
                aVar = ag.a.l(x10.p());
            } else {
                aVar = null;
            }
            ag.b bVar = ag.b.f629a;
            ag.b bVar2 = ag.b.f630b;
            if (aVar != null) {
                long j11 = aVar.f628b;
                ag.a aVar2 = zVar.m0;
                if (j11 >= aVar2.f628b) {
                    String str2 = zVar.Z;
                    long j12 = zVar.f51343a0;
                    String d = aVar2.d();
                    if (zVar.m0.f627a == bVar2) {
                        str = str2;
                        z10 = true;
                    } else {
                        str = str2;
                        z10 = false;
                    }
                    LinearLayout linearLayout = new LinearLayout(zVar.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(zVar.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i11 = org.telegram.ui.ActionBar.g6.f20007j5;
                    org.telegram.ui.Cells.d0.p(i11, zVar.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, w7.a6.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(zVar.getContext());
                    yh.n(i11, zVar.resourcesProvider, textView2, 1, 16.0f);
                    if (zVar.m0.f627a == bVar) {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j12), str);
                    } else {
                        formatString = LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j12), str);
                    }
                    textView2.setText(AndroidUtilities.replaceTags(formatString));
                    linearLayout.addView(textView2, w7.a6.t(-1, -2, 48, 24, 4, 24, 4));
                    n01 n01Var = new n01(zVar.getContext(), zVar.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(zVar.currentAccount).getSendPaidMessagesStars(j12);
                    final ag.a g10 = ag.a.g(sendPaidMessagesStars, bVar);
                    n01Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), p7.Y0(z10, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    int i12 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
                    if (i12 > 0) {
                        r14 = 0;
                        n01Var.c(LocaleController.getString(R.string.GiftOfferRowFee), p7.Y0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    n01Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", zVar.f51355n0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(n01Var, w7.a6.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(zVar.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i12 == 0) {
                        spannableStringBuilder.append((CharSequence) p7.T0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else if (z10) {
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, p7.T0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), p7.R0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    } else {
                        z11 = z10;
                        spannableStringBuilder.append((CharSequence) p7.R0(LocaleController.formatString(R.string.GiftOfferPay, ag.a.i(zVar.m0.f628b + g10.f628b, bVar).d())));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zVar.getContext(), 0, zVar.resourcesProvider);
                        alertDialog$Builder.n(linearLayout);
                        final boolean z12 = z11;
                        alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.z1() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i13) {
                                z.Q(z.this, sendPaidMessagesStars, z12, g10, nextRandomId, a2Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                        a2Var.X0 = true;
                        a2Var.show();
                        return;
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(zVar.getContext(), 0, zVar.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.z1() {
                        @Override
                        public final void g(org.telegram.ui.ActionBar.a2 a2Var2, int i13) {
                            z.Q(z.this, sendPaidMessagesStars, z122, g10, nextRandomId, a2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19548a;
                    a2Var2.X0 = true;
                    a2Var2.show();
                    return;
                }
            }
            ag.a aVar3 = zVar.m0;
            ag.b bVar3 = aVar3.f627a;
            if (bVar3 == bVar) {
                new e7(context, c6Var, aVar3.a(), 14, null, null, j10).show();
            } else if (bVar3 == bVar2) {
                new ei.h(context, c6Var, aVar3, true, null).show();
            }
        }
    }

    public static void S(z zVar, pf.c cVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(zVar.currentAccount).lambda$processUpdates$377(updates, false);
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.p6(zVar, cVar, a2Var, updates, tL_error, 6));
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }

    public final void T() {
        boolean z10;
        float f7;
        boolean z11 = this.f51361t0;
        a aVar = this.X;
        if ((z11 && !isDismissed() && aVar != null && this.containerView.getY() > AndroidUtilities.dp(32.0f)) || this.f51344b0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f51357p0 != z10) {
            this.f51357p0 = z10;
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
                yh.r(scaleY, f11, 180L);
            }
        }
    }

    public final void U(boolean z10) {
        boolean z11;
        if (this.f51356o0 == 0 && this.m0.f628b > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        di.d dVar = this.f51350h0;
        if (dVar.W != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f7 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f7 = 1.0f;
                }
                yh.r(animate, f7, 180L);
                return;
            }
            if (z11) {
                f7 = 1.0f;
            }
            dVar.setAlpha(f7);
        }
    }

    public final void V(ag.a aVar, boolean z10, boolean z11, boolean z12) {
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
        br[] brVarArr;
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
        ag.a aVar2 = this.m0;
        int i16 = this.f51356o0;
        this.f51356o0 = 0;
        if (aVar != null) {
            this.m0 = aVar;
        } else {
            this.m0 = ag.a.i(0L, aVar2.f627a);
            this.f51356o0 |= 1;
        }
        ag.b bVar = this.m0.f627a;
        k6.h hVar = this.f51354l0;
        n4.s[] sVarArr = (n4.s[]) hVar.f14176b;
        long j10 = ((ag.a) ((n4.s[]) hVar.f14176b)[bVar.ordinal()].f16032c).f628b;
        ag.a aVar3 = this.m0;
        if (j10 < aVar3.f628b) {
            this.f51356o0 |= 4;
        }
        if (!aVar3.k() && ((ag.a) sVarArr[this.m0.f627a.ordinal()].f16031b).f628b > this.m0.f628b) {
            this.f51356o0 |= 2;
        }
        if (!z11 && aVar2.f627a == this.m0.f627a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar2.f628b == this.m0.f628b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i16 == this.f51356o0) {
            z15 = false;
        } else {
            z15 = true;
        }
        ag.b bVar2 = ag.b.f629a;
        EditTextBoldCursor editTextBoldCursor = this.f51346d0;
        ag.b bVar3 = ag.b.f630b;
        if (z13) {
            y40 y40Var = this.f51344b0;
            if (y40Var != null) {
                if (this.m0.f627a == bVar2) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                y40Var.a(i15, z12);
            }
            String shortName = DialogObject.getShortName(this.f51343a0);
            ag.b bVar4 = this.m0.f627a;
            TextView textView = this.f51349g0;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((ag.a) sVarArr[this.m0.f627a.ordinal()].f16032c).a()).length())});
            } else if (bVar4 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((ag.a) sVarArr[this.m0.f627a.ordinal()].f16032c).a()).length() + 3)});
            }
            ImageView imageView = this.f51353k0;
            ImageView imageView2 = this.f51352j0;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                z17 = false;
                if (this.m0.f627a == bVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (this.m0.f627a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (this.m0.f627a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                scaleX.scaleY(f13).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.m0.f627a == bVar3) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (this.m0.f627a == bVar3) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f15);
                if (this.m0.f627a == bVar3) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                scaleX2.scaleY(f16).setDuration(180L).start();
            } else {
                z17 = false;
                if (this.m0.f627a == bVar2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                imageView2.setAlpha(f7);
                if (this.m0.f627a == bVar3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView.setAlpha(f10);
            }
            a aVar4 = this.X;
            r16 = z17;
            if (aVar4 != null) {
                ag.b bVar5 = this.m0.f627a;
                r16 = z17;
                if (aVar4.e != bVar5) {
                    aVar4.e = bVar5;
                    aVar4.a();
                    r16 = z17;
                }
            }
        } else {
            r16 = 0;
        }
        if (z13 || z15) {
            if (this.m0.f627a == bVar2) {
                i10 = R.string.GiftOfferStarsToOffer;
            } else {
                i10 = R.string.GiftOfferTONToOffer;
            }
            this.f51345c0.setText(LocaleController.getString(i10));
            ag.b bVar6 = this.m0.f627a;
            int i17 = this.f51356o0;
            int i18 = i17 & 4;
            String str = this.Z;
            TextView textView2 = this.f51347e0;
            if (i18 != 0) {
                if (bVar6 == bVar2) {
                    i14 = R.string.GiftOfferStarsToOfferInfoIsHigh;
                } else {
                    i14 = R.string.GiftOfferTONToOfferInfoIsHigh;
                }
                Object[] objArr = new Object[2];
                objArr[r16] = ((ag.a) sVarArr[bVar6.ordinal()].f16032c).d();
                objArr[1] = str;
                yh.q(i14, objArr, textView2);
            } else if ((i17 & 2) != 0) {
                if (bVar6 == bVar2) {
                    i12 = R.string.GiftOfferStarsToOfferInfoIsLow;
                } else {
                    i12 = R.string.GiftOfferTONToOfferInfoIsLow;
                }
                Object[] objArr2 = new Object[2];
                objArr2[r16] = ((ag.a) sVarArr[bVar6.ordinal()].f16031b).d();
                objArr2[1] = str;
                yh.q(i12, objArr2, textView2);
            } else {
                if (bVar6 == bVar2) {
                    i11 = R.string.GiftOfferStarsToOfferInfo;
                } else {
                    i11 = R.string.GiftOfferTONToOfferInfo;
                }
                Object[] objArr3 = new Object[1];
                objArr3[r16] = str;
                yh.q(i11, objArr3, textView2);
            }
            if ((this.f51356o0 & (-9)) == 0) {
                i13 = org.telegram.ui.ActionBar.g6.f20288y6;
            } else {
                i13 = org.telegram.ui.ActionBar.g6.f20139q7;
            }
            textView2.setTextColor(getThemedColor(i13));
        }
        if (z13 || z14 || z15) {
            ag.a aVar5 = this.m0;
            if (aVar5.f627a == bVar3) {
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
                brVarArr = this.f51360s0;
            } else {
                brVarArr = this.f51359r0;
            }
            this.f51350h0.g(p7.W0(z16, formatString, brVarArr), z12, true);
            U(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.m0.f627a == bVar3) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.m0.c() * d * 100.0d), "USD", 2));
            this.f51351i0.c(sb2, z12, true);
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
        if (this.f51357p0 && (aVar = this.X) != null && f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
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
        this.f51361t0 = true;
        T();
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new zf.c(this, 5), 50L);
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        z61 z61Var = new z61(this.d, getContext(), this.currentAccount, 0, true, new ii.a(this, 23), this.resourcesProvider);
        this.f51362u0 = z61Var;
        z61Var.f31780r = false;
        return z61Var;
    }
}
