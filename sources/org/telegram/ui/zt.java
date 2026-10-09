package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zt extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Components.qm0 f45059a;
    public org.telegram.ui.Components.c00 f45060b;
    public wt f45061c;
    public xt d;
    public boolean f45062e;
    public boolean f45063f;
    public final boolean h;
    public boolean f45064n;
    public yt f45065r;
    public final ArrayList f45066s;

    public zt(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f45066s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.ca U(Context context) {
        float f7;
        org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
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
        caVar.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        ?? obj = new Object();
        obj.f42118a = new st(0, caVar);
        caVar.addOnAttachStateChangeListener(obj);
        return caVar;
    }

    public static SpannableStringBuilder V(ut utVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(utVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.b00(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) utVar.f42547a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        kVar.D(org.telegram.ui.ActionBar.i6.x0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21112u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 16));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.o().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.H(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21181y6, false), true);
        this.actionBar.H(org.telegram.ui.ActionBar.i6.x0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        this.f45063f = false;
        this.f45062e = false;
        wt wtVar = new wt(this, context, this.f45066s, this.f45064n);
        this.f45061c = wtVar;
        this.d = new xt(this, context, wtVar.f43751s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.c00 c00Var = new org.telegram.ui.Components.c00(context, null);
        this.f45060b = c00Var;
        c00Var.c();
        this.f45060b.setShowAtCenter(true);
        this.f45060b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f45060b, w7.x5.d(-1.0f, -1));
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context, null);
        this.f45059a = qm0Var;
        qm0Var.setSectionsType(3);
        this.f45059a.setEmptyView(this.f45060b);
        this.f45059a.setVerticalScrollBarEnabled(false);
        this.f45059a.setFastScrollEnabled(0);
        this.f45059a.setFastScrollVisible(true);
        this.f45059a.setLayoutManager(new s4.d0(1, false));
        this.f45059a.setAdapter(this.f45061c);
        org.telegram.ui.Components.qm0 qm0Var2 = this.f45059a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        qm0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f45059a, w7.x5.d(-1.0f, -1));
        this.f45059a.setOnItemClickListener(new i(this, 6));
        this.f45059a.setOnScrollListener(new i3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20797d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f21075s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f45059a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21130v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21094t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.i6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f45059a, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20888i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f45059a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20919k0, null, null, org.telegram.ui.ActionBar.i6.f20798d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f45059a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20944l7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f45059a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20963m7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f45059a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20983n7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f45060b, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20781c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f45059a, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f45059a, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f45059a, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        wt wtVar = this.f45061c;
        if (wtVar != null) {
            wtVar.X(false);
        }
    }
}
