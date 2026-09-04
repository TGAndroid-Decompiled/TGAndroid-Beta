package ug;

import android.content.Intent;
import android.net.Uri;
import bi.c5;
import bi.r3;
import di.c9;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
public final class d0 extends bb {
    public final TLRPC.TL_payments_checkedGiftCode X;
    public final boolean Y;
    public c0 Z;
    public final String f47103a0;

    public d0(n2 n2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(n2Var, true);
        boolean z10;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y = z10;
        this.X = tL_payments_checkedGiftCode;
        this.f47103a0 = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        N();
        c0 c0Var = this.Z;
        d3 d3Var = this.container;
        c0Var.getClass();
        c0Var.d = tL_payments_checkedGiftCode.used_date == 0;
        c0Var.f47806e = n2Var;
        c0Var.f47807f = tL_payments_checkedGiftCode;
        c0Var.h = str;
        c0Var.f47808n = d3Var;
    }

    public static boolean S(Intent intent, of.e eVar) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    String lastPathSegment = data.getLastPathSegment();
                    if ((uri.startsWith("tg:giftcode") || uri.startsWith("tg://giftcode")) && lastPathSegment != null) {
                        T(LaunchActivity.R(), lastPathSegment, eVar);
                        return true;
                    }
                    return false;
                }
                return false;
            }
            String lowerCase = data.getHost().toLowerCase();
            if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null) {
                String lastPathSegment2 = data.getLastPathSegment();
                if (path.startsWith("/giftcode") && lastPathSegment2 != null) {
                    T(LaunchActivity.R(), lastPathSegment2, eVar);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void T(n2 n2Var, String str, of.e eVar) {
        if (n2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (eVar != null) {
            eVar.d();
            eVar.f17004b = new e(atomicBoolean, 1);
        }
        r3 r3Var = new r3(atomicBoolean, n2Var, str, eVar, 15);
        g gVar = new g(atomicBoolean, eVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new c5(messagesController, r3Var, gVar, 19));
    }

    @Override
    public final void G(ov0 ov0Var) {
        qc.a(this.container, new c9(14));
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        c0 c0Var = new c0(this, this.resourcesProvider);
        this.Z = c0Var;
        return c0Var;
    }

    @Override
    public final CharSequence y() {
        if (this.Y) {
            return LocaleController.getString(R.string.BoostingGiftLink);
        }
        return LocaleController.getString(R.string.BoostingUsedGiftLink);
    }
}
