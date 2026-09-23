package yh;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bb0;
import org.telegram.ui.jk;
import org.telegram.ui.rn0;
import org.telegram.ui.xn;
public final class h7 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final ai.d1 X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final tg.b1 f47175a0;
    public v51 f47176b0;
    public boolean f47177c0;

    public h7(Context context, org.telegram.ui.ActionBar.d6 d6Var, TLRPC.User user, tg.b1 b1Var) {
        super(context, null, false, false, d6Var);
        this.Z = user;
        this.f47175a0 = b1Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        ml0 ml0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 22));
        s4.j jVar = new s4.j();
        jVar.f42662m = false;
        jVar.C = false;
        jVar.o(rr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18877i5, d6Var));
        ai.d1 d1Var = new ai.d1(context, 5, d6Var);
        this.X = d1Var;
        ((TextView) d1Var.f693c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        d90 d90Var = (d90) d1Var.d;
        d90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
            public final h7 f47139b;

            {
                this.f47139b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (r2) {
                    case 0:
                        h7 h7Var = this.f47139b;
                        ew0 ew0Var = new ew0(h7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(h7Var.attachedFragment) && (n2Var = h7Var.attachedFragment) != null) {
                            ew0Var.makeAttached(n2Var);
                        }
                        ew0Var.show();
                        return;
                    default:
                        nf.f.s(this.f47139b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }), true)));
        d90Var.setMaxWidth(ci.e4.a(d90Var.getText(), d90Var.getPaint()) + 1);
        this.e.setTitle(y());
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.r(user);
        ((w9) d1Var.f692b).e(user, h9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        d90 d90Var2 = new d90(context, d6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        d90Var2.setTextSize(1, 12.0f);
        d90Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.B6, d6Var));
        d90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        d90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
            public final h7 f47139b;

            {
                this.f47139b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (r2) {
                    case 0:
                        h7 h7Var = this.f47139b;
                        ew0 ew0Var = new ew0(h7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(h7Var.attachedFragment) && (n2Var = h7Var.attachedFragment) != null) {
                            ew0Var.makeAttached(n2Var);
                        }
                        ew0Var.show();
                        return;
                    default:
                        nf.f.s(this.f47139b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }));
        d90Var2.setGravity(17);
        d90Var2.setMaxWidth(ci.e4.a(d90Var2.getText(), d90Var2.getPaint()));
        frameLayout.addView(d90Var2, w7.x5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18859h5, d6Var));
        this.containerView.addView(new s00(getContext()), w7.x5.c(-1.0f, -1));
        v51 v51Var = this.f47176b0;
        if (v51Var != null) {
            v51Var.N(false);
        }
    }

    public static void P(h7 h7Var, int i10) {
        h51 G;
        v51 v51Var = h7Var.f47176b0;
        if (v51Var != null && (G = v51Var.G(i10 - 1)) != null) {
            v51 v51Var2 = h7Var.f47176b0;
            if (G.d == -1) {
                h7Var.f47177c0 = !h7Var.f47177c0;
                v51Var2.N(true);
                h7Var.d.v0(0, AndroidUtilities.dp(200.0f), rr.f27702g);
            } else if (G.G(i7.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                Context findActivity = AndroidUtilities.findActivity(h7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                Context context = findActivity;
                if (context != null) {
                    long j3 = h7Var.Z.f18230id;
                    t5 y3 = t5.y(h7Var.currentAccount, false);
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                    e80 e80Var = new e80(h7Var, G, j3, 2);
                    int i11 = y3.f47732a;
                    if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R != null && R.getContext() != null) {
                            t5.e0(R.getContext(), R.getResourceProvider());
                        } else {
                            t5.e0(context, null);
                        }
                    } else if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i11).getInputUser(j3);
                        ?? obj = new Object();
                        obj.f3834b = "inapp";
                        obj.f3833a = tL_starsGiftOption.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj.a()), new ai.g6(y3, e80Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j3);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject p5 = ei.k3.p(t5.I(), false);
                        if (p5 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = p5.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new ai.s5(y3, e80Var, tL_inputInvoiceStars, 24));
                    }
                }
            }
        }
    }

    public static void Q(h7 h7Var, h51 h51Var, long j3, Boolean bool, String str) {
        tg.b1 b1Var;
        if (h7Var.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (b1Var = h7Var.f47175a0) != null) {
                b1Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            bb0 bb0Var = LaunchActivity.G1.f30829x0;
            if (U != null) {
                if (bool.booleanValue()) {
                    qc K = xc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) h51Var.B, UserObject.getForcedFirstName(h7Var.Z))), LocaleController.getString(R.string.ViewInChat), new rn0(j3, 2));
                    K.f27306j = 5000;
                    K.k(true);
                    if (bb0Var != null) {
                        bb0Var.c(true);
                    }
                    t5.y(h7Var.currentAccount, false).T(true);
                } else if (str != null) {
                    hg.c.s(R.string.UnknownErrorCode, new Object[]{str}, xc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, v51 v51Var) {
        int i10;
        String formatCurrency;
        arrayList.add(h51.k(this.X));
        com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = t5.y(this.currentAccount, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < u10.size(); i13++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i13);
                if (!this.f47177c0 && tL_starsGiftOption.extended) {
                    i11++;
                } else {
                    int i14 = i12 + 1;
                    int i15 = i7.f47213a;
                    h51 J = h51.J(i7.class);
                    J.d = i13;
                    J.f24520z = i12;
                    long j3 = tL_starsGiftOption.stars;
                    J.B = j3;
                    J.f24507l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        formatCurrency = null;
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    J.f24508m = formatCurrency;
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i12 = i14;
                }
            }
            boolean z10 = this.f47177c0;
            if (!z10 && i11 > 0) {
                if (z10) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i16 = e7.f47034a;
                h51 J2 = h51.J(e7.class);
                J2.d = -1;
                J2.f24507l = string;
                J2.f24502f = !this.f47177c0;
                J2.f24512q = true;
                arrayList.add(J2);
            }
        } else {
            arrayList.add(h51.n(31));
            arrayList.add(h51.n(31));
            arrayList.add(h51.n(31));
        }
        arrayList.add(h51.k(this.Y));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v51 v51Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (v51Var = this.f47176b0) != null) {
            v51Var.N(true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void show() {
        jk jkVar;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R instanceof xn) {
            xn xnVar = (xn) R;
            if (xnVar.x9() && (jkVar = xnVar.Y) != null) {
                jkVar.Q();
            }
        }
        super.show();
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        v51 v51Var = new v51(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 27), this.resourcesProvider);
        this.f47176b0 = v51Var;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        ai.d1 d1Var = this.X;
        if (d1Var == null) {
            return null;
        }
        return ((TextView) d1Var.f693c).getText();
    }
}
