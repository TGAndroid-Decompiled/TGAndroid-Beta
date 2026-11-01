package zf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a30;
import org.telegram.messenger.bp;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.o5;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.v2;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.d3;
import org.telegram.ui.Cells.g7;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.bg0;
import org.telegram.ui.fw;
import org.telegram.ui.vx;
import org.telegram.ui.zx;
import th.e5;
import th.n5;
import vh.m6;
import w7.b6;
public class m extends tk0 implements r2 {
    public boolean D;
    public boolean E;
    public final int F;
    public boolean G;
    public boolean H;
    public long I;
    public boolean J;
    public uk0 K;
    public nh0 L;
    public Drawable O;
    public final j P;
    public boolean Q;
    public final zx R;
    public boolean S;
    public final TLRPC.RequestPeerType T;
    public boolean U;
    public final long V;
    public boolean Z;
    public final Context f55580c;
    public ArrayList d;
    public boolean e;
    public int f55581f;
    public int h;
    public boolean f55582n;
    public final int f55583r;
    public long f55584s;
    public int f55585w;
    public final boolean f55586x;
    public final ArrayList f55587y;
    public ArrayList M = new ArrayList();
    public ArrayList N = new ArrayList();
    public int W = 10;
    public final LongSparseIntArray X = new LongSparseIntArray();
    public final HashMap Y = new HashMap();
    public int f55579a0 = -1;

    static {
        boolean z10 = v2.f18578a;
    }

