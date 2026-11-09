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
import org.telegram.ui.ActionBar.l6;
public final class f implements GLSurfaceView.Renderer {
    public final int D;
    public final int E;
    public boolean F;
    public float G;
    public int f57386a;
    public int f57387b;
    public n f57388c;
    public float f57395l;
    public final Context f57400q;
    public Bitmap f57401r;
    public float f57402s;
    public float f57403t;
    public float f57404u;
    public float v;
    public boolean f57405w;
    public int f57406x;
    public int f57407y;
    public float d = 0.0f;
    public float f57389e = 0.0f;
    public volatile float f57390f = 0.0f;
    public volatile float f57391g = 0.0f;
    public volatile float h = 1.0f;
    public float f57392i = 0.0f;
    public volatile float f57393j = 0.0f;
    public float f57394k = 0.0f;
    public final float[] f57396m = new float[16];
    public final float[] f57397n = new float[16];
    public final float[] f57398o = new float[16];
    public final float[] f57399p = new float[16];
    public int f57408z = l6.Jk;
    public int A = l6.Kk;
    public final int B = l6.Tk;
    public final int C = l6.Uk;

    public f(Context context, int i7, int i10) {
        this.f57395l = 0.0f;
        this.f57400q = context;
        this.D = i7;
        this.E = i10;
        if (i10 == 2) {
            this.f57395l = 1.0f;
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
        int i7 = l6.f27938h5;
        boolean z10 = false;
        if (i0.a.h(l6.x0(null, i7, false)) < 0.5d) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f57405w = z9;
        this.f57406x = i0.a.f(this.f57395l, l6.x0(null, this.f57408z, false), l6.x0(null, this.B, false));
        this.f57407y = i0.a.f(this.f57395l, l6.x0(null, this.A, false), l6.x0(null, this.C, false));
        if (this.D == 1 && i0.a.h(l6.x0(null, i7, false)) < 0.5d) {
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
        float[] fArr = this.f57398o;
        if (this.E == 4) {
            f10 = 40.0f;
        } else {
            f10 = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f10, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.f57399p, 0);
        Matrix.translateM(this.f57399p, 0, 0.0f, this.f57389e, 0.0f);
        Matrix.rotateM(this.f57399p, 0, (-this.f57392i) - this.f57393j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f57399p, 0, (-this.d) - this.f57390f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f57396m, 0, this.f57398o, 0, this.f57399p, 0);
        float[] fArr2 = this.f57396m;
        Matrix.multiplyMM(fArr2, 0, this.f57397n, 0, fArr2, 0);
        n nVar = this.f57388c;
        if (nVar != null) {
            nVar.f57446b = (float) Math.toRadians(this.d + this.f57390f);
            this.f57388c.f57448c = (float) Math.toRadians(this.f57392i + this.f57393j);
            this.f57388c.d = (float) Math.toRadians(this.f57391g);
            this.f57388c.f57451e = this.h;
            n nVar2 = this.f57388c;
            nVar2.getClass();
            nVar2.J = this.f57405w;
            nVar2.E = this.f57406x;
            nVar2.F = this.f57407y;
            float[] fArr3 = this.f57396m;
            float[] fArr4 = this.f57399p;
            int i10 = this.f57386a;
            int i11 = this.f57387b;
            float f11 = this.f57402s;
            float f12 = this.f57404u;
            float f13 = this.f57403t;
            float f14 = this.v;
            float f15 = this.f57394k;
            float f16 = this.f57395l;
            float f17 = this.G;
            if (nVar2.f57444a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f17, 0.1f)) / 0.22f) + nVar2.f57470z);
                nVar2.f57470z = min;
                a aVar = nVar2.f57444a;
                aVar.B = nVar2.f57451e;
                aVar.C = 0;
                aVar.c(i10, i11, nVar2.f57446b, nVar2.f57448c, nVar2.d, f17, min * nVar2.A, f15, false);
                return;
            }
            if (nVar2.Z != null) {
                GLES20.glBindTexture(3553, nVar2.f57460o);
                i7 = 0;
                GLUtils.texImage2D(3553, 0, nVar2.Z, 0);
                nVar2.Z = null;
            } else {
                i7 = 0;
            }
            GLES20.glUniform1i(nVar2.f57457l, i7);
            GLES20.glUniform1f(nVar2.f57464s, nVar2.f57468x);
            GLES20.glUniform1f(nVar2.f57465t, nVar2.f57470z);
            GLES20.glUniform1f(nVar2.v, f15);
            GLES20.glUniform1f(nVar2.f57467w, f16);
            GLES20.glUniformMatrix4fv(nVar2.f57453g, 1, false, fArr3, 0);
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
            float f18 = nVar2.f57450d0 + f17;
            nVar2.f57450d0 = f18;
            GLES20.glUniform1f(nVar2.X, f18);
            for (int i12 = 0; i12 < nVar2.f57445a0; i12++) {
                int i13 = i12 * 3;
                GLES20.glBindBuffer(34962, nVar2.f57449c0[i13]);
                GLES20.glVertexAttribPointer(nVar2.f57462q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, nVar2.f57449c0[i13 + 1]);
                GLES20.glVertexAttribPointer(nVar2.f57463r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, nVar2.f57449c0[i13 + 2]);
                GLES20.glVertexAttribPointer(nVar2.f57461p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(nVar2.U, i12);
                GLES20.glUniform1i(nVar2.V, nVar2.f57447b0);
                GLES20.glDrawArrays(4, 0, nVar2.f57469y[i12] / 3);
            }
            float f19 = nVar2.f57470z;
            if (f19 < 1.0f) {
                float f20 = f19 + 0.07272727f;
                nVar2.f57470z = f20;
                if (f20 > 1.0f) {
                    nVar2.f57470z = 1.0f;
                }
            }
            float f21 = nVar2.f57468x + 5.0E-4f;
            nVar2.f57468x = f21;
            if (f21 > 1.0f) {
                nVar2.f57468x = f21 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        float f10;
        this.f57386a = i7;
        this.f57387b = i10;
        GLES20.glViewport(0, 0, i7, i10);
        float f11 = i7 / i10;
        if (this.E == 4) {
            f10 = 12.0f;
        } else {
            f10 = 53.13f;
        }
        Matrix.perspectiveM(this.f57397n, 0, f10, f11, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        n nVar = this.f57388c;
        if (nVar != null) {
            a aVar = nVar.f57444a;
            if (aVar != null) {
                aVar.b();
                nVar.f57444a = null;
            } else {
                GLES20.glDeleteProgram(nVar.f57452f);
            }
        }
        n nVar2 = new n(this.f57400q, this.E);
        this.f57388c = nVar2;
        Bitmap bitmap = this.f57401r;
        if (bitmap != null && nVar2.f57444a == null) {
            nVar2.Z = bitmap;
        }
        if (this.F) {
            nVar2.B = 1.0f;
            nVar2.C = 0.2f;
        }
    }
}
