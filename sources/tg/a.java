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
    public int f46488a;
    public int f46489b;
    public f f46490c;
    public float f46494i;
    public final Context f46499n;
    public Bitmap f46500o;
    public float f46501p;
    public float f46502q;
    public float f46503r;
    public float f46504s;
    public boolean f46505t;
    public int f46506u;
    public int v;
    public float d = 0.0f;
    public float f46491e = 0.0f;
    public float f46492f = 0.0f;
    public float f46493g = 0.0f;
    public float h = 0.0f;
    public final float[] f46495j = new float[16];
    public final float[] f46496k = new float[16];
    public final float[] f46497l = new float[16];
    public final float[] f46498m = new float[16];
    public int f46507w = j6.Vj;
    public int f46508x = j6.Wj;
    public final int f46509y = j6.fk;
    public final int f46510z = j6.gk;

    public a(Context context, int i10, int i11) {
        this.f46494i = 0.0f;
        this.f46499n = context;
        this.A = i10;
        this.B = i11;
        if (i11 == 2) {
            this.f46494i = 1.0f;
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
        int i10 = j6.f20734h5;
        boolean z11 = false;
        if (i0.a.f(j6.w0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46505t = z10;
        this.f46506u = i0.a.d(this.f46494i, j6.w0(null, this.f46507w, false), j6.w0(null, this.f46509y, false));
        this.v = i0.a.d(this.f46494i, j6.w0(null, this.f46508x, false), j6.w0(null, this.f46510z, false));
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
        Matrix.setLookAtM(this.f46497l, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr = this.f46498m;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, this.f46491e, 0.0f);
        Matrix.rotateM(this.f46498m, 0, -this.f46493g, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f46498m, 0, (-this.d) - this.f46492f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f46495j, 0, this.f46497l, 0, this.f46498m, 0);
        float[] fArr2 = this.f46495j;
        Matrix.multiplyMM(fArr2, 0, this.f46496k, 0, fArr2, 0);
        f fVar = this.f46490c;
        if (fVar != null) {
            fVar.D = this.f46505t;
            fVar.f46554y = this.f46506u;
            fVar.f46555z = this.v;
            int i10 = this.f46488a;
            int i11 = this.f46489b;
            float f10 = this.f46501p;
            float f11 = this.f46503r;
            float f12 = this.f46502q;
            float f13 = this.f46504s;
            float f14 = this.h;
            float f15 = this.f46494i;
            float f16 = this.D;
            if (fVar.V != null) {
                GLES20.glBindTexture(3553, fVar.f46540j);
                GLUtils.texImage2D(3553, 0, fVar.V, 0);
                fVar.V = null;
            }
            GLES20.glUniform1i(fVar.f46538g, 0);
            GLES20.glUniform1f(fVar.f46544n, fVar.f46549s);
            GLES20.glUniform1f(fVar.f46545o, fVar.f46551u);
            GLES20.glUniform1f(fVar.f46547q, f14);
            GLES20.glUniform1f(fVar.f46548r, f15);
            GLES20.glUniformMatrix4fv(fVar.f46534b, 1, false, this.f46495j, 0);
            GLES20.glUniformMatrix4fv(fVar.f46535c, 1, false, fArr, 0);
            GLES20.glUniform1f(fVar.E, fVar.v);
            GLES20.glUniform1f(fVar.F, fVar.f46552w);
            GLES20.glUniform1f(fVar.G, fVar.f46553x);
            GLES20.glUniform1f(fVar.J, fVar.A);
            GLES20.glUniform3f(fVar.H, Color.red(fVar.f46554y) / 255.0f, Color.green(fVar.f46554y) / 255.0f, Color.blue(fVar.f46554y) / 255.0f);
            GLES20.glUniform3f(fVar.I, Color.red(fVar.f46555z) / 255.0f, Color.green(fVar.f46555z) / 255.0f, Color.blue(fVar.f46555z) / 255.0f);
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
            float f18 = fVar.f46551u;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                fVar.f46551u = f19;
                if (f19 > 1.0f) {
                    fVar.f46551u = 1.0f;
                }
            }
            float f20 = fVar.f46549s + 5.0E-4f;
            fVar.f46549s = f20;
            if (f20 > 1.0f) {
                fVar.f46549s = f20 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f46488a = i10;
        this.f46489b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.B == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f46496k, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        f fVar = this.f46490c;
        if (fVar != null) {
            GLES20.glDeleteProgram(fVar.f46533a);
        }
        f fVar2 = new f(this.f46499n, this.B);
        this.f46490c = fVar2;
        Bitmap bitmap = this.f46500o;
        if (bitmap != null) {
            fVar2.V = bitmap;
        }
        if (this.C) {
            fVar2.v = 1.0f;
            fVar2.f46552w = 0.2f;
        }
    }
}
