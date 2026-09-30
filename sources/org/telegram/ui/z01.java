package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class z01 {
    public final String f40416a;
    public final Runnable f40417b;
    public final String f40418c;
    public final String[] d;
    public final int e;
    public final int f40419f;
    public int f40420g;
    public String h;

    public z01(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof z01) && this.f40419f == ((z01) obj).f40419f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f40420g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f40419f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public z01(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public z01(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public z01(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f40419f = i10;
        this.f40416a = str;
        this.f40418c = str2;
        this.f40417b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
