package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class sa0 {
    public static final sa0 h;
    public static final sa0[] f42330n;
    public final String f42331a;
    public final int f42332b;
    public final int f42333c;
    public final int d;
    public final boolean f42334e;
    public ComponentName f42335f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        sa0 sa0Var = new sa0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = sa0Var;
        f42330n = new sa0[]{sa0Var, new sa0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new sa0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new sa0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new sa0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new sa0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public sa0(String str, int i10, String str2, int i11, int i12, int i13, boolean z10) {
        this.f42331a = str2;
        this.f42332b = i11;
        this.f42333c = i12;
        this.d = i13;
        this.f42334e = z10;
    }

    public static sa0 valueOf(String str) {
        return (sa0) Enum.valueOf(sa0.class, str);
    }

    public static sa0[] values() {
        return (sa0[]) f42330n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f42335f == null) {
            String packageName = context.getPackageName();
            this.f42335f = new ComponentName(packageName, "org.telegram.messenger." + this.f42331a);
        }
        return this.f42335f;
    }
}
