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
public final class z20 implements View.OnClickListener {
    public final w5 f45040a = new w5(this, 5);
    public final r50 f45041b;

    public z20(r50 r50Var) {
        this.f45041b = r50Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.g40 g40Var;
        int i10;
        TLObject chat;
        LaunchActivity launchActivity;
        r50 r50Var = this.f45041b;
        x20 x20Var = r50Var.f41964x;
        ArrayList arrayList = r50Var.m0;
        org.telegram.ui.Components.voip.x2 x2Var = r50Var.f41959w;
        org.telegram.ui.Components.xi0 xi0Var = r50Var.G0;
        AccountInstance accountInstance = r50Var.d;
        if (r50Var.W0 != null && r50Var.B1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (r50Var.r1() && !r50Var.W0.isScheduled()) {
                j30 j30Var = r50Var.W1;
                if (j30Var != null && j30Var.f33796b && (AndroidUtilities.isTablet() || r50.B3 == r50Var.q1())) {
                    r50Var.e1(null);
                    if (r50.B3) {
                        AndroidUtilities.runOnUIThread(new q00(this, 5), 200L);
                    }
                    r50Var.f41885e0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        r50Var.e1(videoParticipant);
                        return;
                    }
                    if (r50.B3 == r50Var.q1()) {
                        r50Var.e1(videoParticipant);
                    }
                    if (r50Var.q1()) {
                        r50Var.f41885e0.setRequestedOrientation(6);
                        return;
                    } else {
                        r50Var.f41885e0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = r50Var.B1;
            if (i13 == 5) {
                if (!r50Var.D1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    r50Var.D1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = r50Var.W0.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final z20 f44709b;

                        {
                            this.f44709b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    z20 z20Var = this.f44709b;
                                    if (tLObject != null) {
                                        z20Var.f45041b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        z20Var.getClass();
                                        return;
                                    }
                                default:
                                    z20 z20Var2 = this.f44709b;
                                    if (tLObject != null) {
                                        z20Var2.f45041b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
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
                if (VoIPService.getSharedInstance() != null && (i10 = r50Var.P1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = r50Var.B1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                if (Build.VERSION.SDK_INT >= 23 && (launchActivity = r50Var.f41885e0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.yd0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new eg.h(4));
                                    return;
                                }
                                r50Var.J1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                x2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            r50Var.J1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            x2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!r50Var.o1() && !r50Var.H0) {
                        r50Var.H0 = true;
                        AndroidUtilities.shakeView(x2Var.getTextView());
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
                        xi0Var.N(i15);
                        xi0Var.P(i15 - 1, this.f45040a);
                        x20Var.setAnimation(xi0Var);
                        xi0Var.K(i12);
                        x20Var.d();
                        if (r50Var.B1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) r50Var.W0.participants.f(MessageObject.getPeerId(r50Var.f41960w0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            r50Var.J1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (g40Var = r50Var.f41906j0) != null) {
                    g40Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = r50Var.W0.getInputGroupCall();
                TLRPC.GroupCall groupCall = r50Var.W0.call;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final z20 f44709b;

                    {
                        this.f44709b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                z20 z20Var = this.f44709b;
                                if (tLObject != null) {
                                    z20Var.f45041b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    z20Var.getClass();
                                    return;
                                }
                            default:
                                z20 z20Var2 = this.f44709b;
                                if (tLObject != null) {
                                    z20Var2.f45041b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    z20Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (r50Var.W0.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                r50Var.J1(i11, true);
            }
        }
    }
}
