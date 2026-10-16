package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class s01 extends s4.o {
    public int f39639b;
    public final SparseIntArray f39640c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList e = new ArrayList();
    public final ArrayList f39641f = new ArrayList();
    public int f39642g;
    public int h;
    public final ProfileActivity f39643i;

    public s01(ProfileActivity profileActivity) {
        this.f39643i = profileActivity;
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
        ProfileActivity profileActivity = this.f39643i;
        if (i11 >= profileActivity.f32375u4 && i11 < profileActivity.f32382v4 && i10 >= this.f39642g && i10 < this.h) {
            ArrayList arrayList = this.f39641f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i10 - this.f39642g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i10 - this.f39642g);
            }
            if (!profileActivity.C2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.Q4.get(((Integer) profileActivity.R4.get(i11 - profileActivity.f32375u4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.Q4.get(i11 - profileActivity.f32375u4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i12 = this.f39640c.get(i10, -1);
        if (i12 != this.d.get(i11, -1) || i12 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f39643i.N2;
    }

    @Override
    public final int e() {
        return this.f39639b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i10;
        int i11;
        int i12;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f39643i;
        g(1, profileActivity.O2, sparseIntArray);
        g(2, profileActivity.P2, sparseIntArray);
        g(3, profileActivity.S2, sparseIntArray);
        g(4, profileActivity.T2, sparseIntArray);
        g(5, profileActivity.V2, sparseIntArray);
        g(6, profileActivity.W2, sparseIntArray);
        g(7, profileActivity.f32233a3, sparseIntArray);
        g(8, profileActivity.X2, sparseIntArray);
        g(9, profileActivity.f32249c3, sparseIntArray);
        g(10, profileActivity.f32241b3, sparseIntArray);
        g(11, profileActivity.Y2, sparseIntArray);
        g(12, profileActivity.Z2, sparseIntArray);
        g(13, profileActivity.f32256d3, sparseIntArray);
        g(14, profileActivity.f32263e3, sparseIntArray);
        g(15, profileActivity.f32271f3, sparseIntArray);
        g(16, profileActivity.f32278g3, sparseIntArray);
        g(17, profileActivity.f32250c4, sparseIntArray);
        g(18, profileActivity.f32257d4, sparseIntArray);
        g(19, profileActivity.f32272f4, sparseIntArray);
        g(20, profileActivity.f32286h4, sparseIntArray);
        g(21, profileActivity.f32279g4, sparseIntArray);
        g(22, profileActivity.f32285h3, sparseIntArray);
        g(23, profileActivity.f32292i3, sparseIntArray);
        g(24, profileActivity.f32312l3, sparseIntArray);
        g(25, profileActivity.f32299j3, sparseIntArray);
        g(26, profileActivity.f32306k3, sparseIntArray);
        g(27, profileActivity.f32317m3, sparseIntArray);
        g(28, profileActivity.f32325n3, sparseIntArray);
        g(29, profileActivity.f32332o3, sparseIntArray);
        g(30, profileActivity.f32339p3, sparseIntArray);
        g(31, profileActivity.f32345q3, sparseIntArray);
        g(32, profileActivity.f32352r3, sparseIntArray);
        g(33, profileActivity.f32360s3, sparseIntArray);
        g(34, profileActivity.f32367t3, sparseIntArray);
        g(35, profileActivity.f32374u3, sparseIntArray);
        g(36, profileActivity.f32381v3, sparseIntArray);
        g(37, profileActivity.f32389w3, sparseIntArray);
        g(38, profileActivity.f32396x3, sparseIntArray);
        g(39, profileActivity.y3, sparseIntArray);
        g(40, profileActivity.f32408z3, sparseIntArray);
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
        g(59, profileActivity.f32300j4, sparseIntArray);
        g(60, profileActivity.U3, sparseIntArray);
        g(61, profileActivity.V3, sparseIntArray);
        g(62, profileActivity.W3, sparseIntArray);
        g(63, profileActivity.X3, sparseIntArray);
        g(64, profileActivity.Z3, sparseIntArray);
        g(65, profileActivity.f32346q4, sparseIntArray);
        g(66, profileActivity.f32353r4, sparseIntArray);
        g(67, profileActivity.f32361s4, sparseIntArray);
        g(68, profileActivity.f32368t4, sparseIntArray);
        g(69, profileActivity.f32390w4, sparseIntArray);
        g(70, profileActivity.f32397x4, sparseIntArray);
        g(71, profileActivity.f32403y4, sparseIntArray);
        g(72, profileActivity.f32409z4, sparseIntArray);
        g(73, profileActivity.A4, sparseIntArray);
        g(74, profileActivity.G4, sparseIntArray);
        g(75, profileActivity.H4, sparseIntArray);
        g(76, profileActivity.E4, sparseIntArray);
        g(77, profileActivity.J4, sparseIntArray);
        g(78, profileActivity.K4, sparseIntArray);
        g(79, profileActivity.f32234a4, sparseIntArray);
        g(80, profileActivity.f32242b4, sparseIntArray);
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
        g(92, profileActivity.f32293i4, sparseIntArray);
        g(93, profileActivity.f32326n4, sparseIntArray);
        i10 = profileActivity.botPermissionLocation;
        g(94, i10, sparseIntArray);
        i11 = profileActivity.botPermissionEmojiStatus;
        g(95, i11, sparseIntArray);
        i12 = profileActivity.botPermissionBiometry;
        g(96, i12, sparseIntArray);
        g(97, profileActivity.f32340p4, sparseIntArray);
        g(98, profileActivity.R2, sparseIntArray);
        g(99, profileActivity.f32307k4, sparseIntArray);
        g(100, profileActivity.l4, sparseIntArray);
        g(101, profileActivity.f32318m4, sparseIntArray);
    }
}
