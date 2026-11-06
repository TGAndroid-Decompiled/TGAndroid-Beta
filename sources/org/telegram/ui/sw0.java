package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class sw0 {
    public final String f49856a;
    public final Runnable f49857b;
    public final String f49858c;
    public final String[] d;
    public final int f49859e;
    public final int f49860f;
    public int f49861g;
    public String h;

    public sw0(int i7, String str, int i10, Runnable runnable) {
        this(i7, str, null, null, null, i10, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof sw0) && this.f49860f == ((sw0) obj).f49860f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f49861g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f49860f);
        return Utilities.f(serializedData.toByteArray());
    }

    public sw0(int i7, String str, String str2, int i10, Runnable runnable) {
        this(i7, str, null, str2, null, i10, runnable);
    }

    public sw0(int i7, String str, String str2, String str3, int i10, Runnable runnable) {
        this(i7, str, str2, str3, null, i10, runnable);
    }

    public sw0(int i7, String str, String str2, String str3, String str4, int i10, Runnable runnable) {
        this.f49860f = i7;
        this.f49856a = str;
        this.f49858c = str2;
        this.f49857b = runnable;
        this.f49859e = i10;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
