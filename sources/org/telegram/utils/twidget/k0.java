package org.telegram.utils.twidget;

import java.util.ArrayList;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
public final class k0 {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public boolean F;
    public final String f52878a;
    public final int f52879b;
    public final long f52880c;
    public final int d;
    public final int f52881e;
    public final int f52882f;
    public final byte[] f52883g;
    public final boolean h;
    public final boolean f52884i;
    public final boolean f52885j;
    public final boolean f52886k;
    public final long f52887l;
    public final String f52888m;
    public final long f52889n;
    public String f52890o;
    public String f52891p;
    public long f52892q;
    public TLRPC.TL_messageMediaWidget f52893r;
    public String f52894s;
    public v0 f52895t;
    public dk0 f52896u;
    public dk0 f52897w;
    public int f52898x;
    public long f52899y;
    public boolean f52900z;
    public final ArrayList v = new ArrayList();
    public final j0 G = new j0(this, 0);

    public k0(String str, int i7, long j3, int i10, long j10, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z9) {
        boolean z10;
        boolean z11;
        this.f52878a = str;
        this.f52879b = i7;
        this.f52880c = j3;
        this.d = i10;
        this.f52889n = j10;
        boolean z12 = false;
        this.f52881e = Math.max(0, tL_messageMediaWidget.width);
        this.f52882f = Math.max(0, tL_messageMediaWidget.height);
        this.f52883g = tL_messageMediaWidget.payload;
        this.f52886k = z9;
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
        this.f52884i = z11;
        if (!z9 && tL_messageMediaWidget.background_query && i10 > 0) {
            z12 = true;
        }
        this.f52885j = z12;
        this.f52887l = tL_messageMediaWidget.widget_id;
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
        this.f52888m = str2;
        this.f52893r = tL_messageMediaWidget;
        this.f52890o = n0.C(tL_messageMediaWidget.chat_data);
        this.f52891p = n0.C(tL_messageMediaWidget.public_data);
        this.f52892q = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j3 = this.f52880c;
        return n0.B(this.f52879b, this.d, j3);
    }
}
