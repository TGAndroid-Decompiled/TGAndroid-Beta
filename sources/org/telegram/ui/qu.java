package org.telegram.ui;

import android.text.TextUtils;
public final class qu extends bg.b {
    public final int f37484c;
    public final int d;
    public final int e;
    public final CharSequence f37485f;
    public final CharSequence f37486g;
    public final int h;

    public qu(int i10, String str) {
        super(i10, false);
        this.f37485f = str;
    }

    public static qu b(CharSequence charSequence, String str) {
        return new qu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qu)) {
            return false;
        }
        qu quVar = (qu) obj;
        CharSequence charSequence = quVar.f37485f;
        int i10 = quVar.f1830a;
        int i11 = this.f1830a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f37485f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (quVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || quVar.d != this.d || quVar.e != this.e || quVar.f37484c != this.f37484c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public qu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f37484c = i11;
        this.d = i12;
        this.e = i13;
        this.f37485f = charSequence;
        this.f37486g = charSequence2;
    }
}
