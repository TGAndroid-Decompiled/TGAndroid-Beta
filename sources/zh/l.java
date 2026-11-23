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
import wg.q;
public abstract class l implements f5 {
    public final boolean f62054a;
    public boolean f62055b;
    public final g2 f62059g;
    public final FrameLayout h;
    public final ti f62060i;
    public final long f62061j;
    public final int f62062k;
    public final boolean f62063l;
    public FrameLayout f62064m;
    public nv0 f62065n;
    public nv0 f62066o;
    public ek0 f62067p;
    public yz f62068q;
    public TLRPC.TL_chatInviteImporter f62069r;
    public k f62070s;
    public String f62071t;
    public e f62072u;
    public int v;
    public boolean f62073w;
    public boolean f62075y;
    public boolean f62076z;
    public final ArrayList f62056c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f62057e = new ArrayList();
    public final g f62058f = new g(this);
    public boolean f62074x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final i1 D = new i1(this, 4);

    public l(g2 g2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f62059g = g2Var;
        this.h = frameLayout;
        this.f62061j = j3;
        int currentAccount = g2Var.getCurrentAccount();
        this.f62062k = currentAccount;
        this.f62054a = v3.U(currentAccount, j3);
        this.f62063l = z10;
        this.f62060i = ti.b(currentAccount);
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
        if (this.f62065n == null) {
            g2 g2Var = this.f62059g;
            nv0 nv0Var = new nv0(g2Var.getParentActivity(), null, 16, g2Var.getResourceProvider());
            this.f62065n = nv0Var;
            boolean z10 = this.f62054a;
            if (z10) {
                i7 = 2131747953;
            } else {
                i7 = 2131748002;
            }
            nv0Var.d.setText(hd.N0(i7, null));
            m80 m80Var = this.f62065n.f37996e;
            if (z10) {
                i10 = 2131747952;
            } else {
                i10 = 2131748001;
            }
            m80Var.setText(hd.N0(i10, null));
            this.f62065n.setAnimateLayoutChange(true);
            this.f62065n.setVisibility(8);
        }
        return this.f62065n;
    }

    public final yz b() {
        if (this.f62068q == null) {
            g2 g2Var = this.f62059g;
            yz yzVar = new yz(g2Var.getParentActivity(), g2Var.getResourceProvider());
            this.f62068q = yzVar;
            yzVar.setAlpha(0.0f);
            if (this.B) {
                t6.h(m6.f29381d6, this.f62068q, g2Var.getResourceProvider());
            }
            this.f62068q.e(m6.f29381d6, m6.f29324a7, -1);
            this.f62068q.setViewType(15);
            this.f62068q.setMemberRequestButton(this.f62054a);
        }
        return this.f62068q;
    }

    public final nv0 c() {
        if (this.f62066o == null) {
            g2 g2Var = this.f62059g;
            nv0 nv0Var = new nv0(g2Var.getParentActivity(), null, 1, g2Var.getResourceProvider());
            this.f62066o = nv0Var;
            if (this.B) {
                t6.h(m6.f29381d6, nv0Var, g2Var.getResourceProvider());
            }
            this.f62066o.d.setText(hd.N0(2131747974, null));
            this.f62066o.f37996e.setText(hd.N0(2131745611, null));
            this.f62066o.setAnimateLayoutChange(true);
            this.f62066o.setVisibility(8);
        }
        return this.f62066o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i7 = this.f62062k;
        tL_messages_hideChatJoinRequest.peer = np.u1(i7).l1(-this.f62061j);
        tL_messages_hideChatJoinRequest.user_id = np.u1(i7).s1(user);
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_hideChatJoinRequest, new n0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z10 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.f62060i.f27042a.get(this.f62061j);
            if (tL_messages_chatInviteImporters != null) {
                this.f62076z = true;
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
        ArrayList arrayList = this.f62057e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            nv0 nv0Var = this.f62065n;
            if (nv0Var != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                nv0Var.setVisibility(i10);
            }
            nv0 nv0Var2 = this.f62066o;
            if (nv0Var2 != null) {
                nv0Var2.setVisibility(4);
            }
        } else {
            if (this.f62056c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            nv0 nv0Var3 = this.f62065n;
            if (nv0Var3 != null) {
                nv0Var3.setVisibility(4);
            }
            nv0 nv0Var4 = this.f62066o;
            if (nv0Var4 != null) {
                if (z12) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                nv0Var4.setVisibility(i7);
            }
        }
        k(this.f62067p, z12, true);
        if (arrayList.isEmpty()) {
            nv0 nv0Var5 = this.f62065n;
            if (nv0Var5 != null) {
                nv0Var5.setVisibility(0);
            }
            nv0 nv0Var6 = this.f62066o;
            if (nv0Var6 != null) {
                nv0Var6.setVisibility(4);
            }
            k(this.f62068q, false, false);
            if (this.f62075y && this.f62063l) {
                this.f62059g.getActionBar().s().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: zh.l.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f62075y) {
                g0.v1(this.f62059g.getParentActivity().getCurrentFocus());
            }
            q qVar = new q(22, this, (g5) view);
            if (this.f62075y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            g0.h3(qVar, j3);
        }
    }

    public final void i(boolean z10) {
        int i7;
        ek0 ek0Var = this.f62067p;
        if (ek0Var != null && (i7 = !this.f62058f.f62036c.B ? 1 : 0) >= 0 && i7 < ek0Var.getChildCount()) {
            this.f62067p.getChildAt(i7).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f62072u != null) {
            Utilities.f22812g.a(this.f62072u);
            this.f62072u = null;
        }
        int i7 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f62062k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f62071t = str;
        if (this.f62076z && this.f62057e.isEmpty()) {
            k(this.f62068q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f62058f.E(this.f62057e);
            k(this.f62067p, true, true);
            k(this.f62068q, false, false);
            nv0 nv0Var = this.f62066o;
            if (nv0Var != null) {
                nv0Var.setVisibility(4);
            }
            if (str == null && this.f62063l) {
                q0 j3 = this.f62059g.getActionBar().s().j(0);
                if (this.f62057e.isEmpty()) {
                    i7 = 8;
                }
                j3.setVisibility(i7);
            }
        } else {
            this.f62058f.E(Collections.EMPTY_LIST);
            k(this.f62067p, false, false);
            k(this.f62068q, true, true);
            q5 q5Var = Utilities.f22812g;
            e eVar = new e(this, 2);
            this.f62072u = eVar;
            q5Var.d(eVar, 300L);
        }
        if (str != null) {
            nv0 nv0Var2 = this.f62065n;
            if (nv0Var2 != null) {
                nv0Var2.setVisibility(4);
            }
            nv0 nv0Var3 = this.f62066o;
            if (nv0Var3 != null) {
                nv0Var3.setVisibility(4);
            }
        }
    }
}
