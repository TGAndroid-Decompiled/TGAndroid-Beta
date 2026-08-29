package u4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import f5.d0;
import java.util.ArrayList;
public final class b {
    public final ArrayList f49029a;
    public final ArrayList f49030b;
    public final StringBuilder f49031c;
    public int d;
    public int f49032e;
    public int f49033f;
    public int f49034g;
    public int h;

    public b(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f49029a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f49030b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f49031c = sb2;
        this.f49034g = i10;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.d = 15;
        this.f49032e = 0;
        this.f49033f = 0;
        this.h = i11;
    }

    public final void a(char c3) {
        StringBuilder sb2 = this.f49031c;
        if (sb2.length() < 32) {
            sb2.append(c3);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f49031c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f49029a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i10 = aVar.f49028c;
                if (i10 == length) {
                    aVar.f49028c = i10 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final t4.b c(int i10) {
        int i11;
        float f9;
        float c3;
        int i12 = this.f49032e + this.f49033f;
        int i13 = 32 - i12;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.f49030b;
            if (i14 >= arrayList.size()) {
                break;
            }
            CharSequence charSequence = (CharSequence) arrayList.get(i14);
            int i15 = d0.f6579a;
            if (charSequence.length() > i13) {
                charSequence = charSequence.subSequence(0, i13);
            }
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('\n');
            i14++;
        }
        SpannableString d = d();
        int i16 = d0.f6579a;
        int length = d.length();
        CharSequence charSequence2 = d;
        if (length > i13) {
            charSequence2 = d.subSequence(0, i13);
        }
        spannableStringBuilder.append(charSequence2);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i13 - spannableStringBuilder.length();
        int i17 = i12 - length2;
        if (i10 != Integer.MIN_VALUE) {
            i11 = i10;
        } else if (this.f49034g == 2 && (Math.abs(i17) < 3 || length2 < 0)) {
            i11 = 1;
        } else if (this.f49034g == 2 && i17 > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                c3 = u3.c.c(i12, 32.0f, 0.8f, 0.1f);
            } else {
                c3 = u3.c.c(32 - length2, 32.0f, 0.8f, 0.1f);
            }
            f9 = c3;
        } else {
            f9 = 0.5f;
        }
        int i18 = this.d;
        if (i18 > 7) {
            i18 -= 17;
        } else if (this.f49034g == 1) {
            i18 -= this.h - 1;
        }
        return new t4.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i18, 1, Integer.MIN_VALUE, f9, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        int i10;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f49031c);
        int length = spannableStringBuilder.length();
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = -1;
        int i16 = -1;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.f49029a;
            if (i11 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i11);
            boolean z12 = aVar.f49027b;
            int i17 = aVar.f49026a;
            if (i17 != 8) {
                if (i17 == 7) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i17 != 7) {
                    i16 = c.A[i17];
                }
                z11 = z10;
            }
            int i18 = aVar.f49028c;
            i11++;
            if (i11 < arrayList.size()) {
                i10 = ((a) arrayList.get(i11)).f49028c;
            } else {
                i10 = length;
            }
            if (i18 != i10) {
                if (i12 != -1 && !z12) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i18, 33);
                    i12 = -1;
                } else if (i12 == -1 && z12) {
                    i12 = i18;
                }
                if (i13 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i13, i18, 33);
                    i13 = -1;
                } else if (i13 == -1 && z11) {
                    i13 = i18;
                }
                if (i16 != i15) {
                    if (i15 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i15), i14, i18, 33);
                    }
                    i15 = i16;
                    i14 = i18;
                }
            }
        }
        if (i12 != -1 && i12 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i12, length, 33);
        }
        if (i13 != -1 && i13 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i13, length, 33);
        }
        if (i14 != length && i15 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i15), i14, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        if (this.f49029a.isEmpty() && this.f49030b.isEmpty() && this.f49031c.length() == 0) {
            return true;
        }
        return false;
    }
}
