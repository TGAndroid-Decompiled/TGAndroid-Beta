package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qt extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.Components.wk0 f42187a;
    public org.telegram.ui.Components.yy f42188b;
    public nt f42189c;
    public ot d;
    public boolean f42190e;
    public boolean f42191f;
    public final boolean h;
    public boolean f42192n;
    public pt f42193r;
    public final ArrayList f42194s;

    public qt(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f42194s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.ba T(Context context) {
        float f10;
        org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
        float f11 = 12.0f;
        if (LocaleController.isRTL) {
            f10 = 16.0f;
        } else {
            f10 = 12.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        if (!LocaleController.isRTL) {
            f11 = 16.0f;
        }
        baVar.setPadding(dp, 0, AndroidUtilities.dp(f11), 0);
        ?? obj = new Object();
        obj.f39917a = new jt(0, baVar);
        baVar.addOnAttachStateChangeListener(obj);
        return baVar;
    }

    public static SpannableStringBuilder U(lt ltVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ltVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.xy(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ltVar.f40225a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        kVar.C(org.telegram.ui.ActionBar.f6.w0(null, i9, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23305u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 11));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new cb(this, 7);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i10 = 1;
        this.actionBar.G(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false), true);
        this.actionBar.G(org.telegram.ui.ActionBar.f6.w0(null, i9, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.f42191f = false;
        this.f42190e = false;
        nt ntVar = new nt(this, context, this.f42194s, this.f42192n);
        this.f42189c = ntVar;
        this.d = new ot(this, context, ntVar.f40807s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.f42188b = yyVar;
        yyVar.c();
        this.f42188b.setShowAtCenter(true);
        this.f42188b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f42188b, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f42187a = wk0Var;
        wk0Var.setSectionsType(3);
        this.f42187a.setEmptyView(this.f42188b);
        this.f42187a.setVerticalScrollBarEnabled(false);
        this.f42187a.setFastScrollEnabled(0);
        this.f42187a.setFastScrollVisible(true);
        this.f42187a.setLayoutManager(new f2.m0(1, false));
        this.f42187a.setAdapter(this.f42189c);
        org.telegram.ui.Components.wk0 wk0Var2 = this.f42187a;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        wk0Var2.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f42187a, g7.e6.c(-1.0f, -1));
        this.f42187a.setOnItemClickListener(new i(this, 6));
        this.f42187a.setOnScrollListener(new l3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f23269s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42187a, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.f6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42187a, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42187a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42187a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23145l7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42187a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23163m7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42187a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23180n7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42188b, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f22984c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42187a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42187a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42187a, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        nt ntVar = this.f42189c;
        if (ntVar != null) {
            ntVar.X(false);
        }
    }
}
