package rg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.j6;
public final class a implements GLSurfaceView.Renderer {
    public final int A;
    public final int B;
    public boolean C;
    public float D;
    public int f41453a;
    public int f41454b;
    public g f41455c;
    public float f41458i;
    public final Context f41463n;
    public Bitmap f41464o;
    public float f41465p;
    public float f41466q;
    public float f41467r;
    public float f41468s;
    public boolean f41469t;
    public int f41470u;
    public int v;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f41456f = 0.0f;
    public float f41457g = 0.0f;
    public float h = 0.0f;
    public final float[] f41459j = new float[16];
    public final float[] f41460k = new float[16];
    public final float[] f41461l = new float[16];
    public final float[] f41462m = new float[16];
    public int f41471w = j6.Vj;
    public int f41472x = j6.Wj;
    public final int f41473y = j6.fk;
    public final int f41474z = j6.gk;

    public a(Context context, int i10, int i11) {
        this.f41458i = 0.0f;
        this.f41463n = context;
        this.A = i10;
        this.B = i11;
        if (i11 == 2) {
            this.f41458i = 1.0f;
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
        int i10 = j6.f17998h5;
        boolean z11 = false;
        if (i0.a.f(j6.w0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41469t = z10;
        this.f41470u = i0.a.d(this.f41458i, j6.w0(null, this.f41471w, false), j6.w0(null, this.f41473y, false));
        this.v = i0.a.d(this.f41458i, j6.w0(null, this.f41472x, false), j6.w0(null, this.f41474z, false));
        if (this.A == 1 && i0.a.f(j6.w0(null, i10, false)) < 0.5d) {
            z11 = true;
        }
        this.C = z11;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float f7;
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        if (this.B == 4) {
            f7 = 40.0f;
        } else {
            f7 = 0.0f;
        }
        Matrix.setLookAtM(this.f41461l, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr = this.f41462m;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, this.e, 0.0f);
        Matrix.rotateM(this.f41462m, 0, -this.f41457g, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f41462m, 0, (-this.d) - this.f41456f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f41459j, 0, this.f41461l, 0, this.f41462m, 0);
        float[] fArr2 = this.f41459j;
        Matrix.multiplyMM(fArr2, 0, this.f41460k, 0, fArr2, 0);
        g gVar = this.f41455c;
        if (gVar != null) {
            gVar.D = this.f41469t;
            gVar.f41518y = this.f41470u;
            gVar.f41519z = this.v;
            int i10 = this.f41453a;
            int i11 = this.f41454b;
            float f10 = this.f41465p;
            float f11 = this.f41467r;
            float f12 = this.f41466q;
            float f13 = this.f41468s;
            float f14 = this.h;
            float f15 = this.f41458i;
            float f16 = this.D;
            if (gVar.V != null) {
                GLES20.glBindTexture(3553, gVar.f41504j);
                GLUtils.texImage2D(3553, 0, gVar.V, 0);
                gVar.V = null;
            }
            GLES20.glUniform1i(gVar.f41502g, 0);
            GLES20.glUniform1f(gVar.f41508n, gVar.f41513s);
            GLES20.glUniform1f(gVar.f41509o, gVar.f41515u);
            GLES20.glUniform1f(gVar.f41511q, f14);
            GLES20.glUniform1f(gVar.f41512r, f15);
            GLES20.glUniformMatrix4fv(gVar.f41499b, 1, false, this.f41459j, 0);
            GLES20.glUniformMatrix4fv(gVar.f41500c, 1, false, fArr, 0);
            GLES20.glUniform1f(gVar.E, gVar.v);
            GLES20.glUniform1f(gVar.F, gVar.f41516w);
            GLES20.glUniform1f(gVar.G, gVar.f41517x);
            GLES20.glUniform1f(gVar.J, gVar.A);
            GLES20.glUniform3f(gVar.H, Color.red(gVar.f41518y) / 255.0f, Color.green(gVar.f41518y) / 255.0f, Color.blue(gVar.f41518y) / 255.0f);
            GLES20.glUniform3f(gVar.I, Color.red(gVar.f41519z) / 255.0f, Color.green(gVar.f41519z) / 255.0f, Color.blue(gVar.f41519z) / 255.0f);
            GLES20.glUniform3f(gVar.K, Color.red(gVar.B) / 255.0f, Color.green(gVar.B) / 255.0f, Color.blue(gVar.B) / 255.0f);
            GLES20.glUniform3f(gVar.L, Color.red(gVar.C) / 255.0f, Color.green(gVar.C) / 255.0f, Color.blue(gVar.C) / 255.0f);
            GLES20.glUniform2f(gVar.M, i10, i11);
            GLES20.glUniform4f(gVar.N, f10, f11, f12, f13);
            GLES20.glUniform1i(gVar.S, gVar.D ? 1 : 0);
            float f17 = gVar.Z + f16;
            gVar.Z = f17;
            GLES20.glUniform1f(gVar.T, f17);
            if (gVar.X == 4) {
                gVar.a(0, true);
                GLES20.glClear(256);
                gVar.a(1, true);
                GLES20.glClear(256);
                gVar.a(2, false);
                gVar.a(1, false);
                gVar.a(0, false);
            } else {
                for (int i12 = 0; i12 < gVar.W; i12++) {
                    gVar.a(i12, false);
                }
            }
            float f18 = gVar.f41515u;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                gVar.f41515u = f19;
                if (f19 > 1.0f) {
                    gVar.f41515u = 1.0f;
                }
            }
            float f20 = gVar.f41513s + 5.0E-4f;
            gVar.f41513s = f20;
            if (f20 > 1.0f) {
                gVar.f41513s = f20 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f41453a = i10;
        this.f41454b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.B == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f41460k, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        g gVar = this.f41455c;
        if (gVar != null) {
            GLES20.glDeleteProgram(gVar.f41498a);
        }
        g gVar2 = new g(this.f41463n, this.B);
        this.f41455c = gVar2;
        Bitmap bitmap = this.f41464o;
        if (bitmap != null) {
            gVar2.V = bitmap;
        }
        if (this.C) {
            gVar2.v = 1.0f;
            gVar2.f41516w = 0.2f;
        }
    }
}
