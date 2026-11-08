package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
public enum w80 {
    DEFAULT("DefaultIcon", 2131231490, 2131558426, 2131754237, false),
    VINTAGE("VintageIcon", 2131231485, 2131558419, 2131754233, false),
    AQUA("AquaIcon", 2131231479, 2131558426, 2131754239, false),
    PREMIUM("PremiumIcon", 2131231476, 2131558407, 2131754235, true),
    TURBO("TurboIcon", 2131231482, 2131558414, 2131754234, true),
    NOX("NoxIcon", 2131558402, 2131558426, 2131754236, true);
    
    public final String f50974a;
    public final int f50975b;
    public final int f50976c;
    public final int d;
    public final boolean f50977e;
    public ComponentName f50978f;

    w80(String str, int i7, int i10, int i11, boolean z9) {
        this.f50974a = str;
        this.f50975b = i7;
        this.f50976c = i10;
        this.d = i11;
        this.f50977e = z9;
    }

    public final ComponentName a(Context context) {
        if (this.f50978f == null) {
            String packageName = context.getPackageName();
            this.f50978f = new ComponentName(packageName, "org.telegram.messenger." + this.f50974a);
        }
        return this.f50978f;
    }
}
