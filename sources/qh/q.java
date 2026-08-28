package qh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;
public final class q {
    public static volatile boolean f46617e = false;
    public final Bitmap f46618a;
    public final int f46619b;
    public final int f46620c;
    public final int d;

    public q(Bitmap bitmap, int i9, int i10, int i11) {
        this.f46618a = bitmap;
        this.f46619b = i9;
        this.f46620c = i10;
        this.d = i11;
    }

    public static q a(String str, float f10, boolean z10) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!f46617e) {
                    synchronized (q.class) {
                        if (!f46617e) {
                            JLatexMathAndroid.init(ApplicationLoader.applicationContext);
                            f46617e = true;
                        }
                    }
                }
                JLatexMathDrawable build = JLatexMathDrawable.builder(str).textSize(f10).build();
                int intrinsicWidth = build.getIntrinsicWidth();
                int intrinsicHeight = build.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    int i9 = 0;
                    build.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    build.draw(new Canvas(createBitmap));
                    if (z10) {
                        i9 = build.icon().getIconDepth();
                    }
                    return new q(createBitmap, intrinsicWidth, intrinsicHeight, i9);
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        return null;
    }
}
