package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.ja;
import di.j9;
import hi.s2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.ri;
import org.telegram.ui.ct0;
public final class m extends r41 {
    public i f52703f;
    public final Runnable h;
    public final org.telegram.ui.q f52704n;
    public org.telegram.ui.ActionBar.q0 f52705r;
    public org.telegram.ui.ActionBar.q0 f52706s;
    public String f52707w;
    public NumberTextView f52708x;
    public final i f52702e = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet f52709y = new HashSet();
    public final HashSet E = new HashSet();

    public m(org.telegram.ui.z zVar, org.telegram.ui.q qVar) {
        this.h = zVar;
        this.f52704n = qVar;
    }

    public static void d0(m mVar, HashSet hashSet) {
        np.s1(mVar.currentAccount).Z(new ArrayList(hashSet), null, null, m10.i(mVar.currentAccount).e(), 0, true, 0);
        mVar.f52702e.b(new ArrayList(hashSet));
        i iVar = mVar.f52703f;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        mVar.f52709y.clear();
        mVar.actionBar.w();
        mVar.f38882a.f39895g3.O(true);
    }

    public static boolean k0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !i5.c.A(" ", lowerCase2, lowerCase) && !i5.c.A(".", lowerCase2, lowerCase)) {
            String N3 = org.telegram.messenger.g0.N3(lowerCase);
            String N32 = org.telegram.messenger.g0.N3(lowerCase2);
            if (!N3.startsWith(N32) && !N3.contains(" ".concat(N32)) && !N3.contains(".".concat(N32))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void Z(ArrayList arrayList, p41 p41Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.E;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f52707w);
        i iVar = this.f52702e;
        if (isEmpty) {
            ArrayList arrayList2 = iVar.f52626a;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                gj gjVar = (gj) obj;
                String a10 = k.a(gjVar);
                if (!TextUtils.isEmpty(a10) && !a10.startsWith("#") && !a10.startsWith("$") && !a10.startsWith("@")) {
                    hashSet.add(a10);
                    int i10 = g.f52608b;
                    b41 K = b41.K(g.class);
                    K.f33194z = 3;
                    K.f33186q = false;
                    K.H = gjVar;
                    K.L(j0(gjVar));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!iVar.f52630f) {
                arrayList.add(b41.q(arrayList.size(), 32));
                arrayList.add(b41.q(arrayList.size(), 32));
                arrayList.add(b41.q(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = iVar.f52626a;
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
                    TLRPC.Message message = gjVar2.f23817k;
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
                    if (k0(K0, this.f52707w) || k0(str, this.f52707w) || k0(str2, this.f52707w)) {
                        String str3 = this.f52707w;
                        int i12 = g.f52608b;
                        b41 K2 = b41.K(g.class);
                        K2.f33194z = 3;
                        K2.f33186q = false;
                        K2.H = gjVar2;
                        K2.f33182m = str3;
                        K2.L(j0(gjVar2));
                        arrayList.add(K2);
                    }
                }
            }
            ArrayList arrayList4 = this.f52703f.f52626a;
            int size3 = arrayList4.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList4.get(i13);
                i13++;
                gj gjVar3 = (gj) obj3;
                String a13 = k.a(gjVar3);
                if (!TextUtils.isEmpty(a13) && !a13.startsWith("#") && !a13.startsWith("$") && !a13.startsWith("@")) {
                    hashSet.add(a13);
                    String str4 = this.f52707w;
                    int i14 = g.f52608b;
                    b41 K3 = b41.K(g.class);
                    K3.f33194z = 3;
                    K3.f33186q = false;
                    K3.H = gjVar3;
                    K3.f33182m = str4;
                    K3.L(j0(gjVar3));
                    arrayList.add(K3);
                }
            }
            if (!this.f52703f.f52630f) {
                arrayList.add(b41.q(arrayList.size(), 32));
                arrayList.add(b41.q(arrayList.size(), 32));
                arrayList.add(b41.q(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(b41.C(charSequence));
        }
    }

    @Override
    public final CharSequence a0() {
        return hd.M0(2131742939, null);
    }

    @Override
    public final void b0(b41 b41Var, View view) {
        if (b41Var.H(g.class)) {
            if (this.actionBar.x()) {
                h0(b41Var, view);
                return;
            }
            finishFragment();
            this.f52704n.a(k.a((gj) b41Var.H));
        }
    }

    @Override
    public final boolean c0(b41 b41Var, View view) {
        if (b41Var.H(g.class)) {
            h0(b41Var, view);
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = j6.f28849d6;
        q6.h(i7, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(j6.x0(null, i7, false));
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = j6.G6;
        q6.l(kVar2, 5, i10, getResourceProvider());
        q6.l(this.actionBar, 3, j6.f29262z8, getResourceProvider());
        q6.l(this.actionBar, 1, i10, getResourceProvider());
        q6.b(this.actionBar, i10, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new ct0(this, 22));
        org.telegram.ui.ActionBar.y p10 = this.actionBar.p(null);
        NumberTextView numberTextView = new NumberTextView(p10.getContext());
        this.f52708x = numberTextView;
        numberTextView.setTextSize(18);
        this.f52708x.setTypeface(org.telegram.messenger.g0.o());
        this.f52708x.setTextColor(getThemedColor(j6.f29243y8));
        this.f52708x.setOnTouchListener(new gi.a(2));
        p10.addView(this.f52708x, ja.m(1.0f, 0, -1, 65, 0, 0));
        this.f52706s = p10.h(2131296498, 2131232225, org.telegram.messenger.g0.L(54.0f), hd.M0(2131754877, null));
        p10.h(2131296494, 2131232109, org.telegram.messenger.g0.L(54.0f), hd.M0(2131751598, null));
        org.telegram.ui.ActionBar.q0 c10 = this.actionBar.s().c(0, 2131232487, getResourceProvider());
        c10.O();
        c10.I = new s2(this);
        this.f52705r = c10;
        c10.setSearchFieldHint(hd.M0(2131745836, null));
        this.f52705r.setContentDescription(hd.M0(2131745836, null));
        EditTextBoldCursor searchField = this.f52705r.getSearchField();
        q6.U(searchField, i10, getResourceProvider());
        q6.D(searchField, j6.Jj, getResourceProvider());
        q6.v(searchField, i10, getResourceProvider());
        this.f38882a.j(new ri(this, 26));
        cv0 cv0Var = new cv0(context, null, 1, null);
        cv0Var.d.setText(hd.M0(2131742919, null));
        cv0Var.f33707e.setVisibility(8);
        cv0Var.e(false, false);
        cv0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(cv0Var, ja.c(-1.0f, -1));
        this.f38882a.setEmptyView(cv0Var);
        return this.fragmentView;
    }

    public final void h0(b41 b41Var, View view) {
        h hVar = (h) view;
        gj gjVar = (gj) b41Var.H;
        boolean j02 = j0(gjVar);
        HashSet hashSet = this.f52709y;
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
        this.f52708x.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.w();
        } else {
            this.actionBar.R(null, null);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f52706s;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        org.telegram.messenger.g0.U3(q0Var, z10, true);
    }

    public final void i0() {
        HashSet hashSet = this.f52709y;
        if (hashSet.size() != 1) {
            return;
        }
        long e10 = m10.i(this.currentAccount).e();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.g0.i3(new j9(e10, intValue, 3), 80L);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(getThemedColor(j6.f28849d6)) > 0.721f) {
            return true;
        }
        return false;
    }

    public final boolean j0(gj gjVar) {
        if (gjVar != null) {
            if (this.f52709y.contains(Integer.valueOf(gjVar.e1()))) {
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
            if (i11 < this.f38882a.getChildCount()) {
                View childAt = this.f38882a.getChildAt(i11);
                this.f38882a.getClass();
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
        this.f38882a.f39895g3.O(true);
        if (i10 >= 0) {
            this.f38882a.f39894f3.h1(i10, i7);
        } else {
            this.f38882a.f39894f3.h1(0, 0);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f52702e.a();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.f52702e.c();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(j6.x0(null, j6.f28849d6, false));
            }
            NumberTextView numberTextView = this.f52708x;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(j6.f29243y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f52705r;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.f52705r.getSearchField().setCursorColor(getThemedColor(j6.G6));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
