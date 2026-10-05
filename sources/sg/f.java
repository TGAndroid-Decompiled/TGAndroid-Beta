package sg;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class f {
    public static final String[] f46837a0 = {"models/star.binobj"};
    public static final String[] f46838b0 = {"models/diamond_outer_2.binobj", "models/diamond_outer.binobj", "models/diamond.binobj"};
    public static final String[] f46839c0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/coin_logo.binobj", "models/coin_stars.binobj"};
    public static final String[] f46840d0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/deal_logo.binobj", "models/coin_stars.binobj"};
    public boolean D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
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
    public final Bitmap U;
    public Bitmap V;
    public final int W;
    public final int X;
    public final int[] Y;
    public final int f46841a;
    public final int f46842b;
    public final int f46843c;
    public final FloatBuffer[] d;
    public final FloatBuffer[] f46844e;
    public final FloatBuffer[] f46845f;
    public final int f46846g;
    public final int h;
    public final int f46847i;
    public final int f46848j;
    public final int f46849k;
    public final int f46850l;
    public final int f46851m;
    public final int f46852n;
    public final int f46853o;
    public final int f46854p;
    public final int f46855q;
    public final int f46856r;
    public float f46857s;
    public final int[] f46858t;
    public int f46862y;
    public int f46863z;
    public float f46859u = 0.0f;
    public float v = 2.0f;
    public float f46860w = 0.13f;
    public float f46861x = 1.0f;
    public float A = 0.2f;
    public int B = -1;
    public int C = -1;
    public float Z = 0.0f;

    public f(android.content.Context r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: sg.f.<init>(android.content.Context, int):void");
    }

    public static String b(Context context, String str) {
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

    public static String c(String str) {
        Matcher matcher = Pattern.compile("RGB#([0-9a-fA-F]{6})").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            matcher.appendReplacement(stringBuffer, String.format(Locale.US, "vec3(%.3f, %.3f, %.3f)", Double.valueOf(Integer.parseInt(group.substring(0, 2), 16) / 255.0d), Double.valueOf(Integer.parseInt(group.substring(2, 4), 16) / 255.0d), Double.valueOf(Integer.parseInt(group.substring(4, 6), 16) / 255.0d)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final void a(int i10, boolean z10) {
        int i11 = i10 * 3;
        GLES20.glBindBuffer(34962, this.Y[i11]);
        GLES20.glVertexAttribPointer(this.f46850l, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.Y[i11 + 1]);
        GLES20.glVertexAttribPointer(this.f46851m, 3, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.Y[i11 + 2]);
        GLES20.glVertexAttribPointer(this.f46849k, 3, 5126, false, 0, 0);
        GLES20.glUniform1i(this.O, i10);
        GLES20.glUniform1i(this.P, i10);
        GLES20.glUniform1i(this.Q, z10 ? 1 : 0);
        GLES20.glUniform1i(this.R, this.X);
        GLES20.glDrawArrays(4, 0, this.f46858t[i10] / 3);
    }
}
