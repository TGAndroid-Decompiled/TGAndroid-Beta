package r2;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import b2.v0;
import e2.m0;
import j$.util.Objects;
import w7.u6;
public final class o {
    public final String f44945a;
    public final String f44946b;
    public final String f44947c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f44948f;
    public final boolean f44949g;
    public final boolean h;
    public final boolean f44950i;
    public int f44951j;
    public int f44952k;
    public float f44953l;

    public o(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.f44945a = str;
        this.f44946b = str2;
        this.f44947c = str3;
        this.d = codecCapabilities;
        this.f44949g = z10;
        this.e = z13;
        this.f44948f = z14;
        this.h = z15;
        this.f44950i = v0.m(str2);
        this.f44953l = -3.4028235E38f;
        this.f44951j = -1;
        this.f44952k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d) {
        Range<Double> achievableFrameRatesFor;
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(m0.g(i10, widthAlignment) * widthAlignment, m0.g(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            double floor = Math.floor(d);
            if (videoCapabilities.areSizeAndRateSupported(i12, i13, floor)) {
                if (Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i12, i13)) == null || floor <= achievableFrameRatesFor.getUpper().doubleValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return videoCapabilities.isSizeSupported(i12, i13);
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

    public final i2.g b(b2.w wVar, b2.w wVar2) {
        int i10;
        b2.w wVar3;
        b2.w wVar4;
        int i11;
        int i12;
        String str = wVar.f4128s;
        b2.n nVar = wVar.I;
        String str2 = wVar2.f4128s;
        b2.n nVar2 = wVar2.I;
        boolean equals = Objects.equals(str, str2);
        boolean z10 = false;
        if (!equals) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (this.f44950i) {
            if (wVar.E != wVar2.E) {
                i10 |= 1024;
            }
            z10 = (wVar.f4134z == wVar2.f4134z && wVar.A == wVar2.A) ? true : true;
            if (!this.e && z10) {
                i10 |= 512;
            }
            if ((!b2.n.e(nVar) || !b2.n.e(nVar2)) && !Objects.equals(nVar, nVar2)) {
                i10 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f44945a) && !wVar.b(wVar2)) {
                i10 |= 2;
            }
            int i13 = wVar.B;
            if (i13 != -1 && (i12 = wVar.C) != -1 && i13 == wVar2.B && i12 == wVar2.C && z10) {
                i10 |= 2;
            }
            if (i10 == 0 && Objects.equals(wVar2.f4128s, "video/dolby-vision")) {
                Pair b10 = e2.g.b(wVar);
                Pair b11 = e2.g.b(wVar2);
                if (b10 == null || b11 == null || !((Integer) b10.first).equals(b11.first)) {
                    i10 |= 2;
                }
            }
            if (i10 == 0) {
                if (wVar.b(wVar2)) {
                    i11 = 3;
                } else {
                    i11 = 2;
                }
                return new i2.g(this.f44945a, wVar, wVar2, i11, 0);
            }
            wVar3 = wVar;
            wVar4 = wVar2;
        } else {
            wVar3 = wVar;
            wVar4 = wVar2;
            if (wVar3.K != wVar4.K) {
                i10 |= 4096;
            }
            if (wVar3.L != wVar4.L) {
                i10 |= 8192;
            }
            if (wVar3.M != wVar4.M) {
                i10 |= 16384;
            }
            String str3 = this.f44946b;
            if (i10 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair b12 = e2.g.b(wVar3);
                Pair b13 = e2.g.b(wVar4);
                if (b12 != null && b13 != null) {
                    int intValue = ((Integer) b12.first).intValue();
                    int intValue2 = ((Integer) b13.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new i2.g(this.f44945a, wVar3, wVar4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && b12.equals(b13)) {
                        return new i2.g(this.f44945a, wVar3, wVar4, 3, 0);
                    }
                }
            }
            if (i10 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new i2.g(this.f44945a, wVar3, wVar4, 3, 0);
            }
            if (!wVar3.b(wVar4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new i2.g(this.f44945a, wVar3, wVar4, 1, 0);
            }
        }
        return new i2.g(this.f44945a, wVar3, wVar4, 0, i10);
    }

    public final boolean c(android.content.Context r21, b2.w r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: r2.o.c(android.content.Context, b2.w, boolean):boolean");
    }

    public final boolean d(b2.w wVar) {
        if (Objects.equals(wVar.f4128s, "audio/flac") && wVar.M == 22 && Build.VERSION.SDK_INT < 34 && this.f44945a.equals("c2.android.flac.decoder")) {
            return false;
        }
        return true;
    }

    public final boolean e(Context context, b2.w wVar) {
        int i10;
        int i11;
        String str = wVar.f4128s;
        String str2 = this.f44946b;
        if ((!str2.equals(str) && !str2.equals(w.c(wVar))) || !c(context, wVar, true) || !d(wVar)) {
            return false;
        }
        if (this.f44950i) {
            int i12 = wVar.f4134z;
            if (i12 > 0 && (i11 = wVar.A) > 0) {
                return g(i12, i11, wVar.D);
            }
        } else {
            int i13 = wVar.L;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i13 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                } else if (!audioCapabilities.isSampleRateSupported(i13)) {
                    h("sampleRate.support, " + i13);
                    return false;
                }
            }
            int i14 = wVar.K;
            if (i14 != -1) {
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
                        i10 = 6;
                    } else if ("audio/eac3".equals(str2)) {
                        i10 = 16;
                    } else {
                        i10 = 30;
                    }
                    e2.a.l("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f44945a + ", [" + maxInputChannelCount + " to " + i10 + "]");
                    maxInputChannelCount = i10;
                }
                if (maxInputChannelCount < i14) {
                    h("channelCount.support, " + i14);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(b2.w wVar) {
        if (this.f44950i) {
            return this.e;
        }
        Pair b10 = e2.g.b(wVar);
        if (b10 != null && ((Integer) b10.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean g(int i10, int i11, double d) {
        int i12;
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
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            if (i13 >= 29 && ((bool = u6.f48846a) == null || !bool.booleanValue())) {
                i12 = b2.d.c(videoCapabilities, i10, i11, d);
            } else {
                i12 = 0;
            }
            if (i12 != 2) {
                if (i12 == 1) {
                    StringBuilder m10 = i2.e.m("sizeAndRate.cover, ", i10, "x", i11, "@");
                    m10.append(d);
                    h(m10.toString());
                    return false;
                }
            }
            return true;
        }
        if (!a(videoCapabilities, i10, i11, d)) {
            if (i10 < i11) {
                String str = this.f44945a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i11, i10, d)) {
                    StringBuilder m11 = i2.e.m("sizeAndRate.rotated, ", i10, "x", i11, "@");
                    m11.append(d);
                    StringBuilder w9 = a1.g.w("AssumedSupport [", m11.toString(), "] [", str, ", ");
                    w9.append(this.f44946b);
                    w9.append("] [");
                    w9.append(m0.f8252a);
                    w9.append("]");
                    e2.a.b("MediaCodecInfo", w9.toString());
                    return true;
                }
            }
            StringBuilder m12 = i2.e.m("sizeAndRate.support, ", i10, "x", i11, "@");
            m12.append(d);
            h(m12.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder v = a1.g.v("NoSupport [", str, "] [");
        v.append(this.f44945a);
        v.append(", ");
        v.append(this.f44946b);
        v.append("] [");
        v.append(m0.f8252a);
        v.append("]");
        e2.a.b("MediaCodecInfo", v.toString());
    }

    public final String toString() {
        return this.f44945a;
    }
}
