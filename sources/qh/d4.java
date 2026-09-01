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
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.ih;
import org.telegram.ui.py;
import org.telegram.ui.yh;
public final class d4 implements Utilities.Callback2 {
    public final int f45202a;
    public final Object f45203b;

    public d4(Object obj, int i10) {
        this.f45202a = i10;
        this.f45203b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        long duration;
        String upperCase;
        boolean z4;
        int i10;
        x51 x51Var;
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
        switch (this.f45202a) {
            case 0:
                b5 b5Var = (b5) this.f45203b;
                b5Var.d0(b5Var.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                return;
            case 1:
                ((ba) this.f45203b).Z((Bitmap) obj, ((Float) obj2).floatValue());
                return;
            case 2:
                b7 b7Var = (b7) this.f45203b;
                ArrayList arrayList = (ArrayList) obj;
                x51 x51Var2 = (x51) obj2;
                if (b7Var.f45009e0 || b7Var.f45008d0 != null) {
                    TLRPC.WebPage webPage = b7Var.f45008d0;
                    t6 t6Var = new t6(b7Var, 0);
                    int i15 = z6.f46391a;
                    j51 J = j51.J(z6.class);
                    J.G = webPage;
                    J.D = t6Var;
                    arrayList.add(J);
                }
                arrayList.add(j51.k(b7Var.V));
                arrayList.add(j51.A(1, null));
                j51 i16 = j51.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i16.K(b7Var.f45014j0);
                arrayList.add(i16);
                if (b7Var.f45014j0) {
                    arrayList.add(j51.k(b7Var.W));
                }
                arrayList.add(j51.A(3, null));
                arrayList.add(j51.k(b7Var.X));
                return;
            case 3:
                ca caVar = (ca) this.f45203b;
                Boolean bool = (Boolean) obj;
                Float f10 = (Float) obj2;
                if (caVar.U0.getDuration() < 100) {
                    duration = caVar.H1.f46059h0;
                } else {
                    duration = caVar.U0.getDuration();
                }
                float floatValue = ((f10.floatValue() / 0.96f) * 0.04f) + f10.floatValue();
                s6 s6Var = caVar.H1;
                float f11 = s6Var.f46042a0;
                float f12 = s6Var.Z;
                float f13 = (f11 - f12) * floatValue;
                float f14 = (float) duration;
                long j10 = f13 * f14;
                q9 q9Var = caVar.U0;
                long j11 = (f12 * f14) + ((float) j10);
                caVar.J1 = j11;
                q9Var.m(j11);
                f9 f9Var = caVar.f45134s1;
                if (f9Var != null) {
                    f9Var.setCoverTime(caVar.J1);
                }
                s6 s6Var2 = caVar.H1;
                if (s6Var2 != null && s6Var2.f46057g) {
                    s6Var2.f46062j = true;
                    return;
                }
                return;
            case 4:
                ((fa) this.f45203b).b((short[]) obj, ((Integer) obj2).intValue());
                return;
            case 5:
                ((rh.g) this.f45203b).C0((ArrayList) obj, (x51) obj2);
                return;
            case 6:
                rh.f fVar = (rh.f) this.f45203b;
                ArrayList arrayList2 = (ArrayList) obj;
                x51 x51Var3 = (x51) obj2;
                arrayList2.add(j51.k(fVar.V));
                arrayList2.add(j51.k(fVar.W));
                return;
            case 7:
                ((sh.j) this.f45203b).E0((ArrayList) obj, (x51) obj2);
                return;
            case 8:
                x51 x51Var4 = (x51) obj2;
                sh.r.U((sh.r) this.f45203b, (ArrayList) obj);
                return;
            case 9:
                org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) this.f45203b;
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
                sh.e1 e1Var = (sh.e1) this.f45203b;
                ArrayList arrayList3 = (ArrayList) obj;
                x51 x51Var5 = (x51) obj2;
                arrayList3.add(j51.j(-1, e1Var.X));
                arrayList3.add(j51.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, e1Var.V))));
                return;
            case 11:
                sh.p2 p2Var = (sh.p2) this.f45203b;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    p2Var.getClass();
                    return;
                }
                sh.y3 y3Var = p2Var.f47606s0;
                if (y3Var != null) {
                    y3Var.a(tL_webViewResultUrl);
                    p2Var.n();
                    return;
                }
                return;
            case 12:
                ((sh.d3) this.f45203b).F0((ArrayList) obj, (x51) obj2);
                return;
            case 13:
                ((sh.x3) this.f45203b).U((ArrayList) obj, (x51) obj2);
                return;
            case 14:
                x51 x51Var6 = (x51) obj2;
                ((th.q) this.f45203b).v.c((ArrayList) obj);
                return;
            case 15:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                xn0 xn0Var = (xn0) ((uf.z) this.f45203b);
                py pyVar = xn0Var.F0;
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
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new ih(xn0Var, pyVar, xn0Var.G0, I, 20), z4);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new ih((Object) xn0Var, (Object) pyVar, (Object) tL_sponsoredPeer, (Object) I, 21), z4);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new jp(xn0Var, pyVar, I, 15), z4);
                if (LocaleController.isRTL) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                I.V(i10);
                I.Y = true;
                I.f30330t = z4;
                I.Z();
                return;
            case 16:
                vf.c.U((vf.c) this.f45203b, (ArrayList) obj, (x51) obj2);
                return;
            case 17:
                vf.k kVar = (vf.k) this.f45203b;
                kVar.I.dismiss();
                kVar.f49083y = (String) obj;
                kVar.B = (TLRPC.InputDocument) obj2;
                kVar.f49081w = false;
                AndroidUtilities.cancelRunOnUIThread(kVar.d);
                kVar.f49078n.setSticker(kVar.f49083y);
                kVar.e0(true);
                b61 b61Var = kVar.f25815a;
                if (b61Var != null && (x51Var = b61Var.V2) != null) {
                    x51Var.N(true);
                    return;
                }
                return;
            case 18:
                vf.f0 f0Var = (vf.f0) this.f45203b;
                ArrayList arrayList4 = (ArrayList) obj;
                x51 x51Var7 = (x51) obj2;
                x51Var7.B = 1;
                LinearLayout linearLayout = f0Var.X;
                j51 j51Var = new j51(-4);
                j51Var.d = -5;
                j51Var.f28007c = linearLayout;
                j51Var.f28027z = -1;
                arrayList4.add(j51Var);
                TL_account.TL_connectedBot tL_connectedBot = f0Var.U;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        yh.r(R.string.SessionBotConnectedFrom, arrayList4);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList4.add(j51.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i11 = 2;
                            arrayList4.add(j51.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i11 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i11)) {
                            arrayList4.add(j51.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList4.add(j51.B(null));
                    }
                    x51Var7.U();
                    yh.r(R.string.BusinessBotChats2, arrayList4);
                    int i17 = vf.f0.f49044d0;
                    j51 w10 = j51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w10.K(f0Var.f49047b0);
                    arrayList4.add(w10);
                    int i18 = vf.f0.f49045e0;
                    j51 w11 = j51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w11.K(!f0Var.f49047b0);
                    arrayList4.add(w11);
                    x51Var7.T();
                    arrayList4.add(j51.B(null));
                    vf.v vVar = f0Var.W;
                    if (vVar != null) {
                        vVar.a(arrayList4, x51Var7, true);
                    }
                    yh.A(R.string.BusinessBotChatsInfo2, arrayList4);
                    return;
                }
                return;
            case 19:
                final vf.l0 l0Var = (vf.l0) this.f45203b;
                ArrayList arrayList5 = (ArrayList) obj;
                x51 x51Var8 = (x51) obj2;
                LongSparseArray longSparseArray = l0Var.K;
                String string = LocaleController.getString(R.string.BusinessBots2);
                String string2 = LocaleController.getString(R.string.BusinessBots2Info);
                j51 j51Var2 = new j51(2);
                j51Var2.f28014l = string;
                j51Var2.f28017o = string2;
                j51Var2.f28015m = "tg_superplaceholders_android_2";
                j51Var2.f28016n = "🤖🏝️";
                j51Var2.f28027z = 120;
                arrayList5.add(j51Var2);
                if (l0Var.J != null) {
                    x51Var8.U();
                    long j12 = l0Var.J.f20990id;
                    j51 j51Var3 = new j51(13);
                    j51Var3.f28025x = j12;
                    j51Var3.K(true);
                    j51Var3.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.f49112c.V2.N(true);
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
                                    l0Var3.f49112c.V2.N(true);
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
                                        l0Var4.f49112c.V2.N(true);
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
                                        l0Var5.f49112c.V2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new h0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var6.G;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    l0Var6.f49112c.V2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(j51Var3);
                    x51Var8.T();
                } else {
                    x51Var8.U();
                    arrayList5.add(j51.k(l0Var.f49113e));
                    longSparseArray.clear();
                    boolean z19 = false;
                    for (int i19 = 0; i19 < l0Var.d.d.size(); i19++) {
                        TLObject tLObject = (TLObject) l0Var.d.d.get(i19);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j13 = user.f20990id;
                                String str3 = l0Var.f49120y;
                                j51 j51Var4 = new j51(13);
                                j51Var4.f28025x = j13;
                                j51Var4.f28016n = str3;
                                arrayList5.add(j51Var4);
                                longSparseArray.put(user.f20990id, user);
                                z19 = true;
                            }
                        }
                    }
                    for (int i20 = 0; i20 < l0Var.d.f48621e.size(); i20++) {
                        TLObject tLObject2 = (TLObject) l0Var.d.f48621e.get(i20);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j14 = user2.f20990id;
                                String str4 = l0Var.f49120y;
                                j51 j51Var5 = new j51(13);
                                j51Var5.f28025x = j14;
                                j51Var5.f28016n = str4;
                                arrayList5.add(j51Var5);
                                longSparseArray.put(user2.f20990id, user2);
                                z19 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(l0Var.f49114f.getText().toString()) || l0Var.d.e() || l0Var.f49119x)) {
                        arrayList5.add(j51.k(l0Var.f49115n));
                        z19 = true;
                    }
                    View view = l0Var.h;
                    if (z19) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    view.setVisibility(i12);
                    x51Var8.T();
                }
                arrayList5.add(j51.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                x51Var8.U();
                j51 t6 = j51.t(LocaleController.getString(R.string.BusinessBotChats2));
                if (l0Var.J != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t6.f28010g = z10;
                arrayList5.add(t6);
                j51 w12 = j51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w12.K(l0Var.F);
                if (l0Var.J != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w12.f28010g = z11;
                arrayList5.add(w12);
                j51 w13 = j51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w13.K(!l0Var.F);
                if (l0Var.J != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                w13.f28010g = z12;
                arrayList5.add(w13);
                x51Var8.T();
                arrayList5.add(j51.B(null));
                vf.v vVar2 = l0Var.v;
                if (l0Var.J != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                vVar2.a(arrayList5, x51Var8, z13);
                yh.A(R.string.BusinessBotChatsInfo2, arrayList5);
                if (l0Var.J != null) {
                    x51Var8.U();
                    yh.r(R.string.BusinessBotPermissions, arrayList5);
                    String string3 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = l0Var.G;
                    sb2.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb2.append("/5");
                    j51 m9 = j51.m(-4, string3, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var.G;
                    if (tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    m9.K(z14);
                    m9.f28009f = !l0Var.M;
                    m9.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.f49112c.V2.N(true);
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
                                    l0Var3.f49112c.V2.N(true);
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
                                        l0Var4.f49112c.V2.N(true);
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
                                        l0Var5.f49112c.V2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new h0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var6.G;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    l0Var6.f49112c.V2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(m9);
                    if (l0Var.M) {
                        j51 y10 = j51.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y10.K(true);
                        y10.f28010g = false;
                        y10.f28011i = 1;
                        arrayList5.add(y10);
                        j51 y11 = j51.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y11.K(l0Var.G.reply);
                        y11.f28011i = 1;
                        arrayList5.add(y11);
                        j51 y12 = j51.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y12.K(l0Var.G.read_messages);
                        y12.f28011i = 1;
                        arrayList5.add(y12);
                        j51 y13 = j51.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y13.K(l0Var.G.delete_sent_messages);
                        y13.f28011i = 1;
                        arrayList5.add(y13);
                        j51 y14 = j51.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y14.K(l0Var.G.delete_received_messages);
                        y14.f28011i = 1;
                        arrayList5.add(y14);
                    }
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var.G;
                    sb3.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb3.append("/4");
                    j51 m10 = j51.m(-10, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var.G;
                    if (tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    m10.K(z15);
                    m10.f28009f = !l0Var.N;
                    m10.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.f49112c.V2.N(true);
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
                                    l0Var3.f49112c.V2.N(true);
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
                                        l0Var4.f49112c.V2.N(true);
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
                                        l0Var5.f49112c.V2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new h0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = l0Var6.G;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    l0Var6.f49112c.V2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(m10);
                    if (l0Var.N) {
                        j51 y15 = j51.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y15.K(l0Var.G.edit_name);
                        y15.f28011i = 1;
                        arrayList5.add(y15);
                        j51 y16 = j51.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y16.K(l0Var.G.edit_bio);
                        y16.f28011i = 1;
                        arrayList5.add(y16);
                        j51 y17 = j51.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y17.K(l0Var.G.edit_profile_photo);
                        y17.f28011i = 1;
                        arrayList5.add(y17);
                        j51 y18 = j51.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y18.K(l0Var.G.edit_username);
                        y18.f28011i = 1;
                        arrayList5.add(y18);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = l0Var.G;
                    sb4.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb4.append("/5");
                    j51 m11 = j51.m(-15, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = l0Var.G;
                    if (tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    m11.K(z16);
                    m11.f28009f = !l0Var.O;
                    m11.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.f49112c.V2.N(true);
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
                                    l0Var3.f49112c.V2.N(true);
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
                                        l0Var4.f49112c.V2.N(true);
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
                                        l0Var5.f49112c.V2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new h0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = l0Var6.G;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    l0Var6.f49112c.V2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(m11);
                    if (l0Var.O) {
                        j51 y19 = j51.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y19.K(l0Var.G.view_gifts);
                        y19.f28011i = 1;
                        arrayList5.add(y19);
                        j51 y20 = j51.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y20.K(l0Var.G.sell_gifts);
                        y20.f28011i = 1;
                        arrayList5.add(y20);
                        j51 y21 = j51.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y21.K(l0Var.G.change_gift_settings);
                        y21.f28011i = 1;
                        arrayList5.add(y21);
                        j51 y22 = j51.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y22.K(l0Var.G.transfer_and_upgrade_gifts);
                        y22.f28011i = 1;
                        arrayList5.add(y22);
                        j51 y23 = j51.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y23.K(l0Var.G.transfer_stars);
                        y23.f28011i = 1;
                        arrayList5.add(y23);
                    }
                    j51 m12 = j51.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), "");
                    m12.K(l0Var.G.manage_stories);
                    m12.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.f49112c.V2.N(true);
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
                                    l0Var3.f49112c.V2.N(true);
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
                                        l0Var4.f49112c.V2.N(true);
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
                                        l0Var5.f49112c.V2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new h0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = l0Var6.G;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    l0Var6.f49112c.V2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList5.add(m12);
                    x51Var8.T();
                    arrayList5.add(j51.A(-4, null));
                    arrayList5.add(j51.A(-5, null));
                    arrayList5.add(j51.A(-6, null));
                    arrayList5.add(j51.A(-7, null));
                    return;
                }
                return;
            case 20:
                vf.n0.U((vf.n0) this.f45203b, (ArrayList) obj, (x51) obj2);
                return;
            case 21:
                vf.v0 v0Var = (vf.v0) this.f45203b;
                ArrayList arrayList6 = (ArrayList) obj;
                x51 x51Var9 = (x51) obj2;
                String string6 = LocaleController.getString(R.string.BusinessLocation);
                String string7 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i21 = R.raw.biz_map;
                j51 j51Var6 = new j51(2);
                j51Var6.f28014l = string6;
                j51Var6.f28017o = string7;
                j51Var6.f28013k = i21;
                arrayList6.add(j51Var6);
                arrayList6.add(j51.k(v0Var.f49222e));
                arrayList6.add(j51.B(null));
                j51 i22 = j51.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                if (v0Var.f49228x != null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i22.K(z17);
                arrayList6.add(i22);
                if (v0Var.f49228x != null) {
                    arrayList6.add(j51.k(v0Var.h));
                }
                arrayList6.add(j51.B(null));
                if (v0Var.f49227w != null && (v0Var.f49228x != null || !TextUtils.isEmpty(v0Var.f49229y))) {
                    z18 = true;
                }
                v0Var.D = z18;
                if (z18) {
                    j51 e6 = j51.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e6.f28020r = true;
                    arrayList6.add(e6);
                    arrayList6.add(j51.B(null));
                }
                v0Var.U(true);
                return;
            case 22:
                x51 x51Var10 = (x51) obj2;
                vf.x0.V((vf.x0) this.f45203b, (ArrayList) obj);
                return;
            case 23:
                vf.z0 z0Var = (vf.z0) this.f45203b;
                ArrayList arrayList7 = (ArrayList) obj;
                x51 x51Var11 = (x51) obj2;
                ArrayList arrayList8 = z0Var.f49249b;
                String string8 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                j51 j51Var7 = new j51(9);
                j51Var7.d = -1;
                j51Var7.f28014l = string8;
                j51Var7.K(z0Var.f49254r);
                arrayList7.add(j51Var7);
                arrayList7.add(j51.B(null));
                if (z0Var.f49254r) {
                    for (int i23 = 0; i23 < arrayList8.size(); i23++) {
                        if (i23 > 0) {
                            arrayList7.add(j51.B(null));
                        }
                        vf.w0 w0Var = (vf.w0) arrayList8.get(i23);
                        if (!z0Var.U()) {
                            int i24 = i23 * 3;
                            arrayList7.add(j51.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), vf.w0.a(w0Var.f49231a), i24));
                            arrayList7.add(j51.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), vf.w0.a(w0Var.f49232b), i24 + 1));
                            j51 e10 = j51.e(i24 + 2, LocaleController.getString(R.string.Remove));
                            e10.f28020r = true;
                            arrayList7.add(e10);
                        }
                    }
                    if (z0Var.V()) {
                        arrayList7.add(j51.B(null));
                        j51 c10 = j51.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c10.f28019q = true;
                        arrayList7.add(c10);
                    }
                    yh.A(R.string.BusinessHoursDayInfo, arrayList7);
                    return;
                }
                return;
            case 24:
                vf.r1.V((vf.r1) this.f45203b, (ArrayList) obj, (x51) obj2);
                return;
            case 25:
                vh.a aVar = (vh.a) this.f45203b;
                ArrayList arrayList9 = (ArrayList) obj;
                x51 x51Var12 = (x51) obj2;
                arrayList9.add(j51.D(0, AndroidUtilities.dp(12.0f)));
                arrayList9.add(j51.j(1, aVar.W));
                arrayList9.add(j51.D(2, AndroidUtilities.dp(12.0f)));
                arrayList9.add(j51.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
                aVar.Z = arrayList9.size();
                String string9 = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
                boolean z20 = aVar.Y;
                if (z20) {
                    i13 = R.string.CommunityChatVisibilityVisibleBotInfo;
                } else {
                    i13 = R.string.CommunityChatVisibilityVisibleInfo;
                }
                j51 x10 = j51.x(151, string9, LocaleController.getString(i13));
                x10.K(true ^ aVar.V);
                arrayList9.add(x10);
                String string10 = LocaleController.getString(R.string.CommunityChatVisibilityHidden);
                if (z20) {
                    i14 = R.string.CommunityChatVisibilityHiddenBotInfo;
                } else {
                    i14 = R.string.CommunityChatVisibilityHiddenInfo;
                }
                j51 x11 = j51.x(150, string10, LocaleController.getString(i14));
                x11.K(aVar.V);
                arrayList9.add(x11);
                arrayList9.add(j51.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
                return;
            case 26:
                x51 x51Var13 = (x51) obj2;
                ((ArrayList) obj).add(j51.j(0, ((vh.b) this.f45203b).U));
                return;
            case 27:
                String str5 = (String) obj;
                Utilities.themeQueue.postRunnable(new vf.d0(6, (String[]) this.f45203b, (Utilities.Callback2) obj2));
                return;
            case 28:
                wh.w wVar = (wh.w) this.f45203b;
                ArrayList arrayList10 = (ArrayList) obj;
                x51 x51Var14 = (x51) obj2;
                arrayList10.add(j51.j(1, wVar.X));
                arrayList10.add(j51.j(3, wVar.f50121a0));
                if (wVar.f50126f0 != null) {
                    arrayList10.add(j51.j(2, wVar.Y));
                    return;
                }
                return;
            default:
                wh.r3.I1((wh.r3[]) this.f45203b, (ArrayList) obj, (x51) obj2);
                return;
        }
    }
}
