package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class z20 implements View.OnClickListener {
    public final a6 f43527a = new a6(this, 5);
    public final s50 f43528b;

    public z20(s50 s50Var) {
        this.f43528b = s50Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.r40 r40Var;
        int i10;
        TLObject chat;
        s50 s50Var = this.f43528b;
        x20 x20Var = s50Var.f41008x;
        ArrayList arrayList = s50Var.f40977q0;
        org.telegram.ui.Components.voip.t2 t2Var = s50Var.f41003w;
        org.telegram.ui.Components.uj0 uj0Var = s50Var.K0;
        AccountInstance accountInstance = s50Var.d;
        if (s50Var.f40913a1 != null && s50Var.F1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (s50Var.s1() && !s50Var.f40913a1.isScheduled()) {
                j30 j30Var = s50Var.a2;
                if (j30Var != null && j30Var.f31554b && (AndroidUtilities.isTablet() || s50.F3 == s50Var.r1())) {
                    s50Var.f1(null);
                    if (s50.F3) {
                        AndroidUtilities.runOnUIThread(new fz(this, 6), 200L);
                    }
                    s50Var.f40946i0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        s50Var.f1(videoParticipant);
                        return;
                    }
                    if (s50.F3 == s50Var.r1()) {
                        s50Var.f1(videoParticipant);
                    }
                    if (s50Var.r1()) {
                        s50Var.f40946i0.setRequestedOrientation(6);
                        return;
                    } else {
                        s50Var.f40946i0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = s50Var.F1;
            if (i13 == 5) {
                if (!s50Var.H1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    s50Var.H1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = s50Var.f40913a1.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final z20 f43314b;

                        {
                            this.f43314b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    z20 z20Var = this.f43314b;
                                    if (tLObject != null) {
                                        z20Var.f43528b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        z20Var.getClass();
                                        return;
                                    }
                                default:
                                    z20 z20Var2 = this.f43314b;
                                    if (tLObject != null) {
                                        z20Var2.f43528b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        z20Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = s50Var.T1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = s50Var.F1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                LaunchActivity launchActivity = s50Var.f40946i0;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.we0.c(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ci.e(16));
                                    return;
                                }
                                s50Var.K1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                t2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            s50Var.K1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            t2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!s50Var.p1() && !s50Var.L0) {
                        s50Var.L0 = true;
                        AndroidUtilities.shakeView(t2Var.getTextView());
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        int nextInt = Utilities.random.nextInt(100);
                        int i15 = 120;
                        if (nextInt >= 32) {
                            i12 = 240;
                            if (nextInt >= 64) {
                                i15 = 420;
                                if (nextInt >= 97) {
                                    i12 = 540;
                                    if (nextInt != 98) {
                                        i15 = 720;
                                    }
                                }
                            }
                            int i16 = i12;
                            i12 = i15;
                            i15 = i16;
                        }
                        uj0Var.P(i15);
                        uj0Var.S(i15 - 1, this.f43527a);
                        x20Var.setAnimation(uj0Var);
                        uj0Var.M(i12);
                        x20Var.d();
                        if (s50Var.F1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) s50Var.f40913a1.participants.f(MessageObject.getPeerId(s50Var.A0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            s50Var.K1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (r40Var = s50Var.f40965n0) != null) {
                    r40Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = s50Var.f40913a1.getInputGroupCall();
                TLRPC.GroupCall groupCall = s50Var.f40913a1.call;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final z20 f43314b;

                    {
                        this.f43314b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                z20 z20Var = this.f43314b;
                                if (tLObject != null) {
                                    z20Var.f43528b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    z20Var.getClass();
                                    return;
                                }
                            default:
                                z20 z20Var2 = this.f43314b;
                                if (tLObject != null) {
                                    z20Var2.f43528b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    z20Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (s50Var.f40913a1.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                s50Var.K1(i11, true);
            }
        }
    }
}
