package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qt extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Components.im0 f40519a;
    public org.telegram.ui.Components.vz f40520b;
    public mt f40521c;
    public ot d;
    public boolean e;
    public boolean f40522f;
    public final boolean h;
    public boolean f40523n;
    public pt f40524r;
    public final ArrayList f40525s;

    public qt(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f40525s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.ba U(Context context) {
        float f7;
        org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
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
        baVar.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        ?? obj = new Object();
        obj.f38341a = new ht(0, baVar);
        baVar.addOnAttachStateChangeListener(obj);
        return baVar;
    }

    public static SpannableStringBuilder V(kt ktVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ktVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.uz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ktVar.f38669a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        kVar.C(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21311u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 19));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.c2(this, 8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.H(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21381y6, false), true);
        this.actionBar.H(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f40522f = false;
        this.e = false;
        mt mtVar = new mt(this, context, this.f40525s, this.f40523n);
        this.f40521c = mtVar;
        this.d = new ot(this, context, mtVar.f39270s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        this.f40520b = vzVar;
        vzVar.c();
        this.f40520b.setShowAtCenter(true);
        this.f40520b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f40520b, w7.z5.d(-1.0f, -1));
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.f40519a = im0Var;
        im0Var.setSectionsType(3);
        this.f40519a.setEmptyView(this.f40520b);
        this.f40519a.setVerticalScrollBarEnabled(false);
        this.f40519a.setFastScrollEnabled(0);
        this.f40519a.setFastScrollVisible(true);
        this.f40519a.setLayoutManager(new s4.b0(1, false));
        this.f40519a.setAdapter(this.f40521c);
        org.telegram.ui.Components.im0 im0Var2 = this.f40519a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        im0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f40519a, w7.z5.d(-1.0f, -1));
        this.f40519a.setOnItemClickListener(new i(this, 7));
        this.f40519a.setOnScrollListener(new k3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20993d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21272s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40519a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21328v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21291t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40519a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21082i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40519a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21114k0, null, null, org.telegram.ui.ActionBar.h6.f20994d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40519a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21138l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40519a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21157m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40519a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21177n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40520b, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20975c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40519a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40519a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40519a, 524288, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        mt mtVar = this.f40521c;
        if (mtVar != null) {
            mtVar.X(false);
        }
    }
}
