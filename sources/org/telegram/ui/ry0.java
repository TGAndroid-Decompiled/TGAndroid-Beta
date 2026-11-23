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
public final class ry0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public static boolean f51915s;
    public static HashSet f51916w;
    public k60 f51917a;
    public org.telegram.ui.Components.ek0 f51918b;
    public k60 f51919c;
    public org.telegram.ui.Components.sy d;
    public int f51920e;
    public ArrayList f51921f;
    public ArrayList h;
    public HashSet f51922n;
    public HashSet f51923r;

    public ry0() {
        super(null);
        this.f51920e = -1;
    }

    public static void Z(ry0 ry0Var, View view, int i7) {
        boolean z10;
        org.telegram.messenger.r00 r00Var;
        ArrayList arrayList;
        if (ry0Var.getParentActivity() != null && ry0Var.parentLayout != null && (view instanceof org.telegram.ui.Cells.s8)) {
            int i10 = 0;
            if (ry0Var.f51918b.getAdapter() == ry0Var.f51919c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (arrayList = ry0Var.f51921f) != null) {
                r00Var = (org.telegram.messenger.r00) arrayList.get(i7);
            } else {
                int i11 = ry0Var.f51920e;
                if (i11 >= 0 && i7 > i11) {
                    i7--;
                }
                if (i7 >= 0 && i7 < ry0Var.h.size()) {
                    r00Var = (org.telegram.messenger.r00) ry0Var.h.get(i7);
                } else {
                    r00Var = null;
                }
            }
            if (r00Var != null && r00Var.f26618a != null) {
                org.telegram.messenger.cd cdVar = org.telegram.messenger.gd.E0().B;
                String str = r00Var.f26618a;
                if (ry0Var.f51923r.contains(str)) {
                    Collection.EL.removeIf(ry0Var.f51923r, new i60(str, 2));
                } else {
                    ry0Var.f51923r.add(str);
                }
                if (ry0Var.f51923r.size() == 1 && ry0Var.f51923r.contains(cdVar.f23447f)) {
                    f0(null, null);
                } else {
                    f0(ry0Var.f51923r, Boolean.TRUE);
                }
                if (z10) {
                    int i12 = 0;
                    while (i10 < ry0Var.f51921f.size()) {
                        if (TextUtils.equals(str, ((org.telegram.messenger.r00) ry0Var.f51921f.get(i10)).f26618a)) {
                            ry0Var.e0(i12);
                        }
                        i10++;
                        i12++;
                    }
                } else {
                    int i13 = 0;
                    while (i10 < ry0Var.h.size()) {
                        if (i13 == ry0Var.f51920e) {
                            i13++;
                        }
                        if (TextUtils.equals(str, ((org.telegram.messenger.r00) ry0Var.h.get(i10)).f26618a)) {
                            ry0Var.e0(i13);
                        }
                        i10++;
                        i13++;
                    }
                }
                org.telegram.messenger.mp.u1(ry0Var.currentAccount).f25882v7.g();
            }
        }
    }

    public static void a0(boolean z10) {
        boolean z11 = org.telegram.messenger.mp.g1().getBoolean("translate_button_restricted_languages_changed", false);
        if (org.telegram.messenger.mp.g1().getInt("translate_button_restricted_languages_version", 0) == 2 && (!z10 || z11)) {
            return;
        }
        fi.e eVar = new fi.e(24);
        final HashSet hashSet = new HashSet();
        Utilities.u(0, new org.telegram.messenger.w10() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.gd.E0().B.f23447f;
                            if (org.telegram.ui.Components.a31.P0(str, null, null) != null) {
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
                            if (org.telegram.ui.Components.a31.P0(language, null, null) != null) {
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
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f27013b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.a31.P0(locale, null, null) != null) {
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
        }, new org.telegram.messenger.w10() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.gd.E0().B.f23447f;
                            if (org.telegram.ui.Components.a31.P0(str, null, null) != null) {
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
                            if (org.telegram.ui.Components.a31.P0(language, null, null) != null) {
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
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f27013b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.a31.P0(locale, null, null) != null) {
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
        }, new org.telegram.messenger.w10() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.gd.E0().B.f23447f;
                            if (org.telegram.ui.Components.a31.P0(str, null, null) != null) {
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
                            if (org.telegram.ui.Components.a31.P0(language, null, null) != null) {
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
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f27013b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.a31.P0(locale, null, null) != null) {
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
        }, new org.telegram.ui.Components.ph(28, eVar, hashSet));
    }

    public static void b0() {
        f51915s = false;
        org.telegram.messenger.mp.g1().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        a0(false);
    }

    public static HashSet d0() {
        if (!f51915s) {
            HashSet hashSet = null;
            Set<String> stringSet = org.telegram.messenger.mp.g1().getStringSet("translate_button_restricted_languages", null);
            if (stringSet != null) {
                hashSet = new HashSet(stringSet);
            }
            f51916w = hashSet;
            f51915s = true;
        }
        if (f51916w == null) {
            HashSet hashSet2 = new HashSet(h9.o.d(1));
            Collections.addAll(hashSet2, org.telegram.messenger.gd.E0().B.f23447f);
            f51916w = hashSet2;
        }
        return f51916w;
    }

    public static void f0(HashSet hashSet, Boolean bool) {
        f51916w = hashSet;
        f51915s = true;
        SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29451d6));
    }

    public final void c0() {
        this.h = org.telegram.messenger.y00.n();
        String str = org.telegram.messenger.gd.E0().B.f23447f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f51922n);
        org.telegram.messenger.r00 r00Var = null;
        int i7 = 0;
        while (i7 < this.h.size()) {
            org.telegram.messenger.r00 r00Var2 = (org.telegram.messenger.r00) this.h.get(i7);
            if (TextUtils.equals(r00Var2.f26618a, str)) {
                arrayList2.remove(r00Var2.f26618a);
                this.h.remove(i7);
                i7--;
                r00Var = r00Var2;
            } else if (this.f51922n.contains(r00Var2.f26618a)) {
                arrayList.add(r00Var2);
                arrayList2.remove(r00Var2.f26618a);
                this.h.remove(i7);
                i7--;
            }
            i7++;
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ?? obj = new Object();
            String str2 = (String) arrayList2.get(i10);
            obj.f26618a = str2;
            String upperCase = str2.toUpperCase();
            obj.f26619b = upperCase;
            obj.f26620c = upperCase;
            obj.d = obj.f26618a.toLowerCase();
            arrayList.add(obj);
        }
        this.f51920e = 0;
        this.h.addAll(0, arrayList);
        this.f51920e = arrayList.size() + this.f51920e;
        if (r00Var != null) {
            this.h.add(0, r00Var);
            this.f51920e++;
        }
        if (this.f51920e <= 0) {
            this.f51920e = -1;
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131751346, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new gs0(this, 9));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, 2131232491);
        b10.O();
        b10.C0 = new bi.x1(this, 21);
        b10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        this.f51917a = new k60(this, context, false, 1);
        this.f51919c = new k60(this, context, true, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.sy syVar = new org.telegram.ui.Components.sy(context, null);
        this.d = syVar;
        syVar.setText(org.telegram.messenger.gd.N0(2131747974, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f51918b = ek0Var;
        ek0Var.r1();
        this.f51918b.setEmptyView(this.d);
        this.f51918b.setSectionsDrawBackground(true);
        this.f51918b.setLayoutManager(new v4.c0(1, false));
        this.f51918b.setVerticalScrollBarEnabled(false);
        this.f51918b.setAdapter(this.f51917a);
        frameLayout.addView(this.f51918b, c8.na.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.na.c(-1.0f, -1));
        this.f51918b.setOnItemClickListener(new xx0(this, 1));
        this.f51918b.setOnScrollListener(new g3(this, 29));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.B4 && this.f51917a != null) {
            c0();
            this.f51917a.f();
        }
    }

    public final void e0(int i7) {
        int b10;
        v4.i0 adapter = this.f51918b.getAdapter();
        for (int i10 = 0; i10 < this.f51918b.getChildCount(); i10++) {
            v4.f1 T = this.f51918b.T(this.f51918b.getChildAt(i10));
            if (T != null && (b10 = T.b()) != -1 && b10 == i7) {
                adapter.t(T, i7);
                return;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f51918b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29434c7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f51918b, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Di));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f51922n = d0();
        this.f51923r = d0();
        c0();
        org.telegram.messenger.gd.E0().W0(this.currentAccount, true);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.B4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.B4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        k60 k60Var = this.f51917a;
        if (k60Var != null) {
            k60Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
