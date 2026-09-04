package zh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class g3 extends e3 {
    public final Paint f51943c;
    public final Matrix d;
    public final RadialGradient f51944e;
    public final int f51945f;
    public final int f51946g;
    public final int h;

    public g3(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f51821a = stargiftattributebackdrop.name;
        this.f51822b = stargiftattributebackdrop.getRarityPermille();
        Paint paint = new Paint(1);
        this.f51943c = paint;
        this.d = new Matrix();
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f51944e = radialGradient;
        paint.setShader(radialGradient);
        this.f51946g = stargiftattributebackdrop.text_color | (-16777216);
        int i10 = stargiftattributebackdrop.pattern_color;
        this.h = i10 | (-16777216);
        this.f51945f = i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), i10 | (-16777216));
    }
}
