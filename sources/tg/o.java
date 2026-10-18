package tg;

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
    public static final String[] f47115e0 = {"models/star.binobj"};
    public static final String[] f47116f0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/coin_logo.binobj", "models/coin_stars.binobj"};
    public static final String[] f47117g0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/deal_logo.binobj", "models/coin_stars.binobj"};
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
    public a f47118a;
    public final int f47119a0;
    public float f47120b;
    public final int f47121b0;
    public float f47122c;
    public final int[] f47123c0;
    public float d;
    public final int f47125f;
    public final int f47126g;
    public final int h;
    public final FloatBuffer[] f47127i;
    public final FloatBuffer[] f47128j;
    public final FloatBuffer[] f47129k;
    public final int f47130l;
    public final int f47131m;
    public final int f47132n;
    public final int f47133o;
    public final int f47134p;
    public final int f47135q;
    public final int f47136r;
    public final int f47137s;
    public final int f47138t;
    public final int f47139u;
    public final int v;
    public final int f47140w;
    public float f47141x;
    public final int[] f47142y;
    public float e = 1.0f;
    public float f47143z = 0.0f;
    public float A = 1.0f;
    public float B = 2.0f;
    public float C = 0.13f;
    public float D = 1.0f;
    public float G = 0.2f;
    public int H = -1;
    public int I = -1;
    public float f47124d0 = 0.0f;

    public o(android.content.Context r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: tg.o.<init>(android.content.Context, int):void");
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
