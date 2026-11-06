package org.telegram.utils.twidget;

import java.util.ArrayList;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
public final class m {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public boolean F;
    public final String f52819a;
    public final int f52820b;
    public final long f52821c;
    public final int d;
    public final int f52822e;
    public final int f52823f;
    public final byte[] f52824g;
    public final boolean h;
    public final boolean f52825i;
    public final boolean f52826j;
    public final boolean f52827k;
    public final long f52828l;
    public final String f52829m;
    public final long f52830n;
    public String f52831o;
    public String f52832p;
    public long f52833q;
    public TLRPC.TL_messageMediaWidget f52834r;
    public String f52835s;
    public u f52836t;
    public ck0 f52837u;
    public ck0 f52838w;
    public int f52839x;
    public long f52840y;
    public boolean f52841z;
    public final ArrayList v = new ArrayList();
    public final l G = new l(this, 0);

    public m(String str, int i7, long j3, int i10, long j10, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z9) {
        boolean z10;
        boolean z11;
        this.f52819a = str;
        this.f52820b = i7;
        this.f52821c = j3;
        this.d = i10;
        this.f52830n = j10;
        boolean z12 = false;
        this.f52822e = Math.max(0, tL_messageMediaWidget.width);
        this.f52823f = Math.max(0, tL_messageMediaWidget.height);
        this.f52824g = tL_messageMediaWidget.payload;
        this.f52827k = z9;
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
        this.f52825i = z11;
        if (!z9 && tL_messageMediaWidget.background_query && i10 > 0) {
            z12 = true;
        }
        this.f52826j = z12;
        this.f52828l = tL_messageMediaWidget.widget_id;
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
        this.f52829m = str2;
        this.f52834r = tL_messageMediaWidget;
        this.f52831o = p.A(tL_messageMediaWidget.chat_data);
        this.f52832p = p.A(tL_messageMediaWidget.public_data);
        this.f52833q = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        long j3 = this.f52821c;
        return p.z(this.f52820b, this.d, j3);
    }
}
