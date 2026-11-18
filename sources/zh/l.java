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
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.wz;
import ug.j1;
import wg.r;
public abstract class l implements f5 {
    public final boolean f62009a;
    public boolean f62010b;
    public final h2 f62014g;
    public final FrameLayout h;
    public final si f62015i;
    public final long f62016j;
    public final int f62017k;
    public final boolean f62018l;
    public FrameLayout f62019m;
    public kv0 f62020n;
    public kv0 f62021o;
    public ck0 f62022p;
    public wz f62023q;
    public TLRPC.TL_chatInviteImporter f62024r;
    public k f62025s;
    public String f62026t;
    public e f62027u;
    public int v;
    public boolean f62028w;
    public boolean f62030y;
    public boolean f62031z;
    public final ArrayList f62011c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f62012e = new ArrayList();
    public final g f62013f = new g(this);
    public boolean f62029x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final j1 D = new j1(this, 4);

    public l(h2 h2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f62014g = h2Var;
        this.h = frameLayout;
        this.f62016j = j3;
        int currentAccount = h2Var.getCurrentAccount();
        this.f62017k = currentAccount;
        this.f62009a = v3.U(currentAccount, j3);
        this.f62018l = z10;
        this.f62015i = si.b(currentAccount);
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
        if (this.f62020n == null) {
            h2 h2Var = this.f62014g;
            kv0 kv0Var = new kv0(h2Var.getParentActivity(), null, 16, h2Var.getResourceProvider());
            this.f62020n = kv0Var;
            boolean z10 = this.f62009a;
            if (z10) {
                i7 = 2131747954;
            } else {
                i7 = 2131748003;
            }
            kv0Var.d.setText(gd.M0(i7, null));
            k80 k80Var = this.f62020n.f36896e;
            if (z10) {
                i10 = 2131747953;
            } else {
                i10 = 2131748002;
            }
            k80Var.setText(gd.M0(i10, null));
            this.f62020n.setAnimateLayoutChange(true);
            this.f62020n.setVisibility(8);
        }
        return this.f62020n;
    }

    public final wz b() {
        if (this.f62023q == null) {
            h2 h2Var = this.f62014g;
            wz wzVar = new wz(h2Var.getParentActivity(), h2Var.getResourceProvider());
            this.f62023q = wzVar;
            wzVar.setAlpha(0.0f);
            if (this.B) {
                u6.h(n6.f29394d6, this.f62023q, h2Var.getResourceProvider());
            }
            this.f62023q.e(n6.f29394d6, n6.f29337a7, -1);
            this.f62023q.setViewType(15);
            this.f62023q.setMemberRequestButton(this.f62009a);
        }
        return this.f62023q;
    }

    public final kv0 c() {
        if (this.f62021o == null) {
            h2 h2Var = this.f62014g;
            kv0 kv0Var = new kv0(h2Var.getParentActivity(), null, 1, h2Var.getResourceProvider());
            this.f62021o = kv0Var;
            if (this.B) {
                u6.h(n6.f29394d6, kv0Var, h2Var.getResourceProvider());
            }
            this.f62021o.d.setText(gd.M0(2131747975, null));
            this.f62021o.f36896e.setText(gd.M0(2131745612, null));
            this.f62021o.setAnimateLayoutChange(true);
            this.f62021o.setVisibility(8);
        }
        return this.f62021o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i7 = this.f62017k;
        tL_messages_hideChatJoinRequest.peer = mp.u1(i7).l1(-this.f62016j);
        tL_messages_hideChatJoinRequest.user_id = mp.u1(i7).s1(user);
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z10 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.f62015i.f26814a.get(this.f62016j);
            if (tL_messages_chatInviteImporters != null) {
                this.f62031z = true;
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
        ArrayList arrayList = this.f62012e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            kv0 kv0Var = this.f62020n;
            if (kv0Var != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                kv0Var.setVisibility(i10);
            }
            kv0 kv0Var2 = this.f62021o;
            if (kv0Var2 != null) {
                kv0Var2.setVisibility(4);
            }
        } else {
            if (this.f62011c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            kv0 kv0Var3 = this.f62020n;
            if (kv0Var3 != null) {
                kv0Var3.setVisibility(4);
            }
            kv0 kv0Var4 = this.f62021o;
            if (kv0Var4 != null) {
                if (z12) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                kv0Var4.setVisibility(i7);
            }
        }
        k(this.f62022p, z12, true);
        if (arrayList.isEmpty()) {
            kv0 kv0Var5 = this.f62020n;
            if (kv0Var5 != null) {
                kv0Var5.setVisibility(0);
            }
            kv0 kv0Var6 = this.f62021o;
            if (kv0Var6 != null) {
                kv0Var6.setVisibility(4);
            }
            k(this.f62023q, false, false);
            if (this.f62030y && this.f62018l) {
                this.f62014g.getActionBar().t().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: zh.l.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f62030y) {
                g0.v1(this.f62014g.getParentActivity().getCurrentFocus());
            }
            r rVar = new r(20, this, (g5) view);
            if (this.f62030y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            g0.h3(rVar, j3);
        }
    }

    public final void i(boolean z10) {
        int i7;
        ck0 ck0Var = this.f62022p;
        if (ck0Var != null && (i7 = !this.f62013f.f61991c.B ? 1 : 0) >= 0 && i7 < ck0Var.getChildCount()) {
            this.f62022p.getChildAt(i7).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f62027u != null) {
            Utilities.f22781g.a(this.f62027u);
            this.f62027u = null;
        }
        int i7 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f62017k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f62026t = str;
        if (this.f62031z && this.f62012e.isEmpty()) {
            k(this.f62023q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f62013f.E(this.f62012e);
            k(this.f62022p, true, true);
            k(this.f62023q, false, false);
            kv0 kv0Var = this.f62021o;
            if (kv0Var != null) {
                kv0Var.setVisibility(4);
            }
            if (str == null && this.f62018l) {
                r0 j3 = this.f62014g.getActionBar().t().j(0);
                if (this.f62012e.isEmpty()) {
                    i7 = 8;
                }
                j3.setVisibility(i7);
            }
        } else {
            this.f62013f.E(Collections.EMPTY_LIST);
            k(this.f62022p, false, false);
            k(this.f62023q, true, true);
            q5 q5Var = Utilities.f22781g;
            e eVar = new e(this, 2);
            this.f62027u = eVar;
            q5Var.d(eVar, 300L);
        }
        if (str != null) {
            kv0 kv0Var2 = this.f62020n;
            if (kv0Var2 != null) {
                kv0Var2.setVisibility(4);
            }
            kv0 kv0Var3 = this.f62021o;
            if (kv0Var3 != null) {
                kv0Var3.setVisibility(4);
            }
        }
    }
}
