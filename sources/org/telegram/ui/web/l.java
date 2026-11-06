package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.ua;
import c8.ha;
import fi.u2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.ui;
import org.telegram.ui.mt0;
public final class l extends h41 {
    public h f51211f;
    public final Runnable h;
    public final org.telegram.ui.q f51212n;
    public org.telegram.ui.ActionBar.r0 f51213r;
    public org.telegram.ui.ActionBar.r0 f51214s;
    public String f51215w;
    public NumberTextView f51216x;
    public final h f51210e = new h(null, this.currentAccount, new k(this, 0));
    public final HashSet f51217y = new HashSet();
    public final HashSet D = new HashSet();

    public l(org.telegram.ui.a0 a0Var, org.telegram.ui.q qVar) {
        this.h = a0Var;
        this.f51212n = qVar;
    }

    public static void d0(l lVar, HashSet hashSet) {
        qp.s1(lVar.currentAccount).Z(new ArrayList(hashSet), null, null, p10.i(lVar.currentAccount).e(), 0, true, 0);
        lVar.f51210e.b(new ArrayList(hashSet));
        h hVar = lVar.f51211f;
        if (hVar != null) {
            hVar.b(new ArrayList(hashSet));
        }
        lVar.f51217y.clear();
        lVar.actionBar.u();
        lVar.f34211a.f35167f3.O(true);
    }

