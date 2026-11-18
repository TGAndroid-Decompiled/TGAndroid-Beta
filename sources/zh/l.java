package zh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import kg.o0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.q5;
import org.telegram.messenger.si;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r0;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.wz;
import ug.j1;
import wg.r;
public abstract class l implements e5 {
    public final boolean f62008a;
    public boolean f62009b;
    public final h2 f62013g;
    public final FrameLayout h;
    public final si f62014i;
    public final long f62015j;
    public final int f62016k;
    public final boolean f62017l;
    public FrameLayout f62018m;
    public kv0 f62019n;
    public kv0 f62020o;
    public ck0 f62021p;
    public wz f62022q;
    public TLRPC.TL_chatInviteImporter f62023r;
    public k f62024s;
    public String f62025t;
    public e f62026u;
    public int v;
    public boolean f62027w;
    public boolean f62029y;
    public boolean f62030z;
    public final ArrayList f62010c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f62011e = new ArrayList();
    public final g f62012f = new g(this);
    public boolean f62028x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final j1 D = new j1(this, 4);

    public l(h2 h2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f62013g = h2Var;
        this.h = frameLayout;
        this.f62015j = j3;
        int currentAccount = h2Var.getCurrentAccount();
        this.f62016k = currentAccount;
        this.f62008a = v3.U(currentAccount, j3);
        this.f62017l = z10;
        this.f62014i = si.b(currentAccount);
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

    public final kv0 a() {
        int i7;
        int i10;
        if (this.f62019n == null) {
            h2 h2Var = this.f62013g;
            kv0 kv0Var = new kv0(h2Var.getParentActivity(), null, 16, h2Var.getResourceProvider());
            this.f62019n = kv0Var;
            boolean z10 = this.f62008a;
            if (z10) {
                i7 = 2131747954;
            } else {
                i7 = 2131748003;
            }
            kv0Var.d.setText(gd.M0(i7, null));
            k80 k80Var = this.f62019n.f36896e;
            if (z10) {
                i10 = 2131747953;
            } else {
                i10 = 2131748002;
            }
            k80Var.setText(gd.M0(i10, null));
            this.f62019n.setAnimateLayoutChange(true);
            this.f62019n.setVisibility(8);
        }
        return this.f62019n;
    }

    public final wz b() {
        if (this.f62022q == null) {
            h2 h2Var = this.f62013g;
            wz wzVar = new wz(h2Var.getParentActivity(), h2Var.getResourceProvider());
            this.f62022q = wzVar;
            wzVar.setAlpha(0.0f);
            if (this.B) {
                u6.h(n6.f29396d6, this.f62022q, h2Var.getResourceProvider());
            }
            this.f62022q.e(n6.f29396d6, n6.f29339a7, -1);
            this.f62022q.setViewType(15);
            this.f62022q.setMemberRequestButton(this.f62008a);
        }
        return this.f62022q;
    }

    public final kv0 c() {
        if (this.f62020o == null) {
            h2 h2Var = this.f62013g;
            kv0 kv0Var = new kv0(h2Var.getParentActivity(), null, 1, h2Var.getResourceProvider());
            this.f62020o = kv0Var;
            if (this.B) {
                u6.h(n6.f29396d6, kv0Var, h2Var.getResourceProvider());
            }
            this.f62020o.d.setText(gd.M0(2131747975, null));
            this.f62020o.f36896e.setText(gd.M0(2131745612, null));
            this.f62020o.setAnimateLayoutChange(true);
            this.f62020o.setVisibility(8);
        }
        return this.f62020o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i7 = this.f62016k;
        tL_messages_hideChatJoinRequest.peer = mp.u1(i7).l1(-this.f62015j);
        tL_messages_hideChatJoinRequest.user_id = mp.u1(i7).s1(user);
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z10 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.f62014i.f26816a.get(this.f62015j);
            if (tL_messages_chatInviteImporters != null) {
                this.f62030z = true;
                g(tL_messages_chatInviteImporters, null, true, true);
                z10 = false;
            }
        }
        g0.g3(new pp0(18, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i7;
        int i10;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f62011e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            kv0 kv0Var = this.f62019n;
            if (kv0Var != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                kv0Var.setVisibility(i10);
            }
            kv0 kv0Var2 = this.f62020o;
            if (kv0Var2 != null) {
                kv0Var2.setVisibility(4);
            }
        } else {
            if (this.f62010c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            kv0 kv0Var3 = this.f62019n;
            if (kv0Var3 != null) {
                kv0Var3.setVisibility(4);
            }
            kv0 kv0Var4 = this.f62020o;
            if (kv0Var4 != null) {
                if (z12) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                kv0Var4.setVisibility(i7);
            }
        }
        k(this.f62021p, z12, true);
        if (arrayList.isEmpty()) {
            kv0 kv0Var5 = this.f62019n;
            if (kv0Var5 != null) {
                kv0Var5.setVisibility(0);
            }
            kv0 kv0Var6 = this.f62020o;
            if (kv0Var6 != null) {
                kv0Var6.setVisibility(4);
            }
            k(this.f62022q, false, false);
            if (this.f62029y && this.f62017l) {
                this.f62013g.getActionBar().t().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: zh.l.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof f5) {
            if (this.f62029y) {
                g0.v1(this.f62013g.getParentActivity().getCurrentFocus());
            }
            r rVar = new r(20, this, (f5) view);
            if (this.f62029y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            g0.h3(rVar, j3);
        }
    }

    public final void i(boolean z10) {
        int i7;
        ck0 ck0Var = this.f62021p;
        if (ck0Var != null && (i7 = !this.f62012f.f61990c.B ? 1 : 0) >= 0 && i7 < ck0Var.getChildCount()) {
            this.f62021p.getChildAt(i7).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f62026u != null) {
            Utilities.f22784g.a(this.f62026u);
            this.f62026u = null;
        }
        int i7 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f62016k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f62025t = str;
        if (this.f62030z && this.f62011e.isEmpty()) {
            k(this.f62022q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f62012f.E(this.f62011e);
            k(this.f62021p, true, true);
            k(this.f62022q, false, false);
            kv0 kv0Var = this.f62020o;
            if (kv0Var != null) {
                kv0Var.setVisibility(4);
            }
            if (str == null && this.f62017l) {
                r0 j3 = this.f62013g.getActionBar().t().j(0);
                if (this.f62011e.isEmpty()) {
                    i7 = 8;
                }
                j3.setVisibility(i7);
            }
        } else {
            this.f62012f.E(Collections.EMPTY_LIST);
            k(this.f62021p, false, false);
            k(this.f62022q, true, true);
            q5 q5Var = Utilities.f22784g;
            e eVar = new e(this, 2);
            this.f62026u = eVar;
            q5Var.d(eVar, 300L);
        }
        if (str != null) {
            kv0 kv0Var2 = this.f62019n;
            if (kv0Var2 != null) {
                kv0Var2.setVisibility(4);
            }
            kv0 kv0Var3 = this.f62020o;
            if (kv0Var3 != null) {
                kv0Var3.setVisibility(4);
            }
        }
    }
}
