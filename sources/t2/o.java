package t2;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import d2.u0;
import g2.n0;
import j$.util.Objects;
public final class o {
    public final String f54852a;
    public final String f54853b;
    public final String f54854c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean f54855e;
    public final boolean f54856f;
    public final boolean f54857g;
    public final boolean h;
    public final boolean f54858i;
    public int f54859j;
    public int f54860k;
    public float f54861l;

    public o(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.f54852a = str;
        this.f54853b = str2;
        this.f54854c = str3;
        this.d = codecCapabilities;
        this.f54857g = z10;
        this.f54855e = z13;
        this.f54856f = z14;
        this.h = z15;
        this.f54858i = u0.m(str2);
        this.f54861l = -3.4028235E38f;
        this.f54859j = -1;
        this.f54860k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i3, int i10, double d) {
        Range<Double> achievableFrameRatesFor;
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(n0.g(i3, widthAlignment) * widthAlignment, n0.g(i10, heightAlignment) * heightAlignment);
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

    public final k2.e b(d2.v vVar, d2.v vVar2) {
        int i3;
        d2.v vVar3;
        d2.v vVar4;
        int i10;
        int i11;
        String str = vVar.f8489s;
        d2.n nVar = vVar.I;
        String str2 = vVar2.f8489s;
        d2.n nVar2 = vVar2.I;
        boolean equals = Objects.equals(str, str2);
        boolean z10 = false;
        if (!equals) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        if (this.f54858i) {
            if (vVar.E != vVar2.E) {
                i3 |= 1024;
            }
            z10 = (vVar.f8495z == vVar2.f8495z && vVar.A == vVar2.A) ? true : true;
            if (!this.f54855e && z10) {
                i3 |= 512;
            }
            if ((!d2.n.e(nVar) || !d2.n.e(nVar2)) && !Objects.equals(nVar, nVar2)) {
                i3 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f54852a) && !vVar.b(vVar2)) {
                i3 |= 2;
            }
            int i12 = vVar.B;
            if (i12 != -1 && (i11 = vVar.C) != -1 && i12 == vVar2.B && i11 == vVar2.C && z10) {
                i3 |= 2;
            }
            if (i3 == 0 && Objects.equals(vVar2.f8489s, "video/dolby-vision")) {
                Pair b10 = g2.h.b(vVar);
                Pair b11 = g2.h.b(vVar2);
                if (b10 == null || b11 == null || !((Integer) b10.first).equals(b11.first)) {
                    i3 |= 2;
                }
            }
            if (i3 == 0) {
                if (vVar.b(vVar2)) {
                    i10 = 3;
                } else {
                    i10 = 2;
                }
                return new k2.e(this.f54852a, vVar, vVar2, i10, 0);
            }
            vVar3 = vVar;
            vVar4 = vVar2;
        } else {
            vVar3 = vVar;
            vVar4 = vVar2;
            if (vVar3.K != vVar4.K) {
                i3 |= 4096;
            }
            if (vVar3.L != vVar4.L) {
                i3 |= 8192;
            }
            if (vVar3.M != vVar4.M) {
                i3 |= 16384;
            }
            String str3 = this.f54853b;
            if (i3 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair b12 = g2.h.b(vVar3);
                Pair b13 = g2.h.b(vVar4);
                if (b12 != null && b13 != null) {
                    int intValue = ((Integer) b12.first).intValue();
                    int intValue2 = ((Integer) b13.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new k2.e(this.f54852a, vVar3, vVar4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && b12.equals(b13)) {
                        return new k2.e(this.f54852a, vVar3, vVar4, 3, 0);
                    }
                }
            }
            if (i3 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new k2.e(this.f54852a, vVar3, vVar4, 3, 0);
            }
            if (!vVar3.b(vVar4)) {
                i3 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i3 |= 2;
            }
            if (i3 == 0) {
                return new k2.e(this.f54852a, vVar3, vVar4, 1, 0);
            }
        }
        return new k2.e(this.f54852a, vVar3, vVar4, 0, i3);
    }

    public final boolean c(android.content.Context r21, d2.v r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: t2.o.c(android.content.Context, d2.v, boolean):boolean");
    }

    public final boolean d(d2.v vVar) {
        if (Objects.equals(vVar.f8489s, "audio/flac") && vVar.M == 22 && Build.VERSION.SDK_INT < 34 && this.f54852a.equals("c2.android.flac.decoder")) {
            return false;
        }
        return true;
    }

    public final boolean e(Context context, d2.v vVar) {
        int i3;
        int i10;
        String str = vVar.f8489s;
        String str2 = this.f54853b;
        if ((!str2.equals(str) && !str2.equals(w.c(vVar))) || !c(context, vVar, true) || !d(vVar)) {
            return false;
        }
        if (this.f54858i) {
            int i11 = vVar.f8495z;
            if (i11 > 0 && (i10 = vVar.A) > 0) {
                return g(i11, i10, vVar.D);
            }
        } else {
            int i12 = vVar.L;
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
            int i13 = vVar.K;
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
                        i3 = 6;
                    } else if ("audio/eac3".equals(str2)) {
                        i3 = 16;
                    } else {
                        i3 = 30;
                    }
                    g2.a.l("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f54852a + ", [" + maxInputChannelCount + " to " + i3 + "]");
                    maxInputChannelCount = i3;
                }
                if (maxInputChannelCount < i13) {
                    h("channelCount.support, " + i13);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(d2.v vVar) {
        if (this.f54858i) {
            return this.f54855e;
        }
        Pair b10 = g2.h.b(vVar);
        if (b10 != null && ((Integer) b10.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean g(int i3, int i10, double d) {
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
            if (i12 >= 29 && ((bool = x7.w.f58488a) == null || !bool.booleanValue())) {
                i11 = d2.d.b(videoCapabilities, i3, i10, d);
            } else {
                i11 = 0;
            }
            if (i11 != 2) {
                if (i11 == 1) {
                    StringBuilder m10 = com.google.android.recaptcha.internal.a.m("sizeAndRate.cover, ", i3, "x", i10, "@");
                    m10.append(d);
                    h(m10.toString());
                    return false;
                }
            }
            return true;
        }
        if (!a(videoCapabilities, i3, i10, d)) {
            if (i3 < i10) {
                String str = this.f54852a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i10, i3, d)) {
                    StringBuilder m11 = com.google.android.recaptcha.internal.a.m("sizeAndRate.rotated, ", i3, "x", i10, "@");
                    m11.append(d);
                    StringBuilder n4 = com.google.android.recaptcha.internal.a.n("AssumedSupport [", m11.toString(), "] [", str, ", ");
                    n4.append(this.f54853b);
                    n4.append("] [");
                    n4.append(n0.f11873a);
                    n4.append("]");
                    g2.a.b("MediaCodecInfo", n4.toString());
                    return true;
                }
            }
            StringBuilder m12 = com.google.android.recaptcha.internal.a.m("sizeAndRate.support, ", i3, "x", i10, "@");
            m12.append(d);
            h(m12.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder u10 = a1.g.u("NoSupport [", str, "] [");
        u10.append(this.f54852a);
        u10.append(", ");
        u10.append(this.f54853b);
        u10.append("] [");
        u10.append(n0.f11873a);
        u10.append("]");
        g2.a.b("MediaCodecInfo", u10.toString());
    }

    public final String toString() {
        return this.f54852a;
    }
}
