package org.telegram.ui;

import android.text.TextUtils;
public final class ru extends pg.a {
    public final int f40235c;
    public final int d;
    public final int f40236e;
    public final CharSequence f40237f;
    public final CharSequence f40238g;
    public final int h;

    public ru(int i10, String str) {
        super(i10, false);
        this.f40237f = str;
    }

    public static ru b(CharSequence charSequence, String str) {
        return new ru(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ru)) {
            return false;
        }
        ru ruVar = (ru) obj;
        CharSequence charSequence = ruVar.f40237f;
        int i10 = ruVar.f44072a;
        int i11 = this.f44072a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f40237f;
        if (i11 != 1 && i11 != 4 && i11 != 3 && i11 != 5) {
            if (i11 != 2) {
                return true;
            }
            if (ruVar.h != this.h || !TextUtils.equals(charSequence2, charSequence) || ruVar.d != this.d || ruVar.f40236e != this.f40236e || ruVar.f40235c != this.f40235c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public ru(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.f40235c = i11;
        this.d = i12;
        this.f40236e = i13;
        this.f40237f = charSequence;
        this.f40238g = charSequence2;
    }
}
