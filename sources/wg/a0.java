package wg;

import android.content.Intent;
import android.net.Uri;
import bi.j6;
import bi.o1;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
public final class a0 extends ja {
    public final TLRPC.TL_payments_checkedGiftCode T1;
    public final boolean U1;
    public z V1;
    public final String W1;

    public a0(e2 e2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(e2Var, true);
        boolean z10;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.U1 = z10;
        this.T1 = tL_payments_checkedGiftCode;
        this.W1 = str;
        this.f29718v0 = false;
        this.f29720w0 = false;
        O();
        b1();
        z zVar = this.V1;
        k2 k2Var = this.f29685c;
        zVar.getClass();
        zVar.d = tL_payments_checkedGiftCode.used_date == 0;
        zVar.f59918e = e2Var;
        zVar.f59919f = tL_payments_checkedGiftCode;
        zVar.h = str;
        zVar.f59920n = k2Var;
    }

    public static boolean d1(Intent intent, vf.b bVar) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    String lastPathSegment = data.getLastPathSegment();
                    if ((uri.startsWith("tg:giftcode") || uri.startsWith("tg://giftcode")) && lastPathSegment != null) {
                        e1(LaunchActivity.Q(), lastPathSegment, bVar);
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
                    e1(LaunchActivity.Q(), lastPathSegment2, bVar);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void e1(e2 e2Var, String str, vf.b bVar) {
        if (e2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (bVar != null) {
            bVar.d();
            bVar.f58805b = new c(atomicBoolean, 1);
        }
        o1 o1Var = new o1(atomicBoolean, e2Var, str, bVar);
        e eVar = new e(atomicBoolean, bVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(m10.f24940t0);
        np s12 = np.s1(m10.f24940t0);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new j6(s12, o1Var, eVar, 23));
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        z zVar = new z(this, this.J0);
        this.V1 = zVar;
        return zVar;
    }

    @Override
    public final CharSequence O0() {
        if (this.U1) {
            return hd.M0(2131753500, null);
        }
        return hd.M0(2131753173, null);
    }

    @Override
    public final void U0(st0 st0Var) {
        xb.a(this.f29685c, new bi.t(15));
    }
}
