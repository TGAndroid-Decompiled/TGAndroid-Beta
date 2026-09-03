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
public final class vz0 extends org.telegram.ui.ActionBar.j {
    public final Context f39223a;
    public final ProfileActivity f39224b;

    public vz0(ProfileActivity profileActivity, Context context) {
        this.f39224b = profileActivity;
        this.f39223a = context;
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
        boolean z4;
        int i16;
        int i17;
        TL_bots.BotInfo botInfo;
        int i18;
        String str2;
        Runnable runnable;
        int i19;
        org.telegram.ui.Components.ns0 ns0Var;
        if (this.f39224b.getParentActivity() != null) {
            if (i10 == -1) {
                ProfileActivity profileActivity = this.f39224b;
                zz0 zz0Var = profileActivity.L;
                if (zz0Var != null && (ns0Var = zz0Var.F0) != null && ns0Var.f23140k0) {
                    profileActivity.R4();
                    return;
                } else {
                    profileActivity.finishFragment();
                    return;
                }
            }
            boolean z10 = false;
            int i20 = 0;
            boolean z11 = false;
            if (i10 == 2) {
                this.f39224b.n4(false);
            } else if (i10 == 1) {
                TLRPC.User user = this.f39224b.getMessagesController().getUser(Long.valueOf(this.f39224b.f32011b1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f19306id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f39224b;
                ps psVar = new ps(bundle, profileActivity2.f32155w0);
                psVar.L = new xx0(profileActivity2, user);
                profileActivity2.presentFragment(psVar);
            } else if (i10 == 3) {
                Bundle e = org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true);
                e.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
                e.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
                qy qyVar = new qy(e);
                ProfileActivity profileActivity3 = this.f39224b;
                qyVar.f37649z2 = profileActivity3;
                profileActivity3.presentFragment(qyVar);
            } else if (i10 == 4) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f39224b.f32011b1);
                ProfileActivity profileActivity4 = this.f39224b;
                profileActivity4.presentFragment(new ps(bundle2, profileActivity4.f32155w0));
            } else {
                String str3 = null;
                if (i10 == 5) {
                    TLRPC.User user2 = this.f39224b.getMessagesController().getUser(Long.valueOf(this.f39224b.f32011b1));
                    if (user2 != null && this.f39224b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f39224b.getParentActivity(), 0, this.f39224b.f32155w0);
                        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new vl0(14, this, user2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                        this.f39224b.showDialog(d2Var);
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20116q7, this.f39224b.f32155w0));
                        }
                    }
                } else if (i10 == 7) {
                    this.f39224b.i4(false);
                } else if (i10 == 45) {
                    this.f39224b.i4(true);
                } else if (i10 == 46) {
                    if (!this.f39224b.getUserConfig().isPremium()) {
                        ProfileActivity profileActivity5 = this.f39224b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i19 = ((org.telegram.ui.ActionBar.p2) this.f39224b).currentAccount;
                        new eg.o1(profileActivity5, parentActivity, i19, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f39223a;
                    org.telegram.ui.ActionBar.f6 f6Var = this.f39224b.f32155w0;
                    sz0 sz0Var = new sz0(this, 0);
                    Pattern pattern = org.telegram.ui.Components.z4.f31242a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, null, false, false);
                        runnable = o10.dismissRunnable;
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        ?? imageView = new ImageView(context);
                        linearLayout.addView((View) imageView, k7.b6.t(110, 110, 17, 0, 21, 0, 11));
                        imageView.f(R.raw.raised_hand, 110, 110, null);
                        imageView.setAutoRepeat(false);
                        imageView.d();
                        TextView textView2 = new TextView(context);
                        textView2.setTypeface(AndroidUtilities.bold());
                        textView2.setGravity(17);
                        textView2.setText(LocaleController.getString(R.string.DisableSharingInfoHeader));
                        textView2.setTextSize(1, 20.0f);
                        int i21 = org.telegram.ui.ActionBar.j6.G6;
                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i21, f6Var));
                        linearLayout.addView(textView2, k7.b6.t(-1, -2, 17, 20, 0, 20, 14));
                        gw0 gw0Var = new gw0(context, f6Var);
                        gw0Var.f34520a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
                        gw0Var.f34521b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
                        gw0Var.d.setVisibility(8);
                        gw0Var.f34522c.setImageResource(R.drawable.menu_photo_off_24);
                        gw0Var.f34522c.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i21, f6Var));
                        linearLayout.addView(gw0Var, k7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        gw0 gw0Var2 = new gw0(context, f6Var);
                        gw0Var2.f34520a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
                        gw0Var2.f34521b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
                        gw0Var2.d.setVisibility(8);
                        gw0Var2.f34522c.setImageResource(R.drawable.menu_share_off_24);
                        gw0Var2.f34522c.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i21, f6Var));
                        linearLayout.addView(gw0Var2, k7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        gw0 gw0Var3 = new gw0(context, f6Var);
                        gw0Var3.f34520a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
                        gw0Var3.f34521b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
                        gw0Var3.d.setVisibility(8);
                        gw0Var3.f34522c.setImageResource(R.drawable.menu_download_off_24);
                        gw0Var3.f34522c.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i21, f6Var));
                        linearLayout.addView(gw0Var3, k7.b6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        ph.d dVar = new ph.d(context, f6Var, true);
                        dVar.setOnClickListener(new org.telegram.ui.Components.w2(0, zArr, runnable));
                        dVar.e();
                        dVar.g(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
                        linearLayout.addView(dVar, k7.b6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        o10.customView = linearLayout;
                        o10.show();
                        o10.setOnDismissListener(new np(8, zArr, sz0Var));
                    }
                } else if (i10 == 47) {
                    ProfileActivity profileActivity6 = this.f39224b;
                    profileActivity6.getMessagesController().toggleChatNoForwards(profileActivity6.f32011b1, 0, false, new ry0(false, profileActivity6, 0));
                } else if (i10 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f39224b.getParentActivity());
                    alertDialog$Builder2.f19478a.O = LocaleController.getPluralString("DeleteTopics", 1);
                    i18 = ((org.telegram.ui.ActionBar.p2) this.f39224b).currentAccount;
                    TopicsController topicsController = MessagesController.getInstance(i18).getTopicsController();
                    ProfileActivity profileActivity7 = this.f39224b;
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(profileActivity7.f32019c1, profileActivity7.f32025d1);
                    int i22 = R.string.DeleteSelectedTopic;
                    if (findTopic == null) {
                        str2 = "topic";
                    } else {
                        str2 = findTopic.title;
                    }
                    alertDialog$Builder2.f19478a.Q = LocaleController.formatString("DeleteSelectedTopic", i22, str2);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) {
                        public final vz0 f38625b;

                        {
                            this.f38625b = this;
                        }

                        @Override
                        public final void l(org.telegram.ui.ActionBar.d2 r11, int r12) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tz0.l(org.telegram.ui.ActionBar.d2, int):void");
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new cl0(6));
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19478a;
                    d2Var2.show();
                    TextView textView3 = (TextView) d2Var2.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
                    }
                } else if (i10 == 24) {
                    ProfileActivity profileActivity8 = this.f39224b;
                    q31.K(profileActivity8.a(), profileActivity8);
                } else if (i10 == 12) {
                    ProfileActivity profileActivity9 = this.f39224b;
                    if (profileActivity9.f32094n1) {
                        profileActivity9.presentFragment(ne1.a0(profileActivity9.f32019c1, profileActivity9.f32025d1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f39224b;
                    long j11 = profileActivity10.f32019c1;
                    if (j11 != 0) {
                        bundle3.putLong("chat_id", j11);
                    } else if (profileActivity10.f32102o2) {
                        bundle3.putLong("user_id", profileActivity10.f32011b1);
                    }
                    ro roVar = new ro(bundle3);
                    ProfileActivity profileActivity11 = this.f39224b;
                    TLRPC.ChatFull chatFull = profileActivity11.f32124r2;
                    if (chatFull != null) {
                        roVar.l0(chatFull);
                    } else {
                        roVar.m0(profileActivity11.f32132s2);
                    }
                    this.f39224b.presentFragment(roVar);
                } else if (i10 == 41) {
                    this.f39224b.presentFragment(new UserInfoActivity());
                } else if (i10 == 9) {
                    TLRPC.User user3 = this.f39224b.getMessagesController().getUser(Long.valueOf(this.f39224b.f32011b1));
                    if (user3 != null) {
                        Bundle e6 = org.telegram.messenger.y3.e(2, "onlySelect", "dialogsType", true);
                        e6.putBoolean("resetDelegate", false);
                        e6.putBoolean("closeFragment", false);
                        qy qyVar2 = new qy(e6);
                        qyVar2.f37649z2 = new f7(this, user3, qyVar2, 19);
                        this.f39224b.presentFragment(qyVar2);
                    }
                } else if (i10 == 10) {
                    this.f39224b.s4();
                } else if (i10 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f39224b;
                        if (profileActivity12.A2 != null) {
                            j10 = DialogObject.makeEncryptedDialogId(encryptedChat.f19167id);
                        } else {
                            j10 = profileActivity12.f32011b1;
                            if (j10 == 0) {
                                long j12 = profileActivity12.f32019c1;
                                if (j12 != 0) {
                                    j10 = -j12;
                                } else {
                                    return;
                                }
                            }
                        }
                        this.f39224b.getMediaDataController().installShortcut(j10, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                } else if (i10 != 15 && i10 != 16) {
                    if (i10 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f39224b.f32019c1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        rr rrVar = new rr(bundle4);
                        rrVar.x0(this.f39224b.f32124r2);
                        this.f39224b.presentFragment(rrVar);
                    } else if (i10 == 18) {
                        this.f39224b.v4();
                    } else if (i10 == 19) {
                        this.f39224b.presentFragment(oa1.d0(this.f39224b.getMessagesController().getChat(Long.valueOf(this.f39224b.f32019c1)), false));
                    } else if (i10 == 22) {
                        this.f39224b.y4();
                    } else if (i10 == 38) {
                        this.f39224b.p4();
                    } else if (i10 == 39) {
                        Bundle h = android.support.v4.media.a.h(2, "type");
                        h.putLong("dialog_id", -this.f39224b.f32019c1);
                        org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(h, null);
                        ProfileActivity profileActivity13 = this.f39224b;
                        ea0Var.f24556c = profileActivity13.f32124r2;
                        profileActivity13.presentFragment(ea0Var);
                    } else if (i10 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.f39224b.getParentActivity(), 0, this.f39224b.f32155w0);
                        alertDialog$Builder3.f19478a.O = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
                        alertDialog$Builder3.f19478a.Q = LocaleController.getString(R.string.AreYouSureSecretChat);
                        alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.c2(this) {
                            public final vz0 f38625b;

                            {
                                this.f38625b = this;
                            }

                            @Override
                            public final void l(org.telegram.ui.ActionBar.d2 r11, int r12) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tz0.l(org.telegram.ui.ActionBar.d2, int):void");
                            }
                        });
                        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                        this.f39224b.showDialog(alertDialog$Builder3.f19478a);
                    } else if (i10 == 44) {
                        i17 = ((org.telegram.ui.ActionBar.p2) this.f39224b).currentAccount;
                        long j13 = this.f39224b.f32011b1;
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
                                ze.d.s(ApplicationLoader.applicationContext, str4);
                                return;
                            }
                            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                            if (U != null) {
                                if (!(U instanceof zn) || ((zn) U).a() != j13) {
                                    U.presentFragment(zn.R9(j13));
                                }
                                AndroidUtilities.runOnUIThread(new lh.b8(i17, j13), 150L);
                            }
                        }
                    } else if (i10 == 21) {
                        if (this.f39224b.getParentActivity() != null) {
                            int i23 = Build.VERSION.SDK_INT;
                            if (i23 >= 23 && ((i23 <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.f39224b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                                this.f39224b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            dz0 dz0Var = this.f39224b.f32073k0;
                            ImageLocation D = dz0Var.D(dz0Var.getRealPosition());
                            if (D != null) {
                                if (D.imageType == 2) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                i16 = ((org.telegram.ui.ActionBar.p2) this.f39224b).currentAccount;
                                FileLoader fileLoader = FileLoader.getInstance(i16);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = D.location;
                                if (z4) {
                                    str3 = "mp4";
                                }
                                File pathToAttach = fileLoader.getPathToAttach(tL_fileLocationToBeDeprecated, str3, true);
                                if (z4 && !pathToAttach.exists()) {
                                    pathToAttach = new File(FileLoader.getDirectory(0), FileLoader.getAttachFileName(D.location, "mp4"));
                                }
                                if (pathToAttach.exists()) {
                                    MediaController.saveFile(pathToAttach.toString(), this.f39224b.getParentActivity(), 0, null, null, new lh.m6(2, this, z4));
                                }
                            }
                        }
                    } else if (i10 == 30) {
                        this.f39224b.presentFragment(new UserInfoActivity());
                    } else if (i10 == 40) {
                        ProfileActivity profileActivity14 = this.f39224b;
                        np0 np0Var = new np0();
                        np0Var.E = this.f39224b;
                        profileActivity14.presentFragment(np0Var);
                    } else if (i10 == 42) {
                        TLRPC.User user4 = this.f39224b.getMessagesController().getUser(Long.valueOf(this.f39224b.f32011b1));
                        AndroidUtilities.addToClipboard(this.f39224b.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(user4));
                    } else if (i10 == 43) {
                        this.f39224b.presentFragment(new ra(null));
                    } else if (i10 == 31) {
                        this.f39224b.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                    } else if (i10 == 33) {
                        int realPosition = this.f39224b.f32073k0.getRealPosition();
                        TLRPC.Photo F = this.f39224b.f32073k0.F(realPosition);
                        if (F != null) {
                            dz0 dz0Var2 = this.f39224b.f32073k0;
                            ArrayList arrayList2 = dz0Var2.Y0;
                            ArrayList arrayList3 = dz0Var2.X0;
                            ArrayList arrayList4 = dz0Var2.W0;
                            ArrayList arrayList5 = dz0Var2.V0;
                            ArrayList arrayList6 = dz0Var2.T0;
                            ArrayList arrayList7 = dz0Var2.R0;
                            ArrayList arrayList8 = dz0Var2.U0;
                            ArrayList arrayList9 = dz0Var2.S0;
                            MessagesController.DialogPhotos dialogPhotos = dz0Var2.P0;
                            if (dialogPhotos != null) {
                                dialogPhotos.moveToStart(realPosition);
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                dz0Var2.Z0++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList10 = dz0Var2.Q0;
                                arrayList10.add(0, (String) arrayList10.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (ImageLocation) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (ImageLocation) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (ImageLocation) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (org.telegram.ui.Components.s61) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                dz0Var2.M0 = (ImageLocation) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f19291id = tL_inputPhoto;
                            tL_inputPhoto.f19178id = F.f19183id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            UserConfig userConfig = this.f39224b.getUserConfig();
                            this.f39224b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new yr0(this, userConfig, F, 6));
                            ProfileActivity profileActivity15 = this.f39224b;
                            UndoView undoView = profileActivity15.J;
                            long j14 = profileActivity15.f32011b1;
                            if (F.video_sizes.isEmpty()) {
                                obj = null;
                            } else {
                                obj = 1;
                            }
                            undoView.m(j14, obj, 22);
                            TLRPC.User user5 = this.f39224b.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 800);
                            if (user5 != null) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 90);
                                TLRPC.UserProfilePhoto userProfilePhoto = user5.photo;
                                userProfilePhoto.photo_id = F.f19183id;
                                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                                userConfig.setCurrentUser(user5);
                                userConfig.saveConfig(true);
                                i15 = ((org.telegram.ui.ActionBar.p2) this.f39224b).currentAccount;
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                this.f39224b.i5(true);
                            }
                            dz0 dz0Var3 = this.f39224b.f32073k0;
                            dz0Var3.A0.g();
                            dz0Var3.L();
                        }
                    } else if (i10 == 34) {
                        i11 = ((org.telegram.ui.ActionBar.p2) this.f39224b).currentAccount;
                        if (MessagesController.getInstance(i11).isFrozen()) {
                            i14 = ((org.telegram.ui.ActionBar.p2) this.f39224b).currentAccount;
                            c.b(i14);
                            return;
                        }
                        int realPosition2 = this.f39224b.f32073k0.getRealPosition();
                        ImageLocation D2 = this.f39224b.f32073k0.D(realPosition2);
                        if (D2 != null) {
                            i12 = ((org.telegram.ui.ActionBar.p2) this.f39224b).currentAccount;
                            FileLoader fileLoader2 = FileLoader.getInstance(i12);
                            Drawable[] drawableArr = PhotoViewer.Q8;
                            File pathToAttach2 = fileLoader2.getPathToAttach(D2.location, PhotoViewer.q1(D2), true);
                            if (D2.imageType == 2) {
                                z11 = true;
                            }
                            if (z11) {
                                ImageLocation G = this.f39224b.f32073k0.G(realPosition2);
                                i13 = ((org.telegram.ui.ActionBar.p2) this.f39224b).currentAccount;
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
                            this.f39224b.f32093n0.q(pathToAttach2.getAbsolutePath(), str, z11);
                        }
                    } else if (i10 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.f39224b.getParentActivity(), 0, this.f39224b.f32155w0);
                        dz0 dz0Var4 = this.f39224b.f32073k0;
                        ImageLocation D3 = dz0Var4.D(dz0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.imageType == 2) {
                                alertDialog$Builder4.f19478a.O = LocaleController.getString(R.string.AreYouSureDeleteVideoTitle);
                                alertDialog$Builder4.f19478a.Q = LocaleController.getString(R.string.AreYouSureDeleteVideo);
                            } else {
                                alertDialog$Builder4.f19478a.O = LocaleController.getString(R.string.AreYouSureDeletePhotoTitle);
                                alertDialog$Builder4.f19478a.Q = LocaleController.getString(R.string.AreYouSureDeletePhoto);
                            }
                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) {
                                public final vz0 f38625b;

                                {
                                    this.f38625b = this;
                                }

                                @Override
                                public final void l(org.telegram.ui.ActionBar.d2 r11, int r12) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tz0.l(org.telegram.ui.ActionBar.d2, int):void");
                                }
                            });
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder4.f19478a;
                            this.f39224b.showDialog(d2Var3);
                            TextView textView4 = (TextView) d2Var3.d(-1);
                            if (textView4 != null) {
                                textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20116q7, this.f39224b.f32155w0));
                            }
                        }
                    } else if (i10 == 36) {
                        this.f39224b.u4();
                    }
                } else {
                    ProfileActivity profileActivity16 = this.f39224b;
                    if (i10 == 16) {
                        z10 = true;
                    }
                    profileActivity16.o4(z10);
                }
            }
        }
    }
}
