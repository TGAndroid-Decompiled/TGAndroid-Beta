package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wv0 extends v4.o {
    public int f53006b;
    public final SparseIntArray f53007c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f53008e = new ArrayList();
    public final ArrayList f53009f = new ArrayList();
    public int f53010g;
    public int h;
    public final ProfileActivity f53011i;

    public wv0(ProfileActivity profileActivity) {
        this.f53011i = profileActivity;
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
        ProfileActivity profileActivity = this.f53011i;
        if (i10 >= profileActivity.f43213v4 && i10 < profileActivity.f43221w4 && i7 >= this.f53010g && i7 < this.h) {
            ArrayList arrayList = this.f53009f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f53008e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i7 - this.f53010g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i7 - this.f53010g);
            }
            if (!profileActivity.D2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.S4.get(((Integer) profileActivity.T4.get(i10 - profileActivity.f43213v4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.S4.get(i10 - profileActivity.f43213v4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i11 = this.f53007c.get(i7, -1);
        if (i11 != this.d.get(i10, -1) || i11 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f53011i.O2;
    }

    @Override
    public final int e() {
        return this.f53006b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i7;
        int i10;
        int i11;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f53011i;
        g(1, profileActivity.P2, sparseIntArray);
        g(2, profileActivity.Q2, sparseIntArray);
        g(3, profileActivity.T2, sparseIntArray);
        g(4, profileActivity.U2, sparseIntArray);
        g(5, profileActivity.W2, sparseIntArray);
        g(6, profileActivity.X2, sparseIntArray);
        g(7, profileActivity.f43074b3, sparseIntArray);
        g(8, profileActivity.Y2, sparseIntArray);
        g(9, profileActivity.f43088d3, sparseIntArray);
        g(10, profileActivity.f43082c3, sparseIntArray);
        g(11, profileActivity.Z2, sparseIntArray);
        g(12, profileActivity.f43066a3, sparseIntArray);
        g(13, profileActivity.f43096e3, sparseIntArray);
        g(14, profileActivity.f43104f3, sparseIntArray);
        g(15, profileActivity.f43111g3, sparseIntArray);
        g(16, profileActivity.f43118h3, sparseIntArray);
        g(17, profileActivity.f43089d4, sparseIntArray);
        g(18, profileActivity.f43097e4, sparseIntArray);
        g(19, profileActivity.f43112g4, sparseIntArray);
        g(20, profileActivity.f43126i4, sparseIntArray);
        g(21, profileActivity.f43119h4, sparseIntArray);
        g(22, profileActivity.f43125i3, sparseIntArray);
        g(23, profileActivity.j3, sparseIntArray);
        g(24, profileActivity.f43150m3, sparseIntArray);
        g(25, profileActivity.f43138k3, sparseIntArray);
        g(26, profileActivity.f43144l3, sparseIntArray);
        g(27, profileActivity.f43157n3, sparseIntArray);
        g(28, profileActivity.f43164o3, sparseIntArray);
        g(29, profileActivity.f43170p3, sparseIntArray);
        g(30, profileActivity.f43177q3, sparseIntArray);
        g(31, profileActivity.f43185r3, sparseIntArray);
        g(32, profileActivity.f43193s3, sparseIntArray);
        g(33, profileActivity.f43199t3, sparseIntArray);
        g(34, profileActivity.f43205u3, sparseIntArray);
        g(35, profileActivity.f43212v3, sparseIntArray);
        g(36, profileActivity.f43220w3, sparseIntArray);
        g(37, profileActivity.f43228x3, sparseIntArray);
        g(38, profileActivity.f43236y3, sparseIntArray);
        g(39, profileActivity.f43243z3, sparseIntArray);
        g(40, profileActivity.A3, sparseIntArray);
        g(41, profileActivity.B3, sparseIntArray);
        g(42, profileActivity.C3, sparseIntArray);
        g(43, profileActivity.D3, sparseIntArray);
        g(44, profileActivity.E3, sparseIntArray);
        g(45, profileActivity.F3, sparseIntArray);
        g(46, profileActivity.G3, sparseIntArray);
        g(47, profileActivity.H3, sparseIntArray);
        g(48, profileActivity.I3, sparseIntArray);
        g(49, profileActivity.J3, sparseIntArray);
        g(50, profileActivity.K3, sparseIntArray);
        g(51, profileActivity.L3, sparseIntArray);
        g(52, profileActivity.M3, sparseIntArray);
        g(53, profileActivity.N3, sparseIntArray);
        g(54, profileActivity.Z3, sparseIntArray);
        g(55, profileActivity.O3, sparseIntArray);
        g(56, profileActivity.S3, sparseIntArray);
        g(57, profileActivity.T3, sparseIntArray);
        g(58, profileActivity.U3, sparseIntArray);
        g(59, profileActivity.f43139k4, sparseIntArray);
        g(60, profileActivity.V3, sparseIntArray);
        g(61, profileActivity.W3, sparseIntArray);
        g(62, profileActivity.X3, sparseIntArray);
        g(63, profileActivity.Y3, sparseIntArray);
        g(64, profileActivity.f43067a4, sparseIntArray);
        g(65, profileActivity.f43186r4, sparseIntArray);
        g(66, profileActivity.f43194s4, sparseIntArray);
        g(67, profileActivity.f43200t4, sparseIntArray);
        g(68, profileActivity.f43206u4, sparseIntArray);
        g(69, profileActivity.f43229x4, sparseIntArray);
        g(70, profileActivity.f43237y4, sparseIntArray);
        g(71, profileActivity.f43244z4, sparseIntArray);
        g(72, profileActivity.A4, sparseIntArray);
        g(73, profileActivity.B4, sparseIntArray);
        g(74, profileActivity.H4, sparseIntArray);
        g(75, profileActivity.I4, sparseIntArray);
        g(76, profileActivity.F4, sparseIntArray);
        g(77, profileActivity.L4, sparseIntArray);
        g(78, profileActivity.M4, sparseIntArray);
        g(79, profileActivity.f43075b4, sparseIntArray);
        g(80, profileActivity.f43083c4, sparseIntArray);
        g(81, profileActivity.N4, sparseIntArray);
        g(82, profileActivity.O4, sparseIntArray);
        g(83, profileActivity.R3, sparseIntArray);
        g(84, profileActivity.P3, sparseIntArray);
        g(85, profileActivity.Q3, sparseIntArray);
        g(86, profileActivity.V2, sparseIntArray);
        g(87, profileActivity.R2, sparseIntArray);
        g(88, profileActivity.C4, sparseIntArray);
        g(89, profileActivity.D4, sparseIntArray);
        g(90, profileActivity.E4, sparseIntArray);
        g(91, profileActivity.G4, sparseIntArray);
        g(92, profileActivity.f43132j4, sparseIntArray);
        g(93, profileActivity.o4, sparseIntArray);
        i7 = profileActivity.botPermissionLocation;
        g(94, i7, sparseIntArray);
        i10 = profileActivity.botPermissionEmojiStatus;
        g(95, i10, sparseIntArray);
        i11 = profileActivity.botPermissionBiometry;
        g(96, i11, sparseIntArray);
        g(97, profileActivity.f43178q4, sparseIntArray);
        g(98, profileActivity.S2, sparseIntArray);
        g(99, profileActivity.f43145l4, sparseIntArray);
        g(100, profileActivity.f43151m4, sparseIntArray);
        g(101, profileActivity.f43158n4, sparseIntArray);
    }
}
