package org.telegram.ui;

import android.text.TextUtils;
public final class qu extends og.a {
    public final int f39820c;
    public final int d;
    public final int f39821e;
    public final CharSequence f39822f;
    public final CharSequence f39823g;
    public final int h;

    public qu(int i10, String str) {
        super(i10, false);
        this.f39822f = str;
    }

    public static qu b(CharSequence charSequence, String str) {
        return new qu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qu)) {
            return false;
        }
        qu quVar = (qu) obj;
        CharSequence charSequence = quVar.f39822f;
        int i10 = quVar.f17183a;
        int i11 = this.f17183a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f39822f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (quVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || quVar.d != this.d || quVar.f39821e != this.f39821e || quVar.f39820c != this.f39820c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public qu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f39820c = i11;
        this.d = i12;
        this.f39821e = i13;
        this.f39822f = charSequence;
        this.f39823g = charSequence2;
    }
}
