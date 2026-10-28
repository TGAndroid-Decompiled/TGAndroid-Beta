package vh;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.i0;
import bi.j5;
import bi.u;
import ei.n;
import fi.c2;
import hi.e2;
import ig.o;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import li.e3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.x30;
import r0.a0;
import s4.l;
import vg.u0;
public final class f extends bb implements oe.d {
    public static final int f50347r0 = 0;
    public final oe.e X;
    public final oe.b Y;
    public final HashMap Z;
    public final ArrayList f50348a0;
    public final ArrayList f50349b0;
    public String f50350c0;
    public k71 f50351d0;
    public final fi.d f50352e0;
    public final n f50353f0;
    public final j5 f50354g0;
    public final q20 f50355h0;
    public final z3 f50356i0;
    public final HashMap f50357j0;
    public e3 f50358k0;
    public int f50359l0;
    public final int m0;
    public final FrameLayout f50360n0;
    public HashSet f50361o0;
    public final Rect f50362p0;
    public x30 f50363q0;

    public f(Context context, u6 u6Var) {
        super(context, u6Var, true);
        String country;
        ds dsVar = ds.h;
        this.X = new oe.e(3, this, dsVar, 350L);
        this.Y = new oe.b(4, this, dsVar, 320L, false);
        this.Z = new HashMap();
        this.f50348a0 = new ArrayList();
        this.f50349b0 = new ArrayList();
        this.f50357j0 = new HashMap();
        this.f50362p0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.f26796w = false;
        this.m0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        nm0 nm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new ml(this, 26));
        this.d.setOnItemClickListener(new c(context, u6Var, this));
        fi.d dVar = new fi.d(context, u6Var, true);
        this.f50352e0 = dVar;
        dVar.f();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        n nVar = new n(this, context);
        this.f50353f0 = nVar;
        f7.V(nVar, y6.Sh, u6Var);
        nVar.setText(LocaleController.getString(R.string.Save));
        nVar.setTypeface(AndroidUtilities.bold());
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(17);
        nVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        nVar.setVisibility(8);
        kb1.b(nVar);
        this.e.l().addView(nVar, kb1.x(-2, 48, 16, 12, 0, 12, 0));
        nVar.setOnClickListener(new a(this, 1));
        m20 m20Var = new m20(context, u6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        c2 c2Var = m20Var.f30347r;
        c2Var.setHint(string);
        c2Var.addTextChangedListener(new u(this, 21));
        q20 q20Var = new q20(context, this.currentAccount);
        this.f50355h0 = q20Var;
        q20Var.setDelegate(new b(this));
        j5 j5Var = new j5(context, u6Var, this);
        this.f50354g0 = j5Var;
        int i11 = this.backgroundPaddingLeft;
        j5Var.setPadding(i11, 0, i11, 0);
        j5Var.addView(m20Var, kb1.h(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        j5Var.addView(q20Var, kb1.h(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        z3 z3Var = new z3(context, 18, u6Var);
        this.f50356i0 = z3Var;
        z3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        z3Var.b(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        j5Var.addView(z3Var, kb1.i(-1, 32, 48));
        this.containerView.addView(j5Var, kb1.i(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, kb1.g(48.0f, -1));
        this.containerView.addView(frameLayout, kb1.i(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f50360n0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, kb1.i(-1, 150, 80));
        l lVar = new l();
        lVar.n(350L);
        lVar.o(dsVar);
        lVar.C = false;
        lVar.f47798m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new d(this, u6Var));
        o oVar = new o(this, 25);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
            country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new i0(oVar, 25));
        a0.i(getContainer(), new b(this));
    }

    public static void P(f fVar, Pair pair) {
        HashMap hashMap = fVar.f50357j0;
        HashMap hashMap2 = fVar.Z;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.f50348a0;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new u0(fVar, 1));
        HashSet hashSet = fVar.f50361o0;
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
                    x30 x30Var = new x30(fVar.getContext(), tL_help_country);
                    x30Var.setOnClickListener(new a(fVar, 3));
                    fVar.f50355h0.a(x30Var);
                    hashMap.put(tL_help_country.iso2, x30Var);
                }
            }
        }
        fVar.f50351d0.O(true);
        fVar.f50352e0.b(hashMap.size(), true);
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 3) {
            Q();
            this.f50356i0.setTranslationY(AndroidUtilities.dp(48.0f) + f7);
            this.f50354g0.invalidate();
        } else if (i10 == 4) {
            j20.d(this.f50353f0, f7);
        }
    }

    public final void Q() {
        boolean z10;
        int dp = AndroidUtilities.dp(56.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.X.f19333f);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.f50362p0;
        if (rect.top == dp && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        nm0 nm0Var = this.d;
        nm0Var.setClipBounds(rect);
        if (z10) {
            nm0Var.invalidate();
        }
    }

    public final void R() {
        nm0 nm0Var;
        float f7 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            nm0Var = this.d;
            if (i10 >= nm0Var.getChildCount()) {
                break;
            }
            View childAt = nm0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7 + AndroidUtilities.dp(8.0f));
        j5 j5Var = this.f50354g0;
        if (j5Var.getTranslationY() != max) {
            j5Var.setTranslationY(max);
            nm0Var.invalidate();
        }
    }

    public final void S(View view) {
        x30 x30Var = (x30) view;
        if (x30Var.f34655y) {
            this.f50363q0 = null;
            this.f50355h0.c(x30Var);
            String countryIso2 = x30Var.getCountryIso2();
            HashMap hashMap = this.f50357j0;
            hashMap.remove(countryIso2);
            this.f50352e0.b(hashMap.size(), true);
            this.f50351d0.O(true);
            return;
        }
        x30 x30Var2 = this.f50363q0;
        if (x30Var2 != null) {
            x30Var2.a();
        }
        this.f50363q0 = x30Var;
        x30Var.b();
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Q();
        R();
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(nm0Var, getContext(), this.currentAccount, 0, true, new e2(this, 22), this.resourcesProvider);
        this.f50351d0 = k71Var;
        k71Var.f29878r = false;
        return k71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
