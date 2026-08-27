package rh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;

public final class q {

    public static volatile boolean f47380e = false;

    public final Bitmap f47381a;

    public final int f47382b;

    public final int f47383c;
    public final int d;

    public q(Bitmap bitmap, int i10, int i11, int i12) {
        this.f47381a = bitmap;
        this.f47382b = i10;
        this.f47383c = i11;
        this.d = i12;
    }

    public static q a(String str, float f10, boolean z10) {
        JLatexMathDrawable jLatexMathDrawableBuild;
        int intrinsicWidth;
        int intrinsicHeight;
        int iconDepth;
        if (str != null && !str.isEmpty()) {
            try {
                if (f47380e) {
                    jLatexMathDrawableBuild = JLatexMathDrawable.builder(str).textSize(f10).build();
                    intrinsicWidth = jLatexMathDrawableBuild.getIntrinsicWidth();
                    intrinsicHeight = jLatexMathDrawableBuild.getIntrinsicHeight();
                    if (intrinsicWidth > 0) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                        iconDepth = 0;
                        jLatexMathDrawableBuild.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        jLatexMathDrawableBuild.draw(new Canvas(bitmapCreateBitmap));
                        if (z10) {
                            iconDepth = jLatexMathDrawableBuild.icon().getIconDepth();
                        }
                        return new q(bitmapCreateBitmap, intrinsicWidth, intrinsicHeight, iconDepth);
                    }
                } else {
                    synchronized (q.class) {
                        try {
                            if (!f47380e) {
                                JLatexMathAndroid.init(ApplicationLoader.applicationContext);
                                f47380e = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    jLatexMathDrawableBuild = JLatexMathDrawable.builder(str).textSize(f10).build();
                    intrinsicWidth = jLatexMathDrawableBuild.getIntrinsicWidth();
                    intrinsicHeight = jLatexMathDrawableBuild.getIntrinsicHeight();
                    if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                        iconDepth = 0;
                        jLatexMathDrawableBuild.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        jLatexMathDrawableBuild.draw(new Canvas(bitmapCreateBitmap2));
                        if (z10) {
                            try {
                                iconDepth = jLatexMathDrawableBuild.icon().getIconDepth();
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        return new q(bitmapCreateBitmap2, intrinsicWidth, intrinsicHeight, iconDepth);
                    }
                }
            } catch (Throwable th3) {
                FileLog.e(th3);
            }
        }
        return null;
    }
}
