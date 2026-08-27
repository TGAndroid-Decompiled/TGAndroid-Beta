package p4;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.upstream.s0;
import d5.g0;
import h3.t0;
import h3.t1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o4.t;
import o4.u;
import p8.z;

public final class p implements s0 {

    public final m f45462a;

    public final j f45463b;

    public static final Pattern f45437c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"(.+?)\"");

    public static final Pattern f45440e = Pattern.compile("AUDIO=\"(.+?)\"");

    public static final Pattern f45442f = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern h = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    public static final Pattern f45450n = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    public static final Pattern f45455r = Pattern.compile("CHANNELS=\"(.+?)\"");

    public static final Pattern f45457s = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern v = Pattern.compile("MIME=\"(.+?)\"");

    public static final Pattern f45459w = Pattern.compile("CACHED=\"(.+?)\"");

    public static final Pattern f45460x = Pattern.compile("DOCID=\"(.+?)\"");

    public static final Pattern f45461y = Pattern.compile("DOCFILENAME=\"(.+?)\"");
    public static final Pattern A = Pattern.compile("ACCOUNT=\"(.+?)\"");
    public static final Pattern B = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern C = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern D = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern E = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern F = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern H = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern I = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern J = a("CAN-SKIP-DATERANGES");
    public static final Pattern K = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern L = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern M = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern N = a("CAN-BLOCK-RELOAD");
    public static final Pattern O = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern P = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern Q = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern R = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern S = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern T = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern U = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern V = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern W = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern X = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern Y = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern Z = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    public static final Pattern f45435a0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    public static final Pattern f45436b0 = Pattern.compile("URI=\"(.+?)\"");

    public static final Pattern f45438c0 = Pattern.compile("IV=([^,.*]+)");

    public static final Pattern f45439d0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    public static final Pattern f45441e0 = Pattern.compile("TYPE=(PART|MAP)");

    public static final Pattern f45443f0 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    public static final Pattern f45444g0 = Pattern.compile("NAME=\"(.+?)\"");

    public static final Pattern f45445h0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    public static final Pattern f45446i0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    public static final Pattern f45447j0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    public static final Pattern f45448k0 = a("AUTOSELECT");

    public static final Pattern f45449l0 = a("DEFAULT");
    public static final Pattern m0 = a("FORCED");

    public static final Pattern f45451n0 = a("INDEPENDENT");

    public static final Pattern f45452o0 = a("GAP");

    public static final Pattern f45453p0 = a("PRECISE");

    public static final Pattern f45454q0 = Pattern.compile("VALUE=\"(.+?)\"");

    public static final Pattern f45456r0 = Pattern.compile("IMPORT=\"(.+?)\"");

    public static final Pattern f45458s0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public p(m mVar, j jVar) {
        this.f45462a = mVar;
        this.f45463b = jVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static l3.d b(String str, l3.c[] cVarArr) {
        l3.c[] cVarArr2 = new l3.c[cVarArr.length];
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            l3.c cVar = cVarArr[i10];
            cVarArr2[i10] = new l3.c(cVar.f15387b, cVar.f15388c, cVar.d, null);
        }
        return new l3.d(str, true, cVarArr2);
    }

    public static l3.c c(String str, String str2, HashMap map) throws t1 {
        String strJ = j(str, f45435a0, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f45436b0;
        if (zEquals) {
            String strK = k(str, pattern, map);
            return new l3.c(h3.h.d, null, "video/mp4", Base64.decode(strK.substring(strK.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = h3.h.d;
            int i10 = g0.f4795a;
            return new l3.c(uuid, null, "hls", str.getBytes(o8.d.f19363c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strJ)) {
            return null;
        }
        String strK2 = k(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strK2.substring(strK2.indexOf(44)), 0);
        UUID uuid2 = h3.h.f7869e;
        return new l3.c(uuid2, null, "video/mp4", u3.j.a(uuid2, null, bArrDecode));
    }

    public static j d(m mVar, j jVar, j9.a aVar, String str) throws t1, o {
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i10;
        l3.d dVar;
        long j10;
        l3.d dVar2;
        g gVar;
        l3.d dVar3;
        String str3;
        l3.d dVarB;
        g gVar2;
        long j11;
        long j12;
        int i11;
        m mVar2 = mVar;
        jVar = jVar;
        boolean z10 = mVar2.f45434c;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        i iVar = new i(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z11 = z10;
        String strJ = "";
        long j13 = -9223372036854775807L;
        long j14 = 0;
        long jH = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long jLongValue = 0;
        long j18 = 0;
        long j19 = -1;
        boolean zG = false;
        e eVar = null;
        int i12 = 0;
        l3.d dVar4 = null;
        g gVar3 = null;
        l3.d dVar5 = null;
        int i13 = 0;
        String strK = null;
        String strJ2 = null;
        boolean z12 = false;
        char c10 = 0;
        boolean z13 = false;
        int i14 = 0;
        String str4 = null;
        boolean z14 = false;
        boolean z15 = false;
        long j20 = -9223372036854775807L;
        long j21 = -9223372036854775807L;
        long j22 = 0;
        int i15 = 1;
        while (aVar.D()) {
            String strF = aVar.F();
            if (strF.startsWith("#EXT")) {
                arrayList7.add(strF);
            }
            if (strF.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strK2 = k(strF, H, map);
                if ("VOD".equals(strK2)) {
                    i12 = 1;
                } else if ("EVENT".equals(strK2)) {
                    i12 = 2;
                }
            } else if (strF.equals("#EXT-X-I-FRAMES-ONLY")) {
                z14 = true;
            } else {
                if (strF.startsWith("#EXT-X-START")) {
                    double d10 = Double.parseDouble(k(strF, T, Collections.EMPTY_MAP));
                    arrayList = arrayList7;
                    iVar = iVar;
                    zG = g(strF, f45453p0);
                    j13 = (long) (d10 * 1000000.0d);
                } else {
                    arrayList = arrayList7;
                    iVar = iVar;
                    if (strF.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double dH = h(strF, I);
                        long j23 = dH == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH * 1000000.0d);
                        boolean zG2 = g(strF, J);
                        double dH2 = h(strF, L);
                        long j24 = dH2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH2 * 1000000.0d);
                        double dH3 = h(strF, M);
                        iVar = new i(j23, zG2, j24, dH3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dH3 * 1000000.0d), g(strF, N));
                    } else if (strF.startsWith("#EXT-X-PART-INF")) {
                        j21 = (long) (Double.parseDouble(k(strF, F, Collections.EMPTY_MAP)) * 1000000.0d);
                    } else {
                        boolean zStartsWith = strF.startsWith("#EXT-X-MAP");
                        Pattern pattern = V;
                        zG = zG;
                        Pattern pattern2 = f45436b0;
                        if (zStartsWith) {
                            String strK3 = k(strF, pattern2, map);
                            String strJ3 = j(strF, pattern, null, map);
                            if (strJ3 != null) {
                                int i16 = g0.f4795a;
                                String[] strArrSplit = strJ3.split("@", -1);
                                j19 = Long.parseLong(strArrSplit[c10]);
                                if (strArrSplit.length > 1) {
                                    j16 = Long.parseLong(strArrSplit[1]);
                                }
                            }
                            long j25 = j19;
                            if (j25 == -1) {
                                j16 = 0;
                            }
                            if (strK != null && strJ2 == null) {
                                throw t1.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            String str5 = strK;
                            g gVar4 = new g(strK3, j16, j25, str5, strJ2);
                            strK = str5;
                            String str6 = strJ2;
                            if (j25 != -1) {
                                j16 += j25;
                            }
                            arrayList7 = arrayList;
                            gVar3 = gVar4;
                            j19 = -1;
                            iVar = iVar;
                            zG = zG;
                            strJ2 = str6;
                        } else {
                            arrayList7 = arrayList;
                            strJ2 = strJ2;
                            ArrayList arrayList8 = arrayList5;
                            ArrayList arrayList9 = arrayList6;
                            if (strF.startsWith("#EXT-X-TARGETDURATION")) {
                                j20 = ((long) Integer.parseInt(k(strF, D, Collections.EMPTY_MAP))) * 1000000;
                            } else if (strF.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j15 = Long.parseLong(k(strF, O, Collections.EMPTY_MAP));
                                j22 = j15;
                            } else if (strF.startsWith("#EXT-X-VERSION")) {
                                i15 = Integer.parseInt(k(strF, G, Collections.EMPTY_MAP));
                            } else {
                                if (strF.startsWith("#EXT-X-DEFINE")) {
                                    String strJ4 = j(strF, f45456r0, null, map);
                                    if (strJ4 != null) {
                                        String str7 = (String) mVar2.f45430l.get(strJ4);
                                        if (str7 != null) {
                                            map.put(strJ4, str7);
                                        }
                                    } else {
                                        map.put(k(strF, f45444g0, map), k(strF, f45454q0, map));
                                    }
                                    str2 = str4;
                                } else if (strF.startsWith("#EXTINF")) {
                                    jLongValue = new BigDecimal(k(strF, P, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                    strJ = j(strF, Q, "", map);
                                } else if (strF.startsWith("#EXT-X-SKIP")) {
                                    int i17 = Integer.parseInt(k(strF, K, Collections.EMPTY_MAP));
                                    d5.a.i(jVar != null && arrayList4.isEmpty());
                                    int i18 = g0.f4795a;
                                    long j26 = jVar.f45404k;
                                    z zVar = jVar.f45411r;
                                    int i19 = (int) (j22 - j26);
                                    int i20 = i17 + i19;
                                    if (i19 < 0 || i20 > zVar.size()) {
                                        throw new o();
                                    }
                                    long j27 = j17;
                                    strJ2 = strJ2;
                                    while (i19 < i20) {
                                        g gVar5 = (g) zVar.get(i19);
                                        if (j22 != jVar.f45404k) {
                                            int i21 = (jVar.f45403j - i14) + gVar5.d;
                                            z zVar2 = gVar5.f45386x;
                                            ArrayList arrayList10 = new ArrayList();
                                            long j28 = j27;
                                            int i22 = 0;
                                            while (i22 < zVar2.size()) {
                                                e eVar2 = (e) zVar2.get(i22);
                                                arrayList10.add(new e(eVar2.f45387a, eVar2.f45388b, eVar2.f45389c, i21, j28, eVar2.f45391f, eVar2.h, eVar2.f45392n, eVar2.f45393r, eVar2.f45394s, eVar2.v, eVar2.f45380w, eVar2.f45381x));
                                                j28 += eVar2.f45389c;
                                                i22++;
                                                i20 = i20;
                                            }
                                            i11 = i20;
                                            gVar5 = new g(gVar5.f45387a, gVar5.f45388b, gVar5.f45385w, gVar5.f45389c, i21, j27, gVar5.f45391f, gVar5.h, gVar5.f45392n, gVar5.f45393r, gVar5.f45394s, gVar5.v, arrayList10);
                                        } else {
                                            i11 = i20;
                                        }
                                        arrayList4.add(gVar5);
                                        long j29 = gVar5.f45389c;
                                        String str8 = gVar5.f45392n;
                                        j27 += j29;
                                        long j30 = gVar5.f45394s;
                                        if (j30 != -1) {
                                            j16 = gVar5.f45393r + j30;
                                        }
                                        int i23 = gVar5.d;
                                        g gVar6 = gVar5.f45388b;
                                        l3.d dVar6 = gVar5.f45391f;
                                        String str9 = gVar5.h;
                                        if (str8 == null || !str8.equals(Long.toHexString(j15))) {
                                            strJ2 = str8;
                                        }
                                        j15++;
                                        i19++;
                                        i13 = i23;
                                        gVar3 = gVar6;
                                        strK = str9;
                                        dVar4 = dVar6;
                                        i20 = i11;
                                        j14 = j27;
                                        jVar = jVar;
                                    }
                                    mVar2 = mVar;
                                    jVar = jVar;
                                    iVar = iVar;
                                    zG = zG;
                                    arrayList7 = arrayList7;
                                    arrayList6 = arrayList9;
                                    arrayList5 = arrayList8;
                                    j17 = j27;
                                } else if (strF.startsWith("#EXT-X-KEY")) {
                                    String strK4 = k(strF, Y, map);
                                    String strJ5 = j(strF, Z, "identity", map);
                                    if ("NONE".equals(strK4)) {
                                        treeMap.clear();
                                        dVar4 = null;
                                        strK = null;
                                        strJ2 = null;
                                    } else {
                                        strJ2 = j(strF, f45438c0, null, map);
                                        if (!"identity".equals(strJ5)) {
                                            String str10 = str4;
                                            str4 = str10 == null ? ("SAMPLE-AES-CENC".equals(strK4) || "SAMPLE-AES-CTR".equals(strK4)) ? "cenc" : "cbcs" : str10;
                                            l3.c cVarC = c(strF, strJ5, map);
                                            if (cVarC != null) {
                                                treeMap.put(strJ5, cVarC);
                                                dVar4 = null;
                                            }
                                            strK = null;
                                        } else if ("AES-128".equals(strK4)) {
                                            strK = k(strF, pattern2, map);
                                            strJ2 = strJ2;
                                        }
                                        strK = null;
                                    }
                                    mVar2 = mVar;
                                    jVar = jVar;
                                    arrayList7 = arrayList7;
                                    arrayList6 = arrayList9;
                                    arrayList5 = arrayList8;
                                } else {
                                    str2 = str4;
                                    if (strF.startsWith("#EXT-X-BYTERANGE")) {
                                        String strK5 = k(strF, U, map);
                                        int i24 = g0.f4795a;
                                        String[] strArrSplit2 = strK5.split("@", -1);
                                        j19 = Long.parseLong(strArrSplit2[c10]);
                                        if (strArrSplit2.length > 1) {
                                            j16 = Long.parseLong(strArrSplit2[1]);
                                        }
                                    } else if (strF.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i14 = Integer.parseInt(strF.substring(strF.indexOf(58) + 1));
                                        mVar2 = mVar;
                                        jVar = jVar;
                                        str4 = str2;
                                        iVar = iVar;
                                        zG = zG;
                                        strJ2 = strJ2;
                                        arrayList7 = arrayList7;
                                        arrayList6 = arrayList9;
                                        arrayList5 = arrayList8;
                                        z13 = true;
                                    } else if (strF.equals("#EXT-X-DISCONTINUITY")) {
                                        i13++;
                                    } else if (strF.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                        if (jH == 0) {
                                            jH = g0.H(g0.K(strF.substring(strF.indexOf(58) + 1))) - j17;
                                        }
                                    } else if (strF.equals("#EXT-X-GAP")) {
                                        mVar2 = mVar;
                                        jVar = jVar;
                                        str4 = str2;
                                        iVar = iVar;
                                        zG = zG;
                                        strJ2 = strJ2;
                                        arrayList7 = arrayList7;
                                        arrayList6 = arrayList9;
                                        arrayList5 = arrayList8;
                                        z15 = true;
                                    } else if (strF.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                        mVar2 = mVar;
                                        jVar = jVar;
                                        str4 = str2;
                                        iVar = iVar;
                                        zG = zG;
                                        strJ2 = strJ2;
                                        arrayList7 = arrayList7;
                                        arrayList6 = arrayList9;
                                        arrayList5 = arrayList8;
                                        z11 = true;
                                    } else if (strF.equals("#EXT-X-ENDLIST")) {
                                        mVar2 = mVar;
                                        jVar = jVar;
                                        str4 = str2;
                                        iVar = iVar;
                                        zG = zG;
                                        strJ2 = strJ2;
                                        arrayList7 = arrayList7;
                                        arrayList6 = arrayList9;
                                        arrayList5 = arrayList8;
                                        z12 = true;
                                    } else {
                                        if (strF.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            long jI = i(strF, R);
                                            Matcher matcher = S.matcher(strF);
                                            if (matcher.find()) {
                                                String strGroup = matcher.group(1);
                                                strGroup.getClass();
                                                i10 = Integer.parseInt(strGroup);
                                            } else {
                                                i10 = -1;
                                            }
                                            f fVar = new f(Uri.parse(d5.a.G(str, k(strF, pattern2, map))), jI, i10);
                                            arrayList2 = arrayList9;
                                            arrayList2.add(fVar);
                                        } else {
                                            arrayList2 = arrayList9;
                                            if (!strF.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                l3.d dVarB2 = dVar5;
                                                g gVar7 = gVar3;
                                                if (strF.startsWith("#EXT-X-PART")) {
                                                    String hexString = strK == null ? null : strJ2 != null ? strJ2 : Long.toHexString(j15);
                                                    String strK6 = k(strF, pattern2, map);
                                                    long j31 = (long) (Double.parseDouble(k(strF, E, Collections.EMPTY_MAP)) * 1000000.0d);
                                                    boolean zG3 = g(strF, f45451n0) | (z11 && arrayList8.isEmpty());
                                                    boolean zG4 = g(strF, f45452o0);
                                                    String strJ6 = j(strF, pattern, null, map);
                                                    if (strJ6 != null) {
                                                        int i25 = g0.f4795a;
                                                        String[] strArrSplit3 = strJ6.split("@", -1);
                                                        long j32 = Long.parseLong(strArrSplit3[0]);
                                                        if (strArrSplit3.length > 1) {
                                                            j18 = Long.parseLong(strArrSplit3[1]);
                                                        }
                                                        j10 = j32;
                                                    } else {
                                                        j10 = -1;
                                                    }
                                                    long j33 = j10 == -1 ? 0L : j18;
                                                    if (dVar4 != null || treeMap.isEmpty()) {
                                                        dVar2 = dVar4;
                                                    } else {
                                                        l3.c[] cVarArr = (l3.c[]) treeMap.values().toArray(new l3.c[0]);
                                                        l3.d dVar7 = new l3.d(str2, true, cVarArr);
                                                        if (dVarB2 == null) {
                                                            dVarB2 = b(str2, cVarArr);
                                                        }
                                                        dVar2 = dVar7;
                                                    }
                                                    long j34 = j14;
                                                    arrayList8.add(new e(strK6, gVar7, j31, i13, j34, dVar2, strK, hexString, j33, j10, zG4, zG3, false));
                                                    j14 = j34 + j31;
                                                    if (j10 != -1) {
                                                        j33 += j10;
                                                    }
                                                    j18 = j33;
                                                    dVar5 = dVarB2;
                                                    gVar3 = gVar7;
                                                    arrayList5 = arrayList8;
                                                    str4 = str2;
                                                    dVar4 = dVar2;
                                                    c10 = 0;
                                                    arrayList6 = arrayList2;
                                                    mVar2 = mVar;
                                                } else {
                                                    gVar3 = gVar7;
                                                    j14 = j14;
                                                    arrayList3 = arrayList8;
                                                    if (strF.startsWith("#")) {
                                                        dVar5 = dVarB2;
                                                        strK = strK;
                                                        j19 = j19;
                                                        z15 = z15;
                                                        strJ = strJ;
                                                        gVar3 = gVar3;
                                                        arrayList5 = arrayList3;
                                                        str4 = str2;
                                                        strJ = strJ;
                                                        j14 = j14;
                                                        strK = strK;
                                                        j19 = j19;
                                                        z15 = z15;
                                                        c10 = 0;
                                                        arrayList6 = arrayList2;
                                                        mVar2 = mVar;
                                                    } else {
                                                        String hexString2 = strK == null ? null : strJ2 != null ? strJ2 : Long.toHexString(j15);
                                                        long j35 = j15 + 1;
                                                        String strL = l(strF, map);
                                                        g gVar8 = (g) map2.get(strL);
                                                        if (j19 == -1) {
                                                            gVar = gVar8;
                                                            j16 = 0;
                                                        } else {
                                                            if (z14 && gVar3 == null && gVar8 == null) {
                                                                gVar8 = new g(strL, 0L, j16, null, null);
                                                                map2.put(strL, gVar8);
                                                            }
                                                            gVar = gVar8;
                                                        }
                                                        if (dVar4 != null || treeMap.isEmpty()) {
                                                            dVar3 = dVarB2;
                                                            str3 = strL;
                                                        } else {
                                                            dVar3 = dVarB2;
                                                            str3 = strL;
                                                            l3.c[] cVarArr2 = (l3.c[]) treeMap.values().toArray(new l3.c[0]);
                                                            l3.d dVar8 = new l3.d(str2, true, cVarArr2);
                                                            if (dVar3 == null) {
                                                                dVarB = b(str2, cVarArr2);
                                                                dVar4 = dVar8;
                                                            } else {
                                                                dVar4 = dVar8;
                                                            }
                                                            if (gVar3 != null) {
                                                                gVar2 = gVar3;
                                                            } else {
                                                                gVar2 = gVar;
                                                            }
                                                            int i26 = i13;
                                                            String str11 = strK;
                                                            j11 = j19;
                                                            j12 = j16;
                                                            long j36 = j17;
                                                            long j37 = jLongValue;
                                                            l3.d dVar9 = dVar4;
                                                            i13 = i26;
                                                            arrayList4.add(new g(str3, gVar2, strJ, j37, i26, j36, dVar9, str11, hexString2, j12, j11, z15, arrayList3));
                                                            j14 = j36 + j37;
                                                            ArrayList arrayList11 = new ArrayList();
                                                            if (j19 != -1) {
                                                                j16 = j12 + j11;
                                                            } else {
                                                                j16 = j12;
                                                            }
                                                            arrayList6 = arrayList2;
                                                            dVar5 = dVarB;
                                                            gVar3 = gVar3;
                                                            j15 = j35;
                                                            str4 = str2;
                                                            strJ = "";
                                                            j17 = j14;
                                                            dVar4 = dVar9;
                                                            strK = str11;
                                                            jLongValue = 0;
                                                            j19 = -1;
                                                            iVar = iVar;
                                                            strJ2 = strJ2;
                                                            arrayList7 = arrayList7;
                                                            c10 = 0;
                                                            z15 = false;
                                                            mVar2 = mVar;
                                                            jVar = jVar;
                                                            arrayList5 = arrayList11;
                                                            zG = zG;
                                                        }
                                                        dVarB = dVar3;
                                                        if (gVar3 != null) {
                                                            gVar2 = gVar3;
                                                        } else {
                                                            gVar2 = gVar;
                                                        }
                                                        int i27 = i13;
                                                        String str12 = strK;
                                                        j11 = j19;
                                                        j12 = j16;
                                                        long j38 = j17;
                                                        long j39 = jLongValue;
                                                        l3.d dVar10 = dVar4;
                                                        i13 = i27;
                                                        arrayList4.add(new g(str3, gVar2, strJ, j39, i27, j38, dVar10, str12, hexString2, j12, j11, z15, arrayList3));
                                                        j14 = j38 + j39;
                                                        ArrayList arrayList12 = new ArrayList();
                                                        if (j19 != -1) {
                                                            j16 = j12 + j11;
                                                        } else {
                                                            j16 = j12;
                                                        }
                                                        arrayList6 = arrayList2;
                                                        dVar5 = dVarB;
                                                        gVar3 = gVar3;
                                                        j15 = j35;
                                                        str4 = str2;
                                                        strJ = "";
                                                        j17 = j14;
                                                        dVar4 = dVar10;
                                                        strK = str12;
                                                        jLongValue = 0;
                                                        j19 = -1;
                                                        iVar = iVar;
                                                        strJ2 = strJ2;
                                                        arrayList7 = arrayList7;
                                                        c10 = 0;
                                                        z15 = false;
                                                        mVar2 = mVar;
                                                        jVar = jVar;
                                                        arrayList5 = arrayList12;
                                                        zG = zG;
                                                    }
                                                }
                                            } else if (eVar == null && "PART".equals(k(strF, f45441e0, map))) {
                                                l3.d dVarB3 = dVar5;
                                                g gVar9 = gVar3;
                                                String strK7 = k(strF, pattern2, map);
                                                long jI2 = i(strF, W);
                                                long jI3 = i(strF, X);
                                                String hexString3 = strK == null ? null : strJ2 != null ? strJ2 : Long.toHexString(j15);
                                                if (dVar4 != null || treeMap.isEmpty()) {
                                                    dVar = dVar4;
                                                } else {
                                                    l3.c[] cVarArr3 = (l3.c[]) treeMap.values().toArray(new l3.c[0]);
                                                    l3.d dVar11 = new l3.d(str2, true, cVarArr3);
                                                    if (dVarB3 == null) {
                                                        dVarB3 = b(str2, cVarArr3);
                                                    }
                                                    dVar = dVar11;
                                                }
                                                if (jI2 == -1 || jI3 != -1) {
                                                    long j40 = j14;
                                                    j14 = j40;
                                                    eVar = new e(strK7, gVar9, 0L, i13, j40, dVar, strK, hexString3, jI2 != -1 ? jI2 : 0L, jI3, false, false, true);
                                                }
                                                arrayList6 = arrayList2;
                                                str4 = str2;
                                                gVar3 = gVar9;
                                                dVar4 = dVar;
                                                iVar = iVar;
                                                zG = zG;
                                                strJ2 = strJ2;
                                                arrayList7 = arrayList7;
                                                arrayList5 = arrayList8;
                                                c10 = 0;
                                                mVar2 = mVar;
                                                dVar5 = dVarB3;
                                                jVar = jVar;
                                            }
                                        }
                                        gVar3 = gVar3;
                                        j14 = j14;
                                        strK = strK;
                                        j19 = j19;
                                        arrayList3 = arrayList8;
                                        gVar3 = gVar3;
                                        arrayList5 = arrayList3;
                                        str4 = str2;
                                        strJ = strJ;
                                        j14 = j14;
                                        strK = strK;
                                        j19 = j19;
                                        z15 = z15;
                                        c10 = 0;
                                        arrayList6 = arrayList2;
                                        mVar2 = mVar;
                                    }
                                    mVar2 = mVar;
                                    jVar = jVar;
                                    str4 = str2;
                                }
                                arrayList2 = arrayList9;
                                arrayList3 = arrayList8;
                                gVar3 = gVar3;
                                arrayList5 = arrayList3;
                                str4 = str2;
                                strJ = strJ;
                                j14 = j14;
                                strK = strK;
                                j19 = j19;
                                z15 = z15;
                                c10 = 0;
                                arrayList6 = arrayList2;
                                mVar2 = mVar;
                            }
                            strJ2 = strJ2;
                            arrayList7 = arrayList7;
                            arrayList6 = arrayList9;
                            arrayList5 = arrayList8;
                        }
                    }
                }
                arrayList7 = arrayList;
                iVar = iVar;
            }
        }
        boolean z16 = zG;
        ArrayList arrayList13 = arrayList6;
        ArrayList arrayList14 = arrayList7;
        i iVar2 = iVar;
        ArrayList arrayList15 = arrayList5;
        HashMap map3 = new HashMap();
        for (int i28 = 0; i28 < arrayList13.size(); i28++) {
            f fVar2 = (f) arrayList13.get(i28);
            long size = fVar2.f45383b;
            if (size == -1) {
                size = (j22 + ((long) arrayList4.size())) - (arrayList15.isEmpty() ? 1L : 0L);
            }
            int size2 = fVar2.f45384c;
            if (size2 == -1 && j21 != -9223372036854775807L) {
                size2 = (arrayList15.isEmpty() ? ((g) p8.l.g(arrayList4)).f45386x : arrayList15).size() - 1;
            }
            Uri uri = fVar2.f45382a;
            map3.put(uri, new f(uri, size, size2));
        }
        if (eVar != null) {
            arrayList15.add(eVar);
        }
        return new j(i12, str, arrayList14, j13, z16, jH, z13, i14, j22, i15, j20, j21, z11, z12, jH != 0, dVar5, arrayList4, arrayList15, iVar2, map3);
    }

    public static m f(j9.a aVar, String str) throws IOException {
        ?? r14;
        int i10;
        int i11;
        ArrayList arrayList;
        l lVar;
        String strC;
        int i12;
        String str2;
        l lVar2;
        String strC2;
        l lVar3;
        int i13;
        HashMap map;
        int i14;
        int i15;
        String strJ;
        float f10;
        Uri uriH;
        Uri uri;
        ArrayList arrayList2;
        HashMap map2;
        ArrayList arrayList3;
        String str3 = str;
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            boolean zD = aVar.D();
            Pattern pattern = f45436b0;
            ArrayList arrayList12 = arrayList8;
            Pattern pattern2 = f45444g0;
            z10 = z10;
            if (!zD) {
                ArrayList arrayList13 = arrayList9;
                ArrayList arrayList14 = arrayList5;
                ArrayList arrayList15 = arrayList6;
                ArrayList arrayList16 = arrayList7;
                ArrayList arrayList17 = arrayList11;
                ArrayList arrayList18 = arrayList10;
                boolean z12 = z11;
                HashMap map5 = map3;
                ArrayList arrayList19 = arrayList4;
                ArrayList arrayList20 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i16 = 0; i16 < arrayList19.size(); i16++) {
                    l lVar4 = (l) arrayList19.get(i16);
                    Uri uri2 = lVar4.f45418a;
                    t0 t0Var = lVar4.f45419b;
                    if (hashSet.add(uri2)) {
                        d5.a.i(t0Var.f8191s == null);
                        ArrayList arrayList21 = (ArrayList) map5.get(lVar4.f45418a);
                        arrayList21.getClass();
                        z3.c cVar = new z3.c(new u(null, null, arrayList21));
                        h3.s0 s0VarA = t0Var.a();
                        s0VarA.f8129i = cVar;
                        arrayList20.add(new l(lVar4.f45418a, new t0(s0VarA), lVar4.f45420c, lVar4.d, lVar4.f45421e, lVar4.f45422f));
                    }
                }
                int i17 = 0;
                t0 t0Var2 = null;
                List arrayList22 = null;
                while (i17 < arrayList13.size()) {
                    ArrayList arrayList23 = arrayList13;
                    String str4 = (String) arrayList23.get(i17);
                    String strK = k(str4, f45445h0, map4);
                    String strK2 = k(str4, pattern2, map4);
                    h3.s0 s0Var = new h3.s0();
                    s0Var.f8123a = a9.p.w(strK, ":", strK2);
                    s0Var.f8124b = strK2;
                    s0Var.f8134n = "application/x-mpegURL";
                    boolean zG = g(str4, f45449l0);
                    ArrayList arrayList24 = arrayList20;
                    if (g(str4, m0)) {
                        r14 = zG;
                        r14 = (zG ? 1 : 0) | 2;
                    }
                    r14 = zG;
                    int i18 = r14;
                    if (g(str4, f45448k0)) {
                        i18 = (r14 == true ? 1 : 0) | 4;
                    }
                    s0Var.d = i18;
                    String strJ2 = j(str4, f45446i0, null, map4);
                    if (TextUtils.isEmpty(strJ2)) {
                        i10 = i17;
                        i11 = 0;
                    } else {
                        int i19 = g0.f4795a;
                        i10 = i17;
                        String[] strArrSplit = strJ2.split(",", -1);
                        i11 = g0.j(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
                        if (g0.j(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
                            i11 |= 4096;
                        }
                        if (g0.j(strArrSplit, "public.accessibility.describes-music-and-sound")) {
                            i11 |= 1024;
                        }
                        if (g0.j(strArrSplit, "public.easy-to-read")) {
                            i11 |= 8192;
                        }
                    }
                    s0Var.f8126e = i11;
                    s0Var.f8125c = j(str4, f45443f0, null, map4);
                    String strJ3 = j(str4, pattern, null, map4);
                    Uri uriH2 = strJ3 == null ? null : d5.a.H(str3, strJ3);
                    arrayList13 = arrayList23;
                    z3.c cVar2 = new z3.c(new u(strK, strK2, Collections.EMPTY_LIST));
                    switch (k(str4, f45439d0, map4)) {
                        case "SUBTITLES":
                            arrayList = arrayList15;
                            int i20 = 0;
                            while (true) {
                                if (i20 < arrayList19.size()) {
                                    lVar = (l) arrayList19.get(i20);
                                    if (!strK.equals(lVar.f45421e)) {
                                        i20++;
                                    }
                                } else {
                                    lVar = null;
                                }
                            }
                            if (lVar != null) {
                                String strO = g0.o(3, lVar.f45419b.f8190r);
                                s0Var.h = strO;
                                strC = d5.q.c(strO);
                            } else {
                                strC = null;
                            }
                            if (strC == null) {
                                strC = "text/vtt";
                            }
                            s0Var.f8135o = strC;
                            s0Var.f8129i = cVar2;
                            if (uriH2 != null) {
                                arrayList16 = arrayList16;
                                arrayList16.add(new k(uriH2, new t0(s0Var), strK2));
                                break;
                            } else {
                                arrayList16 = arrayList16;
                                d5.a.K("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList = arrayList15;
                            String strK3 = k(str4, f45447j0, map4);
                            if (strK3.startsWith("CC")) {
                                i12 = Integer.parseInt(strK3.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i12 = Integer.parseInt(strK3.substring(7));
                                str2 = "application/cea-708";
                            }
                            if (arrayList22 == null) {
                                arrayList22 = new ArrayList();
                            }
                            s0Var.f8135o = str2;
                            s0Var.G = i12;
                            arrayList22.add(new t0(s0Var));
                            break;
                        case "AUDIO":
                            ArrayList arrayList25 = arrayList14;
                            int i21 = 0;
                            while (true) {
                                if (i21 < arrayList19.size()) {
                                    lVar2 = (l) arrayList19.get(i21);
                                    int i22 = i21;
                                    if (!strK.equals(lVar2.d)) {
                                        i21 = i22 + 1;
                                    }
                                } else {
                                    lVar2 = null;
                                }
                            }
                            if (lVar2 != null) {
                                String strO2 = g0.o(1, lVar2.f45419b.f8190r);
                                s0Var.h = strO2;
                                strC2 = d5.q.c(strO2);
                            } else {
                                strC2 = null;
                            }
                            arrayList14 = arrayList25;
                            String strJ4 = j(str4, f45455r, null, map4);
                            if (strJ4 != null) {
                                int i23 = g0.f4795a;
                                s0Var.B = Integer.parseInt(strJ4.split("/", 2)[0]);
                                if ("audio/eac3".equals(strC2) && strJ4.endsWith("/JOC")) {
                                    s0Var.h = "ec+3";
                                    strC2 = "audio/eac3-joc";
                                }
                            }
                            s0Var.f8135o = strC2;
                            if (uriH2 != null) {
                                s0Var.f8129i = cVar2;
                                arrayList = arrayList15;
                                arrayList.add(new k(uriH2, new t0(s0Var), strK2));
                            } else {
                                arrayList = arrayList15;
                                if (lVar2 != null) {
                                    t0Var2 = new t0(s0Var);
                                }
                            }
                            break;
                        case "VIDEO":
                            int i24 = 0;
                            while (true) {
                                if (i24 < arrayList19.size()) {
                                    lVar3 = (l) arrayList19.get(i24);
                                    if (!strK.equals(lVar3.f45420c)) {
                                        i24++;
                                    }
                                } else {
                                    lVar3 = null;
                                }
                            }
                            if (lVar3 != null) {
                                t0 t0Var3 = lVar3.f45419b;
                                String strO3 = g0.o(2, t0Var3.f8190r);
                                s0Var.h = strO3;
                                s0Var.f8135o = d5.q.c(strO3);
                                s0Var.f8140t = t0Var3.G;
                                s0Var.f8141u = t0Var3.H;
                                s0Var.v = t0Var3.I;
                            }
                            if (uriH2 != null) {
                                s0Var.f8129i = cVar2;
                                arrayList14.add(new k(uriH2, new t0(s0Var), strK2));
                                break;
                            }
                        default:
                            arrayList = arrayList15;
                            break;
                    }
                    i17 = i10 + 1;
                    arrayList20 = arrayList24;
                    str3 = str;
                    arrayList15 = arrayList;
                    arrayList16 = arrayList16;
                }
                ArrayList arrayList26 = arrayList20;
                ArrayList arrayList27 = arrayList16;
                ArrayList arrayList28 = arrayList15;
                if (z10) {
                    arrayList22 = Collections.EMPTY_LIST;
                }
                return new m(str, arrayList17, arrayList26, arrayList14, arrayList28, arrayList27, arrayList12, t0Var2, arrayList22, z12, map4, arrayList18);
            }
            String strF = aVar.F();
            if (strF.startsWith("#EXT")) {
                arrayList11.add(strF);
            }
            boolean zStartsWith = strF.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList29 = arrayList11;
            if (strF.startsWith("#EXT-X-DEFINE")) {
                map4.put(k(strF, pattern2, map4), k(strF, f45454q0, map4));
            } else {
                if (strF.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    z11 = true;
                    map2 = map3;
                    arrayList2 = arrayList4;
                } else if (strF.startsWith("#EXT-X-MEDIA")) {
                    arrayList9.add(strF);
                } else if (strF.startsWith("#EXT-X-SESSION-KEY")) {
                    l3.c cVarC = c(strF, j(strF, Z, "identity", map4), map4);
                    if (cVarC != null) {
                        String strK4 = k(strF, Y, map4);
                        arrayList10.add(new l3.d(("SAMPLE-AES-CENC".equals(strK4) || "SAMPLE-AES-CTR".equals(strK4)) ? "cenc" : "cbcs", true, cVarC));
                    }
                } else if (strF.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    boolean zContains = z10 | strF.contains("CLOSED-CAPTIONS=NONE");
                    int i25 = zStartsWith ? 16384 : 0;
                    int i26 = Integer.parseInt(k(strF, f45450n, Collections.EMPTY_MAP));
                    Matcher matcher = f45437c.matcher(strF);
                    if (matcher.find()) {
                        String strGroup = matcher.group(1);
                        strGroup.getClass();
                        i13 = Integer.parseInt(strGroup);
                    } else {
                        i13 = -1;
                    }
                    boolean z13 = z11;
                    String strJ5 = j(strF, f45457s, null, map4);
                    arrayList7 = arrayList7;
                    String strJ6 = j(strF, v, null, map4);
                    arrayList6 = arrayList6;
                    boolean zEquals = TextUtils.equals(j(strF, f45459w, null, map4), "true");
                    arrayList5 = arrayList5;
                    String strJ7 = j(strF, f45460x, null, map4);
                    String strJ8 = j(strF, f45461y, null, map4);
                    arrayList9 = arrayList9;
                    String strJ9 = j(strF, A, null, map4);
                    String strJ10 = j(strF, B, null, map4);
                    try {
                        try {
                            if (strJ10 != null) {
                                int i27 = g0.f4795a;
                                map = map3;
                                String[] strArrSplit2 = strJ10.split("x", -1);
                                i14 = Integer.parseInt(strArrSplit2[0]);
                                i15 = Integer.parseInt(strArrSplit2[1]);
                                if (i14 <= 0 || i15 <= 0) {
                                }
                                ArrayList arrayList30 = arrayList4;
                                strJ = j(strF, C, null, map4);
                                if (strJ != null) {
                                    f10 = Float.parseFloat(strJ);
                                } else {
                                    f10 = -1.0f;
                                }
                                String strJ11 = j(strF, d, null, map4);
                                String strJ12 = j(strF, f45440e, null, map4);
                                String strJ13 = j(strF, f45442f, null, map4);
                                String strJ14 = j(strF, h, null, map4);
                                if (zStartsWith) {
                                    uriH = d5.a.H(str3, k(strF, pattern, map4));
                                } else {
                                    if (aVar.D()) {
                                        throw t1.b("#EXT-X-STREAM-INF must be followed by another line", null);
                                    }
                                    uriH = d5.a.H(str3, l(aVar.F(), map4));
                                }
                                uri = uriH;
                                h3.s0 s0Var2 = new h3.s0();
                                s0Var2.f8123a = Integer.toString(arrayList30.size());
                                s0Var2.f8134n = "application/x-mpegURL";
                                s0Var2.h = strJ5;
                                s0Var2.f8135o = strJ6;
                                s0Var2.f8127f = i13;
                                s0Var2.f8128g = i26;
                                s0Var2.f8140t = i14;
                                s0Var2.f8141u = i15;
                                s0Var2.v = f10;
                                s0Var2.f8126e = i25;
                                s0Var2.f8130j = zEquals;
                                s0Var2.f8131k = Long.parseLong(strJ7);
                                s0Var2.f8132l = strJ8;
                                s0Var2.f8133m = Integer.parseInt(strJ9);
                                arrayList2 = arrayList30;
                                arrayList2.add(new l(uri, new t0(s0Var2), strJ11, strJ12, strJ13, strJ14));
                                map2 = map;
                                arrayList3 = (ArrayList) map2.get(uri);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    map2.put(uri, arrayList3);
                                }
                                arrayList3.add(new t(i13, strJ11, i26, strJ12, strJ13, strJ14));
                                z10 = zContains;
                                z11 = z13;
                            } else {
                                map = map3;
                            }
                            s0Var2.f8133m = Integer.parseInt(strJ9);
                        } catch (Exception unused) {
                        }
                        s0Var2.f8131k = Long.parseLong(strJ7);
                    } catch (Exception unused2) {
                    }
                    i14 = -1;
                    i15 = -1;
                    ArrayList arrayList31 = arrayList4;
                    strJ = j(strF, C, null, map4);
                    if (strJ != null) {
                        f10 = Float.parseFloat(strJ);
                    } else {
                        f10 = -1.0f;
                    }
                    String strJ15 = j(strF, d, null, map4);
                    String strJ16 = j(strF, f45440e, null, map4);
                    String strJ17 = j(strF, f45442f, null, map4);
                    String strJ18 = j(strF, h, null, map4);
                    if (zStartsWith) {
                        uriH = d5.a.H(str3, k(strF, pattern, map4));
                    } else {
                        if (aVar.D()) {
                            throw t1.b("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriH = d5.a.H(str3, l(aVar.F(), map4));
                    }
                    uri = uriH;
                    h3.s0 s0Var3 = new h3.s0();
                    s0Var3.f8123a = Integer.toString(arrayList31.size());
                    s0Var3.f8134n = "application/x-mpegURL";
                    s0Var3.h = strJ5;
                    s0Var3.f8135o = strJ6;
                    s0Var3.f8127f = i13;
                    s0Var3.f8128g = i26;
                    s0Var3.f8140t = i14;
                    s0Var3.f8141u = i15;
                    s0Var3.v = f10;
                    s0Var3.f8126e = i25;
                    s0Var3.f8130j = zEquals;
                    s0Var3.f8132l = strJ8;
                    arrayList2 = arrayList31;
                    arrayList2.add(new l(uri, new t0(s0Var3), strJ15, strJ16, strJ17, strJ18));
                    map2 = map;
                    arrayList3 = (ArrayList) map2.get(uri);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        map2.put(uri, arrayList3);
                    }
                    arrayList3.add(new t(i13, strJ15, i26, strJ16, strJ17, strJ18));
                    z10 = zContains;
                    z11 = z13;
                }
                arrayList4 = arrayList2;
                map3 = map2;
                arrayList8 = arrayList12;
                arrayList11 = arrayList29;
                arrayList10 = arrayList10;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
                arrayList9 = arrayList9;
            }
            map2 = map3;
            arrayList2 = arrayList4;
            arrayList4 = arrayList2;
            map3 = map2;
            arrayList8 = arrayList12;
            arrayList11 = arrayList29;
            arrayList10 = arrayList10;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList5 = arrayList5;
            arrayList9 = arrayList9;
        }
    }

    public static boolean g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String j(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String k(String str, Pattern pattern, Map map) throws t1 {
        String strJ = j(str, pattern, null, map);
        if (strJ != null) {
            return strJ;
        }
        throw t1.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map) {
        Matcher matcher = f45458s0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @Override
    public final Object e(Uri uri, com.google.android.exoplayer2.upstream.o oVar) throws t1 {
        int i10;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(oVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int i11 = bufferedReader.read();
            boolean zE = false;
            if (i11 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i11 = bufferedReader.read();
                    while (i11 != -1) {
                        i11 = bufferedReader.read();
                    }
                    i10 = 0;
                    while (true) {
                        if (i10 < 7) {
                            while (i11 != -1) {
                                i11 = bufferedReader.read();
                            }
                            zE = g0.E(i11);
                            break;
                        }
                        if (i11 != "#EXTM3U".charAt(i10)) {
                            break;
                            break;
                        }
                        i11 = bufferedReader.read();
                        i10++;
                    }
                }
            } else {
                while (i11 != -1 && Character.isWhitespace(i11)) {
                    i11 = bufferedReader.read();
                }
                i10 = 0;
                while (true) {
                    if (i10 < 7) {
                        while (i11 != -1 && Character.isWhitespace(i11) && !g0.E(i11)) {
                            i11 = bufferedReader.read();
                        }
                        zE = g0.E(i11);
                        break;
                    }
                    if (i11 != "#EXTM3U".charAt(i10)) {
                        break;
                    }
                    i11 = bufferedReader.read();
                    i10++;
                }
            }
            if (!zE) {
                throw t1.b("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    int i12 = g0.f4795a;
                    try {
                        bufferedReader.close();
                    } catch (IOException unused) {
                    }
                    throw t1.b("Failed to parse the playlist, could not identify any tags.", null);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        m mVarF = f(new j9.a(arrayDeque, bufferedReader), uri.toString());
                        int i13 = g0.f4795a;
                        try {
                            bufferedReader.close();
                        } catch (IOException unused2) {
                        }
                        return mVarF;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    j jVarD = d(this.f45462a, this.f45463b, new j9.a(arrayDeque, bufferedReader), uri.toString());
                    int i14 = g0.f4795a;
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                    return jVarD;
                }
            }
        } catch (Throwable th) {
            int i15 = g0.f4795a;
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }
}
