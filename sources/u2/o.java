package u2;

import a8.p0;
import ab.y;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import c8.sc;
import com.google.android.gms.internal.vision.e2;
import e2.s0;
import h2.l0;
import j$.util.Objects;
public final class o {
    public final String f58463a;
    public final String f58464b;
    public final String f58465c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean f58466e;
    public final boolean f58467f;
    public final boolean f58468g;
    public final boolean h;
    public final boolean f58469i;
    public int f58470j;
    public int f58471k;
    public float f58472l;

    public o(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.f58463a = str;
        this.f58464b = str2;
        this.f58465c = str3;
        this.d = codecCapabilities;
        this.f58468g = z10;
        this.f58466e = z13;
        this.f58467f = z14;
        this.h = z15;
        this.f58469i = s0.m(str2);
        this.f58472l = -3.4028235E38f;
        this.f58470j = -1;
        this.f58471k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i10, double d) {
        Range<Double> achievableFrameRatesFor;
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(l0.g(i7, widthAlignment) * widthAlignment, l0.g(i10, heightAlignment) * heightAlignment);
        int i11 = point.x;
        int i12 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            double floor = Math.floor(d);
            if (videoCapabilities.areSizeAndRateSupported(i11, i12, floor)) {
                if (Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i11, i12)) == null || floor <= achievableFrameRatesFor.getUpper().doubleValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return videoCapabilities.isSizeSupported(i11, i12);
    }

    public static o i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z17;
        boolean z18;
        boolean z19;
        String str6;
        if (codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        if (!z13 && (codecCapabilities == null || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO")) {
                z16 = true;
                str6 = str;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z17 = z10;
                z18 = z11;
                z19 = z12;
                str4 = str2;
                return new o(str6, str4, str5, codecCapabilities2, z17, z18, z19, z14, z15, z16);
            }
        }
        z16 = false;
        str4 = str2;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z17 = z10;
        z18 = z11;
        z19 = z12;
        str6 = str;
        return new o(str6, str4, str5, codecCapabilities2, z17, z18, z19, z14, z15, z16);
    }

    public final l2.f b(e2.u uVar, e2.u uVar2) {
        int i7;
        e2.u uVar3;
        e2.u uVar4;
        int i10;
        int i11;
        String str = uVar.f10759s;
        e2.m mVar = uVar.I;
        String str2 = uVar2.f10759s;
        e2.m mVar2 = uVar2.I;
        boolean equals = Objects.equals(str, str2);
        boolean z10 = false;
        if (!equals) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        if (this.f58469i) {
            if (uVar.E != uVar2.E) {
                i7 |= 1024;
            }
            z10 = (uVar.f10765z == uVar2.f10765z && uVar.A == uVar2.A) ? true : true;
            if (!this.f58466e && z10) {
                i7 |= 512;
            }
            if ((!e2.m.e(mVar) || !e2.m.e(mVar2)) && !Objects.equals(mVar, mVar2)) {
                i7 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f58463a) && !uVar.b(uVar2)) {
                i7 |= 2;
            }
            int i12 = uVar.B;
            if (i12 != -1 && (i11 = uVar.C) != -1 && i12 == uVar2.B && i11 == uVar2.C && z10) {
                i7 |= 2;
            }
            if (i7 == 0 && Objects.equals(uVar2.f10759s, "video/dolby-vision")) {
                Pair b10 = h2.g.b(uVar);
                Pair b11 = h2.g.b(uVar2);
                if (b10 == null || b11 == null || !((Integer) b10.first).equals(b11.first)) {
                    i7 |= 2;
                }
            }
            if (i7 == 0) {
                if (uVar.b(uVar2)) {
                    i10 = 3;
                } else {
                    i10 = 2;
                }
                return new l2.f(this.f58463a, uVar, uVar2, i10, 0);
            }
            uVar3 = uVar;
            uVar4 = uVar2;
        } else {
            uVar3 = uVar;
            uVar4 = uVar2;
            if (uVar3.K != uVar4.K) {
                i7 |= 4096;
            }
            if (uVar3.L != uVar4.L) {
                i7 |= 8192;
            }
            if (uVar3.M != uVar4.M) {
                i7 |= 16384;
            }
            String str3 = this.f58464b;
            if (i7 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair b12 = h2.g.b(uVar3);
                Pair b13 = h2.g.b(uVar4);
                if (b12 != null && b13 != null) {
                    int intValue = ((Integer) b12.first).intValue();
                    int intValue2 = ((Integer) b13.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new l2.f(this.f58463a, uVar3, uVar4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && b12.equals(b13)) {
                        return new l2.f(this.f58463a, uVar3, uVar4, 3, 0);
                    }
                }
            }
            if (i7 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new l2.f(this.f58463a, uVar3, uVar4, 3, 0);
            }
            if (!uVar3.b(uVar4)) {
                i7 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new l2.f(this.f58463a, uVar3, uVar4, 1, 0);
            }
        }
        return new l2.f(this.f58463a, uVar3, uVar4, 0, i7);
    }

