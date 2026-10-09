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
import org.telegram.ui.ActionBar.i6;
public class g implements GLSurfaceView.Renderer {
    public final int D;
    public final int E;
    public boolean F;
    public float G;
    public int f48038a;
    public int f48039b;
    public o f48040c;
    public float f48047l;
    public final Context f48052q;
    public Bitmap f48053r;
    public float f48054s;
    public float f48055t;
    public float f48056u;
    public float v;
    public boolean f48057w;
    public int f48058x;
    public int f48059y;
    public float d = 0.0f;
    public float f48041e = 0.0f;
    public volatile float f48042f = 0.0f;
    public volatile float f48043g = 0.0f;
    public volatile float h = 1.0f;
    public float f48044i = 0.0f;
    public volatile float f48045j = 0.0f;
    public float f48046k = 0.0f;
    public final float[] f48048m = new float[16];
    public final float[] f48049n = new float[16];
    public final float[] f48050o = new float[16];
    public final float[] f48051p = new float[16];
    public int f48060z = i6.Vj;
    public int A = i6.Wj;
    public final int B = i6.fk;
    public final int C = i6.gk;

    public g(Context context, int i10, int i11) {
        this.f48047l = 0.0f;
        this.f48052q = context;
        this.D = i10;
        this.E = i11;
        if (i11 == 2) {
            this.f48047l = 1.0f;
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
        int i10 = i6.f20868h5;
        boolean z11 = false;
        if (i0.a.f(i6.x0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48057w = z10;
        this.f48058x = i0.a.d(this.f48047l, i6.x0(null, this.f48060z, false), i6.x0(null, this.B, false));
        this.f48059y = i0.a.d(this.f48047l, i6.x0(null, this.A, false), i6.x0(null, this.C, false));
        if (this.D == 1 && i0.a.f(i6.x0(null, i10, false)) < 0.5d) {
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
        float[] fArr = this.f48050o;
        if (this.E == 4) {
            f7 = 40.0f;
        } else {
            f7 = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.f48051p, 0);
        Matrix.translateM(this.f48051p, 0, 0.0f, this.f48041e, 0.0f);
        Matrix.rotateM(this.f48051p, 0, (-this.f48044i) - this.f48045j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f48051p, 0, (-this.d) - this.f48042f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f48048m, 0, this.f48050o, 0, this.f48051p, 0);
        float[] fArr2 = this.f48048m;
        Matrix.multiplyMM(fArr2, 0, this.f48049n, 0, fArr2, 0);
        o oVar = this.f48040c;
        if (oVar != null) {
            oVar.f48095b = (float) Math.toRadians(this.d + this.f48042f);
            this.f48040c.f48097c = (float) Math.toRadians(this.f48044i + this.f48045j);
            this.f48040c.d = (float) Math.toRadians(this.f48043g);
            this.f48040c.f48100e = this.h;
            o oVar2 = this.f48040c;
            oVar2.getClass();
            oVar2.J = this.f48057w;
            oVar2.E = this.f48058x;
            oVar2.F = this.f48059y;
            float[] fArr3 = this.f48048m;
            float[] fArr4 = this.f48051p;
            int i11 = this.f48038a;
            int i12 = this.f48039b;
            float f10 = this.f48054s;
            float f11 = this.f48056u;
            float f12 = this.f48055t;
            float f13 = this.v;
            float f14 = this.f48046k;
            float f15 = this.f48047l;
            float f16 = this.G;
            if (oVar2.f48093a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f16, 0.1f)) / 0.22f) + oVar2.f48119z);
                oVar2.f48119z = min;
                a aVar = oVar2.f48093a;
                aVar.B = oVar2.f48100e;
                aVar.C = 0;
                aVar.c(i11, i12, oVar2.f48095b, oVar2.f48097c, oVar2.d, f16, min * oVar2.A, f14, false);
                return;
            }
            if (oVar2.Z != null) {
                GLES20.glBindTexture(3553, oVar2.f48109o);
                i10 = 0;
                GLUtils.texImage2D(3553, 0, oVar2.Z, 0);
                oVar2.Z = null;
            } else {
                i10 = 0;
            }
            GLES20.glUniform1i(oVar2.f48106l, i10);
            GLES20.glUniform1f(oVar2.f48113s, oVar2.f48117x);
            GLES20.glUniform1f(oVar2.f48114t, oVar2.f48119z);
            GLES20.glUniform1f(oVar2.v, f14);
            GLES20.glUniform1f(oVar2.f48116w, f15);
            GLES20.glUniformMatrix4fv(oVar2.f48102g, 1, false, fArr3, 0);
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
            float f17 = oVar2.f48099d0 + f16;
            oVar2.f48099d0 = f17;
            GLES20.glUniform1f(oVar2.X, f17);
            for (int i13 = 0; i13 < oVar2.f48094a0; i13++) {
                int i14 = i13 * 3;
                GLES20.glBindBuffer(34962, oVar2.f48098c0[i14]);
                GLES20.glVertexAttribPointer(oVar2.f48111q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f48098c0[i14 + 1]);
                GLES20.glVertexAttribPointer(oVar2.f48112r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f48098c0[i14 + 2]);
                GLES20.glVertexAttribPointer(oVar2.f48110p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(oVar2.U, i13);
                GLES20.glUniform1i(oVar2.V, oVar2.f48096b0);
                GLES20.glDrawArrays(4, 0, oVar2.f48118y[i13] / 3);
            }
            float f18 = oVar2.f48119z;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                oVar2.f48119z = f19;
                if (f19 > 1.0f) {
                    oVar2.f48119z = 1.0f;
                }
            }
            float f20 = oVar2.f48117x + 5.0E-4f;
            oVar2.f48117x = f20;
            if (f20 > 1.0f) {
                oVar2.f48117x = f20 - 1.0f;
            }
        }
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f48038a = i10;
        this.f48039b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.E == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f48049n, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        o oVar = this.f48040c;
        if (oVar != null) {
            a aVar = oVar.f48093a;
            if (aVar != null) {
                aVar.b();
                oVar.f48093a = null;
            } else {
                GLES20.glDeleteProgram(oVar.f48101f);
            }
        }
        o oVar2 = new o(this.f48052q, this.E);
        this.f48040c = oVar2;
        Bitmap bitmap = this.f48053r;
        if (bitmap != null && oVar2.f48093a == null) {
            oVar2.Z = bitmap;
        }
        if (this.F) {
            oVar2.B = 1.0f;
            oVar2.C = 0.2f;
        }
    }
}
