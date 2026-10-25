package vg;

import android.content.Intent;
import android.net.Uri;
import bi.h2;
import di.y2;
import fi.k8;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.LaunchActivity;
public final class c0 extends bb {
    public final TLRPC.TL_payments_checkedGiftCode X;
    public final boolean Y;
    public b0 Z;
    public final String f50150a0;

    public c0(r2 r2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(r2Var, true);
        boolean z10;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y = z10;
        this.X = tL_payments_checkedGiftCode;
        this.f50150a0 = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        N();
        b0 b0Var = this.Z;
        h3 h3Var = this.container;
        b0Var.getClass();
        b0Var.d = tL_payments_checkedGiftCode.used_date == 0;
        b0Var.e = r2Var;
        b0Var.f51179f = tL_payments_checkedGiftCode;
        b0Var.h = str;
        b0Var.f51180n = h3Var;
    }

    public static u6 P(c0 c0Var) {
        return c0Var.resourcesProvider;
    }

    public static boolean S(Intent intent, qf.c cVar) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    String lastPathSegment = data.getLastPathSegment();
                    if ((uri.startsWith("tg:giftcode") || uri.startsWith("tg://giftcode")) && lastPathSegment != null) {
                        T(LaunchActivity.R(), lastPathSegment, cVar);
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
                    T(LaunchActivity.R(), lastPathSegment2, cVar);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void T(r2 r2Var, String str, qf.c cVar) {
        if (r2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (cVar != null) {
            cVar.d();
            cVar.f47031b = new e(atomicBoolean, 1);
        }
        y2 y2Var = new y2(atomicBoolean, r2Var, str, cVar, 16);
        g gVar = new g(atomicBoolean, cVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new h2(messagesController, y2Var, gVar, 24));
    }

    @Override
    public final void G(vw0 vw0Var) {
        qc.a(this.container, new k8(13));
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
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
