package y3;

import android.media.MediaCodecInfo;
import android.util.Pair;
import d5.g0;
import h3.t0;
import h7.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p8.z;

public abstract class w {

    public static final Pattern f49545a = Pattern.compile("^\\D?(\\d+)$");

    public static final HashMap f49546b = new HashMap();

    public static int f49547c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (g0.f4795a < 26 && g0.f4796b.equals("R9") && arrayList.size() == 1 && ((n) arrayList.get(0)).f49495a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(n.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new ag.h(new r(2), 6));
        }
        int i10 = g0.f4795a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str2 = ((n) arrayList.get(0)).f49495a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new ag.h(new r(3), 6));
            }
        }
        if (i10 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((n) arrayList.get(0)).f49495a)) {
            return;
        }
        arrayList.add((n) arrayList.remove(0));
    }

    public static String b(t0 t0Var) {
        Pair pairD;
        if ("audio/eac3-joc".equals(t0Var.B)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(t0Var.B) || (pairD = d(t0Var)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static Pair d(t0 t0Var) {
        byte b10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Integer num;
        Integer num2 = 1024;
        String str = t0Var.f8190r;
        String str2 = t0Var.f8190r;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        boolean zEquals = "video/dolby-vision".equals(t0Var.B);
        Pattern pattern = f49545a;
        if (zEquals) {
            if (strArrSplit.length < 3) {
                s3.c.k("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                return null;
            }
            Matcher matcher = pattern.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                s3.c.k("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                switch (strGroup) {
                    case "00":
                        num = 1;
                        break;
                    case "01":
                        num = 2;
                        break;
                    case "02":
                        num = 4;
                        break;
                    case "03":
                        num = 8;
                        break;
                    case "04":
                        num = 16;
                        break;
                    case "05":
                        num = 32;
                        break;
                    case "06":
                        num = 64;
                        break;
                    case "07":
                        num = 128;
                        break;
                    case "08":
                        num = 256;
                        break;
                    case "09":
                        num = 512;
                        break;
                    default:
                        num = null;
                        break;
                }
            } else {
                num = null;
            }
            if (num == null) {
                s3.c.k("Unknown Dolby Vision profile string: ", strGroup, "MediaCodecUtil");
                return null;
            }
            String str3 = strArrSplit[2];
            if (str3 != null) {
                switch (str3) {
                    case "01":
                        num2 = 1;
                        break;
                    case "02":
                        num2 = 2;
                        break;
                    case "03":
                        num2 = 4;
                        break;
                    case "04":
                        num2 = 8;
                        break;
                    case "05":
                        num2 = 16;
                        break;
                    case "06":
                        num2 = 32;
                        break;
                    case "07":
                        num2 = 64;
                        break;
                    case "08":
                        num2 = 128;
                        break;
                    case "09":
                        num2 = 256;
                        break;
                    case "10":
                        num2 = 512;
                        break;
                    case "11":
                        break;
                    case "12":
                        num2 = 2048;
                        break;
                    case "13":
                        num2 = 4096;
                        break;
                    default:
                        num2 = null;
                        break;
                }
            } else {
                num2 = null;
            }
            if (num2 != null) {
                return new Pair(num, num2);
            }
            s3.c.k("Unknown Dolby Vision level string: ", str3, "MediaCodecUtil");
            return null;
        }
        String str4 = strArrSplit[0];
        str4.getClass();
        switch (str4) {
            case "av01":
                b10 = 0;
                break;
            case "avc1":
                b10 = 1;
                break;
            case "avc2":
                b10 = 2;
                break;
            case "hev1":
                b10 = 3;
                break;
            case "hvc1":
                b10 = 4;
                break;
            case "mp4a":
                b10 = 5;
                break;
            case "vp09":
                b10 = 6;
                break;
            default:
                b10 = -1;
                break;
        }
        int i19 = 20;
        switch (b10) {
            case 0:
                e5.b bVar = t0Var.N;
                if (strArrSplit.length < 4) {
                    s3.c.k("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                try {
                    int i20 = Integer.parseInt(strArrSplit[1]);
                    int i21 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i22 = Integer.parseInt(strArrSplit[3]);
                    if (i20 != 0) {
                        com.google.android.recaptcha.internal.a.s(i20, "Unknown AV1 profile: ", "MediaCodecUtil");
                        return null;
                    }
                    int i23 = 8;
                    if (i22 != 8 && i22 != 10) {
                        com.google.android.recaptcha.internal.a.s(i22, "Unknown AV1 bit depth: ", "MediaCodecUtil");
                        return null;
                    }
                    if (i22 == 8) {
                        i10 = 1;
                    } else {
                        i10 = (bVar == null || !(bVar.d != null || (i11 = bVar.f5233c) == 7 || i11 == 6)) ? 2 : 4096;
                    }
                    switch (i21) {
                        case 0:
                            i23 = 1;
                            break;
                        case 1:
                            i23 = 2;
                            break;
                        case 2:
                            i23 = 4;
                            break;
                        case 3:
                            break;
                        case 4:
                            i23 = 16;
                            break;
                        case 5:
                            i23 = 32;
                            break;
                        case 6:
                            i23 = 64;
                            break;
                        case 7:
                            i23 = 128;
                            break;
                        case 8:
                            i23 = 256;
                            break;
                        case 9:
                            i23 = 512;
                            break;
                        case 10:
                            i23 = 1024;
                            break;
                        case 11:
                            i23 = 2048;
                            break;
                        case 12:
                            i23 = 4096;
                            break;
                        case 13:
                            i23 = 8192;
                            break;
                        case 14:
                            i23 = 16384;
                            break;
                        case 15:
                            i23 = 32768;
                            break;
                        case 16:
                            i23 = 65536;
                            break;
                        case 17:
                            i23 = 131072;
                            break;
                        case 18:
                            i23 = 262144;
                            break;
                        case 19:
                            i23 = 524288;
                            break;
                        case 20:
                            i23 = 1048576;
                            break;
                        case 21:
                            i23 = 2097152;
                            break;
                        case 22:
                            i23 = 4194304;
                            break;
                        case 23:
                            i23 = 8388608;
                            break;
                        default:
                            i23 = -1;
                            break;
                    }
                    if (i23 != -1) {
                        return new Pair(Integer.valueOf(i10), Integer.valueOf(i23));
                    }
                    com.google.android.recaptcha.internal.a.s(i21, "Unknown AV1 level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused) {
                    s3.c.k("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
            case 1:
            case 2:
                if (strArrSplit.length < 2) {
                    s3.c.k("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i12 = 16;
                        i13 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i14 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        i12 = 16;
                        if (strArrSplit.length < 3) {
                            d5.a.K("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str2);
                            return null;
                        }
                        i13 = Integer.parseInt(strArrSplit[1]);
                        i14 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i13 == 66) {
                        i15 = 1;
                    } else if (i13 == 77) {
                        i15 = 2;
                    } else if (i13 == 88) {
                        i15 = 4;
                    } else if (i13 == 100) {
                        i15 = 8;
                    } else if (i13 == 110) {
                        i15 = 16;
                    } else if (i13 != 122) {
                        i15 = i13 != 244 ? -1 : 64;
                    } else {
                        i15 = 32;
                    }
                    if (i15 == -1) {
                        com.google.android.recaptcha.internal.a.s(i13, "Unknown AVC profile: ", "MediaCodecUtil");
                        return null;
                    }
                    switch (i14) {
                        case 10:
                            i12 = 1;
                            break;
                        case 11:
                            i12 = 4;
                            break;
                        case 12:
                            i12 = 8;
                            break;
                        case 13:
                            break;
                        default:
                            switch (i14) {
                                case 20:
                                    i12 = 32;
                                    break;
                                case 21:
                                    i12 = 64;
                                    break;
                                case 22:
                                    i12 = 128;
                                    break;
                                default:
                                    switch (i14) {
                                        case 30:
                                            i12 = 256;
                                            break;
                                        case 31:
                                            i12 = 512;
                                            break;
                                        case 32:
                                            i12 = 1024;
                                            break;
                                        default:
                                            switch (i14) {
                                                case 40:
                                                    i12 = 2048;
                                                    break;
                                                case 41:
                                                    i12 = 4096;
                                                    break;
                                                case 42:
                                                    i12 = 8192;
                                                    break;
                                                default:
                                                    switch (i14) {
                                                        case 50:
                                                            i12 = 16384;
                                                            break;
                                                        case 51:
                                                            i12 = 32768;
                                                            break;
                                                        case 52:
                                                            i12 = 65536;
                                                            break;
                                                        default:
                                                            i12 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i12 != -1) {
                        return new Pair(Integer.valueOf(i15), Integer.valueOf(i12));
                    }
                    com.google.android.recaptcha.internal.a.s(i14, "Unknown AVC level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused2) {
                    s3.c.k("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
            case 3:
            case 4:
                if (strArrSplit.length < 4) {
                    s3.c.k("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                Matcher matcher2 = pattern.matcher(strArrSplit[1]);
                if (!matcher2.matches()) {
                    s3.c.k("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                String strGroup2 = matcher2.group(1);
                if ("1".equals(strGroup2)) {
                    i16 = 1;
                } else {
                    if (!"2".equals(strGroup2)) {
                        s3.c.k("Unknown HEVC profile string: ", strGroup2, "MediaCodecUtil");
                        return null;
                    }
                    i16 = 2;
                }
                String str5 = strArrSplit[3];
                if (str5 != null) {
                    switch (str5) {
                        case "H30":
                            num2 = 2;
                            break;
                        case "H60":
                            num2 = 8;
                            break;
                        case "H63":
                            num2 = 32;
                            break;
                        case "H90":
                            num2 = 128;
                            break;
                        case "H93":
                            num2 = 512;
                            break;
                        case "L30":
                            num2 = 1;
                            break;
                        case "L60":
                            num2 = 4;
                            break;
                        case "L63":
                            num2 = 16;
                            break;
                        case "L90":
                            num2 = 64;
                            break;
                        case "L93":
                            num2 = 256;
                            break;
                        case "H120":
                            num2 = 2048;
                            break;
                        case "H123":
                            num2 = 8192;
                            break;
                        case "H150":
                            num2 = 32768;
                            break;
                        case "H153":
                            num2 = 131072;
                            break;
                        case "H156":
                            num2 = 524288;
                            break;
                        case "H180":
                            num2 = 2097152;
                            break;
                        case "H183":
                            num2 = 8388608;
                            break;
                        case "H186":
                            num2 = 33554432;
                            break;
                        case "L120":
                            break;
                        case "L123":
                            num2 = 4096;
                            break;
                        case "L150":
                            num2 = 16384;
                            break;
                        case "L153":
                            num2 = 65536;
                            break;
                        case "L156":
                            num2 = 262144;
                            break;
                        case "L180":
                            num2 = 1048576;
                            break;
                        case "L183":
                            num2 = 4194304;
                            break;
                        case "L186":
                            num2 = 16777216;
                            break;
                        default:
                            num2 = null;
                            break;
                    }
                } else {
                    num2 = null;
                }
                if (num2 != null) {
                    return new Pair(Integer.valueOf(i16), num2);
                }
                s3.c.k("Unknown HEVC level string: ", str5, "MediaCodecUtil");
                return null;
            case 5:
                if (strArrSplit.length != 3) {
                    s3.c.k("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                try {
                    if ("audio/mp4a-latm".equals(d5.q.d(Integer.parseInt(strArrSplit[1], 16)))) {
                        int i24 = Integer.parseInt(strArrSplit[2]);
                        if (i24 == 17) {
                            i19 = 17;
                        } else if (i24 != 20) {
                            if (i24 == 23) {
                                i19 = 23;
                            } else if (i24 == 29) {
                                i19 = 29;
                            } else if (i24 == 39) {
                                i19 = 39;
                            } else if (i24 != 42) {
                                switch (i24) {
                                    case 1:
                                        i19 = 1;
                                        break;
                                    case 2:
                                        i19 = 2;
                                        break;
                                    case 3:
                                        i19 = 3;
                                        break;
                                    case 4:
                                        i19 = 4;
                                        break;
                                    case 5:
                                        i19 = 5;
                                        break;
                                    case 6:
                                        i19 = 6;
                                        break;
                                    default:
                                        i19 = -1;
                                        break;
                                }
                            } else {
                                i19 = 42;
                            }
                        }
                        if (i19 != -1) {
                            return new Pair(Integer.valueOf(i19), 0);
                        }
                    }
                } catch (NumberFormatException unused3) {
                    s3.c.k("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                }
                return null;
            case 6:
                if (strArrSplit.length < 3) {
                    s3.c.k("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                try {
                    int i25 = Integer.parseInt(strArrSplit[1]);
                    int i26 = Integer.parseInt(strArrSplit[2]);
                    if (i25 == 0) {
                        i17 = 1;
                    } else if (i25 == 1) {
                        i17 = 2;
                    } else if (i25 != 2) {
                        i17 = i25 != 3 ? -1 : 8;
                    } else {
                        i17 = 4;
                    }
                    if (i17 == -1) {
                        com.google.android.recaptcha.internal.a.s(i25, "Unknown VP9 profile: ", "MediaCodecUtil");
                        return null;
                    }
                    if (i26 == 10) {
                        i18 = 1;
                    } else if (i26 == 11) {
                        i18 = 2;
                    } else if (i26 == 20) {
                        i18 = 4;
                    } else if (i26 == 21) {
                        i18 = 8;
                    } else if (i26 == 30) {
                        i18 = 16;
                    } else if (i26 == 31) {
                        i18 = 32;
                    } else if (i26 == 40) {
                        i18 = 64;
                    } else if (i26 == 41) {
                        i18 = 128;
                    } else if (i26 == 50) {
                        i18 = 256;
                    } else if (i26 != 51) {
                        switch (i26) {
                            case 60:
                                i18 = 2048;
                                break;
                            case 61:
                                i18 = 4096;
                                break;
                            case 62:
                                i18 = 8192;
                                break;
                            default:
                                i18 = -1;
                                break;
                        }
                    } else {
                        i18 = 512;
                    }
                    if (i18 != -1) {
                        return new Pair(Integer.valueOf(i17), Integer.valueOf(i18));
                    }
                    com.google.android.recaptcha.internal.a.s(i26, "Unknown VP9 level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused4) {
                    s3.c.k("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
            default:
                return null;
        }
    }

    public static synchronized List e(String str, boolean z10, boolean z11) {
        try {
            s sVar = new s(str, z10, z11);
            HashMap map = f49546b;
            List list = (List) map.get(sVar);
            if (list != null) {
                return list;
            }
            int i10 = g0.f4795a;
            ArrayList arrayListF = f(sVar, i10 >= 21 ? new n2.v(z10, z11) : new ab.a(26));
            if (z10 && arrayListF.isEmpty() && 21 <= i10 && i10 <= 23) {
                arrayListF = f(sVar, new ab.a(26));
                if (!arrayListF.isEmpty()) {
                    d5.a.K("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((n) arrayListF.get(0)).f49495a);
                }
            }
            a(str, arrayListF);
            z zVarU = z.u(arrayListF);
            map.put(sVar, zVarU);
            return zVarU;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static ArrayList f(s sVar, u uVar) throws t {
        String strC;
        String str;
        String str2;
        String str3;
        s sVar2 = sVar;
        boolean z10 = sVar2.f49543b;
        try {
            ArrayList arrayList = new ArrayList();
            String str4 = sVar2.f49542a;
            int iR = uVar.r();
            boolean zB = uVar.B();
            int i10 = 0;
            while (i10 < iR) {
                MediaCodecInfo mediaCodecInfoA = uVar.a(i10);
                int i11 = g0.f4795a;
                if (i11 < 29 || !mediaCodecInfoA.isAlias()) {
                    String name = mediaCodecInfoA.getName();
                    if (g(mediaCodecInfoA, name, zB, str4) && (strC = c(mediaCodecInfoA, name, str4)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(strC);
                            boolean zE = uVar.e("tunneled-playback", strC, capabilitiesForType);
                            boolean zI = uVar.i("tunneled-playback", capabilitiesForType);
                            boolean z11 = sVar2.f49544c;
                            if ((z11 || !zI) && (!z11 || zE)) {
                                boolean zE2 = uVar.e("secure-playback", strC, capabilitiesForType);
                                boolean zI2 = uVar.i("secure-playback", capabilitiesForType);
                                if ((z10 || !zI2) && (!z10 || zE2)) {
                                    try {
                                        boolean zH = h(mediaCodecInfoA, str4);
                                        i(mediaCodecInfoA, str4);
                                        if (i11 >= 29) {
                                            mediaCodecInfoA.isVendor();
                                        } else {
                                            String strB = d0.b(mediaCodecInfoA.getName());
                                            if (!strB.startsWith("omx.google.") && !strB.startsWith("c2.android.")) {
                                                strB.startsWith("c2.google.");
                                            }
                                        }
                                        if (!(zB && z10 == zE2) && (zB || z10)) {
                                            str3 = name;
                                            if (!zB && zE2) {
                                                str2 = str3;
                                                str = strC;
                                                try {
                                                    arrayList.add(n.h(str3 + ".secure", str4, str, capabilitiesForType, zH, true));
                                                    break;
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    if (g0.f4795a <= 23) {
                                                    }
                                                    d5.a.o("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                            }
                                        } else {
                                            str3 = name;
                                            str = strC;
                                            try {
                                                try {
                                                    arrayList.add(n.h(str3, str4, str, capabilitiesForType, zH, false));
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    str2 = str3;
                                                    str = strC;
                                                    if (g0.f4795a <= 23) {
                                                    }
                                                    d5.a.o("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                str2 = str3;
                                                if (g0.f4795a <= 23 || arrayList.isEmpty()) {
                                                    d5.a.o("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                                d5.a.o("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                            }
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        str2 = name;
                                    }
                                }
                            }
                        } catch (Exception e13) {
                            e = e13;
                            str = strC;
                            str2 = name;
                        }
                    }
                }
                i10++;
                sVar2 = sVar;
            }
            return arrayList;
        } catch (Exception e14) {
            throw new t("Failed to query underlying media codecs", e14);
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z10 && str.endsWith(".secure")) {
            return false;
        }
        int i10 = g0.f4795a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = g0.f4796b;
            if ("a70".equals(str3)) {
                return false;
            }
            if ("Xiaomi".equals(g0.f4797c) && str3.startsWith("HM")) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = g0.f4796b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = g0.f4796b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(g0.f4797c))) {
            String str6 = g0.f4796b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(g0.f4797c)) {
            String str7 = g0.f4796b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && g0.f4796b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        return g0.f4795a >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !i(mediaCodecInfo, str);
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (g0.f4795a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (d5.q.h(str)) {
            return true;
        }
        String strB = d0.b(mediaCodecInfo.getName());
        if (strB.startsWith("arc.")) {
            return false;
        }
        if (strB.startsWith("omx.google.") || strB.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strB.startsWith("omx.sec.") && strB.contains(".sw.")) || strB.equals("omx.qcom.video.decoder.hevcswvdec") || strB.startsWith("c2.android.") || strB.startsWith("c2.google.")) {
            return true;
        }
        return (strB.startsWith("omx.") || strB.startsWith("c2.")) ? false : true;
    }

    public static int j() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (f49547c == -1) {
            int iMax = 0;
            List listE = e("video/avc", false, false);
            n nVar = listE.isEmpty() ? null : (n) listE.get(0);
            if (nVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i11 = codecProfileLevelArr[iMax].level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    iMax2 = Math.max(i10, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, g0.f4795a >= 21 ? 345600 : 172800);
            }
            f49547c = iMax;
        }
        return f49547c;
    }
}
