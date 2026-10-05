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
import org.telegram.ui.ActionBar.i6;
public final class a implements GLSurfaceView.Renderer {
    public final int A;
    public final int B;
    public boolean C;
    public float D;
    public int f46796a;
    public int f46797b;
    public f f46798c;
    public float f46802i;
    public final Context f46807n;
    public Bitmap f46808o;
    public float f46809p;
    public float f46810q;
    public float f46811r;
    public float f46812s;
    public boolean f46813t;
    public int f46814u;
    public int v;
    public float d = 0.0f;
    public float f46799e = 0.0f;
    public float f46800f = 0.0f;
    public float f46801g = 0.0f;
    public float h = 0.0f;
    public final float[] f46803j = new float[16];
    public final float[] f46804k = new float[16];
    public final float[] f46805l = new float[16];
    public final float[] f46806m = new float[16];
    public int f46815w = i6.Vj;
    public int f46816x = i6.Wj;
    public final int f46817y = i6.fk;
    public final int f46818z = i6.gk;

    public a(Context context, int i10, int i11) {
        this.f46802i = 0.0f;
        this.f46807n = context;
        this.A = i10;
        this.B = i11;
        if (i11 == 2) {
            this.f46802i = 1.0f;
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
        int i10 = i6.f20899h5;
        boolean z11 = false;
        if (i0.a.f(i6.w0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46813t = z10;
        this.f46814u = i0.a.d(this.f46802i, i6.w0(null, this.f46815w, false), i6.w0(null, this.f46817y, false));
        this.v = i0.a.d(this.f46802i, i6.w0(null, this.f46816x, false), i6.w0(null, this.f46818z, false));
        if (this.A == 1 && i0.a.f(i6.w0(null, i10, false)) < 0.5d) {
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
        Matrix.setLookAtM(this.f46805l, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr = this.f46806m;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, this.f46799e, 0.0f);
        Matrix.rotateM(this.f46806m, 0, -this.f46801g, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f46806m, 0, (-this.d) - this.f46800f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f46803j, 0, this.f46805l, 0, this.f46806m, 0);
        float[] fArr2 = this.f46803j;
        Matrix.multiplyMM(fArr2, 0, this.f46804k, 0, fArr2, 0);
        f fVar = this.f46798c;
        if (fVar != null) {
            fVar.D = this.f46813t;
            fVar.f46862y = this.f46814u;
            fVar.f46863z = this.v;
            int i10 = this.f46796a;
            int i11 = this.f46797b;
            float f10 = this.f46809p;
            float f11 = this.f46811r;
            float f12 = this.f46810q;
            float f13 = this.f46812s;
            float f14 = this.h;
            float f15 = this.f46802i;
            float f16 = this.D;
            if (fVar.V != null) {
                GLES20.glBindTexture(3553, fVar.f46848j);
                GLUtils.texImage2D(3553, 0, fVar.V, 0);
                fVar.V = null;
            }
            GLES20.glUniform1i(fVar.f46846g, 0);
            GLES20.glUniform1f(fVar.f46852n, fVar.f46857s);
            GLES20.glUniform1f(fVar.f46853o, fVar.f46859u);
            GLES20.glUniform1f(fVar.f46855q, f14);
            GLES20.glUniform1f(fVar.f46856r, f15);
            GLES20.glUniformMatrix4fv(fVar.f46842b, 1, false, this.f46803j, 0);
            GLES20.glUniformMatrix4fv(fVar.f46843c, 1, false, fArr, 0);
            GLES20.glUniform1f(fVar.E, fVar.v);
            GLES20.glUniform1f(fVar.F, fVar.f46860w);
            GLES20.glUniform1f(fVar.G, fVar.f46861x);
            GLES20.glUniform1f(fVar.J, fVar.A);
            GLES20.glUniform3f(fVar.H, Color.red(fVar.f46862y) / 255.0f, Color.green(fVar.f46862y) / 255.0f, Color.blue(fVar.f46862y) / 255.0f);
            GLES20.glUniform3f(fVar.I, Color.red(fVar.f46863z) / 255.0f, Color.green(fVar.f46863z) / 255.0f, Color.blue(fVar.f46863z) / 255.0f);
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
            float f18 = fVar.f46859u;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                fVar.f46859u = f19;
                if (f19 > 1.0f) {
                    fVar.f46859u = 1.0f;
                }
            }
            float f20 = fVar.f46857s + 5.0E-4f;
            fVar.f46857s = f20;
            if (f20 > 1.0f) {
                fVar.f46857s = f20 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f46796a = i10;
        this.f46797b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.B == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f46804k, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        f fVar = this.f46798c;
        if (fVar != null) {
            GLES20.glDeleteProgram(fVar.f46841a);
        }
        f fVar2 = new f(this.f46807n, this.B);
        this.f46798c = fVar2;
        Bitmap bitmap = this.f46808o;
        if (bitmap != null) {
            fVar2.V = bitmap;
        }
        if (this.C) {
            fVar2.v = 1.0f;
            fVar2.f46860w = 0.2f;
        }
    }
}
