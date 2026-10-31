package org.telegram.utils.twidget;

import java.util.ArrayList;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gl0;
public final class m {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public boolean E;
    public int F;
    public boolean G;
    public final String f44395a;
    public final int f44396b;
    public final long f44397c;
    public final int d;
    public final int e;
    public final int f44398f;
    public final byte[] f44399g;
    public final boolean h;
    public final boolean f44400i;
    public final boolean f44401j;
    public final boolean f44402k;
    public final long f44403l;
    public final String f44404m;
    public final long f44405n;
    public Boolean f44406o;
    public String f44407p;
    public String f44408q;
    public long f44409r;
    public TLRPC.TL_messageMediaWidget f44410s;
    public String f44411t;
    public w f44412u;
    public gl0 v;
    public gl0 f44414x;
    public int f44415y;
    public long f44416z;
    public final ArrayList f44413w = new ArrayList();
    public final l H = new l(this, 0);

    public m(String str, int i10, long j10, int i11, long j11, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z10) {
        boolean z11;
        boolean z12;
        this.f44395a = str;
        this.f44396b = i10;
        this.f44397c = j10;
        this.d = i11;
        this.f44405n = j11;
        boolean z13 = false;
        this.e = Math.max(0, tL_messageMediaWidget.width);
        this.f44398f = Math.max(0, tL_messageMediaWidget.height);
        this.f44399g = tL_messageMediaWidget.payload;
        this.f44402k = z10;
        if (!z10 && tL_messageMediaWidget.is_copy) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.h = z11;
        if (!z10 && tL_messageMediaWidget.can_query && i11 > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f44400i = z12;
        if (!z10 && tL_messageMediaWidget.background_query && i11 > 0) {
            z13 = true;
        }
        this.f44401j = z13;
        this.f44403l = tL_messageMediaWidget.widget_id;
        String str2 = null;
        if (!z10 && !z11) {
            if (o5.E(j10)) {
                str2 = "private";
            } else {
                TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j10));
                if (L0 != null) {
                    str2 = !w3.T(L0) ? "group" : L0.megagroup ? "supergroup" : "channel";
                }
            }
        }
        this.f44404m = str2;
        this.f44410s = tL_messageMediaWidget;
        this.f44407p = p.A(tL_messageMediaWidget.chat_data);
        this.f44408q = p.A(tL_messageMediaWidget.public_data);
        this.f44409r = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j10 = this.f44397c;
        return p.z(this.f44396b, this.d, j10);
    }
}
