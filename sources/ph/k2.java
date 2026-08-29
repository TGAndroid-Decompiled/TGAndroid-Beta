package ph;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import jh.s7;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo0;
import org.telegram.ui.dk;
import org.telegram.ui.fy;
import org.telegram.ui.tn;
import org.telegram.ui.yu0;
public final class k2 implements org.telegram.ui.web.f0 {
    public boolean f45865a;
    public final Context f45866b;
    public final c6 f45867c;
    public final p2 d;

    public k2(p2 p2Var, Context context, c6 c6Var) {
        this.d = p2Var;
        this.f45866b = context;
        this.f45867c = c6Var;
    }

    @Override
    public final void a() {
        p2 p2Var = this.d;
        TLRPC.User user = MessagesController.getInstance(p2Var.C).getUser(Long.valueOf(p2Var.D));
        oc.i iVar = new oc.i(4);
        iVar.f19483b = new i2(this, 0);
        mc V = new tc(p2Var.f45972l0, p2Var.A).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, iVar);
        V.f30652j = 5000;
        V.k(true);
    }

    @Override
    public final void b() {
        this.d.k(true);
    }

    @Override
    public final void c() {
        p2 p2Var = this.d;
        if (p2Var.f45991z0 != null) {
            org.telegram.ui.ActionBar.m3 P = LaunchActivity.C1.P();
            if (P != null) {
                P.e(p2Var.f45991z0);
            }
            p2Var.f45991z0 = null;
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
        p2 p2Var = this.d;
        new tc(p2Var.f45972l0, p2Var.A).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override
    public final void e(String str) {
        p2 p2Var = this.d;
        if (p2Var.F == 0 && !this.f45865a) {
            this.f45865a = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = MessagesController.getInstance(p2Var.C).getInputUser(p2Var.D);
            tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
            tL_messages_sendWebViewData.button_text = p2Var.I;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(p2Var.C).sendRequest(tL_messages_sendWebViewData, new j2(this, 0));
        }
    }

    @Override
    public final void f(ArrayList arrayList) {
        String formatPluralString;
        int size = arrayList.size();
        p2 p2Var = this.d;
        if (size == 1) {
            formatPluralString = LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(p2Var.C).getPeerName(((Long) arrayList.get(0)).longValue()));
        } else {
            formatPluralString = LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]);
        }
        new tc(p2Var.f45972l0, p2Var.A).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatPluralString)).k(true);
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        p2 p2Var = this.d;
        boolean z12 = p2Var.Z;
        if (z12 == z10) {
            if (!z12) {
                return null;
            }
            return "ALREADY_FULLSCREEN";
        }
        p2Var.x(z10, true, z11);
        return null;
    }

    @Override
    public final boolean h() {
        p2 p2Var = this.d;
        if (!MediaDataController.getInstance(p2Var.C).botInAttachMenu(p2Var.D) && !MessagesController.getInstance(p2Var.C).whitelistedBots.contains(Long.valueOf(p2Var.D))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        p2 p2Var = this.d;
        ImageView backButton = p2Var.S.getBackButton();
        p2Var.f45981s0 = z10;
        if (z10) {
            i10 = R.drawable.ic_ab_back;
        } else {
            i10 = R.drawable.ic_close_white;
        }
        AndroidUtilities.updateImageViewImageAnimated(backButton, i10);
        BotFullscreenButtons botFullscreenButtons = p2Var.f45969i0;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setBack(z10, true);
        }
    }

    @Override
    public final void j() {
        y();
    }

    @Override
    public final void k(boolean z10) {
        this.d.f45974n0 = z10;
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
        p2 p2Var = this.d;
        l2 l2Var = p2Var.f45968h0;
        ?? obj = new Object();
        obj.f46056a = z10;
        obj.f46057b = z11;
        obj.f46058c = z12;
        obj.d = z13;
        obj.f46059e = str;
        obj.f46060f = j10;
        obj.f46061g = i10;
        obj.h = i11;
        obj.f46062i = str2;
        int totalHeight = l2Var.getTotalHeight();
        l2Var.f46077e.d = obj;
        u.b(l2Var.f46078f[1].f46041l, obj, true);
        l2Var.invalidate();
        if (totalHeight != l2Var.getTotalHeight() && l2Var.f46080r != null) {
            if (totalHeight < l2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(l2Var.f46080r, 200L);
            } else {
                l2Var.f46080r.run();
            }
        }
        if (p2Var.Z) {
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
        o2 o2Var = p2Var.f45963e;
        org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) p2Var.f45967g0).O().getLastFragment();
        bo0 bo0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(o2Var);
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(p2Var.getContext(), 3, null);
            c2Var.q(150L);
            s7.y(p2Var.C, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new jh.h3(c2Var, 1), new yu0(13, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(p2Var.C).putUsers(paymentForm.users, false);
            bo0Var = new bo0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            bo0Var = new bo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (bo0Var != null) {
            g2Var.e(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(o2Var);
            vc0 vc0Var = new vc0(this.f45866b);
            vc0Var.show();
            bo0Var.V0 = new org.telegram.ui.Components.voip.w1(this, vc0Var, str, 3);
            bo0Var.U0 = this.f45867c;
            vc0Var.c(bo0Var);
        }
    }

    @Override
    public final void p(boolean z10) {
        this.d.o(z10);
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        p2 p2Var = this.d;
        l2 l2Var = p2Var.f45968h0;
        ?? obj = new Object();
        obj.f46056a = z10;
        obj.f46057b = z11;
        obj.f46058c = z12;
        obj.d = z13;
        obj.f46059e = str;
        obj.f46060f = j10;
        obj.f46061g = i10;
        obj.h = i11;
        obj.f46062i = null;
        int totalHeight = l2Var.getTotalHeight();
        l2Var.f46077e.f559c = obj;
        s[] sVarArr = l2Var.f46078f;
        sVarArr[0].f46041l.b();
        if (obj.f46060f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) obj.f46059e);
            spannableStringBuilder.setSpan(new y5(obj.f46060f, 1.4f, sVarArr[0].f46041l.f30861a.getFontMetricsInt()), 0, 1, 33);
            sVarArr[0].f46041l.q(spannableStringBuilder, true, true);
        } else {
            sVarArr[0].f46041l.q(obj.f46059e, true, true);
        }
        l2Var.invalidate();
        if (totalHeight != l2Var.getTotalHeight() && l2Var.f46080r != null) {
            if (totalHeight < l2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(l2Var.f46080r, 200L);
            } else {
                l2Var.f46080r.run();
            }
        }
        if (p2Var.Z) {
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
        if (g2Var.f45904c) {
            return;
        }
        g2Var.e(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()));
    }

    @Override
    public final void t(boolean z10) {
        this.d.X = z10;
    }

    @Override
    public final void u(int i10, int i11, boolean z10) {
        p2 p2Var = this.d;
        p2Var.f45977q0 = i10;
        p2Var.t(i11, z10, true);
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        p2 p2Var = this.d;
        if (isEmpty) {
            Activity activity = p2Var.f45967g0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof tn) {
                    dk dkVar = ((tn) lastFragment).U;
                    dkVar.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
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
        fy fyVar = new fy(bundle);
        AndroidUtilities.hideKeyboard(p2Var.f45963e);
        vc0 vc0Var = new vc0(this.f45866b);
        fyVar.f38379y2 = new a1.d(this, user, str, vc0Var, 21);
        vc0Var.show();
        vc0Var.c(fyVar);
    }

    @Override
    public final void w(boolean z10) {
        p2 p2Var = this.d;
        c6 c6Var = p2Var.A;
        FrameLayout frameLayout = p2Var.f45972l0;
        TLRPC.User user = MessagesController.getInstance(p2Var.C).getUser(Long.valueOf(p2Var.D));
        if (z10) {
            oc.i iVar = new oc.i(4);
            LocaleController.getString(R.string.UndoNoCaps);
            iVar.f19483b = new i2(this, 1);
            mc V = new tc(frameLayout, c6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, iVar);
            V.f30652j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new i2(this, 2)), true));
        mc P = new tc(frameLayout, c6Var).P(R.raw.error, spannableStringBuilder);
        P.f30652j = 5000;
        P.k(true);
    }

    @Override
    public final void x(boolean z10) {
        g2 g2Var = this.d.v;
        if (g2Var != null) {
            g2Var.setAllowSwipes(z10);
        }
    }

    @Override
    public final void y() {
        this.d.k(false);
    }

    @Override
    public final u0 z() {
        p2 p2Var = this.d;
        if (p2Var.f45988x0 == null) {
            u0 u0Var = new u0(this.f45866b);
            p2Var.f45988x0 = u0Var;
            u0Var.f46089k = p2Var.f45987x.getWebView();
        }
        return p2Var.f45988x0;
    }

    @Override
    public final void o(int i10, boolean z10) {
    }
}
