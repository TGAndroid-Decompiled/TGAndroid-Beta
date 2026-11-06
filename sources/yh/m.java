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
    public final boolean f59420a;
    public boolean f59421b;
    public final f2 f59425g;
    public final FrameLayout h;
    public final vi f59426i;
    public final long f59427j;
    public final int f59428k;
    public final boolean f59429l;
    public FrameLayout f59430m;
    public av0 f59431n;
    public av0 f59432o;
    public pj0 f59433p;
    public lz f59434q;
    public TLRPC.TL_chatInviteImporter f59435r;
    public l f59436s;
    public String f59437t;
    public e f59438u;
    public int v;
    public boolean f59439w;
    public boolean f59441y;
    public boolean f59442z;
    public final ArrayList f59422c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f59423e = new ArrayList();
    public final h f59424f = new h(this);
    public boolean f59440x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final f D = new f(this, 0);

    public m(f2 f2Var, FrameLayout frameLayout, long j3, boolean z9) {
        this.f59425g = f2Var;
        this.h = frameLayout;
        this.f59427j = j3;
        int currentAccount = f2Var.getCurrentAccount();
        this.f59428k = currentAccount;
        this.f59420a = t3.U(currentAccount, j3);
        this.f59429l = z9;
        this.f59426i = vi.b(currentAccount);
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
        if (this.f59431n == null) {
            f2 f2Var = this.f59425g;
            av0 av0Var = new av0(f2Var.getParentActivity(), null, 16, f2Var.getResourceProvider());
            this.f59431n = av0Var;
            boolean z9 = this.f59420a;
            if (z9) {
                i7 = 2131748145;
            } else {
                i7 = 2131748194;
            }
            av0Var.d.setText(hd.M0(i7, null));
            w70 w70Var = this.f59431n.f31917e;
            if (z9) {
                i10 = 2131748144;
            } else {
                i10 = 2131748193;
            }
            w70Var.setText(hd.M0(i10, null));
            this.f59431n.setAnimateLayoutChange(true);
            this.f59431n.setVisibility(8);
        }
        return this.f59431n;
    }

    public final lz b() {
        if (this.f59434q == null) {
            f2 f2Var = this.f59425g;
            lz lzVar = new lz(f2Var.getParentActivity(), f2Var.getResourceProvider());
            this.f59434q = lzVar;
            lzVar.setAlpha(0.0f);
            if (this.B) {
                r6.i(k6.f27848d6, this.f59434q, f2Var.getResourceProvider());
            }
            this.f59434q.e(k6.f27848d6, k6.f27792a7, -1);
            this.f59434q.setViewType(15);
            this.f59434q.setMemberRequestButton(this.f59420a);
        }
        return this.f59434q;
    }

    public final av0 c() {
        if (this.f59432o == null) {
            f2 f2Var = this.f59425g;
            av0 av0Var = new av0(f2Var.getParentActivity(), null, 1, f2Var.getResourceProvider());
            this.f59432o = av0Var;
            if (this.B) {
                r6.i(k6.f27848d6, av0Var, f2Var.getResourceProvider());
            }
            this.f59432o.d.setText(hd.M0(2131748166, null));
            this.f59432o.f31917e.setText(hd.M0(2131745808, null));
            this.f59432o.setAnimateLayoutChange(true);
            this.f59432o.setVisibility(8);
        }
        return this.f59432o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z9) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z9;
        int i7 = this.f59428k;
        tL_messages_hideChatJoinRequest.peer = qp.s1(i7).j1(-this.f59427j);
        tL_messages_hideChatJoinRequest.user_id = qp.s1(i7).q1(user);
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_hideChatJoinRequest, new l0(this, tL_chatInviteImporter, z9, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z9 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.f59426i.f25980a.get(this.f59427j);
            if (tL_messages_chatInviteImporters != null) {
                this.f59442z = true;
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
        ArrayList arrayList = this.f59423e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z9) {
                z11 = false;
            } else {
                z11 = true;
            }
            av0 av0Var = this.f59431n;
            if (av0Var != null) {
                if (z11) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                av0Var.setVisibility(i10);
            }
            av0 av0Var2 = this.f59432o;
            if (av0Var2 != null) {
                av0Var2.setVisibility(4);
            }
        } else {
            if (this.f59422c.isEmpty() && !z9) {
                z11 = false;
            } else {
                z11 = true;
            }
            av0 av0Var3 = this.f59431n;
            if (av0Var3 != null) {
                av0Var3.setVisibility(4);
            }
            av0 av0Var4 = this.f59432o;
            if (av0Var4 != null) {
                if (z11) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                av0Var4.setVisibility(i7);
            }
        }
        k(this.f59433p, z11, true);
        if (arrayList.isEmpty()) {
            av0 av0Var5 = this.f59431n;
            if (av0Var5 != null) {
                av0Var5.setVisibility(0);
            }
            av0 av0Var6 = this.f59432o;
            if (av0Var6 != null) {
                av0Var6.setVisibility(4);
            }
            k(this.f59434q, false, false);
            if (this.f59441y && this.f59429l) {
                this.f59425g.getActionBar().q().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: yh.m.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof e5) {
            if (this.f59441y) {
                g0.v1(this.f59425g.getParentActivity().getCurrentFocus());
            }
            q qVar = new q(9, this, (e5) view);
            if (this.f59441y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            g0.i3(qVar, j3);
        }
    }

    public final void i(boolean z9) {
        int i7;
        pj0 pj0Var = this.f59433p;
        if (pj0Var != null && (i7 = !this.f59424f.f59402c.B ? 1 : 0) >= 0 && i7 < pj0Var.getChildCount()) {
            this.f59433p.getChildAt(i7).setEnabled(z9);
        }
    }

    public final void j(String str) {
        if (this.f59438u != null) {
            Utilities.f21335g.a(this.f59438u);
            this.f59438u = null;
        }
        int i7 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f59428k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f59437t = str;
        if (this.f59442z && this.f59423e.isEmpty()) {
            k(this.f59434q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f59424f.E(this.f59423e);
            k(this.f59433p, true, true);
            k(this.f59434q, false, false);
            av0 av0Var = this.f59432o;
            if (av0Var != null) {
                av0Var.setVisibility(4);
            }
            if (str == null && this.f59429l) {
                r0 j3 = this.f59425g.getActionBar().q().j(0);
                if (this.f59423e.isEmpty()) {
                    i7 = 8;
                }
                j3.setVisibility(i7);
            }
        } else {
            this.f59424f.E(Collections.EMPTY_LIST);
            k(this.f59433p, false, false);
            k(this.f59434q, true, true);
            p5 p5Var = Utilities.f21335g;
            e eVar = new e(this, 2);
            this.f59438u = eVar;
            p5Var.d(eVar, 300L);
        }
        if (str != null) {
            av0 av0Var2 = this.f59431n;
            if (av0Var2 != null) {
                av0Var2.setVisibility(4);
            }
            av0 av0Var3 = this.f59432o;
            if (av0Var3 != null) {
                av0Var3.setVisibility(4);
            }
        }
    }
}
