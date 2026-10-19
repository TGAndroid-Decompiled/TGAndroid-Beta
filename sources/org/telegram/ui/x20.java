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
public final class x20 implements View.OnClickListener {
    public final a6 f42992a = new a6(this, 5);
    public final q50 f42993b;

    public x20(q50 q50Var) {
        this.f42993b = q50Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.r40 r40Var;
        int i10;
        TLObject chat;
        q50 q50Var = this.f42993b;
        v20 v20Var = q50Var.f40470x;
        ArrayList arrayList = q50Var.f40439q0;
        org.telegram.ui.Components.voip.t2 t2Var = q50Var.f40465w;
        org.telegram.ui.Components.uj0 uj0Var = q50Var.K0;
        AccountInstance accountInstance = q50Var.d;
        if (q50Var.f40375a1 != null && q50Var.F1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (q50Var.s1() && !q50Var.f40375a1.isScheduled()) {
                h30 h30Var = q50Var.a2;
                if (h30Var != null && h30Var.f31565b && (AndroidUtilities.isTablet() || q50.F3 == q50Var.r1())) {
                    q50Var.f1(null);
                    if (q50.F3) {
                        AndroidUtilities.runOnUIThread(new dz(this, 6), 200L);
                    }
                    q50Var.f40408i0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        q50Var.f1(videoParticipant);
                        return;
                    }
                    if (q50.F3 == q50Var.r1()) {
                        q50Var.f1(videoParticipant);
                    }
                    if (q50Var.r1()) {
                        q50Var.f40408i0.setRequestedOrientation(6);
                        return;
                    } else {
                        q50Var.f40408i0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = q50Var.F1;
            if (i13 == 5) {
                if (!q50Var.H1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    q50Var.H1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = q50Var.f40375a1.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final x20 f42443b;

                        {
                            this.f42443b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    x20 x20Var = this.f42443b;
                                    if (tLObject != null) {
                                        x20Var.f42993b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        x20Var.getClass();
                                        return;
                                    }
                                default:
                                    x20 x20Var2 = this.f42443b;
                                    if (tLObject != null) {
                                        x20Var2.f42993b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        x20Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = q50Var.T1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = q50Var.F1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                LaunchActivity launchActivity = q50Var.f40408i0;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.we0.c(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ci.e(16));
                                    return;
                                }
                                q50Var.K1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                t2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            q50Var.K1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            t2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!q50Var.p1() && !q50Var.L0) {
                        q50Var.L0 = true;
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
                        uj0Var.S(i15 - 1, this.f42992a);
                        v20Var.setAnimation(uj0Var);
                        uj0Var.M(i12);
                        v20Var.d();
                        if (q50Var.F1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) q50Var.f40375a1.participants.f(MessageObject.getPeerId(q50Var.A0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            q50Var.K1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (r40Var = q50Var.f40427n0) != null) {
                    r40Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = q50Var.f40375a1.getInputGroupCall();
                TLRPC.GroupCall groupCall = q50Var.f40375a1.call;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final x20 f42443b;

                    {
                        this.f42443b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                x20 x20Var = this.f42443b;
                                if (tLObject != null) {
                                    x20Var.f42993b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    x20Var.getClass();
                                    return;
                                }
                            default:
                                x20 x20Var2 = this.f42443b;
                                if (tLObject != null) {
                                    x20Var2.f42993b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    x20Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (q50Var.f40375a1.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                q50Var.K1(i11, true);
            }
        }
    }
}
