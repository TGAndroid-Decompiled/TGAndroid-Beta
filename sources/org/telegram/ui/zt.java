package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zt extends org.telegram.ui.ActionBar.p2 {
    public org.telegram.ui.Components.sl0 f44016a;
    public org.telegram.ui.Components.oz f44017b;
    public vt f44018c;
    public xt d;
    public boolean f44019e;
    public boolean f44020f;
    public final boolean h;
    public boolean f44021n;
    public yt f44022r;
    public final ArrayList f44023s;

    public zt(ArrayList arrayList, boolean z4) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f44023s = new ArrayList(arrayList);
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
        obj.f41306a = new rt(0, aaVar);
        aaVar.addOnAttachStateChangeListener(obj);
        return aaVar;
    }

    public static SpannableStringBuilder V(tt ttVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ttVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.nz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ttVar.f41631a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        kVar.C(org.telegram.ui.ActionBar.k6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21965u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 3));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new fb(this, 7);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.G(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22038y6, false), true);
        this.actionBar.G(org.telegram.ui.ActionBar.k6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.f44020f = false;
        this.f44019e = false;
        vt vtVar = new vt(this, context, this.f44023s, this.f44021n);
        this.f44018c = vtVar;
        this.d = new xt(this, context, vtVar.f42208s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context, null);
        this.f44017b = ozVar;
        ozVar.c();
        this.f44017b.setShowAtCenter(true);
        this.f44017b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f44017b, k7.c6.c(-1.0f, -1));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f44016a = sl0Var;
        sl0Var.setSectionsType(3);
        this.f44016a.setEmptyView(this.f44017b);
        this.f44016a.setVerticalScrollBarEnabled(false);
        this.f44016a.setFastScrollEnabled(0);
        this.f44016a.setFastScrollVisible(true);
        this.f44016a.setLayoutManager(new f2.j0(1, false));
        this.f44016a.setAdapter(this.f44018c);
        org.telegram.ui.Components.sl0 sl0Var2 = this.f44016a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        sl0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f44016a, k7.c6.c(-1.0f, -1));
        this.f44016a.setOnItemClickListener(new j(this, 6));
        this.f44016a.setOnScrollListener(new l3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21932s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f44016a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f44016a, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f44016a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f44016a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.f21806l7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f44016a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.f21824m7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f44016a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.f21842n7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f44017b, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21644c7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f44016a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f44016a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f44016a, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        vt vtVar = this.f44018c;
        if (vtVar != null) {
            vtVar.X(false);
        }
    }
}
