package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wt extends org.telegram.ui.ActionBar.m2 {
    public org.telegram.ui.Components.xl0 f39752a;
    public org.telegram.ui.Components.oz f39753b;
    public st f39754c;
    public ut d;
    public boolean e;
    public boolean f39755f;
    public final boolean h;
    public boolean f39756n;
    public vt f39757r;
    public final ArrayList f39758s;

    public wt(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f39758s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.ea U(Context context) {
        float f7;
        org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
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
        eaVar.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        ?? obj = new Object();
        obj.f36677a = new ot(0, eaVar);
        eaVar.addOnAttachStateChangeListener(obj);
        return eaVar;
    }

    public static SpannableStringBuilder V(qt qtVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(qtVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.nz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) qtVar.f36980a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        kVar.B(org.telegram.ui.ActionBar.h6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19374u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new oo(this, 16));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.H(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19442y6, false), true);
        this.actionBar.H(org.telegram.ui.ActionBar.h6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.f39755f = false;
        this.e = false;
        st stVar = new st(this, context, this.f39758s, this.f39756n);
        this.f39754c = stVar;
        this.d = new ut(this, context, stVar.f37860s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context, null);
        this.f39753b = ozVar;
        ozVar.c();
        this.f39753b.setShowAtCenter(true);
        this.f39753b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f39753b, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.xl0 xl0Var = new org.telegram.ui.Components.xl0(context, null);
        this.f39752a = xl0Var;
        xl0Var.setSectionsType(3);
        this.f39752a.setEmptyView(this.f39753b);
        this.f39752a.setVerticalScrollBarEnabled(false);
        this.f39752a.setFastScrollEnabled(0);
        this.f39752a.setFastScrollVisible(true);
        this.f39752a.setLayoutManager(new s4.c0(1, false));
        this.f39752a.setAdapter(this.f39754c);
        org.telegram.ui.Components.xl0 xl0Var2 = this.f39752a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        xl0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f39752a, w7.y5.c(-1.0f, -1));
        this.f39752a.setOnItemClickListener(new i(this, 6));
        this.f39752a.setOnScrollListener(new i3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19059d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f19337s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39752a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19356t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39752a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19148i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39752a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19180k0, null, null, org.telegram.ui.ActionBar.h6.f19060d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39752a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f19205l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39752a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f19224m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39752a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f19244n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39753b, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19042c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39752a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39752a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39752a, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        st stVar = this.f39754c;
        if (stVar != null) {
            stVar.X(false);
        }
    }
}
