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
public final class g implements GLSurfaceView.Renderer {
    public final int D;
    public final int E;
    public boolean F;
    public float G;
    public int f47071a;
    public int f47072b;
    public o f47073c;
    public float f47079l;
    public final Context f47084q;
    public Bitmap f47085r;
    public float f47086s;
    public float f47087t;
    public float f47088u;
    public float v;
    public boolean f47089w;
    public int f47090x;
    public int f47091y;
    public float d = 0.0f;
    public float e = 0.0f;
    public volatile float f47074f = 0.0f;
    public volatile float f47075g = 0.0f;
    public volatile float h = 1.0f;
    public float f47076i = 0.0f;
    public volatile float f47077j = 0.0f;
    public float f47078k = 0.0f;
    public final float[] f47080m = new float[16];
    public final float[] f47081n = new float[16];
    public final float[] f47082o = new float[16];
    public final float[] f47083p = new float[16];
    public int f47092z = h6.Vj;
    public int A = h6.Wj;
    public final int B = h6.fk;
    public final int C = h6.gk;

    public g(Context context, int i10, int i11) {
        this.f47079l = 0.0f;
        this.f47084q = context;
        this.D = i10;
        this.E = i11;
        if (i11 == 2) {
            this.f47079l = 1.0f;
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
        int i10 = h6.f21061h5;
        boolean z11 = false;
        if (i0.a.h(h6.x0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47089w = z10;
        this.f47090x = i0.a.f(this.f47079l, h6.x0(null, this.f47092z, false), h6.x0(null, this.B, false));
        this.f47091y = i0.a.f(this.f47079l, h6.x0(null, this.A, false), h6.x0(null, this.C, false));
        if (this.D == 1 && i0.a.h(h6.x0(null, i10, false)) < 0.5d) {
            z11 = true;
        }
        this.F = z11;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float f7;
        int i10;
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        float[] fArr = this.f47082o;
        if (this.E == 4) {
            f7 = 40.0f;
        } else {
            f7 = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.f47083p, 0);
        Matrix.translateM(this.f47083p, 0, 0.0f, this.e, 0.0f);
        Matrix.rotateM(this.f47083p, 0, (-this.f47076i) - this.f47077j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f47083p, 0, (-this.d) - this.f47074f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f47080m, 0, this.f47082o, 0, this.f47083p, 0);
        float[] fArr2 = this.f47080m;
        Matrix.multiplyMM(fArr2, 0, this.f47081n, 0, fArr2, 0);
        o oVar = this.f47073c;
        if (oVar != null) {
            oVar.f47129b = (float) Math.toRadians(this.d + this.f47074f);
            this.f47073c.f47131c = (float) Math.toRadians(this.f47076i + this.f47077j);
            this.f47073c.d = (float) Math.toRadians(this.f47075g);
            this.f47073c.e = this.h;
            o oVar2 = this.f47073c;
            oVar2.getClass();
            oVar2.J = this.f47089w;
            oVar2.E = this.f47090x;
            oVar2.F = this.f47091y;
            float[] fArr3 = this.f47080m;
            float[] fArr4 = this.f47083p;
            int i11 = this.f47071a;
            int i12 = this.f47072b;
            float f10 = this.f47086s;
            float f11 = this.f47088u;
            float f12 = this.f47087t;
            float f13 = this.v;
            float f14 = this.f47078k;
            float f15 = this.f47079l;
            float f16 = this.G;
            if (oVar2.f47127a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f16, 0.1f)) / 0.22f) + oVar2.f47152z);
                oVar2.f47152z = min;
                a aVar = oVar2.f47127a;
                aVar.B = oVar2.e;
                aVar.C = 0;
                aVar.c(i11, i12, oVar2.f47129b, oVar2.f47131c, oVar2.d, f16, min * oVar2.A, f14, false);
                return;
            }
            if (oVar2.Z != null) {
                GLES20.glBindTexture(3553, oVar2.f47142o);
                i10 = 0;
                GLUtils.texImage2D(3553, 0, oVar2.Z, 0);
                oVar2.Z = null;
            } else {
                i10 = 0;
            }
            GLES20.glUniform1i(oVar2.f47139l, i10);
            GLES20.glUniform1f(oVar2.f47146s, oVar2.f47150x);
            GLES20.glUniform1f(oVar2.f47147t, oVar2.f47152z);
            GLES20.glUniform1f(oVar2.v, f14);
            GLES20.glUniform1f(oVar2.f47149w, f15);
            GLES20.glUniformMatrix4fv(oVar2.f47135g, 1, false, fArr3, 0);
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
            float f17 = oVar2.f47133d0 + f16;
            oVar2.f47133d0 = f17;
            GLES20.glUniform1f(oVar2.X, f17);
            for (int i13 = 0; i13 < oVar2.f47128a0; i13++) {
                int i14 = i13 * 3;
                GLES20.glBindBuffer(34962, oVar2.f47132c0[i14]);
                GLES20.glVertexAttribPointer(oVar2.f47144q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f47132c0[i14 + 1]);
                GLES20.glVertexAttribPointer(oVar2.f47145r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f47132c0[i14 + 2]);
                GLES20.glVertexAttribPointer(oVar2.f47143p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(oVar2.U, i13);
                GLES20.glUniform1i(oVar2.V, oVar2.f47130b0);
                GLES20.glDrawArrays(4, 0, oVar2.f47151y[i13] / 3);
            }
            float f18 = oVar2.f47152z;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                oVar2.f47152z = f19;
                if (f19 > 1.0f) {
                    oVar2.f47152z = 1.0f;
                }
            }
            float f20 = oVar2.f47150x + 5.0E-4f;
            oVar2.f47150x = f20;
            if (f20 > 1.0f) {
                oVar2.f47150x = f20 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f47071a = i10;
        this.f47072b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.E == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f47081n, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        o oVar = this.f47073c;
        if (oVar != null) {
            a aVar = oVar.f47127a;
            if (aVar != null) {
                aVar.b();
                oVar.f47127a = null;
            } else {
                GLES20.glDeleteProgram(oVar.f47134f);
            }
        }
        o oVar2 = new o(this.f47084q, this.E);
        this.f47073c = oVar2;
        Bitmap bitmap = this.f47085r;
        if (bitmap != null && oVar2.f47127a == null) {
            oVar2.Z = bitmap;
        }
        if (this.F) {
            oVar2.B = 1.0f;
            oVar2.C = 0.2f;
        }
    }
}
