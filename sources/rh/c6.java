package rh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.kj;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.pb;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
import org.telegram.ui.un;
public final class c6 {
    public final x5 f46730a;
    public final kj f46731b;
    public final un f46732c;
    public final wb d;
    public final qb e;
    public final d6 f46733f;
    public final boolean f46734g;
    public long h;
    public long f46737k;
    public boolean f46738l;
    public boolean f46739m;
    public i4 f46741o;
    public final a6 f46742p;
    public final e6 f46743q;
    public boolean f46735i = false;
    public boolean f46736j = false;
    public Long f46740n = null;

    public c6(e6 e6Var, x5 x5Var, kj kjVar, un unVar, boolean z10) {
        this.f46743q = e6Var;
        boolean z11 = false;
        a6 a6Var = new a6(this, 0);
        this.f46742p = a6Var;
        this.f46730a = x5Var;
        this.f46731b = kjVar;
        this.f46732c = unVar;
        Context t10 = e6.t(unVar);
        qb qbVar = new qb(t10, unVar.f42288xa);
        this.e = qbVar;
        qbVar.c(2131624224, new String[0]);
        qbVar.f29704b.setText(d());
        ub ubVar = new ub(t10, unVar.f42288xa, true, false);
        ubVar.e(dd.L0(2131745041, null));
        ubVar.f30924b = new a6(this, 1);
        ?? pbVar = new pb(t10, unVar.f42288xa);
        this.f46733f = pbVar;
        pbVar.f29396b = 5000L;
        int i10 = org.telegram.ui.ActionBar.t6.uj;
        sn snVar = unVar.f42288xa;
        org.telegram.utils.twidget.t tVar = new org.telegram.utils.twidget.t(28);
        org.telegram.utils.twidget.t tVar2 = new org.telegram.utils.twidget.t(29);
        int Q = org.telegram.ui.ActionBar.a7.Q(i10, -1, 0, 0.0f, snVar);
        tVar2.d(Q, pbVar);
        org.telegram.ui.ActionBar.u6 x10 = org.telegram.ui.ActionBar.a7.x(101, pbVar);
        x10.c(i10, -1, 0, 0.0f, snVar);
        x10.f21397n = tVar;
        x10.f21398o = tVar2;
        x10.f21396m = false;
        x10.f21391g = Q;
        ubVar.addView((View) pbVar, w7.b6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ubVar.e.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(8.0f));
        qbVar.setButton(ubVar);
        wb b10 = cc.a0(unVar).b(qbVar, -1);
        this.d = b10;
        b10.f32209r = false;
        if (z10) {
            b10.k(true);
            this.f46739m = true;
        }
        b10.v = a6Var;
        this.h = 0L;
        System.currentTimeMillis();
        if (kjVar.f16690k.reactions != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= kjVar.f16690k.reactions.results.size()) {
                    break;
                } else if (kjVar.f16690k.reactions.results.get(i11).reaction instanceof TLRPC.TL_reactionPaid) {
                    z11 = kjVar.f16690k.reactions.results.get(i11).chosen;
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f46734g = z11;
    }

    public final void a() {
        e6 e6Var = this.f46743q;
        int i10 = e6Var.f46863a;
        org.telegram.messenger.i0.r(this.f46742p);
        this.f46736j = true;
        this.d.b();
        i4 i4Var = this.f46741o;
        if (i4Var != null) {
            i4Var.c();
        }
        boolean z10 = this.f46734g;
        long c10 = c();
        kj kjVar = this.f46731b;
        kjVar.f((int) (-this.h), c10, z10);
        e6Var.f46867g -= this.h;
        at.f(i10).k(at.y3, new Object[0]);
        at.f(i10).k(at.f14756o1, Long.valueOf(kj.B0(kjVar.f16690k)), Integer.valueOf(kjVar.f1()), kjVar.f16690k.reactions);
        if (e6Var.B == this) {
            e6Var.B = null;
        }
    }

    public final void b() {
        kj kjVar;
        String str;
        int i10 = at.y3;
        org.telegram.messenger.i0.r(this.f46742p);
        if (this.f46738l) {
            if (!this.f46735i && !this.f46736j) {
                e6 y3 = e6.y(this.f46743q.f46863a, false);
                wp r12 = wp.r1(this.f46743q.f46863a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f46743q.f46863a);
                long j10 = this.h;
                if (y3.e && y3.q(null, false, false).amount < j10) {
                    this.f46736j = true;
                    this.f46731b.f((int) (-this.h), c(), this.f46734g);
                    e6 e6Var = this.f46743q;
                    e6Var.f46867g = 0L;
                    at.f(e6Var.f46863a).k(i10, new Object[0]);
                    at.f(this.f46743q.f46863a).k(at.f14756o1, Long.valueOf(kj.B0(this.f46731b.f16690k)), Integer.valueOf(this.f46731b.f1()), this.f46731b.f16690k.reactions);
                    if (this.f46730a.f47705a >= 0) {
                        str = i20.k(this.f46732c.getMessagesController().Z1(Long.valueOf(this.f46730a.f47705a)));
                    } else {
                        TLRPC.Chat L0 = this.f46732c.getMessagesController().L0(Long.valueOf(-this.f46730a.f47705a));
                        if (L0 == null) {
                            str = "";
                        } else {
                            str = L0.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f46732c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.I1;
                    }
                    if (parentActivity == null) {
                        parentActivity = org.telegram.messenger.w0.f18945b;
                    }
                    new x7(parentActivity, this.f46732c.getResourceProvider(), j10, 5, str2, new b6(this, j10, 0), 0L).show();
                } else {
                    this.f46735i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = r12.i1(this.f46730a.f47705a);
                    tL_messages_sendPaidReaction.msg_id = this.f46730a.f47706b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.f14520b.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != e20.i(this.f46743q.f46863a).e()) {
                        if (c10 == 2666000) {
                            tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                        } else {
                            TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                            tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                            paidreactionprivacypeer.peer = r12.i1(c10);
                        }
                    } else {
                        tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                    }
                    this.f46743q.O();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new mg.x(this, r12, j10));
                }
            }
        } else {
            this.f46736j = true;
            this.f46731b.f((int) (-this.h), c(), this.f46734g);
            e6 e6Var2 = this.f46743q;
            e6Var2.f46867g -= this.h;
            at.f(e6Var2.f46863a).k(i10, new Object[0]);
        }
        this.d.b();
        i4 i4Var = this.f46741o;
        if (i4Var != null && (kjVar = this.f46731b) != null && kjVar.f1() == i4Var.f47101c) {
            this.f46741o.c();
        }
        e6 e6Var3 = this.f46743q;
        if (e6Var3.B == this) {
            e6Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f46740n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f46743q.A(this.f46731b);
    }

    public final String d() {
        if (c() == 2666000) {
            return dd.L0(2131745047, null);
        }
        if (c() != 0 && c() != e20.i(this.f46743q.f46863a).e()) {
            return dd.a0(null, null, 2131745042, org.telegram.messenger.o5.t(c()));
        }
        return dd.L0(2131745043, null);
    }
}
