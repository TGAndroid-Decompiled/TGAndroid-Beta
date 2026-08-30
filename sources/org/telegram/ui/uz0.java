package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class uz0 extends f2.q {
    public int f39025b;
    public final SparseIntArray f39026c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList e = new ArrayList();
    public final ArrayList f39027f = new ArrayList();
    public int f39028g;
    public int h;
    public final ProfileActivity f39029i;

    public uz0(ProfileActivity profileActivity) {
        this.f39029i = profileActivity;
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
        ProfileActivity profileActivity = this.f39029i;
        if (i11 >= profileActivity.f32152r4 && i11 < profileActivity.f32160s4 && i10 >= this.f39028g && i10 < this.h) {
            ArrayList arrayList = this.f39027f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i10 - this.f39028g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i10 - this.f39028g);
            }
            if (!profileActivity.f32203z2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.N4.get(((Integer) profileActivity.O4.get(i11 - profileActivity.f32152r4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.N4.get(i11 - profileActivity.f32152r4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i12 = this.f39026c.get(i10, -1);
        if (i12 != this.d.get(i11, -1) || i12 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f39029i.K2;
    }

    @Override
    public final int e() {
        return this.f39025b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i10;
        int i11;
        int i12;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f39029i;
        g(1, profileActivity.L2, sparseIntArray);
        g(2, profileActivity.M2, sparseIntArray);
        g(3, profileActivity.P2, sparseIntArray);
        g(4, profileActivity.Q2, sparseIntArray);
        g(5, profileActivity.S2, sparseIntArray);
        g(6, profileActivity.T2, sparseIntArray);
        g(7, profileActivity.X2, sparseIntArray);
        g(8, profileActivity.U2, sparseIntArray);
        g(9, profileActivity.Z2, sparseIntArray);
        g(10, profileActivity.Y2, sparseIntArray);
        g(11, profileActivity.V2, sparseIntArray);
        g(12, profileActivity.W2, sparseIntArray);
        g(13, profileActivity.f32031a3, sparseIntArray);
        g(14, profileActivity.f32039b3, sparseIntArray);
        g(15, profileActivity.c3, sparseIntArray);
        g(16, profileActivity.f32053d3, sparseIntArray);
        g(17, profileActivity.Z3, sparseIntArray);
        g(18, profileActivity.f32032a4, sparseIntArray);
        g(19, profileActivity.f32047c4, sparseIntArray);
        g(20, profileActivity.f32061e4, sparseIntArray);
        g(21, profileActivity.f32054d4, sparseIntArray);
        g(22, profileActivity.f32060e3, sparseIntArray);
        g(23, profileActivity.f32067f3, sparseIntArray);
        g(24, profileActivity.f32088i3, sparseIntArray);
        g(25, profileActivity.f32074g3, sparseIntArray);
        g(26, profileActivity.f32081h3, sparseIntArray);
        g(27, profileActivity.f32095j3, sparseIntArray);
        g(28, profileActivity.f32102k3, sparseIntArray);
        g(29, profileActivity.f32108l3, sparseIntArray);
        g(30, profileActivity.f32114m3, sparseIntArray);
        g(31, profileActivity.f32122n3, sparseIntArray);
        g(32, profileActivity.f32129o3, sparseIntArray);
        g(33, profileActivity.f32136p3, sparseIntArray);
        g(34, profileActivity.f32143q3, sparseIntArray);
        g(35, profileActivity.f32151r3, sparseIntArray);
        g(36, profileActivity.f32159s3, sparseIntArray);
        g(37, profileActivity.f32165t3, sparseIntArray);
        g(38, profileActivity.f32171u3, sparseIntArray);
        g(39, profileActivity.f32177v3, sparseIntArray);
        g(40, profileActivity.f32184w3, sparseIntArray);
        g(41, profileActivity.f32191x3, sparseIntArray);
        g(42, profileActivity.f32198y3, sparseIntArray);
        g(43, profileActivity.f32204z3, sparseIntArray);
        g(44, profileActivity.A3, sparseIntArray);
        g(45, profileActivity.B3, sparseIntArray);
        g(46, profileActivity.C3, sparseIntArray);
        g(47, profileActivity.D3, sparseIntArray);
        g(48, profileActivity.E3, sparseIntArray);
        g(49, profileActivity.F3, sparseIntArray);
        g(50, profileActivity.G3, sparseIntArray);
        g(51, profileActivity.H3, sparseIntArray);
        g(52, profileActivity.I3, sparseIntArray);
        g(53, profileActivity.J3, sparseIntArray);
        g(54, profileActivity.V3, sparseIntArray);
        g(55, profileActivity.K3, sparseIntArray);
        g(56, profileActivity.O3, sparseIntArray);
        g(57, profileActivity.P3, sparseIntArray);
        g(58, profileActivity.Q3, sparseIntArray);
        g(59, profileActivity.f32075g4, sparseIntArray);
        g(60, profileActivity.R3, sparseIntArray);
        g(61, profileActivity.S3, sparseIntArray);
        g(62, profileActivity.T3, sparseIntArray);
        g(63, profileActivity.U3, sparseIntArray);
        g(64, profileActivity.W3, sparseIntArray);
        g(65, profileActivity.f32123n4, sparseIntArray);
        g(66, profileActivity.f32130o4, sparseIntArray);
        g(67, profileActivity.f32137p4, sparseIntArray);
        g(68, profileActivity.f32144q4, sparseIntArray);
        g(69, profileActivity.f32166t4, sparseIntArray);
        g(70, profileActivity.f32172u4, sparseIntArray);
        g(71, profileActivity.f32178v4, sparseIntArray);
        g(72, profileActivity.f32185w4, sparseIntArray);
        g(73, profileActivity.f32192x4, sparseIntArray);
        g(74, profileActivity.D4, sparseIntArray);
        g(75, profileActivity.E4, sparseIntArray);
        g(76, profileActivity.B4, sparseIntArray);
        g(77, profileActivity.G4, sparseIntArray);
        g(78, profileActivity.H4, sparseIntArray);
        g(79, profileActivity.X3, sparseIntArray);
        g(80, profileActivity.Y3, sparseIntArray);
        g(81, profileActivity.I4, sparseIntArray);
        g(82, profileActivity.J4, sparseIntArray);
        g(83, profileActivity.N3, sparseIntArray);
        g(84, profileActivity.L3, sparseIntArray);
        g(85, profileActivity.M3, sparseIntArray);
        g(86, profileActivity.R2, sparseIntArray);
        g(87, profileActivity.N2, sparseIntArray);
        g(88, profileActivity.f32199y4, sparseIntArray);
        g(89, profileActivity.z4, sparseIntArray);
        g(90, profileActivity.A4, sparseIntArray);
        g(91, profileActivity.C4, sparseIntArray);
        g(92, profileActivity.f32068f4, sparseIntArray);
        g(93, profileActivity.f32103k4, sparseIntArray);
        i10 = profileActivity.botPermissionLocation;
        g(94, i10, sparseIntArray);
        i11 = profileActivity.botPermissionEmojiStatus;
        g(95, i11, sparseIntArray);
        i12 = profileActivity.botPermissionBiometry;
        g(96, i12, sparseIntArray);
        g(97, profileActivity.f32115m4, sparseIntArray);
        g(98, profileActivity.O2, sparseIntArray);
        g(99, profileActivity.f32082h4, sparseIntArray);
        g(100, profileActivity.f32089i4, sparseIntArray);
        g(101, profileActivity.f32096j4, sparseIntArray);
    }
}
