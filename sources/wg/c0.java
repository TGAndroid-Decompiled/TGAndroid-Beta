package wg;

import android.content.Intent;
import android.net.Uri;
import bi.i2;
import bi.m1;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.LaunchActivity;
public final class c0 extends sa {
    public final TLRPC.TL_payments_checkedGiftCode T1;
    public final boolean U1;
    public b0 V1;
    public final String W1;

    public c0(h2 h2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(h2Var, true);
        boolean z10;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.U1 = z10;
        this.T1 = tL_payments_checkedGiftCode;
        this.W1 = str;
        this.f30228v0 = false;
        this.f30230w0 = false;
        O();
        c1();
        b0 b0Var = this.V1;
        n2 n2Var = this.f30195c;
        b0Var.getClass();
        b0Var.d = tL_payments_checkedGiftCode.used_date == 0;
        b0Var.f60485e = h2Var;
        b0Var.f60486f = tL_payments_checkedGiftCode;
        b0Var.h = str;
        b0Var.f60487n = n2Var;
    }

    public static boolean e1(Intent intent, vf.b bVar) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    String lastPathSegment = data.getLastPathSegment();
                    if ((uri.startsWith("tg:giftcode") || uri.startsWith("tg://giftcode")) && lastPathSegment != null) {
                        f1(LaunchActivity.Q(), lastPathSegment, bVar);
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
                    f1(LaunchActivity.Q(), lastPathSegment2, bVar);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void f1(h2 h2Var, String str, vf.b bVar) {
        if (h2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (bVar != null) {
            bVar.d();
            bVar.f59374b = new c(atomicBoolean, 1);
        }
        i2 i2Var = new i2(atomicBoolean, h2Var, str, bVar);
        e eVar = new e(atomicBoolean, bVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(j10.f24773t0);
        mp u12 = mp.u1(j10.f24773t0);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new m1(u12, i2Var, eVar, 25));
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        b0 b0Var = new b0(this, this.J0);
        this.V1 = b0Var;
        return b0Var;
    }

    @Override
    public final CharSequence P0() {
        if (this.U1) {
            return gd.M0(2131753498, null);
        }
        return gd.M0(2131753171, null);
    }

    @Override
    public final void V0(au0 au0Var) {
        gc.a(this.f30195c, new bi.t(15));
    }
}
