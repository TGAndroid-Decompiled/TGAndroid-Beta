package yf;

import android.graphics.Color;
import android.opengl.GLES20;
import java.util.HashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public final class c1 {

    public int f49894a;

    public HashMap f49895b;

    public static void a(int i10, int i11) {
        GLES20.glUniform4f(i10, Color.red(i11) / 255.0f, Color.green(i11) / 255.0f, Color.blue(i11) / 255.0f, Color.alpha(i11) / 255.0f);
    }

    public static d5.p b(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0 && BuildVars.LOGS_ENABLED) {
            FileLog.e(GLES20.glGetShaderInfoLog(iGlCreateShader));
        }
        int i11 = iArr[0];
        d5.p pVar = new d5.p();
        pVar.f4821a = iGlCreateShader;
        pVar.f4822b = i11;
        return pVar;
    }

    public static void c(int i10, int i11, int i12) {
        if (i10 != 0) {
            GLES20.glDeleteShader(i10);
        }
        if (i11 != 0) {
            GLES20.glDeleteShader(i11);
        }
        if (i12 != 0) {
            GLES20.glDeleteProgram(i10);
        }
    }

    public final int d(String str) {
        return ((Integer) this.f49895b.get(str)).intValue();
    }
}
