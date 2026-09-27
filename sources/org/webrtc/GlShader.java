package org.webrtc;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
public class GlShader {
    private static final String TAG = "GlShader";
    private int program;

    public GlShader(String str, String str2) {
        int compileShader = compileShader(35633, str);
        int compileShader2 = compileShader(35632, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        this.program = glCreateProgram;
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, compileShader);
            GLES20.glAttachShader(this.program, compileShader2);
            GLES20.glLinkProgram(this.program);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.program, 35714, iArr, 0);
            if (iArr[0] == 1) {
                GLES20.glDeleteShader(compileShader);
                GLES20.glDeleteShader(compileShader2);
                GlUtil.checkNoGLES2Error("Creating GlShader");
                return;
            }
            Logging.e("GlShader", "Could not link program: " + GLES20.glGetProgramInfoLog(this.program));
            throw new RuntimeException(GLES20.glGetProgramInfoLog(this.program));
        }
        throw new RuntimeException("glCreateProgram() failed. GLES20 error: " + GLES20.glGetError());
    }

    private static int compileShader(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 1) {
                GlUtil.checkNoGLES2Error("compileShader");
                return glCreateShader;
            }
            Logging.e("GlShader", "Compile error " + GLES20.glGetShaderInfoLog(glCreateShader) + " in shader:\n" + str);
            throw new RuntimeException(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        throw new RuntimeException("glCreateShader() failed. GLES20 error: " + GLES20.glGetError());
    }

    public int getAttribLocation(String str) {
        int i10 = this.program;
        if (i10 != -1) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(i10, str);
            if (glGetAttribLocation >= 0) {
                return glGetAttribLocation;
            }
            throw new RuntimeException(a4.a.p("Could not locate '", str, "' in program"));
        }
        throw new RuntimeException("The program has been released");
    }

    public int getUniformLocation(String str) {
        int i10 = this.program;
        if (i10 != -1) {
            int glGetUniformLocation = GLES20.glGetUniformLocation(i10, str);
            if (glGetUniformLocation >= 0) {
                return glGetUniformLocation;
            }
            throw new RuntimeException(a4.a.p("Could not locate uniform '", str, "' in program"));
        }
        throw new RuntimeException("The program has been released");
    }

    public void release() {
        Logging.d("GlShader", "Deleting shader.");
        int i10 = this.program;
        if (i10 != -1) {
            GLES20.glDeleteProgram(i10);
            this.program = -1;
        }
    }

    public void setVertexAttribArray(String str, int i10, FloatBuffer floatBuffer) {
        setVertexAttribArray(str, i10, 0, floatBuffer);
    }

    public void useProgram() {
        if (this.program != -1) {
            synchronized (EglBase.lock) {
                GLES20.glUseProgram(this.program);
            }
            GlUtil.checkNoGLES2Error("glUseProgram");
            return;
        }
        throw new RuntimeException("The program has been released");
    }

    public void setVertexAttribArray(String str, int i10, int i11, FloatBuffer floatBuffer) {
        if (this.program != -1) {
            int attribLocation = getAttribLocation(str);
            GLES20.glEnableVertexAttribArray(attribLocation);
            GLES20.glVertexAttribPointer(attribLocation, i10, 5126, false, i11, (Buffer) floatBuffer);
            GlUtil.checkNoGLES2Error("setVertexAttribArray");
            return;
        }
        throw new RuntimeException("The program has been released");
    }
}
