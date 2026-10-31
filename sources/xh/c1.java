package xh;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.hc;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.qz;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.b20;
import org.telegram.ui.oe0;
import vh.k4;
import w7.b6;
public final class c1 extends ha {
    public final int P1;
    public final String Q1;
    public p51 R1;
    public final z0 S1;
    public boolean T1;
    public boolean U1;
    public final org.telegram.tgnet.e V1;
    public int W1;

    public c1(Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File file, TLRPC.WebPage webPage, p6 p6Var, org.telegram.ui.web.q qVar, org.telegram.tgnet.e eVar) {
        super(context, null, false, false, p6Var);
        ?? r11;
        int i11;
        b1 d12;
        char c10;
        char c11;
        TLRPC.TL_document tL_document;
        TLRPC.TL_photo tL_photo;
        int lastIndexOf;
        int i12;
        TLRPC.TL_photo tL_photo2;
        this.T1 = false;
        this.U1 = false;
        this.P1 = i10;
        this.Q1 = h20.p(vp.r1(i10).Z1(Long.valueOf(j10)));
        this.V1 = eVar;
        Y0();
        this.f26680z1 = org.telegram.messenger.i0.L(4.0f);
        this.A1 = org.telegram.messenger.i0.L(-10.0f);
        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
        if (file == null || !file.exists() || webPage != null) {
            r11 = 1;
            i11 = i10;
            d12 = d1(i11, j10, botInlineResult, null, null, webPage);
        } else {
            String str = botInlineResult.type;
            String absolutePath = file.getAbsolutePath();
            str.getClass();
            boolean z10 = true;
            switch (str.hashCode()) {
                case -1890252483:
                    if (str.equals("sticker")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 102340:
                    if (str.equals("gif")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3143036:
                    if (str.equals("file")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93166550:
                    if (str.equals("audio")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 106642994:
                    if (str.equals("photo")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 112202875:
                    if (str.equals("video")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 112386354:
                    if (str.equals("voice")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                    TLRPC.TL_document tL_document2 = new TLRPC.TL_document();
                    tL_document2.f19799id = 0L;
                    tL_document2.size = 0L;
                    tL_document2.dc_id = 0;
                    tL_document2.mime_type = botInlineResult.content.mime_type;
                    tL_document2.file_reference = new byte[0];
                    tL_document2.date = ConnectionsManager.getInstance(i10).getCurrentTime();
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_document2.attributes.add(tL_documentAttributeFilename);
                    switch (str.hashCode()) {
                        case -1890252483:
                            if (str.equals("sticker")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 102340:
                            if (str.equals("gif")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3143036:
                            if (str.equals("file")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 93166550:
                            if (str.equals("audio")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 112202875:
                            if (str.equals("video")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 112386354:
                            if (str.equals("voice")) {
                                c11 = 5;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                            tL_documentAttributeSticker.alt = "";
                            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_document2.attributes.add(tL_documentAttributeSticker);
                            TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                            int[] h12 = jj.h1(botInlineResult);
                            tL_documentAttributeImageSize.f19800w = h12[0];
                            tL_documentAttributeImageSize.h = h12[1];
                            tL_document2.attributes.add(tL_documentAttributeImageSize);
                            tL_documentAttributeFilename.file_name = "sticker.webp";
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap K = hc.K(new File(b8.z(4), Utilities.a(botInlineResult.thumb.url) + "." + hc.B(botInlineResult.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (K != null) {
                                        TLRPC.PhotoSize Z = hc.Z(K, 90.0f, 90.0f, 55, false);
                                        if (Z != null) {
                                            tL_document2.thumbs.add(Z);
                                            tL_document2.flags |= 1;
                                        }
                                        K.recycle();
                                        break;
                                    }
                                }
                            } catch (Throwable th2) {
                                f8.g(th2, true);
                                break;
                            }
                            break;
                        case 1:
                            tL_documentAttributeFilename.file_name = "animation.gif";
                            if (absolutePath.endsWith("mp4")) {
                                tL_document2.mime_type = "video/mp4";
                                tL_document2.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                break;
                            } else {
                                tL_document2.mime_type = "image/gif";
                                break;
                            }
                        case 2:
                            if (botInlineResult.content.mime_type.lastIndexOf(47) != -1) {
                                tL_documentAttributeFilename.file_name = "file." + botInlineResult.content.mime_type.substring(lastIndexOf + 1);
                                break;
                            } else {
                                tL_documentAttributeFilename.file_name = "file";
                                break;
                            }
                        case 3:
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio.duration = jj.g1(botInlineResult);
                            tL_documentAttributeAudio.title = botInlineResult.title;
                            int i13 = tL_documentAttributeAudio.flags;
                            tL_documentAttributeAudio.flags = i13 | 1;
                            String str2 = botInlineResult.description;
                            if (str2 != null) {
                                tL_documentAttributeAudio.performer = str2;
                                tL_documentAttributeAudio.flags = i13 | 3;
                            }
                            tL_documentAttributeFilename.file_name = "audio.mp3";
                            tL_document2.attributes.add(tL_documentAttributeAudio);
                            break;
                        case 4:
                            tL_documentAttributeFilename.file_name = "video.mp4";
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                            int[] h13 = jj.h1(botInlineResult);
                            tL_documentAttributeVideo.f19800w = h13[0];
                            tL_documentAttributeVideo.h = h13[1];
                            tL_documentAttributeVideo.duration = jj.g1(botInlineResult);
                            tL_documentAttributeVideo.supports_streaming = true;
                            tL_document2.attributes.add(tL_documentAttributeVideo);
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap K2 = hc.K(new File(b8.z(4), Utilities.a(botInlineResult.thumb.url) + "." + hc.B(botInlineResult.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (K2 != null) {
                                        TLRPC.PhotoSize Z2 = hc.Z(K2, 90.0f, 90.0f, 55, false);
                                        if (Z2 != null) {
                                            tL_document2.thumbs.add(Z2);
                                            tL_document2.flags |= 1;
                                        }
                                        K2.recycle();
                                        break;
                                    }
                                }
                            } catch (Throwable th3) {
                                f8.g(th3, true);
                                break;
                            }
                            break;
                        case 5:
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio2.duration = jj.g1(botInlineResult);
                            tL_documentAttributeAudio2.voice = true;
                            tL_documentAttributeFilename.file_name = "audio.ogg";
                            tL_document2.attributes.add(tL_documentAttributeAudio2);
                            break;
                    }
                    if (tL_documentAttributeFilename.file_name == null) {
                        tL_documentAttributeFilename.file_name = "file";
                    }
                    if (tL_document2.mime_type == null) {
                        tL_document2.mime_type = "application/octet-stream";
                    }
                    if (tL_document2.thumbs.isEmpty()) {
                        TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                        int[] h14 = jj.h1(botInlineResult);
                        tL_photoSize.f19818w = h14[0];
                        z10 = true;
                        tL_photoSize.h = h14[1];
                        tL_photoSize.size = 0;
                        tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize.type = "x";
                        tL_document2.thumbs.add(tL_photoSize);
                        tL_document2.flags |= 1;
                    } else {
                        z10 = true;
                    }
                    tL_document = tL_document2;
                    tL_photo = null;
                    break;
                case 4:
                    if (file.exists()) {
                        i12 = 0;
                        tL_photo2 = qz.C(i10).A(absolutePath, null, false);
                    } else {
                        i12 = 0;
                        tL_photo2 = null;
                    }
                    if (tL_photo2 == null) {
                        tL_photo2 = new TLRPC.TL_photo();
                        tL_photo2.date = ConnectionsManager.getInstance(i10).getCurrentTime();
                        tL_photo2.file_reference = new byte[i12];
                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                        int[] h15 = jj.h1(botInlineResult);
                        tL_photoSize2.f19818w = h15[i12];
                        tL_photoSize2.h = h15[1];
                        tL_photoSize2.size = 1;
                        tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize2.type = "x";
                        tL_photo2.sizes.add(tL_photoSize2);
                    }
                    tL_photo = tL_photo2;
                    tL_document = null;
                    z10 = true;
                    break;
                default:
                    tL_photo = null;
                    tL_document = null;
                    break;
            }
            i11 = i10;
            r11 = z10;
            d12 = d1(i11, j10, botInlineResult, tL_photo, tL_document, null);
        }
        b1 b1Var = d12;
        org.telegram.ui.Cells.s0 s0Var = new org.telegram.ui.Cells.s0(context, p6Var, false);
        s0Var.setDelegate(new Object());
        s0Var.setCustomText(cd.L0(2131752979, null));
        org.telegram.ui.Cells.q1 q1Var = new org.telegram.ui.Cells.q1(context, i11);
        q1Var.setDelegate(new Object());
        q1Var.s3(b1Var, null, false, false, false, false);
        LinearLayout f7 = m5.f(context, r11);
        f7.addView(s0Var, b6.o(-1, -2));
        f7.addView(q1Var, b6.o(-1, -2));
        ?? uu0Var = new uu0(context, null);
        this.S1 = uu0Var;
        uu0Var.U(k4.e(null, i11, j10, t6.I.q()));
        uu0Var.addView(f7, b6.d(-1, -1.0f, 119, 4.0f, 8.0f, 4.0f, 8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        vh.d i14 = z20.i(24, context, p6Var, r11);
        i14.i(cd.L0(2131752978, null), false, r11);
        i14.setOnClickListener(new oe0(this, tL_messages_preparedInlineMessage, eVar, i11, j10, qVar));
        frameLayout.addView(i14, b6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ViewGroup viewGroup = this.f21586b;
        int i15 = this.f21615t0;
        viewGroup.addView(frameLayout, b6.f(-2.0f, -1, 87, i15, 0, i15, 0));
        tk0 tk0Var = this.f26666k1;
        int i16 = this.f21615t0;
        tk0Var.setPadding(i16, 0, i16, org.telegram.messenger.i0.L(68.0f) + r11);
        this.f26666k1.r1();
        int i17 = t6.f20872a7;
        v0(t6.w0(i17, this.I0));
        Q(i17);
        this.R1.O(false);
    }

    public static xh.b1 d1(int r4, long r5, org.telegram.tgnet.TLRPC.BotInlineResult r7, org.telegram.tgnet.TLRPC.TL_photo r8, org.telegram.tgnet.TLRPC.TL_document r9, org.telegram.tgnet.TLRPC.WebPage r10) {
        throw new UnsupportedOperationException("Method not decompiled: xh.c1.d1(int, long, org.telegram.tgnet.TLRPC$BotInlineResult, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.tgnet.TLRPC$TL_document, org.telegram.tgnet.TLRPC$WebPage):xh.b1");
    }

    public static void e1(Context context, int i10, long j10, String str, p6 p6Var, org.telegram.ui.web.q qVar, org.telegram.tgnet.e eVar) {
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
        x1Var.r(500L);
        TLRPC.TL_messages_getPreparedInlineMessage tL_messages_getPreparedInlineMessage = new TLRPC.TL_messages_getPreparedInlineMessage();
        tL_messages_getPreparedInlineMessage.bot = vp.r1(i10).n1(j10);
        tL_messages_getPreparedInlineMessage.f19893id = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getPreparedInlineMessage, new b20(i10, x1Var, context, j10, p6Var, qVar, eVar));
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.P1, 0, true, new qh.d(this, 29), this.I0);
        this.R1 = p51Var;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        return cd.L0(2131752981, null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (!this.T1 && !this.U1) {
            this.U1 = true;
            org.telegram.tgnet.e eVar = this.V1;
            if (eVar != null) {
                eVar.a("USER_DECLINED", null);
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int b10;
        super.onCreate(bundle);
        tk0 tk0Var = this.f26666k1;
        if (tk0Var.getAdapter() == null) {
            b10 = 0;
        } else {
            b10 = tk0Var.getAdapter().b();
        }
        tk0Var.v0(Math.max(b10 - 1, 0));
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = t6.w0(t6.f20872a7, this.I0);
            if (w02 != this.W1) {
                this.W1 = w02;
                v0(w02);
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
