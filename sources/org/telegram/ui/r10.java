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
public final class r10 implements View.OnClickListener {
    public final m4 f51428a = new m4(this, 6);
    public final f40 f51429b;

    public r10(f40 f40Var) {
        this.f51429b = f40Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.m30 m30Var;
        int i7;
        TLObject O0;
        f40 f40Var = this.f51429b;
        p10 p10Var = f40Var.f47569x1;
        ArrayList arrayList = f40Var.f47513l2;
        org.telegram.ui.Components.voip.q2 q2Var = f40Var.f47564w1;
        org.telegram.ui.Components.oh0 oh0Var = f40Var.F2;
        org.telegram.messenger.c cVar = f40Var.f47526o1;
        if (f40Var.V2 != null && f40Var.E3 != 3) {
            int i10 = 6;
            int i11 = 0;
            if (f40Var.v1() && !f40Var.V2.j()) {
                b20 b20Var = f40Var.Z3;
                if (b20Var != null && b20Var.f41109b && (org.telegram.messenger.g0.Q1() || f40.E5 == f40Var.u1())) {
                    f40Var.i1(null);
                    if (f40.E5) {
                        org.telegram.messenger.g0.h3(new lz(this, 5), 200L);
                    }
                    f40Var.d2.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) arrayList.get(0);
                    if (org.telegram.messenger.g0.Q1()) {
                        f40Var.i1(u3Var);
                        return;
                    }
                    if (f40.E5 == f40Var.u1()) {
                        f40Var.i1(u3Var);
                    }
                    if (f40Var.u1()) {
                        f40Var.d2.setRequestedOrientation(6);
                        return;
                    } else {
                        f40Var.d2.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i12 = f40Var.E3;
            if (i12 == 5) {
                if (!f40Var.G3) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    f40Var.G3 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    org.telegram.messenger.t3 t3Var = f40Var.V2;
                    startscheduledgroupcall.call = t3Var.g(t3Var.f26949a);
                    ConnectionsManager.getInstance(cVar.f23202a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final r10 f51035b;

                        {
                            this.f51035b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    r10 r10Var = this.f51035b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.np.u1(r10Var.f51429b.f47526o1.f23202a).V3((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        r10Var.getClass();
                                        return;
                                    }
                                default:
                                    r10 r10Var2 = this.f51035b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.np.u1(r10Var2.f51429b.f47526o1.f23202a).V3((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        r10Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i12 != 7 && i12 != 6) {
                if (VoIPService.getSharedInstance() != null && (i7 = f40Var.S3) != 1 && i7 != 2 && i7 != 6 && i7 != 5) {
                    int i13 = f40Var.E3;
                    if (i13 != 2 && i13 != 4) {
                        try {
                            if (i13 == 0) {
                                LaunchActivity launchActivity = f40Var.d2;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    c8.na.c(2131624121, 2131743038, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new fi.e(18));
                                    return;
                                }
                                f40Var.S1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                q2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            f40Var.S1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            q2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!f40Var.s1() && !f40Var.G2) {
                        f40Var.G2 = true;
                        org.telegram.messenger.g0.D3(q2Var.getTextView());
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        int nextInt = Utilities.f22808b.nextInt(100);
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
                        oh0Var.P(i14);
                        oh0Var.S(i14 - 1, this.f51428a);
                        p10Var.setAnimation(oh0Var);
                        oh0Var.M(i11);
                        p10Var.d();
                        if (f40Var.E3 == 2) {
                            long B1 = org.telegram.messenger.gj.B1(((TLRPC.GroupCallParticipant) f40Var.V2.d.f(org.telegram.messenger.gj.B1(f40Var.f47560v2))).peer);
                            if (org.telegram.messenger.n5.E(B1)) {
                                O0 = org.telegram.messenger.np.u1(cVar.f23202a).c2(Long.valueOf(B1));
                            } else {
                                O0 = org.telegram.messenger.np.u1(cVar.f23202a).O0(Long.valueOf(-B1));
                            }
                            VoIPService.getSharedInstance().editCallMember(O0, null, null, null, Boolean.TRUE, null);
                            f40Var.S1(4, true);
                        }
                    }
                }
            } else {
                if (i12 == 6 && (m30Var = f40Var.f47502i2) != null) {
                    m30Var.a();
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                org.telegram.messenger.t3 t3Var2 = f40Var.V2;
                togglegroupcallstartsubscription.call = t3Var2.g(t3Var2.f26949a);
                TLRPC.GroupCall groupCall = f40Var.V2.f26950b;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                ConnectionsManager.getInstance(cVar.f23202a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final r10 f51035b;

                    {
                        this.f51035b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                r10 r10Var = this.f51035b;
                                if (tLObject != null) {
                                    org.telegram.messenger.np.u1(r10Var.f51429b.f47526o1.f23202a).V3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    r10Var.getClass();
                                    return;
                                }
                            default:
                                r10 r10Var2 = this.f51035b;
                                if (tLObject != null) {
                                    org.telegram.messenger.np.u1(r10Var2.f51429b.f47526o1.f23202a).V3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    r10Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (f40Var.V2.f26950b.schedule_start_subscribed) {
                    i10 = 7;
                }
                f40Var.S1(i10, true);
            }
        }
    }
}
