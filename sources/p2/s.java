package p2;

import android.util.Base64;
import b2.x0;
import e2.n0;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class s implements y2.n {
    public final p f46629a;
    public final m f46630b;
    public static final Pattern f46598c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f46602f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern f46610n = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern f46615r = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern f46617s = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern v = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern f46622w = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern f46624x = Pattern.compile("MIME=\"(.+?)\"");
    public static final Pattern f46626y = Pattern.compile("CACHED=\"(.+?)\"");
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
    public static final Pattern f46596a0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern f46597b0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern f46599c0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern f46600d0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern f46601e0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern f46603f0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern f46604g0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern f46605h0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern f46606i0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern f46607j0 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern f46608k0 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern f46609l0 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern m0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern f46611n0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern f46612o0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern f46613p0 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern f46614q0 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern f46616r0 = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    public static final Pattern f46618s0 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern f46619t0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern f46620u0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern f46621v0 = a("AUTOSELECT");
    public static final Pattern f46623w0 = a("DEFAULT");
    public static final Pattern f46625x0 = a("FORCED");
    public static final Pattern f46627y0 = a("INDEPENDENT");
    public static final Pattern f46628z0 = a("GAP");
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

    public s(p pVar, m mVar) {
        this.f46629a = pVar;
        this.f46630b = mVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static b2.t b(String str, b2.s[] sVarArr) {
        b2.s[] sVarArr2 = new b2.s[sVarArr.length];
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            b2.s sVar = sVarArr[i10];
            sVarArr2[i10] = new b2.s(sVar.f3388b, sVar.f3389c, sVar.d, null);
        }
        return new b2.t(str, true, sVarArr2);
    }

    public static b2.s c(String str, String str2, HashMap hashMap, o2.d dVar) {
        String i10 = i(str, f46608k0, "1", hashMap, dVar);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f46609l0;
        if (equals) {
            String j10 = j(str, pattern, hashMap, dVar);
            return new b2.s(b2.n.e, null, "video/mp4", Base64.decode(j10.substring(j10.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = b2.n.e;
            String str3 = n0.f9692a;
            return new b2.s(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(i10)) {
            return null;
        } else {
            String j11 = j(str, pattern, hashMap, dVar);
            byte[] decode = Base64.decode(j11.substring(j11.indexOf(44)), 0);
            UUID uuid2 = b2.n.f3286f;
            return new b2.s(uuid2, null, "video/mp4", w3.p.a(uuid2, null, decode));
        }
    }

    public static p2.m d(p2.p r132, p2.m r133, k6.c r134, android.net.Uri r135, o2.d r136) {
        throw new UnsupportedOperationException("Method not decompiled: p2.s.d(p2.p, p2.m, k6.c, android.net.Uri, o2.d):p2.m");
    }

    public static p2.p e(k6.c r50, android.net.Uri r51, o2.d r52) {
        throw new UnsupportedOperationException("Method not decompiled: p2.s.e(k6.c, android.net.Uri, o2.d):p2.p");
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
        throw x0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
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
        throw x0.b("duplicate variable name \"" + str + "\"", null);
    }

    @Override
    public final java.lang.Object S1(android.net.Uri r8, g2.k r9) {
        throw new UnsupportedOperationException("Method not decompiled: p2.s.S1(android.net.Uri, g2.k):java.lang.Object");
    }
}
