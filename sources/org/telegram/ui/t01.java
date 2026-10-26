package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class t01 {
    public final String f43640a;
    public final Runnable f43641b;
    public final String f43642c;
    public final String[] d;
    public final int e;
    public final int f43643f;
    public int f43644g;
    public String h;

    public t01(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof t01) && this.f43643f == ((t01) obj).f43643f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f43644g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f43643f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public t01(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public t01(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public t01(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f43643f = i10;
        this.f43640a = str;
        this.f43642c = str2;
        this.f43641b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
