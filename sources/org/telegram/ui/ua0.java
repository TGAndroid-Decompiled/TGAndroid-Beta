package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class ua0 {
    public static final ua0 h;
    public static final ua0[] f42359n;
    public final String f42360a;
    public final int f42361b;
    public final int f42362c;
    public final int d;
    public final boolean e;
    public ComponentName f42363f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        ua0 ua0Var = new ua0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = ua0Var;
        f42359n = new ua0[]{ua0Var, new ua0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new ua0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new ua0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new ua0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new ua0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public ua0(String str, int i10, String str2, int i11, int i12, int i13, boolean z10) {
        this.f42360a = str2;
        this.f42361b = i11;
        this.f42362c = i12;
        this.d = i13;
        this.e = z10;
    }

    public static ua0 valueOf(String str) {
        return (ua0) Enum.valueOf(ua0.class, str);
    }

    public static ua0[] values() {
        return (ua0[]) f42359n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f42363f == null) {
            String packageName = context.getPackageName();
            this.f42363f = new ComponentName(packageName, "org.telegram.messenger." + this.f42360a);
        }
        return this.f42363f;
    }
}
