package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
public enum t80 {
    DEFAULT("DefaultIcon", 2131231490, 2131558426, 2131754237, false),
    VINTAGE("VintageIcon", 2131231485, 2131558419, 2131754233, false),
    AQUA("AquaIcon", 2131231479, 2131558426, 2131754239, false),
    PREMIUM("PremiumIcon", 2131231476, 2131558407, 2131754235, true),
    TURBO("TurboIcon", 2131231482, 2131558414, 2131754234, true),
    NOX("NoxIcon", 2131558402, 2131558426, 2131754236, true);
    
    public final String f49734a;
    public final int f49735b;
    public final int f49736c;
    public final int d;
    public final boolean f49737e;
    public ComponentName f49738f;

    t80(String str, int i3, int i10, int i11, boolean z10) {
        this.f49734a = str;
        this.f49735b = i3;
        this.f49736c = i10;
        this.d = i11;
        this.f49737e = z10;
    }

    public final ComponentName a(Context context) {
        if (this.f49738f == null) {
            String packageName = context.getPackageName();
            this.f49738f = new ComponentName(packageName, "org.telegram.messenger." + this.f49734a);
        }
        return this.f49738f;
    }
}
