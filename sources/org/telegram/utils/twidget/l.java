package org.telegram.utils.twidget;

import android.os.Process;
import android.text.TextUtils;
import ci.p9;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.qr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l implements Runnable {
    public final int f52907a;
    public final Object f52908b;

    public l(Object obj, int i3) {
        this.f52907a = i3;
        this.f52908b = obj;
    }

    @Override
    public final void run() {
        m mVar;
        switch (this.f52907a) {
            case 0:
                m mVar2 = (m) this.f52908b;
                mVar2.getClass();
                p.a(mVar2);
                return;
            case 1:
                final o oVar = (o) this.f52908b;
                int i3 = oVar.f52936a;
                Iterator it = p.f52941a.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        mVar = (m) it.next();
                        if (mVar.f52911b != i3 || mVar.f52919l != oVar.f52937b || mVar.f52918k || mVar.f52930x <= 0 || mVar.d <= 0) {
                        }
                    } else {
                        mVar = null;
                    }
                }
                if (mVar == null) {
                    p.C();
                    return;
                }
                TLRPC.TL_messages_getWidgetPublicData tL_messages_getWidgetPublicData = new TLRPC.TL_messages_getWidgetPublicData();
                tL_messages_getWidgetPublicData.peer = hp.s1(mVar.f52911b).j1(mVar.f52912c);
                tL_messages_getWidgetPublicData.msg_id = mVar.d;
                tL_messages_getWidgetPublicData.hash = oVar.f52938c;
                oVar.f52939e = ConnectionsManager.getInstance(i3).sendRequestTyped(tL_messages_getWidgetPublicData, new c3.b(1), new n10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        int max;
                        String str;
                        TLRPC.messages_WidgetPublicData messages_widgetpublicdata = (TLRPC.messages_WidgetPublicData) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        o oVar2 = o.this;
                        oVar2.f52939e = 0;
                        HashMap hashMap = p.f52950l;
                        StringBuilder sb2 = new StringBuilder();
                        int i10 = oVar2.f52936a;
                        sb2.append(i10);
                        sb2.append("/");
                        long j10 = oVar2.f52937b;
                        sb2.append(j10);
                        if (hashMap.get(sb2.toString()) != oVar2) {
                            return;
                        }
                        if (messages_widgetpublicdata != null) {
                            int i11 = messages_widgetpublicdata.period;
                            if (i11 <= 0) {
                                max = 30;
                            } else {
                                max = Math.max(5, Math.min(3600, i11));
                            }
                            oVar2.d = max;
                            if (messages_widgetpublicdata instanceof TLRPC.TL_messages_widgetPublicData) {
                                TLRPC.TL_messages_widgetPublicData tL_messages_widgetPublicData = (TLRPC.TL_messages_widgetPublicData) messages_widgetpublicdata;
                                long j11 = tL_messages_widgetPublicData.hash;
                                oVar2.f52938c = j11;
                                String str2 = tL_messages_widgetPublicData.data;
                                String A = p.A(str2);
                                for (m mVar3 : p.f52941a.values()) {
                                    if (mVar3.f52911b == i10 && mVar3.f52919l == j10 && !mVar3.f52918k && (!TextUtils.equals(mVar3.f52923p, A) || mVar3.f52924q != j11)) {
                                        mVar3.f52924q = j11;
                                        p.c(mVar3, mVar3.f52922o, A);
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = mVar3.f52925r;
                                        if (tL_messageMediaWidget != null) {
                                            tL_messageMediaWidget.public_data_hash = j11;
                                        }
                                        qr a02 = qr.a0(i10);
                                        long j12 = mVar3.f52912c;
                                        int i12 = mVar3.d;
                                        if (str2 == null) {
                                            str = "";
                                        } else {
                                            str = str2;
                                        }
                                        a02.f24934a.c(new p9(a02, i12, j12, str, j11, (String) null));
                                        str2 = str2;
                                    }
                                }
                            }
                        }
                        org.telegram.messenger.g0.i3(oVar2.f52940f, oVar2.d * 1000);
                    }
                });
                return;
            case 2:
                u uVar = (u) this.f52908b;
                h0 h0Var = uVar.f52960f;
                if (h0Var != null) {
                    h0Var.c(uVar.f52976x);
                    return;
                }
                return;
            default:
                Process.setThreadPriority(10);
                ((Runnable) this.f52908b).run();
                return;
        }
    }
}
