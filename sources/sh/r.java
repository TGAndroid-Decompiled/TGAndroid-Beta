package sh;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import k7.c6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.i5;
import org.telegram.ui.ll0;
import org.telegram.ui.yh;
import qh.c4;
public final class r extends org.telegram.ui.ActionBar.p2 {
    public h61 f47673a;
    public final ArrayList f47674b;
    public final HashMap f47675c;

    public r() {
        super(null);
        this.f47674b = new ArrayList();
        this.f47675c = new HashMap();
    }

    public static void U(r rVar, ArrayList arrayList) {
        HashMap hashMap = rVar.f47675c;
        ArrayList arrayList2 = rVar.f47674b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            o oVar = (o) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(oVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                i5 i5Var = new i5(null, 24.0f, rVar.currentAccount);
                i5Var.e(oVar.f47584a);
                spannableStringBuilder.setSpan(i5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(oVar.f47584a));
                hashMap.put(oVar, spannableStringBuilder);
            }
            h51 i11 = h51.i(i10, spannableStringBuilder);
            i11.K(!oVar.f47585b);
            arrayList.add(i11);
        }
        yh.A(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(r rVar, h51 h51Var) {
        int i10;
        w51 w51Var;
        ArrayList arrayList = rVar.f47674b;
        if (h51Var.f2505a == 4 && (i10 = h51Var.d) >= 0 && i10 < arrayList.size()) {
            o oVar = (o) arrayList.get(h51Var.d);
            oVar.f47585b = !oVar.f47585b;
            Activity parentActivity = rVar.getParentActivity();
            int i11 = rVar.currentAccount;
            long j10 = oVar.f47584a.f20992id;
            boolean z4 = oVar.f47585b;
            WeakHashMap weakHashMap = p.f47600k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j10 + "_disabled", z4);
            if (!z4 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
                edit.putString(String.valueOf(j10), "");
            }
            edit.apply();
            h61 h61Var = rVar.f47673a;
            if (h61Var != null && (w51Var = h61Var.V2) != null) {
                w51Var.N(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(k6.v0(k6.f21607a7, this.resourceProvider));
        h61 h61Var = new h61(this, new c4(this, 8), new q(this), new q(this));
        this.f47673a = h61Var;
        frameLayout.addView(h61Var, c6.e(-1, -1, 119));
        p.d(getParentActivity(), this.currentAccount, new org.telegram.ui.web.d1(this, 13));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
