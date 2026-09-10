package xh;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.wa;
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
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.y00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.gb0;
import org.telegram.ui.ok;
import org.telegram.ui.xn0;
public final class k7 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public final ci.h X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final sg.d1 f45626a0;
    public j61 f45627b0;
    public boolean f45628c0;

    public k7(Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.User user, sg.d1 d1Var) {
        super(context, null, false, false, f6Var);
        this.Z = user;
        this.f45626a0 = d1Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 21));
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(wr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18016i5, f6Var));
        ci.h hVar = new ci.h(context, 4, f6Var);
        this.X = hVar;
        ((TextView) hVar.f4707b).setText(LocaleController.getString(R.string.GiftStarsTitle));
        m90 m90Var = (m90) hVar.f4708c;
        m90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
            public final k7 f45602b;

            {
                this.f45602b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.p2 p2Var;
                switch (r2) {
                    case 0:
                        k7 k7Var = this.f45602b;
                        pw0 pw0Var = new pw0(k7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(k7Var.attachedFragment) && (p2Var = k7Var.attachedFragment) != null) {
                            pw0Var.makeAttached(p2Var);
                        }
                        pw0Var.show();
                        return;
                    default:
                        nf.f.s(this.f45602b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }), true)));
        m90Var.setMaxWidth(bi.x4.a(m90Var.getText(), m90Var.getPaint()) + 1);
        this.e.setTitle(y());
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.r(user);
        ((w9) hVar.d).e(user, g9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        m90 m90Var2 = new m90(context, f6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        m90Var2.setTextSize(1, 12.0f);
        m90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, f6Var));
        m90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        m90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
            public final k7 f45602b;

            {
                this.f45602b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.p2 p2Var;
                switch (r2) {
                    case 0:
                        k7 k7Var = this.f45602b;
                        pw0 pw0Var = new pw0(k7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(k7Var.attachedFragment) && (p2Var = k7Var.attachedFragment) != null) {
                            pw0Var.makeAttached(p2Var);
                        }
                        pw0Var.show();
                        return;
                    default:
                        nf.f.s(this.f45602b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }));
        m90Var2.setGravity(17);
        m90Var2.setMaxWidth(bi.x4.a(m90Var2.getText(), m90Var2.getPaint()));
        frameLayout.addView(m90Var2, w7.a6.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, f6Var));
        this.containerView.addView(new y00(getContext()), w7.a6.c(-1.0f, -1));
        j61 j61Var = this.f45627b0;
        if (j61Var != null) {
            j61Var.N(false);
        }
    }

    public static void P(k7 k7Var, int i10) {
        v51 G;
        j61 j61Var = k7Var.f45627b0;
        if (j61Var != null && (G = j61Var.G(i10 - 1)) != null) {
            j61 j61Var2 = k7Var.f45627b0;
            if (G.d == -1) {
                k7Var.f45628c0 = !k7Var.f45628c0;
                j61Var2.N(true);
                k7Var.d.v0(0, AndroidUtilities.dp(200.0f), wr.f28820g);
            } else if (G.G(l7.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                Context findActivity = AndroidUtilities.findActivity(k7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                Context context = findActivity;
                if (context != null) {
                    long j3 = k7Var.Z.f17342id;
                    v5 y3 = v5.y(k7Var.currentAccount, false);
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                    n80 n80Var = new n80(k7Var, G, j3, 2);
                    int i11 = y3.f46176a;
                    if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
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
                        obj.f4256b = "inapp";
                        obj.f4255a = tL_starsGiftOption.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj.a()), new f1.a(y3, n80Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j3);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject p5 = di.n3.p(v5.I(), false);
                        if (p5 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = p5.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new wa(y3, n80Var, tL_inputInvoiceStars, 23));
                    }
                }
            }
        }
    }

    public static void Q(k7 k7Var, v51 v51Var, long j3, Boolean bool, String str) {
        sg.d1 d1Var;
        if (k7Var.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (d1Var = k7Var.f45626a0) != null) {
                d1Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            gb0 gb0Var = LaunchActivity.G1.f29971x0;
            if (U != null) {
                if (bool.booleanValue()) {
                    pc K = wc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) v51Var.B, UserObject.getForcedFirstName(k7Var.Z))), LocaleController.getString(R.string.ViewInChat), new xn0(j3, 2));
                    K.f26081j = 5000;
                    K.k(true);
                    if (gb0Var != null) {
                        gb0Var.c(true);
                    }
                    v5.y(k7Var.currentAccount, false).T(true);
                } else if (str != null) {
                    com.google.android.gms.internal.vision.e2.o(R.string.UnknownErrorCode, new Object[]{str}, wc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, j61 j61Var) {
        int i10;
        String formatCurrency;
        arrayList.add(v51.k(this.X));
        com.google.android.gms.internal.vision.e2.m(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = v5.y(this.currentAccount, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < u10.size(); i13++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i13);
                if (!this.f45628c0 && tL_starsGiftOption.extended) {
                    i11++;
                } else {
                    int i14 = i12 + 1;
                    int i15 = l7.f45674a;
                    v51 J = v51.J(l7.class);
                    J.d = i13;
                    J.f27842z = i12;
                    long j3 = tL_starsGiftOption.stars;
                    J.B = j3;
                    J.f27829l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        formatCurrency = null;
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    J.f27830m = formatCurrency;
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i12 = i14;
                }
            }
            boolean z10 = this.f45628c0;
            if (!z10 && i11 > 0) {
                if (z10) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i16 = h7.f45518a;
                v51 J2 = v51.J(h7.class);
                J2.d = -1;
                J2.f27829l = string;
                J2.f27824f = !this.f45628c0;
                J2.f27834q = true;
                arrayList.add(J2);
            }
        } else {
            arrayList.add(v51.n(31));
            arrayList.add(v51.n(31));
            arrayList.add(v51.n(31));
        }
        arrayList.add(v51.k(this.Y));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j61 j61Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (j61Var = this.f45627b0) != null) {
            j61Var.N(true);
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
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R instanceof eo) {
            eo eoVar = (eo) R;
            if (eoVar.x9() && (okVar = eoVar.Y) != null) {
                okVar.P();
            }
        }
        super.show();
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(this.d, getContext(), this.currentAccount, 0, true, new gi.a(this, 27), this.resourcesProvider);
        this.f45627b0 = j61Var;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        ci.h hVar = this.X;
        if (hVar == null) {
            return null;
        }
        return ((TextView) hVar.f4707b).getText();
    }
}
