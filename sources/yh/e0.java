package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.a4;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.i0;
import org.telegram.messenger.kt;
import org.telegram.messenger.o5;
import org.telegram.messenger.r9;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.vb;
import org.telegram.ui.yv0;
import vh.q8;
public final class e0 implements zh.e {
    public final Context f54473a;
    public final p6 f54474b;
    public final cc f54475c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f54476f;
    public d0 h;
    public kt f54478i;
    public String f54480k;
    public int f54481l;
    public boolean f54482m;
    public boolean f54483n;
    public long f54484o;
    public int f54485p;
    public x1 f54486q;
    public int f54487r;
    public final a0.h f54477g = new a0.h();
    public ArrayList f54479j = new ArrayList();

    public e0(Context context, p6 p6Var, cc ccVar, int i10, long j10) {
        this.f54473a = context;
        this.f54474b = p6Var;
        this.f54475c = ccVar;
        this.d = i10;
        this.e = j10;
        this.f54476f = vp.r1(i10).L0(Long.valueOf(j10));
        this.f54484o = vp.r1(i10).f7.getLong(a1.g.l(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f54485p = 0;
        ArrayList arrayList = this.f54479j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f54477g.d(o5.o(((TL_communities.CommunityPeerRequest) this.f54479j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f54484o) {
                        return;
                    }
                    this.f54485p++;
                }
            }
        }
    }

    public final void b(u51 u51Var) {
        if (!this.f54482m && !this.f54483n && u51Var.f30818e3.N0() + 10 > u51Var.f30819f3.D.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f54479j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f54479j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long o10 = o5.o(communityPeerRequest.peer);
                    a0.h hVar = this.f54477g;
                    if (hVar == null || !hVar.d(o10)) {
                        TLRPC.User Z1 = vp.r1(this.d).Z1(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = zh.g.f55777b;
                        a51 K = a51.K(zh.g.class);
                        K.G = new zh.f(o10, Z1, z11);
                        K.H = this;
                        K.f24290j = !z10;
                        arrayList.add(K);
                    }
                }
            }
            if (!this.f54483n) {
                arrayList.add(a51.p(29));
            }
        }
    }

    public final void d() {
        if (!this.f54482m && !this.f54483n && w3.y(27, this.f54476f)) {
            this.f54482m = true;
            vp r12 = vp.r1(this.d);
            String str = this.f54480k;
            c0 c0Var = new c0(this, 1);
            TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
            tL_communities_getPeerLinkRequests.community = r12.g1(this.e);
            tL_communities_getPeerLinkRequests.offset = str;
            tL_communities_getPeerLinkRequests.limit = 100;
            r12.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new a3.b(1), new a4(2, r12, c0Var));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f54484o = currentTime;
        vp.r1(i10).f7.edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f54486q == null && this.f54487r == 0) {
            if (z11) {
                if (z10) {
                    i10 = 2131751983;
                } else {
                    i10 = 2131751935;
                }
                String L0 = cd.L0(i10, null);
                if (z10) {
                    str = "CommunityAddAllChatsMessage";
                } else {
                    str = "CommunityDeclineAllMessage";
                }
                SpannableStringBuilder W2 = i0.W2(cd.G(this.f54481l, str, new Object[0]));
                if (z10) {
                    i11 = 2131754486;
                } else {
                    i11 = 2131751605;
                }
                x1 O = s4.O(this.f54473a, this.f54474b, L0, W2, cd.L0(i11, null), new yv0(16, this, z10));
                O.show();
                if (!z10 && (textView = (TextView) O.d(-1)) != null) {
                    a7.V(textView, t6.f21170q7, null);
                    return;
                }
                return;
            }
            kt ktVar = this.f54478i;
            if (ktVar != null) {
                ktVar.run();
            }
            this.f54478i = null;
            x1 x1Var = new x1(3, this.f54473a, this.f54474b);
            this.f54486q = x1Var;
            x1Var.setOnCancelListener(new eg.k(this, 4));
            this.f54486q.r(500L);
            vp r12 = vp.r1(this.d);
            c0 c0Var = new c0(this, 0);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j10 = this.e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = r12.g1(j10);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z10;
            this.f54487r = r12.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new a3.b(1), new r9(r12, j10, c0Var, 1));
        }
    }

    public final void g(long j10, boolean z10) {
        int i10;
        int i11;
        this.f54477g.k(null, j10);
        this.f54481l--;
        a();
        d0 d0Var = this.h;
        if (d0Var != null) {
            d0Var.b();
        }
        if (z10) {
            i10 = 2131751880;
        } else {
            i10 = 2131751879;
        }
        int i12 = this.d;
        SpannableStringBuilder W2 = i0.W2(cd.a0(null, null, i10, o5.s(i12, j10)));
        kt ktVar = this.f54478i;
        if (ktVar != null) {
            ktVar.run();
        }
        this.f54478i = new kt(this, j10, z10, 4);
        Context context = this.f54473a;
        p6 p6Var = this.f54474b;
        vb vbVar = new vb(context, p6Var, false);
        TLObject d22 = vp.r1(i12).d2(j10);
        u8 u8Var = vbVar.f31206a;
        if (d22 != null) {
            u8Var.setCount(1);
            u8Var.b(0, d20.f15147s0, d22);
            i11 = 1;
        } else {
            i11 = 0;
        }
        u8Var.setTranslationX(i0.L(7.0f));
        u8Var.setScaleX(1.333f);
        u8Var.setScaleY(1.333f);
        u8Var.a(false);
        p80 p80Var = vbVar.f31207b;
        p80Var.setSingleLine(false);
        p80Var.setMaxLines(2);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setText(W2);
        if (p80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = i0.L(74 - ((3 - i11) * 12));
            if (cd.X) {
                ((ViewGroup.MarginLayoutParams) p80Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) p80Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (cd.X) {
            u8Var.setTranslationX(i0.L(32 - ((i11 - 1) * 12)));
        }
        ub ubVar = new ub(context, p6Var, true, true);
        ubVar.e(cd.L0(2131743910, null));
        ubVar.f30890b = new q8(this, j10, 2);
        ubVar.f30891c = this.f54478i;
        vbVar.setButton(ubVar);
        this.f54475c.b(vbVar, 5000).j();
    }
}
