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
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hb0;
import org.telegram.ui.lk;
import org.telegram.ui.yn0;
import org.telegram.ui.zn;
public final class g7 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final ai.d1 X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final tg.a1 f47447a0;
    public l61 f47448b0;
    public boolean f47449c0;

    public g7(Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.User user, tg.a1 a1Var) {
        super(context, null, false, false, e6Var);
        this.Z = user;
        this.f47447a0 = a1Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        wl0 wl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 22));
        s4.j jVar = new s4.j();
        jVar.f42964m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19151i5, e6Var));
        ai.d1 d1Var = new ai.d1(context, 5, e6Var);
        this.X = d1Var;
        ((TextView) d1Var.f687c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        l90 l90Var = (l90) d1Var.d;
        l90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
            public final g7 f47382b;

            {
                this.f47382b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (r2) {
                    case 0:
                        g7 g7Var = this.f47382b;
                        qw0 qw0Var = new qw0(g7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(g7Var.attachedFragment) && (n2Var = g7Var.attachedFragment) != null) {
                            qw0Var.makeAttached(n2Var);
                        }
                        qw0Var.show();
                        return;
                    default:
                        nf.f.s(this.f47382b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }), true)));
        l90Var.setMaxWidth(ci.f4.a(l90Var.getText(), l90Var.getPaint()) + 1);
        this.e.setTitle(y());
        h9 h9Var = new h9((org.telegram.ui.ActionBar.e6) null);
        h9Var.r(user);
        ((w9) d1Var.f686b).e(user, h9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        l90 l90Var2 = new l90(context, e6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        l90Var2.setTextSize(1, 12.0f);
        l90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, e6Var));
        l90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, e6Var));
        l90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
            public final g7 f47382b;

            {
                this.f47382b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (r2) {
                    case 0:
                        g7 g7Var = this.f47382b;
                        qw0 qw0Var = new qw0(g7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(g7Var.attachedFragment) && (n2Var = g7Var.attachedFragment) != null) {
                            qw0Var.makeAttached(n2Var);
                        }
                        qw0Var.show();
                        return;
                    default:
                        nf.f.s(this.f47382b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }));
        l90Var2.setGravity(17);
        l90Var2.setMaxWidth(ci.f4.a(l90Var2.getText(), l90Var2.getPaint()));
        frameLayout.addView(l90Var2, w7.y5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19133h5, e6Var));
        this.containerView.addView(new r00(getContext()), w7.y5.c(-1.0f, -1));
        l61 l61Var = this.f47448b0;
        if (l61Var != null) {
            l61Var.N(false);
        }
    }

    public static void P(g7 g7Var, int i10) {
        x51 G;
        l61 l61Var = g7Var.f47448b0;
        if (l61Var != null && (G = l61Var.G(i10 - 1)) != null) {
            l61 l61Var2 = g7Var.f47448b0;
            if (G.d == -1) {
                g7Var.f47449c0 = !g7Var.f47449c0;
                l61Var2.N(true);
                g7Var.d.w0(0, AndroidUtilities.dp(200.0f), qr.f27716g);
            } else if (G.G(h7.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                Context findActivity = AndroidUtilities.findActivity(g7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                Context context = findActivity;
                if (context != null) {
                    long j3 = g7Var.Z.f18443id;
                    t5 y3 = t5.y(g7Var.currentAccount, false);
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                    m80 m80Var = new m80(g7Var, G, j3, 2);
                    int i11 = y3.f48042a;
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
                        obj.f3842b = "inapp";
                        obj.f3841a = tL_starsGiftOption.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj.a()), new ai.h6(y3, m80Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new ai.t5(y3, m80Var, tL_inputInvoiceStars, 24));
                    }
                }
            }
        }
    }

    public static void Q(g7 g7Var, x51 x51Var, long j3, Boolean bool, String str) {
        tg.a1 a1Var;
        if (g7Var.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (a1Var = g7Var.f47447a0) != null) {
                a1Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            hb0 hb0Var = LaunchActivity.G1.f31102x0;
            if (U != null) {
                if (bool.booleanValue()) {
                    qc K = xc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) x51Var.B, UserObject.getForcedFirstName(g7Var.Z))), LocaleController.getString(R.string.ViewInChat), new yn0(j3, 2));
                    K.f27550j = 5000;
                    K.k(true);
                    if (hb0Var != null) {
                        hb0Var.c(true);
                    }
                    t5.y(g7Var.currentAccount, false).T(true);
                } else if (str != null) {
                    hg.k0.p(R.string.UnknownErrorCode, new Object[]{str}, xc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, l61 l61Var) {
        int i10;
        String formatCurrency;
        arrayList.add(x51.k(this.X));
        com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = t5.y(this.currentAccount, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < u10.size(); i13++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i13);
                if (!this.f47449c0 && tL_starsGiftOption.extended) {
                    i11++;
                } else {
                    int i14 = i12 + 1;
                    int i15 = h7.f47485a;
                    x51 J = x51.J(h7.class);
                    J.d = i13;
                    J.f30261z = i12;
                    long j3 = tL_starsGiftOption.stars;
                    J.B = j3;
                    J.f30248l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        formatCurrency = null;
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    J.f30249m = formatCurrency;
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i12 = i14;
                }
            }
            boolean z10 = this.f47449c0;
            if (!z10 && i11 > 0) {
                if (z10) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i16 = d7.f47303a;
                x51 J2 = x51.J(d7.class);
                J2.d = -1;
                J2.f30248l = string;
                J2.f30243f = !this.f47449c0;
                J2.f30253q = true;
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
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (l61Var = this.f47448b0) != null) {
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
        lk lkVar;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R instanceof zn) {
            zn znVar = (zn) R;
            if (znVar.x9() && (lkVar = znVar.Y) != null) {
                lkVar.P();
            }
        }
        super.show();
    }

    @Override
    public final vl0 v(wl0 wl0Var) {
        l61 l61Var = new l61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 27), this.resourcesProvider);
        this.f47448b0 = l61Var;
        return l61Var;
    }

    @Override
    public final CharSequence y() {
        ai.d1 d1Var = this.X;
        if (d1Var == null) {
            return null;
        }
        return ((TextView) d1Var.f687c).getText();
    }
}
