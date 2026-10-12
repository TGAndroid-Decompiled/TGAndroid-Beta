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
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.fb0;
import org.telegram.ui.sk;
import org.telegram.ui.yn0;
public final class a7 extends db implements NotificationCenter.NotificationCenterDelegate {
    public final ai.d1 X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final tg.a1 f52490a0;
    public h71 f52491b0;
    public boolean f52492c0;

    public a7(Context context, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.User user, tg.a1 a1Var) {
        super(context, null, false, false, c6Var);
        this.Z = user;
        this.f52490a0 = a1Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        wm0 wm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 22));
        s4.j jVar = new s4.j();
        jVar.f47937m = false;
        jVar.C = false;
        jVar.o(js.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20650i5, c6Var));
        ai.d1 d1Var = new ai.d1(context, 5, c6Var);
        this.X = d1Var;
        ((TextView) d1Var.f803c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        ia0 ia0Var = (ia0) d1Var.d;
        ia0Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
            public final a7 f53707b;

            {
                this.f53707b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.m2 m2Var;
                switch (r2) {
                    case 0:
                        a7 a7Var = this.f53707b;
                        nx0 nx0Var = new nx0(a7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(a7Var.attachedFragment) && (m2Var = a7Var.attachedFragment) != null) {
                            nx0Var.makeAttached(m2Var);
                        }
                        nx0Var.show();
                        return;
                    default:
                        of.f.s(this.f53707b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }), true)));
        ia0Var.setMaxWidth(ci.d4.a(ia0Var.getText(), ia0Var.getPaint()) + 1);
        this.f25287e.setTitle(A());
        j9 j9Var = new j9((org.telegram.ui.ActionBar.c6) null);
        j9Var.r(user);
        ((y9) d1Var.f802b).e(user, j9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        ia0 ia0Var2 = new ia0(context, c6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        ia0Var2.setTextSize(1, 12.0f);
        ia0Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B6, c6Var));
        ia0Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, c6Var));
        ia0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
            public final a7 f53707b;

            {
                this.f53707b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.m2 m2Var;
                switch (r2) {
                    case 0:
                        a7 a7Var = this.f53707b;
                        nx0 nx0Var = new nx0(a7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(a7Var.attachedFragment) && (m2Var = a7Var.attachedFragment) != null) {
                            nx0Var.makeAttached(m2Var);
                        }
                        nx0Var.show();
                        return;
                    default:
                        of.f.s(this.f53707b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }));
        ia0Var2.setGravity(17);
        ia0Var2.setMaxWidth(ci.d4.a(ia0Var2.getText(), ia0Var2.getPaint()));
        frameLayout.addView(ia0Var2, w7.w5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20631h5, c6Var));
        this.containerView.addView(new k10(getContext()), w7.w5.d(-1.0f, -1));
        h71 h71Var = this.f52491b0;
        if (h71Var != null) {
            h71Var.N(false);
        }
    }

    public static void Q(a7 a7Var, int i10) {
        u61 G;
        h71 h71Var = a7Var.f52491b0;
        if (h71Var != null && (G = h71Var.G(i10 - 1)) != null) {
            h71 h71Var2 = a7Var.f52491b0;
            if (G.d == -1) {
                a7Var.f52492c0 = !a7Var.f52492c0;
                h71Var2.N(true);
                a7Var.d.v0(0, AndroidUtilities.dp(200.0f), js.f27635g);
            } else if (G.G(b7.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                Context findActivity = AndroidUtilities.findActivity(a7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                Context context = findActivity;
                if (context != null) {
                    long j3 = a7Var.Z.f19950id;
                    n5 y3 = n5.y(a7Var.currentAccount, false);
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                    j90 j90Var = new j90(a7Var, G, j3, 2);
                    int i11 = y3.f53146a;
                    if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                        if (R != null && R.getContext() != null) {
                            n5.e0(R.getContext(), R.getResourceProvider());
                        } else {
                            n5.e0(context, null);
                        }
                    } else if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i11).getInputUser(j3);
                        ?? obj = new Object();
                        obj.f4197b = "inapp";
                        obj.f4196a = tL_starsGiftOption.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj.a()), new ai.h6(y3, j90Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j3);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject q6 = ei.k3.q(n5.I(), false);
                        if (q6 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = q6.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new ai.t5(y3, j90Var, tL_inputInvoiceStars, 24));
                    }
                }
            }
        }
    }

    public static void R(a7 a7Var, u61 u61Var, long j3, Boolean bool, String str) {
        tg.a1 a1Var;
        if (a7Var.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (a1Var = a7Var.f52490a0) != null) {
                a1Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            fb0 fb0Var = LaunchActivity.G1.f33660x0;
            if (U != null) {
                if (bool.booleanValue()) {
                    sc K = zc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) u61Var.B, UserObject.getForcedFirstName(a7Var.Z))), LocaleController.getString(R.string.ViewInChat), new yn0(j3, 2));
                    K.f30536j = 5000;
                    K.k(true);
                    if (fb0Var != null) {
                        fb0Var.c(true);
                    }
                    n5.y(a7Var.currentAccount, false).T(true);
                } else if (str != null) {
                    hg.c.s(R.string.UnknownErrorCode, new Object[]{str}, zc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    @Override
    public final CharSequence A() {
        ai.d1 d1Var = this.X;
        if (d1Var == null) {
            return null;
        }
        return ((TextView) d1Var.f803c).getText();
    }

    public final void S(ArrayList arrayList, h71 h71Var) {
        int i10;
        String formatCurrency;
        arrayList.add(u61.k(this.X));
        com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = n5.y(this.currentAccount, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < u10.size(); i13++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i13);
                if (!this.f52492c0 && tL_starsGiftOption.extended) {
                    i11++;
                } else {
                    int i14 = i12 + 1;
                    int i15 = b7.f52544a;
                    u61 J = u61.J(b7.class);
                    J.d = i13;
                    J.f31084z = i12;
                    long j3 = tL_starsGiftOption.stars;
                    J.B = j3;
                    J.f31071l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        formatCurrency = null;
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    J.f31072m = formatCurrency;
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i12 = i14;
                }
            }
            boolean z10 = this.f52492c0;
            if (!z10 && i11 > 0) {
                if (z10) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i16 = x6.f53612a;
                u61 J2 = u61.J(x6.class);
                J2.d = -1;
                J2.f31071l = string;
                J2.f31066f = !this.f52492c0;
                J2.f31076q = true;
                arrayList.add(J2);
            }
        } else {
            arrayList.add(u61.n(31));
            arrayList.add(u61.n(31));
            arrayList.add(u61.n(31));
        }
        arrayList.add(u61.k(this.Y));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h71 h71Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (h71Var = this.f52491b0) != null) {
            h71Var.N(true);
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
        sk skVar;
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R instanceof eo) {
            eo eoVar = (eo) R;
            if (eoVar.C9() && (skVar = eoVar.Y) != null) {
                skVar.Q();
            }
        }
        super.show();
    }

    @Override
    public final vm0 x(wm0 wm0Var) {
        h71 h71Var = new h71(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 27), this.resourcesProvider);
        this.f52491b0 = h71Var;
        return h71Var;
    }
}
