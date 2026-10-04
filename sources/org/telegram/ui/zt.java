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
    public org.telegram.ui.Components.zl0 f43878a;
    public org.telegram.ui.Components.pz f43879b;
    public wt f43880c;
    public xt d;
    public boolean f43881e;
    public boolean f43882f;
    public final boolean h;
    public boolean f43883n;
    public yt f43884r;
    public final ArrayList f43885s;

    public zt(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f43885s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.ea S(Context context) {
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
        obj.f40958a = new st(0, eaVar);
        eaVar.addOnAttachStateChangeListener(obj);
        return eaVar;
    }

    public static SpannableStringBuilder T(ut utVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(utVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.oz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) utVar.f41297a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20817d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        kVar.B(org.telegram.ui.ActionBar.i6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21136u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 16));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 9);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.F(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21204y6, false), true);
        this.actionBar.F(org.telegram.ui.ActionBar.i6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.f43882f = false;
        this.f43881e = false;
        wt wtVar = new wt(this, context, this.f43885s, this.f43883n);
        this.f43880c = wtVar;
        this.d = new xt(this, context, wtVar.f42632s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        this.f43879b = pzVar;
        pzVar.c();
        this.f43879b.setShowAtCenter(true);
        this.f43879b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f43879b, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f43878a = zl0Var;
        zl0Var.setSectionsType(3);
        this.f43878a.setEmptyView(this.f43879b);
        this.f43878a.setVerticalScrollBarEnabled(false);
        this.f43878a.setFastScrollEnabled(0);
        this.f43878a.setFastScrollVisible(true);
        this.f43878a.setLayoutManager(new s4.c0(1, false));
        this.f43878a.setAdapter(this.f43880c);
        org.telegram.ui.Components.zl0 zl0Var2 = this.f43878a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        zl0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f43878a, w7.z5.c(-1.0f, -1));
        this.f43878a.setOnItemClickListener(new i(this, 6));
        this.f43878a.setOnScrollListener(new i3(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20817d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f21099s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43878a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21154v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21118t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.i6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43878a, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20908i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43878a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20940k0, null, null, org.telegram.ui.ActionBar.i6.f20818d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43878a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20965l7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43878a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20984m7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43878a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f21004n7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43879b, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20800c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43878a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43878a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43878a, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20817d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        wt wtVar = this.f43880c;
        if (wtVar != null) {
            wtVar.X(false);
        }
    }
}
