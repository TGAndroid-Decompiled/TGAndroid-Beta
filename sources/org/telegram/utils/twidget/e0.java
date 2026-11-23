package org.telegram.utils.twidget;

import android.os.SystemClock;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;
public final class e0 {
    public static final String[] f54759m = {"t.me", "telegram.me", "telegram.dog"};
    public final boolean f54760a;
    public final boolean f54761b;
    public final boolean f54762c;
    public int d;
    public int f54763e;
    public boolean f54766i;
    public boolean f54767j;
    public int f54769l;
    public long f54764f = -4611686018427387904L;
    public long f54765g = -4611686018427387904L;
    public long h = -4611686018427387904L;
    public final long[] f54768k = new long[10];

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
        this.f54760a = z11;
        if (z11 && jSONObject.optBoolean("backgroundQuery")) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f54761b = z12;
        if (z11 && jSONObject.has("wallet") && !jSONObject.isNull("wallet")) {
            z13 = true;
        }
        this.f54762c = z13;
    }

    public final synchronized boolean a(boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z10) {
            long[] jArr = this.f54768k;
            int i7 = this.f54769l;
            if (elapsedRealtime - jArr[i7] >= 1000) {
                jArr[i7] = elapsedRealtime;
                this.f54769l = (i7 + 1) % jArr.length;
                return true;
            }
        }
        return false;
    }

    public final boolean b(long j3) {
        if (this.f54763e < this.d && j3 - this.f54764f <= 10000) {
            return true;
        }
        return false;
    }

    public final synchronized boolean c(boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z10 && b(elapsedRealtime)) {
            this.f54763e = this.d;
            return true;
        }
        return false;
    }

    public final synchronized boolean d(String str, boolean z10, boolean z11) {
        try {
            if (this.f54760a && !this.f54766i && str != null && str.getBytes(StandardCharsets.UTF_8).length <= 64 && (!z10 || this.f54762c)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (z11 && b(elapsedRealtime)) {
                    this.f54763e = this.d;
                    this.h = -4611686018427387904L;
                    this.f54767j = true;
                } else {
                    if (this.f54761b && !z10 && elapsedRealtime - this.f54765g >= 1000) {
                        this.f54765g = elapsedRealtime;
                    }
                    return false;
                }
                this.f54766i = true;
                return true;
            }
            return false;
        } finally {
        }
    }

    public final synchronized boolean e(String str, boolean z10) {
        try {
            if (this.f54762c && !this.f54766i && str != null && str.length() <= 262144 && z10) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (b(elapsedRealtime)) {
                    this.f54763e = this.d;
                } else if (elapsedRealtime - this.h > 10000) {
                    return false;
                }
                this.h = -4611686018427387904L;
                this.f54767j = true;
                this.f54766i = true;
                return true;
            }
            return false;
        } finally {
        }
    }
}
