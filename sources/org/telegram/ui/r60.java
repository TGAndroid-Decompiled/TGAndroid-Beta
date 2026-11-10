package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class r60 implements org.telegram.ui.ActionBar.r1 {
    public final int f49270a;
    public final int f49271b;
    public final HashMap f49272c;
    public final boolean d;
    public final boolean f49273e;

    public r60(int i7, HashMap hashMap, boolean z9, boolean z10, int i10) {
        this.f49270a = i10;
        this.f49271b = i7;
        this.f49272c = hashMap;
        this.d = z9;
        this.f49273e = z10;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f49270a) {
            case 0:
                int i10 = this.f49271b;
                HashMap hashMap = this.f49272c;
                boolean z9 = this.d;
                boolean z10 = this.f49273e;
                String str = LaunchActivity.B1;
                Utilities.f21341e.c(new org.telegram.messenger.i4(org.telegram.messenger.g5.r(i10), hashMap, z9, z10, true));
                return;
            case 1:
                int i11 = this.f49271b;
                HashMap hashMap2 = this.f49272c;
                boolean z11 = this.d;
                boolean z12 = this.f49273e;
                String str2 = LaunchActivity.B1;
                Utilities.f21341e.c(new org.telegram.messenger.i4(org.telegram.messenger.g5.r(i11), hashMap2, z11, z12, false));
                return;
            default:
                int i12 = this.f49271b;
                HashMap hashMap3 = this.f49272c;
                boolean z13 = this.d;
                boolean z14 = this.f49273e;
                String str3 = LaunchActivity.B1;
                Utilities.f21341e.c(new org.telegram.messenger.i4(org.telegram.messenger.g5.r(i12), hashMap3, z13, z14, true));
                return;
        }
    }
}
