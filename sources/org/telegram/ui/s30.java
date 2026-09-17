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
public final class s30 implements View.OnClickListener {
    public final w5 f37373a = new w5(this, 5);
    public final k60 f37374b;

    public s30(k60 k60Var) {
        this.f37374b = k60Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.i40 i40Var;
        int i10;
        TLObject chat;
        LaunchActivity launchActivity;
        k60 k60Var = this.f37374b;
        q30 q30Var = k60Var.f35106x;
        ArrayList arrayList = k60Var.f35075q0;
        org.telegram.ui.Components.voip.v2 v2Var = k60Var.f35101w;
        org.telegram.ui.Components.yi0 yi0Var = k60Var.K0;
        AccountInstance accountInstance = k60Var.d;
        if (k60Var.f35012a1 != null && k60Var.F1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (k60Var.r1() && !k60Var.f35012a1.isScheduled()) {
                c40 c40Var = k60Var.a2;
                if (c40Var != null && c40Var.f29035b && (AndroidUtilities.isTablet() || k60.F3 == k60Var.q1())) {
                    k60Var.e1(null);
                    if (k60.F3) {
                        AndroidUtilities.runOnUIThread(new i10(this, 5), 200L);
                    }
                    k60Var.f35045i0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        k60Var.e1(videoParticipant);
                        return;
                    }
                    if (k60.F3 == k60Var.q1()) {
                        k60Var.e1(videoParticipant);
                    }
                    if (k60Var.q1()) {
                        k60Var.f35045i0.setRequestedOrientation(6);
                        return;
                    } else {
                        k60Var.f35045i0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = k60Var.F1;
            if (i13 == 5) {
                if (!k60Var.H1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    k60Var.H1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = k60Var.f35012a1.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final s30 f37072b;

                        {
                            this.f37072b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    s30 s30Var = this.f37072b;
                                    if (tLObject != null) {
                                        s30Var.f37374b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        s30Var.getClass();
                                        return;
                                    }
                                default:
                                    s30 s30Var2 = this.f37072b;
                                    if (tLObject != null) {
                                        s30Var2.f37374b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        s30Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = k60Var.T1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = k60Var.F1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                if (Build.VERSION.SDK_INT >= 23 && (launchActivity = k60Var.f35045i0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.de0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new org.telegram.ui.ActionBar.k3(3));
                                    return;
                                }
                                k60Var.J1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                v2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            k60Var.J1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            v2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!k60Var.o1() && !k60Var.L0) {
                        k60Var.L0 = true;
                        AndroidUtilities.shakeView(v2Var.getTextView());
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
                        yi0Var.P(i15);
                        yi0Var.R(i15 - 1, this.f37373a);
                        q30Var.setAnimation(yi0Var);
                        yi0Var.M(i12);
                        q30Var.d();
                        if (k60Var.F1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) k60Var.f35012a1.participants.f(MessageObject.getPeerId(k60Var.A0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            k60Var.J1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (i40Var = k60Var.f35063n0) != null) {
                    i40Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = k60Var.f35012a1.getInputGroupCall();
                TLRPC.GroupCall groupCall = k60Var.f35012a1.call;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final s30 f37072b;

                    {
                        this.f37072b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                s30 s30Var = this.f37072b;
                                if (tLObject != null) {
                                    s30Var.f37374b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    s30Var.getClass();
                                    return;
                                }
                            default:
                                s30 s30Var2 = this.f37072b;
                                if (tLObject != null) {
                                    s30Var2.f37374b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    s30Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (k60Var.f35012a1.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                k60Var.J1(i11, true);
            }
        }
    }
}
