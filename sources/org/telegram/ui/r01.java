package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class r01 {
    public final String f40737a;
    public final Runnable f40738b;
    public final String f40739c;
    public final String[] d;
    public final int f40740e;
    public final int f40741f;
    public int f40742g;
    public String h;

    public r01(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof r01) && this.f40741f == ((r01) obj).f40741f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f40742g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f40741f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public r01(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public r01(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public r01(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f40741f = i10;
        this.f40737a = str;
        this.f40739c = str2;
        this.f40738b = runnable;
        this.f40740e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
