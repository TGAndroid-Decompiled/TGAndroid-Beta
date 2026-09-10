package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class t01 extends s4.o {
    public int f36806b;
    public final SparseIntArray f36807c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList e = new ArrayList();
    public final ArrayList f36808f = new ArrayList();
    public int f36809g;
    public int h;
    public final ProfileActivity f36810i;

    public t01(ProfileActivity profileActivity) {
        this.f36810i = profileActivity;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatParticipant chatParticipant2;
        ProfileActivity profileActivity = this.f36810i;
        if (i11 >= profileActivity.f30494u4 && i11 < profileActivity.f30501v4 && i10 >= this.f36809g && i10 < this.h) {
            ArrayList arrayList = this.f36808f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i10 - this.f36809g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i10 - this.f36809g);
            }
            if (!profileActivity.C2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.Q4.get(((Integer) profileActivity.R4.get(i11 - profileActivity.f30494u4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.Q4.get(i11 - profileActivity.f30494u4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i12 = this.f36807c.get(i10, -1);
        if (i12 != this.d.get(i11, -1) || i12 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f36810i.N2;
    }

    @Override
    public final int e() {
        return this.f36806b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i10;
        int i11;
        int i12;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f36810i;
        g(1, profileActivity.O2, sparseIntArray);
        g(2, profileActivity.P2, sparseIntArray);
        g(3, profileActivity.S2, sparseIntArray);
        g(4, profileActivity.T2, sparseIntArray);
        g(5, profileActivity.V2, sparseIntArray);
        g(6, profileActivity.W2, sparseIntArray);
        g(7, profileActivity.f30353a3, sparseIntArray);
        g(8, profileActivity.X2, sparseIntArray);
        g(9, profileActivity.f30369c3, sparseIntArray);
        g(10, profileActivity.f30361b3, sparseIntArray);
        g(11, profileActivity.Y2, sparseIntArray);
        g(12, profileActivity.Z2, sparseIntArray);
        g(13, profileActivity.f30376d3, sparseIntArray);
        g(14, profileActivity.f30383e3, sparseIntArray);
        g(15, profileActivity.f30391f3, sparseIntArray);
        g(16, profileActivity.f30398g3, sparseIntArray);
        g(17, profileActivity.f30370c4, sparseIntArray);
        g(18, profileActivity.f30377d4, sparseIntArray);
        g(19, profileActivity.f30392f4, sparseIntArray);
        g(20, profileActivity.f30406h4, sparseIntArray);
        g(21, profileActivity.f30399g4, sparseIntArray);
        g(22, profileActivity.f30405h3, sparseIntArray);
        g(23, profileActivity.f30412i3, sparseIntArray);
        g(24, profileActivity.f30431l3, sparseIntArray);
        g(25, profileActivity.j3, sparseIntArray);
        g(26, profileActivity.f30425k3, sparseIntArray);
        g(27, profileActivity.f30436m3, sparseIntArray);
        g(28, profileActivity.f30444n3, sparseIntArray);
        g(29, profileActivity.f30451o3, sparseIntArray);
        g(30, profileActivity.f30458p3, sparseIntArray);
        g(31, profileActivity.f30464q3, sparseIntArray);
        g(32, profileActivity.f30471r3, sparseIntArray);
        g(33, profileActivity.f30479s3, sparseIntArray);
        g(34, profileActivity.f30486t3, sparseIntArray);
        g(35, profileActivity.f30493u3, sparseIntArray);
        g(36, profileActivity.f30500v3, sparseIntArray);
        g(37, profileActivity.f30508w3, sparseIntArray);
        g(38, profileActivity.f30515x3, sparseIntArray);
        g(39, profileActivity.y3, sparseIntArray);
        g(40, profileActivity.f30527z3, sparseIntArray);
        g(41, profileActivity.A3, sparseIntArray);
        g(42, profileActivity.B3, sparseIntArray);
        g(43, profileActivity.C3, sparseIntArray);
        g(44, profileActivity.D3, sparseIntArray);
        g(45, profileActivity.E3, sparseIntArray);
        g(46, profileActivity.F3, sparseIntArray);
        g(47, profileActivity.G3, sparseIntArray);
        g(48, profileActivity.H3, sparseIntArray);
        g(49, profileActivity.I3, sparseIntArray);
        g(50, profileActivity.J3, sparseIntArray);
        g(51, profileActivity.K3, sparseIntArray);
        g(52, profileActivity.L3, sparseIntArray);
        g(53, profileActivity.M3, sparseIntArray);
        g(54, profileActivity.Y3, sparseIntArray);
        g(55, profileActivity.N3, sparseIntArray);
        g(56, profileActivity.R3, sparseIntArray);
        g(57, profileActivity.S3, sparseIntArray);
        g(58, profileActivity.T3, sparseIntArray);
        g(59, profileActivity.f30419j4, sparseIntArray);
        g(60, profileActivity.U3, sparseIntArray);
        g(61, profileActivity.V3, sparseIntArray);
        g(62, profileActivity.W3, sparseIntArray);
        g(63, profileActivity.X3, sparseIntArray);
        g(64, profileActivity.Z3, sparseIntArray);
        g(65, profileActivity.f30465q4, sparseIntArray);
        g(66, profileActivity.f30472r4, sparseIntArray);
        g(67, profileActivity.f30480s4, sparseIntArray);
        g(68, profileActivity.f30487t4, sparseIntArray);
        g(69, profileActivity.f30509w4, sparseIntArray);
        g(70, profileActivity.f30516x4, sparseIntArray);
        g(71, profileActivity.f30522y4, sparseIntArray);
        g(72, profileActivity.f30528z4, sparseIntArray);
        g(73, profileActivity.A4, sparseIntArray);
        g(74, profileActivity.G4, sparseIntArray);
        g(75, profileActivity.H4, sparseIntArray);
        g(76, profileActivity.E4, sparseIntArray);
        g(77, profileActivity.J4, sparseIntArray);
        g(78, profileActivity.K4, sparseIntArray);
        g(79, profileActivity.f30354a4, sparseIntArray);
        g(80, profileActivity.f30362b4, sparseIntArray);
        g(81, profileActivity.L4, sparseIntArray);
        g(82, profileActivity.M4, sparseIntArray);
        g(83, profileActivity.Q3, sparseIntArray);
        g(84, profileActivity.O3, sparseIntArray);
        g(85, profileActivity.P3, sparseIntArray);
        g(86, profileActivity.U2, sparseIntArray);
        g(87, profileActivity.Q2, sparseIntArray);
        g(88, profileActivity.B4, sparseIntArray);
        g(89, profileActivity.C4, sparseIntArray);
        g(90, profileActivity.D4, sparseIntArray);
        g(91, profileActivity.F4, sparseIntArray);
        g(92, profileActivity.f30413i4, sparseIntArray);
        g(93, profileActivity.f30445n4, sparseIntArray);
        i10 = profileActivity.botPermissionLocation;
        g(94, i10, sparseIntArray);
        i11 = profileActivity.botPermissionEmojiStatus;
        g(95, i11, sparseIntArray);
        i12 = profileActivity.botPermissionBiometry;
        g(96, i12, sparseIntArray);
        g(97, profileActivity.f30459p4, sparseIntArray);
        g(98, profileActivity.R2, sparseIntArray);
        g(99, profileActivity.f30426k4, sparseIntArray);
        g(100, profileActivity.l4, sparseIntArray);
        g(101, profileActivity.f30437m4, sparseIntArray);
    }
}
