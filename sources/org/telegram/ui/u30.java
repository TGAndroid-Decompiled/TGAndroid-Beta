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
public final class u30 implements View.OnClickListener {
    public final a6 f40252a = new a6(this, 5);
    public final n60 f40253b;

    public u30(n60 n60Var) {
        this.f40253b = n60Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.v40 v40Var;
        int i10;
        TLObject chat;
        n60 n60Var = this.f40253b;
        s30 s30Var = n60Var.f38252x;
        ArrayList arrayList = n60Var.f38221q0;
        org.telegram.ui.Components.voip.u2 u2Var = n60Var.f38247w;
        org.telegram.ui.Components.yj0 yj0Var = n60Var.K0;
        AccountInstance accountInstance = n60Var.d;
        if (n60Var.f38157a1 != null && n60Var.F1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (n60Var.s1() && !n60Var.f38157a1.isScheduled()) {
                e40 e40Var = n60Var.a2;
                if (e40Var != null && e40Var.f29950b && (AndroidUtilities.isTablet() || n60.F3 == n60Var.r1())) {
                    n60Var.f1(null);
                    if (n60.F3) {
                        AndroidUtilities.runOnUIThread(new zz(this, 6), 200L);
                    }
                    n60Var.f38190i0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        n60Var.f1(videoParticipant);
                        return;
                    }
                    if (n60.F3 == n60Var.r1()) {
                        n60Var.f1(videoParticipant);
                    }
                    if (n60Var.r1()) {
                        n60Var.f38190i0.setRequestedOrientation(6);
                        return;
                    } else {
                        n60Var.f38190i0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = n60Var.F1;
            if (i13 == 5) {
                if (!n60Var.H1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    n60Var.H1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = n60Var.f38157a1.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final u30 f39999b;

                        {
                            this.f39999b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    u30 u30Var = this.f39999b;
                                    if (tLObject != null) {
                                        u30Var.f40253b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        u30Var.getClass();
                                        return;
                                    }
                                default:
                                    u30 u30Var2 = this.f39999b;
                                    if (tLObject != null) {
                                        u30Var2.f40253b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        u30Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = n60Var.T1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = n60Var.F1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                LaunchActivity launchActivity = n60Var.f38190i0;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.df0.c(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new bi.f(16));
                                    return;
                                }
                                n60Var.K1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                u2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            n60Var.K1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            u2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!n60Var.p1() && !n60Var.L0) {
                        n60Var.L0 = true;
                        AndroidUtilities.shakeView(u2Var.getTextView());
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
                        yj0Var.P(i15);
                        yj0Var.S(i15 - 1, this.f40252a);
                        s30Var.setAnimation(yj0Var);
                        yj0Var.M(i12);
                        s30Var.d();
                        if (n60Var.F1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) n60Var.f38157a1.participants.f(MessageObject.getPeerId(n60Var.A0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            n60Var.K1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (v40Var = n60Var.f38209n0) != null) {
                    v40Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = n60Var.f38157a1.getInputGroupCall();
                TLRPC.GroupCall groupCall = n60Var.f38157a1.call;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final u30 f39999b;

                    {
                        this.f39999b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                u30 u30Var = this.f39999b;
                                if (tLObject != null) {
                                    u30Var.f40253b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    u30Var.getClass();
                                    return;
                                }
                            default:
                                u30 u30Var2 = this.f39999b;
                                if (tLObject != null) {
                                    u30Var2.f40253b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    u30Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (n60Var.f38157a1.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                n60Var.K1(i11, true);
            }
        }
    }
}
