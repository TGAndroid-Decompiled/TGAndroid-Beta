package qh;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.wz0;
public abstract class u3 {
    public static void A(java.util.ArrayList r31, java.util.ArrayList r32, java.util.Map r33) {
        throw new UnsupportedOperationException("Method not decompiled: qh.u3.A(java.util.ArrayList, java.util.ArrayList, java.util.Map):void");
    }

    public static a B(t3 t3Var, boolean z10) {
        TL_iv.PageBlock pageblockcollage;
        if (z10) {
            pageblockcollage = new TL_iv.pageBlockSlideshow();
        } else {
            pageblockcollage = new TL_iv.pageBlockCollage();
        }
        ArrayList g32 = o3.g3(pageblockcollage);
        ArrayList arrayList = t3Var.f46726e;
        int size = arrayList.size();
        CharSequence charSequence = null;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            t3 t3Var2 = (t3) obj;
            if (!t3Var2.f46724b) {
                if ("figcaption".equals(t3Var2.f46723a)) {
                    charSequence = w(t3Var2);
                } else {
                    boolean equals = "video".equals(t3Var2.f46723a);
                    if (equals || "img".equals(t3Var2.f46723a)) {
                        long E = E(t3Var2.a("src"));
                        if (E > 0) {
                            TL_iv.PageBlock y10 = y(E, equals, t3Var2.b("data-spoiler"));
                            J(y10);
                            g32.add(y10);
                        }
                    }
                }
            }
        }
        if (g32.isEmpty()) {
            return null;
        }
        if (g32.size() == 1) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) g32.get(0);
            if (charSequence != null && charSequence.length() > 0) {
                I(pageBlock, charSequence);
            }
            return new a(pageBlock, 0, 0);
        }
        J(pageblockcollage);
        if (charSequence != null && charSequence.length() > 0) {
            I(pageblockcollage, charSequence);
        }
        return new a(pageblockcollage, 0, 0);
    }

    public static int C(int i9, String str) {
        if (str != null) {
            try {
            } catch (Exception unused) {
                return i9;
            }
        }
        return Integer.parseInt(str.trim());
    }

    public static void D(t3 t3Var, ArrayList arrayList, int i9, boolean z10) {
        int i10;
        boolean z11;
        String a2;
        ArrayList arrayList2;
        int i11;
        int i12 = i9 + 1;
        ArrayList arrayList3 = t3Var.f46726e;
        int size = arrayList3.size();
        int i13 = 1;
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList3.get(i14);
            i14++;
            t3 t3Var2 = (t3) obj;
            if (!t3Var2.f46724b && "li".equals(t3Var2.f46723a)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = t3Var2.f46726e;
                int size2 = arrayList5.size();
                int i15 = 0;
                while (i15 < size2) {
                    int i16 = i15 + 1;
                    t3 t3Var3 = (t3) arrayList5.get(i15);
                    if (!t3Var3.f46724b && ("ul".equals(t3Var3.f46723a) || "ol".equals(t3Var3.f46723a))) {
                        arrayList4.add(t3Var3);
                    } else if (t3Var3.f46724b) {
                        spannableStringBuilder.append((CharSequence) q(t3Var3.f46725c));
                    } else {
                        arrayList2 = arrayList5;
                        i11 = size2;
                        h(spannableStringBuilder, t3Var3, 0, null, 0L);
                        arrayList5 = arrayList2;
                        i15 = i16;
                        size2 = i11;
                    }
                    arrayList2 = arrayList5;
                    i11 = size2;
                    arrayList5 = arrayList2;
                    i15 = i16;
                    size2 = i11;
                }
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = u5.f(L(spannableStringBuilder));
                if (z10) {
                    i10 = i13;
                } else {
                    i10 = 0;
                }
                a aVar = new a(pageblockparagraph, i12, i10);
                if (!t3Var2.b("data-checkbox") && ((a2 = t3Var2.a("class")) == null || !a2.toLowerCase().contains("checkbox"))) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                aVar.f46271e = z11;
                aVar.f46272f = t3Var2.b("data-checked");
                arrayList.add(aVar);
                int size3 = arrayList4.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj2 = arrayList4.get(i17);
                    i17++;
                    t3 t3Var4 = (t3) obj2;
                    D(t3Var4, arrayList, i12, "ol".equals(t3Var4.f46723a));
                }
                i13++;
            }
        }
    }

    public static long E(String str) {
        if (str != null) {
            try {
                return Long.parseLong(str.trim());
            } catch (Exception unused) {
                return 0L;
            }
        }
        return 0L;
    }

    public static void F(StringBuilder sb2, List list, int[] iArr, int i9, int i10, int i11, int i12, int i13, c2.u uVar, boolean z10, int i14, Map map) {
        int i15;
        List list2;
        String str;
        String str2;
        StringBuilder sb3 = sb2;
        List list3 = list;
        int i16 = i9;
        c2.u uVar2 = uVar;
        int i17 = i14;
        ArrayList arrayList = uVar2.f2235a;
        while (true) {
            int i18 = iArr[0];
            if (i18 > i16) {
                return;
            }
            a aVar = (a) list3.get(i18);
            if (!aVar.f46274i) {
                if (aVar.f46276k.size() > i17) {
                    uVar2.c(sb3);
                    Long l10 = (Long) ((a) list3.get(iArr[0])).f46276k.get(i17);
                    long longValue = l10.longValue();
                    int i19 = iArr[0];
                    while (true) {
                        int i20 = i19 + 1;
                        if (i20 > i16) {
                            break;
                        }
                        a aVar2 = (a) list3.get(i20);
                        if (aVar2.f46276k.size() <= i17 || ((Long) aVar2.f46276k.get(i17)).longValue() != longValue) {
                            break;
                        }
                        i19 = i20;
                    }
                    sb3.append("<blockquote>");
                    c2.u uVar3 = new c2.u(2);
                    F(sb3, list3, iArr, i19, i10, i11, i12, i13, uVar3, z10, i17 + 1, map);
                    uVar3.c(sb3);
                    c(sb3, map != null ? k((TL_iv.RichText) map.get(l10)) : null);
                    sb3.append("</blockquote>");
                    i16 = i9;
                    i17 = i14;
                } else {
                    if (o3.x3(aVar)) {
                        uVar2.c(sb3);
                        a aVar3 = (a) list3.get(iArr[0]);
                        sb3.append(((TL_iv.pageBlockDetails) aVar3.f46269b).open ? "<details open>" : "<details>");
                        sb3.append("<summary>");
                        g(sb3, K(aVar3, iArr[0], i10, i11, i12, i13));
                        sb3.append("</summary>");
                        iArr[0] = iArr[0] + 1;
                        c2.u uVar4 = new c2.u(2);
                        F(sb3, list3, iArr, i9, i10, i11, i12, i13, uVar4, true, i14, map);
                        list2 = list3;
                        i15 = i9;
                        uVar4.c(sb3);
                        int i21 = iArr[0];
                        if (i21 <= i15 && i21 < list2.size() && ((a) list2.get(iArr[0])).f46274i) {
                            iArr[0] = iArr[0] + 1;
                        }
                        sb3.append("</details>");
                    } else {
                        i15 = i9;
                        list2 = list3;
                        if (aVar.f46270c > 0 && l(aVar.f46269b) != null) {
                            int i22 = aVar.f46270c;
                            boolean z11 = aVar.d > 0;
                            while (arrayList.size() > i22) {
                                uVar2.b(sb3);
                            }
                            while (true) {
                                str2 = "<ul>";
                                if (arrayList.size() >= i22) {
                                    break;
                                }
                                if (z11) {
                                    str2 = "<ol>";
                                }
                                sb3.append(str2);
                                arrayList.add(Boolean.valueOf(z11));
                            }
                            if (!arrayList.isEmpty() && ((Boolean) j3.r0.j(1, arrayList)).booleanValue() != z11) {
                                uVar2.b(sb3);
                                sb3.append(z11 ? "<ol>" : "<ul>");
                                arrayList.add(Boolean.valueOf(z11));
                            }
                            sb3.append("<li>");
                            g(sb3, K(aVar, iArr[0], i10, i11, i12, i13));
                            sb3.append("</li>");
                            iArr[0] = iArr[0] + 1;
                        } else {
                            uVar2.c(sb3);
                            int i23 = iArr[0];
                            TL_iv.PageBlock pageBlock = aVar.f46269b;
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
                                    G(sb3, "img", ((TL_iv.pageBlockPhoto) pageBlock).photo_id, aVar.f46273g, pageBlock);
                                    sb3 = sb2;
                                } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                                    sb3 = sb2;
                                    G(sb3, "video", ((TL_iv.pageBlockVideo) pageBlock).video_id, aVar.f46273g, pageBlock);
                                } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                                    sb3 = sb2;
                                    G(sb3, "audio", ((TL_iv.pageBlockAudio) pageBlock).audio_id, aVar.f46273g, pageBlock);
                                } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                                    sb3 = sb2;
                                    G(sb3, "document", ((TL_iv.pageBlockDocument) pageBlock).document_id, aVar.f46273g, pageBlock);
                                } else {
                                    sb3 = sb2;
                                    String str3 = "<figcaption>";
                                    if (o3.B3(pageBlock)) {
                                        String str4 = pageBlock instanceof TL_iv.pageBlockSlideshow ? "slideshow" : "collage";
                                        sb3.append("<div class=\"");
                                        sb3.append(str4);
                                        sb3.append("\">");
                                        ArrayList g32 = o3.g3(pageBlock);
                                        if (g32 != null) {
                                            int i25 = 0;
                                            while (i25 < g32.size()) {
                                                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) g32.get(i25);
                                                ArrayList arrayList3 = aVar.h;
                                                s sVar = (arrayList3 == null || i25 >= arrayList3.size()) ? null : (s) aVar.h.get(i25);
                                                if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
                                                    long j10 = ((TL_iv.pageBlockVideo) pageBlock2).video_id;
                                                    if (j10 != 0) {
                                                        str = str3;
                                                        i(sb3, "video", j10, sVar, pageBlock2);
                                                    } else {
                                                        str = str3;
                                                    }
                                                } else {
                                                    str = str3;
                                                    if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
                                                        long j11 = ((TL_iv.pageBlockPhoto) pageBlock2).photo_id;
                                                        if (j11 != 0) {
                                                            sb3 = sb2;
                                                            i(sb3, "img", j11, sVar, pageBlock2);
                                                            i25++;
                                                            str3 = str;
                                                        }
                                                    }
                                                }
                                                sb3 = sb2;
                                                i25++;
                                                str3 = str;
                                            }
                                        }
                                        String str5 = str3;
                                        SpannableStringBuilder o6 = o(pageBlock);
                                        if (o6 != null && o6.length() > 0) {
                                            sb3.append(str5);
                                            g(sb3, o6);
                                            sb3.append("</figcaption>");
                                        }
                                        sb3.append("</div>");
                                    } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                                        SpannableStringBuilder o9 = o(pageblockmap);
                                        boolean z12 = o9 != null && o9.length() > 0;
                                        if (z12) {
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
                                        if (z12) {
                                            sb3.append("<figcaption>");
                                            g(sb3, o9);
                                            sb3.append("</figcaption></figure>");
                                        }
                                    } else {
                                        String l11 = l(pageBlock);
                                        if (l11 == null) {
                                            SpannableStringBuilder o10 = o(pageBlock);
                                            if (o10 != null && o10.length() > 0) {
                                                sb3.append("<p>");
                                                g(sb3, o10);
                                                sb3.append("</p>");
                                            }
                                        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                            String str6 = ((TL_iv.pageBlockPreformatted) pageBlock).language;
                                            if (!TextUtils.isEmpty(str6)) {
                                                sb3.append("<pre language=\"");
                                                sb3.append(s(str6));
                                                sb3.append("\">");
                                            } else {
                                                sb3.append("<pre>");
                                            }
                                            g(sb3, K(aVar, i23, i10, i11, i12, i13));
                                            sb3.append("</pre>");
                                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                                            sb3.append("<blockquote class=\"pull\">");
                                            g(sb3, K(aVar, i23, i10, i11, i12, i13));
                                            c(sb3, k(((TL_iv.pageBlockPullquote) pageBlock).caption));
                                            sb3.append("</blockquote>");
                                        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                                            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                                            if (pageblockblockquote.collapsed) {
                                                sb3.append("<blockquote collapsed>");
                                            } else {
                                                sb3.append("<blockquote>");
                                            }
                                            g(sb3, K(aVar, i23, i10, i11, i12, i13));
                                            c(sb3, k(pageblockblockquote.caption));
                                            sb3.append("</blockquote>");
                                        } else {
                                            sb3.append('<');
                                            sb3.append(l11);
                                            sb3.append('>');
                                            g(sb3, K(aVar, i23, i10, i11, i12, i13));
                                            sb3.append("</");
                                            sb3.append(l11);
                                            sb3.append('>');
                                        }
                                    }
                                }
                                iArr[0] = iArr[0] + 1;
                                uVar2 = uVar;
                            }
                            iArr[0] = iArr[0] + 1;
                            uVar2 = uVar;
                        }
                    }
                    i17 = i14;
                    list3 = list2;
                    i16 = i15;
                }
            } else if (z10) {
                return;
            } else {
                iArr[0] = iArr[0] + 1;
            }
        }
    }

    public static void G(StringBuilder sb2, String str, long j10, s sVar, TL_iv.PageBlock pageBlock) {
        boolean z10;
        if (j10 != 0) {
            SpannableStringBuilder o6 = o(pageBlock);
            if (o6 != null && o6.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                sb2.append("<figure>");
            }
            i(sb2, str, j10, sVar, pageBlock);
            if (z10) {
                sb2.append("<figcaption>");
                g(sb2, o6);
                sb2.append("</figcaption></figure>");
            }
        }
    }

    public static void H(StringBuilder sb2, TL_iv.pageBlockTable pageblocktable) {
        SpannableStringBuilder spannableStringBuilder;
        ArrayList<TL_iv.pageTableCell> arrayList;
        String str;
        String str2;
        String str3;
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
        if (richText != null) {
            spannableStringBuilder = u5.r(richText, null, true);
        } else {
            spannableStringBuilder = null;
        }
        if (spannableStringBuilder != null && spannableStringBuilder.length() > 0) {
            sb2.append("<caption>");
            g(sb2, spannableStringBuilder);
            sb2.append("</caption>");
        }
        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                TL_iv.pageTableRow pagetablerow = arrayList2.get(i9);
                i9++;
                TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                sb2.append("<tr>");
                if (pagetablerow2 != null && (arrayList = pagetablerow2.cells) != null) {
                    int size2 = arrayList.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        TL_iv.pageTableCell pagetablecell = arrayList.get(i10);
                        i10++;
                        TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                        if (pagetablecell2 != null) {
                            if (pagetablecell2.header) {
                                str = "th";
                            } else {
                                str = "td";
                            }
                            sb2.append('<');
                            sb2.append(str);
                            int i11 = pagetablecell2.colspan;
                            if (i11 <= 1) {
                                i11 = 0;
                            }
                            if (i11 > 0) {
                                sb2.append(" colspan=\"");
                                sb2.append(i11);
                                sb2.append('\"');
                            }
                            int i12 = pagetablecell2.rowspan;
                            if (i12 <= 1) {
                                i12 = 0;
                            }
                            if (i12 > 0) {
                                sb2.append(" rowspan=\"");
                                sb2.append(i12);
                                sb2.append('\"');
                            }
                            if (pagetablecell2.align_right) {
                                str2 = "right";
                            } else if (pagetablecell2.align_center) {
                                str2 = "center";
                            } else {
                                str2 = null;
                            }
                            if (str2 != null) {
                                sb2.append(" align=\"");
                                sb2.append(str2);
                                sb2.append('\"');
                            }
                            if (pagetablecell2.valign_bottom) {
                                str3 = "bottom";
                            } else if (pagetablecell2.valign_middle) {
                                str3 = "middle";
                            } else {
                                str3 = null;
                            }
                            if (str3 != null) {
                                sb2.append(" valign=\"");
                                sb2.append(str3);
                                sb2.append('\"');
                            }
                            sb2.append('>');
                            g(sb2, w5.h(pagetablecell2));
                            sb2.append("</");
                            sb2.append(str);
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
        pageCaption.text = u5.f(charSequence);
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static void J(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = new TL_iv.textEmpty();
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static CharSequence K(a aVar, int i9, int i10, int i11, int i12, int i13) {
        CharSequence A;
        int i14;
        int i15;
        if (o3.x3(aVar)) {
            A = u5.r(((TL_iv.pageBlockDetails) aVar.f46269b).title, null, true);
        } else {
            A = s5.A(aVar.f46269b);
        }
        if (A == null) {
            A = "";
        }
        int length = A.length();
        if (i9 == i10) {
            i14 = Math.max(0, Math.min(i12, length));
        } else {
            i14 = 0;
        }
        if (i9 == i11) {
            i15 = Math.max(0, Math.min(i13, length));
        } else {
            i15 = length;
        }
        if (i14 > i15) {
            int i16 = i14;
            i14 = i15;
            i15 = i16;
        }
        if (i14 == 0 && i15 == length) {
            return A;
        }
        return A.subSequence(i14, i15);
    }

    public static CharSequence L(SpannableStringBuilder spannableStringBuilder) {
        char charAt;
        int length = spannableStringBuilder.length();
        int i9 = 0;
        while (i9 < length && ((charAt = spannableStringBuilder.charAt(i9)) == ' ' || charAt == '\n' || charAt == '\t' || charAt == '\r')) {
            i9++;
        }
        while (length > i9) {
            char charAt2 = spannableStringBuilder.charAt(length - 1);
            if (charAt2 != ' ' && charAt2 != '\n' && charAt2 != '\t' && charAt2 != '\r') {
                break;
            }
            length--;
        }
        if (i9 == 0 && length == spannableStringBuilder.length()) {
            return spannableStringBuilder;
        }
        return spannableStringBuilder.subSequence(i9, length);
    }

    public static void a(ArrayList arrayList, a aVar) {
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    public static void b(ArrayList arrayList, TL_iv.PageBlock pageBlock, t3 t3Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, t3Var, 0, null, 0L);
        s5.e(pageBlock, L(spannableStringBuilder));
        arrayList.add(new a(pageBlock, 0, 0));
    }

    public static void c(StringBuilder sb2, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder != null && spannableStringBuilder.length() != 0) {
            sb2.append("<cite>");
            g(sb2, spannableStringBuilder);
            sb2.append("</cite>");
        }
    }

    public static void d(StringBuilder sb2, TL_iv.RichText richText, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle) {
        String str;
        if (!b4.c(inlineButtonType)) {
            return;
        }
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
            } else if (richButtonStyle.bg_success) {
                str = "success";
            } else {
                str = "default";
            }
            sb2.append(" data-style=\"");
            sb2.append(str);
            sb2.append("\"");
        }
        sb2.append(">");
        g(sb2, u5.r(richText, null, true));
        sb2.append("</button>");
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, t3 t3Var, int i9, String str, long j10) {
        SpannableStringBuilder spannableStringBuilder2;
        int i10;
        String str2;
        long j11;
        ArrayList arrayList = t3Var.f46726e;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            t3 t3Var2 = (t3) obj;
            if (t3Var2.f46724b) {
                spannableStringBuilder2 = spannableStringBuilder;
                i10 = i9;
                str2 = str;
                j11 = j10;
                j(spannableStringBuilder2, q(t3Var2.f46725c), i10, str2, j11);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                i10 = i9;
                str2 = str;
                j11 = j10;
                h(spannableStringBuilder2, t3Var2, i10, str2, j11);
            }
            spannableStringBuilder = spannableStringBuilder2;
            i9 = i10;
            str = str2;
            j10 = j11;
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, t3 t3Var) {
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList = t3Var.f46726e;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            t3 t3Var2 = (t3) obj;
            if (t3Var2.f46724b) {
                spannableStringBuilder2 = spannableStringBuilder;
                j(spannableStringBuilder2, q(t3Var2.f46725c), 0, null, 0L);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                if (!"cite".equals(t3Var2.f46723a)) {
                    h(spannableStringBuilder2, t3Var2, 0, null, 0L);
                }
            }
            spannableStringBuilder = spannableStringBuilder2;
        }
    }

    public static void g(java.lang.StringBuilder r22, java.lang.CharSequence r23) {
        throw new UnsupportedOperationException("Method not decompiled: qh.u3.g(java.lang.StringBuilder, java.lang.CharSequence):void");
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, t3 t3Var, int i9, String str, long j10) {
        int i10;
        String str2;
        int i11;
        long j11;
        TL_keyboard.InlineButtonType v;
        if ("button".equals(t3Var.f46723a) && (v = v(t3Var)) != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            e(spannableStringBuilder2, t3Var, i9, str, j10);
            if (spannableStringBuilder2.length() > 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                TL_iv.textButton textbutton = new TL_iv.textButton();
                textbutton.text = u5.f(spannableStringBuilder2);
                textbutton.type = v;
                textbutton.style = u(t3Var);
                spannableStringBuilder.setSpan(new b4(textbutton), length, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        String str3 = t3Var.f46723a;
        str3.getClass();
        char c10 = 65535;
        switch (str3.hashCode()) {
            case -1999048254:
                if (str3.equals("spoiler")) {
                    c10 = 0;
                    break;
                }
                break;
            case -891985998:
                if (str3.equals("strike")) {
                    c10 = 1;
                    break;
                }
                break;
            case -891980137:
                if (str3.equals("strong")) {
                    c10 = 2;
                    break;
                }
                break;
            case 97:
                if (str3.equals("a")) {
                    c10 = 3;
                    break;
                }
                break;
            case 98:
                if (str3.equals("b")) {
                    c10 = 4;
                    break;
                }
                break;
            case 105:
                if (str3.equals("i")) {
                    c10 = 5;
                    break;
                }
                break;
            case 115:
                if (str3.equals("s")) {
                    c10 = 6;
                    break;
                }
                break;
            case 117:
                if (str3.equals("u")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3152:
                if (str3.equals("br")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 3240:
                if (str3.equals("em")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 3712:
                if (str3.equals("tt")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 99339:
                if (str3.equals("del")) {
                    c10 = 11;
                    break;
                }
                break;
            case 114240:
                if (str3.equals("sub")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 114254:
                if (str3.equals("sup")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 3059181:
                if (str3.equals("code")) {
                    c10 = 14;
                    break;
                }
                break;
            case 3344077:
                if (str3.equals("mark")) {
                    c10 = 15;
                    break;
                }
                break;
            case 1438365596:
                if (str3.equals("animated-emoji")) {
                    c10 = 16;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i10 = i9 | 256;
                str2 = str;
                j11 = j10;
                break;
            case 1:
            case 6:
            case 11:
                i10 = i9 | 8;
                str2 = str;
                j11 = j10;
                break;
            case 2:
            case 4:
                i10 = i9 | 1;
                str2 = str;
                j11 = j10;
                break;
            case 3:
                String a2 = t3Var.a("href");
                if (a2 != null) {
                    str2 = a2;
                    i10 = i9;
                    j11 = j10;
                    break;
                }
                i10 = i9;
                str2 = str;
                j11 = j10;
            case 5:
            case '\t':
                i10 = i9 | 2;
                str2 = str;
                j11 = j10;
                break;
            case 7:
                i10 = i9 | 16;
                str2 = str;
                j11 = j10;
                break;
            case '\b':
                j(spannableStringBuilder, "\n", i9, str, j10);
                return;
            case '\n':
            case 14:
                i10 = i9 | 4;
                str2 = str;
                j11 = j10;
                break;
            case '\f':
                i10 = i9 | 16384;
                str2 = str;
                j11 = j10;
                break;
            case '\r':
                i11 = 32768;
                i10 = i11 | i9;
                str2 = str;
                j11 = j10;
                break;
            case 15:
                i11 = 65536;
                i10 = i11 | i9;
                str2 = str;
                j11 = j10;
                break;
            case 16:
                String a3 = t3Var.a("data-document-id");
                if (a3 != null) {
                    try {
                        j11 = Long.parseLong(a3.trim());
                        i10 = i9;
                        str2 = str;
                        break;
                    } catch (Exception unused) {
                    }
                }
                i10 = i9;
                str2 = str;
                j11 = j10;
                break;
            default:
                i10 = i9;
                str2 = str;
                j11 = j10;
                break;
        }
        if (t3Var.f46726e.isEmpty() && !t3Var.f46724b) {
            return;
        }
        e(spannableStringBuilder, t3Var, i10, str2, j11);
    }

    public static void i(StringBuilder sb2, String str, long j10, s sVar, TL_iv.PageBlock pageBlock) {
        sb2.append('<');
        sb2.append(str);
        sb2.append(" src=\"");
        sb2.append(j10);
        sb2.append('\"');
        if (sVar != null) {
            if (sVar.f46675j > 0) {
                sb2.append(" width=\"");
                sb2.append(sVar.f46675j);
                sb2.append('\"');
            }
            if (sVar.f46676k > 0) {
                sb2.append(" height=\"");
                sb2.append(sVar.f46676k);
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

    public static void j(SpannableStringBuilder spannableStringBuilder, String str, int i9, String str2, long j10) {
        if (str != null && str.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            int length2 = spannableStringBuilder.length();
            if (j10 != 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(j10, (Paint.FontMetricsInt) null), length, length2, 33);
            }
            if (i9 != 0) {
                ?? obj = new Object();
                obj.f34062a = i9 & 114975;
                spannableStringBuilder.setSpan(new wz0(obj, AndroidUtilities.dp(SharedConfig.fontSize)), length, length2, 33);
            }
            if (str2 != null) {
                spannableStringBuilder.setSpan(u5.k(str2), length, length2, 33);
            }
        }
    }

    public static SpannableStringBuilder k(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return null;
        }
        SpannableStringBuilder r10 = u5.r(richText, null, true);
        if (r10.length() <= 0) {
            return null;
        }
        return r10;
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

    public static qh.a m(qh.t3 r8) {
        throw new UnsupportedOperationException("Method not decompiled: qh.u3.m(qh.t3):qh.a");
    }

    public static a n(t3 t3Var, boolean z10) {
        long E = E(t3Var.a("src"));
        if (E <= 0) {
            return null;
        }
        TL_iv.PageBlock y10 = y(E, z10, t3Var.b("data-spoiler"));
        J(y10);
        return new a(y10, 0, 0);
    }

    public static SpannableStringBuilder o(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        if (pageBlock != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            SpannableStringBuilder r10 = u5.r(richText, null, true);
            if (r10.length() > 0) {
                return r10;
            }
        }
        return null;
    }

    public static void p(t3 t3Var, TL_iv.pageBlockTable pageblocktable) {
        boolean z10;
        String lowerCase;
        int indexOf;
        ArrayList arrayList = t3Var.f46726e;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t3 t3Var2 = (t3) obj;
            if (!t3Var2.f46724b) {
                String str = t3Var2.f46723a;
                str.getClass();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case 3710:
                        if (str.equals("tr")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 110157846:
                        if (str.equals("tbody")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 110277346:
                        if (str.equals("tfoot")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 110326868:
                        if (str.equals("thead")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 552573414:
                        if (str.equals("caption")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        pagetablerow.cells = new ArrayList<>();
                        ArrayList arrayList3 = t3Var2.f46726e;
                        int size2 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList3.get(i11);
                            i11++;
                            t3 t3Var3 = (t3) obj2;
                            if (!t3Var3.f46724b) {
                                if ("td".equals(t3Var3.f46723a) || "th".equals(t3Var3.f46723a)) {
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    pagetablecell.colspan = C(i9, t3Var3.a("colspan"));
                                    pagetablecell.rowspan = C(i9, t3Var3.a("rowspan"));
                                    w5.d(pagetablecell, w(t3Var3));
                                    if (!"th".equals(t3Var3.f46723a) && !t3Var3.b("header")) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    w5.l(pagetablecell, z10);
                                    String a2 = t3Var3.a("align");
                                    if (a2 == null) {
                                        String a3 = t3Var3.a("style");
                                        if (a3 != null && (indexOf = (lowerCase = a3.toLowerCase()).indexOf("text-align")) >= 0) {
                                            if (lowerCase.indexOf("center", indexOf) >= 0) {
                                                a2 = "center";
                                            } else if (lowerCase.indexOf("right", indexOf) >= 0) {
                                                a2 = "right";
                                            }
                                        }
                                        a2 = null;
                                    }
                                    if ("center".equalsIgnoreCase(a2)) {
                                        w5.k(pagetablecell, 1);
                                    } else if ("right".equalsIgnoreCase(a2)) {
                                        w5.k(pagetablecell, 2);
                                    }
                                    String a10 = t3Var3.a("valign");
                                    if ("middle".equalsIgnoreCase(a10)) {
                                        w5.m(pagetablecell, 1);
                                    } else if ("bottom".equalsIgnoreCase(a10)) {
                                        w5.m(pagetablecell, 2);
                                        pagetablerow.cells.add(pagetablecell);
                                    }
                                    pagetablerow.cells.add(pagetablecell);
                                }
                            }
                            i9 = 0;
                        }
                        if (pagetablerow.cells.isEmpty()) {
                            pagetablerow.cells.add(w5.f());
                        }
                        arrayList2.add(pagetablerow);
                        break;
                    case 1:
                    case 2:
                    case 3:
                        p(t3Var2, pageblocktable);
                        break;
                    case 4:
                        pageblocktable.title = u5.f(w(t3Var2));
                        break;
                }
                i9 = 0;
            }
        }
    }

    public static String q(String str) {
        String str2;
        int parseInt;
        if (str == null) {
            return "";
        }
        if (str.indexOf(38) < 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        int i9 = 0;
        while (i9 < str.length()) {
            char charAt = str.charAt(i9);
            if (charAt != '&') {
                sb2.append(charAt);
            } else {
                int i10 = i9 + 1;
                int indexOf = str.indexOf(59, i10);
                if (indexOf >= 0 && indexOf - i9 <= 12) {
                    String substring = str.substring(i10, indexOf);
                    substring.getClass();
                    char c10 = 65535;
                    switch (substring.hashCode()) {
                        case 3309:
                            if (substring.equals("gt")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3464:
                            if (substring.equals("lt")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 96708:
                            if (substring.equals("amp")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 3000915:
                            if (substring.equals("apos")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 3374865:
                            if (substring.equals("nbsp")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 3482377:
                            if (substring.equals("quot")) {
                                c10 = 5;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            str2 = ">";
                            break;
                        case 1:
                            str2 = "<";
                            break;
                        case 2:
                            str2 = "&";
                            break;
                        case 3:
                            str2 = "'";
                            break;
                        case 4:
                            str2 = " ";
                            break;
                        case 5:
                            str2 = "\"";
                            break;
                        default:
                            str2 = null;
                            if (substring.length() > 1 && substring.charAt(0) == '#') {
                                try {
                                    if (substring.charAt(1) != 'x' && substring.charAt(1) != 'X') {
                                        parseInt = Integer.parseInt(substring.substring(1));
                                        str2 = new String(Character.toChars(parseInt));
                                        break;
                                    }
                                    parseInt = Integer.parseInt(substring.substring(2), 16);
                                    str2 = new String(Character.toChars(parseInt));
                                } catch (Exception unused) {
                                    break;
                                }
                            }
                            break;
                    }
                    if (str2 != null) {
                        sb2.append(str2);
                        i9 = indexOf;
                    } else {
                        sb2.append(charAt);
                    }
                } else {
                    sb2.append(charAt);
                }
            }
            i9++;
        }
        return sb2.toString();
    }

    public static void r(StringBuilder sb2, CharSequence charSequence, int i9, int i10) {
        while (i9 < i10) {
            char charAt = charSequence.charAt(i9);
            if (charAt == '\n') {
                sb2.append("<br>");
            } else if (charAt == '<') {
                sb2.append("&lt;");
            } else if (charAt == '>') {
                sb2.append("&gt;");
            } else if (charAt == '&') {
                sb2.append("&amp;");
            } else {
                sb2.append(charAt);
            }
            i9++;
        }
    }

    public static String s(String str) {
        if (str == null) {
            return "";
        }
        return str.replace("&", "&amp;").replace("\"", "&quot;").replace("<", "&lt;").replace(">", "&gt;");
    }

    public static void t(ArrayList arrayList, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder != null && !x(spannableStringBuilder.toString())) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = u5.f(L(spannableStringBuilder));
            arrayList.add(new a(pageblockparagraph, 0, 0));
        }
    }

    public static TL_keyboard.RichButtonStyle u(t3 t3Var) {
        TL_keyboard.RichButtonStyle richButtonStyle = new TL_keyboard.RichButtonStyle();
        String a2 = t3Var.a("data-style");
        richButtonStyle.bg_primary = "primary".equals(a2);
        richButtonStyle.bg_danger = "danger".equals(a2);
        richButtonStyle.bg_success = "success".equals(a2);
        return richButtonStyle;
    }

    public static TL_keyboard.InlineButtonType v(t3 t3Var) {
        String a2 = t3Var.a("data-type");
        if ("url".equals(a2)) {
            String a3 = t3Var.a("data-url");
            if (!TextUtils.isEmpty(a3)) {
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                tL_inlineButtonTypeUrl.url = a3;
                return tL_inlineButtonTypeUrl;
            }
            return null;
        } else if ("copy".equals(a2)) {
            String a10 = t3Var.a("data-copy-text");
            if (!TextUtils.isEmpty(a10)) {
                TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                tL_inlineButtonTypeCopy.copy_text = a10;
                return tL_inlineButtonTypeCopy;
            }
            return null;
        } else if ("user-profile".equals(a2)) {
            long E = E(t3Var.a("data-user-id"));
            if (E > 0) {
                TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                tL_inlineButtonTypeUserProfile.user_id = E;
                return tL_inlineButtonTypeUserProfile;
            }
            return null;
        } else {
            return null;
        }
    }

    public static CharSequence w(t3 t3Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, t3Var, 0, null, 0L);
        return L(spannableStringBuilder);
    }

    public static boolean x(String str) {
        if (str == null) {
            return true;
        }
        for (int i9 = 0; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            if (charAt != ' ' && charAt != '\n' && charAt != '\t' && charAt != '\r' && charAt != 160) {
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

    public static java.util.ArrayList z(java.lang.String r16, java.util.HashMap r17) {
        throw new UnsupportedOperationException("Method not decompiled: qh.u3.z(java.lang.String, java.util.HashMap):java.util.ArrayList");
    }
}
