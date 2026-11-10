package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class xw0 {
    public final String f51831a;
    public final Runnable f51832b;
    public final String f51833c;
    public final String[] d;
    public final int f51834e;
    public final int f51835f;
    public int f51836g;
    public String h;

    public xw0(int i7, String str, int i10, Runnable runnable) {
        this(i7, str, null, null, null, i10, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof xw0) && this.f51835f == ((xw0) obj).f51835f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f51836g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f51835f);
        return Utilities.f(serializedData.toByteArray());
    }

    public xw0(int i7, String str, String str2, int i10, Runnable runnable) {
        this(i7, str, null, str2, null, i10, runnable);
    }

    public xw0(int i7, String str, String str2, String str3, int i10, Runnable runnable) {
        this(i7, str, str2, str3, null, i10, runnable);
    }

    public xw0(int i7, String str, String str2, String str3, String str4, int i10, Runnable runnable) {
        this.f51835f = i7;
        this.f51831a = str;
        this.f51833c = str2;
        this.f51832b = runnable;
        this.f51834e = i10;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
