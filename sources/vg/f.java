package vg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.k6;
public final class f implements GLSurfaceView.Renderer {
    public final int D;
    public final int E;
    public boolean F;
    public float G;
    public int f57374a;
    public int f57375b;
    public n f57376c;
    public float f57383l;
    public final Context f57388q;
    public Bitmap f57389r;
    public float f57390s;
    public float f57391t;
    public float f57392u;
    public float v;
    public boolean f57393w;
    public int f57394x;
    public int f57395y;
    public float d = 0.0f;
    public float f57377e = 0.0f;
    public volatile float f57378f = 0.0f;
    public volatile float f57379g = 0.0f;
    public volatile float h = 1.0f;
    public float f57380i = 0.0f;
    public volatile float f57381j = 0.0f;
    public float f57382k = 0.0f;
    public final float[] f57384m = new float[16];
    public final float[] f57385n = new float[16];
    public final float[] f57386o = new float[16];
    public final float[] f57387p = new float[16];
    public int f57396z = k6.Jk;
    public int A = k6.Kk;
    public final int B = k6.Tk;
    public final int C = k6.Uk;

    public f(Context context, int i7, int i10) {
        this.f57383l = 0.0f;
        this.f57388q = context;
        this.D = i7;
        this.E = i10;
        if (i10 == 2) {
            this.f57383l = 1.0f;
        }
        b();
    }

