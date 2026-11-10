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
public final class tg0 extends org.telegram.ui.Components.ma {
    public static tg0 f50265p2;
    public final rg0 S1;
    public final qg0 T1;
    public final o00 U1;
    public final pg0 V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final HashSet Y1;
    public final ArrayList Z1;
    public final ArrayList f50266a2;
    public final HashMap f50267b2;
    public final ArrayList f50268c2;
    public final LinkedHashMap d2;
    public String f50269e2;
    public xg.i f50270f2;
    public int f50271g2;
    public int f50272h2;
    public float f50273i2;
    public org.telegram.ui.Components.yo f50274j2;
    public final int f50275k2;
    public final sg0 f50276l2;
    public final Boolean f50277m2;
    public final Boolean f50278n2;
    public final m4 f50279o2;

    public tg0(org.telegram.ui.ActionBar.f2 f2Var, int i7, Boolean bool, Boolean bool2, sg0 sg0Var) {
        super(f2Var, true, false, f2Var.getResourceProvider());
        this.W1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.X1 = arrayList;
        HashSet hashSet = new HashSet();
        this.Y1 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.Z1 = arrayList3;
        this.f50266a2 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.f50267b2 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.f50268c2 = arrayList4;
        this.d2 = new LinkedHashMap();
        this.f50271g2 = org.telegram.messenger.g0.L(120.0f);
        this.f50272h2 = -1;
        this.f50279o2 = new m4(this, 13);
        this.f50275k2 = i7;
        this.f50277m2 = bool;
        this.f50278n2 = bool2;
        this.f50276l2 = sg0Var;
        this.f35902o1.setTitle(O0());
        pg0 pg0Var = new pg0(0, getContext(), this.I0);
        this.V1 = pg0Var;
        pg0Var.setOnCloseClickListener(new ng0(this, 0));
        pg0Var.setText(O0());
        pg0Var.setCloseImageVisible(false);
        pg0Var.f1071f.c(false, 0.0f);
        this.f50274j2 = new org.telegram.ui.Components.yo(this, 2);
        qg0 qg0Var = new qg0(this, getContext(), this.I0, 0);
        this.T1 = qg0Var;
        int i10 = org.telegram.ui.ActionBar.m6.f27963h5;
        org.telegram.ui.ActionBar.t6.h(i10, qg0Var, this.I0);
        qg0Var.setOnSearchTextChange(new r3(this, 14));
        qg0Var.f1097b.r(org.telegram.messenger.id.M0(2131745836, null), false);
        o00 o00Var = new o00(2, getContext(), this);
        this.U1 = o00Var;
        ViewGroup viewGroup = this.f28672b;
        int i11 = this.f28705t0;
        viewGroup.addView(pg0Var, 0, c8.ha.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ViewGroup viewGroup2 = this.f28672b;
        int i12 = this.f28705t0;
        viewGroup2.addView(qg0Var, c8.ha.f(-2.0f, -1, 55, i12, 0, i12, 0));
        ViewGroup viewGroup3 = this.f28672b;
        int i13 = this.f28705t0;
        viewGroup3.addView(o00Var, c8.ha.f(1.0f, -1, 55, i13, 0, i13, 0));
        ah.a aVar = new ah.a(getContext(), this.I0, (org.telegram.ui.Components.pj0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.t6.h(i10, aVar, this.I0);
        rg0 rg0Var = new rg0(this, getContext(), this.I0, 0);
        this.S1 = rg0Var;
        rg0Var.setOnClickListener(new og0(this, 0));
        aVar.addView(rg0Var, c8.ha.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.f28672b;
        int i14 = this.f28705t0;
        viewGroup4.addView(aVar, c8.ha.f(-2.0f, -1, 87, i14, 0, i14, 0));
        xg.i iVar = this.f50270f2;
        org.telegram.ui.Components.pj0 pj0Var = this.n1;
        iVar.f58754n = arrayList;
        iVar.f58753f = pj0Var;
        int i15 = this.f28705t0;
        pj0Var.setPadding(i15, 0, i15, org.telegram.messenger.g0.L(60.0f));
        this.n1.j(new g3(this, 21));
        this.n1.setOnItemClickListener(new l2.q(this, i7, 14));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.wq.h);
        kVar.C = false;
        kVar.f57079m = false;
        this.n1.setItemAnimator(kVar);
        this.n1.i(new fi.o1(this, 6));
        qg0Var.setText("");
        qg0Var.d.b(false);
        qg0Var.b(false, hashSet, new ng0(this, 1), null);
        pg0Var.setText(O0());
        e1(false);
        arrayList2.addAll(org.telegram.messenger.g5.r(this.f28669a).f22612e0);
        hashMap.putAll(org.telegram.messenger.g5.r(this.f28669a).f22615g0);
        arrayList4.addAll(org.telegram.messenger.g5.r(this.f28669a).f22616h0);
        arrayList3.addAll(org.telegram.messenger.ui.b0(this.f28669a).f25825i1);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(org.telegram.messenger.ui.b0(this.f28669a).l1);
        }
        g1(false, true);
        N();
    }

    @Override
    public final void K() {
        super.K();
        f50265p2 = null;
        org.telegram.messenger.g0.r(this.f50279o2);
    }

    @Override
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        xg.i iVar = new xg.i(getContext(), this.I0, true);
        this.f50270f2 = iVar;
        iVar.f58756s = true;
        return iVar;
    }

    @Override
    public final CharSequence O0() {
        int i7;
        Boolean bool = this.f50277m2;
        if (bool != null && bool.booleanValue()) {
            if (this.f50275k2 > 1) {
                i7 = 2131752136;
            } else {
                i7 = 2131752137;
            }
            return org.telegram.messenger.id.M0(i7, null);
        }
        return org.telegram.messenger.id.M0(2131752109, null);
    }

    @Override
    public final void R0(Canvas canvas, int i7) {
        pg0 pg0Var = this.V1;
        pg0Var.setTranslationY(Math.max(i7, (((pg0Var.getMeasuredHeight() - org.telegram.messenger.g0.f22561m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + org.telegram.messenger.g0.f22561m) + org.telegram.messenger.g0.L(8.0f));
        float translationY = pg0Var.getTranslationY() + pg0Var.getMeasuredHeight();
        qg0 qg0Var = this.T1;
        qg0Var.setTranslationY(translationY);
        float translationY2 = qg0Var.getTranslationY() + qg0Var.getMeasuredHeight();
        o00 o00Var = this.U1;
        o00Var.setTranslationY(translationY2);
        int measuredHeight = qg0Var.getMeasuredHeight() + pg0Var.getMeasuredHeight();
        this.n1.setTranslationY((o00Var.getMeasuredHeight() + measuredHeight) - org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void c0(Configuration configuration) {
        f1(false, true);
    }

    public final boolean d1(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.f50277m2;
        if (bool != null && org.telegram.messenger.t10.t(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.f50278n2;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.T1.getEditText());
        super.dismiss();
    }

    public final void e1(boolean z9) {
        int i7;
        rg0 rg0Var = this.S1;
        rg0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.Y1;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f50274j2, 0, 1, 33);
            Boolean bool = this.f50277m2;
            if (bool != null && bool.booleanValue()) {
                if (this.f50275k2 > 1) {
                    i7 = 2131752136;
                } else {
                    i7 = 2131752137;
                }
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(i7, null));
            } else {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131752109, null));
            }
        } else {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131749661, null));
        }
        rg0Var.c(hashSet.size(), true);
        rg0Var.i(spannableStringBuilder, z9, false);
        rg0Var.setEnabled(true);
    }

