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
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class tv0 extends org.telegram.ui.ActionBar.j {
    public final Context f50245a;
    public final ProfileActivity f50246b;

    public tv0(ProfileActivity profileActivity, Context context) {
        this.f50246b = profileActivity;
        this.f50245a = context;
    }

    @Override
    public final void b(int i7) {
        TLRPC.EncryptedChat encryptedChat;
        long j3;
        int i10;
        int i11;
        int i12;
        int i13;
        Integer num;
        int i14;
        boolean z9;
        int i15;
        int i16;
        TL_bots.BotInfo botInfo;
        int i17;
        String str;
        int i18;
        org.telegram.ui.Components.vq0 vq0Var;
        if (this.f50246b.getParentActivity() != null) {
            if (i7 == -1) {
                ProfileActivity profileActivity = this.f50246b;
                xv0 xv0Var = profileActivity.N;
                if (xv0Var != null && (vq0Var = xv0Var.K0) != null && vq0Var.f31544n0) {
                    profileActivity.o5();
                    return;
                } else {
                    profileActivity.finishFragment();
                    return;
                }
            }
            boolean z10 = false;
            int i19 = 0;
            boolean z11 = false;
            if (i7 == 2) {
                this.f50246b.E4(false);
            } else if (i7 == 1) {
                TLRPC.User a22 = this.f50246b.getMessagesController().a2(Long.valueOf(this.f50246b.f41723d1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", a22.f27105id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f50246b;
                pr prVar = new pr(bundle, profileActivity2.f41876z0);
                prVar.O = new zt0(profileActivity2, a22);
                profileActivity2.presentFragment(prVar);
            } else {
                String str2 = null;
                String str3 = null;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
                if (i7 == 3) {
                    Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
                    h.putString("selectAlertString", org.telegram.messenger.id.M0(2131745630, null));
                    h.putString("selectAlertStringGroup", org.telegram.messenger.id.M0(2131745631, null));
                    yw ywVar = new yw(h);
                    ProfileActivity profileActivity3 = this.f50246b;
                    ywVar.D2 = profileActivity3;
                    profileActivity3.presentFragment(ywVar);
                } else if (i7 == 4) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", this.f50246b.f41723d1);
                    ProfileActivity profileActivity4 = this.f50246b;
                    profileActivity4.presentFragment(new pr(bundle2, profileActivity4.f41876z0));
                } else if (i7 == 5) {
                    TLRPC.User a23 = this.f50246b.getMessagesController().a2(Long.valueOf(this.f50246b.f41723d1));
                    if (a23 != null && this.f50246b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f50246b.getParentActivity(), this.f50246b.f41876z0);
                        alertDialog$Builder.f27296a.R = org.telegram.messenger.id.M0(2131751552, null);
                        alertDialog$Builder.f27296a.T = org.telegram.messenger.id.M0(2131754103, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new nk0(11, this, a23));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        this.f50246b.showDialog(u1Var);
                        TextView textView = (TextView) u1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, this.f50246b.f41876z0);
                        }
                    }
                } else if (i7 == 7) {
                    this.f50246b.z4(false);
                } else if (i7 == 45) {
                    this.f50246b.z4(true);
                } else if (i7 == 46) {
                    if (!this.f50246b.getUserConfig().q()) {
                        ProfileActivity profileActivity5 = this.f50246b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i18 = ((org.telegram.ui.ActionBar.f2) this.f50246b).currentAccount;
                        new ug.w0(profileActivity5, parentActivity, i18, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f50245a;
                    org.telegram.ui.ActionBar.g6 g6Var = this.f50246b.f41876z0;
                    tu0 tu0Var = new tu0(this, 2);
                    Pattern pattern = org.telegram.ui.Components.v4.f38913a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, null, false);
                        org.telegram.ui.ActionBar.g2 g2Var = l10.f28660x0;
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        ?? imageView = new ImageView(context);
                        linearLayout.addView((View) imageView, c8.ha.t(110, 110, 17, 0, 21, 0, 11));
                        imageView.f(2131624173, 110, 110, null);
                        imageView.setAutoRepeat(false);
                        imageView.d();
                        TextView textView2 = new TextView(context);
                        textView2.setTypeface(org.telegram.messenger.g0.o());
                        textView2.setGravity(17);
                        textView2.setText(org.telegram.messenger.id.M0(2131751422, null));
                        textView2.setTextSize(1, 20.0f);
                        int i20 = org.telegram.ui.ActionBar.l6.G6;
                        org.telegram.ui.ActionBar.s6.U(textView2, i20, g6Var);
                        linearLayout.addView(textView2, c8.ha.t(-1, -2, 17, 20, 0, 20, 14));
                        ks0 ks0Var = new ks0(context, g6Var);
                        ks0Var.f47358a.l(org.telegram.messenger.id.M0(2131751421, null), false);
                        ks0Var.f47359b.setText(org.telegram.messenger.id.M0(2131751418, null));
                        ks0Var.d.setVisibility(8);
                        ks0Var.f47360c.setImageResource(2131231847);
                        ImageView imageView2 = ks0Var.f47360c;
                        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                        org.telegram.ui.ActionBar.s6.s(imageView2, i20, g6Var, mode);
                        linearLayout.addView(ks0Var, c8.ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        ks0 ks0Var2 = new ks0(context, g6Var);
                        ks0Var2.f47358a.l(org.telegram.messenger.id.M0(2131751420, null), false);
                        ks0Var2.f47359b.setText(org.telegram.messenger.id.M0(2131751417, null));
                        ks0Var2.d.setVisibility(8);
                        ks0Var2.f47360c.setImageResource(2131231879);
                        org.telegram.ui.ActionBar.s6.s(ks0Var2.f47360c, i20, g6Var, mode);
                        linearLayout.addView(ks0Var2, c8.ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        ks0 ks0Var3 = new ks0(context, g6Var);
                        ks0Var3.f47358a.l(org.telegram.messenger.id.M0(2131751419, null), false);
                        ks0Var3.f47359b.setText(org.telegram.messenger.id.M0(2131751416, null));
                        ks0Var3.d.setVisibility(8);
                        ks0Var3.f47360c.setImageResource(2131231788);
                        org.telegram.ui.ActionBar.s6.s(ks0Var3.f47360c, i20, g6Var, mode);
                        linearLayout.addView(ks0Var3, c8.ha.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        fi.d dVar = new fi.d(context, g6Var, true);
                        dVar.setOnClickListener(new org.telegram.ui.ActionBar.l1(24, zArr, g2Var));
                        dVar.f();
                        dVar.i(org.telegram.messenger.id.M0(2131751423, null), false, true);
                        linearLayout.addView(dVar, c8.ha.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        l10.N = linearLayout;
                        l10.show();
                        l10.n(new org.telegram.ui.Components.f(2, zArr, tu0Var));
                    }
                } else if (i7 == 47) {
                    ProfileActivity profileActivity6 = this.f50246b;
                    profileActivity6.getMessagesController().d5(profileActivity6.f41723d1, 0, false, new fi.l9(2, profileActivity6, false));
                } else if (i7 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f50246b.getParentActivity());
                    alertDialog$Builder2.f27296a.R = org.telegram.messenger.id.K0(1, "DeleteTopics");
                    i17 = ((org.telegram.ui.ActionBar.f2) this.f50246b).currentAccount;
                    org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(i17).f24877q7;
                    ProfileActivity profileActivity7 = this.f50246b;
                    TLRPC.TL_forumTopic f10 = k00Var.f(profileActivity7.f41730e1, profileActivity7.f41738f1);
                    if (f10 == null) {
                        str = "topic";
                    } else {
                        str = f10.title;
                    }
                    alertDialog$Builder2.f27296a.T = org.telegram.messenger.id.a0("DeleteSelectedTopic", null, 2131751498, str);
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751598, null), new org.telegram.ui.ActionBar.r1(this) {
                        public final tv0 f49608b;

                        {
                            this.f49608b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.u1 r14, int r15) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rv0.g(org.telegram.ui.ActionBar.u1, int):void");
                        }
                    });
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), new io0(4));
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                    u1Var2.show();
                    TextView textView3 = (TextView) u1Var2.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.f28106q7, null);
                    }
                } else if (i7 == 24) {
                    ProfileActivity profileActivity8 = this.f50246b;
                    ry0.K0(profileActivity8.a(), profileActivity8);
                } else if (i7 == 12) {
                    ProfileActivity profileActivity9 = this.f50246b;
                    if (profileActivity9.f41804p1) {
                        profileActivity9.presentFragment(w81.f0(profileActivity9.f41730e1, profileActivity9.f41738f1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f50246b;
                    long j10 = profileActivity10.f41730e1;
                    if (j10 != 0) {
                        bundle3.putLong("chat_id", j10);
                    } else if (profileActivity10.f41812q2) {
                        bundle3.putLong("user_id", profileActivity10.f41723d1);
                    }
                    rn rnVar = new rn(bundle3);
                    ProfileActivity profileActivity11 = this.f50246b;
                    TLRPC.ChatFull chatFull = profileActivity11.f41834t2;
                    if (chatFull != null) {
                        rnVar.q0(chatFull);
                    } else {
                        rnVar.r0(profileActivity11.f41840u2);
                    }
                    this.f50246b.presentFragment(rnVar);
                } else if (i7 == 41) {
                    this.f50246b.presentFragment(new UserInfoActivity());
                } else if (i7 == 9) {
                    TLRPC.User a24 = this.f50246b.getMessagesController().a2(Long.valueOf(this.f50246b.f41723d1));
                    if (a24 != null) {
                        Bundle h7 = org.telegram.ui.Cells.f1.h(2, "onlySelect", "dialogsType", true);
                        h7.putBoolean("resetDelegate", false);
                        h7.putBoolean("closeFragment", false);
                        yw ywVar2 = new yw(h7);
                        ywVar2.D2 = new a7(this, a24, ywVar2, 19);
                        this.f50246b.presentFragment(ywVar2);
                    }
                } else if (i7 == 10) {
                    this.f50246b.J4();
                } else if (i7 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f50246b;
                        if (profileActivity12.C2 != null) {
                            j3 = org.telegram.messenger.m5.F(encryptedChat.f26964id);
                        } else {
                            j3 = profileActivity12.f41723d1;
                            if (j3 == 0) {
                                long j11 = profileActivity12.f41730e1;
                                if (j11 != 0) {
                                    j3 = -j11;
                                } else {
                                    return;
                                }
                            }
                        }
                        org.telegram.messenger.ui mediaDataController = this.f50246b.getMediaDataController();
                        Pattern pattern2 = org.telegram.messenger.ui.R1;
                        mediaDataController.y0(j3, 0, null);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (i7 != 15 && i7 != 16) {
                    if (i7 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f50246b.f41730e1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        qq qqVar = new qq(bundle4);
                        qqVar.C0(this.f50246b.f41834t2);
                        this.f50246b.presentFragment(qqVar);
                    } else if (i7 == 18) {
                        this.f50246b.M4();
                    } else if (i7 == 19) {
                        this.f50246b.presentFragment(d51.g0(this.f50246b.getMessagesController().M0(Long.valueOf(this.f50246b.f41730e1)), false));
                    } else if (i7 == 22) {
                        this.f50246b.P4();
                    } else if (i7 == 38) {
                        this.f50246b.G4();
                    } else if (i7 == 48) {
                        ProfileActivity profileActivity13 = this.f50246b;
                        org.telegram.ui.Wallet.l9 l9Var = new org.telegram.ui.Wallet.l9(profileActivity13.getMessagesController().a2(Long.valueOf(this.f50246b.f41723d1)));
                        l9Var.f42739f0 = true;
                        profileActivity13.presentFragment(l9Var);
                    } else if (i7 == 39) {
                        Bundle f11 = rf.b.f(2, "type");
                        f11.putLong("dialog_id", -this.f50246b.f41730e1);
                        org.telegram.ui.Components.v80 v80Var = new org.telegram.ui.Components.v80(f11, null);
                        ProfileActivity profileActivity14 = this.f50246b;
                        v80Var.f39005c = profileActivity14.f41834t2;
                        profileActivity14.presentFragment(v80Var);
                    } else if (i7 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, this.f50246b.getParentActivity(), this.f50246b.f41876z0);
                        alertDialog$Builder3.f27296a.R = org.telegram.messenger.id.M0(2131754078, null);
                        alertDialog$Builder3.f27296a.T = org.telegram.messenger.id.M0(2131754079, null);
                        alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131744915, null), new org.telegram.ui.ActionBar.r1(this) {
                            public final tv0 f49608b;

                            {
                                this.f49608b = this;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.u1 r14, int r15) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rv0.g(org.telegram.ui.ActionBar.u1, int):void");
                            }
                        });
                        alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        this.f50246b.showDialog(alertDialog$Builder3.f27296a);
                    } else if (i7 == 44) {
                        i16 = ((org.telegram.ui.ActionBar.f2) this.f50246b).currentAccount;
                        long j12 = this.f50246b.f41723d1;
                        TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(i16).b2(j12);
                        if (b22 != null && (botInfo = b22.bot_info) != null) {
                            String str4 = botInfo.privacy_policy_url;
                            if (str4 == null && str4 == null) {
                                ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                                int size = arrayList.size();
                                while (true) {
                                    if (i19 < size) {
                                        TLRPC.BotCommand botCommand = arrayList.get(i19);
                                        i19++;
                                        if ("privacy".equals(botCommand.command)) {
                                            break;
                                        }
                                    } else {
                                        str4 = org.telegram.messenger.id.M0(2131753098, null);
                                        break;
                                    }
                                }
                            }
                            if (str4 != null) {
                                vf.c.t(org.telegram.messenger.t0.f25566b, str4);
                                return;
                            }
                            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                            if (T != null) {
                                if (!(T instanceof cn) || ((cn) T).a() != j12) {
                                    T.presentFragment(cn.ta(j12));
                                }
                                org.telegram.messenger.g0.i3(new bi.ua(i16, j12, 1), 150L);
                            }
                        }
                    } else if (i7 == 21) {
                        if (this.f50246b.getParentActivity() != null) {
                            if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.f25213b) && this.f50246b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                this.f50246b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            cv0 cv0Var = this.f50246b.f41791n0;
                            org.telegram.messenger.hc D = cv0Var.D(cv0Var.getRealPosition());
                            if (D != null) {
                                if (D.f22878p == 2) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                i15 = ((org.telegram.ui.ActionBar.f2) this.f50246b).currentAccount;
                                org.telegram.messenger.w7.G(i15);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = D.f22869f;
                                if (z9) {
                                    str3 = "mp4";
                                }
                                File J = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated2, str3, true, true);
                                if (z9 && !J.exists()) {
                                    J = new File(org.telegram.messenger.w7.z(0), org.telegram.messenger.w7.r("mp4", D.f22869f));
                                }
                                if (J.exists()) {
                                    MediaController.d0(J.toString(), this.f50246b.getParentActivity(), 0, null, null, new bi.b9(8, this, z9));
                                }
                            }
                        }
                    } else if (i7 == 30) {
                        this.f50246b.presentFragment(new UserInfoActivity());
                    } else if (i7 == 40) {
                        ProfileActivity profileActivity15 = this.f50246b;
                        jm0 jm0Var = new jm0();
                        jm0Var.H = this.f50246b;
                        profileActivity15.presentFragment(jm0Var);
                    } else if (i7 == 42) {
                        TLRPC.User a25 = this.f50246b.getMessagesController().a2(Long.valueOf(this.f50246b.f41723d1));
                        if (org.telegram.messenger.g0.g(this.f50246b.getMessagesController().U2 + "/" + org.telegram.messenger.t10.n(a25))) {
                            org.telegram.ui.Components.hc.a0(this.f50246b).k(false).j();
                        }
                    } else if (i7 == 43) {
                        this.f50246b.presentFragment(new la(null));
                    } else if (i7 == 31) {
                        this.f50246b.presentFragment(new org.telegram.ui.ActionBar.f2(null));
                    } else if (i7 == 33) {
                        int realPosition = this.f50246b.f41791n0.getRealPosition();
                        TLRPC.Photo F = this.f50246b.f41791n0.F(realPosition);
                        if (F != null) {
                            cv0 cv0Var2 = this.f50246b.f41791n0;
                            ArrayList arrayList2 = cv0Var2.f38396b1;
                            ArrayList arrayList3 = cv0Var2.f38395a1;
                            ArrayList arrayList4 = cv0Var2.Z0;
                            ArrayList arrayList5 = cv0Var2.Y0;
                            ArrayList arrayList6 = cv0Var2.W0;
                            ArrayList arrayList7 = cv0Var2.U0;
                            ArrayList arrayList8 = cv0Var2.X0;
                            ArrayList arrayList9 = cv0Var2.V0;
                            org.telegram.messenger.yo yoVar = cv0Var2.S0;
                            if (yoVar != null) {
                                yoVar.c(realPosition);
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                cv0Var2.f38397c1++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList10 = cv0Var2.T0;
                                arrayList10.add(0, (String) arrayList10.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (org.telegram.messenger.hc) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (org.telegram.messenger.hc) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (org.telegram.messenger.hc) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (org.telegram.ui.Components.e51) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                cv0Var2.P0 = (org.telegram.messenger.hc) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f27090id = tL_inputPhoto;
                            tL_inputPhoto.f26975id = F.f26980id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            org.telegram.messenger.p10 userConfig = this.f50246b.getUserConfig();
                            this.f50246b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new no0(this, userConfig, F, 6));
                            ProfileActivity profileActivity16 = this.f50246b;
                            UndoView undoView = profileActivity16.L;
                            long j13 = profileActivity16.f41723d1;
                            if (F.video_sizes.isEmpty()) {
                                num = null;
                            } else {
                                num = 1;
                            }
                            undoView.m(j13, num, 22);
                            TLRPC.User a26 = this.f50246b.getMessagesController().a2(Long.valueOf(userConfig.f24489n));
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F.sizes, 800, false, null, false);
                            if (a26 != null) {
                                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F.sizes, 90, false, null, false);
                                TLRPC.UserProfilePhoto userProfilePhoto = a26.photo;
                                userProfilePhoto.photo_id = F.f26980id;
                                userProfilePhoto.photo_small = w11.location;
                                userProfilePhoto.photo_big = w10.location;
                                userConfig.w(a26);
                                userConfig.v(true);
                                i14 = ((org.telegram.ui.ActionBar.f2) this.f50246b).currentAccount;
                                org.telegram.messenger.qs.f(i14).k(org.telegram.messenger.qs.f25020j0, new Object[0]);
                                this.f50246b.L5(true);
                            }
                            cv0 cv0Var3 = this.f50246b.f41791n0;
                            cv0Var3.D0.g();
                            cv0Var3.L();
                        }
                    } else if (i7 == 34) {
                        i10 = ((org.telegram.ui.ActionBar.f2) this.f50246b).currentAccount;
                        if (org.telegram.messenger.qp.s1(i10).v2()) {
                            i13 = ((org.telegram.ui.ActionBar.f2) this.f50246b).currentAccount;
                            b.b(i13);
                            return;
                        }
                        int realPosition2 = this.f50246b.f41791n0.getRealPosition();
                        org.telegram.messenger.hc D2 = this.f50246b.f41791n0.D(realPosition2);
                        if (D2 != null) {
                            i11 = ((org.telegram.ui.ActionBar.f2) this.f50246b).currentAccount;
                            org.telegram.messenger.w7.G(i11);
                            Drawable[] drawableArr = PhotoViewer.Y8;
                            File J2 = org.telegram.messenger.w7.J(D2.f22869f, PhotoViewer.m1(D2), true, true);
                            if (D2.f22878p == 2) {
                                z11 = true;
                            }
                            if (z11) {
                                org.telegram.messenger.hc G = this.f50246b.f41791n0.G(realPosition2);
                                i12 = ((org.telegram.ui.ActionBar.f2) this.f50246b).currentAccount;
                                org.telegram.messenger.w7.G(i12);
                                if (G != null) {
                                    tL_fileLocationToBeDeprecated = G.f22869f;
                                }
                                str2 = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated, PhotoViewer.m1(G), true, true).getAbsolutePath();
                            }
                            this.f50246b.f41810q0.p(J2.getAbsolutePath(), str2, z11);
                        }
                    } else if (i7 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.f50246b.getParentActivity(), this.f50246b.f41876z0);
                        cv0 cv0Var4 = this.f50246b.f41791n0;
                        org.telegram.messenger.hc D3 = cv0Var4.D(cv0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.f22878p == 2) {
                                alertDialog$Builder4.f27296a.R = org.telegram.messenger.id.M0(2131754083, null);
                                alertDialog$Builder4.f27296a.T = org.telegram.messenger.id.M0(2131754085, null);
                            } else {
                                alertDialog$Builder4.f27296a.R = org.telegram.messenger.id.M0(2131754094, null);
                                alertDialog$Builder4.f27296a.T = org.telegram.messenger.id.M0(2131754096, null);
                            }
                            alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131751598, null), new org.telegram.ui.ActionBar.r1(this) {
                                public final tv0 f49608b;

                                {
                                    this.f49608b = this;
                                }

                                @Override
                                public final void g(org.telegram.ui.ActionBar.u1 r14, int r15) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rv0.g(org.telegram.ui.ActionBar.u1, int):void");
                                }
                            });
                            alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder4.f27296a;
                            this.f50246b.showDialog(u1Var3);
                            TextView textView4 = (TextView) u1Var3.d(-1);
                            if (textView4 != null) {
                                org.telegram.ui.ActionBar.s6.U(textView4, org.telegram.ui.ActionBar.l6.f28106q7, this.f50246b.f41876z0);
                            }
                        }
                    } else if (i7 == 36) {
                        this.f50246b.L4();
                    }
                } else {
                    ProfileActivity profileActivity17 = this.f50246b;
                    if (i7 == 16) {
                        z10 = true;
                    }
                    profileActivity17.F4(z10);
                }
            }
        }
    }
}
