package tg;

import android.graphics.Color;
import android.opengl.GLES20;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.r2;
public final class v0 {
    public int f55337a;
    public HashMap f55338b;

    public static void a(int i3, int i10) {
        GLES20.glUniform4f(i3, Color.red(i10) / 255.0f, Color.green(i10) / 255.0f, Color.blue(i10) / 255.0f, Color.alpha(i10) / 255.0f);
    }

    public static d2.t0 b(int i3, String str) {
        int glCreateShader = GLES20.glCreateShader(i3);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0 && r2.f25040a) {
            a8.d(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        int i10 = iArr[0];
        ?? obj = new Object();
        obj.f8413a = glCreateShader;
        obj.f8414b = i10;
        return obj;
    }

    public static void c(int i3, int i10, int i11) {
        if (i3 != 0) {
            GLES20.glDeleteShader(i3);
        }
        if (i10 != 0) {
            GLES20.glDeleteShader(i10);
        }
        if (i11 != 0) {
            GLES20.glDeleteProgram(i3);
        }
    }

    public final int d(String str) {
        return ((Integer) this.f55338b.get(str)).intValue();
    }
}
