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
    public static final String[] f59523e0 = {"models/star.binobj"};
    public static final String[] f59524f0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/coin_logo.binobj", "models/coin_stars.binobj"};
    public static final String[] f59525g0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/deal_logo.binobj", "models/coin_stars.binobj"};
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
    public a f59526a;
    public final int f59527a0;
    public float f59528b;
    public final int f59529b0;
    public float f59530c;
    public final int[] f59531c0;
    public float d;
    public final int f59534f;
    public final int f59535g;
    public final int h;
    public final FloatBuffer[] f59536i;
    public final FloatBuffer[] f59537j;
    public final FloatBuffer[] f59538k;
    public final int f59539l;
    public final int f59540m;
    public final int f59541n;
    public final int f59542o;
    public final int f59543p;
    public final int f59544q;
    public final int f59545r;
    public final int f59546s;
    public final int f59547t;
    public final int f59548u;
    public final int v;
    public final int f59549w;
    public float f59550x;
    public final int[] f59551y;
    public float f59533e = 1.0f;
    public float f59552z = 0.0f;
    public float A = 1.0f;
    public float B = 2.0f;
    public float C = 0.13f;
    public final float D = 1.0f;
    public final float G = 0.2f;
    public final int H = -1;
    public final int I = -1;
    public float f59532d0 = 0.0f;

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
