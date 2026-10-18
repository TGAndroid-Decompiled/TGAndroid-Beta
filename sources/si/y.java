package si;

import android.opengl.GLES20;
import org.telegram.ui.Wallet.z5;
public class y extends z5 {
    public final int f46899f;

    public y() {
        super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", d0.F);
        this.f46899f = GLES20.glGetUniformLocation(this.f35172a, "texOffset");
    }

    public y(String str, int i10) {
        super("uniform mat4 uTextureMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = (uTextureMatrix * vec4(aTextureCoord.xy, 0.0, 1.0)).xy;\n    vScreenTextureCoord = aPosition.xy * 0.5 + 0.5;\n}\n", str);
        switch (i10) {
            case 1:
                super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", str);
                this.f46899f = GLES20.glGetUniformLocation(this.f35172a, "texOffset");
                return;
            default:
                this.f46899f = GLES20.glGetUniformLocation(this.f35172a, "uTextureMatrix");
                return;
        }
    }
}
