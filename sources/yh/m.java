package yh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import kg.l0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.p5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.messenger.vi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r0;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.d5;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.w70;
public abstract class m implements d5 {
    public final boolean f59542a;
    public boolean f59543b;
    public final f2 f59547g;
    public final FrameLayout h;
    public final vi f59548i;
    public final long f59549j;
    public final int f59550k;
    public final boolean f59551l;
    public FrameLayout f59552m;
    public av0 f59553n;
    public av0 f59554o;
    public pj0 f59555p;
    public mz f59556q;
    public TLRPC.TL_chatInviteImporter f59557r;
    public l f59558s;
    public String f59559t;
    public e f59560u;
    public int v;
    public boolean f59561w;
    public boolean f59563y;
    public boolean f59564z;
    public final ArrayList f59544c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f59545e = new ArrayList();
    public final h f59546f = new h(this);
    public boolean f59562x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final f D = new f(this, 0);

    public m(f2 f2Var, FrameLayout frameLayout, long j3, boolean z9) {
        this.f59547g = f2Var;
        this.h = frameLayout;
        this.f59549j = j3;
        int currentAccount = f2Var.getCurrentAccount();
        this.f59550k = currentAccount;
        this.f59542a = t3.U(currentAccount, j3);
        this.f59551l = z9;
        this.f59548i = vi.b(currentAccount);
    }

    public static void k(View view, boolean z9, boolean z10) {
        boolean z11;
        float f10;
        if (view != null) {
            int i7 = 0;
            if (view.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (z9 == z11 && f10 == view.getAlpha()) {
                return;
            }
            if (z10) {
                if (z9) {
                    view.setAlpha(0.0f);
                }
                view.setVisibility(0);
                view.animate().alpha(f10).setDuration(150L).start();
                return;
            }
            if (!z9) {
                i7 = 4;
            }
            view.setVisibility(i7);
        }
    }

    public final av0 a() {
        int i7;
        int i10;
        if (this.f59553n == null) {
            f2 f2Var = this.f59547g;
            av0 av0Var = new av0(f2Var.getParentActivity(), null, 16, f2Var.getResourceProvider());
            this.f59553n = av0Var;
            boolean z9 = this.f59542a;
            if (z9) {
                i7 = 2131748147;
            } else {
                i7 = 2131748196;
            }
            av0Var.d.setText(id.M0(i7, null));
            w70 w70Var = this.f59553n.f31927e;
            if (z9) {
                i10 = 2131748146;
            } else {
                i10 = 2131748195;
            }
            w70Var.setText(id.M0(i10, null));
            this.f59553n.setAnimateLayoutChange(true);
            this.f59553n.setVisibility(8);
        }
        return this.f59553n;
    }

    public final mz b() {
        if (this.f59556q == null) {
            f2 f2Var = this.f59547g;
            mz mzVar = new mz(f2Var.getParentActivity(), f2Var.getResourceProvider());
            this.f59556q = mzVar;
            mzVar.setAlpha(0.0f);
            if (this.B) {
                r6.i(k6.f27852d6, this.f59556q, f2Var.getResourceProvider());
            }
            this.f59556q.e(k6.f27852d6, k6.f27796a7, -1);
            this.f59556q.setViewType(15);
            this.f59556q.setMemberRequestButton(this.f59542a);
        }
        return this.f59556q;
    }

    public final av0 c() {
        if (this.f59554o == null) {
            f2 f2Var = this.f59547g;
            av0 av0Var = new av0(f2Var.getParentActivity(), null, 1, f2Var.getResourceProvider());
            this.f59554o = av0Var;
            if (this.B) {
                r6.i(k6.f27852d6, av0Var, f2Var.getResourceProvider());
            }
            this.f59554o.d.setText(id.M0(2131748168, null));
            this.f59554o.f31927e.setText(id.M0(2131745810, null));
            this.f59554o.setAnimateLayoutChange(true);
            this.f59554o.setVisibility(8);
        }
        return this.f59554o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z9) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z9;
        int i7 = this.f59550k;
        tL_messages_hideChatJoinRequest.peer = qp.s1(i7).j1(-this.f59549j);
        tL_messages_hideChatJoinRequest.user_id = qp.s1(i7).q1(user);
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_hideChatJoinRequest, new l0(this, tL_chatInviteImporter, z9, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z9 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.f59548i.f25991a.get(this.f59549j);
            if (tL_messages_chatInviteImporters != null) {
                this.f59564z = true;
                g(tL_messages_chatInviteImporters, null, true, true);
                z9 = false;
            }
        }
        g0.h3(new tp0(17, this, z9));
    }

