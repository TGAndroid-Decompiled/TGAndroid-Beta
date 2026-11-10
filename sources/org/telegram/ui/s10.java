package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class s10 implements View.OnClickListener {
    public final m4 f49617a = new m4(this, 6);
    public final f40 f49618b;

    public s10(f40 f40Var) {
        this.f49618b = f40Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.y20 y20Var;
        int i7;
        TLObject M0;
        f40 f40Var = this.f49618b;
        q10 q10Var = f40Var.f45597w1;
        ArrayList arrayList = f40Var.f45542k2;
        org.telegram.ui.Components.voip.n2 n2Var = f40Var.f45592v1;
        org.telegram.ui.Components.zg0 zg0Var = f40Var.E2;
        org.telegram.messenger.c cVar = f40Var.n1;
        if (f40Var.U2 != null && f40Var.f45612z3 != 3) {
            int i10 = 6;
            int i11 = 0;
            if (f40Var.u1() && !f40Var.U2.j()) {
                c20 c20Var = f40Var.U3;
                if (c20Var != null && c20Var.f39302b && (org.telegram.messenger.g0.Q1() || f40.f45503z5 == f40Var.t1())) {
                    f40Var.h1(null);
                    if (f40.f45503z5) {
                        org.telegram.messenger.g0.i3(new kz(this, 5), 200L);
                    }
                    f40Var.f45512c2.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(0);
                    if (org.telegram.messenger.g0.Q1()) {
                        f40Var.h1(s3Var);
                        return;
                    }
                    if (f40.f45503z5 == f40Var.t1()) {
                        f40Var.h1(s3Var);
                    }
                    if (f40Var.t1()) {
                        f40Var.f45512c2.setRequestedOrientation(6);
                        return;
                    } else {
                        f40Var.f45512c2.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i12 = f40Var.f45612z3;
            if (i12 == 5) {
                if (!f40Var.B3) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    f40Var.B3 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    org.telegram.messenger.r3 r3Var = f40Var.U2;
                    startscheduledgroupcall.call = r3Var.g(r3Var.f25225a);
                    ConnectionsManager.getInstance(cVar.f21770a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final s10 f49212b;

                        {
                            this.f49212b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    s10 s10Var = this.f49212b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.qp.s1(s10Var.f49618b.n1.f21770a).O3((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        s10Var.getClass();
                                        return;
                                    }
                                default:
                                    s10 s10Var2 = this.f49212b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.qp.s1(s10Var2.f49618b.n1.f21770a).O3((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        s10Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i12 != 7 && i12 != 6) {
                if (VoIPService.getSharedInstance() != null && (i7 = f40Var.N3) != 1 && i7 != 2 && i7 != 6 && i7 != 5) {
                    int i13 = f40Var.f45612z3;
                    if (i13 != 2 && i13 != 4) {
                        try {
                            if (i13 == 0) {
                                LaunchActivity launchActivity = f40Var.f45512c2;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    c8.ia.c(2131624120, 2131743283, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new di.e(17));
                                    return;
                                }
                                f40Var.P1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                n2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            f40Var.P1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            n2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!f40Var.r1() && !f40Var.F2) {
                        f40Var.F2 = true;
                        org.telegram.messenger.g0.F3(n2Var.getTextView());
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        int nextInt = Utilities.f21339b.nextInt(100);
                        int i14 = 120;
                        if (nextInt >= 32) {
                            i11 = 240;
                            if (nextInt >= 64) {
                                i14 = 420;
                                if (nextInt >= 97) {
                                    i11 = 540;
                                    if (nextInt != 98) {
                                        i14 = 720;
                                    }
                                }
                            }
                            int i15 = i11;
                            i11 = i14;
                            i14 = i15;
                        }
                        zg0Var.P(i14);
                        zg0Var.S(i14 - 1, this.f49617a);
                        q10Var.setAnimation(zg0Var);
                        zg0Var.M(i11);
                        q10Var.d();
                        if (f40Var.f45612z3 == 2) {
                            long B1 = org.telegram.messenger.ij.B1(((TLRPC.GroupCallParticipant) f40Var.U2.d.f(org.telegram.messenger.ij.B1(f40Var.f45588u2))).peer);
                            if (org.telegram.messenger.m5.E(B1)) {
                                M0 = org.telegram.messenger.qp.s1(cVar.f21770a).a2(Long.valueOf(B1));
                            } else {
                                M0 = org.telegram.messenger.qp.s1(cVar.f21770a).M0(Long.valueOf(-B1));
                            }
                            VoIPService.getSharedInstance().editCallMember(M0, null, null, null, Boolean.TRUE, null);
                            f40Var.P1(4, true);
                        }
                    }
                }
            } else {
                if (i12 == 6 && (y20Var = f40Var.f45531h2) != null) {
                    y20Var.a();
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                org.telegram.messenger.r3 r3Var2 = f40Var.U2;
                togglegroupcallstartsubscription.call = r3Var2.g(r3Var2.f25225a);
                TLRPC.GroupCall groupCall = f40Var.U2.f25226b;
                boolean z9 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z9;
                togglegroupcallstartsubscription.subscribed = z9;
                ConnectionsManager.getInstance(cVar.f21770a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final s10 f49212b;

                    {
                        this.f49212b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                s10 s10Var = this.f49212b;
                                if (tLObject != null) {
                                    org.telegram.messenger.qp.s1(s10Var.f49618b.n1.f21770a).O3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    s10Var.getClass();
                                    return;
                                }
                            default:
                                s10 s10Var2 = this.f49212b;
                                if (tLObject != null) {
                                    org.telegram.messenger.qp.s1(s10Var2.f49618b.n1.f21770a).O3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    s10Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (f40Var.U2.f25226b.schedule_start_subscribed) {
                    i10 = 7;
                }
                f40Var.P1(i10, true);
            }
        }
    }
}
