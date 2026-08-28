package s4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import d5.f0;
import java.util.ArrayList;
import org.telegram.ui.Cells.j2;
public final class b {
    public final ArrayList f47365a;
    public final ArrayList f47366b;
    public final StringBuilder f47367c;
    public int d;
    public int f47368e;
    public int f47369f;
    public int f47370g;
    public int h;

    public b(int i9, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f47365a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f47366b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f47367c = sb2;
        this.f47370g = i9;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.d = 15;
        this.f47368e = 0;
        this.f47369f = 0;
        this.h = i10;
    }

    public final void a(char c10) {
        StringBuilder sb2 = this.f47367c;
        if (sb2.length() < 32) {
            sb2.append(c10);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f47367c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f47365a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i9 = aVar.f47364c;
                if (i9 == length) {
                    aVar.f47364c = i9 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final r4.b c(int i9) {
        int i10;
        float f10;
        float b10;
        int i11 = this.f47368e + this.f47369f;
        int i12 = 32 - i11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f47366b;
            if (i13 >= arrayList.size()) {
                break;
            }
            CharSequence charSequence = (CharSequence) arrayList.get(i13);
            int i14 = f0.f4349a;
            if (charSequence.length() > i12) {
                charSequence = charSequence.subSequence(0, i12);
            }
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('\n');
            i13++;
        }
        SpannableString d = d();
        int i15 = f0.f4349a;
        int length = d.length();
        CharSequence charSequence2 = d;
        if (length > i12) {
            charSequence2 = d.subSequence(0, i12);
        }
        spannableStringBuilder.append(charSequence2);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i12 - spannableStringBuilder.length();
        int i16 = i11 - length2;
        if (i9 != Integer.MIN_VALUE) {
            i10 = i9;
        } else if (this.f47370g == 2 && (Math.abs(i16) < 3 || length2 < 0)) {
            i10 = 1;
        } else if (this.f47370g == 2 && i16 > 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                b10 = j2.b(i11, 32.0f, 0.8f, 0.1f);
            } else {
                b10 = j2.b(32 - length2, 32.0f, 0.8f, 0.1f);
            }
            f10 = b10;
        } else {
            f10 = 0.5f;
        }
        int i17 = this.d;
        if (i17 > 7) {
            i17 -= 17;
        } else if (this.f47370g == 1) {
            i17 -= this.h - 1;
        }
        return new r4.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i17, 1, Integer.MIN_VALUE, f10, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        int i9;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f47367c);
        int length = spannableStringBuilder.length();
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        int i14 = -1;
        int i15 = -1;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.f47365a;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z12 = aVar.f47363b;
            int i16 = aVar.f47362a;
            if (i16 != 8) {
                if (i16 == 7) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i16 != 7) {
                    i15 = c.A[i16];
                }
                z11 = z10;
            }
            int i17 = aVar.f47364c;
            i10++;
            if (i10 < arrayList.size()) {
                i9 = ((a) arrayList.get(i10)).f47364c;
            } else {
                i9 = length;
            }
            if (i17 != i9) {
                if (i11 != -1 && !z12) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z12) {
                    i11 = i17;
                }
                if (i12 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i12, i17, 33);
                    i12 = -1;
                } else if (i12 == -1 && z11) {
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
        if (this.f47365a.isEmpty() && this.f47366b.isEmpty() && this.f47367c.length() == 0) {
            return true;
        }
        return false;
    }
}
