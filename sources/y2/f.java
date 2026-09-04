package y2;

import android.content.Context;
import android.os.SystemClock;
import di.nb;
import e2.t;
import e2.u;
import e2.x;
import e9.a1;
import e9.i0;
import e9.k0;
import g2.c0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import ji.u4;
public final class f implements c, c0 {
    public static final a1 f49486p = i0.y(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final a1 f49487q = i0.y(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final a1 f49488r = i0.y(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final a1 f49489s = i0.y(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final a1 f49490t = i0.y(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final a1 f49491u = i0.y(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static f v;
    public final Context f49492a;
    public final k0 f49493b;
    public final u4 f49494c;
    public final x d;
    public final boolean f49495e;
    public final r f49496f;
    public int f49497g;
    public long h;
    public long f49498i;
    public long f49499j;
    public long f49500k;
    public volatile long f49501l;
    public long f49502m;
    public int f49503n;
    public String f49504o;

    public f(Context context, HashMap hashMap) {
        Context applicationContext;
        boolean z10;
        x xVar = x.f8795a;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f49492a = applicationContext;
        this.f49493b = k0.a(hashMap);
        this.f49494c = new u4(29);
        this.f49496f = new r();
        this.d = xVar;
        this.f49495e = true;
        if (context != null) {
            u a2 = u.a(context);
            int b10 = a2.b();
            this.f49503n = b10;
            this.f49501l = a(b10);
            e eVar = new e(this);
            Executor g10 = e2.a.g();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) a2.d;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                t tVar = (t) it.next();
                if (tVar.f8779a.get() == null) {
                    copyOnWriteArrayList.remove(tVar);
                }
            }
            t tVar2 = new t(a2, eVar, g10);
            synchronized (a2.f8786e) {
                ((CopyOnWriteArrayList) a2.d).add(tVar2);
                z10 = a2.f8783a;
            }
            if (z10) {
                tVar2.f8780b.execute(new nb(tVar2, 7));
                return;
            }
            return;
        }
        this.f49503n = 0;
        this.f49501l = 1000000L;
    }

    public static synchronized f b(Context context) {
        f fVar;
        Context applicationContext;
        synchronized (f.class) {
            try {
                if (v == null) {
                    if (context == null) {
                        applicationContext = null;
                    } else {
                        applicationContext = context.getApplicationContext();
                    }
                    HashMap hashMap = new HashMap(8);
                    hashMap.put(0, 1000000L);
                    hashMap.put(2, -9223372036854775807L);
                    hashMap.put(3, -9223372036854775807L);
                    hashMap.put(4, -9223372036854775807L);
                    hashMap.put(5, -9223372036854775807L);
                    hashMap.put(10, -9223372036854775807L);
                    hashMap.put(9, -9223372036854775807L);
                    hashMap.put(7, -9223372036854775807L);
                    v = new f(applicationContext, hashMap);
                }
                fVar = v;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public final long a(int i10) {
        int[] iArr;
        long longValue;
        Integer valueOf = Integer.valueOf(i10);
        k0 k0Var = this.f49493b;
        Long l4 = (Long) k0Var.get(valueOf);
        if (l4 == null) {
            l4 = (Long) k0Var.get(0);
        } else if (l4.longValue() == -9223372036854775807L) {
            String str = this.f49504o;
            if (str == null) {
                str = "";
            }
            char c10 = 65535;
            switch (str.hashCode()) {
                case 2083:
                    if (str.equals("AD")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 2084:
                    if (str.equals("AE")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 2085:
                    if (str.equals("AF")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2086:
                    if (str.equals("AG")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2088:
                    if (str.equals("AI")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 2091:
                    if (str.equals("AL")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 2092:
                    if (str.equals("AM")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 2094:
                    if (str.equals("AO")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2096:
                    if (str.equals("AQ")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 2097:
                    if (str.equals("AR")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 2098:
                    if (str.equals("AS")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 2099:
                    if (str.equals("AT")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 2100:
                    if (str.equals("AU")) {
                        c10 = '\f';
                        break;
                    }
                    break;
                case 2102:
                    if (str.equals("AW")) {
                        c10 = '\r';
                        break;
                    }
                    break;
                case 2103:
                    if (str.equals("AX")) {
                        c10 = 14;
                        break;
                    }
                    break;
                case 2105:
                    if (str.equals("AZ")) {
                        c10 = 15;
                        break;
                    }
                    break;
                case 2111:
                    if (str.equals("BA")) {
                        c10 = 16;
                        break;
                    }
                    break;
                case 2112:
                    if (str.equals("BB")) {
                        c10 = 17;
                        break;
                    }
                    break;
                case 2114:
                    if (str.equals("BD")) {
                        c10 = 18;
                        break;
                    }
                    break;
                case 2115:
                    if (str.equals("BE")) {
                        c10 = 19;
                        break;
                    }
                    break;
                case 2116:
                    if (str.equals("BF")) {
                        c10 = 20;
                        break;
                    }
                    break;
                case 2117:
                    if (str.equals("BG")) {
                        c10 = 21;
                        break;
                    }
                    break;
                case 2118:
                    if (str.equals("BH")) {
                        c10 = 22;
                        break;
                    }
                    break;
                case 2119:
                    if (str.equals("BI")) {
                        c10 = 23;
                        break;
                    }
                    break;
                case 2120:
                    if (str.equals("BJ")) {
                        c10 = 24;
                        break;
                    }
                    break;
                case 2122:
                    if (str.equals("BL")) {
                        c10 = 25;
                        break;
                    }
                    break;
                case 2123:
                    if (str.equals("BM")) {
                        c10 = 26;
                        break;
                    }
                    break;
                case 2124:
                    if (str.equals("BN")) {
                        c10 = 27;
                        break;
                    }
                    break;
                case 2125:
                    if (str.equals("BO")) {
                        c10 = 28;
                        break;
                    }
                    break;
                case 2127:
                    if (str.equals("BQ")) {
                        c10 = 29;
                        break;
                    }
                    break;
                case 2128:
                    if (str.equals("BR")) {
                        c10 = 30;
                        break;
                    }
                    break;
                case 2129:
                    if (str.equals("BS")) {
                        c10 = 31;
                        break;
                    }
                    break;
                case 2130:
                    if (str.equals("BT")) {
                        c10 = ' ';
                        break;
                    }
                    break;
                case 2133:
                    if (str.equals("BW")) {
                        c10 = '!';
                        break;
                    }
                    break;
                case 2135:
                    if (str.equals("BY")) {
                        c10 = '\"';
                        break;
                    }
                    break;
                case 2136:
                    if (str.equals("BZ")) {
                        c10 = '#';
                        break;
                    }
                    break;
                case 2142:
                    if (str.equals("CA")) {
                        c10 = '$';
                        break;
                    }
                    break;
                case 2145:
                    if (str.equals("CD")) {
                        c10 = '%';
                        break;
                    }
                    break;
                case 2147:
                    if (str.equals("CF")) {
                        c10 = '&';
                        break;
                    }
                    break;
                case 2148:
                    if (str.equals("CG")) {
                        c10 = '\'';
                        break;
                    }
                    break;
                case 2149:
                    if (str.equals("CH")) {
                        c10 = '(';
                        break;
                    }
                    break;
                case 2150:
                    if (str.equals("CI")) {
                        c10 = ')';
                        break;
                    }
                    break;
                case 2152:
                    if (str.equals("CK")) {
                        c10 = '*';
                        break;
                    }
                    break;
                case 2153:
                    if (str.equals("CL")) {
                        c10 = '+';
                        break;
                    }
                    break;
                case 2154:
                    if (str.equals("CM")) {
                        c10 = ',';
                        break;
                    }
                    break;
                case 2155:
                    if (str.equals("CN")) {
                        c10 = '-';
                        break;
                    }
                    break;
                case 2156:
                    if (str.equals("CO")) {
                        c10 = '.';
                        break;
                    }
                    break;
                case 2159:
                    if (str.equals("CR")) {
                        c10 = '/';
                        break;
                    }
                    break;
                case 2162:
                    if (str.equals("CU")) {
                        c10 = '0';
                        break;
                    }
                    break;
                case 2163:
                    if (str.equals("CV")) {
                        c10 = '1';
                        break;
                    }
                    break;
                case 2164:
                    if (str.equals("CW")) {
                        c10 = '2';
                        break;
                    }
                    break;
                case 2165:
                    if (str.equals("CX")) {
                        c10 = '3';
                        break;
                    }
                    break;
                case 2166:
                    if (str.equals("CY")) {
                        c10 = '4';
                        break;
                    }
                    break;
                case 2167:
                    if (str.equals("CZ")) {
                        c10 = '5';
                        break;
                    }
                    break;
                case 2177:
                    if (str.equals("DE")) {
                        c10 = '6';
                        break;
                    }
                    break;
                case 2182:
                    if (str.equals("DJ")) {
                        c10 = '7';
                        break;
                    }
                    break;
                case 2183:
                    if (str.equals("DK")) {
                        c10 = '8';
                        break;
                    }
                    break;
                case 2185:
                    if (str.equals("DM")) {
                        c10 = '9';
                        break;
                    }
                    break;
                case 2187:
                    if (str.equals("DO")) {
                        c10 = ':';
                        break;
                    }
                    break;
                case 2198:
                    if (str.equals("DZ")) {
                        c10 = ';';
                        break;
                    }
                    break;
                case 2206:
                    if (str.equals("EC")) {
                        c10 = '<';
                        break;
                    }
                    break;
                case 2208:
                    if (str.equals("EE")) {
                        c10 = '=';
                        break;
                    }
                    break;
                case 2210:
                    if (str.equals("EG")) {
                        c10 = '>';
                        break;
                    }
                    break;
                case 2221:
                    if (str.equals("ER")) {
                        c10 = '?';
                        break;
                    }
                    break;
                case 2222:
                    if (str.equals("ES")) {
                        c10 = '@';
                        break;
                    }
                    break;
                case 2223:
                    if (str.equals("ET")) {
                        c10 = 'A';
                        break;
                    }
                    break;
                case 2243:
                    if (str.equals("FI")) {
                        c10 = 'B';
                        break;
                    }
                    break;
                case 2244:
                    if (str.equals("FJ")) {
                        c10 = 'C';
                        break;
                    }
                    break;
                case 2245:
                    if (str.equals("FK")) {
                        c10 = 'D';
                        break;
                    }
                    break;
                case 2247:
                    if (str.equals("FM")) {
                        c10 = 'E';
                        break;
                    }
                    break;
                case 2249:
                    if (str.equals("FO")) {
                        c10 = 'F';
                        break;
                    }
                    break;
                case 2252:
                    if (str.equals("FR")) {
                        c10 = 'G';
                        break;
                    }
                    break;
                case 2266:
                    if (str.equals("GA")) {
                        c10 = 'H';
                        break;
                    }
                    break;
                case 2267:
                    if (str.equals("GB")) {
                        c10 = 'I';
                        break;
                    }
                    break;
                case 2269:
                    if (str.equals("GD")) {
                        c10 = 'J';
                        break;
                    }
                    break;
                case 2270:
                    if (str.equals("GE")) {
                        c10 = 'K';
                        break;
                    }
                    break;
                case 2271:
                    if (str.equals("GF")) {
                        c10 = 'L';
                        break;
                    }
                    break;
                case 2272:
                    if (str.equals("GG")) {
                        c10 = 'M';
                        break;
                    }
                    break;
                case 2273:
                    if (str.equals("GH")) {
                        c10 = 'N';
                        break;
                    }
                    break;
                case 2274:
                    if (str.equals("GI")) {
                        c10 = 'O';
                        break;
                    }
                    break;
                case 2277:
                    if (str.equals("GL")) {
                        c10 = 'P';
                        break;
                    }
                    break;
                case 2278:
                    if (str.equals("GM")) {
                        c10 = 'Q';
                        break;
                    }
                    break;
                case 2279:
                    if (str.equals("GN")) {
                        c10 = 'R';
                        break;
                    }
                    break;
                case 2281:
                    if (str.equals("GP")) {
                        c10 = 'S';
                        break;
                    }
                    break;
                case 2282:
                    if (str.equals("GQ")) {
                        c10 = 'T';
                        break;
                    }
                    break;
                case 2283:
                    if (str.equals("GR")) {
                        c10 = 'U';
                        break;
                    }
                    break;
                case 2285:
                    if (str.equals("GT")) {
                        c10 = 'V';
                        break;
                    }
                    break;
                case 2286:
                    if (str.equals("GU")) {
                        c10 = 'W';
                        break;
                    }
                    break;
                case 2288:
                    if (str.equals("GW")) {
                        c10 = 'X';
                        break;
                    }
                    break;
                case 2290:
                    if (str.equals("GY")) {
                        c10 = 'Y';
                        break;
                    }
                    break;
                case 2307:
                    if (str.equals("HK")) {
                        c10 = 'Z';
                        break;
                    }
                    break;
                case 2314:
                    if (str.equals("HR")) {
                        c10 = '[';
                        break;
                    }
                    break;
                case 2316:
                    if (str.equals("HT")) {
                        c10 = '\\';
                        break;
                    }
                    break;
                case 2317:
                    if (str.equals("HU")) {
                        c10 = ']';
                        break;
                    }
                    break;
                case 2331:
                    if (str.equals("ID")) {
                        c10 = '^';
                        break;
                    }
                    break;
                case 2332:
                    if (str.equals("IE")) {
                        c10 = '_';
                        break;
                    }
                    break;
                case 2339:
                    if (str.equals("IL")) {
                        c10 = '`';
                        break;
                    }
                    break;
                case 2340:
                    if (str.equals("IM")) {
                        c10 = 'a';
                        break;
                    }
                    break;
                case 2341:
                    if (str.equals("IN")) {
                        c10 = 'b';
                        break;
                    }
                    break;
                case 2342:
                    if (str.equals("IO")) {
                        c10 = 'c';
                        break;
                    }
                    break;
                case 2344:
                    if (str.equals("IQ")) {
                        c10 = 'd';
                        break;
                    }
                    break;
                case 2345:
                    if (str.equals("IR")) {
                        c10 = 'e';
                        break;
                    }
                    break;
                case 2346:
                    if (str.equals("IS")) {
                        c10 = 'f';
                        break;
                    }
                    break;
                case 2347:
                    if (str.equals("IT")) {
                        c10 = 'g';
                        break;
                    }
                    break;
                case 2363:
                    if (str.equals("JE")) {
                        c10 = 'h';
                        break;
                    }
                    break;
                case 2371:
                    if (str.equals("JM")) {
                        c10 = 'i';
                        break;
                    }
                    break;
                case 2373:
                    if (str.equals("JO")) {
                        c10 = 'j';
                        break;
                    }
                    break;
                case 2374:
                    if (str.equals("JP")) {
                        c10 = 'k';
                        break;
                    }
                    break;
                case 2394:
                    if (str.equals("KE")) {
                        c10 = 'l';
                        break;
                    }
                    break;
                case 2396:
                    if (str.equals("KG")) {
                        c10 = 'm';
                        break;
                    }
                    break;
                case 2397:
                    if (str.equals("KH")) {
                        c10 = 'n';
                        break;
                    }
                    break;
                case 2398:
                    if (str.equals("KI")) {
                        c10 = 'o';
                        break;
                    }
                    break;
                case 2402:
                    if (str.equals("KM")) {
                        c10 = 'p';
                        break;
                    }
                    break;
                case 2403:
                    if (str.equals("KN")) {
                        c10 = 'q';
                        break;
                    }
                    break;
                case 2407:
                    if (str.equals("KR")) {
                        c10 = 'r';
                        break;
                    }
                    break;
                case 2412:
                    if (str.equals("KW")) {
                        c10 = 's';
                        break;
                    }
                    break;
                case 2414:
                    if (str.equals("KY")) {
                        c10 = 't';
                        break;
                    }
                    break;
                case 2415:
                    if (str.equals("KZ")) {
                        c10 = 'u';
                        break;
                    }
                    break;
                case 2421:
                    if (str.equals("LA")) {
                        c10 = 'v';
                        break;
                    }
                    break;
                case 2422:
                    if (str.equals("LB")) {
                        c10 = 'w';
                        break;
                    }
                    break;
                case 2423:
                    if (str.equals("LC")) {
                        c10 = 'x';
                        break;
                    }
                    break;
                case 2429:
                    if (str.equals("LI")) {
                        c10 = 'y';
                        break;
                    }
                    break;
                case 2431:
                    if (str.equals("LK")) {
                        c10 = 'z';
                        break;
                    }
                    break;
                case 2438:
                    if (str.equals("LR")) {
                        c10 = '{';
                        break;
                    }
                    break;
                case 2439:
                    if (str.equals("LS")) {
                        c10 = '|';
                        break;
                    }
                    break;
                case 2440:
                    if (str.equals("LT")) {
                        c10 = '}';
                        break;
                    }
                    break;
                case 2441:
                    if (str.equals("LU")) {
                        c10 = '~';
                        break;
                    }
                    break;
                case 2442:
                    if (str.equals("LV")) {
                        c10 = 127;
                        break;
                    }
                    break;
                case 2445:
                    if (str.equals("LY")) {
                        c10 = 128;
                        break;
                    }
                    break;
                case 2452:
                    if (str.equals("MA")) {
                        c10 = 129;
                        break;
                    }
                    break;
                case 2454:
                    if (str.equals("MC")) {
                        c10 = 130;
                        break;
                    }
                    break;
                case 2455:
                    if (str.equals("MD")) {
                        c10 = 131;
                        break;
                    }
                    break;
                case 2456:
                    if (str.equals("ME")) {
                        c10 = 132;
                        break;
                    }
                    break;
                case 2457:
                    if (str.equals("MF")) {
                        c10 = 133;
                        break;
                    }
                    break;
                case 2458:
                    if (str.equals("MG")) {
                        c10 = 134;
                        break;
                    }
                    break;
                case 2459:
                    if (str.equals("MH")) {
                        c10 = 135;
                        break;
                    }
                    break;
                case 2462:
                    if (str.equals("MK")) {
                        c10 = 136;
                        break;
                    }
                    break;
                case 2463:
                    if (str.equals("ML")) {
                        c10 = 137;
                        break;
                    }
                    break;
                case 2464:
                    if (str.equals("MM")) {
                        c10 = 138;
                        break;
                    }
                    break;
                case 2465:
                    if (str.equals("MN")) {
                        c10 = 139;
                        break;
                    }
                    break;
                case 2466:
                    if (str.equals("MO")) {
                        c10 = 140;
                        break;
                    }
                    break;
                case 2467:
                    if (str.equals("MP")) {
                        c10 = 141;
                        break;
                    }
                    break;
                case 2468:
                    if (str.equals("MQ")) {
                        c10 = 142;
                        break;
                    }
                    break;
                case 2469:
                    if (str.equals("MR")) {
                        c10 = 143;
                        break;
                    }
                    break;
                case 2470:
                    if (str.equals("MS")) {
                        c10 = 144;
                        break;
                    }
                    break;
                case 2471:
                    if (str.equals("MT")) {
                        c10 = 145;
                        break;
                    }
                    break;
                case 2472:
                    if (str.equals("MU")) {
                        c10 = 146;
                        break;
                    }
                    break;
                case 2473:
                    if (str.equals("MV")) {
                        c10 = 147;
                        break;
                    }
                    break;
                case 2474:
                    if (str.equals("MW")) {
                        c10 = 148;
                        break;
                    }
                    break;
                case 2475:
                    if (str.equals("MX")) {
                        c10 = 149;
                        break;
                    }
                    break;
                case 2476:
                    if (str.equals("MY")) {
                        c10 = 150;
                        break;
                    }
                    break;
                case 2477:
                    if (str.equals("MZ")) {
                        c10 = 151;
                        break;
                    }
                    break;
                case 2483:
                    if (str.equals("NA")) {
                        c10 = 152;
                        break;
                    }
                    break;
                case 2485:
                    if (str.equals("NC")) {
                        c10 = 153;
                        break;
                    }
                    break;
                case 2487:
                    if (str.equals("NE")) {
                        c10 = 154;
                        break;
                    }
                    break;
                case 2488:
                    if (str.equals("NF")) {
                        c10 = 155;
                        break;
                    }
                    break;
                case 2489:
                    if (str.equals("NG")) {
                        c10 = 156;
                        break;
                    }
                    break;
                case 2491:
                    if (str.equals("NI")) {
                        c10 = 157;
                        break;
                    }
                    break;
                case 2494:
                    if (str.equals("NL")) {
                        c10 = 158;
                        break;
                    }
                    break;
                case 2497:
                    if (str.equals("NO")) {
                        c10 = 159;
                        break;
                    }
                    break;
                case 2498:
                    if (str.equals("NP")) {
                        c10 = 160;
                        break;
                    }
                    break;
                case 2500:
                    if (str.equals("NR")) {
                        c10 = 161;
                        break;
                    }
                    break;
                case 2503:
                    if (str.equals("NU")) {
                        c10 = 162;
                        break;
                    }
                    break;
                case 2508:
                    if (str.equals("NZ")) {
                        c10 = 163;
                        break;
                    }
                    break;
                case 2526:
                    if (str.equals("OM")) {
                        c10 = 164;
                        break;
                    }
                    break;
                case 2545:
                    if (str.equals("PA")) {
                        c10 = 165;
                        break;
                    }
                    break;
                case 2549:
                    if (str.equals("PE")) {
                        c10 = 166;
                        break;
                    }
                    break;
                case 2550:
                    if (str.equals("PF")) {
                        c10 = 167;
                        break;
                    }
                    break;
                case 2551:
                    if (str.equals("PG")) {
                        c10 = 168;
                        break;
                    }
                    break;
                case 2552:
                    if (str.equals("PH")) {
                        c10 = 169;
                        break;
                    }
                    break;
                case 2555:
                    if (str.equals("PK")) {
                        c10 = 170;
                        break;
                    }
                    break;
                case 2556:
                    if (str.equals("PL")) {
                        c10 = 171;
                        break;
                    }
                    break;
                case 2557:
                    if (str.equals("PM")) {
                        c10 = 172;
                        break;
                    }
                    break;
                case 2562:
                    if (str.equals("PR")) {
                        c10 = 173;
                        break;
                    }
                    break;
                case 2563:
                    if (str.equals("PS")) {
                        c10 = 174;
                        break;
                    }
                    break;
                case 2564:
                    if (str.equals("PT")) {
                        c10 = 175;
                        break;
                    }
                    break;
                case 2567:
                    if (str.equals("PW")) {
                        c10 = 176;
                        break;
                    }
                    break;
                case 2569:
                    if (str.equals("PY")) {
                        c10 = 177;
                        break;
                    }
                    break;
                case 2576:
                    if (str.equals("QA")) {
                        c10 = 178;
                        break;
                    }
                    break;
                case 2611:
                    if (str.equals("RE")) {
                        c10 = 179;
                        break;
                    }
                    break;
                case 2621:
                    if (str.equals("RO")) {
                        c10 = 180;
                        break;
                    }
                    break;
                case 2625:
                    if (str.equals("RS")) {
                        c10 = 181;
                        break;
                    }
                    break;
                case 2627:
                    if (str.equals("RU")) {
                        c10 = 182;
                        break;
                    }
                    break;
                case 2629:
                    if (str.equals("RW")) {
                        c10 = 183;
                        break;
                    }
                    break;
                case 2638:
                    if (str.equals("SA")) {
                        c10 = 184;
                        break;
                    }
                    break;
                case 2639:
                    if (str.equals("SB")) {
                        c10 = 185;
                        break;
                    }
                    break;
                case 2640:
                    if (str.equals("SC")) {
                        c10 = 186;
                        break;
                    }
                    break;
                case 2641:
                    if (str.equals("SD")) {
                        c10 = 187;
                        break;
                    }
                    break;
                case 2642:
                    if (str.equals("SE")) {
                        c10 = 188;
                        break;
                    }
                    break;
                case 2644:
                    if (str.equals("SG")) {
                        c10 = 189;
                        break;
                    }
                    break;
                case 2645:
                    if (str.equals("SH")) {
                        c10 = 190;
                        break;
                    }
                    break;
                case 2646:
                    if (str.equals("SI")) {
                        c10 = 191;
                        break;
                    }
                    break;
                case 2647:
                    if (str.equals("SJ")) {
                        c10 = 192;
                        break;
                    }
                    break;
                case 2648:
                    if (str.equals("SK")) {
                        c10 = 193;
                        break;
                    }
                    break;
                case 2649:
                    if (str.equals("SL")) {
                        c10 = 194;
                        break;
                    }
                    break;
                case 2650:
                    if (str.equals("SM")) {
                        c10 = 195;
                        break;
                    }
                    break;
                case 2651:
                    if (str.equals("SN")) {
                        c10 = 196;
                        break;
                    }
                    break;
                case 2652:
                    if (str.equals("SO")) {
                        c10 = 197;
                        break;
                    }
                    break;
                case 2655:
                    if (str.equals("SR")) {
                        c10 = 198;
                        break;
                    }
                    break;
                case 2656:
                    if (str.equals("SS")) {
                        c10 = 199;
                        break;
                    }
                    break;
                case 2657:
                    if (str.equals("ST")) {
                        c10 = 200;
                        break;
                    }
                    break;
                case 2659:
                    if (str.equals("SV")) {
                        c10 = 201;
                        break;
                    }
                    break;
                case 2661:
                    if (str.equals("SX")) {
                        c10 = 202;
                        break;
                    }
                    break;
                case 2662:
                    if (str.equals("SY")) {
                        c10 = 203;
                        break;
                    }
                    break;
                case 2663:
                    if (str.equals("SZ")) {
                        c10 = 204;
                        break;
                    }
                    break;
                case 2671:
                    if (str.equals("TC")) {
                        c10 = 205;
                        break;
                    }
                    break;
                case 2672:
                    if (str.equals("TD")) {
                        c10 = 206;
                        break;
                    }
                    break;
                case 2675:
                    if (str.equals("TG")) {
                        c10 = 207;
                        break;
                    }
                    break;
                case 2676:
                    if (str.equals("TH")) {
                        c10 = 208;
                        break;
                    }
                    break;
                case 2678:
                    if (str.equals("TJ")) {
                        c10 = 209;
                        break;
                    }
                    break;
                case 2680:
                    if (str.equals("TL")) {
                        c10 = 210;
                        break;
                    }
                    break;
                case 2681:
                    if (str.equals("TM")) {
                        c10 = 211;
                        break;
                    }
                    break;
                case 2682:
                    if (str.equals("TN")) {
                        c10 = 212;
                        break;
                    }
                    break;
                case 2683:
                    if (str.equals("TO")) {
                        c10 = 213;
                        break;
                    }
                    break;
                case 2686:
                    if (str.equals("TR")) {
                        c10 = 214;
                        break;
                    }
                    break;
                case 2688:
                    if (str.equals("TT")) {
                        c10 = 215;
                        break;
                    }
                    break;
                case 2690:
                    if (str.equals("TV")) {
                        c10 = 216;
                        break;
                    }
                    break;
                case 2691:
                    if (str.equals("TW")) {
                        c10 = 217;
                        break;
                    }
                    break;
                case 2694:
                    if (str.equals("TZ")) {
                        c10 = 218;
                        break;
                    }
                    break;
                case 2700:
                    if (str.equals("UA")) {
                        c10 = 219;
                        break;
                    }
                    break;
                case 2706:
                    if (str.equals("UG")) {
                        c10 = 220;
                        break;
                    }
                    break;
                case 2718:
                    if (str.equals("US")) {
                        c10 = 221;
                        break;
                    }
                    break;
                case 2724:
                    if (str.equals("UY")) {
                        c10 = 222;
                        break;
                    }
                    break;
                case 2725:
                    if (str.equals("UZ")) {
                        c10 = 223;
                        break;
                    }
                    break;
                case 2731:
                    if (str.equals("VA")) {
                        c10 = 224;
                        break;
                    }
                    break;
                case 2733:
                    if (str.equals("VC")) {
                        c10 = 225;
                        break;
                    }
                    break;
                case 2735:
                    if (str.equals("VE")) {
                        c10 = 226;
                        break;
                    }
                    break;
                case 2737:
                    if (str.equals("VG")) {
                        c10 = 227;
                        break;
                    }
                    break;
                case 2739:
                    if (str.equals("VI")) {
                        c10 = 228;
                        break;
                    }
                    break;
                case 2744:
                    if (str.equals("VN")) {
                        c10 = 229;
                        break;
                    }
                    break;
                case 2751:
                    if (str.equals("VU")) {
                        c10 = 230;
                        break;
                    }
                    break;
                case 2767:
                    if (str.equals("WF")) {
                        c10 = 231;
                        break;
                    }
                    break;
                case 2780:
                    if (str.equals("WS")) {
                        c10 = 232;
                        break;
                    }
                    break;
                case 2803:
                    if (str.equals("XK")) {
                        c10 = 233;
                        break;
                    }
                    break;
                case 2828:
                    if (str.equals("YE")) {
                        c10 = 234;
                        break;
                    }
                    break;
                case 2843:
                    if (str.equals("YT")) {
                        c10 = 235;
                        break;
                    }
                    break;
                case 2855:
                    if (str.equals("ZA")) {
                        c10 = 236;
                        break;
                    }
                    break;
                case 2867:
                    if (str.equals("ZM")) {
                        c10 = 237;
                        break;
                    }
                    break;
                case 2877:
                    if (str.equals("ZW")) {
                        c10 = 238;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 4:
                case 17:
                case 29:
                case '2':
                case '9':
                case 'q':
                case 't':
                case 202:
                case 225:
                    iArr = new int[]{1, 2, 0, 0, 2, 2};
                    break;
                case 1:
                    iArr = new int[]{1, 4, 2, 3, 4, 1};
                    break;
                case 2:
                case 204:
                    iArr = new int[]{4, 4, 3, 4, 2, 2};
                    break;
                case 3:
                case ')':
                    iArr = new int[]{2, 4, 3, 4, 2, 2};
                    break;
                case 5:
                    iArr = new int[]{1, 1, 1, 2, 2, 2};
                    break;
                case 6:
                case 165:
                    iArr = new int[]{2, 3, 2, 3, 2, 2};
                    break;
                case 7:
                    iArr = new int[]{3, 4, 4, 3, 2, 2};
                    break;
                case '\b':
                case '?':
                case 162:
                case 186:
                case 190:
                    iArr = new int[]{4, 2, 2, 2, 2, 2};
                    break;
                case '\t':
                    iArr = new int[]{2, 2, 2, 2, 1, 2};
                    break;
                case '\n':
                    iArr = new int[]{2, 2, 3, 3, 2, 2};
                    break;
                case 11:
                case '=':
                case ']':
                case 'f':
                case 127:
                case 145:
                case 188:
                    iArr = new int[]{0, 0, 0, 0, 0, 2};
                    break;
                case '\f':
                    iArr = new int[]{0, 3, 1, 1, 3, 0};
                    break;
                case '\r':
                    iArr = new int[]{2, 2, 3, 4, 2, 2};
                    break;
                case 14:
                case '3':
                case 'y':
                case 144:
                case 172:
                case 195:
                case 224:
                    iArr = new int[]{0, 2, 2, 2, 2, 2};
                    break;
                case 15:
                case '7':
                case 128:
                case 194:
                    iArr = new int[]{4, 2, 3, 3, 2, 2};
                    break;
                case 16:
                case 'j':
                case 214:
                    iArr = new int[]{1, 1, 1, 1, 2, 2};
                    break;
                case 18:
                    iArr = new int[]{2, 1, 3, 2, 4, 2};
                    break;
                case 19:
                    iArr = new int[]{0, 0, 1, 0, 1, 2};
                    break;
                case 20:
                case 187:
                case 203:
                case 206:
                    iArr = new int[]{4, 3, 4, 4, 2, 2};
                    break;
                case 21:
                case 175:
                case 191:
                    iArr = new int[]{0, 0, 0, 0, 1, 2};
                    break;
                case 22:
                    iArr = new int[]{1, 3, 1, 3, 4, 2};
                    break;
                case 23:
                case 'T':
                case '\\':
                case 154:
                case 226:
                case 234:
                    iArr = new int[]{4, 4, 4, 4, 2, 2};
                    break;
                case 24:
                    iArr = new int[]{4, 4, 2, 3, 2, 2};
                    break;
                case 25:
                case 141:
                case 177:
                    iArr = new int[]{1, 2, 2, 2, 2, 2};
                    break;
                case 26:
                    iArr = new int[]{0, 2, 0, 0, 2, 2};
                    break;
                case 27:
                    iArr = new int[]{3, 2, 0, 0, 2, 2};
                    break;
                case 28:
                    iArr = new int[]{1, 2, 4, 4, 2, 2};
                    break;
                case 30:
                    iArr = new int[]{1, 1, 1, 1, 2, 4};
                    break;
                case 31:
                    iArr = new int[]{3, 2, 1, 1, 2, 2};
                    break;
                case ' ':
                    iArr = new int[]{3, 1, 2, 2, 3, 2};
                    break;
                case '!':
                    iArr = new int[]{3, 2, 1, 0, 2, 2};
                    break;
                case '\"':
                    iArr = new int[]{1, 2, 3, 3, 2, 2};
                    break;
                case '#':
                case '*':
                    iArr = new int[]{2, 2, 2, 1, 2, 2};
                    break;
                case '$':
                case 219:
                    iArr = new int[]{0, 2, 1, 2, 3, 3};
                    break;
                case '%':
                case 137:
                    iArr = new int[]{3, 3, 2, 2, 2, 2};
                    break;
                case '&':
                    iArr = new int[]{4, 2, 4, 2, 2, 2};
                    break;
                case '\'':
                case '>':
                case 134:
                    iArr = new int[]{3, 4, 3, 3, 2, 2};
                    break;
                case '(':
                    iArr = new int[]{0, 1, 0, 0, 0, 2};
                    break;
                case '+':
                case 208:
                    iArr = new int[]{0, 1, 2, 2, 2, 2};
                    break;
                case ',':
                case 143:
                    iArr = new int[]{4, 3, 3, 4, 2, 2};
                    break;
                case '-':
                    iArr = new int[]{2, 0, 1, 1, 3, 1};
                    break;
                case '.':
                    iArr = new int[]{2, 3, 3, 2, 2, 2};
                    break;
                case '/':
                case 157:
                    iArr = new int[]{2, 4, 4, 4, 2, 2};
                    break;
                case '0':
                case 'o':
                case 161:
                case 210:
                    iArr = new int[]{4, 2, 4, 4, 2, 2};
                    break;
                case '1':
                    iArr = new int[]{2, 3, 0, 1, 2, 2};
                    break;
                case '4':
                    iArr = new int[]{1, 0, 1, 0, 0, 2};
                    break;
                case '5':
                    iArr = new int[]{0, 0, 2, 0, 1, 2};
                    break;
                case '6':
                    iArr = new int[]{0, 1, 4, 2, 2, 1};
                    break;
                case '8':
                    iArr = new int[]{0, 0, 2, 0, 0, 2};
                    break;
                case ':':
                case '{':
                    iArr = new int[]{3, 4, 4, 4, 2, 2};
                    break;
                case ';':
                case 209:
                    iArr = new int[]{3, 3, 4, 4, 2, 2};
                    break;
                case '<':
                    iArr = new int[]{1, 3, 2, 1, 2, 2};
                    break;
                case '@':
                    iArr = new int[]{0, 0, 0, 0, 1, 0};
                    break;
                case 'A':
                    iArr = new int[]{4, 3, 4, 4, 4, 2};
                    break;
                case 'B':
                    iArr = new int[]{0, 0, 0, 1, 0, 2};
                    break;
                case 'C':
                    iArr = new int[]{3, 2, 2, 3, 2, 2};
                    break;
                case 'D':
                case 155:
                case 192:
                    iArr = new int[]{3, 2, 2, 2, 2, 2};
                    break;
                case 'E':
                    iArr = new int[]{4, 2, 4, 0, 2, 2};
                    break;
                case 'F':
                    iArr = new int[]{0, 2, 2, 0, 2, 2};
                    break;
                case 'G':
                    iArr = new int[]{1, 1, 1, 1, 0, 2};
                    break;
                case 'H':
                    iArr = new int[]{3, 4, 0, 0, 2, 2};
                    break;
                case 'I':
                    iArr = new int[]{1, 1, 3, 2, 2, 2};
                    break;
                case 'J':
                    iArr = new int[]{2, 2, 0, 0, 2, 2};
                    break;
                case 'K':
                    iArr = new int[]{1, 1, 0, 2, 2, 2};
                    break;
                case 'L':
                    iArr = new int[]{3, 2, 3, 3, 2, 2};
                    break;
                case 'M':
                    iArr = new int[]{0, 2, 1, 1, 2, 2};
                    break;
                case 'N':
                    iArr = new int[]{3, 3, 3, 2, 2, 2};
                    break;
                case 'O':
                case 'a':
                case 'h':
                    iArr = new int[]{0, 2, 0, 1, 2, 2};
                    break;
                case 'P':
                case 130:
                    iArr = new int[]{1, 2, 2, 0, 2, 2};
                    break;
                case 'Q':
                case 199:
                    iArr = new int[]{4, 3, 2, 4, 2, 2};
                    break;
                case 'R':
                    iArr = new int[]{3, 4, 4, 2, 2, 2};
                    break;
                case 'S':
                    iArr = new int[]{2, 1, 1, 3, 2, 2};
                    break;
                case 'U':
                    iArr = new int[]{1, 0, 0, 0, 1, 2};
                    break;
                case 'V':
                    iArr = new int[]{2, 1, 2, 1, 2, 2};
                    break;
                case 'W':
                    iArr = new int[]{2, 2, 4, 3, 3, 2};
                    break;
                case 'X':
                    iArr = new int[]{4, 4, 1, 2, 2, 2};
                    break;
                case 'Y':
                    iArr = new int[]{3, 1, 1, 3, 2, 2};
                    break;
                case 'Z':
                    iArr = new int[]{0, 1, 0, 1, 1, 0};
                    break;
                case '[':
                case 's':
                    iArr = new int[]{1, 0, 0, 0, 0, 2};
                    break;
                case '^':
                    iArr = new int[]{3, 1, 3, 3, 2, 4};
                    break;
                case '_':
                    iArr = new int[]{1, 1, 1, 1, 1, 2};
                    break;
                case '`':
                    iArr = new int[]{1, 2, 2, 3, 4, 2};
                    break;
                case 'b':
                    iArr = new int[]{1, 1, 3, 2, 2, 3};
                    break;
                case 'c':
                    iArr = new int[]{3, 2, 2, 0, 2, 2};
                    break;
                case 'd':
                    iArr = new int[]{3, 2, 3, 2, 2, 2};
                    break;
                case 'e':
                    iArr = new int[]{4, 2, 3, 3, 4, 3};
                    break;
                case 'g':
                    iArr = new int[]{0, 1, 1, 2, 1, 2};
                    break;
                case 'i':
                    iArr = new int[]{2, 4, 3, 1, 2, 2};
                    break;
                case 'k':
                    iArr = new int[]{0, 3, 2, 3, 4, 2};
                    break;
                case 'l':
                    iArr = new int[]{3, 2, 1, 1, 1, 2};
                    break;
                case 'm':
                    iArr = new int[]{2, 1, 1, 2, 2, 2};
                    break;
                case 'n':
                    iArr = new int[]{1, 0, 4, 2, 2, 2};
                    break;
                case 'p':
                case 230:
                    iArr = new int[]{4, 3, 3, 2, 2, 2};
                    break;
                case 'r':
                    iArr = new int[]{0, 2, 2, 4, 4, 4};
                    break;
                case 'u':
                    iArr = new int[]{2, 1, 2, 2, 3, 2};
                    break;
                case 'v':
                    iArr = new int[]{1, 2, 1, 3, 2, 2};
                    break;
                case 'w':
                    iArr = new int[]{3, 1, 1, 2, 2, 2};
                    break;
                case 'x':
                    iArr = new int[]{2, 2, 1, 1, 2, 2};
                    break;
                case 'z':
                case 138:
                    iArr = new int[]{3, 2, 3, 3, 4, 2};
                    break;
                case '|':
                case 168:
                    iArr = new int[]{4, 3, 3, 3, 2, 2};
                    break;
                case '}':
                    iArr = new int[]{0, 1, 0, 1, 0, 2};
                    break;
                case '~':
                    iArr = new int[]{4, 0, 3, 2, 1, 3};
                    break;
                case 129:
                    iArr = new int[]{3, 3, 1, 1, 2, 2};
                    break;
                case 131:
                    iArr = new int[]{1, 0, 0, 0, 2, 2};
                    break;
                case 132:
                    iArr = new int[]{2, 0, 0, 1, 3, 2};
                    break;
                case 133:
                    iArr = new int[]{1, 2, 2, 3, 2, 2};
                    break;
                case 135:
                case 211:
                case 216:
                case 231:
                    iArr = new int[]{4, 2, 2, 4, 2, 2};
                    break;
                case 136:
                    iArr = new int[]{1, 0, 0, 1, 3, 2};
                    break;
                case 139:
                    iArr = new int[]{2, 0, 2, 2, 2, 2};
                    break;
                case 140:
                    iArr = new int[]{0, 2, 4, 4, 3, 1};
                    break;
                case 142:
                    iArr = new int[]{2, 1, 2, 3, 2, 2};
                    break;
                case 146:
                    iArr = new int[]{3, 1, 0, 2, 2, 2};
                    break;
                case 147:
                    iArr = new int[]{3, 2, 1, 3, 4, 2};
                    break;
                case 148:
                    iArr = new int[]{3, 2, 2, 1, 2, 2};
                    break;
                case 149:
                    iArr = new int[]{2, 4, 4, 4, 3, 2};
                    break;
                case 150:
                    iArr = new int[]{1, 0, 4, 1, 1, 0};
                    break;
                case 151:
                case 232:
                    iArr = new int[]{3, 1, 2, 2, 2, 2};
                    break;
                case 152:
                    iArr = new int[]{3, 4, 3, 2, 2, 2};
                    break;
                case 153:
                case 235:
                    iArr = new int[]{2, 3, 3, 4, 2, 2};
                    break;
                case 156:
                    iArr = new int[]{3, 4, 2, 1, 2, 2};
                    break;
                case 158:
                    iArr = new int[]{2, 1, 4, 3, 0, 4};
                    break;
                case 159:
                    iArr = new int[]{0, 0, 3, 0, 0, 2};
                    break;
                case 160:
                    iArr = new int[]{2, 2, 4, 3, 2, 2};
                    break;
                case 163:
                    iArr = new int[]{0, 0, 1, 2, 4, 2};
                    break;
                case 164:
                    iArr = new int[]{2, 3, 1, 2, 4, 2};
                    break;
                case 166:
                    iArr = new int[]{1, 2, 4, 4, 3, 2};
                    break;
                case 167:
                    iArr = new int[]{2, 2, 3, 1, 2, 2};
                    break;
                case 169:
                    iArr = new int[]{2, 1, 2, 3, 2, 1};
                    break;
                case 170:
                    iArr = new int[]{3, 3, 3, 3, 2, 2};
                    break;
                case 171:
                    iArr = new int[]{1, 0, 2, 2, 4, 4};
                    break;
                case 173:
                    iArr = new int[]{2, 0, 2, 1, 2, 0};
                    break;
                case 174:
                    iArr = new int[]{3, 4, 1, 3, 2, 2};
                    break;
                case 176:
                    iArr = new int[]{2, 2, 4, 1, 2, 2};
                    break;
                case 178:
                    iArr = new int[]{1, 4, 4, 4, 4, 2};
                    break;
                case 179:
                    iArr = new int[]{0, 3, 2, 3, 1, 2};
                    break;
                case 180:
                    iArr = new int[]{0, 0, 1, 1, 3, 2};
                    break;
                case 181:
                    iArr = new int[]{1, 0, 0, 1, 2, 2};
                    break;
                case 182:
                    iArr = new int[]{1, 0, 0, 1, 3, 3};
                    break;
                case 183:
                    iArr = new int[]{3, 3, 2, 0, 2, 2};
                    break;
                case 184:
                    iArr = new int[]{3, 1, 1, 2, 2, 0};
                    break;
                case 185:
                case 238:
                    iArr = new int[]{4, 2, 4, 3, 2, 2};
                    break;
                case 189:
                    iArr = new int[]{2, 3, 3, 3, 1, 1};
                    break;
                case 193:
                    iArr = new int[]{0, 1, 1, 1, 2, 2};
                    break;
                case 196:
                    iArr = new int[]{4, 4, 3, 2, 2, 2};
                    break;
                case 197:
                    iArr = new int[]{2, 2, 3, 4, 4, 2};
                    break;
                case 198:
                    iArr = new int[]{2, 4, 4, 1, 2, 2};
                    break;
                case 200:
                    iArr = new int[]{2, 2, 1, 2, 2, 2};
                    break;
                case 201:
                    iArr = new int[]{2, 3, 2, 1, 2, 2};
                    break;
                case 205:
                    iArr = new int[]{3, 2, 1, 2, 2, 2};
                    break;
                case 207:
                    iArr = new int[]{3, 4, 1, 0, 2, 2};
                    break;
                case 212:
                    iArr = new int[]{3, 1, 1, 1, 2, 2};
                    break;
                case 213:
                    iArr = new int[]{3, 2, 4, 3, 2, 2};
                    break;
                case 215:
                    iArr = new int[]{2, 4, 1, 0, 2, 2};
                    break;
                case 217:
                    iArr = new int[]{0, 0, 0, 0, 0, 0};
                    break;
                case 218:
                    iArr = new int[]{3, 4, 2, 1, 3, 2};
                    break;
                case 220:
                    iArr = new int[]{3, 3, 2, 3, 4, 2};
                    break;
                case 221:
                    iArr = new int[]{2, 2, 4, 1, 3, 1};
                    break;
                case 222:
                    iArr = new int[]{2, 1, 1, 2, 1, 2};
                    break;
                case 223:
                    iArr = new int[]{1, 2, 3, 4, 3, 2};
                    break;
                case 227:
                    iArr = new int[]{2, 2, 1, 1, 2, 4};
                    break;
                case 228:
                    iArr = new int[]{0, 2, 1, 2, 2, 2};
                    break;
                case 229:
                    iArr = new int[]{0, 0, 1, 2, 2, 2};
                    break;
                case 233:
                    iArr = new int[]{1, 2, 1, 1, 2, 2};
                    break;
                case 236:
                    iArr = new int[]{2, 4, 2, 1, 1, 2};
                    break;
                case 237:
                    iArr = new int[]{4, 4, 4, 3, 2, 2};
                    break;
                default:
                    iArr = new int[]{2, 2, 2, 2, 2, 2};
                    break;
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 7) {
                                if (i10 != 9) {
                                    if (i10 != 10) {
                                        longValue = 1000000;
                                    } else {
                                        longValue = ((Long) f49490t.get(iArr[4])).longValue();
                                    }
                                } else {
                                    longValue = ((Long) f49491u.get(iArr[5])).longValue();
                                }
                            }
                        } else {
                            longValue = ((Long) f49489s.get(iArr[3])).longValue();
                        }
                    } else {
                        longValue = ((Long) f49488r.get(iArr[2])).longValue();
                    }
                } else {
                    longValue = ((Long) f49487q.get(iArr[1])).longValue();
                }
                l4 = Long.valueOf(longValue);
            }
            longValue = ((Long) f49486p.get(iArr[0])).longValue();
            l4 = Long.valueOf(longValue);
        }
        if (l4 == null) {
            l4 = 1000000L;
        }
        return l4.longValue();
    }

    public final void c(int i10, long j3, long j10) {
        int i11;
        long j11;
        long j12;
        if (i10 != 0 || j3 != 0 || j10 != this.f49502m) {
            this.f49502m = j10;
            Iterator it = ((CopyOnWriteArrayList) this.f49494c.f14221b).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!bVar.f49479c) {
                    i11 = i10;
                    j11 = j3;
                    j12 = j10;
                    bVar.f49477a.post(new k2.i(bVar, i11, j11, j12, 1));
                } else {
                    i11 = i10;
                    j11 = j3;
                    j12 = j10;
                }
                i10 = i11;
                j3 = j11;
                j10 = j12;
            }
        }
    }

    public final synchronized void d(long j3, long j10) {
        try {
            this.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f49499j += (int) (elapsedRealtime - this.h);
            this.f49500k += j3;
            if (j10 > 0 && j3 > 0) {
                this.f49496f.a((((float) j3) * 8000.0f) / ((float) j10), (int) Math.sqrt(j3));
                if (this.f49499j < 2000) {
                    if (this.f49500k >= 524288) {
                    }
                    c((int) j10, j3, this.f49501l);
                    this.h = elapsedRealtime;
                    this.f49498i = 0L;
                }
                this.f49501l = this.f49496f.b();
                c((int) j10, j3, this.f49501l);
                this.h = elapsedRealtime;
                this.f49498i = 0L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e(g2.m r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: y2.f.e(g2.m, boolean):void");
    }

    public final synchronized void f(g2.m r2, boolean r3) {
        throw new UnsupportedOperationException("Method not decompiled: y2.f.f(g2.m, boolean):void");
    }
}
