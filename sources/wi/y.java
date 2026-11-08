package wi;

import android.opengl.GLES20;
public class y extends b3.h {
    public final int f58259e;

    public y() {
        super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", d0.G);
        this.f58259e = GLES20.glGetUniformLocation(this.f2947a, "texOffset");
    }

    public y(String str, int i7) {
        super("uniform mat4 uTextureMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = (uTextureMatrix * vec4(aTextureCoord.xy, 0.0, 1.0)).xy;\n    vScreenTextureCoord = aPosition.xy * 0.5 + 0.5;\n}\n", str);
        switch (i7) {
            case 1:
                super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", str);
                this.f58259e = GLES20.glGetUniformLocation(this.f2947a, "texOffset");
                return;
            default:
                this.f58259e = GLES20.glGetUniformLocation(this.f2947a, "uTextureMatrix");
                return;
        }
    }
}
