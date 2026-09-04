package r2;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import b2.r0;
import bi.l7;
import c5.b0;
import e9.a1;
import e9.f0;
import e9.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import v7.r6;
public abstract class w {
    public static final HashMap f44876a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).f44831a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new l7(new Object(), 3));
        }
        if (Build.VERSION.SDK_INT < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((o) arrayList.get(0)).f44831a)) {
            arrayList.add((o) arrayList.remove(0));
        }
    }

    public static String b(b2.s sVar) {
        Pair b10;
        String str = sVar.f2370r;
        String str2 = sVar.f2370r;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (b10 = e2.e.b(sVar)) != null) {
            int intValue = ((Integer) b10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
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
        } else if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
                return "audio/lg-ac3";
            }
            return null;
        }
    }

    public static synchronized List d(String str, boolean z10, boolean z11) {
        synchronized (w.class) {
            try {
                s sVar = new s(str, z10, z11);
                HashMap hashMap = f44876a;
                List list = (List) hashMap.get(sVar);
                if (list != null) {
                    return list;
                }
                ArrayList e7 = e(sVar, new b0(z10, z11, str.equals("video/mv-hevc")));
                if (z10 && e7.isEmpty() && Build.VERSION.SDK_INT <= 23) {
                    e7 = e(sVar, new rb.a(20));
                    if (!e7.isEmpty()) {
                        e2.a.n("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((o) e7.get(0)).f44831a);
                    }
                }
                a(str, e7);
                i0 v = i0.v(e7);
                hashMap.put(sVar, v);
                return v;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static java.util.ArrayList e(r2.s r20, r2.u r21) {
        throw new UnsupportedOperationException("Method not decompiled: r2.w.e(r2.s, r2.u):java.util.ArrayList");
    }

    public static a1 f(i iVar, b2.s sVar, boolean z10, boolean z11) {
        List a2;
        List a10 = iVar.a(sVar.f2370r, z10, z11);
        String b10 = b(sVar);
        if (b10 == null) {
            a2 = a1.f8920e;
        } else {
            a2 = iVar.a(b10, z10, z11);
        }
        f0 u10 = i0.u();
        u10.d(a10);
        u10.d(a2);
        return u10.i();
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (!mediaCodecInfo.isEncoder()) {
            if (z10 || !str.endsWith(".secure")) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
                    String str3 = Build.DEVICE;
                    if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                        return false;
                    }
                }
                if (i10 > 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
        return !i(mediaCodecInfo, str);
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (!r0.i(str)) {
            String b10 = r6.b(mediaCodecInfo.getName());
            if (!b10.startsWith("arc.")) {
                if (!b10.startsWith("omx.google.") && !b10.startsWith("omx.ffmpeg.")) {
                    if ((!b10.startsWith("omx.sec.") || !b10.contains(".sw.")) && !b10.equals("omx.qcom.video.decoder.hevcswvdec") && !b10.startsWith("c2.android.") && !b10.startsWith("c2.google.")) {
                        if (b10.startsWith("omx.") || b10.startsWith("c2.")) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }
}
