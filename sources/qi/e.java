package qi;

import android.text.SpannableStringBuilder;
public final class e extends d {
    public SpannableStringBuilder f56217b;

    @Override
    public final int getSpanEnd(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.f56216a && (spannableStringBuilder = this.f56217b) != null) {
            return spannableStringBuilder.getSpanEnd(obj);
        }
        return super.getSpanEnd(obj);
    }

    @Override
    public final int getSpanFlags(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.f56216a && (spannableStringBuilder = this.f56217b) != null) {
            return spannableStringBuilder.getSpanFlags(obj);
        }
        return super.getSpanFlags(obj);
    }

    @Override
    public final int getSpanStart(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.f56216a && (spannableStringBuilder = this.f56217b) != null) {
            return spannableStringBuilder.getSpanStart(obj);
        }
        return super.getSpanStart(obj);
    }

    @Override
    public final Object[] getSpans(int i7, int i10, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.f56216a && (spannableStringBuilder = this.f56217b) != null) {
            return spannableStringBuilder.getSpans(i7, i10, cls);
        }
        return super.getSpans(i7, i10, cls);
    }

    @Override
    public final int nextSpanTransition(int i7, int i10, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.f56216a && (spannableStringBuilder = this.f56217b) != null) {
            return spannableStringBuilder.nextSpanTransition(i7, i10, cls);
        }
        return super.nextSpanTransition(i7, i10, cls);
    }
}
