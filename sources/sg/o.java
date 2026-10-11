package sg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.ai;
import org.telegram.ui.ActionBar.h6;
public final class o {
    public static final String[] f48182e0 = {"models/star.binobj"};
    public static final String[] f48183f0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/coin_logo.binobj", "models/coin_stars.binobj"};
    public static final String[] f48184g0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/deal_logo.binobj", "models/coin_stars.binobj"};
    public int E;
    public int F;
    public boolean J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public final Bitmap Y;
    public Bitmap Z;
    public a f48185a;
    public final int f48186a0;
    public float f48187b;
    public final int f48188b0;
    public float f48189c;
    public final int[] f48190c0;
    public float d;
    public final int f48193f;
    public final int f48194g;
    public final int h;
    public final FloatBuffer[] f48195i;
    public final FloatBuffer[] f48196j;
    public final FloatBuffer[] f48197k;
    public final int f48198l;
    public final int f48199m;
    public final int f48200n;
    public final int f48201o;
    public final int f48202p;
    public final int f48203q;
    public final int f48204r;
    public final int f48205s;
    public final int f48206t;
    public final int f48207u;
    public final int v;
    public final int f48208w;
    public float f48209x;
    public final int[] f48210y;
    public float f48192e = 1.0f;
    public float f48211z = 0.0f;
    public float A = 1.0f;
    public float B = 2.0f;
    public float C = 0.13f;
    public float D = 1.0f;
    public float G = 0.2f;
    public int H = -1;
    public int I = -1;
    public float f48191d0 = 0.0f;

