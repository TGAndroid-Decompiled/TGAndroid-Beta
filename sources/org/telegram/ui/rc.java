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
public final class rc extends org.telegram.ui.Components.vm0 {
    public final fd f41602c;

    public rc(fd fdVar) {
        this.f41602c = fdVar;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47893f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f41602c.R;
    }

    @Override
    public final int j(int i10) {
        fd fdVar = this.f41602c;
        if (i10 == fdVar.S) {
            return 0;
        }
        if (i10 == fdVar.W) {
            return 2;
        }
        if (i10 == fdVar.Z) {
            return 1;
        }
        if (i10 == fdVar.T) {
            return 3;
        }
        if (i10 == fdVar.f37723b0) {
            return 4;
        }
        if (i10 != fdVar.U && i10 != fdVar.f37725c0 && i10 != fdVar.f37730f0 && i10 != fdVar.f37732h0 && i10 != fdVar.f37734j0) {
            if (i10 != fdVar.X && i10 != fdVar.f37728e0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        boolean z10;
        int i15;
        fd fdVar = this.f41602c;
        long j3 = fdVar.f37720a;
        int i16 = d1Var.f47893f;
        View view = d1Var.f47889a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                                e9Var.setFixedSize(0);
                                if (i10 == fdVar.f37721a0) {
                                    e9Var.setFixedSize(12);
                                    e9Var.setText("");
                                    return;
                                } else if (i10 == fdVar.V) {
                                    e9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == fdVar.Y) {
                                    e9Var.setText(LocaleController.getString(fdVar.N0()));
                                    return;
                                } else if (i10 == fdVar.f37726d0) {
                                    e9Var.setText(LocaleController.getString(fdVar.K0()));
                                    return;
                                } else if (i10 == fdVar.f37731g0) {
                                    e9Var.setText(LocaleController.getString(fdVar.E0()));
                                    return;
                                } else if (i10 == fdVar.f37733i0) {
                                    e9Var.setText(LocaleController.getString(fdVar.A0()));
                                    return;
                                } else if (i10 == fdVar.f37735k0) {
                                    e9Var.setText(LocaleController.getString(fdVar.L0()));
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
                        sc scVar = (sc) view;
                        scVar.f41892e = false;
                        org.telegram.ui.ActionBar.h5 h5Var = scVar.f41889a;
                        scVar.setWillNotDraw(true);
                        if (i10 == fdVar.U) {
                            i15 = ((org.telegram.ui.ActionBar.m2) fdVar).currentAccount;
                            scVar.a(i15, fdVar.f37729f, true);
                            h5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (fdVar.f37722b < fdVar.getMessagesController().channelBgIconLevelMin) {
                                scVar.e(fdVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                scVar.e(0);
                            }
                            scVar.c(fdVar.f37737n, false, false);
                            return;
                        } else if (i10 == fdVar.f37725c0) {
                            i14 = ((org.telegram.ui.ActionBar.m2) fdVar).currentAccount;
                            scVar.a(i14, fdVar.f37744s, false);
                            h5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (fdVar.f37728e0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            scVar.f41892e = z10;
                            scVar.setWillNotDraw(!z10);
                            if (fdVar.f37722b < fdVar.J0()) {
                                scVar.e(fdVar.J0());
                            } else {
                                scVar.e(0);
                            }
                            scVar.c(fdVar.f37749w, false, false);
                            return;
                        } else if (i10 == fdVar.f37730f0) {
                            i13 = ((org.telegram.ui.ActionBar.m2) fdVar).currentAccount;
                            scVar.a(i13, fdVar.f37744s, false);
                            h5Var.l(LocaleController.getString(fdVar.G0()), false);
                            if (fdVar.f37722b < fdVar.F0()) {
                                scVar.e(fdVar.F0());
                            } else {
                                scVar.e(0);
                            }
                            scVar.c(DialogObject.getEmojiStatusDocumentId(fdVar.f37753y), DialogObject.isEmojiStatusCollectible(fdVar.f37753y), false);
                            return;
                        } else if (i10 == fdVar.f37732h0) {
                            i12 = ((org.telegram.ui.ActionBar.m2) fdVar).currentAccount;
                            scVar.a(i12, fdVar.f37744s, false);
                            h5Var.l(LocaleController.getString(fdVar.B0()), false);
                            if (fdVar.f37722b < fdVar.H0()) {
                                scVar.e(fdVar.H0());
                            } else {
                                scVar.e(0);
                            }
                            TLRPC.ChatFull chatFull = fdVar.getMessagesController().getChatFull(-j3);
                            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                                scVar.c(fdVar.D0(stickerSet2), false, false);
                                return;
                            } else {
                                scVar.c(0L, false, false);
                                return;
                            }
                        } else if (i10 == fdVar.f37734j0) {
                            h5Var.l(LocaleController.getString(fdVar.M0()), false);
                            scVar.e(0);
                            TLRPC.ChatFull chatFull2 = fdVar.getMessagesController().getChatFull(-j3);
                            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                                scVar.d(fdVar.C0(stickerSet));
                                return;
                            } else {
                                scVar.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == fdVar.f37728e0) {
                        r8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    r8Var.i(LocaleController.getString(fdVar.P0()), false);
                    if (fdVar.f37722b < fdVar.z0()) {
                        r8Var.h(fdVar.z0());
                        return;
                    } else {
                        r8Var.h(0);
                        return;
                    }
                }
                ((zp0) view).a(fdVar.f37744s, false);
                return;
            }
            ((wc) view).a(fdVar.f37729f, false);
            return;
        }
        yc ycVar = (yc) view;
        ip0 ip0Var = ycVar.f44444a;
        xc xcVar = ycVar.f44445b;
        i11 = ((org.telegram.ui.ActionBar.m2) fdVar).currentAccount;
        ip0Var.b(i11, fdVar.f37744s, false);
        xcVar.b(fdVar.f37744s, false);
        xcVar.d(fdVar.f37749w, false, false);
        xcVar.setForum(fdVar.R0());
        xcVar.e(DialogObject.getEmojiStatusDocumentId(fdVar.f37753y), false, false);
        xcVar.a(fdVar.f37729f);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
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
        dd ddVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.c6 c6Var8;
        int i14;
        fd fdVar = this.f41602c;
        if (i10 == 0) {
            Activity parentActivity = fdVar.getParentActivity();
            b5Var = ((org.telegram.ui.ActionBar.m2) fdVar).parentLayout;
            int I0 = fdVar.I0();
            long j3 = fdVar.f37720a;
            c6Var8 = ((org.telegram.ui.ActionBar.m2) fdVar).resourceProvider;
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(parentActivity, b5Var, I0, j3, c6Var8);
            gaVar.f21939x = true;
            gaVar.setImportantForAccessibility(4);
            gaVar.f21936r = fdVar;
            Drawable drawable = fdVar.H;
            i14 = ((org.telegram.ui.ActionBar.m2) fdVar).currentAccount;
            Drawable f7 = ci.b7.f(drawable, i14, fdVar.F, fdVar.J);
            fdVar.H = f7;
            gaVar.setOverrideBackground(f7);
            ddVar = gaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = fdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.m2) fdVar).currentAccount;
            c6Var7 = ((org.telegram.ui.ActionBar.m2) fdVar).resourceProvider;
            dd ddVar2 = new dd(i13, parentActivity2, c6Var7);
            ddVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(fdVar.F);
            if (wallpaperEmoticon == null && fdVar.F == null && fdVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            ddVar2.a(wallpaperEmoticon, false);
            ddVar2.setGalleryWallpaper(fdVar.G);
            ddVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final rc f41264b;

                {
                    this.f41264b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            fd fdVar2 = this.f41264b.f41602c;
                            if (str == null) {
                                fdVar2.F = fdVar2.G;
                            } else if (str.equals("❌")) {
                                fdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                fdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f19954id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                fdVar2.F.settings.emoticon = str;
                            }
                            fdVar2.X0(true);
                            fdVar2.a1(true);
                            return;
                        default:
                            fd fdVar3 = this.f41264b.f41602c;
                            fdVar3.f37744s = ((Integer) obj).intValue();
                            if (fdVar3.f37753y instanceof TLRPC.TL_emojiStatusCollectible) {
                                fdVar3.f37753y = null;
                            }
                            fdVar3.X0(true);
                            fdVar3.b1();
                            fdVar3.Z0(true);
                            return;
                    }
                }
            });
            ddVar = ddVar2;
        } else if (i10 == 5) {
            ddVar = new org.telegram.ui.Cells.r8(fdVar.getParentActivity(), fdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = fdVar.getParentActivity();
            c6Var6 = ((org.telegram.ui.ActionBar.m2) fdVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.f41892e = false;
            frameLayout.d = c6Var6;
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(parentActivity3);
            frameLayout.f41889a = h5Var;
            h5Var.setTextSize(16);
            h5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var6));
            frameLayout.addView(h5Var, w7.w5.a(-2.0f, 23.0f, 0.0f, 48.0f, 0.0f, -1, 23));
            frameLayout.f41891c = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            ddVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = fdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.m2) fdVar).currentAccount;
            c6Var5 = ((org.telegram.ui.ActionBar.m2) fdVar).resourceProvider;
            wc wcVar = new wc(i12, parentActivity4, c6Var5);
            wcVar.f43131b.setOnItemClickListener(new ai.o6(5, this, wcVar));
            ddVar = wcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = fdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.m2) fdVar).currentAccount;
            c6Var4 = ((org.telegram.ui.ActionBar.m2) fdVar).resourceProvider;
            zp0 zp0Var = new zp0(0, i11, parentActivity5, c6Var4);
            zp0Var.setDivider(false);
            zp0Var.setOnColorClick(new Utilities.Callback(this) {
                public final rc f41264b;

                {
                    this.f41264b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            fd fdVar2 = this.f41264b.f41602c;
                            if (str == null) {
                                fdVar2.F = fdVar2.G;
                            } else if (str.equals("❌")) {
                                fdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                fdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f19954id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                fdVar2.F.settings.emoticon = str;
                            }
                            fdVar2.X0(true);
                            fdVar2.a1(true);
                            return;
                        default:
                            fd fdVar3 = this.f41264b.f41602c;
                            fdVar3.f37744s = ((Integer) obj).intValue();
                            if (fdVar3.f37753y instanceof TLRPC.TL_emojiStatusCollectible) {
                                fdVar3.f37753y = null;
                            }
                            fdVar3.X0(true);
                            fdVar3.b1();
                            fdVar3.Z0(true);
                            return;
                    }
                }
            });
            ddVar = zp0Var;
        } else if (i10 == 1) {
            FrameLayout ycVar = new yc(fdVar, fdVar.getParentActivity());
            ddVar = ycVar;
            if (fdVar.d) {
                ycVar.setTag(-33024);
                ddVar = ycVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = fdVar.getParentActivity();
            c6Var3 = ((org.telegram.ui.ActionBar.m2) fdVar).resourceProvider;
            ddVar = new org.telegram.ui.Cells.m4(parentActivity6, c6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = fdVar.getParentActivity();
            c6Var2 = ((org.telegram.ui.ActionBar.m2) fdVar).resourceProvider;
            ddVar = new kp0(parentActivity7, c6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = fdVar.getParentActivity();
            c6Var = ((org.telegram.ui.ActionBar.m2) fdVar).resourceProvider;
            org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(parentActivity8, c6Var);
            m10Var.setIsSingleCell(true);
            m10Var.setViewType(35);
            ddVar = m10Var;
        } else {
            ddVar = new org.telegram.ui.Cells.e9(fdVar.getParentActivity());
        }
        return new s4.d1(ddVar);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        View view = d1Var.f47889a;
        boolean z10 = view instanceof yc;
        fd fdVar = this.f41602c;
        if (z10) {
            xc xcVar = ((yc) view).f44445b;
            TLRPC.EmojiStatus emojiStatus = fdVar.f37753y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                xcVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                xcVar.d(((TLRPC.TL_emojiStatusCollectible) fdVar.f37753y).pattern_document_id, true, false);
            } else {
                xcVar.b(fdVar.f37744s, false);
                xcVar.d(fdVar.f37749w, false, false);
            }
            xcVar.e(DialogObject.getEmojiStatusDocumentId(fdVar.f37753y), DialogObject.isEmojiStatusCollectible(fdVar.f37753y), false);
            xcVar.setForum(fdVar.R0());
            xcVar.a(fdVar.f37729f);
        } else if (view instanceof org.telegram.ui.Cells.ga) {
            ((org.telegram.ui.Cells.ga) view).setOverrideBackground(fdVar.H);
        } else {
            fd.Y0(view);
        }
    }
}