    public static boolean k0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !jg.g.A(" ", lowerCase2, lowerCase) && !jg.g.A(".", lowerCase2, lowerCase)) {
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
        HashSet hashSet = this.D;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f51215w);
        h hVar = this.f51210e;
        if (isEmpty) {
            ArrayList arrayList2 = hVar.f51136a;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                ij ijVar = (ij) obj;
                String a10 = j.a(ijVar);
                if (!TextUtils.isEmpty(a10) && !a10.startsWith("#") && !a10.startsWith("$") && !a10.startsWith("@")) {
                    hashSet.add(a10);
                    int i10 = f.f51113b;
                    r31 K = r31.K(f.class);
                    K.f37611z = 3;
                    K.f37603q = false;
                    K.H = ijVar;
                    K.L(j0(ijVar));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!hVar.f51140f) {
                arrayList.add(r31.q(arrayList.size(), 32));
                arrayList.add(r31.q(arrayList.size(), 32));
                arrayList.add(r31.q(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = hVar.f51136a;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                ij ijVar2 = (ij) obj2;
                String a11 = j.a(ijVar2);
                if (!TextUtils.isEmpty(a11) && !a11.startsWith("#") && !a11.startsWith("$") && !a11.startsWith("@")) {
                    hashSet.add(a11);
                    String K0 = org.telegram.messenger.g0.K0(a11, true);
                    a2 a12 = b2.b().a(K0);
                    TLRPC.Message message = ijVar2.f23237k;
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
                    if (k0(K0, this.f51215w) || k0(str, this.f51215w) || k0(str2, this.f51215w)) {
                        String str3 = this.f51215w;
                        int i12 = f.f51113b;
                        r31 K2 = r31.K(f.class);
                        K2.f37611z = 3;
                        K2.f37603q = false;
                        K2.H = ijVar2;
                        K2.f37599m = str3;
                        K2.L(j0(ijVar2));
                        arrayList.add(K2);
                    }
                }
            }
            ArrayList arrayList4 = this.f51211f.f51136a;
            int size3 = arrayList4.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList4.get(i13);
                i13++;
                ij ijVar3 = (ij) obj3;
                String a13 = j.a(ijVar3);
                if (!TextUtils.isEmpty(a13) && !a13.startsWith("#") && !a13.startsWith("$") && !a13.startsWith("@")) {
                    hashSet.add(a13);
                    String str4 = this.f51215w;
                    int i14 = f.f51113b;
                    r31 K3 = r31.K(f.class);
                    K3.f37611z = 3;
                    K3.f37603q = false;
                    K3.H = ijVar3;
                    K3.f37599m = str4;
                    K3.L(j0(ijVar3));
                    arrayList.add(K3);
                }
            }
            if (!this.f51211f.f51140f) {
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
        return hd.M0(2131742940, null);
    }

    @Override
    public final void b0(r31 r31Var, View view) {
        if (r31Var.H(f.class)) {
            if (this.actionBar.v()) {
                h0(r31Var, view);
                return;
            }
            finishFragment();
            this.f51212n.a(j.a((ij) r31Var.H));
        }
    }

    @Override
    public final boolean c0(r31 r31Var, View view) {
        if (r31Var.H(f.class)) {
            h0(r31Var, view);
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = k6.f27848d6;
        r6.i(i7, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(k6.x0(null, i7, false));
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = k6.G6;
        r6.m(kVar2, 5, i10, getResourceProvider());
        r6.m(this.actionBar, 3, k6.f28260z8, getResourceProvider());
        r6.m(this.actionBar, 1, i10, getResourceProvider());
        r6.b(this.actionBar, i10, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new mt0(this, 21));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n(null);
        NumberTextView numberTextView = new NumberTextView(n10.getContext());
        this.f51216x = numberTextView;
        numberTextView.setTextSize(18);
        this.f51216x.setTypeface(org.telegram.messenger.g0.o());
        this.f51216x.setTextColor(getThemedColor(k6.f28242y8));
        this.f51216x.setOnTouchListener(new ei.b(2));
        n10.addView(this.f51216x, ha.m(1.0f, 0, -1, 65, 0, 0));
        this.f51214s = n10.h(2131296498, 2131232224, org.telegram.messenger.g0.L(54.0f), hd.M0(2131754877, null));
        n10.h(2131296494, 2131232108, org.telegram.messenger.g0.L(54.0f), hd.M0(2131751599, null));
        org.telegram.ui.ActionBar.r0 c10 = this.actionBar.q().c(0, 2131232486, getResourceProvider());
        c10.N();
        c10.H = new u2(this);
        this.f51213r = c10;
        c10.setSearchFieldHint(hd.M0(2131745837, null));
        this.f51213r.setContentDescription(hd.M0(2131745837, null));
        EditTextBoldCursor searchField = this.f51213r.getSearchField();
        r6.V(searchField, i10, getResourceProvider());
        r6.E(searchField, k6.Gj, getResourceProvider());
        r6.w(searchField, i10, getResourceProvider());
        this.f34211a.j(new ui(this, 24));
        av0 av0Var = new av0(context, null, 1, null);
        av0Var.d.setText(hd.M0(2131742920, null));
        av0Var.f31917e.setVisibility(8);
        av0Var.e(false, false);
        av0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(av0Var, ha.c(-1.0f, -1));
        this.f34211a.setEmptyView(av0Var);
        return this.fragmentView;
    }

    public final void h0(r31 r31Var, View view) {
        g gVar = (g) view;
        ij ijVar = (ij) r31Var.H;
        boolean j02 = j0(ijVar);
        HashSet hashSet = this.f51217y;
        boolean z9 = false;
        if (j02) {
            if (ijVar != null) {
                hashSet.remove(Integer.valueOf(ijVar.f1()));
            }
            gVar.setChecked(false);
        } else {
            if (ijVar != null) {
                hashSet.add(Integer.valueOf(ijVar.f1()));
            }
            gVar.setChecked(true);
        }
        this.f51216x.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.u();
        } else {
            this.actionBar.O(null, null);
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.f51214s;
        if (hashSet.size() == 1) {
            z9 = true;
        }
        org.telegram.messenger.g0.V3(r0Var, z9, true);
    }

    public final void i0() {
        HashSet hashSet = this.f51217y;
        if (hashSet.size() != 1) {
            return;
        }
        long e10 = p10.i(this.currentAccount).e();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.g0.i3(new ua(e10, intValue, 3), 80L);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(getThemedColor(k6.f27848d6)) > 0.721f) {
            return true;
        }
        return false;
    }

    public final boolean j0(ij ijVar) {
        if (ijVar != null) {
            if (this.f51217y.contains(Integer.valueOf(ijVar.f1()))) {
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
            if (i11 < this.f34211a.getChildCount()) {
                View childAt = this.f34211a.getChildAt(i11);
                this.f34211a.getClass();
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
        this.f34211a.f35167f3.O(true);
        if (i10 >= 0) {
            this.f34211a.f35166e3.h1(i10, i7);
        } else {
            this.f34211a.f35166e3.h1(0, 0);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f51210e.a();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.f51210e.c();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(k6.x0(null, k6.f27848d6, false));
            }
            NumberTextView numberTextView = this.f51216x;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(k6.f28242y8));
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.f51213r;
            if (r0Var != null && r0Var.getSearchField() != null) {
                this.f51213r.getSearchField().setCursorColor(getThemedColor(k6.G6));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
