package zh;

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
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import org.telegram.ui.gb0;
import org.telegram.ui.mk;
import org.telegram.ui.yn0;
public final class g7 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final bi.v0 X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final ug.b1 f51958a0;
    public v51 f51959b0;
    public boolean f51960c0;

    public g7(Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.User user, ug.b1 b1Var) {
        super(context, null, false, false, f6Var);
        this.Z = user;
        this.f51958a0 = b1Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        ll0 ll0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new bi.d(this, 22));
        s4.j jVar = new s4.j();
        jVar.f45777m = false;
        jVar.C = false;
        jVar.o(pr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20752i5, f6Var));
        bi.v0 v0Var = new bi.v0(context, 5, f6Var);
        this.X = v0Var;
        ((TextView) v0Var.f3884c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        d90 d90Var = (d90) v0Var.d;
        d90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
            public final g7 f51895b;

            {
                this.f51895b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (r2) {
                    case 0:
                        g7 g7Var = this.f51895b;
                        dw0 dw0Var = new dw0(g7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(g7Var.attachedFragment) && (n2Var = g7Var.attachedFragment) != null) {
                            dw0Var.makeAttached(n2Var);
                        }
                        dw0Var.show();
                        return;
                    default:
                        of.f.s(this.f51895b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }), true)));
        d90Var.setMaxWidth(di.f4.a(d90Var.getText(), d90Var.getPaint()) + 1);
        this.f24647e.setTitle(y());
        i9 i9Var = new i9((org.telegram.ui.ActionBar.f6) null);
        i9Var.r(user);
        ((x9) v0Var.f3883b).e(user, i9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        d90 d90Var2 = new d90(context, f6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        d90Var2.setTextSize(1, 12.0f);
        d90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, f6Var));
        d90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        d90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
            public final g7 f51895b;

            {
                this.f51895b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (r2) {
                    case 0:
                        g7 g7Var = this.f51895b;
                        dw0 dw0Var = new dw0(g7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(g7Var.attachedFragment) && (n2Var = g7Var.attachedFragment) != null) {
                            dw0Var.makeAttached(n2Var);
                        }
                        dw0Var.show();
                        return;
                    default:
                        of.f.s(this.f51895b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }));
        d90Var2.setGravity(17);
        d90Var2.setMaxWidth(di.f4.a(d90Var2.getText(), d90Var2.getPaint()));
        frameLayout.addView(d90Var2, w7.x5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20734h5, f6Var));
        this.containerView.addView(new r00(getContext()), w7.x5.c(-1.0f, -1));
        v51 v51Var = this.f51959b0;
        if (v51Var != null) {
            v51Var.N(false);
        }
    }

    public static void P(g7 g7Var, int i10) {
        h51 G;
        v51 v51Var = g7Var.f51959b0;
        if (v51Var != null && (G = v51Var.G(i10 - 1)) != null) {
            v51 v51Var2 = g7Var.f51959b0;
            if (G.d == -1) {
                g7Var.f51960c0 = !g7Var.f51960c0;
                v51Var2.N(true);
                g7Var.d.v0(0, AndroidUtilities.dp(200.0f), pr.f29467g);
            } else if (G.G(h7.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                Context findActivity = AndroidUtilities.findActivity(g7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                Context context = findActivity;
                if (context != null) {
                    long j3 = g7Var.Z.f20016id;
                    s5 y3 = s5.y(g7Var.currentAccount, false);
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                    d80 d80Var = new d80(g7Var, G, j3, 2);
                    int i11 = y3.f52566a;
                    if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
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
                        obj.f4342b = "inapp";
                        obj.f4341a = tL_starsGiftOption.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj.a()), new bi.q5(y3, d80Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j3);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject p5 = fi.k3.p(s5.I(), false);
                        if (p5 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = p5.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new bi.c5(y3, d80Var, tL_inputInvoiceStars, 24));
                    }
                }
            }
        }
    }

    public static void Q(g7 g7Var, h51 h51Var, long j3, Boolean bool, String str) {
        ug.b1 b1Var;
        if (g7Var.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (b1Var = g7Var.f51958a0) != null) {
                b1Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            gb0 gb0Var = LaunchActivity.G1.f33467x0;
            if (U != null) {
                if (bool.booleanValue()) {
                    qc K = yc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) h51Var.B, UserObject.getForcedFirstName(g7Var.Z))), LocaleController.getString(R.string.ViewInChat), new yn0(j3, 2));
                    K.f29679j = 5000;
                    K.k(true);
                    if (gb0Var != null) {
                        gb0Var.c(true);
                    }
                    s5.y(g7Var.currentAccount, false).T(true);
                } else if (str != null) {
                    i2.g.s(R.string.UnknownErrorCode, new Object[]{str}, yc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, v51 v51Var) {
        int i10;
        String formatCurrency;
        arrayList.add(h51.k(this.X));
        i2.g.p(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = s5.y(this.currentAccount, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < u10.size(); i13++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i13);
                if (!this.f51960c0 && tL_starsGiftOption.extended) {
                    i11++;
                } else {
                    int i14 = i12 + 1;
                    int i15 = h7.f51990a;
                    h51 J = h51.J(h7.class);
                    J.d = i13;
                    J.f26607z = i12;
                    long j3 = tL_starsGiftOption.stars;
                    J.B = j3;
                    J.f26594l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        formatCurrency = null;
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    J.f26595m = formatCurrency;
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i12 = i14;
                }
            }
            boolean z10 = this.f51960c0;
            if (!z10 && i11 > 0) {
                if (z10) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i16 = d7.f51801a;
                h51 J2 = h51.J(d7.class);
                J2.d = -1;
                J2.f26594l = string;
                J2.f26589f = !this.f51960c0;
                J2.f26599q = true;
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
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (v51Var = this.f51959b0) != null) {
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
        mk mkVar;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R instanceof co) {
            co coVar = (co) R;
            if (coVar.x9() && (mkVar = coVar.Y) != null) {
                mkVar.P();
            }
        }
        super.show();
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(this.d, getContext(), this.currentAccount, 0, true, new ii.a(this, 27), this.resourcesProvider);
        this.f51959b0 = v51Var;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        bi.v0 v0Var = this.X;
        if (v0Var == null) {
            return null;
        }
        return ((TextView) v0Var.f3884c).getText();
    }
}
