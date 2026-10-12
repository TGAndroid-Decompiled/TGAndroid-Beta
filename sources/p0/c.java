package p0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import j$.util.Objects;
public final class c {
    public final TextPaint f42823a;
    public final TextDirectionHeuristic f42824b;
    public final int f42825c;
    public final int d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
        }
        this.f42823a = textPaint;
        this.f42824b = textDirectionHeuristic;
        this.f42825c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i10 = Build.VERSION.SDK_INT;
                if (this.f42825c == cVar.f42825c && this.d == cVar.d) {
                    TextPaint textPaint = this.f42823a;
                    float textSize = textPaint.getTextSize();
                    TextPaint textPaint2 = cVar.f42823a;
                    if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags()) {
                        if (i10 >= 24) {
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
                        if (this.f42824b == cVar.f42824b) {
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
        int i10 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = this.f42824b;
        int i11 = this.d;
        int i12 = this.f42825c;
        TextPaint textPaint = this.f42823a;
        if (i10 >= 24) {
            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11));
        }
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f42823a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i10 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i10 >= 24) {
            sb2.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb2.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i10 >= 26) {
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb2.append(", textDir=" + this.f42824b);
        sb2.append(", breakStrategy=" + this.f42825c);
        sb2.append(", hyphenationFrequency=" + this.d);
        sb2.append("}");
        return sb2.toString();
    }

    public c(PrecomputedText.Params params) {
        this.f42823a = params.getTextPaint();
        this.f42824b = params.getTextDirection();
        this.f42825c = params.getBreakStrategy();
        this.d = params.getHyphenationFrequency();
    }
}
