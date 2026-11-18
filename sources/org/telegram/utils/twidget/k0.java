package org.telegram.utils.twidget;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pk0;
public final class k0 {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public boolean F;
    public final String f54799a;
    public final int f54800b;
    public final long f54801c;
    public final int d;
    public final int f54802e;
    public final int f54803f;
    public final byte[] f54804g;
    public final boolean h;
    public final boolean f54805i;
    public final boolean f54806j;
    public final boolean f54807k;
    public final long f54808l;
    public final String f54809m;
    public final long f54810n;
    public String f54811o;
    public String f54812p;
    public long f54813q;
    public TLRPC.TL_messageMediaWidget f54814r;
    public String f54815s;
    public d1 f54816t;
    public pk0 f54817u;
    public pk0 f54818w;
    public int f54819x;
    public long f54820y;
    public boolean f54821z;
    public final ArrayList v = new ArrayList();
    public final j0 G = new j0(this, 0);

    public k0(String str, int i7, long j3, int i10, long j10, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z10) {
        boolean z11;
        boolean z12;
        this.f54799a = str;
        this.f54800b = i7;
        this.f54801c = j3;
        this.d = i10;
        this.f54810n = j10;
        boolean z13 = false;
        this.f54802e = Math.max(0, tL_messageMediaWidget.width);
        this.f54803f = Math.max(0, tL_messageMediaWidget.height);
        this.f54804g = tL_messageMediaWidget.payload;
        this.f54807k = z10;
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
        this.f54805i = z12;
        if (!z10 && tL_messageMediaWidget.background_query && i10 > 0) {
            z13 = true;
        }
        this.f54806j = z13;
        this.f54808l = tL_messageMediaWidget.widget_id;
        String str2 = null;
        if (!z10 && !z11) {
            if (n5.E(j3)) {
                str2 = "private";
            } else {
                TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
                if (O0 != null) {
                    str2 = !v3.T(O0) ? "group" : O0.megagroup ? "supergroup" : "channel";
                }
            }
        }
        this.f54809m = str2;
        this.f54814r = tL_messageMediaWidget;
        this.f54811o = n0.C(tL_messageMediaWidget.chat_data);
        this.f54812p = n0.C(tL_messageMediaWidget.public_data);
        this.f54813q = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j3 = this.f54801c;
        return n0.B(this.f54800b, this.d, j3);
    }
}
