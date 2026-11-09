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
public final class ty0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public static boolean f50258s;
    public static HashSet f50259w;
    public m60 f50260a;
    public org.telegram.ui.Components.qj0 f50261b;
    public m60 f50262c;
    public org.telegram.ui.Components.jy d;
    public int f50263e;
    public ArrayList f50264f;
    public ArrayList h;
    public HashSet f50265n;
    public HashSet f50266r;

    public ty0() {
        super(null);
        this.f50263e = -1;
    }

    public static void Z(ty0 ty0Var, View view, int i7) {
        boolean z9;
        org.telegram.messenger.y00 y00Var;
        ArrayList arrayList;
        if (ty0Var.getParentActivity() != null && ty0Var.parentLayout != null && (view instanceof org.telegram.ui.Cells.s8)) {
            int i10 = 0;
            if (ty0Var.f50261b.getAdapter() == ty0Var.f50262c) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && (arrayList = ty0Var.f50264f) != null) {
                y00Var = (org.telegram.messenger.y00) arrayList.get(i7);
            } else {
                int i11 = ty0Var.f50263e;
                if (i11 >= 0 && i7 > i11) {
                    i7--;
                }
                if (i7 >= 0 && i7 < ty0Var.h.size()) {
                    y00Var = (org.telegram.messenger.y00) ty0Var.h.get(i7);
                } else {
                    y00Var = null;
                }
            }
            if (y00Var != null && y00Var.f26569a != null) {
                org.telegram.messenger.fd fdVar = org.telegram.messenger.id.E0().B;
                String str = y00Var.f26569a;
                if (ty0Var.f50266r.contains(str)) {
                    Collection.EL.removeIf(ty0Var.f50266r, new k60(str, 2));
                } else {
                    ty0Var.f50266r.add(str);
                }
                if (ty0Var.f50266r.size() == 1 && ty0Var.f50266r.contains(fdVar.f22400f)) {
                    f0(null, null);
                } else {
                    f0(ty0Var.f50266r, Boolean.TRUE);
                }
                if (z9) {
                    int i12 = 0;
                    while (i10 < ty0Var.f50264f.size()) {
                        if (TextUtils.equals(str, ((org.telegram.messenger.y00) ty0Var.f50264f.get(i10)).f26569a)) {
                            ty0Var.e0(i12);
                        }
                        i10++;
                        i12++;
                    }
                } else {
                    int i13 = 0;
                    while (i10 < ty0Var.h.size()) {
                        if (i13 == ty0Var.f50263e) {
                            i13++;
                        }
                        if (TextUtils.equals(str, ((org.telegram.messenger.y00) ty0Var.h.get(i10)).f26569a)) {
                            ty0Var.e0(i13);
                        }
                        i10++;
                        i13++;
                    }
                }
                org.telegram.messenger.qp.s1(ty0Var.currentAccount).f24896s7.g();
            }
        }
    }

    public static void a0(boolean z9) {
        boolean z10 = org.telegram.messenger.qp.e1().getBoolean("translate_button_restricted_languages_changed", false);
        if (org.telegram.messenger.qp.e1().getInt("translate_button_restricted_languages_version", 0) == 2 && (!z9 || z10)) {
            return;
        }
        di.e eVar = new di.e(23);
        final HashSet hashSet = new HashSet();
        Utilities.u(0, new org.telegram.messenger.c20() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.id.E0().B.f22400f;
                            if (org.telegram.ui.Components.l21.O0(str, null, null) != null) {
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
                            if (org.telegram.ui.Components.l21.O0(language, null, null) != null) {
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
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f25566b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.l21.O0(locale, null, null) != null) {
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
        }, new org.telegram.messenger.c20() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.id.E0().B.f22400f;
                            if (org.telegram.ui.Components.l21.O0(str, null, null) != null) {
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
                            if (org.telegram.ui.Components.l21.O0(language, null, null) != null) {
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
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f25566b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.l21.O0(locale, null, null) != null) {
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
        }, new org.telegram.messenger.c20() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.id.E0().B.f22400f;
                            if (org.telegram.ui.Components.l21.O0(str, null, null) != null) {
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
                            if (org.telegram.ui.Components.l21.O0(language, null, null) != null) {
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
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f25566b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.l21.O0(locale, null, null) != null) {
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
        }, new org.telegram.ui.Components.fx(23, eVar, hashSet));
    }

    public static void b0() {
        f50258s = false;
        org.telegram.messenger.qp.e1().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        a0(false);
    }

    public static HashSet d0() {
        if (!f50258s) {
            HashSet hashSet = null;
            Set<String> stringSet = org.telegram.messenger.qp.e1().getStringSet("translate_button_restricted_languages", null);
            if (stringSet != null) {
                hashSet = new HashSet(stringSet);
            }
            f50259w = hashSet;
            f50258s = true;
        }
        if (f50259w == null) {
            HashSet hashSet2 = new HashSet(h9.o.d(1));
            Collections.addAll(hashSet2, org.telegram.messenger.id.E0().B.f22400f);
            f50259w = hashSet2;
        }
        return f50259w;
    }

    public static void f0(HashSet hashSet, Boolean bool) {
        f50259w = hashSet;
        f50258s = true;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
    }

    public final void c0() {
        this.h = org.telegram.messenger.f10.n();
        String str = org.telegram.messenger.id.E0().B.f22400f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f50265n);
        org.telegram.messenger.y00 y00Var = null;
        int i7 = 0;
        while (i7 < this.h.size()) {
            org.telegram.messenger.y00 y00Var2 = (org.telegram.messenger.y00) this.h.get(i7);
            if (TextUtils.equals(y00Var2.f26569a, str)) {
                arrayList2.remove(y00Var2.f26569a);
                this.h.remove(i7);
                i7--;
                y00Var = y00Var2;
            } else if (this.f50265n.contains(y00Var2.f26569a)) {
                arrayList.add(y00Var2);
                arrayList2.remove(y00Var2.f26569a);
                this.h.remove(i7);
                i7--;
            }
            i7++;
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ?? obj = new Object();
            String str2 = (String) arrayList2.get(i10);
            obj.f26569a = str2;
            String upperCase = str2.toUpperCase();
            obj.f26570b = upperCase;
            obj.f26571c = upperCase;
            obj.d = obj.f26569a.toLowerCase();
            arrayList.add(obj);
        }
        this.f50263e = 0;
        this.h.addAll(0, arrayList);
        this.f50263e = arrayList.size() + this.f50263e;
        if (y00Var != null) {
            this.h.add(0, y00Var);
            this.f50263e++;
        }
        if (this.f50263e <= 0) {
            this.f50263e = -1;
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131751358, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new pt0(this, 6));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.p().b(0, 2131232486);
        b10.N();
        b10.B0 = new kg.v1(this, 20);
        b10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        this.f50260a = new m60(this, context, false, 1);
        this.f50262c = new m60(this, context, true, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy(context, null);
        this.d = jyVar;
        jyVar.setText(org.telegram.messenger.id.M0(2131748167, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f50261b = qj0Var;
        qj0Var.r1();
        this.f50261b.setEmptyView(this.d);
        this.f50261b.setSectionsDrawBackground(true);
        this.f50261b.setLayoutManager(new v4.b0(1, false));
        this.f50261b.setVerticalScrollBarEnabled(false);
        this.f50261b.setAdapter(this.f50260a);
        frameLayout.addView(this.f50261b, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ha.c(-1.0f, -1));
        this.f50261b.setOnItemClickListener(new zx0(this, 1));
        this.f50261b.setOnScrollListener(new g3(this, 29));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25115y4 && this.f50260a != null) {
            c0();
            this.f50260a.f();
        }
    }

    public final void e0(int i7) {
        int b10;
        v4.g0 adapter = this.f50261b.getAdapter();
        for (int i10 = 0; i10 < this.f50261b.getChildCount(); i10++) {
            v4.d1 T = this.f50261b.T(this.f50261b.getChildAt(i10));
            if (T != null && (b10 = T.b()) != -1 && b10 == i7) {
                adapter.t(T, i7);
                return;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f50261b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27848c7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f50261b, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Ai));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f50265n = d0();
        this.f50266r = d0();
        c0();
        org.telegram.messenger.id.E0().V0(this.currentAccount, true);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25115y4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25115y4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        m60 m60Var = this.f50260a;
        if (m60Var != null) {
            m60Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
