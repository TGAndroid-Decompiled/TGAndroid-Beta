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
public final class f implements GLSurfaceView.Renderer {
    public final int D;
    public final int E;
    public boolean F;
    public float G;
    public int f59467a;
    public int f59468b;
    public n f59469c;
    public float f59476l;
    public final Context f59481q;
    public Bitmap f59482r;
    public float f59483s;
    public float f59484t;
    public float f59485u;
    public float v;
    public boolean f59486w;
    public int f59487x;
    public int f59488y;
    public float d = 0.0f;
    public float f59470e = 0.0f;
    public volatile float f59471f = 0.0f;
    public volatile float f59472g = 0.0f;
    public volatile float h = 1.0f;
    public float f59473i = 0.0f;
    public volatile float f59474j = 0.0f;
    public float f59475k = 0.0f;
    public final float[] f59477m = new float[16];
    public final float[] f59478n = new float[16];
    public final float[] f59479o = new float[16];
    public final float[] f59480p = new float[16];
    public int f59489z = m6.Mk;
    public int A = m6.Nk;
    public final int B = m6.Wk;
    public final int C = m6.Xk;

    public f(Context context, int i7, int i10) {
        this.f59476l = 0.0f;
        this.f59481q = context;
        this.D = i7;
        this.E = i10;
        if (i10 == 2) {
            this.f59476l = 1.0f;
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
        int i7 = m6.f29454h5;
        boolean z11 = false;
        if (i0.a.h(m6.x0(null, i7, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f59486w = z10;
        this.f59487x = i0.a.f(this.f59476l, m6.x0(null, this.f59489z, false), m6.x0(null, this.B, false));
        this.f59488y = i0.a.f(this.f59476l, m6.x0(null, this.A, false), m6.x0(null, this.C, false));
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
        float[] fArr = this.f59479o;
        if (this.E == 4) {
            f10 = 40.0f;
        } else {
            f10 = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f10, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.f59480p, 0);
        Matrix.translateM(this.f59480p, 0, 0.0f, this.f59470e, 0.0f);
        Matrix.rotateM(this.f59480p, 0, (-this.f59473i) - this.f59474j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f59480p, 0, (-this.d) - this.f59471f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f59477m, 0, this.f59479o, 0, this.f59480p, 0);
        float[] fArr2 = this.f59477m;
        Matrix.multiplyMM(fArr2, 0, this.f59478n, 0, fArr2, 0);
        n nVar = this.f59469c;
        if (nVar != null) {
            nVar.f59528b = (float) Math.toRadians(this.d + this.f59471f);
            this.f59469c.f59530c = (float) Math.toRadians(this.f59473i + this.f59474j);
            this.f59469c.d = (float) Math.toRadians(this.f59472g);
            this.f59469c.f59533e = this.h;
            n nVar2 = this.f59469c;
            nVar2.getClass();
            nVar2.J = this.f59486w;
            nVar2.E = this.f59487x;
            nVar2.F = this.f59488y;
            float[] fArr3 = this.f59477m;
            float[] fArr4 = this.f59480p;
            int i10 = this.f59467a;
            int i11 = this.f59468b;
            float f11 = this.f59483s;
            float f12 = this.f59485u;
            float f13 = this.f59484t;
            float f14 = this.v;
            float f15 = this.f59475k;
            float f16 = this.f59476l;
            float f17 = this.G;
            if (nVar2.f59526a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f17, 0.1f)) / 0.22f) + nVar2.f59552z);
                nVar2.f59552z = min;
                a aVar = nVar2.f59526a;
                aVar.B = nVar2.f59533e;
                aVar.C = 0;
                aVar.c(i10, i11, nVar2.f59528b, nVar2.f59530c, nVar2.d, f17, min * nVar2.A, f15, false);
                return;
            }
            if (nVar2.Z != null) {
                GLES20.glBindTexture(3553, nVar2.f59542o);
                i7 = 0;
                GLUtils.texImage2D(3553, 0, nVar2.Z, 0);
                nVar2.Z = null;
            } else {
                i7 = 0;
            }
            GLES20.glUniform1i(nVar2.f59539l, i7);
            GLES20.glUniform1f(nVar2.f59546s, nVar2.f59550x);
            GLES20.glUniform1f(nVar2.f59547t, nVar2.f59552z);
            GLES20.glUniform1f(nVar2.v, f15);
            GLES20.glUniform1f(nVar2.f59549w, f16);
            GLES20.glUniformMatrix4fv(nVar2.f59535g, 1, false, fArr3, 0);
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
            float f18 = nVar2.f59532d0 + f17;
            nVar2.f59532d0 = f18;
            GLES20.glUniform1f(nVar2.X, f18);
            for (int i12 = 0; i12 < nVar2.f59527a0; i12++) {
                int i13 = i12 * 3;
                GLES20.glBindBuffer(34962, nVar2.f59531c0[i13]);
                GLES20.glVertexAttribPointer(nVar2.f59544q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, nVar2.f59531c0[i13 + 1]);
                GLES20.glVertexAttribPointer(nVar2.f59545r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, nVar2.f59531c0[i13 + 2]);
                GLES20.glVertexAttribPointer(nVar2.f59543p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(nVar2.U, i12);
                GLES20.glUniform1i(nVar2.V, nVar2.f59529b0);
                GLES20.glDrawArrays(4, 0, nVar2.f59551y[i12] / 3);
            }
            float f19 = nVar2.f59552z;
            if (f19 < 1.0f) {
                float f20 = f19 + 0.07272727f;
                nVar2.f59552z = f20;
                if (f20 > 1.0f) {
                    nVar2.f59552z = 1.0f;
                }
            }
            float f21 = nVar2.f59550x + 5.0E-4f;
            nVar2.f59550x = f21;
            if (f21 > 1.0f) {
                nVar2.f59550x = f21 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        float f10;
        this.f59467a = i7;
        this.f59468b = i10;
        GLES20.glViewport(0, 0, i7, i10);
        float f11 = i7 / i10;
        if (this.E == 4) {
            f10 = 12.0f;
        } else {
            f10 = 53.13f;
        }
        Matrix.perspectiveM(this.f59478n, 0, f10, f11, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        n nVar = this.f59469c;
        if (nVar != null) {
            a aVar = nVar.f59526a;
            if (aVar != null) {
                aVar.b();
                nVar.f59526a = null;
            } else {
                GLES20.glDeleteProgram(nVar.f59534f);
            }
        }
        n nVar2 = new n(this.f59481q, this.E);
        this.f59469c = nVar2;
        Bitmap bitmap = this.f59482r;
        if (bitmap != null && nVar2.f59526a == null) {
            nVar2.Z = bitmap;
        }
        if (this.F) {
            nVar2.B = 1.0f;
            nVar2.C = 0.2f;
        }
    }
}
