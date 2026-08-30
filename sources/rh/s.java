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
import org.telegram.ui.i5;
import org.telegram.ui.jl0;
import org.telegram.ui.yh;
import ph.d4;
public final class s extends org.telegram.ui.ActionBar.p2 {
    public g61 f43731a;
    public final ArrayList f43732b;
    public final HashMap f43733c;

    public s() {
        super(null);
        this.f43732b = new ArrayList();
        this.f43733c = new HashMap();
    }

    public static void U(s sVar, ArrayList arrayList) {
        HashMap hashMap = sVar.f43733c;
        ArrayList arrayList2 = sVar.f43732b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            p pVar = (p) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(pVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                i5 i5Var = new i5(null, 24.0f, sVar.currentAccount);
                i5Var.e(pVar.f43647a);
                spannableStringBuilder.setSpan(i5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(pVar.f43647a));
                hashMap.put(pVar, spannableStringBuilder);
            }
            i51 i11 = i51.i(i10, spannableStringBuilder);
            i11.K(!pVar.f43648b);
            arrayList.add(i11);
        }
        yh.A(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(s sVar, i51 i51Var) {
        int i10;
        w51 w51Var;
        ArrayList arrayList = sVar.f43732b;
        if (i51Var.f1808a == 4 && (i10 = i51Var.d) >= 0 && i10 < arrayList.size()) {
            p pVar = (p) arrayList.get(i51Var.d);
            pVar.f43648b = !pVar.f43648b;
            Activity parentActivity = sVar.getParentActivity();
            int i11 = sVar.currentAccount;
            long j10 = pVar.f43647a.f19331id;
            boolean z4 = pVar.f43648b;
            WeakHashMap weakHashMap = q.f43663k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j10 + "_disabled", z4);
            if (!z4 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
                edit.putString(String.valueOf(j10), "");
            }
            edit.apply();
            g61 g61Var = sVar.f43731a;
            if (g61Var != null && (w51Var = g61Var.V2) != null) {
                w51Var.N(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new jl0(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.v0(j6.f19852a7, this.resourceProvider));
        g61 g61Var = new g61(this, new d4(this, 8), new r(this), new r(this));
        this.f43731a = g61Var;
        frameLayout.addView(g61Var, b6.e(-1, -1, 119));
        q.d(getParentActivity(), this.currentAccount, new org.telegram.ui.web.y0(this, 13));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
