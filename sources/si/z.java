package si;

import android.opengl.GLES20;
public class z {
    public final int f47296a;
    public final int f47297b;
    public final int f47298c;
    public final int d;

    public z(int i10, int i11, int i12, int i13) {
        this.f47296a = i10;
        this.f47297b = i11;
        this.f47298c = i12;
        this.d = i13;
    }

    public boolean a(int i10) {
        if (i10 == 1) {
            if (this.f47296a - this.f47297b <= 1) {
                return false;
            }
        } else if (this.f47298c - this.d <= 1) {
            return false;
        }
        return true;
    }

    public void b() {
        GLES20.glDeleteProgram(this.f47296a);
        GLES20.glDeleteShader(this.f47297b);
        GLES20.glDeleteShader(this.f47298c);
    }

    public z(String str, String str2) {
        int a2 = d0.a(35633, str);
        this.f47297b = a2;
        int a10 = d0.a(35632, str2);
        this.f47298c = a10;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glBindAttribLocation(glCreateProgram, 0, "aPosition");
        GLES20.glBindAttribLocation(glCreateProgram, 1, "aTextureCoord");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            this.f47296a = glCreateProgram;
            this.d = 1;
            int glGetUniformLocation = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
            GLES20.glUseProgram(glCreateProgram);
            GLES20.glUniform1i(glGetUniformLocation, 0);
            return;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        GLES20.glDeleteProgram(glCreateProgram);
        throw new IllegalStateException(o0.h("Unable to link program: ", glGetProgramInfoLog));
    }
}
