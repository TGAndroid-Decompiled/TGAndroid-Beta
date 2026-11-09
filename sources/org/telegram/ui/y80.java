package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
public enum y80 {
    DEFAULT("DefaultIcon", 2131231490, 2131558426, 2131754237, false),
    VINTAGE("VintageIcon", 2131231485, 2131558419, 2131754233, false),
    AQUA("AquaIcon", 2131231479, 2131558426, 2131754239, false),
    PREMIUM("PremiumIcon", 2131231476, 2131558407, 2131754235, true),
    TURBO("TurboIcon", 2131231482, 2131558414, 2131754234, true),
    NOX("NoxIcon", 2131558402, 2131558426, 2131754236, true);
    
    public final String f51994a;
    public final int f51995b;
    public final int f51996c;
    public final int d;
    public final boolean f51997e;
    public ComponentName f51998f;

    y80(String str, int i7, int i10, int i11, boolean z9) {
        this.f51994a = str;
        this.f51995b = i7;
        this.f51996c = i10;
        this.d = i11;
        this.f51997e = z9;
    }

    public final ComponentName a(Context context) {
        if (this.f51998f == null) {
            String packageName = context.getPackageName();
            this.f51998f = new ComponentName(packageName, "org.telegram.messenger." + this.f51994a);
        }
        return this.f51998f;
    }
}
