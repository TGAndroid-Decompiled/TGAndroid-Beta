package p2;

import android.util.Base64;
import b2.s0;
import e2.d0;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class r implements y2.o {
    public final o f40826a;
    public final l f40827b;
    public static final Pattern f40795c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f40799f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern f40807n = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern f40812r = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern f40814s = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern v = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern f40819w = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern f40821x = Pattern.compile("MIME=\"(.+?)\"");
    public static final Pattern f40823y = Pattern.compile("CACHED=\"(.+?)\"");
    public static final Pattern E = Pattern.compile("DOCID=\"(.+?)\"");
    public static final Pattern F = Pattern.compile("DOCFILENAME=\"(.+?)\"");
    public static final Pattern G = Pattern.compile("ACCOUNT=\"(.+?)\"");
    public static final Pattern H = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern I = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern J = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern K = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern L = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern M = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern N = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern O = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern P = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern Q = a("CAN-SKIP-DATERANGES");
    public static final Pattern R = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern S = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern T = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern U = a("CAN-BLOCK-RELOAD");
    public static final Pattern V = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern W = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern X = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern Y = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern Z = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern f40793a0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern f40794b0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern f40796c0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern f40797d0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern f40798e0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern f40800f0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern f40801g0 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern f40802h0 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern f40803i0 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern f40804j0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern f40805k0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern f40806l0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern m0 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern f40808n0 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern f40809o0 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern f40810p0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern f40811q0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern f40813r0 = a("AUTOSELECT");
    public static final Pattern f40815s0 = a("DEFAULT");
    public static final Pattern f40816t0 = a("FORCED");
    public static final Pattern f40817u0 = a("INDEPENDENT");
    public static final Pattern f40818v0 = a("GAP");
    public static final Pattern f40820w0 = a("PRECISE");
    public static final Pattern f40822x0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern f40824y0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern f40825z0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern A0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern B0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern C0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern D0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern E0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern F0 = a("END-ON-NEXT");
    public static final Pattern G0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern H0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern I0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern J0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern K0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern L0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern M0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern N0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern O0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern P0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern Q0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public r(o oVar, l lVar) {
        this.f40826a = oVar;
        this.f40827b = lVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static b2.o b(String str, b2.n[] nVarArr) {
        b2.n[] nVarArr2 = new b2.n[nVarArr.length];
        for (int i10 = 0; i10 < nVarArr.length; i10++) {
            b2.n nVar = nVarArr[i10];
            nVarArr2[i10] = new b2.n(nVar.f3121b, nVar.f3122c, nVar.d, null);
        }
        return new b2.o(str, true, nVarArr2);
    }

    public static b2.n c(String str, String str2, HashMap hashMap) {
        String i10 = i(str, f40802h0, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f40803i0;
        if (equals) {
            String j3 = j(str, pattern, hashMap);
            return new b2.n(b2.i.d, null, "video/mp4", Base64.decode(j3.substring(j3.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = b2.i.d;
            String str3 = d0.f7888a;
            return new b2.n(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(i10)) {
            return null;
        } else {
            String j10 = j(str, pattern, hashMap);
            byte[] decode = Base64.decode(j10.substring(j10.indexOf(44)), 0);
            UUID uuid2 = b2.i.e;
            return new b2.n(uuid2, null, "video/mp4", w3.o.a(uuid2, null, decode));
        }
    }

    public static p2.l d(p2.o r113, p2.l r114, lf.h r115, java.lang.String r116) {
        throw new UnsupportedOperationException("Method not decompiled: p2.r.d(p2.o, p2.l, lf.h, java.lang.String):p2.l");
    }

    public static p2.o e(lf.h r45, java.lang.String r46) {
        throw new UnsupportedOperationException("Method not decompiled: p2.r.e(lf.h, java.lang.String):p2.o");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return d10;
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
        throw s0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map) {
        Matcher matcher = P0.matcher(str);
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
    public final java.lang.Object n2(android.net.Uri r7, g2.k r8) {
        throw new UnsupportedOperationException("Method not decompiled: p2.r.n2(android.net.Uri, g2.k):java.lang.Object");
    }
}
