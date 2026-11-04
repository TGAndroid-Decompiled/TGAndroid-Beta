package wi;

import android.opengl.GLES20;
public class x extends a3.h {
    public final int f58120e;

    public x() {
        super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", c0.F);
        this.f58120e = GLES20.glGetUniformLocation(this.f89a, "texOffset");
    }

    public x(String str, int i3) {
        super("uniform mat4 uTextureMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = (uTextureMatrix * vec4(aTextureCoord.xy, 0.0, 1.0)).xy;\n    vScreenTextureCoord = aPosition.xy * 0.5 + 0.5;\n}\n", str);
        switch (i3) {
            case 1:
                super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", str);
                this.f58120e = GLES20.glGetUniformLocation(this.f89a, "texOffset");
                return;
            default:
                this.f58120e = GLES20.glGetUniformLocation(this.f89a, "uTextureMatrix");
                return;
        }
    }
}
