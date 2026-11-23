package org.telegram.utils.twidget;

import java.util.ArrayList;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rk0;
public final class k0 {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public double F;
    public double G;
    public double H;
    public long I;
    public boolean J;
    public int K;
    public boolean L;
    public final String f54810a;
    public final int f54811b;
    public final long f54812c;
    public final int d;
    public final int f54813e;
    public final int f54814f;
    public final byte[] f54815g;
    public final boolean h;
    public final boolean f54816i;
    public final boolean f54817j;
    public final boolean f54818k;
    public final long f54819l;
    public final String f54820m;
    public final long f54821n;
    public String f54822o;
    public String f54823p;
    public long f54824q;
    public TLRPC.TL_messageMediaWidget f54825r;
    public String f54826s;
    public d1 f54827t;
    public rk0 f54828u;
    public rk0 f54829w;
    public int f54830x;
    public long f54831y;
    public boolean f54832z;
    public final ArrayList v = new ArrayList();
    public final j0 M = new j0(this, 0);

    public k0(String str, int i7, long j3, int i10, long j10, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z10) {
        boolean z11;
        boolean z12;
        this.f54810a = str;
        this.f54811b = i7;
        this.f54812c = j3;
        this.d = i10;
        this.f54821n = j10;
        boolean z13 = false;
        this.f54813e = Math.max(0, tL_messageMediaWidget.width);
        this.f54814f = Math.max(0, tL_messageMediaWidget.height);
        this.f54815g = tL_messageMediaWidget.payload;
        this.f54818k = z10;
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
        this.f54816i = z12;
        if (!z10 && tL_messageMediaWidget.background_query && i10 > 0) {
            z13 = true;
        }
        this.f54817j = z13;
        this.f54819l = tL_messageMediaWidget.widget_id;
        String str2 = null;
        if (!z10 && !z11) {
            if (n5.E(j3)) {
                str2 = "private";
            } else {
                TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-j3));
                if (O0 != null) {
                    str2 = !v3.T(O0) ? "group" : O0.megagroup ? "supergroup" : "channel";
                }
            }
        }
        this.f54820m = str2;
        this.f54825r = tL_messageMediaWidget;
        this.f54822o = n0.C(tL_messageMediaWidget.chat_data);
        this.f54823p = n0.C(tL_messageMediaWidget.public_data);
        this.f54824q = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j3 = this.f54812c;
        return n0.B(this.f54811b, this.d, j3);
    }
}
