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
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eb0;
import org.telegram.ui.jk;
import org.telegram.ui.tn0;
import org.telegram.ui.yn;
public final class j7 extends cb implements NotificationCenter.NotificationCenterDelegate {
    public final ai.d1 X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final tg.a1 f51503a0;
    public w61 f51504b0;
    public boolean f51505c0;

    public j7(Context context, org.telegram.ui.ActionBar.d6 d6Var, TLRPC.User user, tg.a1 a1Var) {
        super(context, null, false, false, d6Var);
        this.Z = user;
        this.f51503a0 = a1Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        zl0 zl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 22));
        s4.j jVar = new s4.j();
        jVar.f46577m = false;
        jVar.C = false;
        jVar.o(tr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20917i5, d6Var));
        ai.d1 d1Var = new ai.d1(context, 5, d6Var);
        this.X = d1Var;
        ((TextView) d1Var.f752c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        q90 q90Var = (q90) d1Var.d;
        q90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
            public final j7 f51468b;

            {
                this.f51468b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (r2) {
                    case 0:
                        j7 j7Var = this.f51468b;
                        bx0 bx0Var = new bx0(j7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(j7Var.attachedFragment) && (n2Var = j7Var.attachedFragment) != null) {
                            bx0Var.makeAttached(n2Var);
                        }
                        bx0Var.show();
                        return;
                    default:
                        nf.f.s(this.f51468b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }), true)));
        q90Var.setMaxWidth(ci.e4.a(q90Var.getText(), q90Var.getPaint()) + 1);
        this.f25355e.setTitle(y());
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.r(user);
        ((w9) d1Var.f751b).e(user, h9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        q90 q90Var2 = new q90(context, d6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        q90Var2.setTextSize(1, 12.0f);
        q90Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.B6, d6Var));
        q90Var2.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var));
        q90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
            public final j7 f51468b;

            {
                this.f51468b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (r2) {
                    case 0:
                        j7 j7Var = this.f51468b;
                        bx0 bx0Var = new bx0(j7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(j7Var.attachedFragment) && (n2Var = j7Var.attachedFragment) != null) {
                            bx0Var.makeAttached(n2Var);
                        }
                        bx0Var.show();
                        return;
                    default:
                        nf.f.s(this.f51468b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }));
        q90Var2.setGravity(17);
        q90Var2.setMaxWidth(ci.e4.a(q90Var2.getText(), q90Var2.getPaint()));
        frameLayout.addView(q90Var2, w7.z5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20899h5, d6Var));
        this.containerView.addView(new u00(getContext()), w7.z5.c(-1.0f, -1));
        w61 w61Var = this.f51504b0;
        if (w61Var != null) {
            w61Var.N(false);
        }
    }

    public static void N(j7 j7Var, int i10) {
        h61 G;
        w61 w61Var = j7Var.f51504b0;
        if (w61Var != null && (G = w61Var.G(i10 - 1)) != null) {
            w61 w61Var2 = j7Var.f51504b0;
            if (G.d == -1) {
                j7Var.f51505c0 = !j7Var.f51505c0;
                w61Var2.N(true);
                j7Var.d.w0(0, AndroidUtilities.dp(200.0f), tr.f31216g);
            } else if (G.H(k7.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                Context findActivity = AndroidUtilities.findActivity(j7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                Context context = findActivity;
                if (context != null) {
                    long j3 = j7Var.Z.f20194id;
                    u5 y3 = u5.y(j7Var.currentAccount, false);
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                    r80 r80Var = new r80(j7Var, G, j3, 2);
                    int i11 = y3.f52085a;
                    if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R != null && R.getContext() != null) {
                            u5.e0(R.getContext(), R.getResourceProvider());
                        } else {
                            u5.e0(context, null);
                        }
                    } else if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i11).getInputUser(j3);
                        ?? obj = new Object();
                        obj.f4149b = "inapp";
                        obj.f4148a = tL_starsGiftOption.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj.a()), new ai.g6(y3, r80Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j3);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject p5 = ei.l3.p(u5.I(), false);
                        if (p5 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = p5.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new ai.s5(y3, r80Var, tL_inputInvoiceStars, 24));
                    }
                }
            }
        }
    }

    public static void O(j7 j7Var, h61 h61Var, long j3, Boolean bool, String str) {
        tg.a1 a1Var;
        if (j7Var.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (a1Var = j7Var.f51503a0) != null) {
                a1Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            eb0 eb0Var = LaunchActivity.G1.f33831x0;
            if (U != null) {
                if (bool.booleanValue()) {
                    rc K = yc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) h61Var.B, UserObject.getForcedFirstName(j7Var.Z))), LocaleController.getString(R.string.ViewInChat), new tn0(j3, 2));
                    K.f30427j = 5000;
                    K.k(true);
                    if (eb0Var != null) {
                        eb0Var.c(true);
                    }
                    u5.y(j7Var.currentAccount, false).T(true);
                } else if (str != null) {
                    hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, yc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void P(ArrayList arrayList, w61 w61Var) {
        int i10;
        String formatCurrency;
        arrayList.add(h61.k(this.X));
        com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = u5.y(this.currentAccount, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < u10.size(); i13++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i13);
                if (!this.f51505c0 && tL_starsGiftOption.extended) {
                    i11++;
                } else {
                    int i14 = i12 + 1;
                    int i15 = k7.f51553a;
                    h61 K = h61.K(k7.class);
                    K.d = i13;
                    K.f27106z = i12;
                    long j3 = tL_starsGiftOption.stars;
                    K.B = j3;
                    K.f27093l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        formatCurrency = null;
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    K.f27094m = formatCurrency;
                    K.G = tL_starsGiftOption;
                    arrayList.add(K);
                    i12 = i14;
                }
            }
            boolean z10 = this.f51505c0;
            if (!z10 && i11 > 0) {
                if (z10) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i16 = g7.f51360a;
                h61 K2 = h61.K(g7.class);
                K2.d = -1;
                K2.f27093l = string;
                K2.f27088f = !this.f51505c0;
                K2.f27098q = true;
                arrayList.add(K2);
            }
        } else {
            arrayList.add(h61.p(31));
            arrayList.add(h61.p(31));
            arrayList.add(h61.p(31));
        }
        arrayList.add(h61.k(this.Y));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w61 w61Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (w61Var = this.f51504b0) != null) {
            w61Var.N(true);
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
        if (R instanceof yn) {
            yn ynVar = (yn) R;
            if (ynVar.w9() && (jkVar = ynVar.W) != null) {
                jkVar.N();
            }
        }
        super.show();
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        w61 w61Var = new w61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 28), this.resourcesProvider);
        this.f51504b0 = w61Var;
        return w61Var;
    }

    @Override
    public final CharSequence y() {
        ai.d1 d1Var = this.X;
        if (d1Var == null) {
            return null;
        }
        return ((TextView) d1Var.f752c).getText();
    }
}
