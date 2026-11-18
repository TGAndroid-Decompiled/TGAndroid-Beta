package org.telegram.utils.twidget;

import android.content.Context;
import android.text.TextUtils;
import di.i9;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j0 implements Runnable {
    public final int f54796a;
    public final Object f54797b;

    public j0(Object obj, int i7) {
        this.f54796a = i7;
        this.f54797b = obj;
    }

    @Override
    public final void run() {
        k0 k0Var;
        switch (this.f54796a) {
            case 0:
                k0 k0Var2 = (k0) this.f54797b;
                k0Var2.getClass();
                n0.a(k0Var2);
                return;
            case 1:
                final m0 m0Var = (m0) this.f54797b;
                int i7 = m0Var.f54834a;
                Iterator it = n0.f54846a.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        k0Var = (k0) it.next();
                        if (k0Var.f54801b != i7 || k0Var.f54809l != m0Var.f54835b || k0Var.f54808k || k0Var.f54820x <= 0 || k0Var.d <= 0) {
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
                tL_messages_getWidgetPublicData.peer = mp.u1(k0Var.f54801b).l1(k0Var.f54802c);
                tL_messages_getWidgetPublicData.msg_id = k0Var.d;
                tL_messages_getWidgetPublicData.hash = m0Var.f54836c;
                m0Var.f54837e = ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_getWidgetPublicData, new d3.b(1), new q10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        int max;
                        String str;
                        TLRPC.messages_WidgetPublicData messages_widgetpublicdata = (TLRPC.messages_WidgetPublicData) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        m0 m0Var2 = m0.this;
                        m0Var2.f54837e = 0;
                        HashMap hashMap = n0.f54855l;
                        StringBuilder sb2 = new StringBuilder();
                        int i10 = m0Var2.f54834a;
                        sb2.append(i10);
                        sb2.append("/");
                        long j3 = m0Var2.f54835b;
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
                                m0Var2.f54836c = j10;
                                String str2 = tL_messages_widgetPublicData.data;
                                String C = n0.C(str2);
                                for (k0 k0Var3 : n0.f54846a.values()) {
                                    if (k0Var3.f54801b == i10 && k0Var3.f54809l == j3 && !k0Var3.f54808k && (!TextUtils.equals(k0Var3.f54813p, C) || k0Var3.f54814q != j10)) {
                                        k0Var3.f54814q = j10;
                                        n0.c(k0Var3, k0Var3.f54812o, C);
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = k0Var3.f54815r;
                                        if (tL_messageMediaWidget != null) {
                                            tL_messageMediaWidget.public_data_hash = j10;
                                        }
                                        tr a02 = tr.a0(i10);
                                        long j11 = k0Var3.f54802c;
                                        int i12 = k0Var3.d;
                                        if (str2 == null) {
                                            str = "";
                                        } else {
                                            str = str2;
                                        }
                                        a02.f27052a.c(new i9(a02, i12, j11, str, j10, (String) null));
                                        str2 = str2;
                                    }
                                }
                            }
                        }
                        org.telegram.messenger.g0.h3(m0Var2.f54838f, m0Var2.d * 1000);
                    }
                });
                return;
            case 2:
                y0 y0Var = (y0) this.f54797b;
                synchronized (y0Var.f54995y.f54998e) {
                    try {
                        if (!y0Var.h && y0Var.d <= 0) {
                            if (y0Var.f54995y.v() <= 1) {
                                z0 z0Var = y0Var.f54995y;
                                if (z0Var.f55007o && z0Var.f55008p) {
                                }
                            }
                            y0Var.f54995y.t(y0Var);
                            y0Var.f54995y.y();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 3:
                d1 d1Var = (d1) this.f54797b;
                p1 p1Var = d1Var.f54695f;
                if (p1Var != null) {
                    p1Var.f(d1Var.f54711x);
                    return;
                }
                return;
            default:
                p1.d((Context) this.f54797b);
                return;
        }
    }
}
