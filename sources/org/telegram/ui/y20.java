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

public final class y20 implements View.OnClickListener {

    public final w5 f44685a = new w5(this, 5);

    public final s50 f44686b;

    public y20(s50 s50Var) {
        this.f44686b = s50Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.x30 x30Var;
        int i10;
        LaunchActivity launchActivity;
        s50 s50Var = this.f44686b;
        w20 w20Var = s50Var.f42506x;
        ArrayList arrayList = s50Var.m0;
        org.telegram.ui.Components.voip.u2 u2Var = s50Var.f42501w;
        org.telegram.ui.Components.oi0 oi0Var = s50Var.G0;
        AccountInstance accountInstance = s50Var.d;
        if (s50Var.W0 == null || s50Var.B1 == 3) {
            return;
        }
        int i11 = 0;
        if (s50Var.r1() && !s50Var.W0.isScheduled()) {
            j30 j30Var = s50Var.W1;
            if (j30Var != null && j30Var.f33648b && (AndroidUtilities.isTablet() || s50.B3 == s50Var.q1())) {
                s50Var.e1(null);
                if (s50.B3) {
                    AndroidUtilities.runOnUIThread(new r00(this, 5), 200L);
                }
                s50Var.f42427e0.setRequestedOrientation(-1);
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
            if (AndroidUtilities.isTablet()) {
                s50Var.e1(videoParticipant);
                return;
            }
            if (s50.B3 == s50Var.q1()) {
                s50Var.e1(videoParticipant);
            }
            if (s50Var.q1()) {
                s50Var.f42427e0.setRequestedOrientation(6);
                return;
            } else {
                s50Var.f42427e0.setRequestedOrientation(1);
                return;
            }
        }
        int i12 = s50Var.B1;
        if (i12 == 5) {
            if (s50Var.D1) {
                return;
            }
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            s50Var.D1 = true;
            TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
            startscheduledgroupcall.call = s50Var.W0.getInputGroupCall();
            final int i13 = 0;
            accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {

                public final y20 f44261b;

                {
                    this.f44261b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            y20 y20Var = this.f44261b;
                            if (tLObject == null) {
                                y20Var.getClass();
                            } else {
                                y20Var.f44686b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            break;
                        default:
                            y20 y20Var2 = this.f44261b;
                            if (tLObject == null) {
                                y20Var2.getClass();
                            } else {
                                y20Var2.f44686b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (i12 == 7 || i12 == 6) {
            if (i12 == 6 && (x30Var = s50Var.f42448j0) != null) {
                x30Var.b(true);
            }
            TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
            togglegroupcallstartsubscription.call = s50Var.W0.getInputGroupCall();
            TLRPC.GroupCall groupCall = s50Var.W0.call;
            boolean z10 = !groupCall.schedule_start_subscribed;
            groupCall.schedule_start_subscribed = z10;
            togglegroupcallstartsubscription.subscribed = z10;
            final int i14 = 1;
            accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {

                public final y20 f44261b;

                {
                    this.f44261b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i14) {
                        case 0:
                            y20 y20Var = this.f44261b;
                            if (tLObject == null) {
                                y20Var.getClass();
                            } else {
                                y20Var.f44686b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            break;
                        default:
                            y20 y20Var2 = this.f44261b;
                            if (tLObject == null) {
                                y20Var2.getClass();
                            } else {
                                y20Var2.f44686b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            break;
                    }
                }
            });
            s50Var.J1(s50Var.W0.call.schedule_start_subscribed ? 7 : 6, true);
            return;
        }
        if (VoIPService.getSharedInstance() == null || (i10 = s50Var.P1) == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
            return;
        }
        int i15 = s50Var.B1;
        if (i15 != 2 && i15 != 4) {
            try {
                if (i15 != 0) {
                    s50Var.J1(0, true);
                    VoIPService.getSharedInstance().setMicMute(true, false, true);
                    u2Var.performHapticFeedback(3, 2);
                    return;
                } else {
                    if (Build.VERSION.SDK_INT >= 23 && (launchActivity = s50Var.f42427e0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                        org.telegram.ui.Components.pd0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new cg.h(4));
                        return;
                    }
                    s50Var.J1(1, true);
                    VoIPService.getSharedInstance().setMicMute(false, false, true);
                    u2Var.performHapticFeedback(3, 2);
                    return;
                }
            } catch (Exception unused2) {
                return;
            }
        }
        if (s50Var.o1() || s50Var.H0) {
            return;
        }
        s50Var.H0 = true;
        AndroidUtilities.shakeView(u2Var.getTextView());
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused3) {
        }
        int iNextInt = Utilities.random.nextInt(100);
        int i16 = 120;
        if (iNextInt >= 32) {
            i11 = 240;
            if (iNextInt < 64) {
                i16 = 240;
                i11 = 120;
            } else {
                i16 = 420;
                if (iNextInt >= 97) {
                    i11 = 540;
                    if (iNextInt == 98) {
                        i16 = 540;
                        i11 = 420;
                    } else {
                        i16 = 720;
                    }
                }
            }
        }
        oi0Var.N(i16);
        oi0Var.P(i16 - 1, this.f44685a);
        w20Var.setAnimation(oi0Var);
        oi0Var.K(i11);
        w20Var.d();
        if (s50Var.B1 == 2) {
            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) s50Var.W0.participants.f(MessageObject.getPeerId(s50Var.f42502w0))).peer);
            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
            s50Var.J1(4, true);
        }
    }
}
