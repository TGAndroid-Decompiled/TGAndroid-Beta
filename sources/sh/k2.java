package sh;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import mh.t7;
import n7.qa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.lo0;
import org.telegram.ui.py;
import org.telegram.ui.xn;
public final class k2 implements org.telegram.ui.web.f0 {
    public boolean f47490a;
    public final Context f47491b;
    public final g6 f47492c;
    public final p2 d;

    public k2(p2 p2Var, Context context, g6 g6Var) {
        this.d = p2Var;
        this.f47491b = context;
        this.f47492c = g6Var;
    }

    @Override
    public final void a() {
        p2 p2Var = this.d;
        TLRPC.User user = MessagesController.getInstance(p2Var.D).getUser(Long.valueOf(p2Var.E));
        qa qaVar = new qa(11);
        qaVar.f15699b = new i2(this, 0);
        ic V = new qc(p2Var.m0, p2Var.B).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, qaVar);
        V.f27745j = 5000;
        V.k(true);
    }

    @Override
    public final void b() {
        this.d.k(true);
    }

    @Override
    public final void c() {
        p2 p2Var = this.d;
        if (p2Var.A0 != null) {
            org.telegram.ui.ActionBar.o3 P = LaunchActivity.D1.P();
            if (P != null) {
                P.e(p2Var.A0);
            }
            p2Var.A0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        p2 p2Var = this.d;
        new qc(p2Var.m0, p2Var.B).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override
    public final void e(String str) {
        p2 p2Var = this.d;
        if (p2Var.G == 0 && !this.f47490a) {
            this.f47490a = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = MessagesController.getInstance(p2Var.D).getInputUser(p2Var.E);
            tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
            tL_messages_sendWebViewData.button_text = p2Var.J;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(p2Var.D).sendRequest(tL_messages_sendWebViewData, new j2(this, 0));
        }
    }

    @Override
    public final void f(ArrayList arrayList) {
        String formatPluralString;
        int size = arrayList.size();
        p2 p2Var = this.d;
        if (size == 1) {
            formatPluralString = LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(p2Var.D).getPeerName(((Long) arrayList.get(0)).longValue()));
        } else {
            formatPluralString = LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]);
        }
        new qc(p2Var.m0, p2Var.B).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatPluralString)).k(true);
    }

    @Override
    public final String g(boolean z4, boolean z10) {
        p2 p2Var = this.d;
        boolean z11 = p2Var.f47582a0;
        if (z11 == z4) {
            if (!z11) {
                return null;
            }
            return "ALREADY_FULLSCREEN";
        }
        p2Var.x(z4, true, z10);
        return null;
    }

    @Override
    public final boolean h() {
        p2 p2Var = this.d;
        if (!MediaDataController.getInstance(p2Var.D).botInAttachMenu(p2Var.E) && !MessagesController.getInstance(p2Var.D).whitelistedBots.contains(Long.valueOf(p2Var.E))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z4) {
        int i10;
        p2 p2Var = this.d;
        ImageView backButton = p2Var.T.getBackButton();
        p2Var.f47607t0 = z4;
        if (z4) {
            i10 = R.drawable.ic_ab_back;
        } else {
            i10 = R.drawable.ic_close_white;
        }
        AndroidUtilities.updateImageViewImageAnimated(backButton, i10);
        BotFullscreenButtons botFullscreenButtons = p2Var.f47595j0;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setBack(z4, true);
        }
    }

    @Override
    public final void j() {
        y();
    }

    @Override
    public final void k(boolean z4) {
        this.d.f47600o0 = z4;
    }

    @Override
    public final void l(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12, String str2) {
        p2 p2Var = this.d;
        l2 l2Var = p2Var.f47594i0;
        ?? obj = new Object();
        obj.f47681a = z4;
        obj.f47682b = z10;
        obj.f47683c = z11;
        obj.d = z12;
        obj.f47684e = str;
        obj.f47685f = j10;
        obj.f47686g = i10;
        obj.h = i11;
        obj.f47687i = str2;
        int totalHeight = l2Var.getTotalHeight();
        l2Var.f47702e.d = obj;
        u.b(l2Var.f47703f[1].f47666l, obj, true);
        l2Var.invalidate();
        if (totalHeight != l2Var.getTotalHeight() && l2Var.f47705r != null) {
            if (totalHeight < l2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(l2Var.f47705r, 200L);
            } else {
                l2Var.f47705r.run();
            }
        }
        if (p2Var.f47582a0) {
            p2Var.D();
            p2Var.G();
        }
    }

    @Override
    public final void m(int i10) {
        this.d.v(i10, true);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        p2 p2Var = this.d;
        g2 g2Var = p2Var.v;
        o2 o2Var = p2Var.f47588e;
        org.telegram.ui.ActionBar.p2 lastFragment = ((LaunchActivity) p2Var.f47593h0).O().getLastFragment();
        lo0 lo0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(o2Var);
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(p2Var.getContext(), 3, null);
            d2Var.q(150L);
            t7.y(p2Var.D, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new mh.g3(d2Var, 1), new org.telegram.ui.web.v1(13, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(p2Var.D).putUsers(paymentForm.users, false);
            lo0Var = new lo0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            lo0Var = new lo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (lo0Var != null) {
            g2Var.e(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(o2Var);
            dd0 dd0Var = new dd0(this.f47491b);
            dd0Var.show();
            lo0Var.W0 = new qh.m1(this, dd0Var, str);
            lo0Var.V0 = this.f47492c;
            dd0Var.c(lo0Var);
        }
    }

    @Override
    public final void p(boolean z4) {
        this.d.o(z4);
    }

    @Override
    public final void q(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12) {
        p2 p2Var = this.d;
        l2 l2Var = p2Var.f47594i0;
        ?? obj = new Object();
        obj.f47681a = z4;
        obj.f47682b = z10;
        obj.f47683c = z11;
        obj.d = z12;
        obj.f47684e = str;
        obj.f47685f = j10;
        obj.f47686g = i10;
        obj.h = i11;
        obj.f47687i = null;
        int totalHeight = l2Var.getTotalHeight();
        l2Var.f47702e.f1475c = obj;
        s[] sVarArr = l2Var.f47703f;
        sVarArr[0].f47666l.b();
        if (obj.f47685f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.f47684e);
            spannableStringBuilder.setSpan(new u5(obj.f47685f, 1.4f, sVarArr[0].f47666l.f28028a.getFontMetricsInt()), 0, 1, 33);
            sVarArr[0].f47666l.q(spannableStringBuilder, true, true);
        } else {
            sVarArr[0].f47666l.q(obj.f47684e, true, true);
        }
        l2Var.invalidate();
        if (totalHeight != l2Var.getTotalHeight() && l2Var.f47705r != null) {
            if (totalHeight < l2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(l2Var.f47705r, 200L);
            } else {
                l2Var.f47705r.run();
            }
        }
        if (p2Var.f47582a0) {
            p2Var.D();
            p2Var.G();
        }
    }

    @Override
    public final void r(int i10) {
        this.d.y(i10, true);
    }

    @Override
    public final void s() {
        g2 g2Var = this.d.v;
        if (g2Var.f47529c) {
            return;
        }
        g2Var.e(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z4) {
        this.d.Y = z4;
    }

    @Override
    public final void u(int i10, int i11, boolean z4) {
        p2 p2Var = this.d;
        p2Var.f47604r0 = i10;
        p2Var.t(i11, z4, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        p2 p2Var = this.d;
        if (isEmpty) {
            Activity activity = p2Var.f47593h0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.p2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof xn) {
                    jk jkVar = ((xn) lastFragment).V;
                    jkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
                    p2Var.k(false);
                    return;
                }
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialogsType", 14);
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("allowGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowMegagroups", arrayList.contains("groups"));
        bundle.putBoolean("allowLegacyGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowUsers", arrayList.contains("users"));
        bundle.putBoolean("allowChannels", arrayList.contains("channels"));
        bundle.putBoolean("allowBots", arrayList.contains("bots"));
        py pyVar = new py(bundle);
        AndroidUtilities.hideKeyboard(p2Var.f47588e);
        dd0 dd0Var = new dd0(this.f47491b);
        pyVar.f40308z2 = new a1.d(this, user, str, dd0Var, 21);
        dd0Var.show();
        dd0Var.c(pyVar);
    }

    @Override
    public final void w(boolean z4) {
        p2 p2Var = this.d;
        g6 g6Var = p2Var.B;
        FrameLayout frameLayout = p2Var.m0;
        TLRPC.User user = MessagesController.getInstance(p2Var.D).getUser(Long.valueOf(p2Var.E));
        if (z4) {
            qa qaVar = new qa(11);
            LocaleController.getString(R.string.UndoNoCaps);
            qaVar.f15699b = new i2(this, 1);
            ic V = new qc(frameLayout, g6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, qaVar);
            V.f27745j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new i2(this, 2)), true));
        ic P = new qc(frameLayout, g6Var).P(R.raw.error, spannableStringBuilder);
        P.f27745j = 5000;
        P.k(true);
    }

    @Override
    public final void x(boolean z4) {
        g2 g2Var = this.d.v;
        if (g2Var != null) {
            g2Var.setAllowSwipes(z4);
        }
    }

    @Override
    public final void y() {
        this.d.k(false);
    }

    @Override
    public final u0 z() {
        p2 p2Var = this.d;
        if (p2Var.f47615y0 == null) {
            u0 u0Var = new u0(this.f47491b);
            p2Var.f47615y0 = u0Var;
            u0Var.f47714k = p2Var.f47612x.getWebView();
        }
        return p2Var.f47615y0;
    }

    @Override
    public final void o(int i10, boolean z4) {
    }
}
