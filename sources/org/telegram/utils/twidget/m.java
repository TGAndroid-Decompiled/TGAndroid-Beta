package org.telegram.utils.twidget;

import java.util.ArrayList;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
public final class m {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public boolean F;
    public final String f52843a;
    public final int f52844b;
    public final long f52845c;
    public final int d;
    public final int f52846e;
    public final int f52847f;
    public final byte[] f52848g;
    public final boolean h;
    public final boolean f52849i;
    public final boolean f52850j;
    public final boolean f52851k;
    public final long f52852l;
    public final String f52853m;
    public final long f52854n;
    public String f52855o;
    public String f52856p;
    public long f52857q;
    public TLRPC.TL_messageMediaWidget f52858r;
    public String f52859s;
    public u f52860t;
    public ck0 f52861u;
    public ck0 f52862w;
    public int f52863x;
    public long f52864y;
    public boolean f52865z;
    public final ArrayList v = new ArrayList();
    public final l G = new l(this, 0);

    public m(String str, int i7, long j3, int i10, long j10, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z9) {
        boolean z10;
        boolean z11;
        this.f52843a = str;
        this.f52844b = i7;
        this.f52845c = j3;
        this.d = i10;
        this.f52854n = j10;
        boolean z12 = false;
        this.f52846e = Math.max(0, tL_messageMediaWidget.width);
        this.f52847f = Math.max(0, tL_messageMediaWidget.height);
        this.f52848g = tL_messageMediaWidget.payload;
        this.f52851k = z9;
        if (!z9 && tL_messageMediaWidget.is_copy) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (!z9 && tL_messageMediaWidget.can_query && i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f52849i = z11;
        if (!z9 && tL_messageMediaWidget.background_query && i10 > 0) {
            z12 = true;
        }
        this.f52850j = z12;
        this.f52852l = tL_messageMediaWidget.widget_id;
        String str2 = null;
        if (!z9 && !z10) {
            if (m5.E(j3)) {
                str2 = "private";
            } else {
                TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
                if (M0 != null) {
                    str2 = !t3.T(M0) ? "group" : M0.megagroup ? "supergroup" : "channel";
                }
            }
        }
        this.f52853m = str2;
        this.f52858r = tL_messageMediaWidget;
        this.f52855o = p.A(tL_messageMediaWidget.chat_data);
        this.f52856p = p.A(tL_messageMediaWidget.public_data);
        this.f52857q = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j3 = this.f52845c;
        return p.z(this.f52844b, this.d, j3);
    }
}
