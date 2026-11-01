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
public final class uh0 extends org.telegram.ui.Components.ha {
    public static uh0 f41943m2;
    public final mg.g2 P1;
    public final mg.f2 Q1;
    public final bi.t0 R1;
    public final mg.e2 S1;
    public final ArrayList T1;
    public final ArrayList U1;
    public final HashSet V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final HashMap Y1;
    public final ArrayList Z1;
    public final LinkedHashMap a2;
    public String f41944b2;
    public ng.i f41945c2;
    public int f41946d2;
    public int f41947e2;
    public float f41948f2;
    public mg.d2 f41949g2;
    public final int f41950h2;
    public final th0 f41951i2;
    public final Boolean f41952j2;
    public final Boolean f41953k2;
    public final m4 f41954l2;

    public uh0(org.telegram.ui.ActionBar.k2 k2Var, int i10, Boolean bool, Boolean bool2, th0 th0Var) {
        super(k2Var, true, false, k2Var.getResourceProvider());
        this.T1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.U1 = arrayList;
        HashSet hashSet = new HashSet();
        this.V1 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.W1 = arrayList3;
        this.X1 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.Y1 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.Z1 = arrayList4;
        this.a2 = new LinkedHashMap();
        this.f41946d2 = org.telegram.messenger.i0.L(120.0f);
        this.f41947e2 = -1;
        this.f41954l2 = new m4(this, 13);
        this.f41950h2 = i10;
        this.f41952j2 = bool;
        this.f41953k2 = bool2;
        this.f41951i2 = th0Var;
        this.l1.setTitle(O0());
        mg.e2 e2Var = new mg.e2(1, getContext(), this.I0);
        this.S1 = e2Var;
        e2Var.setOnCloseClickListener(new rh0(this, 0));
        e2Var.setText(O0());
        e2Var.setCloseImageVisible(false);
        e2Var.f45539f.c(false, 0.0f);
        this.f41949g2 = new mg.d2(this, 3);
        mg.f2 f2Var = new mg.f2(this, getContext(), this.I0, 1);
        this.Q1 = f2Var;
        int i11 = org.telegram.ui.ActionBar.t6.f21002h5;
        org.telegram.ui.ActionBar.a7.i(i11, f2Var, this.I0);
        f2Var.setOnSearchTextChange(new s3(this, 13));
        f2Var.f45554b.r(org.telegram.messenger.dd.L0(2131745853, null), false);
        bi.t0 t0Var = new bi.t0(this, getContext(), 28);
        this.R1 = t0Var;
        ViewGroup viewGroup = this.f21587b;
        int i12 = this.f21616t0;
        viewGroup.addView(e2Var, 0, w7.b6.f(-2.0f, -1, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.f21587b;
        int i13 = this.f21616t0;
        viewGroup2.addView(f2Var, w7.b6.f(-2.0f, -1, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.f21587b;
        int i14 = this.f21616t0;
        viewGroup3.addView(t0Var, w7.b6.f(1.0f, -1, 55, i14, 0, i14, 0));
        l10 l10Var = new l10(getContext(), this.I0, (org.telegram.ui.Components.uk0) null);
        l10Var.setClickable(true);
        l10Var.setOrientation(1);
        l10Var.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
        org.telegram.ui.ActionBar.a7.i(i11, l10Var, this.I0);
        mg.g2 g2Var = new mg.g2(this, getContext(), this.I0, 1);
        this.P1 = g2Var;
        g2Var.setOnClickListener(new sh0(this, 0));
        l10Var.addView(g2Var, w7.b6.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.f21587b;
        int i15 = this.f21616t0;
        viewGroup4.addView(l10Var, w7.b6.f(-2.0f, -1, 87, i15, 0, i15, 0));
        ng.i iVar = this.f41945c2;
        org.telegram.ui.Components.uk0 uk0Var = this.f26724k1;
        iVar.f13795n = arrayList;
        iVar.f13794f = uk0Var;
        int i16 = this.f21616t0;
        uk0Var.setPadding(i16, 0, i16, org.telegram.messenger.i0.L(60.0f));
        this.f26724k1.j(new h3(this, 21));
        this.f26724k1.setOnItemClickListener(new i2.q(this, i10, 16));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.f47938m = false;
        this.f26724k1.setItemAnimator(jVar);
        this.f26724k1.i(new mg.u1(this, 7));
        f2Var.setText("");
        f2Var.d.b(false);
        f2Var.b(false, hashSet, new rh0(this, 1), null);
        e2Var.setText(O0());
        e1(false);
        arrayList2.addAll(org.telegram.messenger.i5.r(this.f21584a).f16218e0);
        hashMap.putAll(org.telegram.messenger.i5.r(this.f21584a).f16221g0);
        arrayList4.addAll(org.telegram.messenger.i5.r(this.f21584a).f16222h0);
        arrayList3.addAll(org.telegram.messenger.vi.b0(this.f21584a).f18654i1);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(org.telegram.messenger.vi.b0(this.f21584a).l1);
        }
        g1(false, true);
        O();
    }

    @Override
    public final void L() {
        super.L();
        f41943m2 = null;
        org.telegram.messenger.i0.r(this.f41954l2);
    }

    @Override
    public final org.telegram.ui.Components.tk0 L0(org.telegram.ui.Components.uk0 uk0Var) {
        ng.i iVar = new ng.i(getContext(), this.I0, true);
        this.f41945c2 = iVar;
        iVar.f13797s = true;
        return iVar;
    }

    @Override
    public final CharSequence O0() {
        int i10;
        Boolean bool = this.f41952j2;
        if (bool != null && bool.booleanValue()) {
            if (this.f41950h2 > 1) {
                i10 = 2131752136;
            } else {
                i10 = 2131752137;
            }
            return org.telegram.messenger.dd.L0(i10, null);
        }
        return org.telegram.messenger.dd.L0(2131752109, null);
    }

    @Override
    public final void R0(Canvas canvas, int i10) {
        mg.e2 e2Var = this.S1;
        e2Var.setTranslationY(Math.max(i10, (((e2Var.getMeasuredHeight() - org.telegram.messenger.i0.f16166m) - org.telegram.messenger.i0.L(40.0f)) / 2.0f) + org.telegram.messenger.i0.f16166m) + org.telegram.messenger.i0.L(8.0f));
        float translationY = e2Var.getTranslationY() + e2Var.getMeasuredHeight();
        mg.f2 f2Var = this.Q1;
        f2Var.setTranslationY(translationY);
        float translationY2 = f2Var.getTranslationY() + f2Var.getMeasuredHeight();
        bi.t0 t0Var = this.R1;
        t0Var.setTranslationY(translationY2);
        int measuredHeight = f2Var.getMeasuredHeight() + e2Var.getMeasuredHeight();
        this.f26724k1.setTranslationY((t0Var.getMeasuredHeight() + measuredHeight) - org.telegram.messenger.i0.L(8.0f));
    }

    @Override
    public final void c0(Configuration configuration) {
        f1(false, true);
    }

    public final boolean d1(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.f41952j2;
        if (bool != null && org.telegram.messenger.i20.t(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.f41953k2;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.i0.v1(this.Q1.getEditText());
        super.dismiss();
    }

    public final void e1(boolean z10) {
        int i10;
        mg.g2 g2Var = this.P1;
        g2Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.V1;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f41949g2, 0, 1, 33);
            Boolean bool = this.f41952j2;
            if (bool != null && bool.booleanValue()) {
                if (this.f41950h2 > 1) {
                    i10 = 2131752136;
                } else {
                    i10 = 2131752137;
                }
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(i10, null));
            } else {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131752109, null));
            }
        } else {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131749670, null));
        }
        g2Var.c(hashSet.size(), true);
        g2Var.i(spannableStringBuilder, z10, false);
        g2Var.setEnabled(true);
    }

    public final void f1(boolean z10, boolean z11) {
        float f7;
        int i10;
        long j10;
        int i11;
        float f10;
        ng.i iVar;
        ArrayList arrayList = this.T1;
        arrayList.clear();
        ArrayList arrayList2 = this.U1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f41944b2);
        float f11 = 56.0f;
        HashSet hashSet = this.V1;
        if (!isEmpty) {
            ArrayList arrayList3 = this.X1;
            int size = arrayList3.size();
            i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                TLRPC.User user = (TLRPC.User) obj;
                i11 += org.telegram.messenger.i0.L(56.0f);
                arrayList2.add(ng.h.c(user, hashSet.contains(Long.valueOf(user.f19943id))));
            }
        } else {
            ArrayList arrayList4 = this.W1;
            if (!arrayList4.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList4.size();
                i10 = 0;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList4.get(i13);
                    i13++;
                    int i14 = size2;
                    TLRPC.User Z1 = org.telegram.messenger.wp.r1(this.f21584a).Z1(Long.valueOf(((TLRPC.TL_topPeer) obj2).peer.user_id));
                    if (!Z1.self && !Z1.bot && !org.telegram.messenger.i20.A(Z1.f19943id) && !org.telegram.messenger.i20.x(Z1) && d1(Z1)) {
                        i10 += org.telegram.messenger.i0.L(56.0f);
                        arrayList5.add(ng.h.c(Z1, hashSet.contains(Long.valueOf(Z1.f19943id))));
                    }
                    size2 = i14;
                }
                f7 = 32.0f;
                if (!arrayList5.isEmpty()) {
                    i10 += org.telegram.messenger.i0.L(32.0f);
                    arrayList2.add(ng.h.b(org.telegram.messenger.dd.L0(2131749681, null)));
                    arrayList2.addAll(arrayList5);
                }
            } else {
                f7 = 32.0f;
                i10 = 0;
            }
            long e = org.telegram.messenger.e20.i(this.f21584a).e();
            Boolean bool = this.f41952j2;
            if (bool != null && bool.booleanValue()) {
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = org.telegram.messenger.wp.r1(this.f21584a).f19293y;
                int size3 = arrayList7.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj3 = arrayList7.get(i15);
                    i15++;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) obj3;
                    long j11 = e;
                    if (dialog.f19798id >= 0) {
                        TLRPC.User Z12 = org.telegram.messenger.wp.r1(this.f21584a).Z1(Long.valueOf(dialog.f19798id));
                        if (d1(Z12)) {
                            i10 += org.telegram.messenger.i0.L(56.0f);
                            arrayList6.add(ng.h.c(Z12, hashSet.contains(Long.valueOf(Z12.f19943id))));
                        }
                    }
                    e = j11;
                }
                j10 = e;
                if (!arrayList6.isEmpty()) {
                    i10 += org.telegram.messenger.i0.L(f7);
                    arrayList2.add(ng.h.b(org.telegram.messenger.dd.L0(2131745839, null)));
                    arrayList2.addAll(arrayList6);
                }
            } else {
                j10 = e;
            }
            ArrayList arrayList8 = this.Z1;
            int size4 = arrayList8.size();
            i11 = i10;
            int i16 = 0;
            while (i16 < size4) {
                Object obj4 = arrayList8.get(i16);
                i16++;
                String str = (String) obj4;
                ArrayList arrayList9 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.Y1.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        float f12 = f11;
                        if (tL_contact.user_id == j10) {
                            f10 = f7;
                        } else {
                            f10 = f7;
                            TLRPC.User Z13 = org.telegram.messenger.wp.r1(this.f21584a).Z1(Long.valueOf(tL_contact.user_id));
                            if (d1(Z13)) {
                                i11 += org.telegram.messenger.i0.L(f12);
                                arrayList9.add(ng.h.c(Z13, hashSet.contains(Long.valueOf(Z13.f19943id))));
                            }
                        }
                        f7 = f10;
                        f11 = f12;
                    }
                    float f13 = f11;
                    float f14 = f7;
                    if (!arrayList9.isEmpty()) {
                        int L = org.telegram.messenger.i0.L(f14) + i11;
                        String upperCase = str.toUpperCase();
                        ng.h hVar = new ng.h(7, false);
                        hVar.f13783g = upperCase;
                        arrayList2.add(hVar);
                        arrayList2.addAll(arrayList9);
                        i11 = L;
                    }
                    f7 = f14;
                    f11 = f13;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ng.h(5, false));
            i11 += org.telegram.messenger.i0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.i0.f16172q.y * 0.6f)) - i11);
        ng.h hVar2 = new ng.h(-1, false);
        hVar2.f13787l = max;
        arrayList2.add(hVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                ng.i iVar2 = this.f41945c2;
                sh0 sh0Var = new sh0(this, 1);
                org.telegram.ui.Cells.z3 z3Var = iVar2.f13798w;
                if (z3Var != null) {
                    z3Var.a(org.telegram.messenger.dd.L0(2131743656, null), sh0Var);
                }
            } else {
                org.telegram.ui.Cells.z3 z3Var2 = this.f41945c2.f13798w;
                if (z3Var2 != null) {
                    z3Var2.setRightText(null);
                }
            }
        }
        if (z11 && (iVar = this.f41945c2) != null) {
            if (z10) {
                iVar.E(arrayList, arrayList2);
            } else {
                iVar.f();
            }
        }
    }

    public final void g1(boolean z10, boolean z11) {
        int R;
        f1(z10, z11);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.uk0 uk0Var = this.f26724k1;
            if (i11 >= uk0Var.getChildCount()) {
                break;
            }
            View childAt = uk0Var.getChildAt(i11);
            if ((childAt instanceof qg.k) && (R = RecyclerView.R(childAt)) > 0) {
                if (i10 == -1) {
                    i10 = R;
                }
                int i13 = R - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.U1;
                    if (i13 < arrayList.size()) {
                        ng.h hVar = (ng.h) arrayList.get(i13);
                        qg.k kVar = (qg.k) childAt;
                        kVar.c(hVar.f13786k, z10);
                        TLRPC.Chat chat = hVar.e;
                        float f7 = 1.0f;
                        if (chat != null) {
                            if (this.f41945c2.F(chat) > 200) {
                                f7 = 0.3f;
                            }
                            kVar.i(z10, f7);
                        } else {
                            kVar.i(z10, 1.0f);
                        }
                    }
                }
                i12 = R;
            }
            i11++;
        }
        if (z10) {
            this.f41945c2.k(0, i10);
            ng.i iVar = this.f41945c2;
            iVar.k(i12, iVar.b() - i12);
        }
        e1(z10);
    }
}
