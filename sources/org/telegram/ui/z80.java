package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
public enum z80 {
    DEFAULT("DefaultIcon", 2131231490, 2131558426, 2131754237, false),
    VINTAGE("VintageIcon", 2131231485, 2131558419, 2131754233, false),
    AQUA("AquaIcon", 2131231479, 2131558426, 2131754239, false),
    PREMIUM("PremiumIcon", 2131231476, 2131558407, 2131754235, true),
    TURBO("TurboIcon", 2131231482, 2131558414, 2131754234, true),
    NOX("NoxIcon", 2131558402, 2131558426, 2131754236, true);
    
    public final String f52324a;
    public final int f52325b;
    public final int f52326c;
    public final int d;
    public final boolean f52327e;
    public ComponentName f52328f;

    z80(String str, int i7, int i10, int i11, boolean z9) {
        this.f52324a = str;
        this.f52325b = i7;
        this.f52326c = i10;
        this.d = i11;
        this.f52327e = z9;
    }

    public final ComponentName a(Context context) {
        if (this.f52328f == null) {
            String packageName = context.getPackageName();
            this.f52328f = new ComponentName(packageName, "org.telegram.messenger." + this.f52324a);
        }
        return this.f52328f;
    }
}
