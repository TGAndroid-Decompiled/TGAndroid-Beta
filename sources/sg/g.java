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
    public int f48271a;
    public int f48272b;
    public o f48273c;
    public float f48280l;
    public final Context f48285q;
    public Bitmap f48286r;
    public float f48287s;
    public float f48288t;
    public float f48289u;
    public float v;
    public boolean f48290w;
    public int f48291x;
    public int f48292y;
    public float d = 0.0f;
    public float f48274e = 0.0f;
    public volatile float f48275f = 0.0f;
    public volatile float f48276g = 0.0f;
    public volatile float h = 1.0f;
    public float f48277i = 0.0f;
    public volatile float f48278j = 0.0f;
    public float f48279k = 0.0f;
    public final float[] f48281m = new float[16];
    public final float[] f48282n = new float[16];
    public final float[] f48283o = new float[16];
    public final float[] f48284p = new float[16];
    public int f48293z = h6.Vj;
    public int A = h6.Wj;
    public final int B = h6.fk;
    public final int C = h6.gk;

    public g(Context context, int i10, int i11) {
        this.f48280l = 0.0f;
        this.f48285q = context;
        this.D = i10;
        this.E = i11;
        if (i11 == 2) {
            this.f48280l = 1.0f;
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
        int i10 = h6.f20630h5;
        boolean z11 = false;
        if (i0.a.f(h6.x0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48290w = z10;
        this.f48291x = i0.a.d(this.f48280l, h6.x0(null, this.f48293z, false), h6.x0(null, this.B, false));
        this.f48292y = i0.a.d(this.f48280l, h6.x0(null, this.A, false), h6.x0(null, this.C, false));
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
        float[] fArr = this.f48283o;
        if (this.E == 4) {
            f7 = 40.0f;
        } else {
            f7 = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.f48284p, 0);
        Matrix.translateM(this.f48284p, 0, 0.0f, this.f48274e, 0.0f);
        Matrix.rotateM(this.f48284p, 0, (-this.f48277i) - this.f48278j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f48284p, 0, (-this.d) - this.f48275f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f48281m, 0, this.f48283o, 0, this.f48284p, 0);
        float[] fArr2 = this.f48281m;
        Matrix.multiplyMM(fArr2, 0, this.f48282n, 0, fArr2, 0);
        o oVar = this.f48273c;
        if (oVar != null) {
            oVar.f48328b = (float) Math.toRadians(this.d + this.f48275f);
            this.f48273c.f48330c = (float) Math.toRadians(this.f48277i + this.f48278j);
            this.f48273c.d = (float) Math.toRadians(this.f48276g);
            this.f48273c.f48333e = this.h;
            o oVar2 = this.f48273c;
            oVar2.getClass();
            oVar2.J = this.f48290w;
            oVar2.E = this.f48291x;
            oVar2.F = this.f48292y;
            float[] fArr3 = this.f48281m;
            float[] fArr4 = this.f48284p;
            int i11 = this.f48271a;
            int i12 = this.f48272b;
            float f10 = this.f48287s;
            float f11 = this.f48289u;
            float f12 = this.f48288t;
            float f13 = this.v;
            float f14 = this.f48279k;
            float f15 = this.f48280l;
            float f16 = this.G;
            if (oVar2.f48326a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f16, 0.1f)) / 0.22f) + oVar2.f48352z);
                oVar2.f48352z = min;
                a aVar = oVar2.f48326a;
                aVar.B = oVar2.f48333e;
                aVar.C = 0;
                aVar.c(i11, i12, oVar2.f48328b, oVar2.f48330c, oVar2.d, f16, min * oVar2.A, f14, false);
                return;
            }
            if (oVar2.Z != null) {
                GLES20.glBindTexture(3553, oVar2.f48342o);
                i10 = 0;
                GLUtils.texImage2D(3553, 0, oVar2.Z, 0);
                oVar2.Z = null;
            } else {
                i10 = 0;
            }
            GLES20.glUniform1i(oVar2.f48339l, i10);
            GLES20.glUniform1f(oVar2.f48346s, oVar2.f48350x);
            GLES20.glUniform1f(oVar2.f48347t, oVar2.f48352z);
            GLES20.glUniform1f(oVar2.v, f14);
            GLES20.glUniform1f(oVar2.f48349w, f15);
            GLES20.glUniformMatrix4fv(oVar2.f48335g, 1, false, fArr3, 0);
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
            float f17 = oVar2.f48332d0 + f16;
            oVar2.f48332d0 = f17;
            GLES20.glUniform1f(oVar2.X, f17);
            for (int i13 = 0; i13 < oVar2.f48327a0; i13++) {
                int i14 = i13 * 3;
                GLES20.glBindBuffer(34962, oVar2.f48331c0[i14]);
                GLES20.glVertexAttribPointer(oVar2.f48344q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f48331c0[i14 + 1]);
                GLES20.glVertexAttribPointer(oVar2.f48345r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f48331c0[i14 + 2]);
                GLES20.glVertexAttribPointer(oVar2.f48343p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(oVar2.U, i13);
                GLES20.glUniform1i(oVar2.V, oVar2.f48329b0);
                GLES20.glDrawArrays(4, 0, oVar2.f48351y[i13] / 3);
            }
            float f18 = oVar2.f48352z;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                oVar2.f48352z = f19;
                if (f19 > 1.0f) {
                    oVar2.f48352z = 1.0f;
                }
            }
            float f20 = oVar2.f48350x + 5.0E-4f;
            oVar2.f48350x = f20;
            if (f20 > 1.0f) {
                oVar2.f48350x = f20 - 1.0f;
            }
        }
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f48271a = i10;
        this.f48272b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.E == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f48282n, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        o oVar = this.f48273c;
        if (oVar != null) {
            a aVar = oVar.f48326a;
            if (aVar != null) {
                aVar.b();
                oVar.f48326a = null;
            } else {
                GLES20.glDeleteProgram(oVar.f48334f);
            }
        }
        o oVar2 = new o(this.f48285q, this.E);
        this.f48273c = oVar2;
        Bitmap bitmap = this.f48286r;
        if (bitmap != null && oVar2.f48326a == null) {
            oVar2.Z = bitmap;
        }
        if (this.F) {
            oVar2.B = 1.0f;
            oVar2.C = 0.2f;
        }
    }
}
