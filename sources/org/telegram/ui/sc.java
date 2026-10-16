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
public final class sc extends org.telegram.ui.Components.lm0 {
    public final gd f39755c;

    public sc(gd gdVar) {
        this.f39755c = gdVar;
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
        return this.f39755c.R;
    }

    @Override
    public final int j(int i10) {
        gd gdVar = this.f39755c;
        if (i10 == gdVar.S) {
            return 0;
        }
        if (i10 == gdVar.W) {
            return 2;
        }
        if (i10 == gdVar.Z) {
            return 1;
        }
        if (i10 == gdVar.T) {
            return 3;
        }
        if (i10 == gdVar.f36140b0) {
            return 4;
        }
        if (i10 != gdVar.U && i10 != gdVar.f36142c0 && i10 != gdVar.f36146f0 && i10 != gdVar.f36148h0 && i10 != gdVar.f36150j0) {
            if (i10 != gdVar.X && i10 != gdVar.f36144e0) {
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
        gd gdVar = this.f39755c;
        long j10 = gdVar.f36137a;
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
                                if (i10 == gdVar.f36138a0) {
                                    e9Var.setFixedSize(12);
                                    e9Var.setText("");
                                    return;
                                } else if (i10 == gdVar.V) {
                                    e9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == gdVar.Y) {
                                    e9Var.setText(LocaleController.getString(gdVar.N0()));
                                    return;
                                } else if (i10 == gdVar.f36143d0) {
                                    e9Var.setText(LocaleController.getString(gdVar.K0()));
                                    return;
                                } else if (i10 == gdVar.f36147g0) {
                                    e9Var.setText(LocaleController.getString(gdVar.E0()));
                                    return;
                                } else if (i10 == gdVar.f36149i0) {
                                    e9Var.setText(LocaleController.getString(gdVar.A0()));
                                    return;
                                } else if (i10 == gdVar.f36151k0) {
                                    e9Var.setText(LocaleController.getString(gdVar.L0()));
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
                        tc tcVar = (tc) view;
                        tcVar.e = false;
                        org.telegram.ui.ActionBar.h5 h5Var = tcVar.f40068a;
                        tcVar.setWillNotDraw(true);
                        if (i10 == gdVar.U) {
                            i15 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
                            tcVar.a(i15, gdVar.f36145f, true);
                            h5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (gdVar.f36139b < gdVar.getMessagesController().channelBgIconLevelMin) {
                                tcVar.e(gdVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                tcVar.e(0);
                            }
                            tcVar.c(gdVar.f36153n, false, false);
                            return;
                        } else if (i10 == gdVar.f36142c0) {
                            i14 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
                            tcVar.a(i14, gdVar.f36160s, false);
                            h5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (gdVar.f36144e0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            tcVar.e = z10;
                            tcVar.setWillNotDraw(!z10);
                            if (gdVar.f36139b < gdVar.J0()) {
                                tcVar.e(gdVar.J0());
                            } else {
                                tcVar.e(0);
                            }
                            tcVar.c(gdVar.f36165w, false, false);
                            return;
                        } else if (i10 == gdVar.f36146f0) {
                            i13 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
                            tcVar.a(i13, gdVar.f36160s, false);
                            h5Var.l(LocaleController.getString(gdVar.G0()), false);
                            if (gdVar.f36139b < gdVar.F0()) {
                                tcVar.e(gdVar.F0());
                            } else {
                                tcVar.e(0);
                            }
                            tcVar.c(DialogObject.getEmojiStatusDocumentId(gdVar.f36169y), DialogObject.isEmojiStatusCollectible(gdVar.f36169y), false);
                            return;
                        } else if (i10 == gdVar.f36148h0) {
                            i12 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
                            tcVar.a(i12, gdVar.f36160s, false);
                            h5Var.l(LocaleController.getString(gdVar.B0()), false);
                            if (gdVar.f36139b < gdVar.H0()) {
                                tcVar.e(gdVar.H0());
                            } else {
                                tcVar.e(0);
                            }
                            TLRPC.ChatFull chatFull = gdVar.getMessagesController().getChatFull(-j10);
                            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                                tcVar.c(gdVar.D0(stickerSet2), false, false);
                                return;
                            } else {
                                tcVar.c(0L, false, false);
                                return;
                            }
                        } else if (i10 == gdVar.f36150j0) {
                            h5Var.l(LocaleController.getString(gdVar.M0()), false);
                            tcVar.e(0);
                            TLRPC.ChatFull chatFull2 = gdVar.getMessagesController().getChatFull(-j10);
                            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                                tcVar.d(gdVar.C0(stickerSet));
                                return;
                            } else {
                                tcVar.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == gdVar.f36144e0) {
                        r8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    r8Var.i(LocaleController.getString(gdVar.P0()), false);
                    if (gdVar.f36139b < gdVar.z0()) {
                        r8Var.h(gdVar.z0());
                        return;
                    } else {
                        r8Var.h(0);
                        return;
                    }
                }
                ((bq0) view).a(gdVar.f36160s, false);
                return;
            }
            ((xc) view).a(gdVar.f36145f, false);
            return;
        }
        zc zcVar = (zc) view;
        kp0 kp0Var = zcVar.f42273a;
        yc ycVar = zcVar.f42274b;
        i11 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
        kp0Var.b(i11, gdVar.f36160s, false);
        ycVar.b(gdVar.f36160s, false);
        ycVar.d(gdVar.f36165w, false, false);
        ycVar.setForum(gdVar.R0());
        ycVar.e(DialogObject.getEmojiStatusDocumentId(gdVar.f36169y), false, false);
        ycVar.a(gdVar.f36145f);
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
        ed edVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.c6 c6Var8;
        int i14;
        gd gdVar = this.f39755c;
        if (i10 == 0) {
            Activity parentActivity = gdVar.getParentActivity();
            b5Var = ((org.telegram.ui.ActionBar.m2) gdVar).parentLayout;
            int I0 = gdVar.I0();
            long j10 = gdVar.f36137a;
            c6Var8 = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(parentActivity, b5Var, I0, j10, c6Var8);
            gaVar.f20951x = true;
            gaVar.setImportantForAccessibility(4);
            gaVar.f20948r = gdVar;
            Drawable drawable = gdVar.H;
            i14 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
            Drawable f7 = di.a7.f(drawable, i14, gdVar.F, gdVar.J);
            gdVar.H = f7;
            gaVar.setOverrideBackground(f7);
            edVar = gaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = gdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
            c6Var7 = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            ed edVar2 = new ed(i13, parentActivity2, c6Var7);
            edVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(gdVar.F);
            if (wallpaperEmoticon == null && gdVar.F == null && gdVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            edVar2.a(wallpaperEmoticon, false);
            edVar2.setGalleryWallpaper(gdVar.G);
            edVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final sc f39471b;

                {
                    this.f39471b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            gd gdVar2 = this.f39471b.f39755c;
                            if (str == null) {
                                gdVar2.F = gdVar2.G;
                            } else if (str.equals("❌")) {
                                gdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                gdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f19068id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                gdVar2.F.settings.emoticon = str;
                            }
                            gdVar2.X0(true);
                            gdVar2.a1(true);
                            return;
                        default:
                            gd gdVar3 = this.f39471b.f39755c;
                            gdVar3.f36160s = ((Integer) obj).intValue();
                            if (gdVar3.f36169y instanceof TLRPC.TL_emojiStatusCollectible) {
                                gdVar3.f36169y = null;
                            }
                            gdVar3.X0(true);
                            gdVar3.b1();
                            gdVar3.Z0(true);
                            return;
                    }
                }
            });
            edVar = edVar2;
        } else if (i10 == 5) {
            edVar = new org.telegram.ui.Cells.r8(gdVar.getParentActivity(), gdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = gdVar.getParentActivity();
            c6Var6 = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.e = false;
            frameLayout.d = c6Var6;
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(parentActivity3);
            frameLayout.f40068a = h5Var;
            h5Var.setTextSize(16);
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var6));
            frameLayout.addView(h5Var, w7.z5.a(-2.0f, 23.0f, 0.0f, 48.0f, 0.0f, -1, 23));
            frameLayout.f40070c = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            edVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = gdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
            c6Var5 = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            xc xcVar = new xc(i12, parentActivity4, c6Var5);
            xcVar.f41539b.setOnItemClickListener(new bi.z5(5, this, xcVar));
            edVar = xcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = gdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.m2) gdVar).currentAccount;
            c6Var4 = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            bq0 bq0Var = new bq0(0, i11, parentActivity5, c6Var4);
            bq0Var.setDivider(false);
            bq0Var.setOnColorClick(new Utilities.Callback(this) {
                public final sc f39471b;

                {
                    this.f39471b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            gd gdVar2 = this.f39471b.f39755c;
                            if (str == null) {
                                gdVar2.F = gdVar2.G;
                            } else if (str.equals("❌")) {
                                gdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                gdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f19068id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                gdVar2.F.settings.emoticon = str;
                            }
                            gdVar2.X0(true);
                            gdVar2.a1(true);
                            return;
                        default:
                            gd gdVar3 = this.f39471b.f39755c;
                            gdVar3.f36160s = ((Integer) obj).intValue();
                            if (gdVar3.f36169y instanceof TLRPC.TL_emojiStatusCollectible) {
                                gdVar3.f36169y = null;
                            }
                            gdVar3.X0(true);
                            gdVar3.b1();
                            gdVar3.Z0(true);
                            return;
                    }
                }
            });
            edVar = bq0Var;
        } else if (i10 == 1) {
            FrameLayout zcVar = new zc(gdVar, gdVar.getParentActivity());
            edVar = zcVar;
            if (gdVar.d) {
                zcVar.setTag(-33024);
                edVar = zcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = gdVar.getParentActivity();
            c6Var3 = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            edVar = new org.telegram.ui.Cells.m4(parentActivity6, c6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = gdVar.getParentActivity();
            c6Var2 = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            edVar = new mp0(parentActivity7, c6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = gdVar.getParentActivity();
            c6Var = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(parentActivity8, c6Var);
            f10Var.setIsSingleCell(true);
            f10Var.setViewType(35);
            edVar = f10Var;
        } else {
            edVar = new org.telegram.ui.Cells.e9(gdVar.getParentActivity());
        }
        return new s4.b1(edVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        boolean z10 = view instanceof zc;
        gd gdVar = this.f39755c;
        if (z10) {
            yc ycVar = ((zc) view).f42274b;
            TLRPC.EmojiStatus emojiStatus = gdVar.f36169y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                ycVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                ycVar.d(((TLRPC.TL_emojiStatusCollectible) gdVar.f36169y).pattern_document_id, true, false);
            } else {
                ycVar.b(gdVar.f36160s, false);
                ycVar.d(gdVar.f36165w, false, false);
            }
            ycVar.e(DialogObject.getEmojiStatusDocumentId(gdVar.f36169y), DialogObject.isEmojiStatusCollectible(gdVar.f36169y), false);
            ycVar.setForum(gdVar.R0());
            ycVar.a(gdVar.f36145f);
        } else if (view instanceof org.telegram.ui.Cells.ga) {
            ((org.telegram.ui.Cells.ga) view).setOverrideBackground(gdVar.H);
        } else {
            gd.Y0(view);
        }
    }
}
