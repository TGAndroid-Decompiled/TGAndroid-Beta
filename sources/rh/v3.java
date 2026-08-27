package rh;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import h7.b7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.yz0;

public abstract class v3 {
    public static void A(java.util.ArrayList r31, java.util.ArrayList r32, java.util.Map r33) {
        throw new UnsupportedOperationException("Method not decompiled: rh.v3.A(java.util.ArrayList, java.util.ArrayList, java.util.Map):void");
    }

    public static a B(u3 u3Var, boolean z10) {
        TL_iv.PageBlock pageblockslideshow = z10 ? new TL_iv.pageBlockSlideshow() : new TL_iv.pageBlockCollage();
        ArrayList arrayListG3 = p3.g3(pageblockslideshow);
        ArrayList arrayList = u3Var.f47501e;
        int size = arrayList.size();
        CharSequence charSequenceW = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u3 u3Var2 = (u3) obj;
            if (!u3Var2.f47499b) {
                if ("figcaption".equals(u3Var2.f47498a)) {
                    charSequenceW = w(u3Var2);
                } else {
                    boolean zEquals = "video".equals(u3Var2.f47498a);
                    if (zEquals || "img".equals(u3Var2.f47498a)) {
                        long jE = E(u3Var2.a("src"));
                        if (jE > 0) {
                            TL_iv.PageBlock pageBlockY = y(jE, zEquals, u3Var2.b("data-spoiler"));
                            J(pageBlockY);
                            arrayListG3.add(pageBlockY);
                        }
                    }
                }
            }
        }
        if (arrayListG3.isEmpty()) {
            return null;
        }
        if (arrayListG3.size() == 1) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayListG3.get(0);
            if (charSequenceW != null && charSequenceW.length() > 0) {
                I(pageBlock, charSequenceW);
            }
            return new a(pageBlock, 0, 0);
        }
        J(pageblockslideshow);
        if (charSequenceW != null && charSequenceW.length() > 0) {
            I(pageblockslideshow, charSequenceW);
        }
        return new a(pageblockslideshow, 0, 0);
    }

    public static int C(int i10, String str) {
        if (str == null) {
            return i10;
        }
        try {
            return Integer.parseInt(str.trim());
        } catch (Exception unused) {
            return i10;
        }
    }

    public static void D(u3 u3Var, ArrayList arrayList, int i10, boolean z10) {
        String strA;
        int i11 = i10 + 1;
        ArrayList arrayList2 = u3Var.f47501e;
        int size = arrayList2.size();
        int i12 = 1;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            u3 u3Var2 = (u3) obj;
            if (!u3Var2.f47499b && "li".equals(u3Var2.f47498a)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = u3Var2.f47501e;
                int i14 = 0;
                for (int size2 = arrayList4.size(); i14 < size2; size2 = size2) {
                    int i15 = i14 + 1;
                    u3 u3Var3 = (u3) arrayList4.get(i14);
                    if (u3Var3.f47499b || !("ul".equals(u3Var3.f47498a) || "ol".equals(u3Var3.f47498a))) {
                        if (u3Var3.f47499b) {
                            spannableStringBuilder.append((CharSequence) q(u3Var3.f47500c));
                        } else {
                            h(spannableStringBuilder, u3Var3, 0, null, 0L);
                        }
                        arrayList4 = arrayList4;
                        i14 = i15;
                    } else {
                        arrayList3.add(u3Var3);
                    }
                    arrayList4 = arrayList4;
                    i14 = i15;
                }
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = v5.f(L(spannableStringBuilder));
                a aVar = new a(pageblockparagraph, i11, z10 ? i12 : 0);
                aVar.f47030e = u3Var2.b("data-checkbox") || ((strA = u3Var2.a("class")) != null && strA.toLowerCase().contains("checkbox"));
                aVar.f47031f = u3Var2.b("data-checked");
                arrayList.add(aVar);
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj2 = arrayList3.get(i16);
                    i16++;
                    u3 u3Var4 = (u3) obj2;
                    D(u3Var4, arrayList, i11, "ol".equals(u3Var4.f47498a));
                }
                i12++;
            }
        }
    }

    public static long E(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str.trim());
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static void F(StringBuilder sb2, List list, int[] iArr, int i10, int i11, int i12, int i13, int i14, o6.c cVar, boolean z10, int i15, Map map) {
        int i16;
        List list2;
        String str;
        StringBuilder sb3 = sb2;
        List list3 = list;
        int i17 = i10;
        o6.c cVar2 = cVar;
        int i18 = i15;
        ArrayList arrayList = cVar2.f19355a;
        while (true) {
            int i19 = iArr[0];
            if (i19 > i17) {
                return;
            }
            a aVar = (a) list3.get(i19);
            if (!aVar.f47033i) {
                if (aVar.f47035k.size() > i18) {
                    cVar2.b(sb3);
                    Long l10 = (Long) ((a) list3.get(iArr[0])).f47035k.get(i18);
                    long jLongValue = l10.longValue();
                    int i20 = iArr[0];
                    while (true) {
                        int i21 = i20 + 1;
                        if (i21 > i17) {
                            break;
                        }
                        a aVar2 = (a) list3.get(i21);
                        if (aVar2.f47035k.size() <= i18 || ((Long) aVar2.f47035k.get(i18)).longValue() != jLongValue) {
                            break;
                        } else {
                            i20 = i21;
                        }
                    }
                    sb3.append("<blockquote>");
                    o6.c cVar3 = new o6.c(1);
                    F(sb3, list3, iArr, i20, i11, i12, i13, i14, cVar3, z10, i18 + 1, map);
                    cVar3.b(sb3);
                    c(sb3, map != null ? k((TL_iv.RichText) map.get(l10)) : null);
                    sb3.append("</blockquote>");
                    i17 = i10;
                    i18 = i15;
                } else {
                    if (p3.x3(aVar)) {
                        cVar2.b(sb3);
                        a aVar3 = (a) list3.get(iArr[0]);
                        sb3.append(((TL_iv.pageBlockDetails) aVar3.f47028b).open ? "<details open>" : "<details>");
                        sb3.append("<summary>");
                        g(sb3, K(aVar3, iArr[0], i11, i12, i13, i14));
                        sb3.append("</summary>");
                        iArr[0] = iArr[0] + 1;
                        o6.c cVar4 = new o6.c(1);
                        F(sb3, list3, iArr, i10, i11, i12, i13, i14, cVar4, true, i15, map);
                        list2 = list3;
                        i16 = i10;
                        cVar4.b(sb3);
                        int i22 = iArr[0];
                        if (i22 <= i16 && i22 < list2.size() && ((a) list2.get(iArr[0])).f47033i) {
                            iArr[0] = iArr[0] + 1;
                        }
                        sb3.append("</details>");
                    } else {
                        i16 = i10;
                        list2 = list3;
                        if (aVar.f47029c <= 0 || l(aVar.f47028b) == null) {
                            cVar2.b(sb3);
                            int i23 = iArr[0];
                            TL_iv.PageBlock pageBlock = aVar.f47028b;
                            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                sb3.append("<hr>");
                            } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                                sb3.append("<div class=\"button-row\"");
                                if (pageblockbuttonrow.align_left) {
                                    sb3.append(" data-align=\"left\"");
                                } else if (pageblockbuttonrow.align_center) {
                                    sb3.append(" data-align=\"center\"");
                                } else if (pageblockbuttonrow.align_right) {
                                    sb3.append(" data-align=\"right\"");
                                } else {
                                    sb3.append(" data-align=\"fill\"");
                                }
                                sb3.append(">");
                                ArrayList<TL_keyboard.PageButton> arrayList2 = pageblockbuttonrow.buttons;
                                if (arrayList2 != null) {
                                    int size = arrayList2.size();
                                    int i24 = 0;
                                    while (i24 < size) {
                                        TL_keyboard.PageButton pageButton = arrayList2.get(i24);
                                        i24++;
                                        TL_keyboard.PageButton pageButton2 = pageButton;
                                        if (pageButton2 != null) {
                                            d(sb3, pageButton2.text, pageButton2.type, pageButton2.style);
                                        }
                                    }
                                }
                                sb3.append("</div>");
                            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                                H(sb3, (TL_iv.pageBlockTable) pageBlock);
                            } else {
                                if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                                    G(sb3, "img", ((TL_iv.pageBlockPhoto) pageBlock).photo_id, aVar.f47032g, pageBlock);
                                    sb3 = sb2;
                                } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                                    sb3 = sb2;
                                    G(sb3, "video", ((TL_iv.pageBlockVideo) pageBlock).video_id, aVar.f47032g, pageBlock);
                                } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                                    sb3 = sb2;
                                    G(sb3, "audio", ((TL_iv.pageBlockAudio) pageBlock).audio_id, aVar.f47032g, pageBlock);
                                } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                                    sb3 = sb2;
                                    G(sb3, "document", ((TL_iv.pageBlockDocument) pageBlock).document_id, aVar.f47032g, pageBlock);
                                } else {
                                    sb3 = sb2;
                                    String str2 = "<figcaption>";
                                    if (p3.B3(pageBlock)) {
                                        String str3 = pageBlock instanceof TL_iv.pageBlockSlideshow ? "slideshow" : "collage";
                                        sb3.append("<div class=\"");
                                        sb3.append(str3);
                                        sb3.append("\">");
                                        ArrayList arrayListG3 = p3.g3(pageBlock);
                                        if (arrayListG3 != null) {
                                            int i25 = 0;
                                            while (i25 < arrayListG3.size()) {
                                                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) arrayListG3.get(i25);
                                                ArrayList arrayList3 = aVar.h;
                                                s sVar = (arrayList3 == null || i25 >= arrayList3.size()) ? null : (s) aVar.h.get(i25);
                                                if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
                                                    long j10 = ((TL_iv.pageBlockVideo) pageBlock2).video_id;
                                                    if (j10 != 0) {
                                                        str = str2;
                                                        i(sb3, "video", j10, sVar, pageBlock2);
                                                    } else {
                                                        str = str2;
                                                    }
                                                } else {
                                                    str = str2;
                                                    if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
                                                        long j11 = ((TL_iv.pageBlockPhoto) pageBlock2).photo_id;
                                                        if (j11 != 0) {
                                                            sb3 = sb2;
                                                            i(sb3, "img", j11, sVar, pageBlock2);
                                                        }
                                                    }
                                                    i25++;
                                                    str2 = str;
                                                }
                                                sb3 = sb2;
                                                i25++;
                                                str2 = str;
                                            }
                                        }
                                        String str4 = str2;
                                        SpannableStringBuilder spannableStringBuilderO = o(pageBlock);
                                        if (spannableStringBuilderO != null && spannableStringBuilderO.length() > 0) {
                                            sb3.append(str4);
                                            g(sb3, spannableStringBuilderO);
                                            sb3.append("</figcaption>");
                                        }
                                        sb3.append("</div>");
                                    } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                                        SpannableStringBuilder spannableStringBuilderO2 = o(pageblockmap);
                                        boolean z11 = spannableStringBuilderO2 != null && spannableStringBuilderO2.length() > 0;
                                        if (z11) {
                                            sb3.append("<figure>");
                                        }
                                        sb3.append("<location");
                                        if (pageblockmap.geo != null) {
                                            sb3.append(" lat=\"");
                                            sb3.append(pageblockmap.geo.lat);
                                            sb3.append('\"');
                                            sb3.append(" long=\"");
                                            sb3.append(pageblockmap.geo._long);
                                            sb3.append('\"');
                                            if (pageblockmap.geo.access_hash != 0) {
                                                sb3.append(" access=\"");
                                                sb3.append(pageblockmap.geo.access_hash);
                                                sb3.append('\"');
                                            }
                                        }
                                        if (pageblockmap.zoom != 0) {
                                            sb3.append(" zoom=\"");
                                            sb3.append(pageblockmap.zoom);
                                            sb3.append('\"');
                                        }
                                        if (pageblockmap.f22603w != 0) {
                                            sb3.append(" w=\"");
                                            sb3.append(pageblockmap.f22603w);
                                            sb3.append('\"');
                                        }
                                        if (pageblockmap.h != 0) {
                                            sb3.append(" h=\"");
                                            sb3.append(pageblockmap.h);
                                            sb3.append('\"');
                                        }
                                        sb3.append(" />");
                                        if (z11) {
                                            sb3.append("<figcaption>");
                                            g(sb3, spannableStringBuilderO2);
                                            sb3.append("</figcaption></figure>");
                                        }
                                    } else {
                                        String strL = l(pageBlock);
                                        if (strL == null) {
                                            SpannableStringBuilder spannableStringBuilderO3 = o(pageBlock);
                                            if (spannableStringBuilderO3 != null && spannableStringBuilderO3.length() > 0) {
                                                sb3.append("<p>");
                                                g(sb3, spannableStringBuilderO3);
                                                sb3.append("</p>");
                                            }
                                        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                            String str5 = ((TL_iv.pageBlockPreformatted) pageBlock).language;
                                            if (TextUtils.isEmpty(str5)) {
                                                sb3.append("<pre>");
                                            } else {
                                                sb3.append("<pre language=\"");
                                                sb3.append(s(str5));
                                                sb3.append("\">");
                                            }
                                            g(sb3, K(aVar, i23, i11, i12, i13, i14));
                                            sb3.append("</pre>");
                                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                                            sb3.append("<blockquote class=\"pull\">");
                                            g(sb3, K(aVar, i23, i11, i12, i13, i14));
                                            c(sb3, k(((TL_iv.pageBlockPullquote) pageBlock).caption));
                                            sb3.append("</blockquote>");
                                        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                                            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                                            if (pageblockblockquote.collapsed) {
                                                sb3.append("<blockquote collapsed>");
                                            } else {
                                                sb3.append("<blockquote>");
                                            }
                                            g(sb3, K(aVar, i23, i11, i12, i13, i14));
                                            c(sb3, k(pageblockblockquote.caption));
                                            sb3.append("</blockquote>");
                                        } else {
                                            sb3.append('<');
                                            sb3.append(strL);
                                            sb3.append('>');
                                            g(sb3, K(aVar, i23, i11, i12, i13, i14));
                                            sb3.append("</");
                                            sb3.append(strL);
                                            sb3.append('>');
                                        }
                                    }
                                }
                                iArr[0] = iArr[0] + 1;
                                cVar2 = cVar;
                            }
                            iArr[0] = iArr[0] + 1;
                            cVar2 = cVar;
                        } else {
                            int i26 = aVar.f47029c;
                            boolean z12 = aVar.d > 0;
                            while (arrayList.size() > i26) {
                                cVar2.a(sb3);
                            }
                            while (true) {
                                String str6 = "<ul>";
                                if (arrayList.size() >= i26) {
                                    break;
                                }
                                if (z12) {
                                    str6 = "<ol>";
                                }
                                sb3.append(str6);
                                arrayList.add(Boolean.valueOf(z12));
                            }
                            if (!arrayList.isEmpty() && ((Boolean) i0.a.i(1, arrayList)).booleanValue() != z12) {
                                cVar2.a(sb3);
                                sb3.append(z12 ? "<ol>" : "<ul>");
                                arrayList.add(Boolean.valueOf(z12));
                            }
                            sb3.append("<li>");
                            g(sb3, K(aVar, iArr[0], i11, i12, i13, i14));
                            sb3.append("</li>");
                            iArr[0] = iArr[0] + 1;
                        }
                    }
                    i18 = i15;
                    list3 = list2;
                    i17 = i16;
                }
            } else if (z10) {
                return;
            } else {
                iArr[0] = iArr[0] + 1;
            }
        }
    }

    public static void G(StringBuilder sb2, String str, long j10, s sVar, TL_iv.PageBlock pageBlock) {
        if (j10 == 0) {
            return;
        }
        SpannableStringBuilder spannableStringBuilderO = o(pageBlock);
        boolean z10 = spannableStringBuilderO != null && spannableStringBuilderO.length() > 0;
        if (z10) {
            sb2.append("<figure>");
        }
        i(sb2, str, j10, sVar, pageBlock);
        if (z10) {
            sb2.append("<figcaption>");
            g(sb2, spannableStringBuilderO);
            sb2.append("</figcaption></figure>");
        }
    }

    public static void H(StringBuilder sb2, TL_iv.pageBlockTable pageblocktable) {
        ArrayList<TL_iv.pageTableCell> arrayList;
        String str;
        String str2;
        sb2.append("<table");
        if (pageblocktable.bordered) {
            sb2.append(" border=\"1\"");
        }
        if (pageblocktable.striped || pageblocktable.compact) {
            sb2.append(" class=\"");
            if (pageblocktable.striped) {
                sb2.append("striped");
            }
            if (pageblocktable.striped && pageblocktable.compact) {
                sb2.append(' ');
            }
            if (pageblocktable.compact) {
                sb2.append("compact");
            }
            sb2.append('\"');
        }
        sb2.append('>');
        TL_iv.RichText richText = pageblocktable.title;
        SpannableStringBuilder spannableStringBuilderR = richText != null ? v5.r(richText, null, true) : null;
        if (spannableStringBuilderR != null && spannableStringBuilderR.length() > 0) {
            sb2.append("<caption>");
            g(sb2, spannableStringBuilderR);
            sb2.append("</caption>");
        }
        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TL_iv.pageTableRow pagetablerow = arrayList2.get(i10);
                i10++;
                TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                sb2.append("<tr>");
                if (pagetablerow2 != null && (arrayList = pagetablerow2.cells) != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        TL_iv.pageTableCell pagetablecell = arrayList.get(i11);
                        i11++;
                        TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                        if (pagetablecell2 != null) {
                            String str3 = pagetablecell2.header ? "th" : "td";
                            sb2.append('<');
                            sb2.append(str3);
                            int i12 = pagetablecell2.colspan;
                            if (i12 <= 1) {
                                i12 = 0;
                            }
                            if (i12 > 0) {
                                sb2.append(" colspan=\"");
                                sb2.append(i12);
                                sb2.append('\"');
                            }
                            int i13 = pagetablecell2.rowspan;
                            if (i13 <= 1) {
                                i13 = 0;
                            }
                            if (i13 > 0) {
                                sb2.append(" rowspan=\"");
                                sb2.append(i13);
                                sb2.append('\"');
                            }
                            if (pagetablecell2.align_right) {
                                str = "right";
                            } else {
                                str = pagetablecell2.align_center ? "center" : null;
                            }
                            if (str != null) {
                                sb2.append(" align=\"");
                                sb2.append(str);
                                sb2.append('\"');
                            }
                            if (pagetablecell2.valign_bottom) {
                                str2 = "bottom";
                            } else {
                                str2 = pagetablecell2.valign_middle ? "middle" : null;
                            }
                            if (str2 != null) {
                                sb2.append(" valign=\"");
                                sb2.append(str2);
                                sb2.append('\"');
                            }
                            sb2.append('>');
                            g(sb2, x5.h(pagetablecell2));
                            sb2.append("</");
                            sb2.append(str3);
                            sb2.append('>');
                        }
                    }
                }
                sb2.append("</tr>");
            }
        }
        sb2.append("</table>");
    }

    public static void I(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = v5.f(charSequence);
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static void J(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = new TL_iv.textEmpty();
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static CharSequence K(a aVar, int i10, int i11, int i12, int i13, int i14) {
        CharSequence charSequenceR = p3.x3(aVar) ? v5.r(((TL_iv.pageBlockDetails) aVar.f47028b).title, null, true) : t5.A(aVar.f47028b);
        if (charSequenceR == null) {
            charSequenceR = "";
        }
        int length = charSequenceR.length();
        int iMax = i10 == i11 ? Math.max(0, Math.min(i13, length)) : 0;
        int iMax2 = i10 == i12 ? Math.max(0, Math.min(i14, length)) : length;
        if (iMax > iMax2) {
            int i15 = iMax;
            iMax = iMax2;
            iMax2 = i15;
        }
        return (iMax == 0 && iMax2 == length) ? charSequenceR : charSequenceR.subSequence(iMax, iMax2);
    }

    public static CharSequence L(SpannableStringBuilder spannableStringBuilder) {
        char cCharAt;
        int length = spannableStringBuilder.length();
        int i10 = 0;
        while (i10 < length && ((cCharAt = spannableStringBuilder.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\t' || cCharAt == '\r')) {
            i10++;
        }
        while (length > i10) {
            char cCharAt2 = spannableStringBuilder.charAt(length - 1);
            if (cCharAt2 != ' ' && cCharAt2 != '\n' && cCharAt2 != '\t' && cCharAt2 != '\r') {
                break;
            }
            length--;
        }
        return (i10 == 0 && length == spannableStringBuilder.length()) ? spannableStringBuilder : spannableStringBuilder.subSequence(i10, length);
    }

    public static void a(ArrayList arrayList, a aVar) {
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    public static void b(ArrayList arrayList, TL_iv.PageBlock pageBlock, u3 u3Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, u3Var, 0, null, 0L);
        t5.e(pageBlock, L(spannableStringBuilder));
        arrayList.add(new a(pageBlock, 0, 0));
    }

    public static void c(StringBuilder sb2, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null || spannableStringBuilder.length() == 0) {
            return;
        }
        sb2.append("<cite>");
        g(sb2, spannableStringBuilder);
        sb2.append("</cite>");
    }

    public static void d(StringBuilder sb2, TL_iv.RichText richText, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle) {
        String str;
        if (c4.c(inlineButtonType)) {
            sb2.append("<button");
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                sb2.append(" data-type=\"url\" data-url=\"");
                sb2.append(s(((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url));
                sb2.append("\"");
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                sb2.append(" data-type=\"copy\" data-copy-text=\"");
                sb2.append(s(((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text));
                sb2.append("\"");
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                sb2.append(" data-type=\"user-profile\" data-user-id=\"");
                sb2.append(((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id);
                sb2.append("\"");
            }
            if (richButtonStyle != null) {
                if (richButtonStyle.bg_primary) {
                    str = "primary";
                } else if (richButtonStyle.bg_danger) {
                    str = "danger";
                } else {
                    str = richButtonStyle.bg_success ? "success" : "default";
                }
                sb2.append(" data-style=\"");
                sb2.append(str);
                sb2.append("\"");
            }
            sb2.append(">");
            g(sb2, v5.r(richText, null, true));
            sb2.append("</button>");
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, u3 u3Var, int i10, String str, long j10) {
        SpannableStringBuilder spannableStringBuilder2;
        int i11;
        String str2;
        long j11;
        ArrayList arrayList = u3Var.f47501e;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            u3 u3Var2 = (u3) obj;
            if (u3Var2.f47499b) {
                spannableStringBuilder2 = spannableStringBuilder;
                i11 = i10;
                str2 = str;
                j11 = j10;
                j(spannableStringBuilder2, q(u3Var2.f47500c), i11, str2, j11);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                i11 = i10;
                str2 = str;
                j11 = j10;
                h(spannableStringBuilder2, u3Var2, i11, str2, j11);
            }
            spannableStringBuilder = spannableStringBuilder2;
            i10 = i11;
            str = str2;
            j10 = j11;
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, u3 u3Var) {
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList = u3Var.f47501e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u3 u3Var2 = (u3) obj;
            if (u3Var2.f47499b) {
                spannableStringBuilder2 = spannableStringBuilder;
                j(spannableStringBuilder2, q(u3Var2.f47500c), 0, null, 0L);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                if (!"cite".equals(u3Var2.f47498a)) {
                    h(spannableStringBuilder2, u3Var2, 0, null, 0L);
                }
            }
            spannableStringBuilder = spannableStringBuilder2;
        }
    }

    public static void g(StringBuilder sb2, CharSequence charSequence) {
        int spanEnd;
        c4 c4Var;
        long documentId;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        char c10 = 0;
        if (!(charSequence instanceof Spanned)) {
            r(sb2, charSequence, 0, charSequence.length());
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        int length = charSequence.length();
        int iMin = 0;
        while (iMin < length) {
            c4[] c4VarArr = (c4[]) spanned.getSpans(iMin, Math.min(length, iMin + 1), c4.class);
            int length2 = c4VarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    spanEnd = -1;
                    c4Var = null;
                    break;
                }
                c4Var = c4VarArr[i10];
                int spanStart = spanned.getSpanStart(c4Var);
                spanEnd = spanned.getSpanEnd(c4Var);
                if (spanStart <= iMin && spanEnd > iMin) {
                    break;
                } else {
                    i10++;
                }
            }
            if (c4Var != null) {
                TL_iv.textButton textbutton = c4Var.f47088a;
                if (textbutton != null && c4.c(textbutton.type)) {
                    d(sb2, textbutton.text, textbutton.type, textbutton.style);
                }
                iMin = Math.min(length, spanEnd);
            } else {
                int iNextSpanTransition = spanned.nextSpanTransition(iMin, length, CharacterStyle.class);
                int i11 = 0;
                for (yz0 yz0Var : (yz0[]) spanned.getSpans(iMin, iNextSpanTransition, yz0.class)) {
                    xz0 xz0Var = yz0Var.f35101b;
                    if (xz0Var != null) {
                        i11 |= xz0Var.f34734a;
                    }
                }
                t41[] t41VarArr = (t41[]) spanned.getSpans(iMin, iNextSpanTransition, t41.class);
                String url = t41VarArr.length > 0 ? t41VarArr[c10].getURL() : null;
                org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(iMin, iNextSpanTransition, org.telegram.ui.Components.t5.class);
                if (t5VarArr.length > 0) {
                    org.telegram.ui.Components.t5 t5Var = t5VarArr[c10];
                    if (t5Var.standard) {
                        documentId = 0;
                    } else {
                        documentId = t5Var.getDocumentId();
                    }
                } else {
                    documentId = 0;
                }
                int i12 = i11 & 256;
                if (i12 != 0) {
                    sb2.append("<spoiler>");
                }
                int i13 = i11 & 1;
                if (i13 != 0) {
                    sb2.append("<b>");
                }
                int i14 = i11 & 2;
                if (i14 != 0) {
                    sb2.append("<i>");
                }
                int i15 = i11 & 16;
                if (i15 != 0) {
                    sb2.append("<u>");
                }
                int i16 = i11 & 8;
                if (i16 != 0) {
                    sb2.append("<s>");
                }
                int i17 = i11 & 4;
                Spanned spanned2 = spanned;
                if (i17 != 0) {
                    sb2.append("<code>");
                }
                int i18 = i11 & 16384;
                if (i18 != 0) {
                    sb2.append("<sub>");
                }
                int i19 = 32768 & i11;
                if (i19 != 0) {
                    sb2.append("<sup>");
                }
                int i20 = 65536 & i11;
                if (i20 != 0) {
                    sb2.append("<mark>");
                }
                if (url != null) {
                    sb2.append("<a href=\"");
                    sb2.append(s(url));
                    sb2.append("\">");
                }
                if (documentId != 0) {
                    sb2.append("<animated-emoji data-document-id=\"");
                    sb2.append(documentId);
                    sb2.append("\">");
                }
                r(sb2, charSequence, iMin, iNextSpanTransition);
                if (documentId != 0) {
                    sb2.append("</animated-emoji>");
                }
                if (url != null) {
                    sb2.append("</a>");
                }
                if (i20 != 0) {
                    sb2.append("</mark>");
                }
                if (i19 != 0) {
                    sb2.append("</sup>");
                }
                if (i18 != 0) {
                    sb2.append("</sub>");
                }
                if (i17 != 0) {
                    sb2.append("</code>");
                }
                if (i16 != 0) {
                    sb2.append("</s>");
                }
                if (i15 != 0) {
                    sb2.append("</u>");
                }
                if (i14 != 0) {
                    sb2.append("</i>");
                }
                if (i13 != 0) {
                    sb2.append("</b>");
                }
                if (i12 != 0) {
                    sb2.append("</spoiler>");
                }
                iMin = iNextSpanTransition;
                spanned = spanned2;
                c10 = 0;
            }
        }
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, u3 u3Var, int i10, String str, long j10) {
        int i11;
        String str2;
        int i12;
        long j11;
        TL_keyboard.InlineButtonType inlineButtonTypeV;
        if ("button".equals(u3Var.f47498a) && (inlineButtonTypeV = v(u3Var)) != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            e(spannableStringBuilder2, u3Var, i10, str, j10);
            if (spannableStringBuilder2.length() > 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                TL_iv.textButton textbutton = new TL_iv.textButton();
                textbutton.text = v5.f(spannableStringBuilder2);
                textbutton.type = inlineButtonTypeV;
                textbutton.style = u(u3Var);
                spannableStringBuilder.setSpan(new c4(textbutton), length, spannableStringBuilder.length(), 33);
            }
            return;
        }
        String str3 = u3Var.f47498a;
        str3.getClass();
        switch (str3) {
            case "spoiler":
                i11 = i10 | 256;
                str2 = str;
                j11 = j10;
                if (u3Var.f47501e.isEmpty() || u3Var.f47499b) {
                    e(spannableStringBuilder, u3Var, i11, str2, j11);
                    break;
                }
                break;
            case "strike":
            case "s":
            case "del":
                i11 = i10 | 8;
                str2 = str;
                j11 = j10;
                if (u3Var.f47501e.isEmpty()) {
                    break;
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "strong":
            case "b":
                i11 = i10 | 1;
                str2 = str;
                j11 = j10;
                if (u3Var.f47501e.isEmpty()) {
                    break;
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "a":
                String strA = u3Var.a("href");
                if (strA != null) {
                    str2 = strA;
                    i11 = i10;
                } else {
                    i11 = i10;
                    str2 = str;
                }
                j11 = j10;
                if (u3Var.f47501e.isEmpty()) {
                    break;
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "i":
            case "em":
                i11 = i10 | 2;
                str2 = str;
                j11 = j10;
                if (u3Var.f47501e.isEmpty()) {
                    break;
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "u":
                i11 = i10 | 16;
                str2 = str;
                j11 = j10;
                if (u3Var.f47501e.isEmpty()) {
                    break;
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "br":
                j(spannableStringBuilder, "\n", i10, str, j10);
                break;
            case "tt":
            case "code":
                i11 = i10 | 4;
                str2 = str;
                j11 = j10;
                if (u3Var.f47501e.isEmpty()) {
                    break;
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "sub":
                i11 = i10 | 16384;
                str2 = str;
                j11 = j10;
                if (u3Var.f47501e.isEmpty()) {
                    break;
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "sup":
                i12 = 32768;
                i11 = i12 | i10;
                str2 = str;
                j11 = j10;
                if (u3Var.f47501e.isEmpty()) {
                    break;
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "mark":
                i12 = 65536;
                i11 = i12 | i10;
                str2 = str;
                j11 = j10;
                if (u3Var.f47501e.isEmpty()) {
                    break;
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "animated-emoji":
                String strA2 = u3Var.a("data-document-id");
                if (strA2 != null) {
                    try {
                        j11 = Long.parseLong(strA2.trim());
                        i11 = i10;
                        str2 = str;
                    } catch (Exception unused) {
                        i11 = i10;
                        str2 = str;
                        j11 = j10;
                    }
                    if (u3Var.f47501e.isEmpty()) {
                        break;
                    }
                    e(spannableStringBuilder, u3Var, i11, str2, j11);
                    break;
                }
                i11 = i10;
                str2 = str;
                j11 = j10;
                if (u3Var.f47501e.isEmpty()) {
                    break;
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            default:
                i11 = i10;
                str2 = str;
                j11 = j10;
                if (u3Var.f47501e.isEmpty()) {
                    break;
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
        }
    }

    public static void i(StringBuilder sb2, String str, long j10, s sVar, TL_iv.PageBlock pageBlock) {
        sb2.append('<');
        sb2.append(str);
        sb2.append(" src=\"");
        sb2.append(j10);
        sb2.append('\"');
        if (sVar != null) {
            if (sVar.f47421j > 0) {
                sb2.append(" width=\"");
                sb2.append(sVar.f47421j);
                sb2.append('\"');
            }
            if (sVar.f47422k > 0) {
                sb2.append(" height=\"");
                sb2.append(sVar.f47422k);
                sb2.append('\"');
            }
        }
        if ((pageBlock instanceof TL_iv.pageBlockPhoto) && ((TL_iv.pageBlockPhoto) pageBlock).spoiler) {
            sb2.append(" data-spoiler=\"1\"");
        }
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && ((TL_iv.pageBlockVideo) pageBlock).spoiler) {
            sb2.append(" data-spoiler=\"1\"");
        }
        sb2.append(" />");
    }

    public static void j(SpannableStringBuilder spannableStringBuilder, String str, int i10, String str2, long j10) {
        if (str == null || str.length() == 0) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        int length2 = spannableStringBuilder.length();
        if (j10 != 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(j10, (Paint.FontMetricsInt) null), length, length2, 33);
        }
        if (i10 != 0) {
            xz0 xz0Var = new xz0();
            xz0Var.f34734a = i10 & 114975;
            spannableStringBuilder.setSpan(new yz0(xz0Var, AndroidUtilities.dp(SharedConfig.fontSize)), length, length2, 33);
        }
        if (str2 != null) {
            spannableStringBuilder.setSpan(v5.k(str2), length, length2, 33);
        }
    }

    public static SpannableStringBuilder k(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilderR = v5.r(richText, null, true);
        if (spannableStringBuilderR.length() > 0) {
            return spannableStringBuilderR;
        }
        return null;
    }

    public static String l(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return "h1";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return "h2";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return "h3";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return "h4";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return "h5";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return "h6";
        }
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return "blockquote";
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return "pre";
        }
        if (pageBlock instanceof TL_iv.pageBlockFooter) {
            return "footer";
        }
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return "p";
        }
        return null;
    }

    public static a m(u3 u3Var) {
        double d;
        String str = u3Var.f47498a;
        str.getClass();
        switch (str) {
            case "div":
                String strA = u3Var.a("class");
                String lowerCase = strA == null ? "" : strA.toLowerCase();
                if (lowerCase.contains("slideshow")) {
                    return B(u3Var, true);
                }
                if (lowerCase.contains("collage")) {
                    return B(u3Var, false);
                }
                return null;
            case "img":
                return n(u3Var, false);
            case "audio":
                long jE = E(u3Var.a("src"));
                if (jE <= 0) {
                    return null;
                }
                TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
                pageblockaudio.audio_id = jE;
                J(pageblockaudio);
                return new a(pageblockaudio, 0, 0);
            case "video":
                return n(u3Var, true);
            case "document":
                long jE2 = E(u3Var.a("src"));
                if (jE2 <= 0) {
                    return null;
                }
                TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
                pageblockdocument.document_id = jE2;
                J(pageblockdocument);
                return new a(pageblockdocument, 0, 0);
            case "location":
                TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                String strA2 = u3Var.a("lat");
                double d10 = 0.0d;
                if (strA2 != null) {
                    try {
                        d = Double.parseDouble(strA2.trim());
                    } catch (Exception unused) {
                        d = 0.0d;
                    }
                    break;
                } else {
                    d = 0.0d;
                }
                tL_geoPoint.lat = d;
                String strA3 = u3Var.a("long");
                if (strA3 != null) {
                    try {
                        d10 = Double.parseDouble(strA3.trim());
                        break;
                    } catch (Exception unused2) {
                    }
                }
                tL_geoPoint._long = d10;
                tL_geoPoint.access_hash = E(u3Var.a("access"));
                pageblockmap.geo = tL_geoPoint;
                pageblockmap.zoom = C(15, u3Var.a("zoom"));
                pageblockmap.f22603w = C(600, u3Var.a("w"));
                pageblockmap.h = C(400, u3Var.a("h"));
                J(pageblockmap);
                return new a(pageblockmap, 0, 0);
            default:
                return null;
        }
    }

    public static a n(u3 u3Var, boolean z10) {
        long jE = E(u3Var.a("src"));
        if (jE <= 0) {
            return null;
        }
        TL_iv.PageBlock pageBlockY = y(jE, z10, u3Var.b("data-spoiler"));
        J(pageBlockY);
        return new a(pageBlockY, 0, 0);
    }

    public static SpannableStringBuilder o(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        if (pageBlock != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            SpannableStringBuilder spannableStringBuilderR = v5.r(richText, null, true);
            if (spannableStringBuilderR.length() > 0) {
                return spannableStringBuilderR;
            }
        }
        return null;
    }

    public static void p(u3 u3Var, TL_iv.pageBlockTable pageblocktable) {
        String lowerCase;
        int iIndexOf;
        ArrayList arrayList = u3Var.f47501e;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            u3 u3Var2 = (u3) obj;
            if (!u3Var2.f47499b) {
                String str = u3Var2.f47498a;
                str.getClass();
                switch (str) {
                    case "tr":
                        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        pagetablerow.cells = new ArrayList<>();
                        ArrayList arrayList3 = u3Var2.f47501e;
                        int size2 = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj2 = arrayList3.get(i12);
                            i12++;
                            u3 u3Var3 = (u3) obj2;
                            if (!u3Var3.f47499b) {
                                if ("td".equals(u3Var3.f47498a) || "th".equals(u3Var3.f47498a)) {
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    pagetablecell.colspan = C(i10, u3Var3.a("colspan"));
                                    pagetablecell.rowspan = C(i10, u3Var3.a("rowspan"));
                                    x5.d(pagetablecell, w(u3Var3));
                                    x5.l(pagetablecell, "th".equals(u3Var3.f47498a) || u3Var3.b("header"));
                                    String strA = u3Var3.a("align");
                                    if (strA == null) {
                                        String strA2 = u3Var3.a("style");
                                        if (strA2 == null || (iIndexOf = (lowerCase = strA2.toLowerCase()).indexOf("text-align")) < 0) {
                                            strA = null;
                                        } else if (lowerCase.indexOf("center", iIndexOf) >= 0) {
                                            strA = "center";
                                        } else if (lowerCase.indexOf("right", iIndexOf) >= 0) {
                                            strA = "right";
                                        } else {
                                            strA = null;
                                        }
                                    }
                                    if ("center".equalsIgnoreCase(strA)) {
                                        x5.k(pagetablecell, 1);
                                    } else if ("right".equalsIgnoreCase(strA)) {
                                        x5.k(pagetablecell, 2);
                                    }
                                    String strA3 = u3Var3.a("valign");
                                    if ("middle".equalsIgnoreCase(strA3)) {
                                        x5.m(pagetablecell, 1);
                                    } else {
                                        if ("bottom".equalsIgnoreCase(strA3)) {
                                            x5.m(pagetablecell, 2);
                                        }
                                        pagetablerow.cells.add(pagetablecell);
                                    }
                                    pagetablerow.cells.add(pagetablecell);
                                }
                            }
                            i10 = 0;
                        }
                        if (pagetablerow.cells.isEmpty()) {
                            pagetablerow.cells.add(x5.f());
                        }
                        arrayList2.add(pagetablerow);
                        break;
                    case "tbody":
                    case "tfoot":
                    case "thead":
                        p(u3Var2, pageblocktable);
                        break;
                    case "caption":
                        pageblocktable.title = v5.f(w(u3Var2));
                        break;
                }
                i10 = 0;
            }
        }
    }

    public static String q(String str) {
        String str2;
        if (str == null) {
            return "";
        }
        if (str.indexOf(38) < 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        int i10 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '&') {
                sb2.append(cCharAt);
            } else {
                int i11 = i10 + 1;
                int iIndexOf = str.indexOf(59, i11);
                if (iIndexOf < 0 || iIndexOf - i10 > 12) {
                    sb2.append(cCharAt);
                } else {
                    String strSubstring = str.substring(i11, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            str2 = ">";
                            break;
                        case "lt":
                            str2 = "<";
                            break;
                        case "amp":
                            str2 = "&";
                            break;
                        case "apos":
                            str2 = "'";
                            break;
                        case "nbsp":
                            str2 = " ";
                            break;
                        case "quot":
                            str2 = "\"";
                            break;
                        default:
                            str2 = null;
                            if (strSubstring.length() > 1 && strSubstring.charAt(0) == '#') {
                                try {
                                    str2 = new String(Character.toChars((strSubstring.charAt(1) == 'x' || strSubstring.charAt(1) == 'X') ? Integer.parseInt(strSubstring.substring(2), 16) : Integer.parseInt(strSubstring.substring(1))));
                                } catch (Exception unused) {
                                }
                                break;
                            }
                            break;
                    }
                    if (str2 != null) {
                        sb2.append(str2);
                        i10 = iIndexOf;
                    } else {
                        sb2.append(cCharAt);
                    }
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    public static void r(StringBuilder sb2, CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == '\n') {
                sb2.append("<br>");
            } else if (cCharAt == '<') {
                sb2.append("&lt;");
            } else if (cCharAt == '>') {
                sb2.append("&gt;");
            } else if (cCharAt == '&') {
                sb2.append("&amp;");
            } else {
                sb2.append(cCharAt);
            }
            i10++;
        }
    }

    public static String s(String str) {
        return str == null ? "" : str.replace("&", "&amp;").replace("\"", "&quot;").replace("<", "&lt;").replace(">", "&gt;");
    }

    public static void t(ArrayList arrayList, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null || x(spannableStringBuilder.toString())) {
            return;
        }
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        pageblockparagraph.text = v5.f(L(spannableStringBuilder));
        arrayList.add(new a(pageblockparagraph, 0, 0));
    }

    public static TL_keyboard.RichButtonStyle u(u3 u3Var) {
        TL_keyboard.RichButtonStyle richButtonStyle = new TL_keyboard.RichButtonStyle();
        String strA = u3Var.a("data-style");
        richButtonStyle.bg_primary = "primary".equals(strA);
        richButtonStyle.bg_danger = "danger".equals(strA);
        richButtonStyle.bg_success = "success".equals(strA);
        return richButtonStyle;
    }

    public static TL_keyboard.InlineButtonType v(u3 u3Var) {
        String strA = u3Var.a("data-type");
        if ("url".equals(strA)) {
            String strA2 = u3Var.a("data-url");
            if (TextUtils.isEmpty(strA2)) {
                return null;
            }
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
            tL_inlineButtonTypeUrl.url = strA2;
            return tL_inlineButtonTypeUrl;
        }
        if ("copy".equals(strA)) {
            String strA3 = u3Var.a("data-copy-text");
            if (TextUtils.isEmpty(strA3)) {
                return null;
            }
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
            tL_inlineButtonTypeCopy.copy_text = strA3;
            return tL_inlineButtonTypeCopy;
        }
        if (!"user-profile".equals(strA)) {
            return null;
        }
        long jE = E(u3Var.a("data-user-id"));
        if (jE <= 0) {
            return null;
        }
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = jE;
        return tL_inlineButtonTypeUserProfile;
    }

    public static CharSequence w(u3 u3Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, u3Var, 0, null, 0L);
        return L(spannableStringBuilder);
    }

    public static boolean x(String str) {
        if (str == null) {
            return true;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != 160) {
                return false;
            }
        }
        return true;
    }

    public static TL_iv.PageBlock y(long j10, boolean z10, boolean z11) {
        if (z10) {
            TL_iv.pageBlockVideo pageblockvideo = new TL_iv.pageBlockVideo();
            if (j10 <= 0) {
                j10 = 0;
            }
            pageblockvideo.video_id = j10;
            pageblockvideo.spoiler = z11;
            return pageblockvideo;
        }
        TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
        if (j10 <= 0) {
            j10 = 0;
        }
        pageblockphoto.photo_id = j10;
        pageblockphoto.spoiler = z11;
        return pageblockphoto;
    }

    public static ArrayList z(String str, HashMap map) {
        int iIndexOf;
        char c10;
        int i10;
        String strSubstring;
        int i11;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = 0;
            while (length < str.length()) {
                if (str.charAt(length) != '<') {
                    iIndexOf = str.indexOf(60, length);
                    if (iIndexOf < 0) {
                        iIndexOf = str.length();
                    }
                    String strSubstring2 = str.substring(length, iIndexOf);
                    if (!strSubstring2.isEmpty()) {
                        u3 u3Var = new u3();
                        u3Var.f47499b = true;
                        u3Var.f47500c = strSubstring2;
                        if (arrayList3.isEmpty()) {
                            arrayList2.add(u3Var);
                        } else {
                            ((u3) i0.a.i(1, arrayList3)).f47501e.add(u3Var);
                        }
                    }
                } else if (str.startsWith("<!--", length)) {
                    int iIndexOf2 = str.indexOf("-->", length + 4);
                    length = iIndexOf2 < 0 ? str.length() : iIndexOf2 + 3;
                } else if (length + 1 < str.length() && str.charAt(length + 1) == '!') {
                    int iIndexOf3 = str.indexOf(62, length);
                    length = iIndexOf3 < 0 ? str.length() : iIndexOf3 + 1;
                } else if (length + 1 >= str.length() || str.charAt(length + 1) != '/') {
                    int i12 = length + 1;
                    boolean z10 = false;
                    char c11 = 0;
                    while (true) {
                        c10 = '\'';
                        if (i12 < str.length()) {
                            char cCharAt = str.charAt(i12);
                            if (z10) {
                                if (cCharAt == c11) {
                                    z10 = false;
                                }
                            } else if (cCharAt == '\"' || cCharAt == '\'') {
                                c11 = cCharAt;
                                z10 = true;
                            } else if (cCharAt == '>') {
                            }
                            i12++;
                        } else {
                            i12 = -1;
                        }
                    }
                    if (i12 >= 0) {
                        String strSubstring3 = str.substring(length + 1, i12);
                        iIndexOf = i12 + 1;
                        boolean zEndsWith = strSubstring3.endsWith("/");
                        if (zEndsWith) {
                            strSubstring3 = com.google.android.recaptcha.internal.a.n(strSubstring3, 1, 0);
                        }
                        String strTrim = strSubstring3.trim();
                        u3 u3Var2 = null;
                        if (!strTrim.isEmpty()) {
                            int i13 = 0;
                            while (i13 < strTrim.length() && !b7.a(strTrim.charAt(i13))) {
                                i13++;
                            }
                            String lowerCase = strTrim.substring(0, i13).toLowerCase();
                            if (!lowerCase.isEmpty()) {
                                u3Var2 = new u3();
                                u3Var2.f47498a = lowerCase;
                                while (i13 < strTrim.length()) {
                                    while (i13 < strTrim.length() && b7.a(strTrim.charAt(i13))) {
                                        i13++;
                                    }
                                    if (i13 < strTrim.length()) {
                                        int i14 = i13;
                                        while (i14 < strTrim.length() && strTrim.charAt(i14) != '=' && !b7.a(strTrim.charAt(i14))) {
                                            i14++;
                                        }
                                        String lowerCase2 = strTrim.substring(i13, i14).toLowerCase();
                                        while (i14 < strTrim.length() && b7.a(strTrim.charAt(i14))) {
                                            i14++;
                                        }
                                        if (i14 >= strTrim.length() || strTrim.charAt(i14) != '=') {
                                            i10 = i14;
                                            strSubstring = "";
                                        } else {
                                            do {
                                                i14++;
                                                if (i14 < strTrim.length()) {
                                                }
                                                if (i14 < strTrim.length() || !(strTrim.charAt(i14) == '\"' || strTrim.charAt(i14) == c10)) {
                                                    i11 = i14;
                                                    while (i11 < strTrim.length() && !b7.a(strTrim.charAt(i11))) {
                                                        i11++;
                                                    }
                                                    strSubstring = strTrim.substring(i14, i11);
                                                    i10 = i11;
                                                } else {
                                                    char cCharAt2 = strTrim.charAt(i14);
                                                    int i15 = i14 + 1;
                                                    i10 = i15;
                                                    while (i10 < strTrim.length() && strTrim.charAt(i10) != cCharAt2) {
                                                        i10++;
                                                    }
                                                    strSubstring = strTrim.substring(i15, Math.min(i10, strTrim.length()));
                                                    if (i10 < strTrim.length()) {
                                                        i10++;
                                                    }
                                                }
                                            } while (b7.a(strTrim.charAt(i14)));
                                            if (i14 < strTrim.length()) {
                                                i11 = i14;
                                                while (i11 < strTrim.length()) {
                                                    i11++;
                                                }
                                                strSubstring = strTrim.substring(i14, i11);
                                                i10 = i11;
                                            } else {
                                                i11 = i14;
                                                while (i11 < strTrim.length()) {
                                                    i11++;
                                                }
                                                strSubstring = strTrim.substring(i14, i11);
                                                i10 = i11;
                                            }
                                        }
                                        if (!lowerCase2.isEmpty()) {
                                            if (u3Var2.d == null) {
                                                u3Var2.d = new HashMap();
                                            }
                                            u3Var2.d.put(lowerCase2, q(strSubstring));
                                        }
                                        i13 = i10;
                                        c10 = '\'';
                                    }
                                }
                            }
                        }
                        if (u3Var2 != null) {
                            if (arrayList3.isEmpty()) {
                                arrayList2.add(u3Var2);
                            } else {
                                ((u3) i0.a.i(1, arrayList3)).f47501e.add(u3Var2);
                            }
                            if (!zEndsWith) {
                                String str2 = u3Var2.f47498a;
                                str2.getClass();
                                switch (str2) {
                                    case "br":
                                    case "hr":
                                    case "img":
                                    case "wbr":
                                    case "link":
                                    case "meta":
                                    case "input":
                                        break;
                                    default:
                                        arrayList3.add(u3Var2);
                                        break;
                                }
                            }
                        }
                    } else {
                        String strSubstring4 = str.substring(length);
                        if (!strSubstring4.isEmpty()) {
                            u3 u3Var3 = new u3();
                            u3Var3.f47499b = true;
                            u3Var3.f47500c = strSubstring4;
                            if (arrayList3.isEmpty()) {
                                arrayList2.add(u3Var3);
                            } else {
                                ((u3) i0.a.i(1, arrayList3)).f47501e.add(u3Var3);
                            }
                        }
                        A(arrayList2, arrayList, map);
                        if (arrayList.isEmpty()) {
                            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                        }
                    }
                } else {
                    int iIndexOf4 = str.indexOf(62, length);
                    String lowerCase3 = str.substring(length + 2, iIndexOf4 < 0 ? str.length() : iIndexOf4).trim().toLowerCase();
                    iIndexOf = iIndexOf4 < 0 ? str.length() : iIndexOf4 + 1;
                    for (int size = arrayList3.size() - 1; size >= 0; size--) {
                        if (((u3) arrayList3.get(size)).f47498a.equals(lowerCase3)) {
                            while (arrayList3.size() > size) {
                                a9.p.s(1, arrayList3);
                            }
                        }
                    }
                }
                length = iIndexOf;
            }
            A(arrayList2, arrayList, map);
            if (arrayList.isEmpty()) {
                arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
            }
        }
        return arrayList;
    }
}
