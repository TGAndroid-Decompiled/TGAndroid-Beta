package org.telegram.utils.twidget;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
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
    public final String f54841a;
    public final int f54842b;
    public final long f54843c;
    public final int d;
    public final int f54844e;
    public final int f54845f;
    public final byte[] f54846g;
    public final boolean h;
    public final boolean f54847i;
    public final boolean f54848j;
    public final boolean f54849k;
    public final long f54850l;
    public final String f54851m;
    public final long f54852n;
    public String f54853o;
    public String f54854p;
    public long f54855q;
    public TLRPC.TL_messageMediaWidget f54856r;
    public String f54857s;
    public d1 f54858t;
    public rk0 f54859u;
    public rk0 f54860w;
    public int f54861x;
    public long f54862y;
    public boolean f54863z;
    public final ArrayList v = new ArrayList();
    public final j0 M = new j0(this, 0);

    public k0(String str, int i7, long j3, int i10, long j10, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z10) {
        boolean z11;
        boolean z12;
        this.f54841a = str;
        this.f54842b = i7;
        this.f54843c = j3;
        this.d = i10;
        this.f54852n = j10;
        boolean z13 = false;
        this.f54844e = Math.max(0, tL_messageMediaWidget.width);
        this.f54845f = Math.max(0, tL_messageMediaWidget.height);
        this.f54846g = tL_messageMediaWidget.payload;
        this.f54849k = z10;
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
        this.f54847i = z12;
        if (!z10 && tL_messageMediaWidget.background_query && i10 > 0) {
            z13 = true;
        }
        this.f54848j = z13;
        this.f54850l = tL_messageMediaWidget.widget_id;
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
        this.f54851m = str2;
        this.f54856r = tL_messageMediaWidget;
        this.f54853o = n0.C(tL_messageMediaWidget.chat_data);
        this.f54854p = n0.C(tL_messageMediaWidget.public_data);
        this.f54855q = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j3 = this.f54843c;
        return n0.B(this.f54842b, this.d, j3);
    }
}
