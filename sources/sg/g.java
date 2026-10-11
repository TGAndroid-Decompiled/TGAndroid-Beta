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
import org.telegram.ui.ActionBar.h6;
public class g implements GLSurfaceView.Renderer {
    public final int D;
    public final int E;
    public boolean F;
    public float G;
    public int f48164a;
    public int f48165b;
    public o f48166c;
    public float f48173l;
    public final Context f48178q;
    public Bitmap f48179r;
    public float f48180s;
    public float f48181t;
    public float f48182u;
    public float v;
    public boolean f48183w;
    public int f48184x;
    public int f48185y;
    public float d = 0.0f;
    public float f48167e = 0.0f;
    public volatile float f48168f = 0.0f;
    public volatile float f48169g = 0.0f;
    public volatile float h = 1.0f;
    public float f48170i = 0.0f;
    public volatile float f48171j = 0.0f;
    public float f48172k = 0.0f;
    public final float[] f48174m = new float[16];
    public final float[] f48175n = new float[16];
    public final float[] f48176o = new float[16];
    public final float[] f48177p = new float[16];
    public int f48186z = h6.Vj;
    public int A = h6.Wj;
    public final int B = h6.fk;
    public final int C = h6.gk;

    public g(Context context, int i10, int i11) {
        this.f48173l = 0.0f;
        this.f48178q = context;
        this.D = i10;
        this.E = i11;
        if (i11 == 2) {
            this.f48173l = 1.0f;
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
        int i10 = h6.f20893h5;
        boolean z11 = false;
        if (i0.a.f(h6.x0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48183w = z10;
        this.f48184x = i0.a.d(this.f48173l, h6.x0(null, this.f48186z, false), h6.x0(null, this.B, false));
        this.f48185y = i0.a.d(this.f48173l, h6.x0(null, this.A, false), h6.x0(null, this.C, false));
        if (this.D == 1 && i0.a.f(h6.x0(null, i10, false)) < 0.5d) {
            z11 = true;
        }
        this.F = z11;
    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        float f7;
        int i10;
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        float[] fArr = this.f48176o;
        if (this.E == 4) {
            f7 = 40.0f;
        } else {
            f7 = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.f48177p, 0);
        Matrix.translateM(this.f48177p, 0, 0.0f, this.f48167e, 0.0f);
        Matrix.rotateM(this.f48177p, 0, (-this.f48170i) - this.f48171j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f48177p, 0, (-this.d) - this.f48168f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f48174m, 0, this.f48176o, 0, this.f48177p, 0);
        float[] fArr2 = this.f48174m;
        Matrix.multiplyMM(fArr2, 0, this.f48175n, 0, fArr2, 0);
        o oVar = this.f48166c;
        if (oVar != null) {
            oVar.f48221b = (float) Math.toRadians(this.d + this.f48168f);
            this.f48166c.f48223c = (float) Math.toRadians(this.f48170i + this.f48171j);
            this.f48166c.d = (float) Math.toRadians(this.f48169g);
            this.f48166c.f48226e = this.h;
            o oVar2 = this.f48166c;
            oVar2.getClass();
            oVar2.J = this.f48183w;
            oVar2.E = this.f48184x;
            oVar2.F = this.f48185y;
            float[] fArr3 = this.f48174m;
            float[] fArr4 = this.f48177p;
            int i11 = this.f48164a;
            int i12 = this.f48165b;
            float f10 = this.f48180s;
            float f11 = this.f48182u;
            float f12 = this.f48181t;
            float f13 = this.v;
            float f14 = this.f48172k;
            float f15 = this.f48173l;
            float f16 = this.G;
            if (oVar2.f48219a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f16, 0.1f)) / 0.22f) + oVar2.f48245z);
                oVar2.f48245z = min;
                a aVar = oVar2.f48219a;
                aVar.B = oVar2.f48226e;
                aVar.C = 0;
                aVar.c(i11, i12, oVar2.f48221b, oVar2.f48223c, oVar2.d, f16, min * oVar2.A, f14, false);
                return;
            }
            if (oVar2.Z != null) {
                GLES20.glBindTexture(3553, oVar2.f48235o);
                i10 = 0;
                GLUtils.texImage2D(3553, 0, oVar2.Z, 0);
                oVar2.Z = null;
            } else {
                i10 = 0;
            }
            GLES20.glUniform1i(oVar2.f48232l, i10);
            GLES20.glUniform1f(oVar2.f48239s, oVar2.f48243x);
            GLES20.glUniform1f(oVar2.f48240t, oVar2.f48245z);
            GLES20.glUniform1f(oVar2.v, f14);
            GLES20.glUniform1f(oVar2.f48242w, f15);
            GLES20.glUniformMatrix4fv(oVar2.f48228g, 1, false, fArr3, 0);
            GLES20.glUniformMatrix4fv(oVar2.h, 1, false, fArr4, 0);
            GLES20.glUniform1f(oVar2.K, oVar2.B);
            GLES20.glUniform1f(oVar2.L, oVar2.C);
            GLES20.glUniform1f(oVar2.M, oVar2.D);
            GLES20.glUniform1f(oVar2.P, oVar2.G);
            GLES20.glUniform3f(oVar2.N, Color.red(oVar2.E) / 255.0f, Color.green(oVar2.E) / 255.0f, Color.blue(oVar2.E) / 255.0f);
            GLES20.glUniform3f(oVar2.O, Color.red(oVar2.F) / 255.0f, Color.green(oVar2.F) / 255.0f, Color.blue(oVar2.F) / 255.0f);
            GLES20.glUniform3f(oVar2.Q, Color.red(oVar2.H) / 255.0f, Color.green(oVar2.H) / 255.0f, Color.blue(oVar2.H) / 255.0f);
            GLES20.glUniform3f(oVar2.R, Color.red(oVar2.I) / 255.0f, Color.green(oVar2.I) / 255.0f, Color.blue(oVar2.I) / 255.0f);
            GLES20.glUniform2f(oVar2.S, i11, i12);
            GLES20.glUniform4f(oVar2.T, f10, f11, f12, f13);
            GLES20.glUniform1i(oVar2.W, oVar2.J ? 1 : 0);
            float f17 = oVar2.f48225d0 + f16;
            oVar2.f48225d0 = f17;
            GLES20.glUniform1f(oVar2.X, f17);
            for (int i13 = 0; i13 < oVar2.f48220a0; i13++) {
                int i14 = i13 * 3;
                GLES20.glBindBuffer(34962, oVar2.f48224c0[i14]);
                GLES20.glVertexAttribPointer(oVar2.f48237q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f48224c0[i14 + 1]);
                GLES20.glVertexAttribPointer(oVar2.f48238r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f48224c0[i14 + 2]);
                GLES20.glVertexAttribPointer(oVar2.f48236p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(oVar2.U, i13);
                GLES20.glUniform1i(oVar2.V, oVar2.f48222b0);
                GLES20.glDrawArrays(4, 0, oVar2.f48244y[i13] / 3);
            }
            float f18 = oVar2.f48245z;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                oVar2.f48245z = f19;
                if (f19 > 1.0f) {
                    oVar2.f48245z = 1.0f;
                }
            }
            float f20 = oVar2.f48243x + 5.0E-4f;
            oVar2.f48243x = f20;
            if (f20 > 1.0f) {
                oVar2.f48243x = f20 - 1.0f;
            }
        }
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f48164a = i10;
        this.f48165b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.E == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f48175n, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        o oVar = this.f48166c;
        if (oVar != null) {
            a aVar = oVar.f48219a;
            if (aVar != null) {
                aVar.b();
                oVar.f48219a = null;
            } else {
                GLES20.glDeleteProgram(oVar.f48227f);
            }
        }
        o oVar2 = new o(this.f48178q, this.E);
        this.f48166c = oVar2;
        Bitmap bitmap = this.f48179r;
        if (bitmap != null && oVar2.f48219a == null) {
            oVar2.Z = bitmap;
        }
        if (this.F) {
            oVar2.B = 1.0f;
            oVar2.C = 0.2f;
        }
    }
}
