package p2;

import android.util.Base64;
import b2.w0;
import e2.m0;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class t implements y2.n {
    public final q f44089a;
    public final n f44090b;
    public static final Pattern f44058c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f44062f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern f44070n = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern f44075r = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern f44077s = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern v = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern f44082w = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern f44084x = Pattern.compile("MIME=\"(.+?)\"");
    public static final Pattern f44086y = Pattern.compile("CACHED=\"(.+?)\"");
    public static final Pattern E = Pattern.compile("DOCID=\"(.+?)\"");
    public static final Pattern F = Pattern.compile("DOCFILENAME=\"(.+?)\"");
    public static final Pattern G = Pattern.compile("ACCOUNT=\"(.+?)\"");
    public static final Pattern H = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern I = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern J = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    public static final Pattern K = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    public static final Pattern L = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    public static final Pattern M = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern N = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern O = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern P = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern Q = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern R = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern S = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern T = a("CAN-SKIP-DATERANGES");
    public static final Pattern U = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern V = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern W = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern X = a("CAN-BLOCK-RELOAD");
    public static final Pattern Y = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern Z = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern f44056a0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern f44057b0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern f44059c0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern f44060d0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern f44061e0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern f44063f0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern f44064g0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern f44065h0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern f44066i0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern f44067j0 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern f44068k0 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern f44069l0 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern m0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern f44071n0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern f44072o0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern f44073p0 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern f44074q0 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern f44076r0 = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    public static final Pattern f44078s0 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern f44079t0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern f44080u0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern f44081v0 = a("AUTOSELECT");
    public static final Pattern f44083w0 = a("DEFAULT");
    public static final Pattern f44085x0 = a("FORCED");
    public static final Pattern f44087y0 = a("INDEPENDENT");
    public static final Pattern f44088z0 = a("GAP");
    public static final Pattern A0 = a("PRECISE");
    public static final Pattern B0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern C0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern D0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern E0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern F0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern G0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern H0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern I0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern J0 = a("END-ON-NEXT");
    public static final Pattern K0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern L0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern M0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern N0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern O0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern P0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern Q0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern R0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern S0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern T0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern U0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern V0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern W0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern X0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public t(q qVar, n nVar) {
        this.f44089a = qVar;
        this.f44090b = nVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static b2.s b(String str, b2.r[] rVarArr) {
        b2.r[] rVarArr2 = new b2.r[rVarArr.length];
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            b2.r rVar = rVarArr[i10];
            rVarArr2[i10] = new b2.r(rVar.f3933b, rVar.f3934c, rVar.d, null);
        }
        return new b2.s(str, true, rVarArr2);
    }

    public static b2.r c(String str, String str2, HashMap hashMap, o2.d dVar) {
        String i10 = i(str, f44068k0, "1", hashMap, dVar);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f44069l0;
        if (equals) {
            String j10 = j(str, pattern, hashMap, dVar);
            return new b2.r(b2.m.e, null, "video/mp4", Base64.decode(j10.substring(j10.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = b2.m.e;
            String str3 = m0.f8254a;
            return new b2.r(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(i10)) {
            return null;
        } else {
            String j11 = j(str, pattern, hashMap, dVar);
            byte[] decode = Base64.decode(j11.substring(j11.indexOf(44)), 0);
            UUID uuid2 = b2.m.f3831f;
            return new b2.r(uuid2, null, "video/mp4", w3.p.a(uuid2, null, decode));
        }
    }

    public static p2.n d(p2.q r132, p2.n r133, m.g3 r134, android.net.Uri r135, o2.d r136) {
        throw new UnsupportedOperationException("Method not decompiled: p2.t.d(p2.q, p2.n, m.g3, android.net.Uri, o2.d):p2.n");
    }

    public static p2.q e(m.g3 r50, android.net.Uri r51, o2.d r52) {
        throw new UnsupportedOperationException("Method not decompiled: p2.t.e(m.g3, android.net.Uri, o2.d):p2.q");
    }

    public static boolean f(String str, Pattern pattern, o2.d dVar) {
        Matcher a2 = o2.d.a(str, pattern, dVar);
        if (a2.find()) {
            return "YES".equals(a2.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d10, o2.d dVar) {
        Matcher a2 = o2.d.a(str, pattern, dVar);
        if (a2.find()) {
            String group = a2.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return d10;
    }

    public static long h(String str, Pattern pattern, o2.d dVar) {
        Matcher a2 = o2.d.a(str, pattern, dVar);
        if (a2.find()) {
            String group = a2.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String i(String str, Pattern pattern, String str2, Map map, o2.d dVar) {
        Matcher a2 = o2.d.a(str, pattern, dVar);
        if (a2.find()) {
            str2 = a2.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return k(str2, map, dVar);
        }
        return str2;
    }

    public static String j(String str, Pattern pattern, Map map, o2.d dVar) {
        String i10 = i(str, pattern, null, map, dVar);
        if (i10 != null) {
            return i10;
        }
        throw w0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map, o2.d dVar) {
        Matcher a2 = o2.d.a(str, W0, dVar);
        StringBuffer stringBuffer = new StringBuffer();
        while (a2.find()) {
            String group = a2.group(1);
            if (map.containsKey(group)) {
                a2.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        a2.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static void l(String str, HashMap hashMap) {
        if (!hashMap.containsKey(str)) {
            return;
        }
        throw w0.b("duplicate variable name \"" + str + "\"", null);
    }

    @Override
    public final java.lang.Object d2(android.net.Uri r8, g2.k r9) {
        throw new UnsupportedOperationException("Method not decompiled: p2.t.d2(android.net.Uri, g2.k):java.lang.Object");
    }
}
