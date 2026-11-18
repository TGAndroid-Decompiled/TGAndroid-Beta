package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
public enum y80 {
    DEFAULT("DefaultIcon", 2131231490, 2131558426, 2131754235, false),
    VINTAGE("VintageIcon", 2131231485, 2131558419, 2131754231, false),
    AQUA("AquaIcon", 2131231479, 2131558426, 2131754237, false),
    PREMIUM("PremiumIcon", 2131231476, 2131558407, 2131754233, true),
    TURBO("TurboIcon", 2131231482, 2131558414, 2131754232, true),
    NOX("NoxIcon", 2131558402, 2131558426, 2131754234, true);
    
    public final String f54090a;
    public final int f54091b;
    public final int f54092c;
    public final int d;
    public final boolean f54093e;
    public ComponentName f54094f;

    y80(String str, int i7, int i10, int i11, boolean z10) {
        this.f54090a = str;
        this.f54091b = i7;
        this.f54092c = i10;
        this.d = i11;
        this.f54093e = z10;
    }

    public final ComponentName a(Context context) {
        if (this.f54094f == null) {
            String packageName = context.getPackageName();
            this.f54094f = new ComponentName(packageName, "org.telegram.messenger." + this.f54090a);
        }
        return this.f54094f;
    }
}
