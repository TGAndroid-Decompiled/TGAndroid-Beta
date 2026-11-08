package p0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import j$.util.Objects;
public final class c {
    public final TextPaint f53077a;
    public final TextDirectionHeuristic f53078b;
    public final int f53079c;
    public final int d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i7, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i7).setHyphenationFrequency(i10).setTextDirection(textDirectionHeuristic).build();
        }
        this.f53077a = textPaint;
        this.f53078b = textDirectionHeuristic;
        this.f53079c = i7;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i7 = Build.VERSION.SDK_INT;
                if (this.f53079c == cVar.f53079c && this.d == cVar.d) {
                    TextPaint textPaint = this.f53077a;
                    float textSize = textPaint.getTextSize();
                    TextPaint textPaint2 = cVar.f53077a;
                    if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags()) {
                        if (i7 >= 24) {
                            if (!textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                                return false;
                            }
                        } else if (!textPaint.getTextLocale().equals(textPaint2.getTextLocale())) {
                            return false;
                        }
                        if (textPaint.getTypeface() == null) {
                            if (textPaint2.getTypeface() != null) {
                                return false;
                            }
                        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
                            return false;
                        }
                        if (this.f53078b == cVar.f53078b) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = this.f53078b;
        int i10 = this.d;
        int i11 = this.f53079c;
        TextPaint textPaint = this.f53077a;
        if (i7 >= 24) {
            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i11), Integer.valueOf(i10));
        }
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i11), Integer.valueOf(i10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f53077a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i7 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i7 >= 24) {
            sb2.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb2.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i7 >= 26) {
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb2.append(", textDir=" + this.f53078b);
        sb2.append(", breakStrategy=" + this.f53079c);
        sb2.append(", hyphenationFrequency=" + this.d);
        sb2.append("}");
        return sb2.toString();
    }

    public c(PrecomputedText.Params params) {
        this.f53077a = params.getTextPaint();
        this.f53078b = params.getTextDirection();
        this.f53079c = params.getBreakStrategy();
        this.d = params.getHyphenationFrequency();
    }
}
