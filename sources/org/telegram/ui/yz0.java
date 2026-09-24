package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class yz0 extends org.telegram.ui.ActionBar.j {
    public final Context f40278a;
    public final ProfileActivity f40279b;

    public yz0(ProfileActivity profileActivity, Context context) {
        this.f40279b = profileActivity;
        this.f40278a = context;
    }

    @Override
    public final void b(int i10) {
        TLRPC.EncryptedChat encryptedChat;
        long j3;
        int i11;
        int i12;
        String str;
        int i13;
        TLObject tLObject;
        int i14;
        Object obj;
        int i15;
        boolean z10;
        int i16;
        int i17;
        TL_bots.BotInfo botInfo;
        int i18;
        String str2;
        Runnable runnable;
        int i19;
        org.telegram.ui.Components.zs0 zs0Var;
        if (this.f40279b.getParentActivity() != null) {
            if (i10 == -1) {
                ProfileActivity profileActivity = this.f40279b;
                c01 c01Var = profileActivity.O;
                if (c01Var != null && (zs0Var = c01Var.I0) != null && zs0Var.f22391n0) {
                    profileActivity.R4();
                    return;
                } else {
                    profileActivity.finishFragment();
                    return;
                }
            }
            boolean z11 = false;
            int i20 = 0;
            boolean z12 = false;
            if (i10 == 2) {
                this.f40279b.n4(false);
            } else if (i10 == 1) {
                TLRPC.User user = this.f40279b.getMessagesController().getUser(Long.valueOf(this.f40279b.f31541e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f18468id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f40279b;
                ms msVar = new ms(bundle, profileActivity2.f31684z0);
                msVar.O = new cy0(profileActivity2, user);
                profileActivity2.presentFragment(msVar);
            } else if (i10 == 3) {
                Bundle e = org.telegram.messenger.ok.e(3, "onlySelect", "dialogsType", true);
                e.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
                e.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
                qy qyVar = new qy(e);
                ProfileActivity profileActivity3 = this.f40279b;
                qyVar.C2 = profileActivity3;
                profileActivity3.presentFragment(qyVar);
            } else if (i10 == 4) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f40279b.f31541e1);
                ProfileActivity profileActivity4 = this.f40279b;
                profileActivity4.presentFragment(new ms(bundle2, profileActivity4.f31684z0));
            } else {
                String str3 = null;
                if (i10 == 5) {
                    TLRPC.User user2 = this.f40279b.getMessagesController().getUser(Long.valueOf(this.f40279b.f31541e1));
                    if (user2 != null && this.f40279b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f40279b.getParentActivity(), 0, this.f40279b.f31684z0);
                        alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.f18647a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ds0(7, this, user2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18647a;
                        this.f40279b.showDialog(a2Var);
                        TextView textView = (TextView) a2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19284q7, this.f40279b.f31684z0));
                        }
                    }
                } else if (i10 == 7) {
                    this.f40279b.i4(false);
                } else if (i10 == 45) {
                    this.f40279b.i4(true);
                } else if (i10 == 46) {
                    if (!this.f40279b.getUserConfig().isPremium()) {
                        ProfileActivity profileActivity5 = this.f40279b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i19 = ((org.telegram.ui.ActionBar.m2) this.f40279b).currentAccount;
                        new rg.x0(profileActivity5, parentActivity, i19, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f40278a;
                    org.telegram.ui.ActionBar.d6 d6Var = this.f40279b.f31684z0;
                    vz0 vz0Var = new vz0(this, 0);
                    Pattern pattern = org.telegram.ui.Components.e5.f23809a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.e3 j10 = org.telegram.messenger.ok.j(1, context, null, false);
                        runnable = j10.dismissRunnable;
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        ?? imageView = new ImageView(context);
                        linearLayout.addView((View) imageView, w7.y5.t(110, 110, 17, 0, 21, 0, 11));
                        imageView.f(R.raw.raised_hand, 110, 110, null);
                        imageView.setAutoRepeat(false);
                        imageView.d();
                        TextView textView2 = new TextView(context);
                        textView2.setTypeface(AndroidUtilities.bold());
                        textView2.setGravity(17);
                        textView2.setText(LocaleController.getString(R.string.DisableSharingInfoHeader));
                        textView2.setTextSize(1, 20.0f);
                        int i21 = org.telegram.ui.ActionBar.h6.G6;
                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i21, d6Var));
                        linearLayout.addView(textView2, w7.y5.t(-1, -2, 17, 20, 0, 20, 14));
                        lw0 lw0Var = new lw0(context, d6Var);
                        lw0Var.f35409a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
                        lw0Var.f35410b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
                        lw0Var.d.setVisibility(8);
                        lw0Var.f35411c.setImageResource(R.drawable.menu_photo_off_24);
                        lw0Var.f35411c.setColorFilter(org.telegram.ui.ActionBar.h6.v0(i21, d6Var));
                        linearLayout.addView(lw0Var, w7.y5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        lw0 lw0Var2 = new lw0(context, d6Var);
                        lw0Var2.f35409a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
                        lw0Var2.f35410b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
                        lw0Var2.d.setVisibility(8);
                        lw0Var2.f35411c.setImageResource(R.drawable.menu_share_off_24);
                        lw0Var2.f35411c.setColorFilter(org.telegram.ui.ActionBar.h6.v0(i21, d6Var));
                        linearLayout.addView(lw0Var2, w7.y5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        lw0 lw0Var3 = new lw0(context, d6Var);
                        lw0Var3.f35409a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
                        lw0Var3.f35410b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
                        lw0Var3.d.setVisibility(8);
                        lw0Var3.f35411c.setImageResource(R.drawable.menu_download_off_24);
                        lw0Var3.f35411c.setColorFilter(org.telegram.ui.ActionBar.h6.v0(i21, d6Var));
                        linearLayout.addView(lw0Var3, w7.y5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        ci.d dVar = new ci.d(context, d6Var, true);
                        dVar.setOnClickListener(new pf(15, zArr, runnable));
                        dVar.e();
                        dVar.g(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
                        linearLayout.addView(dVar, w7.y5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        j10.customView = linearLayout;
                        j10.show();
                        j10.setOnDismissListener(new dh(27, zArr, vz0Var));
                    }
                } else if (i10 == 47) {
                    ProfileActivity profileActivity6 = this.f40279b;
                    profileActivity6.getMessagesController().toggleChatNoForwards(profileActivity6.f31541e1, 0, false, new ci.za(false, profileActivity6, 2));
                } else if (i10 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f40279b.getParentActivity());
                    alertDialog$Builder2.f18647a.R = LocaleController.getPluralString("DeleteTopics", 1);
                    i18 = ((org.telegram.ui.ActionBar.m2) this.f40279b).currentAccount;
                    TopicsController topicsController = MessagesController.getInstance(i18).getTopicsController();
                    ProfileActivity profileActivity7 = this.f40279b;
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(profileActivity7.f31549f1, profileActivity7.f31556g1);
                    int i22 = R.string.DeleteSelectedTopic;
                    if (findTopic == null) {
                        str2 = "topic";
                    } else {
                        str2 = findTopic.title;
                    }
                    alertDialog$Builder2.f18647a.T = LocaleController.formatString("DeleteSelectedTopic", i22, str2);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                        public final yz0 f39765b;

                        {
                            this.f39765b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.a2 r11, int r12) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wz0.f(org.telegram.ui.ActionBar.a2, int):void");
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.e1(20));
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f18647a;
                    a2Var2.show();
                    TextView textView3 = (TextView) a2Var2.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19284q7, false));
                    }
                } else if (i10 == 24) {
                    ProfileActivity profileActivity8 = this.f40279b;
                    t31.L(profileActivity8.a(), profileActivity8);
                } else if (i10 == 12) {
                    ProfileActivity profileActivity9 = this.f40279b;
                    if (profileActivity9.f31622q1) {
                        profileActivity9.presentFragment(se1.a0(profileActivity9.f31549f1, profileActivity9.f31556g1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f40279b;
                    long j11 = profileActivity10.f31549f1;
                    if (j11 != 0) {
                        bundle3.putLong("chat_id", j11);
                    } else if (profileActivity10.f31630r2) {
                        bundle3.putLong("user_id", profileActivity10.f31541e1);
                    }
                    ro roVar = new ro(bundle3);
                    ProfileActivity profileActivity11 = this.f40279b;
                    TLRPC.ChatFull chatFull = profileActivity11.f31652u2;
                    if (chatFull != null) {
                        roVar.l0(chatFull);
                    } else {
                        roVar.m0(profileActivity11.f31659v2);
                    }
                    this.f40279b.presentFragment(roVar);
                } else if (i10 == 41) {
                    this.f40279b.presentFragment(new UserInfoActivity());
                } else if (i10 == 9) {
                    TLRPC.User user3 = this.f40279b.getMessagesController().getUser(Long.valueOf(this.f40279b.f31541e1));
                    if (user3 != null) {
                        Bundle e7 = org.telegram.messenger.ok.e(2, "onlySelect", "dialogsType", true);
                        e7.putBoolean("resetDelegate", false);
                        e7.putBoolean("closeFragment", false);
                        qy qyVar2 = new qy(e7);
                        qyVar2.C2 = new b7(this, user3, qyVar2, 19);
                        this.f40279b.presentFragment(qyVar2);
                    }
                } else if (i10 == 10) {
                    this.f40279b.s4();
                } else if (i10 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f40279b;
                        if (profileActivity12.D2 != null) {
                            j3 = DialogObject.makeEncryptedDialogId(encryptedChat.f18329id);
                        } else {
                            j3 = profileActivity12.f31541e1;
                            if (j3 == 0) {
                                long j12 = profileActivity12.f31549f1;
                                if (j12 != 0) {
                                    j3 = -j12;
                                } else {
                                    return;
                                }
                            }
                        }
                        this.f40279b.getMediaDataController().installShortcut(j3, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                } else if (i10 != 15 && i10 != 16) {
                    if (i10 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f40279b.f31549f1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        pr prVar = new pr(bundle4);
                        prVar.x0(this.f40279b.f31652u2);
                        this.f40279b.presentFragment(prVar);
                    } else if (i10 == 18) {
                        this.f40279b.v4();
                    } else if (i10 == 19) {
                        this.f40279b.presentFragment(sa1.d0(this.f40279b.getMessagesController().getChat(Long.valueOf(this.f40279b.f31549f1)), false));
                    } else if (i10 == 22) {
                        this.f40279b.y4();
                    } else if (i10 == 38) {
                        this.f40279b.p4();
                    } else if (i10 == 39) {
                        Bundle g10 = org.telegram.ui.Cells.c1.g(2, "type");
                        g10.putLong("dialog_id", -this.f40279b.f31549f1);
                        org.telegram.ui.Components.na0 na0Var = new org.telegram.ui.Components.na0(g10, null);
                        ProfileActivity profileActivity13 = this.f40279b;
                        na0Var.f26702c = profileActivity13.f31652u2;
                        profileActivity13.presentFragment(na0Var);
                    } else if (i10 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.f40279b.getParentActivity(), 0, this.f40279b.f31684z0);
                        alertDialog$Builder3.f18647a.R = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
                        alertDialog$Builder3.f18647a.T = LocaleController.getString(R.string.AreYouSureSecretChat);
                        alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.z1(this) {
                            public final yz0 f39765b;

                            {
                                this.f39765b = this;
                            }

                            @Override
                            public final void f(org.telegram.ui.ActionBar.a2 r11, int r12) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wz0.f(org.telegram.ui.ActionBar.a2, int):void");
                            }
                        });
                        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                        this.f40279b.showDialog(alertDialog$Builder3.f18647a);
                    } else if (i10 == 44) {
                        i17 = ((org.telegram.ui.ActionBar.m2) this.f40279b).currentAccount;
                        long j13 = this.f40279b.f31541e1;
                        TLRPC.UserFull userFull = MessagesController.getInstance(i17).getUserFull(j13);
                        if (userFull != null && (botInfo = userFull.bot_info) != null) {
                            String str4 = botInfo.privacy_policy_url;
                            if (str4 == null && str4 == null) {
                                ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                                int size = arrayList.size();
                                while (true) {
                                    if (i20 < size) {
                                        TLRPC.BotCommand botCommand = arrayList.get(i20);
                                        i20++;
                                        if ("privacy".equals(botCommand.command)) {
                                            break;
                                        }
                                    } else {
                                        str4 = LocaleController.getString(R.string.BotDefaultPrivacyPolicy);
                                        break;
                                    }
                                }
                            }
                            if (str4 != null) {
                                nf.f.s(ApplicationLoader.applicationContext, str4);
                                return;
                            }
                            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                            if (U != null) {
                                if (!(U instanceof wn) || ((wn) U).a() != j13) {
                                    U.presentFragment(wn.R9(j13));
                                }
                                AndroidUtilities.runOnUIThread(new ei.b2(i17, j13), 150L);
                            }
                        }
                    } else if (i10 == 21) {
                        if (this.f40279b.getParentActivity() != null) {
                            int i23 = Build.VERSION.SDK_INT;
                            if (i23 >= 23 && ((i23 <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.f40279b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                                this.f40279b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            gz0 gz0Var = this.f40279b.f31601n0;
                            ImageLocation D = gz0Var.D(gz0Var.getRealPosition());
                            if (D != null) {
                                if (D.imageType == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i16 = ((org.telegram.ui.ActionBar.m2) this.f40279b).currentAccount;
                                FileLoader fileLoader = FileLoader.getInstance(i16);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = D.location;
                                if (z10) {
                                    str3 = "mp4";
                                }
                                File pathToAttach = fileLoader.getPathToAttach(tL_fileLocationToBeDeprecated, str3, true);
                                if (z10 && !pathToAttach.exists()) {
                                    pathToAttach = new File(FileLoader.getDirectory(0), FileLoader.getAttachFileName(D.location, "mp4"));
                                }
                                if (pathToAttach.exists()) {
                                    MediaController.saveFile(pathToAttach.toString(), this.f40279b.getParentActivity(), 0, null, null, new ai.i3(6, this, z10));
                                }
                            }
                        }
                    } else if (i10 == 30) {
                        this.f40279b.presentFragment(new UserInfoActivity());
                    } else if (i10 == 40) {
                        ProfileActivity profileActivity14 = this.f40279b;
                        tp0 tp0Var = new tp0();
                        tp0Var.H = this.f40279b;
                        profileActivity14.presentFragment(tp0Var);
                    } else if (i10 == 42) {
                        TLRPC.User user4 = this.f40279b.getMessagesController().getUser(Long.valueOf(this.f40279b.f31541e1));
                        AndroidUtilities.addToClipboard(this.f40279b.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(user4));
                    } else if (i10 == 43) {
                        this.f40279b.presentFragment(new qa(null));
                    } else if (i10 == 31) {
                        this.f40279b.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                    } else if (i10 == 33) {
                        int realPosition = this.f40279b.f31601n0.getRealPosition();
                        TLRPC.Photo F = this.f40279b.f31601n0.F(realPosition);
                        if (F != null) {
                            gz0 gz0Var2 = this.f40279b.f31601n0;
                            ArrayList arrayList2 = gz0Var2.f30875b1;
                            ArrayList arrayList3 = gz0Var2.f30874a1;
                            ArrayList arrayList4 = gz0Var2.Z0;
                            ArrayList arrayList5 = gz0Var2.Y0;
                            ArrayList arrayList6 = gz0Var2.W0;
                            ArrayList arrayList7 = gz0Var2.U0;
                            ArrayList arrayList8 = gz0Var2.X0;
                            ArrayList arrayList9 = gz0Var2.V0;
                            MessagesController.DialogPhotos dialogPhotos = gz0Var2.S0;
                            if (dialogPhotos != null) {
                                dialogPhotos.moveToStart(realPosition);
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                gz0Var2.f30876c1++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList10 = gz0Var2.T0;
                                arrayList10.add(0, (String) arrayList10.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (ImageLocation) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (ImageLocation) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (ImageLocation) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (org.telegram.ui.Components.d71) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                gz0Var2.P0 = (ImageLocation) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f18453id = tL_inputPhoto;
                            tL_inputPhoto.f18340id = F.f18345id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            UserConfig userConfig = this.f40279b.getUserConfig();
                            this.f40279b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new fs0(this, userConfig, F, 6));
                            ProfileActivity profileActivity15 = this.f40279b;
                            UndoView undoView = profileActivity15.M;
                            long j14 = profileActivity15.f31541e1;
                            if (F.video_sizes.isEmpty()) {
                                obj = null;
                            } else {
                                obj = 1;
                            }
                            undoView.m(j14, obj, 22);
                            TLRPC.User user5 = this.f40279b.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 800);
                            if (user5 != null) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 90);
                                TLRPC.UserProfilePhoto userProfilePhoto = user5.photo;
                                userProfilePhoto.photo_id = F.f18345id;
                                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                                userConfig.setCurrentUser(user5);
                                userConfig.saveConfig(true);
                                i15 = ((org.telegram.ui.ActionBar.m2) this.f40279b).currentAccount;
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                this.f40279b.i5(true);
                            }
                            gz0 gz0Var3 = this.f40279b.f31601n0;
                            gz0Var3.D0.g();
                            gz0Var3.L();
                        }
                    } else if (i10 == 34) {
                        i11 = ((org.telegram.ui.ActionBar.m2) this.f40279b).currentAccount;
                        if (MessagesController.getInstance(i11).isFrozen()) {
                            i14 = ((org.telegram.ui.ActionBar.m2) this.f40279b).currentAccount;
                            b.b(i14);
                            return;
                        }
                        int realPosition2 = this.f40279b.f31601n0.getRealPosition();
                        ImageLocation D2 = this.f40279b.f31601n0.D(realPosition2);
                        if (D2 != null) {
                            i12 = ((org.telegram.ui.ActionBar.m2) this.f40279b).currentAccount;
                            FileLoader fileLoader2 = FileLoader.getInstance(i12);
                            Drawable[] drawableArr = PhotoViewer.U8;
                            File pathToAttach2 = fileLoader2.getPathToAttach(D2.location, PhotoViewer.q1(D2), true);
                            if (D2.imageType == 2) {
                                z12 = true;
                            }
                            if (z12) {
                                ImageLocation G = this.f40279b.f31601n0.G(realPosition2);
                                i13 = ((org.telegram.ui.ActionBar.m2) this.f40279b).currentAccount;
                                FileLoader fileLoader3 = FileLoader.getInstance(i13);
                                if (G == null) {
                                    tLObject = null;
                                } else {
                                    tLObject = G.location;
                                }
                                str = fileLoader3.getPathToAttach(tLObject, PhotoViewer.q1(G), true).getAbsolutePath();
                            } else {
                                str = null;
                            }
                            this.f40279b.f31621q0.q(pathToAttach2.getAbsolutePath(), str, z12);
                        }
                    } else if (i10 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.f40279b.getParentActivity(), 0, this.f40279b.f31684z0);
                        gz0 gz0Var4 = this.f40279b.f31601n0;
                        ImageLocation D3 = gz0Var4.D(gz0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.imageType == 2) {
                                alertDialog$Builder4.f18647a.R = LocaleController.getString(R.string.AreYouSureDeleteVideoTitle);
                                alertDialog$Builder4.f18647a.T = LocaleController.getString(R.string.AreYouSureDeleteVideo);
                            } else {
                                alertDialog$Builder4.f18647a.R = LocaleController.getString(R.string.AreYouSureDeletePhotoTitle);
                                alertDialog$Builder4.f18647a.T = LocaleController.getString(R.string.AreYouSureDeletePhoto);
                            }
                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                                public final yz0 f39765b;

                                {
                                    this.f39765b = this;
                                }

                                @Override
                                public final void f(org.telegram.ui.ActionBar.a2 r11, int r12) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wz0.f(org.telegram.ui.ActionBar.a2, int):void");
                                }
                            });
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder4.f18647a;
                            this.f40279b.showDialog(a2Var3);
                            TextView textView4 = (TextView) a2Var3.d(-1);
                            if (textView4 != null) {
                                textView4.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19284q7, this.f40279b.f31684z0));
                            }
                        }
                    } else if (i10 == 36) {
                        this.f40279b.u4();
                    }
                } else {
                    ProfileActivity profileActivity16 = this.f40279b;
                    if (i10 == 16) {
                        z11 = true;
                    }
                    profileActivity16.o4(z11);
                }
            }
        }
    }
}
