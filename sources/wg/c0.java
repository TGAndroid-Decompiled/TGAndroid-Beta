package wg;

import android.content.Intent;
import android.net.Uri;
import bi.q1;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.LaunchActivity;
public final class c0 extends sa {
    public final TLRPC.TL_payments_checkedGiftCode T1;
    public final boolean U1;
    public b0 V1;
    public final String W1;

    public c0(g2 g2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(g2Var, true);
        boolean z10;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.U1 = z10;
        this.T1 = tL_payments_checkedGiftCode;
        this.W1 = str;
        this.f30212v0 = false;
        this.f30214w0 = false;
        O();
        c1();
        b0 b0Var = this.V1;
        m2 m2Var = this.f30179c;
        b0Var.getClass();
        b0Var.d = tL_payments_checkedGiftCode.used_date == 0;
        b0Var.f60531e = g2Var;
        b0Var.f60532f = tL_payments_checkedGiftCode;
        b0Var.h = str;
        b0Var.f60533n = m2Var;
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

    public static void f1(g2 g2Var, String str, vf.b bVar) {
        if (g2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (bVar != null) {
            bVar.d();
            bVar.f59417b = new c(atomicBoolean, 1);
        }
        bi.m2 m2Var = new bi.m2(atomicBoolean, g2Var, str, bVar);
        e eVar = new e(atomicBoolean, bVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(k10.f24968t0);
        np u12 = np.u1(k10.f24968t0);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new q1(u12, m2Var, eVar, 25));
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        b0 b0Var = new b0(this, this.J0);
        this.V1 = b0Var;
        return b0Var;
    }

    @Override
    public final CharSequence P0() {
        if (this.U1) {
            return hd.N0(2131753497, null);
        }
        return hd.N0(2131753170, null);
    }

    @Override
    public final void V0(du0 du0Var) {
        gc.a(this.f30179c, new bi.t(15));
    }
}
