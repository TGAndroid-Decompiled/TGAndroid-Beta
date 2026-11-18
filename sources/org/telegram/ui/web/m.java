package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.ma;
import di.l9;
import hi.t2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.z41;
import org.telegram.ui.hs0;
public final class m extends b51 {
    public i f53235f;
    public final Runnable h;
    public final org.telegram.ui.q f53236n;
    public org.telegram.ui.ActionBar.r0 f53237r;
    public org.telegram.ui.ActionBar.r0 f53238s;
    public String f53239w;
    public NumberTextView f53240x;
    public final i f53234e = new i(null, this.currentAccount, new l(this, 0));
    public final HashSet f53241y = new HashSet();
    public final HashSet E = new HashSet();

    public m(org.telegram.ui.z zVar, org.telegram.ui.q qVar) {
        this.h = zVar;
        this.f53236n = qVar;
    }

    public static void d0(m mVar, HashSet hashSet) {
        mp.u1(mVar.currentAccount).Z(new ArrayList(hashSet), null, null, j10.i(mVar.currentAccount).e(), 0, true, 0);
        mVar.f53234e.b(new ArrayList(hashSet));
        i iVar = mVar.f53235f;
        if (iVar != null) {
            iVar.b(new ArrayList(hashSet));
        }
        mVar.f53241y.clear();
        mVar.actionBar.x();
        mVar.f33530a.f34607g3.O(true);
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
    public final void Z(ArrayList arrayList, z41 z41Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.E;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f53239w);
        i iVar = this.f53234e;
        if (isEmpty) {
            ArrayList arrayList2 = iVar.f53158a;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                fj fjVar = (fj) obj;
                String a10 = k.a(fjVar);
                if (!TextUtils.isEmpty(a10) && !a10.startsWith("#") && !a10.startsWith("$") && !a10.startsWith("@")) {
                    hashSet.add(a10);
                    int i10 = g.f53140b;
                    l41 K = l41.K(g.class);
                    K.A = 3;
                    K.f37023r = false;
                    K.I = fjVar;
                    K.L(j0(fjVar));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!iVar.f53162f) {
                arrayList.add(l41.q(arrayList.size(), 32));
                arrayList.add(l41.q(arrayList.size(), 32));
                arrayList.add(l41.q(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = iVar.f53158a;
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
                    z1 a12 = a2.b().a(K0);
                    TLRPC.Message message = fjVar2.f23968k;
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
                    if (k0(K0, this.f53239w) || k0(str, this.f53239w) || k0(str2, this.f53239w)) {
                        String str3 = this.f53239w;
                        int i12 = g.f53140b;
                        l41 K2 = l41.K(g.class);
                        K2.A = 3;
                        K2.f37023r = false;
                        K2.I = fjVar2;
                        K2.f37019n = str3;
                        K2.L(j0(fjVar2));
                        arrayList.add(K2);
                    }
                }
            }
            ArrayList arrayList4 = this.f53235f.f53158a;
            int size3 = arrayList4.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList4.get(i13);
                i13++;
                fj fjVar3 = (fj) obj3;
                String a13 = k.a(fjVar3);
                if (!TextUtils.isEmpty(a13) && !a13.startsWith("#") && !a13.startsWith("$") && !a13.startsWith("@")) {
                    hashSet.add(a13);
                    String str4 = this.f53239w;
                    int i14 = g.f53140b;
                    l41 K3 = l41.K(g.class);
                    K3.A = 3;
                    K3.f37023r = false;
                    K3.I = fjVar3;
                    K3.f37019n = str4;
                    K3.L(j0(fjVar3));
                    arrayList.add(K3);
                }
            }
            if (!this.f53235f.f53162f) {
                arrayList.add(l41.q(arrayList.size(), 32));
                arrayList.add(l41.q(arrayList.size(), 32));
                arrayList.add(l41.q(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(l41.C(charSequence));
        }
    }

    @Override
    public final CharSequence a0() {
        return gd.M0(2131742681, null);
    }

    @Override
    public final void b0(l41 l41Var, View view) {
        if (l41Var.H(g.class)) {
            if (this.actionBar.y()) {
                h0(l41Var, view);
                return;
            }
            finishFragment();
            this.f53236n.a(k.a((fj) l41Var.I));
        }
    }

    @Override
    public final boolean c0(l41 l41Var, View view) {
        if (l41Var.H(g.class)) {
            h0(l41Var, view);
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = n6.f29396d6;
        u6.h(i7, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(n6.x0(null, i7, false));
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = n6.G6;
        u6.l(kVar2, 5, i10, getResourceProvider());
        u6.l(this.actionBar, 3, n6.f29809z8, getResourceProvider());
        u6.l(this.actionBar, 1, i10, getResourceProvider());
        u6.b(this.actionBar, i10, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new hs0(this, 24));
        org.telegram.ui.ActionBar.z q10 = this.actionBar.q(null);
        NumberTextView numberTextView = new NumberTextView(q10.getContext());
        this.f53240x = numberTextView;
        numberTextView.setTextSize(18);
        this.f53240x.setTypeface(org.telegram.messenger.g0.o());
        this.f53240x.setTextColor(getThemedColor(n6.f29790y8));
        this.f53240x.setOnTouchListener(new gi.a(2));
        q10.addView(this.f53240x, ma.m(1.0f, 0, -1, 65, 0, 0));
        this.f53238s = q10.h(2131296498, 2131232226, org.telegram.messenger.g0.L(54.0f), gd.M0(2131754877, null));
        q10.h(2131296494, 2131232110, org.telegram.messenger.g0.L(54.0f), gd.M0(2131751587, null));
        org.telegram.ui.ActionBar.r0 c10 = this.actionBar.t().c(0, 2131232488, getResourceProvider());
        c10.O();
        c10.I = new t2(this);
        this.f53237r = c10;
        c10.setSearchFieldHint(gd.M0(2131745641, null));
        this.f53237r.setContentDescription(gd.M0(2131745641, null));
        EditTextBoldCursor searchField = this.f53237r.getSearchField();
        u6.U(searchField, i10, getResourceProvider());
        u6.D(searchField, n6.Jj, getResourceProvider());
        u6.v(searchField, i10, getResourceProvider());
        this.f33530a.j(new oa(this, 27));
        kv0 kv0Var = new kv0(context, null, 1, null);
        kv0Var.d.setText(gd.M0(2131742661, null));
        kv0Var.f36896e.setVisibility(8);
        kv0Var.e(false, false);
        kv0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(kv0Var, ma.c(-1.0f, -1));
        this.f33530a.setEmptyView(kv0Var);
        return this.fragmentView;
    }

    public final void h0(l41 l41Var, View view) {
        h hVar = (h) view;
        fj fjVar = (fj) l41Var.I;
        boolean j02 = j0(fjVar);
        HashSet hashSet = this.f53241y;
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
        this.f53240x.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.x();
        } else {
            this.actionBar.S(null, null);
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.f53238s;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        org.telegram.messenger.g0.T3(r0Var, z10, true);
    }

    public final void i0() {
        HashSet hashSet = this.f53241y;
        if (hashSet.size() != 1) {
            return;
        }
        long e10 = j10.i(this.currentAccount).e();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.g0.h3(new l9(e10, intValue, 3), 80L);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(getThemedColor(n6.f29396d6)) > 0.721f) {
            return true;
        }
        return false;
    }

    public final boolean j0(fj fjVar) {
        if (fjVar != null) {
            if (this.f53241y.contains(Integer.valueOf(fjVar.e1()))) {
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
            if (i11 < this.f33530a.getChildCount()) {
                View childAt = this.f33530a.getChildAt(i11);
                this.f33530a.getClass();
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
        this.f33530a.f34607g3.O(true);
        if (i10 >= 0) {
            this.f33530a.f34606f3.h1(i10, i7);
        } else {
            this.f33530a.f34606f3.h1(0, 0);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f53234e.a();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.f53234e.c();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(n6.x0(null, n6.f29396d6, false));
            }
            NumberTextView numberTextView = this.f53240x;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(n6.f29790y8));
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.f53237r;
            if (r0Var != null && r0Var.getSearchField() != null) {
                this.f53237r.getSearchField().setCursorColor(getThemedColor(n6.G6));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
