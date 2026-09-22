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
public final class a implements GLSurfaceView.Renderer {
    public final int A;
    public final int B;
    public boolean C;
    public float D;
    public int f42903a;
    public int f42904b;
    public f f42905c;
    public float f42908i;
    public final Context f42913n;
    public Bitmap f42914o;
    public float f42915p;
    public float f42916q;
    public float f42917r;
    public float f42918s;
    public boolean f42919t;
    public int f42920u;
    public int v;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f42906f = 0.0f;
    public float f42907g = 0.0f;
    public float h = 0.0f;
    public final float[] f42909j = new float[16];
    public final float[] f42910k = new float[16];
    public final float[] f42911l = new float[16];
    public final float[] f42912m = new float[16];
    public int f42921w = i6.Vj;
    public int f42922x = i6.Wj;
    public final int f42923y = i6.fk;
    public final int f42924z = i6.gk;

    public a(Context context, int i10, int i11) {
        this.f42908i = 0.0f;
        this.f42913n = context;
        this.A = i10;
        this.B = i11;
        if (i11 == 2) {
            this.f42908i = 1.0f;
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
        int i10 = i6.f18904h5;
        boolean z11 = false;
        if (i0.a.f(i6.w0(null, i10, false)) < 0.5d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42919t = z10;
        this.f42920u = i0.a.d(this.f42908i, i6.w0(null, this.f42921w, false), i6.w0(null, this.f42923y, false));
        this.v = i0.a.d(this.f42908i, i6.w0(null, this.f42922x, false), i6.w0(null, this.f42924z, false));
        if (this.A == 1 && i0.a.f(i6.w0(null, i10, false)) < 0.5d) {
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
        Matrix.setLookAtM(this.f42911l, 0, 0.0f, f7, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr = this.f42912m;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, this.e, 0.0f);
        Matrix.rotateM(this.f42912m, 0, -this.f42907g, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f42912m, 0, (-this.d) - this.f42906f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f42909j, 0, this.f42911l, 0, this.f42912m, 0);
        float[] fArr2 = this.f42909j;
        Matrix.multiplyMM(fArr2, 0, this.f42910k, 0, fArr2, 0);
        f fVar = this.f42905c;
        if (fVar != null) {
            fVar.D = this.f42919t;
            fVar.f42966y = this.f42920u;
            fVar.f42967z = this.v;
            int i10 = this.f42903a;
            int i11 = this.f42904b;
            float f10 = this.f42915p;
            float f11 = this.f42917r;
            float f12 = this.f42916q;
            float f13 = this.f42918s;
            float f14 = this.h;
            float f15 = this.f42908i;
            float f16 = this.D;
            if (fVar.V != null) {
                GLES20.glBindTexture(3553, fVar.f42952j);
                GLUtils.texImage2D(3553, 0, fVar.V, 0);
                fVar.V = null;
            }
            GLES20.glUniform1i(fVar.f42950g, 0);
            GLES20.glUniform1f(fVar.f42956n, fVar.f42961s);
            GLES20.glUniform1f(fVar.f42957o, fVar.f42963u);
            GLES20.glUniform1f(fVar.f42959q, f14);
            GLES20.glUniform1f(fVar.f42960r, f15);
            GLES20.glUniformMatrix4fv(fVar.f42947b, 1, false, this.f42909j, 0);
            GLES20.glUniformMatrix4fv(fVar.f42948c, 1, false, fArr, 0);
            GLES20.glUniform1f(fVar.E, fVar.v);
            GLES20.glUniform1f(fVar.F, fVar.f42964w);
            GLES20.glUniform1f(fVar.G, fVar.f42965x);
            GLES20.glUniform1f(fVar.J, fVar.A);
            GLES20.glUniform3f(fVar.H, Color.red(fVar.f42966y) / 255.0f, Color.green(fVar.f42966y) / 255.0f, Color.blue(fVar.f42966y) / 255.0f);
            GLES20.glUniform3f(fVar.I, Color.red(fVar.f42967z) / 255.0f, Color.green(fVar.f42967z) / 255.0f, Color.blue(fVar.f42967z) / 255.0f);
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
            float f18 = fVar.f42963u;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                fVar.f42963u = f19;
                if (f19 > 1.0f) {
                    fVar.f42963u = 1.0f;
                }
            }
            float f20 = fVar.f42961s + 5.0E-4f;
            fVar.f42961s = f20;
            if (f20 > 1.0f) {
                fVar.f42961s = f20 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        float f7;
        this.f42903a = i10;
        this.f42904b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        if (this.B == 4) {
            f7 = 12.0f;
        } else {
            f7 = 53.13f;
        }
        Matrix.perspectiveM(this.f42910k, 0, f7, f10, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        f fVar = this.f42905c;
        if (fVar != null) {
            GLES20.glDeleteProgram(fVar.f42946a);
        }
        f fVar2 = new f(this.f42913n, this.B);
        this.f42905c = fVar2;
        Bitmap bitmap = this.f42914o;
        if (bitmap != null) {
            fVar2.V = bitmap;
        }
        if (this.C) {
            fVar2.v = 1.0f;
            fVar2.f42964w = 0.2f;
        }
    }
}
