package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class vw0 {
    public final String f52875a;
    public final Runnable f52876b;
    public final String f52877c;
    public final String[] d;
    public final int f52878e;
    public final int f52879f;
    public int f52880g;
    public String h;

    public vw0(int i7, String str, int i10, Runnable runnable) {
        this(i7, str, null, null, null, i10, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vw0) && this.f52879f == ((vw0) obj).f52879f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f52880g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f52879f);
        return Utilities.f(serializedData.toByteArray());
    }

    public vw0(int i7, String str, String str2, int i10, Runnable runnable) {
        this(i7, str, null, str2, null, i10, runnable);
    }

    public vw0(int i7, String str, String str2, String str3, int i10, Runnable runnable) {
        this(i7, str, str2, str3, null, i10, runnable);
    }

    public vw0(int i7, String str, String str2, String str3, String str4, int i10, Runnable runnable) {
        this.f52879f = i7;
        this.f52875a = str;
        this.f52877c = str2;
        this.f52876b = runnable;
        this.f52878e = i10;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
