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
    public final String f52864a;
    public final int f52865b;
    public final long f52866c;
    public final int d;
    public final int f52867e;
    public final int f52868f;
    public final byte[] f52869g;
    public final boolean h;
    public final boolean f52870i;
    public final boolean f52871j;
    public final boolean f52872k;
    public final long f52873l;
    public final String f52874m;
    public final long f52875n;
    public String f52876o;
    public String f52877p;
    public long f52878q;
    public TLRPC.TL_messageMediaWidget f52879r;
    public String f52880s;
    public v0 f52881t;
    public ck0 f52882u;
    public ck0 f52883w;
    public int f52884x;
    public long f52885y;
    public boolean f52886z;
    public final ArrayList v = new ArrayList();
    public final j0 G = new j0(this, 0);

    public k0(String str, int i7, long j3, int i10, long j10, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z9) {
        boolean z10;
        boolean z11;
        this.f52864a = str;
        this.f52865b = i7;
        this.f52866c = j3;
        this.d = i10;
        this.f52875n = j10;
        boolean z12 = false;
        this.f52867e = Math.max(0, tL_messageMediaWidget.width);
        this.f52868f = Math.max(0, tL_messageMediaWidget.height);
        this.f52869g = tL_messageMediaWidget.payload;
        this.f52872k = z9;
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
        this.f52870i = z11;
        if (!z9 && tL_messageMediaWidget.background_query && i10 > 0) {
            z12 = true;
        }
        this.f52871j = z12;
        this.f52873l = tL_messageMediaWidget.widget_id;
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
        this.f52874m = str2;
        this.f52879r = tL_messageMediaWidget;
        this.f52876o = n0.C(tL_messageMediaWidget.chat_data);
        this.f52877p = n0.C(tL_messageMediaWidget.public_data);
        this.f52878q = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j3 = this.f52866c;
        return n0.B(this.f52865b, this.d, j3);
    }
}
