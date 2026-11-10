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
    public int f57382a;
    public int f57383b;
    public n f57384c;
    public float f57391l;
    public final Context f57396q;
    public Bitmap f57397r;
    public float f57398s;
    public float f57399t;
    public float f57400u;
    public float v;
    public boolean f57401w;
    public int f57402x;
    public int f57403y;
    public float d = 0.0f;
    public float f57385e = 0.0f;
    public volatile float f57386f = 0.0f;
    public volatile float f57387g = 0.0f;
    public volatile float h = 1.0f;
    public float f57388i = 0.0f;
    public volatile float f57389j = 0.0f;
    public float f57390k = 0.0f;
    public final float[] f57392m = new float[16];
    public final float[] f57393n = new float[16];
    public final float[] f57394o = new float[16];
    public final float[] f57395p = new float[16];
    public int f57404z = m6.Jk;
    public int A = m6.Kk;
    public final int B = m6.Tk;
    public final int C = m6.Uk;

    public f(Context context, int i7, int i10) {
        this.f57391l = 0.0f;
        this.f57396q = context;
        this.D = i7;
        this.E = i10;
        if (i10 == 2) {
            this.f57391l = 1.0f;
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
        int i7 = m6.f27963h5;
        boolean z10 = false;
        if (i0.a.h(m6.x0(null, i7, false)) < 0.5d) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f57401w = z9;
        this.f57402x = i0.a.f(this.f57391l, m6.x0(null, this.f57404z, false), m6.x0(null, this.B, false));
        this.f57403y = i0.a.f(this.f57391l, m6.x0(null, this.A, false), m6.x0(null, this.C, false));
        if (this.D == 1 && i0.a.h(m6.x0(null, i7, false)) < 0.5d) {
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
        float[] fArr = this.f57394o;
        if (this.E == 4) {
            f10 = 40.0f;
        } else {
            f10 = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f10, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.f57395p, 0);
        Matrix.translateM(this.f57395p, 0, 0.0f, this.f57385e, 0.0f);
        Matrix.rotateM(this.f57395p, 0, (-this.f57388i) - this.f57389j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f57395p, 0, (-this.d) - this.f57386f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f57392m, 0, this.f57394o, 0, this.f57395p, 0);
        float[] fArr2 = this.f57392m;
        Matrix.multiplyMM(fArr2, 0, this.f57393n, 0, fArr2, 0);
        n nVar = this.f57384c;
        if (nVar != null) {
            nVar.f57442b = (float) Math.toRadians(this.d + this.f57386f);
            this.f57384c.f57444c = (float) Math.toRadians(this.f57388i + this.f57389j);
            this.f57384c.d = (float) Math.toRadians(this.f57387g);
            this.f57384c.f57447e = this.h;
            n nVar2 = this.f57384c;
            nVar2.getClass();
            nVar2.J = this.f57401w;
            nVar2.E = this.f57402x;
            nVar2.F = this.f57403y;
            float[] fArr3 = this.f57392m;
            float[] fArr4 = this.f57395p;
            int i10 = this.f57382a;
            int i11 = this.f57383b;
            float f11 = this.f57398s;
            float f12 = this.f57400u;
            float f13 = this.f57399t;
            float f14 = this.v;
            float f15 = this.f57390k;
            float f16 = this.f57391l;
            float f17 = this.G;
            if (nVar2.f57440a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f17, 0.1f)) / 0.22f) + nVar2.f57466z);
                nVar2.f57466z = min;
                a aVar = nVar2.f57440a;
                aVar.B = nVar2.f57447e;
                aVar.C = 0;
                aVar.c(i10, i11, nVar2.f57442b, nVar2.f57444c, nVar2.d, f17, min * nVar2.A, f15, false);
                return;
            }
            if (nVar2.Z != null) {
                GLES20.glBindTexture(3553, nVar2.f57456o);
                i7 = 0;
                GLUtils.texImage2D(3553, 0, nVar2.Z, 0);
                nVar2.Z = null;
            } else {
                i7 = 0;
            }
            GLES20.glUniform1i(nVar2.f57453l, i7);
            GLES20.glUniform1f(nVar2.f57460s, nVar2.f57464x);
            GLES20.glUniform1f(nVar2.f57461t, nVar2.f57466z);
            GLES20.glUniform1f(nVar2.v, f15);
            GLES20.glUniform1f(nVar2.f57463w, f16);
            GLES20.glUniformMatrix4fv(nVar2.f57449g, 1, false, fArr3, 0);
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
            float f18 = nVar2.f57446d0 + f17;
            nVar2.f57446d0 = f18;
            GLES20.glUniform1f(nVar2.X, f18);
            for (int i12 = 0; i12 < nVar2.f57441a0; i12++) {
                int i13 = i12 * 3;
                GLES20.glBindBuffer(34962, nVar2.f57445c0[i13]);
                GLES20.glVertexAttribPointer(nVar2.f57458q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, nVar2.f57445c0[i13 + 1]);
                GLES20.glVertexAttribPointer(nVar2.f57459r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, nVar2.f57445c0[i13 + 2]);
                GLES20.glVertexAttribPointer(nVar2.f57457p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(nVar2.U, i12);
                GLES20.glUniform1i(nVar2.V, nVar2.f57443b0);
                GLES20.glDrawArrays(4, 0, nVar2.f57465y[i12] / 3);
            }
            float f19 = nVar2.f57466z;
            if (f19 < 1.0f) {
                float f20 = f19 + 0.07272727f;
                nVar2.f57466z = f20;
                if (f20 > 1.0f) {
                    nVar2.f57466z = 1.0f;
                }
            }
            float f21 = nVar2.f57464x + 5.0E-4f;
            nVar2.f57464x = f21;
            if (f21 > 1.0f) {
                nVar2.f57464x = f21 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        float f10;
        this.f57382a = i7;
        this.f57383b = i10;
        GLES20.glViewport(0, 0, i7, i10);
        float f11 = i7 / i10;
        if (this.E == 4) {
            f10 = 12.0f;
        } else {
            f10 = 53.13f;
        }
        Matrix.perspectiveM(this.f57393n, 0, f10, f11, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        n nVar = this.f57384c;
        if (nVar != null) {
            a aVar = nVar.f57440a;
            if (aVar != null) {
                aVar.b();
                nVar.f57440a = null;
            } else {
                GLES20.glDeleteProgram(nVar.f57448f);
            }
        }
        n nVar2 = new n(this.f57396q, this.E);
        this.f57384c = nVar2;
        Bitmap bitmap = this.f57397r;
        if (bitmap != null && nVar2.f57440a == null) {
            nVar2.Z = bitmap;
        }
        if (this.F) {
            nVar2.B = 1.0f;
            nVar2.C = 0.2f;
        }
    }
}
