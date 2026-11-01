package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.a4;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i0;
import org.telegram.messenger.lt;
import org.telegram.messenger.o5;
import org.telegram.messenger.s9;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vb;
import org.telegram.ui.xv0;
import vh.q8;
public final class d0 implements zh.e {
    public final Context f54471a;
    public final p6 f54472b;
    public final cc f54473c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f54474f;
    public c0 h;
    public lt f54476i;
    public String f54478k;
    public int f54479l;
    public boolean f54480m;
    public boolean f54481n;
    public long f54482o;
    public int f54483p;
    public x1 f54484q;
    public int f54485r;
    public final a0.h f54475g = new a0.h();
    public ArrayList f54477j = new ArrayList();

    public d0(Context context, p6 p6Var, cc ccVar, int i10, long j10) {
        this.f54471a = context;
        this.f54472b = p6Var;
        this.f54473c = ccVar;
        this.d = i10;
        this.e = j10;
        this.f54474f = wp.r1(i10).L0(Long.valueOf(j10));
        this.f54482o = wp.r1(i10).f7.getLong(a1.g.l(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f54483p = 0;
        ArrayList arrayList = this.f54477j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f54475g.d(o5.o(((TL_communities.CommunityPeerRequest) this.f54477j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f54482o) {
                        return;
                    }
                    this.f54483p++;
                }
            }
        }
    }

    public final void b(v51 v51Var) {
        if (!this.f54480m && !this.f54481n && v51Var.f31182e3.N0() + 10 > v51Var.f31183f3.D.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f54477j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f54477j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long o10 = o5.o(communityPeerRequest.peer);
                    a0.h hVar = this.f54475g;
                    if (hVar == null || !hVar.d(o10)) {
                        TLRPC.User Z1 = wp.r1(this.d).Z1(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = zh.g.f55795b;
                        b51 K = b51.K(zh.g.class);
                        K.G = new zh.f(o10, Z1, z11);
                        K.H = this;
                        K.f24641j = !z10;
                        arrayList.add(K);
                    }
                }
            }
            if (!this.f54481n) {
                arrayList.add(b51.p(29));
            }
        }
    }

    public final void d() {
        if (!this.f54480m && !this.f54481n && w3.y(27, this.f54474f)) {
            this.f54480m = true;
            wp r12 = wp.r1(this.d);
            String str = this.f54478k;
            b0 b0Var = new b0(this, 1);
            TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
            tL_communities_getPeerLinkRequests.community = r12.g1(this.e);
            tL_communities_getPeerLinkRequests.offset = str;
            tL_communities_getPeerLinkRequests.limit = 100;
            r12.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new a3.b(1), new a4(2, r12, b0Var));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f54482o = currentTime;
        wp.r1(i10).f7.edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f54484q == null && this.f54485r == 0) {
            if (z11) {
                if (z10) {
                    i10 = 2131751983;
                } else {
                    i10 = 2131751935;
                }
                String L0 = dd.L0(i10, null);
                if (z10) {
                    str = "CommunityAddAllChatsMessage";
                } else {
                    str = "CommunityDeclineAllMessage";
                }
                SpannableStringBuilder W2 = i0.W2(dd.G(this.f54479l, str, new Object[0]));
                if (z10) {
                    i11 = 2131754486;
                } else {
                    i11 = 2131751605;
                }
                x1 O = s4.O(this.f54471a, this.f54472b, L0, W2, dd.L0(i11, null), new xv0(16, this, z10));
                O.show();
                if (!z10 && (textView = (TextView) O.d(-1)) != null) {
                    a7.V(textView, t6.f21171q7, null);
                    return;
                }
                return;
            }
            lt ltVar = this.f54476i;
            if (ltVar != null) {
                ltVar.run();
            }
            this.f54476i = null;
            x1 x1Var = new x1(3, this.f54471a, this.f54472b);
            this.f54484q = x1Var;
            x1Var.setOnCancelListener(new eg.k(this, 4));
            this.f54484q.r(500L);
            wp r12 = wp.r1(this.d);
            b0 b0Var = new b0(this, 0);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j10 = this.e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = r12.g1(j10);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z10;
            this.f54485r = r12.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new a3.b(1), new s9(r12, j10, b0Var, 1));
        }
    }

    public final void g(long j10, boolean z10) {
        int i10;
        int i11;
        this.f54475g.k(null, j10);
        this.f54479l--;
        a();
        c0 c0Var = this.h;
        if (c0Var != null) {
            c0Var.b();
        }
        if (z10) {
            i10 = 2131751880;
        } else {
            i10 = 2131751879;
        }
        int i12 = this.d;
        SpannableStringBuilder W2 = i0.W2(dd.a0(null, null, i10, o5.s(i12, j10)));
        lt ltVar = this.f54476i;
        if (ltVar != null) {
            ltVar.run();
        }
        this.f54476i = new lt(this, j10, z10, 4);
        Context context = this.f54471a;
        p6 p6Var = this.f54472b;
        vb vbVar = new vb(context, p6Var, false);
        TLObject d22 = wp.r1(i12).d2(j10);
        u8 u8Var = vbVar.f31241a;
        if (d22 != null) {
            u8Var.setCount(1);
            u8Var.b(0, e20.f15506s0, d22);
            i11 = 1;
        } else {
            i11 = 0;
        }
        u8Var.setTranslationX(i0.L(7.0f));
        u8Var.setScaleX(1.333f);
        u8Var.setScaleY(1.333f);
        u8Var.a(false);
        p80 p80Var = vbVar.f31242b;
        p80Var.setSingleLine(false);
        p80Var.setMaxLines(2);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setText(W2);
        if (p80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = i0.L(74 - ((3 - i11) * 12));
            if (dd.X) {
                ((ViewGroup.MarginLayoutParams) p80Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) p80Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (dd.X) {
            u8Var.setTranslationX(i0.L(32 - ((i11 - 1) * 12)));
        }
        ub ubVar = new ub(context, p6Var, true, true);
        ubVar.e(dd.L0(2131743910, null));
        ubVar.f30924b = new q8(this, j10, 2);
        ubVar.f30925c = this.f54476i;
        vbVar.setButton(ubVar);
        this.f54473c.b(vbVar, 5000).j();
    }
}
