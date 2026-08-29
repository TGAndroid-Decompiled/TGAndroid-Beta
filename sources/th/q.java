package th;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;
public final class q {
    public static volatile boolean f48678e = false;
    public final Bitmap f48679a;
    public final int f48680b;
    public final int f48681c;
    public final int d;

    public q(Bitmap bitmap, int i10, int i11, int i12) {
        this.f48679a = bitmap;
        this.f48680b = i10;
        this.f48681c = i11;
        this.d = i12;
    }

    public static q a(String str, float f9, boolean z10) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!f48678e) {
                    synchronized (q.class) {
                        if (!f48678e) {
                            JLatexMathAndroid.init(ApplicationLoader.applicationContext);
                            f48678e = true;
                        }
                    }
                }
                JLatexMathDrawable build = JLatexMathDrawable.builder(str).textSize(f9).build();
                int intrinsicWidth = build.getIntrinsicWidth();
                int intrinsicHeight = build.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    int i10 = 0;
                    build.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    build.draw(new Canvas(createBitmap));
                    if (z10) {
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
