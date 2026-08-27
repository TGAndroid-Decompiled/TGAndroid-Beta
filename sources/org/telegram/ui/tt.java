package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class tt extends org.telegram.ui.ActionBar.n2 {

    public org.telegram.ui.Components.zk0 f43004a;

    public org.telegram.ui.Components.az f43005b;

    public pt f43006c;
    public rt d;

    public boolean f43007e;

    public boolean f43008f;
    public final boolean h;

    public boolean f43009n;

    public st f43010r;

    public final ArrayList f43011s;

    public tt(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f43011s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.x9 U(Context context) {
        org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
        x9Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : 12.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 16.0f), 0);
        mt mtVar = new mt();
        mtVar.f40592a = new lt(0, x9Var);
        x9Var.addOnAttachStateChangeListener(mtVar);
        return x9Var;
    }

    public static SpannableStringBuilder V(nt ntVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ntVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.zy(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ntVar.f40915a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        kVar.D(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23359u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 12));
        org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(0, R.drawable.outline_header_search);
        v0VarA.F();
        v0VarA.D = new db(this, 7);
        v0VarA.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.H(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423y6, false), true);
        this.actionBar.H(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f43008f = false;
        this.f43007e = false;
        pt ptVar = new pt(this, context, this.f43011s, this.f43009n);
        this.f43006c = ptVar;
        this.d = new rt(this, context, ptVar.f41427s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.az azVar = new org.telegram.ui.Components.az(context, null);
        this.f43005b = azVar;
        azVar.c();
        this.f43005b.setShowAtCenter(true);
        this.f43005b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f43005b, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f43004a = zk0Var;
        zk0Var.setSectionsType(3);
        this.f43004a.setEmptyView(this.f43005b);
        this.f43004a.setVerticalScrollBarEnabled(false);
        this.f43004a.setFastScrollEnabled(0);
        this.f43004a.setFastScrollVisible(true);
        this.f43004a.setLayoutManager(new f2.k0(1, false));
        this.f43004a.setAdapter(this.f43006c);
        this.f43004a.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.f43004a, h7.z5.c(-1.0f, -1));
        this.f43004a.setOnItemClickListener(new i(this, 6));
        this.f43004a.setOnScrollListener(new m3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23322s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43004a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43004a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43004a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43004a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23199l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43004a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23216m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43004a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23235n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43005b, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23037c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43004a, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43004a, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43004a, 524288, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        return i0.b.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, true)) > 0.699999988079071d;
    }

    @Override
    public final void onResume() {
        super.onResume();
        pt ptVar = this.f43006c;
        if (ptVar != null) {
            ptVar.X(false);
        }
    }
}