    public void f(String str, boolean z9, boolean z10) {
        boolean z11;
        int i7;
        int i10;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f59545e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z9) {
                z11 = false;
            } else {
                z11 = true;
            }
            av0 av0Var = this.f59553n;
            if (av0Var != null) {
                if (z11) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                av0Var.setVisibility(i10);
            }
            av0 av0Var2 = this.f59554o;
            if (av0Var2 != null) {
                av0Var2.setVisibility(4);
            }
        } else {
            if (this.f59544c.isEmpty() && !z9) {
                z11 = false;
            } else {
                z11 = true;
            }
            av0 av0Var3 = this.f59553n;
            if (av0Var3 != null) {
                av0Var3.setVisibility(4);
            }
            av0 av0Var4 = this.f59554o;
            if (av0Var4 != null) {
                if (z11) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                av0Var4.setVisibility(i7);
            }
        }
        k(this.f59555p, z11, true);
        if (arrayList.isEmpty()) {
            av0 av0Var5 = this.f59553n;
            if (av0Var5 != null) {
                av0Var5.setVisibility(0);
            }
            av0 av0Var6 = this.f59554o;
            if (av0Var6 != null) {
                av0Var6.setVisibility(4);
            }
            k(this.f59556q, false, false);
            if (this.f59563y && this.f59551l) {
                this.f59547g.getActionBar().q().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: yh.m.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof e5) {
            if (this.f59563y) {
                g0.v1(this.f59547g.getParentActivity().getCurrentFocus());
            }
            yf.b bVar = new yf.b(4, this, (e5) view);
            if (this.f59563y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            g0.i3(bVar, j3);
        }
    }

    public final void i(boolean z9) {
        int i7;
        pj0 pj0Var = this.f59555p;
        if (pj0Var != null && (i7 = !this.f59546f.f59524c.B ? 1 : 0) >= 0 && i7 < pj0Var.getChildCount()) {
            this.f59555p.getChildAt(i7).setEnabled(z9);
        }
    }

    public final void j(String str) {
        if (this.f59560u != null) {
            Utilities.f21338g.a(this.f59560u);
            this.f59560u = null;
        }
        int i7 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f59550k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f59559t = str;
        if (this.f59564z && this.f59545e.isEmpty()) {
            k(this.f59556q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f59546f.E(this.f59545e);
            k(this.f59555p, true, true);
            k(this.f59556q, false, false);
            av0 av0Var = this.f59554o;
            if (av0Var != null) {
                av0Var.setVisibility(4);
            }
            if (str == null && this.f59551l) {
                r0 j3 = this.f59547g.getActionBar().q().j(0);
                if (this.f59545e.isEmpty()) {
                    i7 = 8;
                }
                j3.setVisibility(i7);
            }
        } else {
            this.f59546f.E(Collections.EMPTY_LIST);
            k(this.f59555p, false, false);
            k(this.f59556q, true, true);
            p5 p5Var = Utilities.f21338g;
            e eVar = new e(this, 2);
            this.f59560u = eVar;
            p5Var.d(eVar, 300L);
        }
        if (str != null) {
            av0 av0Var2 = this.f59553n;
            if (av0Var2 != null) {
                av0Var2.setVisibility(4);
            }
            av0 av0Var3 = this.f59554o;
            if (av0Var3 != null) {
                av0Var3.setVisibility(4);
            }
        }
    }
}
