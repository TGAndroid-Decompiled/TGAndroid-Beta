package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class r40 extends s4.o {
    public final q50 f41060b;

    public r40(q50 q50Var) {
        this.f41060b = q50Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        q50 q50Var = this.f41060b;
        k50 k50Var = q50Var.P;
        int i17 = k50Var.f38426w;
        if (i17 >= 0) {
            int i18 = q50Var.f40411h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = k50Var.f38427x;
        if (i19 >= 0) {
            int i20 = q50Var.f40464u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = k50Var.f38428y;
        if (i21 >= 0) {
            int i22 = q50Var.f40468v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = k50Var.K;
        if (i23 >= 0) {
            int i24 = q50Var.f40407g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = k50Var.J;
        if (i25 >= 0) {
            int i26 = q50Var.f40460t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = k50Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == q50Var.f40456s3) {
            return true;
        }
        int i28 = q50Var.I0;
        if (i10 == i28 - 1 && i11 == k50Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != k50Var.F - 1) {
            if (i11 >= k50Var.G && i11 < k50Var.H && i10 >= (i16 = q50Var.f40446q3) && i10 < q50Var.f40451r3) {
                return ((ChatObject.VideoParticipant) q50Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) q50Var.f40443q0.get(i11 - q50Var.P.G));
            }
            if (i11 >= k50Var.d && i11 < k50Var.e && i10 >= (i15 = q50Var.f40415i3) && i10 < q50Var.f40419j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) q50Var.D0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(q50Var.f40379a1.visibleParticipants.get(i11 - q50Var.P.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= k50Var.f38422f && i11 < k50Var.h && i10 >= (i14 = q50Var.f40423k3) && i10 < q50Var.f40426l3) {
                return ((Long) q50Var.F0.get(i10 - i14)).equals(q50Var.f40379a1.invitedUsers.get(i11 - q50Var.P.f38422f));
            } else {
                if (i11 >= k50Var.f38423n && i11 < k50Var.f38424r && i10 >= (i13 = q50Var.f40429m3) && i10 < q50Var.f40434n3) {
                    return ((Long) q50Var.G0.get(i10 - i13)).equals(q50Var.f40379a1.shadyJoinParticipants.get(i11 - q50Var.P.f38423n));
                }
                if (i11 >= k50Var.f38425s && i11 < k50Var.v && i10 >= (i12 = q50Var.f40438o3) && i10 < q50Var.f40442p3) {
                    return ((Long) q50Var.H0.get(i10 - i12)).equals(q50Var.f40379a1.shadyLeftParticipants.get(i11 - q50Var.P.f38425s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f41060b.P.F;
    }

    @Override
    public final int e() {
        return this.f41060b.I0;
    }
}
