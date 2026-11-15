package zh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import kg.l0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p5;
import org.telegram.messenger.t3;
import org.telegram.messenger.ti;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.d5;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z70;
import ug.t1;
public abstract class l implements d5 {
    public final boolean f61442a;
    public boolean f61443b;
    public final e2 f61447g;
    public final FrameLayout h;
    public final ti f61448i;
    public final long f61449j;
    public final int f61450k;
    public final boolean f61451l;
    public FrameLayout f61452m;
    public cv0 f61453n;
    public cv0 f61454o;
    public uj0 f61455p;
    public pz f61456q;
    public TLRPC.TL_chatInviteImporter f61457r;
    public k f61458s;
    public String f61459t;
    public e f61460u;
    public int v;
    public boolean f61461w;
    public boolean f61463y;
    public boolean f61464z;
    public final ArrayList f61444c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f61445e = new ArrayList();
    public final g f61446f = new g(this);
    public boolean f61462x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final vh.d D = new vh.d(this, 3);

    public l(e2 e2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f61447g = e2Var;
        this.h = frameLayout;
        this.f61449j = j3;
        int currentAccount = e2Var.getCurrentAccount();
        this.f61450k = currentAccount;
        this.f61442a = t3.U(currentAccount, j3);
        this.f61451l = z10;
        this.f61448i = ti.b(currentAccount);
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

    public final cv0 a() {
        int i7;
        int i10;
        if (this.f61453n == null) {
            e2 e2Var = this.f61447g;
            cv0 cv0Var = new cv0(e2Var.getParentActivity(), null, 16, e2Var.getResourceProvider());
            this.f61453n = cv0Var;
            boolean z10 = this.f61442a;
            if (z10) {
                i7 = 2131748146;
            } else {
                i7 = 2131748195;
            }
            cv0Var.d.setText(hd.M0(i7, null));
            z70 z70Var = this.f61453n.f33709e;
            if (z10) {
                i10 = 2131748145;
            } else {
                i10 = 2131748194;
            }
            z70Var.setText(hd.M0(i10, null));
            this.f61453n.setAnimateLayoutChange(true);
            this.f61453n.setVisibility(8);
        }
        return this.f61453n;
    }

    public final pz b() {
        if (this.f61456q == null) {
            e2 e2Var = this.f61447g;
            pz pzVar = new pz(e2Var.getParentActivity(), e2Var.getResourceProvider());
            this.f61456q = pzVar;
            pzVar.setAlpha(0.0f);
            if (this.B) {
                q6.h(j6.f28849d6, this.f61456q, e2Var.getResourceProvider());
            }
            this.f61456q.e(j6.f28849d6, j6.f28792a7, -1);
            this.f61456q.setViewType(15);
            this.f61456q.setMemberRequestButton(this.f61442a);
        }
        return this.f61456q;
    }

    public final cv0 c() {
        if (this.f61454o == null) {
            e2 e2Var = this.f61447g;
            cv0 cv0Var = new cv0(e2Var.getParentActivity(), null, 1, e2Var.getResourceProvider());
            this.f61454o = cv0Var;
            if (this.B) {
                q6.h(j6.f28849d6, cv0Var, e2Var.getResourceProvider());
            }
            this.f61454o.d.setText(hd.M0(2131748167, null));
            this.f61454o.f33709e.setText(hd.M0(2131745807, null));
            this.f61454o.setAnimateLayoutChange(true);
            this.f61454o.setVisibility(8);
        }
        return this.f61454o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i7 = this.f61450k;
        tL_messages_hideChatJoinRequest.peer = np.s1(i7).j1(-this.f61449j);
        tL_messages_hideChatJoinRequest.user_id = np.s1(i7).q1(user);
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_hideChatJoinRequest, new l0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z10 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.f61448i.f26692a.get(this.f61449j);
            if (tL_messages_chatInviteImporters != null) {
                this.f61464z = true;
                g(tL_messages_chatInviteImporters, null, true, true);
                z10 = false;
            }
        }
        g0.h3(new fp0(17, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i7;
        int i10;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f61445e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            cv0 cv0Var = this.f61453n;
            if (cv0Var != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                cv0Var.setVisibility(i10);
            }
            cv0 cv0Var2 = this.f61454o;
            if (cv0Var2 != null) {
                cv0Var2.setVisibility(4);
            }
        } else {
            if (this.f61444c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            cv0 cv0Var3 = this.f61453n;
            if (cv0Var3 != null) {
                cv0Var3.setVisibility(4);
            }
            cv0 cv0Var4 = this.f61454o;
            if (cv0Var4 != null) {
                if (z12) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                cv0Var4.setVisibility(i7);
            }
        }
        k(this.f61455p, z12, true);
        if (arrayList.isEmpty()) {
            cv0 cv0Var5 = this.f61453n;
            if (cv0Var5 != null) {
                cv0Var5.setVisibility(0);
            }
            cv0 cv0Var6 = this.f61454o;
            if (cv0Var6 != null) {
                cv0Var6.setVisibility(4);
            }
            k(this.f61456q, false, false);
            if (this.f61463y && this.f61451l) {
                this.f61447g.getActionBar().s().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: zh.l.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof e5) {
            if (this.f61463y) {
                g0.v1(this.f61447g.getParentActivity().getCurrentFocus());
            }
            t1 t1Var = new t1(28, this, (e5) view);
            if (this.f61463y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            g0.i3(t1Var, j3);
        }
    }

    public final void i(boolean z10) {
        int i7;
        uj0 uj0Var = this.f61455p;
        if (uj0Var != null && (i7 = !this.f61446f.f61424c.B ? 1 : 0) >= 0 && i7 < uj0Var.getChildCount()) {
            this.f61455p.getChildAt(i7).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f61460u != null) {
            Utilities.f22418g.a(this.f61460u);
            this.f61460u = null;
        }
        int i7 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f61450k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f61459t = str;
        if (this.f61464z && this.f61445e.isEmpty()) {
            k(this.f61456q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f61446f.E(this.f61445e);
            k(this.f61455p, true, true);
            k(this.f61456q, false, false);
            cv0 cv0Var = this.f61454o;
            if (cv0Var != null) {
                cv0Var.setVisibility(4);
            }
            if (str == null && this.f61451l) {
                q0 j3 = this.f61447g.getActionBar().s().j(0);
                if (this.f61445e.isEmpty()) {
                    i7 = 8;
                }
                j3.setVisibility(i7);
            }
        } else {
            this.f61446f.E(Collections.EMPTY_LIST);
            k(this.f61455p, false, false);
            k(this.f61456q, true, true);
            p5 p5Var = Utilities.f22418g;
            e eVar = new e(this, 2);
            this.f61460u = eVar;
            p5Var.d(eVar, 300L);
        }
        if (str != null) {
            cv0 cv0Var2 = this.f61453n;
            if (cv0Var2 != null) {
                cv0Var2.setVisibility(4);
            }
            cv0 cv0Var3 = this.f61454o;
            if (cv0Var3 != null) {
                cv0Var3.setVisibility(4);
            }
        }
    }
}
