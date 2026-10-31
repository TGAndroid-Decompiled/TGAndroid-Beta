package vh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.ul;
public final class r6 extends FrameLayout implements View.OnClickListener, us {
    public final org.telegram.ui.Cells.z3 D;
    public final uc0 E;
    public boolean F;
    public org.telegram.ui.ActionBar.x1 G;
    public long H;
    public String I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public boolean M;
    public boolean N;
    public float O;
    public ValueAnimator P;
    public boolean Q;
    public int R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public final w6 W;
    public int f51886a;
    public final a0.h f51887b;
    public final ArrayList f51888c;
    public final HashMap d;
    public final FrameLayout e;
    public final tk0 f51889f;
    public final s4.a0 h;
    public final n6 f51890n;
    public final p6 f51891r;
    public final View f51892s;
    public final d f51893w;
    public final d f51894x;
    public final k6 f51895y;

    public r6(w6 w6Var, Context context) {
        super(context);
        this.W = w6Var;
        this.f51887b = new a0.h();
        this.f51888c = new ArrayList();
        this.d = new HashMap();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.R = -1;
        int i10 = w6.U1;
        org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(context, w6Var.I0);
        this.D = z3Var;
        k6 k6Var = new k6(this, context, w6Var.I0, new i6(this, 4));
        this.f51895y = k6Var;
        int i11 = org.telegram.ui.ActionBar.t6.f21001h5;
        org.telegram.ui.ActionBar.a7.i(i11, k6Var, w6Var.I0);
        k6Var.setOnSearchTextChange(new j6(this, 3));
        uc0 uc0Var = new uc0(context, w6Var.I0);
        this.E = uc0Var;
        uc0Var.h = new i6(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.f16020m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.b6.e(-1, -1, 119));
        tk0 tk0Var = new tk0(context, w6Var.I0);
        this.f51889f = tk0Var;
        tk0Var.setClipToPadding(false);
        tk0Var.setTranslateSelector(true);
        n6 n6Var = new n6(this, context, w6Var.I0, k6Var, new th.r2(w6Var, 2));
        this.f51890n = n6Var;
        tk0Var.setAdapter(n6Var);
        n6Var.h = tk0Var;
        s4.a0 a0Var = new s4.a0();
        this.h = a0Var;
        tk0Var.setLayoutManager(a0Var);
        tk0Var.setOnScrollListener(new ul(2, this));
        tk0Var.setOnItemClickListener(new org.telegram.ui.web.k0(24, this, context));
        frameLayout.addView(tk0Var, w7.b6.c(-1.0f, -1));
        l6 l6Var = new l6(this);
        l6Var.n(350L);
        l6Var.o(gr.h);
        l6Var.C = false;
        l6Var.f47927m = false;
        tk0Var.setItemAnimator(l6Var);
        frameLayout.addView(k6Var, w7.b6.e(-1, -2, 55));
        frameLayout.addView(z3Var, w7.b6.e(-1, 32, 55));
        addView(uc0Var, w7.b6.e(-1, -2, 55));
        p6 p6Var = new p6(this, context);
        this.f51891r = p6Var;
        p6Var.setClickable(true);
        p6Var.setOrientation(1);
        p6Var.setPadding(org.telegram.messenger.i0.L(10.0f) + w6Var.f21615t0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f) + w6Var.f21615t0, org.telegram.messenger.i0.L(10.0f));
        org.telegram.ui.ActionBar.a7.i(i11, p6Var, w6Var.I0);
        d dVar = new d(context, w6Var.I0, true);
        this.f51893w = dVar;
        dVar.setOnClickListener(new h6(this, 0));
        dVar.f();
        p6Var.addView(dVar, w7.b6.r(-1, 48, 87));
        d dVar2 = new d(context, w6Var.I0, false);
        this.f51894x = dVar2;
        dVar2.setOnClickListener(new h6(this, 1));
        dVar2.f();
        p6Var.addView(dVar2, w7.b6.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.f51892s = view;
        org.telegram.ui.ActionBar.a7.i(i11, view, w6Var.I0);
        addView(view, w7.b6.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(p6Var, w7.b6.e(-1, -2, 87));
    }

    public static boolean d(String str, TLObject tLObject) {
        if (!TextUtils.isEmpty(str)) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                String lowerCase = org.telegram.messenger.i0.N3(h20.p(user)).toLowerCase();
                if (!lowerCase.startsWith(str) && !sc.e.y(" ", str, lowerCase)) {
                    String lowerCase2 = org.telegram.messenger.i0.N3(h20.n(user)).toLowerCase();
                    if (!lowerCase2.startsWith(str) && !sc.e.y(" ", str, lowerCase2)) {
                        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
                        if (arrayList != null) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                TLRPC.TL_username tL_username = arrayList.get(i10);
                                if (tL_username.active && org.telegram.messenger.i0.N3(tL_username.username).toLowerCase().startsWith(str)) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                String lowerCase3 = org.telegram.messenger.i0.N3(chat.title).toLowerCase();
                if (!lowerCase3.startsWith(str) && !sc.e.y(" ", str, lowerCase3)) {
                    String lowerCase4 = org.telegram.messenger.i0.N3(org.telegram.messenger.w3.K(chat, false)).toLowerCase();
                    if (!lowerCase4.startsWith(str) && !sc.e.y(" ", str, lowerCase4)) {
                        ArrayList<TLRPC.TL_username> arrayList2 = chat.usernames;
                        if (arrayList2 != null) {
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                TLRPC.TL_username tL_username2 = arrayList2.get(i11);
                                if (tL_username2.active && org.telegram.messenger.i0.N3(tL_username2.username).toLowerCase().startsWith(str)) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void a(boolean z10) {
        if (this.f51886a == 6) {
            ArrayList arrayList = this.f51888c;
            arrayList.clear();
            int i10 = w6.U1;
            arrayList.addAll(vp.r1(this.W.f21583a).O1().L);
            int i11 = 0;
            while (true) {
                a0.h hVar = this.f51887b;
                if (i11 >= hVar.m()) {
                    break;
                }
                long j10 = hVar.j(i11);
                if (((Boolean) hVar.n(i11)).booleanValue()) {
                    if (!arrayList.contains(Long.valueOf(j10))) {
                        arrayList.add(Long.valueOf(j10));
                    }
                } else {
                    arrayList.remove(Long.valueOf(j10));
                }
                i11++;
            }
            if (z10) {
                h(true);
                f(true);
                g(true);
            }
        }
    }

    public final void b(int i10) {
        int i11;
        this.f51886a = i10;
        this.f51887b.b();
        ArrayList arrayList = this.f51888c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        w6 w6Var = this.W;
        if (i10 == 4) {
            arrayList.addAll(w6Var.f52102k1);
            hashMap.putAll(w6Var.l1);
        } else if (i10 == 5) {
            arrayList.addAll(w6Var.A1);
        } else if (i10 == 1) {
            ArrayList J0 = w6.J0(w6Var);
            for (int i12 = 0; i12 < J0.size(); i12 = c3.i0.k(i12, 1, ((TLRPC.User) J0.get(i12)).f19942id, arrayList)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(w6Var.f52104n1);
        } else if (i10 == 3) {
            arrayList.addAll(w6Var.f52105o1);
            hashMap.putAll(w6Var.f52106p1);
        } else if (i10 == 6) {
            a(false);
        }
        this.f51890n.getClass();
        this.h.k1(false);
        j(false);
        k6 k6Var = this.f51895y;
        k6Var.setText("");
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        k6Var.setVisibility(i11);
        k6Var.L = true;
        this.I = null;
        h(false);
        f(false);
        g(false);
        int i13 = this.f51886a;
        tk0 tk0Var = this.f51889f;
        if (i13 != 0) {
            tk0Var.v0(0);
        }
        tk0Var.requestLayout();
        this.R = -1;
    }

    public final float c() {
        int i10 = 0;
        float f7 = -i0.a.d(150.0f, Math.min(org.telegram.messenger.i0.L(150.0f), this.f51895y.K), 0);
        while (true) {
            tk0 tk0Var = this.f51889f;
            if (i10 < tk0Var.getChildCount()) {
                View childAt = tk0Var.getChildAt(i10);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                    return Math.max(f7, childAt.getY());
                }
                i10++;
            } else {
                return f7;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.x1 x1Var;
        if (i10 == zs.T && (chatFull = (TLRPC.ChatFull) objArr[0]) != null && (x1Var = this.G) != null && this.H == chatFull.f19794id) {
            x1Var.c(350L);
            this.G = null;
            this.H = -1L;
            e(chatFull.f19794id, chatFull.participants);
        }
    }

    public final void e(long j10, TLRPC.ChatParticipants chatParticipants) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = this.f51886a;
        int i11 = 0;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        w6 w6Var = this.W;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i12 = 0; i12 < chatParticipants.participants.size(); i12++) {
                long j11 = chatParticipants.participants.get(i12).user_id;
                int i13 = w6.U1;
                TLRPC.User Z1 = vp.r1(w6Var.f21583a).Z1(Long.valueOf(j11));
                if (Z1 != null && !h20.B(Z1) && !Z1.bot && Z1.f19942id != 777000 && j11 != 0) {
                    if (z10 && !Z1.contact) {
                        arrayList2.add(Long.valueOf(j11));
                    } else {
                        arrayList.add(Long.valueOf(j11));
                    }
                    this.f51888c.remove(Long.valueOf(j11));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                Context context = getContext();
                int i14 = w6.U1;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, w6Var.I0);
                alertDialog$Builder.f20134a.T = "All group members are not in your contact list.";
                alertDialog$Builder.h("Cancel", null);
                alertDialog$Builder.p();
                return;
            }
            Context context2 = getContext();
            int i15 = w6.U1;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context2, w6Var.I0);
            alertDialog$Builder2.f20134a.T = arrayList2.size() + " members are not in your contact list";
            alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new org.telegram.messenger.voip.d0(this, j10, arrayList, 11));
            alertDialog$Builder2.h("Cancel", null);
            alertDialog$Builder2.p();
            return;
        }
        this.d.put(Long.valueOf(j10), arrayList);
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            this.f51887b.k(Boolean.TRUE, ((Long) obj).longValue());
        }
        j(true);
        f(true);
        g(true);
        this.f51895y.L = true;
    }

    public final void f(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f51886a;
        w6 w6Var = this.W;
        d dVar = this.f51894x;
        int i12 = 0;
        boolean z12 = false;
        d dVar2 = this.f51893w;
        if (i11 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z10);
            if (w6Var.C1) {
                dVar2.i(cd.L0(2131744573, null), z10, true);
            } else if (w6Var.Q1) {
                dVar2.i(cd.L0(2131744573, null), z10, true);
            } else {
                int i13 = w6Var.f52116z1;
                if (i13 == 1) {
                    if (w6Var.B1) {
                        i10 = 2131744638;
                    } else {
                        i10 = 2131744577;
                    }
                    dVar2.i(cd.L0(i10, null), z10, true);
                } else {
                    dVar2.i(cd.H(',', "StoryPrivacyButtonPostMultiple", i13), z10, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.f51888c;
        if (i11 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.i(cd.L0(2131744572, null), z10, true);
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        p6 p6Var = this.f51891r;
        if (i11 == 3) {
            int size = w6.R0(arrayList, this.d).size();
            w6Var.f52107q1 = size;
            dVar2.i(cd.L0(2131744573, null), z10, true);
            dVar2.setShowZero(false);
            if (size <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            p6Var.b(z11, z10);
            dVar2.c(size, z10);
            if (size > 0) {
                z12 = true;
            }
            dVar2.setEnabled(z12);
            dVar.setVisibility(8);
        } else if (i11 == 2) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                dVar2.i(cd.L0(2131744573, null), z10, true);
                dVar2.c(0, z10);
            } else {
                dVar2.i(cd.L0(2131744578, null), z10, true);
                dVar2.c(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
        } else if (i11 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
        } else if (i11 == 6) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.i(cd.L0(2131744572, null), z10, true);
            int i14 = w6.U1;
            th.e5 O1 = vp.r1(w6Var.f21583a).O1();
            if (!O1.O) {
                while (true) {
                    a0.h hVar = this.f51887b;
                    if (i12 >= hVar.m()) {
                        break;
                    }
                    long j10 = hVar.j(i12);
                    ((Boolean) hVar.n(i12)).getClass();
                    O1.L.contains(Long.valueOf(j10));
                    i12++;
                }
            } else {
                dVar2.c(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
        } else if (i11 == 4) {
            int size2 = w6.R0(w6Var.f52102k1, w6Var.l1).size();
            w6Var.f52103m1 = size2;
            dVar2.i(cd.L0(2131744573, null), z10, true);
            dVar2.setShowZero(false);
            p6Var.b(false, z10);
            dVar2.c(size2, z10);
            dVar2.setEnabled(true);
            dVar.setVisibility(8);
        }
    }

    public final void g(boolean z10) {
        ArrayList arrayList;
        int R;
        boolean z11;
        w6 w6Var = this.W;
        ArrayList arrayList2 = w6Var.A1;
        HashMap hashMap = w6Var.f52106p1;
        ArrayList arrayList3 = w6Var.f52105o1;
        ArrayList arrayList4 = w6Var.f52104n1;
        HashMap hashMap2 = w6Var.l1;
        ArrayList arrayList5 = w6Var.f52102k1;
        int i10 = this.f51886a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.f51888c;
        if (i10 == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i10 == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i10 == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i10 == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.f51886a == 3 && (w6Var.E1 != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.R;
                if (i11 != -1) {
                    w6Var.E1 = i11;
                }
            } else {
                this.R = w6Var.E1;
                w6Var.E1 = 3;
            }
        }
        HashSet R0 = w6.R0(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.L;
            boolean z12 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            g6 g6Var = (g6) arrayList.get(i12);
            if (g6Var != null) {
                int i13 = g6Var.f51203i;
                if (i13 > 0) {
                    if (w6Var.E1 != i13) {
                        z12 = false;
                    }
                    g6Var.f51205k = z12;
                    g6Var.f51206l = false;
                } else {
                    TLRPC.User user = g6Var.f51202g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.f19942id));
                        g6Var.f51205k = contains;
                        if (contains || !R0.contains(Long.valueOf(g6Var.f51202g.f19942id))) {
                            z12 = false;
                        }
                        g6Var.f51206l = z12;
                    } else {
                        TLRPC.Chat chat = g6Var.h;
                        if (chat != null) {
                            g6Var.f51205k = hashMap3.containsKey(Long.valueOf(chat.f19793id));
                            g6Var.f51206l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            tk0 tk0Var = this.f51889f;
            if (i14 < tk0Var.getChildCount()) {
                View childAt = tk0Var.getChildAt(i14);
                if ((childAt instanceof v6) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                    g6 g6Var2 = (g6) arrayList.get(R);
                    v6 v6Var = (v6) childAt;
                    if (!g6Var2.f51205k && !g6Var2.f51206l) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    v6Var.c(z11, z10);
                    TLRPC.Chat chat2 = g6Var2.h;
                    float f7 = 1.0f;
                    if (chat2 != null) {
                        if (w6.K0(w6Var, chat2) > 200) {
                            f7 = 0.3f;
                        }
                        v6Var.b(z10, f7);
                    } else {
                        if (g6Var2.f51206l && !g6Var2.f51205k) {
                            f7 = 0.5f;
                        }
                        v6Var.b(z10, f7);
                    }
                }
                i14++;
            } else {
                i(z10);
                return;
            }
        }
    }

    public final void h(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r6.h(boolean):void");
    }

    public final void i(boolean z10) {
        org.telegram.ui.Cells.z3 z3Var = this.D;
        if (z3Var == null) {
            return;
        }
        if (w6.R0(this.f51888c, this.d).size() > 0) {
            z3Var.a(cd.L0(2131743656, null), new h6(this, 2));
        } else if (z10) {
            z3Var.setRightText(null);
        } else {
            org.telegram.ui.Cells.y3 y3Var = z3Var.f23639b;
            y3Var.c(null, false, true);
            y3Var.setOnClickListener(null);
            y3Var.setVisibility(0);
        }
    }

    public final void j(boolean z10) {
        k6 k6Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        Object L0;
        HashSet R0 = w6.R0(this.f51888c, this.d);
        int i10 = this.f51886a;
        w6 w6Var = this.W;
        if (i10 == 3) {
            w6Var.f52107q1 = R0.size();
        } else if (i10 == 4) {
            w6Var.f52103m1 = R0.size();
        }
        vp r12 = vp.r1(w6Var.f21583a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i11 = 0;
        while (true) {
            k6Var = this.f51895y;
            ArrayList arrayList4 = k6Var.e;
            arrayList = k6Var.e;
            if (i11 >= arrayList4.size()) {
                break;
            }
            s20 s20Var = (s20) arrayList.get(i11);
            if (!R0.contains(Long.valueOf(s20Var.getUid()))) {
                arrayList2.add(s20Var);
            }
            i11++;
        }
        Iterator it = R0.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            int i12 = 0;
            while (true) {
                if (i12 < arrayList.size()) {
                    if (((s20) arrayList.get(i12)).getUid() == longValue) {
                        break;
                    }
                    i12++;
                } else {
                    if (longValue >= 0) {
                        L0 = r12.Z1(l4);
                    } else {
                        L0 = r12.L0(l4);
                    }
                    Object obj = L0;
                    if (obj != null) {
                        s20 s20Var2 = new s20(getContext(), obj, null, true, w6Var.I0);
                        s20Var2.setOnClickListener(this);
                        arrayList3.add(s20Var2);
                    }
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        qg.g gVar = k6Var.d;
        ArrayList arrayList5 = gVar.e;
        ArrayList arrayList6 = gVar.d;
        ArrayList arrayList7 = gVar.f45540f;
        t6 t6Var = (t6) gVar.f45541n;
        t6Var.H = true;
        ArrayList arrayList8 = t6Var.e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = gVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((s20) arrayList2.get(i13)).setOnClickListener(null);
        }
        gVar.c();
        if (z10) {
            gVar.f45539c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            gVar.f45538b = animatorSet;
            animatorSet.addListener(new s6(gVar, arrayList2, 0));
            arrayList7.clear();
            arrayList6.clear();
            arrayList5.clear();
            int i14 = 0;
            while (true) {
                int size = arrayList2.size();
                property = View.ALPHA;
                property2 = View.SCALE_Y;
                property3 = View.SCALE_X;
                if (i14 >= size) {
                    break;
                }
                s20 s20Var3 = (s20) arrayList2.get(i14);
                arrayList5.add(s20Var3);
                arrayList7.add(ObjectAnimator.ofFloat(s20Var3, property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(s20Var3, property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(s20Var3, property, 1.0f, 0.0f));
                i14++;
            }
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                s20 s20Var4 = (s20) arrayList3.get(i15);
                arrayList6.add(s20Var4);
                arrayList7.add(ObjectAnimator.ofFloat(s20Var4, property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(s20Var4, property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(s20Var4, property, 0.0f, 1.0f));
            }
        } else {
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                gVar.removeView((View) arrayList2.get(i16));
            }
            arrayList9.clear();
            gVar.f45538b = null;
            gVar.f45539c = false;
            t6Var.f51972b.setAllowDrawCursor(true);
        }
        for (int i17 = 0; i17 < arrayList3.size(); i17++) {
            gVar.addView((View) arrayList3.get(i17));
        }
        gVar.requestLayout();
    }

    public final void k() {
        float c10 = c();
        boolean z10 = this.M;
        boolean z11 = false;
        float f7 = 1.0f;
        k6 k6Var = this.f51895y;
        if (!z10 && !this.U && getTranslationX() == 0.0f) {
            if (!this.N || Math.abs(this.O - c10) > 1.0f) {
                this.N = true;
                ValueAnimator valueAnimator = this.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.P = null;
                }
                float translationY = k6Var.getTranslationY();
                this.O = c10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
                this.P = ofFloat;
                ofFloat.addUpdateListener(new c4(4, this));
                this.P.addListener(new sg.r(this, 21));
                this.P.setInterpolator(new LinearInterpolator());
                this.P.setDuration(180L);
                this.P.start();
            }
        } else {
            this.N = false;
            ValueAnimator valueAnimator2 = this.P;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.P = null;
            }
            k6Var.setTranslationY(c10);
        }
        boolean z12 = this.F;
        uc0 uc0Var = this.E;
        if (!z12) {
            uc0Var.setVisibility(8);
            return;
        }
        uc0Var.setVisibility(0);
        float f10 = -uc0Var.getHeight();
        int i10 = 0;
        while (true) {
            tk0 tk0Var = this.f51889f;
            if (i10 < tk0Var.getChildCount()) {
                View childAt = tk0Var.getChildAt(i10);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                    f10 = this.e.getPaddingTop() + childAt.getY();
                    break;
                }
                i10++;
            } else {
                z11 = true;
                break;
            }
        }
        if (this.Q != z11) {
            this.Q = z11;
            org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) uc0Var.e;
            if (z11 || this.f51886a != 0) {
                f7 = 0.0f;
            }
            c2Var.c(true, f7);
        }
        uc0Var.setTranslationY(Math.max(org.telegram.messenger.i0.f16020m, f10));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = w6.U1;
        zs.f(this.W.f21583a).c(this, zs.T);
    }

    @Override
    public final void onClick(View view) {
        k6 k6Var = this.f51895y;
        if (!k6Var.e.contains(view)) {
            return;
        }
        s20 s20Var = (s20) view;
        if (s20Var.D) {
            k6Var.f51974f = null;
            qg.g gVar = k6Var.d;
            t6 t6Var = (t6) gVar.f45541n;
            t6Var.H = true;
            t6Var.e.remove(s20Var);
            s20Var.setOnClickListener(null);
            gVar.c();
            gVar.f45539c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            gVar.f45538b = animatorSet;
            animatorSet.addListener(new iw0(22, (Object) gVar, (Object) s20Var));
            ArrayList arrayList = gVar.h;
            arrayList.clear();
            arrayList.add(s20Var);
            ArrayList arrayList2 = gVar.d;
            arrayList2.clear();
            gVar.e.clear();
            arrayList2.add(s20Var);
            ArrayList arrayList3 = gVar.f45540f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(s20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(s20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(s20Var, View.ALPHA, 1.0f, 0.0f));
            gVar.requestLayout();
            long uid = s20Var.getUid();
            Iterator it = this.d.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList4 = this.f51888c;
                if (hasNext) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((ArrayList) entry.getValue()).contains(Long.valueOf(uid))) {
                        it.remove();
                        arrayList4.addAll((Collection) entry.getValue());
                        arrayList4.remove(Long.valueOf(uid));
                    }
                } else {
                    arrayList4.remove(Long.valueOf(uid));
                    g(true);
                    f(true);
                    return;
                }
            }
        } else {
            s20 s20Var2 = k6Var.f51974f;
            if (s20Var2 != null) {
                s20Var2.a();
                k6Var.f51974f = null;
            }
            k6Var.f51974f = s20Var;
            s20Var.b();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = w6.U1;
        zs.f(this.W.f21583a).n(this, zs.T);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int L;
        int i12;
        int i13;
        float f7;
        int i14 = w6.U1;
        w6 w6Var = this.W;
        int i15 = w6Var.f21596f;
        if (i15 > 0) {
            this.T = i15;
        }
        super.onMeasure(i10, i11);
        int i16 = org.telegram.messenger.i0.f16020m;
        if (this.f51886a == 0) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L(56.0f);
        }
        this.e.setPadding(0, i16 + L, 0, 0);
        boolean z10 = this.V;
        boolean z11 = w6Var.d;
        tk0 tk0Var = this.f51889f;
        p6 p6Var = this.f51891r;
        if (z10 != z11) {
            float c10 = c();
            if (w6Var.d && c10 + Math.min(org.telegram.messenger.i0.L(150.0f), this.f51895y.K) > tk0Var.getPaddingTop()) {
                ci.p pVar = new ci.p(getContext(), 2, 0.7f);
                pVar.f48045a = 1;
                pVar.f4253p = -org.telegram.messenger.i0.L(56.0f);
                this.h.w0(pVar);
            }
            int i17 = this.f51886a;
            View view = this.f51892s;
            float f10 = 0.0f;
            if (i17 == 0) {
                if (w6Var.d) {
                    f7 = this.T;
                } else {
                    f7 = 0.0f;
                }
                p6Var.setTranslationY(f7);
                if (w6Var.d) {
                    f10 = this.T;
                }
                view.setTranslationY(f10);
            } else {
                if (w6Var.d) {
                    i12 = this.T;
                } else {
                    i12 = -this.T;
                }
                float f11 = i12;
                ValueAnimator valueAnimator = p6Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    p6Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                p6Var.d = ofFloat;
                ofFloat.addUpdateListener(new o6(p6Var, 1));
                p6Var.d.addListener(new sg.r(p6Var, 22));
                p6Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = p6Var.d;
                gr grVar = org.telegram.ui.ActionBar.m1.f20561w;
                valueAnimator2.setInterpolator(grVar);
                p6Var.d.start();
                if (w6Var.d) {
                    i13 = this.T;
                } else {
                    i13 = -this.T;
                }
                view.setTranslationY(i13);
                this.U = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(grVar).withEndAction(new i6(this, 2)).start();
            }
            this.V = w6Var.d;
        }
        tk0Var.setPadding(0, 0, 0, p6Var.getMeasuredHeight());
    }
}
