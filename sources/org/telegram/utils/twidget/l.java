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
    public final int f52840a;
    public final Object f52841b;

    public l(Object obj, int i7) {
        this.f52840a = i7;
        this.f52841b = obj;
    }

    @Override
    public final void run() {
        m mVar;
        switch (this.f52840a) {
            case 0:
                m mVar2 = (m) this.f52841b;
                mVar2.getClass();
                p.a(mVar2);
                return;
            case 1:
                final o oVar = (o) this.f52841b;
                int i7 = oVar.f52869a;
                Iterator it = p.f52874a.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        mVar = (m) it.next();
                        if (mVar.f52844b != i7 || mVar.f52852l != oVar.f52870b || mVar.f52851k || mVar.f52863x <= 0 || mVar.d <= 0) {
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
                tL_messages_getWidgetPublicData.peer = qp.s1(mVar.f52844b).j1(mVar.f52845c);
                tL_messages_getWidgetPublicData.msg_id = mVar.d;
                tL_messages_getWidgetPublicData.hash = oVar.f52871c;
                oVar.f52872e = ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_getWidgetPublicData, new d3.b(1), new v10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        int max;
                        String str;
                        TLRPC.messages_WidgetPublicData messages_widgetpublicdata = (TLRPC.messages_WidgetPublicData) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        o oVar2 = o.this;
                        oVar2.f52872e = 0;
                        HashMap hashMap = p.f52883l;
                        StringBuilder sb2 = new StringBuilder();
                        int i10 = oVar2.f52869a;
                        sb2.append(i10);
                        sb2.append("/");
                        long j3 = oVar2.f52870b;
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
                                oVar2.f52871c = j10;
                                String str2 = tL_messages_widgetPublicData.data;
                                String A = p.A(str2);
                                for (m mVar3 : p.f52874a.values()) {
                                    if (mVar3.f52844b == i10 && mVar3.f52852l == j3 && !mVar3.f52851k && (!TextUtils.equals(mVar3.f52856p, A) || mVar3.f52857q != j10)) {
                                        mVar3.f52857q = j10;
                                        p.c(mVar3, mVar3.f52855o, A);
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = mVar3.f52858r;
                                        if (tL_messageMediaWidget != null) {
                                            tL_messageMediaWidget.public_data_hash = j10;
                                        }
                                        yr a02 = yr.a0(i10);
                                        long j11 = mVar3.f52845c;
                                        int i12 = mVar3.d;
                                        if (str2 == null) {
                                            str = "";
                                        } else {
                                            str = str2;
                                        }
                                        a02.f26696a.c(new ra(a02, i12, j11, str, j10, (String) null));
                                        str2 = str2;
                                    }
                                }
                            }
                        }
                        org.telegram.messenger.g0.i3(oVar2.f52873f, oVar2.d * 1000);
                    }
                });
                return;
            case 2:
                u uVar = (u) this.f52841b;
                h0 h0Var = uVar.f52893f;
                if (h0Var != null) {
                    h0Var.d(uVar.f52909x);
                    return;
                }
                return;
            default:
                Process.setThreadPriority(10);
                ((Runnable) this.f52841b).run();
                return;
        }
    }
}
