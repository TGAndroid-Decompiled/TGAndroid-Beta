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
import m2.t;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.w20;
import org.telegram.ui.t5;
import r0.a0;
import s4.j;
import tg.u0;
import w7.x5;
import w7.z5;
public final class f extends eb implements me.d {
    public static final int f48465r0 = 0;
    public final me.e X;
    public final me.b Y;
    public final HashMap Z;
    public final ArrayList f48466a0;
    public final ArrayList f48467b0;
    public String f48468c0;
    public c71 f48469d0;
    public final ci.d f48470e0;
    public final o f48471f0;
    public final t5 f48472g0;
    public final w20 f48473h0;
    public final v3 f48474i0;
    public final HashMap f48475j0;
    public t f48476k0;
    public int f48477l0;
    public final int m0;
    public final FrameLayout f48478n0;
    public HashSet f48479o0;
    public final Rect f48480p0;
    public d40 f48481q0;

    public f(Context context, e6 e6Var) {
        super(context, e6Var, true);
        String country;
        hs hsVar = hs.h;
        this.X = new me.e(3, this, hsVar, 350L);
        this.Y = new me.b(4, this, hsVar, 320L, false);
        this.Z = new HashMap();
        this.f48466a0 = new ArrayList();
        this.f48467b0 = new ArrayList();
        this.f48475j0 = new HashMap();
        this.f48480p0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.f26028w = false;
        this.m0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        qm0 qm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new mh0(this, 16));
        this.d.setOnItemClickListener(new c(context, e6Var, this));
        ci.d dVar = new ci.d(context, e6Var, true);
        this.f48470e0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        o oVar = new o(this, context);
        this.f48471f0 = oVar;
        oVar.setTextColor(getThemedColor(i6.Sh));
        oVar.setText(LocaleController.getString(R.string.Save));
        oVar.setTypeface(AndroidUtilities.bold());
        oVar.setTextSize(1, 14.0f);
        oVar.setGravity(17);
        oVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        oVar.setVisibility(8);
        z5.a(oVar);
        this.f26023e.o().addView(oVar, x5.t(-2, 48, 16, 12, 0, 12, 0));
        oVar.setOnClickListener(new a(this, 1));
        s20 s20Var = new s20(context, e6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        g2 g2Var = s20Var.f30614r;
        g2Var.setHint(string);
        g2Var.addTextChangedListener(new h2(this, 20));
        w20 w20Var = new w20(context, this.currentAccount);
        this.f48473h0 = w20Var;
        w20Var.setDelegate(new b(this));
        t5 t5Var = new t5(context, e6Var, this);
        this.f48472g0 = t5Var;
        int i11 = this.backgroundPaddingLeft;
        t5Var.setPadding(i11, 0, i11, 0);
        t5Var.addView(s20Var, x5.a(40.0f, 10.0f, 0.0f, 10.0f, 0.0f, -1, 48));
        t5Var.addView(w20Var, x5.a(144.0f, -3.0f, 40.0f, -3.0f, 0.0f, -1, 48));
        v3 v3Var = new v3(context, 18, e6Var);
        this.f48474i0 = v3Var;
        v3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        v3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        t5Var.addView(v3Var, x5.e(-1, 32, 48));
        this.containerView.addView(t5Var, x5.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, x5.d(48.0f, -1));
        this.containerView.addView(frameLayout, x5.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f48478n0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, x5.e(-1, 150, 80));
        j jVar = new j();
        jVar.n(350L);
        jVar.o(hsVar);
        jVar.C = false;
        jVar.f47698m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new d(this, e6Var));
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
        HashMap hashMap = fVar.f48475j0;
        HashMap hashMap2 = fVar.Z;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.f48466a0;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new u0(fVar, 1));
        HashSet hashSet = fVar.f48479o0;
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
                    d40 d40Var = new d40(fVar.getContext(), tL_help_country);
                    d40Var.setOnClickListener(new a(fVar, 3));
                    fVar.f48473h0.a(d40Var);
                    hashMap.put(tL_help_country.iso2, d40Var);
                }
            }
        }
        fVar.f48469d0.N(true);
        fVar.f48470e0.b(hashMap.size(), true);
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    public final void R() {
        boolean z10;
        int dp = AndroidUtilities.dp(56.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.X.f16345e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.f48480p0;
        if (rect.top == dp && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        qm0 qm0Var = this.d;
        qm0Var.setClipBounds(rect);
        if (z10) {
            qm0Var.invalidate();
        }
    }

    public final void S() {
        qm0 qm0Var;
        float f7 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            qm0Var = this.d;
            if (i10 >= qm0Var.getChildCount()) {
                break;
            }
            View childAt = qm0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7 + AndroidUtilities.dp(8.0f));
        t5 t5Var = this.f48472g0;
        if (t5Var.getTranslationY() != max) {
            t5Var.setTranslationY(max);
            qm0Var.invalidate();
        }
    }

    public final void T(View view) {
        d40 d40Var = (d40) view;
        if (d40Var.f25593y) {
            this.f48481q0 = null;
            this.f48473h0.c(d40Var);
            String countryIso2 = d40Var.getCountryIso2();
            HashMap hashMap = this.f48475j0;
            hashMap.remove(countryIso2);
            this.f48470e0.b(hashMap.size(), true);
            this.f48469d0.N(true);
            return;
        }
        d40 d40Var2 = this.f48481q0;
        if (d40Var2 != null) {
            d40Var2.a();
        }
        this.f48481q0 = d40Var;
        d40Var.b();
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 3) {
            R();
            this.f48474i0.setTranslationY(AndroidUtilities.dp(48.0f) + f7);
            this.f48472g0.invalidate();
        } else if (i10 == 4) {
            p20.d(this.f48471f0, f7);
        }
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        R();
        S();
    }

    @Override
    public final pm0 x(qm0 qm0Var) {
        c71 c71Var = new c71(qm0Var, getContext(), this.currentAccount, 0, true, new hi.a(this, 8), this.resourcesProvider);
        this.f48469d0 = c71Var;
        c71Var.f25280r = false;
        return c71Var;
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
