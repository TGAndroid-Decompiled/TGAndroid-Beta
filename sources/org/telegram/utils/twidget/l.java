package org.telegram.utils.twidget;

import android.os.Process;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.hs;
import org.telegram.messenger.j20;
import org.telegram.messenger.mn;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l implements Runnable {
    public final int f44390a;
    public final Object f44391b;

    public l(Object obj, int i10) {
        this.f44390a = i10;
        this.f44391b = obj;
    }

    @Override
    public final void run() {
        m mVar;
        switch (this.f44390a) {
            case 0:
                m mVar2 = (m) this.f44391b;
                mVar2.getClass();
                p.a(mVar2);
                return;
            case 1:
                final o oVar = (o) this.f44391b;
                int i10 = oVar.f44421a;
                Iterator it = p.f44430a.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        mVar = (m) it.next();
                        if (mVar.f44396b != i10 || mVar.f44403l != oVar.f44422b || mVar.f44402k || mVar.f44415y <= 0 || mVar.d <= 0) {
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
                tL_messages_getWidgetPublicData.peer = vp.r1(mVar.f44396b).i1(mVar.f44397c);
                tL_messages_getWidgetPublicData.msg_id = mVar.d;
                tL_messages_getWidgetPublicData.hash = oVar.f44423c;
                oVar.e = ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_getWidgetPublicData, new a3.b(1), new j20() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        int max;
                        String str;
                        TLRPC.messages_WidgetPublicData messages_widgetpublicdata = (TLRPC.messages_WidgetPublicData) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        o oVar2 = o.this;
                        oVar2.e = 0;
                        HashMap hashMap = p.f44438l;
                        StringBuilder sb2 = new StringBuilder();
                        int i11 = oVar2.f44421a;
                        sb2.append(i11);
                        sb2.append("/");
                        long j10 = oVar2.f44422b;
                        sb2.append(j10);
                        if (hashMap.get(sb2.toString()) != oVar2) {
                            return;
                        }
                        if (messages_widgetpublicdata != null) {
                            int i12 = messages_widgetpublicdata.period;
                            if (i12 <= 0) {
                                max = 30;
                            } else {
                                max = Math.max(5, Math.min(3600, i12));
                            }
                            oVar2.d = max;
                            if (messages_widgetpublicdata instanceof TLRPC.TL_messages_widgetPublicData) {
                                TLRPC.TL_messages_widgetPublicData tL_messages_widgetPublicData = (TLRPC.TL_messages_widgetPublicData) messages_widgetpublicdata;
                                long j11 = tL_messages_widgetPublicData.hash;
                                oVar2.f44423c = j11;
                                String str2 = tL_messages_widgetPublicData.data;
                                String A = p.A(str2);
                                for (m mVar3 : p.f44430a.values()) {
                                    if (mVar3.f44396b == i11 && mVar3.f44403l == j10 && !mVar3.f44402k && (!TextUtils.equals(mVar3.f44408q, A) || mVar3.f44409r != j11)) {
                                        mVar3.f44409r = j11;
                                        p.c(mVar3, mVar3.f44407p, A);
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = mVar3.f44410s;
                                        if (tL_messageMediaWidget != null) {
                                            tL_messageMediaWidget.public_data_hash = j11;
                                        }
                                        hs a02 = hs.a0(i11);
                                        long j12 = mVar3.f44397c;
                                        int i13 = mVar3.d;
                                        if (str2 == null) {
                                            str = "";
                                        } else {
                                            str = str2;
                                        }
                                        a02.f15938a.c(new mn(a02, i13, j12, str, j11, (String) null));
                                        str2 = str2;
                                    }
                                }
                            }
                        }
                        org.telegram.messenger.i0.h3(oVar2.f44424f, oVar2.d * 1000);
                    }
                });
                return;
            case 2:
                w wVar = (w) this.f44391b;
                k0 k0Var = wVar.f44454f;
                if (k0Var != null) {
                    k0Var.c(wVar.f44470x);
                    return;
                }
                return;
            default:
                Process.setThreadPriority(10);
                ((Runnable) this.f44391b).run();
                return;
        }
    }
}
