package rh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.tgnet.tl.TL_stars;
public final class k3 extends i3 {
    public final Paint f47164c;
    public final Matrix d;
    public final RadialGradient e;
    public final int f47165f;
    public final int f47166g;
    public final int h;

    public k3(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f47097a = stargiftattributebackdrop.name;
        this.f47098b = stargiftattributebackdrop.getRarityPermille();
        Paint paint = new Paint(1);
        this.f47164c = paint;
        this.d = new Matrix();
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.e = radialGradient;
        paint.setShader(radialGradient);
        this.f47166g = stargiftattributebackdrop.text_color | (-16777216);
        int i10 = stargiftattributebackdrop.pattern_color;
        this.h = i10 | (-16777216);
        this.f47165f = i0.b.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), i10 | (-16777216));
    }
}
