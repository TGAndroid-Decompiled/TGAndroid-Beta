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
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r0;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.d5;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.w70;
public abstract class m implements d5 {
    public final boolean f59550a;
    public boolean f59551b;
    public final f2 f59555g;
    public final FrameLayout h;
    public final vi f59556i;
    public final long f59557j;
    public final int f59558k;
    public final boolean f59559l;
    public FrameLayout f59560m;
    public bv0 f59561n;
    public bv0 f59562o;
    public pj0 f59563p;
    public lz f59564q;
    public TLRPC.TL_chatInviteImporter f59565r;
    public l f59566s;
    public String f59567t;
    public e f59568u;
    public int v;
    public boolean f59569w;
    public boolean f59571y;
    public boolean f59572z;
    public final ArrayList f59552c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f59553e = new ArrayList();
    public final h f59554f = new h(this);
    public boolean f59570x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final f D = new f(this, 0);

    public m(f2 f2Var, FrameLayout frameLayout, long j3, boolean z9) {
        this.f59555g = f2Var;
        this.h = frameLayout;
        this.f59557j = j3;
        int currentAccount = f2Var.getCurrentAccount();
        this.f59558k = currentAccount;
        this.f59550a = t3.U(currentAccount, j3);
        this.f59559l = z9;
        this.f59556i = vi.b(currentAccount);
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

    public final bv0 a() {
        int i7;
        int i10;
        if (this.f59561n == null) {
            f2 f2Var = this.f59555g;
            bv0 bv0Var = new bv0(f2Var.getParentActivity(), null, 16, f2Var.getResourceProvider());
            this.f59561n = bv0Var;
            boolean z9 = this.f59550a;
            if (z9) {
                i7 = 2131748146;
            } else {
                i7 = 2131748195;
            }
            bv0Var.d.setText(id.M0(i7, null));
            w70 w70Var = this.f59561n.f32368e;
            if (z9) {
                i10 = 2131748145;
            } else {
                i10 = 2131748194;
            }
            w70Var.setText(id.M0(i10, null));
            this.f59561n.setAnimateLayoutChange(true);
            this.f59561n.setVisibility(8);
        }
        return this.f59561n;
    }

    public final lz b() {
        if (this.f59564q == null) {
            f2 f2Var = this.f59555g;
            lz lzVar = new lz(f2Var.getParentActivity(), f2Var.getResourceProvider());
            this.f59564q = lzVar;
            lzVar.setAlpha(0.0f);
            if (this.B) {
                t6.h(m6.f27890d6, this.f59564q, f2Var.getResourceProvider());
            }
            this.f59564q.e(m6.f27890d6, m6.f27834a7, -1);
            this.f59564q.setViewType(15);
            this.f59564q.setMemberRequestButton(this.f59550a);
        }
        return this.f59564q;
    }

    public final bv0 c() {
        if (this.f59562o == null) {
            f2 f2Var = this.f59555g;
            bv0 bv0Var = new bv0(f2Var.getParentActivity(), null, 1, f2Var.getResourceProvider());
            this.f59562o = bv0Var;
            if (this.B) {
                t6.h(m6.f27890d6, bv0Var, f2Var.getResourceProvider());
            }
            this.f59562o.d.setText(id.M0(2131748167, null));
            this.f59562o.f32368e.setText(id.M0(2131745807, null));
            this.f59562o.setAnimateLayoutChange(true);
            this.f59562o.setVisibility(8);
        }
        return this.f59562o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z9) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z9;
        int i7 = this.f59558k;
        tL_messages_hideChatJoinRequest.peer = qp.s1(i7).j1(-this.f59557j);
        tL_messages_hideChatJoinRequest.user_id = qp.s1(i7).q1(user);
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_hideChatJoinRequest, new l0(this, tL_chatInviteImporter, z9, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z9 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.f59556i.f25995a.get(this.f59557j);
            if (tL_messages_chatInviteImporters != null) {
                this.f59572z = true;
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
        ArrayList arrayList = this.f59553e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z9) {
                z11 = false;
            } else {
                z11 = true;
            }
            bv0 bv0Var = this.f59561n;
            if (bv0Var != null) {
                if (z11) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                bv0Var.setVisibility(i10);
            }
            bv0 bv0Var2 = this.f59562o;
            if (bv0Var2 != null) {
                bv0Var2.setVisibility(4);
            }
        } else {
            if (this.f59552c.isEmpty() && !z9) {
                z11 = false;
            } else {
                z11 = true;
            }
            bv0 bv0Var3 = this.f59561n;
            if (bv0Var3 != null) {
                bv0Var3.setVisibility(4);
            }
            bv0 bv0Var4 = this.f59562o;
            if (bv0Var4 != null) {
                if (z11) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                bv0Var4.setVisibility(i7);
            }
        }
        k(this.f59563p, z11, true);
        if (arrayList.isEmpty()) {
            bv0 bv0Var5 = this.f59561n;
            if (bv0Var5 != null) {
                bv0Var5.setVisibility(0);
            }
            bv0 bv0Var6 = this.f59562o;
            if (bv0Var6 != null) {
                bv0Var6.setVisibility(4);
            }
            k(this.f59564q, false, false);
            if (this.f59571y && this.f59559l) {
                this.f59555g.getActionBar().s().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: yh.m.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof e5) {
            if (this.f59571y) {
                g0.v1(this.f59555g.getParentActivity().getCurrentFocus());
            }
            yf.b bVar = new yf.b(5, this, (e5) view);
            if (this.f59571y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            g0.i3(bVar, j3);
        }
    }

    public final void i(boolean z9) {
        int i7;
        pj0 pj0Var = this.f59563p;
        if (pj0Var != null && (i7 = !this.f59554f.f59532c.B ? 1 : 0) >= 0 && i7 < pj0Var.getChildCount()) {
            this.f59563p.getChildAt(i7).setEnabled(z9);
        }
    }

    public final void j(String str) {
        if (this.f59568u != null) {
            Utilities.f21343g.a(this.f59568u);
            this.f59568u = null;
        }
        int i7 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f59558k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f59567t = str;
        if (this.f59572z && this.f59553e.isEmpty()) {
            k(this.f59564q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f59554f.E(this.f59553e);
            k(this.f59563p, true, true);
            k(this.f59564q, false, false);
            bv0 bv0Var = this.f59562o;
            if (bv0Var != null) {
                bv0Var.setVisibility(4);
            }
            if (str == null && this.f59559l) {
                r0 j3 = this.f59555g.getActionBar().s().j(0);
                if (this.f59553e.isEmpty()) {
                    i7 = 8;
                }
                j3.setVisibility(i7);
            }
        } else {
            this.f59554f.E(Collections.EMPTY_LIST);
            k(this.f59563p, false, false);
            k(this.f59564q, true, true);
            p5 p5Var = Utilities.f21343g;
            e eVar = new e(this, 2);
            this.f59568u = eVar;
            p5Var.d(eVar, 300L);
        }
        if (str != null) {
            bv0 bv0Var2 = this.f59561n;
            if (bv0Var2 != null) {
                bv0Var2.setVisibility(4);
            }
            bv0 bv0Var3 = this.f59562o;
            if (bv0Var3 != null) {
                bv0Var3.setVisibility(4);
            }
        }
    }
}
