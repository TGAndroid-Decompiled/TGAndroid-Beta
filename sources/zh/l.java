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
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.vz;
import ug.i1;
public abstract class l implements e5 {
    public final boolean f62137a;
    public boolean f62138b;
    public final g2 f62142g;
    public final FrameLayout h;
    public final si f62143i;
    public final long f62144j;
    public final int f62145k;
    public final boolean f62146l;
    public FrameLayout f62147m;
    public mv0 f62148n;
    public mv0 f62149o;
    public ek0 f62150p;
    public vz f62151q;
    public TLRPC.TL_chatInviteImporter f62152r;
    public k f62153s;
    public String f62154t;
    public e f62155u;
    public int v;
    public boolean f62156w;
    public boolean f62158y;
    public boolean f62159z;
    public final ArrayList f62139c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f62140e = new ArrayList();
    public final g f62141f = new g(this);
    public boolean f62157x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final i1 D = new i1(this, 4);

    public l(g2 g2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f62142g = g2Var;
        this.h = frameLayout;
        this.f62144j = j3;
        int currentAccount = g2Var.getCurrentAccount();
        this.f62145k = currentAccount;
        this.f62137a = v3.U(currentAccount, j3);
        this.f62146l = z10;
        this.f62143i = si.b(currentAccount);
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

    public final mv0 a() {
        int i7;
        int i10;
        if (this.f62148n == null) {
            g2 g2Var = this.f62142g;
            mv0 mv0Var = new mv0(g2Var.getParentActivity(), null, 16, g2Var.getResourceProvider());
            this.f62148n = mv0Var;
            boolean z10 = this.f62137a;
            if (z10) {
                i7 = 2131747953;
            } else {
                i7 = 2131748002;
            }
            mv0Var.d.setText(gd.N0(i7, null));
            j80 j80Var = this.f62148n.f37553e;
            if (z10) {
                i10 = 2131747952;
            } else {
                i10 = 2131748001;
            }
            j80Var.setText(gd.N0(i10, null));
            this.f62148n.setAnimateLayoutChange(true);
            this.f62148n.setVisibility(8);
        }
        return this.f62148n;
    }

    public final vz b() {
        if (this.f62151q == null) {
            g2 g2Var = this.f62142g;
            vz vzVar = new vz(g2Var.getParentActivity(), g2Var.getResourceProvider());
            this.f62151q = vzVar;
            vzVar.setAlpha(0.0f);
            if (this.B) {
                u6.h(n6.f29451d6, this.f62151q, g2Var.getResourceProvider());
            }
            this.f62151q.e(n6.f29451d6, n6.f29394a7, -1);
            this.f62151q.setViewType(15);
            this.f62151q.setMemberRequestButton(this.f62137a);
        }
        return this.f62151q;
    }

    public final mv0 c() {
        if (this.f62149o == null) {
            g2 g2Var = this.f62142g;
            mv0 mv0Var = new mv0(g2Var.getParentActivity(), null, 1, g2Var.getResourceProvider());
            this.f62149o = mv0Var;
            if (this.B) {
                u6.h(n6.f29451d6, mv0Var, g2Var.getResourceProvider());
            }
            this.f62149o.d.setText(gd.N0(2131747974, null));
            this.f62149o.f37553e.setText(gd.N0(2131745611, null));
            this.f62149o.setAnimateLayoutChange(true);
            this.f62149o.setVisibility(8);
        }
        return this.f62149o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i7 = this.f62145k;
        tL_messages_hideChatJoinRequest.peer = mp.u1(i7).l1(-this.f62144j);
        tL_messages_hideChatJoinRequest.user_id = mp.u1(i7).s1(user);
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_hideChatJoinRequest, new n0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z10 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.f62143i.f26915a.get(this.f62144j);
            if (tL_messages_chatInviteImporters != null) {
                this.f62159z = true;
                g(tL_messages_chatInviteImporters, null, true, true);
                z10 = false;
            }
        }
        g0.g3(new qp0(18, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i7;
        int i10;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f62140e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            mv0 mv0Var = this.f62148n;
            if (mv0Var != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                mv0Var.setVisibility(i10);
            }
            mv0 mv0Var2 = this.f62149o;
            if (mv0Var2 != null) {
                mv0Var2.setVisibility(4);
            }
        } else {
            if (this.f62139c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            mv0 mv0Var3 = this.f62148n;
            if (mv0Var3 != null) {
                mv0Var3.setVisibility(4);
            }
            mv0 mv0Var4 = this.f62149o;
            if (mv0Var4 != null) {
                if (z12) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                mv0Var4.setVisibility(i7);
            }
        }
        k(this.f62150p, z12, true);
        if (arrayList.isEmpty()) {
            mv0 mv0Var5 = this.f62148n;
            if (mv0Var5 != null) {
                mv0Var5.setVisibility(0);
            }
            mv0 mv0Var6 = this.f62149o;
            if (mv0Var6 != null) {
                mv0Var6.setVisibility(4);
            }
            k(this.f62151q, false, false);
            if (this.f62158y && this.f62146l) {
                this.f62142g.getActionBar().s().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: zh.l.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof f5) {
            if (this.f62158y) {
                g0.v1(this.f62142g.getParentActivity().getCurrentFocus());
            }
            v9.b bVar = new v9.b(26, this, (f5) view);
            if (this.f62158y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            g0.h3(bVar, j3);
        }
    }

    public final void i(boolean z10) {
        int i7;
        ek0 ek0Var = this.f62150p;
        if (ek0Var != null && (i7 = !this.f62141f.f62119c.B ? 1 : 0) >= 0 && i7 < ek0Var.getChildCount()) {
            this.f62150p.getChildAt(i7).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f62155u != null) {
            Utilities.f22879g.a(this.f62155u);
            this.f62155u = null;
        }
        int i7 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f62145k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f62154t = str;
        if (this.f62159z && this.f62140e.isEmpty()) {
            k(this.f62151q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f62141f.E(this.f62140e);
            k(this.f62150p, true, true);
            k(this.f62151q, false, false);
            mv0 mv0Var = this.f62149o;
            if (mv0Var != null) {
                mv0Var.setVisibility(4);
            }
            if (str == null && this.f62146l) {
                q0 j3 = this.f62142g.getActionBar().s().j(0);
                if (this.f62140e.isEmpty()) {
                    i7 = 8;
                }
                j3.setVisibility(i7);
            }
        } else {
            this.f62141f.E(Collections.EMPTY_LIST);
            k(this.f62150p, false, false);
            k(this.f62151q, true, true);
            q5 q5Var = Utilities.f22879g;
            e eVar = new e(this, 2);
            this.f62155u = eVar;
            q5Var.d(eVar, 300L);
        }
        if (str != null) {
            mv0 mv0Var2 = this.f62148n;
            if (mv0Var2 != null) {
                mv0Var2.setVisibility(4);
            }
            mv0 mv0Var3 = this.f62149o;
            if (mv0Var3 != null) {
                mv0Var3.setVisibility(4);
            }
        }
    }
}
