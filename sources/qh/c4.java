package qh;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.ih;
import org.telegram.ui.py;
import org.telegram.ui.yh;
public final class c4 implements Utilities.Callback2 {
    public final int f45168a;
    public final Object f45169b;

    public c4(Object obj, int i10) {
        this.f45168a = i10;
        this.f45169b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        long duration;
        char c3;
        String str;
        String upperCase;
        boolean z4;
        w51 w51Var;
        int i10;
        String str2;
        int i11;
        String str3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i12;
        int i13;
        String str4 = "";
        int i14 = 5;
        boolean z18 = false;
        z18 = false;
        switch (this.f45168a) {
            case 0:
                a5 a5Var = (a5) this.f45169b;
                a5Var.d0(a5Var.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                return;
            case 1:
                ((aa) this.f45169b).Z((Bitmap) obj, ((Float) obj2).floatValue());
                return;
            case 2:
                a7 a7Var = (a7) this.f45169b;
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var2 = (w51) obj2;
                if (a7Var.f44986e0 || a7Var.f44985d0 != null) {
                    TLRPC.WebPage webPage = a7Var.f44985d0;
                    s6 s6Var = new s6(a7Var, 0);
                    int i15 = y6.f46373a;
                    h51 J = h51.J(y6.class);
                    J.G = webPage;
                    J.D = s6Var;
                    arrayList.add(J);
                }
                arrayList.add(h51.k(a7Var.V));
                arrayList.add(h51.A(1, null));
                h51 i16 = h51.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i16.K(a7Var.f44991j0);
                arrayList.add(i16);
                if (a7Var.f44991j0) {
                    arrayList.add(h51.k(a7Var.W));
                }
                arrayList.add(h51.A(3, null));
                arrayList.add(h51.k(a7Var.X));
                return;
            case 3:
                ba baVar = (ba) this.f45169b;
                Boolean bool = (Boolean) obj;
                Float f10 = (Float) obj2;
                if (baVar.U0.getDuration() < 100) {
                    duration = baVar.H1.f46010h0;
                } else {
                    duration = baVar.U0.getDuration();
                }
                float floatValue = ((f10.floatValue() / 0.96f) * 0.04f) + f10.floatValue();
                r6 r6Var = baVar.H1;
                float f11 = r6Var.f45993a0;
                float f12 = r6Var.Z;
                float f13 = (f11 - f12) * floatValue;
                float f14 = (float) duration;
                long j10 = f13 * f14;
                p9 p9Var = baVar.U0;
                long j11 = (f12 * f14) + ((float) j10);
                baVar.J1 = j11;
                p9Var.m(j11);
                e9 e9Var = baVar.f45100s1;
                if (e9Var != null) {
                    e9Var.setCoverTime(baVar.J1);
                }
                r6 r6Var2 = baVar.H1;
                if (r6Var2 != null && r6Var2.f46008g) {
                    r6Var2.f46013j = true;
                    return;
                }
                return;
            case 4:
                ((ea) this.f45169b).b((short[]) obj, ((Integer) obj2).intValue());
                return;
            case 5:
                ((rh.g) this.f45169b).C0((ArrayList) obj, (w51) obj2);
                return;
            case 6:
                rh.f fVar = (rh.f) this.f45169b;
                ArrayList arrayList2 = (ArrayList) obj;
                w51 w51Var3 = (w51) obj2;
                arrayList2.add(h51.k(fVar.V));
                arrayList2.add(h51.k(fVar.W));
                return;
            case 7:
                ((sh.j) this.f45169b).E0((ArrayList) obj, (w51) obj2);
                return;
            case 8:
                w51 w51Var4 = (w51) obj2;
                sh.r.U((sh.r) this.f45169b, (ArrayList) obj);
                return;
            case 9:
                org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) this.f45169b;
                String str5 = (String) obj;
                Long l10 = (Long) obj2;
                StringBuilder sb = new StringBuilder();
                if (l10.longValue() > 0) {
                    sb.append("~");
                    sb.append(AndroidUtilities.formatFileSize(l10.longValue()));
                }
                if (str5 == null) {
                    upperCase = null;
                } else {
                    if (str5.isEmpty()) {
                        str = "";
                    } else {
                        switch (str5.hashCode()) {
                            case -2008589971:
                                if (str5.equals("application/epub+zip")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1719571662:
                                if (str5.equals("application/vnd.oasis.opendocument.text")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1664118616:
                                if (str5.equals("video/3gpp")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1578389996:
                                if (str5.equals("application/vnd.ms-fontobject")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1348237359:
                                if (str5.equals("application/x-cdf")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1348236892:
                                if (str5.equals("application/x-csh")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1079884372:
                                if (str5.equals("video/x-msvideo")) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1073633483:
                                if (str5.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1071817359:
                                if (str5.equals("application/vnd.ms-powerpoint")) {
                                    c3 = '\b';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1050893613:
                                if (str5.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    c3 = '\t';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1007601745:
                                if (str5.equals("audio/x-midi")) {
                                    c3 = '\n';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -958424608:
                                if (str5.equals("text/calendar")) {
                                    c3 = 11;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -816908365:
                                if (str5.equals("application/x-httpd-php")) {
                                    c3 = '\f';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -648684635:
                                if (str5.equals("audio/3gpp2")) {
                                    c3 = '\r';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -433129473:
                                if (str5.equals("application/vnd.apple.installer+xml")) {
                                    c3 = 14;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -366307023:
                                if (str5.equals("application/vnd.ms-excel")) {
                                    c3 = 15;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -48069494:
                                if (str5.equals("video/3gpp2")) {
                                    c3 = 16;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -43923783:
                                if (str5.equals("application/gzip")) {
                                    c3 = 17;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -43491031:
                                if (str5.equals("application/x-sh")) {
                                    c3 = 18;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 187091926:
                                if (str5.equals("audio/ogg")) {
                                    c3 = 19;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 817335912:
                                if (str5.equals("text/plain")) {
                                    c3 = 20;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 859118878:
                                if (str5.equals("application/x-abiword")) {
                                    c3 = 21;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 886992732:
                                if (str5.equals("application/ld+json")) {
                                    c3 = 22;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 904647503:
                                if (str5.equals("application/msword")) {
                                    c3 = 23;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1154306387:
                                if (str5.equals("application/x-bzip")) {
                                    c3 = 24;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1154455342:
                                if (str5.equals("application/x-gzip")) {
                                    c3 = 25;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1178484637:
                                if (str5.equals("application/octet-stream")) {
                                    c3 = 26;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1423759679:
                                if (str5.equals("application/x-bzip2")) {
                                    c3 = 27;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1436962847:
                                if (str5.equals("application/vnd.oasis.opendocument.presentation")) {
                                    c3 = 28;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1454024983:
                                if (str5.equals("application/x-7z-compressed")) {
                                    c3 = 29;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1455492626:
                                if (str5.equals("application/x-freearc")) {
                                    c3 = 30;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1503095341:
                                if (str5.equals("audio/3gpp")) {
                                    c3 = 31;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1504831518:
                                if (str5.equals("audio/mpeg")) {
                                    c3 = ' ';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1509238306:
                                if (str5.equals("application/vnd.rar")) {
                                    c3 = '!';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1578362927:
                                if (str5.equals("image/vnd.microsoft.icon")) {
                                    c3 = '\"';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1643664935:
                                if (str5.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    c3 = '#';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1672200517:
                                if (str5.equals("application/vnd.amazon.ebook")) {
                                    c3 = '$';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1993842850:
                                if (str5.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    c3 = '%';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2049276534:
                                if (str5.equals("application/java-archive")) {
                                    c3 = '&';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2132236175:
                                if (str5.equals("text/javascript")) {
                                    c3 = '\'';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                str = "epub";
                                break;
                            case 1:
                                str = "odt";
                                break;
                            case 2:
                            case 31:
                                str = "3gp";
                                break;
                            case 3:
                                str = "eot";
                                break;
                            case 4:
                                str = "cda";
                                break;
                            case 5:
                                str = "csh";
                                break;
                            case 6:
                                str = "avi";
                                break;
                            case 7:
                                str = "pptx";
                                break;
                            case '\b':
                                str = "ppt";
                                break;
                            case '\t':
                                str = "docx";
                                break;
                            case '\n':
                                str = "midi";
                                break;
                            case 11:
                                str = "ics";
                                break;
                            case '\f':
                                str = "php";
                                break;
                            case '\r':
                            case 16:
                                str = "3g2";
                                break;
                            case 14:
                                str = "mpkg";
                                break;
                            case 15:
                                str = "xls";
                                break;
                            case 17:
                            case 25:
                                str = "gz";
                                break;
                            case 18:
                                str = "sh";
                                break;
                            case 19:
                                str = "opus";
                                break;
                            case 20:
                                str = "txt";
                                break;
                            case 21:
                                str = "abw";
                                break;
                            case 22:
                                str = "jsonld";
                                break;
                            case 23:
                                str = "doc";
                                break;
                            case 24:
                                str = "bz";
                                break;
                            case 26:
                                str = "bin";
                                break;
                            case 27:
                                str = "bz2";
                                break;
                            case 28:
                                str = "odp";
                                break;
                            case 29:
                                str = "7z";
                                break;
                            case 30:
                                str = "arc";
                                break;
                            case ' ':
                                str = "mp3";
                                break;
                            case '!':
                                str = "rar";
                                break;
                            case '\"':
                                str = "ico";
                                break;
                            case '#':
                                str = "ods";
                                break;
                            case '$':
                                str = "azw";
                                break;
                            case '%':
                                str = "xlsx";
                                break;
                            case '&':
                                str = "jar";
                                break;
                            case '\'':
                                str = "js";
                                break;
                            default:
                                if (str5.contains("/")) {
                                    str5 = str5.substring(str5.indexOf("/") + 1);
                                }
                                if (str5.contains("-")) {
                                    str5 = str5.substring(str5.indexOf("-") + 1);
                                }
                                if (str5.contains("+")) {
                                    str5 = str5.substring(0, str5.indexOf("+"));
                                }
                                str = str5.toLowerCase();
                                break;
                        }
                    }
                    upperCase = str.toUpperCase();
                }
                if (!TextUtils.isEmpty(upperCase)) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(upperCase.toUpperCase());
                }
                if (sb.length() <= 0) {
                    sb.append(LocaleController.getString(R.string.AttachDocument));
                }
                k6Var.setText(sb);
                return;
            case 10:
                sh.e1 e1Var = (sh.e1) this.f45169b;
                ArrayList arrayList3 = (ArrayList) obj;
                w51 w51Var5 = (w51) obj2;
                arrayList3.add(h51.j(-1, e1Var.X));
                arrayList3.add(h51.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, e1Var.V))));
                return;
            case 11:
                sh.p2 p2Var = (sh.p2) this.f45169b;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    p2Var.getClass();
                    return;
                }
                sh.y3 y3Var = p2Var.f47642s0;
                if (y3Var != null) {
                    y3Var.a(tL_webViewResultUrl);
                    p2Var.n();
                    return;
                }
                return;
            case 12:
                ((sh.d3) this.f45169b).F0((ArrayList) obj, (w51) obj2);
                return;
            case 13:
                ((sh.x3) this.f45169b).U((ArrayList) obj, (w51) obj2);
                return;
            case 14:
                w51 w51Var6 = (w51) obj2;
                ((th.q) this.f45169b).v.c((ArrayList) obj);
                return;
            case 15:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                wn0 wn0Var = (wn0) ((uf.z) this.f45169b);
                py pyVar = wn0Var.F0;
                AndroidUtilities.hideKeyboard(pyVar.getParentActivity().getCurrentFocus());
                q70 I = q70.I(pyVar, (org.telegram.ui.Cells.h6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z4 = false;
                } else {
                    q70 J2 = I.J();
                    J2.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ec0(I, 24), false);
                    J2.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        J2.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            J2.k();
                        }
                        J2.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    z4 = false;
                    I.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new lh.y2(I, J2, 6), false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new ih(wn0Var, pyVar, wn0Var.G0, I, 20), z4);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new ih((Object) wn0Var, (Object) pyVar, (Object) tL_sponsoredPeer, (Object) I, 21), z4);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new jp(wn0Var, pyVar, I, 15), z4);
                if (LocaleController.isRTL) {
                    i14 = 3;
                }
                I.V(i14);
                I.Y = true;
                I.f30334t = z4;
                I.Z();
                return;
            case 16:
                vf.c.U((vf.c) this.f45169b, (ArrayList) obj, (w51) obj2);
                return;
            case 17:
                vf.k kVar = (vf.k) this.f45169b;
                kVar.I.dismiss();
                kVar.f49119y = (String) obj;
                kVar.B = (TLRPC.InputDocument) obj2;
                kVar.f49117w = false;
                AndroidUtilities.cancelRunOnUIThread(kVar.d);
                kVar.f49114n.setSticker(kVar.f49119y);
                kVar.e0(true);
                a61 a61Var = kVar.f25523a;
                if (a61Var != null && (w51Var = a61Var.V2) != null) {
                    w51Var.N(true);
                    return;
                }
                return;
            case 18:
                vf.e0 e0Var = (vf.e0) this.f45169b;
                ArrayList arrayList4 = (ArrayList) obj;
                w51 w51Var7 = (w51) obj2;
                w51Var7.B = 1;
                LinearLayout linearLayout = e0Var.X;
                h51 h51Var = new h51(-4);
                h51Var.d = -5;
                h51Var.f27368c = linearLayout;
                h51Var.f27388z = -1;
                arrayList4.add(h51Var);
                TL_account.TL_connectedBot tL_connectedBot = e0Var.U;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        yh.r(R.string.SessionBotConnectedFrom, arrayList4);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList4.add(h51.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i10 = 2;
                            arrayList4.add(h51.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i10 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i10)) {
                            arrayList4.add(h51.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList4.add(h51.B(null));
                    }
                    w51Var7.U();
                    yh.r(R.string.BusinessBotChats2, arrayList4);
                    int i17 = vf.e0.f49069d0;
                    h51 w10 = h51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w10.K(e0Var.f49072b0);
                    arrayList4.add(w10);
                    int i18 = vf.e0.f49070e0;
                    h51 w11 = h51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w11.K(!e0Var.f49072b0);
                    arrayList4.add(w11);
                    w51Var7.T();
                    arrayList4.add(h51.B(null));
                    vf.v vVar = e0Var.W;
                    if (vVar != null) {
                        vVar.a(arrayList4, w51Var7, true);
                    }
                    yh.A(R.string.BusinessBotChatsInfo2, arrayList4);
                    return;
                }
                return;
            case 19:
                final vf.l0 l0Var = (vf.l0) this.f45169b;
                ArrayList arrayList5 = (ArrayList) obj;
                w51 w51Var8 = (w51) obj2;
                LongSparseArray longSparseArray = l0Var.K;
                String string = LocaleController.getString(R.string.BusinessBots2);
                String string2 = LocaleController.getString(R.string.BusinessBots2Info);
                h51 h51Var2 = new h51(2);
                h51Var2.f27375l = string;
                h51Var2.f27378o = string2;
                h51Var2.f27376m = "tg_superplaceholders_android_2";
                h51Var2.f27377n = "🤖🏝️";
                h51Var2.f27388z = 120;
                arrayList5.add(h51Var2);
                if (l0Var.J != null) {
                    w51Var8.U();
                    long j12 = l0Var.J.f20992id;
                    h51 h51Var3 = new h51(13);
                    h51Var3.f27386x = j12;
                    h51Var3.K(true);
                    h51Var3.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.f49148c.V2.N(true);
                                    l0Var2.Y(true);
                                    return;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = l0Var3.G;
                                    if (tL_businessBotRights.reply && tL_businessBotRights.read_messages && tL_businessBotRights.delete_received_messages && tL_businessBotRights.delete_sent_messages) {
                                        tL_businessBotRights.delete_sent_messages = false;
                                        tL_businessBotRights.delete_received_messages = false;
                                        tL_businessBotRights.read_messages = false;
                                        tL_businessBotRights.reply = false;
                                    } else {
                                        tL_businessBotRights.delete_sent_messages = true;
                                        tL_businessBotRights.delete_received_messages = true;
                                        tL_businessBotRights.read_messages = true;
                                        tL_businessBotRights.reply = true;
                                    }
                                    l0Var3.f49148c.V2.N(true);
                                    l0Var3.Y(true);
                                    return;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var4.G;
                                    if (tL_businessBotRights2.edit_name && tL_businessBotRights2.edit_bio && tL_businessBotRights2.edit_profile_photo && tL_businessBotRights2.edit_username) {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        l0Var4.f49148c.V2.N(true);
                                        l0Var4.Y(true);
                                        return;
                                    }
                                    l0Var4.X(-14, true, new g0(l0Var4, 2));
                                    return;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var5.G;
                                    if (tL_businessBotRights3.view_gifts && tL_businessBotRights3.sell_gifts && tL_businessBotRights3.change_gift_settings && tL_businessBotRights3.transfer_and_upgrade_gifts && tL_businessBotRights3.transfer_stars) {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        l0Var5.f49148c.V2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new g0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var6.G;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    l0Var6.f49148c.V2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(h51Var3);
                    w51Var8.T();
                    str2 = "";
                } else {
                    w51Var8.U();
                    arrayList5.add(h51.k(l0Var.f49149e));
                    longSparseArray.clear();
                    int i19 = 0;
                    boolean z19 = false;
                    while (i19 < l0Var.d.d.size()) {
                        TLObject tLObject = (TLObject) l0Var.d.d.get(i19);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                str3 = str4;
                                long j13 = user.f20992id;
                                String str6 = l0Var.f49156y;
                                h51 h51Var4 = new h51(13);
                                h51Var4.f27386x = j13;
                                h51Var4.f27377n = str6;
                                arrayList5.add(h51Var4);
                                longSparseArray.put(user.f20992id, user);
                                z19 = true;
                                i19++;
                                str4 = str3;
                            }
                        }
                        str3 = str4;
                        i19++;
                        str4 = str3;
                    }
                    str2 = str4;
                    for (int i20 = 0; i20 < l0Var.d.f48657e.size(); i20++) {
                        TLObject tLObject2 = (TLObject) l0Var.d.f48657e.get(i20);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j14 = user2.f20992id;
                                String str7 = l0Var.f49156y;
                                h51 h51Var5 = new h51(13);
                                h51Var5.f27386x = j14;
                                h51Var5.f27377n = str7;
                                arrayList5.add(h51Var5);
                                longSparseArray.put(user2.f20992id, user2);
                                z19 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(l0Var.f49150f.getText().toString()) || l0Var.d.e() || l0Var.f49155x)) {
                        arrayList5.add(h51.k(l0Var.f49151n));
                        z19 = true;
                    }
                    View view = l0Var.h;
                    if (z19) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    view.setVisibility(i11);
                    w51Var8.T();
                }
                arrayList5.add(h51.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                w51Var8.U();
                h51 t6 = h51.t(LocaleController.getString(R.string.BusinessBotChats2));
                if (l0Var.J != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t6.f27371g = z10;
                arrayList5.add(t6);
                h51 w12 = h51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w12.K(l0Var.F);
                if (l0Var.J != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w12.f27371g = z11;
                arrayList5.add(w12);
                h51 w13 = h51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w13.K(!l0Var.F);
                if (l0Var.J != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                w13.f27371g = z12;
                arrayList5.add(w13);
                w51Var8.T();
                arrayList5.add(h51.B(null));
                vf.v vVar2 = l0Var.v;
                if (l0Var.J != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                vVar2.a(arrayList5, w51Var8, z13);
                yh.A(R.string.BusinessBotChatsInfo2, arrayList5);
                if (l0Var.J != null) {
                    w51Var8.U();
                    yh.r(R.string.BusinessBotPermissions, arrayList5);
                    String string3 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = l0Var.G;
                    sb2.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb2.append("/5");
                    h51 m9 = h51.m(-4, string3, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var.G;
                    if (tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    m9.K(z14);
                    m9.f27370f = !l0Var.M;
                    m9.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.f49148c.V2.N(true);
                                    l0Var2.Y(true);
                                    return;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var3.G;
                                    if (tL_businessBotRights3.reply && tL_businessBotRights3.read_messages && tL_businessBotRights3.delete_received_messages && tL_businessBotRights3.delete_sent_messages) {
                                        tL_businessBotRights3.delete_sent_messages = false;
                                        tL_businessBotRights3.delete_received_messages = false;
                                        tL_businessBotRights3.read_messages = false;
                                        tL_businessBotRights3.reply = false;
                                    } else {
                                        tL_businessBotRights3.delete_sent_messages = true;
                                        tL_businessBotRights3.delete_received_messages = true;
                                        tL_businessBotRights3.read_messages = true;
                                        tL_businessBotRights3.reply = true;
                                    }
                                    l0Var3.f49148c.V2.N(true);
                                    l0Var3.Y(true);
                                    return;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.G;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.f49148c.V2.N(true);
                                        l0Var4.Y(true);
                                        return;
                                    }
                                    l0Var4.X(-14, true, new g0(l0Var4, 2));
                                    return;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var5.G;
                                    if (tL_businessBotRights32.view_gifts && tL_businessBotRights32.sell_gifts && tL_businessBotRights32.change_gift_settings && tL_businessBotRights32.transfer_and_upgrade_gifts && tL_businessBotRights32.transfer_stars) {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        l0Var5.f49148c.V2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new g0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var6.G;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    l0Var6.f49148c.V2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(m9);
                    if (l0Var.M) {
                        h51 y10 = h51.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y10.K(true);
                        y10.f27371g = false;
                        y10.f27372i = 1;
                        arrayList5.add(y10);
                        h51 y11 = h51.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y11.K(l0Var.G.reply);
                        y11.f27372i = 1;
                        arrayList5.add(y11);
                        h51 y12 = h51.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y12.K(l0Var.G.read_messages);
                        y12.f27372i = 1;
                        arrayList5.add(y12);
                        h51 y13 = h51.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y13.K(l0Var.G.delete_sent_messages);
                        y13.f27372i = 1;
                        arrayList5.add(y13);
                        h51 y14 = h51.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y14.K(l0Var.G.delete_received_messages);
                        y14.f27372i = 1;
                        arrayList5.add(y14);
                    }
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var.G;
                    sb3.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb3.append("/4");
                    h51 m10 = h51.m(-10, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var.G;
                    if (tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    m10.K(z15);
                    m10.f27370f = !l0Var.N;
                    m10.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.f49148c.V2.N(true);
                                    l0Var2.Y(true);
                                    return;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var3.G;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    l0Var3.f49148c.V2.N(true);
                                    l0Var3.Y(true);
                                    return;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.G;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.f49148c.V2.N(true);
                                        l0Var4.Y(true);
                                        return;
                                    }
                                    l0Var4.X(-14, true, new g0(l0Var4, 2));
                                    return;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = l0Var5.G;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        l0Var5.f49148c.V2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new g0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = l0Var6.G;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    l0Var6.f49148c.V2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(m10);
                    if (l0Var.N) {
                        h51 y15 = h51.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y15.K(l0Var.G.edit_name);
                        y15.f27372i = 1;
                        arrayList5.add(y15);
                        h51 y16 = h51.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y16.K(l0Var.G.edit_bio);
                        y16.f27372i = 1;
                        arrayList5.add(y16);
                        h51 y17 = h51.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y17.K(l0Var.G.edit_profile_photo);
                        y17.f27372i = 1;
                        arrayList5.add(y17);
                        h51 y18 = h51.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y18.K(l0Var.G.edit_username);
                        y18.f27372i = 1;
                        arrayList5.add(y18);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = l0Var.G;
                    sb4.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb4.append("/5");
                    h51 m11 = h51.m(-15, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = l0Var.G;
                    if (tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    m11.K(z16);
                    m11.f27370f = !l0Var.O;
                    m11.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.f49148c.V2.N(true);
                                    l0Var2.Y(true);
                                    return;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var3.G;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    l0Var3.f49148c.V2.N(true);
                                    l0Var3.Y(true);
                                    return;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.G;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.f49148c.V2.N(true);
                                        l0Var4.Y(true);
                                        return;
                                    }
                                    l0Var4.X(-14, true, new g0(l0Var4, 2));
                                    return;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = l0Var5.G;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        l0Var5.f49148c.V2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new g0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = l0Var6.G;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    l0Var6.f49148c.V2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(m11);
                    if (l0Var.O) {
                        h51 y19 = h51.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y19.K(l0Var.G.view_gifts);
                        y19.f27372i = 1;
                        arrayList5.add(y19);
                        h51 y20 = h51.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y20.K(l0Var.G.sell_gifts);
                        y20.f27372i = 1;
                        arrayList5.add(y20);
                        h51 y21 = h51.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y21.K(l0Var.G.change_gift_settings);
                        y21.f27372i = 1;
                        arrayList5.add(y21);
                        h51 y22 = h51.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y22.K(l0Var.G.transfer_and_upgrade_gifts);
                        y22.f27372i = 1;
                        arrayList5.add(y22);
                        h51 y23 = h51.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y23.K(l0Var.G.transfer_stars);
                        y23.f27372i = 1;
                        arrayList5.add(y23);
                    }
                    h51 m12 = h51.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), str2);
                    m12.K(l0Var.G.manage_stories);
                    m12.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.f49148c.V2.N(true);
                                    l0Var2.Y(true);
                                    return;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var3.G;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    l0Var3.f49148c.V2.N(true);
                                    l0Var3.Y(true);
                                    return;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.G;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.f49148c.V2.N(true);
                                        l0Var4.Y(true);
                                        return;
                                    }
                                    l0Var4.X(-14, true, new g0(l0Var4, 2));
                                    return;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = l0Var5.G;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        l0Var5.f49148c.V2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new g0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = l0Var6.G;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    l0Var6.f49148c.V2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(m12);
                    w51Var8.T();
                    arrayList5.add(h51.A(-4, null));
                    arrayList5.add(h51.A(-5, null));
                    arrayList5.add(h51.A(-6, null));
                    arrayList5.add(h51.A(-7, null));
                    return;
                }
                return;
            case 20:
                vf.n0.U((vf.n0) this.f45169b, (ArrayList) obj, (w51) obj2);
                return;
            case 21:
                vf.v0 v0Var = (vf.v0) this.f45169b;
                ArrayList arrayList6 = (ArrayList) obj;
                w51 w51Var9 = (w51) obj2;
                String string6 = LocaleController.getString(R.string.BusinessLocation);
                String string7 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i21 = R.raw.biz_map;
                h51 h51Var6 = new h51(2);
                h51Var6.f27375l = string6;
                h51Var6.f27378o = string7;
                h51Var6.f27374k = i21;
                arrayList6.add(h51Var6);
                arrayList6.add(h51.k(v0Var.f49258e));
                arrayList6.add(h51.B(null));
                h51 i22 = h51.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                if (v0Var.f49264x != null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i22.K(z17);
                arrayList6.add(i22);
                if (v0Var.f49264x != null) {
                    arrayList6.add(h51.k(v0Var.h));
                }
                arrayList6.add(h51.B(null));
                if (v0Var.f49263w != null && (v0Var.f49264x != null || !TextUtils.isEmpty(v0Var.f49265y))) {
                    z18 = true;
                }
                v0Var.D = z18;
                if (z18) {
                    h51 e6 = h51.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e6.f27381r = true;
                    arrayList6.add(e6);
                    arrayList6.add(h51.B(null));
                }
                v0Var.U(true);
                return;
            case 22:
                w51 w51Var10 = (w51) obj2;
                vf.x0.V((vf.x0) this.f45169b, (ArrayList) obj);
                return;
            case 23:
                vf.z0 z0Var = (vf.z0) this.f45169b;
                ArrayList arrayList7 = (ArrayList) obj;
                w51 w51Var11 = (w51) obj2;
                ArrayList arrayList8 = z0Var.f49285b;
                String string8 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                h51 h51Var7 = new h51(9);
                h51Var7.d = -1;
                h51Var7.f27375l = string8;
                h51Var7.K(z0Var.f49290r);
                arrayList7.add(h51Var7);
                arrayList7.add(h51.B(null));
                if (z0Var.f49290r) {
                    for (int i23 = 0; i23 < arrayList8.size(); i23++) {
                        if (i23 > 0) {
                            arrayList7.add(h51.B(null));
                        }
                        vf.w0 w0Var = (vf.w0) arrayList8.get(i23);
                        if (!z0Var.U()) {
                            int i24 = i23 * 3;
                            arrayList7.add(h51.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), vf.w0.a(w0Var.f49267a), i24));
                            arrayList7.add(h51.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), vf.w0.a(w0Var.f49268b), i24 + 1));
                            h51 e10 = h51.e(i24 + 2, LocaleController.getString(R.string.Remove));
                            e10.f27381r = true;
                            arrayList7.add(e10);
                        }
                    }
                    if (z0Var.V()) {
                        arrayList7.add(h51.B(null));
                        h51 c10 = h51.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c10.f27380q = true;
                        arrayList7.add(c10);
                    }
                    yh.A(R.string.BusinessHoursDayInfo, arrayList7);
                    return;
                }
                return;
            case 24:
                vf.r1.V((vf.r1) this.f45169b, (ArrayList) obj, (w51) obj2);
                return;
            case 25:
                vh.a aVar = (vh.a) this.f45169b;
                ArrayList arrayList9 = (ArrayList) obj;
                w51 w51Var12 = (w51) obj2;
                arrayList9.add(h51.D(0, AndroidUtilities.dp(12.0f)));
                arrayList9.add(h51.j(1, aVar.W));
                arrayList9.add(h51.D(2, AndroidUtilities.dp(12.0f)));
                arrayList9.add(h51.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
                aVar.Z = arrayList9.size();
                String string9 = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
                boolean z20 = aVar.Y;
                if (z20) {
                    i12 = R.string.CommunityChatVisibilityVisibleBotInfo;
                } else {
                    i12 = R.string.CommunityChatVisibilityVisibleInfo;
                }
                h51 x10 = h51.x(151, string9, LocaleController.getString(i12));
                x10.K(!aVar.V);
                arrayList9.add(x10);
                String string10 = LocaleController.getString(R.string.CommunityChatVisibilityHidden);
                if (z20) {
                    i13 = R.string.CommunityChatVisibilityHiddenBotInfo;
                } else {
                    i13 = R.string.CommunityChatVisibilityHiddenInfo;
                }
                h51 x11 = h51.x(150, string10, LocaleController.getString(i13));
                x11.K(aVar.V);
                arrayList9.add(x11);
                arrayList9.add(h51.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
                return;
            case 26:
                w51 w51Var13 = (w51) obj2;
                ((ArrayList) obj).add(h51.j(0, ((vh.b) this.f45169b).U));
                return;
            case 27:
                String str8 = (String) obj;
                Utilities.themeQueue.postRunnable(new vf.k0(5, (String[]) this.f45169b, (Utilities.Callback2) obj2));
                return;
            case 28:
                wh.w wVar = (wh.w) this.f45169b;
                ArrayList arrayList10 = (ArrayList) obj;
                w51 w51Var14 = (w51) obj2;
                arrayList10.add(h51.j(1, wVar.X));
                arrayList10.add(h51.j(3, wVar.f50157a0));
                if (wVar.f50162f0 != null) {
                    arrayList10.add(h51.j(2, wVar.Y));
                    return;
                }
                return;
            default:
                wh.r3.H1((wh.r3[]) this.f45169b, (ArrayList) obj, (w51) obj2);
                return;
        }
    }
}
