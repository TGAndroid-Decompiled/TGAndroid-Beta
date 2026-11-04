package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import ci.s9;
import gi.s2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.vs0;
public final class n extends h41 {
    public j f50956f;
    public final Runnable h;
    public final org.telegram.ui.q f50957n;
    public org.telegram.ui.ActionBar.q0 f50958r;
    public org.telegram.ui.ActionBar.q0 f50959s;
    public String f50960w;
    public NumberTextView f50961x;
    public final j f50955e = new j(null, this.currentAccount, new m(this, 0));
    public final HashSet f50962y = new HashSet();
    public final HashSet E = new HashSet();

    public n(org.telegram.ui.b0 b0Var, org.telegram.ui.q qVar) {
        this.h = b0Var;
        this.f50957n = qVar;
    }

    public static void d0(n nVar, HashSet hashSet) {
        hp.s1(nVar.currentAccount).Z(new ArrayList(hashSet), null, null, h10.i(nVar.currentAccount).e(), 0, true, 0);
        nVar.f50955e.b(new ArrayList(hashSet));
        j jVar = nVar.f50956f;
        if (jVar != null) {
            jVar.b(new ArrayList(hashSet));
        }
        nVar.f50962y.clear();
        nVar.actionBar.u();
        nVar.f34298a.f35594g3.O(true);
    }

