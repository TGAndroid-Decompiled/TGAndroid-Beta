package zh;

import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
public abstract class u {
    public static float f52129a = -1.0f;

    public static Canvas a(int i10, int i11, Object obj) {
        RenderNode c10 = org.telegram.messenger.b.c(obj);
        c10.setPosition(0, 0, i10, i11);
        return c10.beginRecording();
    }

    public static void b(Canvas canvas, Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public static void c(Canvas canvas, Object obj) {
        canvas.drawRenderNode(org.telegram.messenger.b.c(obj));
    }

    public static void d(Object obj) {
        org.telegram.messenger.b.c(obj).endRecording();
    }

    public static boolean e(Object obj) {
        if (obj != null && org.telegram.messenger.b.c(obj).hasDisplayList()) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    public static float g(View view) {
        float f7;
        int identifier;
        WindowInsets windowInsets;
        float f10;
        if (Build.VERSION.SDK_INT >= 31) {
            if (view != null) {
                windowInsets = view.getRootWindowInsets();
            } else {
                windowInsets = null;
            }
            if (windowInsets == null) {
                f10 = -1.0f;
            } else {
                RoundedCorner roundedCorner = windowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    f10 = roundedCorner.getRadius();
                } else {
                    f10 = 0.0f;
                }
            }
            if (f10 >= 0.0f) {
                return f10;
            }
        }
        if (f52129a < 0.0f) {
            try {
                Resources system = Resources.getSystem();
                int identifier2 = system.getIdentifier("rounded_corner_radius_top", "dimen", "android");
                if (identifier2 != 0) {
                    f7 = system.getDimensionPixelSize(identifier2);
                } else {
                    f7 = 0.0f;
                }
                if (f7 <= 0.0f && (identifier = system.getIdentifier("rounded_corner_radius", "dimen", "android")) != 0) {
                    f7 = system.getDimensionPixelSize(identifier);
                }
            } catch (Exception unused) {
                f7 = 0.0f;
            }
            f52129a = Math.max(0.0f, f7);
        }
        return f52129a;
    }

    public static void h(Object obj, float f7) {
        org.telegram.messenger.b.c(obj).setAlpha(f7);
    }

    public static void i(Paint paint, int i10) {
        BlendMode blendMode;
        switch (i10) {
            case 1:
                blendMode = BlendMode.PLUS;
                break;
            case 2:
                blendMode = BlendMode.SCREEN;
                break;
            case 3:
                blendMode = BlendMode.COLOR_DODGE;
                break;
            case 4:
                blendMode = BlendMode.OVERLAY;
                break;
            case 5:
                blendMode = BlendMode.SOFT_LIGHT;
                break;
            case 6:
                blendMode = BlendMode.COLOR_BURN;
                break;
            default:
                blendMode = null;
                break;
        }
        paint.setBlendMode(blendMode);
    }

    public static void j(Object obj, float f7) {
        RenderEffect renderEffect;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RenderNode renderNode = (RenderNode) obj;
        if (f7 > 0.0f) {
            renderEffect = RenderEffect.createBlurEffect(f7, f7, tileMode);
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public static void k(Object obj, float f7, float[] fArr) {
        org.telegram.messenger.b.c(obj).setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(fArr), RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP)));
    }

    public static ColorFilter l(int i10) {
        BlendMode blendMode;
        blendMode = BlendMode.SRC_IN;
        return new BlendModeColorFilter(i10, blendMode);
    }
}
