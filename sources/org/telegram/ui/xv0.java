package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xv0 extends v4.o {
    public int f51991b;
    public final SparseIntArray f51992c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f51993e = new ArrayList();
    public final ArrayList f51994f = new ArrayList();
    public int f51995g;
    public int h;
    public final ProfileActivity f51996i;

    public xv0(ProfileActivity profileActivity) {
        this.f51996i = profileActivity;
    }

    public static void g(int i7, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i7);
        }
    }

    @Override
    public final boolean a(int i7, int i10) {
        return b(i7, i10);
    }

    @Override
    public final boolean b(int i7, int i10) {
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatParticipant chatParticipant2;
        ProfileActivity profileActivity = this.f51996i;
        if (i10 >= profileActivity.f41825t4 && i10 < profileActivity.f41831u4 && i7 >= this.f51995g && i7 < this.h) {
            ArrayList arrayList = this.f51994f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f51993e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i7 - this.f51995g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i7 - this.f51995g);
            }
            if (!profileActivity.B2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.Q4.get(((Integer) profileActivity.R4.get(i10 - profileActivity.f41825t4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.Q4.get(i10 - profileActivity.f41825t4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i11 = this.f51992c.get(i7, -1);
        if (i11 != this.d.get(i10, -1) || i11 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f51996i.M2;
    }

    @Override
    public final int e() {
        return this.f51991b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i7;
        int i10;
        int i11;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f51996i;
        g(1, profileActivity.N2, sparseIntArray);
        g(2, profileActivity.O2, sparseIntArray);
        g(3, profileActivity.R2, sparseIntArray);
        g(4, profileActivity.S2, sparseIntArray);
        g(5, profileActivity.U2, sparseIntArray);
        g(6, profileActivity.V2, sparseIntArray);
        g(7, profileActivity.Z2, sparseIntArray);
        g(8, profileActivity.W2, sparseIntArray);
        g(9, profileActivity.f41699b3, sparseIntArray);
        g(10, profileActivity.f41691a3, sparseIntArray);
        g(11, profileActivity.X2, sparseIntArray);
        g(12, profileActivity.Y2, sparseIntArray);
        g(13, profileActivity.f41707c3, sparseIntArray);
        g(14, profileActivity.f41713d3, sparseIntArray);
        g(15, profileActivity.f41721e3, sparseIntArray);
        g(16, profileActivity.f41729f3, sparseIntArray);
        g(17, profileActivity.f41700b4, sparseIntArray);
        g(18, profileActivity.f41708c4, sparseIntArray);
        g(19, profileActivity.f41722e4, sparseIntArray);
        g(20, profileActivity.f41737g4, sparseIntArray);
        g(21, profileActivity.f41730f4, sparseIntArray);
        g(22, profileActivity.f41736g3, sparseIntArray);
        g(23, profileActivity.f41743h3, sparseIntArray);
        g(24, profileActivity.f41763k3, sparseIntArray);
        g(25, profileActivity.f41750i3, sparseIntArray);
        g(26, profileActivity.j3, sparseIntArray);
        g(27, profileActivity.f41769l3, sparseIntArray);
        g(28, profileActivity.f41775m3, sparseIntArray);
        g(29, profileActivity.f41782n3, sparseIntArray);
        g(30, profileActivity.f41789o3, sparseIntArray);
        g(31, profileActivity.f41795p3, sparseIntArray);
        g(32, profileActivity.f41802q3, sparseIntArray);
        g(33, profileActivity.f41810r3, sparseIntArray);
        g(34, profileActivity.f41818s3, sparseIntArray);
        g(35, profileActivity.f41824t3, sparseIntArray);
        g(36, profileActivity.f41830u3, sparseIntArray);
        g(37, profileActivity.f41837v3, sparseIntArray);
        g(38, profileActivity.f41845w3, sparseIntArray);
        g(39, profileActivity.f41853x3, sparseIntArray);
        g(40, profileActivity.f41861y3, sparseIntArray);
        g(41, profileActivity.f41868z3, sparseIntArray);
        g(42, profileActivity.A3, sparseIntArray);
        g(43, profileActivity.B3, sparseIntArray);
        g(44, profileActivity.C3, sparseIntArray);
        g(45, profileActivity.D3, sparseIntArray);
        g(46, profileActivity.E3, sparseIntArray);
        g(47, profileActivity.F3, sparseIntArray);
        g(48, profileActivity.G3, sparseIntArray);
        g(49, profileActivity.H3, sparseIntArray);
        g(50, profileActivity.I3, sparseIntArray);
        g(51, profileActivity.J3, sparseIntArray);
        g(52, profileActivity.K3, sparseIntArray);
        g(53, profileActivity.L3, sparseIntArray);
        g(54, profileActivity.X3, sparseIntArray);
        g(55, profileActivity.M3, sparseIntArray);
        g(56, profileActivity.Q3, sparseIntArray);
        g(57, profileActivity.R3, sparseIntArray);
        g(58, profileActivity.S3, sparseIntArray);
        g(59, profileActivity.f41751i4, sparseIntArray);
        g(60, profileActivity.T3, sparseIntArray);
        g(61, profileActivity.U3, sparseIntArray);
        g(62, profileActivity.V3, sparseIntArray);
        g(63, profileActivity.W3, sparseIntArray);
        g(64, profileActivity.Y3, sparseIntArray);
        g(65, profileActivity.f41796p4, sparseIntArray);
        g(66, profileActivity.f41803q4, sparseIntArray);
        g(67, profileActivity.f41811r4, sparseIntArray);
        g(68, profileActivity.f41819s4, sparseIntArray);
        g(69, profileActivity.f41838v4, sparseIntArray);
        g(70, profileActivity.f41846w4, sparseIntArray);
        g(71, profileActivity.f41854x4, sparseIntArray);
        g(72, profileActivity.f41862y4, sparseIntArray);
        g(73, profileActivity.f41869z4, sparseIntArray);
        g(74, profileActivity.F4, sparseIntArray);
        g(75, profileActivity.G4, sparseIntArray);
        g(76, profileActivity.D4, sparseIntArray);
        g(77, profileActivity.J4, sparseIntArray);
        g(78, profileActivity.K4, sparseIntArray);
        g(79, profileActivity.Z3, sparseIntArray);
        g(80, profileActivity.f41692a4, sparseIntArray);
        g(81, profileActivity.L4, sparseIntArray);
        g(82, profileActivity.M4, sparseIntArray);
        g(83, profileActivity.P3, sparseIntArray);
        g(84, profileActivity.N3, sparseIntArray);
        g(85, profileActivity.O3, sparseIntArray);
        g(86, profileActivity.T2, sparseIntArray);
        g(87, profileActivity.P2, sparseIntArray);
        g(88, profileActivity.A4, sparseIntArray);
        g(89, profileActivity.B4, sparseIntArray);
        g(90, profileActivity.C4, sparseIntArray);
        g(91, profileActivity.E4, sparseIntArray);
        g(92, profileActivity.f41744h4, sparseIntArray);
        g(93, profileActivity.f41776m4, sparseIntArray);
        i7 = profileActivity.botPermissionLocation;
        g(94, i7, sparseIntArray);
        i10 = profileActivity.botPermissionEmojiStatus;
        g(95, i10, sparseIntArray);
        i11 = profileActivity.botPermissionBiometry;
        g(96, i11, sparseIntArray);
        g(97, profileActivity.o4, sparseIntArray);
        g(98, profileActivity.Q2, sparseIntArray);
        g(99, profileActivity.f41757j4, sparseIntArray);
        g(100, profileActivity.f41764k4, sparseIntArray);
        g(101, profileActivity.f41770l4, sparseIntArray);
    }
}
