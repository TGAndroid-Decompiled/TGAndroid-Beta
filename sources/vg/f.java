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
    public int f59463a;
    public int f59464b;
    public n f59465c;
    public float f59472l;
    public final Context f59477q;
    public Bitmap f59478r;
    public float f59479s;
    public float f59480t;
    public float f59481u;
    public float v;
    public boolean f59482w;
    public int f59483x;
    public int f59484y;
    public float d = 0.0f;
    public float f59466e = 0.0f;
    public volatile float f59467f = 0.0f;
    public volatile float f59468g = 0.0f;
    public volatile float h = 1.0f;
    public float f59469i = 0.0f;
    public volatile float f59470j = 0.0f;
    public float f59471k = 0.0f;
    public final float[] f59473m = new float[16];
    public final float[] f59474n = new float[16];
    public final float[] f59475o = new float[16];
    public final float[] f59476p = new float[16];
    public int f59485z = m6.Mk;
    public int A = m6.Nk;
    public final int B = m6.Wk;
    public final int C = m6.Xk;

    public f(Context context, int i7, int i10) {
        this.f59472l = 0.0f;
        this.f59477q = context;
        this.D = i7;
        this.E = i10;
        if (i10 == 2) {
            this.f59472l = 1.0f;
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
        int i7 = m6.f29451h5;
        boolean z11 = false;
        if (i0.a.h(m6.x0(null, i7, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f59482w = z10;
        this.f59483x = i0.a.f(this.f59472l, m6.x0(null, this.f59485z, false), m6.x0(null, this.B, false));
        this.f59484y = i0.a.f(this.f59472l, m6.x0(null, this.A, false), m6.x0(null, this.C, false));
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
        float[] fArr = this.f59475o;
        if (this.E == 4) {
            f10 = 40.0f;
        } else {
            f10 = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f10, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.f59476p, 0);
        Matrix.translateM(this.f59476p, 0, 0.0f, this.f59466e, 0.0f);
        Matrix.rotateM(this.f59476p, 0, (-this.f59469i) - this.f59470j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f59476p, 0, (-this.d) - this.f59467f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f59473m, 0, this.f59475o, 0, this.f59476p, 0);
        float[] fArr2 = this.f59473m;
        Matrix.multiplyMM(fArr2, 0, this.f59474n, 0, fArr2, 0);
        n nVar = this.f59465c;
        if (nVar != null) {
            nVar.f59524b = (float) Math.toRadians(this.d + this.f59467f);
            this.f59465c.f59526c = (float) Math.toRadians(this.f59469i + this.f59470j);
            this.f59465c.d = (float) Math.toRadians(this.f59468g);
            this.f59465c.f59529e = this.h;
            n nVar2 = this.f59465c;
            nVar2.getClass();
            nVar2.J = this.f59482w;
            nVar2.E = this.f59483x;
            nVar2.F = this.f59484y;
            float[] fArr3 = this.f59473m;
            float[] fArr4 = this.f59476p;
            int i10 = this.f59463a;
            int i11 = this.f59464b;
            float f11 = this.f59479s;
            float f12 = this.f59481u;
            float f13 = this.f59480t;
            float f14 = this.v;
            float f15 = this.f59471k;
            float f16 = this.f59472l;
            float f17 = this.G;
            if (nVar2.f59522a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f17, 0.1f)) / 0.22f) + nVar2.f59548z);
                nVar2.f59548z = min;
                a aVar = nVar2.f59522a;
                aVar.B = nVar2.f59529e;
                aVar.C = 0;
                aVar.c(i10, i11, nVar2.f59524b, nVar2.f59526c, nVar2.d, f17, min * nVar2.A, f15, false);
                return;
            }
            if (nVar2.Z != null) {
                GLES20.glBindTexture(3553, nVar2.f59538o);
                i7 = 0;
                GLUtils.texImage2D(3553, 0, nVar2.Z, 0);
                nVar2.Z = null;
            } else {
                i7 = 0;
            }
            GLES20.glUniform1i(nVar2.f59535l, i7);
            GLES20.glUniform1f(nVar2.f59542s, nVar2.f59546x);
            GLES20.glUniform1f(nVar2.f59543t, nVar2.f59548z);
            GLES20.glUniform1f(nVar2.v, f15);
            GLES20.glUniform1f(nVar2.f59545w, f16);
            GLES20.glUniformMatrix4fv(nVar2.f59531g, 1, false, fArr3, 0);
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
            float f18 = nVar2.f59528d0 + f17;
            nVar2.f59528d0 = f18;
            GLES20.glUniform1f(nVar2.X, f18);
            for (int i12 = 0; i12 < nVar2.f59523a0; i12++) {
                int i13 = i12 * 3;
                GLES20.glBindBuffer(34962, nVar2.f59527c0[i13]);
                GLES20.glVertexAttribPointer(nVar2.f59540q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, nVar2.f59527c0[i13 + 1]);
                GLES20.glVertexAttribPointer(nVar2.f59541r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, nVar2.f59527c0[i13 + 2]);
                GLES20.glVertexAttribPointer(nVar2.f59539p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(nVar2.U, i12);
                GLES20.glUniform1i(nVar2.V, nVar2.f59525b0);
                GLES20.glDrawArrays(4, 0, nVar2.f59547y[i12] / 3);
            }
            float f19 = nVar2.f59548z;
            if (f19 < 1.0f) {
                float f20 = f19 + 0.07272727f;
                nVar2.f59548z = f20;
                if (f20 > 1.0f) {
                    nVar2.f59548z = 1.0f;
                }
            }
            float f21 = nVar2.f59546x + 5.0E-4f;
            nVar2.f59546x = f21;
            if (f21 > 1.0f) {
                nVar2.f59546x = f21 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        float f10;
        this.f59463a = i7;
        this.f59464b = i10;
        GLES20.glViewport(0, 0, i7, i10);
        float f11 = i7 / i10;
        if (this.E == 4) {
            f10 = 12.0f;
        } else {
            f10 = 53.13f;
        }
        Matrix.perspectiveM(this.f59474n, 0, f10, f11, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        n nVar = this.f59465c;
        if (nVar != null) {
            a aVar = nVar.f59522a;
            if (aVar != null) {
                aVar.b();
                nVar.f59522a = null;
            } else {
                GLES20.glDeleteProgram(nVar.f59530f);
            }
        }
        n nVar2 = new n(this.f59477q, this.E);
        this.f59465c = nVar2;
        Bitmap bitmap = this.f59478r;
        if (bitmap != null && nVar2.f59522a == null) {
            nVar2.Z = bitmap;
        }
        if (this.F) {
            nVar2.B = 1.0f;
            nVar2.C = 0.2f;
        }
    }
}
