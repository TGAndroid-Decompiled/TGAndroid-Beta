package r4;

import android.util.Base64;
import com.google.android.exoplayer2.upstream.s0;
import f5.d0;
import j3.t1;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class p implements s0 {
    public final m f47037a;
    public final j f47038b;
    public static final Pattern f47012c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern f47015e = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern f47017f = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern h = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern f47025n = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern f47030r = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern f47032s = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern v = Pattern.compile("MIME=\"(.+?)\"");
    public static final Pattern f47034w = Pattern.compile("CACHED=\"(.+?)\"");
    public static final Pattern f47035x = Pattern.compile("DOCID=\"(.+?)\"");
    public static final Pattern f47036y = Pattern.compile("DOCFILENAME=\"(.+?)\"");
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
    public static final Pattern f47010a0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern f47011b0 = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern f47013c0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern f47014d0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern f47016e0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern f47018f0 = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern f47019g0 = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern f47020h0 = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern f47021i0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern f47022j0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern f47023k0 = a("AUTOSELECT");
    public static final Pattern f47024l0 = a("DEFAULT");
    public static final Pattern m0 = a("FORCED");
    public static final Pattern f47026n0 = a("INDEPENDENT");
    public static final Pattern f47027o0 = a("GAP");
    public static final Pattern f47028p0 = a("PRECISE");
    public static final Pattern f47029q0 = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern f47031r0 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern f47033s0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public p(m mVar, j jVar) {
        this.f47037a = mVar;
        this.f47038b = jVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static n3.c b(String str, n3.b[] bVarArr) {
        n3.b[] bVarArr2 = new n3.b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            n3.b bVar = bVarArr[i10];
            bVarArr2[i10] = new n3.b(bVar.f17097b, bVar.f17098c, bVar.d, null);
        }
        return new n3.c(str, true, bVarArr2);
    }

    public static n3.b c(String str, String str2, HashMap hashMap) {
        String j10 = j(str, f47010a0, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f47011b0;
        if (equals) {
            String k9 = k(str, pattern, hashMap);
            return new n3.b(j3.h.d, null, "video/mp4", Base64.decode(k9.substring(k9.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = j3.h.d;
            int i10 = d0.f6579a;
            return new n3.b(uuid, null, "hls", str.getBytes(p8.d.f45658c));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(j10)) {
            return null;
        } else {
            String k10 = k(str, pattern, hashMap);
            byte[] decode = Base64.decode(k10.substring(k10.indexOf(44)), 0);
            UUID uuid2 = j3.h.f10476e;
            return new n3.b(uuid2, null, "video/mp4", w3.j.a(uuid2, null, decode));
        }
    }

    public static r4.j e(r4.m r110, r4.j r111, l3.g0 r112, java.lang.String r113) {
        throw new UnsupportedOperationException("Method not decompiled: r4.p.e(r4.m, r4.j, l3.g0, java.lang.String):r4.j");
    }

    public static r4.m f(l3.g0 r44, java.lang.String r45) {
        throw new UnsupportedOperationException("Method not decompiled: r4.p.f(l3.g0, java.lang.String):r4.m");
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
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return -9.223372036854776E18d;
    }

    public static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String j(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return l(str2, map);
        }
        return str2;
    }

    public static String k(String str, Pattern pattern, Map map) {
        String j10 = j(str, pattern, null, map);
        if (j10 != null) {
            return j10;
        }
        throw t1.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map) {
        Matcher matcher = f47033s0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @Override
    public final java.lang.Object d(android.net.Uri r7, com.google.android.exoplayer2.upstream.o r8) {
        throw new UnsupportedOperationException("Method not decompiled: r4.p.d(android.net.Uri, com.google.android.exoplayer2.upstream.o):java.lang.Object");
    }
}
