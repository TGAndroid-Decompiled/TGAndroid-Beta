package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class wc implements Runnable {
    public final int f43933a;
    public final TLRPC.PhotoSize f43934b;
    public final TLRPC.InputFile f43935c;
    public final TLRPC.InputFile d;
    public final TLRPC.VideoSize f43936e;
    public final TLRPC.PhotoSize f43937f;
    public final double h;
    public final String f43938n;
    public final org.telegram.ui.Components.r40 f43939r;

    public wc(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f43933a = i10;
        this.f43939r = (org.telegram.ui.Components.r40) o2Var;
        this.f43935c = inputFile;
        this.d = inputFile2;
        this.f43936e = videoSize;
        this.f43938n = str;
        this.h = d;
        this.f43934b = photoSize;
        this.f43937f = photoSize2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f43933a) {
            case 0:
                hd hdVar = (hd) this.f43939r;
                TLRPC.InputFile inputFile = this.f43935c;
                TLRPC.InputFile inputFile2 = this.d;
                if (inputFile == null && inputFile2 == null) {
                    TLRPC.FileLocation fileLocation = this.f43934b.location;
                    hdVar.f38876x = fileLocation;
                    hdVar.f38877y = this.f43937f.location;
                    hdVar.f38856e.h(ImageLocation.getForLocal(fileLocation), "50_50", hdVar.f38873s, null);
                    hdVar.e0(true, false);
                    return;
                }
                hdVar.f38861h0 = inputFile;
                hdVar.f38862i0 = inputFile2;
                hdVar.f38863j0 = this.f43936e;
                hdVar.f38864k0 = this.f43938n;
                hdVar.f38865l0 = this.h;
                if (hdVar.m0) {
                    org.telegram.ui.ActionBar.c2 c2Var = hdVar.f38870q0;
                    if (c2Var != null) {
                        try {
                            c2Var.dismiss();
                            hdVar.f38870q0 = null;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    hdVar.g0(false);
                    hdVar.f38867n0 = false;
                    hdVar.f38849a.performClick();
                }
                hdVar.e0(false, true);
                hdVar.h.setImageDrawable(null);
                return;
            case 1:
                ko koVar = (ko) this.f43939r;
                TLRPC.PhotoSize photoSize = this.f43934b;
                TLRPC.FileLocation fileLocation2 = photoSize.location;
                koVar.f39961r0 = fileLocation2;
                TLRPC.InputFile inputFile3 = this.f43935c;
                TLRPC.InputFile inputFile4 = this.d;
                TLRPC.VideoSize videoSize = this.f43936e;
                if (inputFile3 == null && inputFile4 == null && videoSize == null) {
                    lh.y3 y3Var = koVar.f39945e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation2);
                    org.telegram.ui.Components.e9 e9Var = koVar.f39960r;
                    Object obj = koVar.f39973z0;
                    if (obj == null) {
                        obj = koVar.f39964t0;
                    }
                    y3Var.h(forLocal, "50_50", e9Var, obj);
                    koVar.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (koVar.N0 == null) {
                        koVar.N0 = new org.telegram.ui.Components.xi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    koVar.X.f24711e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    koVar.X.f24711e.setAnimation(koVar.N0);
                    koVar.n0(true, false);
                    return;
                }
                long j10 = koVar.f39972y0;
                TLRPC.PhotoSize photoSize2 = this.f43937f;
                double d = this.h;
                long j11 = 0;
                if (j10 != 0) {
                    TLRPC.User user = koVar.f39973z0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = koVar.f39973z0.photo;
                        if (inputFile3 != null) {
                            j11 = inputFile3.f22406id;
                        } else if (inputFile4 != null) {
                            j11 = inputFile4.f22406id;
                        }
                        userProfilePhoto.photo_id = j11;
                        userProfilePhoto.photo_big = photoSize2.location;
                        userProfilePhoto.photo_small = photoSize.location;
                        koVar.getMessagesController().putUser(koVar.f39973z0, true);
                    }
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i10 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i10 | 6;
                    }
                    if (videoSize != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.bot = koVar.getMessagesController().getInputUser(koVar.f39973z0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    koVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new co(koVar, 1));
                    z10 = false;
                } else {
                    MessagesController messagesController = koVar.getMessagesController();
                    long j12 = koVar.f39963s0;
                    TLRPC.FileLocation fileLocation3 = photoSize.location;
                    TLRPC.FileLocation fileLocation4 = photoSize2.location;
                    z10 = false;
                    messagesController.changeChatAvatar(j12, null, inputFile3, inputFile4, videoSize, d, this.f43938n, fileLocation3, fileLocation4, null);
                }
                if (koVar.I0) {
                    try {
                        org.telegram.ui.ActionBar.c2 c2Var2 = koVar.f39940b;
                        if (c2Var2 != null && c2Var2.isShowing()) {
                            koVar.f39940b.dismiss();
                            koVar.f39940b = null;
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    koVar.J0 = z10;
                    koVar.f39938a.performClick();
                }
                koVar.n0(z10, true);
                return;
            case 2:
                y40 y40Var = (y40) this.f43939r;
                long j13 = y40Var.f44741e;
                r50 r50Var = y40Var.f44742f;
                AccountInstance accountInstance = r50Var.d;
                TLRPC.InputFile inputFile5 = this.f43935c;
                TLRPC.InputFile inputFile6 = this.d;
                TLRPC.VideoSize videoSize2 = this.f43936e;
                TLRPC.PhotoSize photoSize3 = this.f43934b;
                TLRPC.PhotoSize photoSize4 = this.f43937f;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    y40Var.f44740c = photoSize3.location;
                    TLRPC.FileLocation fileLocation5 = photoSize4.location;
                    y40Var.f44739b = fileLocation5;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation5);
                    y40Var.d = forLocal2;
                    r50Var.f41871b.A(forLocal2, ImageLocation.getForLocal(y40Var.f44740c));
                    AndroidUtilities.updateVisibleRows(r50Var.M);
                    return;
                }
                double d10 = this.h;
                String str = this.f43938n;
                if (j13 > 0) {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile5 != null) {
                        tL_photos_uploadProfilePhoto2.file = inputFile5;
                        tL_photos_uploadProfilePhoto2.flags |= 1;
                    }
                    if (inputFile6 != null) {
                        tL_photos_uploadProfilePhoto2.video = inputFile6;
                        int i11 = tL_photos_uploadProfilePhoto2.flags;
                        tL_photos_uploadProfilePhoto2.video_start_ts = d10;
                        tL_photos_uploadProfilePhoto2.flags = i11 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto2.flags |= 16;
                    }
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new zg(26, y40Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j13, null, inputFile5, inputFile6, videoSize2, d10, str, photoSize3.location, photoSize4.location, new q00(y40Var, 6));
                return;
            case 3:
                t60 t60Var = (t60) this.f43939r;
                TLRPC.InputFile inputFile7 = this.f43935c;
                TLRPC.InputFile inputFile8 = this.d;
                TLRPC.VideoSize videoSize3 = this.f43936e;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    TLRPC.FileLocation fileLocation6 = this.f43934b.location;
                    t60Var.f42567y = fileLocation6;
                    t60Var.A = this.f43937f.location;
                    t60Var.d.h(ImageLocation.getForLocal(fileLocation6), "50_50", t60Var.f42563r, null);
                    t60Var.Z(true, false);
                    return;
                }
                t60Var.B = inputFile7;
                t60Var.C = inputFile8;
                t60Var.D = videoSize3;
                t60Var.E = this.f43938n;
                t60Var.F = this.h;
                if (t60Var.H) {
                    t60Var.getMessagesController().createChat(t60Var.f42559c.getText().toString(), t60Var.G, null, t60Var.L, t60Var.O, t60Var.Q, t60Var.P, t60Var.S, t60Var);
                }
                t60Var.Z(false, true);
                t60Var.f42561f.setImageDrawable(null);
                return;
            case 4:
                ProfileActivity.d0((ProfileActivity) this.f43939r, this.f43935c, this.d, this.f43936e, this.h, this.f43938n, this.f43934b, this.f43937f);
                return;
            case 5:
                b81.d0((b81) this.f43939r, this.f43935c, this.d, this.f43936e, this.h, this.f43938n, this.f43934b, this.f43937f);
                return;
            default:
                qh.n nVar = (qh.n) this.f43939r;
                nVar.getClass();
                TLRPC.PhotoSize photoSize5 = this.f43934b;
                TLRPC.FileLocation fileLocation7 = photoSize5.location;
                nVar.B = fileLocation7;
                TLRPC.InputFile inputFile9 = this.f43935c;
                TLRPC.InputFile inputFile10 = this.d;
                TLRPC.VideoSize videoSize4 = this.f43936e;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    nVar.v.h(ImageLocation.getForLocal(fileLocation7), "50_50", nVar.f46746y, nVar.D);
                    nVar.a0(true, false);
                    z11 = true;
                } else {
                    z11 = true;
                    nVar.getMessagesController().changeChatAvatar(nVar.f46737b, null, inputFile9, inputFile10, videoSize4, this.h, this.f43938n, photoSize5.location, this.f43937f.location, null);
                    nVar.a0(false, true);
                }
                nVar.d.U2.N(z11);
                return;
        }
    }

    public wc(ko koVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f43933a = 1;
        this.f43939r = koVar;
        this.f43934b = photoSize;
        this.f43935c = inputFile;
        this.d = inputFile2;
        this.f43936e = videoSize;
        this.f43937f = photoSize2;
        this.h = d;
        this.f43938n = str;
    }

    public wc(org.telegram.ui.Components.r40 r40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f43933a = i10;
        this.f43939r = r40Var;
        this.f43935c = inputFile;
        this.d = inputFile2;
        this.f43936e = videoSize;
        this.h = d;
        this.f43938n = str;
        this.f43934b = photoSize;
        this.f43937f = photoSize2;
    }

    public wc(qh.n nVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f43933a = 6;
        this.f43939r = nVar;
        this.f43934b = photoSize;
        this.f43935c = inputFile;
        this.d = inputFile2;
        this.f43936e = videoSize;
        this.h = d;
        this.f43938n = str;
        this.f43937f = photoSize2;
    }
}
