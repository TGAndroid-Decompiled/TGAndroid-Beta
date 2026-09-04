package w7;

import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public abstract class j0 {
    public static RectF f48172a;

    public static void a(Path path, RectF rectF, float f7) {
        if (path == null) {
            return;
        }
        if (f48172a == null) {
            f48172a = new RectF();
        }
        float f10 = 2.0f * f7;
        path.rewind();
        f48172a.set(0.0f, -rectF.height(), f10, (-rectF.height()) + f10);
        path.arcTo(f48172a, 180.0f, 90.0f);
        f48172a.set(rectF.width() - f10, -rectF.height(), rectF.width(), (-rectF.height()) + f10);
        path.arcTo(f48172a, 270.0f, 90.0f);
        f48172a.set(rectF.width() - f10, -f10, rectF.width(), 0.0f);
        path.arcTo(f48172a, 0.0f, 90.0f);
        path.quadTo(f7, 0.0f, f7, 0.0f);
        path.cubicTo(AndroidUtilities.dp(7.62f), AndroidUtilities.dp(-0.5f), AndroidUtilities.dp(5.807f), AndroidUtilities.dp(-1.502f), AndroidUtilities.dp(6.02f), AndroidUtilities.dp(-1.386f));
        path.cubicTo(AndroidUtilities.dp(4.814f), AndroidUtilities.dp(-0.81f), AndroidUtilities.dp(2.706f), AndroidUtilities.dp(-0.133f), AndroidUtilities.dp(3.6f), AndroidUtilities.dp(-0.44f));
        path.cubicTo(AndroidUtilities.dp(1.004f), AndroidUtilities.dp(-0.206f), AndroidUtilities.dp(-0.047f), AndroidUtilities.dp(-0.32f), AndroidUtilities.dp(0.247f), AndroidUtilities.dp(-0.29f));
        path.cubicTo(AndroidUtilities.dp(-0.334f), AndroidUtilities.dp(-1.571f), 0.0f, AndroidUtilities.dp(-1.155f), AndroidUtilities.dp(-0.06f), AndroidUtilities.dp(-1.154f));
        path.cubicTo(AndroidUtilities.dp(1.083f), AndroidUtilities.dp(-2.123f), AndroidUtilities.dp(1.667f), AndroidUtilities.dp(-3.667f), AndroidUtilities.dp(1.453f), AndroidUtilities.dp(-3.12f));
        path.cubicTo(AndroidUtilities.dp(2.1f), AndroidUtilities.dp(-4.793f), AndroidUtilities.dp(1.24f), AndroidUtilities.dp(-6.267f), AndroidUtilities.dp(1.67f), AndroidUtilities.dp(-5.53f));
        float f11 = -f7;
        path.quadTo(0.0f, AndroidUtilities.dp(2.187f) + f11, 0.0f, f11);
        path.close();
        path.offset(rectF.left, rectF.bottom);
    }
}
