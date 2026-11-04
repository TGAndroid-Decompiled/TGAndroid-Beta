package zh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import lg.m0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.mi;
import org.telegram.messenger.p5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.d5;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.zu0;
public abstract class k implements d5 {
    public final boolean f60580a;
    public boolean f60581b;
    public final d2 f60585g;
    public final FrameLayout h;
    public final mi f60586i;
    public final long f60587j;
    public final int f60588k;
    public final boolean f60589l;
    public FrameLayout f60590m;
    public zu0 f60591n;
    public zu0 f60592o;
    public tj0 f60593p;
    public iz f60594q;
    public TLRPC.TL_chatInviteImporter f60595r;
    public j f60596s;
    public String f60597t;
    public e f60598u;
    public int v;
    public boolean f60599w;
    public boolean f60601y;
    public boolean f60602z;
    public final ArrayList f60582c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f60583e = new ArrayList();
    public final f f60584f = new f(this);
    public boolean f60600x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final wh.d D = new wh.d(this, 3);

    public k(d2 d2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.f60585g = d2Var;
        this.h = frameLayout;
        this.f60587j = j10;
        int currentAccount = d2Var.getCurrentAccount();
        this.f60588k = currentAccount;
        this.f60580a = t3.U(currentAccount, j10);
        this.f60589l = z10;
        this.f60586i = mi.b(currentAccount);
    }

    public static void k(View view, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        if (view != null) {
            int i3 = 0;
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
                i3 = 4;
            }
            view.setVisibility(i3);
        }
    }

    public final zu0 a() {
        int i3;
        int i10;
        if (this.f60591n == null) {
            d2 d2Var = this.f60585g;
            zu0 zu0Var = new zu0(d2Var.getParentActivity(), null, 16, d2Var.getResourceProvider());
            this.f60591n = zu0Var;
            boolean z10 = this.f60580a;
            if (z10) {
                i3 = 2131748154;
            } else {
                i3 = 2131748203;
            }
            zu0Var.d.setText(bd.M0(i3, null));
            s70 s70Var = this.f60591n.f41128e;
            if (z10) {
                i10 = 2131748153;
            } else {
                i10 = 2131748202;
            }
            s70Var.setText(bd.M0(i10, null));
            this.f60591n.setAnimateLayoutChange(true);
            this.f60591n.setVisibility(8);
        }
        return this.f60591n;
    }

    public final iz b() {
        if (this.f60594q == null) {
            d2 d2Var = this.f60585g;
            iz izVar = new iz(d2Var.getParentActivity(), d2Var.getResourceProvider());
            this.f60594q = izVar;
            izVar.setAlpha(0.0f);
            if (this.B) {
                r6.i(k6.f27878d6, this.f60594q, d2Var.getResourceProvider());
            }
            this.f60594q.e(k6.f27878d6, k6.f27824a7, -1);
            this.f60594q.setViewType(15);
            this.f60594q.setMemberRequestButton(this.f60580a);
        }
        return this.f60594q;
    }

    public final zu0 c() {
        if (this.f60592o == null) {
            d2 d2Var = this.f60585g;
            zu0 zu0Var = new zu0(d2Var.getParentActivity(), null, 1, d2Var.getResourceProvider());
            this.f60592o = zu0Var;
            if (this.B) {
                r6.i(k6.f27878d6, zu0Var, d2Var.getResourceProvider());
            }
            this.f60592o.d.setText(bd.M0(2131748175, null));
            this.f60592o.f41128e.setText(bd.M0(2131745817, null));
            this.f60592o.setAnimateLayoutChange(true);
            this.f60592o.setVisibility(8);
        }
        return this.f60592o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i3 = this.f60588k;
        tL_messages_hideChatJoinRequest.peer = hp.s1(i3).j1(-this.f60587j);
        tL_messages_hideChatJoinRequest.user_id = hp.s1(i3).q1(user);
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_hideChatJoinRequest, new m0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z10 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.f60586i.f24212a.get(this.f60587j);
            if (tL_messages_chatInviteImporters != null) {
                this.f60602z = true;
                g(tL_messages_chatInviteImporters, null, true, true);
                z10 = false;
            }
        }
        g0.h3(new up0(17, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i3;
        int i10;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f60583e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            zu0 zu0Var = this.f60591n;
            if (zu0Var != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                zu0Var.setVisibility(i10);
            }
            zu0 zu0Var2 = this.f60592o;
            if (zu0Var2 != null) {
                zu0Var2.setVisibility(4);
            }
        } else {
            if (this.f60582c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            zu0 zu0Var3 = this.f60591n;
            if (zu0Var3 != null) {
                zu0Var3.setVisibility(4);
            }
            zu0 zu0Var4 = this.f60592o;
            if (zu0Var4 != null) {
                if (z12) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
                zu0Var4.setVisibility(i3);
            }
        }
        k(this.f60593p, z12, true);
        if (arrayList.isEmpty()) {
            zu0 zu0Var5 = this.f60591n;
            if (zu0Var5 != null) {
                zu0Var5.setVisibility(0);
            }
            zu0 zu0Var6 = this.f60592o;
            if (zu0Var6 != null) {
                zu0Var6.setVisibility(4);
            }
            k(this.f60594q, false, false);
            if (this.f60601y && this.f60589l) {
                this.f60585g.getActionBar().q().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: zh.k.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof e5) {
            if (this.f60601y) {
                g0.v1(this.f60585g.getParentActivity().getCurrentFocus());
            }
            xh.i iVar = new xh.i(12, this, (e5) view);
            if (this.f60601y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            g0.i3(iVar, j10);
        }
    }

    public final void i(boolean z10) {
        int i3;
        tj0 tj0Var = this.f60593p;
        if (tj0Var != null && (i3 = !this.f60584f.f60562c.B ? 1 : 0) >= 0 && i3 < tj0Var.getChildCount()) {
            this.f60593p.getChildAt(i3).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f60598u != null) {
            Utilities.f21389g.a(this.f60598u);
            this.f60598u = null;
        }
        int i3 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f60588k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f60597t = str;
        if (this.f60602z && this.f60583e.isEmpty()) {
            k(this.f60594q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f60584f.E(this.f60583e);
            k(this.f60593p, true, true);
            k(this.f60594q, false, false);
            zu0 zu0Var = this.f60592o;
            if (zu0Var != null) {
                zu0Var.setVisibility(4);
            }
            if (str == null && this.f60589l) {
                q0 j10 = this.f60585g.getActionBar().q().j(0);
                if (this.f60583e.isEmpty()) {
                    i3 = 8;
                }
                j10.setVisibility(i3);
            }
        } else {
            this.f60584f.E(Collections.EMPTY_LIST);
            k(this.f60593p, false, false);
            k(this.f60594q, true, true);
            p5 p5Var = Utilities.f21389g;
            e eVar = new e(this, 2);
            this.f60598u = eVar;
            p5Var.e(eVar, 300L);
        }
        if (str != null) {
            zu0 zu0Var2 = this.f60591n;
            if (zu0Var2 != null) {
                zu0Var2.setVisibility(4);
            }
            zu0 zu0Var3 = this.f60592o;
            if (zu0Var3 != null) {
                zu0Var3.setVisibility(4);
            }
        }
    }
}
