package org.telegram.ui;

import android.text.TextUtils;
public final class ru extends og.a {
    public final int f37131c;
    public final int d;
    public final int e;
    public final CharSequence f37132f;
    public final CharSequence f37133g;
    public final int h;

    public ru(int i10, String str) {
        super(i10, false);
        this.f37132f = str;
    }

    public static ru b(CharSequence charSequence, String str) {
        return new ru(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ru)) {
            return false;
        }
        ru ruVar = (ru) obj;
        CharSequence charSequence = ruVar.f37132f;
        int i10 = ruVar.f15672a;
        int i11 = this.f15672a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f37132f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (ruVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || ruVar.d != this.d || ruVar.e != this.e || ruVar.f37131c != this.f37131c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public ru(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f37131c = i11;
        this.d = i12;
        this.e = i13;
        this.f37132f = charSequence;
        this.f37133g = charSequence2;
    }
}
