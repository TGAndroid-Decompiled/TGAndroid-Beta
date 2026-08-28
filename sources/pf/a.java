package pf;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.x60;
import org.telegram.ui.o71;
import qh.c3;
import qh.f5;
import qh.n5;
import qh.o3;
import qh.p5;
import qh.r5;
import qh.s5;
import qh.u5;
import qh.x2;
public final class a implements Runnable {
    public final int f45555a;
    public final Object f45556b;
    public final Object f45557c;
    public final Object d;

    public a(Object obj, Object obj2, Object obj3, int i9) {
        this.f45555a = i9;
        this.d = obj;
        this.f45556b = obj2;
        this.f45557c = obj3;
    }

    @Override
    public final void run() {
        switch (this.f45555a) {
            case 0:
                d dVar = (d) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f45556b;
                TLObject tLObject = (TLObject) this.f45557c;
                if (tL_error != null) {
                    dVar.f45592a.a(0.0f);
                    oc.b0(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    dVar.f45592a.a(0.0f);
                    ll.p(R.string.UnknownError, oc.a0(dVar), null);
                    return;
                } else {
                    dVar.finishFragment();
                    return;
                }
            case 1:
                l lVar = (l) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f45556b;
                TLObject tLObject2 = (TLObject) this.f45557c;
                if (tL_error2 != null) {
                    lVar.f45667e.a(0.0f);
                    oc.b0(tL_error2);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    lVar.f45667e.a(0.0f);
                    ll.p(R.string.UnknownError, oc.a0(lVar), null);
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
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f45556b;
                ArrayList arrayList = uVar.f45790b;
                if (((TLObject) this.f45557c) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList.contains(tL_businessChatLink)) {
                        arrayList.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(uVar.f45789a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    uVar.f();
                    return;
                }
                FileLog.e(new RuntimeException("Unexpected response from server!"));
                return;
            case 3:
                u uVar2 = (u) this.d;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) this.f45556b;
                ConnectionsManager.getInstance(uVar2.f45789a).sendRequest(deletebusinesschatlink, new o71(8, uVar2, (TL_account.TL_businessChatLink) this.f45557c));
                return;
            case 4:
                g0.O((g0) this.d, (TL_account.TL_connectedBot) this.f45556b, (TL_account.TL_businessBotRecipients) this.f45557c);
                return;
            case 5:
                o0 o0Var = (o0) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f45556b;
                TLObject tLObject3 = (TLObject) this.f45557c;
                if (tL_error3 != null) {
                    o0Var.f45730a.a(0.0f);
                    oc.b0(tL_error3);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    o0Var.f45730a.a(0.0f);
                    ll.p(R.string.UnknownError, oc.a0(o0Var), null);
                    return;
                } else {
                    o0Var.finishFragment();
                    return;
                }
            case 6:
                y0.T((y0) this.d, (TLRPC.TL_error) this.f45556b, (TLObject) this.f45557c);
                return;
            case 7:
                u1 u1Var = (u1) this.d;
                TLObject tLObject4 = (TLObject) this.f45557c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f45556b;
                ArrayList arrayList2 = u1Var.d;
                if (tLObject4 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_help_timezonesList) tLObject4).timezones);
                    SerializedData serializedData = new SerializedData(tLObject4.getObjectSize());
                    tLObject4.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(u1Var.f45794a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                u1Var.f45796c = true;
                u1Var.f45795b = false;
                return;
            case 8:
                o3 o3Var = (o3) this.d;
                x60 x60Var = (x60) this.f45556b;
                f5 f5Var = (f5) this.f45557c;
                if (o3Var.f46570f4 == x60Var) {
                    o3Var.f46570f4 = null;
                    if (o3Var.f46597y3 && o3Var.f46568e4 == f5Var && !f5Var.D.isEmpty()) {
                        o3Var.M2();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                o3 o3Var2 = (o3) this.d;
                qh.a aVar = (qh.a) this.f45556b;
                qh.a aVar2 = (qh.a) this.f45557c;
                ArrayList arrayList3 = o3Var2.f46582l4;
                c3 c3Var = o3Var2.f46577j3;
                if (c3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList3.indexOf(aVar);
                    int indexOf2 = arrayList3.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                            qh.a aVar3 = (qh.a) arrayList3.get(i9);
                            long j10 = aVar3.f46285t;
                            if (j10 != 0) {
                                c3Var.Y(i9, u5.l((TL_iv.RichText) o3Var2.f46575i3.get(Long.valueOf(j10))));
                            } else {
                                c3Var.Y(i9, s5.z(aVar3.f46269b));
                            }
                        }
                        c3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((o3) this.d).Z4((String) this.f45557c, (qh.a) this.f45556b);
                return;
            case 11:
                qh.a aVar4 = (qh.a) this.f45556b;
                r5 r5Var = (r5) this.f45557c;
                p5 p5Var = ((n5) this.d).f46548a.f46710y;
                if (p5Var != null) {
                    ((x2) p5Var).d(aVar4, r5Var.f46664a, r5Var.f46665b, r5Var.f46666c, r5Var.d, r5Var.f46667e);
                    return;
                }
                return;
            case 12:
                rh.m mVar = (rh.m) this.d;
                ArrayList arrayList4 = (ArrayList) this.f45556b;
                ArrayList arrayList5 = (ArrayList) this.f45557c;
                mVar.getClass();
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    ((View) arrayList4.get(i10)).setVisibility(0);
                }
                if (mVar.A.removeAll(arrayList5)) {
                    for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                        mVar.d((f2.q1) arrayList5.get(i11));
                    }
                    mVar.G();
                }
                mVar.K.removeAll(arrayList4);
                return;
            default:
                rh.m mVar2 = (rh.m) this.d;
                View view = (View) this.f45556b;
                f2.q1 q1Var = (f2.q1) this.f45557c;
                mVar2.getClass();
                view.setVisibility(0);
                if (mVar2.A.remove(q1Var)) {
                    mVar2.d(q1Var);
                    mVar2.G();
                }
                mVar2.K.remove(view);
                return;
        }
    }

    public a(Object obj, TLObject tLObject, Object obj2, int i9) {
        this.f45555a = i9;
        this.d = obj;
        this.f45557c = tLObject;
        this.f45556b = obj2;
    }
}
