package yh;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jg.o2;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.kj;
import org.telegram.messenger.o5;
import org.telegram.messenger.r20;
import org.telegram.messenger.vs;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.n0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wb;
import org.telegram.ui.bo0;
import org.telegram.ui.bv0;
import org.telegram.ui.hk;
import org.telegram.ui.un;
import org.telegram.ui.y00;
import r0.h0;
import rh.q2;
import th.n5;
import vh.d6;
import w7.b6;
import w7.n7;
import x7.g8;
import xh.e3;
public final class z extends z2 implements vs, fe.e, r2 {
    public static final int M1 = 0;
    public final rf.w A1;
    public final rf.w B1;
    public final View C1;
    public final d0 D1;
    public final boolean E1;
    public final r20 F1;
    public final Paint G1;
    public ArrayList H1;
    public String I1;
    public String J1;
    public i0.c K1;
    public i0.c L1;
    public final fe.b f54543i1;
    public final fe.b f54544j1;
    public final hk f54545k1;
    public final long l1;
    public TLRPC.Chat f54546m1;
    public boolean f54547n1;
    public vh.d f54548o1;
    public vh.d f54549p1;
    public final k2 f54550q1;
    public final v f54551r1;
    public final u f54552s1;
    public final u f54553t1;
    public final h10 f54554u1;
    public final h10 f54555v1;
    public final y00 f54556w1;
    public final v51 f54557x1;
    public final bo0 f54558y1;
    public final bo0 f54559z1;

    public z(k2 k2Var, long j10) {
        this(k2Var, j10, null, null);
    }

    @Override
    public final boolean H() {
        if (!this.f54543i1.f7022f && !this.f54544j1.f7022f) {
            View currentView = this.f54545k1.getCurrentView();
            if (currentView instanceof x) {
                return ((x) currentView).e;
            }
            return true;
        }
        return false;
    }

    public final boolean I0(b51 b51Var) {
        Object obj = b51Var.G;
        if (obj instanceof zh.f) {
            zh.f fVar = (zh.f) obj;
            long j10 = fVar.f55792a;
            TLRPC.Chat L0 = wp.r1(this.f21584a).L0(Long.valueOf(-j10));
            TLRPC.User Z1 = wp.r1(this.f21584a).Z1(Long.valueOf(j10));
            k2 k2Var = this.f54550q1;
            if (Z1 != null) {
                k2Var.presentFragment(un.ma(Z1.f19943id));
                return true;
            } else if (!w3.t0(L0) && !w3.j0(L0)) {
                new ai.c(getContext(), L0, new e3(2, this, fVar)).show();
                return true;
            } else {
                k2Var.presentFragment(un.ma(-L0.f19794id));
                return true;
            }
        }
        return false;
    }

