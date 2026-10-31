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
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.n0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wb;
import org.telegram.ui.cv0;
import org.telegram.ui.do0;
import org.telegram.ui.hk;
import org.telegram.ui.un;
import org.telegram.ui.z00;
import r0.h0;
import rh.e3;
import th.n5;
import vh.d6;
import w7.b6;
import w7.n7;
import x7.g8;
public final class a0 extends z2 implements us, fe.e, r2 {
    public static final int M1 = 0;
    public final rf.w A1;
    public final rf.w B1;
    public final View C1;
    public final e0 D1;
    public final boolean E1;
    public final q20 F1;
    public final Paint G1;
    public ArrayList H1;
    public String I1;
    public String J1;
    public i0.c K1;
    public i0.c L1;
    public final fe.b f54441i1;
    public final fe.b f54442j1;
    public final hk f54443k1;
    public final long l1;
    public TLRPC.Chat f54444m1;
    public boolean f54445n1;
    public vh.d f54446o1;
    public vh.d f54447p1;
    public final k2 f54448q1;
    public final w f54449r1;
    public final v f54450s1;
    public final v f54451t1;
    public final h10 f54452u1;
    public final h10 f54453v1;
    public final z00 f54454w1;
    public final u51 f54455x1;
    public final do0 f54456y1;
    public final do0 f54457z1;

    public a0(k2 k2Var, long j10) {
        this(k2Var, j10, null, null);
    }

    @Override
    public final boolean H() {
        if (!this.f54441i1.f7021f && !this.f54442j1.f7021f) {
            View currentView = this.f54443k1.getCurrentView();
            if (currentView instanceof y) {
                return ((y) currentView).e;
            }
            return true;
        }
        return false;
    }

