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
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.y31;
import org.telegram.ui.pt0;
public final class l extends o41 {
    public h f51204f;
    public final Runnable h;
    public final org.telegram.ui.q f51205n;
    public org.telegram.ui.ActionBar.r0 f51206r;
    public org.telegram.ui.ActionBar.r0 f51207s;
    public String f51208w;
    public NumberTextView f51209x;
    public final h f51203e = new h(null, this.currentAccount, new k(this, 0));
    public final HashSet f51210y = new HashSet();
    public final HashSet D = new HashSet();

    public l(org.telegram.ui.a0 a0Var, org.telegram.ui.q qVar) {
        this.h = a0Var;
        this.f51205n = qVar;
    }

    public static void d0(l lVar, HashSet hashSet) {
        qp.s1(lVar.currentAccount).Z(new ArrayList(hashSet), null, null, p10.i(lVar.currentAccount).e(), 0, true, 0);
        lVar.f51203e.b(new ArrayList(hashSet));
        h hVar = lVar.f51204f;
        if (hVar != null) {
            hVar.b(new ArrayList(hashSet));
        }
        lVar.f51210y.clear();
        lVar.actionBar.v();
        lVar.f36649a.f37556f3.O(true);
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
    public final void Z(ArrayList arrayList, m41 m41Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.D;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f51208w);
        h hVar = this.f51203e;
        if (isEmpty) {
            ArrayList arrayList2 = hVar.f51129a;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                ij ijVar = (ij) obj;
                String a10 = j.a(ijVar);
                if (!TextUtils.isEmpty(a10) && !a10.startsWith("#") && !a10.startsWith("$") && !a10.startsWith("@")) {
                    hashSet.add(a10);
                    int i10 = f.f51106b;
                    y31 K = y31.K(f.class);
                    K.f40581z = 3;
                    K.f40573q = false;
                    K.H = ijVar;
                    K.L(j0(ijVar));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!hVar.f51133f) {
                arrayList.add(y31.q(arrayList.size(), 32));
                arrayList.add(y31.q(arrayList.size(), 32));
                arrayList.add(y31.q(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = hVar.f51129a;
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
                    TLRPC.Message message = ijVar2.f23262k;
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
                    if (k0(K0, this.f51208w) || k0(str, this.f51208w) || k0(str2, this.f51208w)) {
                        String str3 = this.f51208w;
                        int i12 = f.f51106b;
                        y31 K2 = y31.K(f.class);
                        K2.f40581z = 3;
                        K2.f40573q = false;
                        K2.H = ijVar2;
                        K2.f40569m = str3;
                        K2.L(j0(ijVar2));
                        arrayList.add(K2);
                    }
                }
            }
            ArrayList arrayList4 = this.f51204f.f51129a;
            int size3 = arrayList4.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList4.get(i13);
                i13++;
                ij ijVar3 = (ij) obj3;
                String a13 = j.a(ijVar3);
                if (!TextUtils.isEmpty(a13) && !a13.startsWith("#") && !a13.startsWith("$") && !a13.startsWith("@")) {
                    hashSet.add(a13);
                    String str4 = this.f51208w;
                    int i14 = f.f51106b;
                    y31 K3 = y31.K(f.class);
                    K3.f40581z = 3;
                    K3.f40573q = false;
                    K3.H = ijVar3;
                    K3.f40569m = str4;
                    K3.L(j0(ijVar3));
                    arrayList.add(K3);
                }
            }
            if (!this.f51204f.f51133f) {
                arrayList.add(y31.q(arrayList.size(), 32));
                arrayList.add(y31.q(arrayList.size(), 32));
                arrayList.add(y31.q(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(y31.C(charSequence));
        }
    }

    @Override
    public final CharSequence a0() {
        return id.M0(2131742939, null);
    }

    @Override
    public final void b0(y31 y31Var, View view) {
        if (y31Var.H(f.class)) {
            if (this.actionBar.w()) {
                h0(y31Var, view);
                return;
            }
            finishFragment();
            this.f51205n.a(j.a((ij) y31Var.H));
        }
    }

    @Override
    public final boolean c0(y31 y31Var, View view) {
        if (y31Var.H(f.class)) {
            h0(y31Var, view);
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = l6.f27865d6;
        s6.h(i7, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(l6.x0(null, i7, false));
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = l6.G6;
        s6.l(kVar2, 5, i10, getResourceProvider());
        s6.l(this.actionBar, 3, l6.f28277z8, getResourceProvider());
        s6.l(this.actionBar, 1, i10, getResourceProvider());
        s6.b(this.actionBar, i10, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new pt0(this, 21));
        org.telegram.ui.ActionBar.y o4 = this.actionBar.o(null);
        NumberTextView numberTextView = new NumberTextView(o4.getContext());
        this.f51209x = numberTextView;
        numberTextView.setTextSize(18);
        this.f51209x.setTypeface(org.telegram.messenger.g0.o());
        this.f51209x.setTextColor(getThemedColor(l6.f28259y8));
        this.f51209x.setOnTouchListener(new ei.b(2));
        o4.addView(this.f51209x, ha.m(1.0f, 0, -1, 65, 0, 0));
        this.f51207s = o4.h(2131296498, 2131232224, org.telegram.messenger.g0.L(54.0f), id.M0(2131754877, null));
        o4.h(2131296494, 2131232108, org.telegram.messenger.g0.L(54.0f), id.M0(2131751598, null));
        org.telegram.ui.ActionBar.r0 c10 = this.actionBar.r().c(0, 2131232486, getResourceProvider());
        c10.N();
        c10.H = new u2(this);
        this.f51206r = c10;
        c10.setSearchFieldHint(id.M0(2131745836, null));
        this.f51206r.setContentDescription(id.M0(2131745836, null));
        EditTextBoldCursor searchField = this.f51206r.getSearchField();
        s6.U(searchField, i10, getResourceProvider());
        s6.D(searchField, l6.Gj, getResourceProvider());
        s6.v(searchField, i10, getResourceProvider());
        this.f36649a.j(new ui(this, 24));
        cv0 cv0Var = new cv0(context, null, 1, null);
        cv0Var.d.setText(id.M0(2131742919, null));
        cv0Var.f32768e.setVisibility(8);
        cv0Var.e(false, false);
        cv0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(cv0Var, ha.c(-1.0f, -1));
        this.f36649a.setEmptyView(cv0Var);
        return this.fragmentView;
    }

    public final void h0(y31 y31Var, View view) {
        g gVar = (g) view;
        ij ijVar = (ij) y31Var.H;
        boolean j02 = j0(ijVar);
        HashSet hashSet = this.f51210y;
        boolean z9 = false;
        if (j02) {
            if (ijVar != null) {
                hashSet.remove(Integer.valueOf(ijVar.e1()));
            }
            gVar.setChecked(false);
        } else {
            if (ijVar != null) {
                hashSet.add(Integer.valueOf(ijVar.e1()));
            }
            gVar.setChecked(true);
        }
        this.f51209x.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.v();
        } else {
            this.actionBar.P(null, null);
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.f51207s;
        if (hashSet.size() == 1) {
            z9 = true;
        }
        org.telegram.messenger.g0.V3(r0Var, z9, true);
    }

    public final void i0() {
        HashSet hashSet = this.f51210y;
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
        if (org.telegram.messenger.g0.B(getThemedColor(l6.f27865d6)) > 0.721f) {
            return true;
        }
        return false;
    }

    public final boolean j0(ij ijVar) {
        if (ijVar != null) {
            if (this.f51210y.contains(Integer.valueOf(ijVar.e1()))) {
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
            if (i11 < this.f36649a.getChildCount()) {
                View childAt = this.f36649a.getChildAt(i11);
                this.f36649a.getClass();
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
        this.f36649a.f37556f3.O(true);
        if (i10 >= 0) {
            this.f36649a.f37555e3.h1(i10, i7);
        } else {
            this.f36649a.f37555e3.h1(0, 0);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f51203e.a();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.f51203e.c();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(l6.x0(null, l6.f27865d6, false));
            }
            NumberTextView numberTextView = this.f51209x;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(l6.f28259y8));
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.f51206r;
            if (r0Var != null && r0Var.getSearchField() != null) {
                this.f51206r.getSearchField().setCursorColor(getThemedColor(l6.G6));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
