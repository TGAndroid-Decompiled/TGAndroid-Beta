package w7;

import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
public abstract class u6 {
    public static void a() {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.d("Paint", GLUtils.getEGLErrorString(glGetError));
        }
    }
}
