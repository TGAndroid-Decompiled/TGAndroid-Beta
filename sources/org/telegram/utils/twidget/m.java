package org.telegram.utils.twidget;

import java.util.ArrayList;
import org.telegram.messenger.o5;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hl0;
public final class m {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public boolean E;
    public int F;
    public boolean G;
    public final String f44406a;
    public final int f44407b;
    public final long f44408c;
    public final int d;
    public final int e;
    public final int f44409f;
    public final byte[] f44410g;
    public final boolean h;
    public final boolean f44411i;
    public final boolean f44412j;
    public final boolean f44413k;
    public final long f44414l;
    public final String f44415m;
    public final long f44416n;
    public Boolean f44417o;
    public String f44418p;
    public String f44419q;
    public long f44420r;
    public TLRPC.TL_messageMediaWidget f44421s;
    public String f44422t;
    public w f44423u;
    public hl0 v;
    public hl0 f44425x;
    public int f44426y;
    public long f44427z;
    public final ArrayList f44424w = new ArrayList();
    public final l H = new l(this, 0);

    public m(String str, int i10, long j10, int i11, long j11, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z10) {
        boolean z11;
        boolean z12;
        this.f44406a = str;
        this.f44407b = i10;
        this.f44408c = j10;
        this.d = i11;
        this.f44416n = j11;
        boolean z13 = false;
        this.e = Math.max(0, tL_messageMediaWidget.width);
        this.f44409f = Math.max(0, tL_messageMediaWidget.height);
        this.f44410g = tL_messageMediaWidget.payload;
        this.f44413k = z10;
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
        this.f44411i = z12;
        if (!z10 && tL_messageMediaWidget.background_query && i11 > 0) {
            z13 = true;
        }
        this.f44412j = z13;
        this.f44414l = tL_messageMediaWidget.widget_id;
        String str2 = null;
        if (!z10 && !z11) {
            if (o5.E(j10)) {
                str2 = "private";
            } else {
                TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(-j10));
                if (L0 != null) {
                    str2 = !w3.T(L0) ? "group" : L0.megagroup ? "supergroup" : "channel";
                }
            }
        }
        this.f44415m = str2;
        this.f44421s = tL_messageMediaWidget;
        this.f44418p = p.A(tL_messageMediaWidget.chat_data);
        this.f44419q = p.A(tL_messageMediaWidget.public_data);
        this.f44420r = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j10 = this.f44408c;
        return p.z(this.f44407b, this.d, j10);
    }
}
