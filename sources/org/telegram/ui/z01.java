package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class z01 {
    public final String f40306a;
    public final Runnable f40307b;
    public final String f40308c;
    public final String[] d;
    public final int e;
    public final int f40309f;
    public int f40310g;
    public String h;

    public z01(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof z01) && this.f40309f == ((z01) obj).f40309f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f40310g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f40309f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public z01(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public z01(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public z01(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f40309f = i10;
        this.f40306a = str;
        this.f40308c = str2;
        this.f40307b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
