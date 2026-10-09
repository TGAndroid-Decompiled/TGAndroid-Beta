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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eb0;
import org.telegram.ui.ok;
import org.telegram.ui.wn0;
import org.telegram.ui.zn;
public final class a7 extends eb implements NotificationCenter.NotificationCenterDelegate {
    public final ai.d1 X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final tg.a1 f52260a0;
    public c71 f52261b0;
    public boolean f52262c0;

    public a7(Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.User user, tg.a1 a1Var) {
        super(context, null, false, false, e6Var);
        this.Z = user;
        this.f52260a0 = a1Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        qm0 qm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 22));
        s4.j jVar = new s4.j();
        jVar.f47696m = false;
        jVar.C = false;
        jVar.o(hs.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20887i5, e6Var));
        ai.d1 d1Var = new ai.d1(context, 5, e6Var);
        this.X = d1Var;
        ((TextView) d1Var.f805c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        ea0 ea0Var = (ea0) d1Var.d;
        ea0Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) {
            public final a7 f53473b;

            {
                this.f53473b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (r2) {
                    case 0:
                        a7 a7Var = this.f53473b;
                        hx0 hx0Var = new hx0(a7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(a7Var.attachedFragment) && (n2Var = a7Var.attachedFragment) != null) {
                            hx0Var.makeAttached(n2Var);
                        }
                        hx0Var.show();
                        return;
                    default:
                        of.f.s(this.f53473b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }), true)));
        ea0Var.setMaxWidth(ci.d4.a(ea0Var.getText(), ea0Var.getPaint()) + 1);
        this.f26023e.setTitle(B());
        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.r(user);
        ((y9) d1Var.f804b).e(user, j9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        ea0 ea0Var2 = new ea0(context, e6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        ea0Var2.setTextSize(1, 12.0f);
        ea0Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.B6, e6Var));
        ea0Var2.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        ea0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) {
            public final a7 f53473b;

            {
                this.f53473b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (r2) {
                    case 0:
                        a7 a7Var = this.f53473b;
                        hx0 hx0Var = new hx0(a7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(a7Var.attachedFragment) && (n2Var = a7Var.attachedFragment) != null) {
                            hx0Var.makeAttached(n2Var);
                        }
                        hx0Var.show();
                        return;
                    default:
                        of.f.s(this.f53473b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        return;
                }
            }
        }));
        ea0Var2.setGravity(17);
        ea0Var2.setMaxWidth(ci.d4.a(ea0Var2.getText(), ea0Var2.getPaint()));
        frameLayout.addView(ea0Var2, w7.x5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20868h5, e6Var));
        this.containerView.addView(new h10(getContext()), w7.x5.d(-1.0f, -1));
        c71 c71Var = this.f52261b0;
        if (c71Var != null) {
            c71Var.N(false);
        }
    }

    public static void Q(a7 a7Var, int i10) {
        p61 G;
        c71 c71Var = a7Var.f52261b0;
        if (c71Var != null && (G = c71Var.G(i10 - 1)) != null) {
            c71 c71Var2 = a7Var.f52261b0;
            if (G.d == -1) {
                a7Var.f52262c0 = !a7Var.f52262c0;
                c71Var2.N(true);
                a7Var.d.v0(0, AndroidUtilities.dp(200.0f), hs.f27119g);
            } else if (G.G(b7.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                Context findActivity = AndroidUtilities.findActivity(a7Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                Context context = findActivity;
                if (context != null) {
                    long j3 = a7Var.Z.f20185id;
                    m5 y3 = m5.y(a7Var.currentAccount, false);
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                    f90 f90Var = new f90(a7Var, G, j3, 2);
                    int i11 = y3.f52878a;
                    if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R != null && R.getContext() != null) {
                            m5.e0(R.getContext(), R.getResourceProvider());
                        } else {
                            m5.e0(context, null);
                        }
                    } else if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i11).getInputUser(j3);
                        c5.a aVar = new c5.a();
                        aVar.f4199c = "inapp";
                        aVar.f4198b = tL_starsGiftOption.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(aVar.a()), new ai.h6(y3, f90Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                        tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j3);
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject q6 = ei.k3.q(m5.I(), false);
                        if (q6 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = q6.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new ai.t5(y3, f90Var, tL_inputInvoiceStars, 24));
                    }
                }
            }
        }
    }

    public static void R(a7 a7Var, p61 p61Var, long j3, Boolean bool, String str) {
        tg.a1 a1Var;
        if (a7Var.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (a1Var = a7Var.f52260a0) != null) {
                a1Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            eb0 eb0Var = LaunchActivity.G1.f33821x0;
            if (U != null) {
                if (bool.booleanValue()) {
                    tc K = ad.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) p61Var.B, UserObject.getForcedFirstName(a7Var.Z))), LocaleController.getString(R.string.ViewInChat), new wn0(j3, 2));
                    K.f31130j = 5000;
                    K.k(true);
                    if (eb0Var != null) {
                        eb0Var.c(true);
                    }
                    m5.y(a7Var.currentAccount, false).T(true);
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

    public final void S(ArrayList arrayList, c71 c71Var) {
        int i10;
        String formatCurrency;
        arrayList.add(p61.k(this.X));
        com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = m5.y(this.currentAccount, false).u();
        if (u10 != null && !u10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < u10.size(); i13++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i13);
                if (!this.f52262c0 && tL_starsGiftOption.extended) {
                    i11++;
                } else {
                    int i14 = i12 + 1;
                    int i15 = b7.f52305a;
                    p61 J = p61.J(b7.class);
                    J.d = i13;
                    J.f29747z = i12;
                    long j3 = tL_starsGiftOption.stars;
                    J.B = j3;
                    J.f29734l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        formatCurrency = null;
                    } else {
                        formatCurrency = BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    J.f29735m = formatCurrency;
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i12 = i14;
                }
            }
            boolean z10 = this.f52262c0;
            if (!z10 && i11 > 0) {
                if (z10) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i16 = x6.f53377a;
                p61 J2 = p61.J(x6.class);
                J2.d = -1;
                J2.f29734l = string;
                J2.f29729f = !this.f52262c0;
                J2.f29739q = true;
                arrayList.add(J2);
            }
        } else {
            arrayList.add(p61.n(31));
            arrayList.add(p61.n(31));
            arrayList.add(p61.n(31));
        }
        arrayList.add(p61.k(this.Y));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c71 c71Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (c71Var = this.f52261b0) != null) {
            c71Var.N(true);
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
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R instanceof zn) {
            zn znVar = (zn) R;
            if (znVar.C9() && (okVar = znVar.Y) != null) {
                okVar.N();
            }
        }
        super.show();
    }

    @Override
    public final pm0 x(qm0 qm0Var) {
        c71 c71Var = new c71(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 27), this.resourcesProvider);
        this.f52261b0 = c71Var;
        return c71Var;
    }
}
