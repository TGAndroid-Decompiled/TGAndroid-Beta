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
    public final boolean f59543a;
    public boolean f59544b;
    public final f2 f59548g;
    public final FrameLayout h;
    public final vi f59549i;
    public final long f59550j;
    public final int f59551k;
    public final boolean f59552l;
    public FrameLayout f59553m;
    public av0 f59554n;
    public av0 f59555o;
    public pj0 f59556p;
    public mz f59557q;
    public TLRPC.TL_chatInviteImporter f59558r;
    public l f59559s;
    public String f59560t;
    public e f59561u;
    public int v;
    public boolean f59562w;
    public boolean f59564y;
    public boolean f59565z;
    public final ArrayList f59545c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f59546e = new ArrayList();
    public final h f59547f = new h(this);
    public boolean f59563x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final f D = new f(this, 0);

    public m(f2 f2Var, FrameLayout frameLayout, long j3, boolean z9) {
        this.f59548g = f2Var;
        this.h = frameLayout;
        this.f59550j = j3;
        int currentAccount = f2Var.getCurrentAccount();
        this.f59551k = currentAccount;
        this.f59543a = t3.U(currentAccount, j3);
        this.f59552l = z9;
        this.f59549i = vi.b(currentAccount);
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
        if (this.f59554n == null) {
            f2 f2Var = this.f59548g;
            av0 av0Var = new av0(f2Var.getParentActivity(), null, 16, f2Var.getResourceProvider());
            this.f59554n = av0Var;
            boolean z9 = this.f59543a;
            if (z9) {
                i7 = 2131748147;
            } else {
                i7 = 2131748196;
            }
            av0Var.d.setText(id.M0(i7, null));
            w70 w70Var = this.f59554n.f31927e;
            if (z9) {
                i10 = 2131748146;
            } else {
                i10 = 2131748195;
            }
            w70Var.setText(id.M0(i10, null));
            this.f59554n.setAnimateLayoutChange(true);
            this.f59554n.setVisibility(8);
        }
        return this.f59554n;
    }

    public final mz b() {
        if (this.f59557q == null) {
            f2 f2Var = this.f59548g;
            mz mzVar = new mz(f2Var.getParentActivity(), f2Var.getResourceProvider());
            this.f59557q = mzVar;
            mzVar.setAlpha(0.0f);
            if (this.B) {
                r6.i(k6.f27852d6, this.f59557q, f2Var.getResourceProvider());
            }
            this.f59557q.e(k6.f27852d6, k6.f27796a7, -1);
            this.f59557q.setViewType(15);
            this.f59557q.setMemberRequestButton(this.f59543a);
        }
        return this.f59557q;
    }

    public final av0 c() {
        if (this.f59555o == null) {
            f2 f2Var = this.f59548g;
            av0 av0Var = new av0(f2Var.getParentActivity(), null, 1, f2Var.getResourceProvider());
            this.f59555o = av0Var;
            if (this.B) {
                r6.i(k6.f27852d6, av0Var, f2Var.getResourceProvider());
            }
            this.f59555o.d.setText(id.M0(2131748168, null));
            this.f59555o.f31927e.setText(id.M0(2131745810, null));
            this.f59555o.setAnimateLayoutChange(true);
            this.f59555o.setVisibility(8);
        }
        return this.f59555o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z9) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z9;
        int i7 = this.f59551k;
        tL_messages_hideChatJoinRequest.peer = qp.s1(i7).j1(-this.f59550j);
        tL_messages_hideChatJoinRequest.user_id = qp.s1(i7).q1(user);
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_hideChatJoinRequest, new l0(this, tL_chatInviteImporter, z9, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z9 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.f59549i.f25991a.get(this.f59550j);
            if (tL_messages_chatInviteImporters != null) {
                this.f59565z = true;
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
        ArrayList arrayList = this.f59546e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z9) {
                z11 = false;
            } else {
                z11 = true;
            }
            av0 av0Var = this.f59554n;
            if (av0Var != null) {
                if (z11) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                av0Var.setVisibility(i10);
            }
            av0 av0Var2 = this.f59555o;
            if (av0Var2 != null) {
                av0Var2.setVisibility(4);
            }
        } else {
            if (this.f59545c.isEmpty() && !z9) {
                z11 = false;
            } else {
                z11 = true;
            }
            av0 av0Var3 = this.f59554n;
            if (av0Var3 != null) {
                av0Var3.setVisibility(4);
            }
            av0 av0Var4 = this.f59555o;
            if (av0Var4 != null) {
                if (z11) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                av0Var4.setVisibility(i7);
            }
        }
        k(this.f59556p, z11, true);
        if (arrayList.isEmpty()) {
            av0 av0Var5 = this.f59554n;
            if (av0Var5 != null) {
                av0Var5.setVisibility(0);
            }
            av0 av0Var6 = this.f59555o;
            if (av0Var6 != null) {
                av0Var6.setVisibility(4);
            }
            k(this.f59557q, false, false);
            if (this.f59564y && this.f59552l) {
                this.f59548g.getActionBar().q().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: yh.m.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof e5) {
            if (this.f59564y) {
                g0.v1(this.f59548g.getParentActivity().getCurrentFocus());
            }
            yf.b bVar = new yf.b(4, this, (e5) view);
            if (this.f59564y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            g0.i3(bVar, j3);
        }
    }

    public final void i(boolean z9) {
        int i7;
        pj0 pj0Var = this.f59556p;
        if (pj0Var != null && (i7 = !this.f59547f.f59525c.B ? 1 : 0) >= 0 && i7 < pj0Var.getChildCount()) {
            this.f59556p.getChildAt(i7).setEnabled(z9);
        }
    }

    public final void j(String str) {
        if (this.f59561u != null) {
            Utilities.f21338g.a(this.f59561u);
            this.f59561u = null;
        }
        int i7 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f59551k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f59560t = str;
        if (this.f59565z && this.f59546e.isEmpty()) {
            k(this.f59557q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f59547f.E(this.f59546e);
            k(this.f59556p, true, true);
            k(this.f59557q, false, false);
            av0 av0Var = this.f59555o;
            if (av0Var != null) {
                av0Var.setVisibility(4);
            }
            if (str == null && this.f59552l) {
                r0 j3 = this.f59548g.getActionBar().q().j(0);
                if (this.f59546e.isEmpty()) {
                    i7 = 8;
                }
                j3.setVisibility(i7);
            }
        } else {
            this.f59547f.E(Collections.EMPTY_LIST);
            k(this.f59556p, false, false);
            k(this.f59557q, true, true);
            p5 p5Var = Utilities.f21338g;
            e eVar = new e(this, 2);
            this.f59561u = eVar;
            p5Var.d(eVar, 300L);
        }
        if (str != null) {
            av0 av0Var2 = this.f59554n;
            if (av0Var2 != null) {
                av0Var2.setVisibility(4);
            }
            av0 av0Var3 = this.f59555o;
            if (av0Var3 != null) {
                av0Var3.setVisibility(4);
            }
        }
    }
}
