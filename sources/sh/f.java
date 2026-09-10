package sh;

import ai.t;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.c2;
import bi.t2;
import bi.u2;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Components.wr;
import org.telegram.ui.u5;
import org.telegram.ui.web.y1;
import r0.a0;
import s4.j;
import sg.w0;
import w7.a6;
import w7.c6;
public final class f extends ab implements le.d {
    public static final int f42043r0 = 0;
    public final le.e X;
    public final le.b Y;
    public final HashMap Z;
    public final ArrayList f42044a0;
    public final ArrayList f42045b0;
    public String f42046c0;
    public j61 f42047d0;
    public final bi.d f42048e0;
    public final t f42049f0;
    public final u5 f42050g0;
    public final o20 f42051h0;
    public final u3 f42052i0;
    public final HashMap f42053j0;
    public g3 f42054k0;
    public int f42055l0;
    public final int m0;
    public final FrameLayout f42056n0;
    public HashSet f42057o0;
    public final Rect f42058p0;
    public w30 f42059q0;

    public f(Context context, f6 f6Var) {
        super(context, f6Var, true);
        String country;
        wr wrVar = wr.h;
        this.X = new le.e(3, this, wrVar, 350L);
        this.Y = new le.b(4, this, wrVar, 320L, false);
        this.Z = new HashMap();
        this.f42044a0 = new ArrayList();
        this.f42045b0 = new ArrayList();
        this.f42053j0 = new HashMap();
        this.f42058p0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.f21455w = false;
        this.m0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new al0(this, 11));
        this.d.setOnItemClickListener(new c(context, f6Var, this));
        bi.d dVar = new bi.d(context, f6Var, true);
        this.f42048e0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        t tVar = new t(this, context);
        this.f42049f0 = tVar;
        tVar.setTextColor(getThemedColor(j6.Sh));
        tVar.setText(LocaleController.getString(R.string.Save));
        tVar.setTypeface(AndroidUtilities.bold());
        tVar.setTextSize(1, 14.0f);
        tVar.setGravity(17);
        tVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        tVar.setVisibility(8);
        c6.a(tVar);
        this.e.n().addView(tVar, a6.t(-2, 48, 16, 12, 0, 12, 0));
        tVar.setOnClickListener(new a(this, 1));
        k20 k20Var = new k20(context, f6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        t2 t2Var = k20Var.f24572r;
        t2Var.setHint(string);
        t2Var.addTextChangedListener(new u2(this, 17));
        o20 o20Var = new o20(context, this.currentAccount);
        this.f42051h0 = o20Var;
        o20Var.setDelegate(new b(this));
        u5 u5Var = new u5(context, f6Var, this);
        this.f42050g0 = u5Var;
        int i11 = this.backgroundPaddingLeft;
        u5Var.setPadding(i11, 0, i11, 0);
        u5Var.addView(k20Var, a6.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        u5Var.addView(o20Var, a6.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        u3 u3Var = new u3(context, 18, f6Var);
        this.f42052i0 = u3Var;
        u3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        u3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        u5Var.addView(u3Var, a6.e(-1, 32, 48));
        this.containerView.addView(u5Var, a6.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, a6.c(48.0f, -1));
        this.containerView.addView(frameLayout, a6.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f42056n0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, a6.e(-1, 150, 80));
        j jVar = new j();
        jVar.n(350L);
        jVar.o(wrVar);
        jVar.C = false;
        jVar.f41645m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new d(this, f6Var));
        y1 y1Var = new y1(this, 8);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
            country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new c2(y1Var, 17));
        a0.j(getContainer(), new b(this));
    }

    public static void P(f fVar, Pair pair) {
        HashMap hashMap = fVar.f42053j0;
        HashMap hashMap2 = fVar.Z;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.f42044a0;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new w0(fVar, 1));
        HashSet hashSet = fVar.f42057o0;
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
                    w30 w30Var = new w30(fVar.getContext(), tL_help_country);
                    w30Var.setOnClickListener(new a(fVar, 3));
                    fVar.f42051h0.a(w30Var);
                    hashMap.put(tL_help_country.iso2, w30Var);
                }
            }
        }
        fVar.f42047d0.N(true);
        fVar.f42048e0.b(hashMap.size(), true);
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 3) {
            Q();
            this.f42052i0.setTranslationY(AndroidUtilities.dp(48.0f) + f7);
            this.f42050g0.invalidate();
        } else if (i10 == 4) {
            h20.d(this.f42049f0, f7);
        }
    }

    public final void Q() {
        boolean z10;
        int dp = AndroidUtilities.dp(56.0f) + l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.X.e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.f42058p0;
        if (rect.top == dp && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        vl0 vl0Var = this.d;
        vl0Var.setClipBounds(rect);
        if (z10) {
            vl0Var.invalidate();
        }
    }

    public final void R() {
        vl0 vl0Var;
        float f7 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            vl0Var = this.d;
            if (i10 >= vl0Var.getChildCount()) {
                break;
            }
            View childAt = vl0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7 + AndroidUtilities.dp(8.0f));
        u5 u5Var = this.f42050g0;
        if (u5Var.getTranslationY() != max) {
            u5Var.setTranslationY(max);
            vl0Var.invalidate();
        }
    }

    public final void S(View view) {
        w30 w30Var = (w30) view;
        if (w30Var.f28653y) {
            this.f42059q0 = null;
            this.f42051h0.c(w30Var);
            String countryIso2 = w30Var.getCountryIso2();
            HashMap hashMap = this.f42053j0;
            hashMap.remove(countryIso2);
            this.f42048e0.b(hashMap.size(), true);
            this.f42047d0.N(true);
            return;
        }
        w30 w30Var2 = this.f42059q0;
        if (w30Var2 != null) {
            w30Var2.a();
        }
        this.f42059q0 = w30Var;
        w30Var.b();
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Q();
        R();
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.currentAccount, 0, true, new gi.a(this, 8), this.resourcesProvider);
        this.f42047d0 = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
