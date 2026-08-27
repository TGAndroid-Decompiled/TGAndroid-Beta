package r4;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;

public final class a implements h3.f, e4.g {

    public final int f46720a;

    @Override
    public h3.g a(Bundle bundle) {
        float f10;
        int i10;
        int i11;
        float f11;
        boolean z10;
        int i12;
        CharSequence charSequence = bundle.getCharSequence(c.E);
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(c.F);
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(c.G);
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(c.H);
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        String str = c.I;
        if (bundle.containsKey(str)) {
            String str2 = c.J;
            if (bundle.containsKey(str2)) {
                f10 = bundle.getFloat(str);
                i10 = bundle.getInt(str2);
            } else {
                f10 = -3.4028235E38f;
                i10 = Integer.MIN_VALUE;
            }
        } else {
            f10 = -3.4028235E38f;
            i10 = Integer.MIN_VALUE;
        }
        String str3 = c.K;
        int i13 = bundle.containsKey(str3) ? bundle.getInt(str3) : Integer.MIN_VALUE;
        String str4 = c.L;
        float f12 = bundle.containsKey(str4) ? bundle.getFloat(str4) : -3.4028235E38f;
        String str5 = c.M;
        int i14 = bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
        String str6 = c.O;
        if (bundle.containsKey(str6)) {
            String str7 = c.N;
            if (bundle.containsKey(str7)) {
                float f13 = bundle.getFloat(str6);
                i11 = bundle.getInt(str7);
                f11 = f13;
            } else {
                i11 = Integer.MIN_VALUE;
                f11 = -3.4028235E38f;
            }
        } else {
            i11 = Integer.MIN_VALUE;
            f11 = -3.4028235E38f;
        }
        String str8 = c.P;
        float f14 = bundle.containsKey(str8) ? bundle.getFloat(str8) : -3.4028235E38f;
        String str9 = c.Q;
        float f15 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
        String str10 = c.R;
        if (bundle.containsKey(str10)) {
            z10 = true;
            i12 = bundle.getInt(str10);
        } else {
            z10 = false;
            i12 = -16777216;
        }
        boolean z11 = bundle.getBoolean(c.S, false) ? z10 : false;
        String str11 = c.T;
        int i15 = bundle.containsKey(str11) ? bundle.getInt(str11) : Integer.MIN_VALUE;
        String str12 = c.U;
        return new c(charSequence2, alignment2, alignment4, bitmap2, f10, i10, i13, f12, i14, i11, f11, f14, f15, z11, i12, i15, bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f);
    }

    @Override
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }
}
