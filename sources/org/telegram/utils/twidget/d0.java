package org.telegram.utils.twidget;

import android.os.SystemClock;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;
public final class d0 {
    public static final String[] f52776m = {"t.me", "telegram.me", "telegram.dog"};
    public final boolean f52777a;
    public final boolean f52778b;
    public final boolean f52779c;
    public int d;
    public int f52780e;
    public boolean f52783i;
    public boolean f52784j;
    public int f52786l;
    public long f52781f = -4611686018427387904L;
    public long f52782g = -4611686018427387904L;
    public long h = -4611686018427387904L;
    public final long[] f52785k = new long[10];

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
        this.f52777a = z10;
        if (z10 && jSONObject.optBoolean("backgroundQuery")) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f52778b = z11;
        if (z10 && jSONObject.has("wallet") && !jSONObject.isNull("wallet")) {
            z12 = true;
        }
        this.f52779c = z12;
    }

    public final synchronized boolean a(boolean z9) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z9) {
            long[] jArr = this.f52785k;
            int i7 = this.f52786l;
            if (elapsedRealtime - jArr[i7] >= 1000) {
                jArr[i7] = elapsedRealtime;
                this.f52786l = (i7 + 1) % jArr.length;
                return true;
            }
        }
        return false;
    }

    public final boolean b(long j3) {
        if (this.f52780e < this.d && j3 - this.f52781f <= 10000) {
            return true;
        }
        return false;
    }

    public final synchronized boolean c(boolean z9) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z9 && b(elapsedRealtime)) {
            this.f52780e = this.d;
            return true;
        }
        return false;
    }

    public final synchronized boolean d(String str, boolean z9, boolean z10) {
        try {
            if (this.f52777a && !this.f52783i && str != null && str.getBytes(StandardCharsets.UTF_8).length <= 64 && (!z9 || this.f52779c)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (z10 && b(elapsedRealtime)) {
                    this.f52780e = this.d;
                    this.f52784j = z9;
                } else {
                    if (this.f52778b && !z9 && elapsedRealtime - this.f52782g >= 1000) {
                        this.f52782g = elapsedRealtime;
                    }
                    return false;
                }
                this.f52783i = true;
                return true;
            }
            return false;
        } finally {
        }
    }

    public final synchronized boolean e(String str, boolean z9) {
        try {
            if (this.f52779c && !this.f52783i && str != null && str.length() <= 262144 && z9) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (b(elapsedRealtime)) {
                    this.f52780e = this.d;
                } else if (elapsedRealtime - this.h > 10000) {
                    return false;
                }
                this.f52783i = true;
                return true;
            }
            return false;
        } finally {
        }
    }
}
