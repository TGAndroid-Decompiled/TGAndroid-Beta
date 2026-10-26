package ug;

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
public final class o {
    public static final String[] f49832e0 = {"models/star.binobj"};
    public static final String[] f49833f0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/coin_logo.binobj", "models/coin_stars.binobj"};
    public static final String[] f49834g0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/deal_logo.binobj", "models/coin_stars.binobj"};
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
    public a f49835a;
    public final int f49836a0;
    public float f49837b;
    public final int f49838b0;
    public float f49839c;
    public final int[] f49840c0;
    public float d;
    public final int f49842f;
    public final int f49843g;
    public final int h;
    public final FloatBuffer[] f49844i;
    public final FloatBuffer[] f49845j;
    public final FloatBuffer[] f49846k;
    public final int f49847l;
    public final int f49848m;
    public final int f49849n;
    public final int f49850o;
    public final int f49851p;
    public final int f49852q;
    public final int f49853r;
    public final int f49854s;
    public final int f49855t;
    public final int f49856u;
    public final int v;
    public final int f49857w;
    public float f49858x;
    public final int[] f49859y;
    public float e = 1.0f;
    public float f49860z = 0.0f;
    public float A = 1.0f;
    public float B = 2.0f;
    public float C = 0.13f;
    public float D = 1.0f;
    public float G = 0.2f;
    public int H = -1;
    public int I = -1;
    public float f49841d0 = 0.0f;

    public o(android.content.Context r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: ug.o.<init>(android.content.Context, int):void");
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
        } catch (IOException e) {
            e.printStackTrace();
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
