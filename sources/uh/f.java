package uh;

import ai.h;
import ai.n5;
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
import ig.l0;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v30;
import r0.a0;
import s4.k;
import ug.t0;
import w7.b6;
import w7.z5;
public final class f extends bb implements ne.d {
    public static final int f47832r0 = 0;
    public final ne.e X;
    public final ne.b Y;
    public final HashMap Z;
    public final ArrayList f47833a0;
    public final ArrayList f47834b0;
    public String f47835c0;
    public t61 f47836d0;
    public final ei.d f47837e0;
    public final n f47838f0;
    public final n5 f47839g0;
    public final o20 f47840h0;
    public final u3 f47841i0;
    public final HashMap f47842j0;
    public l2.f f47843k0;
    public int f47844l0;
    public final int m0;
    public final FrameLayout f47845n0;
    public HashSet f47846o0;
    public final Rect f47847p0;
    public v30 f47848q0;

    public f(Context context, d6 d6Var) {
        super(context, d6Var, true);
        String country;
        bs bsVar = bs.h;
        this.X = new ne.e(3, this, bsVar, 350L);
        this.Y = new ne.b(4, this, bsVar, 320L, false);
        this.Z = new HashMap();
        this.f47833a0 = new ArrayList();
        this.f47834b0 = new ArrayList();
        this.f47842j0 = new HashMap();
        this.f47847p0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.f24902w = false;
        this.m0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        im0 im0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        im0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new kv(this, 21));
        this.d.setOnItemClickListener(new c(context, d6Var, this));
        ei.d dVar = new ei.d(context, d6Var, true);
        this.f47837e0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        n nVar = new n(this, context);
        this.f47838f0 = nVar;
        nVar.setTextColor(getThemedColor(h6.Sh));
        nVar.setText(LocaleController.getString(R.string.Save));
        nVar.setTypeface(AndroidUtilities.bold());
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(17);
        nVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        nVar.setVisibility(8);
        b6.a(nVar);
        this.e.n().addView(nVar, z5.t(-2, 48, 16, 12, 0, 12, 0));
        nVar.setOnClickListener(new a(this, 1));
        k20 k20Var = new k20(context, d6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        e2 e2Var = k20Var.f27688r;
        e2Var.setHint(string);
        e2Var.addTextChangedListener(new u(this, 21));
        o20 o20Var = new o20(context, this.currentAccount);
        this.f47840h0 = o20Var;
        o20Var.setDelegate(new b(this));
        n5 n5Var = new n5(context, d6Var, this);
        this.f47839g0 = n5Var;
        int i11 = this.backgroundPaddingLeft;
        n5Var.setPadding(i11, 0, i11, 0);
        n5Var.addView(k20Var, z5.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        n5Var.addView(o20Var, z5.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        u3 u3Var = new u3(context, 18, d6Var);
        this.f47841i0 = u3Var;
        u3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        u3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        n5Var.addView(u3Var, z5.e(-1, 32, 48));
        this.containerView.addView(n5Var, z5.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, z5.c(48.0f, -1));
        this.containerView.addView(frameLayout, z5.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f47845n0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, z5.e(-1, 150, 80));
        k kVar = new k();
        kVar.n(350L);
        kVar.o(bsVar);
        kVar.C = false;
        kVar.f45944m = false;
        this.d.setItemAnimator(kVar);
        this.d.i(new d(this, d6Var));
        l0 l0Var = new l0(this, 21);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
            country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new h(l0Var, 26));
        a0.i(getContainer(), new b(this));
    }

    public static void Q(f fVar, Pair pair) {
        HashMap hashMap = fVar.f47842j0;
        HashMap hashMap2 = fVar.Z;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.f47833a0;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new t0(fVar, 1));
        HashSet hashSet = fVar.f47846o0;
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
                    v30 v30Var = new v30(fVar.getContext(), tL_help_country);
                    v30Var.setOnClickListener(new a(fVar, 3));
                    fVar.f47840h0.a(v30Var);
                    hashMap.put(tL_help_country.iso2, v30Var);
                }
            }
        }
        fVar.f47836d0.N(true);
        fVar.f47837e0.b(hashMap.size(), true);
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    public final void R() {
        boolean z10;
        int dp = AndroidUtilities.dp(56.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.X.e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.f47847p0;
        if (rect.top == dp && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        im0 im0Var = this.d;
        im0Var.setClipBounds(rect);
        if (z10) {
            im0Var.invalidate();
        }
    }

    public final void S() {
        im0 im0Var;
        float f7 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            im0Var = this.d;
            if (i10 >= im0Var.getChildCount()) {
                break;
            }
            View childAt = im0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7 + AndroidUtilities.dp(8.0f));
        n5 n5Var = this.f47839g0;
        if (n5Var.getTranslationY() != max) {
            n5Var.setTranslationY(max);
            im0Var.invalidate();
        }
    }

    public final void T(View view) {
        v30 v30Var = (v30) view;
        if (v30Var.f31139y) {
            this.f47848q0 = null;
            this.f47840h0.c(v30Var);
            String countryIso2 = v30Var.getCountryIso2();
            HashMap hashMap = this.f47842j0;
            hashMap.remove(countryIso2);
            this.f47837e0.b(hashMap.size(), true);
            this.f47836d0.N(true);
            return;
        }
        v30 v30Var2 = this.f47848q0;
        if (v30Var2 != null) {
            v30Var2.a();
        }
        this.f47848q0 = v30Var;
        v30Var.b();
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        R();
        S();
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 3) {
            R();
            this.f47841i0.setTranslationY(AndroidUtilities.dp(48.0f) + f7);
            this.f47839g0.invalidate();
        } else if (i10 == 4) {
            h20.d(this.f47838f0, f7);
        }
    }

    @Override
    public final hm0 x(im0 im0Var) {
        t61 t61Var = new t61(im0Var, getContext(), this.currentAccount, 0, true, new o(this, 19), this.resourcesProvider);
        this.f47836d0 = t61Var;
        t61Var.f30438r = false;
        return t61Var;
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
