package yf;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.x5;
public abstract class o {
    public static void a(o01 o01Var, StringBuilder sb2) {
        if (o01Var != null) {
            if ((o01Var.f26643a & 768) > 0) {
                sb2.append("<spoiler>");
            }
            if ((o01Var.f26643a & 1) > 0) {
                sb2.append("<b>");
            }
            if ((o01Var.f26643a & 2) > 0) {
                sb2.append("<i>");
            }
            if ((o01Var.f26643a & 16) > 0) {
                sb2.append("<u>");
            }
            if ((o01Var.f26643a & 8) > 0) {
                sb2.append("<s>");
            }
            if ((o01Var.f26643a & 128) > 0 && o01Var.d != null) {
                sb2.append("<a href=\"");
                sb2.append(o01Var.d.url);
                sb2.append("\">");
            }
        }
    }

    public static void b(o01 o01Var, StringBuilder sb2) {
        if (o01Var != null) {
            if ((o01Var.f26643a & 128) > 0 && o01Var.d != null) {
                sb2.append("</a>");
            }
            if ((o01Var.f26643a & 8) > 0) {
                sb2.append("</s>");
            }
            if ((o01Var.f26643a & 16) > 0) {
                sb2.append("</u>");
            }
            if ((o01Var.f26643a & 2) > 0) {
                sb2.append("</i>");
            }
            if ((o01Var.f26643a & 1) > 0) {
                sb2.append("</b>");
            }
            if ((o01Var.f26643a & 768) > 0) {
                sb2.append("</spoiler>");
            }
        }
    }

