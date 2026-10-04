package org.telegram.ui;

import android.text.TextUtils;
public final class qu extends og.a {
    public final int f39819c;
    public final int d;
    public final int f39820e;
    public final CharSequence f39821f;
    public final CharSequence f39822g;
    public final int h;

    public qu(int i10, String str) {
        super(i10, false);
        this.f39821f = str;
    }

    public static qu b(CharSequence charSequence, String str) {
        return new qu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qu)) {
            return false;
        }
        qu quVar = (qu) obj;
        CharSequence charSequence = quVar.f39821f;
        int i10 = quVar.f17182a;
        int i11 = this.f17182a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f39821f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (quVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || quVar.d != this.d || quVar.f39820e != this.f39820e || quVar.f39819c != this.f39819c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public qu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f39819c = i11;
        this.d = i12;
        this.f39820e = i13;
        this.f39821f = charSequence;
        this.f39822g = charSequence2;
    }
}
