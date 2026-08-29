package y4;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import f2.r1;
import f5.d0;
import f5.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t4.e;
import t4.f;
import v5.n;
public final class a extends e {
    public static final Pattern f50468g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean f50469b;
    public final r1 f50470c;
    public LinkedHashMap d;
    public float f50471e;
    public float f50472f;

    public a(List list) {
        super("SsaDecoder");
        this.f50471e = -3.4028235E38f;
        this.f50472f = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.f50469b = true;
            String l10 = d0.l((byte[]) list.get(0));
            f5.a.f(l10.startsWith("Format:"));
            r1 b10 = r1.b(l10);
            b10.getClass();
            this.f50470c = b10;
            e(new w((byte[]) list.get(1)));
            return;
        }
        this.f50469b = false;
        this.f50470c = null;
    }

    public static int d(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j10) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            } else {
                i10 = 0;
                break;
            }
        }
        arrayList.add(i10, Long.valueOf(j10));
        if (i10 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i10 - 1));
        }
        arrayList2.add(i10, arrayList3);
        return i10;
    }

    public static long f(String str) {
        Matcher matcher = f50468g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i10 = d0.f6579a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override
    public final f c(int i10, boolean z10, byte[] bArr) {
        r1 r1Var;
        w wVar;
        r1 r1Var2;
        d dVar;
        float f9;
        int i11;
        int i12;
        float f10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i13;
        int i14;
        int i15;
        float f11;
        float f12;
        float f13;
        boolean z11;
        int i16;
        int i17;
        float f14;
        int i18;
        float f15;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        w wVar2 = new w(bArr, i10);
        boolean z12 = aVar.f50469b;
        if (!z12) {
            aVar.e(wVar2);
        }
        if (z12) {
            r1Var = aVar.f50470c;
        } else {
            r1Var = null;
        }
        while (true) {
            String f16 = wVar2.f(p8.d.f45658c);
            if (f16 != null) {
                if (f16.startsWith("Format:")) {
                    r1Var = r1.b(f16);
                } else {
                    if (f16.startsWith("Dialogue:")) {
                        if (r1Var == null) {
                            f5.a.K("SsaDecoder", "Skipping dialogue line before complete format: ".concat(f16));
                        } else {
                            int i24 = r1Var.f6472e;
                            f5.a.f(f16.startsWith("Dialogue:"));
                            String[] split = f16.substring(9).split(",", i24);
                            if (split.length != i24) {
                                f5.a.K("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(f16));
                            } else {
                                long f17 = f(split[r1Var.f6469a]);
                                if (f17 == -9223372036854775807L) {
                                    f5.a.K("SsaDecoder", "Skipping invalid timing: ".concat(f16));
                                } else {
                                    long f18 = f(split[r1Var.f6470b]);
                                    if (f18 == -9223372036854775807L) {
                                        f5.a.K("SsaDecoder", "Skipping invalid timing: ".concat(f16));
                                    } else {
                                        LinkedHashMap linkedHashMap = aVar.d;
                                        if (linkedHashMap != null && (i23 = r1Var.f6471c) != -1) {
                                            dVar = (d) linkedHashMap.get(split[i23].trim());
                                        } else {
                                            dVar = null;
                                        }
                                        String str = split[r1Var.d];
                                        Matcher matcher = c.f50482a.matcher(str);
                                        PointF pointF = null;
                                        int i25 = -1;
                                        while (matcher.find()) {
                                            w wVar3 = wVar2;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF a2 = c.a(group);
                                                if (a2 != null) {
                                                    pointF = a2;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            try {
                                                Matcher matcher2 = c.d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i22 = d.a(group2);
                                                } else {
                                                    i22 = -1;
                                                }
                                                if (i22 != -1) {
                                                    i25 = i22;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            wVar2 = wVar3;
                                        }
                                        wVar = wVar2;
                                        String replace = c.f50482a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f19 = aVar.f50471e;
                                        float f20 = aVar.f50472f;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (dVar != null) {
                                            boolean z13 = dVar.f50490g;
                                            Integer num = dVar.d;
                                            Integer num2 = dVar.f50487c;
                                            if (num2 != null) {
                                                z11 = z13;
                                                r1Var2 = r1Var;
                                                f9 = f19;
                                                i16 = 33;
                                                i17 = 0;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                z11 = z13;
                                                r1Var2 = r1Var;
                                                f9 = f19;
                                                i16 = 33;
                                                i17 = 0;
                                            }
                                            if (dVar.f50492j == 3 && num != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i17, spannableString.length(), i16);
                                            }
                                            float f21 = dVar.f50488e;
                                            if (f21 != -3.4028235E38f && f20 != -3.4028235E38f) {
                                                f14 = f21 / f20;
                                                i18 = 1;
                                            } else {
                                                f14 = -3.4028235E38f;
                                                i18 = Integer.MIN_VALUE;
                                            }
                                            boolean z14 = dVar.f50489f;
                                            if (z14 && z11) {
                                                f15 = f14;
                                                i19 = i18;
                                                i20 = 33;
                                                i21 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                f15 = f14;
                                                i19 = i18;
                                                i20 = 33;
                                                i21 = 0;
                                                if (z14) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z11) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (dVar.h) {
                                                spannableString.setSpan(new UnderlineSpan(), i21, spannableString.length(), i20);
                                            }
                                            if (dVar.f50491i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i21, spannableString.length(), i20);
                                            }
                                            f10 = f15;
                                            i12 = i19;
                                            i11 = -1;
                                        } else {
                                            r1Var2 = r1Var;
                                            f9 = f19;
                                            i11 = -1;
                                            i12 = Integer.MIN_VALUE;
                                            f10 = -3.4028235E38f;
                                        }
                                        if (i25 != i11) {
                                            i11 = i25;
                                        } else if (dVar != null) {
                                            i11 = dVar.f50486b;
                                        }
                                        switch (i11) {
                                            case 0:
                                            default:
                                                com.google.android.recaptcha.internal.a.s(i11, "Unknown alignment: ", "SsaDecoder");
                                            case -1:
                                                alignment2 = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                alignment2 = alignment;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                alignment2 = alignment;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                alignment2 = alignment;
                                                break;
                                        }
                                        int i26 = Integer.MIN_VALUE;
                                        switch (i11) {
                                            case 0:
                                            default:
                                                com.google.android.recaptcha.internal.a.s(i11, "Unknown alignment: ", "SsaDecoder");
                                            case -1:
                                                i13 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i13 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i13 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i13 = 2;
                                                break;
                                        }
                                        switch (i11) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                com.google.android.recaptcha.internal.a.s(i11, "Unknown alignment: ", "SsaDecoder");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i26 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i26 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i26 = 0;
                                                break;
                                        }
                                        if (pointF != null && f20 != -3.4028235E38f && f9 != -3.4028235E38f) {
                                            f13 = pointF.x / f9;
                                            f12 = pointF.y / f20;
                                        } else {
                                            float f22 = 0.05f;
                                            if (i13 != 0) {
                                                i15 = 1;
                                                if (i13 != 1) {
                                                    i14 = 2;
                                                    if (i13 != 2) {
                                                        f11 = -3.4028235E38f;
                                                    } else {
                                                        f11 = 0.95f;
                                                    }
                                                } else {
                                                    i14 = 2;
                                                    f11 = 0.5f;
                                                }
                                            } else {
                                                i14 = 2;
                                                i15 = 1;
                                                f11 = 0.05f;
                                            }
                                            if (i26 != 0) {
                                                if (i26 != i15) {
                                                    if (i26 != i14) {
                                                        f22 = -3.4028235E38f;
                                                    } else {
                                                        f22 = 0.95f;
                                                    }
                                                } else {
                                                    f22 = 0.5f;
                                                }
                                            }
                                            f12 = f22;
                                            f13 = f11;
                                        }
                                        t4.b bVar = new t4.b(spannableString, alignment2, null, null, f12, 0, i26, f13, i13, i12, f10, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                        int d = d(f18, arrayList2, arrayList);
                                        for (int d10 = d(f17, arrayList2, arrayList); d10 < d; d10++) {
                                            ((List) arrayList.get(d10)).add(bVar);
                                        }
                                        aVar = this;
                                        wVar2 = wVar;
                                        r1Var = r1Var2;
                                    }
                                }
                            }
                        }
                    }
                    wVar = wVar2;
                    r1Var2 = r1Var;
                    aVar = this;
                    wVar2 = wVar;
                    r1Var = r1Var2;
                }
            } else {
                return new n(7, arrayList, arrayList2);
            }
        }
    }

    public final void e(f5.w r39) {
        throw new UnsupportedOperationException("Method not decompiled: y4.a.e(f5.w):void");
    }
}
