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
import org.telegram.ui.ActionBar.j6;
public final class a implements GLSurfaceView.Renderer {
    public final int A;
    public final int B;
    public boolean C;
    public float D;
    public int f46516a;
    public int f46517b;
    public f f46518c;
    public float f46522i;
    public final Context f46527n;
    public Bitmap f46528o;
    public float f46529p;
    public float f46530q;
    public float f46531r;
    public float f46532s;
    public boolean f46533t;
    public int f46534u;
    public int v;
    public float d = 0.0f;
    public float f46519e = 0.0f;
    public float f46520f = 0.0f;
    public float f46521g = 0.0f;
    public float h = 0.0f;
    public final float[] f46523j = new float[16];
    public final float[] f46524k = new float[16];
    public final float[] f46525l = new float[16];
    public final float[] f46526m = new float[16];
    public int f46535w = j6.Vj;
    public int f46536x = j6.Wj;
    public final int f46537y = j6.fk;
    public final int f46538z = j6.gk;

    public a(Context context, int i10, int i11) {
        this.f46522i = 0.0f;
        this.f46527n = context;
        this.A = i10;
        this.B = i11;
        if (i11 == 2) {
            this.f46522i = 1.0f;
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
        int i10 = j6.f20761h5;
        boolean z11 = false;
        if (i0.a.f(j6.w0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46533t = z10;
        this.f46534u = i0.a.d(this.f46522i, j6.w0(null, this.f46535w, false), j6.w0(null, this.f46537y, false));
        this.v = i0.a.d(this.f46522i, j6.w0(null, this.f46536x, false), j6.w0(null, this.f46538z, false));
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
        Matrix.setLookAtM(this.f46525l, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr = this.f46526m;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, this.f46519e, 0.0f);
        Matrix.rotateM(this.f46526m, 0, -this.f46521g, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f46526m, 0, (-this.d) - this.f46520f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f46523j, 0, this.f46525l, 0, this.f46526m, 0);
        float[] fArr2 = this.f46523j;
        Matrix.multiplyMM(fArr2, 0, this.f46524k, 0, fArr2, 0);
        f fVar = this.f46518c;
        if (fVar != null) {
            fVar.D = this.f46533t;
            fVar.f46582y = this.f46534u;
            fVar.f46583z = this.v;
            int i10 = this.f46516a;
            int i11 = this.f46517b;
            float f10 = this.f46529p;
            float f11 = this.f46531r;
            float f12 = this.f46530q;
            float f13 = this.f46532s;
            float f14 = this.h;
            float f15 = this.f46522i;
            float f16 = this.D;
            if (fVar.V != null) {
                GLES20.glBindTexture(3553, fVar.f46568j);
                GLUtils.texImage2D(3553, 0, fVar.V, 0);
                fVar.V = null;
            }
            GLES20.glUniform1i(fVar.f46566g, 0);
            GLES20.glUniform1f(fVar.f46572n, fVar.f46577s);
            GLES20.glUniform1f(fVar.f46573o, fVar.f46579u);
            GLES20.glUniform1f(fVar.f46575q, f14);
            GLES20.glUniform1f(fVar.f46576r, f15);
            GLES20.glUniformMatrix4fv(fVar.f46562b, 1, false, this.f46523j, 0);
            GLES20.glUniformMatrix4fv(fVar.f46563c, 1, false, fArr, 0);
            GLES20.glUniform1f(fVar.E, fVar.v);
            GLES20.glUniform1f(fVar.F, fVar.f46580w);
            GLES20.glUniform1f(fVar.G, fVar.f46581x);
            GLES20.glUniform1f(fVar.J, fVar.A);
            GLES20.glUniform3f(fVar.H, Color.red(fVar.f46582y) / 255.0f, Color.green(fVar.f46582y) / 255.0f, Color.blue(fVar.f46582y) / 255.0f);
            GLES20.glUniform3f(fVar.I, Color.red(fVar.f46583z) / 255.0f, Color.green(fVar.f46583z) / 255.0f, Color.blue(fVar.f46583z) / 255.0f);
            GLES20.glUniform3f(fVar.K, Color.red(fVar.B) / 255.0f, Color.green(fVar.B) / 255.0f, Color.blue(fVar.B) / 255.0f);
            GLES20.glUniform3f(fVar.L, Color.red(fVar.C) / 255.0f, Color.green(fVar.C) / 255.0f, Color.blue(fVar.C) / 255.0f);
            GLES20.glUniform2f(fVar.M, i10, i11);
            GLES20.glUniform4f(fVar.N, f10, f11, f12, f13);
            GLES20.glUniform1i(fVar.S, fVar.D ? 1 : 0);
            float f17 = fVar.Z + f16;
            fVar.Z = f17;
            GLES20.glUniform1f(fVar.T, f17);
            if (fVar.X == 4) {
                fVar.a(0, true);
                GLES20.glClear(256);
                fVar.a(1, true);
                GLES20.glClear(256);
                fVar.a(2, false);
                fVar.a(1, false);
                fVar.a(0, false);
            } else {
                for (int i12 = 0; i12 < fVar.W; i12++) {
                    fVar.a(i12, false);
                }
            }
            float f18 = fVar.f46579u;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                fVar.f46579u = f19;
                if (f19 > 1.0f) {
                    fVar.f46579u = 1.0f;
                }
            }
            float f20 = fVar.f46577s + 5.0E-4f;
            fVar.f46577s = f20;
            if (f20 > 1.0f) {
                fVar.f46577s = f20 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f46516a = i10;
        this.f46517b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.B == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f46524k, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        f fVar = this.f46518c;
        if (fVar != null) {
            GLES20.glDeleteProgram(fVar.f46561a);
        }
        f fVar2 = new f(this.f46527n, this.B);
        this.f46518c = fVar2;
        Bitmap bitmap = this.f46528o;
        if (bitmap != null) {
            fVar2.V = bitmap;
        }
        if (this.C) {
            fVar2.v = 1.0f;
            fVar2.f46580w = 0.2f;
        }
    }
}
