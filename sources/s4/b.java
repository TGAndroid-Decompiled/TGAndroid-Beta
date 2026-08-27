package s4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import d5.g0;
import java.util.ArrayList;

public final class b {

    public final ArrayList f47729a;

    public final ArrayList f47730b;

    public final StringBuilder f47731c;
    public int d;

    public int f47732e;

    public int f47733f;

    public int f47734g;
    public int h;

    public b(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f47729a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f47730b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f47731c = sb2;
        this.f47734g = i10;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.d = 15;
        this.f47732e = 0;
        this.f47733f = 0;
        this.h = i11;
    }

    public final void a(char c10) {
        StringBuilder sb2 = this.f47731c;
        if (sb2.length() < 32) {
            sb2.append(c10);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f47731c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f47729a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i10 = aVar.f47728c;
                if (i10 != length) {
                    return;
                }
                aVar.f47728c = i10 - 1;
            }
        }
    }

    public final r4.c c(int i10) {
        int i11;
        float fC;
        int i12 = this.f47732e + this.f47733f;
        int i13 = 32 - i12;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.f47730b;
            if (i14 >= arrayList.size()) {
                break;
            }
            CharSequence charSequenceSubSequence = (CharSequence) arrayList.get(i14);
            int i15 = g0.f4795a;
            if (charSequenceSubSequence.length() > i13) {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i13);
            }
            spannableStringBuilder.append(charSequenceSubSequence);
            spannableStringBuilder.append('\n');
            i14++;
        }
        SpannableString spannableStringD = d();
        int i16 = g0.f4795a;
        int length = spannableStringD.length();
        SpannableString spannableStringSubSequence = spannableStringD;
        if (length > i13) {
            spannableStringSubSequence = spannableStringD.subSequence(0, i13);
        }
        spannableStringBuilder.append((CharSequence) spannableStringSubSequence);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i13 - spannableStringBuilder.length();
        int i17 = i12 - length2;
        if (i10 != Integer.MIN_VALUE) {
            i11 = i10;
        } else if (this.f47734g != 2 || (Math.abs(i17) >= 3 && length2 >= 0)) {
            i11 = (this.f47734g != 2 || i17 <= 0) ? 0 : 2;
        } else {
            i11 = 1;
        }
        if (i11 != 1) {
            fC = i11 != 2 ? s3.c.c(i12, 32.0f, 0.8f, 0.1f) : s3.c.c(32 - length2, 32.0f, 0.8f, 0.1f);
        } else {
            fC = 0.5f;
        }
        int i18 = this.d;
        if (i18 > 7) {
            i18 -= 17;
        } else if (this.f47734g == 1) {
            i18 -= this.h - 1;
        }
        return new r4.c(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i18, 1, Integer.MIN_VALUE, fC, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f47731c);
        int length = spannableStringBuilder.length();
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        int i14 = -1;
        int i15 = -1;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f47729a;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z11 = aVar.f47727b;
            int i16 = aVar.f47726a;
            if (i16 != 8) {
                boolean z12 = i16 == 7;
                if (i16 != 7) {
                    i15 = c.A[i16];
                }
                z10 = z12;
            }
            int i17 = aVar.f47728c;
            i10++;
            if (i17 != (i10 < arrayList.size() ? ((a) arrayList.get(i10)).f47728c : length)) {
                if (i11 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z11) {
                    i11 = i17;
                }
                if (i12 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i12, i17, 33);
                    i12 = -1;
                } else if (i12 == -1 && z10) {
                    i12 = i17;
                }
                if (i15 != i14) {
                    if (i14 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i13, i17, 33);
                    }
                    i14 = i15;
                    i13 = i17;
                }
            }
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
        }
        if (i12 != -1 && i12 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i12, length, 33);
        }
        if (i13 != length && i14 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i13, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f47729a.isEmpty() && this.f47730b.isEmpty() && this.f47731c.length() == 0;
    }
}
