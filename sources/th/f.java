package th;

import ai.m8;
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
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k2.u;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.za;
import org.telegram.ui.t5;
import org.telegram.ui.web.b1;
import r0.a0;
import s4.j;
import tg.v0;
import w7.x5;
import w7.z5;
public final class f extends za implements le.d {
    public static final int f43281r0 = 0;
    public final le.e X;
    public final le.b Y;
    public final HashMap Z;
    public final ArrayList f43282a0;
    public final ArrayList f43283b0;
    public String f43284c0;
    public x51 f43285d0;
    public final ci.d f43286e0;
    public final o f43287f0;
    public final t5 f43288g0;
    public final f20 f43289h0;
    public final u3 f43290i0;
    public final HashMap f43291j0;
    public u f43292k0;
    public int f43293l0;
    public final int m0;
    public final FrameLayout f43294n0;
    public HashSet f43295o0;
    public final Rect f43296p0;
    public m30 f43297q0;

    public f(Context context, f6 f6Var) {
        super(context, f6Var, true);
        String country;
        qr qrVar = qr.h;
        this.X = new le.e(3, this, qrVar, 350L);
        this.Y = new le.b(4, this, qrVar, 320L, false);
        this.Z = new HashMap();
        this.f43282a0 = new ArrayList();
        this.f43283b0 = new ArrayList();
        this.f43291j0 = new HashMap();
        this.f43296p0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.f30454w = false;
        this.m0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        ml0 ml0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new kb0(this, 15));
        this.d.setOnItemClickListener(new c(context, f6Var, this));
        ci.d dVar = new ci.d(context, f6Var, true);
        this.f43286e0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        o oVar = new o(this, context);
        this.f43287f0 = oVar;
        oVar.setTextColor(getThemedColor(j6.Sh));
        oVar.setText(LocaleController.getString(R.string.Save));
        oVar.setTypeface(AndroidUtilities.bold());
        oVar.setTextSize(1, 14.0f);
        oVar.setGravity(17);
        oVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        oVar.setVisibility(8);
        z5.a(oVar);
        this.e.n().addView(oVar, x5.t(-2, 48, 16, 12, 0, 12, 0));
        oVar.setOnClickListener(new a(this, 1));
        b20 b20Var = new b20(context, f6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        h2 h2Var = b20Var.f22543r;
        h2Var.setHint(string);
        h2Var.addTextChangedListener(new i2(this, 17));
        f20 f20Var = new f20(context, this.currentAccount);
        this.f43289h0 = f20Var;
        f20Var.setDelegate(new b(this));
        t5 t5Var = new t5(context, f6Var, this);
        this.f43288g0 = t5Var;
        int i11 = this.backgroundPaddingLeft;
        t5Var.setPadding(i11, 0, i11, 0);
        t5Var.addView(b20Var, x5.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        t5Var.addView(f20Var, x5.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        u3 u3Var = new u3(context, 18, f6Var);
        this.f43290i0 = u3Var;
        u3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        u3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        t5Var.addView(u3Var, x5.e(-1, 32, 48));
        this.containerView.addView(t5Var, x5.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, x5.c(48.0f, -1));
        this.containerView.addView(frameLayout, x5.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f43294n0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, x5.e(-1, 150, 80));
        j jVar = new j();
        jVar.n(350L);
        jVar.o(qrVar);
        jVar.C = false;
        jVar.f42732m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new d(this, f6Var));
        b1 b1Var = new b1(this, 12);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
            country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new m8(b1Var, 20));
        a0.j(getContainer(), new b(this));
    }

    public static void P(f fVar, Pair pair) {
        HashMap hashMap = fVar.f43291j0;
        HashMap hashMap2 = fVar.Z;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.f43282a0;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new v0(fVar, 1));
        HashSet hashSet = fVar.f43295o0;
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
                    m30 m30Var = new m30(fVar.getContext(), tL_help_country);
                    m30Var.setOnClickListener(new a(fVar, 3));
                    fVar.f43289h0.a(m30Var);
                    hashMap.put(tL_help_country.iso2, m30Var);
                }
            }
        }
        fVar.f43285d0.N(true);
        fVar.f43286e0.b(hashMap.size(), true);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 3) {
            Q();
            this.f43290i0.setTranslationY(AndroidUtilities.dp(48.0f) + f7);
            this.f43288g0.invalidate();
        } else if (i10 == 4) {
            y10.d(this.f43287f0, f7);
        }
    }

    public final void Q() {
        boolean z10;
        int dp = AndroidUtilities.dp(56.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.X.e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.f43296p0;
        if (rect.top == dp && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        ml0 ml0Var = this.d;
        ml0Var.setClipBounds(rect);
        if (z10) {
            ml0Var.invalidate();
        }
    }

    public final void R() {
        ml0 ml0Var;
        float f7 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            ml0Var = this.d;
            if (i10 >= ml0Var.getChildCount()) {
                break;
            }
            View childAt = ml0Var.getChildAt(i10);
            if (RecyclerView.S(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7 + AndroidUtilities.dp(8.0f));
        t5 t5Var = this.f43288g0;
        if (t5Var.getTranslationY() != max) {
            t5Var.setTranslationY(max);
            ml0Var.invalidate();
        }
    }

    public final void S(View view) {
        m30 m30Var = (m30) view;
        if (m30Var.f26038y) {
            this.f43297q0 = null;
            this.f43289h0.c(m30Var);
            String countryIso2 = m30Var.getCountryIso2();
            HashMap hashMap = this.f43291j0;
            hashMap.remove(countryIso2);
            this.f43286e0.b(hashMap.size(), true);
            this.f43285d0.N(true);
            return;
        }
        m30 m30Var2 = this.f43297q0;
        if (m30Var2 != null) {
            m30Var2.a();
        }
        this.f43297q0 = m30Var;
        m30Var.b();
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Q();
        R();
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        x51 x51Var = new x51(ml0Var, getContext(), this.currentAccount, 0, true, new hi.a(this, 8), this.resourcesProvider);
        this.f43285d0 = x51Var;
        x51Var.f29851r = false;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
