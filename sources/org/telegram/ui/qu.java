package org.telegram.ui;

import android.text.TextUtils;
public final class qu extends og.a {
    public final int f39825c;
    public final int d;
    public final int f39826e;
    public final CharSequence f39827f;
    public final CharSequence f39828g;
    public final int h;

    public qu(int i10, String str) {
        super(i10, false);
        this.f39827f = str;
    }

    public static qu b(CharSequence charSequence, String str) {
        return new qu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qu)) {
            return false;
        }
        qu quVar = (qu) obj;
        CharSequence charSequence = quVar.f39827f;
        int i10 = quVar.f17187a;
        int i11 = this.f17187a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f39827f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (quVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || quVar.d != this.d || quVar.f39826e != this.f39826e || quVar.f39825c != this.f39825c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public qu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f39825c = i11;
        this.d = i12;
        this.f39826e = i13;
        this.f39827f = charSequence;
        this.f39828g = charSequence2;
    }
}