    public final boolean c(android.content.Context r21, e2.u r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: u2.o.c(android.content.Context, e2.u, boolean):boolean");
    }

    public final boolean d(e2.u uVar) {
        if (Objects.equals(uVar.f10759s, "audio/flac") && uVar.M == 22 && Build.VERSION.SDK_INT < 34 && this.f58463a.equals("c2.android.flac.decoder")) {
            return false;
        }
        return true;
    }

    public final boolean e(Context context, e2.u uVar) {
        int i7;
        int i10;
        String str = uVar.f10759s;
        String str2 = this.f58464b;
        if ((!str2.equals(str) && !str2.equals(w.c(uVar))) || !c(context, uVar, true) || !d(uVar)) {
            return false;
        }
        if (this.f58469i) {
            int i11 = uVar.f10765z;
            if (i11 > 0 && (i10 = uVar.A) > 0) {
                return g(i11, i10, uVar.D);
            }
        } else {
            int i12 = uVar.L;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i12 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                } else if (!audioCapabilities.isSampleRateSupported(i12)) {
                    h("sampleRate.support, " + i12);
                    return false;
                }
            }
            int i13 = uVar.K;
            if (i13 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i7 = 6;
                    } else if ("audio/eac3".equals(str2)) {
                        i7 = 16;
                    } else {
                        i7 = 30;
                    }
                    h2.a.l("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f58463a + ", [" + maxInputChannelCount + " to " + i7 + "]");
                    maxInputChannelCount = i7;
                }
                if (maxInputChannelCount < i13) {
                    h("channelCount.support, " + i13);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(e2.u uVar) {
        if (this.f58469i) {
            return this.f58466e;
        }
        Pair b10 = h2.g.b(uVar);
        if (b10 != null && ((Integer) b10.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean g(int i7, int i10, double d) {
        int i11;
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            if (i12 >= 29 && ((bool = sc.f4950a) == null || !bool.booleanValue())) {
                i11 = y.b(videoCapabilities, i7, i10, d);
            } else {
                i11 = 0;
            }
            if (i11 != 2) {
                if (i11 == 1) {
                    StringBuilder n10 = i5.c.n("sizeAndRate.cover, ", i7, "x", i10, "@");
                    n10.append(d);
                    h(n10.toString());
                    return false;
                }
            }
            return true;
        }
        if (!a(videoCapabilities, i7, i10, d)) {
            if (i7 < i10) {
                String str = this.f58463a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i10, i7, d)) {
                    StringBuilder n11 = i5.c.n("sizeAndRate.rotated, ", i7, "x", i10, "@");
                    n11.append(d);
                    StringBuilder n12 = e2.n("AssumedSupport [", n11.toString(), "] [", str, ", ");
                    n12.append(this.f58464b);
                    n12.append("] [");
                    n12.append(l0.f13778a);
                    n12.append("]");
                    h2.a.b("MediaCodecInfo", n12.toString());
                    return true;
                }
            }
            StringBuilder n13 = i5.c.n("sizeAndRate.support, ", i7, "x", i10, "@");
            n13.append(d);
            h(n13.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder u10 = p0.u("NoSupport [", str, "] [");
        u10.append(this.f58463a);
        u10.append(", ");
        u10.append(this.f58464b);
        u10.append("] [");
        u10.append(l0.f13778a);
        u10.append("]");
        h2.a.b("MediaCodecInfo", u10.toString());
    }

    public final String toString() {
        return this.f58463a;
    }
}
