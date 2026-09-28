package v7;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
public abstract class q8 {
    public static StaticLayout f44362a;

    public static ii.c0 a(int i10, int i11, int i12, int i13) {
        Rect rect = new Rect(i10, i11, i12, i13);
        if (f44362a == null) {
            f44362a = new StaticLayout(" ", new TextPaint(), 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        return new ii.c0(f44362a, rect);
    }
}
