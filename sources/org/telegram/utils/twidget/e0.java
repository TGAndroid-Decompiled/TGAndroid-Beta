package org.telegram.utils.twidget;

import android.os.SystemClock;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;
public final class e0 {
    public static final String[] f54724m = {"t.me", "telegram.me", "telegram.dog"};
    public final boolean f54725a;
    public final boolean f54726b;
    public final boolean f54727c;
    public int d;
    public int f54728e;
    public boolean f54731i;
    public boolean f54732j;
    public int f54734l;
    public long f54729f = -4611686018427387904L;
    public long f54730g = -4611686018427387904L;
    public long h = -4611686018427387904L;
    public final long[] f54733k = new long[10];

    public e0(JSONObject jSONObject) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (jSONObject != null && jSONObject.optBoolean("preview")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (jSONObject != null && !z10 && jSONObject.optBoolean("canQuery")) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f54725a = z11;
        if (z11 && jSONObject.optBoolean("backgroundQuery")) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f54726b = z12;
        if (z11 && jSONObject.has("wallet") && !jSONObject.isNull("wallet")) {
            z13 = true;
        }
        this.f54727c = z13;
    }

    public final synchronized boolean a(boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z10) {
            long[] jArr = this.f54733k;
            int i7 = this.f54734l;
            if (elapsedRealtime - jArr[i7] >= 1000) {
                jArr[i7] = elapsedRealtime;
                this.f54734l = (i7 + 1) % jArr.length;
                return true;
            }
        }
        return false;
    }

    public final boolean b(long j3) {
        if (this.f54728e < this.d && j3 - this.f54729f <= 10000) {
            return true;
        }
        return false;
    }

    public final synchronized boolean c(boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z10 && b(elapsedRealtime)) {
            this.f54728e = this.d;
            return true;
        }
        return false;
    }

    public final synchronized boolean d(String str, boolean z10, boolean z11) {
        try {
            if (this.f54725a && !this.f54731i && str != null && str.getBytes(StandardCharsets.UTF_8).length <= 64 && (!z10 || this.f54727c)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (z11 && b(elapsedRealtime)) {
                    this.f54728e = this.d;
                    this.h = -4611686018427387904L;
                    this.f54732j = true;
                } else {
                    if (this.f54726b && !z10 && elapsedRealtime - this.f54730g >= 1000) {
                        this.f54730g = elapsedRealtime;
                    }
                    return false;
                }
                this.f54731i = true;
                return true;
            }
            return false;
        } finally {
        }
    }

    public final synchronized boolean e(String str, boolean z10) {
        try {
            if (this.f54727c && !this.f54731i && str != null && str.length() <= 262144 && z10) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (b(elapsedRealtime)) {
                    this.f54728e = this.d;
                } else if (elapsedRealtime - this.h > 10000) {
                    return false;
                }
                this.h = -4611686018427387904L;
                this.f54732j = true;
                this.f54731i = true;
                return true;
            }
            return false;
        } finally {
        }
    }
}
