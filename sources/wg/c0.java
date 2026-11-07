package wg;

import android.content.Intent;
import android.net.Uri;
import di.s2;
import fi.r7;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.LaunchActivity;
public final class c0 extends na {
    public final TLRPC.TL_payments_checkedGiftCode P1;
    public final boolean Q1;
    public b0 R1;
    public final String S1;

    public c0(f2 f2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(f2Var, true);
        boolean z9;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.Q1 = z9;
        this.P1 = tL_payments_checkedGiftCode;
        this.S1 = str;
        this.f28647u0 = false;
        this.f28648v0 = false;
        N();
        b1();
        b0 b0Var = this.R1;
        l2 l2Var = this.f28619c;
        b0Var.getClass();
        b0Var.d = tL_payments_checkedGiftCode.used_date == 0;
        b0Var.f58637e = f2Var;
        b0Var.f58638f = tL_payments_checkedGiftCode;
        b0Var.h = str;
        b0Var.f58639n = l2Var;
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

    public static void e1(f2 f2Var, String str, vf.b bVar) {
        if (f2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (bVar != null) {
            bVar.d();
            bVar.f57231b = new c(atomicBoolean, 1);
        }
        s2 s2Var = new s2(atomicBoolean, f2Var, str, bVar, 16);
        e eVar = new e(atomicBoolean, bVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(p10.f24467s0);
        qp s12 = qp.s1(p10.f24467s0);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new bi.f2(s12, s2Var, eVar, 22));
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        b0 b0Var = new b0(this, this.I0);
        this.R1 = b0Var;
        return b0Var;
    }

    @Override
    public final CharSequence O0() {
        if (this.Q1) {
            return hd.M0(2131753500, null);
        }
        return hd.M0(2131753173, null);
    }

    @Override
    public final void U0(rt0 rt0Var) {
        cc.a(this.f28619c, new r7(14));
    }
}
