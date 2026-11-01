package xh;

import android.location.Location;
import android.view.View;
import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i5;
import org.telegram.messenger.is;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.un;
public final class e3 implements Runnable {
    public final int f53763a;
    public final Object f53764b;
    public final Object f53765c;

    public e3(int i10, Object obj, Object obj2) {
        this.f53763a = i10;
        this.f53764b = obj;
        this.f53765c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = 0;
        switch (this.f53763a) {
            case 0:
                j3 j3Var = (j3) this.f53764b;
                wb Q = new cc(j3Var.f30964b.f21590c, j3Var.f30963a).Q(2131623989, 36, org.telegram.messenger.i0.W2((String) this.f53765c));
                Q.f32201j = 5000;
                Q.k(true);
                return;
            case 1:
                yh.p pVar = (yh.p) this.f53764b;
                pVar.getClass();
                pVar.presentFragment(un.ma(((zh.f) this.f53765c).f55793b.f19943id));
                return;
            case 2:
                ((yh.z) this.f53764b).f54550q1.presentFragment(un.ma(((zh.f) this.f53765c).f55793b.f19943id));
                return;
            case 3:
                zf.c cVar = (zf.c) this.f53764b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f53765c);
                int i12 = cVar.G;
                wp.r1(i12).V3(tL_contacts_resolvedPeer.users, false);
                wp.r1(i12).P3(tL_contacts_resolvedPeer.chats, false);
                is.a0(i12).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar.f55474w;
                cVar.f55474w = null;
                cVar.H(cVar.f55475x, location, false);
                return;
            case 4:
                zf.z zVar = (zf.z) this.f53764b;
                View view = (View) this.f53765c;
                zVar.m0 = false;
                zVar.f55716o0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 5:
                zf.z zVar2 = (zf.z) this.f53764b;
                TLObject tLObject = (TLObject) this.f53765c;
                int i13 = zVar2.f55722s0;
                ArrayList arrayList = zVar2.K;
                zVar2.S = 0;
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        zVar2.f();
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
                    wp.r1(i13).V3(tL_contacts_sponsoredPeers.users, true);
                    wp.r1(i13).P3(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    zVar2.f();
                    return;
                } else {
                    return;
                }
            case 6:
                zf.z zVar3 = (zf.z) this.f53764b;
                StringBuilder sb2 = (StringBuilder) this.f53765c;
                zVar3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    is.a0(zVar3.f55722s0).f16333b.executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 7:
                zf.f1 f1Var = (zf.f1) this.f53764b;
                String str = (String) this.f53765c;
                f1Var.I = str;
                if (f1Var.f55505r) {
                    f1Var.f55503f.g(str, true, false, f1Var.f55506s, f1Var.f55507w, f1Var.f55509y, f1Var.f55508x, -1, 1);
                }
                int i14 = e20.f15506s0;
                ArrayList arrayList2 = new ArrayList(i5.r(i14).f16218e0);
                f1Var.D = true;
                int i15 = f1Var.F;
                f1Var.F = i15 + 1;
                f1Var.E = i15;
                f1Var.f();
                Utilities.f14523g.c(new bi.u0(f1Var, str, i15, arrayList2, i14, 10));
                return;
            default:
                ArrayList arrayList3 = (ArrayList) this.f53765c;
                int i16 = ((zf.m1) this.f53764b).f55602m;
                try {
                    is.a0(i16).f16333b.beginTransaction();
                    SQLitePreparedStatement executeFast = is.a0(i16).f16333b.executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    while (true) {
                        if (i11 < arrayList3.size() && i11 != 100) {
                            zf.k1 k1Var = (zf.k1) arrayList3.get(i11);
                            executeFast.requery();
                            executeFast.bindString(1, k1Var.f55574a);
                            executeFast.bindInteger(2, k1Var.f55575b);
                            executeFast.step();
                            i11++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList3.size() > 100) {
                        SQLitePreparedStatement executeFast2 = is.a0(i16).f16333b.executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList3.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((zf.k1) arrayList3.get(i10)).f55574a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    is.a0(i16).f16333b.commitTransaction();
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
        }
    }
}