    public final void J0(ArrayList arrayList, boolean z10) {
        String str;
        String str2;
        int i10 = 0;
        if (!z10) {
            arrayList.add(b51.E(99, (int) (i0.f16172q.y * 0.35f)));
            arrayList.add(b51.E(0, i0.L(56.0f)));
        }
        if (this.H1 != null) {
            if (z10 && (str2 = this.J1) != null) {
                str = str2.toLowerCase();
            } else {
                str = null;
            }
            ArrayList arrayList2 = this.H1;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (z10 && !TextUtils.isEmpty(str)) {
                    String str3 = chat.title;
                    if (str3 != null && str3.toLowerCase().contains(str)) {
                        arrayList.add(b51.w(chat));
                    }
                } else {
                    arrayList.add(b51.w(chat));
                }
            }
        }
    }

    public final void K0(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.f19794id;
        boolean V = w3.V(chat);
        if (!w3.T(chat)) {
            x1 x1Var = new x1(3, getContext(), null);
            x1Var.r(250L);
            wp.r1(this.f21584a).T(getContext(), -j11, null, new c(this, x1Var, j10, z10, 1), null);
            return;
        }
        wp.r1(this.f21584a).O2(j11, j10, false, z10, new bv0(3, this, V));
    }

    @Override
    public final void L() {
        at.f(this.f21584a).n(this, at.T);
        at.f(this.f21584a).n(this, at.f14772r);
        super.L();
    }

    public final void L0(b51 b51Var) {
        Object obj = b51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.E1) {
                this.F1.a(chat);
                dismiss();
                return;
            }
            new ai.a(getContext(), this.f54546m1, -chat.f19794id, new q2(18, this, chat)).show();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = at.T;
        long j10 = this.l1;
        v vVar = this.f54551r1;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).f19795id == j10) {
                vVar.d.f31183f3.O(true);
            }
        } else if (i10 == at.f14772r) {
            Integer num = (Integer) objArr[0];
            int intValue = num.intValue();
            int i13 = wp.D8;
            if ((intValue & 8192) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                TLRPC.Chat L0 = wp.r1(this.f21584a).L0(Long.valueOf(j10));
                this.f54546m1 = L0;
                vVar.f54537a.setTitle(o5.m(L0));
                vVar.h.e(this.f54546m1, vVar.f54535n);
            }
        }
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f54545k1.getCurrentPosition() > 0) {
            if (this.f54545k1.getCurrentPosition() == 2) {
                fe.b bVar = this.f54544j1;
                if (bVar.f7022f) {
                    this.f54553t1.d.f31182e3.h1(1, this.L1.f7767b);
                    bVar.a(false, true);
                    this.f21611q0 = true;
                    h10 h10Var = this.f54555v1;
                    i0.v1(h10Var.f26635r);
                    h10Var.f26635r.clearFocus();
                    return;
                }
            }
            this.f54545k1.E(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void r(v2 v2Var) {
        TLRPC.TL_forumTopic f7;
        if (v2Var.getMessage() != null && (f7 = wp.r1(this.f21584a).f19234r7.f(-v2Var.getDialogId(), kj.c2(this.f21584a, v2Var.getMessage().f16690k, true, false))) != null) {
            gg.e.m(this.f54550q1, -v2Var.getDialogId(), f7, 0);
        }
    }

    @Override
    public final void s0() {
        Paint paint = this.G1;
        try {
            super.s0();
            int w02 = t6.w0(t6.f20873a7, this.I0);
            if (paint.getColor() != w02) {
                v0(w02);
                paint.setColor(w02);
                ViewGroup viewGroup = this.f21587b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void u(v2 v2Var) {
        if (wp.r1(this.f21584a).O1().K(v2Var.getDialogId())) {
            k2 k2Var = this.f54550q1;
            k2Var.getOrCreateStoryViewer().getClass();
            k2Var.getOrCreateStoryViewer().R(k2Var.getContext(), v2Var.getDialogId(), n5.a((uk0) v2Var.getParent()));
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = 8;
        if (i10 == 1) {
            float a2 = n7.a(f7);
            float T1 = i0.T1(0.9f, 1.0f, a2);
            v vVar = this.f54551r1;
            vVar.f54537a.setAlpha(a2);
            vVar.f54537a.setScaleX(T1);
            vVar.f54537a.setScaleY(T1);
            org.telegram.ui.ActionBar.l lVar = vVar.f54537a;
            int i21 = (a2 > 0.0f ? 1 : (a2 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            lVar.setVisibility(i15);
            float T12 = i0.T1(0.9f, 1.0f, f7);
            h10 h10Var = this.f54554u1;
            h10Var.setAlpha(f7);
            h10Var.setScaleX(T12);
            h10Var.setScaleY(T12);
            int i22 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            h10Var.setVisibility(i16);
            vVar.d.setAlpha(a2);
            v51 v51Var = vVar.d;
            if (i21 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            v51Var.setVisibility(i17);
            this.f54548o1.setAlpha(a2);
            this.f54548o1.setScaleX(i0.T1(0.95f, 1.0f, a2));
            this.f54548o1.setScaleY(i0.T1(0.95f, 1.0f, a2));
            vh.d dVar = this.f54548o1;
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            dVar.setVisibility(i18);
            y00 y00Var = this.f54556w1;
            y00Var.setAlpha(f7);
            if (i22 > 0) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            y00Var.setVisibility(i19);
            this.f21587b.invalidate();
            this.f54558y1.invalidate();
        }
        if (i10 == 2) {
            float a10 = n7.a(f7);
            float T13 = i0.T1(0.9f, 1.0f, a10);
            u uVar = this.f54553t1;
            uVar.f54537a.setAlpha(a10);
            uVar.f54537a.setScaleX(T13);
            uVar.f54537a.setScaleY(T13);
            org.telegram.ui.ActionBar.l lVar2 = uVar.f54537a;
            int i23 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            lVar2.setVisibility(i11);
            float T14 = i0.T1(0.9f, 1.0f, f7);
            h10 h10Var2 = this.f54555v1;
            h10Var2.setAlpha(f7);
            h10Var2.setScaleX(T14);
            h10Var2.setScaleY(T14);
            int i24 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i24 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            h10Var2.setVisibility(i12);
            uVar.d.setAlpha(a10);
            v51 v51Var2 = uVar.d;
            if (i23 > 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            v51Var2.setVisibility(i13);
            if (!this.E1) {
                this.f54549p1.setAlpha(a10);
                this.f54549p1.setScaleX(i0.T1(0.95f, 1.0f, a10));
                this.f54549p1.setScaleY(i0.T1(0.95f, 1.0f, a10));
                vh.d dVar2 = this.f54549p1;
                if (i23 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                dVar2.setVisibility(i14);
            }
            v51 v51Var3 = this.f54557x1;
            v51Var3.setAlpha(f7);
            if (i24 > 0) {
                i20 = 0;
            }
            v51Var3.setVisibility(i20);
            this.f21587b.invalidate();
            this.f54559z1.invalidate();
        }
    }

    public z(k2 k2Var, long j10, ArrayList arrayList, o2 o2Var) {
        super(k2Var.getContext(), k2Var.getResourceProvider(), true, true);
        gr grVar = gr.h;
        this.f54543i1 = new fe.b(1, this, grVar, 350L, false);
        this.f54544j1 = new fe.b(2, this, grVar, 350L, false);
        this.A1 = new rf.w(2);
        this.B1 = new rf.w(8);
        Paint paint = new Paint(1);
        this.G1 = paint;
        i0.c cVar = i0.c.e;
        this.K1 = cVar;
        this.L1 = cVar;
        i0.S(getWindow());
        this.f54550q1 = k2Var;
        this.E1 = arrayList != null;
        this.H1 = arrayList;
        this.F1 = o2Var;
        Context context = k2Var.getContext();
        at.f(this.f21584a).c(this, at.T);
        at.f(this.f21584a).c(this, at.f14772r);
        int i10 = t6.f20873a7;
        paint.setColor(t6.w0(i10, this.I0));
        Q(i10);
        this.f21587b = new d6(this, context);
        hk hkVar = new hk(this, context, 9);
        this.f54545k1 = hkVar;
        int i11 = this.f21616t0;
        hkVar.setPadding(i11, 0, i11, 0);
        this.f21587b.addView(this.f54545k1, b6.e(-1, -1, 119));
        this.f54558y1 = new bo0(this, context, 14);
        this.f54559z1 = new bo0(this, context, 14);
        h10 h10Var = new h10(context, this.I0);
        this.f54554u1 = h10Var;
        h10Var.setCloseButtonVisible(true);
        h10Var.f26639y = true;
        h10Var.updateColors();
        String L0 = dd.L0(2131745853, null);
        n0 n0Var = h10Var.f26635r;
        n0Var.setHint(L0);
        n0Var.addTextChangedListener(new t(this, 0));
        h10Var.setVisibility(8);
        h10 h10Var2 = new h10(context, this.I0);
        this.f54555v1 = h10Var2;
        h10Var2.setCloseButtonVisible(true);
        h10Var2.f26639y = true;
        h10Var2.updateColors();
        String L02 = dd.L0(2131745853, null);
        n0 n0Var2 = h10Var2.f26635r;
        n0Var2.setHint(L02);
        n0Var2.addTextChangedListener(new t(this, 1));
        h10Var2.setVisibility(8);
        v51 v51Var = new v51(context, this.f21584a, 0, false, new q(this, 0), new r(this, 0), null, this.I0);
        this.f54557x1 = v51Var;
        v51Var.j(new o(this, 1));
        v51Var.setClipToPadding(false);
        v51Var.setVisibility(8);
        v51Var.r1();
        v51Var.f31183f3.f29638r = false;
        v51Var.setPadding(0, i0.L(52.0f) + i0.f16166m, 0, i0.f16167n);
        y00 y00Var = new y00(k2Var);
        this.f54556w1 = y00Var;
        y00Var.setVisibility(8);
        y00Var.setBackground(null);
        y00Var.setChatPreviewDelegate(new hb.a(28));
        y00Var.setUiCallback(new vh.e0(this));
        y00Var.f43498b.setClipToPadding(false);
        this.C1 = new View(getContext());
        Context context2 = getContext();
        p6 p6Var = this.I0;
        d0 d0Var = new d0(context2, p6Var, new cc((FrameLayout) this.f21587b, p6Var), this.f21584a, j10);
        this.D1 = d0Var;
        d0Var.h = new g8(4, this, k2Var);
        this.l1 = j10;
        this.f54546m1 = wp.r1(this.f21584a).L0(Long.valueOf(j10));
        wp.r1(this.f21584a).M0(j10);
        TLRPC.Chat chat = this.f54546m1;
        this.f54547n1 = chat != null && chat.collapsed_in_dialogs;
        zf.e0 e0Var = new zf.e0(2131232687, 4, o5.u(chat));
        e0Var.f55496f = this.f54546m1;
        e0Var.h = false;
        ArrayList arrayList2 = h10Var.F;
        arrayList2.add(e0Var);
        h10Var.I = arrayList2.size() - 1;
        h10Var.e();
        v0(t6.w0(i10, this.I0));
        this.f54552s1 = new u(this, context, 1);
        this.f54551r1 = new v(this, context);
        this.f54553t1 = new u(this, context, 0);
        this.f54545k1.setAdapter(new ig.n(this, 4));
        h10Var.setCloseButtonOnClickListener(new s(this, 0));
        h10Var2.setCloseButtonOnClickListener(new s(this, 1));
        d0Var.d();
        wp.r1(this.f21584a).T2(0, j10, true);
        wb.a((FrameLayout) this.f21587b, new mg.u(16));
        ViewGroup viewGroup = this.f21587b;
        r rVar = new r(this, 1);
        WeakHashMap weakHashMap = h0.f46134a;
        r0.z.i(viewGroup, rVar);
    }

    @Override
    public final void q() {
    }

    @Override
    public final void l(v2 v2Var) {
    }

    @Override
    public final void x(v2 v2Var) {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
