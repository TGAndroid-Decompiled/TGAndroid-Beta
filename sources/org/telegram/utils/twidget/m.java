package org.telegram.utils.twidget;

import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gk0;
public final class m {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public boolean F;
    public final String f52910a;
    public final int f52911b;
    public final long f52912c;
    public final int d;
    public final int f52913e;
    public final int f52914f;
    public final byte[] f52915g;
    public final boolean h;
    public final boolean f52916i;
    public final boolean f52917j;
    public final boolean f52918k;
    public final long f52919l;
    public final String f52920m;
    public final long f52921n;
    public String f52922o;
    public String f52923p;
    public long f52924q;
    public TLRPC.TL_messageMediaWidget f52925r;
    public String f52926s;
    public u f52927t;
    public gk0 f52928u;
    public gk0 f52929w;
    public int f52930x;
    public long f52931y;
    public boolean f52932z;
    public final ArrayList v = new ArrayList();
    public final l G = new l(this, 0);

    public m(String str, int i3, long j10, int i10, long j11, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z10) {
        boolean z11;
        boolean z12;
        this.f52910a = str;
        this.f52911b = i3;
        this.f52912c = j10;
        this.d = i10;
        this.f52921n = j11;
        boolean z13 = false;
        this.f52913e = Math.max(0, tL_messageMediaWidget.width);
        this.f52914f = Math.max(0, tL_messageMediaWidget.height);
        this.f52915g = tL_messageMediaWidget.payload;
        this.f52918k = z10;
        if (!z10 && tL_messageMediaWidget.is_copy) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.h = z11;
        if (!z10 && tL_messageMediaWidget.can_query && i10 > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f52916i = z12;
        if (!z10 && tL_messageMediaWidget.background_query && i10 > 0) {
            z13 = true;
        }
        this.f52917j = z13;
        this.f52919l = tL_messageMediaWidget.widget_id;
        String str2 = null;
        if (!z10 && !z11) {
            if (m5.E(j10)) {
                str2 = "private";
            } else {
                TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
                if (M0 != null) {
                    str2 = !t3.T(M0) ? "group" : M0.megagroup ? "supergroup" : "channel";
                }
            }
        }
        this.f52920m = str2;
        this.f52925r = tL_messageMediaWidget;
        this.f52922o = p.A(tL_messageMediaWidget.chat_data);
        this.f52923p = p.A(tL_messageMediaWidget.public_data);
        this.f52924q = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j10 = this.f52912c;
        return p.z(this.f52911b, this.d, j10);
    }
}
