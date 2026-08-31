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
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.i5;
import org.telegram.ui.ll0;
import org.telegram.ui.yh;
import qh.d4;
public final class r extends org.telegram.ui.ActionBar.p2 {
    public i61 f47637a;
    public final ArrayList f47638b;
    public final HashMap f47639c;

    public r() {
        super(null);
        this.f47638b = new ArrayList();
        this.f47639c = new HashMap();
    }

    public static void U(r rVar, ArrayList arrayList) {
        HashMap hashMap = rVar.f47639c;
        ArrayList arrayList2 = rVar.f47638b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            o oVar = (o) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(oVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                i5 i5Var = new i5(null, 24.0f, rVar.currentAccount);
                i5Var.e(oVar.f47548a);
                spannableStringBuilder.setSpan(i5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(oVar.f47548a));
                hashMap.put(oVar, spannableStringBuilder);
            }
            j51 i11 = j51.i(i10, spannableStringBuilder);
            i11.K(!oVar.f47549b);
            arrayList.add(i11);
        }
        yh.A(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(r rVar, j51 j51Var) {
        int i10;
        x51 x51Var;
        ArrayList arrayList = rVar.f47638b;
        if (j51Var.f2505a == 4 && (i10 = j51Var.d) >= 0 && i10 < arrayList.size()) {
            o oVar = (o) arrayList.get(j51Var.d);
            oVar.f47549b = !oVar.f47549b;
            Activity parentActivity = rVar.getParentActivity();
            int i11 = rVar.currentAccount;
            long j10 = oVar.f47548a.f20990id;
            boolean z4 = oVar.f47549b;
            WeakHashMap weakHashMap = p.f47564k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j10 + "_disabled", z4);
            if (!z4 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
                edit.putString(String.valueOf(j10), "");
            }
            edit.apply();
            i61 i61Var = rVar.f47637a;
            if (i61Var != null && (x51Var = i61Var.V2) != null) {
                x51Var.N(true);
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
        frameLayout.setBackgroundColor(k6.v0(k6.f21605a7, this.resourceProvider));
        i61 i61Var = new i61(this, new d4(this, 8), new q(this), new q(this));
        this.f47637a = i61Var;
        frameLayout.addView(i61Var, c6.e(-1, -1, 119));
        p.d(getParentActivity(), this.currentAccount, new org.telegram.ui.web.d1(this, 13));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
