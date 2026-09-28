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
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ab0;
import org.telegram.ui.jk;
import org.telegram.ui.pn0;
import org.telegram.ui.wn;
public final class h7 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final ai.d1 X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final tg.a1 f47481a0;
    public l61 f47482b0;
    public boolean f47483c0;

    public h7(Context context, org.telegram.ui.ActionBar.d6 d6Var, TLRPC.User user, tg.a1 a1Var) {
        super(context, null, false, false, d6Var);
        this.Z = user;
        this.f47481a0 = a1Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        yl0 yl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        yl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 22));
        s4.j jVar = new s4.j();
        jVar.f42995m = false;
        jVar.C = false;
        jVar.o(sr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19147i5, d6Var));
        ai.d1 d1Var = new ai.d1(context, 5, d6Var);
        this.X = d1Var;
        ((TextView) d1Var.f693c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        p90 p90Var = (p90) d1Var.d;
        p90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
            public final h7 f47456b;

            {
                this.f47456b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.m2 m2Var;
                switch (r2) {
                    case 0:
                        h7 h7Var = this.f47456b;
                        rw0 rw0Var = new rw0(h7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(h7Var.attachedFragment) && (m2Var = h7Var.attachedFragment) != null) {
                            rw0Var.makeAttached(m2Var);
                        }
                        rw0Var.show();
                        return;
                    default:
                        nf.f.s(this.f47456b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }), true)));
        p90Var.setMaxWidth(ci.e4.a(p90Var.getText(), p90Var.getPaint()) + 1);
        this.e.setTitle(y());
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.r(user);
        ((w9) d1Var.f692b).e(user, h9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        p90 p90Var2 = new p90(context, d6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        p90Var2.setTextSize(1, 12.0f);
        p90Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.B6, d6Var));
        p90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        p90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
            public final h7 f47456b;

            {
                this.f47456b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.m2 m2Var;
                switch (r2) {
                    case 0:
                        h7 h7Var = this.f47456b;
                        rw0 rw0Var = new rw0(h7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(h7Var.attachedFragment) && (m2Var = h7Var.attachedFragment) != null) {
                            rw0Var.makeAttached(m2Var);
                        }
                        rw0Var.show();
                        return;
                    default:
                        nf.f.s(this.f47456b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }));
        p90Var2.setGravity(17);
        p90Var2.setMaxWidth(ci.e4.a(p90Var2.getText(), p90Var2.getPaint()));
        frameLayout.addView(p90Var2, w7.y5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19129h5, d6Var));
        this.containerView.addView(new t00(getContext()), w7.y5.c(-1.0f, -1));
        l61 l61Var = this.f47482b0;
        if (l61Var != null) {
            l61Var.N(false);
        }
    }

    public static void P(h7 h7Var, int i10) {
        x51 G;
        l61 l61Var = h7Var.f47482b0;
        if (l61Var != null && (G = l61Var.G(i10 - 1)) != null) {
            l61 l61Var2 = h7Var.f47482b0;
            if (G.d == -1) {
                h7Var.f47483c0 = !h7Var.f47483c0;
                l61Var2.N(true);
                h7Var.d.v0(0, AndroidUtilities.dp(200.0f), sr.f28349g);
            } else if (G.G(i7.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                Context findActivity = AndroidUtilities.findActivity(h7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                Context context = findActivity;
                if (context != null) {
                    long j3 = h7Var.Z.f18482id;
                    s5 y3 = s5.y(h7Var.currentAccount, false);
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                    q80 q80Var = new q80(h7Var, G, j3, 2);
                    int i11 = y3.f48011a;
                    if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                        if (R != null && R.getContext() != null) {
                            s5.e0(R.getContext(), R.getResourceProvider());
                        } else {
                            s5.e0(context, null);
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
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj.a()), new ai.g6(y3, q80Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j3);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject p5 = ei.k3.p(s5.I(), false);
                        if (p5 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = p5.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new ai.s5(y3, q80Var, tL_inputInvoiceStars, 24));
                    }
                }
            }
        }
    }

    public static void Q(h7 h7Var, x51 x51Var, long j3, Boolean bool, String str) {
        tg.a1 a1Var;
        if (h7Var.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (a1Var = h7Var.f47481a0) != null) {
                a1Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            ab0 ab0Var = LaunchActivity.G1.f31144x0;
            if (U != null) {
                if (bool.booleanValue()) {
                    qc K = xc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) x51Var.B, UserObject.getForcedFirstName(h7Var.Z))), LocaleController.getString(R.string.ViewInChat), new pn0(j3, 2));
                    K.f27649j = 5000;
                    K.k(true);
                    if (ab0Var != null) {
                        ab0Var.c(true);
                    }
                    s5.y(h7Var.currentAccount, false).T(true);
                } else if (str != null) {
                    hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, xc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, l61 l61Var) {
        int i10;
        String formatCurrency;
        arrayList.add(x51.k(this.X));
        com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = s5.y(this.currentAccount, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < u10.size(); i13++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i13);
                if (!this.f47483c0 && tL_starsGiftOption.extended) {
                    i11++;
                } else {
                    int i14 = i12 + 1;
                    int i15 = i7.f47524a;
                    x51 J = x51.J(i7.class);
                    J.d = i13;
                    J.f30305z = i12;
                    long j3 = tL_starsGiftOption.stars;
                    J.B = j3;
                    J.f30292l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        formatCurrency = null;
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    J.f30293m = formatCurrency;
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i12 = i14;
                }
            }
            boolean z10 = this.f47483c0;
            if (!z10 && i11 > 0) {
                if (z10) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i16 = e7.f47346a;
                x51 J2 = x51.J(e7.class);
                J2.d = -1;
                J2.f30292l = string;
                J2.f30287f = !this.f47483c0;
                J2.f30297q = true;
                arrayList.add(J2);
            }
        } else {
            arrayList.add(x51.n(31));
            arrayList.add(x51.n(31));
            arrayList.add(x51.n(31));
        }
        arrayList.add(x51.k(this.Y));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l61 l61Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (l61Var = this.f47482b0) != null) {
            l61Var.N(true);
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
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R instanceof wn) {
            wn wnVar = (wn) R;
            if (wnVar.x9() && (jkVar = wnVar.Y) != null) {
                jkVar.P();
            }
        }
        super.show();
    }

    @Override
    public final xl0 v(yl0 yl0Var) {
        l61 l61Var = new l61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 27), this.resourcesProvider);
        this.f47482b0 = l61Var;
        return l61Var;
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
