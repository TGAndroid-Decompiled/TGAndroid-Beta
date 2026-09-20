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
import org.telegram.ui.ActionBar.j6;
public final class a implements GLSurfaceView.Renderer {
    public final int A;
    public final int B;
    public boolean C;
    public float D;
    public int f43209a;
    public int f43210b;
    public f f43211c;
    public float f43214i;
    public final Context f43219n;
    public Bitmap f43220o;
    public float f43221p;
    public float f43222q;
    public float f43223r;
    public float f43224s;
    public boolean f43225t;
    public int f43226u;
    public int v;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f43212f = 0.0f;
    public float f43213g = 0.0f;
    public float h = 0.0f;
    public final float[] f43215j = new float[16];
    public final float[] f43216k = new float[16];
    public final float[] f43217l = new float[16];
    public final float[] f43218m = new float[16];
    public int f43227w = j6.Vj;
    public int f43228x = j6.Wj;
    public final int f43229y = j6.fk;
    public final int f43230z = j6.gk;

    public a(Context context, int i10, int i11) {
        this.f43214i = 0.0f;
        this.f43219n = context;
        this.A = i10;
        this.B = i11;
        if (i11 == 2) {
            this.f43214i = 1.0f;
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
        int i10 = j6.f19165h5;
        boolean z11 = false;
        if (i0.a.f(j6.w0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43225t = z10;
        this.f43226u = i0.a.d(this.f43214i, j6.w0(null, this.f43227w, false), j6.w0(null, this.f43229y, false));
        this.v = i0.a.d(this.f43214i, j6.w0(null, this.f43228x, false), j6.w0(null, this.f43230z, false));
        if (this.A == 1 && i0.a.f(j6.w0(null, i10, false)) < 0.5d) {
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
        Matrix.setLookAtM(this.f43217l, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr = this.f43218m;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, this.e, 0.0f);
        Matrix.rotateM(this.f43218m, 0, -this.f43213g, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f43218m, 0, (-this.d) - this.f43212f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f43215j, 0, this.f43217l, 0, this.f43218m, 0);
        float[] fArr2 = this.f43215j;
        Matrix.multiplyMM(fArr2, 0, this.f43216k, 0, fArr2, 0);
        f fVar = this.f43211c;
        if (fVar != null) {
            fVar.D = this.f43225t;
            fVar.f43272y = this.f43226u;
            fVar.f43273z = this.v;
            int i10 = this.f43209a;
            int i11 = this.f43210b;
            float f10 = this.f43221p;
            float f11 = this.f43223r;
            float f12 = this.f43222q;
            float f13 = this.f43224s;
            float f14 = this.h;
            float f15 = this.f43214i;
            float f16 = this.D;
            if (fVar.V != null) {
                GLES20.glBindTexture(3553, fVar.f43258j);
                GLUtils.texImage2D(3553, 0, fVar.V, 0);
                fVar.V = null;
            }
            GLES20.glUniform1i(fVar.f43256g, 0);
            GLES20.glUniform1f(fVar.f43262n, fVar.f43267s);
            GLES20.glUniform1f(fVar.f43263o, fVar.f43269u);
            GLES20.glUniform1f(fVar.f43265q, f14);
            GLES20.glUniform1f(fVar.f43266r, f15);
            GLES20.glUniformMatrix4fv(fVar.f43253b, 1, false, this.f43215j, 0);
            GLES20.glUniformMatrix4fv(fVar.f43254c, 1, false, fArr, 0);
            GLES20.glUniform1f(fVar.E, fVar.v);
            GLES20.glUniform1f(fVar.F, fVar.f43270w);
            GLES20.glUniform1f(fVar.G, fVar.f43271x);
            GLES20.glUniform1f(fVar.J, fVar.A);
            GLES20.glUniform3f(fVar.H, Color.red(fVar.f43272y) / 255.0f, Color.green(fVar.f43272y) / 255.0f, Color.blue(fVar.f43272y) / 255.0f);
            GLES20.glUniform3f(fVar.I, Color.red(fVar.f43273z) / 255.0f, Color.green(fVar.f43273z) / 255.0f, Color.blue(fVar.f43273z) / 255.0f);
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
            float f18 = fVar.f43269u;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                fVar.f43269u = f19;
                if (f19 > 1.0f) {
                    fVar.f43269u = 1.0f;
                }
            }
            float f20 = fVar.f43267s + 5.0E-4f;
            fVar.f43267s = f20;
            if (f20 > 1.0f) {
                fVar.f43267s = f20 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f43209a = i10;
        this.f43210b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.B == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f43216k, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        f fVar = this.f43211c;
        if (fVar != null) {
            GLES20.glDeleteProgram(fVar.f43252a);
        }
        f fVar2 = new f(this.f43219n, this.B);
        this.f43211c = fVar2;
        Bitmap bitmap = this.f43220o;
        if (bitmap != null) {
            fVar2.V = bitmap;
        }
        if (this.C) {
            fVar2.v = 1.0f;
            fVar2.f43270w = 0.2f;
        }
    }
}
