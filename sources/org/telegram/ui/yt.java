package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yt extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.Components.yl0 f40316a;
    public org.telegram.ui.Components.oz f40317b;
    public vt f40318c;
    public wt d;
    public boolean e;
    public boolean f40319f;
    public final boolean h;
    public boolean f40320n;
    public xt f40321r;
    public final ArrayList f40322s;

    public yt(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f40322s = new ArrayList(arrayList);
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
        obj.f37577a = new rt(0, eaVar);
        eaVar.addOnAttachStateChangeListener(obj);
        return eaVar;
    }

    public static SpannableStringBuilder V(tt ttVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ttVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.nz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ttVar.f37908a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        lVar.E(org.telegram.ui.ActionBar.i6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19374u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new po(this, 16));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.o().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 9);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.I(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19442y6, false), true);
        this.actionBar.I(org.telegram.ui.ActionBar.i6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.f40319f = false;
        this.e = false;
        vt vtVar = new vt(this, context, this.f40322s, this.f40320n);
        this.f40318c = vtVar;
        this.d = new wt(this, context, vtVar.f38701s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context, null);
        this.f40317b = ozVar;
        ozVar.c();
        this.f40317b.setShowAtCenter(true);
        this.f40317b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f40317b, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.f40316a = yl0Var;
        yl0Var.setSectionsType(3);
        this.f40316a.setEmptyView(this.f40317b);
        this.f40316a.setVerticalScrollBarEnabled(false);
        this.f40316a.setFastScrollEnabled(0);
        this.f40316a.setFastScrollVisible(true);
        this.f40316a.setLayoutManager(new s4.c0(1, false));
        this.f40316a.setAdapter(this.f40318c);
        org.telegram.ui.Components.yl0 yl0Var2 = this.f40316a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        yl0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f40316a, w7.y5.c(-1.0f, -1));
        this.f40316a.setOnItemClickListener(new i(this, 6));
        this.f40316a.setOnScrollListener(new j3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19057d6));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f19337s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40316a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19356t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.i6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40316a, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f19147i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40316a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f19179k0, null, null, org.telegram.ui.ActionBar.i6.f19058d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40316a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f19204l7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40316a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f19223m7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40316a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f19243n7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40317b, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f19040c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40316a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40316a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40316a, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        vt vtVar = this.f40318c;
        if (vtVar != null) {
            vtVar.X(false);
        }
    }
}
