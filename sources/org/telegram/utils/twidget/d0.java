package org.telegram.utils.twidget;

import android.os.SystemClock;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;
public final class d0 {
    public static final String[] f52777m = {"t.me", "telegram.me", "telegram.dog"};
    public final boolean f52778a;
    public final boolean f52779b;
    public final boolean f52780c;
    public int d;
    public int f52781e;
    public boolean f52784i;
    public boolean f52785j;
    public int f52787l;
    public long f52782f = -4611686018427387904L;
    public long f52783g = -4611686018427387904L;
    public long h = -4611686018427387904L;
    public final long[] f52786k = new long[10];

    public d0(JSONObject jSONObject) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (jSONObject != null && jSONObject.optBoolean("preview")) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (jSONObject != null && !z9 && jSONObject.optBoolean("canQuery")) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f52778a = z10;
        if (z10 && jSONObject.optBoolean("backgroundQuery")) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f52779b = z11;
        if (z10 && jSONObject.has("wallet") && !jSONObject.isNull("wallet")) {
            z12 = true;
        }
        this.f52780c = z12;
    }

    public final synchronized boolean a(boolean z9) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z9) {
            long[] jArr = this.f52786k;
            int i7 = this.f52787l;
            if (elapsedRealtime - jArr[i7] >= 1000) {
                jArr[i7] = elapsedRealtime;
                this.f52787l = (i7 + 1) % jArr.length;
                return true;
            }
        }
        return false;
    }

    public final boolean b(long j3) {
        if (this.f52781e < this.d && j3 - this.f52782f <= 10000) {
            return true;
        }
        return false;
    }

    public final synchronized boolean c(boolean z9) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z9 && b(elapsedRealtime)) {
            this.f52781e = this.d;
            return true;
        }
        return false;
    }

    public final synchronized boolean d(String str, boolean z9, boolean z10) {
        try {
            if (this.f52778a && !this.f52784i && str != null && str.getBytes(StandardCharsets.UTF_8).length <= 64 && (!z9 || this.f52780c)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (z10 && b(elapsedRealtime)) {
                    this.f52781e = this.d;
                    this.f52785j = z9;
                } else {
                    if (this.f52779b && !z9 && elapsedRealtime - this.f52783g >= 1000) {
                        this.f52783g = elapsedRealtime;
                    }
                    return false;
                }
                this.f52784i = true;
                return true;
            }
            return false;
        } finally {
        }
    }

    public final synchronized boolean e(String str, boolean z9) {
        try {
            if (this.f52780c && !this.f52784i && str != null && str.length() <= 262144 && z9) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (b(elapsedRealtime)) {
                    this.f52781e = this.d;
                } else if (elapsedRealtime - this.h > 10000) {
                    return false;
                }
                this.f52784i = true;
                return true;
            }
            return false;
        } finally {
        }
    }
}
