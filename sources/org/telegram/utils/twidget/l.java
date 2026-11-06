package org.telegram.utils.twidget;

import android.os.Process;
import android.text.TextUtils;
import bi.ra;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l implements Runnable {
    public final int f52842a;
    public final Object f52843b;

    public l(Object obj, int i7) {
        this.f52842a = i7;
        this.f52843b = obj;
    }

    @Override
    public final void run() {
        m mVar;
        switch (this.f52842a) {
            case 0:
                m mVar2 = (m) this.f52843b;
                mVar2.getClass();
                p.a(mVar2);
                return;
            case 1:
                final o oVar = (o) this.f52843b;
                int i7 = oVar.f52871a;
                Iterator it = p.f52876a.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        mVar = (m) it.next();
                        if (mVar.f52846b != i7 || mVar.f52854l != oVar.f52872b || mVar.f52853k || mVar.f52865x <= 0 || mVar.d <= 0) {
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
                tL_messages_getWidgetPublicData.peer = qp.s1(mVar.f52846b).j1(mVar.f52847c);
                tL_messages_getWidgetPublicData.msg_id = mVar.d;
                tL_messages_getWidgetPublicData.hash = oVar.f52873c;
                oVar.f52874e = ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_getWidgetPublicData, new d3.b(1), new v10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        int max;
                        String str;
                        TLRPC.messages_WidgetPublicData messages_widgetpublicdata = (TLRPC.messages_WidgetPublicData) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        o oVar2 = o.this;
                        oVar2.f52874e = 0;
                        HashMap hashMap = p.f52885l;
                        StringBuilder sb2 = new StringBuilder();
                        int i10 = oVar2.f52871a;
                        sb2.append(i10);
                        sb2.append("/");
                        long j3 = oVar2.f52872b;
                        sb2.append(j3);
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
                                long j10 = tL_messages_widgetPublicData.hash;
                                oVar2.f52873c = j10;
                                String str2 = tL_messages_widgetPublicData.data;
                                String A = p.A(str2);
                                for (m mVar3 : p.f52876a.values()) {
                                    if (mVar3.f52846b == i10 && mVar3.f52854l == j3 && !mVar3.f52853k && (!TextUtils.equals(mVar3.f52858p, A) || mVar3.f52859q != j10)) {
                                        mVar3.f52859q = j10;
                                        p.c(mVar3, mVar3.f52857o, A);
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = mVar3.f52860r;
                                        if (tL_messageMediaWidget != null) {
                                            tL_messageMediaWidget.public_data_hash = j10;
                                        }
                                        yr a02 = yr.a0(i10);
                                        long j11 = mVar3.f52847c;
                                        int i12 = mVar3.d;
                                        if (str2 == null) {
                                            str = "";
                                        } else {
                                            str = str2;
                                        }
                                        a02.f26688a.c(new ra(a02, i12, j11, str, j10, (String) null));
                                        str2 = str2;
                                    }
                                }
                            }
                        }
                        org.telegram.messenger.g0.i3(oVar2.f52875f, oVar2.d * 1000);
                    }
                });
                return;
            case 2:
                u uVar = (u) this.f52843b;
                h0 h0Var = uVar.f52895f;
                if (h0Var != null) {
                    h0Var.c(uVar.f52911x);
                    return;
                }
                return;
            default:
                Process.setThreadPriority(10);
                ((Runnable) this.f52843b).run();
                return;
        }
    }
}
