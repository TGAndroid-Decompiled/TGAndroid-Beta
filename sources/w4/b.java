package w4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
public final class b {
    public final ArrayList f49353a;
    public final ArrayList f49354b;
    public final StringBuilder f49355c;
    public int d;
    public int f49356e;
    public int f49357f;
    public int f49358g;
    public int h;

    public b(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f49353a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f49354b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f49355c = sb;
        this.f49358g = i10;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.d = 15;
        this.f49356e = 0;
        this.f49357f = 0;
        this.h = i11;
    }

    public final void a(char c3) {
        StringBuilder sb = this.f49355c;
        if (sb.length() < 32) {
            sb.append(c3);
        }
    }

    public final void b() {
        StringBuilder sb = this.f49355c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f49353a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i10 = aVar.f49352c;
                if (i10 == length) {
                    aVar.f49352c = i10 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final v4.b c(int i10) {
        int i11;
        float f10;
        float c3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f49354b;
            if (i12 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i12));
            spannableStringBuilder.append('\n');
            i12++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i13 = this.f49356e + this.f49357f;
        int length = (32 - i13) - spannableStringBuilder.length();
        int i14 = i13 - length;
        if (i10 != Integer.MIN_VALUE) {
            i11 = i10;
        } else if (this.f49358g == 2 && (Math.abs(i14) < 3 || length < 0)) {
            i11 = 1;
        } else if (this.f49358g == 2 && i14 > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                c3 = w.c.c(i13, 32.0f, 0.8f, 0.1f);
            } else {
                c3 = w.c.c(32 - length, 32.0f, 0.8f, 0.1f);
            }
            f10 = c3;
        } else {
            f10 = 0.5f;
        }
        int i15 = this.d;
        if (i15 > 7) {
            i15 -= 17;
        } else if (this.f49358g == 1) {
            i15 -= this.h - 1;
        }
        return new v4.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i15, 1, Integer.MIN_VALUE, f10, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        int i10;
        boolean z4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f49355c);
        int length = spannableStringBuilder.length();
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = -1;
        int i16 = -1;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f49353a;
            if (i11 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i11);
            boolean z11 = aVar.f49351b;
            int i17 = aVar.f49350a;
            if (i17 != 8) {
                if (i17 == 7) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i17 != 7) {
                    i16 = c.A[i17];
                }
                z10 = z4;
            }
            int i18 = aVar.f49352c;
            i11++;
            if (i11 < arrayList.size()) {
                i10 = ((a) arrayList.get(i11)).f49352c;
            } else {
                i10 = length;
            }
            if (i18 != i10) {
                if (i12 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i18, 33);
                    i12 = -1;
                } else if (i12 == -1 && z11) {
                    i12 = i18;
                }
                if (i13 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i13, i18, 33);
                    i13 = -1;
                } else if (i13 == -1 && z10) {
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
        if (this.f49353a.isEmpty() && this.f49354b.isEmpty() && this.f49355c.length() == 0) {
            return true;
        }
        return false;
    }
}
