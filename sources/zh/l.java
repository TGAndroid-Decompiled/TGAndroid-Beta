package zh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import kg.n0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q5;
import org.telegram.messenger.ti;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.yz;
import ug.i1;
import wg.r;
public abstract class l implements f5 {
    public final boolean f62019a;
    public boolean f62020b;
    public final g2 f62024g;
    public final FrameLayout h;
    public final ti f62025i;
    public final long f62026j;
    public final int f62027k;
    public final boolean f62028l;
    public FrameLayout f62029m;
    public nv0 f62030n;
    public nv0 f62031o;
    public ek0 f62032p;
    public yz f62033q;
    public TLRPC.TL_chatInviteImporter f62034r;
    public k f62035s;
    public String f62036t;
    public e f62037u;
    public int v;
    public boolean f62038w;
    public boolean f62040y;
    public boolean f62041z;
    public final ArrayList f62021c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f62022e = new ArrayList();
    public final g f62023f = new g(this);
    public boolean f62039x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final i1 D = new i1(this, 4);

    public l(g2 g2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f62024g = g2Var;
        this.h = frameLayout;
        this.f62026j = j3;
        int currentAccount = g2Var.getCurrentAccount();
        this.f62027k = currentAccount;
        this.f62019a = v3.U(currentAccount, j3);
        this.f62028l = z10;
        this.f62025i = ti.b(currentAccount);
    }

    public static void k(View view, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        if (view != null) {
            int i7 = 0;
            if (view.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (z10 == z12 && f10 == view.getAlpha()) {
                return;
            }
            if (z11) {
                if (z10) {
                    view.setAlpha(0.0f);
                }
                view.setVisibility(0);
                view.animate().alpha(f10).setDuration(150L).start();
                return;
            }
            if (!z10) {
                i7 = 4;
            }
            view.setVisibility(i7);
        }
    }

    public final nv0 a() {
        int i7;
        int i10;
        if (this.f62030n == null) {
            g2 g2Var = this.f62024g;
            nv0 nv0Var = new nv0(g2Var.getParentActivity(), null, 16, g2Var.getResourceProvider());
            this.f62030n = nv0Var;
            boolean z10 = this.f62019a;
            if (z10) {
                i7 = 2131747953;
            } else {
                i7 = 2131748002;
            }
            nv0Var.d.setText(hd.N0(i7, null));
            m80 m80Var = this.f62030n.f37962e;
            if (z10) {
                i10 = 2131747952;
            } else {
                i10 = 2131748001;
            }
            m80Var.setText(hd.N0(i10, null));
            this.f62030n.setAnimateLayoutChange(true);
            this.f62030n.setVisibility(8);
        }
        return this.f62030n;
    }

    public final yz b() {
        if (this.f62033q == null) {
            g2 g2Var = this.f62024g;
            yz yzVar = new yz(g2Var.getParentActivity(), g2Var.getResourceProvider());
            this.f62033q = yzVar;
            yzVar.setAlpha(0.0f);
            if (this.B) {
                t6.h(m6.f29347d6, this.f62033q, g2Var.getResourceProvider());
            }
            this.f62033q.e(m6.f29347d6, m6.f29290a7, -1);
            this.f62033q.setViewType(15);
            this.f62033q.setMemberRequestButton(this.f62019a);
        }
        return this.f62033q;
    }

    public final nv0 c() {
        if (this.f62031o == null) {
            g2 g2Var = this.f62024g;
            nv0 nv0Var = new nv0(g2Var.getParentActivity(), null, 1, g2Var.getResourceProvider());
            this.f62031o = nv0Var;
            if (this.B) {
                t6.h(m6.f29347d6, nv0Var, g2Var.getResourceProvider());
            }
            this.f62031o.d.setText(hd.N0(2131747974, null));
            this.f62031o.f37962e.setText(hd.N0(2131745611, null));
            this.f62031o.setAnimateLayoutChange(true);
            this.f62031o.setVisibility(8);
        }
        return this.f62031o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i7 = this.f62027k;
        tL_messages_hideChatJoinRequest.peer = np.u1(i7).l1(-this.f62026j);
        tL_messages_hideChatJoinRequest.user_id = np.u1(i7).s1(user);
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_hideChatJoinRequest, new n0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z10 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.f62025i.f27006a.get(this.f62026j);
            if (tL_messages_chatInviteImporters != null) {
                this.f62041z = true;
                g(tL_messages_chatInviteImporters, null, true, true);
                z10 = false;
            }
        }
        g0.g3(new rp0(18, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i7;
        int i10;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f62022e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            nv0 nv0Var = this.f62030n;
            if (nv0Var != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                nv0Var.setVisibility(i10);
            }
            nv0 nv0Var2 = this.f62031o;
            if (nv0Var2 != null) {
                nv0Var2.setVisibility(4);
            }
        } else {
            if (this.f62021c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            nv0 nv0Var3 = this.f62030n;
            if (nv0Var3 != null) {
                nv0Var3.setVisibility(4);
            }
            nv0 nv0Var4 = this.f62031o;
            if (nv0Var4 != null) {
                if (z12) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                nv0Var4.setVisibility(i7);
            }
        }
        k(this.f62032p, z12, true);
        if (arrayList.isEmpty()) {
            nv0 nv0Var5 = this.f62030n;
            if (nv0Var5 != null) {
                nv0Var5.setVisibility(0);
            }
            nv0 nv0Var6 = this.f62031o;
            if (nv0Var6 != null) {
                nv0Var6.setVisibility(4);
            }
            k(this.f62033q, false, false);
            if (this.f62040y && this.f62028l) {
                this.f62024g.getActionBar().s().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: zh.l.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f62040y) {
                g0.v1(this.f62024g.getParentActivity().getCurrentFocus());
            }
            r rVar = new r(20, this, (g5) view);
            if (this.f62040y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            g0.h3(rVar, j3);
        }
    }

    public final void i(boolean z10) {
        int i7;
        ek0 ek0Var = this.f62032p;
        if (ek0Var != null && (i7 = !this.f62023f.f62001c.B ? 1 : 0) >= 0 && i7 < ek0Var.getChildCount()) {
            this.f62032p.getChildAt(i7).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f62037u != null) {
            Utilities.f22776g.a(this.f62037u);
            this.f62037u = null;
        }
        int i7 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f62027k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f62036t = str;
        if (this.f62041z && this.f62022e.isEmpty()) {
            k(this.f62033q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f62023f.E(this.f62022e);
            k(this.f62032p, true, true);
            k(this.f62033q, false, false);
            nv0 nv0Var = this.f62031o;
            if (nv0Var != null) {
                nv0Var.setVisibility(4);
            }
            if (str == null && this.f62028l) {
                q0 j3 = this.f62024g.getActionBar().s().j(0);
                if (this.f62022e.isEmpty()) {
                    i7 = 8;
                }
                j3.setVisibility(i7);
            }
        } else {
            this.f62023f.E(Collections.EMPTY_LIST);
            k(this.f62032p, false, false);
            k(this.f62033q, true, true);
            q5 q5Var = Utilities.f22776g;
            e eVar = new e(this, 2);
            this.f62037u = eVar;
            q5Var.d(eVar, 300L);
        }
        if (str != null) {
            nv0 nv0Var2 = this.f62030n;
            if (nv0Var2 != null) {
                nv0Var2.setVisibility(4);
            }
            nv0 nv0Var3 = this.f62031o;
            if (nv0Var3 != null) {
                nv0Var3.setVisibility(4);
            }
        }
    }
}
