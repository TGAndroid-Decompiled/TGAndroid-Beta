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
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.ib0;
import org.telegram.ui.nk;
import org.telegram.ui.zn0;
public final class j7 extends za implements NotificationCenter.NotificationCenterDelegate {
    public final ai.d1 X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final tg.b1 f47374a0;
    public x51 f47375b0;
    public boolean f47376c0;

    public j7(Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.User user, tg.b1 b1Var) {
        super(context, null, false, false, f6Var);
        this.Z = user;
        this.f47374a0 = b1Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        ml0 ml0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 22));
        s4.j jVar = new s4.j();
        jVar.f42737m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18952i5, f6Var));
        ai.d1 d1Var = new ai.d1(context, 5, f6Var);
        this.X = d1Var;
        ((TextView) d1Var.f687c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        c90 c90Var = (c90) d1Var.d;
        c90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
            public final j7 f47334b;

            {
                this.f47334b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.o2 o2Var;
                switch (r2) {
                    case 0:
                        j7 j7Var = this.f47334b;
                        fw0 fw0Var = new fw0(j7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(j7Var.attachedFragment) && (o2Var = j7Var.attachedFragment) != null) {
                            fw0Var.makeAttached(o2Var);
                        }
                        fw0Var.show();
                        return;
                    default:
                        nf.f.s(this.f47334b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }), true)));
        c90Var.setMaxWidth(ci.f4.a(c90Var.getText(), c90Var.getPaint()) + 1);
        this.e.setTitle(y());
        f9 f9Var = new f9((org.telegram.ui.ActionBar.f6) null);
        f9Var.r(user);
        ((u9) d1Var.f686b).e(user, f9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        c90 c90Var2 = new c90(context, f6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        c90Var2.setTextSize(1, 12.0f);
        c90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, f6Var));
        c90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        c90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
            public final j7 f47334b;

            {
                this.f47334b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.o2 o2Var;
                switch (r2) {
                    case 0:
                        j7 j7Var = this.f47334b;
                        fw0 fw0Var = new fw0(j7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(j7Var.attachedFragment) && (o2Var = j7Var.attachedFragment) != null) {
                            fw0Var.makeAttached(o2Var);
                        }
                        fw0Var.show();
                        return;
                    default:
                        nf.f.s(this.f47334b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }));
        c90Var2.setGravity(17);
        c90Var2.setMaxWidth(ci.f4.a(c90Var2.getText(), c90Var2.getPaint()));
        frameLayout.addView(c90Var2, w7.x5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18934h5, f6Var));
        this.containerView.addView(new r00(getContext()), w7.x5.c(-1.0f, -1));
        x51 x51Var = this.f47375b0;
        if (x51Var != null) {
            x51Var.N(false);
        }
    }

    public static void P(j7 j7Var, int i10) {
        j51 G;
        x51 x51Var = j7Var.f47375b0;
        if (x51Var != null && (G = x51Var.G(i10 - 1)) != null) {
            x51 x51Var2 = j7Var.f47375b0;
            if (G.d == -1) {
                j7Var.f47376c0 = !j7Var.f47376c0;
                x51Var2.N(true);
                j7Var.d.w0(0, AndroidUtilities.dp(200.0f), qr.f27384g);
            } else if (G.G(k7.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                Context findActivity = AndroidUtilities.findActivity(j7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                Context context = findActivity;
                if (context != null) {
                    long j3 = j7Var.Z.f18268id;
                    v5 y3 = v5.y(j7Var.currentAccount, false);
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                    d80 d80Var = new d80(j7Var, G, j3, 2);
                    int i11 = y3.f47923a;
                    if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (R != null && R.getContext() != null) {
                            v5.e0(R.getContext(), R.getResourceProvider());
                        } else {
                            v5.e0(context, null);
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
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj.a()), new ai.h6(y3, d80Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j3);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject p5 = ei.k3.p(v5.I(), false);
                        if (p5 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = p5.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new ai.t5(y3, d80Var, tL_inputInvoiceStars, 24));
                    }
                }
            }
        }
    }

    public static void Q(j7 j7Var, j51 j51Var, long j3, Boolean bool, String str) {
        tg.b1 b1Var;
        if (j7Var.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (b1Var = j7Var.f47374a0) != null) {
                b1Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            ib0 ib0Var = LaunchActivity.G1.f30875x0;
            if (U != null) {
                if (bool.booleanValue()) {
                    oc K = vc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) j51Var.B, UserObject.getForcedFirstName(j7Var.Z))), LocaleController.getString(R.string.ViewInChat), new zn0(j3, 2));
                    K.f26705j = 5000;
                    K.k(true);
                    if (ib0Var != null) {
                        ib0Var.c(true);
                    }
                    v5.y(j7Var.currentAccount, false).T(true);
                } else if (str != null) {
                    hg.k0.s(R.string.UnknownErrorCode, new Object[]{str}, vc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, x51 x51Var) {
        int i10;
        String formatCurrency;
        arrayList.add(j51.k(this.X));
        com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = v5.y(this.currentAccount, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < u10.size(); i13++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i13);
                if (!this.f47376c0 && tL_starsGiftOption.extended) {
                    i11++;
                } else {
                    int i14 = i12 + 1;
                    int i15 = k7.f47405a;
                    j51 J = j51.J(k7.class);
                    J.d = i13;
                    J.f25140z = i12;
                    long j3 = tL_starsGiftOption.stars;
                    J.B = j3;
                    J.f25127l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        formatCurrency = null;
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    J.f25128m = formatCurrency;
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i12 = i14;
                }
            }
            boolean z10 = this.f47376c0;
            if (!z10 && i11 > 0) {
                if (z10) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i16 = g7.f47262a;
                j51 J2 = j51.J(g7.class);
                J2.d = -1;
                J2.f25127l = string;
                J2.f25122f = !this.f47376c0;
                J2.f25132q = true;
                arrayList.add(J2);
            }
        } else {
            arrayList.add(j51.n(31));
            arrayList.add(j51.n(31));
            arrayList.add(j51.n(31));
        }
        arrayList.add(j51.k(this.Y));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x51 x51Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (x51Var = this.f47375b0) != null) {
            x51Var.N(true);
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
        nk nkVar;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R instanceof bo) {
            bo boVar = (bo) R;
            if (boVar.x9() && (nkVar = boVar.Y) != null) {
                nkVar.Q();
            }
        }
        super.show();
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        x51 x51Var = new x51(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 27), this.resourcesProvider);
        this.f47375b0 = x51Var;
        return x51Var;
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
