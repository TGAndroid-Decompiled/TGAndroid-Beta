package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.kj;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.s51;
import org.telegram.ui.eo0;
import org.telegram.ui.z01;
import w7.b6;
public final class m extends s51 {
    public h f42929f;
    public final Runnable h;
    public final org.telegram.ui.p f42930n;
    public org.telegram.ui.ActionBar.t0 f42931r;
    public org.telegram.ui.ActionBar.t0 f42932s;
    public String f42933w;
    public NumberTextView f42934x;
    public final h e = new h(null, this.currentAccount, new k(this, 0));
    public final HashSet f42935y = new HashSet();
    public final HashSet D = new HashSet();

    public m(org.telegram.ui.y yVar, org.telegram.ui.p pVar) {
        this.h = yVar;
        this.f42930n = pVar;
    }

    public static void d0(m mVar, HashSet hashSet) {
        wp.r1(mVar.currentAccount).Z(new ArrayList(hashSet), null, null, e20.i(mVar.currentAccount).e(), 0, true, 0);
        mVar.e.b(new ArrayList(hashSet));
        h hVar = mVar.f42929f;
        if (hVar != null) {
            hVar.b(new ArrayList(hashSet));
        }
        mVar.f42935y.clear();
        mVar.actionBar.t();
        mVar.f30217a.f31183f3.O(true);
    }

