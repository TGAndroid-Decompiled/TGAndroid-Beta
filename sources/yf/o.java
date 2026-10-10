package yf;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.v11;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.yj0;
public abstract class o {
    public static void a(u11 u11Var, StringBuilder sb2) {
        if (u11Var != null) {
            if ((u11Var.f31299a & 768) > 0) {
                sb2.append("<spoiler>");
            }
            if ((u11Var.f31299a & 1) > 0) {
                sb2.append("<b>");
            }
            if ((u11Var.f31299a & 2) > 0) {
                sb2.append("<i>");
            }
            if ((u11Var.f31299a & 16) > 0) {
                sb2.append("<u>");
            }
            if ((u11Var.f31299a & 8) > 0) {
                sb2.append("<s>");
            }
            if ((u11Var.f31299a & 4) > 0) {
                sb2.append("<code>");
            }
            if ((u11Var.f31299a & 128) > 0 && u11Var.d != null) {
                sb2.append("<a href=\"");
                sb2.append(u11Var.d.url);
                sb2.append("\">");
            }
        }
    }

    public static void b(u11 u11Var, StringBuilder sb2) {
        if (u11Var != null) {
            if ((u11Var.f31299a & 128) > 0 && u11Var.d != null) {
                sb2.append("</a>");
            }
            if ((u11Var.f31299a & 4) > 0) {
                sb2.append("</code>");
            }
            if ((u11Var.f31299a & 8) > 0) {
                sb2.append("</s>");
            }
            if ((u11Var.f31299a & 16) > 0) {
                sb2.append("</u>");
            }
            if ((u11Var.f31299a & 2) > 0) {
                sb2.append("</i>");
            }
            if ((u11Var.f31299a & 1) > 0) {
                sb2.append("</b>");
            }
            if ((u11Var.f31299a & 768) > 0) {
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
            int nextSpanTransition = spanned.nextSpanTransition(i15, length, yj0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            yj0[] yj0VarArr = (yj0[]) spanned.getSpans(i15, nextSpanTransition, yj0.class);
            if (yj0VarArr != null) {
                for (yj0 yj0Var : yj0VarArr) {
                    if (yj0Var.f33315e) {
                        str3 = "<blockquote collapsed>";
                    } else {
                        str3 = "<blockquote>";
                    }
                    sb2.append(str3);
                }
            }
            while (i15 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i15, nextSpanTransition, v11.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                v11[] v11VarArr = (v11[]) spanned.getSpans(i15, nextSpanTransition2, v11.class);
                String str4 = "<pre>";
                if (v11VarArr != null) {
                    for (v11 v11Var : v11VarArr) {
                        if (v11Var != null) {
                            a(v11Var.f31704b, sb2);
                        }
                    }
                }
                while (i15 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i15, nextSpanTransition2, w61.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    w61[] w61VarArr = (w61[]) spanned.getSpans(i15, nextSpanTransition3, w61.class);
                    String str5 = "\">";
                    if (w61VarArr != null) {
                        for (w61 w61Var : w61VarArr) {
                            a(w61Var.f32608a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(w61Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i15 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i15, nextSpanTransition3, t61.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        t61[] t61VarArr = (t61[]) spanned.getSpans(i15, nextSpanTransition4, t61.class);
                        if (t61VarArr != null) {
                            for (t61 t61Var : t61VarArr) {
                                if (t61Var != null) {
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
                                int nextSpanTransition6 = spanned.nextSpanTransition(i21, i10, b6.class);
                                int i22 = i10;
                                if (nextSpanTransition6 >= 0) {
                                    i10 = nextSpanTransition6;
                                }
                                b6[] b6VarArr = (b6[]) spanned.getSpans(i21, i10, b6.class);
                                int i23 = i21;
                                int i24 = nextSpanTransition2;
                                if (b6VarArr != null) {
                                    int i25 = 0;
                                    while (i25 < b6VarArr.length) {
                                        b6 b6Var = b6VarArr[i25];
                                        int i26 = i25;
                                        if (b6Var != null && !b6Var.standard) {
                                            str2 = str4;
                                            sb2.append("<animated-emoji data-document-id=\"" + b6Var.documentId + str5);
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
                                if (b6VarArr != null) {
                                    for (b6 b6Var2 : b6VarArr) {
                                        if (b6Var2 != null && !b6Var2.standard) {
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
                        if (t61VarArr != null) {
                            for (t61 t61Var2 : t61VarArr) {
                                if (t61Var2 != null) {
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
                    if (w61VarArr != null) {
                        for (w61 w61Var2 : w61VarArr) {
                            sb2.append("</a>");
                            b(w61Var2.f32608a, sb2);
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
                if (v11VarArr != null) {
                    for (v11 v11Var2 : v11VarArr) {
                        if (v11Var2 != null) {
                            b(v11Var2.f31704b, sb2);
                        }
                    }
                }
                length = i41;
                nextSpanTransition = i42;
                i15 = i43;
            }
            int i44 = length;
            int i45 = nextSpanTransition;
            if (yj0VarArr != null) {
                for (int length2 = yj0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i44;
            i15 = i45;
        }
        return sb2.toString();
    }
}
