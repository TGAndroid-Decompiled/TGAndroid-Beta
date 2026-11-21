package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class vg0 extends org.telegram.ui.Components.sa {
    public static vg0 f52812q2;
    public final tg0 T1;
    public final sg0 U1;
    public final uv V1;
    public final rg0 W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final HashSet Z1;
    public final ArrayList f52813a2;
    public final ArrayList f52814b2;
    public final HashMap f52815c2;
    public final ArrayList d2;
    public final LinkedHashMap f52816e2;
    public String f52817f2;
    public xg.h f52818g2;
    public int f52819h2;
    public int f52820i2;
    public float f52821j2;
    public org.telegram.ui.Components.qp f52822k2;
    public final int f52823l2;
    public final ug0 f52824m2;
    public final Boolean f52825n2;
    public final Boolean f52826o2;
    public final m4 f52827p2;

    public vg0(org.telegram.ui.ActionBar.g2 g2Var, int i7, Boolean bool, Boolean bool2, ug0 ug0Var) {
        super(g2Var, true, false, g2Var.getResourceProvider());
        this.X1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Y1 = arrayList;
        HashSet hashSet = new HashSet();
        this.Z1 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f52813a2 = arrayList3;
        this.f52814b2 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.f52815c2 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.d2 = arrayList4;
        this.f52816e2 = new LinkedHashMap();
        this.f52819h2 = org.telegram.messenger.g0.L(120.0f);
        this.f52820i2 = -1;
        this.f52827p2 = new m4(this, 13);
        this.f52823l2 = i7;
        this.f52825n2 = bool;
        this.f52826o2 = bool2;
        this.f52824m2 = ug0Var;
        this.f39540p1.setTitle(P0());
        rg0 rg0Var = new rg0(0, getContext(), this.J0);
        this.W1 = rg0Var;
        rg0Var.setOnCloseClickListener(new pg0(this, 0));
        rg0Var.setText(P0());
        rg0Var.setCloseImageVisible(false);
        rg0Var.f1068f.c(false, 0.0f);
        this.f52822k2 = new org.telegram.ui.Components.qp(this, 2);
        sg0 sg0Var = new sg0(this, getContext(), this.J0, 0);
        this.U1 = sg0Var;
        int i10 = org.telegram.ui.ActionBar.m6.f29451h5;
        org.telegram.ui.ActionBar.t6.h(i10, sg0Var, this.J0);
        sg0Var.setOnSearchTextChange(new r3(this, 15));
        sg0Var.f1094b.r(org.telegram.messenger.gd.N0(2131745640, null), false);
        uv uvVar = new uv(3, getContext(), this);
        this.V1 = uvVar;
        ViewGroup viewGroup = this.f30173b;
        int i11 = this.f30208u0;
        viewGroup.addView(rg0Var, 0, c8.ma.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ViewGroup viewGroup2 = this.f30173b;
        int i12 = this.f30208u0;
        viewGroup2.addView(sg0Var, c8.ma.f(-2.0f, -1, 55, i12, 0, i12, 0));
        ViewGroup viewGroup3 = this.f30173b;
        int i13 = this.f30208u0;
        viewGroup3.addView(uvVar, c8.ma.f(1.0f, -1, 55, i13, 0, i13, 0));
        ah.a aVar = new ah.a(getContext(), this.J0, (org.telegram.ui.Components.ek0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.t6.h(i10, aVar, this.J0);
        tg0 tg0Var = new tg0(this, getContext(), this.J0, 0);
        this.T1 = tg0Var;
        tg0Var.setOnClickListener(new qg0(this, 0));
        aVar.addView(tg0Var, c8.ma.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.f30173b;
        int i14 = this.f30208u0;
        viewGroup4.addView(aVar, c8.ma.f(-2.0f, -1, 87, i14, 0, i14, 0));
        xg.h hVar = this.f52818g2;
        org.telegram.ui.Components.ek0 ek0Var = this.f39539o1;
        hVar.f60545n = arrayList;
        hVar.f60544f = ek0Var;
        int i15 = this.f30208u0;
        ek0Var.setPadding(i15, 0, i15, org.telegram.messenger.g0.L(60.0f));
        this.f39539o1.j(new g3(this, 21));
        this.f39539o1.setOnItemClickListener(new ai.u1(this, i7, 17));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.nr.h);
        kVar.C = false;
        kVar.f59190m = false;
        this.f39539o1.setItemAnimator(kVar);
        this.f39539o1.i(new ai.j0(this, 7));
        sg0Var.setText("");
        sg0Var.d.b(false);
        sg0Var.b(false, hashSet, new pg0(this, 1), null);
        rg0Var.setText(P0());
        f1(false);
        arrayList2.addAll(org.telegram.messenger.i5.r(this.f30170a).f24595f0);
        hashMap.putAll(org.telegram.messenger.i5.r(this.f30170a).f24597h0);
        arrayList4.addAll(org.telegram.messenger.i5.r(this.f30170a).f24598i0);
        arrayList3.addAll(org.telegram.messenger.ri.d0(this.f30170a).f26648j1);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(org.telegram.messenger.ri.d0(this.f30170a).f26652m1);
        }
        h1(false, true);
        O();
    }

    @Override
    public final void L() {
        super.L();
        f52812q2 = null;
        org.telegram.messenger.g0.r(this.f52827p2);
    }

    @Override
    public final org.telegram.ui.Components.dk0 M0(org.telegram.ui.Components.ek0 ek0Var) {
        xg.h hVar = new xg.h(getContext(), this.J0, true);
        this.f52818g2 = hVar;
        hVar.f60547s = true;
        return hVar;
    }

    @Override
    public final CharSequence P0() {
        int i7;
        Boolean bool = this.f52825n2;
        if (bool != null && bool.booleanValue()) {
            if (this.f52823l2 > 1) {
                i7 = 2131752124;
            } else {
                i7 = 2131752125;
            }
            return org.telegram.messenger.gd.N0(i7, null);
        }
        return org.telegram.messenger.gd.N0(2131752097, null);
    }

    @Override
    public final void S0(Canvas canvas, int i7) {
        rg0 rg0Var = this.W1;
        rg0Var.setTranslationY(Math.max(i7, (((rg0Var.getMeasuredHeight() - org.telegram.messenger.g0.f24140m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + org.telegram.messenger.g0.f24140m) + org.telegram.messenger.g0.L(8.0f));
        float translationY = rg0Var.getTranslationY() + rg0Var.getMeasuredHeight();
        sg0 sg0Var = this.U1;
        sg0Var.setTranslationY(translationY);
        float translationY2 = sg0Var.getTranslationY() + sg0Var.getMeasuredHeight();
        uv uvVar = this.V1;
        uvVar.setTranslationY(translationY2);
        int measuredHeight = sg0Var.getMeasuredHeight() + rg0Var.getMeasuredHeight();
        this.f39539o1.setTranslationY((uvVar.getMeasuredHeight() + measuredHeight) - org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void c0(Configuration configuration) {
        g1(false, true);
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.U1.getEditText());
        super.dismiss();
    }

    public final boolean e1(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.f52825n2;
        if (bool != null && org.telegram.messenger.o10.u(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.f52826o2;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void f1(boolean z10) {
        int i7;
        tg0 tg0Var = this.T1;
        tg0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.Z1;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f52822k2, 0, 1, 33);
            Boolean bool = this.f52825n2;
            if (bool != null && bool.booleanValue()) {
                if (this.f52823l2 > 1) {
                    i7 = 2131752124;
                } else {
                    i7 = 2131752125;
                }
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(i7, null));
            } else {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131752097, null));
            }
        } else {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131749488, null));
        }
        tg0Var.c(hashSet.size(), true);
        tg0Var.i(spannableStringBuilder, z10, false);
        tg0Var.setEnabled(true);
    }

    public final void g1(boolean z10, boolean z11) {
        float f10;
        int i7;
        long j3;
        int i10;
        float f11;
        xg.h hVar;
        ArrayList arrayList = this.X1;
        arrayList.clear();
        ArrayList arrayList2 = this.Y1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f52817f2);
        float f12 = 56.0f;
        HashSet hashSet = this.Z1;
        if (!isEmpty) {
            ArrayList arrayList3 = this.f52814b2;
            int size = arrayList3.size();
            i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                TLRPC.User user = (TLRPC.User) obj;
                i10 += org.telegram.messenger.g0.L(56.0f);
                arrayList2.add(xg.g.c(user, hashSet.contains(Long.valueOf(user.f28580id))));
            }
        } else {
            ArrayList arrayList4 = this.f52813a2;
            if (!arrayList4.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList4.size();
                i7 = 0;
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList4.get(i12);
                    i12++;
                    int i13 = size2;
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(this.f30170a).c2(Long.valueOf(((TLRPC.TL_topPeer) obj2).peer.user_id));
                    if (!c22.self && !c22.bot && !org.telegram.messenger.o10.B(c22.f28580id) && !org.telegram.messenger.o10.y(c22) && e1(c22)) {
                        i7 += org.telegram.messenger.g0.L(56.0f);
                        arrayList5.add(xg.g.c(c22, hashSet.contains(Long.valueOf(c22.f28580id))));
                    }
                    size2 = i13;
                }
                f10 = 32.0f;
                if (!arrayList5.isEmpty()) {
                    i7 += org.telegram.messenger.g0.L(32.0f);
                    arrayList2.add(xg.g.b(org.telegram.messenger.gd.N0(2131749499, null)));
                    arrayList2.addAll(arrayList5);
                }
            } else {
                f10 = 32.0f;
                i7 = 0;
            }
            long e10 = org.telegram.messenger.j10.i(this.f30170a).e();
            Boolean bool = this.f52825n2;
            if (bool != null && bool.booleanValue()) {
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = org.telegram.messenger.mp.u1(this.f30170a).f25837y;
                int size3 = arrayList7.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = arrayList7.get(i14);
                    i14++;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) obj3;
                    long j10 = e10;
                    if (dialog.f28435id >= 0) {
                        TLRPC.User c23 = org.telegram.messenger.mp.u1(this.f30170a).c2(Long.valueOf(dialog.f28435id));
                        if (e1(c23)) {
                            i7 += org.telegram.messenger.g0.L(56.0f);
                            arrayList6.add(xg.g.c(c23, hashSet.contains(Long.valueOf(c23.f28580id))));
                        }
                    }
                    e10 = j10;
                }
                j3 = e10;
                if (!arrayList6.isEmpty()) {
                    i7 += org.telegram.messenger.g0.L(f10);
                    arrayList2.add(xg.g.b(org.telegram.messenger.gd.N0(2131745626, null)));
                    arrayList2.addAll(arrayList6);
                }
            } else {
                j3 = e10;
            }
            ArrayList arrayList8 = this.d2;
            int size4 = arrayList8.size();
            i10 = i7;
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList8.get(i15);
                i15++;
                String str = (String) obj4;
                ArrayList arrayList9 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.f52815c2.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        float f13 = f12;
                        if (tL_contact.user_id == j3) {
                            f11 = f10;
                        } else {
                            f11 = f10;
                            TLRPC.User c24 = org.telegram.messenger.mp.u1(this.f30170a).c2(Long.valueOf(tL_contact.user_id));
                            if (e1(c24)) {
                                i10 += org.telegram.messenger.g0.L(f13);
                                arrayList9.add(xg.g.c(c24, hashSet.contains(Long.valueOf(c24.f28580id))));
                            }
                        }
                        f10 = f11;
                        f12 = f13;
                    }
                    float f14 = f12;
                    float f15 = f10;
                    if (!arrayList9.isEmpty()) {
                        int L = org.telegram.messenger.g0.L(f15) + i10;
                        String upperCase = str.toUpperCase();
                        xg.g gVar = new xg.g(7, false);
                        gVar.f60533f = upperCase;
                        arrayList2.add(gVar);
                        arrayList2.addAll(arrayList9);
                        i10 = L;
                    }
                    f10 = f15;
                    f12 = f14;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new xg.g(5, false));
            i10 += org.telegram.messenger.g0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.f24146q.y * 0.6f)) - i10);
        xg.g gVar2 = new xg.g(-1, false);
        gVar2.f60537k = max;
        arrayList2.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                xg.h hVar2 = this.f52818g2;
                qg0 qg0Var = new qg0(this, 1);
                org.telegram.ui.Cells.y3 y3Var = hVar2.f60548w;
                if (y3Var != null) {
                    y3Var.a(org.telegram.messenger.gd.N0(2131743387, null), qg0Var);
                }
            } else {
                org.telegram.ui.Cells.y3 y3Var2 = this.f52818g2.f60548w;
                if (y3Var2 != null) {
                    y3Var2.setRightText(null);
                }
            }
        }
        if (z11 && (hVar = this.f52818g2) != null) {
            if (z10) {
                hVar.E(arrayList, arrayList2);
            } else {
                hVar.f();
            }
        }
    }

    public final void h1(boolean z10, boolean z11) {
        int R;
        g1(z10, z11);
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.ek0 ek0Var = this.f39539o1;
            if (i10 >= ek0Var.getChildCount()) {
                break;
            }
            View childAt = ek0Var.getChildAt(i10);
            if ((childAt instanceof ah.r) && (R = RecyclerView.R(childAt)) > 0) {
                if (i7 == -1) {
                    i7 = R;
                }
                int i12 = R - 1;
                if (i12 >= 0) {
                    ArrayList arrayList = this.Y1;
                    if (i12 < arrayList.size()) {
                        ah.r rVar = (ah.r) childAt;
                        rVar.c(((xg.g) arrayList.get(i12)).f60536j, z10);
                        rVar.i(z10, 1.0f);
                    }
                }
                i11 = R;
            }
            i10++;
        }
        if (z10) {
            this.f52818g2.k(0, i7);
            xg.h hVar = this.f52818g2;
            hVar.k(i11, hVar.b() - i11);
        }
        f1(z10);
    }
}
