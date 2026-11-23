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
    public final String f54845a;
    public final int f54846b;
    public final long f54847c;
    public final int d;
    public final int f54848e;
    public final int f54849f;
    public final byte[] f54850g;
    public final boolean h;
    public final boolean f54851i;
    public final boolean f54852j;
    public final boolean f54853k;
    public final long f54854l;
    public final String f54855m;
    public final long f54856n;
    public String f54857o;
    public String f54858p;
    public long f54859q;
    public TLRPC.TL_messageMediaWidget f54860r;
    public String f54861s;
    public d1 f54862t;
    public rk0 f54863u;
    public rk0 f54864w;
    public int f54865x;
    public long f54866y;
    public boolean f54867z;
    public final ArrayList v = new ArrayList();
    public final j0 M = new j0(this, 0);

    public k0(String str, int i7, long j3, int i10, long j10, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z10) {
        boolean z11;
        boolean z12;
        this.f54845a = str;
        this.f54846b = i7;
        this.f54847c = j3;
        this.d = i10;
        this.f54856n = j10;
        boolean z13 = false;
        this.f54848e = Math.max(0, tL_messageMediaWidget.width);
        this.f54849f = Math.max(0, tL_messageMediaWidget.height);
        this.f54850g = tL_messageMediaWidget.payload;
        this.f54853k = z10;
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
        this.f54851i = z12;
        if (!z10 && tL_messageMediaWidget.background_query && i10 > 0) {
            z13 = true;
        }
        this.f54852j = z13;
        this.f54854l = tL_messageMediaWidget.widget_id;
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
        this.f54855m = str2;
        this.f54860r = tL_messageMediaWidget;
        this.f54857o = n0.C(tL_messageMediaWidget.chat_data);
        this.f54858p = n0.C(tL_messageMediaWidget.public_data);
        this.f54859q = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j3 = this.f54847c;
        return n0.B(this.f54846b, this.d, j3);
    }
}
