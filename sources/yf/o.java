package yf;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.z11;
public abstract class o {
    public static void a(z11 z11Var, StringBuilder sb2) {
        if (z11Var != null) {
            if ((z11Var.f33255a & 768) > 0) {
                sb2.append("<spoiler>");
            }
            if ((z11Var.f33255a & 1) > 0) {
                sb2.append("<b>");
            }
            if ((z11Var.f33255a & 2) > 0) {
                sb2.append("<i>");
            }
            if ((z11Var.f33255a & 16) > 0) {
                sb2.append("<u>");
            }
            if ((z11Var.f33255a & 8) > 0) {
                sb2.append("<s>");
            }
            if ((z11Var.f33255a & 4) > 0) {
                sb2.append("<code>");
            }
            if ((z11Var.f33255a & 128) > 0 && z11Var.d != null) {
                sb2.append("<a href=\"");
                sb2.append(z11Var.d.url);
                sb2.append("\">");
            }
        }
    }

    public static void b(z11 z11Var, StringBuilder sb2) {
        if (z11Var != null) {
            if ((z11Var.f33255a & 128) > 0 && z11Var.d != null) {
                sb2.append("</a>");
            }
            if ((z11Var.f33255a & 4) > 0) {
                sb2.append("</code>");
            }
            if ((z11Var.f33255a & 8) > 0) {
                sb2.append("</s>");
            }
            if ((z11Var.f33255a & 16) > 0) {
                sb2.append("</u>");
            }
            if ((z11Var.f33255a & 2) > 0) {
                sb2.append("</i>");
            }
            if ((z11Var.f33255a & 1) > 0) {
                sb2.append("</b>");
            }
            if ((z11Var.f33255a & 768) > 0) {
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
            int nextSpanTransition = spanned.nextSpanTransition(i16, length, ak0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            ak0[] ak0VarArr = (ak0[]) spanned.getSpans(i16, nextSpanTransition, ak0.class);
            if (ak0VarArr != null) {
                for (ak0 ak0Var : ak0VarArr) {
                    if (ak0Var.f24418e) {
                        str3 = "<blockquote collapsed>";
                    } else {
                        str3 = "<blockquote>";
                    }
                    sb2.append(str3);
                }
            }
            while (i16 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i16, nextSpanTransition, a21.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                a21[] a21VarArr = (a21[]) spanned.getSpans(i16, nextSpanTransition2, a21.class);
                String str4 = "<pre>";
                if (a21VarArr != null) {
                    for (a21 a21Var : a21VarArr) {
                        if (a21Var != null) {
                            a(a21Var.f24222b, sb2);
                        }
                    }
                }
                while (i16 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i16, nextSpanTransition2, a71.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    a71[] a71VarArr = (a71[]) spanned.getSpans(i16, nextSpanTransition3, a71.class);
                    String str5 = "\">";
                    if (a71VarArr != null) {
                        for (a71 a71Var : a71VarArr) {
                            a(a71Var.f24248a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(a71Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i16 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i16, nextSpanTransition3, x61.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        x61[] x61VarArr = (x61[]) spanned.getSpans(i16, nextSpanTransition4, x61.class);
                        if (x61VarArr != null) {
                            for (x61 x61Var : x61VarArr) {
                                if (x61Var != null) {
                                    sb2.append(str4);
                                }
                            }
                        }
                        while (i16 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i16, nextSpanTransition4, ki.h.class);
                            int i17 = length;
                            if (nextSpanTransition5 < 0) {
                                i10 = nextSpanTransition4;
                            } else {
                                i10 = nextSpanTransition5;
                            }
                            ki.h[] hVarArr = (ki.h[]) spanned.getSpans(i16, i10, ki.h.class);
                            int i18 = i16;
                            int i19 = nextSpanTransition;
                            if (hVarArr != null) {
                                int i20 = 0;
                                while (i20 < hVarArr.length) {
                                    ki.h hVar = hVarArr[i20];
                                    if (hVar != null) {
                                        String str6 = hVar.f14885a;
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
                                for (ki.h hVar2 : hVarArr) {
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
                        if (x61VarArr != null) {
                            for (x61 x61Var2 : x61VarArr) {
                                if (x61Var2 != null) {
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
                    if (a71VarArr != null) {
                        for (a71 a71Var2 : a71VarArr) {
                            sb2.append("</a>");
                            b(a71Var2.f24248a, sb2);
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
                if (a21VarArr != null) {
                    for (a21 a21Var2 : a21VarArr) {
                        if (a21Var2 != null) {
                            b(a21Var2.f24222b, sb2);
                        }
                    }
                }
                length = i41;
                nextSpanTransition = i42;
                i16 = i43;
            }
            int i44 = length;
            int i45 = nextSpanTransition;
            if (ak0VarArr != null) {
                for (int length2 = ak0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i44;
            i16 = i45;
        }
        return sb2.toString();
    }
}
