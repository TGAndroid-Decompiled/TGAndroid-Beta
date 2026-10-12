package th;

import ai.o8;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.o;
import ci.g2;
import ci.h2;
import ii.q1;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import n4.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.v20;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.z20;
import org.telegram.ui.w5;
import r0.a0;
import s4.j;
import tg.u0;
import w7.y5;
public final class f extends db implements me.d {
    public static final int f48704r0 = 0;
    public final me.e X;
    public final me.b Y;
    public final HashMap Z;
    public final ArrayList f48705a0;
    public final ArrayList f48706b0;
    public String f48707c0;
    public h71 f48708d0;
    public final ci.d f48709e0;
    public final o f48710f0;
    public final w5 f48711g0;
    public final z20 f48712h0;
    public final v3 f48713i0;
    public final HashMap f48714j0;
    public l f48715k0;
    public int f48716l0;
    public final int m0;
    public final FrameLayout f48717n0;
    public HashSet f48718o0;
    public final Rect f48719p0;
    public g40 f48720q0;

    public f(Context context, c6 c6Var) {
        super(context, c6Var, true);
        String country;
        js jsVar = js.h;
        this.X = new me.e(3, this, jsVar, 350L);
        this.Y = new me.b(4, this, jsVar, 320L, false);
        this.Z = new HashMap();
        this.f48705a0 = new ArrayList();
        this.f48706b0 = new ArrayList();
        this.f48714j0 = new HashMap();
        this.f48719p0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.f25292w = false;
        this.m0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        wm0 wm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wm0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new qh0(this, 16));
        this.d.setOnItemClickListener(new c(context, c6Var, this));
        ci.d dVar = new ci.d(context, c6Var, true);
        this.f48709e0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        o oVar = new o(this, context);
        this.f48710f0 = oVar;
        oVar.setTextColor(getThemedColor(h6.Sh));
        oVar.setText(LocaleController.getString(R.string.Save));
        oVar.setTypeface(AndroidUtilities.bold());
        oVar.setTextSize(1, 14.0f);
        oVar.setGravity(17);
        oVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        oVar.setVisibility(8);
        y5.a(oVar);
        this.f25287e.p().addView(oVar, w7.w5.t(-2, 48, 16, 12, 0, 12, 0));
        oVar.setOnClickListener(new a(this, 1));
        v20 v20Var = new v20(context, c6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        g2 g2Var = v20Var.f31362r;
        g2Var.setHint(string);
        g2Var.addTextChangedListener(new h2(this, 21));
        z20 z20Var = new z20(context, this.currentAccount);
        this.f48712h0 = z20Var;
        z20Var.setDelegate(new b(this));
        w5 w5Var = new w5(context, c6Var, this);
        this.f48711g0 = w5Var;
        int i11 = this.backgroundPaddingLeft;
        w5Var.setPadding(i11, 0, i11, 0);
        w5Var.addView(v20Var, w7.w5.a(40.0f, 10.0f, 0.0f, 10.0f, 0.0f, -1, 48));
        w5Var.addView(z20Var, w7.w5.a(144.0f, -3.0f, 40.0f, -3.0f, 0.0f, -1, 48));
        v3 v3Var = new v3(context, 18, c6Var);
        this.f48713i0 = v3Var;
        v3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        v3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        w5Var.addView(v3Var, w7.w5.e(-1, 32, 48));
        this.containerView.addView(w5Var, w7.w5.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, w7.w5.d(48.0f, -1));
        this.containerView.addView(frameLayout, w7.w5.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f48717n0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, w7.w5.e(-1, 150, 80));
        j jVar = new j();
        jVar.n(350L);
        jVar.o(jsVar);
        jVar.C = false;
        jVar.f47937m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new d(this, c6Var));
        q1 q1Var = new q1(this, 15);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
            country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new o8(q1Var, 20));
        a0.i(getContainer(), new b(this));
    }

    public static void Q(f fVar, Pair pair) {
        HashMap hashMap = fVar.f48714j0;
        HashMap hashMap2 = fVar.Z;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.f48705a0;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new u0(fVar, 1));
        HashSet hashSet = fVar.f48718o0;
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
                    g40 g40Var = new g40(fVar.getContext(), tL_help_country);
                    g40Var.setOnClickListener(new a(fVar, 3));
                    fVar.f48712h0.a(g40Var);
                    hashMap.put(tL_help_country.iso2, g40Var);
                }
            }
        }
        fVar.f48708d0.N(true);
        fVar.f48709e0.b(hashMap.size(), true);
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    public final void R() {
        boolean z10;
        int dp = AndroidUtilities.dp(56.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.X.f16096e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.f48719p0;
        if (rect.top == dp && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        wm0 wm0Var = this.d;
        wm0Var.setClipBounds(rect);
        if (z10) {
            wm0Var.invalidate();
        }
    }

    public final void S() {
        wm0 wm0Var;
        float f7 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            wm0Var = this.d;
            if (i10 >= wm0Var.getChildCount()) {
                break;
            }
            View childAt = wm0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7 + AndroidUtilities.dp(8.0f));
        w5 w5Var = this.f48711g0;
        if (w5Var.getTranslationY() != max) {
            w5Var.setTranslationY(max);
            wm0Var.invalidate();
        }
    }

    public final void T(View view) {
        g40 g40Var = (g40) view;
        if (g40Var.f26266y) {
            this.f48720q0 = null;
            this.f48712h0.c(g40Var);
            String countryIso2 = g40Var.getCountryIso2();
            HashMap hashMap = this.f48714j0;
            hashMap.remove(countryIso2);
            this.f48709e0.b(hashMap.size(), true);
            this.f48708d0.N(true);
            return;
        }
        g40 g40Var2 = this.f48720q0;
        if (g40Var2 != null) {
            g40Var2.a();
        }
        this.f48720q0 = g40Var;
        g40Var.b();
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 3) {
            R();
            this.f48713i0.setTranslationY(AndroidUtilities.dp(48.0f) + f7);
            this.f48711g0.invalidate();
        } else if (i10 == 4) {
            s20.d(this.f48710f0, f7);
        }
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        R();
        S();
    }

    @Override
    public final vm0 x(wm0 wm0Var) {
        h71 h71Var = new h71(wm0Var, getContext(), this.currentAccount, 0, true, new hi.a(this, 8), this.resourcesProvider);
        this.f48708d0 = h71Var;
        h71Var.f26679r = false;
        return h71Var;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
