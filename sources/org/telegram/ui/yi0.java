package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class yi0 implements r9, org.telegram.ui.Components.zh {
    public final yj0 f52283a;

    public yi0(yj0 yj0Var) {
        this.f52283a = yj0Var;
    }

    @Override
    public boolean L1() {
        return false;
    }

    @Override
    public String M0() {
        return null;
    }

    @Override
    public void V0(org.telegram.messenger.rr rrVar) {
        boolean isEmpty = TextUtils.isEmpty(rrVar.f25202b);
        yj0 yj0Var = this.f52283a;
        if (!isEmpty) {
            yj0Var.Z[0].setText(rrVar.f25202b);
        }
        if (!TextUtils.isEmpty(rrVar.d)) {
            yj0Var.Z[1].setText(rrVar.d);
        }
        if (!TextUtils.isEmpty(rrVar.f25203c)) {
            yj0Var.Z[2].setText(rrVar.f25203c);
        }
        int i3 = rrVar.f25212n;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    yj0Var.f52336x = "female";
                    yj0Var.Z[4].setText(org.telegram.messenger.bd.M0(2131747577, null));
                }
            } else {
                yj0Var.f52336x = "male";
                yj0Var.Z[4].setText(org.telegram.messenger.bd.M0(2131747516, null));
            }
        }
        if (!TextUtils.isEmpty(rrVar.f25211m)) {
            String str = rrVar.f25211m;
            yj0Var.f52324s = str;
            String str2 = (String) yj0Var.Z0.get(str);
            if (str2 != null) {
                yj0Var.Z[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(rrVar.f25210l)) {
            String str3 = rrVar.f25210l;
            yj0Var.f52333w = str3;
            String str4 = (String) yj0Var.Z0.get(str3);
            if (str4 != null) {
                yj0Var.Z[6].setText(str4);
            }
        }
        int i10 = rrVar.f25209k;
        if (i10 > 0 && rrVar.f25208j > 0 && rrVar.f25207i > 0) {
            yj0Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(rrVar.f25208j), Integer.valueOf(rrVar.f25207i)));
        }
    }

    @Override
    public void Y(org.telegram.ui.Components.ng ngVar) {
        ngVar.run();
    }

    @Override
    public boolean e1(String str, i9 i9Var) {
        return false;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        org.telegram.ui.Components.bi biVar;
        yj0 yj0Var = this.f52283a;
        if (yj0Var.getParentActivity() != null && (biVar = yj0Var.S0) != null) {
            if (i3 != 8 && i3 != 7) {
                biVar.L(i3);
                yj0Var.J1(i3);
                return;
            }
            if (i3 != 8) {
                biVar.a(true);
            }
            HashMap<Object, Object> selectedPhotos = yj0Var.S0.f32215b2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = yj0Var.S0.f32215b2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) selectedPhotos.get(selectedPhotosOrder.get(i12));
                    ?? obj = new Object();
                    String str = yeVar.h;
                    if (str != null) {
                        obj.f26477c = str;
                    } else {
                        obj.f26477c = yeVar.I;
                    }
                    arrayList.add(obj);
                    yeVar.e();
                }
                yj0Var.K1(arrayList);
            }
        }
    }

    @Override
    public void v0() {
        org.telegram.messenger.g0.v1(this.f52283a.fragmentView.findFocus());
    }

    @Override
    public void I0(Object obj) {
    }

    @Override
    public void M(String str) {
    }

    @Override
    public void a1(TLRPC.User user) {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void r0() {
    }

    @Override
    public void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }
}
