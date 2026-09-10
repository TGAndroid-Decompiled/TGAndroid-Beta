package sg;

import android.content.Intent;
import android.net.Uri;
import bi.fa;
import bi.wa;
import gg.u1;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.LaunchActivity;
public final class c0 extends ab {
    public final TLRPC.TL_payments_checkedGiftCode X;
    public final boolean Y;
    public b0 Z;
    public final String f41878a0;

    public c0(p2 p2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(p2Var, true);
        boolean z10;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y = z10;
        this.X = tL_payments_checkedGiftCode;
        this.f41878a0 = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        N();
        b0 b0Var = this.Z;
        f3 f3Var = this.container;
        b0Var.getClass();
        b0Var.d = tL_payments_checkedGiftCode.used_date == 0;
        b0Var.e = p2Var;
        b0Var.f42156f = tL_payments_checkedGiftCode;
        b0Var.h = str;
        b0Var.f42157n = f3Var;
    }

    public static boolean S(Intent intent, nf.e eVar) {
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

    public static void T(p2 p2Var, String str, nf.e eVar) {
        if (p2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (eVar != null) {
            eVar.d();
            eVar.f14040b = new d(atomicBoolean, 1);
        }
        u1 u1Var = new u1(atomicBoolean, p2Var, str, eVar, 13);
        f fVar = new f(atomicBoolean, eVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new wa(messagesController, u1Var, fVar, 18));
    }

    @Override
    public final void F(aw0 aw0Var) {
        pc.a(this.container, new fa(14));
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
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
