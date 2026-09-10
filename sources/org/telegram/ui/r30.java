package org.telegram.ui;

import android.os.Build;
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
public final class r30 implements View.OnClickListener {
    public final x5 f36202a = new x5(this, 5);
    public final j60 f36203b;

    public r30(j60 j60Var) {
        this.f36203b = j60Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.s40 s40Var;
        int i10;
        TLObject chat;
        LaunchActivity launchActivity;
        j60 j60Var = this.f36203b;
        p30 p30Var = j60Var.f34030x;
        ArrayList arrayList = j60Var.f33999q0;
        org.telegram.ui.Components.voip.u2 u2Var = j60Var.f34025w;
        org.telegram.ui.Components.hj0 hj0Var = j60Var.K0;
        AccountInstance accountInstance = j60Var.d;
        if (j60Var.f33936a1 != null && j60Var.F1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (j60Var.r1() && !j60Var.f33936a1.isScheduled()) {
                b40 b40Var = j60Var.a2;
                if (b40Var != null && b40Var.f28241b && (AndroidUtilities.isTablet() || j60.F3 == j60Var.q1())) {
                    j60Var.e1(null);
                    if (j60.F3) {
                        AndroidUtilities.runOnUIThread(new i10(this, 5), 200L);
                    }
                    j60Var.f33969i0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        j60Var.e1(videoParticipant);
                        return;
                    }
                    if (j60.F3 == j60Var.q1()) {
                        j60Var.e1(videoParticipant);
                    }
                    if (j60Var.q1()) {
                        j60Var.f33969i0.setRequestedOrientation(6);
                        return;
                    } else {
                        j60Var.f33969i0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = j60Var.F1;
            if (i13 == 5) {
                if (!j60Var.H1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    j60Var.H1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = j60Var.f33936a1.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final r30 f35959b;

                        {
                            this.f35959b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    r30 r30Var = this.f35959b;
                                    if (tLObject != null) {
                                        r30Var.f36203b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        r30Var.getClass();
                                        return;
                                    }
                                default:
                                    r30 r30Var2 = this.f35959b;
                                    if (tLObject != null) {
                                        r30Var2.f36203b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        r30Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = j60Var.T1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = j60Var.F1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                if (Build.VERSION.SDK_INT >= 23 && (launchActivity = j60Var.f33969i0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.me0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new org.telegram.ui.ActionBar.l3(3));
                                    return;
                                }
                                j60Var.J1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                u2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            j60Var.J1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            u2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!j60Var.o1() && !j60Var.L0) {
                        j60Var.L0 = true;
                        AndroidUtilities.shakeView(u2Var.getTextView());
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        int nextInt = Utilities.random.nextInt(100);
                        int i15 = 120;
                        if (nextInt >= 32) {
                            i12 = 240;
                            if (nextInt < 64) {
                                i15 = 240;
                                i12 = 120;
                            } else {
                                i15 = 420;
                                if (nextInt >= 97) {
                                    i12 = 540;
                                    if (nextInt == 98) {
                                        i15 = 540;
                                        i12 = 420;
                                    } else {
                                        i15 = 720;
                                    }
                                }
                            }
                        }
                        hj0Var.P(i15);
                        hj0Var.R(i15 - 1, this.f36202a);
                        p30Var.setAnimation(hj0Var);
                        hj0Var.M(i12);
                        p30Var.d();
                        if (j60Var.F1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) j60Var.f33936a1.participants.f(MessageObject.getPeerId(j60Var.A0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            j60Var.J1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (s40Var = j60Var.f33987n0) != null) {
                    s40Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = j60Var.f33936a1.getInputGroupCall();
                TLRPC.GroupCall groupCall = j60Var.f33936a1.call;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final r30 f35959b;

                    {
                        this.f35959b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                r30 r30Var = this.f35959b;
                                if (tLObject != null) {
                                    r30Var.f36203b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    r30Var.getClass();
                                    return;
                                }
                            default:
                                r30 r30Var2 = this.f35959b;
                                if (tLObject != null) {
                                    r30Var2.f36203b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    r30Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (j60Var.f33936a1.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                j60Var.J1(i11, true);
            }
        }
    }
}