    public o(Context context, int i10) {
        String[] strArr;
        String str;
        Bitmap bitmap;
        Bitmap bitmap2;
        this.f48188b0 = i10;
        if (i10 == 4) {
            String glGetString = GLES20.glGetString(7938);
            if (glGetString != null && glGetString.startsWith("OpenGL ES 3")) {
                this.f48185a = new a(context, 4);
                this.f48186a0 = 1;
                return;
            }
            throw new IllegalStateException("Diamond requires OpenGL ES 3");
        }
        int i11 = 2;
        if (i10 == 1) {
            strArr = f48183f0;
        } else if (i10 == 3) {
            strArr = f48184g0;
        } else if (i10 != 0 && i10 != 2) {
            strArr = new String[0];
        } else {
            strArr = f48182e0;
        }
        int length = strArr.length;
        this.f48186a0 = length;
        this.f48195i = new FloatBuffer[length];
        this.f48196j = new FloatBuffer[length];
        this.f48197k = new FloatBuffer[length];
        this.f48210y = new int[length];
        for (int i12 = 0; i12 < this.f48186a0; i12++) {
            j6.l lVar = new j6.l(context, strArr[i12]);
            this.f48195i[i12] = ai.h(ByteBuffer.allocateDirect(((float[]) lVar.d).length * 4));
            this.f48195i[i12].put((float[]) lVar.d).position(0);
            this.f48196j[i12] = ai.h(ByteBuffer.allocateDirect(((float[]) lVar.f14062c).length * 4));
            this.f48196j[i12].put((float[]) lVar.f14062c).position(0);
            this.f48197k[i12] = ai.h(ByteBuffer.allocateDirect(((float[]) lVar.f14061b).length * 4));
            this.f48197k[i12].put((float[]) lVar.f14061b).position(0);
            this.f48210y[i12] = ((float[]) lVar.d).length;
        }
        this.Y = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.Y);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, 100.0f, 150.0f, 0.0f, new int[]{h6.x0(null, h6.Lj, false), h6.x0(null, h6.Mj, false), h6.x0(null, h6.Nj, false), h6.x0(null, h6.Oj, false)}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, 100.0f, 100.0f, paint);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLUtils.texImage2D(3553, 0, this.Y, 0);
        this.f48207u = iArr[0];
        int[] iArr2 = new int[1];
        if (i10 != 0 && i10 != 2) {
            str = "shaders/fragment3.glsl";
        } else {
            str = "shaders/fragment4.glsl";
        }
        int a2 = g.a(35633, b(a(context, "shaders/vertex2.glsl")));
        int a10 = g.a(35632, b(a(context, str)));
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
        this.f48193f = glCreateProgram;
        FloatBuffer[] floatBufferArr = this.f48195i;
        FloatBuffer[] floatBufferArr2 = this.f48197k;
        FloatBuffer[] floatBufferArr3 = this.f48196j;
        GLES20.glUseProgram(glCreateProgram);
        this.f48202p = GLES20.glGetAttribLocation(glCreateProgram, "vPosition");
        this.f48203q = GLES20.glGetAttribLocation(glCreateProgram, "a_TexCoordinate");
        this.f48204r = GLES20.glGetAttribLocation(glCreateProgram, "a_Normal");
        this.f48198l = GLES20.glGetUniformLocation(glCreateProgram, "u_Texture");
        this.f48199m = GLES20.glGetUniformLocation(glCreateProgram, "u_NormalMap");
        this.f48200n = GLES20.glGetUniformLocation(glCreateProgram, "u_BackgroundTexture");
        this.f48205s = GLES20.glGetUniformLocation(glCreateProgram, "f_xOffset");
        this.f48206t = GLES20.glGetUniformLocation(glCreateProgram, "f_alpha");
        this.f48194g = GLES20.glGetUniformLocation(glCreateProgram, "uMVPMatrix");
        this.h = GLES20.glGetUniformLocation(glCreateProgram, "world");
        this.v = GLES20.glGetUniformLocation(glCreateProgram, "white");
        this.f48208w = GLES20.glGetUniformLocation(glCreateProgram, "golden");
        this.K = GLES20.glGetUniformLocation(glCreateProgram, "spec1");
        this.L = GLES20.glGetUniformLocation(glCreateProgram, "spec2");
        this.M = GLES20.glGetUniformLocation(glCreateProgram, "u_diffuse");
        this.N = GLES20.glGetUniformLocation(glCreateProgram, "gradientColor1");
        this.O = GLES20.glGetUniformLocation(glCreateProgram, "gradientColor2");
        this.Q = GLES20.glGetUniformLocation(glCreateProgram, "normalSpecColor");
        this.P = GLES20.glGetUniformLocation(glCreateProgram, "normalSpec");
        this.R = GLES20.glGetUniformLocation(glCreateProgram, "specColor");
        this.S = GLES20.glGetUniformLocation(glCreateProgram, "resolution");
        this.T = GLES20.glGetUniformLocation(glCreateProgram, "gradientPosition");
        this.U = GLES20.glGetUniformLocation(glCreateProgram, "modelIndex");
        this.V = GLES20.glGetUniformLocation(glCreateProgram, "type");
        this.W = GLES20.glGetUniformLocation(glCreateProgram, "night");
        this.X = GLES20.glGetUniformLocation(glCreateProgram, "time");
        int i13 = this.f48186a0;
        int i14 = i13 * 3;
        int[] iArr3 = new int[i14];
        this.f48190c0 = iArr3;
        GLES20.glGenBuffers(i14, iArr3, 0);
        int i15 = 0;
        while (i15 < i13) {
            int i16 = i15 * 3;
            GLES20.glBindBuffer(34962, this.f48190c0[i16]);
            floatBufferArr3[i15].position(0);
            GLES20.glBufferData(34962, floatBufferArr3[i15].capacity() * 4, floatBufferArr3[i15], 35044);
            GLES20.glEnableVertexAttribArray(this.f48203q);
            floatBufferArr3[i15].clear();
            GLES20.glBindBuffer(34962, this.f48190c0[i16 + 1]);
            floatBufferArr2[i15].position(0);
            GLES20.glBufferData(34962, floatBufferArr2[i15].capacity() * 4, floatBufferArr2[i15], 35044);
            GLES20.glEnableVertexAttribArray(this.f48204r);
            floatBufferArr2[i15].clear();
            GLES20.glBindBuffer(34962, this.f48190c0[i16 + 2]);
            floatBufferArr[i15].position(0);
            GLES20.glBufferData(34962, floatBufferArr[i15].capacity() * 4, floatBufferArr[i15], 35044);
            GLES20.glEnableVertexAttribArray(this.f48202p);
            floatBufferArr[i15].clear();
            i15++;
            i11 = i11;
        }
        int i17 = i11;
        GLES20.glBindBuffer(34962, 0);
        int[] iArr4 = new int[1];
        GLES20.glGenTextures(1, iArr4, 0);
        int i18 = iArr4[0];
        this.f48207u = i18;
        GLES20.glBindTexture(3553, i18);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindTexture(3553, this.f48207u);
        try {
            bitmap = BitmapFactory.decodeStream(context.getAssets().open("flecks.png"));
        } catch (IOException unused) {
            bitmap = null;
        }
        int[] iArr5 = new int[1];
        GLES20.glGenTextures(1, iArr5, 0);
        GLES20.glBindTexture(3553, iArr5[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        bitmap.recycle();
        int[] iArr6 = new int[1];
        GLES20.glGenTextures(1, iArr6, 0);
        int i19 = iArr6[0];
        this.f48201o = i19;
        GLES20.glBindTexture(3553, i19);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindTexture(3553, this.f48201o);
        int i20 = this.f48188b0;
        if (i20 != 0 && i20 != i17) {
            if (i20 == 1) {
                BitmapFactory.decodeStream(context.getAssets().open("models/coin_border.png"));
            } else {
                bitmap2 = i20 == 3 ? BitmapFactory.decodeStream(context.getAssets().open("models/deal_border.png")) : bitmap2;
                bitmap2 = null;
            }
        } else {
            bitmap2 = SvgHelper.getBitmap(R.raw.start_texture, 240, 240, -1);
        }
        if (bitmap2 != null) {
            int[] iArr7 = new int[1];
            GLES20.glGenTextures(1, iArr7, 0);
            GLES20.glBindTexture(3553, iArr7[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLUtils.texImage2D(3553, 0, bitmap2, 0);
            bitmap2.recycle();
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr7[0]);
            GLES20.glUniform1i(this.f48198l, 0);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, iArr5[0]);
            GLES20.glUniform1i(this.f48199m, 1);
        }
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, iArr6[0]);
        GLES20.glUniform1i(this.f48200n, 2);
    }

    public static String a(Context context, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            InputStream open = context.getAssets().open(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, StandardCharsets.UTF_8));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
                sb2.append("\n");
            }
            bufferedReader.close();
            open.close();
        } catch (IOException e7) {
            e7.printStackTrace();
        }
        return sb2.toString();
    }

    public static String b(String str) {
        Matcher matcher = Pattern.compile("RGB#([0-9a-fA-F]{6})").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            matcher.appendReplacement(stringBuffer, String.format(Locale.US, "vec3(%.3f, %.3f, %.3f)", Double.valueOf(Integer.parseInt(group.substring(0, 2), 16) / 255.0d), Double.valueOf(Integer.parseInt(group.substring(2, 4), 16) / 255.0d), Double.valueOf(Integer.parseInt(group.substring(4, 6), 16) / 255.0d)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
