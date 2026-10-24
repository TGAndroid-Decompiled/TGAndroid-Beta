package ug;

import ai.j2;
import android.content.Intent;
import android.net.Uri;
import ci.y2;
import ei.o8;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
public final class a0 extends za {
    public final TLRPC.TL_payments_checkedGiftCode X;
    public final boolean Y;
    public z Z;
    public final String f48090a0;

    public a0(o2 o2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(o2Var, true);
        boolean z10;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y = z10;
        this.X = tL_payments_checkedGiftCode;
        this.f48090a0 = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        N();
        z zVar = this.Z;
        e3 e3Var = this.container;
        zVar.getClass();
        zVar.d = tL_payments_checkedGiftCode.used_date == 0;
        zVar.e = o2Var;
        zVar.f48806f = tL_payments_checkedGiftCode;
        zVar.h = str;
        zVar.f48807n = e3Var;
    }

    public static boolean S(Intent intent, pf.c cVar) {
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

    public static void T(o2 o2Var, String str, pf.c cVar) {
        if (o2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (cVar != null) {
            cVar.d();
            cVar.f44706b = new c(atomicBoolean, 1);
        }
        y2 y2Var = new y2(atomicBoolean, o2Var, str, cVar, 16);
        e eVar = new e(atomicBoolean, cVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new j2(messagesController, y2Var, eVar, 24));
    }

    @Override
    public final void F(nw0 nw0Var) {
        oc.a(this.container, new o8(14));
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        z zVar = new z(this, this.resourcesProvider);
        this.Z = zVar;
        return zVar;
    }

    @Override
    public final CharSequence z() {
        if (this.Y) {
            return LocaleController.getString(R.string.BoostingGiftLink);
        }
        return LocaleController.getString(R.string.BoostingUsedGiftLink);
    }
}
