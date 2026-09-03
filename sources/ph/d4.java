package ph;

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
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.ai;
import org.telegram.ui.kh;
import org.telegram.ui.qy;
public final class d4 implements Utilities.Callback2 {
    public final int f41490a;
    public final Object f41491b;

    public d4(Object obj, int i10) {
        this.f41490a = i10;
        this.f41491b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        long duration;
        String upperCase;
        boolean z4;
        int i10;
        w51 w51Var;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i13;
        int i14;
        String str = "";
        char c3 = 65535;
        boolean z18 = false;
        z18 = false;
        switch (this.f41490a) {
            case 0:
                c5 c5Var = (c5) this.f41491b;
                c5Var.d0(c5Var.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                return;
            case 1:
                ((ca) this.f41491b).Z((Bitmap) obj, ((Float) obj2).floatValue());
                return;
            case 2:
                c7 c7Var = (c7) this.f41491b;
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var2 = (w51) obj2;
                if (c7Var.f41429e0 || c7Var.f41428d0 != null) {
                    TLRPC.WebPage webPage = c7Var.f41428d0;
                    u6 u6Var = new u6(c7Var, 0);
                    int i15 = a7.f41306a;
                    i51 J = i51.J(a7.class);
                    J.G = webPage;
                    J.D = u6Var;
                    arrayList.add(J);
                }
                arrayList.add(i51.k(c7Var.V));
                arrayList.add(i51.A(1, null));
                i51 i16 = i51.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i16.K(c7Var.f41434j0);
                arrayList.add(i16);
                if (c7Var.f41434j0) {
                    arrayList.add(i51.k(c7Var.W));
                }
                arrayList.add(i51.A(3, null));
                arrayList.add(i51.k(c7Var.X));
                return;
            case 3:
                da daVar = (da) this.f41491b;
                Boolean bool = (Boolean) obj;
                Float f10 = (Float) obj2;
                if (daVar.U0.getDuration() < 100) {
                    duration = daVar.H1.f42416h0;
                } else {
                    duration = daVar.U0.getDuration();
                }
                float floatValue = ((f10.floatValue() / 0.96f) * 0.04f) + f10.floatValue();
                t6 t6Var = daVar.H1;
                float f11 = t6Var.f42400a0;
                float f12 = t6Var.Z;
                float f13 = (f11 - f12) * floatValue;
                float f14 = (float) duration;
                long j10 = f13 * f14;
                s9 s9Var = daVar.U0;
                long j11 = (f12 * f14) + ((float) j10);
                daVar.J1 = j11;
                s9Var.m(j11);
                h9 h9Var = daVar.f41569s1;
                if (h9Var != null) {
                    h9Var.setCoverTime(daVar.J1);
                }
                t6 t6Var2 = daVar.H1;
                if (t6Var2 != null && t6Var2.f42414g) {
                    t6Var2.f42419j = true;
                    return;
                }
                return;
            case 4:
                ((ha) this.f41491b).b((short[]) obj, ((Integer) obj2).intValue());
                return;
            case 5:
                ((qh.g) this.f41491b).C0((ArrayList) obj, (w51) obj2);
                return;
            case 6:
                qh.f fVar = (qh.f) this.f41491b;
                ArrayList arrayList2 = (ArrayList) obj;
                w51 w51Var3 = (w51) obj2;
                arrayList2.add(i51.k(fVar.V));
                arrayList2.add(i51.k(fVar.W));
                return;
            case 7:
                ((rh.j) this.f41491b).E0((ArrayList) obj, (w51) obj2);
                return;
            case 8:
                w51 w51Var4 = (w51) obj2;
                rh.r.U((rh.r) this.f41491b, (ArrayList) obj);
                return;
            case 9:
                org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) this.f41491b;
                String str2 = (String) obj;
                Long l10 = (Long) obj2;
                StringBuilder sb = new StringBuilder();
                if (l10.longValue() > 0) {
                    sb.append("~");
                    sb.append(AndroidUtilities.formatFileSize(l10.longValue()));
                }
                if (str2 == null) {
                    upperCase = null;
                } else {
                    if (!str2.isEmpty()) {
                        switch (str2.hashCode()) {
                            case -2008589971:
                                if (str2.equals("application/epub+zip")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                            case -1719571662:
                                if (str2.equals("application/vnd.oasis.opendocument.text")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case -1664118616:
                                if (str2.equals("video/3gpp")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                            case -1578389996:
                                if (str2.equals("application/vnd.ms-fontobject")) {
                                    c3 = 3;
                                    break;
                                }
                                break;
                            case -1348237359:
                                if (str2.equals("application/x-cdf")) {
                                    c3 = 4;
                                    break;
                                }
                                break;
                            case -1348236892:
                                if (str2.equals("application/x-csh")) {
                                    c3 = 5;
                                    break;
                                }
                                break;
                            case -1079884372:
                                if (str2.equals("video/x-msvideo")) {
                                    c3 = 6;
                                    break;
                                }
                                break;
                            case -1073633483:
                                if (str2.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    c3 = 7;
                                    break;
                                }
                                break;
                            case -1071817359:
                                if (str2.equals("application/vnd.ms-powerpoint")) {
                                    c3 = '\b';
                                    break;
                                }
                                break;
                            case -1050893613:
                                if (str2.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    c3 = '\t';
                                    break;
                                }
                                break;
                            case -1007601745:
                                if (str2.equals("audio/x-midi")) {
                                    c3 = '\n';
                                    break;
                                }
                                break;
                            case -958424608:
                                if (str2.equals("text/calendar")) {
                                    c3 = 11;
                                    break;
                                }
                                break;
                            case -816908365:
                                if (str2.equals("application/x-httpd-php")) {
                                    c3 = '\f';
                                    break;
                                }
                                break;
                            case -648684635:
                                if (str2.equals("audio/3gpp2")) {
                                    c3 = '\r';
                                    break;
                                }
                                break;
                            case -433129473:
                                if (str2.equals("application/vnd.apple.installer+xml")) {
                                    c3 = 14;
                                    break;
                                }
                                break;
                            case -366307023:
                                if (str2.equals("application/vnd.ms-excel")) {
                                    c3 = 15;
                                    break;
                                }
                                break;
                            case -48069494:
                                if (str2.equals("video/3gpp2")) {
                                    c3 = 16;
                                    break;
                                }
                                break;
                            case -43923783:
                                if (str2.equals("application/gzip")) {
                                    c3 = 17;
                                    break;
                                }
                                break;
                            case -43491031:
                                if (str2.equals("application/x-sh")) {
                                    c3 = 18;
                                    break;
                                }
                                break;
                            case 187091926:
                                if (str2.equals("audio/ogg")) {
                                    c3 = 19;
                                    break;
                                }
                                break;
                            case 817335912:
                                if (str2.equals("text/plain")) {
                                    c3 = 20;
                                    break;
                                }
                                break;
                            case 859118878:
                                if (str2.equals("application/x-abiword")) {
                                    c3 = 21;
                                    break;
                                }
                                break;
                            case 886992732:
                                if (str2.equals("application/ld+json")) {
                                    c3 = 22;
                                    break;
                                }
                                break;
                            case 904647503:
                                if (str2.equals("application/msword")) {
                                    c3 = 23;
                                    break;
                                }
                                break;
                            case 1154306387:
                                if (str2.equals("application/x-bzip")) {
                                    c3 = 24;
                                    break;
                                }
                                break;
                            case 1154455342:
                                if (str2.equals("application/x-gzip")) {
                                    c3 = 25;
                                    break;
                                }
                                break;
                            case 1178484637:
                                if (str2.equals("application/octet-stream")) {
                                    c3 = 26;
                                    break;
                                }
                                break;
                            case 1423759679:
                                if (str2.equals("application/x-bzip2")) {
                                    c3 = 27;
                                    break;
                                }
                                break;
                            case 1436962847:
                                if (str2.equals("application/vnd.oasis.opendocument.presentation")) {
                                    c3 = 28;
                                    break;
                                }
                                break;
                            case 1454024983:
                                if (str2.equals("application/x-7z-compressed")) {
                                    c3 = 29;
                                    break;
                                }
                                break;
                            case 1455492626:
                                if (str2.equals("application/x-freearc")) {
                                    c3 = 30;
                                    break;
                                }
                                break;
                            case 1503095341:
                                if (str2.equals("audio/3gpp")) {
                                    c3 = 31;
                                    break;
                                }
                                break;
                            case 1504831518:
                                if (str2.equals("audio/mpeg")) {
                                    c3 = ' ';
                                    break;
                                }
                                break;
                            case 1509238306:
                                if (str2.equals("application/vnd.rar")) {
                                    c3 = '!';
                                    break;
                                }
                                break;
                            case 1578362927:
                                if (str2.equals("image/vnd.microsoft.icon")) {
                                    c3 = '\"';
                                    break;
                                }
                                break;
                            case 1643664935:
                                if (str2.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    c3 = '#';
                                    break;
                                }
                                break;
                            case 1672200517:
                                if (str2.equals("application/vnd.amazon.ebook")) {
                                    c3 = '$';
                                    break;
                                }
                                break;
                            case 1993842850:
                                if (str2.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    c3 = '%';
                                    break;
                                }
                                break;
                            case 2049276534:
                                if (str2.equals("application/java-archive")) {
                                    c3 = '&';
                                    break;
                                }
                                break;
                            case 2132236175:
                                if (str2.equals("text/javascript")) {
                                    c3 = '\'';
                                    break;
                                }
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
                                if (str2.contains("/")) {
                                    str2 = str2.substring(str2.indexOf("/") + 1);
                                }
                                if (str2.contains("-")) {
                                    str2 = str2.substring(str2.indexOf("-") + 1);
                                }
                                if (str2.contains("+")) {
                                    str2 = str2.substring(0, str2.indexOf("+"));
                                }
                                str = str2.toLowerCase();
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
                rh.e1 e1Var = (rh.e1) this.f41491b;
                ArrayList arrayList3 = (ArrayList) obj;
                w51 w51Var5 = (w51) obj2;
                arrayList3.add(i51.j(-1, e1Var.X));
                arrayList3.add(i51.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, e1Var.V))));
                return;
            case 11:
                rh.p2 p2Var = (rh.p2) this.f41491b;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    p2Var.getClass();
                    return;
                }
                rh.y3 y3Var = p2Var.f43754s0;
                if (y3Var != null) {
                    y3Var.a(tL_webViewResultUrl);
                    p2Var.n();
                    return;
                }
                return;
            case 12:
                ((rh.d3) this.f41491b).F0((ArrayList) obj, (w51) obj2);
                return;
            case 13:
                ((rh.x3) this.f41491b).U((ArrayList) obj, (w51) obj2);
                return;
            case 14:
                w51 w51Var6 = (w51) obj2;
                ((sh.q) this.f41491b).v.c((ArrayList) obj);
                return;
            case 15:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                vn0 vn0Var = (vn0) ((tf.z) this.f41491b);
                qy qyVar = vn0Var.F0;
                AndroidUtilities.hideKeyboard(qyVar.getParentActivity().getCurrentFocus());
                p70 I = p70.I(qyVar, (org.telegram.ui.Cells.g6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z4 = false;
                } else {
                    p70 J2 = I.J();
                    J2.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new dc0(I, 24), false);
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
                    I.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new kh.y2(I, J2, 6), false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new kh(vn0Var, qyVar, vn0Var.G0, I, 20), z4);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new kh((Object) vn0Var, (Object) qyVar, (Object) tL_sponsoredPeer, (Object) I, 21), z4);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new gp(vn0Var, qyVar, I, 15), z4);
                if (LocaleController.isRTL) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                I.V(i10);
                I.Y = true;
                I.f27778t = z4;
                I.Z();
                return;
            case 16:
                uf.c.U((uf.c) this.f41491b, (ArrayList) obj, (w51) obj2);
                return;
            case 17:
                uf.k kVar = (uf.k) this.f41491b;
                kVar.I.dismiss();
                kVar.f45401y = (String) obj;
                kVar.B = (TLRPC.InputDocument) obj2;
                kVar.f45399w = false;
                AndroidUtilities.cancelRunOnUIThread(kVar.d);
                kVar.f45396n.setSticker(kVar.f45401y);
                kVar.e0(true);
                a61 a61Var = kVar.f23568a;
                if (a61Var != null && (w51Var = a61Var.V2) != null) {
                    w51Var.N(true);
                    return;
                }
                return;
            case 18:
                uf.f0 f0Var = (uf.f0) this.f41491b;
                ArrayList arrayList4 = (ArrayList) obj;
                w51 w51Var7 = (w51) obj2;
                w51Var7.B = 1;
                LinearLayout linearLayout = f0Var.X;
                i51 i51Var = new i51(-4);
                i51Var.d = -5;
                i51Var.f25579c = linearLayout;
                i51Var.f25598z = -1;
                arrayList4.add(i51Var);
                TL_account.TL_connectedBot tL_connectedBot = f0Var.U;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        ai.q(R.string.SessionBotConnectedFrom, arrayList4);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList4.add(i51.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i11 = 2;
                            arrayList4.add(i51.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i11 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i11)) {
                            arrayList4.add(i51.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList4.add(i51.B(null));
                    }
                    w51Var7.U();
                    ai.q(R.string.BusinessBotChats2, arrayList4);
                    int i17 = uf.f0.f45365d0;
                    i51 w10 = i51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w10.K(f0Var.f45368b0);
                    arrayList4.add(w10);
                    int i18 = uf.f0.f45366e0;
                    i51 w11 = i51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w11.K(!f0Var.f45368b0);
                    arrayList4.add(w11);
                    w51Var7.T();
                    arrayList4.add(i51.B(null));
                    uf.v vVar = f0Var.W;
                    if (vVar != null) {
                        vVar.a(arrayList4, w51Var7, true);
                    }
                    ai.A(R.string.BusinessBotChatsInfo2, arrayList4);
                    return;
                }
                return;
            case 19:
                final uf.l0 l0Var = (uf.l0) this.f41491b;
                ArrayList arrayList5 = (ArrayList) obj;
                w51 w51Var8 = (w51) obj2;
                LongSparseArray longSparseArray = l0Var.K;
                String string = LocaleController.getString(R.string.BusinessBots2);
                String string2 = LocaleController.getString(R.string.BusinessBots2Info);
                i51 i51Var2 = new i51(2);
                i51Var2.f25585l = string;
                i51Var2.f25588o = string2;
                i51Var2.f25586m = "tg_superplaceholders_android_2";
                i51Var2.f25587n = "🤖🏝️";
                i51Var2.f25598z = 120;
                arrayList5.add(i51Var2);
                if (l0Var.J != null) {
                    w51Var8.U();
                    long j12 = l0Var.J.f19306id;
                    i51 i51Var3 = new i51(13);
                    i51Var3.f25596x = j12;
                    i51Var3.K(true);
                    i51Var3.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.f45429c.V2.N(true);
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
                                    l0Var3.f45429c.V2.N(true);
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
                                        l0Var4.f45429c.V2.N(true);
                                        l0Var4.Y(true);
                                        return;
                                    }
                                    l0Var4.X(-14, true, new h0(l0Var4, 2));
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
                                        l0Var5.f45429c.V2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new h0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var6.G;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    l0Var6.f45429c.V2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(i51Var3);
                    w51Var8.T();
                } else {
                    w51Var8.U();
                    arrayList5.add(i51.k(l0Var.e));
                    longSparseArray.clear();
                    boolean z19 = false;
                    for (int i19 = 0; i19 < l0Var.d.d.size(); i19++) {
                        TLObject tLObject = (TLObject) l0Var.d.d.get(i19);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j13 = user.f19306id;
                                String str3 = l0Var.f45436y;
                                i51 i51Var4 = new i51(13);
                                i51Var4.f25596x = j13;
                                i51Var4.f25587n = str3;
                                arrayList5.add(i51Var4);
                                longSparseArray.put(user.f19306id, user);
                                z19 = true;
                            }
                        }
                    }
                    for (int i20 = 0; i20 < l0Var.d.e.size(); i20++) {
                        TLObject tLObject2 = (TLObject) l0Var.d.e.get(i20);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j14 = user2.f19306id;
                                String str4 = l0Var.f45436y;
                                i51 i51Var5 = new i51(13);
                                i51Var5.f25596x = j14;
                                i51Var5.f25587n = str4;
                                arrayList5.add(i51Var5);
                                longSparseArray.put(user2.f19306id, user2);
                                z19 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(l0Var.f45430f.getText().toString()) || l0Var.d.e() || l0Var.f45435x)) {
                        arrayList5.add(i51.k(l0Var.f45431n));
                        z19 = true;
                    }
                    View view = l0Var.h;
                    if (z19) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    view.setVisibility(i12);
                    w51Var8.T();
                }
                arrayList5.add(i51.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                w51Var8.U();
                i51 t6 = i51.t(LocaleController.getString(R.string.BusinessBotChats2));
                if (l0Var.J != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t6.f25581g = z10;
                arrayList5.add(t6);
                i51 w12 = i51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w12.K(l0Var.F);
                if (l0Var.J != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w12.f25581g = z11;
                arrayList5.add(w12);
                i51 w13 = i51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w13.K(!l0Var.F);
                if (l0Var.J != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                w13.f25581g = z12;
                arrayList5.add(w13);
                w51Var8.T();
                arrayList5.add(i51.B(null));
                uf.v vVar2 = l0Var.v;
                if (l0Var.J != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                vVar2.a(arrayList5, w51Var8, z13);
                ai.A(R.string.BusinessBotChatsInfo2, arrayList5);
                if (l0Var.J != null) {
                    w51Var8.U();
                    ai.q(R.string.BusinessBotPermissions, arrayList5);
                    String string3 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = l0Var.G;
                    sb2.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb2.append("/5");
                    i51 m9 = i51.m(-4, string3, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var.G;
                    if (tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    m9.K(z14);
                    m9.f25580f = !l0Var.M;
                    m9.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.f45429c.V2.N(true);
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
                                    l0Var3.f45429c.V2.N(true);
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
                                        l0Var4.f45429c.V2.N(true);
                                        l0Var4.Y(true);
                                        return;
                                    }
                                    l0Var4.X(-14, true, new h0(l0Var4, 2));
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
                                        l0Var5.f45429c.V2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new h0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var6.G;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    l0Var6.f45429c.V2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(m9);
                    if (l0Var.M) {
                        i51 y10 = i51.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y10.K(true);
                        y10.f25581g = false;
                        y10.f25582i = 1;
                        arrayList5.add(y10);
                        i51 y11 = i51.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y11.K(l0Var.G.reply);
                        y11.f25582i = 1;
                        arrayList5.add(y11);
                        i51 y12 = i51.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y12.K(l0Var.G.read_messages);
                        y12.f25582i = 1;
                        arrayList5.add(y12);
                        i51 y13 = i51.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y13.K(l0Var.G.delete_sent_messages);
                        y13.f25582i = 1;
                        arrayList5.add(y13);
                        i51 y14 = i51.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y14.K(l0Var.G.delete_received_messages);
                        y14.f25582i = 1;
                        arrayList5.add(y14);
                    }
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var.G;
                    sb3.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb3.append("/4");
                    i51 m10 = i51.m(-10, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var.G;
                    if (tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    m10.K(z15);
                    m10.f25580f = !l0Var.N;
                    m10.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.f45429c.V2.N(true);
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
                                    l0Var3.f45429c.V2.N(true);
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
                                        l0Var4.f45429c.V2.N(true);
                                        l0Var4.Y(true);
                                        return;
                                    }
                                    l0Var4.X(-14, true, new h0(l0Var4, 2));
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
                                        l0Var5.f45429c.V2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new h0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = l0Var6.G;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    l0Var6.f45429c.V2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(m10);
                    if (l0Var.N) {
                        i51 y15 = i51.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y15.K(l0Var.G.edit_name);
                        y15.f25582i = 1;
                        arrayList5.add(y15);
                        i51 y16 = i51.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y16.K(l0Var.G.edit_bio);
                        y16.f25582i = 1;
                        arrayList5.add(y16);
                        i51 y17 = i51.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y17.K(l0Var.G.edit_profile_photo);
                        y17.f25582i = 1;
                        arrayList5.add(y17);
                        i51 y18 = i51.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y18.K(l0Var.G.edit_username);
                        y18.f25582i = 1;
                        arrayList5.add(y18);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = l0Var.G;
                    sb4.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb4.append("/5");
                    i51 m11 = i51.m(-15, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = l0Var.G;
                    if (tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    m11.K(z16);
                    m11.f25580f = !l0Var.O;
                    m11.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.f45429c.V2.N(true);
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
                                    l0Var3.f45429c.V2.N(true);
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
                                        l0Var4.f45429c.V2.N(true);
                                        l0Var4.Y(true);
                                        return;
                                    }
                                    l0Var4.X(-14, true, new h0(l0Var4, 2));
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
                                        l0Var5.f45429c.V2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new h0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = l0Var6.G;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    l0Var6.f45429c.V2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(m11);
                    if (l0Var.O) {
                        i51 y19 = i51.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y19.K(l0Var.G.view_gifts);
                        y19.f25582i = 1;
                        arrayList5.add(y19);
                        i51 y20 = i51.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y20.K(l0Var.G.sell_gifts);
                        y20.f25582i = 1;
                        arrayList5.add(y20);
                        i51 y21 = i51.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y21.K(l0Var.G.change_gift_settings);
                        y21.f25582i = 1;
                        arrayList5.add(y21);
                        i51 y22 = i51.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y22.K(l0Var.G.transfer_and_upgrade_gifts);
                        y22.f25582i = 1;
                        arrayList5.add(y22);
                        i51 y23 = i51.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y23.K(l0Var.G.transfer_stars);
                        y23.f25582i = 1;
                        arrayList5.add(y23);
                    }
                    i51 m12 = i51.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), "");
                    m12.K(l0Var.G.manage_stories);
                    m12.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.f45429c.V2.N(true);
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
                                    l0Var3.f45429c.V2.N(true);
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
                                        l0Var4.f45429c.V2.N(true);
                                        l0Var4.Y(true);
                                        return;
                                    }
                                    l0Var4.X(-14, true, new h0(l0Var4, 2));
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
                                        l0Var5.f45429c.V2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new h0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = l0Var6.G;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    l0Var6.f45429c.V2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(m12);
                    w51Var8.T();
                    arrayList5.add(i51.A(-4, null));
                    arrayList5.add(i51.A(-5, null));
                    arrayList5.add(i51.A(-6, null));
                    arrayList5.add(i51.A(-7, null));
                    return;
                }
                return;
            case 20:
                uf.n0.U((uf.n0) this.f41491b, (ArrayList) obj, (w51) obj2);
                return;
            case 21:
                uf.v0 v0Var = (uf.v0) this.f41491b;
                ArrayList arrayList6 = (ArrayList) obj;
                w51 w51Var9 = (w51) obj2;
                String string6 = LocaleController.getString(R.string.BusinessLocation);
                String string7 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i21 = R.raw.biz_map;
                i51 i51Var6 = new i51(2);
                i51Var6.f25585l = string6;
                i51Var6.f25588o = string7;
                i51Var6.f25584k = i21;
                arrayList6.add(i51Var6);
                arrayList6.add(i51.k(v0Var.e));
                arrayList6.add(i51.B(null));
                i51 i22 = i51.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                if (v0Var.f45531x != null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i22.K(z17);
                arrayList6.add(i22);
                if (v0Var.f45531x != null) {
                    arrayList6.add(i51.k(v0Var.h));
                }
                arrayList6.add(i51.B(null));
                if (v0Var.f45530w != null && (v0Var.f45531x != null || !TextUtils.isEmpty(v0Var.f45532y))) {
                    z18 = true;
                }
                v0Var.D = z18;
                if (z18) {
                    i51 e = i51.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e.f25591r = true;
                    arrayList6.add(e);
                    arrayList6.add(i51.B(null));
                }
                v0Var.U(true);
                return;
            case 22:
                w51 w51Var10 = (w51) obj2;
                uf.x0.V((uf.x0) this.f41491b, (ArrayList) obj);
                return;
            case 23:
                uf.z0 z0Var = (uf.z0) this.f41491b;
                ArrayList arrayList7 = (ArrayList) obj;
                w51 w51Var11 = (w51) obj2;
                ArrayList arrayList8 = z0Var.f45551b;
                String string8 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                i51 i51Var7 = new i51(9);
                i51Var7.d = -1;
                i51Var7.f25585l = string8;
                i51Var7.K(z0Var.f45555r);
                arrayList7.add(i51Var7);
                arrayList7.add(i51.B(null));
                if (z0Var.f45555r) {
                    for (int i23 = 0; i23 < arrayList8.size(); i23++) {
                        if (i23 > 0) {
                            arrayList7.add(i51.B(null));
                        }
                        uf.w0 w0Var = (uf.w0) arrayList8.get(i23);
                        if (!z0Var.U()) {
                            int i24 = i23 * 3;
                            arrayList7.add(i51.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), uf.w0.a(w0Var.f45534a), i24));
                            arrayList7.add(i51.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), uf.w0.a(w0Var.f45535b), i24 + 1));
                            i51 e6 = i51.e(i24 + 2, LocaleController.getString(R.string.Remove));
                            e6.f25591r = true;
                            arrayList7.add(e6);
                        }
                    }
                    if (z0Var.V()) {
                        arrayList7.add(i51.B(null));
                        i51 c10 = i51.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c10.f25590q = true;
                        arrayList7.add(c10);
                    }
                    ai.A(R.string.BusinessHoursDayInfo, arrayList7);
                    return;
                }
                return;
            case 24:
                uf.r1.V((uf.r1) this.f41491b, (ArrayList) obj, (w51) obj2);
                return;
            case 25:
                uh.a aVar = (uh.a) this.f41491b;
                ArrayList arrayList9 = (ArrayList) obj;
                w51 w51Var12 = (w51) obj2;
                arrayList9.add(i51.D(0, AndroidUtilities.dp(12.0f)));
                arrayList9.add(i51.j(1, aVar.W));
                arrayList9.add(i51.D(2, AndroidUtilities.dp(12.0f)));
                arrayList9.add(i51.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
                aVar.Z = arrayList9.size();
                String string9 = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
                boolean z20 = aVar.Y;
                if (z20) {
                    i13 = R.string.CommunityChatVisibilityVisibleBotInfo;
                } else {
                    i13 = R.string.CommunityChatVisibilityVisibleInfo;
                }
                i51 x10 = i51.x(151, string9, LocaleController.getString(i13));
                x10.K(true ^ aVar.V);
                arrayList9.add(x10);
                String string10 = LocaleController.getString(R.string.CommunityChatVisibilityHidden);
                if (z20) {
                    i14 = R.string.CommunityChatVisibilityHiddenBotInfo;
                } else {
                    i14 = R.string.CommunityChatVisibilityHiddenInfo;
                }
                i51 x11 = i51.x(150, string10, LocaleController.getString(i14));
                x11.K(aVar.V);
                arrayList9.add(x11);
                arrayList9.add(i51.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
                return;
            case 26:
                w51 w51Var13 = (w51) obj2;
                ((ArrayList) obj).add(i51.j(0, ((uh.b) this.f41491b).U));
                return;
            case 27:
                String str5 = (String) obj;
                Utilities.themeQueue.postRunnable(new uf.d0(6, (String[]) this.f41491b, (Utilities.Callback2) obj2));
                return;
            case 28:
                vh.w wVar = (vh.w) this.f41491b;
                ArrayList arrayList10 = (ArrayList) obj;
                w51 w51Var14 = (w51) obj2;
                arrayList10.add(i51.j(1, wVar.X));
                arrayList10.add(i51.j(3, wVar.f46316a0));
                if (wVar.f46321f0 != null) {
                    arrayList10.add(i51.j(2, wVar.Y));
                    return;
                }
                return;
            default:
                vh.s3.H1((vh.s3[]) this.f41491b, (ArrayList) obj, (w51) obj2);
                return;
        }
    }
}
