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
public final class v20 implements View.OnClickListener {
    public final v5 f43369a = new v5(this, 5);
    public final o50 f43370b;

    public v20(o50 o50Var) {
        this.f43370b = o50Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.s30 s30Var;
        int i9;
        TLObject chat;
        LaunchActivity launchActivity;
        o50 o50Var = this.f43370b;
        t20 t20Var = o50Var.f40977x;
        ArrayList arrayList = o50Var.m0;
        org.telegram.ui.Components.voip.u2 u2Var = o50Var.f40972w;
        org.telegram.ui.Components.mi0 mi0Var = o50Var.G0;
        AccountInstance accountInstance = o50Var.d;
        if (o50Var.W0 != null && o50Var.B1 != 3) {
            int i10 = 6;
            int i11 = 0;
            if (o50Var.r1() && !o50Var.W0.isScheduled()) {
                g30 g30Var = o50Var.W1;
                if (g30Var != null && g30Var.f33598b && (AndroidUtilities.isTablet() || o50.B3 == o50Var.q1())) {
                    o50Var.e1(null);
                    if (o50.B3) {
                        AndroidUtilities.runOnUIThread(new o00(this, 5), 200L);
                    }
                    o50Var.f40898e0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        o50Var.e1(videoParticipant);
                        return;
                    }
                    if (o50.B3 == o50Var.q1()) {
                        o50Var.e1(videoParticipant);
                    }
                    if (o50Var.q1()) {
                        o50Var.f40898e0.setRequestedOrientation(6);
                        return;
                    } else {
                        o50Var.f40898e0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i12 = o50Var.B1;
            if (i12 == 5) {
                if (!o50Var.D1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    o50Var.D1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = o50Var.W0.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final v20 f43117b;

                        {
                            this.f43117b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    v20 v20Var = this.f43117b;
                                    if (tLObject != null) {
                                        v20Var.f43370b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        v20Var.getClass();
                                        return;
                                    }
                                default:
                                    v20 v20Var2 = this.f43117b;
                                    if (tLObject != null) {
                                        v20Var2.f43370b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        v20Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i12 != 7 && i12 != 6) {
                if (VoIPService.getSharedInstance() != null && (i9 = o50Var.P1) != 1 && i9 != 2 && i9 != 6 && i9 != 5) {
                    int i13 = o50Var.B1;
                    if (i13 != 2 && i13 != 4) {
                        try {
                            if (i13 == 0) {
                                if (Build.VERSION.SDK_INT >= 23 && (launchActivity = o50Var.f40898e0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.kd0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new bg.k(4));
                                    return;
                                }
                                o50Var.J1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                u2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            o50Var.J1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            u2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!o50Var.o1() && !o50Var.H0) {
                        o50Var.H0 = true;
                        AndroidUtilities.shakeView(u2Var.getTextView());
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        int nextInt = Utilities.random.nextInt(100);
                        int i14 = 120;
                        if (nextInt >= 32) {
                            i11 = 240;
                            if (nextInt < 64) {
                                i14 = 240;
                                i11 = 120;
                            } else {
                                i14 = 420;
                                if (nextInt >= 97) {
                                    i11 = 540;
                                    if (nextInt == 98) {
                                        i14 = 540;
                                        i11 = 420;
                                    } else {
                                        i14 = 720;
                                    }
                                }
                            }
                        }
                        mi0Var.N(i14);
                        mi0Var.P(i14 - 1, this.f43369a);
                        t20Var.setAnimation(mi0Var);
                        mi0Var.K(i11);
                        t20Var.d();
                        if (o50Var.B1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) o50Var.W0.participants.f(MessageObject.getPeerId(o50Var.f40973w0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            o50Var.J1(4, true);
                        }
                    }
                }
            } else {
                if (i12 == 6 && (s30Var = o50Var.f40919j0) != null) {
                    s30Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = o50Var.W0.getInputGroupCall();
                TLRPC.GroupCall groupCall = o50Var.W0.call;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final v20 f43117b;

                    {
                        this.f43117b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                v20 v20Var = this.f43117b;
                                if (tLObject != null) {
                                    v20Var.f43370b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    v20Var.getClass();
                                    return;
                                }
                            default:
                                v20 v20Var2 = this.f43117b;
                                if (tLObject != null) {
                                    v20Var2.f43370b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    v20Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (o50Var.W0.call.schedule_start_subscribed) {
                    i10 = 7;
                }
                o50Var.J1(i10, true);
            }
        }
    }
}
