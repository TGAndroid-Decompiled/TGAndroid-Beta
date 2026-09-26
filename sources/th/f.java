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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.t5;
import r0.a0;
import s4.j;
import tg.u0;
import w7.a6;
import w7.y5;
public final class f extends bb implements le.e {
    public static final int f43541r0 = 0;
    public final le.f X;
    public final le.c Y;
    public final HashMap Z;
    public final ArrayList f43542a0;
    public final ArrayList f43543b0;
    public String f43544c0;
    public k61 f43545d0;
    public final ci.d f43546e0;
    public final o f43547f0;
    public final t5 f43548g0;
    public final h20 f43549h0;
    public final v3 f43550i0;
    public final HashMap f43551j0;
    public l.d f43552k0;
    public int f43553l0;
    public final int m0;
    public final FrameLayout f43554n0;
    public HashSet f43555o0;
    public final Rect f43556p0;
    public o30 f43557q0;

    public f(Context context, d6 d6Var) {
        super(context, d6Var, true);
        String country;
        sr srVar = sr.h;
        this.X = new le.f(3, this, srVar, 350L);
        this.Y = new le.c(4, this, srVar, 320L, false);
        this.Z = new HashMap();
        this.f43542a0 = new ArrayList();
        this.f43543b0 = new ArrayList();
        this.f43551j0 = new HashMap();
        this.f43556p0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.f22961w = false;
        this.m0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        xl0 xl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        xl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new vg0(this, 13));
        this.d.setOnItemClickListener(new c(context, d6Var, this));
        ci.d dVar = new ci.d(context, d6Var, true);
        this.f43546e0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        o oVar = new o(this, context);
        this.f43547f0 = oVar;
        oVar.setTextColor(getThemedColor(h6.Sh));
        oVar.setText(LocaleController.getString(R.string.Save));
        oVar.setTypeface(AndroidUtilities.bold());
        oVar.setTextSize(1, 14.0f);
        oVar.setGravity(17);
        oVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        oVar.setVisibility(8);
        a6.a(oVar);
        this.e.n().addView(oVar, y5.t(-2, 48, 16, 12, 0, 12, 0));
        oVar.setOnClickListener(new a(this, 1));
        d20 d20Var = new d20(context, d6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        h2 h2Var = d20Var.f23475r;
        h2Var.setHint(string);
        h2Var.addTextChangedListener(new i2(this, 17));
        h20 h20Var = new h20(context, this.currentAccount);
        this.f43549h0 = h20Var;
        h20Var.setDelegate(new b(this));
        t5 t5Var = new t5(context, d6Var, this);
        this.f43548g0 = t5Var;
        int i11 = this.backgroundPaddingLeft;
        t5Var.setPadding(i11, 0, i11, 0);
        t5Var.addView(d20Var, y5.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        t5Var.addView(h20Var, y5.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        v3 v3Var = new v3(context, 18, d6Var);
        this.f43550i0 = v3Var;
        v3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        v3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        t5Var.addView(v3Var, y5.e(-1, 32, 48));
        this.containerView.addView(t5Var, y5.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, y5.c(48.0f, -1));
        this.containerView.addView(frameLayout, y5.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f43554n0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, y5.e(-1, 150, 80));
        j jVar = new j();
        jVar.n(350L);
        jVar.o(srVar);
        jVar.C = false;
        jVar.f42994m = false;
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

    public static void P(f fVar, Pair pair) {
        HashMap hashMap = fVar.f43551j0;
        HashMap hashMap2 = fVar.Z;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.f43542a0;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new u0(fVar, 1));
        HashSet hashSet = fVar.f43555o0;
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
                    o30 o30Var = new o30(fVar.getContext(), tL_help_country);
                    o30Var.setOnClickListener(new a(fVar, 3));
                    fVar.f43549h0.a(o30Var);
                    hashMap.put(tL_help_country.iso2, o30Var);
                }
            }
        }
        fVar.f43545d0.N(true);
        fVar.f43546e0.b(hashMap.size(), true);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 3) {
            Q();
            this.f43550i0.setTranslationY(AndroidUtilities.dp(48.0f) + f7);
            this.f43548g0.invalidate();
        } else if (i10 == 4) {
            a20.d(this.f43547f0, f7);
        }
    }

    public final void Q() {
        boolean z10;
        int dp = AndroidUtilities.dp(56.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.X.e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.f43556p0;
        if (rect.top == dp && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        xl0 xl0Var = this.d;
        xl0Var.setClipBounds(rect);
        if (z10) {
            xl0Var.invalidate();
        }
    }

    public final void R() {
        xl0 xl0Var;
        float f7 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            xl0Var = this.d;
            if (i10 >= xl0Var.getChildCount()) {
                break;
            }
            View childAt = xl0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7 + AndroidUtilities.dp(8.0f));
        t5 t5Var = this.f43548g0;
        if (t5Var.getTranslationY() != max) {
            t5Var.setTranslationY(max);
            xl0Var.invalidate();
        }
    }

    public final void S(View view) {
        o30 o30Var = (o30) view;
        if (o30Var.f26928y) {
            this.f43557q0 = null;
            this.f43549h0.c(o30Var);
            String countryIso2 = o30Var.getCountryIso2();
            HashMap hashMap = this.f43551j0;
            hashMap.remove(countryIso2);
            this.f43546e0.b(hashMap.size(), true);
            this.f43545d0.N(true);
            return;
        }
        o30 o30Var2 = this.f43557q0;
        if (o30Var2 != null) {
            o30Var2.a();
        }
        this.f43557q0 = o30Var;
        o30Var.b();
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Q();
        R();
    }

    @Override
    public final wl0 v(xl0 xl0Var) {
        k61 k61Var = new k61(xl0Var, getContext(), this.currentAccount, 0, true, new hi.a(this, 8), this.resourcesProvider);
        this.f43545d0 = k61Var;
        k61Var.f25644r = false;
        return k61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
