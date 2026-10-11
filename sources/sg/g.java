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
    public int f48130a;
    public int f48131b;
    public o f48132c;
    public float f48139l;
    public final Context f48144q;
    public Bitmap f48145r;
    public float f48146s;
    public float f48147t;
    public float f48148u;
    public float v;
    public boolean f48149w;
    public int f48150x;
    public int f48151y;
    public float d = 0.0f;
    public float f48133e = 0.0f;
    public volatile float f48134f = 0.0f;
    public volatile float f48135g = 0.0f;
    public volatile float h = 1.0f;
    public float f48136i = 0.0f;
    public volatile float f48137j = 0.0f;
    public float f48138k = 0.0f;
    public final float[] f48140m = new float[16];
    public final float[] f48141n = new float[16];
    public final float[] f48142o = new float[16];
    public final float[] f48143p = new float[16];
    public int f48152z = h6.Vj;
    public int A = h6.Wj;
    public final int B = h6.fk;
    public final int C = h6.gk;

    public g(Context context, int i10, int i11) {
        this.f48139l = 0.0f;
        this.f48144q = context;
        this.D = i10;
        this.E = i11;
        if (i11 == 2) {
            this.f48139l = 1.0f;
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
        int i10 = h6.f20857h5;
        boolean z11 = false;
        if (i0.a.f(h6.x0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48149w = z10;
        this.f48150x = i0.a.d(this.f48139l, h6.x0(null, this.f48152z, false), h6.x0(null, this.B, false));
        this.f48151y = i0.a.d(this.f48139l, h6.x0(null, this.A, false), h6.x0(null, this.C, false));
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
        float[] fArr = this.f48142o;
        if (this.E == 4) {
            f7 = 40.0f;
        } else {
            f7 = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.f48143p, 0);
        Matrix.translateM(this.f48143p, 0, 0.0f, this.f48133e, 0.0f);
        Matrix.rotateM(this.f48143p, 0, (-this.f48136i) - this.f48137j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f48143p, 0, (-this.d) - this.f48134f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f48140m, 0, this.f48142o, 0, this.f48143p, 0);
        float[] fArr2 = this.f48140m;
        Matrix.multiplyMM(fArr2, 0, this.f48141n, 0, fArr2, 0);
        o oVar = this.f48132c;
        if (oVar != null) {
            oVar.f48187b = (float) Math.toRadians(this.d + this.f48134f);
            this.f48132c.f48189c = (float) Math.toRadians(this.f48136i + this.f48137j);
            this.f48132c.d = (float) Math.toRadians(this.f48135g);
            this.f48132c.f48192e = this.h;
            o oVar2 = this.f48132c;
            oVar2.getClass();
            oVar2.J = this.f48149w;
            oVar2.E = this.f48150x;
            oVar2.F = this.f48151y;
            float[] fArr3 = this.f48140m;
            float[] fArr4 = this.f48143p;
            int i11 = this.f48130a;
            int i12 = this.f48131b;
            float f10 = this.f48146s;
            float f11 = this.f48148u;
            float f12 = this.f48147t;
            float f13 = this.v;
            float f14 = this.f48138k;
            float f15 = this.f48139l;
            float f16 = this.G;
            if (oVar2.f48185a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f16, 0.1f)) / 0.22f) + oVar2.f48211z);
                oVar2.f48211z = min;
                a aVar = oVar2.f48185a;
                aVar.B = oVar2.f48192e;
                aVar.C = 0;
                aVar.c(i11, i12, oVar2.f48187b, oVar2.f48189c, oVar2.d, f16, min * oVar2.A, f14, false);
                return;
            }
            if (oVar2.Z != null) {
                GLES20.glBindTexture(3553, oVar2.f48201o);
                i10 = 0;
                GLUtils.texImage2D(3553, 0, oVar2.Z, 0);
                oVar2.Z = null;
            } else {
                i10 = 0;
            }
            GLES20.glUniform1i(oVar2.f48198l, i10);
            GLES20.glUniform1f(oVar2.f48205s, oVar2.f48209x);
            GLES20.glUniform1f(oVar2.f48206t, oVar2.f48211z);
            GLES20.glUniform1f(oVar2.v, f14);
            GLES20.glUniform1f(oVar2.f48208w, f15);
            GLES20.glUniformMatrix4fv(oVar2.f48194g, 1, false, fArr3, 0);
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
            float f17 = oVar2.f48191d0 + f16;
            oVar2.f48191d0 = f17;
            GLES20.glUniform1f(oVar2.X, f17);
            for (int i13 = 0; i13 < oVar2.f48186a0; i13++) {
                int i14 = i13 * 3;
                GLES20.glBindBuffer(34962, oVar2.f48190c0[i14]);
                GLES20.glVertexAttribPointer(oVar2.f48203q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f48190c0[i14 + 1]);
                GLES20.glVertexAttribPointer(oVar2.f48204r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f48190c0[i14 + 2]);
                GLES20.glVertexAttribPointer(oVar2.f48202p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(oVar2.U, i13);
                GLES20.glUniform1i(oVar2.V, oVar2.f48188b0);
                GLES20.glDrawArrays(4, 0, oVar2.f48210y[i13] / 3);
            }
            float f18 = oVar2.f48211z;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                oVar2.f48211z = f19;
                if (f19 > 1.0f) {
                    oVar2.f48211z = 1.0f;
                }
            }
            float f20 = oVar2.f48209x + 5.0E-4f;
            oVar2.f48209x = f20;
            if (f20 > 1.0f) {
                oVar2.f48209x = f20 - 1.0f;
            }
        }
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f48130a = i10;
        this.f48131b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.E == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f48141n, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        o oVar = this.f48132c;
        if (oVar != null) {
            a aVar = oVar.f48185a;
            if (aVar != null) {
                aVar.b();
                oVar.f48185a = null;
            } else {
                GLES20.glDeleteProgram(oVar.f48193f);
            }
        }
        o oVar2 = new o(this.f48144q, this.E);
        this.f48132c = oVar2;
        Bitmap bitmap = this.f48145r;
        if (bitmap != null && oVar2.f48185a == null) {
            oVar2.Z = bitmap;
        }
        if (this.F) {
            oVar2.B = 1.0f;
            oVar2.C = 0.2f;
        }
    }
}
