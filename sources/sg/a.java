package sg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.h6;
public final class a implements GLSurfaceView.Renderer {
    public final int A;
    public final int B;
    public boolean C;
    public float D;
    public int f43303a;
    public int f43304b;
    public f f43305c;
    public float f43308i;
    public final Context f43313n;
    public Bitmap f43314o;
    public float f43315p;
    public float f43316q;
    public float f43317r;
    public float f43318s;
    public boolean f43319t;
    public int f43320u;
    public int v;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f43306f = 0.0f;
    public float f43307g = 0.0f;
    public float h = 0.0f;
    public final float[] f43309j = new float[16];
    public final float[] f43310k = new float[16];
    public final float[] f43311l = new float[16];
    public final float[] f43312m = new float[16];
    public int f43321w = h6.Vj;
    public int f43322x = h6.Wj;
    public final int f43323y = h6.fk;
    public final int f43324z = h6.gk;

    public a(Context context, int i10, int i11) {
        this.f43308i = 0.0f;
        this.f43313n = context;
        this.A = i10;
        this.B = i11;
        if (i11 == 2) {
            this.f43308i = 1.0f;
        }
        b();
    }

    public static int a(int i10, String str) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i10);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        throw new RuntimeException("Could not compile program: " + GLES20.glGetShaderInfoLog(glCreateShader) + " " + str);
    }

    public final void b() {
        boolean z10;
        int i10 = h6.f19146h5;
        boolean z11 = false;
        if (i0.a.f(h6.w0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43319t = z10;
        this.f43320u = i0.a.d(this.f43308i, h6.w0(null, this.f43321w, false), h6.w0(null, this.f43323y, false));
        this.v = i0.a.d(this.f43308i, h6.w0(null, this.f43322x, false), h6.w0(null, this.f43324z, false));
        if (this.A == 1 && i0.a.f(h6.w0(null, i10, false)) < 0.5d) {
            z11 = true;
        }
        this.C = z11;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float f7;
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        if (this.B == 4) {
            f7 = 40.0f;
        } else {
            f7 = 0.0f;
        }
        Matrix.setLookAtM(this.f43311l, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr = this.f43312m;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, this.e, 0.0f);
        Matrix.rotateM(this.f43312m, 0, -this.f43307g, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f43312m, 0, (-this.d) - this.f43306f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f43309j, 0, this.f43311l, 0, this.f43312m, 0);
        float[] fArr2 = this.f43309j;
        Matrix.multiplyMM(fArr2, 0, this.f43310k, 0, fArr2, 0);
        f fVar = this.f43305c;
        if (fVar != null) {
            fVar.D = this.f43319t;
            fVar.f43366y = this.f43320u;
            fVar.f43367z = this.v;
            int i10 = this.f43303a;
            int i11 = this.f43304b;
            float f10 = this.f43315p;
            float f11 = this.f43317r;
            float f12 = this.f43316q;
            float f13 = this.f43318s;
            float f14 = this.h;
            float f15 = this.f43308i;
            float f16 = this.D;
            if (fVar.V != null) {
                GLES20.glBindTexture(3553, fVar.f43352j);
                GLUtils.texImage2D(3553, 0, fVar.V, 0);
                fVar.V = null;
            }
            GLES20.glUniform1i(fVar.f43350g, 0);
            GLES20.glUniform1f(fVar.f43356n, fVar.f43361s);
            GLES20.glUniform1f(fVar.f43357o, fVar.f43363u);
            GLES20.glUniform1f(fVar.f43359q, f14);
            GLES20.glUniform1f(fVar.f43360r, f15);
            GLES20.glUniformMatrix4fv(fVar.f43347b, 1, false, this.f43309j, 0);
            GLES20.glUniformMatrix4fv(fVar.f43348c, 1, false, fArr, 0);
            GLES20.glUniform1f(fVar.E, fVar.v);
            GLES20.glUniform1f(fVar.F, fVar.f43364w);
            GLES20.glUniform1f(fVar.G, fVar.f43365x);
            GLES20.glUniform1f(fVar.J, fVar.A);
            GLES20.glUniform3f(fVar.H, Color.red(fVar.f43366y) / 255.0f, Color.green(fVar.f43366y) / 255.0f, Color.blue(fVar.f43366y) / 255.0f);
            GLES20.glUniform3f(fVar.I, Color.red(fVar.f43367z) / 255.0f, Color.green(fVar.f43367z) / 255.0f, Color.blue(fVar.f43367z) / 255.0f);
            GLES20.glUniform3f(fVar.K, Color.red(fVar.B) / 255.0f, Color.green(fVar.B) / 255.0f, Color.blue(fVar.B) / 255.0f);
            GLES20.glUniform3f(fVar.L, Color.red(fVar.C) / 255.0f, Color.green(fVar.C) / 255.0f, Color.blue(fVar.C) / 255.0f);
            GLES20.glUniform2f(fVar.M, i10, i11);
            GLES20.glUniform4f(fVar.N, f10, f11, f12, f13);
            GLES20.glUniform1i(fVar.S, fVar.D ? 1 : 0);
            float f17 = fVar.Z + f16;
            fVar.Z = f17;
            GLES20.glUniform1f(fVar.T, f17);
            if (fVar.X == 4) {
                fVar.a(0, true);
                GLES20.glClear(256);
                fVar.a(1, true);
                GLES20.glClear(256);
                fVar.a(2, false);
                fVar.a(1, false);
                fVar.a(0, false);
            } else {
                for (int i12 = 0; i12 < fVar.W; i12++) {
                    fVar.a(i12, false);
                }
            }
            float f18 = fVar.f43363u;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                fVar.f43363u = f19;
                if (f19 > 1.0f) {
                    fVar.f43363u = 1.0f;
                }
            }
            float f20 = fVar.f43361s + 5.0E-4f;
            fVar.f43361s = f20;
            if (f20 > 1.0f) {
                fVar.f43361s = f20 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f43303a = i10;
        this.f43304b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.B == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f43310k, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        f fVar = this.f43305c;
        if (fVar != null) {
            GLES20.glDeleteProgram(fVar.f43346a);
        }
        f fVar2 = new f(this.f43313n, this.B);
        this.f43305c = fVar2;
        Bitmap bitmap = this.f43314o;
        if (bitmap != null) {
            fVar2.V = bitmap;
        }
        if (this.C) {
            fVar2.v = 1.0f;
            fVar2.f43364w = 0.2f;
        }
    }
}
