package xh;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.e5;
import org.telegram.ui.y01;
import vh.m6;
import w7.b6;
public final class o extends org.telegram.ui.ActionBar.k2 {
    public u51 f53927a;
    public final ArrayList f53928b;
    public final HashMap f53929c;

    public o() {
        super(null);
        this.f53928b = new ArrayList();
        this.f53929c = new HashMap();
    }

    public static void Y(o oVar, ArrayList arrayList) {
        HashMap hashMap = oVar.f53929c;
        ArrayList arrayList2 = oVar.f53928b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            m mVar = (m) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(mVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                e5 e5Var = new e5(24.0f, oVar.currentAccount, null);
                e5Var.e(mVar.f53863a);
                spannableStringBuilder.setSpan(e5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) h20.p(mVar.f53863a));
                hashMap.put(mVar, spannableStringBuilder);
            }
            a51 i11 = a51.i(i10, spannableStringBuilder);
            i11.L(!mVar.f53864b);
            arrayList.add(i11);
        }
        arrayList.add(a51.C(cd.L0(2131746876, null)));
    }

    public static void Z(o oVar, a51 a51Var) {
        int i10;
        p51 p51Var;
        ArrayList arrayList = oVar.f53928b;
        if (a51Var.f7680a == 4 && (i10 = a51Var.d) >= 0 && i10 < arrayList.size()) {
            m mVar = (m) arrayList.get(a51Var.d);
            mVar.f53864b = !mVar.f53864b;
            Activity parentActivity = oVar.getParentActivity();
            int i11 = oVar.currentAccount;
            long j10 = mVar.f53863a.f19942id;
            boolean z10 = mVar.f53864b;
            WeakHashMap weakHashMap = n.f53909k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j10 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
                edit.putString(String.valueOf(j10), "");
            }
            edit.apply();
            u51 u51Var = oVar.f53927a;
            if (u51Var != null && (p51Var = u51Var.f30819f3) != null) {
                p51Var.O(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(cd.L0(2131746878, null));
        this.actionBar.setActionBarMenuOnItemClick(new y01(this, 18));
        FrameLayout frameLayout = new FrameLayout(context);
        a7.i(t6.f20872a7, frameLayout, this.resourceProvider);
        u51 u51Var = new u51(this, new qh.d(this, 27), new wh.b(this, 10), new xg.a(15, this));
        this.f53927a = u51Var;
        frameLayout.addView(u51Var, b6.e(-1, -1, 119));
        n.d(getParentActivity(), this.currentAccount, new m6(this, 2));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
