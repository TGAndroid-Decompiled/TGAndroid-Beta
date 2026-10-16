package ug;

import android.content.Intent;
import android.net.Uri;
import bi.e5;
import bi.u3;
import di.z8;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.LaunchActivity;
public final class c0 extends db {
    public final TLRPC.TL_payments_checkedGiftCode X;
    public final boolean Y;
    public b0 Z;
    public final String f46288a0;

    public c0(m2 m2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(m2Var, true);
        boolean z10;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y = z10;
        this.X = tL_payments_checkedGiftCode;
        this.f46288a0 = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        O();
        b0 b0Var = this.Z;
        c3 c3Var = this.container;
        b0Var.getClass();
        b0Var.d = tL_payments_checkedGiftCode.used_date == 0;
        b0Var.e = m2Var;
        b0Var.f46973f = tL_payments_checkedGiftCode;
        b0Var.h = str;
        b0Var.f46974n = c3Var;
    }

    public static c6 Q(c0 c0Var) {
        return c0Var.resourcesProvider;
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

    public static void U(m2 m2Var, String str, pf.c cVar) {
        if (m2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (cVar != null) {
            cVar.d();
            cVar.f42898b = new e(atomicBoolean, 1);
        }
        u3 u3Var = new u3(atomicBoolean, m2Var, str, cVar, 16);
        g gVar = new g(atomicBoolean, cVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new e5(messagesController, u3Var, gVar, 19));
    }

    @Override
    public final CharSequence B() {
        if (this.Y) {
            return LocaleController.getString(R.string.BoostingGiftLink);
        }
        return LocaleController.getString(R.string.BoostingUsedGiftLink);
    }

    @Override
    public final void H(ow0 ow0Var) {
        sc.a(this.container, new z8(14));
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        b0 b0Var = new b0(this, this.resourcesProvider);
        this.Z = b0Var;
        return b0Var;
    }
}
