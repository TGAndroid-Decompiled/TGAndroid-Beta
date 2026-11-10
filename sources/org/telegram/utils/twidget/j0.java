package org.telegram.utils.twidget;

import android.content.Context;
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
    public final int f52871a;
    public final Object f52872b;

    public j0(Object obj, int i7) {
        this.f52871a = i7;
        this.f52872b = obj;
    }

    @Override
    public final void run() {
        k0 k0Var;
        switch (this.f52871a) {
            case 0:
                k0 k0Var2 = (k0) this.f52872b;
                k0Var2.getClass();
                n0.a(k0Var2);
                return;
            case 1:
                final m0 m0Var = (m0) this.f52872b;
                int i7 = m0Var.f52919a;
                Iterator it = n0.f52928a.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        k0Var = (k0) it.next();
                        if (k0Var.f52878b != i7 || k0Var.f52886l != m0Var.f52920b || k0Var.f52885k || k0Var.f52897x <= 0 || k0Var.d <= 0) {
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
                tL_messages_getWidgetPublicData.peer = qp.s1(k0Var.f52878b).j1(k0Var.f52879c);
                tL_messages_getWidgetPublicData.msg_id = k0Var.d;
                tL_messages_getWidgetPublicData.hash = m0Var.f52921c;
                m0Var.f52922e = ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_getWidgetPublicData, new d3.b(1), new v10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        int max;
                        String str;
                        TLRPC.messages_WidgetPublicData messages_widgetpublicdata = (TLRPC.messages_WidgetPublicData) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        m0 m0Var2 = m0.this;
                        m0Var2.f52922e = 0;
                        HashMap hashMap = n0.f52937l;
                        StringBuilder sb2 = new StringBuilder();
                        int i10 = m0Var2.f52919a;
                        sb2.append(i10);
                        sb2.append("/");
                        long j3 = m0Var2.f52920b;
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
                                m0Var2.f52921c = j10;
                                String str2 = tL_messages_widgetPublicData.data;
                                String C = n0.C(str2);
                                for (k0 k0Var3 : n0.f52928a.values()) {
                                    if (k0Var3.f52878b == i10 && k0Var3.f52886l == j3 && !k0Var3.f52885k && (!TextUtils.equals(k0Var3.f52890p, C) || k0Var3.f52891q != j10)) {
                                        k0Var3.f52891q = j10;
                                        n0.c(k0Var3, k0Var3.f52889o, C);
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = k0Var3.f52892r;
                                        if (tL_messageMediaWidget != null) {
                                            tL_messageMediaWidget.public_data_hash = j10;
                                        }
                                        yr a02 = yr.a0(i10);
                                        long j11 = k0Var3.f52879c;
                                        int i12 = k0Var3.d;
                                        if (str2 == null) {
                                            str = "";
                                        } else {
                                            str = str2;
                                        }
                                        a02.f26723a.c(new ra(a02, i12, j11, str, j10, (String) null));
                                        str2 = str2;
                                    }
                                }
                            }
                        }
                        org.telegram.messenger.g0.i3(m0Var2.f52923f, m0Var2.d * 1000);
                    }
                });
                return;
            case 2:
                q0 q0Var = (q0) this.f52872b;
                r0 r0Var = q0Var.h;
                synchronized (r0Var.f52969b) {
                    try {
                        if (q0Var.f52958c <= 0 && q0Var.d) {
                            q0Var.d = false;
                            q0Var.f52956a = null;
                            if (r0Var.d == q0Var) {
                                r0Var.d = null;
                            }
                            r0Var.f52973g.unbindService(q0Var);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 3:
                v0 v0Var = (v0) this.f52872b;
                i1 i1Var = v0Var.f52994f;
                if (i1Var != null) {
                    i1Var.e(v0Var.f53010x);
                    return;
                }
                return;
            case 4:
                Process.setThreadPriority(10);
                ((Runnable) this.f52872b).run();
                return;
            default:
                i1.c((Context) this.f52872b);
                return;
        }
    }
}