    public static String c(Spanned spanned) {
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        int length = spanned.length();
        int i15 = 0;
        while (i15 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i15, length, si0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            si0[] si0VarArr = (si0[]) spanned.getSpans(i15, nextSpanTransition, si0.class);
            if (si0VarArr != null) {
                for (si0 si0Var : si0VarArr) {
                    if (si0Var.e) {
                        str3 = "<blockquote collapsed>";
                    } else {
                        str3 = "<blockquote>";
                    }
                    sb2.append(str3);
                }
            }
            while (i15 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i15, nextSpanTransition, p01.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                p01[] p01VarArr = (p01[]) spanned.getSpans(i15, nextSpanTransition2, p01.class);
                String str4 = "<pre>";
                if (p01VarArr != null) {
                    for (p01 p01Var : p01VarArr) {
                        if (p01Var != null) {
                            a(p01Var.f26923b, sb2);
                        }
                    }
                }
                while (i15 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i15, nextSpanTransition2, o51.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    o51[] o51VarArr = (o51[]) spanned.getSpans(i15, nextSpanTransition3, o51.class);
                    String str5 = "\">";
                    if (o51VarArr != null) {
                        for (o51 o51Var : o51VarArr) {
                            a(o51Var.f26698a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(o51Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i15 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i15, nextSpanTransition3, l51.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        l51[] l51VarArr = (l51[]) spanned.getSpans(i15, nextSpanTransition4, l51.class);
                        if (l51VarArr != null) {
                            for (l51 l51Var : l51VarArr) {
                                if (l51Var != null) {
                                    sb2.append(str4);
                                }
                            }
                        }
                        while (i15 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i15, nextSpanTransition4, CodeHighlighting.Span.class);
                            int i16 = length;
                            if (nextSpanTransition5 < 0) {
                                i10 = nextSpanTransition4;
                            } else {
                                i10 = nextSpanTransition5;
                            }
                            CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(i15, i10, CodeHighlighting.Span.class);
                            int i17 = i15;
                            int i18 = nextSpanTransition;
                            if (spanArr != null) {
                                int i19 = 0;
                                while (i19 < spanArr.length) {
                                    CodeHighlighting.Span span = spanArr[i19];
                                    int i20 = i19;
                                    if (span != null) {
                                        if (TextUtils.isEmpty(span.lng)) {
                                            sb2.append(str4);
                                        } else {
                                            sb2.append("<pre lang=\"");
                                            sb2.append(span.lng);
                                            sb2.append(str5);
                                        }
                                    }
                                    i19 = i20 + 1;
                                }
                            }
                            int i21 = i17;
                            while (i21 < i10) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i21, i10, x5.class);
                                int i22 = i10;
                                if (nextSpanTransition6 >= 0) {
                                    i10 = nextSpanTransition6;
                                }
                                x5[] x5VarArr = (x5[]) spanned.getSpans(i21, i10, x5.class);
                                int i23 = i21;
                                int i24 = nextSpanTransition2;
                                if (x5VarArr != null) {
                                    int i25 = 0;
                                    while (i25 < x5VarArr.length) {
                                        x5 x5Var = x5VarArr[i25];
                                        int i26 = i25;
                                        if (x5Var != null && !x5Var.standard) {
                                            str2 = str4;
                                            sb2.append("<animated-emoji data-document-id=\"" + x5Var.documentId + str5);
                                        } else {
                                            str2 = str4;
                                        }
                                        i25 = i26 + 1;
                                        str4 = str2;
                                    }
                                }
                                String str6 = str4;
                                int i27 = i23;
                                while (i27 < i10) {
                                    char charAt = spanned.charAt(i27);
                                    if (charAt == '\n') {
                                        sb2.append("<br>");
                                    } else if (charAt == '<') {
                                        sb2.append("&lt;");
                                    } else if (charAt == '>') {
                                        sb2.append("&gt;");
                                    } else if (charAt == '&') {
                                        sb2.append("&amp;");
                                    } else {
                                        i11 = i27;
                                        i12 = nextSpanTransition3;
                                        if (charAt >= 55296 && charAt <= 57343) {
                                            if (charAt < 56320 && (i14 = i11 + 1) < i10) {
                                                str = str5;
                                                char charAt2 = spanned.charAt(i14);
                                                if (charAt2 >= 56320 && charAt2 <= 57343) {
                                                    sb2.append("&#");
                                                    sb2.append(((charAt - 55296) << 10) | 65536 | (charAt2 - 56320));
                                                    sb2.append(";");
                                                    i13 = i14;
                                                    i27 = i13 + 1;
                                                    nextSpanTransition3 = i12;
                                                    str5 = str;
                                                }
                                                i13 = i11;
                                                i27 = i13 + 1;
                                                nextSpanTransition3 = i12;
                                                str5 = str;
                                            }
                                            str = str5;
                                            i13 = i11;
                                            i27 = i13 + 1;
                                            nextSpanTransition3 = i12;
                                            str5 = str;
                                        } else {
                                            str = str5;
                                            if (charAt <= '~' && charAt >= ' ') {
                                                if (charAt == ' ') {
                                                    i13 = i11;
                                                    while (true) {
                                                        int i28 = i13 + 1;
                                                        if (i28 >= i10 || spanned.charAt(i28) != ' ') {
                                                            break;
                                                        }
                                                        sb2.append("&nbsp;");
                                                        i13 = i28;
                                                    }
                                                    sb2.append(' ');
                                                    i27 = i13 + 1;
                                                    nextSpanTransition3 = i12;
                                                    str5 = str;
                                                } else {
                                                    sb2.append(charAt);
                                                }
                                            } else {
                                                sb2.append("&#");
                                                sb2.append((int) charAt);
                                                sb2.append(";");
                                            }
                                            i13 = i11;
                                            i27 = i13 + 1;
                                            nextSpanTransition3 = i12;
                                            str5 = str;
                                        }
                                    }
                                    i11 = i27;
                                    i12 = nextSpanTransition3;
                                    str = str5;
                                    i13 = i11;
                                    i27 = i13 + 1;
                                    nextSpanTransition3 = i12;
                                    str5 = str;
                                }
                                int i29 = nextSpanTransition3;
                                String str7 = str5;
                                if (x5VarArr != null) {
                                    for (x5 x5Var2 : x5VarArr) {
                                        if (x5Var2 != null && !x5Var2.standard) {
                                            sb2.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i21 = i10;
                                i10 = i22;
                                nextSpanTransition2 = i24;
                                str4 = str6;
                                nextSpanTransition3 = i29;
                                str5 = str7;
                            }
                            int i30 = i10;
                            int i31 = nextSpanTransition2;
                            String str8 = str4;
                            int i32 = nextSpanTransition3;
                            String str9 = str5;
                            if (spanArr != null) {
                                for (CodeHighlighting.Span span2 : spanArr) {
                                    if (span2 != null) {
                                        sb2.append("</pre>");
                                    }
                                }
                            }
                            length = i16;
                            nextSpanTransition = i18;
                            i15 = i30;
                            nextSpanTransition2 = i31;
                            str4 = str8;
                            nextSpanTransition3 = i32;
                            str5 = str9;
                        }
                        int i33 = length;
                        int i34 = nextSpanTransition;
                        int i35 = nextSpanTransition2;
                        String str10 = str4;
                        int i36 = nextSpanTransition3;
                        String str11 = str5;
                        if (l51VarArr != null) {
                            for (l51 l51Var2 : l51VarArr) {
                                if (l51Var2 != null) {
                                    sb2.append("</pre>");
                                }
                            }
                        }
                        i15 = nextSpanTransition4;
                        length = i33;
                        nextSpanTransition = i34;
                        nextSpanTransition2 = i35;
                        str4 = str10;
                        nextSpanTransition3 = i36;
                        str5 = str11;
                    }
                    int i37 = length;
                    int i38 = nextSpanTransition;
                    int i39 = nextSpanTransition2;
                    String str12 = str4;
                    int i40 = nextSpanTransition3;
                    if (o51VarArr != null) {
                        for (o51 o51Var2 : o51VarArr) {
                            sb2.append("</a>");
                            b(o51Var2.f26698a, sb2);
                        }
                    }
                    length = i37;
                    nextSpanTransition = i38;
                    nextSpanTransition2 = i39;
                    str4 = str12;
                    i15 = i40;
                }
                int i41 = length;
                int i42 = nextSpanTransition;
                int i43 = nextSpanTransition2;
                if (p01VarArr != null) {
                    for (p01 p01Var2 : p01VarArr) {
                        if (p01Var2 != null) {
                            b(p01Var2.f26923b, sb2);
                        }
                    }
                }
                length = i41;
                nextSpanTransition = i42;
                i15 = i43;
            }
            int i44 = length;
            int i45 = nextSpanTransition;
            if (si0VarArr != null) {
                for (int length2 = si0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i44;
            i15 = i45;
        }
        return sb2.toString();
    }
}
