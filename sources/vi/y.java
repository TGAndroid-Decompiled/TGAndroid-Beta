package vi;

import android.opengl.GLES20;
import org.telegram.ui.Components.b10;
public class y {
    public final int f50630a;
    public final int f50631b;
    public final int f50632c;
    public final int d;

    public y(int i10, int i11, int i12, int i13) {
        this.f50630a = i10;
        this.f50631b = i11;
        this.f50632c = i12;
        this.d = i13;
    }

    public boolean a(int i10) {
        if (i10 == 1) {
            if (this.f50630a - this.f50631b <= 1) {
                return false;
            }
        } else if (this.f50632c - this.d <= 1) {
            return false;
        }
        return true;
    }

    public void b() {
        GLES20.glDeleteProgram(this.f50630a);
        GLES20.glDeleteShader(this.f50631b);
        GLES20.glDeleteShader(this.f50632c);
    }

    public y(String str, String str2) {
        int a2 = c0.a(35633, str);
        this.f50631b = a2;
        int a10 = c0.a(35632, str2);
        this.f50632c = a10;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glBindAttribLocation(glCreateProgram, 0, "aPosition");
        GLES20.glBindAttribLocation(glCreateProgram, 1, "aTextureCoord");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            this.f50630a = glCreateProgram;
            this.d = 1;
            int glGetUniformLocation = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
            GLES20.glUseProgram(glCreateProgram);
            GLES20.glUniform1i(glGetUniformLocation, 0);
            return;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        GLES20.glDeleteProgram(glCreateProgram);
        throw new IllegalStateException(b10.j("Unable to link program: ", glGetProgramInfoLog));
    }
}
