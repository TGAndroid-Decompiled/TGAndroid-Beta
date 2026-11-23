package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
public enum z80 {
    DEFAULT("DefaultIcon", 2131231490, 2131558426, 2131754234, false),
    VINTAGE("VintageIcon", 2131231485, 2131558419, 2131754230, false),
    AQUA("AquaIcon", 2131231479, 2131558426, 2131754236, false),
    PREMIUM("PremiumIcon", 2131231476, 2131558407, 2131754232, true),
    TURBO("TurboIcon", 2131231482, 2131558414, 2131754231, true),
    NOX("NoxIcon", 2131558402, 2131558426, 2131754233, true);
    
    public final String f54457a;
    public final int f54458b;
    public final int f54459c;
    public final int d;
    public final boolean f54460e;
    public ComponentName f54461f;

    z80(String str, int i7, int i10, int i11, boolean z10) {
        this.f54457a = str;
        this.f54458b = i7;
        this.f54459c = i10;
        this.d = i11;
        this.f54460e = z10;
    }

    public final ComponentName a(Context context) {
        if (this.f54461f == null) {
            String packageName = context.getPackageName();
            this.f54461f = new ComponentName(packageName, "org.telegram.messenger." + this.f54457a);
        }
        return this.f54461f;
    }
}
