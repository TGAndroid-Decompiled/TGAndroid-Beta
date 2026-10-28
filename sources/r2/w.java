package r2;

import a8.wb;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import b2.w0;
import bi.p5;
import d5.z;
import f9.f0;
import f9.i0;
import f9.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public abstract class w {
    public static final HashMap f47304a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).f47259a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new p5(new Object(), 4));
        }
        if (Build.VERSION.SDK_INT < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((o) arrayList.get(0)).f47259a)) {
            arrayList.add((o) arrayList.remove(0));
        }
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i10, int i11) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i10;
        codecProfileLevel.level = i11;
        return codecProfileLevel;
    }

    public static String c(b2.x xVar) {
        Pair b10;
        String str = xVar.f3586s;
        String str2 = xVar.f3586s;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (b10 = e2.g.b(xVar)) != null) {
            int intValue = ((Integer) b10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                b2.o oVar = xVar.I;
                if (oVar != null && oVar.f3302c == 6 && oVar.f3301b == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String d(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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

    public static synchronized List e(String str, boolean z10, boolean z11) {
        synchronized (w.class) {
            try {
                s sVar = new s(str, z10, z11);
                HashMap hashMap = f47304a;
                List list = (List) hashMap.get(sVar);
                if (list != null) {
                    return list;
                }
                ArrayList f7 = f(sVar, new z(z10, z11, str.equals("video/mv-hevc")));
                if (z10 && f7.isEmpty() && Build.VERSION.SDK_INT == 23) {
                    f7 = f(sVar, new tb.a(20));
                    if (!f7.isEmpty()) {
                        e2.a.l("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((o) f7.get(0)).f47259a);
                    }
                }
                a(str, f7);
                i0 u10 = i0.u(f7);
                hashMap.put(sVar, u10);
                return u10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static java.util.ArrayList f(r2.s r20, r2.u r21) {
        throw new UnsupportedOperationException("Method not decompiled: r2.w.f(r2.s, r2.u):java.util.ArrayList");
    }

    public static s1 g(i iVar, b2.x xVar, boolean z10, boolean z11) {
        List a2;
        List a10 = iVar.a(xVar.f3586s, z10, z11);
        String c10 = c(xVar);
        if (c10 == null) {
            a2 = s1.e;
        } else {
            a2 = iVar.a(c10, z10, z11);
        }
        f0 t10 = i0.t();
        t10.d(a10);
        t10.d(a2);
        return t10.f();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (!mediaCodecInfo.isEncoder()) {
            if (z10 || !str.endsWith(".secure")) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
                    String str3 = Build.DEVICE;
                    if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                        return false;
                    }
                }
                if (i10 != 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
        return !j(mediaCodecInfo, str);
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (!w0.i(str)) {
            String c10 = wb.c(mediaCodecInfo.getName());
            if (!c10.startsWith("arc.")) {
                if (!c10.startsWith("omx.google.") && !c10.startsWith("omx.ffmpeg.")) {
                    if ((!c10.startsWith("omx.sec.") || !c10.contains(".sw.")) && !c10.equals("omx.qcom.video.decoder.hevcswvdec") && !c10.startsWith("c2.android.") && !c10.startsWith("c2.google.")) {
                        if (c10.startsWith("omx.") || c10.startsWith("c2.")) {
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
