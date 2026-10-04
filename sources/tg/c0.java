package tg;

import ai.e4;
import ai.s5;
import android.content.Intent;
import android.net.Uri;
import ci.z8;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
public final class c0 extends cb {
    public final TLRPC.TL_payments_checkedGiftCode X;
    public final boolean Y;
    public b0 Z;
    public final String f46993a0;

    public c0(n2 n2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(n2Var, true);
        boolean z10;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y = z10;
        this.X = tL_payments_checkedGiftCode;
        this.f46993a0 = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        L();
        b0 b0Var = this.Z;
        d3 d3Var = this.container;
        b0Var.getClass();
        b0Var.d = tL_payments_checkedGiftCode.used_date == 0;
        b0Var.f47658e = n2Var;
        b0Var.f47659f = tL_payments_checkedGiftCode;
        b0Var.h = str;
        b0Var.f47660n = d3Var;
    }

    public static boolean Q(Intent intent, nf.e eVar) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    String lastPathSegment = data.getLastPathSegment();
                    if ((uri.startsWith("tg:giftcode") || uri.startsWith("tg://giftcode")) && lastPathSegment != null) {
                        R(LaunchActivity.R(), lastPathSegment, eVar);
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
                    R(LaunchActivity.R(), lastPathSegment2, eVar);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void R(n2 n2Var, String str, nf.e eVar) {
        if (n2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (eVar != null) {
            eVar.d();
            eVar.f16881b = new d(atomicBoolean, 1);
        }
        e4 e4Var = new e4(atomicBoolean, n2Var, str, eVar, 16);
        f fVar = new f(atomicBoolean, eVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new s5(messagesController, e4Var, fVar, 19));
    }

    @Override
    public final void E(lw0 lw0Var) {
        rc.a(this.container, new z8(14));
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        b0 b0Var = new b0(this, this.resourcesProvider);
        this.Z = b0Var;
        return b0Var;
    }

    @Override
    public final CharSequence y() {
        if (this.Y) {
            return LocaleController.getString(R.string.BoostingGiftLink);
        }
        return LocaleController.getString(R.string.BoostingUsedGiftLink);
    }
}
