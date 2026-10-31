package rf;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.zz0;
public abstract class n {
    public static void a(yz0 yz0Var, StringBuilder sb2) {
        if (yz0Var != null) {
            if ((yz0Var.f32850a & 768) > 0) {
                sb2.append("<spoiler>");
            }
            if ((yz0Var.f32850a & 1) > 0) {
                sb2.append("<b>");
            }
            if ((yz0Var.f32850a & 2) > 0) {
                sb2.append("<i>");
            }
            if ((yz0Var.f32850a & 16) > 0) {
                sb2.append("<u>");
            }
            if ((yz0Var.f32850a & 8) > 0) {
                sb2.append("<s>");
            }
            if ((yz0Var.f32850a & 4) > 0) {
                sb2.append("<code>");
            }
            if ((yz0Var.f32850a & 128) > 0 && yz0Var.d != null) {
                sb2.append("<a href=\"");
                sb2.append(yz0Var.d.url);
                sb2.append("\">");
            }
        }
    }

    public static void b(yz0 yz0Var, StringBuilder sb2) {
        if (yz0Var != null) {
            if ((yz0Var.f32850a & 128) > 0 && yz0Var.d != null) {
                sb2.append("</a>");
            }
            if ((yz0Var.f32850a & 4) > 0) {
                sb2.append("</code>");
            }
            if ((yz0Var.f32850a & 8) > 0) {
                sb2.append("</s>");
            }
            if ((yz0Var.f32850a & 16) > 0) {
                sb2.append("</u>");
            }
            if ((yz0Var.f32850a & 2) > 0) {
                sb2.append("</i>");
            }
            if ((yz0Var.f32850a & 1) > 0) {
                sb2.append("</b>");
            }
            if ((yz0Var.f32850a & 768) > 0) {
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
            int nextSpanTransition = spanned.nextSpanTransition(i16, length, wh0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            wh0[] wh0VarArr = (wh0[]) spanned.getSpans(i16, nextSpanTransition, wh0.class);
            if (wh0VarArr != null) {
                for (wh0 wh0Var : wh0VarArr) {
                    if (wh0Var.e) {
                        str3 = "<blockquote collapsed>";
                    } else {
                        str3 = "<blockquote>";
                    }
                    sb2.append(str3);
                }
            }
            while (i16 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i16, nextSpanTransition, zz0.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                zz0[] zz0VarArr = (zz0[]) spanned.getSpans(i16, nextSpanTransition2, zz0.class);
                String str4 = "<pre>";
                if (zz0VarArr != null) {
                    for (zz0 zz0Var : zz0VarArr) {
                        if (zz0Var != null) {
                            a(zz0Var.f33277b, sb2);
                        }
                    }
                }
                while (i16 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i16, nextSpanTransition2, g51.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    g51[] g51VarArr = (g51[]) spanned.getSpans(i16, nextSpanTransition3, g51.class);
                    String str5 = "\">";
                    if (g51VarArr != null) {
                        for (g51 g51Var : g51VarArr) {
                            a(g51Var.f26260a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(g51Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i16 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i16, nextSpanTransition3, d51.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        d51[] d51VarArr = (d51[]) spanned.getSpans(i16, nextSpanTransition4, d51.class);
                        if (d51VarArr != null) {
                            for (d51 d51Var : d51VarArr) {
                                if (d51Var != null) {
                                    sb2.append(str4);
                                }
                            }
                        }
                        while (i16 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i16, nextSpanTransition4, di.i.class);
                            int i17 = length;
                            if (nextSpanTransition5 < 0) {
                                i10 = nextSpanTransition4;
                            } else {
                                i10 = nextSpanTransition5;
                            }
                            di.i[] iVarArr = (di.i[]) spanned.getSpans(i16, i10, di.i.class);
                            int i18 = i16;
                            int i19 = nextSpanTransition;
                            if (iVarArr != null) {
                                int i20 = 0;
                                while (i20 < iVarArr.length) {
                                    di.i iVar = iVarArr[i20];
                                    if (iVar != null) {
                                        String str6 = iVar.f5965a;
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
                                int nextSpanTransition6 = spanned.nextSpanTransition(i21, i10, o5.class);
                                int i22 = i10;
                                if (nextSpanTransition6 >= 0) {
                                    i10 = nextSpanTransition6;
                                }
                                o5[] o5VarArr = (o5[]) spanned.getSpans(i21, i10, o5.class);
                                int i23 = i21;
                                int i24 = nextSpanTransition2;
                                if (o5VarArr != null) {
                                    int i25 = 0;
                                    while (i25 < o5VarArr.length) {
                                        o5 o5Var = o5VarArr[i25];
                                        int i26 = i25;
                                        if (o5Var != null && !o5Var.standard) {
                                            str2 = str4;
                                            sb2.append("<animated-emoji data-document-id=\"" + o5Var.documentId + str5);
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
                                if (o5VarArr != null) {
                                    for (o5 o5Var2 : o5VarArr) {
                                        if (o5Var2 != null && !o5Var2.standard) {
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
                            if (iVarArr != null) {
                                for (di.i iVar2 : iVarArr) {
                                    if (iVar2 != null) {
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
                        if (d51VarArr != null) {
                            for (d51 d51Var2 : d51VarArr) {
                                if (d51Var2 != null) {
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
                    if (g51VarArr != null) {
                        for (g51 g51Var2 : g51VarArr) {
                            sb2.append("</a>");
                            b(g51Var2.f26260a, sb2);
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
                if (zz0VarArr != null) {
                    for (zz0 zz0Var2 : zz0VarArr) {
                        if (zz0Var2 != null) {
                            b(zz0Var2.f33277b, sb2);
                        }
                    }
                }
                length = i41;
                nextSpanTransition = i42;
                i16 = i43;
            }
            int i44 = length;
            int i45 = nextSpanTransition;
            if (wh0VarArr != null) {
                for (int length2 = wh0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i44;
            i16 = i45;
        }
        return sb2.toString();
    }
}
