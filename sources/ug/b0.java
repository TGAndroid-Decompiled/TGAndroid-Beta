package ug;

import ai.j2;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
public final class b0 extends bb {
    public final TLRPC.TL_payments_checkedGiftCode X;
    public final boolean Y;
    public a0 Z;
    public final String f47657a0;

    public b0(n2 n2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(n2Var, true);
        boolean z10;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y = z10;
        this.X = tL_payments_checkedGiftCode;
        this.f47657a0 = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        O();
        a0 a0Var = this.Z;
        d3 d3Var = this.container;
        a0Var.getClass();
        a0Var.d = tL_payments_checkedGiftCode.used_date == 0;
        a0Var.e = n2Var;
        a0Var.f48369f = tL_payments_checkedGiftCode;
        a0Var.h = str;
        a0Var.f48370n = d3Var;
    }

    public static d6 Q(b0 b0Var) {
        return b0Var.resourcesProvider;
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
            cVar.f44294b = new d(atomicBoolean, 1);
        }
        z2 z2Var = new z2(atomicBoolean, n2Var, str, cVar, 16);
        f fVar = new f(atomicBoolean, cVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new j2(messagesController, z2Var, fVar, 24));
    }

    @Override
    public final CharSequence A() {
        if (this.Y) {
            return LocaleController.getString(R.string.BoostingGiftLink);
        }
        return LocaleController.getString(R.string.BoostingUsedGiftLink);
    }

    @Override
    public final void G(lw0 lw0Var) {
        qc.a(this.container, new o8(14));
    }

    @Override
    public final im0 x(jm0 jm0Var) {
        a0 a0Var = new a0(this, this.resourcesProvider);
        this.Z = a0Var;
        return a0Var;
    }
}
