package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.FrameLayout;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.Utilities;
public final class sy0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public static boolean f52106s;
    public static HashSet f52107w;
    public k60 f52108a;
    public org.telegram.ui.Components.ek0 f52109b;
    public k60 f52110c;
    public org.telegram.ui.Components.vy d;
    public int f52111e;
    public ArrayList f52112f;
    public ArrayList h;
    public HashSet f52113n;
    public HashSet f52114r;

    public sy0() {
        super(null);
        this.f52111e = -1;
    }

    public static void Z(sy0 sy0Var, View view, int i7) {
        boolean z10;
        org.telegram.messenger.t00 t00Var;
        ArrayList arrayList;
        if (sy0Var.getParentActivity() != null && sy0Var.parentLayout != null && (view instanceof org.telegram.ui.Cells.t8)) {
            int i10 = 0;
            if (sy0Var.f52109b.getAdapter() == sy0Var.f52110c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (arrayList = sy0Var.f52112f) != null) {
                t00Var = (org.telegram.messenger.t00) arrayList.get(i7);
            } else {
                int i11 = sy0Var.f52111e;
                if (i11 >= 0 && i7 > i11) {
                    i7--;
                }
                if (i7 >= 0 && i7 < sy0Var.h.size()) {
                    t00Var = (org.telegram.messenger.t00) sy0Var.h.get(i7);
                } else {
                    t00Var = null;
                }
            }
            if (t00Var != null && t00Var.f26905a != null) {
                org.telegram.messenger.dd ddVar = org.telegram.messenger.hd.E0().B;
                String str = t00Var.f26905a;
                if (sy0Var.f52114r.contains(str)) {
                    Collection.EL.removeIf(sy0Var.f52114r, new i60(str, 2));
                } else {
                    sy0Var.f52114r.add(str);
                }
                if (sy0Var.f52114r.size() == 1 && sy0Var.f52114r.contains(ddVar.f23497f)) {
                    f0(null, null);
                } else {
                    f0(sy0Var.f52114r, Boolean.TRUE);
                }
                if (z10) {
                    int i12 = 0;
                    while (i10 < sy0Var.f52112f.size()) {
                        if (TextUtils.equals(str, ((org.telegram.messenger.t00) sy0Var.f52112f.get(i10)).f26905a)) {
                            sy0Var.e0(i12);
                        }
                        i10++;
                        i12++;
                    }
                } else {
                    int i13 = 0;
                    while (i10 < sy0Var.h.size()) {
                        if (i13 == sy0Var.f52111e) {
                            i13++;
                        }
                        if (TextUtils.equals(str, ((org.telegram.messenger.t00) sy0Var.h.get(i10)).f26905a)) {
                            sy0Var.e0(i13);
                        }
                        i10++;
                        i13++;
                    }
                }
                org.telegram.messenger.np.u1(sy0Var.currentAccount).f25950v7.g();
            }
        }
    }

    public static void a0(boolean z10) {
        boolean z11 = org.telegram.messenger.np.g1().getBoolean("translate_button_restricted_languages_changed", false);
        if (org.telegram.messenger.np.g1().getInt("translate_button_restricted_languages_version", 0) == 2 && (!z10 || z11)) {
            return;
        }
        fi.e eVar = new fi.e(24);
        final HashSet hashSet = new HashSet();
        Utilities.u(0, new org.telegram.messenger.y10() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.hd.E0().B.f23497f;
                            if (org.telegram.ui.Components.b31.P0(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.b31.P0(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        runnable2.run();
                        return;
                    default:
                        HashSet hashSet4 = hashSet;
                        Runnable runnable3 = (Runnable) obj;
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f26895b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.b31.P0(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new org.telegram.messenger.y10() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.hd.E0().B.f23497f;
                            if (org.telegram.ui.Components.b31.P0(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.b31.P0(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        runnable2.run();
                        return;
                    default:
                        HashSet hashSet4 = hashSet;
                        Runnable runnable3 = (Runnable) obj;
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f26895b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.b31.P0(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new org.telegram.messenger.y10() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.hd.E0().B.f23497f;
                            if (org.telegram.ui.Components.b31.P0(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.b31.P0(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        runnable2.run();
                        return;
                    default:
                        HashSet hashSet4 = hashSet;
                        Runnable runnable3 = (Runnable) obj;
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f26895b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.b31.P0(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new org.telegram.ui.Components.rh(27, eVar, hashSet));
    }

    public static void b0() {
        f52106s = false;
        org.telegram.messenger.np.g1().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        a0(false);
    }

    public static HashSet d0() {
        if (!f52106s) {
            HashSet hashSet = null;
            Set<String> stringSet = org.telegram.messenger.np.g1().getStringSet("translate_button_restricted_languages", null);
            if (stringSet != null) {
                hashSet = new HashSet(stringSet);
            }
            f52107w = hashSet;
            f52106s = true;
        }
        if (f52107w == null) {
            HashSet hashSet2 = new HashSet(h9.o.d(1));
            Collections.addAll(hashSet2, org.telegram.messenger.hd.E0().B.f23497f);
            f52107w = hashSet2;
        }
        return f52107w;
    }

    public static void f0(HashSet hashSet, Boolean bool) {
        f52107w = hashSet;
        f52106s = true;
        SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
        if (hashSet == null) {
            edit.remove("translate_button_restricted_languages");
        } else {
            edit.putStringSet("translate_button_restricted_languages", hashSet);
        }
        if (bool == null) {
            edit.remove("translate_button_restricted_languages_changed");
        } else if (bool.booleanValue()) {
            edit.putBoolean("translate_button_restricted_languages_changed", true);
        }
        edit.apply();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29348d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29439i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29645t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29684v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29627s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29347d6));
    }

    public final void c0() {
        this.h = org.telegram.messenger.a10.n();
        String str = org.telegram.messenger.hd.E0().B.f23497f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f52113n);
        org.telegram.messenger.t00 t00Var = null;
        int i7 = 0;
        while (i7 < this.h.size()) {
            org.telegram.messenger.t00 t00Var2 = (org.telegram.messenger.t00) this.h.get(i7);
            if (TextUtils.equals(t00Var2.f26905a, str)) {
                arrayList2.remove(t00Var2.f26905a);
                this.h.remove(i7);
                i7--;
                t00Var = t00Var2;
            } else if (this.f52113n.contains(t00Var2.f26905a)) {
                arrayList.add(t00Var2);
                arrayList2.remove(t00Var2.f26905a);
                this.h.remove(i7);
                i7--;
            }
            i7++;
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ?? obj = new Object();
            String str2 = (String) arrayList2.get(i10);
            obj.f26905a = str2;
            String upperCase = str2.toUpperCase();
            obj.f26906b = upperCase;
            obj.f26907c = upperCase;
            obj.d = obj.f26905a.toLowerCase();
            arrayList.add(obj);
        }
        this.f52111e = 0;
        this.h.addAll(0, arrayList);
        this.f52111e = arrayList.size() + this.f52111e;
        if (t00Var != null) {
            this.h.add(0, t00Var);
            this.f52111e++;
        }
        if (this.f52111e <= 0) {
            this.f52111e = -1;
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131751346, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new is0(this, 9));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, 2131232488);
        b10.O();
        b10.C0 = new bi.x1(this, 21);
        b10.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745640, null));
        this.f52108a = new k60(this, context, false, 1);
        this.f52110c = new k60(this, context, true, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vy vyVar = new org.telegram.ui.Components.vy(context, null);
        this.d = vyVar;
        vyVar.setText(org.telegram.messenger.hd.N0(2131747974, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f52109b = ek0Var;
        ek0Var.r1();
        this.f52109b.setEmptyView(this.d);
        this.f52109b.setSectionsDrawBackground(true);
        this.f52109b.setLayoutManager(new v4.b0(1, false));
        this.f52109b.setVerticalScrollBarEnabled(false);
        this.f52109b.setAdapter(this.f52108a);
        frameLayout.addView(this.f52109b, c8.na.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.na.c(-1.0f, -1));
        this.f52109b.setOnItemClickListener(new zx0(this, 1));
        this.f52109b.setOnScrollListener(new g3(this, 29));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.B4 && this.f52108a != null) {
            c0();
            this.f52108a.f();
        }
    }

    public final void e0(int i7) {
        int b10;
        v4.h0 adapter = this.f52109b.getAdapter();
        for (int i10 = 0; i10 < this.f52109b.getChildCount(); i10++) {
            v4.e1 T = this.f52109b.T(this.f52109b.getChildAt(i10));
            if (T != null && (b10 = T.b()) != -1 && b10 == i7) {
                adapter.t(T, i7);
                return;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f52109b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29330c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52109b, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Di));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f52113n = d0();
        this.f52114r = d0();
        c0();
        org.telegram.messenger.hd.E0().W0(this.currentAccount, true);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.B4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.B4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        k60 k60Var = this.f52108a;
        if (k60Var != null) {
            k60Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
