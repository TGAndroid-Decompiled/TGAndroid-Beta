package org.telegram.utils.twidget;

import java.util.ArrayList;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hk0;
public final class k0 {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public boolean F;
    public final String f54266a;
    public final int f54267b;
    public final long f54268c;
    public final int d;
    public final int f54269e;
    public final int f54270f;
    public final byte[] f54271g;
    public final boolean h;
    public final boolean f54272i;
    public final boolean f54273j;
    public final boolean f54274k;
    public final long f54275l;
    public final String f54276m;
    public final long f54277n;
    public String f54278o;
    public String f54279p;
    public long f54280q;
    public TLRPC.TL_messageMediaWidget f54281r;
    public String f54282s;
    public y0 f54283t;
    public hk0 f54284u;
    public hk0 f54285w;
    public int f54286x;
    public long f54287y;
    public boolean f54288z;
    public final ArrayList v = new ArrayList();
    public final j0 G = new j0(this, 0);

    public k0(String str, int i7, long j3, int i10, long j10, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z10) {
        boolean z11;
        boolean z12;
        this.f54266a = str;
        this.f54267b = i7;
        this.f54268c = j3;
        this.d = i10;
        this.f54277n = j10;
        boolean z13 = false;
        this.f54269e = Math.max(0, tL_messageMediaWidget.width);
        this.f54270f = Math.max(0, tL_messageMediaWidget.height);
        this.f54271g = tL_messageMediaWidget.payload;
        this.f54274k = z10;
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
        this.f54272i = z12;
        if (!z10 && tL_messageMediaWidget.background_query && i10 > 0) {
            z13 = true;
        }
        this.f54273j = z13;
        this.f54275l = tL_messageMediaWidget.widget_id;
        String str2 = null;
        if (!z10 && !z11) {
            if (m5.E(j3)) {
                str2 = "private";
            } else {
                TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
                if (M0 != null) {
                    str2 = !t3.T(M0) ? "group" : M0.megagroup ? "supergroup" : "channel";
                }
            }
        }
        this.f54276m = str2;
        this.f54281r = tL_messageMediaWidget;
        this.f54278o = n0.C(tL_messageMediaWidget.chat_data);
        this.f54279p = n0.C(tL_messageMediaWidget.public_data);
        this.f54280q = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j3 = this.f54268c;
        return n0.B(this.f54267b, this.d, j3);
    }
}
