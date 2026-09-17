package yh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 extends h3 {
    public final Paint f47345c;
    public final Matrix d;
    public final RadialGradient e;
    public final int f47346f;
    public final int f47347g;
    public final int h;

    public j3(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f47269a = stargiftattributebackdrop.name;
        this.f47270b = stargiftattributebackdrop.getRarityPermille();
        Paint paint = new Paint(1);
        this.f47345c = paint;
        this.d = new Matrix();
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.e = radialGradient;
        paint.setShader(radialGradient);
        this.f47347g = stargiftattributebackdrop.text_color | (-16777216);
        int i10 = stargiftattributebackdrop.pattern_color;
        this.h = i10 | (-16777216);
        this.f47346f = i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), i10 | (-16777216));
    }
}
