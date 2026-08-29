package ph;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import nh.t4;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.al0;
import org.telegram.ui.g5;
import org.telegram.ui.th;
public final class r extends org.telegram.ui.ActionBar.o2 {
    public u51 f46012a;
    public final ArrayList f46013b;
    public final HashMap f46014c;

    public r() {
        super(null);
        this.f46013b = new ArrayList();
        this.f46014c = new HashMap();
    }

    public static void U(r rVar, ArrayList arrayList) {
        HashMap hashMap = rVar.f46014c;
        ArrayList arrayList2 = rVar.f46013b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            o oVar = (o) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(oVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                g5 g5Var = new g5(null, 24.0f, rVar.currentAccount);
                g5Var.e(oVar.f45923a);
                spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(oVar.f45923a));
                hashMap.put(oVar, spannableStringBuilder);
            }
            w41 i11 = w41.i(i10, spannableStringBuilder);
            i11.K(!oVar.f45924b);
            arrayList.add(i11);
        }
        th.A(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(r rVar, w41 w41Var) {
        int i10;
        k51 k51Var;
        ArrayList arrayList = rVar.f46013b;
        if (w41Var.f50845a == 4 && (i10 = w41Var.d) >= 0 && i10 < arrayList.size()) {
            o oVar = (o) arrayList.get(w41Var.d);
            oVar.f45924b = !oVar.f45924b;
            Activity parentActivity = rVar.getParentActivity();
            int i11 = rVar.currentAccount;
            long j10 = oVar.f45923a.f22539id;
            boolean z10 = oVar.f45924b;
            WeakHashMap weakHashMap = p.f45939k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j10 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
                edit.putString(String.valueOf(j10), "");
            }
            edit.apply();
            u51 u51Var = rVar.f46012a;
            if (u51Var != null && (k51Var = u51Var.U2) != null) {
                k51Var.N(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        th.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.v0(g6.f23009a7, this.resourceProvider));
        u51 u51Var = new u51(this, new t4(this, 8), new q(this), new q(this));
        this.f46012a = u51Var;
        frameLayout.addView(u51Var, f6.e(-1, -1, 119));
        p.d(getParentActivity(), this.currentAccount, new nh.b0(this, 13));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
