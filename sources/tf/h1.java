package tf;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s41;
import org.telegram.ui.ii1;
import uf.s1;
import vh.a3;
import vh.f3;
import vh.i5;
import vh.q5;
import vh.r3;
import vh.s5;
import vh.u5;
import vh.v5;
import vh.x5;
public final class h1 implements Runnable {
    public final int f44743a;
    public final Object f44744b;
    public final Object f44745c;
    public final Object d;

    public h1(Object obj, Object obj2, Object obj3, int i10) {
        this.f44743a = i10;
        this.f44744b = obj;
        this.f44745c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f44743a) {
            case 0:
                k1 k1Var = (k1) this.f44744b;
                ArrayList arrayList = (ArrayList) this.f44745c;
                k1Var.f44782q = arrayList;
                k1Var.f44783r = (HashMap) this.d;
                k1Var.f44784s = true;
                k1Var.f44769a.T(arrayList);
                return;
            case 1:
                l1 l1Var = (l1) this.f44744b;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str = ((TLRPC.TL_messages_searchStickerSets) this.f44745c).f19296q;
                m1 m1Var = l1Var.f44788a;
                String str2 = m1Var.O;
                s41 s41Var = m1Var.e;
                if (str.equals(str2)) {
                    l1Var.a();
                    s41Var.f28628b.h.getProgressDrawable().e = false;
                    m1Var.K = 0;
                    s41Var.b(true);
                    m1Var.B.addAll(tL_messages_foundStickerSets.sets);
                    m1Var.l();
                    return;
                }
                return;
            case 2:
                uf.c cVar = (uf.c) this.f44744b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f44745c;
                TLObject tLObject = (TLObject) this.d;
                if (tL_error != null) {
                    cVar.f45257a.a(0.0f);
                    qc.b0(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    cVar.f45257a.a(0.0f);
                    y3.s(R.string.UnknownError, qc.a0(cVar), null);
                    return;
                } else {
                    cVar.finishFragment();
                    return;
                }
            case 3:
                uf.k kVar = (uf.k) this.f44744b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f44745c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error2 != null) {
                    kVar.e.a(0.0f);
                    qc.b0(tL_error2);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    kVar.e.a(0.0f);
                    y3.s(R.string.UnknownError, qc.a0(kVar), null);
                    return;
                } else {
                    if (kVar.B != null) {
                        kVar.getMessagesController().loadFullUser(kVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    kVar.finishFragment();
                    return;
                }
            case 4:
                uf.t tVar = (uf.t) this.f44744b;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList2 = tVar.f45441b;
                if (((TLObject) this.f44745c) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList2.contains(tL_businessChatLink)) {
                        arrayList2.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(tVar.f45440a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    tVar.f();
                    return;
                }
                FileLog.e(new RuntimeException("Unexpected response from server!"));
                return;
            case 5:
                uf.t tVar2 = (uf.t) this.f44744b;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f44745c;
                ConnectionsManager.getInstance(tVar2.f45440a).sendRequest(deletebusinesschatlink, new ii1(9, tVar2, (TL_account.TL_businessChatLink) this.d));
                return;
            case 6:
                uf.e0.P((uf.e0) this.f44744b, (TL_account.TL_connectedBot) this.f44745c, (TL_account.TL_businessBotRecipients) this.d);
                return;
            case 7:
                uf.m0 m0Var = (uf.m0) this.f44744b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f44745c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error3 != null) {
                    m0Var.f45380a.a(0.0f);
                    qc.b0(tL_error3);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    m0Var.f45380a.a(0.0f);
                    y3.s(R.string.UnknownError, qc.a0(m0Var), null);
                    return;
                } else {
                    m0Var.finishFragment();
                    return;
                }
            case 8:
                uf.x0.U((uf.x0) this.f44744b, (TLRPC.TL_error) this.f44745c, (TLObject) this.d);
                return;
            case 9:
                s1 s1Var = (s1) this.f44744b;
                TLObject tLObject4 = (TLObject) this.f44745c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList3 = s1Var.d;
                if (tLObject4 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList3.clear();
                    arrayList3.addAll(((TLRPC.TL_help_timezonesList) tLObject4).timezones);
                    SerializedData serializedData = new SerializedData(tLObject4.getObjectSize());
                    tLObject4.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(s1Var.f45436a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                s1Var.f45438c = true;
                s1Var.f45437b = false;
                return;
            case 10:
                r3 r3Var = (r3) this.f44744b;
                o70 o70Var = (o70) this.f44745c;
                i5 i5Var = (i5) this.d;
                if (r3Var.f46117g4 == o70Var) {
                    r3Var.f46117g4 = null;
                    if (r3Var.f46144z3 && r3Var.f46115f4 == i5Var && !i5Var.E.isEmpty()) {
                        r3Var.M2();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                r3 r3Var2 = (r3) this.f44744b;
                vh.a aVar = (vh.a) this.f44745c;
                vh.a aVar2 = (vh.a) this.d;
                ArrayList arrayList4 = r3Var2.f46129m4;
                f3 f3Var = r3Var2.f46124k3;
                if (f3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList4.indexOf(aVar);
                    int indexOf2 = arrayList4.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                            vh.a aVar3 = (vh.a) arrayList4.get(i10);
                            long j10 = aVar3.f45790t;
                            if (j10 != 0) {
                                f3Var.Y(i10, x5.l((TL_iv.RichText) r3Var2.f46122j3.get(Long.valueOf(j10))));
                            } else {
                                f3Var.Y(i10, v5.z(aVar3.f45775b));
                            }
                        }
                        f3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((r3) this.f44744b).Z4((String) this.d, (vh.a) this.f44745c);
                return;
            case 13:
                vh.a aVar4 = (vh.a) this.f44745c;
                u5 u5Var = (u5) this.d;
                s5 s5Var = ((q5) this.f44744b).f46096a.f46246y;
                if (s5Var != null) {
                    ((a3) s5Var).d(aVar4, u5Var.f46214a, u5Var.f46215b, u5Var.f46216c, u5Var.d, u5Var.e);
                    return;
                }
                return;
            case 14:
                wh.n nVar = (wh.n) this.f44744b;
                ArrayList arrayList5 = (ArrayList) this.f44745c;
                ArrayList arrayList6 = (ArrayList) this.d;
                nVar.getClass();
                for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                    ((View) arrayList5.get(i11)).setVisibility(0);
                }
                if (nVar.A.removeAll(arrayList6)) {
                    for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                        nVar.d((f2.l1) arrayList6.get(i12));
                    }
                    nVar.G();
                }
                nVar.K.removeAll(arrayList5);
                return;
            default:
                wh.n nVar2 = (wh.n) this.f44744b;
                View view = (View) this.f44745c;
                f2.l1 l1Var2 = (f2.l1) this.d;
                nVar2.getClass();
                view.setVisibility(0);
                if (nVar2.A.remove(l1Var2)) {
                    nVar2.d(l1Var2);
                    nVar2.G();
                }
                nVar2.K.remove(view);
                return;
        }
    }
}
