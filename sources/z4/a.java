package z4;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import d5.g0;
import d5.z;
import java.nio.charset.Charset;
import java.util.List;
import o8.d;
import r4.c;
import r4.f;
import r4.g;
import r4.i;

public final class a extends f {

    public final z f50200b;

    public final boolean f50201c;
    public final int d;

    public final int f50202e;

    public final String f50203f;

    public final float f50204g;
    public final int h;

    public a(List list) {
        super("Tx3gDecoder");
        this.f50200b = new z();
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.d = 0;
            this.f50202e = -1;
            this.f50203f = "sans-serif";
            this.f50201c = false;
            this.f50204g = 0.85f;
            this.h = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.d = bArr[24];
        this.f50202e = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f50203f = "Serif".equals(new String(bArr, 43, bArr.length - 43, d.f19363c)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.h = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f50201c = z10;
        if (z10) {
            this.f50204g = g0.g(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f50204g = 0.85f;
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    @Override
    public final g c(int i10, boolean z10, byte[] bArr) throws i {
        String strP;
        z zVar = this.f50200b;
        zVar.A(i10, bArr);
        int i11 = 2;
        if (zVar.a() < 2) {
            throw new i("Unexpected subtitle format.");
        }
        int iW = zVar.w();
        if (iW == 0) {
            strP = "";
        } else {
            int i12 = zVar.f4859b;
            Charset charsetY = zVar.y();
            int i13 = iW - (zVar.f4859b - i12);
            if (charsetY == null) {
                charsetY = d.f19363c;
            }
            strP = zVar.p(i13, charsetY);
        }
        if (strP.isEmpty()) {
            return b.f50205b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strP);
        e(spannableStringBuilder, this.d, 0, 0, spannableStringBuilder.length(), 16711680);
        d(spannableStringBuilder, this.f50202e, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f50203f;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fG = this.f50204g;
        while (zVar.a() >= 8) {
            int i14 = zVar.f4859b;
            int iE = zVar.e();
            int iE2 = zVar.e();
            if (iE2 == 1937013100) {
                if (zVar.a() < i11) {
                    throw new i("Unexpected subtitle format.");
                }
                int iW2 = zVar.w();
                int i15 = 0;
                while (i15 < iW2) {
                    if (zVar.a() < 12) {
                        throw new i("Unexpected subtitle format.");
                    }
                    int iW3 = zVar.w();
                    int iW4 = zVar.w();
                    zVar.D(i11);
                    int iR = zVar.r();
                    zVar.D(1);
                    int iE3 = zVar.e();
                    if (iW4 > spannableStringBuilder.length()) {
                        StringBuilder sbO = i0.a.o(iW4, "Truncating styl end (", ") to cueText.length() (");
                        sbO.append(spannableStringBuilder.length());
                        sbO.append(").");
                        d5.a.K("Tx3gDecoder", sbO.toString());
                        iW4 = spannableStringBuilder.length();
                    }
                    int i16 = iW4;
                    if (iW3 >= i16) {
                        d5.a.K("Tx3gDecoder", "Ignoring styl with start (" + iW3 + ") >= end (" + i16 + ").");
                    } else {
                        e(spannableStringBuilder, iR, this.d, iW3, i16, 0);
                        d(spannableStringBuilder, iE3, this.f50202e, iW3, i16, 0);
                    }
                    i15++;
                    i11 = 2;
                }
            } else if (iE2 == 1952608120 && this.f50201c) {
                i11 = 2;
                if (zVar.a() < 2) {
                    throw new i("Unexpected subtitle format.");
                }
                fG = g0.g(zVar.w() / this.h, 0.0f, 0.95f);
            } else {
                i11 = 2;
            }
            zVar.C(i14 + iE);
        }
        return new b(new c(spannableStringBuilder, null, null, null, fG, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f));
    }
}
