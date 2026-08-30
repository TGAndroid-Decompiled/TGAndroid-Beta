package vh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;
public final class q {
    public static volatile boolean e = false;
    public final Bitmap f46075a;
    public final int f46076b;
    public final int f46077c;
    public final int d;

    public q(Bitmap bitmap, int i10, int i11, int i12) {
        this.f46075a = bitmap;
        this.f46076b = i10;
        this.f46077c = i11;
        this.d = i12;
    }

    public static q a(String str, float f10, boolean z4) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!e) {
                    synchronized (q.class) {
                        if (!e) {
                            JLatexMathAndroid.init(ApplicationLoader.applicationContext);
                            e = true;
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
                    return new q(createBitmap, intrinsicWidth, intrinsicHeight, i10);
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        return null;
    }
}
