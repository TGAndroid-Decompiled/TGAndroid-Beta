package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class w01 {
    public final String f39228a;
    public final Runnable f39229b;
    public final String f39230c;
    public final String[] d;
    public final int e;
    public final int f39231f;
    public int f39232g;
    public String h;

    public w01(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof w01) && this.f39231f == ((w01) obj).f39231f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f39232g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f39231f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public w01(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public w01(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public w01(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f39231f = i10;
        this.f39228a = str;
        this.f39230c = str2;
        this.f39229b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
