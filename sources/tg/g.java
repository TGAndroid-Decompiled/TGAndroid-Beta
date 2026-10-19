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
    public int f47064a;
    public int f47065b;
    public o f47066c;
    public float f47072l;
    public final Context f47077q;
    public Bitmap f47078r;
    public float f47079s;
    public float f47080t;
    public float f47081u;
    public float v;
    public boolean f47082w;
    public int f47083x;
    public int f47084y;
    public float d = 0.0f;
    public float e = 0.0f;
    public volatile float f47067f = 0.0f;
    public volatile float f47068g = 0.0f;
    public volatile float h = 1.0f;
    public float f47069i = 0.0f;
    public volatile float f47070j = 0.0f;
    public float f47071k = 0.0f;
    public final float[] f47073m = new float[16];
    public final float[] f47074n = new float[16];
    public final float[] f47075o = new float[16];
    public final float[] f47076p = new float[16];
    public int f47085z = h6.Vj;
    public int A = h6.Wj;
    public final int B = h6.fk;
    public final int C = h6.gk;

    public g(Context context, int i10, int i11) {
        this.f47072l = 0.0f;
        this.f47077q = context;
        this.D = i10;
        this.E = i11;
        if (i11 == 2) {
            this.f47072l = 1.0f;
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
        int i10 = h6.f21060h5;
        boolean z11 = false;
        if (i0.a.h(h6.x0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47082w = z10;
        this.f47083x = i0.a.f(this.f47072l, h6.x0(null, this.f47085z, false), h6.x0(null, this.B, false));
        this.f47084y = i0.a.f(this.f47072l, h6.x0(null, this.A, false), h6.x0(null, this.C, false));
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
        float[] fArr = this.f47075o;
        if (this.E == 4) {
            f7 = 40.0f;
        } else {
            f7 = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.f47076p, 0);
        Matrix.translateM(this.f47076p, 0, 0.0f, this.e, 0.0f);
        Matrix.rotateM(this.f47076p, 0, (-this.f47069i) - this.f47070j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f47076p, 0, (-this.d) - this.f47067f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f47073m, 0, this.f47075o, 0, this.f47076p, 0);
        float[] fArr2 = this.f47073m;
        Matrix.multiplyMM(fArr2, 0, this.f47074n, 0, fArr2, 0);
        o oVar = this.f47066c;
        if (oVar != null) {
            oVar.f47122b = (float) Math.toRadians(this.d + this.f47067f);
            this.f47066c.f47124c = (float) Math.toRadians(this.f47069i + this.f47070j);
            this.f47066c.d = (float) Math.toRadians(this.f47068g);
            this.f47066c.e = this.h;
            o oVar2 = this.f47066c;
            oVar2.getClass();
            oVar2.J = this.f47082w;
            oVar2.E = this.f47083x;
            oVar2.F = this.f47084y;
            float[] fArr3 = this.f47073m;
            float[] fArr4 = this.f47076p;
            int i11 = this.f47064a;
            int i12 = this.f47065b;
            float f10 = this.f47079s;
            float f11 = this.f47081u;
            float f12 = this.f47080t;
            float f13 = this.v;
            float f14 = this.f47071k;
            float f15 = this.f47072l;
            float f16 = this.G;
            if (oVar2.f47120a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f16, 0.1f)) / 0.22f) + oVar2.f47145z);
                oVar2.f47145z = min;
                a aVar = oVar2.f47120a;
                aVar.B = oVar2.e;
                aVar.C = 0;
                aVar.c(i11, i12, oVar2.f47122b, oVar2.f47124c, oVar2.d, f16, min * oVar2.A, f14, false);
                return;
            }
            if (oVar2.Z != null) {
                GLES20.glBindTexture(3553, oVar2.f47135o);
                i10 = 0;
                GLUtils.texImage2D(3553, 0, oVar2.Z, 0);
                oVar2.Z = null;
            } else {
                i10 = 0;
            }
            GLES20.glUniform1i(oVar2.f47132l, i10);
            GLES20.glUniform1f(oVar2.f47139s, oVar2.f47143x);
            GLES20.glUniform1f(oVar2.f47140t, oVar2.f47145z);
            GLES20.glUniform1f(oVar2.v, f14);
            GLES20.glUniform1f(oVar2.f47142w, f15);
            GLES20.glUniformMatrix4fv(oVar2.f47128g, 1, false, fArr3, 0);
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
            float f17 = oVar2.f47126d0 + f16;
            oVar2.f47126d0 = f17;
            GLES20.glUniform1f(oVar2.X, f17);
            for (int i13 = 0; i13 < oVar2.f47121a0; i13++) {
                int i14 = i13 * 3;
                GLES20.glBindBuffer(34962, oVar2.f47125c0[i14]);
                GLES20.glVertexAttribPointer(oVar2.f47137q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f47125c0[i14 + 1]);
                GLES20.glVertexAttribPointer(oVar2.f47138r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f47125c0[i14 + 2]);
                GLES20.glVertexAttribPointer(oVar2.f47136p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(oVar2.U, i13);
                GLES20.glUniform1i(oVar2.V, oVar2.f47123b0);
                GLES20.glDrawArrays(4, 0, oVar2.f47144y[i13] / 3);
            }
            float f18 = oVar2.f47145z;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                oVar2.f47145z = f19;
                if (f19 > 1.0f) {
                    oVar2.f47145z = 1.0f;
                }
            }
            float f20 = oVar2.f47143x + 5.0E-4f;
            oVar2.f47143x = f20;
            if (f20 > 1.0f) {
                oVar2.f47143x = f20 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f47064a = i10;
        this.f47065b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.E == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f47074n, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        o oVar = this.f47066c;
        if (oVar != null) {
            a aVar = oVar.f47120a;
            if (aVar != null) {
                aVar.b();
                oVar.f47120a = null;
            } else {
                GLES20.glDeleteProgram(oVar.f47127f);
            }
        }
        o oVar2 = new o(this.f47077q, this.E);
        this.f47066c = oVar2;
        Bitmap bitmap = this.f47078r;
        if (bitmap != null && oVar2.f47120a == null) {
            oVar2.Z = bitmap;
        }
        if (this.F) {
            oVar2.B = 1.0f;
            oVar2.C = 0.2f;
        }
    }
}
