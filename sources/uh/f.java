package uh;

import ai.h;
import ai.o5;
import ai.u;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import di.n;
import ei.e2;
import hg.o;
import ig.k0;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.i20;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.za;
import org.telegram.ui.Components.zr;
import r0.a0;
import s4.k;
import ug.s0;
import w7.b6;
import w7.z5;
public final class f extends za implements ne.d {
    public static final int f48278r0 = 0;
    public final ne.e X;
    public final ne.b Y;
    public final HashMap Z;
    public final ArrayList f48279a0;
    public final ArrayList f48280b0;
    public String f48281c0;
    public a71 f48282d0;
    public final ei.d f48283e0;
    public final n f48284f0;
    public final o5 f48285g0;
    public final m20 f48286h0;
    public final u3 f48287i0;
    public final HashMap f48288j0;
    public l2.f f48289k0;
    public int f48290l0;
    public final int m0;
    public final FrameLayout f48291n0;
    public HashSet f48292o0;
    public final Rect f48293p0;
    public t30 f48294q0;

    public f(Context context, g6 g6Var) {
        super(context, g6Var, true);
        String country;
        zr zrVar = zr.h;
        this.X = new ne.e(3, this, zrVar, 350L);
        this.Y = new ne.b(4, this, zrVar, 320L, false);
        this.Z = new HashMap();
        this.f48279a0 = new ArrayList();
        this.f48280b0 = new ArrayList();
        this.f48288j0 = new HashMap();
        this.f48293p0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.f33215w = false;
        this.m0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        lm0 lm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new iv(this, 21));
        this.d.setOnItemClickListener(new c(context, g6Var, this));
        ei.d dVar = new ei.d(context, g6Var, true);
        this.f48283e0 = dVar;
        dVar.f();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        n nVar = new n(this, context);
        this.f48284f0 = nVar;
        r6.W(nVar, k6.Sh, g6Var);
        nVar.setText(LocaleController.getString(R.string.Save));
        nVar.setTypeface(AndroidUtilities.bold());
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(17);
        nVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        nVar.setVisibility(8);
        b6.a(nVar);
        this.e.m().addView(nVar, z5.t(-2, 48, 16, 12, 0, 12, 0));
        nVar.setOnClickListener(new a(this, 1));
        i20 i20Var = new i20(context, g6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        e2 e2Var = i20Var.f27258r;
        e2Var.setHint(string);
        e2Var.addTextChangedListener(new u(this, 21));
        m20 m20Var = new m20(context, this.currentAccount);
        this.f48286h0 = m20Var;
        m20Var.setDelegate(new b(this));
        o5 o5Var = new o5(context, g6Var, this);
        this.f48285g0 = o5Var;
        int i11 = this.backgroundPaddingLeft;
        o5Var.setPadding(i11, 0, i11, 0);
        o5Var.addView(i20Var, z5.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        o5Var.addView(m20Var, z5.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        u3 u3Var = new u3(context, 18, g6Var);
        this.f48287i0 = u3Var;
        u3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        u3Var.b(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        o5Var.addView(u3Var, z5.e(-1, 32, 48));
        this.containerView.addView(o5Var, z5.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, z5.c(48.0f, -1));
        this.containerView.addView(frameLayout, z5.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f48291n0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, z5.e(-1, 150, 80));
        k kVar = new k();
        kVar.n(350L);
        kVar.o(zrVar);
        kVar.C = false;
        kVar.f46376m = false;
        this.d.setItemAnimator(kVar);
        this.d.i(new d(this, g6Var));
        k0 k0Var = new k0(this, 21);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
            country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new h(k0Var, 26));
        a0.i(getContainer(), new b(this));
    }

    public static void P(f fVar, Pair pair) {
        HashMap hashMap = fVar.f48288j0;
        HashMap hashMap2 = fVar.Z;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.f48279a0;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new s0(fVar, 1));
        HashSet hashSet = fVar.f48292o0;
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
                    t30 t30Var = new t30(fVar.getContext(), tL_help_country);
                    t30Var.setOnClickListener(new a(fVar, 3));
                    fVar.f48286h0.a(t30Var);
                    hashMap.put(tL_help_country.iso2, t30Var);
                }
            }
        }
        fVar.f48282d0.N(true);
        fVar.f48283e0.b(hashMap.size(), true);
    }

    public final void Q() {
        boolean z10;
        int dp = AndroidUtilities.dp(56.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.X.e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.f48293p0;
        if (rect.top == dp && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        lm0 lm0Var = this.d;
        lm0Var.setClipBounds(rect);
        if (z10) {
            lm0Var.invalidate();
        }
    }

    public final void R() {
        lm0 lm0Var;
        float f7 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            lm0Var = this.d;
            if (i10 >= lm0Var.getChildCount()) {
                break;
            }
            View childAt = lm0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7 + AndroidUtilities.dp(8.0f));
        o5 o5Var = this.f48285g0;
        if (o5Var.getTranslationY() != max) {
            o5Var.setTranslationY(max);
            lm0Var.invalidate();
        }
    }

    public final void S(View view) {
        t30 t30Var = (t30) view;
        if (t30Var.f30711y) {
            this.f48294q0 = null;
            this.f48286h0.c(t30Var);
            String countryIso2 = t30Var.getCountryIso2();
            HashMap hashMap = this.f48288j0;
            hashMap.remove(countryIso2);
            this.f48283e0.b(hashMap.size(), true);
            this.f48282d0.N(true);
            return;
        }
        t30 t30Var2 = this.f48294q0;
        if (t30Var2 != null) {
            t30Var2.a();
        }
        this.f48294q0 = t30Var;
        t30Var.b();
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 3) {
            Q();
            this.f48287i0.setTranslationY(AndroidUtilities.dp(48.0f) + f7);
            this.f48285g0.invalidate();
        } else if (i10 == 4) {
            f20.d(this.f48284f0, f7);
        }
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Q();
        R();
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        a71 a71Var = new a71(lm0Var, getContext(), this.currentAccount, 0, true, new o(this, 19), this.resourcesProvider);
        this.f48282d0 = a71Var;
        a71Var.f24646r = false;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
