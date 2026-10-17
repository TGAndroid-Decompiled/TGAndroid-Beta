package ug;

import ai.p2;
import android.content.Intent;
import android.net.Uri;
import ci.z2;
import ei.o8;
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
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
public final class a0 extends bb {
    public final TLRPC.TL_payments_checkedGiftCode X;
    public final boolean Y;
    public z Z;
    public final String f47665a0;

    public a0(n2 n2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(n2Var, true);
        boolean z10;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y = z10;
        this.X = tL_payments_checkedGiftCode;
        this.f47665a0 = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        O();
        z zVar = this.Z;
        d3 d3Var = this.container;
        zVar.getClass();
        zVar.d = tL_payments_checkedGiftCode.used_date == 0;
        zVar.e = n2Var;
        zVar.f48380f = tL_payments_checkedGiftCode;
        zVar.h = str;
        zVar.f48381n = d3Var;
    }

    public static boolean T(Intent intent, pf.c cVar) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    String lastPathSegment = data.getLastPathSegment();
                    if ((uri.startsWith("tg:giftcode") || uri.startsWith("tg://giftcode")) && lastPathSegment != null) {
                        U(LaunchActivity.R(), lastPathSegment, cVar);
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
                    U(LaunchActivity.R(), lastPathSegment2, cVar);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void U(n2 n2Var, String str, pf.c cVar) {
        if (n2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (cVar != null) {
            cVar.d();
            cVar.f44308b = new c(atomicBoolean, 1);
        }
        z2 z2Var = new z2(atomicBoolean, n2Var, str, cVar, 16);
        e eVar = new e(atomicBoolean, cVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new p2(messagesController, z2Var, eVar, 24));
    }

    @Override
    public final CharSequence A() {
        if (this.Y) {
            return LocaleController.getString(R.string.BoostingGiftLink);
        }
        return LocaleController.getString(R.string.BoostingUsedGiftLink);
    }

    @Override
    public final void H(jw0 jw0Var) {
        qc.a(this.container, new o8(14));
    }

    @Override
    public final hm0 x(im0 im0Var) {
        z zVar = new z(this, this.resourcesProvider);
        this.Z = zVar;
        return zVar;
    }
}