    public static int a(int i7, String str) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i7);
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
        boolean z9;
        int i7 = k6.f27925h5;
        boolean z10 = false;
        if (i0.a.h(k6.x0(null, i7, false)) < 0.5d) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f57393w = z9;
        this.f57394x = i0.a.f(this.f57383l, k6.x0(null, this.f57396z, false), k6.x0(null, this.B, false));
        this.f57395y = i0.a.f(this.f57383l, k6.x0(null, this.A, false), k6.x0(null, this.C, false));
        if (this.D == 1 && i0.a.h(k6.x0(null, i7, false)) < 0.5d) {
            z10 = true;
        }
        this.F = z10;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float f10;
        int i7;
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        float[] fArr = this.f57386o;
        if (this.E == 4) {
            f10 = 40.0f;
        } else {
            f10 = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f10, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.f57387p, 0);
        Matrix.translateM(this.f57387p, 0, 0.0f, this.f57377e, 0.0f);
        Matrix.rotateM(this.f57387p, 0, (-this.f57380i) - this.f57381j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f57387p, 0, (-this.d) - this.f57378f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f57384m, 0, this.f57386o, 0, this.f57387p, 0);
        float[] fArr2 = this.f57384m;
        Matrix.multiplyMM(fArr2, 0, this.f57385n, 0, fArr2, 0);
        n nVar = this.f57376c;
        if (nVar != null) {
            nVar.f57434b = (float) Math.toRadians(this.d + this.f57378f);
            this.f57376c.f57436c = (float) Math.toRadians(this.f57380i + this.f57381j);
            this.f57376c.d = (float) Math.toRadians(this.f57379g);
            this.f57376c.f57439e = this.h;
            n nVar2 = this.f57376c;
            nVar2.getClass();
            nVar2.J = this.f57393w;
            nVar2.E = this.f57394x;
            nVar2.F = this.f57395y;
            float[] fArr3 = this.f57384m;
            float[] fArr4 = this.f57387p;
            int i10 = this.f57374a;
            int i11 = this.f57375b;
            float f11 = this.f57390s;
            float f12 = this.f57392u;
            float f13 = this.f57391t;
            float f14 = this.v;
            float f15 = this.f57382k;
            float f16 = this.f57383l;
            float f17 = this.G;
            if (nVar2.f57432a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f17, 0.1f)) / 0.22f) + nVar2.f57458z);
                nVar2.f57458z = min;
                a aVar = nVar2.f57432a;
                aVar.B = nVar2.f57439e;
                aVar.C = 0;
                aVar.c(i10, i11, nVar2.f57434b, nVar2.f57436c, nVar2.d, f17, min * nVar2.A, f15, false);
                return;
            }
            if (nVar2.Z != null) {
                GLES20.glBindTexture(3553, nVar2.f57448o);
                i7 = 0;
                GLUtils.texImage2D(3553, 0, nVar2.Z, 0);
                nVar2.Z = null;
            } else {
                i7 = 0;
            }
            GLES20.glUniform1i(nVar2.f57445l, i7);
            GLES20.glUniform1f(nVar2.f57452s, nVar2.f57456x);
            GLES20.glUniform1f(nVar2.f57453t, nVar2.f57458z);
            GLES20.glUniform1f(nVar2.v, f15);
            GLES20.glUniform1f(nVar2.f57455w, f16);
            GLES20.glUniformMatrix4fv(nVar2.f57441g, 1, false, fArr3, 0);
            GLES20.glUniformMatrix4fv(nVar2.h, 1, false, fArr4, 0);
            GLES20.glUniform1f(nVar2.K, nVar2.B);
            GLES20.glUniform1f(nVar2.L, nVar2.C);
            GLES20.glUniform1f(nVar2.M, nVar2.D);
            GLES20.glUniform1f(nVar2.P, nVar2.G);
            GLES20.glUniform3f(nVar2.N, Color.red(nVar2.E) / 255.0f, Color.green(nVar2.E) / 255.0f, Color.blue(nVar2.E) / 255.0f);
            GLES20.glUniform3f(nVar2.O, Color.red(nVar2.F) / 255.0f, Color.green(nVar2.F) / 255.0f, Color.blue(nVar2.F) / 255.0f);
            GLES20.glUniform3f(nVar2.Q, Color.red(nVar2.H) / 255.0f, Color.green(nVar2.H) / 255.0f, Color.blue(nVar2.H) / 255.0f);
            GLES20.glUniform3f(nVar2.R, Color.red(nVar2.I) / 255.0f, Color.green(nVar2.I) / 255.0f, Color.blue(nVar2.I) / 255.0f);
            GLES20.glUniform2f(nVar2.S, i10, i11);
            GLES20.glUniform4f(nVar2.T, f11, f12, f13, f14);
            GLES20.glUniform1i(nVar2.W, nVar2.J ? 1 : 0);
            float f18 = nVar2.f57438d0 + f17;
            nVar2.f57438d0 = f18;
            GLES20.glUniform1f(nVar2.X, f18);
            for (int i12 = 0; i12 < nVar2.f57433a0; i12++) {
                int i13 = i12 * 3;
                GLES20.glBindBuffer(34962, nVar2.f57437c0[i13]);
                GLES20.glVertexAttribPointer(nVar2.f57450q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, nVar2.f57437c0[i13 + 1]);
                GLES20.glVertexAttribPointer(nVar2.f57451r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, nVar2.f57437c0[i13 + 2]);
                GLES20.glVertexAttribPointer(nVar2.f57449p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(nVar2.U, i12);
                GLES20.glUniform1i(nVar2.V, nVar2.f57435b0);
                GLES20.glDrawArrays(4, 0, nVar2.f57457y[i12] / 3);
            }
            float f19 = nVar2.f57458z;
            if (f19 < 1.0f) {
                float f20 = f19 + 0.07272727f;
                nVar2.f57458z = f20;
                if (f20 > 1.0f) {
                    nVar2.f57458z = 1.0f;
                }
            }
            float f21 = nVar2.f57456x + 5.0E-4f;
            nVar2.f57456x = f21;
            if (f21 > 1.0f) {
                nVar2.f57456x = f21 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        float f10;
        this.f57374a = i7;
        this.f57375b = i10;
        GLES20.glViewport(0, 0, i7, i10);
        float f11 = i7 / i10;
        if (this.E == 4) {
            f10 = 12.0f;
        } else {
            f10 = 53.13f;
        }
        Matrix.perspectiveM(this.f57385n, 0, f10, f11, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        n nVar = this.f57376c;
        if (nVar != null) {
            a aVar = nVar.f57432a;
            if (aVar != null) {
                aVar.b();
                nVar.f57432a = null;
            } else {
                GLES20.glDeleteProgram(nVar.f57440f);
            }
        }
        n nVar2 = new n(this.f57388q, this.E);
        this.f57376c = nVar2;
        Bitmap bitmap = this.f57389r;
        if (bitmap != null && nVar2.f57432a == null) {
            nVar2.Z = bitmap;
        }
        if (this.F) {
            nVar2.B = 1.0f;
            nVar2.C = 0.2f;
        }
    }
}
