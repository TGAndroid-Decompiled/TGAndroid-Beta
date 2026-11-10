package org.telegram.utils.twidget;

import java.util.ArrayList;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
public final class k0 {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public boolean F;
    public final String f52877a;
    public final int f52878b;
    public final long f52879c;
    public final int d;
    public final int f52880e;
    public final int f52881f;
    public final byte[] f52882g;
    public final boolean h;
    public final boolean f52883i;
    public final boolean f52884j;
    public final boolean f52885k;
    public final long f52886l;
    public final String f52887m;
    public final long f52888n;
    public String f52889o;
    public String f52890p;
    public long f52891q;
    public TLRPC.TL_messageMediaWidget f52892r;
    public String f52893s;
    public v0 f52894t;
    public ck0 f52895u;
    public ck0 f52896w;
    public int f52897x;
    public long f52898y;
    public boolean f52899z;
    public final ArrayList v = new ArrayList();
    public final j0 G = new j0(this, 0);

    public k0(String str, int i7, long j3, int i10, long j10, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z9) {
        boolean z10;
        boolean z11;
        this.f52877a = str;
        this.f52878b = i7;
        this.f52879c = j3;
        this.d = i10;
        this.f52888n = j10;
        boolean z12 = false;
        this.f52880e = Math.max(0, tL_messageMediaWidget.width);
        this.f52881f = Math.max(0, tL_messageMediaWidget.height);
        this.f52882g = tL_messageMediaWidget.payload;
        this.f52885k = z9;
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
        this.f52883i = z11;
        if (!z9 && tL_messageMediaWidget.background_query && i10 > 0) {
            z12 = true;
        }
        this.f52884j = z12;
        this.f52886l = tL_messageMediaWidget.widget_id;
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
        this.f52887m = str2;
        this.f52892r = tL_messageMediaWidget;
        this.f52889o = n0.C(tL_messageMediaWidget.chat_data);
        this.f52890p = n0.C(tL_messageMediaWidget.public_data);
        this.f52891q = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j3 = this.f52879c;
        return n0.B(this.f52878b, this.d, j3);
    }
}