    public m(zx zxVar, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType) {
        boolean z11;
        this.f55580c = context;
        this.R = zxVar;
        this.h = i10;
        this.f55583r = i11;
        this.f55586x = z10;
        if (i11 == 0 && i10 == 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.D = z11;
        this.f55587y = arrayList;
        this.F = i12;
        this.V = zxVar.Y2;
        if (i11 == 0) {
            ?? obj = new Object();
            obj.f55555a = new HashSet();
            obj.f55556b = new HashSet();
            obj.f55557c = new HashSet();
            obj.d = new ArrayList();
            obj.e = new r5.a(obj, 18);
            this.P = obj;
        }
        this.T = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                a7.y(view, drawable, t6.f20893b7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e) {
                f8.g(e, true);
                return;
            }
        }
        int i10 = t6.f20873a7;
        xg.a aVar = new xg.a(29);
        g gVar = new g(0);
        int Q = a7.Q(i10, -1, 0, 0.0f, null);
        gVar.d(Q, view);
        u6 x10 = a7.x(101, view);
        x10.c(i10, -1, 0, 0.0f, null);
        x10.f21397n = aVar;
        x10.f21398o = gVar;
        x10.f21396m = false;
        x10.f21391g = Q;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 != 1 && i10 != 5 && i10 != 3 && i10 != 8 && i10 != 7 && i10 != 10 && i10 != 11 && i10 != 13 && i10 != 15 && i10 != 16 && i10 != 18 && i10 != 19 && i10 != 20) {
            return true;
        }
        return false;
    }

    public final int F() {
        int i10 = this.h;
        int i11 = this.f55583r;
        if (i10 != 7 && i10 != 8) {
            if (i11 == 1) {
                return 2;
            }
            if (this.d != null) {
                return 1;
            }
            return 0;
        } else if (wp.r1(this.F).f19088b2.get(i11)) {
            return 2;
        } else {
            return 3;
        }
    }

    public final int G(long j10) {
        for (int i10 = 0; i10 < this.M.size(); i10++) {
            if (((k) this.M.get(i10)).f55562c != null && ((k) this.M.get(i10)).f55562c.f19798id == j10) {
                return i10;
            }
        }
        return -1;
    }

    public final int H(int i10) {
        if (this.E) {
            i10--;
        }
        if (this.D) {
            i10 = sc.e.e(2, i10, wp.r1(this.F).f19236s);
        }
        if (this.f55582n && this.h == 3) {
            i10--;
        }
        int i11 = this.h;
        if (i11 != 11 && i11 != 13) {
            if (i11 == 12) {
                return i10 - 1;
            }
            return i10;
        }
        return i10 - 2;
    }

    public final bp I() {
        int i10 = this.h;
        if (i10 != 7 && i10 != 8) {
            return null;
        }
        return wp.r1(this.F).M[this.h - 7];
    }

    public final Object J(int i10) {
        if (i10 >= 0 && i10 < this.M.size()) {
            k kVar = (k) this.M.get(i10);
            String str = kVar.f55568l;
            TLRPC.TL_contact tL_contact = kVar.e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = kVar.f55569m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = kVar.f55570n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = kVar.f55562c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return wp.r1(this.F).Z1(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = kVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void N(boolean z10) {
        this.f55582n = z10;
    }

    public final void O(nh0 nh0Var) {
        this.L = nh0Var;
    }

    public final void P(uk0 uk0Var, boolean z10) {
        this.J = z10;
        for (int i10 = 0; i10 < uk0Var.getChildCount(); i10++) {
            if (uk0Var.getChildAt(i10) instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) uk0Var.getChildAt(i10)).f23198f = z10;
            }
        }
        for (int i11 = 0; i11 < uk0Var.getCachedChildCount(); i11++) {
            if (uk0Var.P(i11) instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) uk0Var.P(i11)).f23198f = z10;
            }
        }
        for (int i12 = 0; i12 < uk0Var.getHiddenChildCount(); i12++) {
            if (uk0Var.V(i12) instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) uk0Var.V(i12)).f23198f = z10;
            }
        }
        for (int i13 = 0; i13 < uk0Var.getAttachedScrapChildCount(); i13++) {
            if (uk0Var.O(i13) instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) uk0Var.O(i13)).f23198f = z10;
            }
        }
    }

    public final void Q(boolean z10) {
        this.Q = z10;
    }

    public final void R(long j10) {
        this.f55584s = j10;
    }

    public final void S(vx vxVar) {
        this.K = vxVar;
    }

    public boolean T() {
        return false;
    }

    public final void U(boolean z10) {
        int i10 = this.F;
        if (this.d != null) {
            if (!z10 || SystemClock.elapsedRealtime() - this.I >= 2000) {
                this.I = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                    Collections.sort(this.d, new u20(wp.r1(i10), currentTime, 2));
                    if (z10) {
                        f();
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
    }

    public final void V() {
        boolean z10;
        if (this.f55583r == 0 && this.h == 0 && !this.f55586x && !wp.r1(this.F).f19236s.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z10;
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: zf.m.W():void");
    }

    public final void X(fw fwVar) {
        if (this.Z) {
            return;
        }
        this.Z = true;
        ArrayList arrayList = new ArrayList();
        this.N = arrayList;
        arrayList.addAll(this.M);
        W();
        ArrayList arrayList2 = new ArrayList(this.M);
        ArrayList arrayList3 = this.N;
        this.M = arrayList3;
        hg.a aVar = new hg.a(this, arrayList2, 6);
        arrayList3.size();
        m4.d c10 = s4.n.c(aVar, true);
        this.Z = false;
        if (fwVar != null) {
            fwVar.run();
        }
        this.M = arrayList2;
        c10.c(this);
    }

    @Override
    public final int b() {
        int size = this.M.size();
        this.f55585w = size;
        return size;
    }

    @Override
    public final long c(int i10) {
        return ((k) this.M.get(i10)).f55567k;
    }

    @Override
    public final int d(int i10) {
        return ((k) this.M.get(i10)).f7681a;
    }

    @Override
    public void f() {
        if (this.Z) {
            this.M = new ArrayList();
        }
        this.Z = false;
        W();
        super.f();
    }

    @Override
    public final boolean m() {
        return this.f55587y.isEmpty();
    }

    @Override
    public final void q() {
        boolean z10;
        e5 O1 = wp.r1(this.F).O1();
        ArrayList arrayList = O1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (O1.E(0, o5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long o10 = o5.o(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z10 || O1.E(0, o10) != 0) {
                arrayList2.add(Long.valueOf(o10));
            }
        }
        this.R.getOrCreateStoryViewer().T(this.f55580c, null, arrayList2, 0, null, null, new n5(this.K, true), false);
    }

    @Override
    public final void t(s4.c1 r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: zf.m.t(s4.c1, int):void");
    }

    @Override
    public final void u(org.telegram.ui.Cells.v2 v2Var) {
        int i10 = this.F;
        wp.r1(i10);
        if (wp.r1(i10).O1().K(v2Var.getDialogId())) {
            zx zxVar = this.R;
            zxVar.getOrCreateStoryViewer().getClass();
            zxVar.getOrCreateStoryViewer().R(zxVar.getParentActivity(), v2Var.getDialogId(), n5.a((uk0) v2Var.getParent()));
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        ?? r22;
        int i11;
        int i12;
        p4 p4Var;
        int i13;
        long j10 = this.V;
        Context context = this.f55580c;
        switch (i10) {
            case 0:
            case 21:
                int i14 = this.h;
                if (i14 != 2 && i14 != 15) {
                    org.telegram.ui.Cells.v2 v2Var = new org.telegram.ui.Cells.v2(this.R, this.f55580c, false, this.F, null);
                    if (T()) {
                        m6 m6Var = new m6(this, 4);
                        v2Var.J1 = true;
                        v2Var.K1 = m6Var;
                    }
                    v2Var.setArchivedPullAnimation(this.L);
                    v2Var.setPreloader(this.P);
                    v2Var.setDialogCellDelegate(this);
                    v2Var.setIsTransitionSupport(this.S);
                    if (i10 == 21) {
                        g7 g7Var = new g7(v2Var.getContext(), v2Var, false, 2131231208, v2Var.J4);
                        v2Var = v2Var;
                        v2Var.G = g7Var;
                        v2Var.F = true;
                    }
                    if (j10 != 0) {
                        v2Var.O0 = true;
                    }
                    r22 = v2Var;
                } else {
                    r22 = new k6(context, null);
                }
                if (this.h == 15) {
                    a7.i(t6.f20930d6, r22, null);
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new zz(context, null);
                r22.setIsSingleCell(true);
                if (i10 == 13) {
                    i11 = 18;
                } else {
                    i11 = 7;
                }
                r22.setViewType(i11);
                if (i11 == 18) {
                    r22.setIgnoreHeightCheck(true);
                }
                if (i10 == 13) {
                    r22.setItemsCount((int) ((org.telegram.messenger.i0.f16172q.y * 0.5f) / org.telegram.messenger.i0.L(64.0f)));
                    break;
                }
                break;
            case 2:
                r22 = new p4(context);
                r22.setText(dd.L0(2131746375, null));
                TextView textView = new TextView(context);
                sc.e.t(textView, 1, 15.0f);
                a30.p(textView, t6.L6, null, null, 2131746374);
                int i15 = 3;
                if (dd.X) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                textView.setGravity(i12 | 16);
                if (!dd.X) {
                    i15 = 5;
                }
                r22.addView(textView, b6.d(-1, -1.0f, i15 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new f(this, 0));
                break;
            case 3:
                r22 = new bg0(context, 22);
                a7.i(t6.f20873a7, r22, null);
                View view = new View(context);
                a7.a0(view, context, 2131231230, t6.f20893b7);
                r22.addView(view, b6.c(-1.0f, -1));
                break;
            case 4:
                r22 = new org.telegram.ui.Cells.z(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.f23376n = new r8((p6) null);
                r22.f23380x = org.telegram.messenger.i0.L(40.0f);
                r22.F = org.telegram.messenger.i0.L(10.0f);
                r22.H = e20.f15506s0;
                t6.T(context);
                imageReceiver.J0(org.telegram.messenger.i0.L(26.0f));
                break;
            case 5:
                r22 = new b3(context);
                break;
            case 6:
                r22 = new pa(context, 8, 0, false);
                break;
            case 7:
                r22 = new p4(context);
                zx zxVar = this.R;
                if (zxVar == null || !zxVar.N0) {
                    r22.setPadding(0, 0, 0, org.telegram.messenger.i0.L(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new c7(context, (org.telegram.ui.Cells.f1) null);
                Drawable Y0 = t6.Y0(context, 2131231230, t6.f20893b7);
                eq eqVar = new eq(new ColorDrawable(t6.x0(null, t6.f20873a7, false)), Y0);
                eqVar.f25909x = true;
                r22.setBackgroundDrawable(eqVar);
                E(r22, Y0);
                break;
            case 9:
            case 12:
            default:
                r22 = new p8(context);
                if (this.h == 15) {
                    a7.i(t6.f20930d6, r22, null);
                    break;
                }
                break;
            case 10:
                r22 = new l(this, context);
                break;
            case 11:
                r22 = new i(this, context);
                Drawable Y02 = t6.Y0(context, 2131231230, t6.f20893b7);
                eq eqVar2 = new eq(new ColorDrawable(t6.x0(null, t6.f20873a7, false)), Y02);
                eqVar2.f25909x = true;
                r22.setBackgroundDrawable(eqVar2);
                E(r22, Y02);
                break;
            case 14:
                p4 p4Var2 = new p4(this.f55580c, t6.f7, 16, 0, false, null);
                p4Var2.setHeight(32);
                p4Var2.setClickable(false);
                p4Var = p4Var2;
                r22 = p4Var;
                break;
            case 15:
                r22 = new LinearLayout(context);
                r22.f23017b = new ArrayList();
                r22.setOrientation(1);
                a7.i(t6.f20873a7, r22, null);
                break;
            case 16:
                r22 = new h(this, context);
                break;
            case 17:
                r22 = new d3(context);
                break;
            case 18:
                r22 = new bn(context, 29);
                break;
            case 19:
                r22 = new l(this, context);
                r22.addView(new l6(this.f55580c, this.F, null, new e(this, 1), null), b6.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new z3(context, null);
                break;
            case 22:
                r22 = new p4(context);
                break;
            case 23:
                ?? v2Var2 = new org.telegram.ui.Cells.v2(this.R, this.f55580c, false, this.F, null);
                p4Var = v2Var2;
                if (j10 != 0) {
                    v2Var2.O0 = true;
                    v2Var2.P0 = true;
                    p4Var = v2Var2;
                }
                r22 = p4Var;
                break;
        }
        if (i10 != 5 && i10 != 19) {
            i13 = -2;
        } else {
            i13 = -1;
        }
        r22.setLayoutParams(new s4.o0(-1, i13));
        return new s4.c1(r22);
    }

    @Override
    public final void x(org.telegram.ui.Cells.v2 v2Var) {
        this.R.T4(v2Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        if (view instanceof org.telegram.ui.Cells.v2) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
            v2Var.a0(this.H, false);
            v2Var.c0(this.f55587y.contains(Long.valueOf(v2Var.getDialogId())), false);
        }
    }

    public void M(TLRPC.User user) {
    }

    public void l(org.telegram.ui.Cells.v2 v2Var) {
    }

    public void r(org.telegram.ui.Cells.v2 v2Var) {
    }

    public void K() {
    }

    public void L() {
    }
}
