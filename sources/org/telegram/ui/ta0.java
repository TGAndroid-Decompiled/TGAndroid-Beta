package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;

public final class ta0 {
    public static final ta0 h;

    public static final ta0[] f42841n;

    public final String f42842a;

    public final int f42843b;

    public final int f42844c;
    public final int d;

    public final boolean f42845e;

    public ComponentName f42846f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        ta0 ta0Var = new ta0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = ta0Var;
        f42841n = new ta0[]{ta0Var, new ta0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new ta0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new ta0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new ta0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new ta0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public ta0(String str, int i10, String str2, int i11, int i12, int i13, boolean z10) {
        super(str, i10);
        this.f42842a = str2;
        this.f42843b = i11;
        this.f42844c = i12;
        this.d = i13;
        this.f42845e = z10;
    }

    public static ta0 valueOf(String str) {
        return (ta0) Enum.valueOf(ta0.class, str);
    }

    public static ta0[] values() {
        return (ta0[]) f42841n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f42846f == null) {
            this.f42846f = new ComponentName(context.getPackageName(), "org.telegram.messenger." + this.f42842a);
        }
        return this.f42846f;
    }
}
