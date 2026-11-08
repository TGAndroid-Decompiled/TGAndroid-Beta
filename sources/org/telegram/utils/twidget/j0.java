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
public final class j0 implements Runnable {
    public final int f52860a;
    public final Object f52861b;

    public j0(Object obj, int i7) {
        this.f52860a = i7;
        this.f52861b = obj;
    }

    @Override
    public final void run() {
        k0 k0Var;
        switch (this.f52860a) {
            case 0:
                k0 k0Var2 = (k0) this.f52861b;
                k0Var2.getClass();
                n0.a(k0Var2);
                return;
            case 1:
                final m0 m0Var = (m0) this.f52861b;
                int i7 = m0Var.f52906a;
                Iterator it = n0.f52916a.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        k0Var = (k0) it.next();
                        if (k0Var.f52868b != i7 || k0Var.f52876l != m0Var.f52907b || k0Var.f52875k || k0Var.f52887x <= 0 || k0Var.d <= 0) {
                        }
                    } else {
                        k0Var = null;
                    }
                }
                if (k0Var == null) {
                    n0.E();
                    return;
                }
                TLRPC.TL_messages_getWidgetPublicData tL_messages_getWidgetPublicData = new TLRPC.TL_messages_getWidgetPublicData();
                tL_messages_getWidgetPublicData.peer = qp.s1(k0Var.f52868b).j1(k0Var.f52869c);
                tL_messages_getWidgetPublicData.msg_id = k0Var.d;
                tL_messages_getWidgetPublicData.hash = m0Var.f52908c;
                m0Var.f52909e = ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_getWidgetPublicData, new d3.b(1), new v10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        int max;
                        String str;
                        TLRPC.messages_WidgetPublicData messages_widgetpublicdata = (TLRPC.messages_WidgetPublicData) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        m0 m0Var2 = m0.this;
                        m0Var2.f52909e = 0;
                        HashMap hashMap = n0.f52925l;
                        StringBuilder sb2 = new StringBuilder();
                        int i10 = m0Var2.f52906a;
                        sb2.append(i10);
                        sb2.append("/");
                        long j3 = m0Var2.f52907b;
                        sb2.append(j3);
                        if (hashMap.get(sb2.toString()) != m0Var2) {
                            return;
                        }
                        if (messages_widgetpublicdata != null) {
                            int i11 = messages_widgetpublicdata.period;
                            if (i11 <= 0) {
                                max = 30;
                            } else {
                                max = Math.max(5, Math.min(3600, i11));
                            }
                            m0Var2.d = max;
                            if (messages_widgetpublicdata instanceof TLRPC.TL_messages_widgetPublicData) {
                                TLRPC.TL_messages_widgetPublicData tL_messages_widgetPublicData = (TLRPC.TL_messages_widgetPublicData) messages_widgetpublicdata;
                                long j10 = tL_messages_widgetPublicData.hash;
                                m0Var2.f52908c = j10;
                                String str2 = tL_messages_widgetPublicData.data;
                                String C = n0.C(str2);
                                for (k0 k0Var3 : n0.f52916a.values()) {
                                    if (k0Var3.f52868b == i10 && k0Var3.f52876l == j3 && !k0Var3.f52875k && (!TextUtils.equals(k0Var3.f52880p, C) || k0Var3.f52881q != j10)) {
                                        k0Var3.f52881q = j10;
                                        n0.c(k0Var3, k0Var3.f52879o, C);
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = k0Var3.f52882r;
                                        if (tL_messageMediaWidget != null) {
                                            tL_messageMediaWidget.public_data_hash = j10;
                                        }
                                        yr a02 = yr.a0(i10);
                                        long j11 = k0Var3.f52869c;
                                        int i12 = k0Var3.d;
                                        if (str2 == null) {
                                            str = "";
                                        } else {
                                            str = str2;
                                        }
                                        a02.f26719a.c(new ra(a02, i12, j11, str, j10, (String) null));
                                        str2 = str2;
                                    }
                                }
                            }
                        }
                        org.telegram.messenger.g0.i3(m0Var2.f52910f, m0Var2.d * 1000);
                    }
                });
                return;
            case 2:
                q0 q0Var = (q0) this.f52861b;
                r0 r0Var = q0Var.f52946f;
                synchronized (r0Var.f52955b) {
                    try {
                        if (q0Var.f52944c <= 0 && q0Var.d) {
                            q0Var.d = false;
                            q0Var.f52942a = null;
                            if (r0Var.d == q0Var) {
                                r0Var.d = null;
                            }
                            r0Var.f52959g.unbindService(q0Var);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 3:
                v0 v0Var = (v0) this.f52861b;
                h1 h1Var = v0Var.f52980f;
                if (h1Var != null) {
                    h1Var.d(v0Var.f52996x);
                    return;
                }
                return;
            default:
                Process.setThreadPriority(10);
                ((Runnable) this.f52861b).run();
                return;
        }
    }
}
