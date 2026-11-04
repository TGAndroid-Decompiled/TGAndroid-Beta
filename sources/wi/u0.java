package wi;

import android.content.SharedPreferences;
import java.lang.reflect.Array;
public abstract class u0 {
    public static final String[] f58080a = {"round_video_switch_back_to_front_ms", "round_video_switch_front_to_back_ms"};
    public static final int[][] f58081b = (int[][]) Array.newInstance(Integer.TYPE, 2, 8);
    public static final int[] f58082c = new int[2];
    public static final int[] d = new int[2];
    public static boolean f58083e;

    public static int a(int i3) {
        int i10 = f58082c[i3];
        if (i10 == 0) {
            if (i3 == 0) {
                return 680;
            }
            return 630;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += f58081b[i3][i12];
        }
        return Math.round(i11 / i10);
    }

    public static void b() {
        int[] iArr = f58082c;
        if (!f58083e) {
            f58083e = true;
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0);
            int i3 = 0;
            while (true) {
                String[] strArr = f58080a;
                if (i3 < 2) {
                    String string = sharedPreferences.getString(strArr[i3], null);
                    if (string != null && !string.isEmpty()) {
                        String[] split = string.split(",");
                        for (int max = Math.max(0, split.length - 8); max < split.length; max++) {
                            try {
                                int max2 = Math.max(200, Math.min(2000, Integer.parseInt(split[max])));
                                int[] iArr2 = f58081b[i3];
                                int i10 = iArr[i3];
                                iArr[i3] = i10 + 1;
                                iArr2[i10] = max2;
                            } catch (NumberFormatException unused) {
                            }
                        }
                        d[i3] = iArr[i3] % 8;
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public static void c(int i3) {
        int i10;
        int i11 = f58082c[i3];
        if (i11 == 8) {
            i10 = d[i3];
        } else {
            i10 = 0;
        }
        StringBuilder sb2 = new StringBuilder(i11 * 5);
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(',');
            }
            sb2.append(f58081b[i3][(i10 + i12) % 8]);
        }
        org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putString(f58080a[i3], sb2.toString()).apply();
    }

    public static synchronized int d(m0 m0Var, m0 m0Var2, int i3) {
        int i10;
        int a10;
        synchronized (u0.class) {
            try {
                b();
                if (m0Var != m0Var2) {
                    if (m0Var == m0.f57974b) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    int max = Math.max(200, Math.min(2000, i3));
                    int[] iArr = f58081b[i10];
                    int[] iArr2 = d;
                    iArr[iArr2[i10]] = max;
                    iArr2[i10] = (iArr2[i10] + 1) % 8;
                    int[] iArr3 = f58082c;
                    int i11 = iArr3[i10];
                    if (i11 < 8) {
                        iArr3[i10] = i11 + 1;
                    }
                    c(i10);
                    a10 = a(i10);
                } else {
                    throw new IllegalArgumentException("Camera switch direction must change");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a10;
    }
}
