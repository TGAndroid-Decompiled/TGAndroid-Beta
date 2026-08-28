package w4;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import d5.f0;
import d5.y;
import f2.u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r4.f;
public final class a extends r4.e {
    public static final Pattern f48735g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean f48736b;
    public final u1 f48737c;
    public LinkedHashMap d;
    public float f48738e;
    public float f48739f;

    public a(List list) {
        super("SsaDecoder");
        this.f48738e = -3.4028235E38f;
        this.f48739f = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.f48736b = true;
            String l10 = f0.l((byte[]) list.get(0));
            d5.a.f(l10.startsWith("Format:"));
            u1 b10 = u1.b(l10);
            b10.getClass();
            this.f48737c = b10;
            e(new y((byte[]) list.get(1)));
            return;
        }
        this.f48736b = false;
        this.f48737c = null;
    }

    public static int d(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i9;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j10) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j10) {
                    i9 = size + 1;
                    break;
                }
                size--;
            } else {
                i9 = 0;
                break;
            }
        }
        arrayList.add(i9, Long.valueOf(j10));
        if (i9 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i9 - 1));
        }
        arrayList2.add(i9, arrayList3);
        return i9;
    }

    public static long f(String str) {
        Matcher matcher = f48735g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i9 = f0.f4349a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override
    public final f c(int i9, boolean z10, byte[] bArr) {
        u1 u1Var;
        y yVar;
        u1 u1Var2;
        d dVar;
        float f10;
        int i10;
        int i11;
        float f11;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i12;
        int i13;
        int i14;
        float f12;
        float f13;
        float f14;
        boolean z11;
        int i15;
        int i16;
        float f15;
        int i17;
        float f16;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        y yVar2 = new y(bArr, i9);
        boolean z12 = aVar.f48736b;
        if (!z12) {
            aVar.e(yVar2);
        }
        if (z12) {
            u1Var = aVar.f48737c;
        } else {
            u1Var = null;
        }
        while (true) {
            String f17 = yVar2.f(n8.d.f18513c);
            if (f17 != null) {
                if (f17.startsWith("Format:")) {
                    u1Var = u1.b(f17);
                } else {
                    if (f17.startsWith("Dialogue:")) {
                        if (u1Var == null) {
                            d5.a.K("SsaDecoder", "Skipping dialogue line before complete format: ".concat(f17));
                        } else {
                            int i23 = u1Var.f5542e;
                            d5.a.f(f17.startsWith("Dialogue:"));
                            String[] split = f17.substring(9).split(",", i23);
                            if (split.length != i23) {
                                d5.a.K("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(f17));
                            } else {
                                long f18 = f(split[u1Var.f5539a]);
                                if (f18 == -9223372036854775807L) {
                                    d5.a.K("SsaDecoder", "Skipping invalid timing: ".concat(f17));
                                } else {
                                    long f19 = f(split[u1Var.f5540b]);
                                    if (f19 == -9223372036854775807L) {
                                        d5.a.K("SsaDecoder", "Skipping invalid timing: ".concat(f17));
                                    } else {
                                        LinkedHashMap linkedHashMap = aVar.d;
                                        if (linkedHashMap != null && (i22 = u1Var.f5541c) != -1) {
                                            dVar = (d) linkedHashMap.get(split[i22].trim());
                                        } else {
                                            dVar = null;
                                        }
                                        String str = split[u1Var.d];
                                        Matcher matcher = c.f48749a.matcher(str);
                                        PointF pointF = null;
                                        int i24 = -1;
                                        while (matcher.find()) {
                                            y yVar3 = yVar2;
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
                                                    i21 = d.a(group2);
                                                } else {
                                                    i21 = -1;
                                                }
                                                if (i21 != -1) {
                                                    i24 = i21;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            yVar2 = yVar3;
                                        }
                                        yVar = yVar2;
                                        String replace = c.f48749a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f20 = aVar.f48738e;
                                        float f21 = aVar.f48739f;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (dVar != null) {
                                            boolean z13 = dVar.f48757g;
                                            Integer num = dVar.d;
                                            Integer num2 = dVar.f48754c;
                                            if (num2 != null) {
                                                z11 = z13;
                                                u1Var2 = u1Var;
                                                f10 = f20;
                                                i15 = 33;
                                                i16 = 0;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                z11 = z13;
                                                u1Var2 = u1Var;
                                                f10 = f20;
                                                i15 = 33;
                                                i16 = 0;
                                            }
                                            if (dVar.f48759j == 3 && num != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i16, spannableString.length(), i15);
                                            }
                                            float f22 = dVar.f48755e;
                                            if (f22 != -3.4028235E38f && f21 != -3.4028235E38f) {
                                                f15 = f22 / f21;
                                                i17 = 1;
                                            } else {
                                                f15 = -3.4028235E38f;
                                                i17 = Integer.MIN_VALUE;
                                            }
                                            boolean z14 = dVar.f48756f;
                                            if (z14 && z11) {
                                                f16 = f15;
                                                i18 = i17;
                                                i19 = 33;
                                                i20 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                f16 = f15;
                                                i18 = i17;
                                                i19 = 33;
                                                i20 = 0;
                                                if (z14) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z11) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (dVar.h) {
                                                spannableString.setSpan(new UnderlineSpan(), i20, spannableString.length(), i19);
                                            }
                                            if (dVar.f48758i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i20, spannableString.length(), i19);
                                            }
                                            f11 = f16;
                                            i11 = i18;
                                            i10 = -1;
                                        } else {
                                            u1Var2 = u1Var;
                                            f10 = f20;
                                            i10 = -1;
                                            i11 = Integer.MIN_VALUE;
                                            f11 = -3.4028235E38f;
                                        }
                                        if (i24 != i10) {
                                            i10 = i24;
                                        } else if (dVar != null) {
                                            i10 = dVar.f48753b;
                                        }
                                        switch (i10) {
                                            case 0:
                                            default:
                                                e2.c.t(i10, "Unknown alignment: ", "SsaDecoder");
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
                                        int i25 = Integer.MIN_VALUE;
                                        switch (i10) {
                                            case 0:
                                            default:
                                                e2.c.t(i10, "Unknown alignment: ", "SsaDecoder");
                                            case -1:
                                                i12 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i12 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i12 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i12 = 2;
                                                break;
                                        }
                                        switch (i10) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                e2.c.t(i10, "Unknown alignment: ", "SsaDecoder");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i25 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i25 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i25 = 0;
                                                break;
                                        }
                                        if (pointF != null && f21 != -3.4028235E38f && f10 != -3.4028235E38f) {
                                            f14 = pointF.x / f10;
                                            f13 = pointF.y / f21;
                                        } else {
                                            float f23 = 0.05f;
                                            if (i12 != 0) {
                                                i14 = 1;
                                                if (i12 != 1) {
                                                    i13 = 2;
                                                    if (i12 != 2) {
                                                        f12 = -3.4028235E38f;
                                                    } else {
                                                        f12 = 0.95f;
                                                    }
                                                } else {
                                                    i13 = 2;
                                                    f12 = 0.5f;
                                                }
                                            } else {
                                                i13 = 2;
                                                i14 = 1;
                                                f12 = 0.05f;
                                            }
                                            if (i25 != 0) {
                                                if (i25 != i14) {
                                                    if (i25 != i13) {
                                                        f23 = -3.4028235E38f;
                                                    } else {
                                                        f23 = 0.95f;
                                                    }
                                                } else {
                                                    f23 = 0.5f;
                                                }
                                            }
                                            f13 = f23;
                                            f14 = f12;
                                        }
                                        r4.b bVar = new r4.b(spannableString, alignment2, null, null, f13, 0, i25, f14, i12, i11, f11, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                        int d = d(f19, arrayList2, arrayList);
                                        for (int d9 = d(f18, arrayList2, arrayList); d9 < d; d9++) {
                                            ((List) arrayList.get(d9)).add(bVar);
                                        }
                                        aVar = this;
                                        yVar2 = yVar;
                                        u1Var = u1Var2;
                                    }
                                }
                            }
                        }
                    }
                    yVar = yVar2;
                    u1Var2 = u1Var;
                    aVar = this;
                    yVar2 = yVar;
                    u1Var = u1Var2;
                }
            } else {
                return new e(0, arrayList, arrayList2);
            }
        }
    }

    public final void e(d5.y r39) {
        throw new UnsupportedOperationException("Method not decompiled: w4.a.e(d5.y):void");
    }
}
