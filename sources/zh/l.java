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
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.q5;
import org.telegram.messenger.si;
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
    public final boolean f62050a;
    public boolean f62051b;
    public final g2 f62055g;
    public final FrameLayout h;
    public final si f62056i;
    public final long f62057j;
    public final int f62058k;
    public final boolean f62059l;
    public FrameLayout f62060m;
    public nv0 f62061n;
    public nv0 f62062o;
    public ek0 f62063p;
    public yz f62064q;
    public TLRPC.TL_chatInviteImporter f62065r;
    public k f62066s;
    public String f62067t;
    public e f62068u;
    public int v;
    public boolean f62069w;
    public boolean f62071y;
    public boolean f62072z;
    public final ArrayList f62052c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f62053e = new ArrayList();
    public final g f62054f = new g(this);
    public boolean f62070x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final i1 D = new i1(this, 4);

    public l(g2 g2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f62055g = g2Var;
        this.h = frameLayout;
        this.f62057j = j3;
        int currentAccount = g2Var.getCurrentAccount();
        this.f62058k = currentAccount;
        this.f62050a = v3.U(currentAccount, j3);
        this.f62059l = z10;
        this.f62056i = si.b(currentAccount);
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
        if (this.f62061n == null) {
            g2 g2Var = this.f62055g;
            nv0 nv0Var = new nv0(g2Var.getParentActivity(), null, 16, g2Var.getResourceProvider());
            this.f62061n = nv0Var;
            boolean z10 = this.f62050a;
            if (z10) {
                i7 = 2131747953;
            } else {
                i7 = 2131748002;
            }
            nv0Var.d.setText(gd.N0(i7, null));
            m80 m80Var = this.f62061n.f37991e;
            if (z10) {
                i10 = 2131747952;
            } else {
                i10 = 2131748001;
            }
            m80Var.setText(gd.N0(i10, null));
            this.f62061n.setAnimateLayoutChange(true);
            this.f62061n.setVisibility(8);
        }
        return this.f62061n;
    }

    public final yz b() {
        if (this.f62064q == null) {
            g2 g2Var = this.f62055g;
            yz yzVar = new yz(g2Var.getParentActivity(), g2Var.getResourceProvider());
            this.f62064q = yzVar;
            yzVar.setAlpha(0.0f);
            if (this.B) {
                t6.h(m6.f29378d6, this.f62064q, g2Var.getResourceProvider());
            }
            this.f62064q.e(m6.f29378d6, m6.f29321a7, -1);
            this.f62064q.setViewType(15);
            this.f62064q.setMemberRequestButton(this.f62050a);
        }
        return this.f62064q;
    }

    public final nv0 c() {
        if (this.f62062o == null) {
            g2 g2Var = this.f62055g;
            nv0 nv0Var = new nv0(g2Var.getParentActivity(), null, 1, g2Var.getResourceProvider());
            this.f62062o = nv0Var;
            if (this.B) {
                t6.h(m6.f29378d6, nv0Var, g2Var.getResourceProvider());
            }
            this.f62062o.d.setText(gd.N0(2131747974, null));
            this.f62062o.f37991e.setText(gd.N0(2131745611, null));
            this.f62062o.setAnimateLayoutChange(true);
            this.f62062o.setVisibility(8);
        }
        return this.f62062o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i7 = this.f62058k;
        tL_messages_hideChatJoinRequest.peer = mp.u1(i7).l1(-this.f62057j);
        tL_messages_hideChatJoinRequest.user_id = mp.u1(i7).s1(user);
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_hideChatJoinRequest, new n0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z10 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.f62056i.f26842a.get(this.f62057j);
            if (tL_messages_chatInviteImporters != null) {
                this.f62072z = true;
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
        ArrayList arrayList = this.f62053e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            nv0 nv0Var = this.f62061n;
            if (nv0Var != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                nv0Var.setVisibility(i10);
            }
            nv0 nv0Var2 = this.f62062o;
            if (nv0Var2 != null) {
                nv0Var2.setVisibility(4);
            }
        } else {
            if (this.f62052c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            nv0 nv0Var3 = this.f62061n;
            if (nv0Var3 != null) {
                nv0Var3.setVisibility(4);
            }
            nv0 nv0Var4 = this.f62062o;
            if (nv0Var4 != null) {
                if (z12) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                nv0Var4.setVisibility(i7);
            }
        }
        k(this.f62063p, z12, true);
        if (arrayList.isEmpty()) {
            nv0 nv0Var5 = this.f62061n;
            if (nv0Var5 != null) {
                nv0Var5.setVisibility(0);
            }
            nv0 nv0Var6 = this.f62062o;
            if (nv0Var6 != null) {
                nv0Var6.setVisibility(4);
            }
            k(this.f62064q, false, false);
            if (this.f62071y && this.f62059l) {
                this.f62055g.getActionBar().s().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: zh.l.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f62071y) {
                g0.v1(this.f62055g.getParentActivity().getCurrentFocus());
            }
            q qVar = new q(22, this, (g5) view);
            if (this.f62071y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            g0.h3(qVar, j3);
        }
    }

    public final void i(boolean z10) {
        int i7;
        ek0 ek0Var = this.f62063p;
        if (ek0Var != null && (i7 = !this.f62054f.f62032c.B ? 1 : 0) >= 0 && i7 < ek0Var.getChildCount()) {
            this.f62063p.getChildAt(i7).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f62068u != null) {
            Utilities.f22809g.a(this.f62068u);
            this.f62068u = null;
        }
        int i7 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f62058k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f62067t = str;
        if (this.f62072z && this.f62053e.isEmpty()) {
            k(this.f62064q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f62054f.E(this.f62053e);
            k(this.f62063p, true, true);
            k(this.f62064q, false, false);
            nv0 nv0Var = this.f62062o;
            if (nv0Var != null) {
                nv0Var.setVisibility(4);
            }
            if (str == null && this.f62059l) {
                q0 j3 = this.f62055g.getActionBar().s().j(0);
                if (this.f62053e.isEmpty()) {
                    i7 = 8;
                }
                j3.setVisibility(i7);
            }
        } else {
            this.f62054f.E(Collections.EMPTY_LIST);
            k(this.f62063p, false, false);
            k(this.f62064q, true, true);
            q5 q5Var = Utilities.f22809g;
            e eVar = new e(this, 2);
            this.f62068u = eVar;
            q5Var.d(eVar, 300L);
        }
        if (str != null) {
            nv0 nv0Var2 = this.f62061n;
            if (nv0Var2 != null) {
                nv0Var2.setVisibility(4);
            }
            nv0 nv0Var3 = this.f62062o;
            if (nv0Var3 != null) {
                nv0Var3.setVisibility(4);
            }
        }
    }
}
