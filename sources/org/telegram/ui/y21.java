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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class y21 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public static boolean f45937s;
    public static HashSet v;
    public x21 f45938a;
    public org.telegram.ui.Components.mm0 f45939b;
    public x21 f45940c;
    public org.telegram.ui.Components.uz d;
    public int e;
    public ArrayList f45941f;
    public ArrayList h;
    public HashSet f45942n;
    public HashSet f45943r;

    public y21() {
        super(null);
        this.e = -1;
    }

    public static void V(y21 y21Var, View view, int i10) {
        boolean z10;
        TranslateController.Language language;
        ArrayList arrayList;
        if (y21Var.getParentActivity() != null && y21Var.parentLayout != null && (view instanceof org.telegram.ui.Cells.b9)) {
            int i11 = 0;
            if (y21Var.f45939b.getAdapter() == y21Var.f45940c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (arrayList = y21Var.f45941f) != null) {
                language = (TranslateController.Language) arrayList.get(i10);
            } else {
                int i12 = y21Var.e;
                if (i12 >= 0 && i10 > i12) {
                    i10--;
                }
                if (i10 >= 0 && i10 < y21Var.h.size()) {
                    language = (TranslateController.Language) y21Var.h.get(i10);
                } else {
                    language = null;
                }
            }
            if (language != null && language.code != null) {
                LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                String str = language.code;
                if (y21Var.f45943r.contains(str)) {
                    Collection.EL.removeIf(y21Var.f45943r, new e80(str, 2));
                } else {
                    y21Var.f45943r.add(str);
                }
                if (y21Var.f45943r.size() == 1 && y21Var.f45943r.contains(currentLocaleInfo.pluralLangCode)) {
                    b0(null, null);
                } else {
                    b0(y21Var.f45943r, Boolean.TRUE);
                }
                if (z10) {
                    int i13 = 0;
                    while (i11 < y21Var.f45941f.size()) {
                        if (TextUtils.equals(str, ((TranslateController.Language) y21Var.f45941f.get(i11)).code)) {
                            y21Var.a0(i13);
                        }
                        i11++;
                        i13++;
                    }
                } else {
                    int i14 = 0;
                    while (i11 < y21Var.h.size()) {
                        if (i14 == y21Var.e) {
                            i14++;
                        }
                        if (TextUtils.equals(str, ((TranslateController.Language) y21Var.h.get(i11)).code)) {
                            y21Var.a0(i14);
                        }
                        i11++;
                        i14++;
                    }
                }
                MessagesController.getInstance(y21Var.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
            }
        }
    }

    public static void W(boolean z10) {
        boolean z11 = MessagesController.getGlobalMainSettings().getBoolean("translate_button_restricted_languages_changed", false);
        if (MessagesController.getGlobalMainSettings().getInt("translate_button_restricted_languages_version", 0) == 2 && (!z10 || z11)) {
            return;
        }
        di.e eVar = new di.e(20);
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
                            if (org.telegram.ui.Components.f51.N(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.f51.N(language, null, null) != null) {
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
                                        if (org.telegram.ui.Components.f51.N(locale, null, null) != null) {
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
                            if (org.telegram.ui.Components.f51.N(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.f51.N(language, null, null) != null) {
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
                                        if (org.telegram.ui.Components.f51.N(locale, null, null) != null) {
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
                            if (org.telegram.ui.Components.f51.N(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.f51.N(language, null, null) != null) {
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
                                        if (org.telegram.ui.Components.f51.N(locale, null, null) != null) {
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
        }, new org.telegram.ui.Components.oy(23, eVar, hashSet));
    }

    public static void X() {
        f45937s = false;
        MessagesController.getGlobalMainSettings().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        W(false);
    }

    public static HashSet Z() {
        if (!f45937s) {
            HashSet hashSet = null;
            Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("translate_button_restricted_languages", null);
            if (stringSet != null) {
                hashSet = new HashSet(stringSet);
            }
            v = hashSet;
            f45937s = true;
        }
        if (v == null) {
            HashSet hashSet2 = new HashSet(f9.o.c(1));
            Collections.addAll(hashSet2, LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode);
            v = hashSet2;
        }
        return v;
    }

    public static void b0(HashSet hashSet, Boolean bool) {
        v = hashSet;
        f45937s = true;
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

    public final void Y() {
        this.h = TranslateController.getLanguages();
        String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f45942n);
        TranslateController.Language language = null;
        int i10 = 0;
        while (i10 < this.h.size()) {
            TranslateController.Language language2 = (TranslateController.Language) this.h.get(i10);
            if (TextUtils.equals(language2.code, str)) {
                arrayList2.remove(language2.code);
                this.h.remove(i10);
                i10--;
                language = language2;
            } else if (this.f45942n.contains(language2.code)) {
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
            language3.f19570q = language3.code.toLowerCase();
            arrayList.add(language3);
        }
        this.e = 0;
        this.h.addAll(0, arrayList);
        this.e = arrayList.size() + this.e;
        if (language != null) {
            this.h.add(0, language);
            this.e++;
        }
        if (this.e <= 0) {
            this.e = -1;
        }
    }

    public final void a0(int i10) {
        int b10;
        s4.h0 adapter = this.f45939b.getAdapter();
        for (int i11 = 0; i11 < this.f45939b.getChildCount(); i11++) {
            s4.e1 T = this.f45939b.T(this.f45939b.getChildAt(i11));
            if (T != null && (b10 = T.b()) != -1 && b10 == i10) {
                adapter.v(T, i10);
                return;
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23356d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.DoNotTranslate));
        this.simpleActionBar.setActionBarMenuOnItemClick(new p11(this, 2));
        org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.f23291z0 = new jg.e2(this, 18);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f45938a = new x21(this, context, false);
        this.f45940c = new x21(this, context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.d = uzVar;
        uzVar.setText(LocaleController.getString(R.string.NoResult));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f45939b = mm0Var;
        mm0Var.u1();
        this.f45939b.setEmptyView(this.d);
        this.f45939b.setSectionsDrawBackground(true);
        this.f45939b.setLayoutManager(new s4.c0(1, false));
        this.f45939b.setVerticalScrollBarEnabled(false);
        this.f45939b.setAdapter(this.f45938a);
        frameLayout.addView(this.f45939b, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        frameLayout.addView(this.d, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.f45939b.setOnItemClickListener(new m11(this, 2));
        this.f45939b.setOnScrollListener(new i3(this, 28));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.suggestedLangpack && this.f45938a != null) {
            Y();
            this.f45938a.l();
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f45939b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23338c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45939b, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Mh));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f45942n = Z();
        this.f45943r = Z();
        Y();
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
        x21 x21Var = this.f45938a;
        if (x21Var != null) {
            x21Var.l();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
