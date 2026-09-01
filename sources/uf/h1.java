package uf;

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
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t41;
import org.telegram.ui.li1;
import vf.s1;
import wh.a3;
import wh.f3;
import wh.i5;
import wh.q5;
import wh.r3;
import wh.s5;
import wh.u5;
import wh.v5;
import wh.x5;
public final class h1 implements Runnable {
    public final int f48590a;
    public final Object f48591b;
    public final Object f48592c;
    public final Object d;

    public h1(Object obj, Object obj2, Object obj3, int i10) {
        this.f48590a = i10;
        this.f48591b = obj;
        this.f48592c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f48590a) {
            case 0:
                k1 k1Var = (k1) this.f48591b;
                ArrayList arrayList = (ArrayList) this.f48592c;
                k1Var.f48632q = arrayList;
                k1Var.f48633r = (HashMap) this.d;
                k1Var.f48634s = true;
                k1Var.f48618a.V(arrayList);
                return;
            case 1:
                l1 l1Var = (l1) this.f48591b;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str = ((TLRPC.TL_messages_searchStickerSets) this.f48592c).f20955q;
                m1 m1Var = l1Var.f48638a;
                String str2 = m1Var.O;
                t41 t41Var = m1Var.f48647e;
                if (str.equals(str2)) {
                    l1Var.a();
                    t41Var.f31260b.h.getProgressDrawable().f26982e = false;
                    m1Var.K = 0;
                    t41Var.b(true);
                    m1Var.B.addAll(tL_messages_foundStickerSets.sets);
                    m1Var.l();
                    return;
                }
                return;
            case 2:
                vf.c cVar = (vf.c) this.f48591b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f48592c;
                TLObject tLObject = (TLObject) this.d;
                if (tL_error != null) {
                    cVar.f48997a.a(0.0f);
                    qc.b0(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    cVar.f48997a.a(0.0f);
                    y3.s(R.string.UnknownError, qc.a0(cVar), null);
                    return;
                } else {
                    cVar.finishFragment();
                    return;
                }
            case 3:
                vf.k kVar = (vf.k) this.f48591b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f48592c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error2 != null) {
                    kVar.f49076e.a(0.0f);
                    qc.b0(tL_error2);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    kVar.f49076e.a(0.0f);
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
                vf.t tVar = (vf.t) this.f48591b;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList2 = tVar.f49203b;
                if (((TLObject) this.f48592c) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList2.contains(tL_businessChatLink)) {
                        arrayList2.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(tVar.f49202a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    tVar.f();
                    return;
                }
                FileLog.e(new RuntimeException("Unexpected response from server!"));
                return;
            case 5:
                vf.t tVar2 = (vf.t) this.f48591b;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f48592c;
                ConnectionsManager.getInstance(tVar2.f49202a).sendRequest(deletebusinesschatlink, new li1(9, tVar2, (TL_account.TL_businessChatLink) this.d));
                return;
            case 6:
                vf.f0.P((vf.f0) this.f48591b, (TL_account.TL_connectedBot) this.f48592c, (TL_account.TL_businessBotRecipients) this.d);
                return;
            case 7:
                vf.n0 n0Var = (vf.n0) this.f48591b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f48592c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error3 != null) {
                    n0Var.f49140a.a(0.0f);
                    qc.b0(tL_error3);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    n0Var.f49140a.a(0.0f);
                    y3.s(R.string.UnknownError, qc.a0(n0Var), null);
                    return;
                } else {
                    n0Var.finishFragment();
                    return;
                }
            case 8:
                vf.x0.U((vf.x0) this.f48591b, (TLRPC.TL_error) this.f48592c, (TLObject) this.d);
                return;
            case 9:
                s1 s1Var = (s1) this.f48591b;
                TLObject tLObject4 = (TLObject) this.f48592c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList3 = s1Var.d;
                if (tLObject4 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList3.clear();
                    arrayList3.addAll(((TLRPC.TL_help_timezonesList) tLObject4).timezones);
                    SerializedData serializedData = new SerializedData(tLObject4.getObjectSize());
                    tLObject4.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(s1Var.f49197a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                s1Var.f49199c = true;
                s1Var.f49198b = false;
                return;
            case 10:
                r3 r3Var = (r3) this.f48591b;
                q70 q70Var = (q70) this.f48592c;
                i5 i5Var = (i5) this.d;
                if (r3Var.f49985g4 == q70Var) {
                    r3Var.f49985g4 = null;
                    if (r3Var.f50012z3 && r3Var.f49983f4 == i5Var && !i5Var.E.isEmpty()) {
                        r3Var.M2();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                r3 r3Var2 = (r3) this.f48591b;
                wh.a aVar = (wh.a) this.f48592c;
                wh.a aVar2 = (wh.a) this.d;
                ArrayList arrayList4 = r3Var2.f49997m4;
                f3 f3Var = r3Var2.f49992k3;
                if (f3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList4.indexOf(aVar);
                    int indexOf2 = arrayList4.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                            wh.a aVar3 = (wh.a) arrayList4.get(i10);
                            long j10 = aVar3.f49633t;
                            if (j10 != 0) {
                                f3Var.Y(i10, x5.l((TL_iv.RichText) r3Var2.f49990j3.get(Long.valueOf(j10))));
                            } else {
                                f3Var.Y(i10, v5.z(aVar3.f49617b));
                            }
                        }
                        f3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((r3) this.f48591b).Z4((String) this.d, (wh.a) this.f48592c);
                return;
            case 13:
                wh.a aVar4 = (wh.a) this.f48592c;
                u5 u5Var = (u5) this.d;
                s5 s5Var = ((q5) this.f48591b).f49956a.f50120y;
                if (s5Var != null) {
                    ((a3) s5Var).d(aVar4, u5Var.f50085a, u5Var.f50086b, u5Var.f50087c, u5Var.d, u5Var.f50088e);
                    return;
                }
                return;
            case 14:
                xh.n nVar = (xh.n) this.f48591b;
                ArrayList arrayList5 = (ArrayList) this.f48592c;
                ArrayList arrayList6 = (ArrayList) this.d;
                nVar.getClass();
                for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                    ((View) arrayList5.get(i11)).setVisibility(0);
                }
                if (nVar.A.removeAll(arrayList6)) {
                    for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                        nVar.d((f2.m1) arrayList6.get(i12));
                    }
                    nVar.G();
                }
                nVar.K.removeAll(arrayList5);
                return;
            default:
                xh.n nVar2 = (xh.n) this.f48591b;
                View view = (View) this.f48592c;
                f2.m1 m1Var2 = (f2.m1) this.d;
                nVar2.getClass();
                view.setVisibility(0);
                if (nVar2.A.remove(m1Var2)) {
                    nVar2.d(m1Var2);
                    nVar2.G();
                }
                nVar2.K.remove(view);
                return;
        }
    }
}
