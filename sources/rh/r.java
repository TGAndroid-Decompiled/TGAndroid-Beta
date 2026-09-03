package rh;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import k7.b6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.ai;
import org.telegram.ui.k5;
import org.telegram.ui.ll0;
import ph.d4;
public final class r extends org.telegram.ui.ActionBar.p2 {
    public g61 f43783a;
    public final ArrayList f43784b;
    public final HashMap f43785c;

    public r() {
        super(null);
        this.f43784b = new ArrayList();
        this.f43785c = new HashMap();
    }

    public static void U(r rVar, ArrayList arrayList) {
        HashMap hashMap = rVar.f43785c;
        ArrayList arrayList2 = rVar.f43784b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            o oVar = (o) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(oVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                k5 k5Var = new k5(null, 24.0f, rVar.currentAccount);
                k5Var.e(oVar.f43699a);
                spannableStringBuilder.setSpan(k5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(oVar.f43699a));
                hashMap.put(oVar, spannableStringBuilder);
            }
            i51 i11 = i51.i(i10, spannableStringBuilder);
            i11.K(!oVar.f43700b);
            arrayList.add(i11);
        }
        ai.A(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(r rVar, i51 i51Var) {
        int i10;
        w51 w51Var;
        ArrayList arrayList = rVar.f43784b;
        if (i51Var.f1830a == 4 && (i10 = i51Var.d) >= 0 && i10 < arrayList.size()) {
            o oVar = (o) arrayList.get(i51Var.d);
            oVar.f43700b = !oVar.f43700b;
            Activity parentActivity = rVar.getParentActivity();
            int i11 = rVar.currentAccount;
            long j10 = oVar.f43699a.f19306id;
            boolean z4 = oVar.f43700b;
            WeakHashMap weakHashMap = p.f43715k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j10 + "_disabled", z4);
            if (!z4 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
                edit.putString(String.valueOf(j10), "");
            }
            edit.apply();
            g61 g61Var = rVar.f43783a;
            if (g61Var != null && (w51Var = g61Var.V2) != null) {
                w51Var.N(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        ai.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.v0(j6.f19827a7, this.resourceProvider));
        g61 g61Var = new g61(this, new d4(this, 8), new q(this), new q(this));
        this.f43783a = g61Var;
        frameLayout.addView(g61Var, b6.e(-1, -1, 119));
        p.d(getParentActivity(), this.currentAccount, new org.telegram.ui.web.a1(this, 13));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
