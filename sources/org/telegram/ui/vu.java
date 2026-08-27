package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;

public final class vu implements View.OnClickListener {

    public final Context f43522a;

    public final org.telegram.ui.ActionBar.n2 f43523b;

    public final wu f43524c;

    public vu(wu wuVar, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f43524c = wuVar;
        this.f43522a = context;
        this.f43523b = n2Var;
    }

    @Override
    public final void onClick(View view) {
        boolean zQ;
        String str;
        org.telegram.ui.ActionBar.f6 f6VarN0;
        org.telegram.ui.Components.oi0 oi0Var;
        int i10;
        if (gy.f38494t4) {
            return;
        }
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false);
        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false);
        gy.f38494t4 = true;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str2 = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.g6.N0(string) == null || org.telegram.ui.ActionBar.g6.N0(string).q()) {
            string = "Blue";
        }
        String str3 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.g6.N0(string2) == null || !org.telegram.ui.ActionBar.g6.N0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
        if (string.equals(string2)) {
            if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                str3 = string2;
            }
            zQ = org.telegram.ui.ActionBar.g6.I.q();
            str = str3;
            boolean z10 = !zQ;
            if (zQ) {
                f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str2);
            } else {
                f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str);
            }
            org.telegram.ui.ActionBar.f6 f6Var2 = f6VarN0;
            oi0Var = this.f43524c.d;
            if (zQ) {
                i10 = 0;
            } else {
                i10 = oi0Var.f31312e[0] - 1;
            }
            oi0Var.N(i10);
            this.f43524c.f44191e.getImageView().d();
            int[] iArr = {(this.f43524c.f44191e.getImageView().getMeasuredWidth() / 2) + i, org.telegram.messenger.y1.C(3.0f, this.f43524c.f44191e.getImageView().getMeasuredHeight() / 2, i)};
            this.f43524c.f44191e.getImageView().getLocationInWindow(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6Var2, Boolean.FALSE, iArr, -1, Boolean.valueOf(z10), this.f43524c.f44191e.getImageView(), this.f43524c.f44191e, new org.telegram.messenger.y7(this, iW0, this.f43522a, iW1, z10, this.f43523b));
        }
        str3 = string2;
        str2 = string;
        zQ = org.telegram.ui.ActionBar.g6.I.q();
        str = str3;
        boolean z11 = !zQ;
        if (zQ) {
            f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str);
        } else {
            f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str2);
        }
        org.telegram.ui.ActionBar.f6 f6Var3 = f6VarN0;
        oi0Var = this.f43524c.d;
        if (zQ) {
            i10 = oi0Var.f31312e[0] - 1;
        } else {
            i10 = 0;
        }
        oi0Var.N(i10);
        this.f43524c.f44191e.getImageView().d();
        int[] iArr2 = {(this.f43524c.f44191e.getImageView().getMeasuredWidth() / 2) + i11, org.telegram.messenger.y1.C(3.0f, this.f43524c.f44191e.getImageView().getMeasuredHeight() / 2, i12)};
        this.f43524c.f44191e.getImageView().getLocationInWindow(iArr2);
        int i13 = iArr2[0];
        int i14 = iArr2[1];
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6Var3, Boolean.FALSE, iArr2, -1, Boolean.valueOf(z11), this.f43524c.f44191e.getImageView(), this.f43524c.f44191e, new org.telegram.messenger.y7(this, iW0, this.f43522a, iW1, z11, this.f43523b));
    }
}