    public static boolean k0(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2) && !sc.e.y(" ", lowerCase2, lowerCase) && !sc.e.y(".", lowerCase2, lowerCase)) {
            String N3 = org.telegram.messenger.i0.N3(lowerCase);
            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
            if (!N3.startsWith(N32) && !N3.contains(" ".concat(N32)) && !N3.contains(".".concat(N32))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void Z(ArrayList arrayList, q51 q51Var) {
        CharSequence charSequence;
        TLRPC.WebPage webPage;
        String str;
        String str2;
        TLRPC.MessageMedia messageMedia;
        HashSet hashSet = this.D;
        hashSet.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f42933w);
        h hVar = this.e;
        if (isEmpty) {
            ArrayList arrayList2 = hVar.f42850a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                kj kjVar = (kj) obj;
                String a2 = j.a(kjVar);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("#") && !a2.startsWith("$") && !a2.startsWith("@")) {
                    hashSet.add(a2);
                    int i11 = f.f42829b;
                    b51 K = b51.K(f.class);
                    K.f24656z = 3;
                    K.f24648q = false;
                    K.H = kjVar;
                    K.L(j0(kjVar));
                    arrayList.add(K);
                }
            }
            charSequence = null;
            if (!hVar.f42853f) {
                arrayList.add(b51.q(arrayList.size(), 32));
                arrayList.add(b51.q(arrayList.size(), 32));
                arrayList.add(b51.q(arrayList.size(), 32));
            }
        } else {
            charSequence = null;
            ArrayList arrayList3 = hVar.f42850a;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                kj kjVar2 = (kj) obj2;
                String a10 = j.a(kjVar2);
                if (!TextUtils.isEmpty(a10) && !a10.startsWith("#") && !a10.startsWith("$") && !a10.startsWith("@")) {
                    hashSet.add(a10);
                    String K0 = org.telegram.messenger.i0.K0(a10, true);
                    c2 a11 = d2.b().a(K0);
                    TLRPC.Message message = kjVar2.f16690k;
                    if (message != null && (messageMedia = message.media) != null) {
                        webPage = messageMedia.webpage;
                    } else {
                        webPage = null;
                    }
                    if (webPage != null && !TextUtils.isEmpty(webPage.site_name)) {
                        str = webPage.site_name;
                    } else if (a11 != null && !TextUtils.isEmpty(a11.d)) {
                        str = a11.d;
                    } else {
                        str = null;
                    }
                    if (webPage != null && !TextUtils.isEmpty(webPage.title)) {
                        str2 = webPage.title;
                    } else {
                        str2 = null;
                    }
                    if (k0(K0, this.f42933w) || k0(str, this.f42933w) || k0(str2, this.f42933w)) {
                        String str3 = this.f42933w;
                        int i13 = f.f42829b;
                        b51 K2 = b51.K(f.class);
                        K2.f24656z = 3;
                        K2.f24648q = false;
                        K2.H = kjVar2;
                        K2.f24644m = str3;
                        K2.L(j0(kjVar2));
                        arrayList.add(K2);
                    }
                }
            }
            ArrayList arrayList4 = this.f42929f.f42850a;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList4.get(i14);
                i14++;
                kj kjVar3 = (kj) obj3;
                String a12 = j.a(kjVar3);
                if (!TextUtils.isEmpty(a12) && !a12.startsWith("#") && !a12.startsWith("$") && !a12.startsWith("@")) {
                    hashSet.add(a12);
                    String str4 = this.f42933w;
                    int i15 = f.f42829b;
                    b51 K3 = b51.K(f.class);
                    K3.f24656z = 3;
                    K3.f24648q = false;
                    K3.H = kjVar3;
                    K3.f24644m = str4;
                    K3.L(j0(kjVar3));
                    arrayList.add(K3);
                }
            }
            if (!this.f42929f.f42853f) {
                arrayList.add(b51.q(arrayList.size(), 32));
                arrayList.add(b51.q(arrayList.size(), 32));
                arrayList.add(b51.q(arrayList.size(), 32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(b51.C(charSequence));
        }
    }

    @Override
    public final CharSequence a0() {
        return dd.L0(2131742965, null);
    }

    @Override
    public final void b0(b51 b51Var, View view) {
        if (b51Var.H(f.class)) {
            if (this.actionBar.u()) {
                h0(b51Var, view);
                return;
            }
            finishFragment();
            this.f42930n.a(j.a((kj) b51Var.H));
        }
    }

    @Override
    public final boolean c0(b51 b51Var, View view) {
        if (b51Var.H(f.class)) {
            h0(b51Var, view);
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = t6.f20930d6;
        a7.i(i10, lVar, getResourceProvider());
        this.actionBar.setActionModeColor(t6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(2131231241);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = t6.G6;
        a7.m(lVar2, 5, i11, getResourceProvider());
        a7.m(this.actionBar, 3, t6.f21333z8, getResourceProvider());
        a7.m(this.actionBar, 1, i11, getResourceProvider());
        a7.b(this.actionBar, i11, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new z01(this, 12));
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m(null);
        NumberTextView numberTextView = new NumberTextView(m10.getContext());
        this.f42934x = numberTextView;
        numberTextView.setTextSize(18);
        this.f42934x.setTypeface(org.telegram.messenger.i0.o());
        this.f42934x.setTextColor(getThemedColor(t6.f21314y8));
        this.f42934x.setOnTouchListener(new n2(1));
        m10.addView(this.f42934x, b6.m(1.0f, 0, -1, 65, 0, 0));
        this.f42932s = m10.h(2131296498, 2131232223, dd.L0(2131754877, null), org.telegram.messenger.i0.L(54.0f));
        m10.h(2131296494, 2131232107, dd.L0(2131751599, null), org.telegram.messenger.i0.L(54.0f));
        org.telegram.ui.ActionBar.t0 c10 = this.actionBar.p().c(0, 2131232485, getResourceProvider());
        c10.N();
        c10.H = new eo0(this);
        this.f42931r = c10;
        c10.setSearchFieldHint(dd.L0(2131745853, null));
        this.f42931r.setContentDescription(dd.L0(2131745853, null));
        EditTextBoldCursor searchField = this.f42931r.getSearchField();
        a7.V(searchField, i11, getResourceProvider());
        a7.E(searchField, t6.Gj, getResourceProvider());
        a7.w(searchField, i11, getResourceProvider());
        this.f30217a.j(new cu0(this, 9));
        ew0 ew0Var = new ew0(context, null, 1, null);
        ew0Var.d.setText(dd.L0(2131742945, null));
        ew0Var.e.setVisibility(8);
        ew0Var.e(false, false);
        ew0Var.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(ew0Var, b6.c(-1.0f, -1));
        this.f30217a.setEmptyView(ew0Var);
        return this.fragmentView;
    }

    public final void h0(b51 b51Var, View view) {
        g gVar = (g) view;
        kj kjVar = (kj) b51Var.H;
        boolean j02 = j0(kjVar);
        HashSet hashSet = this.f42935y;
        boolean z10 = false;
        if (j02) {
            if (kjVar != null) {
                hashSet.remove(Integer.valueOf(kjVar.f1()));
            }
            gVar.setChecked(false);
        } else {
            if (kjVar != null) {
                hashSet.add(Integer.valueOf(kjVar.f1()));
            }
            gVar.setChecked(true);
        }
        this.f42934x.a(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.t();
        } else {
            this.actionBar.O(null, null);
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.f42932s;
        if (hashSet.size() == 1) {
            z10 = true;
        }
        org.telegram.messenger.i0.U3(t0Var, z10, true);
    }

    public final void i0() {
        HashSet hashSet = this.f42935y;
        if (hashSet.size() != 1) {
            return;
        }
        long e = e20.i(this.currentAccount).e();
        int intValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.i0.h3(new l(e, intValue, 0), 80L);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.i0.B(getThemedColor(t6.f20930d6)) > 0.721f) {
            return true;
        }
        return false;
    }

    public final boolean j0(kj kjVar) {
        if (kjVar != null) {
            if (this.f42935y.contains(Integer.valueOf(kjVar.f1()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void l0() {
        int i10;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 < this.f30217a.getChildCount()) {
                View childAt = this.f30217a.getChildAt(i12);
                this.f30217a.getClass();
                int R = RecyclerView.R(childAt);
                if (R < 0) {
                    i12++;
                    i11 = R;
                } else {
                    i10 = childAt.getTop();
                    i11 = R;
                    break;
                }
            } else {
                i10 = 0;
                break;
            }
        }
        this.f30217a.f31183f3.O(true);
        if (i11 >= 0) {
            this.f30217a.f31182e3.h1(i11, i10);
        } else {
            this.f30217a.f31182e3.h1(0, 0);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.e.a();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.e.c();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.setActionModeColor(t6.x0(null, t6.f20930d6, false));
            }
            NumberTextView numberTextView = this.f42934x;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(t6.f21314y8));
            }
            org.telegram.ui.ActionBar.t0 t0Var = this.f42931r;
            if (t0Var != null && t0Var.getSearchField() != null) {
                this.f42931r.getSearchField().setCursorColor(getThemedColor(t6.G6));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
