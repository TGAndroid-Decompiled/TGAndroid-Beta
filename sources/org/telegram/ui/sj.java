package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sj extends org.telegram.ui.ActionBar.j {
    public final Context f41940a;
    public final eo f41941b;

    public sj(eo eoVar, Context context) {
        this.f41941b = eoVar;
        this.f41940a = context;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        boolean z11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User user2;
        boolean z12;
        boolean z13;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i12;
        int i13;
        ?? r92;
        boolean z14;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z15;
        TLRPC.User user3;
        org.telegram.ui.ActionBar.k kVar;
        eo eoVar = this.f41941b;
        SparseArray[] sparseArrayArr = eoVar.Y5;
        SparseArray[] sparseArrayArr2 = eoVar.X5;
        SparseArray[] sparseArrayArr3 = eoVar.W5;
        long j3 = 0;
        boolean z16 = true;
        int i18 = 0;
        if (i10 == -1) {
            if (!eoVar.f37481wc.f16089f) {
                kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
                if (kVar.u()) {
                    eoVar.C7(false);
                } else if (eoVar.R3 == 5 && (eoVar.f37449u6.isEmpty() || eoVar.f37237d4 == 0)) {
                    eoVar.Ub();
                } else if (eoVar.R3 == 6 && eoVar.Y.w()) {
                    eoVar.Ab(new Runnable(this) {
                        public final sj f40979b;

                        {
                            this.f40979b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f40979b.f41941b.finishFragment();
                                    return;
                                default:
                                    sj sjVar = this.f40979b;
                                    sjVar.getClass();
                                    eo eoVar2 = sjVar.f41941b;
                                    Intent intent = new Intent(eoVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", eoVar2.P3.link);
                                    eoVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!eoVar.a7(true, true)) {
                    eoVar.finishFragment();
                }
            } else {
                eoVar.xa();
            }
        } else if (i10 == 59) {
            if (eoVar.getUserConfig().getClientUserId() == eoVar.T5) {
                eoVar.getMessagesController().setSavedViewAs(true);
                eoVar.f37195a1.e(false, true);
                return;
            }
            eoVar.getMessagesController().getTopicsController().toggleViewForumAsMessages(-eoVar.T5, false);
            hg1.I0(eoVar);
        } else {
            String str = null;
            MessageObject messageObject = null;
            if (i10 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j10 = 0;
                int i19 = 1;
                while (i19 >= 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i20 = i18; i20 < sparseArrayArr2[i19].size(); i20++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i19].keyAt(i20)));
                    }
                    if (eoVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i21 = i18; i21 < arrayList.size(); i21++) {
                        MessageObject messageObject2 = (MessageObject) sparseArrayArr2[i19].get(((Integer) arrayList.get(i21)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user3 = eoVar.f37258f) == null || !user3.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) eo.I8(messageObject2, z15, j10));
                        j10 = messageObject2.getFromChatId();
                    }
                    i19--;
                    i18 = 0;
                }
                if (spannableStringBuilder.length() != 0) {
                    AndroidUtilities.addToClipboard(spannableStringBuilder);
                    eoVar.T7();
                    eoVar.y3.j(58, 0L, null);
                }
                eoVar.C7(false);
            } else if (i10 == 12) {
                if (eoVar.getParentActivity() != null) {
                    eoVar.I7(null, null, false);
                }
            } else if (i10 == 11) {
                eoVar.ga(true);
            } else if (i10 == 69) {
                eo.C1(eoVar);
            } else if (i10 == 70) {
                TLRPC.Chat chat = eoVar.f37246e;
                if (chat != null) {
                    eoVar.presentFragment(eo.W9(-chat.linked_monoforum_id));
                }
            } else if (i10 == 72) {
                long j11 = eoVar.T5;
                if (ChatObject.isMonoForum(eoVar.f37246e)) {
                    i17 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i17, eoVar.f37246e)) {
                        j11 = eoVar.f37237d4;
                        j3 = eoVar.T5;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                yh.n5.y(i16, false).i0(j11, j3, false, false);
            } else if (i10 == 71) {
                long j12 = eoVar.T5;
                if (ChatObject.isMonoForum(eoVar.f37246e)) {
                    i15 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                    if (ChatObject.canManageMonoForum(i15, eoVar.f37246e)) {
                        j12 = eoVar.f37237d4;
                        j3 = eoVar.T5;
                    }
                }
                long j13 = j12;
                long j14 = j3;
                i14 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                yh.n5.y(i14, false).C(j13, j14, new hh(this, j13, j14, 1));
            } else if (i10 == 28) {
                if (eoVar.f37218bb == null) {
                    eo.I1(eoVar);
                } else {
                    eoVar.p9();
                }
            } else if (i10 == 25) {
                ArrayList arrayList2 = new ArrayList();
                for (int i22 = 1; i22 >= 0; i22--) {
                    for (int i23 = 0; i23 < sparseArrayArr3[i22].size(); i23++) {
                        arrayList2.add((MessageObject) sparseArrayArr3[i22].valueAt(i23));
                    }
                    sparseArrayArr3[i22].clear();
                    sparseArrayArr2[i22].clear();
                    sparseArrayArr[i22].clear();
                }
                if (eoVar.f37265f6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                eoVar.h9();
                eoVar.Cc(0, true);
                eoVar.ad(false);
                MediaController.saveFilesFromMessages(eoVar.getParentActivity(), eoVar.getAccountInstance(), arrayList2, new qj(0, this, z14));
            } else if (i10 == 13) {
                if (eoVar.getParentActivity() != null) {
                    eoVar.showDialog(org.telegram.ui.Components.g5.U(eoVar.getParentActivity(), eoVar.h, eoVar.f37256ea).f20142a);
                }
            } else if (i10 != 15 && i10 != 16 && i10 != 26) {
                if (i10 == 17) {
                    if (eoVar.f37258f != null && eoVar.getParentActivity() != null) {
                        TextView textView = eoVar.L1;
                        if (textView != null && textView.getTag() != null) {
                            eoVar.vb(null, ((Integer) eoVar.L1.getTag()).intValue());
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", eoVar.f37258f.f19950id);
                        bundle.putBoolean("addContact", true);
                        eoVar.presentFragment(new ts(bundle));
                    }
                } else if (i10 == 18) {
                    eoVar.fc(false);
                } else if (i10 == 24) {
                    try {
                        eoVar.getMediaDataController().installShortcut(eoVar.f37258f.f19950id, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                } else if (i10 == 29) {
                    if (ChatObject.hasAdminRights(eoVar.f37246e)) {
                        y5 y5Var = new y5(eoVar.T5);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = eoVar.D1;
                        y5Var.R = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            y5Var.getMessagesController().getBoostsController().userCanBoostChannel(y5Var.P, y5Var.R, new p5(y5Var, 0));
                        }
                        eoVar.presentFragment(y5Var);
                        return;
                    }
                    eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(eoVar.T5));
                } else if (i10 == 21) {
                    int i24 = e41.v;
                    int currentAccount = eoVar.getCurrentAccount();
                    Activity parentActivity = eoVar.getParentActivity();
                    long a2 = eoVar.a();
                    if (parentActivity != null) {
                        e41.L(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i10 == 22) {
                    for (int i25 = 0; i25 < 2; i25++) {
                        for (int i26 = 0; i26 < sparseArrayArr[i25].size(); i26++) {
                            MessageObject messageObject3 = (MessageObject) sparseArrayArr[i25].valueAt(i26);
                            eoVar.getMediaDataController().addRecentSticker(2, messageObject3, messageObject3.getDocument(), (int) (System.currentTimeMillis() / 1000), !eoVar.Z5);
                        }
                    }
                    eoVar.C7(false);
                } else if (i10 == 23) {
                    for (int i27 = 1; i27 >= 0; i27--) {
                        if (messageObject == null && sparseArrayArr3[i27].size() == 1) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i28 = 0; i28 < sparseArrayArr3[i27].size(); i28++) {
                                arrayList3.add(Integer.valueOf(sparseArrayArr3[i27].keyAt(i28)));
                            }
                            messageObject = (MessageObject) eoVar.f37373o6[i27].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i27].clear();
                        sparseArrayArr2[i27].clear();
                        sparseArrayArr[i27].clear();
                    }
                    if (messageObject != null && messageObject.isTodo()) {
                        eoVar.f37238d5 = messageObject;
                        eoVar.Fa(109);
                        r92 = 0;
                    } else {
                        r92 = 0;
                        eoVar.bc(messageObject, false);
                    }
                    eoVar.h9();
                    eoVar.Cc(r92, true);
                    eoVar.ad(r92);
                } else if (i10 == 64) {
                    i12 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                    hg.b2 c10 = hg.c2.f(i12).c(eoVar.M8());
                    Activity parentActivity2 = eoVar.getParentActivity();
                    i13 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                    hg.z1.d0(parentActivity2, i13, eoVar.Q3, c10, eoVar.getResourceProvider(), new tc(9, this, c10));
                } else if (i10 == 14) {
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, this.f41940a, eoVar.getResourceProvider(), true, true);
                    e1Var.g(LocaleController.getString(R.string.AttachMenu), R.drawable.input_attach, null);
                    e1Var.setOnClickListener(new a(this, 12));
                    org.telegram.ui.ActionBar.u0 u0Var = eoVar.f37282h0;
                    org.telegram.ui.ActionBar.x xVar = eoVar.f37247e0;
                    xVar.a();
                    u0Var.M(e1Var, xVar.f21441m);
                } else if (i10 == 30) {
                    eoVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/help", eoVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i10 == 31) {
                    eoVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/settings", eoVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i10 == 40) {
                    if (eoVar.J9()) {
                        str = "";
                    }
                    eoVar.qa(str);
                } else if (i10 == 62) {
                    eoVar.getMessagesController().getTranslateController().setHideTranslateDialog(eoVar.a(), false, true);
                    if (!eoVar.getMessagesController().getTranslateController().toggleTranslatingDialog(eoVar.a(), true)) {
                        eoVar.Uc(true);
                    }
                } else if (i10 != 32 && i10 != 33) {
                    if (i10 == 50) {
                        sk skVar = eoVar.Y;
                        if (skVar != null && skVar.getEditField() != null) {
                            eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                            eoVar.Y.getEditField().makeSelectedBold();
                        }
                    } else if (i10 == 51) {
                        sk skVar2 = eoVar.Y;
                        if (skVar2 != null && skVar2.getEditField() != null) {
                            eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                            eoVar.Y.getEditField().makeSelectedItalic();
                        }
                    } else if (i10 == 57) {
                        sk skVar3 = eoVar.Y;
                        if (skVar3 != null && skVar3.getEditField() != null) {
                            eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                            eoVar.Y.getEditField().makeSelectedSpoiler();
                        }
                    } else if (i10 == 58) {
                        sk skVar4 = eoVar.Y;
                        if (skVar4 != null && skVar4.getEditField() != null) {
                            eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                            eoVar.Y.getEditField().makeSelectedQuote();
                        }
                    } else if (i10 == 52) {
                        sk skVar5 = eoVar.Y;
                        if (skVar5 != null && skVar5.getEditField() != null) {
                            eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                            eoVar.Y.getEditField().makeSelectedMono();
                        }
                    } else if (i10 == 55) {
                        sk skVar6 = eoVar.Y;
                        if (skVar6 != null && skVar6.getEditField() != null) {
                            eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                            eoVar.Y.getEditField().makeSelectedStrike();
                        }
                    } else if (i10 == 56) {
                        sk skVar7 = eoVar.Y;
                        if (skVar7 != null && skVar7.getEditField() != null) {
                            eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                            eoVar.Y.getEditField().makeSelectedUnderline();
                        }
                    } else if (i10 == 74) {
                        sk skVar8 = eoVar.Y;
                        if (skVar8 != null && skVar8.getEditField() != null) {
                            eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                            eoVar.Y.getEditField().makeSelectedDate();
                        }
                    } else if (i10 == 53) {
                        sk skVar9 = eoVar.Y;
                        if (skVar9 != null && skVar9.getEditField() != null) {
                            eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                            eoVar.Y.getEditField().makeSelectedUrl();
                        }
                    } else if (i10 == 54) {
                        sk skVar10 = eoVar.Y;
                        if (skVar10 != null && skVar10.getEditField() != null) {
                            eoVar.Y.getEditField().setSelectionOverride(eoVar.A4, eoVar.B4);
                            eoVar.Y.getEditField().makeSelectedRegular();
                        }
                    } else if (i10 == 27) {
                        eoVar.Bb();
                    } else if (i10 == 60) {
                        if (eoVar.f37225c4 != null) {
                            TopicsController topicsController = eoVar.getMessagesController().getTopicsController();
                            long j15 = eoVar.f37246e.f19803id;
                            TLRPC.TL_forumTopic tL_forumTopic = eoVar.f37225c4;
                            int i29 = tL_forumTopic.f19855id;
                            tL_forumTopic.closed = true;
                            topicsController.toggleCloseTopic(j15, i29, true);
                            eoVar.Vc();
                            eoVar.lc(false);
                            eoVar.Uc(true);
                        }
                    } else if (i10 == 61) {
                        hg1.I0(eoVar);
                    } else if (i10 == 65) {
                        AndroidUtilities.addToClipboard(eoVar.P3.link);
                        org.telegram.ui.Components.zc.a0(LaunchActivity.R()).k(false).j();
                    } else if (i10 == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final sj f40979b;

                            {
                                this.f40979b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f40979b.f41941b.finishFragment();
                                        return;
                                    default:
                                        sj sjVar = this.f40979b;
                                        sjVar.getClass();
                                        eo eoVar2 = sjVar.f41941b;
                                        Intent intent = new Intent(eoVar2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", eoVar2.P3.link);
                                        eoVar2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (eoVar.Y.w()) {
                            eoVar.Ab(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i10 == 67) {
                        Activity parentActivity3 = eoVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = eoVar.P3;
                        c6Var = ((org.telegram.ui.ActionBar.m2) eoVar).resourceProvider;
                        hg.w.b0(parentActivity3, i11, tL_businessChatLink, c6Var);
                    } else if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.getResourceProvider());
                        String string = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                        a2Var.R = string;
                        a2Var.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, 17));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        eoVar.showDialog(a2Var);
                        TextView textView2 = (TextView) a2Var.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(eoVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20800q7));
                        }
                    } else if (i10 == 73) {
                        df1 a02 = df1.a0(-eoVar.T5, 0L);
                        a02.f36797y = eoVar;
                        eoVar.presentFragment(a02);
                    } else if (i10 == 888) {
                        eoVar.dumpCanvas();
                    } else if (i10 == 889) {
                        HashSet hashSet = i4.f38620b1;
                        org.telegram.ui.Components.zc.a0(eoVar).t("No rich message copied", null).j();
                    }
                } else if (eoVar.f37258f != null && eoVar.getParentActivity() != null) {
                    TLRPC.User user4 = eoVar.f37258f;
                    if (i10 == 33) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TLRPC.UserFull userFull = eoVar.f37201a8;
                    if (userFull != null && userFull.video_calls_available) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.ui.Components.voip.g2.m(user4, z12, z13, eoVar.getParentActivity(), eoVar.getMessagesController().getUserFull(eoVar.f37258f.f19950id), eoVar.getAccountInstance());
                }
            } else if (eoVar.getParentActivity() != null) {
                if (i10 == 15 && ChatObject.isMonoForum(eoVar.f37246e)) {
                    if (eoVar.f37237d4 != 0 && (user2 = eoVar.getMessagesController().getUser(Long.valueOf(eoVar.f37237d4))) != null) {
                        org.telegram.ui.Components.g5.q(eoVar, -1, user2, eoVar.f37246e, true, new o(12, this, user2), eoVar.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = eoVar.Z7;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 == 26 || (i10 == 15 && eoVar.h == null && (((user = eoVar.f37258f) != null && !UserObject.isUserSelf(user) && !UserObject.isDeleted(eoVar.f37258f)) || ((chatFull = eoVar.Z7) != null && chatFull.can_delete_channel)))) {
                    boolean z17 = z10;
                    org.telegram.ui.Components.g5.q(eoVar, -1, eoVar.f37258f, eoVar.f37246e, z17, new rj(this, z17), eoVar.getResourceProvider());
                    return;
                }
                if (i10 == 15) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.Chat chat2 = eoVar.f37246e;
                TLRPC.User user5 = eoVar.f37258f;
                if (eoVar.h == null) {
                    z16 = false;
                }
                org.telegram.ui.Components.g5.r(eoVar, z11, chat2, user5, z16, true, false, z10, new i2.s(this, i10, z10));
            }
        }
    }
}
