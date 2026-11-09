package org.telegram.ui;
public final class tz {
    public long f50267a;
    public int f50268b;

    public tz(int i7, long j3) {
        this.f50267a = j3;
        this.f50268b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tz.class == obj.getClass()) {
            tz tzVar = (tz) obj;
            if (this.f50267a == tzVar.f50267a && this.f50268b == tzVar.f50268b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f50268b;
    }
}
