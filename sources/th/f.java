package th;

import ai.n8;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.o;
import ci.h2;
import ci.i2;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.u5;
import r0.a0;
import s4.j;
import tg.u0;
import w7.b6;
import w7.z5;
public final class f extends cb implements le.d {
    public static final int f47150r0 = 0;
    public final le.e X;
    public final le.b Y;
    public final HashMap Z;
    public final ArrayList f47151a0;
    public final ArrayList f47152b0;
    public String f47153c0;
    public u61 f47154d0;
    public final ci.d f47155e0;
    public final o f47156f0;
    public final u5 f47157g0;
    public final j20 f47158h0;
    public final v3 f47159i0;
    public final HashMap f47160j0;
    public l2.g f47161k0;
    public int f47162l0;
    public final int m0;
    public final FrameLayout f47163n0;
    public HashSet f47164o0;
    public final Rect f47165p0;
    public q30 f47166q0;

    public f(Context context, d6 d6Var) {
        super(context, d6Var, true);
        String country;
        tr trVar = tr.h;
        this.X = new le.e(3, this, trVar, 350L);
        this.Y = new le.b(4, this, trVar, 320L, false);
        this.Z = new HashMap();
        this.f47151a0 = new ArrayList();
        this.f47152b0 = new ArrayList();
        this.f47160j0 = new HashMap();
        this.f47165p0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.f25306w = false;
        this.m0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        zl0 zl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new xb0(this, 15));
        this.d.setOnItemClickListener(new c(context, d6Var, this));
        ci.d dVar = new ci.d(context, d6Var, true);
        this.f47155e0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        o oVar = new o(this, context);
        this.f47156f0 = oVar;
        oVar.setTextColor(getThemedColor(i6.Sh));
        oVar.setText(LocaleController.getString(R.string.Save));
        oVar.setTypeface(AndroidUtilities.bold());
        oVar.setTextSize(1, 14.0f);
        oVar.setGravity(17);
        oVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        oVar.setVisibility(8);
        b6.a(oVar);
        this.f25301e.n().addView(oVar, z5.t(-2, 48, 16, 12, 0, 12, 0));
        oVar.setOnClickListener(new a(this, 1));
        f20 f20Var = new f20(context, d6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        h2 h2Var = f20Var.f26246r;
        h2Var.setHint(string);
        h2Var.addTextChangedListener(new i2(this, 17));
        j20 j20Var = new j20(context, this.currentAccount);
        this.f47158h0 = j20Var;
        j20Var.setDelegate(new b(this));
        u5 u5Var = new u5(context, d6Var, this);
        this.f47157g0 = u5Var;
        int i11 = this.backgroundPaddingLeft;
        u5Var.setPadding(i11, 0, i11, 0);
        u5Var.addView(f20Var, z5.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        u5Var.addView(j20Var, z5.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        v3 v3Var = new v3(context, 18, d6Var);
        this.f47159i0 = v3Var;
        v3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        v3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        u5Var.addView(v3Var, z5.e(-1, 32, 48));
        this.containerView.addView(u5Var, z5.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, z5.c(48.0f, -1));
        this.containerView.addView(frameLayout, z5.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f47163n0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, z5.e(-1, 150, 80));
        j jVar = new j();
        jVar.n(350L);
        jVar.o(trVar);
        jVar.C = false;
        jVar.f46562m = false;
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
        connectionsManager.sendRequest(tL_help_getCountriesList, new n8(q1Var, 20));
        a0.j(getContainer(), new b(this));
    }

    public static void N(f fVar, Pair pair) {
        HashMap hashMap = fVar.f47160j0;
        HashMap hashMap2 = fVar.Z;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.f47151a0;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new u0(fVar, 1));
        HashSet hashSet = fVar.f47164o0;
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
                    q30 q30Var = new q30(fVar.getContext(), tL_help_country);
                    q30Var.setOnClickListener(new a(fVar, 3));
                    fVar.f47158h0.a(q30Var);
                    hashMap.put(tL_help_country.iso2, q30Var);
                }
            }
        }
        fVar.f47154d0.N(true);
        fVar.f47155e0.b(hashMap.size(), true);
    }

    public final void O() {
        boolean z10;
        int dp = AndroidUtilities.dp(56.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.X.f15442e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.f47165p0;
        if (rect.top == dp && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        zl0 zl0Var = this.d;
        zl0Var.setClipBounds(rect);
        if (z10) {
            zl0Var.invalidate();
        }
    }

    public final void P() {
        zl0 zl0Var;
        float f7 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            zl0Var = this.d;
            if (i10 >= zl0Var.getChildCount()) {
                break;
            }
            View childAt = zl0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7 + AndroidUtilities.dp(8.0f));
        u5 u5Var = this.f47157g0;
        if (u5Var.getTranslationY() != max) {
            u5Var.setTranslationY(max);
            zl0Var.invalidate();
        }
    }

    public final void Q(View view) {
        q30 q30Var = (q30) view;
        if (q30Var.f29879y) {
            this.f47166q0 = null;
            this.f47158h0.c(q30Var);
            String countryIso2 = q30Var.getCountryIso2();
            HashMap hashMap = this.f47160j0;
            hashMap.remove(countryIso2);
            this.f47155e0.b(hashMap.size(), true);
            this.f47154d0.N(true);
            return;
        }
        q30 q30Var2 = this.f47166q0;
        if (q30Var2 != null) {
            q30Var2.a();
        }
        this.f47166q0 = q30Var;
        q30Var.b();
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 3) {
            O();
            this.f47159i0.setTranslationY(AndroidUtilities.dp(48.0f) + f7);
            this.f47157g0.invalidate();
        } else if (i10 == 4) {
            c20.d(this.f47156f0, f7);
        }
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        O();
        P();
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        u61 u61Var = new u61(zl0Var, getContext(), this.currentAccount, 0, true, new hi.a(this, 8), this.resourcesProvider);
        this.f47154d0 = u61Var;
        u61Var.f31306r = false;
        return u61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
