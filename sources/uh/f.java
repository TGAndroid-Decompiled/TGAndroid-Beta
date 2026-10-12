package uh;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.z7;
import ci.n;
import di.g2;
import di.h2;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ji.p1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.z30;
import org.telegram.ui.Components.z61;
import org.telegram.ui.x5;
import r0.b0;
import s4.k;
import ug.u0;
import w7.a6;
public final class f extends db implements ne.d {
    public static final int f46445r0 = 0;
    public final ne.e X;
    public final ne.b Y;
    public final HashMap Z;
    public final ArrayList f46446a0;
    public final ArrayList f46447b0;
    public String f46448c0;
    public z61 f46449d0;
    public final di.d f46450e0;
    public final n f46451f0;
    public final x5 f46452g0;
    public final s20 f46453h0;
    public final v3 f46454i0;
    public final HashMap f46455j0;
    public l2.f f46456k0;
    public int f46457l0;
    public final int m0;
    public final FrameLayout f46458n0;
    public HashSet f46459o0;
    public final Rect f46460p0;
    public z30 f46461q0;

    public f(Context context, c6 c6Var) {
        super(context, c6Var, true);
        String country;
        es esVar = es.h;
        this.X = new ne.e(3, this, esVar, 350L);
        this.Y = new ne.b(4, this, esVar, 320L, false);
        this.Z = new HashMap();
        this.f46446a0 = new ArrayList();
        this.f46447b0 = new ArrayList();
        this.f46455j0 = new HashMap();
        this.f46460p0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.f24348w = false;
        this.m0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new kc0(this, 17));
        this.d.setOnItemClickListener(new c(context, c6Var, this));
        di.d dVar = new di.d(context, c6Var, true);
        this.f46450e0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        n nVar = new n(this, context);
        this.f46451f0 = nVar;
        nVar.setTextColor(getThemedColor(g6.Sh));
        nVar.setText(LocaleController.getString(R.string.Save));
        nVar.setTypeface(AndroidUtilities.bold());
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(17);
        nVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        nVar.setVisibility(8);
        w7.c6.a(nVar);
        this.e.n().addView(nVar, a6.t(-2, 48, 16, 12, 0, 12, 0));
        nVar.setOnClickListener(new a(this, 1));
        o20 o20Var = new o20(context, c6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        g2 g2Var = o20Var.f27815r;
        g2Var.setHint(string);
        g2Var.addTextChangedListener(new h2(this, 20));
        s20 s20Var = new s20(context, this.currentAccount);
        this.f46453h0 = s20Var;
        s20Var.setDelegate(new b(this));
        x5 x5Var = new x5(context, c6Var, this);
        this.f46452g0 = x5Var;
        int i11 = this.backgroundPaddingLeft;
        x5Var.setPadding(i11, 0, i11, 0);
        x5Var.addView(o20Var, a6.a(40.0f, 10.0f, 0.0f, 10.0f, 0.0f, -1, 48));
        x5Var.addView(s20Var, a6.a(144.0f, -3.0f, 40.0f, -3.0f, 0.0f, -1, 48));
        v3 v3Var = new v3(context, 18, c6Var);
        this.f46454i0 = v3Var;
        v3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        v3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        x5Var.addView(v3Var, a6.e(-1, 32, 48));
        this.containerView.addView(x5Var, a6.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, a6.d(48.0f, -1));
        this.containerView.addView(frameLayout, a6.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f46458n0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, a6.e(-1, 150, 80));
        k kVar = new k();
        kVar.n(350L);
        kVar.o(esVar);
        kVar.C = false;
        kVar.f44872m = false;
        this.d.setItemAnimator(kVar);
        this.d.i(new d(this, c6Var));
        p1 p1Var = new p1(this, 15);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
            country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new z7(p1Var, 20));
        b0.i(getContainer(), new b(this));
    }

    public static void Q(f fVar, Pair pair) {
        HashMap hashMap = fVar.f46455j0;
        HashMap hashMap2 = fVar.Z;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.f46446a0;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new u0(fVar, 1));
        HashSet hashSet = fVar.f46459o0;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        for (TLRPC.TL_help_country tL_help_country : (List) hashMap2.get((String) obj)) {
                            if (TextUtils.equals(str, tL_help_country.iso2)) {
                                break;
                            }
                        }
                    } else {
                        tL_help_country = null;
                        break;
                    }
                }
                if (tL_help_country != null) {
                    z30 z30Var = new z30(fVar.getContext(), tL_help_country);
                    z30Var.setOnClickListener(new a(fVar, 3));
                    fVar.f46453h0.a(z30Var);
                    hashMap.put(tL_help_country.iso2, z30Var);
                }
            }
        }
        fVar.f46449d0.N(true);
        fVar.f46450e0.b(hashMap.size(), true);
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    public final void R() {
        boolean z10;
        int dp = AndroidUtilities.dp(56.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.X.e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.f46460p0;
        if (rect.top == dp && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        mm0 mm0Var = this.d;
        mm0Var.setClipBounds(rect);
        if (z10) {
            mm0Var.invalidate();
        }
    }

    public final void S() {
        mm0 mm0Var;
        float f7 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            mm0Var = this.d;
            if (i10 >= mm0Var.getChildCount()) {
                break;
            }
            View childAt = mm0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7 + AndroidUtilities.dp(8.0f));
        x5 x5Var = this.f46452g0;
        if (x5Var.getTranslationY() != max) {
            x5Var.setTranslationY(max);
            mm0Var.invalidate();
        }
    }

    public final void T(View view) {
        z30 z30Var = (z30) view;
        if (z30Var.f31754y) {
            this.f46461q0 = null;
            this.f46453h0.c(z30Var);
            String countryIso2 = z30Var.getCountryIso2();
            HashMap hashMap = this.f46455j0;
            hashMap.remove(countryIso2);
            this.f46450e0.b(hashMap.size(), true);
            this.f46449d0.N(true);
            return;
        }
        z30 z30Var2 = this.f46461q0;
        if (z30Var2 != null) {
            z30Var2.a();
        }
        this.f46461q0 = z30Var;
        z30Var.b();
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        R();
        S();
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 3) {
            R();
            this.f46454i0.setTranslationY(AndroidUtilities.dp(48.0f) + f7);
            this.f46452g0.invalidate();
        } else if (i10 == 4) {
            l20.d(this.f46451f0, f7);
        }
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        z61 z61Var = new z61(mm0Var, getContext(), this.currentAccount, 0, true, new ii.a(this, 8), this.resourcesProvider);
        this.f46449d0 = z61Var;
        z61Var.f31780r = false;
        return z61Var;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
