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
import org.telegram.messenger.hd;
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
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.w70;
import wi.q;
public abstract class m implements d5 {
    public final boolean f59445a;
    public boolean f59446b;
    public final f2 f59450g;
    public final FrameLayout h;
    public final vi f59451i;
    public final long f59452j;
    public final int f59453k;
    public final boolean f59454l;
    public FrameLayout f59455m;
    public av0 f59456n;
    public av0 f59457o;
    public pj0 f59458p;
    public lz f59459q;
    public TLRPC.TL_chatInviteImporter f59460r;
    public l f59461s;
    public String f59462t;
    public e f59463u;
    public int v;
    public boolean f59464w;
    public boolean f59466y;
    public boolean f59467z;
    public final ArrayList f59447c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f59448e = new ArrayList();
    public final h f59449f = new h(this);
    public boolean f59465x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final f D = new f(this, 0);

    public m(f2 f2Var, FrameLayout frameLayout, long j3, boolean z9) {
        this.f59450g = f2Var;
        this.h = frameLayout;
        this.f59452j = j3;
        int currentAccount = f2Var.getCurrentAccount();
        this.f59453k = currentAccount;
        this.f59445a = t3.U(currentAccount, j3);
        this.f59454l = z9;
        this.f59451i = vi.b(currentAccount);
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
        if (this.f59456n == null) {
            f2 f2Var = this.f59450g;
            av0 av0Var = new av0(f2Var.getParentActivity(), null, 16, f2Var.getResourceProvider());
            this.f59456n = av0Var;
            boolean z9 = this.f59445a;
            if (z9) {
                i7 = 2131748145;
            } else {
                i7 = 2131748194;
            }
            av0Var.d.setText(hd.M0(i7, null));
            w70 w70Var = this.f59456n.f31929e;
            if (z9) {
                i10 = 2131748144;
            } else {
                i10 = 2131748193;
            }
            w70Var.setText(hd.M0(i10, null));
            this.f59456n.setAnimateLayoutChange(true);
            this.f59456n.setVisibility(8);
        }
        return this.f59456n;
    }

    public final lz b() {
        if (this.f59459q == null) {
            f2 f2Var = this.f59450g;
            lz lzVar = new lz(f2Var.getParentActivity(), f2Var.getResourceProvider());
            this.f59459q = lzVar;
            lzVar.setAlpha(0.0f);
            if (this.B) {
                r6.i(k6.f27848d6, this.f59459q, f2Var.getResourceProvider());
            }
            this.f59459q.e(k6.f27848d6, k6.f27792a7, -1);
            this.f59459q.setViewType(15);
            this.f59459q.setMemberRequestButton(this.f59445a);
        }
        return this.f59459q;
    }

    public final av0 c() {
        if (this.f59457o == null) {
            f2 f2Var = this.f59450g;
            av0 av0Var = new av0(f2Var.getParentActivity(), null, 1, f2Var.getResourceProvider());
            this.f59457o = av0Var;
            if (this.B) {
                r6.i(k6.f27848d6, av0Var, f2Var.getResourceProvider());
            }
            this.f59457o.d.setText(hd.M0(2131748166, null));
            this.f59457o.f31929e.setText(hd.M0(2131745808, null));
            this.f59457o.setAnimateLayoutChange(true);
            this.f59457o.setVisibility(8);
        }
        return this.f59457o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z9) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z9;
        int i7 = this.f59453k;
        tL_messages_hideChatJoinRequest.peer = qp.s1(i7).j1(-this.f59452j);
        tL_messages_hideChatJoinRequest.user_id = qp.s1(i7).q1(user);
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_hideChatJoinRequest, new l0(this, tL_chatInviteImporter, z9, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z9 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.f59451i.f25980a.get(this.f59452j);
            if (tL_messages_chatInviteImporters != null) {
                this.f59467z = true;
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
        ArrayList arrayList = this.f59448e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z9) {
                z11 = false;
            } else {
                z11 = true;
            }
            av0 av0Var = this.f59456n;
            if (av0Var != null) {
                if (z11) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                av0Var.setVisibility(i10);
            }
            av0 av0Var2 = this.f59457o;
            if (av0Var2 != null) {
                av0Var2.setVisibility(4);
            }
        } else {
            if (this.f59447c.isEmpty() && !z9) {
                z11 = false;
            } else {
                z11 = true;
            }
            av0 av0Var3 = this.f59456n;
            if (av0Var3 != null) {
                av0Var3.setVisibility(4);
            }
            av0 av0Var4 = this.f59457o;
            if (av0Var4 != null) {
                if (z11) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                av0Var4.setVisibility(i7);
            }
        }
        k(this.f59458p, z11, true);
        if (arrayList.isEmpty()) {
            av0 av0Var5 = this.f59456n;
            if (av0Var5 != null) {
                av0Var5.setVisibility(0);
            }
            av0 av0Var6 = this.f59457o;
            if (av0Var6 != null) {
                av0Var6.setVisibility(4);
            }
            k(this.f59459q, false, false);
            if (this.f59466y && this.f59454l) {
                this.f59450g.getActionBar().q().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: yh.m.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof e5) {
            if (this.f59466y) {
                g0.v1(this.f59450g.getParentActivity().getCurrentFocus());
            }
            q qVar = new q(9, this, (e5) view);
            if (this.f59466y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            g0.i3(qVar, j3);
        }
    }

    public final void i(boolean z9) {
        int i7;
        pj0 pj0Var = this.f59458p;
        if (pj0Var != null && (i7 = !this.f59449f.f59427c.B ? 1 : 0) >= 0 && i7 < pj0Var.getChildCount()) {
            this.f59458p.getChildAt(i7).setEnabled(z9);
        }
    }

    public final void j(String str) {
        if (this.f59463u != null) {
            Utilities.f21335g.a(this.f59463u);
            this.f59463u = null;
        }
        int i7 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f59453k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f59462t = str;
        if (this.f59467z && this.f59448e.isEmpty()) {
            k(this.f59459q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f59449f.E(this.f59448e);
            k(this.f59458p, true, true);
            k(this.f59459q, false, false);
            av0 av0Var = this.f59457o;
            if (av0Var != null) {
                av0Var.setVisibility(4);
            }
            if (str == null && this.f59454l) {
                r0 j3 = this.f59450g.getActionBar().q().j(0);
                if (this.f59448e.isEmpty()) {
                    i7 = 8;
                }
                j3.setVisibility(i7);
            }
        } else {
            this.f59449f.E(Collections.EMPTY_LIST);
            k(this.f59458p, false, false);
            k(this.f59459q, true, true);
            p5 p5Var = Utilities.f21335g;
            e eVar = new e(this, 2);
            this.f59463u = eVar;
            p5Var.d(eVar, 300L);
        }
        if (str != null) {
            av0 av0Var2 = this.f59456n;
            if (av0Var2 != null) {
                av0Var2.setVisibility(4);
            }
            av0 av0Var3 = this.f59457o;
            if (av0Var3 != null) {
                av0Var3.setVisibility(4);
            }
        }
    }
}
