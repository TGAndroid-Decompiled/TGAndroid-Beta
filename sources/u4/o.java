package u4;

import android.util.Base64;
import g5.o0;
import h5.d0;
import j3.r1;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class o implements o0 {
    public final l f48381a;
    public final i f48382b;
    public static final Pattern f48355c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern f48358e = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern f48360f = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern h = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern f48368n = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern f48373r = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern f48375s = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern v = Pattern.compile("MIME=\"(.+?)\"");
    public static final Pattern f48378w = Pattern.compile("CACHED=\"(.+?)\"");
    public static final Pattern f48379x = Pattern.compile("DOCID=\"(.+?)\"");
    public static final Pattern f48380y = Pattern.compile("DOCFILENAME=\"(.+?)\"");
    public static final Pattern B = Pattern.compile("ACCOUNT=\"(.+?)\"");
    public static final Pattern C = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern D = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern E = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern F = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern H = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern I = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern J = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern K = a("CAN-SKIP-DATERANGES");
    public static final Pattern L = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern M = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern N = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern O = a("CAN-BLOCK-RELOAD");
    public static final Pattern P = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern Q = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern R = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern S = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern T = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern U = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern V = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern W = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern X = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern Y = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern Z = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern f48353a0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern f48354b0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern f48356c0 = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern f48357d0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern f48359e0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern f48361f0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern f48362g0 = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern f48363h0 = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern f48364i0 = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern f48365j0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern f48366k0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern f48367l0 = a("AUTOSELECT");
    public static final Pattern m0 = a("DEFAULT");
    public static final Pattern f48369n0 = a("FORCED");
    public static final Pattern f48370o0 = a("INDEPENDENT");
    public static final Pattern f48371p0 = a("GAP");
    public static final Pattern f48372q0 = a("PRECISE");
    public static final Pattern f48374r0 = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern f48376s0 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern f48377t0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public o(l lVar, i iVar) {
        this.f48381a = lVar;
        this.f48382b = iVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static o3.g b(String str, o3.f[] fVarArr) {
        o3.f[] fVarArr2 = new o3.f[fVarArr.length];
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            o3.f fVar = fVarArr[i10];
            fVarArr2[i10] = new o3.f(fVar.f16400b, fVar.f16401c, fVar.d, null);
        }
        return new o3.g(str, true, fVarArr2);
    }

    public static o3.f c(String str, String str2, HashMap hashMap) {
        String i10 = i(str, f48354b0, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f48356c0;
        if (equals) {
            String j10 = j(str, pattern, hashMap);
            return new o3.f(j3.h.d, null, "video/mp4", Base64.decode(j10.substring(j10.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = j3.h.d;
            int i11 = d0.f7237a;
            return new o3.f(uuid, null, "hls", str.getBytes(r8.d.f46769c));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(i10)) {
            return null;
        } else {
            String j11 = j(str, pattern, hashMap);
            byte[] decode = Base64.decode(j11.substring(j11.indexOf(44)), 0);
            UUID uuid2 = j3.h.f9165e;
            return new o3.f(uuid2, null, "video/mp4", z3.j.a(uuid2, null, decode));
        }
    }

    public static u4.i d(u4.l r110, u4.i r111, s5.m r112, java.lang.String r113) {
        throw new UnsupportedOperationException("Method not decompiled: u4.o.d(u4.l, u4.i, s5.m, java.lang.String):u4.i");
    }

    public static u4.l e(s5.m r44, java.lang.String r45) {
        throw new UnsupportedOperationException("Method not decompiled: u4.o.e(s5.m, java.lang.String):u4.l");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return -9.223372036854776E18d;
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return k(str2, map);
        }
        return str2;
    }

    public static String j(String str, Pattern pattern, Map map) {
        String i10 = i(str, pattern, null, map);
        if (i10 != null) {
            return i10;
        }
        throw r1.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map) {
        Matcher matcher = f48377t0.matcher(str);
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
    public final java.lang.Object w(android.net.Uri r7, g5.o r8) {
        throw new UnsupportedOperationException("Method not decompiled: u4.o.w(android.net.Uri, g5.o):java.lang.Object");
    }
}
