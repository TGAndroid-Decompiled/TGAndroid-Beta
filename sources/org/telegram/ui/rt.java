package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rt extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.Components.jl0 f42197a;
    public org.telegram.ui.Components.hz f42198b;
    public nt f42199c;
    public pt d;
    public boolean f42200e;
    public boolean f42201f;
    public final boolean h;
    public boolean f42202n;
    public qt f42203r;
    public final ArrayList f42204s;

    public rt(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f42204s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.y9 U(Context context) {
        float f9;
        org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(context);
        float f10 = 12.0f;
        if (LocaleController.isRTL) {
            f9 = 16.0f;
        } else {
            f9 = 12.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        if (!LocaleController.isRTL) {
            f10 = 16.0f;
        }
        y9Var.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        ?? obj = new Object();
        obj.f40005a = new jt(0, y9Var);
        y9Var.addOnAttachStateChangeListener(obj);
        return y9Var;
    }

    public static SpannableStringBuilder V(lt ltVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ltVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.gz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ltVar.f40272a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        lVar.C(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23367u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 3));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new bb(this, 7);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.G(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23433y6, false), true);
        this.actionBar.G(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f42201f = false;
        this.f42200e = false;
        nt ntVar = new nt(this, context, this.f42204s, this.f42202n);
        this.f42199c = ntVar;
        this.d = new pt(this, context, ntVar.f40898s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.hz hzVar = new org.telegram.ui.Components.hz(context, null);
        this.f42198b = hzVar;
        hzVar.c();
        this.f42198b.setShowAtCenter(true);
        this.f42198b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f42198b, i7.f6.c(-1.0f, -1));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f42197a = jl0Var;
        jl0Var.setSectionsType(3);
        this.f42197a.setEmptyView(this.f42198b);
        this.f42197a.setVerticalScrollBarEnabled(false);
        this.f42197a.setFastScrollEnabled(0);
        this.f42197a.setFastScrollVisible(true);
        this.f42197a.setLayoutManager(new f2.j0(1, false));
        this.f42197a.setAdapter(this.f42199c);
        org.telegram.ui.Components.jl0 jl0Var2 = this.f42197a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        jl0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f42197a, i7.f6.c(-1.0f, -1));
        this.f42197a.setOnItemClickListener(new j(this, 6));
        this.f42197a.setOnScrollListener(new m3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23329s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42197a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42197a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42197a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42197a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23207l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42197a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23224m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42197a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f23242n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42198b, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23045c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42197a, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42197a, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42197a, 524288, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        nt ntVar = this.f42199c;
        if (ntVar != null) {
            ntVar.X(false);
        }
    }
}
