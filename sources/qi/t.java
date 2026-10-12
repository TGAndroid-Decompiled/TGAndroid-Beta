package qi;

import android.opengl.GLES20;
import org.telegram.ui.Wallet.m5;
public class t extends m5 {
    public final int f46904e;

    public t() {
        super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", y.F);
        this.f46904e = GLES20.glGetUniformLocation(this.f35081a, "texOffset");
    }

    public t(String str, int i10) {
        super("uniform mat4 uTextureMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = (uTextureMatrix * vec4(aTextureCoord.xy, 0.0, 1.0)).xy;\n    vScreenTextureCoord = aPosition.xy * 0.5 + 0.5;\n}\n", str);
        switch (i10) {
            case 1:
                super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", str);
                this.f46904e = GLES20.glGetUniformLocation(this.f35081a, "texOffset");
                return;
            default:
                this.f46904e = GLES20.glGetUniformLocation(this.f35081a, "uTextureMatrix");
                return;
        }
    }
}