    public final void f1(boolean z9, boolean z10) {
        float f10;
        int i7;
        long j3;
        int i10;
        float f11;
        xg.i iVar;
        ArrayList arrayList = this.W1;
        arrayList.clear();
        ArrayList arrayList2 = this.X1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f50269e2);
        float f12 = 56.0f;
        HashSet hashSet = this.Y1;
        if (!isEmpty) {
            ArrayList arrayList3 = this.f50266a2;
            int size = arrayList3.size();
            i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                TLRPC.User user = (TLRPC.User) obj;
                i10 += org.telegram.messenger.g0.L(56.0f);
                arrayList2.add(xg.h.c(user, hashSet.contains(Long.valueOf(user.f27109id))));
            }
        } else {
            ArrayList arrayList4 = this.Z1;
            if (!arrayList4.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList4.size();
                i7 = 0;
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList4.get(i12);
                    i12++;
                    int i13 = size2;
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(this.f28669a).a2(Long.valueOf(((TLRPC.TL_topPeer) obj2).peer.user_id));
                    if (!a22.self && !a22.bot && !org.telegram.messenger.t10.A(a22.f27109id) && !org.telegram.messenger.t10.x(a22) && d1(a22)) {
                        i7 += org.telegram.messenger.g0.L(56.0f);
                        arrayList5.add(xg.h.c(a22, hashSet.contains(Long.valueOf(a22.f27109id))));
                    }
                    size2 = i13;
                }
                f10 = 32.0f;
                if (!arrayList5.isEmpty()) {
                    i7 += org.telegram.messenger.g0.L(32.0f);
                    arrayList2.add(xg.h.b(org.telegram.messenger.id.M0(2131749672, null)));
                    arrayList2.addAll(arrayList5);
                }
            } else {
                f10 = 32.0f;
                i7 = 0;
            }
            long e10 = org.telegram.messenger.p10.i(this.f28669a).e();
            Boolean bool = this.f50277m2;
            if (bool != null && bool.booleanValue()) {
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = org.telegram.messenger.qp.s1(this.f28669a).f24948y;
                int size3 = arrayList7.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = arrayList7.get(i14);
                    i14++;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) obj3;
                    long j10 = e10;
                    if (dialog.f26964id >= 0) {
                        TLRPC.User a23 = org.telegram.messenger.qp.s1(this.f28669a).a2(Long.valueOf(dialog.f26964id));
                        if (d1(a23)) {
                            i7 += org.telegram.messenger.g0.L(56.0f);
                            arrayList6.add(xg.h.c(a23, hashSet.contains(Long.valueOf(a23.f27109id))));
                        }
                    }
                    e10 = j10;
                }
                j3 = e10;
                if (!arrayList6.isEmpty()) {
                    i7 += org.telegram.messenger.g0.L(f10);
                    arrayList2.add(xg.h.b(org.telegram.messenger.id.M0(2131745822, null)));
                    arrayList2.addAll(arrayList6);
                }
            } else {
                j3 = e10;
            }
            ArrayList arrayList8 = this.f50268c2;
            int size4 = arrayList8.size();
            i10 = i7;
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList8.get(i15);
                i15++;
                String str = (String) obj4;
                ArrayList arrayList9 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.f50267b2.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        float f13 = f12;
                        if (tL_contact.user_id == j3) {
                            f11 = f10;
                        } else {
                            f11 = f10;
                            TLRPC.User a24 = org.telegram.messenger.qp.s1(this.f28669a).a2(Long.valueOf(tL_contact.user_id));
                            if (d1(a24)) {
                                i10 += org.telegram.messenger.g0.L(f13);
                                arrayList9.add(xg.h.c(a24, hashSet.contains(Long.valueOf(a24.f27109id))));
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
                        xg.h hVar = new xg.h(7, false);
                        hVar.f58741g = upperCase;
                        arrayList2.add(hVar);
                        arrayList2.addAll(arrayList9);
                        i10 = L;
                    }
                    f10 = f15;
                    f12 = f14;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new xg.h(5, false));
            i10 += org.telegram.messenger.g0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.f22567q.y * 0.6f)) - i10);
        xg.h hVar2 = new xg.h(-1, false);
        hVar2.f58745l = max;
        arrayList2.add(hVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                xg.i iVar2 = this.f50270f2;
                og0 og0Var = new og0(this, 1);
                org.telegram.ui.Cells.x3 x3Var = iVar2.f58757w;
                if (x3Var != null) {
                    x3Var.a(org.telegram.messenger.id.M0(2131743630, null), og0Var);
                }
            } else {
                org.telegram.ui.Cells.x3 x3Var2 = this.f50270f2.f58757w;
                if (x3Var2 != null) {
                    x3Var2.setRightText(null);
                }
            }
        }
        if (z10 && (iVar = this.f50270f2) != null) {
            if (z9) {
                iVar.E(arrayList, arrayList2);
            } else {
                iVar.f();
            }
        }
    }

    public final void g1(boolean z9, boolean z10) {
        int R;
        f1(z9, z10);
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.pj0 pj0Var = this.n1;
            if (i10 >= pj0Var.getChildCount()) {
                break;
            }
            View childAt = pj0Var.getChildAt(i10);
            if ((childAt instanceof ah.r) && (R = RecyclerView.R(childAt)) > 0) {
                if (i7 == -1) {
                    i7 = R;
                }
                int i12 = R - 1;
                if (i12 >= 0) {
                    ArrayList arrayList = this.X1;
                    if (i12 < arrayList.size()) {
                        xg.h hVar = (xg.h) arrayList.get(i12);
                        ah.r rVar = (ah.r) childAt;
                        rVar.c(hVar.f58744k, z9);
                        TLRPC.Chat chat = hVar.f58739e;
                        float f10 = 1.0f;
                        if (chat != null) {
                            if (this.f50270f2.F(chat) > 200) {
                                f10 = 0.3f;
                            }
                            rVar.i(z9, f10);
                        } else {
                            rVar.i(z9, 1.0f);
                        }
                    }
                }
                i11 = R;
            }
            i10++;
        }
        if (z9) {
            this.f50270f2.k(0, i7);
            xg.i iVar = this.f50270f2;
            iVar.k(i11, iVar.b() - i11);
        }
        e1(z9);
    }
}
