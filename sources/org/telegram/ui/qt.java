package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qt extends org.telegram.ui.ActionBar.r2 {
    public org.telegram.ui.Components.nm0 f42782a;
    public org.telegram.ui.Components.uz f42783b;
    public nt f42784c;
    public ot d;
    public boolean e;
    public boolean f42785f;
    public final boolean h;
    public boolean f42786n;
    public pt f42787r;
    public final ArrayList f42788s;

    public qt(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f42788s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.ga V(Context context) {
        float f7;
        org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
        float f10 = 12.0f;
        if (LocaleController.isRTL) {
            f7 = 16.0f;
        } else {
            f7 = 12.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        if (!LocaleController.isRTL) {
            f10 = 16.0f;
        }
        gaVar.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        ?? obj = new Object();
        obj.f40913a = new jt(0, gaVar);
        gaVar.addOnAttachStateChangeListener(obj);
        return gaVar;
    }

    public static SpannableStringBuilder W(lt ltVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ltVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ltVar.f41258a);
        return spannableStringBuilder;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        int i11 = 1;
        org.telegram.ui.ActionBar.f7.m(kVar, 1, i10, null);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.f23676u8, null);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 5, i10, null);
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 21));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 9);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.D(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23749y6, false), true);
        this.actionBar.D(org.telegram.ui.ActionBar.y6.x0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.f42785f = false;
        this.e = false;
        nt ntVar = new nt(this, context, this.f42788s, this.f42786n);
        this.f42784c = ntVar;
        this.d = new ot(this, context, ntVar.f41881s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.f42783b = uzVar;
        uzVar.c();
        this.f42783b.setShowAtCenter(true);
        this.f42783b.setText(LocaleController.getString(R.string.NoResult));
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.f42782a = nm0Var;
        nm0Var.setSectionsType(3);
        this.f42782a.setEmptyView(this.f42783b);
        this.f42782a.setVerticalScrollBarEnabled(false);
        this.f42782a.setFastScrollEnabled(0);
        this.f42782a.setFastScrollVisible(true);
        this.f42782a.setLayoutManager(new s4.c0(1, false));
        this.f42782a.setAdapter(this.f42784c);
        org.telegram.ui.Components.nm0 nm0Var2 = this.f42782a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        nm0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f42782a, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        frameLayout.addView(this.f42783b, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.f42782a.setOnItemClickListener(new h(this, 7));
        this.f42782a.setOnScrollListener(new i3(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42782a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23504l7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42782a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23522m7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42782a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23542n7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42783b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23339c7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        nt ntVar = this.f42784c;
        if (ntVar != null) {
            ntVar.X(false);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.D(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23749y6, false), true);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                int i10 = org.telegram.ui.ActionBar.y6.G6;
                kVar2.D(org.telegram.ui.ActionBar.y6.x0(null, i10, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            }
            org.telegram.ui.Components.nm0 nm0Var = this.f42782a;
            if (nm0Var != null) {
                nm0Var.A1();
                if (this.f42782a.getFastScroll() != null) {
                    this.f42782a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
