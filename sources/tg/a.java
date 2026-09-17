package tg;

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
    public int f46489a;
    public int f46490b;
    public f f46491c;
    public float f46495i;
    public final Context f46500n;
    public Bitmap f46501o;
    public float f46502p;
    public float f46503q;
    public float f46504r;
    public float f46505s;
    public boolean f46506t;
    public int f46507u;
    public int v;
    public float d = 0.0f;
    public float f46492e = 0.0f;
    public float f46493f = 0.0f;
    public float f46494g = 0.0f;
    public float h = 0.0f;
    public final float[] f46496j = new float[16];
    public final float[] f46497k = new float[16];
    public final float[] f46498l = new float[16];
    public final float[] f46499m = new float[16];
    public int f46508w = j6.Vj;
    public int f46509x = j6.Wj;
    public final int f46510y = j6.fk;
    public final int f46511z = j6.gk;

    public a(Context context, int i10, int i11) {
        this.f46495i = 0.0f;
        this.f46500n = context;
        this.A = i10;
        this.B = i11;
        if (i11 == 2) {
            this.f46495i = 1.0f;
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
        int i10 = j6.f20735h5;
        boolean z11 = false;
        if (i0.a.f(j6.w0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46506t = z10;
        this.f46507u = i0.a.d(this.f46495i, j6.w0(null, this.f46508w, false), j6.w0(null, this.f46510y, false));
        this.v = i0.a.d(this.f46495i, j6.w0(null, this.f46509x, false), j6.w0(null, this.f46511z, false));
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
        Matrix.setLookAtM(this.f46498l, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr = this.f46499m;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, this.f46492e, 0.0f);
        Matrix.rotateM(this.f46499m, 0, -this.f46494g, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f46499m, 0, (-this.d) - this.f46493f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f46496j, 0, this.f46498l, 0, this.f46499m, 0);
        float[] fArr2 = this.f46496j;
        Matrix.multiplyMM(fArr2, 0, this.f46497k, 0, fArr2, 0);
        f fVar = this.f46491c;
        if (fVar != null) {
            fVar.D = this.f46506t;
            fVar.f46555y = this.f46507u;
            fVar.f46556z = this.v;
            int i10 = this.f46489a;
            int i11 = this.f46490b;
            float f10 = this.f46502p;
            float f11 = this.f46504r;
            float f12 = this.f46503q;
            float f13 = this.f46505s;
            float f14 = this.h;
            float f15 = this.f46495i;
            float f16 = this.D;
            if (fVar.V != null) {
                GLES20.glBindTexture(3553, fVar.f46541j);
                GLUtils.texImage2D(3553, 0, fVar.V, 0);
                fVar.V = null;
            }
            GLES20.glUniform1i(fVar.f46539g, 0);
            GLES20.glUniform1f(fVar.f46545n, fVar.f46550s);
            GLES20.glUniform1f(fVar.f46546o, fVar.f46552u);
            GLES20.glUniform1f(fVar.f46548q, f14);
            GLES20.glUniform1f(fVar.f46549r, f15);
            GLES20.glUniformMatrix4fv(fVar.f46535b, 1, false, this.f46496j, 0);
            GLES20.glUniformMatrix4fv(fVar.f46536c, 1, false, fArr, 0);
            GLES20.glUniform1f(fVar.E, fVar.v);
            GLES20.glUniform1f(fVar.F, fVar.f46553w);
            GLES20.glUniform1f(fVar.G, fVar.f46554x);
            GLES20.glUniform1f(fVar.J, fVar.A);
            GLES20.glUniform3f(fVar.H, Color.red(fVar.f46555y) / 255.0f, Color.green(fVar.f46555y) / 255.0f, Color.blue(fVar.f46555y) / 255.0f);
            GLES20.glUniform3f(fVar.I, Color.red(fVar.f46556z) / 255.0f, Color.green(fVar.f46556z) / 255.0f, Color.blue(fVar.f46556z) / 255.0f);
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
            float f18 = fVar.f46552u;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                fVar.f46552u = f19;
                if (f19 > 1.0f) {
                    fVar.f46552u = 1.0f;
                }
            }
            float f20 = fVar.f46550s + 5.0E-4f;
            fVar.f46550s = f20;
            if (f20 > 1.0f) {
                fVar.f46550s = f20 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f46489a = i10;
        this.f46490b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.B == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f46497k, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        f fVar = this.f46491c;
        if (fVar != null) {
            GLES20.glDeleteProgram(fVar.f46534a);
        }
        f fVar2 = new f(this.f46500n, this.B);
        this.f46491c = fVar2;
        Bitmap bitmap = this.f46501o;
        if (bitmap != null) {
            fVar2.V = bitmap;
        }
        if (this.C) {
            fVar2.v = 1.0f;
            fVar2.f46553w = 0.2f;
        }
    }
}
