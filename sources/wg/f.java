package wg;

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
    public int f57628a;
    public int f57629b;
    public n f57630c;
    public float f57637l;
    public final Context f57642q;
    public Bitmap f57643r;
    public float f57644s;
    public float f57645t;
    public float f57646u;
    public float v;
    public boolean f57647w;
    public int f57648x;
    public int f57649y;
    public float d = 0.0f;
    public float f57631e = 0.0f;
    public volatile float f57632f = 0.0f;
    public volatile float f57633g = 0.0f;
    public volatile float h = 1.0f;
    public float f57634i = 0.0f;
    public volatile float f57635j = 0.0f;
    public float f57636k = 0.0f;
    public final float[] f57638m = new float[16];
    public final float[] f57639n = new float[16];
    public final float[] f57640o = new float[16];
    public final float[] f57641p = new float[16];
    public int f57650z = k6.Jk;
    public int A = k6.Kk;
    public final int B = k6.Tk;
    public final int C = k6.Uk;

    public f(Context context, int i3, int i10) {
        this.f57637l = 0.0f;
        this.f57642q = context;
        this.D = i3;
        this.E = i10;
        if (i10 == 2) {
            this.f57637l = 1.0f;
        }
        b();
    }

    public static int a(int i3, String str) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i3);
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
        int i3 = k6.f27954h5;
        boolean z11 = false;
        if (i0.a.h(k6.x0(null, i3, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f57647w = z10;
        this.f57648x = i0.a.f(this.f57637l, k6.x0(null, this.f57650z, false), k6.x0(null, this.B, false));
        this.f57649y = i0.a.f(this.f57637l, k6.x0(null, this.A, false), k6.x0(null, this.C, false));
        if (this.D == 1 && i0.a.h(k6.x0(null, i3, false)) < 0.5d) {
            z11 = true;
        }
        this.F = z11;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float f10;
        int i3;
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        float[] fArr = this.f57640o;
        if (this.E == 4) {
            f10 = 40.0f;
        } else {
            f10 = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f10, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.f57641p, 0);
        Matrix.translateM(this.f57641p, 0, 0.0f, this.f57631e, 0.0f);
        Matrix.rotateM(this.f57641p, 0, (-this.f57634i) - this.f57635j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f57641p, 0, (-this.d) - this.f57632f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f57638m, 0, this.f57640o, 0, this.f57641p, 0);
        float[] fArr2 = this.f57638m;
        Matrix.multiplyMM(fArr2, 0, this.f57639n, 0, fArr2, 0);
        n nVar = this.f57630c;
        if (nVar != null) {
            nVar.f57689b = (float) Math.toRadians(this.d + this.f57632f);
            this.f57630c.f57691c = (float) Math.toRadians(this.f57634i + this.f57635j);
            this.f57630c.d = (float) Math.toRadians(this.f57633g);
            this.f57630c.f57694e = this.h;
            n nVar2 = this.f57630c;
            nVar2.getClass();
            nVar2.J = this.f57647w;
            nVar2.E = this.f57648x;
            nVar2.F = this.f57649y;
            float[] fArr3 = this.f57638m;
            float[] fArr4 = this.f57641p;
            int i10 = this.f57628a;
            int i11 = this.f57629b;
            float f11 = this.f57644s;
            float f12 = this.f57646u;
            float f13 = this.f57645t;
            float f14 = this.v;
            float f15 = this.f57636k;
            float f16 = this.f57637l;
            float f17 = this.G;
            if (nVar2.f57687a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f17, 0.1f)) / 0.22f) + nVar2.f57713z);
                nVar2.f57713z = min;
                a aVar = nVar2.f57687a;
                aVar.B = nVar2.f57694e;
                aVar.C = 0;
                aVar.c(i10, i11, nVar2.f57689b, nVar2.f57691c, nVar2.d, f17, min * nVar2.A, f15, false);
                return;
            }
            if (nVar2.Z != null) {
                GLES20.glBindTexture(3553, nVar2.f57703o);
                i3 = 0;
                GLUtils.texImage2D(3553, 0, nVar2.Z, 0);
                nVar2.Z = null;
            } else {
                i3 = 0;
            }
            GLES20.glUniform1i(nVar2.f57700l, i3);
            GLES20.glUniform1f(nVar2.f57707s, nVar2.f57711x);
            GLES20.glUniform1f(nVar2.f57708t, nVar2.f57713z);
            GLES20.glUniform1f(nVar2.v, f15);
            GLES20.glUniform1f(nVar2.f57710w, f16);
            GLES20.glUniformMatrix4fv(nVar2.f57696g, 1, false, fArr3, 0);
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
            float f18 = nVar2.f57693d0 + f17;
            nVar2.f57693d0 = f18;
            GLES20.glUniform1f(nVar2.X, f18);
            for (int i12 = 0; i12 < nVar2.f57688a0; i12++) {
                int i13 = i12 * 3;
                GLES20.glBindBuffer(34962, nVar2.f57692c0[i13]);
                GLES20.glVertexAttribPointer(nVar2.f57705q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, nVar2.f57692c0[i13 + 1]);
                GLES20.glVertexAttribPointer(nVar2.f57706r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, nVar2.f57692c0[i13 + 2]);
                GLES20.glVertexAttribPointer(nVar2.f57704p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(nVar2.U, i12);
                GLES20.glUniform1i(nVar2.V, nVar2.f57690b0);
                GLES20.glDrawArrays(4, 0, nVar2.f57712y[i12] / 3);
            }
            float f19 = nVar2.f57713z;
            if (f19 < 1.0f) {
                float f20 = f19 + 0.07272727f;
                nVar2.f57713z = f20;
                if (f20 > 1.0f) {
                    nVar2.f57713z = 1.0f;
                }
            }
            float f21 = nVar2.f57711x + 5.0E-4f;
            nVar2.f57711x = f21;
            if (f21 > 1.0f) {
                nVar2.f57711x = f21 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i3, int i10) {
        float f10;
        this.f57628a = i3;
        this.f57629b = i10;
        GLES20.glViewport(0, 0, i3, i10);
        float f11 = i3 / i10;
        if (this.E == 4) {
            f10 = 12.0f;
        } else {
            f10 = 53.13f;
        }
        Matrix.perspectiveM(this.f57639n, 0, f10, f11, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        n nVar = this.f57630c;
        if (nVar != null) {
            a aVar = nVar.f57687a;
            if (aVar != null) {
                aVar.b();
                nVar.f57687a = null;
            } else {
                GLES20.glDeleteProgram(nVar.f57695f);
            }
        }
        n nVar2 = new n(this.f57642q, this.E);
        this.f57630c = nVar2;
        Bitmap bitmap = this.f57643r;
        if (bitmap != null && nVar2.f57687a == null) {
            nVar2.Z = bitmap;
        }
        if (this.F) {
            nVar2.B = 1.0f;
            nVar2.C = 0.2f;
        }
    }
}
