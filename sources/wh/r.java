package wh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;
public final class r {
    public static volatile boolean f49956e = false;
    public final Bitmap f49957a;
    public final int f49958b;
    public final int f49959c;
    public final int d;

    public r(Bitmap bitmap, int i10, int i11, int i12) {
        this.f49957a = bitmap;
        this.f49958b = i10;
        this.f49959c = i11;
        this.d = i12;
    }

    public static r a(String str, float f10, boolean z4) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!f49956e) {
                    synchronized (r.class) {
                        if (!f49956e) {
                            JLatexMathAndroid.init(ApplicationLoader.applicationContext);
                            f49956e = true;
                        }
                    }
                }
                JLatexMathDrawable build = JLatexMathDrawable.builder(str).textSize(f10).build();
                int intrinsicWidth = build.getIntrinsicWidth();
                int intrinsicHeight = build.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    int i10 = 0;
                    build.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    build.draw(new Canvas(createBitmap));
                    if (z4) {
                        i10 = build.icon().getIconDepth();
                    }
                    return new r(createBitmap, intrinsicWidth, intrinsicHeight, i10);
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        return null;
    }
}
