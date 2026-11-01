package org.telegram.ui;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class z70 implements org.telegram.messenger.k20 {
    public final int f43840a;
    public final long f43841b;
    public final Object f43842c;

    public z70(Object obj, long j10, int i10) {
        this.f43840a = i10;
        this.f43842c = obj;
        this.f43841b = j10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i10;
        int i11 = this.f43840a;
        long j10 = this.f43841b;
        Object obj3 = this.f43842c;
        switch (i11) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l4 = (Long) obj2;
                Pattern pattern = LaunchActivity.D1;
                if ("paid".equals((String) obj) && l4.longValue() != 0) {
                    org.telegram.messenger.i0.g3(new a3.i0(launchActivity, l4, this.f43841b, 19));
                    return;
                }
                return;
            case 1:
                ph.m mVar = (ph.m) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                FrameLayout frameLayout = mVar.f45226c2;
                mVar.S1.setLoading(false);
                mVar.f45241r2 = false;
                if (bool != null) {
                    if (j10 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.sb sbVar = new org.telegram.ui.Components.sb(mVar.getContext(), mVar.I0);
                    sbVar.f30254a.setImageResource(2131231117);
                    if (z10) {
                        i10 = 2131750316;
                    } else {
                        i10 = 2131750315;
                    }
                    String L0 = org.telegram.messenger.dd.L0(i10, null);
                    TextView textView = sbVar.f30255b;
                    textView.setText(L0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(org.telegram.messenger.i0.o());
                    String a02 = org.telegram.messenger.dd.a0(null, null, 2131750351, Integer.valueOf(mVar.f45227d2.d.gifts_per_round));
                    TextView textView2 = sbVar.f30256c;
                    textView2.setText(a02);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    mVar.h1();
                    org.telegram.ui.Components.wb.f(frameLayout, sbVar, 2750).j();
                    rh.e6.y(mVar.f21584a, false).q(null, false, true);
                }
                if (str != null) {
                    mVar.h1();
                    new org.telegram.ui.Components.cc(frameLayout, mVar.I0).Q(2131624011, 36, org.telegram.messenger.dd.a0(null, null, 2131743903, str)).j();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        yh.e0.d(k2Var, -j10, 2);
                        return;
                    } else {
                        org.telegram.ui.Components.cc.a0(k2Var).f0(tL_error, false);
                        return;
                    }
                }
                yh.e0.d(k2Var, -j10, 1);
                return;
        }
    }
}
