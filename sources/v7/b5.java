package v7;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
public abstract class b5 {
    public static StaticLayout f50413a;

    public static bi.e0 a(int i10, int i11, int i12, int i13) {
        Rect rect = new Rect(i10, i11, i12, i13);
        if (f50413a == null) {
            f50413a = new StaticLayout(" ", new TextPaint(), 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        return new bi.e0(f50413a, rect);
    }
}
