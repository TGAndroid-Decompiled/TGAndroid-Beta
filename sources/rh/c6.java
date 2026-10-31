package rh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
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
    public final x5 f46716a;
    public final jj f46717b;
    public final un f46718c;
    public final wb d;
    public final qb e;
    public final d6 f46719f;
    public final boolean f46720g;
    public long h;
    public long f46723k;
    public boolean f46724l;
    public boolean f46725m;
    public i4 f46727o;
    public final a6 f46728p;
    public final e6 f46729q;
    public boolean f46721i = false;
    public boolean f46722j = false;
    public Long f46726n = null;

    public c6(e6 e6Var, x5 x5Var, jj jjVar, un unVar, boolean z10) {
        this.f46729q = e6Var;
        boolean z11 = false;
        a6 a6Var = new a6(this, 0);
        this.f46728p = a6Var;
        this.f46716a = x5Var;
        this.f46717b = jjVar;
        this.f46718c = unVar;
        Context t10 = e6.t(unVar);
        qb qbVar = new qb(t10, unVar.f42477xa);
        this.e = qbVar;
        qbVar.c(2131624224, new String[0]);
        qbVar.f29623b.setText(d());
        ub ubVar = new ub(t10, unVar.f42477xa, true, false);
        ubVar.e(cd.L0(2131745041, null));
        ubVar.f30890b = new a6(this, 1);
        ?? pbVar = new pb(t10, unVar.f42477xa);
        this.f46719f = pbVar;
        pbVar.f29331b = 5000L;
        int i10 = org.telegram.ui.ActionBar.t6.uj;
        sn snVar = unVar.f42477xa;
        org.telegram.utils.twidget.t tVar = new org.telegram.utils.twidget.t(28);
        org.telegram.utils.twidget.t tVar2 = new org.telegram.utils.twidget.t(29);
        int Q = org.telegram.ui.ActionBar.a7.Q(i10, -1, 0, 0.0f, snVar);
        tVar2.d(Q, pbVar);
        org.telegram.ui.ActionBar.u6 x10 = org.telegram.ui.ActionBar.a7.x(101, pbVar);
        x10.c(i10, -1, 0, 0.0f, snVar);
        x10.f21396n = tVar;
        x10.f21397o = tVar2;
        x10.f21395m = false;
        x10.f21390g = Q;
        ubVar.addView((View) pbVar, w7.b6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ubVar.e.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(8.0f));
        qbVar.setButton(ubVar);
        wb b10 = cc.a0(unVar).b(qbVar, -1);
        this.d = b10;
        b10.f32143r = false;
        if (z10) {
            b10.k(true);
            this.f46725m = true;
        }
        b10.v = a6Var;
        this.h = 0L;
        System.currentTimeMillis();
        if (jjVar.f16337k.reactions != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= jjVar.f16337k.reactions.results.size()) {
                    break;
                } else if (jjVar.f16337k.reactions.results.get(i11).reaction instanceof TLRPC.TL_reactionPaid) {
                    z11 = jjVar.f16337k.reactions.results.get(i11).chosen;
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f46720g = z11;
    }

    public final void a() {
        e6 e6Var = this.f46729q;
        int i10 = e6Var.f46849a;
        org.telegram.messenger.i0.r(this.f46728p);
        this.f46722j = true;
        this.d.b();
        i4 i4Var = this.f46727o;
        if (i4Var != null) {
            i4Var.c();
        }
        boolean z10 = this.f46720g;
        long c10 = c();
        jj jjVar = this.f46717b;
        jjVar.f((int) (-this.h), c10, z10);
        e6Var.f46853g -= this.h;
        zs.f(i10).k(zs.y3, new Object[0]);
        zs.f(i10).k(zs.f19660o1, Long.valueOf(jj.B0(jjVar.f16337k)), Integer.valueOf(jjVar.f1()), jjVar.f16337k.reactions);
        if (e6Var.B == this) {
            e6Var.B = null;
        }
    }

    public final void b() {
        jj jjVar;
        String str;
        int i10 = zs.y3;
        org.telegram.messenger.i0.r(this.f46728p);
        if (this.f46724l) {
            if (!this.f46721i && !this.f46722j) {
                e6 y3 = e6.y(this.f46729q.f46849a, false);
                vp r12 = vp.r1(this.f46729q.f46849a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f46729q.f46849a);
                long j10 = this.h;
                if (y3.e && y3.q(null, false, false).amount < j10) {
                    this.f46722j = true;
                    this.f46717b.f((int) (-this.h), c(), this.f46720g);
                    e6 e6Var = this.f46729q;
                    e6Var.f46853g = 0L;
                    zs.f(e6Var.f46849a).k(i10, new Object[0]);
                    zs.f(this.f46729q.f46849a).k(zs.f19660o1, Long.valueOf(jj.B0(this.f46717b.f16337k)), Integer.valueOf(this.f46717b.f1()), this.f46717b.f16337k.reactions);
                    if (this.f46716a.f47691a >= 0) {
                        str = h20.k(this.f46718c.getMessagesController().Z1(Long.valueOf(this.f46716a.f47691a)));
                    } else {
                        TLRPC.Chat L0 = this.f46718c.getMessagesController().L0(Long.valueOf(-this.f46716a.f47691a));
                        if (L0 == null) {
                            str = "";
                        } else {
                            str = L0.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f46718c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.I1;
                    }
                    if (parentActivity == null) {
                        parentActivity = org.telegram.messenger.w0.f19025b;
                    }
                    new x7(parentActivity, this.f46718c.getResourceProvider(), j10, 5, str2, new b6(this, j10, 0), 0L).show();
                } else {
                    this.f46721i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = r12.i1(this.f46716a.f47691a);
                    tL_messages_sendPaidReaction.msg_id = this.f46716a.f47692b;
                    tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.f14519b.nextLong() & 4294967295L);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != d20.i(this.f46729q.f46849a).e()) {
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
                    this.f46729q.O();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new mg.x(this, r12, j10));
                }
            }
        } else {
            this.f46722j = true;
            this.f46717b.f((int) (-this.h), c(), this.f46720g);
            e6 e6Var2 = this.f46729q;
            e6Var2.f46853g -= this.h;
            zs.f(e6Var2.f46849a).k(i10, new Object[0]);
        }
        this.d.b();
        i4 i4Var = this.f46727o;
        if (i4Var != null && (jjVar = this.f46717b) != null && jjVar.f1() == i4Var.f47087c) {
            this.f46727o.c();
        }
        e6 e6Var3 = this.f46729q;
        if (e6Var3.B == this) {
            e6Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.f46726n;
        if (l4 != null) {
            return l4.longValue();
        }
        return this.f46729q.A(this.f46717b);
    }

    public final String d() {
        if (c() == 2666000) {
            return cd.L0(2131745047, null);
        }
        if (c() != 0 && c() != d20.i(this.f46729q.f46849a).e()) {
            return cd.a0(null, null, 2131745042, org.telegram.messenger.o5.t(c()));
        }
        return cd.L0(2131745043, null);
    }
}
