package org.telegram.utils.twidget;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import di.f9;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j0 implements Runnable {
    public final int f54257a;
    public final Object f54258b;

    public j0(Object obj, int i7) {
        this.f54257a = i7;
        this.f54258b = obj;
    }

    @Override
    public final void run() {
        k0 k0Var;
        switch (this.f54257a) {
            case 0:
                k0 k0Var2 = (k0) this.f54258b;
                k0Var2.getClass();
                n0.a(k0Var2);
                return;
            case 1:
                final m0 m0Var = (m0) this.f54258b;
                int i7 = m0Var.f54327a;
                Iterator it = n0.f54338a.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        k0Var = (k0) it.next();
                        if (k0Var.f54267b != i7 || k0Var.f54275l != m0Var.f54328b || k0Var.f54274k || k0Var.f54286x <= 0 || k0Var.d <= 0) {
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
                tL_messages_getWidgetPublicData.peer = np.s1(k0Var.f54267b).j1(k0Var.f54268c);
                tL_messages_getWidgetPublicData.msg_id = k0Var.d;
                tL_messages_getWidgetPublicData.hash = m0Var.f54329c;
                m0Var.f54330e = ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_getWidgetPublicData, new d3.b(1), new s10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        int max;
                        String str;
                        TLRPC.messages_WidgetPublicData messages_widgetpublicdata = (TLRPC.messages_WidgetPublicData) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        m0 m0Var2 = m0.this;
                        m0Var2.f54330e = 0;
                        HashMap hashMap = n0.f54347l;
                        StringBuilder sb2 = new StringBuilder();
                        int i10 = m0Var2.f54327a;
                        sb2.append(i10);
                        sb2.append("/");
                        long j3 = m0Var2.f54328b;
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
                                m0Var2.f54329c = j10;
                                String str2 = tL_messages_widgetPublicData.data;
                                String C = n0.C(str2);
                                for (k0 k0Var3 : n0.f54338a.values()) {
                                    if (k0Var3.f54267b == i10 && k0Var3.f54275l == j3 && !k0Var3.f54274k && (!TextUtils.equals(k0Var3.f54279p, C) || k0Var3.f54280q != j10)) {
                                        k0Var3.f54280q = j10;
                                        n0.c(k0Var3, k0Var3.f54278o, C);
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = k0Var3.f54281r;
                                        if (tL_messageMediaWidget != null) {
                                            tL_messageMediaWidget.public_data_hash = j10;
                                        }
                                        vr a02 = vr.a0(i10);
                                        long j11 = k0Var3.f54268c;
                                        int i12 = k0Var3.d;
                                        if (str2 == null) {
                                            str = "";
                                        } else {
                                            str = str2;
                                        }
                                        a02.f27219a.c(new f9(a02, i12, j11, str, j10, (String) null));
                                        str2 = str2;
                                    }
                                }
                            }
                        }
                        org.telegram.messenger.g0.i3(m0Var2.f54331f, m0Var2.d * 1000);
                    }
                });
                return;
            case 2:
                t0 t0Var = (t0) this.f54258b;
                u0 u0Var = t0Var.h;
                synchronized (u0Var.f54412b) {
                    try {
                        if (t0Var.f54402c <= 0 && t0Var.d) {
                            t0Var.d = false;
                            t0Var.f54400a = null;
                            if (u0Var.d == t0Var) {
                                u0Var.d = null;
                            }
                            u0Var.f54416g.unbindService(t0Var);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 3:
                y0 y0Var = (y0) this.f54258b;
                l1 l1Var = y0Var.f54427f;
                if (l1Var != null) {
                    l1Var.e(y0Var.f54443x);
                    return;
                }
                return;
            case 4:
                Process.setThreadPriority(10);
                ((Runnable) this.f54258b).run();
                return;
            default:
                l1.c((Context) this.f54258b);
                return;
        }
    }
}
