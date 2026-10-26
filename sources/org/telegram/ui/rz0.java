package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
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
public final class rz0 extends org.telegram.ui.ActionBar.j {
    public final Context f43314a;
    public final ProfileActivity f43315b;

    public rz0(ProfileActivity profileActivity, Context context) {
        this.f43315b = profileActivity;
        this.f43314a = context;
    }

    @Override
    public final void b(int i10) {
        TLRPC.EncryptedChat encryptedChat;
        long j10;
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
        org.telegram.ui.Components.ut0 ut0Var;
        if (this.f43315b.getParentActivity() != null) {
            if (i10 == -1) {
                ProfileActivity profileActivity = this.f43315b;
                vz0 vz0Var = profileActivity.N;
                if (vz0Var != null && (ut0Var = vz0Var.K0) != null && ut0Var.f26301n0) {
                    profileActivity.c5();
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
                this.f43315b.u4(false);
            } else if (i10 == 1) {
                TLRPC.User user = this.f43315b.getMessagesController().getUser(Long.valueOf(this.f43315b.f35979e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f22176id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f43315b;
                js jsVar = new js(bundle, profileActivity2.f36126z0);
                jsVar.O = new xx0(profileActivity2, user);
                profileActivity2.presentFragment(jsVar);
            } else if (i10 == 3) {
                Bundle c10 = org.telegram.messenger.vh.c(3, "onlySelect", "dialogsType", true);
                c10.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
                c10.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
                cy cyVar = new cy(c10);
                ProfileActivity profileActivity3 = this.f43315b;
                cyVar.C2 = profileActivity3;
                profileActivity3.presentFragment(cyVar);
            } else if (i10 == 4) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f43315b.f35979e1);
                ProfileActivity profileActivity4 = this.f43315b;
                profileActivity4.presentFragment(new js(bundle2, profileActivity4.f36126z0));
            } else {
                String str3 = null;
                if (i10 == 5) {
                    TLRPC.User user2 = this.f43315b.getMessagesController().getUser(Long.valueOf(this.f43315b.f35979e1));
                    if (user2 != null && this.f43315b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f43315b.getParentActivity(), 0, this.f43315b.f36126z0);
                        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new af0(17, this, user2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                        this.f43315b.showDialog(e2Var);
                        TextView textView = (TextView) e2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, this.f43315b.f36126z0);
                        }
                    }
                } else if (i10 == 7) {
                    this.f43315b.p4(false);
                } else if (i10 == 45) {
                    this.f43315b.p4(true);
                } else if (i10 == 46) {
                    if (!this.f43315b.getUserConfig().isPremium()) {
                        ProfileActivity profileActivity5 = this.f43315b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i19 = ((org.telegram.ui.ActionBar.r2) this.f43315b).currentAccount;
                        new tg.y0(profileActivity5, parentActivity, i19, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f43314a;
                    org.telegram.ui.ActionBar.u6 u6Var = this.f43315b.f36126z0;
                    my0 my0Var = new my0(this, 3);
                    Pattern pattern = org.telegram.ui.Components.g5.f28420a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.k3 i21 = org.telegram.messenger.vh.i(1, context, null, false);
                        runnable = i21.dismissRunnable;
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        ?? imageView = new ImageView(context);
                        linearLayout.addView((View) imageView, org.telegram.ui.Components.gb1.x(110, 110, 17, 0, 21, 0, 11));
                        imageView.f(R.raw.raised_hand, 110, 110, null);
                        imageView.setAutoRepeat(false);
                        imageView.d();
                        TextView textView2 = new TextView(context);
                        textView2.setTypeface(AndroidUtilities.bold());
                        textView2.setGravity(17);
                        d3.o(R.string.DisableSharingInfoHeader, textView2, 1, 20.0f);
                        int i22 = org.telegram.ui.ActionBar.y6.G6;
                        org.telegram.ui.ActionBar.f7.V(textView2, i22, u6Var);
                        linearLayout.addView(textView2, org.telegram.ui.Components.gb1.x(-1, -2, 17, 20, 0, 20, 14));
                        gw0 gw0Var = new gw0(context, u6Var);
                        gw0Var.f39791a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
                        gw0Var.f39792b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
                        gw0Var.d.setVisibility(8);
                        gw0Var.f39793c.setImageResource(R.drawable.menu_photo_off_24);
                        ImageView imageView2 = gw0Var.f39793c;
                        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                        org.telegram.ui.ActionBar.f7.t(imageView2, i22, u6Var, mode);
                        linearLayout.addView(gw0Var, org.telegram.ui.Components.gb1.o(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        gw0 gw0Var2 = new gw0(context, u6Var);
                        gw0Var2.f39791a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
                        gw0Var2.f39792b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
                        gw0Var2.d.setVisibility(8);
                        gw0Var2.f39793c.setImageResource(R.drawable.menu_share_off_24);
                        org.telegram.ui.ActionBar.f7.t(gw0Var2.f39793c, i22, u6Var, mode);
                        linearLayout.addView(gw0Var2, org.telegram.ui.Components.gb1.o(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        gw0 gw0Var3 = new gw0(context, u6Var);
                        gw0Var3.f39791a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
                        gw0Var3.f39792b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
                        gw0Var3.d.setVisibility(8);
                        gw0Var3.f39793c.setImageResource(R.drawable.menu_download_off_24);
                        org.telegram.ui.ActionBar.f7.t(gw0Var3.f39793c, i22, u6Var, mode);
                        linearLayout.addView(gw0Var3, org.telegram.ui.Components.gb1.o(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        fi.d dVar = new fi.d(context, u6Var, true);
                        dVar.setOnClickListener(new org.telegram.ui.ActionBar.u1(25, zArr, runnable));
                        dVar.f();
                        dVar.i(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
                        linearLayout.addView(dVar, org.telegram.ui.Components.gb1.o(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        i21.customView = linearLayout;
                        i21.show();
                        i21.setOnDismissListener(new ip(5, zArr, my0Var));
                    }
                } else if (i10 == 47) {
                    ProfileActivity profileActivity6 = this.f43315b;
                    profileActivity6.getMessagesController().toggleChatNoForwards(profileActivity6.f35979e1, 0, false, new fi.ga(2, profileActivity6, false));
                } else if (i10 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f43315b.getParentActivity());
                    alertDialog$Builder2.f22368a.R = LocaleController.getPluralString("DeleteTopics", 1);
                    i18 = ((org.telegram.ui.ActionBar.r2) this.f43315b).currentAccount;
                    TopicsController topicsController = MessagesController.getInstance(i18).getTopicsController();
                    ProfileActivity profileActivity7 = this.f43315b;
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(profileActivity7.f35987f1, profileActivity7.f35994g1);
                    int i23 = R.string.DeleteSelectedTopic;
                    if (findTopic == null) {
                        str2 = "topic";
                    } else {
                        str2 = findTopic.title;
                    }
                    alertDialog$Builder2.f22368a.T = LocaleController.formatString("DeleteSelectedTopic", i23, str2);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                        public final rz0 f42685b;

                        {
                            this.f42685b = this;
                        }

                        @Override
                        public final void h(org.telegram.ui.ActionBar.e2 r11, int r12) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pz0.h(org.telegram.ui.ActionBar.e2, int):void");
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.c1(20));
                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                    e2Var2.show();
                    TextView textView3 = (TextView) e2Var2.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.f23598q7, null);
                    }
                } else if (i10 == 24) {
                    ProfileActivity profileActivity8 = this.f43315b;
                    v21.O(profileActivity8.a(), profileActivity8);
                } else if (i10 == 12) {
                    ProfileActivity profileActivity9 = this.f43315b;
                    if (profileActivity9.f36062q1) {
                        profileActivity9.presentFragment(wd1.b0(profileActivity9.f35987f1, profileActivity9.f35994g1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f43315b;
                    long j11 = profileActivity10.f35987f1;
                    if (j11 != 0) {
                        bundle3.putLong("chat_id", j11);
                    } else if (profileActivity10.f36070r2) {
                        bundle3.putLong("user_id", profileActivity10.f35979e1);
                    }
                    mo moVar = new mo(bundle3);
                    ProfileActivity profileActivity11 = this.f43315b;
                    TLRPC.ChatFull chatFull = profileActivity11.f36091u2;
                    if (chatFull != null) {
                        moVar.m0(chatFull);
                    } else {
                        moVar.n0(profileActivity11.f36098v2);
                    }
                    this.f43315b.presentFragment(moVar);
                } else if (i10 == 41) {
                    this.f43315b.presentFragment(new UserInfoActivity());
                } else if (i10 == 9) {
                    TLRPC.User user3 = this.f43315b.getMessagesController().getUser(Long.valueOf(this.f43315b.f35979e1));
                    if (user3 != null) {
                        Bundle c11 = org.telegram.messenger.vh.c(2, "onlySelect", "dialogsType", true);
                        c11.putBoolean("resetDelegate", false);
                        c11.putBoolean("closeFragment", false);
                        cy cyVar2 = new cy(c11);
                        cyVar2.C2 = new e7(this, user3, cyVar2, 19);
                        this.f43315b.presentFragment(cyVar2);
                    }
                } else if (i10 == 10) {
                    this.f43315b.z4();
                } else if (i10 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f43315b;
                        if (profileActivity12.D2 != null) {
                            j10 = DialogObject.makeEncryptedDialogId(encryptedChat.f22035id);
                        } else {
                            j10 = profileActivity12.f35979e1;
                            if (j10 == 0) {
                                long j12 = profileActivity12.f35987f1;
                                if (j12 != 0) {
                                    j10 = -j12;
                                } else {
                                    return;
                                }
                            }
                        }
                        this.f43315b.getMediaDataController().installShortcut(j10, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (i10 != 15 && i10 != 16) {
                    if (i10 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f43315b.f35987f1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        kr krVar = new kr(bundle4);
                        krVar.y0(this.f43315b.f36091u2);
                        this.f43315b.presentFragment(krVar);
                    } else if (i10 == 18) {
                        this.f43315b.C4();
                    } else if (i10 == 19) {
                        this.f43315b.presentFragment(w91.c0(this.f43315b.getMessagesController().getChat(Long.valueOf(this.f43315b.f35987f1)), false));
                    } else if (i10 == 22) {
                        this.f43315b.G4();
                    } else if (i10 == 38) {
                        this.f43315b.w4();
                    } else if (i10 == 48) {
                        ProfileActivity profileActivity13 = this.f43315b;
                        org.telegram.ui.Wallet.i9 i9Var = new org.telegram.ui.Wallet.i9(profileActivity13.getMessagesController().getUser(Long.valueOf(this.f43315b.f35979e1)));
                        i9Var.f36697f0 = true;
                        profileActivity13.presentFragment(i9Var);
                    } else if (i10 == 39) {
                        Bundle g7 = org.telegram.ui.Components.b10.g(2, "type");
                        g7.putLong("dialog_id", -this.f43315b.f35987f1);
                        org.telegram.ui.Components.ta0 ta0Var = new org.telegram.ui.Components.ta0(g7, null);
                        ProfileActivity profileActivity14 = this.f43315b;
                        ta0Var.f32952c = profileActivity14.f36091u2;
                        profileActivity14.presentFragment(ta0Var);
                    } else if (i10 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.f43315b.getParentActivity(), 0, this.f43315b.f36126z0);
                        alertDialog$Builder3.f22368a.R = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
                        alertDialog$Builder3.f22368a.T = LocaleController.getString(R.string.AreYouSureSecretChat);
                        alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.b2(this) {
                            public final rz0 f42685b;

                            {
                                this.f42685b = this;
                            }

                            @Override
                            public final void h(org.telegram.ui.ActionBar.e2 r11, int r12) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pz0.h(org.telegram.ui.ActionBar.e2, int):void");
                            }
                        });
                        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                        this.f43315b.showDialog(alertDialog$Builder3.f22368a);
                    } else if (i10 == 44) {
                        i17 = ((org.telegram.ui.ActionBar.r2) this.f43315b).currentAccount;
                        long j13 = this.f43315b.f35979e1;
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
                                qf.d.r(ApplicationLoader.applicationContext, str4);
                                return;
                            }
                            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                            if (U != null) {
                                if (!(U instanceof un) || ((un) U).a() != j13) {
                                    U.presentFragment(un.ba(j13));
                                }
                                AndroidUtilities.runOnUIThread(new bi.qa(i17, j13, 1), 150L);
                            }
                        }
                    } else if (i10 == 21) {
                        if (this.f43315b.getParentActivity() != null) {
                            if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.f43315b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                this.f43315b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            zy0 zy0Var = this.f43315b.f36040n0;
                            ImageLocation D = zy0Var.D(zy0Var.getRealPosition());
                            if (D != null) {
                                if (D.imageType == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i16 = ((org.telegram.ui.ActionBar.r2) this.f43315b).currentAccount;
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
                                    MediaController.saveFile(pathToAttach.toString(), this.f43315b.getParentActivity(), 0, null, null, new bi.t8(8, this, z10));
                                }
                            }
                        }
                    } else if (i10 == 30) {
                        this.f43315b.presentFragment(new UserInfoActivity());
                    } else if (i10 == 40) {
                        ProfileActivity profileActivity15 = this.f43315b;
                        rp0 rp0Var = new rp0();
                        rp0Var.H = this.f43315b;
                        profileActivity15.presentFragment(rp0Var);
                    } else if (i10 == 42) {
                        TLRPC.User user4 = this.f43315b.getMessagesController().getUser(Long.valueOf(this.f43315b.f35979e1));
                        AndroidUtilities.addToClipboard(this.f43315b.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(user4));
                    } else if (i10 == 43) {
                        this.f43315b.presentFragment(new ta(null));
                    } else if (i10 == 31) {
                        this.f43315b.presentFragment(new org.telegram.ui.ActionBar.r2(null));
                    } else if (i10 == 33) {
                        int realPosition = this.f43315b.f36040n0.getRealPosition();
                        TLRPC.Photo F = this.f43315b.f36040n0.F(realPosition);
                        if (F != null) {
                            zy0 zy0Var2 = this.f43315b.f36040n0;
                            ArrayList arrayList2 = zy0Var2.f30987b1;
                            ArrayList arrayList3 = zy0Var2.f30986a1;
                            ArrayList arrayList4 = zy0Var2.Z0;
                            ArrayList arrayList5 = zy0Var2.Y0;
                            ArrayList arrayList6 = zy0Var2.W0;
                            ArrayList arrayList7 = zy0Var2.U0;
                            ArrayList arrayList8 = zy0Var2.X0;
                            ArrayList arrayList9 = zy0Var2.V0;
                            MessagesController.DialogPhotos dialogPhotos = zy0Var2.S0;
                            if (dialogPhotos != null) {
                                dialogPhotos.moveToStart(realPosition);
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                zy0Var2.f30988c1++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList10 = zy0Var2.T0;
                                arrayList10.add(0, (String) arrayList10.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (ImageLocation) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (ImageLocation) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (ImageLocation) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (org.telegram.ui.Components.d81) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                zy0Var2.P0 = (ImageLocation) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f22161id = tL_inputPhoto;
                            tL_inputPhoto.f22046id = F.f22051id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            UserConfig userConfig = this.f43315b.getUserConfig();
                            this.f43315b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new as0(this, userConfig, F, 6));
                            ProfileActivity profileActivity16 = this.f43315b;
                            UndoView undoView = profileActivity16.L;
                            long j14 = profileActivity16.f35979e1;
                            if (F.video_sizes.isEmpty()) {
                                obj = null;
                            } else {
                                obj = 1;
                            }
                            undoView.m(j14, obj, 22);
                            TLRPC.User user5 = this.f43315b.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 800);
                            if (user5 != null) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 90);
                                TLRPC.UserProfilePhoto userProfilePhoto = user5.photo;
                                userProfilePhoto.photo_id = F.f22051id;
                                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                                userConfig.setCurrentUser(user5);
                                userConfig.saveConfig(true);
                                i15 = ((org.telegram.ui.ActionBar.r2) this.f43315b).currentAccount;
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                this.f43315b.u5(true);
                            }
                            zy0 zy0Var3 = this.f43315b.f36040n0;
                            zy0Var3.D0.g();
                            zy0Var3.L();
                        }
                    } else if (i10 == 34) {
                        i11 = ((org.telegram.ui.ActionBar.r2) this.f43315b).currentAccount;
                        if (MessagesController.getInstance(i11).isFrozen()) {
                            i14 = ((org.telegram.ui.ActionBar.r2) this.f43315b).currentAccount;
                            b.b(i14);
                            return;
                        }
                        int realPosition2 = this.f43315b.f36040n0.getRealPosition();
                        ImageLocation D2 = this.f43315b.f36040n0.D(realPosition2);
                        if (D2 != null) {
                            i12 = ((org.telegram.ui.ActionBar.r2) this.f43315b).currentAccount;
                            FileLoader fileLoader2 = FileLoader.getInstance(i12);
                            Drawable[] drawableArr = PhotoViewer.U8;
                            File pathToAttach2 = fileLoader2.getPathToAttach(D2.location, PhotoViewer.r1(D2), true);
                            if (D2.imageType == 2) {
                                z12 = true;
                            }
                            if (z12) {
                                ImageLocation G = this.f43315b.f36040n0.G(realPosition2);
                                i13 = ((org.telegram.ui.ActionBar.r2) this.f43315b).currentAccount;
                                FileLoader fileLoader3 = FileLoader.getInstance(i13);
                                if (G == null) {
                                    tLObject = null;
                                } else {
                                    tLObject = G.location;
                                }
                                str = fileLoader3.getPathToAttach(tLObject, PhotoViewer.r1(G), true).getAbsolutePath();
                            } else {
                                str = null;
                            }
                            this.f43315b.f36061q0.p(pathToAttach2.getAbsolutePath(), str, z12);
                        }
                    } else if (i10 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.f43315b.getParentActivity(), 0, this.f43315b.f36126z0);
                        zy0 zy0Var4 = this.f43315b.f36040n0;
                        ImageLocation D3 = zy0Var4.D(zy0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.imageType == 2) {
                                alertDialog$Builder4.f22368a.R = LocaleController.getString(R.string.AreYouSureDeleteVideoTitle);
                                alertDialog$Builder4.f22368a.T = LocaleController.getString(R.string.AreYouSureDeleteVideo);
                            } else {
                                alertDialog$Builder4.f22368a.R = LocaleController.getString(R.string.AreYouSureDeletePhotoTitle);
                                alertDialog$Builder4.f22368a.T = LocaleController.getString(R.string.AreYouSureDeletePhoto);
                            }
                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                                public final rz0 f42685b;

                                {
                                    this.f42685b = this;
                                }

                                @Override
                                public final void h(org.telegram.ui.ActionBar.e2 r11, int r12) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pz0.h(org.telegram.ui.ActionBar.e2, int):void");
                                }
                            });
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder4.f22368a;
                            this.f43315b.showDialog(e2Var3);
                            TextView textView4 = (TextView) e2Var3.d(-1);
                            if (textView4 != null) {
                                org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.f23598q7, this.f43315b.f36126z0);
                            }
                        }
                    } else if (i10 == 36) {
                        this.f43315b.B4();
                    }
                } else {
                    ProfileActivity profileActivity17 = this.f43315b;
                    if (i10 == 16) {
                        z11 = true;
                    }
                    profileActivity17.v4(z11);
                }
            }
        }
    }
}
