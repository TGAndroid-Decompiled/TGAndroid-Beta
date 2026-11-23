package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.na;
import di.m9;
import hi.b3;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.gs0;
public final class m extends d51 {
    public i f53468f;
    public final Runnable h;
    public final org.telegram.ui.q f53469n;
    public org.telegram.ui.ActionBar.q0 f53470r;
    public org.telegram.ui.ActionBar.q0 f53471s;
    public String f53472w;
    public NumberTextView f53473x;
    public final i f53467e = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet f53474y = new HashSet();
    public final HashSet E = new HashSet();

    public m(org.telegram.ui.z zVar, org.telegram.ui.q qVar) {
        this.h = zVar;
        this.f53469n = qVar;
    }

    public static void d0(m mVar, HashSet hashSet) {
        mp.u1(mVar.currentAccount).Z(new ArrayList(hashSet), null, null, i10.i(mVar.currentAccount).e(), 0, true, 0);
        mVar.f53467e.b(new ArrayList(hashSet));
        i iVar = mVar.f53468f;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        mVar.f53474y.clear();
        mVar.actionBar.w();
        mVar.f34213a.f35323g3.O(true);
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
    public final void Z(ArrayList arrayList, b51 b51Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.E;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f53472w);
        i iVar = this.f53467e;
        if (isEmpty) {
            ArrayList arrayList2 = iVar.f53391a;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                fj fjVar = (fj) obj;
                String a10 = k.a(fjVar);
                if (!TextUtils.isEmpty(a10) && !a10.startsWith("#") && !a10.startsWith("$") && !a10.startsWith("@")) {
                    hashSet.add(a10);
                    int i10 = g.f53373b;
                    n41 K = n41.K(g.class);
                    K.A = 3;
                    K.f37660r = false;
                    K.I = fjVar;
                    K.L(j0(fjVar));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!iVar.f53395f) {
                arrayList.add(n41.q(arrayList.size(), 32));
                arrayList.add(n41.q(arrayList.size(), 32));
                arrayList.add(n41.q(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = iVar.f53391a;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                fj fjVar2 = (fj) obj2;
                String a11 = k.a(fjVar2);
                if (!TextUtils.isEmpty(a11) && !a11.startsWith("#") && !a11.startsWith("$") && !a11.startsWith("@")) {
                    hashSet.add(a11);
                    String K0 = org.telegram.messenger.g0.K0(a11, true);
                    a2 a12 = b2.b().a(K0);
                    TLRPC.Message message = fjVar2.f24073k;
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
                    if (k0(K0, this.f53472w) || k0(str, this.f53472w) || k0(str2, this.f53472w)) {
                        String str3 = this.f53472w;
                        int i12 = g.f53373b;
                        n41 K2 = n41.K(g.class);
                        K2.A = 3;
                        K2.f37660r = false;
                        K2.I = fjVar2;
                        K2.f37656n = str3;
                        K2.L(j0(fjVar2));
                        arrayList.add(K2);
                    }
                }
            }
            ArrayList arrayList4 = this.f53468f.f53391a;
            int size3 = arrayList4.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList4.get(i13);
                i13++;
                fj fjVar3 = (fj) obj3;
                String a13 = k.a(fjVar3);
                if (!TextUtils.isEmpty(a13) && !a13.startsWith("#") && !a13.startsWith("$") && !a13.startsWith("@")) {
                    hashSet.add(a13);
                    String str4 = this.f53472w;
                    int i14 = g.f53373b;
                    n41 K3 = n41.K(g.class);
                    K3.A = 3;
                    K3.f37660r = false;
                    K3.I = fjVar3;
                    K3.f37656n = str4;
                    K3.L(j0(fjVar3));
                    arrayList.add(K3);
                }
            }
            if (!this.f53468f.f53395f) {
                arrayList.add(n41.q(arrayList.size(), 32));
                arrayList.add(n41.q(arrayList.size(), 32));
                arrayList.add(n41.q(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(n41.C(charSequence));
        }
    }

    @Override
    public final CharSequence a0() {
        return gd.N0(2131742668, null);
    }

    @Override
    public final void b0(n41 n41Var, View view) {
        if (n41Var.H(g.class)) {
            if (this.actionBar.x()) {
                h0(n41Var, view);
                return;
            }
            finishFragment();
            this.f53469n.a(k.a((fj) n41Var.I));
        }
    }

    @Override
    public final boolean c0(n41 n41Var, View view) {
        if (n41Var.H(g.class)) {
            h0(n41Var, view);
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = n6.f29451d6;
        u6.h(i7, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(n6.x0(null, i7, false));
        this.actionBar.setBackButtonImage(2131231243);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = n6.G6;
        u6.l(kVar2, 5, i10, getResourceProvider());
        u6.l(this.actionBar, 3, n6.f29864z8, getResourceProvider());
        u6.l(this.actionBar, 1, i10, getResourceProvider());
        u6.b(this.actionBar, i10, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new gs0(this, 24));
        org.telegram.ui.ActionBar.y p10 = this.actionBar.p(null);
        NumberTextView numberTextView = new NumberTextView(p10.getContext());
        this.f53473x = numberTextView;
        numberTextView.setTextSize(18);
        this.f53473x.setTypeface(org.telegram.messenger.g0.o());
        this.f53473x.setTextColor(getThemedColor(n6.f29845y8));
        this.f53473x.setOnTouchListener(new gi.a(2));
        p10.addView(this.f53473x, na.m(1.0f, 0, -1, 65, 0, 0));
        this.f53471s = p10.h(2131296500, 2131232229, org.telegram.messenger.g0.L(54.0f), gd.N0(2131754877, null));
        p10.h(2131296496, 2131232113, org.telegram.messenger.g0.L(54.0f), gd.N0(2131751586, null));
        org.telegram.ui.ActionBar.q0 c10 = this.actionBar.s().c(0, 2131232491, getResourceProvider());
        c10.O();
        c10.I = new b3(this);
        this.f53470r = c10;
        c10.setSearchFieldHint(gd.N0(2131745640, null));
        this.f53470r.setContentDescription(gd.N0(2131745640, null));
        EditTextBoldCursor searchField = this.f53470r.getSearchField();
        u6.U(searchField, i10, getResourceProvider());
        u6.D(searchField, n6.Jj, getResourceProvider());
        u6.v(searchField, i10, getResourceProvider());
        this.f34213a.j(new org.telegram.ui.Components.na(this, 27));
        mv0 mv0Var = new mv0(context, null, 1, null);
        mv0Var.d.setText(gd.N0(2131742648, null));
        mv0Var.f37553e.setVisibility(8);
        mv0Var.e(false, false);
        mv0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(mv0Var, na.c(-1.0f, -1));
        this.f34213a.setEmptyView(mv0Var);
        return this.fragmentView;
    }

    public final void h0(n41 n41Var, View view) {
        h hVar = (h) view;
        fj fjVar = (fj) n41Var.I;
        boolean j02 = j0(fjVar);
        HashSet hashSet = this.f53474y;
        boolean z10 = false;
        if (j02) {
            if (fjVar != null) {
                hashSet.remove(Integer.valueOf(fjVar.e1()));
            }
            hVar.setChecked(false);
        } else {
            if (fjVar != null) {
                hashSet.add(Integer.valueOf(fjVar.e1()));
            }
            hVar.setChecked(true);
        }
        this.f53473x.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.w();
        } else {
            this.actionBar.R(null, null);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f53471s;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        org.telegram.messenger.g0.T3(q0Var, z10, true);
    }

    public final void i0() {
        HashSet hashSet = this.f53474y;
        if (hashSet.size() != 1) {
            return;
        }
        long e10 = i10.i(this.currentAccount).e();
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
        if (org.telegram.messenger.g0.B(getThemedColor(n6.f29451d6)) > 0.721f) {
            return true;
        }
        return false;
    }

    public final boolean j0(fj fjVar) {
        if (fjVar != null) {
            if (this.f53474y.contains(Integer.valueOf(fjVar.e1()))) {
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
            if (i11 < this.f34213a.getChildCount()) {
                View childAt = this.f34213a.getChildAt(i11);
                this.f34213a.getClass();
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
        this.f34213a.f35323g3.O(true);
        if (i10 >= 0) {
            this.f34213a.f35322f3.h1(i10, i7);
        } else {
            this.f34213a.f35322f3.h1(0, 0);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f53467e.a();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.f53467e.c();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(n6.x0(null, n6.f29451d6, false));
            }
            NumberTextView numberTextView = this.f53473x;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(n6.f29845y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f53470r;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.f53470r.getSearchField().setCursorColor(getThemedColor(n6.G6));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
