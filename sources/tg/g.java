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
import org.telegram.ui.ActionBar.h6;
public class g implements GLSurfaceView.Renderer {
    public final int D;
    public final int E;
    public boolean F;
    public float G;
    public int f47112a;
    public int f47113b;
    public o f47114c;
    public float f47120l;
    public final Context f47125q;
    public Bitmap f47126r;
    public float f47127s;
    public float f47128t;
    public float f47129u;
    public float v;
    public boolean f47130w;
    public int f47131x;
    public int f47132y;
    public float d = 0.0f;
    public float e = 0.0f;
    public volatile float f47115f = 0.0f;
    public volatile float f47116g = 0.0f;
    public volatile float h = 1.0f;
    public float f47117i = 0.0f;
    public volatile float f47118j = 0.0f;
    public float f47119k = 0.0f;
    public final float[] f47121m = new float[16];
    public final float[] f47122n = new float[16];
    public final float[] f47123o = new float[16];
    public final float[] f47124p = new float[16];
    public int f47133z = h6.Vj;
    public int A = h6.Wj;
    public final int B = h6.fk;
    public final int C = h6.gk;

    public g(Context context, int i10, int i11) {
        this.f47120l = 0.0f;
        this.f47125q = context;
        this.D = i10;
        this.E = i11;
        if (i11 == 2) {
            this.f47120l = 1.0f;
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
        int i10 = h6.f21064h5;
        boolean z11 = false;
        if (i0.a.h(h6.x0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47130w = z10;
        this.f47131x = i0.a.f(this.f47120l, h6.x0(null, this.f47133z, false), h6.x0(null, this.B, false));
        this.f47132y = i0.a.f(this.f47120l, h6.x0(null, this.A, false), h6.x0(null, this.C, false));
        if (this.D == 1 && i0.a.h(h6.x0(null, i10, false)) < 0.5d) {
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
        float[] fArr = this.f47123o;
        if (this.E == 4) {
            f7 = 40.0f;
        } else {
            f7 = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.f47124p, 0);
        Matrix.translateM(this.f47124p, 0, 0.0f, this.e, 0.0f);
        Matrix.rotateM(this.f47124p, 0, (-this.f47117i) - this.f47118j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f47124p, 0, (-this.d) - this.f47115f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f47121m, 0, this.f47123o, 0, this.f47124p, 0);
        float[] fArr2 = this.f47121m;
        Matrix.multiplyMM(fArr2, 0, this.f47122n, 0, fArr2, 0);
        o oVar = this.f47114c;
        if (oVar != null) {
            oVar.f47170b = (float) Math.toRadians(this.d + this.f47115f);
            this.f47114c.f47172c = (float) Math.toRadians(this.f47117i + this.f47118j);
            this.f47114c.d = (float) Math.toRadians(this.f47116g);
            this.f47114c.e = this.h;
            o oVar2 = this.f47114c;
            oVar2.getClass();
            oVar2.J = this.f47130w;
            oVar2.E = this.f47131x;
            oVar2.F = this.f47132y;
            float[] fArr3 = this.f47121m;
            float[] fArr4 = this.f47124p;
            int i11 = this.f47112a;
            int i12 = this.f47113b;
            float f10 = this.f47127s;
            float f11 = this.f47129u;
            float f12 = this.f47128t;
            float f13 = this.v;
            float f14 = this.f47119k;
            float f15 = this.f47120l;
            float f16 = this.G;
            if (oVar2.f47168a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f16, 0.1f)) / 0.22f) + oVar2.f47193z);
                oVar2.f47193z = min;
                a aVar = oVar2.f47168a;
                aVar.B = oVar2.e;
                aVar.C = 0;
                aVar.c(i11, i12, oVar2.f47170b, oVar2.f47172c, oVar2.d, f16, min * oVar2.A, f14, false);
                return;
            }
            if (oVar2.Z != null) {
                GLES20.glBindTexture(3553, oVar2.f47183o);
                i10 = 0;
                GLUtils.texImage2D(3553, 0, oVar2.Z, 0);
                oVar2.Z = null;
            } else {
                i10 = 0;
            }
            GLES20.glUniform1i(oVar2.f47180l, i10);
            GLES20.glUniform1f(oVar2.f47187s, oVar2.f47191x);
            GLES20.glUniform1f(oVar2.f47188t, oVar2.f47193z);
            GLES20.glUniform1f(oVar2.v, f14);
            GLES20.glUniform1f(oVar2.f47190w, f15);
            GLES20.glUniformMatrix4fv(oVar2.f47176g, 1, false, fArr3, 0);
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
            float f17 = oVar2.f47174d0 + f16;
            oVar2.f47174d0 = f17;
            GLES20.glUniform1f(oVar2.X, f17);
            for (int i13 = 0; i13 < oVar2.f47169a0; i13++) {
                int i14 = i13 * 3;
                GLES20.glBindBuffer(34962, oVar2.f47173c0[i14]);
                GLES20.glVertexAttribPointer(oVar2.f47185q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f47173c0[i14 + 1]);
                GLES20.glVertexAttribPointer(oVar2.f47186r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f47173c0[i14 + 2]);
                GLES20.glVertexAttribPointer(oVar2.f47184p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(oVar2.U, i13);
                GLES20.glUniform1i(oVar2.V, oVar2.f47171b0);
                GLES20.glDrawArrays(4, 0, oVar2.f47192y[i13] / 3);
            }
            float f18 = oVar2.f47193z;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                oVar2.f47193z = f19;
                if (f19 > 1.0f) {
                    oVar2.f47193z = 1.0f;
                }
            }
            float f20 = oVar2.f47191x + 5.0E-4f;
            oVar2.f47191x = f20;
            if (f20 > 1.0f) {
                oVar2.f47191x = f20 - 1.0f;
            }
        }
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f47112a = i10;
        this.f47113b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.E == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f47122n, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        o oVar = this.f47114c;
        if (oVar != null) {
            a aVar = oVar.f47168a;
            if (aVar != null) {
                aVar.b();
                oVar.f47168a = null;
            } else {
                GLES20.glDeleteProgram(oVar.f47175f);
            }
        }
        o oVar2 = new o(this.f47125q, this.E);
        this.f47114c = oVar2;
        Bitmap bitmap = this.f47126r;
        if (bitmap != null && oVar2.f47168a == null) {
            oVar2.Z = bitmap;
        }
        if (this.F) {
            oVar2.B = 1.0f;
            oVar2.C = 0.2f;
        }
    }
}
