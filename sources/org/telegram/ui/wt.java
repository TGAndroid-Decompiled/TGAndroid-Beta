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
    public org.telegram.ui.Components.zl0 f39848a;
    public org.telegram.ui.Components.pz f39849b;
    public st f39850c;
    public ut d;
    public boolean e;
    public boolean f39851f;
    public final boolean h;
    public boolean f39852n;
    public vt f39853r;
    public final ArrayList f39854s;

    public wt(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f39854s = new ArrayList(arrayList);
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
        obj.f36778a = new ot(0, eaVar);
        eaVar.addOnAttachStateChangeListener(obj);
        return eaVar;
    }

    public static SpannableStringBuilder V(qt qtVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(qtVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.oz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) qtVar.f37082a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19076d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        kVar.B(org.telegram.ui.ActionBar.h6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19391u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new oo(this, 16));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.H(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19459y6, false), true);
        this.actionBar.H(org.telegram.ui.ActionBar.h6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.f39851f = false;
        this.e = false;
        st stVar = new st(this, context, this.f39854s, this.f39852n);
        this.f39850c = stVar;
        this.d = new ut(this, context, stVar.f37969s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        this.f39849b = pzVar;
        pzVar.c();
        this.f39849b.setShowAtCenter(true);
        this.f39849b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f39849b, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f39848a = zl0Var;
        zl0Var.setSectionsType(3);
        this.f39848a.setEmptyView(this.f39849b);
        this.f39848a.setVerticalScrollBarEnabled(false);
        this.f39848a.setFastScrollEnabled(0);
        this.f39848a.setFastScrollVisible(true);
        this.f39848a.setLayoutManager(new s4.c0(1, false));
        this.f39848a.setAdapter(this.f39850c);
        org.telegram.ui.Components.zl0 zl0Var2 = this.f39848a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        zl0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f39848a, w7.y5.c(-1.0f, -1));
        this.f39848a.setOnItemClickListener(new i(this, 6));
        this.f39848a.setOnScrollListener(new i3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19076d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f19354s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39848a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19409v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19373t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39848a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19165i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39848a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19197k0, null, null, org.telegram.ui.ActionBar.h6.f19077d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39848a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f19222l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39848a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f19241m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39848a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f19261n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39849b, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19059c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39848a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39848a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39848a, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19076d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        st stVar = this.f39850c;
        if (stVar != null) {
            stVar.X(false);
        }
    }
}