    public static boolean k0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !k2.p1.z(" ", lowerCase2, lowerCase) && !k2.p1.z(".", lowerCase2, lowerCase)) {
            String O3 = org.telegram.messenger.g0.O3(lowerCase);
            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
            if (!O3.startsWith(O32) && !O3.contains(" ".concat(O32)) && !O3.contains(".".concat(O32))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void Z(ArrayList arrayList, f41 f41Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.E;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f50960w);
        j jVar = this.f50955e;
        if (isEmpty) {
            ArrayList arrayList2 = jVar.f50906a;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                zi ziVar = (zi) obj;
                String a10 = l.a(ziVar);
                if (!TextUtils.isEmpty(a10) && !a10.startsWith("#") && !a10.startsWith("$") && !a10.startsWith("@")) {
                    hashSet.add(a10);
                    int i10 = h.f50854b;
                    r31 K = r31.K(h.class);
                    K.f37640z = 3;
                    K.f37632q = false;
                    K.H = ziVar;
                    K.L(j0(ziVar));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!jVar.f50910f) {
                arrayList.add(r31.q(arrayList.size(), 32));
                arrayList.add(r31.q(arrayList.size(), 32));
                arrayList.add(r31.q(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = jVar.f50906a;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                zi ziVar2 = (zi) obj2;
                String a11 = l.a(ziVar2);
                if (!TextUtils.isEmpty(a11) && !a11.startsWith("#") && !a11.startsWith("$") && !a11.startsWith("@")) {
                    hashSet.add(a11);
                    String K0 = org.telegram.messenger.g0.K0(a11, true);
                    y1 a12 = z1.b().a(K0);
                    TLRPC.Message message = ziVar2.f26868k;
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
                    if (k0(K0, this.f50960w) || k0(str, this.f50960w) || k0(str2, this.f50960w)) {
                        String str3 = this.f50960w;
                        int i12 = h.f50854b;
                        r31 K2 = r31.K(h.class);
                        K2.f37640z = 3;
                        K2.f37632q = false;
                        K2.H = ziVar2;
                        K2.f37628m = str3;
                        K2.L(j0(ziVar2));
                        arrayList.add(K2);
                    }
                }
            }
            ArrayList arrayList4 = this.f50956f.f50906a;
            int size3 = arrayList4.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList4.get(i13);
                i13++;
                zi ziVar3 = (zi) obj3;
                String a13 = l.a(ziVar3);
                if (!TextUtils.isEmpty(a13) && !a13.startsWith("#") && !a13.startsWith("$") && !a13.startsWith("@")) {
                    hashSet.add(a13);
                    String str4 = this.f50960w;
                    int i14 = h.f50854b;
                    r31 K3 = r31.K(h.class);
                    K3.f37640z = 3;
                    K3.f37632q = false;
                    K3.H = ziVar3;
                    K3.f37628m = str4;
                    K3.L(j0(ziVar3));
                    arrayList.add(K3);
                }
            }
            if (!this.f50956f.f50910f) {
                arrayList.add(r31.q(arrayList.size(), 32));
                arrayList.add(r31.q(arrayList.size(), 32));
                arrayList.add(r31.q(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(r31.C(charSequence));
        }
    }

    @Override
    public final CharSequence a0() {
        return bd.M0(2131742949, null);
    }

    @Override
    public final void b0(r31 r31Var, View view) {
        if (r31Var.H(h.class)) {
            if (this.actionBar.v()) {
                h0(r31Var, view);
                return;
            }
            finishFragment();
            this.f50957n.a(l.a((zi) r31Var.H));
        }
    }

    @Override
    public final boolean c0(r31 r31Var, View view) {
        if (r31Var.H(h.class)) {
            h0(r31Var, view);
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i3 = k6.f27878d6;
        r6.i(i3, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(k6.x0(null, i3, false));
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = k6.G6;
        r6.m(kVar2, 5, i10, getResourceProvider());
        r6.m(this.actionBar, 3, k6.f28292z8, getResourceProvider());
        r6.m(this.actionBar, 1, i10, getResourceProvider());
        r6.b(this.actionBar, i10, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new vs0(this, 22));
        org.telegram.ui.ActionBar.x n4 = this.actionBar.n(null);
        NumberTextView numberTextView = new NumberTextView(n4.getContext());
        this.f50961x = numberTextView;
        numberTextView.setTextSize(18);
        this.f50961x.setTypeface(org.telegram.messenger.g0.o());
        this.f50961x.setTextColor(getThemedColor(k6.f28275y8));
        this.f50961x.setOnTouchListener(new fi.a(2));
        n4.addView(this.f50961x, mf.m(1.0f, 0, -1, 65, 0, 0));
        this.f50959s = n4.h(2131296498, 2131232224, org.telegram.messenger.g0.L(54.0f), bd.M0(2131754877, null));
        n4.h(2131296494, 2131232108, org.telegram.messenger.g0.L(54.0f), bd.M0(2131751599, null));
        org.telegram.ui.ActionBar.q0 c2 = this.actionBar.q().c(0, 2131232486, getResourceProvider());
        c2.N();
        c2.I = new s2(this);
        this.f50958r = c2;
        c2.setSearchFieldHint(bd.M0(2131745846, null));
        this.f50958r.setContentDescription(bd.M0(2131745846, null));
        EditTextBoldCursor searchField = this.f50958r.getSearchField();
        r6.V(searchField, i10, getResourceProvider());
        r6.E(searchField, k6.Gj, getResourceProvider());
        r6.w(searchField, i10, getResourceProvider());
        this.f34298a.j(new ji(this, 26));
        zu0 zu0Var = new zu0(context, null, 1, null);
        zu0Var.d.setText(bd.M0(2131742929, null));
        zu0Var.f41128e.setVisibility(8);
        zu0Var.e(false, false);
        zu0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(zu0Var, mf.c(-1.0f, -1));
        this.f34298a.setEmptyView(zu0Var);
        return this.fragmentView;
    }

    public final void h0(r31 r31Var, View view) {
        i iVar = (i) view;
        zi ziVar = (zi) r31Var.H;
        boolean j02 = j0(ziVar);
        HashSet hashSet = this.f50962y;
        boolean z10 = false;
        if (j02) {
            if (ziVar != null) {
                hashSet.remove(Integer.valueOf(ziVar.f1()));
            }
            iVar.setChecked(false);
        } else {
            if (ziVar != null) {
                hashSet.add(Integer.valueOf(ziVar.f1()));
            }
            iVar.setChecked(true);
        }
        this.f50961x.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.u();
        } else {
            this.actionBar.O(null, null);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f50959s;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        org.telegram.messenger.g0.V3(q0Var, z10, true);
    }

    public final void i0() {
        HashSet hashSet = this.f50962y;
        if (hashSet.size() != 1) {
            return;
        }
        long e10 = h10.i(this.currentAccount).e();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.g0.i3(new s9(e10, intValue, 3), 80L);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(getThemedColor(k6.f27878d6)) > 0.721f) {
            return true;
        }
        return false;
    }

    public final boolean j0(zi ziVar) {
        if (ziVar != null) {
            if (this.f50962y.contains(Integer.valueOf(ziVar.f1()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void l0() {
        int i3;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 < this.f34298a.getChildCount()) {
                View childAt = this.f34298a.getChildAt(i11);
                this.f34298a.getClass();
                int R = RecyclerView.R(childAt);
                if (R < 0) {
                    i11++;
                    i10 = R;
                } else {
                    i3 = childAt.getTop();
                    i10 = R;
                    break;
                }
            } else {
                i3 = 0;
                break;
            }
        }
        this.f34298a.f35594g3.O(true);
        if (i10 >= 0) {
            this.f34298a.f35593f3.h1(i10, i3);
        } else {
            this.f34298a.f35593f3.h1(0, 0);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f50955e.a();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.f50955e.c();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(k6.x0(null, k6.f27878d6, false));
            }
            NumberTextView numberTextView = this.f50961x;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(k6.f28275y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f50958r;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.f50958r.getSearchField().setCursorColor(getThemedColor(k6.G6));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
