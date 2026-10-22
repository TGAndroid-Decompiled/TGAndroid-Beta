package zf;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.n11;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.o11;
import org.telegram.ui.Components.qj0;
public abstract class o {
    public static void a(n11 n11Var, StringBuilder sb2) {
        if (n11Var != null) {
            if ((n11Var.f28653a & 768) > 0) {
                sb2.append("<spoiler>");
            }
            if ((n11Var.f28653a & 1) > 0) {
                sb2.append("<b>");
            }
            if ((n11Var.f28653a & 2) > 0) {
                sb2.append("<i>");
            }
            if ((n11Var.f28653a & 16) > 0) {
                sb2.append("<u>");
            }
            if ((n11Var.f28653a & 8) > 0) {
                sb2.append("<s>");
            }
            if ((n11Var.f28653a & 4) > 0) {
                sb2.append("<code>");
            }
            if ((n11Var.f28653a & 128) > 0 && n11Var.d != null) {
                sb2.append("<a href=\"");
                sb2.append(n11Var.d.url);
                sb2.append("\">");
            }
        }
    }

    public static void b(n11 n11Var, StringBuilder sb2) {
        if (n11Var != null) {
            if ((n11Var.f28653a & 128) > 0 && n11Var.d != null) {
                sb2.append("</a>");
            }
            if ((n11Var.f28653a & 4) > 0) {
                sb2.append("</code>");
            }
            if ((n11Var.f28653a & 8) > 0) {
                sb2.append("</s>");
            }
            if ((n11Var.f28653a & 16) > 0) {
                sb2.append("</u>");
            }
            if ((n11Var.f28653a & 2) > 0) {
                sb2.append("</i>");
            }
            if ((n11Var.f28653a & 1) > 0) {
                sb2.append("</b>");
            }
            if ((n11Var.f28653a & 768) > 0) {
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
        int i15;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        int length = spanned.length();
        int i16 = 0;
        while (i16 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i16, length, qj0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            qj0[] qj0VarArr = (qj0[]) spanned.getSpans(i16, nextSpanTransition, qj0.class);
            if (qj0VarArr != null) {
                for (qj0 qj0Var : qj0VarArr) {
                    if (qj0Var.e) {
                        str3 = "<blockquote collapsed>";
                    } else {
                        str3 = "<blockquote>";
                    }
                    sb2.append(str3);
                }
            }
            while (i16 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i16, nextSpanTransition, o11.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                o11[] o11VarArr = (o11[]) spanned.getSpans(i16, nextSpanTransition2, o11.class);
                String str4 = "<pre>";
                if (o11VarArr != null) {
                    for (o11 o11Var : o11VarArr) {
                        if (o11Var != null) {
                            a(o11Var.f28923b, sb2);
                        }
                    }
                }
                while (i16 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i16, nextSpanTransition2, n61.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    n61[] n61VarArr = (n61[]) spanned.getSpans(i16, nextSpanTransition3, n61.class);
                    String str5 = "\">";
                    if (n61VarArr != null) {
                        for (n61 n61Var : n61VarArr) {
                            a(n61Var.f28698a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(n61Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i16 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i16, nextSpanTransition3, k61.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        k61[] k61VarArr = (k61[]) spanned.getSpans(i16, nextSpanTransition4, k61.class);
                        if (k61VarArr != null) {
                            for (k61 k61Var : k61VarArr) {
                                if (k61Var != null) {
                                    sb2.append(str4);
                                }
                            }
                        }
                        while (i16 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i16, nextSpanTransition4, mi.h.class);
                            int i17 = length;
                            if (nextSpanTransition5 < 0) {
                                i10 = nextSpanTransition4;
                            } else {
                                i10 = nextSpanTransition5;
                            }
                            mi.h[] hVarArr = (mi.h[]) spanned.getSpans(i16, i10, mi.h.class);
                            int i18 = i16;
                            int i19 = nextSpanTransition;
                            if (hVarArr != null) {
                                int i20 = 0;
                                while (i20 < hVarArr.length) {
                                    mi.h hVar = hVarArr[i20];
                                    if (hVar != null) {
                                        String str6 = hVar.f16953a;
                                        if (TextUtils.isEmpty(str6)) {
                                            sb2.append(str4);
                                        } else {
                                            i15 = i20;
                                            sb2.append("<pre lang=\"");
                                            sb2.append(str6);
                                            sb2.append(str5);
                                            i20 = i15 + 1;
                                        }
                                    }
                                    i15 = i20;
                                    i20 = i15 + 1;
                                }
                            }
                            int i21 = i18;
                            while (i21 < i10) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i21, i10, a6.class);
                                int i22 = i10;
                                if (nextSpanTransition6 >= 0) {
                                    i10 = nextSpanTransition6;
                                }
                                a6[] a6VarArr = (a6[]) spanned.getSpans(i21, i10, a6.class);
                                int i23 = i21;
                                int i24 = nextSpanTransition2;
                                if (a6VarArr != null) {
                                    int i25 = 0;
                                    while (i25 < a6VarArr.length) {
                                        a6 a6Var = a6VarArr[i25];
                                        int i26 = i25;
                                        if (a6Var != null && !a6Var.standard) {
                                            str2 = str4;
                                            sb2.append("<animated-emoji data-document-id=\"" + a6Var.documentId + str5);
                                        } else {
                                            str2 = str4;
                                        }
                                        i25 = i26 + 1;
                                        str4 = str2;
                                    }
                                }
                                String str7 = str4;
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
                                String str8 = str5;
                                if (a6VarArr != null) {
                                    for (a6 a6Var2 : a6VarArr) {
                                        if (a6Var2 != null && !a6Var2.standard) {
                                            sb2.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i21 = i10;
                                i10 = i22;
                                nextSpanTransition2 = i24;
                                str4 = str7;
                                nextSpanTransition3 = i29;
                                str5 = str8;
                            }
                            int i30 = i10;
                            int i31 = nextSpanTransition2;
                            String str9 = str4;
                            int i32 = nextSpanTransition3;
                            String str10 = str5;
                            if (hVarArr != null) {
                                for (mi.h hVar2 : hVarArr) {
                                    if (hVar2 != null) {
                                        sb2.append("</pre>");
                                    }
                                }
                            }
                            length = i17;
                            nextSpanTransition = i19;
                            i16 = i30;
                            nextSpanTransition2 = i31;
                            str4 = str9;
                            nextSpanTransition3 = i32;
                            str5 = str10;
                        }
                        int i33 = length;
                        int i34 = nextSpanTransition;
                        int i35 = nextSpanTransition2;
                        String str11 = str4;
                        int i36 = nextSpanTransition3;
                        String str12 = str5;
                        if (k61VarArr != null) {
                            for (k61 k61Var2 : k61VarArr) {
                                if (k61Var2 != null) {
                                    sb2.append("</pre>");
                                }
                            }
                        }
                        i16 = nextSpanTransition4;
                        length = i33;
                        nextSpanTransition = i34;
                        nextSpanTransition2 = i35;
                        str4 = str11;
                        nextSpanTransition3 = i36;
                        str5 = str12;
                    }
                    int i37 = length;
                    int i38 = nextSpanTransition;
                    int i39 = nextSpanTransition2;
                    String str13 = str4;
                    int i40 = nextSpanTransition3;
                    if (n61VarArr != null) {
                        for (n61 n61Var2 : n61VarArr) {
                            sb2.append("</a>");
                            b(n61Var2.f28698a, sb2);
                        }
                    }
                    length = i37;
                    nextSpanTransition = i38;
                    nextSpanTransition2 = i39;
                    str4 = str13;
                    i16 = i40;
                }
                int i41 = length;
                int i42 = nextSpanTransition;
                int i43 = nextSpanTransition2;
                if (o11VarArr != null) {
                    for (o11 o11Var2 : o11VarArr) {
                        if (o11Var2 != null) {
                            b(o11Var2.f28923b, sb2);
                        }
                    }
                }
                length = i41;
                nextSpanTransition = i42;
                i16 = i43;
            }
            int i44 = length;
            int i45 = nextSpanTransition;
            if (qj0VarArr != null) {
                for (int length2 = qj0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i44;
            i16 = i45;
        }
        return sb2.toString();
    }
}
