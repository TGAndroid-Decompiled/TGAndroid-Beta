package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xt extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Components.ml0 f39655a;
    public org.telegram.ui.Components.nz f39656b;
    public ut f39657c;
    public vt d;
    public boolean e;
    public boolean f39658f;
    public final boolean h;
    public boolean f39659n;
    public wt f39660r;
    public final ArrayList f39661s;

    public xt(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f39661s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.fa U(Context context) {
        float f7;
        org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context);
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
        faVar.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        ?? obj = new Object();
        obj.f36927a = new qt(0, faVar);
        faVar.addOnAttachStateChangeListener(obj);
        return faVar;
    }

    public static SpannableStringBuilder V(st stVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(stVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.mz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) stVar.f37415a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        kVar.B(org.telegram.ui.ActionBar.h6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19102u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new po(this, 16));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.H(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19170y6, false), true);
        this.actionBar.H(org.telegram.ui.ActionBar.h6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.f39658f = false;
        this.e = false;
        ut utVar = new ut(this, context, this.f39661s, this.f39659n);
        this.f39657c = utVar;
        this.d = new vt(this, context, utVar.f38216s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.nz nzVar = new org.telegram.ui.Components.nz(context, null);
        this.f39656b = nzVar;
        nzVar.c();
        this.f39656b.setShowAtCenter(true);
        this.f39656b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f39656b, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.f39655a = ml0Var;
        ml0Var.setSectionsType(3);
        this.f39655a.setEmptyView(this.f39656b);
        this.f39655a.setVerticalScrollBarEnabled(false);
        this.f39655a.setFastScrollEnabled(0);
        this.f39655a.setFastScrollVisible(true);
        this.f39655a.setLayoutManager(new s4.c0(1, false));
        this.f39655a.setAdapter(this.f39657c);
        org.telegram.ui.Components.ml0 ml0Var2 = this.f39655a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        ml0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f39655a, w7.x5.c(-1.0f, -1));
        this.f39655a.setOnItemClickListener(new i(this, 6));
        this.f39655a.setOnScrollListener(new i3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f18789d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f19065s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39655a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39655a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f18878i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39655a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f18910k0, null, null, org.telegram.ui.ActionBar.h6.f18790d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39655a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f18935l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39655a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f18954m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39655a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f18974n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39656b, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f18772c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39655a, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39655a, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39655a, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        ut utVar = this.f39657c;
        if (utVar != null) {
            utVar.X(false);
        }
    }
}
