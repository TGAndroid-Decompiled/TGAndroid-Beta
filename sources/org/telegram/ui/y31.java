package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class y31 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public static boolean f43043s;
    public static HashSet v;
    public x31 f43044a;
    public org.telegram.ui.Components.zl0 f43045b;
    public x31 f43046c;
    public org.telegram.ui.Components.pz d;
    public int f43047e;
    public ArrayList f43048f;
    public ArrayList h;
    public HashSet f43049n;
    public HashSet f43050r;

    public y31() {
        super(null);
        this.f43047e = -1;
    }

    public static void S(y31 y31Var, View view, int i10) {
        boolean z10;
        TranslateController.Language language;
        ArrayList arrayList;
        if (y31Var.getParentActivity() != null && y31Var.parentLayout != null && (view instanceof org.telegram.ui.Cells.x8)) {
            int i11 = 0;
            if (y31Var.f43045b.getAdapter() == y31Var.f43046c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (arrayList = y31Var.f43048f) != null) {
                language = (TranslateController.Language) arrayList.get(i10);
            } else {
                int i12 = y31Var.f43047e;
                if (i12 >= 0 && i10 > i12) {
                    i10--;
                }
                if (i10 >= 0 && i10 < y31Var.h.size()) {
                    language = (TranslateController.Language) y31Var.h.get(i10);
                } else {
                    language = null;
                }
            }
            if (language != null && language.code != null) {
                LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                String str = language.code;
                if (y31Var.f43050r.contains(str)) {
                    Collection.EL.removeIf(y31Var.f43050r, new q80(str, 2));
                } else {
                    y31Var.f43050r.add(str);
                }
                if (y31Var.f43050r.size() == 1 && y31Var.f43050r.contains(currentLocaleInfo.pluralLangCode)) {
                    Z(null, null);
                } else {
                    Z(y31Var.f43050r, Boolean.TRUE);
                }
                if (z10) {
                    int i13 = 0;
                    while (i11 < y31Var.f43048f.size()) {
                        if (TextUtils.equals(str, ((TranslateController.Language) y31Var.f43048f.get(i11)).code)) {
                            y31Var.Y(i13);
                        }
                        i11++;
                        i13++;
                    }
                } else {
                    int i14 = 0;
                    while (i11 < y31Var.h.size()) {
                        if (i14 == y31Var.f43047e) {
                            i14++;
                        }
                        if (TextUtils.equals(str, ((TranslateController.Language) y31Var.h.get(i11)).code)) {
                            y31Var.Y(i14);
                        }
                        i11++;
                        i14++;
                    }
                }
                MessagesController.getInstance(y31Var.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
            }
        }
    }

    public static void T(boolean z10) {
        boolean z11 = MessagesController.getGlobalMainSettings().getBoolean("translate_button_restricted_languages_changed", false);
        if (MessagesController.getGlobalMainSettings().getInt("translate_button_restricted_languages_version", 0) == 2 && (!z10 || z11)) {
            return;
        }
        ai.i iVar = new ai.i(20);
        final HashSet hashSet = new HashSet();
        Utilities.doCallbacks(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                            if (org.telegram.ui.Components.t41.C(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.t41.C(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        runnable2.run();
                        return;
                    default:
                        HashSet hashSet4 = hashSet;
                        Runnable runnable3 = (Runnable) obj;
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.t41.C(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                            if (org.telegram.ui.Components.t41.C(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.t41.C(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        runnable2.run();
                        return;
                    default:
                        HashSet hashSet4 = hashSet;
                        Runnable runnable3 = (Runnable) obj;
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.t41.C(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                            if (org.telegram.ui.Components.t41.C(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.t41.C(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        runnable2.run();
                        return;
                    default:
                        HashSet hashSet4 = hashSet;
                        Runnable runnable3 = (Runnable) obj;
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.t41.C(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new ft(15, iVar, hashSet));
    }

    public static void U() {
        f43043s = false;
        MessagesController.getGlobalMainSettings().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        T(false);
    }

    public static HashSet X() {
        if (!f43043s) {
            HashSet hashSet = null;
            Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("translate_button_restricted_languages", null);
            if (stringSet != null) {
                hashSet = new HashSet(stringSet);
            }
            v = hashSet;
            f43043s = true;
        }
        if (v == null) {
            HashSet hashSet2 = new HashSet(e9.q.c(1));
            Collections.addAll(hashSet2, LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode);
            v = hashSet2;
        }
        return v;
    }

    public static void Z(HashSet hashSet, Boolean bool) {
        v = hashSet;
        f43043s = true;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
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

    public final void W() {
        this.h = TranslateController.getLanguages();
        String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f43049n);
        TranslateController.Language language = null;
        int i10 = 0;
        while (i10 < this.h.size()) {
            TranslateController.Language language2 = (TranslateController.Language) this.h.get(i10);
            if (TextUtils.equals(language2.code, str)) {
                arrayList2.remove(language2.code);
                this.h.remove(i10);
                i10--;
                language = language2;
            } else if (this.f43049n.contains(language2.code)) {
                arrayList.add(language2);
                arrayList2.remove(language2.code);
                this.h.remove(i10);
                i10--;
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            TranslateController.Language language3 = new TranslateController.Language();
            String str2 = (String) arrayList2.get(i11);
            language3.code = str2;
            String upperCase = str2.toUpperCase();
            language3.displayName = upperCase;
            language3.ownDisplayName = upperCase;
            language3.f17282q = language3.code.toLowerCase();
            arrayList.add(language3);
        }
        this.f43047e = 0;
        this.h.addAll(0, arrayList);
        this.f43047e = arrayList.size() + this.f43047e;
        if (language != null) {
            this.h.add(0, language);
            this.f43047e++;
        }
        if (this.f43047e <= 0) {
            this.f43047e = -1;
        }
    }

    public final void Y(int i10) {
        int b10;
        s4.h0 adapter = this.f43045b.getAdapter();
        for (int i11 = 0; i11 < this.f43045b.getChildCount(); i11++) {
            s4.c1 T = this.f43045b.T(this.f43045b.getChildAt(i11));
            if (T != null && (b10 = T.b()) != -1 && b10 == i10) {
                adapter.v(T, i10);
                return;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.DoNotTranslate));
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 26));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 17);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f43044a = new x31(this, context, false);
        this.f43046c = new x31(this, context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        this.d = pzVar;
        pzVar.setText(LocaleController.getString(R.string.NoResult));
        this.d.c();
        this.d.setShowAtCenter(true);
        frameLayout.addView(this.d, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f43045b = zl0Var;
        zl0Var.s1();
        this.f43045b.setEmptyView(this.d);
        this.f43045b.setSectionsDrawBackground(true);
        this.f43045b.setLayoutManager(new s4.c0(1, false));
        this.f43045b.setVerticalScrollBarEnabled(false);
        this.f43045b.setAdapter(this.f43044a);
        frameLayout.addView(this.f43045b, w7.z5.c(-1.0f, -1));
        this.f43045b.setOnItemClickListener(new t21(this, 2));
        this.f43045b.setOnScrollListener(new i3(this, 28));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.suggestedLangpack && this.f43044a != null) {
            W();
            this.f43044a.l();
        }
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f43045b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43045b, 16, new Class[]{org.telegram.ui.Cells.q4.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20822d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43045b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21104s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21159v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21123t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.i6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43045b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20913i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20805c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43045b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20945k0, null, null, org.telegram.ui.ActionBar.i6.f20823d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43045b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43045b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43045b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Mh));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f43049n = X();
        this.f43050r = X();
        W();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
    }

    @Override
    public final void onResume() {
        super.onResume();
        x31 x31Var = this.f43044a;
        if (x31Var != null) {
            x31Var.l();
        }
    }
}
