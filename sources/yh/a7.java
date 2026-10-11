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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.db0;
import org.telegram.ui.ok;
import org.telegram.ui.vn0;
import org.telegram.ui.zn;
public final class a7 extends db implements NotificationCenter.NotificationCenterDelegate {
    public final ai.d1 X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final tg.z0 f52349a0;
    public e71 f52350b0;
    public boolean f52351c0;

    public a7(Context context, org.telegram.ui.ActionBar.d6 d6Var, TLRPC.User user, tg.z0 z0Var) {
        super(context, null, false, false, d6Var);
        this.Z = user;
        this.f52349a0 = z0Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        sm0 sm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 22));
        s4.j jVar = new s4.j();
        jVar.f47788m = false;
        jVar.C = false;
        jVar.o(is.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20876i5, d6Var));
        ai.d1 d1Var = new ai.d1(context, 5, d6Var);
        this.X = d1Var;
        ((TextView) d1Var.f805c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        fa0 fa0Var = (fa0) d1Var.d;
        fa0Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
            public final a7 f53562b;

            {
                this.f53562b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.m2 m2Var;
                switch (r2) {
                    case 0:
                        a7 a7Var = this.f53562b;
                        jx0 jx0Var = new jx0(a7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(a7Var.attachedFragment) && (m2Var = a7Var.attachedFragment) != null) {
                            jx0Var.makeAttached(m2Var);
                        }
                        jx0Var.show();
                        return;
                    default:
                        of.f.s(this.f53562b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }), true)));
        fa0Var.setMaxWidth(ci.d4.a(fa0Var.getText(), fa0Var.getPaint()) + 1);
        this.f25521e.setTitle(B());
        j9 j9Var = new j9((org.telegram.ui.ActionBar.d6) null);
        j9Var.r(user);
        ((y9) d1Var.f804b).e(user, j9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        fa0 fa0Var2 = new fa0(context, d6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        fa0Var2.setTextSize(1, 12.0f);
        fa0Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B6, d6Var));
        fa0Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        fa0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
            public final a7 f53562b;

            {
                this.f53562b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.m2 m2Var;
                switch (r2) {
                    case 0:
                        a7 a7Var = this.f53562b;
                        jx0 jx0Var = new jx0(a7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(a7Var.attachedFragment) && (m2Var = a7Var.attachedFragment) != null) {
                            jx0Var.makeAttached(m2Var);
                        }
                        jx0Var.show();
                        return;
                    default:
                        of.f.s(this.f53562b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }));
        fa0Var2.setGravity(17);
        fa0Var2.setMaxWidth(ci.d4.a(fa0Var2.getText(), fa0Var2.getPaint()));
        frameLayout.addView(fa0Var2, w7.x5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20857h5, d6Var));
        this.containerView.addView(new i10(getContext()), w7.x5.d(-1.0f, -1));
        e71 e71Var = this.f52350b0;
        if (e71Var != null) {
            e71Var.N(false);
        }
    }

    public static void Q(a7 a7Var, int i10) {
        r61 G;
        e71 e71Var = a7Var.f52350b0;
        if (e71Var != null && (G = e71Var.G(i10 - 1)) != null) {
            e71 e71Var2 = a7Var.f52350b0;
            if (G.d == -1) {
                a7Var.f52351c0 = !a7Var.f52351c0;
                e71Var2.N(true);
                a7Var.d.v0(0, AndroidUtilities.dp(200.0f), is.f27452g);
            } else if (G.G(b7.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                Context findActivity = AndroidUtilities.findActivity(a7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                Context context = findActivity;
                if (context != null) {
                    long j3 = a7Var.Z.f20179id;
                    n5 y3 = n5.y(a7Var.currentAccount, false);
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                    g90 g90Var = new g90(a7Var, G, j3, 2);
                    int i11 = y3.f52997a;
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
                        obj.f4198b = "inapp";
                        obj.f4197a = tL_starsGiftOption.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj.a()), new ai.h6(y3, g90Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new ai.t5(y3, g90Var, tL_inputInvoiceStars, 24));
                    }
                }
            }
        }
    }

    public static void R(a7 a7Var, r61 r61Var, long j3, Boolean bool, String str) {
        tg.z0 z0Var;
        if (a7Var.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (z0Var = a7Var.f52349a0) != null) {
                z0Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            db0 db0Var = LaunchActivity.G1.f33849x0;
            if (U != null) {
                if (bool.booleanValue()) {
                    sc K = ad.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) r61Var.B, UserObject.getForcedFirstName(a7Var.Z))), LocaleController.getString(R.string.ViewInChat), new vn0(j3, 2));
                    K.f30711j = 5000;
                    K.k(true);
                    if (db0Var != null) {
                        db0Var.c(true);
                    }
                    n5.y(a7Var.currentAccount, false).T(true);
                } else if (str != null) {
                    hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, ad.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    @Override
    public final CharSequence B() {
        ai.d1 d1Var = this.X;
        if (d1Var == null) {
            return null;
        }
        return ((TextView) d1Var.f805c).getText();
    }

    public final void S(ArrayList arrayList, e71 e71Var) {
        int i10;
        String formatCurrency;
        arrayList.add(r61.k(this.X));
        com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = n5.y(this.currentAccount, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < u10.size(); i13++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i13);
                if (!this.f52351c0 && tL_starsGiftOption.extended) {
                    i11++;
                } else {
                    int i14 = i12 + 1;
                    int i15 = b7.f52394a;
                    r61 J = r61.J(b7.class);
                    J.d = i13;
                    J.f30374z = i12;
                    long j3 = tL_starsGiftOption.stars;
                    J.B = j3;
                    J.f30361l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        formatCurrency = null;
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    J.f30362m = formatCurrency;
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i12 = i14;
                }
            }
            boolean z10 = this.f52351c0;
            if (!z10 && i11 > 0) {
                if (z10) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i16 = x6.f53466a;
                r61 J2 = r61.J(x6.class);
                J2.d = -1;
                J2.f30361l = string;
                J2.f30356f = !this.f52351c0;
                J2.f30366q = true;
                arrayList.add(J2);
            }
        } else {
            arrayList.add(r61.n(31));
            arrayList.add(r61.n(31));
            arrayList.add(r61.n(31));
        }
        arrayList.add(r61.k(this.Y));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e71 e71Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (e71Var = this.f52350b0) != null) {
            e71Var.N(true);
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
        ok okVar;
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R instanceof zn) {
            zn znVar = (zn) R;
            if (znVar.C9() && (okVar = znVar.Y) != null) {
                okVar.N();
            }
        }
        super.show();
    }

    @Override
    public final rm0 x(sm0 sm0Var) {
        e71 e71Var = new e71(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 27), this.resourcesProvider);
        this.f52350b0 = e71Var;
        return e71Var;
    }
}
