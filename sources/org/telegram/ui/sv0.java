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
public final class sv0 extends org.telegram.ui.ActionBar.j {
    public final Context f52090a;
    public final ProfileActivity f52091b;

    public sv0(ProfileActivity profileActivity, Context context) {
        this.f52091b = profileActivity;
        this.f52090a = context;
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
        boolean z10;
        int i15;
        int i16;
        TL_bots.BotInfo botInfo;
        int i17;
        String str;
        int i18;
        org.telegram.ui.Components.fr0 fr0Var;
        if (this.f52091b.getParentActivity() != null) {
            if (i7 == -1) {
                ProfileActivity profileActivity = this.f52091b;
                wv0 wv0Var = profileActivity.O;
                if (wv0Var != null && (fr0Var = wv0Var.L0) != null && fr0Var.f33118o0) {
                    profileActivity.o5();
                    return;
                } else {
                    profileActivity.finishFragment();
                    return;
                }
            }
            boolean z11 = false;
            int i19 = 0;
            boolean z12 = false;
            if (i7 == 2) {
                this.f52091b.E4(false);
            } else if (i7 == 1) {
                TLRPC.User c22 = this.f52091b.getMessagesController().c2(Long.valueOf(this.f52091b.f43550e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", c22.f28547id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f52091b;
                qr qrVar = new qr(bundle, profileActivity2.A0);
                qrVar.P = new yt0(profileActivity2, c22);
                profileActivity2.presentFragment(qrVar);
            } else {
                String str2 = null;
                String str3 = null;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
                if (i7 == 3) {
                    Bundle l10 = org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true);
                    l10.putString("selectAlertString", org.telegram.messenger.hd.N0(2131745434, null));
                    l10.putString("selectAlertStringGroup", org.telegram.messenger.hd.N0(2131745435, null));
                    cx cxVar = new cx(l10);
                    ProfileActivity profileActivity3 = this.f52091b;
                    cxVar.E2 = profileActivity3;
                    profileActivity3.presentFragment(cxVar);
                } else if (i7 == 4) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", this.f52091b.f43550e1);
                    ProfileActivity profileActivity4 = this.f52091b;
                    profileActivity4.presentFragment(new qr(bundle2, profileActivity4.A0));
                } else if (i7 == 5) {
                    TLRPC.User c23 = this.f52091b.getMessagesController().c2(Long.valueOf(this.f52091b.f43550e1));
                    if (c23 != null && this.f52091b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f52091b.getParentActivity(), this.f52091b.A0);
                        alertDialog$Builder.f28743a.S = org.telegram.messenger.hd.N0(2131751540, null);
                        alertDialog$Builder.f28743a.U = org.telegram.messenger.hd.N0(2131754100, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new aj0(14, this, c23));
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                        this.f52091b.showDialog(t1Var);
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29588q7, this.f52091b.A0);
                        }
                    }
                } else if (i7 == 7) {
                    this.f52091b.z4(false);
                } else if (i7 == 45) {
                    this.f52091b.z4(true);
                } else if (i7 == 46) {
                    if (!this.f52091b.getUserConfig().q()) {
                        ProfileActivity profileActivity5 = this.f52091b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i18 = ((org.telegram.ui.ActionBar.g2) this.f52091b).currentAccount;
                        new ug.y0(profileActivity5, parentActivity, i18, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f52090a;
                    org.telegram.ui.ActionBar.h6 h6Var = this.f52091b.A0;
                    su0 su0Var = new su0(this, 2);
                    Pattern pattern = org.telegram.ui.Components.c5.f33977a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, null, false);
                        org.telegram.ui.ActionBar.h2 h2Var = j10.f30184y0;
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        ?? imageView = new ImageView(context);
                        linearLayout.addView((View) imageView, c8.na.t(110, 110, 17, 0, 21, 0, 11));
                        imageView.f(2131624174, 110, 110, null);
                        imageView.setAutoRepeat(false);
                        imageView.d();
                        TextView textView2 = new TextView(context);
                        textView2.setTypeface(org.telegram.messenger.g0.o());
                        textView2.setGravity(17);
                        textView2.setText(org.telegram.messenger.hd.N0(2131751410, null));
                        textView2.setTextSize(1, 20.0f);
                        int i20 = org.telegram.ui.ActionBar.m6.G6;
                        org.telegram.ui.ActionBar.t6.U(textView2, i20, h6Var);
                        linearLayout.addView(textView2, c8.na.t(-1, -2, 17, 20, 0, 20, 14));
                        ks0 ks0Var = new ks0(context, h6Var);
                        ks0Var.f49348a.l(org.telegram.messenger.hd.N0(2131751409, null), false);
                        ks0Var.f49349b.setText(org.telegram.messenger.hd.N0(2131751406, null));
                        ks0Var.d.setVisibility(8);
                        ks0Var.f49350c.setImageResource(2131231848);
                        ImageView imageView2 = ks0Var.f49350c;
                        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                        org.telegram.ui.ActionBar.t6.s(imageView2, i20, h6Var, mode);
                        linearLayout.addView(ks0Var, c8.na.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        ks0 ks0Var2 = new ks0(context, h6Var);
                        ks0Var2.f49348a.l(org.telegram.messenger.hd.N0(2131751408, null), false);
                        ks0Var2.f49349b.setText(org.telegram.messenger.hd.N0(2131751405, null));
                        ks0Var2.d.setVisibility(8);
                        ks0Var2.f49350c.setImageResource(2131231880);
                        org.telegram.ui.ActionBar.t6.s(ks0Var2.f49350c, i20, h6Var, mode);
                        linearLayout.addView(ks0Var2, c8.na.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        ks0 ks0Var3 = new ks0(context, h6Var);
                        ks0Var3.f49348a.l(org.telegram.messenger.hd.N0(2131751407, null), false);
                        ks0Var3.f49349b.setText(org.telegram.messenger.hd.N0(2131751404, null));
                        ks0Var3.d.setVisibility(8);
                        ks0Var3.f49350c.setImageResource(2131231789);
                        org.telegram.ui.ActionBar.t6.s(ks0Var3.f49350c, i20, h6Var, mode);
                        linearLayout.addView(ks0Var3, c8.na.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        hi.d dVar = new hi.d(context, h6Var, true);
                        dVar.setOnClickListener(new oi.h1(26, zArr, h2Var));
                        dVar.f();
                        dVar.i(org.telegram.messenger.hd.N0(2131751411, null), false, true);
                        linearLayout.addView(dVar, c8.na.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        j10.O = linearLayout;
                        j10.show();
                        j10.n(new ci(17, zArr, su0Var));
                    }
                } else if (i7 == 47) {
                    ProfileActivity profileActivity6 = this.f52091b;
                    profileActivity6.getMessagesController().p5(profileActivity6.f43550e1, 0, false, new hi.k9(profileActivity6, false, 2));
                } else if (i7 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f52091b.getParentActivity());
                    alertDialog$Builder2.f28743a.S = org.telegram.messenger.hd.K0(1, "DeleteTopics");
                    i17 = ((org.telegram.ui.ActionBar.g2) this.f52091b).currentAccount;
                    org.telegram.messenger.f00 f00Var = org.telegram.messenger.np.u1(i17).f25932t7;
                    ProfileActivity profileActivity7 = this.f52091b;
                    TLRPC.TL_forumTopic f10 = f00Var.f(profileActivity7.f43558f1, profileActivity7.f43565g1);
                    if (f10 == null) {
                        str = "topic";
                    } else {
                        str = f10.title;
                    }
                    alertDialog$Builder2.f28743a.U = org.telegram.messenger.hd.a0("DeleteSelectedTopic", null, 2131751486, str);
                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131751586, null), new org.telegram.ui.ActionBar.q1(this) {
                        public final sv0 f51330b;

                        {
                            this.f51330b = this;
                        }

                        @Override
                        public final void h(org.telegram.ui.ActionBar.t1 r14, int r15) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qv0.h(org.telegram.ui.ActionBar.t1, int):void");
                        }
                    });
                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), new l60(11));
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28743a;
                    t1Var2.show();
                    TextView textView3 = (TextView) t1Var2.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.f29588q7, null);
                    }
                } else if (i7 == 24) {
                    ProfileActivity profileActivity8 = this.f52091b;
                    qy0.L0(profileActivity8.a(), profileActivity8);
                } else if (i7 == 12) {
                    ProfileActivity profileActivity9 = this.f52091b;
                    if (profileActivity9.f43631q1) {
                        profileActivity9.presentFragment(w81.f0(profileActivity9.f43558f1, profileActivity9.f43565g1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f52091b;
                    long j11 = profileActivity10.f43558f1;
                    if (j11 != 0) {
                        bundle3.putLong("chat_id", j11);
                    } else if (profileActivity10.f43648s2) {
                        bundle3.putLong("user_id", profileActivity10.f43550e1);
                    }
                    rn rnVar = new rn(bundle3);
                    ProfileActivity profileActivity11 = this.f52091b;
                    TLRPC.ChatFull chatFull = profileActivity11.f43667v2;
                    if (chatFull != null) {
                        rnVar.q0(chatFull);
                    } else {
                        rnVar.r0(profileActivity11.f43675w2);
                    }
                    this.f52091b.presentFragment(rnVar);
                } else if (i7 == 41) {
                    this.f52091b.presentFragment(new UserInfoActivity());
                } else if (i7 == 9) {
                    TLRPC.User c24 = this.f52091b.getMessagesController().c2(Long.valueOf(this.f52091b.f43550e1));
                    if (c24 != null) {
                        Bundle l11 = org.telegram.ui.Cells.c0.l(2, "onlySelect", "dialogsType", true);
                        l11.putBoolean("resetDelegate", false);
                        l11.putBoolean("closeFragment", false);
                        cx cxVar2 = new cx(l11);
                        cxVar2.E2 = new z6(this, c24, cxVar2, 19);
                        this.f52091b.presentFragment(cxVar2);
                    }
                } else if (i7 == 10) {
                    this.f52091b.J4();
                } else if (i7 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f52091b;
                        if (profileActivity12.E2 != null) {
                            j3 = org.telegram.messenger.n5.F(encryptedChat.f28406id);
                        } else {
                            j3 = profileActivity12.f43550e1;
                            if (j3 == 0) {
                                long j12 = profileActivity12.f43558f1;
                                if (j12 != 0) {
                                    j3 = -j12;
                                } else {
                                    return;
                                }
                            }
                        }
                        org.telegram.messenger.si mediaDataController = this.f52091b.getMediaDataController();
                        Pattern pattern2 = org.telegram.messenger.si.U1;
                        mediaDataController.A0(j3, 0, null);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (i7 != 15 && i7 != 16) {
                    if (i7 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f52091b.f43558f1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        rq rqVar = new rq(bundle4);
                        rqVar.C0(this.f52091b.f43667v2);
                        this.f52091b.presentFragment(rqVar);
                    } else if (i7 == 18) {
                        this.f52091b.M4();
                    } else if (i7 == 19) {
                        this.f52091b.presentFragment(c51.g0(this.f52091b.getMessagesController().O0(Long.valueOf(this.f52091b.f43558f1)), false));
                    } else if (i7 == 22) {
                        this.f52091b.P4();
                    } else if (i7 == 38) {
                        this.f52091b.G4();
                    } else if (i7 == 48) {
                        ProfileActivity profileActivity13 = this.f52091b;
                        org.telegram.ui.Wallet.da daVar = new org.telegram.ui.Wallet.da(profileActivity13.getMessagesController().c2(Long.valueOf(this.f52091b.f43550e1)));
                        daVar.f44071g0 = true;
                        profileActivity13.presentFragment(daVar);
                    } else if (i7 == 39) {
                        Bundle f11 = p5.c.f(2, "type");
                        f11.putLong("dialog_id", -this.f52091b.f43558f1);
                        org.telegram.ui.Components.k90 k90Var = new org.telegram.ui.Components.k90(f11, null);
                        ProfileActivity profileActivity14 = this.f52091b;
                        k90Var.f36830c = profileActivity14.f43667v2;
                        profileActivity14.presentFragment(k90Var);
                    } else if (i7 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, this.f52091b.getParentActivity(), this.f52091b.A0);
                        alertDialog$Builder3.f28743a.S = org.telegram.messenger.hd.N0(2131754075, null);
                        alertDialog$Builder3.f28743a.U = org.telegram.messenger.hd.N0(2131754076, null);
                        alertDialog$Builder3.k(org.telegram.messenger.hd.N0(2131744674, null), new org.telegram.ui.ActionBar.q1(this) {
                            public final sv0 f51330b;

                            {
                                this.f51330b = this;
                            }

                            @Override
                            public final void h(org.telegram.ui.ActionBar.t1 r14, int r15) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qv0.h(org.telegram.ui.ActionBar.t1, int):void");
                            }
                        });
                        alertDialog$Builder3.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        this.f52091b.showDialog(alertDialog$Builder3.f28743a);
                    } else if (i7 == 44) {
                        i16 = ((org.telegram.ui.ActionBar.g2) this.f52091b).currentAccount;
                        long j13 = this.f52091b.f43550e1;
                        TLRPC.UserFull d2 = org.telegram.messenger.np.u1(i16).d2(j13);
                        if (d2 != null && (botInfo = d2.bot_info) != null) {
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
                                        str4 = org.telegram.messenger.hd.N0(2131753095, null);
                                        break;
                                    }
                                }
                            }
                            if (str4 != null) {
                                vf.c.t(org.telegram.messenger.t0.f26895b, str4);
                                return;
                            }
                            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                            if (T != null) {
                                if (!(T instanceof bn) || ((bn) T).a() != j13) {
                                    T.presentFragment(bn.ua(j13));
                                }
                                org.telegram.messenger.g0.h3(new di.m9(i16, j13, 2), 150L);
                            }
                        }
                    } else if (i7 == 21) {
                        if (this.f52091b.getParentActivity() != null) {
                            if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.s2.f26695b) && this.f52091b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                this.f52091b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            bv0 bv0Var = this.f52091b.f43617o0;
                            org.telegram.messenger.gc D = bv0Var.D(bv0Var.getRealPosition());
                            if (D != null) {
                                if (D.f24089p == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i15 = ((org.telegram.ui.ActionBar.g2) this.f52091b).currentAccount;
                                org.telegram.messenger.w7.G(i15);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = D.f24080f;
                                if (z10) {
                                    str3 = "mp4";
                                }
                                File J = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated2, str3, true, true);
                                if (z10 && !J.exists()) {
                                    J = new File(org.telegram.messenger.w7.z(0), org.telegram.messenger.w7.r("mp4", D.f24080f));
                                }
                                if (J.exists()) {
                                    MediaController.d0(J.toString(), this.f52091b.getParentActivity(), 0, null, null, new ai.n2(9, this, z10));
                                }
                            }
                        }
                    } else if (i7 == 30) {
                        this.f52091b.presentFragment(new UserInfoActivity());
                    } else if (i7 == 40) {
                        ProfileActivity profileActivity15 = this.f52091b;
                        lm0 lm0Var = new lm0();
                        lm0Var.I = this.f52091b;
                        profileActivity15.presentFragment(lm0Var);
                    } else if (i7 == 42) {
                        TLRPC.User c25 = this.f52091b.getMessagesController().c2(Long.valueOf(this.f52091b.f43550e1));
                        if (org.telegram.messenger.g0.g(this.f52091b.getMessagesController().X2 + "/" + org.telegram.messenger.p10.o(c25))) {
                            org.telegram.ui.Components.lc.b0(this.f52091b).k(false).j();
                        }
                    } else if (i7 == 43) {
                        this.f52091b.presentFragment(new la(null));
                    } else if (i7 == 31) {
                        this.f52091b.presentFragment(new org.telegram.ui.ActionBar.g2(null));
                    } else if (i7 == 33) {
                        int realPosition = this.f52091b.f43617o0.getRealPosition();
                        TLRPC.Photo F = this.f52091b.f43617o0.F(realPosition);
                        if (F != null) {
                            bv0 bv0Var2 = this.f52091b.f43617o0;
                            ArrayList arrayList2 = bv0Var2.f35833c1;
                            ArrayList arrayList3 = bv0Var2.f35832b1;
                            ArrayList arrayList4 = bv0Var2.f35831a1;
                            ArrayList arrayList5 = bv0Var2.Z0;
                            ArrayList arrayList6 = bv0Var2.X0;
                            ArrayList arrayList7 = bv0Var2.V0;
                            ArrayList arrayList8 = bv0Var2.Y0;
                            ArrayList arrayList9 = bv0Var2.W0;
                            org.telegram.messenger.vo voVar = bv0Var2.T0;
                            if (voVar != null) {
                                voVar.c(realPosition);
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                bv0Var2.f35834d1++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList10 = bv0Var2.U0;
                                arrayList10.add(0, (String) arrayList10.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (org.telegram.messenger.gc) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (org.telegram.messenger.gc) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (org.telegram.messenger.gc) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (org.telegram.ui.Components.t51) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                bv0Var2.Q0 = (org.telegram.messenger.gc) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f28532id = tL_inputPhoto;
                            tL_inputPhoto.f28417id = F.f28422id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            org.telegram.messenger.k10 userConfig = this.f52091b.getUserConfig();
                            this.f52091b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new no0(this, userConfig, F, 6));
                            ProfileActivity profileActivity16 = this.f52091b;
                            UndoView undoView = profileActivity16.M;
                            long j14 = profileActivity16.f43550e1;
                            if (F.video_sizes.isEmpty()) {
                                num = null;
                            } else {
                                num = 1;
                            }
                            undoView.m(j14, num, 22);
                            TLRPC.User c26 = this.f52091b.getMessagesController().c2(Long.valueOf(userConfig.f24951n));
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F.sizes, 800, false, null, false);
                            if (c26 != null) {
                                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F.sizes, 90, false, null, false);
                                TLRPC.UserProfilePhoto userProfilePhoto = c26.photo;
                                userProfilePhoto.photo_id = F.f28422id;
                                userProfilePhoto.photo_small = w11.location;
                                userProfilePhoto.photo_big = w10.location;
                                userConfig.w(c26);
                                userConfig.v(true);
                                i14 = ((org.telegram.ui.ActionBar.g2) this.f52091b).currentAccount;
                                org.telegram.messenger.ls.f(i14).k(org.telegram.messenger.ls.f25292j0, new Object[0]);
                                this.f52091b.M5(true);
                            }
                            bv0 bv0Var3 = this.f52091b.f43617o0;
                            bv0Var3.E0.g();
                            bv0Var3.L();
                        }
                    } else if (i7 == 34) {
                        i10 = ((org.telegram.ui.ActionBar.g2) this.f52091b).currentAccount;
                        if (org.telegram.messenger.np.u1(i10).A2()) {
                            i13 = ((org.telegram.ui.ActionBar.g2) this.f52091b).currentAccount;
                            b.b(i13);
                            return;
                        }
                        int realPosition2 = this.f52091b.f43617o0.getRealPosition();
                        org.telegram.messenger.gc D2 = this.f52091b.f43617o0.D(realPosition2);
                        if (D2 != null) {
                            i11 = ((org.telegram.ui.ActionBar.g2) this.f52091b).currentAccount;
                            org.telegram.messenger.w7.G(i11);
                            Drawable[] drawableArr = PhotoViewer.Z8;
                            File J2 = org.telegram.messenger.w7.J(D2.f24080f, PhotoViewer.m1(D2), true, true);
                            if (D2.f24089p == 2) {
                                z12 = true;
                            }
                            if (z12) {
                                org.telegram.messenger.gc G = this.f52091b.f43617o0.G(realPosition2);
                                i12 = ((org.telegram.ui.ActionBar.g2) this.f52091b).currentAccount;
                                org.telegram.messenger.w7.G(i12);
                                if (G != null) {
                                    tL_fileLocationToBeDeprecated = G.f24080f;
                                }
                                str2 = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated, PhotoViewer.m1(G), true, true).getAbsolutePath();
                            }
                            this.f52091b.f43638r0.p(J2.getAbsolutePath(), str2, z12);
                        }
                    } else if (i7 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.f52091b.getParentActivity(), this.f52091b.A0);
                        bv0 bv0Var4 = this.f52091b.f43617o0;
                        org.telegram.messenger.gc D3 = bv0Var4.D(bv0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.f24089p == 2) {
                                alertDialog$Builder4.f28743a.S = org.telegram.messenger.hd.N0(2131754080, null);
                                alertDialog$Builder4.f28743a.U = org.telegram.messenger.hd.N0(2131754082, null);
                            } else {
                                alertDialog$Builder4.f28743a.S = org.telegram.messenger.hd.N0(2131754091, null);
                                alertDialog$Builder4.f28743a.U = org.telegram.messenger.hd.N0(2131754093, null);
                            }
                            alertDialog$Builder4.k(org.telegram.messenger.hd.N0(2131751586, null), new org.telegram.ui.ActionBar.q1(this) {
                                public final sv0 f51330b;

                                {
                                    this.f51330b = this;
                                }

                                @Override
                                public final void h(org.telegram.ui.ActionBar.t1 r14, int r15) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qv0.h(org.telegram.ui.ActionBar.t1, int):void");
                                }
                            });
                            alertDialog$Builder4.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder4.f28743a;
                            this.f52091b.showDialog(t1Var3);
                            TextView textView4 = (TextView) t1Var3.d(-1);
                            if (textView4 != null) {
                                org.telegram.ui.ActionBar.t6.U(textView4, org.telegram.ui.ActionBar.m6.f29588q7, this.f52091b.A0);
                            }
                        }
                    } else if (i7 == 36) {
                        this.f52091b.L4();
                    }
                } else {
                    ProfileActivity profileActivity17 = this.f52091b;
                    if (i7 == 16) {
                        z11 = true;
                    }
                    profileActivity17.F4(z11);
                }
            }
        }
    }
}
