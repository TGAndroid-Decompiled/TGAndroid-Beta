package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class vw0 {
    public final String f52872a;
    public final Runnable f52873b;
    public final String f52874c;
    public final String[] d;
    public final int f52875e;
    public final int f52876f;
    public int f52877g;
    public String h;

    public vw0(int i7, String str, int i10, Runnable runnable) {
        this(i7, str, null, null, null, i10, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vw0) && this.f52876f == ((vw0) obj).f52876f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f52877g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f52876f);
        return Utilities.f(serializedData.toByteArray());
    }

    public vw0(int i7, String str, String str2, int i10, Runnable runnable) {
        this(i7, str, null, str2, null, i10, runnable);
    }

    public vw0(int i7, String str, String str2, String str3, int i10, Runnable runnable) {
        this(i7, str, str2, str3, null, i10, runnable);
    }

    public vw0(int i7, String str, String str2, String str3, String str4, int i10, Runnable runnable) {
        this.f52876f = i7;
        this.f52872a = str;
        this.f52874c = str2;
        this.f52873b = runnable;
        this.f52875e = i10;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
