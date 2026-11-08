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
    public final String f52867a;
    public final int f52868b;
    public final long f52869c;
    public final int d;
    public final int f52870e;
    public final int f52871f;
    public final byte[] f52872g;
    public final boolean h;
    public final boolean f52873i;
    public final boolean f52874j;
    public final boolean f52875k;
    public final long f52876l;
    public final String f52877m;
    public final long f52878n;
    public String f52879o;
    public String f52880p;
    public long f52881q;
    public TLRPC.TL_messageMediaWidget f52882r;
    public String f52883s;
    public v0 f52884t;
    public ck0 f52885u;
    public ck0 f52886w;
    public int f52887x;
    public long f52888y;
    public boolean f52889z;
    public final ArrayList v = new ArrayList();
    public final j0 G = new j0(this, 0);

    public k0(String str, int i7, long j3, int i10, long j10, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z9) {
        boolean z10;
        boolean z11;
        this.f52867a = str;
        this.f52868b = i7;
        this.f52869c = j3;
        this.d = i10;
        this.f52878n = j10;
        boolean z12 = false;
        this.f52870e = Math.max(0, tL_messageMediaWidget.width);
        this.f52871f = Math.max(0, tL_messageMediaWidget.height);
        this.f52872g = tL_messageMediaWidget.payload;
        this.f52875k = z9;
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
        this.f52873i = z11;
        if (!z9 && tL_messageMediaWidget.background_query && i10 > 0) {
            z12 = true;
        }
        this.f52874j = z12;
        this.f52876l = tL_messageMediaWidget.widget_id;
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
        this.f52877m = str2;
        this.f52882r = tL_messageMediaWidget;
        this.f52879o = n0.C(tL_messageMediaWidget.chat_data);
        this.f52880p = n0.C(tL_messageMediaWidget.public_data);
        this.f52881q = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j3 = this.f52869c;
        return n0.B(this.f52868b, this.d, j3);
    }
}
