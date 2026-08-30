package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yt extends org.telegram.ui.ActionBar.p2 {
    public org.telegram.ui.Components.sl0 f40571a;
    public org.telegram.ui.Components.mz f40572b;
    public ut f40573c;
    public wt d;
    public boolean e;
    public boolean f40574f;
    public final boolean h;
    public boolean f40575n;
    public xt f40576r;
    public final ArrayList f40577s;

    public yt(ArrayList arrayList, boolean z4) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f40577s = new ArrayList(arrayList);
        }
        this.h = z4;
    }

    public static org.telegram.ui.Cells.aa U(Context context) {
        float f10;
        org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
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
        aaVar.setPadding(dp, 0, AndroidUtilities.dp(f11), 0);
        ?? obj = new Object();
        obj.f38112a = new qt(0, aaVar);
        aaVar.addOnAttachStateChangeListener(obj);
        return aaVar;
    }

    public static SpannableStringBuilder V(st stVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(stVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) stVar.f38435a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        kVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20209u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 3));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new fb(this, 7);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.G(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20281y6, false), true);
        this.actionBar.G(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f40574f = false;
        this.e = false;
        ut utVar = new ut(this, context, this.f40577s, this.f40575n);
        this.f40573c = utVar;
        this.d = new wt(this, context, utVar.f38997s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.f40572b = mzVar;
        mzVar.c();
        this.f40572b.setShowAtCenter(true);
        this.f40572b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f40572b, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f40571a = sl0Var;
        sl0Var.setSectionsType(3);
        this.f40571a.setEmptyView(this.f40572b);
        this.f40571a.setVerticalScrollBarEnabled(false);
        this.f40571a.setFastScrollEnabled(0);
        this.f40571a.setFastScrollVisible(true);
        this.f40571a.setLayoutManager(new f2.i0(1, false));
        this.f40571a.setAdapter(this.f40573c);
        org.telegram.ui.Components.sl0 sl0Var2 = this.f40571a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        sl0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f40571a, k7.b6.c(-1.0f, -1));
        this.f40571a.setOnItemClickListener(new j(this, 6));
        this.f40571a.setOnScrollListener(new l3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20176s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40571a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40571a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40571a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40571a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20050l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40571a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20068m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40571a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20086n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40572b, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19889c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40571a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40571a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40571a, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        ut utVar = this.f40573c;
        if (utVar != null) {
            utVar.X(false);
        }
    }
}
