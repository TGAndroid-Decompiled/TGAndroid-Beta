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
import org.telegram.ui.ActionBar.m6;
public final class g implements GLSurfaceView.Renderer {
    public final int D;
    public final int E;
    public boolean F;
    public float G;
    public int f59432a;
    public int f59433b;
    public o f59434c;
    public float f59441l;
    public final Context f59446q;
    public Bitmap f59447r;
    public float f59448s;
    public float f59449t;
    public float f59450u;
    public float v;
    public boolean f59451w;
    public int f59452x;
    public int f59453y;
    public float d = 0.0f;
    public float f59435e = 0.0f;
    public volatile float f59436f = 0.0f;
    public volatile float f59437g = 0.0f;
    public volatile float h = 1.0f;
    public float f59438i = 0.0f;
    public volatile float f59439j = 0.0f;
    public float f59440k = 0.0f;
    public final float[] f59442m = new float[16];
    public final float[] f59443n = new float[16];
    public final float[] f59444o = new float[16];
    public final float[] f59445p = new float[16];
    public int f59454z = m6.Mk;
    public int A = m6.Nk;
    public final int B = m6.Wk;
    public final int C = m6.Xk;

    public g(Context context, int i7, int i10) {
        this.f59441l = 0.0f;
        this.f59446q = context;
        this.D = i7;
        this.E = i10;
        if (i10 == 2) {
            this.f59441l = 1.0f;
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
        boolean z10;
        int i7 = m6.f29420h5;
        boolean z11 = false;
        if (i0.a.h(m6.x0(null, i7, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f59451w = z10;
        this.f59452x = i0.a.f(this.f59441l, m6.x0(null, this.f59454z, false), m6.x0(null, this.B, false));
        this.f59453y = i0.a.f(this.f59441l, m6.x0(null, this.A, false), m6.x0(null, this.C, false));
        if (this.D == 1 && i0.a.h(m6.x0(null, i7, false)) < 0.5d) {
            z11 = true;
        }
        this.F = z11;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float f10;
        int i7;
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        float[] fArr = this.f59444o;
        if (this.E == 4) {
            f10 = 40.0f;
        } else {
            f10 = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f10, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.f59445p, 0);
        Matrix.translateM(this.f59445p, 0, 0.0f, this.f59435e, 0.0f);
        Matrix.rotateM(this.f59445p, 0, (-this.f59438i) - this.f59439j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f59445p, 0, (-this.d) - this.f59436f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f59442m, 0, this.f59444o, 0, this.f59445p, 0);
        float[] fArr2 = this.f59442m;
        Matrix.multiplyMM(fArr2, 0, this.f59443n, 0, fArr2, 0);
        o oVar = this.f59434c;
        if (oVar != null) {
            oVar.f59493b = (float) Math.toRadians(this.d + this.f59436f);
            this.f59434c.f59495c = (float) Math.toRadians(this.f59438i + this.f59439j);
            this.f59434c.d = (float) Math.toRadians(this.f59437g);
            this.f59434c.f59498e = this.h;
            o oVar2 = this.f59434c;
            oVar2.getClass();
            oVar2.J = this.f59451w;
            oVar2.E = this.f59452x;
            oVar2.F = this.f59453y;
            float[] fArr3 = this.f59442m;
            float[] fArr4 = this.f59445p;
            int i10 = this.f59432a;
            int i11 = this.f59433b;
            float f11 = this.f59448s;
            float f12 = this.f59450u;
            float f13 = this.f59449t;
            float f14 = this.v;
            float f15 = this.f59440k;
            float f16 = this.f59441l;
            float f17 = this.G;
            if (oVar2.f59491a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f17, 0.1f)) / 0.22f) + oVar2.f59517z);
                oVar2.f59517z = min;
                a aVar = oVar2.f59491a;
                aVar.B = oVar2.f59498e;
                aVar.C = 0;
                aVar.c(i10, i11, oVar2.f59493b, oVar2.f59495c, oVar2.d, f17, min * oVar2.A, f15, false);
                return;
            }
            if (oVar2.Z != null) {
                GLES20.glBindTexture(3553, oVar2.f59507o);
                i7 = 0;
                GLUtils.texImage2D(3553, 0, oVar2.Z, 0);
                oVar2.Z = null;
            } else {
                i7 = 0;
            }
            GLES20.glUniform1i(oVar2.f59504l, i7);
            GLES20.glUniform1f(oVar2.f59511s, oVar2.f59515x);
            GLES20.glUniform1f(oVar2.f59512t, oVar2.f59517z);
            GLES20.glUniform1f(oVar2.v, f15);
            GLES20.glUniform1f(oVar2.f59514w, f16);
            GLES20.glUniformMatrix4fv(oVar2.f59500g, 1, false, fArr3, 0);
            GLES20.glUniformMatrix4fv(oVar2.h, 1, false, fArr4, 0);
            GLES20.glUniform1f(oVar2.K, oVar2.B);
            GLES20.glUniform1f(oVar2.L, oVar2.C);
            GLES20.glUniform1f(oVar2.M, oVar2.D);
            GLES20.glUniform1f(oVar2.P, oVar2.G);
            GLES20.glUniform3f(oVar2.N, Color.red(oVar2.E) / 255.0f, Color.green(oVar2.E) / 255.0f, Color.blue(oVar2.E) / 255.0f);
            GLES20.glUniform3f(oVar2.O, Color.red(oVar2.F) / 255.0f, Color.green(oVar2.F) / 255.0f, Color.blue(oVar2.F) / 255.0f);
            GLES20.glUniform3f(oVar2.Q, Color.red(oVar2.H) / 255.0f, Color.green(oVar2.H) / 255.0f, Color.blue(oVar2.H) / 255.0f);
            GLES20.glUniform3f(oVar2.R, Color.red(oVar2.I) / 255.0f, Color.green(oVar2.I) / 255.0f, Color.blue(oVar2.I) / 255.0f);
            GLES20.glUniform2f(oVar2.S, i10, i11);
            GLES20.glUniform4f(oVar2.T, f11, f12, f13, f14);
            GLES20.glUniform1i(oVar2.W, oVar2.J ? 1 : 0);
            float f18 = oVar2.f59497d0 + f17;
            oVar2.f59497d0 = f18;
            GLES20.glUniform1f(oVar2.X, f18);
            for (int i12 = 0; i12 < oVar2.f59492a0; i12++) {
                int i13 = i12 * 3;
                GLES20.glBindBuffer(34962, oVar2.f59496c0[i13]);
                GLES20.glVertexAttribPointer(oVar2.f59509q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f59496c0[i13 + 1]);
                GLES20.glVertexAttribPointer(oVar2.f59510r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f59496c0[i13 + 2]);
                GLES20.glVertexAttribPointer(oVar2.f59508p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(oVar2.U, i12);
                GLES20.glUniform1i(oVar2.V, oVar2.f59494b0);
                GLES20.glDrawArrays(4, 0, oVar2.f59516y[i12] / 3);
            }
            float f19 = oVar2.f59517z;
            if (f19 < 1.0f) {
                float f20 = f19 + 0.07272727f;
                oVar2.f59517z = f20;
                if (f20 > 1.0f) {
                    oVar2.f59517z = 1.0f;
                }
            }
            float f21 = oVar2.f59515x + 5.0E-4f;
            oVar2.f59515x = f21;
            if (f21 > 1.0f) {
                oVar2.f59515x = f21 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        float f10;
        this.f59432a = i7;
        this.f59433b = i10;
        GLES20.glViewport(0, 0, i7, i10);
        float f11 = i7 / i10;
        if (this.E == 4) {
            f10 = 12.0f;
        } else {
            f10 = 53.13f;
        }
        Matrix.perspectiveM(this.f59443n, 0, f10, f11, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        o oVar = this.f59434c;
        if (oVar != null) {
            a aVar = oVar.f59491a;
            if (aVar != null) {
                aVar.b();
                oVar.f59491a = null;
            } else {
                GLES20.glDeleteProgram(oVar.f59499f);
            }
        }
        o oVar2 = new o(this.f59446q, this.E);
        this.f59434c = oVar2;
        Bitmap bitmap = this.f59447r;
        if (bitmap != null && oVar2.f59491a == null) {
            oVar2.Z = bitmap;
        }
        if (this.F) {
            oVar2.B = 1.0f;
            oVar2.C = 0.2f;
        }
    }
}
