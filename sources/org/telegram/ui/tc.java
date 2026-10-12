package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class tc extends org.telegram.ui.Components.lm0 {
    public final hd f40353c;

    public tc(hd hdVar) {
        this.f40353c = hdVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f40353c.R;
    }

    @Override
    public final int j(int i10) {
        hd hdVar = this.f40353c;
        if (i10 == hdVar.S) {
            return 0;
        }
        if (i10 == hdVar.W) {
            return 2;
        }
        if (i10 == hdVar.Z) {
            return 1;
        }
        if (i10 == hdVar.T) {
            return 3;
        }
        if (i10 == hdVar.f36727b0) {
            return 4;
        }
        if (i10 != hdVar.U && i10 != hdVar.f36729c0 && i10 != hdVar.f36733f0 && i10 != hdVar.f36735h0 && i10 != hdVar.f36737j0) {
            if (i10 != hdVar.X && i10 != hdVar.f36731e0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        boolean z10;
        int i15;
        hd hdVar = this.f40353c;
        long j10 = hdVar.f36724a;
        int i16 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                                e9Var.setFixedSize(0);
                                if (i10 == hdVar.f36725a0) {
                                    e9Var.setFixedSize(12);
                                    e9Var.setText("");
                                    return;
                                } else if (i10 == hdVar.V) {
                                    e9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == hdVar.Y) {
                                    e9Var.setText(LocaleController.getString(hdVar.N0()));
                                    return;
                                } else if (i10 == hdVar.f36730d0) {
                                    e9Var.setText(LocaleController.getString(hdVar.K0()));
                                    return;
                                } else if (i10 == hdVar.f36734g0) {
                                    e9Var.setText(LocaleController.getString(hdVar.E0()));
                                    return;
                                } else if (i10 == hdVar.f36736i0) {
                                    e9Var.setText(LocaleController.getString(hdVar.A0()));
                                    return;
                                } else if (i10 == hdVar.f36738k0) {
                                    e9Var.setText(LocaleController.getString(hdVar.L0()));
                                    return;
                                } else if (i10 == 0) {
                                    e9Var.setText("");
                                    e9Var.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        uc ucVar = (uc) view;
                        ucVar.e = false;
                        org.telegram.ui.ActionBar.h5 h5Var = ucVar.f40640a;
                        ucVar.setWillNotDraw(true);
                        if (i10 == hdVar.U) {
                            i15 = ((org.telegram.ui.ActionBar.m2) hdVar).currentAccount;
                            ucVar.a(i15, hdVar.f36732f, true);
                            h5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (hdVar.f36726b < hdVar.getMessagesController().channelBgIconLevelMin) {
                                ucVar.e(hdVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                ucVar.e(0);
                            }
                            ucVar.c(hdVar.f36740n, false, false);
                            return;
                        } else if (i10 == hdVar.f36729c0) {
                            i14 = ((org.telegram.ui.ActionBar.m2) hdVar).currentAccount;
                            ucVar.a(i14, hdVar.f36747s, false);
                            h5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (hdVar.f36731e0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ucVar.e = z10;
                            ucVar.setWillNotDraw(!z10);
                            if (hdVar.f36726b < hdVar.J0()) {
                                ucVar.e(hdVar.J0());
                            } else {
                                ucVar.e(0);
                            }
                            ucVar.c(hdVar.f36752w, false, false);
                            return;
                        } else if (i10 == hdVar.f36733f0) {
                            i13 = ((org.telegram.ui.ActionBar.m2) hdVar).currentAccount;
                            ucVar.a(i13, hdVar.f36747s, false);
                            h5Var.l(LocaleController.getString(hdVar.G0()), false);
                            if (hdVar.f36726b < hdVar.F0()) {
                                ucVar.e(hdVar.F0());
                            } else {
                                ucVar.e(0);
                            }
                            ucVar.c(DialogObject.getEmojiStatusDocumentId(hdVar.f36756y), DialogObject.isEmojiStatusCollectible(hdVar.f36756y), false);
                            return;
                        } else if (i10 == hdVar.f36735h0) {
                            i12 = ((org.telegram.ui.ActionBar.m2) hdVar).currentAccount;
                            ucVar.a(i12, hdVar.f36747s, false);
                            h5Var.l(LocaleController.getString(hdVar.B0()), false);
                            if (hdVar.f36726b < hdVar.H0()) {
                                ucVar.e(hdVar.H0());
                            } else {
                                ucVar.e(0);
                            }
                            TLRPC.ChatFull chatFull = hdVar.getMessagesController().getChatFull(-j10);
                            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                                ucVar.c(hdVar.D0(stickerSet2), false, false);
                                return;
                            } else {
                                ucVar.c(0L, false, false);
                                return;
                            }
                        } else if (i10 == hdVar.f36737j0) {
                            h5Var.l(LocaleController.getString(hdVar.M0()), false);
                            ucVar.e(0);
                            TLRPC.ChatFull chatFull2 = hdVar.getMessagesController().getChatFull(-j10);
                            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                                ucVar.d(hdVar.C0(stickerSet));
                                return;
                            } else {
                                ucVar.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == hdVar.f36731e0) {
                        r8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    r8Var.i(LocaleController.getString(hdVar.P0()), false);
                    if (hdVar.f36726b < hdVar.z0()) {
                        r8Var.h(hdVar.z0());
                        return;
                    } else {
                        r8Var.h(0);
                        return;
                    }
                }
                ((dq0) view).a(hdVar.f36747s, false);
                return;
            }
            ((yc) view).a(hdVar.f36732f, false);
            return;
        }
        ad adVar = (ad) view;
        mp0 mp0Var = adVar.f34181a;
        zc zcVar = adVar.f34182b;
        i11 = ((org.telegram.ui.ActionBar.m2) hdVar).currentAccount;
        mp0Var.b(i11, hdVar.f36747s, false);
        zcVar.b(hdVar.f36747s, false);
        zcVar.d(hdVar.f36752w, false, false);
        zcVar.setForum(hdVar.R0());
        zcVar.e(DialogObject.getEmojiStatusDocumentId(hdVar.f36756y), false, false);
        zcVar.a(hdVar.f36732f);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var4;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var5;
        org.telegram.ui.ActionBar.c6 c6Var6;
        int i13;
        org.telegram.ui.ActionBar.c6 c6Var7;
        fd fdVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.c6 c6Var8;
        int i14;
        hd hdVar = this.f40353c;
        if (i10 == 0) {
            Activity parentActivity = hdVar.getParentActivity();
            b5Var = ((org.telegram.ui.ActionBar.m2) hdVar).parentLayout;
            int I0 = hdVar.I0();
            long j10 = hdVar.f36724a;
            c6Var8 = ((org.telegram.ui.ActionBar.m2) hdVar).resourceProvider;
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(parentActivity, b5Var, I0, j10, c6Var8);
            gaVar.f21250x = true;
            gaVar.setImportantForAccessibility(4);
            gaVar.f21247r = hdVar;
            Drawable drawable = hdVar.H;
            i14 = ((org.telegram.ui.ActionBar.m2) hdVar).currentAccount;
            Drawable f7 = di.a7.f(drawable, i14, hdVar.F, hdVar.J);
            hdVar.H = f7;
            gaVar.setOverrideBackground(f7);
            fdVar = gaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = hdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.m2) hdVar).currentAccount;
            c6Var7 = ((org.telegram.ui.ActionBar.m2) hdVar).resourceProvider;
            fd fdVar2 = new fd(i13, parentActivity2, c6Var7);
            fdVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(hdVar.F);
            if (wallpaperEmoticon == null && hdVar.F == null && hdVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            fdVar2.a(wallpaperEmoticon, false);
            fdVar2.setGalleryWallpaper(hdVar.G);
            fdVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final tc f40057b;

                {
                    this.f40057b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            hd hdVar2 = this.f40057b.f40353c;
                            if (str == null) {
                                hdVar2.F = hdVar2.G;
                            } else if (str.equals("❌")) {
                                hdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                hdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f19368id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                hdVar2.F.settings.emoticon = str;
                            }
                            hdVar2.X0(true);
                            hdVar2.a1(true);
                            return;
                        default:
                            hd hdVar3 = this.f40057b.f40353c;
                            hdVar3.f36747s = ((Integer) obj).intValue();
                            if (hdVar3.f36756y instanceof TLRPC.TL_emojiStatusCollectible) {
                                hdVar3.f36756y = null;
                            }
                            hdVar3.X0(true);
                            hdVar3.b1();
                            hdVar3.Z0(true);
                            return;
                    }
                }
            });
            fdVar = fdVar2;
        } else if (i10 == 5) {
            fdVar = new org.telegram.ui.Cells.r8(hdVar.getParentActivity(), hdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = hdVar.getParentActivity();
            c6Var6 = ((org.telegram.ui.ActionBar.m2) hdVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.e = false;
            frameLayout.d = c6Var6;
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(parentActivity3);
            frameLayout.f40640a = h5Var;
            h5Var.setTextSize(16);
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var6));
            frameLayout.addView(h5Var, w7.a6.a(-2.0f, 23.0f, 0.0f, 48.0f, 0.0f, -1, 23));
            frameLayout.f40642c = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            fdVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = hdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.m2) hdVar).currentAccount;
            c6Var5 = ((org.telegram.ui.ActionBar.m2) hdVar).resourceProvider;
            yc ycVar = new yc(i12, parentActivity4, c6Var5);
            ycVar.f42131b.setOnItemClickListener(new bi.z5(5, this, ycVar));
            fdVar = ycVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = hdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.m2) hdVar).currentAccount;
            c6Var4 = ((org.telegram.ui.ActionBar.m2) hdVar).resourceProvider;
            dq0 dq0Var = new dq0(0, i11, parentActivity5, c6Var4);
            dq0Var.setDivider(false);
            dq0Var.setOnColorClick(new Utilities.Callback(this) {
                public final tc f40057b;

                {
                    this.f40057b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            hd hdVar2 = this.f40057b.f40353c;
                            if (str == null) {
                                hdVar2.F = hdVar2.G;
                            } else if (str.equals("❌")) {
                                hdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                hdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f19368id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                hdVar2.F.settings.emoticon = str;
                            }
                            hdVar2.X0(true);
                            hdVar2.a1(true);
                            return;
                        default:
                            hd hdVar3 = this.f40057b.f40353c;
                            hdVar3.f36747s = ((Integer) obj).intValue();
                            if (hdVar3.f36756y instanceof TLRPC.TL_emojiStatusCollectible) {
                                hdVar3.f36756y = null;
                            }
                            hdVar3.X0(true);
                            hdVar3.b1();
                            hdVar3.Z0(true);
                            return;
                    }
                }
            });
            fdVar = dq0Var;
        } else if (i10 == 1) {
            FrameLayout adVar = new ad(hdVar, hdVar.getParentActivity());
            fdVar = adVar;
            if (hdVar.d) {
                adVar.setTag(-33024);
                fdVar = adVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = hdVar.getParentActivity();
            c6Var3 = ((org.telegram.ui.ActionBar.m2) hdVar).resourceProvider;
            fdVar = new org.telegram.ui.Cells.m4(parentActivity6, c6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = hdVar.getParentActivity();
            c6Var2 = ((org.telegram.ui.ActionBar.m2) hdVar).resourceProvider;
            fdVar = new op0(parentActivity7, c6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = hdVar.getParentActivity();
            c6Var = ((org.telegram.ui.ActionBar.m2) hdVar).resourceProvider;
            org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(parentActivity8, c6Var);
            f10Var.setIsSingleCell(true);
            f10Var.setViewType(35);
            fdVar = f10Var;
        } else {
            fdVar = new org.telegram.ui.Cells.e9(hdVar.getParentActivity());
        }
        return new s4.b1(fdVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        boolean z10 = view instanceof ad;
        hd hdVar = this.f40353c;
        if (z10) {
            zc zcVar = ((ad) view).f34182b;
            TLRPC.EmojiStatus emojiStatus = hdVar.f36756y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                zcVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                zcVar.d(((TLRPC.TL_emojiStatusCollectible) hdVar.f36756y).pattern_document_id, true, false);
            } else {
                zcVar.b(hdVar.f36747s, false);
                zcVar.d(hdVar.f36752w, false, false);
            }
            zcVar.e(DialogObject.getEmojiStatusDocumentId(hdVar.f36756y), DialogObject.isEmojiStatusCollectible(hdVar.f36756y), false);
            zcVar.setForum(hdVar.R0());
            zcVar.a(hdVar.f36732f);
        } else if (view instanceof org.telegram.ui.Cells.ga) {
            ((org.telegram.ui.Cells.ga) view).setOverrideBackground(hdVar.H);
        } else {
            hd.Y0(view);
        }
    }
}
