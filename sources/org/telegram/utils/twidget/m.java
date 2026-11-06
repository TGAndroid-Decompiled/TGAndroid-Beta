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
    public final String f52845a;
    public final int f52846b;
    public final long f52847c;
    public final int d;
    public final int f52848e;
    public final int f52849f;
    public final byte[] f52850g;
    public final boolean h;
    public final boolean f52851i;
    public final boolean f52852j;
    public final boolean f52853k;
    public final long f52854l;
    public final String f52855m;
    public final long f52856n;
    public String f52857o;
    public String f52858p;
    public long f52859q;
    public TLRPC.TL_messageMediaWidget f52860r;
    public String f52861s;
    public u f52862t;
    public ck0 f52863u;
    public ck0 f52864w;
    public int f52865x;
    public long f52866y;
    public boolean f52867z;
    public final ArrayList v = new ArrayList();
    public final l G = new l(this, 0);

    public m(String str, int i7, long j3, int i10, long j10, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z9) {
        boolean z10;
        boolean z11;
        this.f52845a = str;
        this.f52846b = i7;
        this.f52847c = j3;
        this.d = i10;
        this.f52856n = j10;
        boolean z12 = false;
        this.f52848e = Math.max(0, tL_messageMediaWidget.width);
        this.f52849f = Math.max(0, tL_messageMediaWidget.height);
        this.f52850g = tL_messageMediaWidget.payload;
        this.f52853k = z9;
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
        this.f52851i = z11;
        if (!z9 && tL_messageMediaWidget.background_query && i10 > 0) {
            z12 = true;
        }
        this.f52852j = z12;
        this.f52854l = tL_messageMediaWidget.widget_id;
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
        this.f52855m = str2;
        this.f52860r = tL_messageMediaWidget;
        this.f52857o = p.A(tL_messageMediaWidget.chat_data);
        this.f52858p = p.A(tL_messageMediaWidget.public_data);
        this.f52859q = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j3 = this.f52847c;
        return p.z(this.f52846b, this.d, j3);
    }
}
