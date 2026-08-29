package sf;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.tc;
import org.telegram.ui.qe1;
import th.d3;
import th.g5;
import th.o5;
import th.p3;
import th.q5;
import th.s5;
import th.t5;
import th.v5;
import th.y2;
public final class a implements Runnable {
    public final int f47732a;
    public final Object f47733b;
    public final Object f47734c;
    public final Object d;

    public a(Object obj, Object obj2, Object obj3, int i10) {
        this.f47732a = i10;
        this.d = obj;
        this.f47733b = obj2;
        this.f47734c = obj3;
    }

    @Override
    public final void run() {
        switch (this.f47732a) {
            case 0:
                d dVar = (d) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f47733b;
                TLObject tLObject = (TLObject) this.f47734c;
                if (tL_error != null) {
                    dVar.f47763a.a(0.0f);
                    tc.b0(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    dVar.f47763a.a(0.0f);
                    x3.s(R.string.UnknownError, tc.a0(dVar), null);
                    return;
                } else {
                    dVar.finishFragment();
                    return;
                }
            case 1:
                l lVar = (l) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f47733b;
                TLObject tLObject2 = (TLObject) this.f47734c;
                if (tL_error2 != null) {
                    lVar.f47841e.a(0.0f);
                    tc.b0(tL_error2);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    lVar.f47841e.a(0.0f);
                    x3.s(R.string.UnknownError, tc.a0(lVar), null);
                    return;
                } else {
                    if (lVar.A != null) {
                        lVar.getMessagesController().loadFullUser(lVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    lVar.finishFragment();
                    return;
                }
            case 2:
                u uVar = (u) this.d;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f47733b;
                ArrayList arrayList = uVar.f47959b;
                if (((TLObject) this.f47734c) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList.contains(tL_businessChatLink)) {
                        arrayList.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(uVar.f47958a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    uVar.f();
                    return;
                }
                FileLog.e(new RuntimeException("Unexpected response from server!"));
                return;
            case 3:
                u uVar2 = (u) this.d;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f47733b;
                ConnectionsManager.getInstance(uVar2.f47958a).sendRequest(deletebusinesschatlink, new qe1(9, uVar2, (TL_account.TL_businessChatLink) this.f47734c));
                return;
            case 4:
                f0.P((f0) this.d, (TL_account.TL_connectedBot) this.f47733b, (TL_account.TL_businessBotRecipients) this.f47734c);
                return;
            case 5:
                n0 n0Var = (n0) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f47733b;
                TLObject tLObject3 = (TLObject) this.f47734c;
                if (tL_error3 != null) {
                    n0Var.f47893a.a(0.0f);
                    tc.b0(tL_error3);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    n0Var.f47893a.a(0.0f);
                    x3.s(R.string.UnknownError, tc.a0(n0Var), null);
                    return;
                } else {
                    n0Var.finishFragment();
                    return;
                }
            case 6:
                x0.U((x0) this.d, (TLRPC.TL_error) this.f47733b, (TLObject) this.f47734c);
                return;
            case 7:
                v1 v1Var = (v1) this.d;
                TLObject tLObject4 = (TLObject) this.f47734c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f47733b;
                ArrayList arrayList2 = v1Var.d;
                if (tLObject4 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_help_timezonesList) tLObject4).timezones);
                    SerializedData serializedData = new SerializedData(tLObject4.getObjectSize());
                    tLObject4.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(v1Var.f47982a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                v1Var.f47984c = true;
                v1Var.f47983b = false;
                return;
            case 8:
                p3 p3Var = (p3) this.d;
                j70 j70Var = (j70) this.f47733b;
                g5 g5Var = (g5) this.f47734c;
                if (p3Var.f48643f4 == j70Var) {
                    p3Var.f48643f4 = null;
                    if (p3Var.f48670y3 && p3Var.f48641e4 == g5Var && !g5Var.D.isEmpty()) {
                        p3Var.M2();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                p3 p3Var2 = (p3) this.d;
                th.a aVar = (th.a) this.f47733b;
                th.a aVar2 = (th.a) this.f47734c;
                ArrayList arrayList3 = p3Var2.f48655l4;
                d3 d3Var = p3Var2.f48650j3;
                if (d3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList3.indexOf(aVar);
                    int indexOf2 = arrayList3.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                            th.a aVar3 = (th.a) arrayList3.get(i10);
                            long j10 = aVar3.f48344t;
                            if (j10 != 0) {
                                d3Var.Y(i10, v5.l((TL_iv.RichText) p3Var2.f48648i3.get(Long.valueOf(j10))));
                            } else {
                                d3Var.Y(i10, t5.z(aVar3.f48328b));
                            }
                        }
                        d3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((p3) this.d).Z4((String) this.f47734c, (th.a) this.f47733b);
                return;
            case 11:
                th.a aVar4 = (th.a) this.f47733b;
                s5 s5Var = (s5) this.f47734c;
                q5 q5Var = ((o5) this.d).f48621a.f48786y;
                if (q5Var != null) {
                    ((y2) q5Var).d(aVar4, s5Var.f48747a, s5Var.f48748b, s5Var.f48749c, s5Var.d, s5Var.f48750e);
                    return;
                }
                return;
            case 12:
                uh.m mVar = (uh.m) this.d;
                ArrayList arrayList4 = (ArrayList) this.f47733b;
                ArrayList arrayList5 = (ArrayList) this.f47734c;
                mVar.getClass();
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    ((View) arrayList4.get(i11)).setVisibility(0);
                }
                if (mVar.A.removeAll(arrayList5)) {
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        mVar.d((f2.n1) arrayList5.get(i12));
                    }
                    mVar.G();
                }
                mVar.K.removeAll(arrayList4);
                return;
            default:
                uh.m mVar2 = (uh.m) this.d;
                View view = (View) this.f47733b;
                f2.n1 n1Var = (f2.n1) this.f47734c;
                mVar2.getClass();
                view.setVisibility(0);
                if (mVar2.A.remove(n1Var)) {
                    mVar2.d(n1Var);
                    mVar2.G();
                }
                mVar2.K.remove(view);
                return;
        }
    }

    public a(Object obj, TLObject tLObject, Object obj2, int i10) {
        this.f47732a = i10;
        this.d = obj;
        this.f47734c = tLObject;
        this.f47733b = obj2;
    }
}
