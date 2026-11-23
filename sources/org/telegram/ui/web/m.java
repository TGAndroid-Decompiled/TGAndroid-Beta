package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.ma;
import di.m9;
import hi.s2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oa;
import org.telegram.ui.hs0;
public final class m extends e51 {
    public i f53233f;
    public final Runnable h;
    public final org.telegram.ui.q f53234n;
    public org.telegram.ui.ActionBar.q0 f53235r;
    public org.telegram.ui.ActionBar.q0 f53236s;
    public String f53237w;
    public NumberTextView f53238x;
    public final i f53232e = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet f53239y = new HashSet();
    public final HashSet E = new HashSet();

    public m(org.telegram.ui.z zVar, org.telegram.ui.q qVar) {
        this.h = zVar;
        this.f53234n = qVar;
    }

    public static void d0(m mVar, HashSet hashSet) {
        np.u1(mVar.currentAccount).Z(new ArrayList(hashSet), null, null, k10.i(mVar.currentAccount).e(), 0, true, 0);
        mVar.f53232e.b(new ArrayList(hashSet));
        i iVar = mVar.f53233f;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        mVar.f53239y.clear();
        mVar.actionBar.w();
        mVar.f34681a.f35789g3.O(true);
    }

    public static boolean k0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !i5.c.B(" ", lowerCase2, lowerCase) && !i5.c.B(".", lowerCase2, lowerCase)) {
            String M3 = org.telegram.messenger.g0.M3(lowerCase);
            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
            if (!M3.startsWith(M32) && !M3.contains(" ".concat(M32)) && !M3.contains(".".concat(M32))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void Z(ArrayList arrayList, c51 c51Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.E;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f53237w);
        i iVar = this.f53232e;
        if (isEmpty) {
            ArrayList arrayList2 = iVar.f53156a;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                gj gjVar = (gj) obj;
                String a10 = k.a(gjVar);
                if (!TextUtils.isEmpty(a10) && !a10.startsWith("#") && !a10.startsWith("$") && !a10.startsWith("@")) {
                    hashSet.add(a10);
                    int i10 = g.f53138b;
                    o41 K = o41.K(g.class);
                    K.A = 3;
                    K.f38096r = false;
                    K.I = gjVar;
                    K.L(j0(gjVar));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!iVar.f53160f) {
                arrayList.add(o41.q(arrayList.size(), 32));
                arrayList.add(o41.q(arrayList.size(), 32));
                arrayList.add(o41.q(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = iVar.f53156a;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                gj gjVar2 = (gj) obj2;
                String a11 = k.a(gjVar2);
                if (!TextUtils.isEmpty(a11) && !a11.startsWith("#") && !a11.startsWith("$") && !a11.startsWith("@")) {
                    hashSet.add(a11);
                    String K0 = org.telegram.messenger.g0.K0(a11, true);
                    z1 a12 = a2.b().a(K0);
                    TLRPC.Message message = gjVar2.f24213k;
                    if (message != null && (messageMedia = message.media) != null) {
                        webPage = messageMedia.webpage;
                    } else {
                        webPage = null;
                    }
                    if (webPage != null && !TextUtils.isEmpty(webPage.site_name)) {
                        str = webPage.site_name;
                    } else if (a12 != null && !TextUtils.isEmpty(a12.d)) {
                        str = a12.d;
                    } else {
                        str = null;
                    }
                    if (webPage != null && !TextUtils.isEmpty(webPage.title)) {
                        str2 = webPage.title;
                    } else {
                        str2 = null;
                    }
                    if (k0(K0, this.f53237w) || k0(str, this.f53237w) || k0(str2, this.f53237w)) {
                        String str3 = this.f53237w;
                        int i12 = g.f53138b;
                        o41 K2 = o41.K(g.class);
                        K2.A = 3;
                        K2.f38096r = false;
                        K2.I = gjVar2;
                        K2.f38092n = str3;
                        K2.L(j0(gjVar2));
                        arrayList.add(K2);
                    }
                }
            }
            ArrayList arrayList4 = this.f53233f.f53156a;
            int size3 = arrayList4.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList4.get(i13);
                i13++;
                gj gjVar3 = (gj) obj3;
                String a13 = k.a(gjVar3);
                if (!TextUtils.isEmpty(a13) && !a13.startsWith("#") && !a13.startsWith("$") && !a13.startsWith("@")) {
                    hashSet.add(a13);
                    String str4 = this.f53237w;
                    int i14 = g.f53138b;
                    o41 K3 = o41.K(g.class);
                    K3.A = 3;
                    K3.f38096r = false;
                    K3.I = gjVar3;
                    K3.f38092n = str4;
                    K3.L(j0(gjVar3));
                    arrayList.add(K3);
                }
            }
            if (!this.f53233f.f53160f) {
                arrayList.add(o41.q(arrayList.size(), 32));
                arrayList.add(o41.q(arrayList.size(), 32));
                arrayList.add(o41.q(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(o41.C(charSequence));
        }
    }

    @Override
    public final CharSequence a0() {
        return hd.N0(2131742673, null);
    }

    @Override
    public final void b0(o41 o41Var, View view) {
        if (o41Var.H(g.class)) {
            if (this.actionBar.x()) {
                h0(o41Var, view);
                return;
            }
            finishFragment();
            this.f53234n.a(k.a((gj) o41Var.I));
        }
    }

    @Override
    public final boolean c0(o41 o41Var, View view) {
        if (o41Var.H(g.class)) {
            h0(o41Var, view);
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = m6.f29381d6;
        t6.h(i7, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(m6.x0(null, i7, false));
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = m6.G6;
        t6.l(kVar2, 5, i10, getResourceProvider());
        t6.l(this.actionBar, 3, m6.f29794z8, getResourceProvider());
        t6.l(this.actionBar, 1, i10, getResourceProvider());
        t6.b(this.actionBar, i10, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new hs0(this, 24));
        org.telegram.ui.ActionBar.y p10 = this.actionBar.p(null);
        NumberTextView numberTextView = new NumberTextView(p10.getContext());
        this.f53238x = numberTextView;
        numberTextView.setTextSize(18);
        this.f53238x.setTypeface(org.telegram.messenger.g0.o());
        this.f53238x.setTextColor(getThemedColor(m6.f29775y8));
        this.f53238x.setOnTouchListener(new gi.a(2));
        p10.addView(this.f53238x, ma.m(1.0f, 0, -1, 65, 0, 0));
        this.f53236s = p10.h(2131296500, 2131232226, org.telegram.messenger.g0.L(54.0f), hd.N0(2131754877, null));
        p10.h(2131296496, 2131232110, org.telegram.messenger.g0.L(54.0f), hd.N0(2131751586, null));
        org.telegram.ui.ActionBar.q0 c10 = this.actionBar.s().c(0, 2131232488, getResourceProvider());
        c10.O();
        c10.I = new s2(this);
        this.f53235r = c10;
        c10.setSearchFieldHint(hd.N0(2131745640, null));
        this.f53235r.setContentDescription(hd.N0(2131745640, null));
        EditTextBoldCursor searchField = this.f53235r.getSearchField();
        t6.U(searchField, i10, getResourceProvider());
        t6.D(searchField, m6.Jj, getResourceProvider());
        t6.v(searchField, i10, getResourceProvider());
        this.f34681a.j(new oa(this, 27));
        nv0 nv0Var = new nv0(context, null, 1, null);
        nv0Var.d.setText(hd.N0(2131742653, null));
        nv0Var.f37995e.setVisibility(8);
        nv0Var.e(false, false);
        nv0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(nv0Var, ma.c(-1.0f, -1));
        this.f34681a.setEmptyView(nv0Var);
        return this.fragmentView;
    }

    public final void h0(o41 o41Var, View view) {
        h hVar = (h) view;
        gj gjVar = (gj) o41Var.I;
        boolean j02 = j0(gjVar);
        HashSet hashSet = this.f53239y;
        boolean z10 = false;
        if (j02) {
            if (gjVar != null) {
                hashSet.remove(Integer.valueOf(gjVar.e1()));
            }
            hVar.setChecked(false);
        } else {
            if (gjVar != null) {
                hashSet.add(Integer.valueOf(gjVar.e1()));
            }
            hVar.setChecked(true);
        }
        this.f53238x.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.w();
        } else {
            this.actionBar.R(null, null);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f53236s;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        org.telegram.messenger.g0.T3(q0Var, z10, true);
    }

    public final void i0() {
        HashSet hashSet = this.f53239y;
        if (hashSet.size() != 1) {
            return;
        }
        long e10 = k10.i(this.currentAccount).e();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.g0.h3(new m9(e10, intValue, 3), 80L);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(getThemedColor(m6.f29381d6)) > 0.721f) {
            return true;
        }
        return false;
    }

    public final boolean j0(gj gjVar) {
        if (gjVar != null) {
            if (this.f53239y.contains(Integer.valueOf(gjVar.e1()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void l0() {
        int i7;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 < this.f34681a.getChildCount()) {
                View childAt = this.f34681a.getChildAt(i11);
                this.f34681a.getClass();
                int R = RecyclerView.R(childAt);
                if (R < 0) {
                    i11++;
                    i10 = R;
                } else {
                    i7 = childAt.getTop();
                    i10 = R;
                    break;
                }
            } else {
                i7 = 0;
                break;
            }
        }
        this.f34681a.f35789g3.O(true);
        if (i10 >= 0) {
            this.f34681a.f35788f3.h1(i10, i7);
        } else {
            this.f34681a.f35788f3.h1(0, 0);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f53232e.a();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.f53232e.c();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(m6.x0(null, m6.f29381d6, false));
            }
            NumberTextView numberTextView = this.f53238x;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(m6.f29775y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f53235r;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.f53235r.getSearchField().setCursorColor(getThemedColor(m6.G6));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
