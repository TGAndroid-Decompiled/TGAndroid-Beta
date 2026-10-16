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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo0;
import org.telegram.ui.fo;
import org.telegram.ui.ib0;
import org.telegram.ui.sk;
public final class a7 extends db implements NotificationCenter.NotificationCenterDelegate {
    public final bi.v0 X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final ug.a1 f50281a0;
    public a71 f50282b0;
    public boolean f50283c0;

    public a7(Context context, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.User user, ug.a1 a1Var) {
        super(context, null, false, false, c6Var);
        this.Z = user;
        this.f50281a0 = a1Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new bi.d(this, 22));
        s4.k kVar = new s4.k();
        kVar.f44872m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19689i5, c6Var));
        bi.v0 v0Var = new bi.v0(context, 5, c6Var);
        this.X = v0Var;
        ((TextView) v0Var.f3852c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        da0 da0Var = (da0) v0Var.d;
        da0Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
            public final a7 f51386b;

            {
                this.f51386b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.m2 m2Var;
                switch (r2) {
                    case 0:
                        a7 a7Var = this.f51386b;
                        dx0 dx0Var = new dx0(a7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(a7Var.attachedFragment) && (m2Var = a7Var.attachedFragment) != null) {
                            dx0Var.makeAttached(m2Var);
                        }
                        dx0Var.show();
                        return;
                    default:
                        pf.d.r(this.f51386b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }), true)));
        da0Var.setMaxWidth(di.d4.a(da0Var.getText(), da0Var.getPaint()) + 1);
        this.e.setTitle(B());
        k9 k9Var = new k9((org.telegram.ui.ActionBar.c6) null);
        k9Var.r(user);
        ((z9) v0Var.f3851b).e(user, k9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        da0 da0Var2 = new da0(context, c6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        da0Var2.setTextSize(1, 12.0f);
        da0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.B6, c6Var));
        da0Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19660gc, c6Var));
        da0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
            public final a7 f51386b;

            {
                this.f51386b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.m2 m2Var;
                switch (r2) {
                    case 0:
                        a7 a7Var = this.f51386b;
                        dx0 dx0Var = new dx0(a7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(a7Var.attachedFragment) && (m2Var = a7Var.attachedFragment) != null) {
                            dx0Var.makeAttached(m2Var);
                        }
                        dx0Var.show();
                        return;
                    default:
                        pf.d.r(this.f51386b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }));
        da0Var2.setGravity(17);
        da0Var2.setMaxWidth(di.d4.a(da0Var2.getText(), da0Var2.getPaint()));
        frameLayout.addView(da0Var2, w7.z5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19672h5, c6Var));
        this.containerView.addView(new d10(getContext()), w7.z5.d(-1.0f, -1));
        a71 a71Var = this.f50282b0;
        if (a71Var != null) {
            a71Var.N(false);
        }
    }

    public static void Q(a7 a7Var, int i10) {
        m61 G;
        a71 a71Var = a7Var.f50282b0;
        if (a71Var != null && (G = a71Var.G(i10 - 1)) != null) {
            a71 a71Var2 = a7Var.f50282b0;
            if (G.d == -1) {
                a7Var.f50283c0 = !a7Var.f50283c0;
                a71Var2.N(true);
                a7Var.d.v0(0, AndroidUtilities.dp(200.0f), es.f24466g);
            } else if (G.G(b7.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                Context findActivity = AndroidUtilities.findActivity(a7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                Context context = findActivity;
                if (context != null) {
                    long j10 = a7Var.Z.f19063id;
                    n5 y3 = n5.y(a7Var.currentAccount, false);
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                    c90 c90Var = new c90(a7Var, G, j10, 2);
                    int i11 = y3.f50865a;
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
                        tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                        ?? obj = new Object();
                        obj.f4327b = "inapp";
                        obj.f4326a = tL_starsGiftOption.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj.a()), new bi.s5(y3, c90Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j10);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject q6 = fi.k3.q(n5.I(), false);
                        if (q6 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = q6.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new bi.e5(y3, c90Var, tL_inputInvoiceStars, 24));
                    }
                }
            }
        }
    }

    public static void R(a7 a7Var, m61 m61Var, long j10, Boolean bool, String str) {
        ug.a1 a1Var;
        if (a7Var.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (a1Var = a7Var.f50281a0) != null) {
                a1Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            ib0 ib0Var = LaunchActivity.G1.f31849x0;
            if (U != null) {
                if (bool.booleanValue()) {
                    sc K = zc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) m61Var.B, UserObject.getForcedFirstName(a7Var.Z))), LocaleController.getString(R.string.ViewInChat), new bo0(j10, 2));
                    K.f28805j = 5000;
                    K.k(true);
                    if (ib0Var != null) {
                        ib0Var.c(true);
                    }
                    n5.y(a7Var.currentAccount, false).T(true);
                } else if (str != null) {
                    i2.d.s(R.string.UnknownErrorCode, new Object[]{str}, zc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    @Override
    public final CharSequence B() {
        bi.v0 v0Var = this.X;
        if (v0Var == null) {
            return null;
        }
        return ((TextView) v0Var.f3852c).getText();
    }

    public final void S(ArrayList arrayList, a71 a71Var) {
        int i10;
        String formatCurrency;
        arrayList.add(m61.k(this.X));
        i2.d.p(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = n5.y(this.currentAccount, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < u10.size(); i13++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i13);
                if (!this.f50283c0 && tL_starsGiftOption.extended) {
                    i11++;
                } else {
                    int i14 = i12 + 1;
                    int i15 = b7.f50322a;
                    m61 J = m61.J(b7.class);
                    J.d = i13;
                    J.f26959z = i12;
                    long j10 = tL_starsGiftOption.stars;
                    J.B = j10;
                    J.f26946l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        formatCurrency = null;
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    J.f26947m = formatCurrency;
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i12 = i14;
                }
            }
            boolean z10 = this.f50283c0;
            if (!z10 && i11 > 0) {
                if (z10) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i16 = x6.f51314a;
                m61 J2 = m61.J(x6.class);
                J2.d = -1;
                J2.f26946l = string;
                J2.f26941f = !this.f50283c0;
                J2.f26951q = true;
                arrayList.add(J2);
            }
        } else {
            arrayList.add(m61.n(31));
            arrayList.add(m61.n(31));
            arrayList.add(m61.n(31));
        }
        arrayList.add(m61.k(this.Y));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a71 a71Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (a71Var = this.f50282b0) != null) {
            a71Var.N(true);
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
        if (R instanceof fo) {
            fo foVar = (fo) R;
            if (foVar.C9() && (skVar = foVar.Y) != null) {
                skVar.N();
            }
        }
        super.show();
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new ii.a(this, 27), this.resourcesProvider);
        this.f50282b0 = a71Var;
        return a71Var;
    }
}