    public final boolean I0(a51 a51Var) {
        Object obj = a51Var.G;
        if (obj instanceof zh.f) {
            zh.f fVar = (zh.f) obj;
            long j10 = fVar.f55774a;
            TLRPC.Chat L0 = vp.r1(this.f21583a).L0(Long.valueOf(-j10));
            TLRPC.User Z1 = vp.r1(this.f21583a).Z1(Long.valueOf(j10));
            k2 k2Var = this.f54448q1;
            if (Z1 != null) {
                k2Var.presentFragment(un.ha(Z1.f19942id));
                return true;
            } else if (!w3.t0(L0) && !w3.j0(L0)) {
                new ai.c(getContext(), L0, new o(1, this, fVar)).show();
                return true;
            } else {
                k2Var.presentFragment(un.ha(-L0.f19793id));
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
            arrayList.add(a51.E(99, (int) (i0.f16026q.y * 0.35f)));
            arrayList.add(a51.E(0, i0.L(56.0f)));
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
                        arrayList.add(a51.w(chat));
                    }
                } else {
                    arrayList.add(a51.w(chat));
                }
            }
        }
    }

    public final void K0(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.f19793id;
        boolean V = w3.V(chat);
        if (!w3.T(chat)) {
            x1 x1Var = new x1(3, getContext(), null);
            x1Var.r(250L);
            vp.r1(this.f21583a).T(getContext(), -j11, null, new c(this, x1Var, j10, z10, 1), null);
            return;
        }
        vp.r1(this.f21583a).O2(j11, j10, false, z10, new cv0(3, this, V));
    }

    @Override
    public final void L() {
        zs.f(this.f21583a).n(this, zs.T);
        zs.f(this.f21583a).n(this, zs.f19676r);
        super.L();
    }

    public final void L0(a51 a51Var) {
        Object obj = a51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.E1) {
                this.F1.a(chat);
                dismiss();
                return;
            }
            new ai.a(getContext(), this.f54444m1, -chat.f19793id, new e3(17, this, chat)).show();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = zs.T;
        long j10 = this.l1;
        w wVar = this.f54449r1;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).f19794id == j10) {
                wVar.d.f30819f3.O(true);
            }
        } else if (i10 == zs.f19676r) {
            Integer num = (Integer) objArr[0];
            int intValue = num.intValue();
            int i13 = vp.D8;
            if ((intValue & 8192) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                TLRPC.Chat L0 = vp.r1(this.f21583a).L0(Long.valueOf(j10));
                this.f54444m1 = L0;
                wVar.f54536a.setTitle(o5.m(L0));
                wVar.h.e(this.f54444m1, wVar.f54534n);
            }
        }
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f54443k1.getCurrentPosition() > 0) {
            if (this.f54443k1.getCurrentPosition() == 2) {
                fe.b bVar = this.f54442j1;
                if (bVar.f7021f) {
                    this.f54451t1.d.f30818e3.h1(1, this.L1.f7766b);
                    bVar.a(false, true);
                    this.f21610q0 = true;
                    h10 h10Var = this.f54453v1;
                    i0.v1(h10Var.f26588r);
                    h10Var.f26588r.clearFocus();
                    return;
                }
            }
            this.f54443k1.E(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void r(v2 v2Var) {
        TLRPC.TL_forumTopic f7;
        if (v2Var.getMessage() != null && (f7 = vp.r1(this.f21583a).f18891r7.f(-v2Var.getDialogId(), jj.c2(this.f21583a, v2Var.getMessage().f16337k, true, false))) != null) {
            gg.e.m(this.f54448q1, -v2Var.getDialogId(), f7, 0);
        }
    }

    @Override
    public final void s0() {
        Paint paint = this.G1;
        try {
            super.s0();
            int w02 = t6.w0(t6.f20872a7, this.I0);
            if (paint.getColor() != w02) {
                v0(w02);
                paint.setColor(w02);
                ViewGroup viewGroup = this.f21586b;
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
        if (vp.r1(this.f21583a).O1().K(v2Var.getDialogId())) {
            k2 k2Var = this.f54448q1;
            k2Var.getOrCreateStoryViewer().getClass();
            k2Var.getOrCreateStoryViewer().R(k2Var.getContext(), v2Var.getDialogId(), n5.a((tk0) v2Var.getParent()));
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
            w wVar = this.f54449r1;
            wVar.f54536a.setAlpha(a2);
            wVar.f54536a.setScaleX(T1);
            wVar.f54536a.setScaleY(T1);
            org.telegram.ui.ActionBar.l lVar = wVar.f54536a;
            int i21 = (a2 > 0.0f ? 1 : (a2 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            lVar.setVisibility(i15);
            float T12 = i0.T1(0.9f, 1.0f, f7);
            h10 h10Var = this.f54452u1;
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
            wVar.d.setAlpha(a2);
            u51 u51Var = wVar.d;
            if (i21 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            u51Var.setVisibility(i17);
            this.f54446o1.setAlpha(a2);
            this.f54446o1.setScaleX(i0.T1(0.95f, 1.0f, a2));
            this.f54446o1.setScaleY(i0.T1(0.95f, 1.0f, a2));
            vh.d dVar = this.f54446o1;
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            dVar.setVisibility(i18);
            z00 z00Var = this.f54454w1;
            z00Var.setAlpha(f7);
            if (i22 > 0) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            z00Var.setVisibility(i19);
            this.f21586b.invalidate();
            this.f54456y1.invalidate();
        }
        if (i10 == 2) {
            float a10 = n7.a(f7);
            float T13 = i0.T1(0.9f, 1.0f, a10);
            v vVar = this.f54451t1;
            vVar.f54536a.setAlpha(a10);
            vVar.f54536a.setScaleX(T13);
            vVar.f54536a.setScaleY(T13);
            org.telegram.ui.ActionBar.l lVar2 = vVar.f54536a;
            int i23 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            lVar2.setVisibility(i11);
            float T14 = i0.T1(0.9f, 1.0f, f7);
            h10 h10Var2 = this.f54453v1;
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
            vVar.d.setAlpha(a10);
            u51 u51Var2 = vVar.d;
            if (i23 > 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            u51Var2.setVisibility(i13);
            if (!this.E1) {
                this.f54447p1.setAlpha(a10);
                this.f54447p1.setScaleX(i0.T1(0.95f, 1.0f, a10));
                this.f54447p1.setScaleY(i0.T1(0.95f, 1.0f, a10));
                vh.d dVar2 = this.f54447p1;
                if (i23 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                dVar2.setVisibility(i14);
            }
            u51 u51Var3 = this.f54455x1;
            u51Var3.setAlpha(f7);
            if (i24 > 0) {
                i20 = 0;
            }
            u51Var3.setVisibility(i20);
            this.f21586b.invalidate();
            this.f54457z1.invalidate();
        }
    }

    public a0(k2 k2Var, long j10, ArrayList arrayList, o2 o2Var) {
        super(k2Var.getContext(), k2Var.getResourceProvider(), true, true);
        gr grVar = gr.h;
        this.f54441i1 = new fe.b(1, this, grVar, 350L, false);
        this.f54442j1 = new fe.b(2, this, grVar, 350L, false);
        this.A1 = new rf.w(2);
        this.B1 = new rf.w(8);
        Paint paint = new Paint(1);
        this.G1 = paint;
        i0.c cVar = i0.c.e;
        this.K1 = cVar;
        this.L1 = cVar;
        i0.S(getWindow());
        this.f54448q1 = k2Var;
        this.E1 = arrayList != null;
        this.H1 = arrayList;
        this.F1 = o2Var;
        Context context = k2Var.getContext();
        zs.f(this.f21583a).c(this, zs.T);
        zs.f(this.f21583a).c(this, zs.f19676r);
        int i10 = t6.f20872a7;
        paint.setColor(t6.w0(i10, this.I0));
        Q(i10);
        this.f21586b = new d6(this, context);
        hk hkVar = new hk(this, context, 9);
        this.f54443k1 = hkVar;
        int i11 = this.f21615t0;
        hkVar.setPadding(i11, 0, i11, 0);
        this.f21586b.addView(this.f54443k1, b6.e(-1, -1, 119));
        this.f54456y1 = new do0(this, context, 14);
        this.f54457z1 = new do0(this, context, 14);
        h10 h10Var = new h10(context, this.I0);
        this.f54452u1 = h10Var;
        h10Var.setCloseButtonVisible(true);
        h10Var.f26592y = true;
        h10Var.updateColors();
        String L0 = cd.L0(2131745853, null);
        n0 n0Var = h10Var.f26588r;
        n0Var.setHint(L0);
        n0Var.addTextChangedListener(new u(this, 0));
        h10Var.setVisibility(8);
        h10 h10Var2 = new h10(context, this.I0);
        this.f54453v1 = h10Var2;
        h10Var2.setCloseButtonVisible(true);
        h10Var2.f26592y = true;
        h10Var2.updateColors();
        String L02 = cd.L0(2131745853, null);
        n0 n0Var2 = h10Var2.f26588r;
        n0Var2.setHint(L02);
        n0Var2.addTextChangedListener(new u(this, 1));
        h10Var2.setVisibility(8);
        u51 u51Var = new u51(context, this.f21583a, 0, false, new r(this, 0), new s(this, 0), null, this.I0);
        this.f54455x1 = u51Var;
        u51Var.j(new p(this, 1));
        u51Var.setClipToPadding(false);
        u51Var.setVisibility(8);
        u51Var.r1();
        u51Var.f30819f3.f29295r = false;
        u51Var.setPadding(0, i0.L(52.0f) + i0.f16020m, 0, i0.f16021n);
        z00 z00Var = new z00(k2Var);
        this.f54454w1 = z00Var;
        z00Var.setVisibility(8);
        z00Var.setBackground(null);
        z00Var.setChatPreviewDelegate(new hb.a(28));
        z00Var.setUiCallback(new vh.e0(this));
        z00Var.f43941b.setClipToPadding(false);
        this.C1 = new View(getContext());
        Context context2 = getContext();
        p6 p6Var = this.I0;
        e0 e0Var = new e0(context2, p6Var, new cc((FrameLayout) this.f21586b, p6Var), this.f21583a, j10);
        this.D1 = e0Var;
        e0Var.h = new g8(4, this, k2Var);
        this.l1 = j10;
        this.f54444m1 = vp.r1(this.f21583a).L0(Long.valueOf(j10));
        vp.r1(this.f21583a).M0(j10);
        TLRPC.Chat chat = this.f54444m1;
        this.f54445n1 = chat != null && chat.collapsed_in_dialogs;
        zf.e0 e0Var2 = new zf.e0(2131232687, 4, o5.u(chat));
        e0Var2.f55478f = this.f54444m1;
        e0Var2.h = false;
        ArrayList arrayList2 = h10Var.F;
        arrayList2.add(e0Var2);
        h10Var.I = arrayList2.size() - 1;
        h10Var.e();
        v0(t6.w0(i10, this.I0));
        this.f54450s1 = new v(this, context, 1);
        this.f54449r1 = new w(this, context);
        this.f54451t1 = new v(this, context, 0);
        this.f54443k1.setAdapter(new ig.n(this, 4));
        h10Var.setCloseButtonOnClickListener(new t(this, 0));
        h10Var2.setCloseButtonOnClickListener(new t(this, 1));
        e0Var.d();
        vp.r1(this.f21583a).T2(0, j10, true);
        wb.a((FrameLayout) this.f21586b, new mg.u(16));
        ViewGroup viewGroup = this.f21586b;
        s sVar = new s(this, 1);
        WeakHashMap weakHashMap = h0.f46123a;
        r0.z.i(viewGroup, sVar);
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
