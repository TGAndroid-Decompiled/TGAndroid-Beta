package tg;

import ai.f4;
import ai.t5;
import android.content.Intent;
import android.net.Uri;
import ci.a9;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.LaunchActivity;
public final class b0 extends db {
    public final TLRPC.TL_payments_checkedGiftCode X;
    public final boolean Y;
    public a0 Z;
    public final String f48397a0;

    public b0(m2 m2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(m2Var, true);
        boolean z10;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y = z10;
        this.X = tL_payments_checkedGiftCode;
        this.f48397a0 = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        O();
        a0 a0Var = this.Z;
        c3 c3Var = this.container;
        a0Var.getClass();
        a0Var.d = tL_payments_checkedGiftCode.used_date == 0;
        a0Var.f49044e = m2Var;
        a0Var.f49045f = tL_payments_checkedGiftCode;
        a0Var.h = str;
        a0Var.f49046n = c3Var;
    }

    public static d6 Q(b0 b0Var) {
        return b0Var.resourcesProvider;
    }

    public static boolean T(Intent intent, of.e eVar) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    String lastPathSegment = data.getLastPathSegment();
                    if ((uri.startsWith("tg:giftcode") || uri.startsWith("tg://giftcode")) && lastPathSegment != null) {
                        U(LaunchActivity.R(), lastPathSegment, eVar);
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
                    U(LaunchActivity.R(), lastPathSegment2, eVar);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void U(m2 m2Var, String str, of.e eVar) {
        if (m2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (eVar != null) {
            eVar.d();
            eVar.f17204b = new d(atomicBoolean, 1);
        }
        f4 f4Var = new f4(atomicBoolean, m2Var, str, eVar, 16);
        f fVar = new f(atomicBoolean, eVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new t5(messagesController, f4Var, fVar, 19));
    }

    @Override
    public final CharSequence B() {
        if (this.Y) {
            return LocaleController.getString(R.string.BoostingGiftLink);
        }
        return LocaleController.getString(R.string.BoostingUsedGiftLink);
    }

    @Override
    public final void H(tw0 tw0Var) {
        sc.a(this.container, new a9(14));
    }

    @Override
    public final qm0 x(rm0 rm0Var) {
        a0 a0Var = new a0(this, this.resourcesProvider);
        this.Z = a0Var;
        return a0Var;
    }
}
