package yh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class c3 extends a3 {
    public final Paint f52337c;
    public final Matrix d;
    public final RadialGradient f52338e;
    public final int f52339f;
    public final int f52340g;
    public final int h;

    public c3(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f52240a = stargiftattributebackdrop.name;
        this.f52241b = stargiftattributebackdrop.getRarityPermille();
        Paint paint = new Paint(1);
        this.f52337c = paint;
        this.d = new Matrix();
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f52338e = radialGradient;
        paint.setShader(radialGradient);
        this.f52340g = stargiftattributebackdrop.text_color | (-16777216);
        int i10 = stargiftattributebackdrop.pattern_color;
        this.h = i10 | (-16777216);
        this.f52339f = i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), i10 | (-16777216));
    }
}
