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
public final class qv0 extends org.telegram.ui.ActionBar.j {
    public final Context f51545a;
    public final ProfileActivity f51546b;

    public qv0(ProfileActivity profileActivity, Context context) {
        this.f51546b = profileActivity;
        this.f51545a = context;
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
        org.telegram.ui.Components.er0 er0Var;
        if (this.f51546b.getParentActivity() != null) {
            if (i7 == -1) {
                ProfileActivity profileActivity = this.f51546b;
                uv0 uv0Var = profileActivity.O;
                if (uv0Var != null && (er0Var = uv0Var.L0) != null && er0Var.f33216o0) {
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
                this.f51546b.E4(false);
            } else if (i7 == 1) {
                TLRPC.User c22 = this.f51546b.getMessagesController().c2(Long.valueOf(this.f51546b.f43666e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", c22.f28641id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f51546b;
                qr qrVar = new qr(bundle, profileActivity2.A0);
                qrVar.P = new wt0(profileActivity2, c22);
                profileActivity2.presentFragment(qrVar);
            } else {
                String str2 = null;
                String str3 = null;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
                if (i7 == 3) {
                    Bundle l10 = org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true);
                    l10.putString("selectAlertString", org.telegram.messenger.gd.N0(2131745434, null));
                    l10.putString("selectAlertStringGroup", org.telegram.messenger.gd.N0(2131745435, null));
                    bx bxVar = new bx(l10);
                    ProfileActivity profileActivity3 = this.f51546b;
                    bxVar.E2 = profileActivity3;
                    profileActivity3.presentFragment(bxVar);
                } else if (i7 == 4) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", this.f51546b.f43666e1);
                    ProfileActivity profileActivity4 = this.f51546b;
                    profileActivity4.presentFragment(new qr(bundle2, profileActivity4.A0));
                } else if (i7 == 5) {
                    TLRPC.User c23 = this.f51546b.getMessagesController().c2(Long.valueOf(this.f51546b.f43666e1));
                    if (c23 != null && this.f51546b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f51546b.getParentActivity(), this.f51546b.A0);
                        alertDialog$Builder.f28835a.S = org.telegram.messenger.gd.N0(2131751540, null);
                        alertDialog$Builder.f28835a.U = org.telegram.messenger.gd.N0(2131754100, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new yi0(14, this, c23));
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        this.f51546b.showDialog(t1Var);
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, this.f51546b.A0);
                        }
                    }
                } else if (i7 == 7) {
                    this.f51546b.z4(false);
                } else if (i7 == 45) {
                    this.f51546b.z4(true);
                } else if (i7 == 46) {
                    if (!this.f51546b.getUserConfig().q()) {
                        ProfileActivity profileActivity5 = this.f51546b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i18 = ((org.telegram.ui.ActionBar.g2) this.f51546b).currentAccount;
                        new ug.y0(profileActivity5, parentActivity, i18, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f51545a;
                    org.telegram.ui.ActionBar.i6 i6Var = this.f51546b.A0;
                    qu0 qu0Var = new qu0(this, 2);
                    Pattern pattern = org.telegram.ui.Components.b5.f33627a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, null, false);
                        org.telegram.ui.ActionBar.h2 h2Var = j10.f30268y0;
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
                        textView2.setText(org.telegram.messenger.gd.N0(2131751410, null));
                        textView2.setTextSize(1, 20.0f);
                        int i20 = org.telegram.ui.ActionBar.n6.G6;
                        org.telegram.ui.ActionBar.u6.U(textView2, i20, i6Var);
                        linearLayout.addView(textView2, c8.na.t(-1, -2, 17, 20, 0, 20, 14));
                        is0 is0Var = new is0(context, i6Var);
                        is0Var.f48912a.l(org.telegram.messenger.gd.N0(2131751409, null), false);
                        is0Var.f48913b.setText(org.telegram.messenger.gd.N0(2131751406, null));
                        is0Var.d.setVisibility(8);
                        is0Var.f48914c.setImageResource(2131231851);
                        ImageView imageView2 = is0Var.f48914c;
                        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                        org.telegram.ui.ActionBar.u6.s(imageView2, i20, i6Var, mode);
                        linearLayout.addView(is0Var, c8.na.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        is0 is0Var2 = new is0(context, i6Var);
                        is0Var2.f48912a.l(org.telegram.messenger.gd.N0(2131751408, null), false);
                        is0Var2.f48913b.setText(org.telegram.messenger.gd.N0(2131751405, null));
                        is0Var2.d.setVisibility(8);
                        is0Var2.f48914c.setImageResource(2131231883);
                        org.telegram.ui.ActionBar.u6.s(is0Var2.f48914c, i20, i6Var, mode);
                        linearLayout.addView(is0Var2, c8.na.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        is0 is0Var3 = new is0(context, i6Var);
                        is0Var3.f48912a.l(org.telegram.messenger.gd.N0(2131751407, null), false);
                        is0Var3.f48913b.setText(org.telegram.messenger.gd.N0(2131751404, null));
                        is0Var3.d.setVisibility(8);
                        is0Var3.f48914c.setImageResource(2131231792);
                        org.telegram.ui.ActionBar.u6.s(is0Var3.f48914c, i20, i6Var, mode);
                        linearLayout.addView(is0Var3, c8.na.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        hi.e eVar = new hi.e(context, i6Var, true);
                        eVar.setOnClickListener(new oi.i1(26, zArr, h2Var));
                        eVar.f();
                        eVar.i(org.telegram.messenger.gd.N0(2131751411, null), false, true);
                        linearLayout.addView(eVar, c8.na.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        j10.O = linearLayout;
                        j10.show();
                        j10.n(new ah(21, zArr, qu0Var));
                    }
                } else if (i7 == 47) {
                    ProfileActivity profileActivity6 = this.f51546b;
                    profileActivity6.getMessagesController().p5(profileActivity6.f43666e1, 0, false, new hi.ea(profileActivity6, false, 2));
                } else if (i7 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f51546b.getParentActivity());
                    alertDialog$Builder2.f28835a.S = org.telegram.messenger.gd.K0(1, "DeleteTopics");
                    i17 = ((org.telegram.ui.ActionBar.g2) this.f51546b).currentAccount;
                    org.telegram.messenger.d00 d00Var = org.telegram.messenger.mp.u1(i17).f25864t7;
                    ProfileActivity profileActivity7 = this.f51546b;
                    TLRPC.TL_forumTopic f10 = d00Var.f(profileActivity7.f43674f1, profileActivity7.f43681g1);
                    if (f10 == null) {
                        str = "topic";
                    } else {
                        str = f10.title;
                    }
                    alertDialog$Builder2.f28835a.U = org.telegram.messenger.gd.a0("DeleteSelectedTopic", null, 2131751486, str);
                    alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131751586, null), new org.telegram.ui.ActionBar.q1(this) {
                        public final qv0 f50774b;

                        {
                            this.f50774b = this;
                        }

                        @Override
                        public final void i(org.telegram.ui.ActionBar.t1 r14, int r15) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ov0.i(org.telegram.ui.ActionBar.t1, int):void");
                        }
                    });
                    alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), new l60(11));
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
                    t1Var2.show();
                    TextView textView3 = (TextView) t1Var2.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.f29692q7, null);
                    }
                } else if (i7 == 24) {
                    ProfileActivity profileActivity8 = this.f51546b;
                    py0.L0(profileActivity8.a(), profileActivity8);
                } else if (i7 == 12) {
                    ProfileActivity profileActivity9 = this.f51546b;
                    if (profileActivity9.f43747q1) {
                        profileActivity9.presentFragment(u81.f0(profileActivity9.f43674f1, profileActivity9.f43681g1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f51546b;
                    long j11 = profileActivity10.f43674f1;
                    if (j11 != 0) {
                        bundle3.putLong("chat_id", j11);
                    } else if (profileActivity10.f43764s2) {
                        bundle3.putLong("user_id", profileActivity10.f43666e1);
                    }
                    rn rnVar = new rn(bundle3);
                    ProfileActivity profileActivity11 = this.f51546b;
                    TLRPC.ChatFull chatFull = profileActivity11.f43783v2;
                    if (chatFull != null) {
                        rnVar.q0(chatFull);
                    } else {
                        rnVar.r0(profileActivity11.f43791w2);
                    }
                    this.f51546b.presentFragment(rnVar);
                } else if (i7 == 41) {
                    this.f51546b.presentFragment(new UserInfoActivity());
                } else if (i7 == 9) {
                    TLRPC.User c24 = this.f51546b.getMessagesController().c2(Long.valueOf(this.f51546b.f43666e1));
                    if (c24 != null) {
                        Bundle l11 = org.telegram.ui.Cells.c0.l(2, "onlySelect", "dialogsType", true);
                        l11.putBoolean("resetDelegate", false);
                        l11.putBoolean("closeFragment", false);
                        bx bxVar2 = new bx(l11);
                        bxVar2.E2 = new a7(this, c24, bxVar2, 19);
                        this.f51546b.presentFragment(bxVar2);
                    }
                } else if (i7 == 10) {
                    this.f51546b.J4();
                } else if (i7 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f51546b;
                        if (profileActivity12.E2 != null) {
                            j3 = org.telegram.messenger.n5.F(encryptedChat.f28500id);
                        } else {
                            j3 = profileActivity12.f43666e1;
                            if (j3 == 0) {
                                long j12 = profileActivity12.f43674f1;
                                if (j12 != 0) {
                                    j3 = -j12;
                                } else {
                                    return;
                                }
                            }
                        }
                        org.telegram.messenger.ri mediaDataController = this.f51546b.getMediaDataController();
                        Pattern pattern2 = org.telegram.messenger.ri.U1;
                        mediaDataController.A0(j3, 0, null);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (i7 != 15 && i7 != 16) {
                    if (i7 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f51546b.f43674f1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        rq rqVar = new rq(bundle4);
                        rqVar.C0(this.f51546b.f43783v2);
                        this.f51546b.presentFragment(rqVar);
                    } else if (i7 == 18) {
                        this.f51546b.M4();
                    } else if (i7 == 19) {
                        this.f51546b.presentFragment(b51.g0(this.f51546b.getMessagesController().O0(Long.valueOf(this.f51546b.f43674f1)), false));
                    } else if (i7 == 22) {
                        this.f51546b.P4();
                    } else if (i7 == 38) {
                        this.f51546b.G4();
                    } else if (i7 == 48) {
                        ProfileActivity profileActivity13 = this.f51546b;
                        org.telegram.ui.Wallet.ea eaVar = new org.telegram.ui.Wallet.ea(profileActivity13.getMessagesController().c2(Long.valueOf(this.f51546b.f43666e1)));
                        eaVar.f44233g0 = true;
                        profileActivity13.presentFragment(eaVar);
                    } else if (i7 == 39) {
                        Bundle f11 = p5.c.f(2, "type");
                        f11.putLong("dialog_id", -this.f51546b.f43674f1);
                        org.telegram.ui.Components.h90 h90Var = new org.telegram.ui.Components.h90(f11, null);
                        ProfileActivity profileActivity14 = this.f51546b;
                        h90Var.f35690c = profileActivity14.f43783v2;
                        profileActivity14.presentFragment(h90Var);
                    } else if (i7 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, this.f51546b.getParentActivity(), this.f51546b.A0);
                        alertDialog$Builder3.f28835a.S = org.telegram.messenger.gd.N0(2131754075, null);
                        alertDialog$Builder3.f28835a.U = org.telegram.messenger.gd.N0(2131754076, null);
                        alertDialog$Builder3.k(org.telegram.messenger.gd.N0(2131744674, null), new org.telegram.ui.ActionBar.q1(this) {
                            public final qv0 f50774b;

                            {
                                this.f50774b = this;
                            }

                            @Override
                            public final void i(org.telegram.ui.ActionBar.t1 r14, int r15) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ov0.i(org.telegram.ui.ActionBar.t1, int):void");
                            }
                        });
                        alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        this.f51546b.showDialog(alertDialog$Builder3.f28835a);
                    } else if (i7 == 44) {
                        i16 = ((org.telegram.ui.ActionBar.g2) this.f51546b).currentAccount;
                        long j13 = this.f51546b.f43666e1;
                        TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(i16).d2(j13);
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
                                        str4 = org.telegram.messenger.gd.N0(2131753095, null);
                                        break;
                                    }
                                }
                            }
                            if (str4 != null) {
                                vf.c.t(org.telegram.messenger.t0.f27013b, str4);
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
                        if (this.f51546b.getParentActivity() != null) {
                            if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.s2.f26830b) && this.f51546b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                this.f51546b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            zu0 zu0Var = this.f51546b.f43733o0;
                            org.telegram.messenger.fc D = zu0Var.D(zu0Var.getRealPosition());
                            if (D != null) {
                                if (D.f23985p == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i15 = ((org.telegram.ui.ActionBar.g2) this.f51546b).currentAccount;
                                org.telegram.messenger.w7.G(i15);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = D.f23976f;
                                if (z10) {
                                    str3 = "mp4";
                                }
                                File J = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated2, str3, true, true);
                                if (z10 && !J.exists()) {
                                    J = new File(org.telegram.messenger.w7.z(0), org.telegram.messenger.w7.r("mp4", D.f23976f));
                                }
                                if (J.exists()) {
                                    MediaController.d0(J.toString(), this.f51546b.getParentActivity(), 0, null, null, new ai.o2(9, this, z10));
                                }
                            }
                        }
                    } else if (i7 == 30) {
                        this.f51546b.presentFragment(new UserInfoActivity());
                    } else if (i7 == 40) {
                        ProfileActivity profileActivity15 = this.f51546b;
                        jm0 jm0Var = new jm0();
                        jm0Var.I = this.f51546b;
                        profileActivity15.presentFragment(jm0Var);
                    } else if (i7 == 42) {
                        TLRPC.User c25 = this.f51546b.getMessagesController().c2(Long.valueOf(this.f51546b.f43666e1));
                        if (org.telegram.messenger.g0.g(this.f51546b.getMessagesController().X2 + "/" + org.telegram.messenger.n10.o(c25))) {
                            org.telegram.ui.Components.kc.b0(this.f51546b).k(false).j();
                        }
                    } else if (i7 == 43) {
                        this.f51546b.presentFragment(new la(null));
                    } else if (i7 == 31) {
                        this.f51546b.presentFragment(new org.telegram.ui.ActionBar.g2(null));
                    } else if (i7 == 33) {
                        int realPosition = this.f51546b.f43733o0.getRealPosition();
                        TLRPC.Photo F = this.f51546b.f43733o0.F(realPosition);
                        if (F != null) {
                            zu0 zu0Var2 = this.f51546b.f43733o0;
                            ArrayList arrayList2 = zu0Var2.f35415c1;
                            ArrayList arrayList3 = zu0Var2.f35414b1;
                            ArrayList arrayList4 = zu0Var2.f35413a1;
                            ArrayList arrayList5 = zu0Var2.Z0;
                            ArrayList arrayList6 = zu0Var2.X0;
                            ArrayList arrayList7 = zu0Var2.V0;
                            ArrayList arrayList8 = zu0Var2.Y0;
                            ArrayList arrayList9 = zu0Var2.W0;
                            org.telegram.messenger.uo uoVar = zu0Var2.T0;
                            if (uoVar != null) {
                                uoVar.c(realPosition);
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                zu0Var2.f35416d1++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList10 = zu0Var2.U0;
                                arrayList10.add(0, (String) arrayList10.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (org.telegram.messenger.fc) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (org.telegram.messenger.fc) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (org.telegram.messenger.fc) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (org.telegram.ui.Components.s51) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                zu0Var2.Q0 = (org.telegram.messenger.fc) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f28626id = tL_inputPhoto;
                            tL_inputPhoto.f28511id = F.f28516id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            org.telegram.messenger.i10 userConfig = this.f51546b.getUserConfig();
                            this.f51546b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new mo0(this, userConfig, F, 6));
                            ProfileActivity profileActivity16 = this.f51546b;
                            UndoView undoView = profileActivity16.M;
                            long j14 = profileActivity16.f43666e1;
                            if (F.video_sizes.isEmpty()) {
                                num = null;
                            } else {
                                num = 1;
                            }
                            undoView.m(j14, num, 22);
                            TLRPC.User c26 = this.f51546b.getMessagesController().c2(Long.valueOf(userConfig.f24656n));
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F.sizes, 800, false, null, false);
                            if (c26 != null) {
                                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F.sizes, 90, false, null, false);
                                TLRPC.UserProfilePhoto userProfilePhoto = c26.photo;
                                userProfilePhoto.photo_id = F.f28516id;
                                userProfilePhoto.photo_small = w11.location;
                                userProfilePhoto.photo_big = w10.location;
                                userConfig.w(c26);
                                userConfig.v(true);
                                i14 = ((org.telegram.ui.ActionBar.g2) this.f51546b).currentAccount;
                                org.telegram.messenger.ks.f(i14).k(org.telegram.messenger.ks.f25233j0, new Object[0]);
                                this.f51546b.M5(true);
                            }
                            zu0 zu0Var3 = this.f51546b.f43733o0;
                            zu0Var3.E0.g();
                            zu0Var3.L();
                        }
                    } else if (i7 == 34) {
                        i10 = ((org.telegram.ui.ActionBar.g2) this.f51546b).currentAccount;
                        if (org.telegram.messenger.mp.u1(i10).A2()) {
                            i13 = ((org.telegram.ui.ActionBar.g2) this.f51546b).currentAccount;
                            b.b(i13);
                            return;
                        }
                        int realPosition2 = this.f51546b.f43733o0.getRealPosition();
                        org.telegram.messenger.fc D2 = this.f51546b.f43733o0.D(realPosition2);
                        if (D2 != null) {
                            i11 = ((org.telegram.ui.ActionBar.g2) this.f51546b).currentAccount;
                            org.telegram.messenger.w7.G(i11);
                            Drawable[] drawableArr = PhotoViewer.f43272f9;
                            File J2 = org.telegram.messenger.w7.J(D2.f23976f, PhotoViewer.m1(D2), true, true);
                            if (D2.f23985p == 2) {
                                z12 = true;
                            }
                            if (z12) {
                                org.telegram.messenger.fc G = this.f51546b.f43733o0.G(realPosition2);
                                i12 = ((org.telegram.ui.ActionBar.g2) this.f51546b).currentAccount;
                                org.telegram.messenger.w7.G(i12);
                                if (G != null) {
                                    tL_fileLocationToBeDeprecated = G.f23976f;
                                }
                                str2 = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated, PhotoViewer.m1(G), true, true).getAbsolutePath();
                            }
                            this.f51546b.f43754r0.p(J2.getAbsolutePath(), str2, z12);
                        }
                    } else if (i7 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.f51546b.getParentActivity(), this.f51546b.A0);
                        zu0 zu0Var4 = this.f51546b.f43733o0;
                        org.telegram.messenger.fc D3 = zu0Var4.D(zu0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.f23985p == 2) {
                                alertDialog$Builder4.f28835a.S = org.telegram.messenger.gd.N0(2131754080, null);
                                alertDialog$Builder4.f28835a.U = org.telegram.messenger.gd.N0(2131754082, null);
                            } else {
                                alertDialog$Builder4.f28835a.S = org.telegram.messenger.gd.N0(2131754091, null);
                                alertDialog$Builder4.f28835a.U = org.telegram.messenger.gd.N0(2131754093, null);
                            }
                            alertDialog$Builder4.k(org.telegram.messenger.gd.N0(2131751586, null), new org.telegram.ui.ActionBar.q1(this) {
                                public final qv0 f50774b;

                                {
                                    this.f50774b = this;
                                }

                                @Override
                                public final void i(org.telegram.ui.ActionBar.t1 r14, int r15) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ov0.i(org.telegram.ui.ActionBar.t1, int):void");
                                }
                            });
                            alertDialog$Builder4.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder4.f28835a;
                            this.f51546b.showDialog(t1Var3);
                            TextView textView4 = (TextView) t1Var3.d(-1);
                            if (textView4 != null) {
                                org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.f29692q7, this.f51546b.A0);
                            }
                        }
                    } else if (i7 == 36) {
                        this.f51546b.L4();
                    }
                } else {
                    ProfileActivity profileActivity17 = this.f51546b;
                    if (i7 == 16) {
                        z11 = true;
                    }
                    profileActivity17.F4(z11);
                }
            }
        }
    }
}
