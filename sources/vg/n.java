package vg;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class n {
    public static final String[] f57441e0 = {"models/star.binobj"};
    public static final String[] f57442f0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/coin_logo.binobj", "models/coin_stars.binobj"};
    public static final String[] f57443g0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/deal_logo.binobj", "models/coin_stars.binobj"};
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
    public a f57444a;
    public final int f57445a0;
    public float f57446b;
    public final int f57447b0;
    public float f57448c;
    public final int[] f57449c0;
    public float d;
    public final int f57452f;
    public final int f57453g;
    public final int h;
    public final FloatBuffer[] f57454i;
    public final FloatBuffer[] f57455j;
    public final FloatBuffer[] f57456k;
    public final int f57457l;
    public final int f57458m;
    public final int f57459n;
    public final int f57460o;
    public final int f57461p;
    public final int f57462q;
    public final int f57463r;
    public final int f57464s;
    public final int f57465t;
    public final int f57466u;
    public final int v;
    public final int f57467w;
    public float f57468x;
    public final int[] f57469y;
    public float f57451e = 1.0f;
    public float f57470z = 0.0f;
    public float A = 1.0f;
    public float B = 2.0f;
    public float C = 0.13f;
    public final float D = 1.0f;
    public final float G = 0.2f;
    public final int H = -1;
    public final int I = -1;
    public float f57450d0 = 0.0f;

    public n(android.content.Context r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: vg.n.<init>(android.content.Context, int):void");
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
        } catch (IOException e10) {
            e10.printStackTrace();
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
