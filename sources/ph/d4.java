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
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.ih;
import org.telegram.ui.oy;
import org.telegram.ui.yh;
public final class d4 implements Utilities.Callback2 {
    public final int f41440a;
    public final Object f41441b;

    public d4(Object obj, int i10) {
        this.f41440a = i10;
        this.f41441b = obj;
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
        switch (this.f41440a) {
            case 0:
                c5 c5Var = (c5) this.f41441b;
                c5Var.d0(c5Var.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                return;
            case 1:
                ((ca) this.f41441b).Z((Bitmap) obj, ((Float) obj2).floatValue());
                return;
            case 2:
                d7 d7Var = (d7) this.f41441b;
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var2 = (w51) obj2;
                if (d7Var.f41458e0 || d7Var.f41457d0 != null) {
                    TLRPC.WebPage webPage = d7Var.f41457d0;
                    v6 v6Var = new v6(d7Var, 0);
                    int i15 = b7.f41298a;
                    i51 J = i51.J(b7.class);
                    J.G = webPage;
                    J.D = v6Var;
                    arrayList.add(J);
                }
                arrayList.add(i51.k(d7Var.V));
                arrayList.add(i51.A(1, null));
                i51 i16 = i51.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i16.K(d7Var.f41463j0);
                arrayList.add(i16);
                if (d7Var.f41463j0) {
                    arrayList.add(i51.k(d7Var.W));
                }
                arrayList.add(i51.A(3, null));
                arrayList.add(i51.k(d7Var.X));
                return;
            case 3:
                da daVar = (da) this.f41441b;
                Boolean bool = (Boolean) obj;
                Float f10 = (Float) obj2;
                if (daVar.U0.getDuration() < 100) {
                    duration = daVar.H1.f42415h0;
                } else {
                    duration = daVar.U0.getDuration();
                }
                float floatValue = ((f10.floatValue() / 0.96f) * 0.04f) + f10.floatValue();
                u6 u6Var = daVar.H1;
                float f11 = u6Var.f42399a0;
                float f12 = u6Var.Z;
                float f13 = (f11 - f12) * floatValue;
                float f14 = (float) duration;
                long j10 = f13 * f14;
                s9 s9Var = daVar.U0;
                long j11 = (f12 * f14) + ((float) j10);
                daVar.J1 = j11;
                s9Var.m(j11);
                h9 h9Var = daVar.f41531s1;
                if (h9Var != null) {
                    h9Var.setCoverTime(daVar.J1);
                }
                u6 u6Var2 = daVar.H1;
                if (u6Var2 != null && u6Var2.f42413g) {
                    u6Var2.f42418j = true;
                    return;
                }
                return;
            case 4:
                ((ha) this.f41441b).b((short[]) obj, ((Integer) obj2).intValue());
                return;
            case 5:
                ((qh.g) this.f41441b).C0((ArrayList) obj, (w51) obj2);
                return;
            case 6:
                qh.f fVar = (qh.f) this.f41441b;
                ArrayList arrayList2 = (ArrayList) obj;
                w51 w51Var3 = (w51) obj2;
                arrayList2.add(i51.k(fVar.V));
                arrayList2.add(i51.k(fVar.W));
                return;
            case 7:
                ((rh.k) this.f41441b).E0((ArrayList) obj, (w51) obj2);
                return;
            case 8:
                w51 w51Var4 = (w51) obj2;
                rh.s.U((rh.s) this.f41441b, (ArrayList) obj);
                return;
            case 9:
                org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) this.f41441b;
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
                rh.f1 f1Var = (rh.f1) this.f41441b;
                ArrayList arrayList3 = (ArrayList) obj;
                w51 w51Var5 = (w51) obj2;
                arrayList3.add(i51.j(-1, f1Var.X));
                arrayList3.add(i51.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, f1Var.V))));
                return;
            case 11:
                rh.q2 q2Var = (rh.q2) this.f41441b;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    q2Var.getClass();
                    return;
                }
                rh.z3 z3Var = q2Var.f43702s0;
                if (z3Var != null) {
                    z3Var.a(tL_webViewResultUrl);
                    q2Var.n();
                    return;
                }
                return;
            case 12:
                ((rh.e3) this.f41441b).F0((ArrayList) obj, (w51) obj2);
                return;
            case 13:
                ((rh.y3) this.f41441b).U((ArrayList) obj, (w51) obj2);
                return;
            case 14:
                w51 w51Var6 = (w51) obj2;
                ((sh.q) this.f41441b).v.c((ArrayList) obj);
                return;
            case 15:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                wn0 wn0Var = (wn0) ((tf.z) this.f41441b);
                oy oyVar = wn0Var.F0;
                AndroidUtilities.hideKeyboard(oyVar.getParentActivity().getCurrentFocus());
                o70 I = o70.I(oyVar, (org.telegram.ui.Cells.h6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z4 = false;
                } else {
                    o70 J2 = I.J();
                    J2.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new cc0(I, 24), false);
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
                    I.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new kh.z2(I, J2, 6), false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new ih(wn0Var, oyVar, wn0Var.G0, I, 20), z4);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new ih((Object) wn0Var, (Object) oyVar, (Object) tL_sponsoredPeer, (Object) I, 21), z4);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new hp(wn0Var, oyVar, I, 15), z4);
                if (LocaleController.isRTL) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                I.V(i10);
                I.Y = true;
                I.f27490t = z4;
                I.Z();
                return;
            case 16:
                uf.c.U((uf.c) this.f41441b, (ArrayList) obj, (w51) obj2);
                return;
            case 17:
                uf.k kVar = (uf.k) this.f41441b;
                kVar.I.dismiss();
                kVar.f45337y = (String) obj;
                kVar.B = (TLRPC.InputDocument) obj2;
                kVar.f45335w = false;
                AndroidUtilities.cancelRunOnUIThread(kVar.d);
                kVar.f45332n.setSticker(kVar.f45337y);
                kVar.e0(true);
                a61 a61Var = kVar.f23580a;
                if (a61Var != null && (w51Var = a61Var.V2) != null) {
                    w51Var.N(true);
                    return;
                }
                return;
            case 18:
                uf.e0 e0Var = (uf.e0) this.f41441b;
                ArrayList arrayList4 = (ArrayList) obj;
                w51 w51Var7 = (w51) obj2;
                w51Var7.B = 1;
                LinearLayout linearLayout = e0Var.X;
                i51 i51Var = new i51(-4);
                i51Var.d = -5;
                i51Var.f25559c = linearLayout;
                i51Var.f25578z = -1;
                arrayList4.add(i51Var);
                TL_account.TL_connectedBot tL_connectedBot = e0Var.U;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        yh.r(R.string.SessionBotConnectedFrom, arrayList4);
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
                    yh.r(R.string.BusinessBotChats2, arrayList4);
                    int i17 = uf.e0.f45291d0;
                    i51 w10 = i51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w10.K(e0Var.f45294b0);
                    arrayList4.add(w10);
                    int i18 = uf.e0.f45292e0;
                    i51 w11 = i51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w11.K(!e0Var.f45294b0);
                    arrayList4.add(w11);
                    w51Var7.T();
                    arrayList4.add(i51.B(null));
                    uf.v vVar = e0Var.W;
                    if (vVar != null) {
                        vVar.a(arrayList4, w51Var7, true);
                    }
                    yh.A(R.string.BusinessBotChatsInfo2, arrayList4);
                    return;
                }
                return;
            case 19:
                final uf.k0 k0Var = (uf.k0) this.f41441b;
                ArrayList arrayList5 = (ArrayList) obj;
                w51 w51Var8 = (w51) obj2;
                LongSparseArray longSparseArray = k0Var.K;
                String string = LocaleController.getString(R.string.BusinessBots2);
                String string2 = LocaleController.getString(R.string.BusinessBots2Info);
                i51 i51Var2 = new i51(2);
                i51Var2.f25565l = string;
                i51Var2.f25568o = string2;
                i51Var2.f25566m = "tg_superplaceholders_android_2";
                i51Var2.f25567n = "🤖🏝️";
                i51Var2.f25578z = 120;
                arrayList5.add(i51Var2);
                if (k0Var.J != null) {
                    w51Var8.U();
                    long j12 = k0Var.J.f19331id;
                    i51 i51Var3 = new i51(13);
                    i51Var3.f25576x = j12;
                    i51Var3.K(true);
                    i51Var3.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    k0 k0Var2 = k0Var;
                                    k0Var2.J = null;
                                    k0Var2.f45352c.V2.N(true);
                                    k0Var2.Y(true);
                                    return;
                                case 1:
                                    k0 k0Var3 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = k0Var3.G;
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
                                    k0Var3.f45352c.V2.N(true);
                                    k0Var3.Y(true);
                                    return;
                                case 2:
                                    k0 k0Var4 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = k0Var4.G;
                                    if (tL_businessBotRights2.edit_name && tL_businessBotRights2.edit_bio && tL_businessBotRights2.edit_profile_photo && tL_businessBotRights2.edit_username) {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        k0Var4.f45352c.V2.N(true);
                                        k0Var4.Y(true);
                                        return;
                                    }
                                    k0Var4.X(-14, true, new g0(k0Var4, 2));
                                    return;
                                case 3:
                                    k0 k0Var5 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = k0Var5.G;
                                    if (tL_businessBotRights3.view_gifts && tL_businessBotRights3.sell_gifts && tL_businessBotRights3.change_gift_settings && tL_businessBotRights3.transfer_and_upgrade_gifts && tL_businessBotRights3.transfer_stars) {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        k0Var5.f45352c.V2.N(true);
                                        k0Var5.Y(true);
                                        return;
                                    }
                                    k0Var5.X(-17, true, new g0(k0Var5, 1));
                                    return;
                                default:
                                    k0 k0Var6 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = k0Var6.G;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    k0Var6.f45352c.V2.N(true);
                                    k0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(i51Var3);
                    w51Var8.T();
                } else {
                    w51Var8.U();
                    arrayList5.add(i51.k(k0Var.e));
                    longSparseArray.clear();
                    boolean z19 = false;
                    for (int i19 = 0; i19 < k0Var.d.d.size(); i19++) {
                        TLObject tLObject = (TLObject) k0Var.d.d.get(i19);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j13 = user.f19331id;
                                String str3 = k0Var.f45359y;
                                i51 i51Var4 = new i51(13);
                                i51Var4.f25576x = j13;
                                i51Var4.f25567n = str3;
                                arrayList5.add(i51Var4);
                                longSparseArray.put(user.f19331id, user);
                                z19 = true;
                            }
                        }
                    }
                    for (int i20 = 0; i20 < k0Var.d.e.size(); i20++) {
                        TLObject tLObject2 = (TLObject) k0Var.d.e.get(i20);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j14 = user2.f19331id;
                                String str4 = k0Var.f45359y;
                                i51 i51Var5 = new i51(13);
                                i51Var5.f25576x = j14;
                                i51Var5.f25567n = str4;
                                arrayList5.add(i51Var5);
                                longSparseArray.put(user2.f19331id, user2);
                                z19 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(k0Var.f45353f.getText().toString()) || k0Var.d.e() || k0Var.f45358x)) {
                        arrayList5.add(i51.k(k0Var.f45354n));
                        z19 = true;
                    }
                    View view = k0Var.h;
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
                if (k0Var.J != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t6.f25561g = z10;
                arrayList5.add(t6);
                i51 w12 = i51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w12.K(k0Var.F);
                if (k0Var.J != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w12.f25561g = z11;
                arrayList5.add(w12);
                i51 w13 = i51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w13.K(!k0Var.F);
                if (k0Var.J != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                w13.f25561g = z12;
                arrayList5.add(w13);
                w51Var8.T();
                arrayList5.add(i51.B(null));
                uf.v vVar2 = k0Var.v;
                if (k0Var.J != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                vVar2.a(arrayList5, w51Var8, z13);
                yh.A(R.string.BusinessBotChatsInfo2, arrayList5);
                if (k0Var.J != null) {
                    w51Var8.U();
                    yh.r(R.string.BusinessBotPermissions, arrayList5);
                    String string3 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = k0Var.G;
                    sb2.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb2.append("/5");
                    i51 m9 = i51.m(-4, string3, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = k0Var.G;
                    if (tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    m9.K(z14);
                    m9.f25560f = !k0Var.M;
                    m9.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    k0 k0Var2 = k0Var;
                                    k0Var2.J = null;
                                    k0Var2.f45352c.V2.N(true);
                                    k0Var2.Y(true);
                                    return;
                                case 1:
                                    k0 k0Var3 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = k0Var3.G;
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
                                    k0Var3.f45352c.V2.N(true);
                                    k0Var3.Y(true);
                                    return;
                                case 2:
                                    k0 k0Var4 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = k0Var4.G;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        k0Var4.f45352c.V2.N(true);
                                        k0Var4.Y(true);
                                        return;
                                    }
                                    k0Var4.X(-14, true, new g0(k0Var4, 2));
                                    return;
                                case 3:
                                    k0 k0Var5 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = k0Var5.G;
                                    if (tL_businessBotRights32.view_gifts && tL_businessBotRights32.sell_gifts && tL_businessBotRights32.change_gift_settings && tL_businessBotRights32.transfer_and_upgrade_gifts && tL_businessBotRights32.transfer_stars) {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        k0Var5.f45352c.V2.N(true);
                                        k0Var5.Y(true);
                                        return;
                                    }
                                    k0Var5.X(-17, true, new g0(k0Var5, 1));
                                    return;
                                default:
                                    k0 k0Var6 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = k0Var6.G;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    k0Var6.f45352c.V2.N(true);
                                    k0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(m9);
                    if (k0Var.M) {
                        i51 y10 = i51.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y10.K(true);
                        y10.f25561g = false;
                        y10.f25562i = 1;
                        arrayList5.add(y10);
                        i51 y11 = i51.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y11.K(k0Var.G.reply);
                        y11.f25562i = 1;
                        arrayList5.add(y11);
                        i51 y12 = i51.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y12.K(k0Var.G.read_messages);
                        y12.f25562i = 1;
                        arrayList5.add(y12);
                        i51 y13 = i51.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y13.K(k0Var.G.delete_sent_messages);
                        y13.f25562i = 1;
                        arrayList5.add(y13);
                        i51 y14 = i51.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y14.K(k0Var.G.delete_received_messages);
                        y14.f25562i = 1;
                        arrayList5.add(y14);
                    }
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = k0Var.G;
                    sb3.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb3.append("/4");
                    i51 m10 = i51.m(-10, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = k0Var.G;
                    if (tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    m10.K(z15);
                    m10.f25560f = !k0Var.N;
                    m10.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    k0 k0Var2 = k0Var;
                                    k0Var2.J = null;
                                    k0Var2.f45352c.V2.N(true);
                                    k0Var2.Y(true);
                                    return;
                                case 1:
                                    k0 k0Var3 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = k0Var3.G;
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
                                    k0Var3.f45352c.V2.N(true);
                                    k0Var3.Y(true);
                                    return;
                                case 2:
                                    k0 k0Var4 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = k0Var4.G;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        k0Var4.f45352c.V2.N(true);
                                        k0Var4.Y(true);
                                        return;
                                    }
                                    k0Var4.X(-14, true, new g0(k0Var4, 2));
                                    return;
                                case 3:
                                    k0 k0Var5 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = k0Var5.G;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        k0Var5.f45352c.V2.N(true);
                                        k0Var5.Y(true);
                                        return;
                                    }
                                    k0Var5.X(-17, true, new g0(k0Var5, 1));
                                    return;
                                default:
                                    k0 k0Var6 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = k0Var6.G;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    k0Var6.f45352c.V2.N(true);
                                    k0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(m10);
                    if (k0Var.N) {
                        i51 y15 = i51.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y15.K(k0Var.G.edit_name);
                        y15.f25562i = 1;
                        arrayList5.add(y15);
                        i51 y16 = i51.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y16.K(k0Var.G.edit_bio);
                        y16.f25562i = 1;
                        arrayList5.add(y16);
                        i51 y17 = i51.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y17.K(k0Var.G.edit_profile_photo);
                        y17.f25562i = 1;
                        arrayList5.add(y17);
                        i51 y18 = i51.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y18.K(k0Var.G.edit_username);
                        y18.f25562i = 1;
                        arrayList5.add(y18);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = k0Var.G;
                    sb4.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb4.append("/5");
                    i51 m11 = i51.m(-15, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = k0Var.G;
                    if (tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    m11.K(z16);
                    m11.f25560f = !k0Var.O;
                    m11.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    k0 k0Var2 = k0Var;
                                    k0Var2.J = null;
                                    k0Var2.f45352c.V2.N(true);
                                    k0Var2.Y(true);
                                    return;
                                case 1:
                                    k0 k0Var3 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = k0Var3.G;
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
                                    k0Var3.f45352c.V2.N(true);
                                    k0Var3.Y(true);
                                    return;
                                case 2:
                                    k0 k0Var4 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = k0Var4.G;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        k0Var4.f45352c.V2.N(true);
                                        k0Var4.Y(true);
                                        return;
                                    }
                                    k0Var4.X(-14, true, new g0(k0Var4, 2));
                                    return;
                                case 3:
                                    k0 k0Var5 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = k0Var5.G;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        k0Var5.f45352c.V2.N(true);
                                        k0Var5.Y(true);
                                        return;
                                    }
                                    k0Var5.X(-17, true, new g0(k0Var5, 1));
                                    return;
                                default:
                                    k0 k0Var6 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = k0Var6.G;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    k0Var6.f45352c.V2.N(true);
                                    k0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(m11);
                    if (k0Var.O) {
                        i51 y19 = i51.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y19.K(k0Var.G.view_gifts);
                        y19.f25562i = 1;
                        arrayList5.add(y19);
                        i51 y20 = i51.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y20.K(k0Var.G.sell_gifts);
                        y20.f25562i = 1;
                        arrayList5.add(y20);
                        i51 y21 = i51.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y21.K(k0Var.G.change_gift_settings);
                        y21.f25562i = 1;
                        arrayList5.add(y21);
                        i51 y22 = i51.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y22.K(k0Var.G.transfer_and_upgrade_gifts);
                        y22.f25562i = 1;
                        arrayList5.add(y22);
                        i51 y23 = i51.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y23.K(k0Var.G.transfer_stars);
                        y23.f25562i = 1;
                        arrayList5.add(y23);
                    }
                    i51 m12 = i51.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), "");
                    m12.K(k0Var.G.manage_stories);
                    m12.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    k0 k0Var2 = k0Var;
                                    k0Var2.J = null;
                                    k0Var2.f45352c.V2.N(true);
                                    k0Var2.Y(true);
                                    return;
                                case 1:
                                    k0 k0Var3 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = k0Var3.G;
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
                                    k0Var3.f45352c.V2.N(true);
                                    k0Var3.Y(true);
                                    return;
                                case 2:
                                    k0 k0Var4 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = k0Var4.G;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        k0Var4.f45352c.V2.N(true);
                                        k0Var4.Y(true);
                                        return;
                                    }
                                    k0Var4.X(-14, true, new g0(k0Var4, 2));
                                    return;
                                case 3:
                                    k0 k0Var5 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = k0Var5.G;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        k0Var5.f45352c.V2.N(true);
                                        k0Var5.Y(true);
                                        return;
                                    }
                                    k0Var5.X(-17, true, new g0(k0Var5, 1));
                                    return;
                                default:
                                    k0 k0Var6 = k0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = k0Var6.G;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    k0Var6.f45352c.V2.N(true);
                                    k0Var6.Y(true);
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
                uf.m0.U((uf.m0) this.f41441b, (ArrayList) obj, (w51) obj2);
                return;
            case 21:
                uf.u0 u0Var = (uf.u0) this.f41441b;
                ArrayList arrayList6 = (ArrayList) obj;
                w51 w51Var9 = (w51) obj2;
                String string6 = LocaleController.getString(R.string.BusinessLocation);
                String string7 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i21 = R.raw.biz_map;
                i51 i51Var6 = new i51(2);
                i51Var6.f25565l = string6;
                i51Var6.f25568o = string7;
                i51Var6.f25564k = i21;
                arrayList6.add(i51Var6);
                arrayList6.add(i51.k(u0Var.e));
                arrayList6.add(i51.B(null));
                i51 i22 = i51.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                if (u0Var.f45453x != null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i22.K(z17);
                arrayList6.add(i22);
                if (u0Var.f45453x != null) {
                    arrayList6.add(i51.k(u0Var.h));
                }
                arrayList6.add(i51.B(null));
                if (u0Var.f45452w != null && (u0Var.f45453x != null || !TextUtils.isEmpty(u0Var.f45454y))) {
                    z18 = true;
                }
                u0Var.D = z18;
                if (z18) {
                    i51 e = i51.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e.f25571r = true;
                    arrayList6.add(e);
                    arrayList6.add(i51.B(null));
                }
                u0Var.U(true);
                return;
            case 22:
                w51 w51Var10 = (w51) obj2;
                uf.x0.V((uf.x0) this.f41441b, (ArrayList) obj);
                return;
            case 23:
                uf.z0 z0Var = (uf.z0) this.f41441b;
                ArrayList arrayList7 = (ArrayList) obj;
                w51 w51Var11 = (w51) obj2;
                ArrayList arrayList8 = z0Var.f45487b;
                String string8 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                i51 i51Var7 = new i51(9);
                i51Var7.d = -1;
                i51Var7.f25565l = string8;
                i51Var7.K(z0Var.f45491r);
                arrayList7.add(i51Var7);
                arrayList7.add(i51.B(null));
                if (z0Var.f45491r) {
                    for (int i23 = 0; i23 < arrayList8.size(); i23++) {
                        if (i23 > 0) {
                            arrayList7.add(i51.B(null));
                        }
                        uf.w0 w0Var = (uf.w0) arrayList8.get(i23);
                        if (!z0Var.U()) {
                            int i24 = i23 * 3;
                            arrayList7.add(i51.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), uf.w0.a(w0Var.f45470a), i24));
                            arrayList7.add(i51.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), uf.w0.a(w0Var.f45471b), i24 + 1));
                            i51 e6 = i51.e(i24 + 2, LocaleController.getString(R.string.Remove));
                            e6.f25571r = true;
                            arrayList7.add(e6);
                        }
                    }
                    if (z0Var.V()) {
                        arrayList7.add(i51.B(null));
                        i51 c10 = i51.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c10.f25570q = true;
                        arrayList7.add(c10);
                    }
                    yh.A(R.string.BusinessHoursDayInfo, arrayList7);
                    return;
                }
                return;
            case 24:
                uf.r1.V((uf.r1) this.f41441b, (ArrayList) obj, (w51) obj2);
                return;
            case 25:
                uh.a aVar = (uh.a) this.f41441b;
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
                ((ArrayList) obj).add(i51.j(0, ((uh.b) this.f41441b).U));
                return;
            case 27:
                String str5 = (String) obj;
                Utilities.themeQueue.postRunnable(new uf.v0(4, (String[]) this.f41441b, (Utilities.Callback2) obj2));
                return;
            case 28:
                vh.v vVar3 = (vh.v) this.f41441b;
                ArrayList arrayList10 = (ArrayList) obj;
                w51 w51Var14 = (w51) obj2;
                arrayList10.add(i51.j(1, vVar3.X));
                arrayList10.add(i51.j(3, vVar3.f46217a0));
                if (vVar3.f46222f0 != null) {
                    arrayList10.add(i51.j(2, vVar3.Y));
                    return;
                }
                return;
            default:
                vh.r3.I1((vh.r3[]) this.f41441b, (ArrayList) obj, (w51) obj2);
                return;
        }
    }
}
