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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.x20;
import org.telegram.ui.s5;
import r0.a0;
import s4.j;
import tg.t0;
import w7.x5;
import w7.z5;
public final class f extends db implements me.d {
    public static final int f48589r0 = 0;
    public final me.e X;
    public final me.b Y;
    public final HashMap Z;
    public final ArrayList f48590a0;
    public final ArrayList f48591b0;
    public String f48592c0;
    public d71 f48593d0;
    public final ci.d f48594e0;
    public final o f48595f0;
    public final s5 f48596g0;
    public final x20 f48597h0;
    public final v3 f48598i0;
    public final HashMap f48599j0;
    public t f48600k0;
    public int f48601l0;
    public final int m0;
    public final FrameLayout f48602n0;
    public HashSet f48603o0;
    public final Rect f48604p0;
    public e40 f48605q0;

    public f(Context context, d6 d6Var) {
        super(context, d6Var, true);
        String country;
        is isVar = is.h;
        this.X = new me.e(3, this, isVar, 350L);
        this.Y = new me.b(4, this, isVar, 320L, false);
        this.Z = new HashMap();
        this.f48590a0 = new ArrayList();
        this.f48591b0 = new ArrayList();
        this.f48599j0 = new HashMap();
        this.f48604p0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.f25739w = false;
        this.m0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        rm0 rm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        rm0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new nh0(this, 16));
        this.d.setOnItemClickListener(new c(context, d6Var, this));
        ci.d dVar = new ci.d(context, d6Var, true);
        this.f48594e0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        o oVar = new o(this, context);
        this.f48595f0 = oVar;
        oVar.setTextColor(getThemedColor(h6.Sh));
        oVar.setText(LocaleController.getString(R.string.Save));
        oVar.setTypeface(AndroidUtilities.bold());
        oVar.setTextSize(1, 14.0f);
        oVar.setGravity(17);
        oVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        oVar.setVisibility(8);
        z5.a(oVar);
        this.f25734e.o().addView(oVar, x5.t(-2, 48, 16, 12, 0, 12, 0));
        oVar.setOnClickListener(new a(this, 1));
        t20 t20Var = new t20(context, d6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        g2 g2Var = t20Var.f31038r;
        g2Var.setHint(string);
        g2Var.addTextChangedListener(new h2(this, 20));
        x20 x20Var = new x20(context, this.currentAccount);
        this.f48597h0 = x20Var;
        x20Var.setDelegate(new b(this));
        s5 s5Var = new s5(context, d6Var, this);
        this.f48596g0 = s5Var;
        int i11 = this.backgroundPaddingLeft;
        s5Var.setPadding(i11, 0, i11, 0);
        s5Var.addView(t20Var, x5.a(40.0f, 10.0f, 0.0f, 10.0f, 0.0f, -1, 48));
        s5Var.addView(x20Var, x5.a(144.0f, -3.0f, 40.0f, -3.0f, 0.0f, -1, 48));
        v3 v3Var = new v3(context, 18, d6Var);
        this.f48598i0 = v3Var;
        v3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        v3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        s5Var.addView(v3Var, x5.e(-1, 32, 48));
        this.containerView.addView(s5Var, x5.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, x5.d(48.0f, -1));
        this.containerView.addView(frameLayout, x5.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f48602n0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, x5.e(-1, 150, 80));
        j jVar = new j();
        jVar.n(350L);
        jVar.o(isVar);
        jVar.C = false;
        jVar.f47822m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new d(this, d6Var));
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
        HashMap hashMap = fVar.f48599j0;
        HashMap hashMap2 = fVar.Z;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.f48590a0;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new t0(fVar, 1));
        HashSet hashSet = fVar.f48603o0;
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
                    e40 e40Var = new e40(fVar.getContext(), tL_help_country);
                    e40Var.setOnClickListener(new a(fVar, 3));
                    fVar.f48597h0.a(e40Var);
                    hashMap.put(tL_help_country.iso2, e40Var);
                }
            }
        }
        fVar.f48593d0.N(true);
        fVar.f48594e0.b(hashMap.size(), true);
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    public final void R() {
        boolean z10;
        int dp = AndroidUtilities.dp(56.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.X.f16409e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.f48604p0;
        if (rect.top == dp && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        rm0 rm0Var = this.d;
        rm0Var.setClipBounds(rect);
        if (z10) {
            rm0Var.invalidate();
        }
    }

    public final void S() {
        rm0 rm0Var;
        float f7 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            rm0Var = this.d;
            if (i10 >= rm0Var.getChildCount()) {
                break;
            }
            View childAt = rm0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7 + AndroidUtilities.dp(8.0f));
        s5 s5Var = this.f48596g0;
        if (s5Var.getTranslationY() != max) {
            s5Var.setTranslationY(max);
            rm0Var.invalidate();
        }
    }

    public final void T(View view) {
        e40 e40Var = (e40) view;
        if (e40Var.f25978y) {
            this.f48605q0 = null;
            this.f48597h0.c(e40Var);
            String countryIso2 = e40Var.getCountryIso2();
            HashMap hashMap = this.f48599j0;
            hashMap.remove(countryIso2);
            this.f48594e0.b(hashMap.size(), true);
            this.f48593d0.N(true);
            return;
        }
        e40 e40Var2 = this.f48605q0;
        if (e40Var2 != null) {
            e40Var2.a();
        }
        this.f48605q0 = e40Var;
        e40Var.b();
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 3) {
            R();
            this.f48598i0.setTranslationY(AndroidUtilities.dp(48.0f) + f7);
            this.f48596g0.invalidate();
        } else if (i10 == 4) {
            q20.d(this.f48595f0, f7);
        }
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        R();
        S();
    }

    @Override
    public final qm0 x(rm0 rm0Var) {
        d71 d71Var = new d71(rm0Var, getContext(), this.currentAccount, 0, true, new hi.a(this, 8), this.resourcesProvider);
        this.f48593d0 = d71Var;
        d71Var.f25649r = false;
        return d71Var;
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
