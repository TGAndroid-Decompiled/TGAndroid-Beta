package yh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class h3 extends f3 {
    public final Paint f47461c;
    public final Matrix d;
    public final RadialGradient e;
    public final int f47462f;
    public final int f47463g;
    public final int h;

    public h3(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f47365a = stargiftattributebackdrop.name;
        this.f47366b = stargiftattributebackdrop.getRarityPermille();
        Paint paint = new Paint(1);
        this.f47461c = paint;
        this.d = new Matrix();
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.e = radialGradient;
        paint.setShader(radialGradient);
        this.f47463g = stargiftattributebackdrop.text_color | (-16777216);
        int i10 = stargiftattributebackdrop.pattern_color;
        this.h = i10 | (-16777216);
        this.f47462f = i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), i10 | (-16777216));
    }
}
