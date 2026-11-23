package qi;

import android.text.SpannableString;
import java.lang.reflect.Array;
public class d extends SpannableString {
    public volatile boolean f56220a;

    public d(CharSequence charSequence) {
        super(charSequence);
        this.f56220a = false;
    }

    public static Object[] a(d dVar, int i7, Class cls) {
        return super.getSpans(0, i7, cls);
    }

    public static int b(d dVar, Object obj) {
        return super.getSpanStart(obj);
    }

    public static int c(d dVar, Object obj) {
        return super.getSpanEnd(obj);
    }

    @Override
    public int getSpanEnd(Object obj) {
        if (!this.f56220a) {
            return -1;
        }
        return super.getSpanEnd(obj);
    }

    @Override
    public int getSpanFlags(Object obj) {
        if (!this.f56220a) {
            return 0;
        }
        return super.getSpanFlags(obj);
    }

    @Override
    public int getSpanStart(Object obj) {
        if (!this.f56220a) {
            return -1;
        }
        return super.getSpanStart(obj);
    }

    @Override
    public Object[] getSpans(int i7, int i10, Class cls) {
        if (!this.f56220a) {
            return (Object[]) Array.newInstance(cls, 0);
        }
        return super.getSpans(i7, i10, cls);
    }

    @Override
    public int nextSpanTransition(int i7, int i10, Class cls) {
        if (!this.f56220a) {
            return i10;
        }
        return super.nextSpanTransition(i7, i10, cls);
    }
}
