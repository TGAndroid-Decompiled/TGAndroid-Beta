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
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.t5;
import org.telegram.ui.web.b1;
import r0.a0;
import s4.j;
import tg.u0;
import w7.a6;
import w7.y5;
public final class f extends ab implements le.d {
    public static final int f43578r0 = 0;
    public final le.e X;
    public final le.b Y;
    public final HashMap Z;
    public final ArrayList f43579a0;
    public final ArrayList f43580b0;
    public String f43581c0;
    public m61 f43582d0;
    public final ci.d f43583e0;
    public final o f43584f0;
    public final t5 f43585g0;
    public final f20 f43586h0;
    public final w3 f43587i0;
    public final HashMap f43588j0;
    public l.d f43589k0;
    public int f43590l0;
    public final int m0;
    public final FrameLayout f43591n0;
    public HashSet f43592o0;
    public final Rect f43593p0;
    public m30 f43594q0;

    public f(Context context, f6 f6Var) {
        super(context, f6Var, true);
        String country;
        qr qrVar = qr.h;
        this.X = new le.e(3, this, qrVar, 350L);
        this.Y = new le.b(4, this, qrVar, 320L, false);
        this.Z = new HashMap();
        this.f43579a0 = new ArrayList();
        this.f43580b0 = new ArrayList();
        this.f43588j0 = new HashMap();
        this.f43593p0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.f22605w = false;
        this.m0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        yl0 yl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        yl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new vb0(this, 15));
        this.d.setOnItemClickListener(new c(context, f6Var, this));
        ci.d dVar = new ci.d(context, f6Var, true);
        this.f43583e0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        o oVar = new o(this, context);
        this.f43584f0 = oVar;
        oVar.setTextColor(getThemedColor(j6.Sh));
        oVar.setText(LocaleController.getString(R.string.Save));
        oVar.setTypeface(AndroidUtilities.bold());
        oVar.setTextSize(1, 14.0f);
        oVar.setGravity(17);
        oVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        oVar.setVisibility(8);
        a6.a(oVar);
        this.e.n().addView(oVar, y5.t(-2, 48, 16, 12, 0, 12, 0));
        oVar.setOnClickListener(new a(this, 1));
        b20 b20Var = new b20(context, f6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        h2 h2Var = b20Var.f22811r;
        h2Var.setHint(string);
        h2Var.addTextChangedListener(new i2(this, 17));
        f20 f20Var = new f20(context, this.currentAccount);
        this.f43586h0 = f20Var;
        f20Var.setDelegate(new b(this));
        t5 t5Var = new t5(context, f6Var, this);
        this.f43585g0 = t5Var;
        int i11 = this.backgroundPaddingLeft;
        t5Var.setPadding(i11, 0, i11, 0);
        t5Var.addView(b20Var, y5.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        t5Var.addView(f20Var, y5.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        w3 w3Var = new w3(context, 18, f6Var);
        this.f43587i0 = w3Var;
        w3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        w3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        t5Var.addView(w3Var, y5.e(-1, 32, 48));
        this.containerView.addView(t5Var, y5.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, y5.c(48.0f, -1));
        this.containerView.addView(frameLayout, y5.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f43591n0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, y5.e(-1, 150, 80));
        j jVar = new j();
        jVar.n(350L);
        jVar.o(qrVar);
        jVar.C = false;
        jVar.f43030m = false;
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
        HashMap hashMap = fVar.f43588j0;
        HashMap hashMap2 = fVar.Z;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.f43579a0;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new u0(fVar, 1));
        HashSet hashSet = fVar.f43592o0;
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
                    fVar.f43586h0.a(m30Var);
                    hashMap.put(tL_help_country.iso2, m30Var);
                }
            }
        }
        fVar.f43582d0.N(true);
        fVar.f43583e0.b(hashMap.size(), true);
    }

    @Override
    public final void H(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 3) {
            Q();
            this.f43587i0.setTranslationY(AndroidUtilities.dp(48.0f) + f7);
            this.f43585g0.invalidate();
        } else if (i10 == 4) {
            y10.d(this.f43584f0, f7);
        }
    }

    public final void Q() {
        boolean z10;
        int dp = AndroidUtilities.dp(56.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.X.e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.f43593p0;
        if (rect.top == dp && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        yl0 yl0Var = this.d;
        yl0Var.setClipBounds(rect);
        if (z10) {
            yl0Var.invalidate();
        }
    }

    public final void R() {
        yl0 yl0Var;
        float f7 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            yl0Var = this.d;
            if (i10 >= yl0Var.getChildCount()) {
                break;
            }
            View childAt = yl0Var.getChildAt(i10);
            if (RecyclerView.S(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7 + AndroidUtilities.dp(8.0f));
        t5 t5Var = this.f43585g0;
        if (t5Var.getTranslationY() != max) {
            t5Var.setTranslationY(max);
            yl0Var.invalidate();
        }
    }

    public final void S(View view) {
        m30 m30Var = (m30) view;
        if (m30Var.f26305y) {
            this.f43594q0 = null;
            this.f43586h0.c(m30Var);
            String countryIso2 = m30Var.getCountryIso2();
            HashMap hashMap = this.f43588j0;
            hashMap.remove(countryIso2);
            this.f43583e0.b(hashMap.size(), true);
            this.f43582d0.N(true);
            return;
        }
        m30 m30Var2 = this.f43594q0;
        if (m30Var2 != null) {
            m30Var2.a();
        }
        this.f43594q0 = m30Var;
        m30Var.b();
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Q();
        R();
    }

    @Override
    public final xl0 v(yl0 yl0Var) {
        m61 m61Var = new m61(yl0Var, getContext(), this.currentAccount, 0, true, new hi.a(this, 8), this.resourcesProvider);
        this.f43582d0 = m61Var;
        m61Var.f26342r = false;
        return m61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
