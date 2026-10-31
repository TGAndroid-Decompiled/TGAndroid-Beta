package yh;

import android.location.Location;
import android.view.View;
import bi.u0;
import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.i5;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.un;
import zf.f1;
import zf.k1;
import zf.m1;
public final class o implements Runnable {
    public final int f54511a;
    public final Object f54512b;
    public final Object f54513c;

    public o(int i10, Object obj, Object obj2) {
        this.f54511a = i10;
        this.f54513c = obj;
        this.f54512b = obj2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f54511a) {
            case 0:
                q qVar = (q) this.f54513c;
                qVar.getClass();
                qVar.presentFragment(un.ha(((zh.f) this.f54512b).f55775b.f19942id));
                return;
            case 1:
                ((a0) this.f54513c).f54448q1.presentFragment(un.ha(((zh.f) this.f54512b).f55775b.f19942id));
                return;
            case 2:
                zf.c cVar = (zf.c) this.f54513c;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f54512b);
                int i11 = cVar.G;
                vp.r1(i11).V3(tL_contacts_resolvedPeer.users, false);
                vp.r1(i11).P3(tL_contacts_resolvedPeer.chats, false);
                hs.a0(i11).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar.f55456w;
                cVar.f55456w = null;
                cVar.H(cVar.f55457x, location, false);
                return;
            case 3:
                zf.z zVar = (zf.z) this.f54513c;
                View view = (View) this.f54512b;
                zVar.m0 = false;
                zVar.f55698o0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
                zf.z zVar2 = (zf.z) this.f54513c;
                TLObject tLObject = (TLObject) this.f54512b;
                int i12 = zVar2.f55704s0;
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
                    vp.r1(i12).V3(tL_contacts_sponsoredPeers.users, true);
                    vp.r1(i12).P3(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    zVar2.f();
                    return;
                } else {
                    return;
                }
            case 5:
                zf.z zVar3 = (zf.z) this.f54513c;
                StringBuilder sb2 = (StringBuilder) this.f54512b;
                zVar3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    hs.a0(zVar3.f55704s0).f15940b.executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 6:
                f1 f1Var = (f1) this.f54513c;
                String str = (String) this.f54512b;
                f1Var.I = str;
                if (f1Var.f55487r) {
                    f1Var.f55485f.g(str, true, false, f1Var.f55488s, f1Var.f55489w, f1Var.f55491y, f1Var.f55490x, -1, 1);
                }
                int i13 = d20.f15147s0;
                ArrayList arrayList2 = new ArrayList(i5.r(i13).f16065e0);
                f1Var.D = true;
                int i14 = f1Var.F;
                f1Var.F = i14 + 1;
                f1Var.E = i14;
                f1Var.f();
                Utilities.f14522g.c(new u0(f1Var, str, i14, arrayList2, i13, 10));
                return;
            default:
                ArrayList arrayList3 = (ArrayList) this.f54512b;
                int i15 = ((m1) this.f54513c).f55584m;
                try {
                    hs.a0(i15).f15940b.beginTransaction();
                    SQLitePreparedStatement executeFast = hs.a0(i15).f15940b.executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList3.size() && i16 != 100) {
                            k1 k1Var = (k1) arrayList3.get(i16);
                            executeFast.requery();
                            executeFast.bindString(1, k1Var.f55556a);
                            executeFast.bindInteger(2, k1Var.f55557b);
                            executeFast.step();
                            i16++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList3.size() > 100) {
                        SQLitePreparedStatement executeFast2 = hs.a0(i15).f15940b.executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList3.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((k1) arrayList3.get(i10)).f55556a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    hs.a0(i15).f15940b.commitTransaction();
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
        }
    }
}
