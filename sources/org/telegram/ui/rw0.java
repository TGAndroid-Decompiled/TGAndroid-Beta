package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class rw0 {
    public final String f51043a;
    public final Runnable f51044b;
    public final String f51045c;
    public final String[] d;
    public final int f51046e;
    public final int f51047f;
    public int f51048g;
    public String h;

    public rw0(int i7, String str, int i10, Runnable runnable) {
        this(i7, str, null, null, null, i10, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof rw0) && this.f51047f == ((rw0) obj).f51047f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f51048g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f51047f);
        return Utilities.f(serializedData.toByteArray());
    }

    public rw0(int i7, String str, String str2, int i10, Runnable runnable) {
        this(i7, str, null, str2, null, i10, runnable);
    }

    public rw0(int i7, String str, String str2, String str3, int i10, Runnable runnable) {
        this(i7, str, str2, str3, null, i10, runnable);
    }

    public rw0(int i7, String str, String str2, String str3, String str4, int i10, Runnable runnable) {
        this.f51047f = i7;
        this.f51043a = str;
        this.f51045c = str2;
        this.f51044b = runnable;
        this.f51046e = i10;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
