package ug;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.y6;
public final class g implements GLSurfaceView.Renderer {
    public final int D;
    public final int E;
    public boolean F;
    public float G;
    public int f49779a;
    public int f49780b;
    public o f49781c;
    public float f49787l;
    public final Context f49792q;
    public Bitmap f49793r;
    public float f49794s;
    public float f49795t;
    public float f49796u;
    public float v;
    public boolean f49797w;
    public int f49798x;
    public int f49799y;
    public float d = 0.0f;
    public float e = 0.0f;
    public volatile float f49782f = 0.0f;
    public volatile float f49783g = 0.0f;
    public volatile float h = 1.0f;
    public float f49784i = 0.0f;
    public volatile float f49785j = 0.0f;
    public float f49786k = 0.0f;
    public final float[] f49788m = new float[16];
    public final float[] f49789n = new float[16];
    public final float[] f49790o = new float[16];
    public final float[] f49791p = new float[16];
    public int f49800z = y6.Vj;
    public int A = y6.Wj;
    public final int B = y6.fk;
    public final int C = y6.gk;

    public g(Context context, int i10, int i11) {
        this.f49787l = 0.0f;
        this.f49792q = context;
        this.D = i10;
        this.E = i11;
        if (i11 == 2) {
            this.f49787l = 1.0f;
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
        int i10 = y6.f23427h5;
        boolean z11 = false;
        if (i0.a.h(y6.x0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49797w = z10;
        this.f49798x = i0.a.f(this.f49787l, y6.x0(null, this.f49800z, false), y6.x0(null, this.B, false));
        this.f49799y = i0.a.f(this.f49787l, y6.x0(null, this.A, false), y6.x0(null, this.C, false));
        if (this.D == 1 && i0.a.h(y6.x0(null, i10, false)) < 0.5d) {
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
        float[] fArr = this.f49790o;
        if (this.E == 4) {
            f7 = 40.0f;
        } else {
            f7 = 0.0f;
        }
        Matrix.setLookAtM(fArr, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.f49791p, 0);
        Matrix.translateM(this.f49791p, 0, 0.0f, this.e, 0.0f);
        Matrix.rotateM(this.f49791p, 0, (-this.f49784i) - this.f49785j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f49791p, 0, (-this.d) - this.f49782f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f49788m, 0, this.f49790o, 0, this.f49791p, 0);
        float[] fArr2 = this.f49788m;
        Matrix.multiplyMM(fArr2, 0, this.f49789n, 0, fArr2, 0);
        o oVar = this.f49781c;
        if (oVar != null) {
            oVar.f49837b = (float) Math.toRadians(this.d + this.f49782f);
            this.f49781c.f49839c = (float) Math.toRadians(this.f49784i + this.f49785j);
            this.f49781c.d = (float) Math.toRadians(this.f49783g);
            this.f49781c.e = this.h;
            o oVar2 = this.f49781c;
            oVar2.getClass();
            oVar2.J = this.f49797w;
            oVar2.E = this.f49798x;
            oVar2.F = this.f49799y;
            float[] fArr3 = this.f49788m;
            float[] fArr4 = this.f49791p;
            int i11 = this.f49779a;
            int i12 = this.f49780b;
            float f10 = this.f49794s;
            float f11 = this.f49796u;
            float f12 = this.f49795t;
            float f13 = this.v;
            float f14 = this.f49786k;
            float f15 = this.f49787l;
            float f16 = this.G;
            if (oVar2.f49835a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f16, 0.1f)) / 0.22f) + oVar2.f49860z);
                oVar2.f49860z = min;
                a aVar = oVar2.f49835a;
                aVar.B = oVar2.e;
                aVar.C = 0;
                aVar.c(i11, i12, oVar2.f49837b, oVar2.f49839c, oVar2.d, f16, min * oVar2.A, f14, false);
                return;
            }
            if (oVar2.Z != null) {
                GLES20.glBindTexture(3553, oVar2.f49850o);
                i10 = 0;
                GLUtils.texImage2D(3553, 0, oVar2.Z, 0);
                oVar2.Z = null;
            } else {
                i10 = 0;
            }
            GLES20.glUniform1i(oVar2.f49847l, i10);
            GLES20.glUniform1f(oVar2.f49854s, oVar2.f49858x);
            GLES20.glUniform1f(oVar2.f49855t, oVar2.f49860z);
            GLES20.glUniform1f(oVar2.v, f14);
            GLES20.glUniform1f(oVar2.f49857w, f15);
            GLES20.glUniformMatrix4fv(oVar2.f49843g, 1, false, fArr3, 0);
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
            float f17 = oVar2.f49841d0 + f16;
            oVar2.f49841d0 = f17;
            GLES20.glUniform1f(oVar2.X, f17);
            for (int i13 = 0; i13 < oVar2.f49836a0; i13++) {
                int i14 = i13 * 3;
                GLES20.glBindBuffer(34962, oVar2.f49840c0[i14]);
                GLES20.glVertexAttribPointer(oVar2.f49852q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f49840c0[i14 + 1]);
                GLES20.glVertexAttribPointer(oVar2.f49853r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.f49840c0[i14 + 2]);
                GLES20.glVertexAttribPointer(oVar2.f49851p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(oVar2.U, i13);
                GLES20.glUniform1i(oVar2.V, oVar2.f49838b0);
                GLES20.glDrawArrays(4, 0, oVar2.f49859y[i13] / 3);
            }
            float f18 = oVar2.f49860z;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                oVar2.f49860z = f19;
                if (f19 > 1.0f) {
                    oVar2.f49860z = 1.0f;
                }
            }
            float f20 = oVar2.f49858x + 5.0E-4f;
            oVar2.f49858x = f20;
            if (f20 > 1.0f) {
                oVar2.f49858x = f20 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f49779a = i10;
        this.f49780b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.E == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f49789n, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        o oVar = this.f49781c;
        if (oVar != null) {
            a aVar = oVar.f49835a;
            if (aVar != null) {
                aVar.b();
                oVar.f49835a = null;
            } else {
                GLES20.glDeleteProgram(oVar.f49842f);
            }
        }
        o oVar2 = new o(this.f49792q, this.E);
        this.f49781c = oVar2;
        Bitmap bitmap = this.f49793r;
        if (bitmap != null && oVar2.f49835a == null) {
            oVar2.Z = bitmap;
        }
        if (this.F) {
            oVar2.B = 1.0f;
            oVar2.C = 0.2f;
        }
    }
}
