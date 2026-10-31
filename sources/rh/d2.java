package rh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d2 implements j20 {
    public final int f46753a;
    public final e4 f46754b;
    public final TL_stars.TL_starGiftUnique f46755c;

    public d2(e4 e4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f46753a = i10;
        this.f46754b = e4Var;
        this.f46755c = tL_starGiftUnique;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_stars.StarGift starGift;
        switch (this.f46753a) {
            case 0:
                final sf.a aVar = (sf.a) obj;
                final Runnable runnable = (Runnable) obj2;
                TL_stars.StarsAmount o10 = aVar.o();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                final e4 e4Var = this.f46754b;
                updatestargiftprice.stargift = e4Var.B1();
                updatestargiftprice.resell_amount = o10;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(e4Var.f21583a);
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f46755c;
                connectionsManager.sendRequest(updatestargiftprice, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final e4 e4Var2 = e4Var;
                                final Runnable runnable2 = runnable;
                                if (z10) {
                                    vp.r1(e4Var2.f21583a).L3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                                    final sf.a aVar2 = aVar;
                                    org.telegram.messenger.i0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z11;
                                            int i10 = r5;
                                            sf.b bVar = sf.b.f48256a;
                                            sf.b bVar2 = sf.b.f48257b;
                                            Runnable runnable3 = runnable2;
                                            sf.a aVar3 = aVar2;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique2;
                                            e4 e4Var3 = e4Var2;
                                            boolean z12 = false;
                                            switch (i10) {
                                                case 0:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    if (aVar3.f48254a == bVar2) {
                                                        z12 = true;
                                                    }
                                                    tL_starGiftUnique3.resale_ton_only = z12;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList;
                                                    arrayList.add(aVar3.e(bVar).o());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).o());
                                                    e4Var3.X1.setResellPrice(aVar3);
                                                    ph.u1 u1Var = e4Var3.f46802c3;
                                                    if (u1Var != null) {
                                                        u1Var.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    if (aVar3.f48254a == bVar2) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    tL_starGiftUnique3.resale_ton_only = z11;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList2;
                                                    arrayList2.add(aVar3.e(bVar).o());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).o());
                                                    e4Var3.X1.setResellPrice(aVar3);
                                                    ph.u1 u1Var2 = e4Var3.f46802c3;
                                                    if (u1Var2 != null) {
                                                        u1Var2.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                    }
                                                    e4Var3.k().Q(2131623989, 36, cd.a0(null, null, 2131750037, e4Var3.z1())).j();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                    org.telegram.messenger.i0.g3(new a3.i0(e4Var2, Long.parseLong(tL_error.text.substring(26)), runnable2, 25));
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.messenger.i0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    e4Var2.k().f0(tL_error, false);
                                                    Runnable runnable3 = runnable2;
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    e4Var2.k().f0(tL_error, false);
                                                    Runnable runnable4 = runnable2;
                                                    if (runnable4 != null) {
                                                        runnable4.run();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                boolean z11 = tLObject instanceof TLRPC.Updates;
                                final e4 e4Var3 = e4Var;
                                final Runnable runnable3 = runnable;
                                if (z11) {
                                    vp.r1(e4Var3.f21583a).L3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique;
                                    final sf.a aVar3 = aVar;
                                    org.telegram.messenger.i0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z112;
                                            int i10 = r5;
                                            sf.b bVar = sf.b.f48256a;
                                            sf.b bVar2 = sf.b.f48257b;
                                            Runnable runnable32 = runnable3;
                                            sf.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                            e4 e4Var32 = e4Var3;
                                            boolean z12 = false;
                                            switch (i10) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f48254a == bVar2) {
                                                        z12 = true;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z12;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    e4Var32.X1.setResellPrice(aVar32);
                                                    ph.u1 u1Var = e4Var32.f46802c3;
                                                    if (u1Var != null) {
                                                        u1Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f48254a == bVar2) {
                                                        z112 = true;
                                                    } else {
                                                        z112 = false;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z112;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    e4Var32.X1.setResellPrice(aVar32);
                                                    ph.u1 u1Var2 = e4Var32.f46802c3;
                                                    if (u1Var2 != null) {
                                                        u1Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    e4Var32.k().Q(2131623989, 36, cd.a0(null, null, 2131750037, e4Var32.z1())).j();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.messenger.i0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    e4Var3.k().f0(tL_error, false);
                                                    Runnable runnable32 = runnable3;
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    e4Var3.k().f0(tL_error, false);
                                                    Runnable runnable4 = runnable3;
                                                    if (runnable4 != null) {
                                                        runnable4.run();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                q20 q20Var = (q20) obj;
                Boolean bool = (Boolean) obj2;
                e4 e4Var2 = this.f46754b;
                ph.p3 p3Var = e4Var2.O2;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.f46755c;
                if (p3Var == null) {
                    ph.p3 p3Var2 = new ph.p3(e4Var2.f21583a, tL_starGiftUnique2.gift_id);
                    e4Var2.O2 = p3Var2;
                    p3Var2.a();
                }
                HashSet hashSet = new HashSet();
                int i10 = 0;
                while (true) {
                    y2[] y2VarArr = e4Var2.X1.M.f46623n;
                    if (i10 < y2VarArr.length) {
                        TL_stars.StarGift starGift2 = y2VarArr[i10].h;
                        if (starGift2 != null) {
                            starGift = starGift2;
                        } else {
                            starGift = null;
                        }
                        if (starGift != null) {
                            if (starGift2 == null) {
                                starGift2 = null;
                            }
                            hashSet.add(Long.valueOf(starGift2.f20021id));
                        }
                        i10++;
                    } else {
                        ph.q3 q3Var = new ph.q3(e4Var2.getContext(), tL_starGiftUnique2.title, e4Var2.O2);
                        q3Var.Y1.addAll(hashSet);
                        q3Var.a2.O(true);
                        q3Var.Z1 = bool.booleanValue();
                        q3Var.W1.set(org.telegram.messenger.i0.W2(cd.G(4 - hashSet.size(), "GiftCraftSelect", new Object[0])));
                        q3Var.X1 = new e1(q20Var, 0);
                        q3Var.show();
                        return;
                    }
                }
            default:
                final sf.a aVar2 = (sf.a) obj;
                final Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarsAmount o11 = aVar2.o();
                TL_stars.updateStarGiftPrice updatestargiftprice2 = new TL_stars.updateStarGiftPrice();
                final e4 e4Var3 = this.f46754b;
                updatestargiftprice2.stargift = e4Var3.B1();
                updatestargiftprice2.resell_amount = o11;
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(e4Var3.f21583a);
                final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = this.f46755c;
                connectionsManager2.sendRequest(updatestargiftprice2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final e4 e4Var22 = e4Var3;
                                final Runnable runnable22 = runnable2;
                                if (z10) {
                                    vp.r1(e4Var22.f21583a).L3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique3;
                                    final sf.a aVar22 = aVar2;
                                    org.telegram.messenger.i0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z112;
                                            int i102 = r5;
                                            sf.b bVar = sf.b.f48256a;
                                            sf.b bVar2 = sf.b.f48257b;
                                            Runnable runnable32 = runnable22;
                                            sf.a aVar32 = aVar22;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique22;
                                            e4 e4Var32 = e4Var22;
                                            boolean z12 = false;
                                            switch (i102) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f48254a == bVar2) {
                                                        z12 = true;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z12;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    e4Var32.X1.setResellPrice(aVar32);
                                                    ph.u1 u1Var = e4Var32.f46802c3;
                                                    if (u1Var != null) {
                                                        u1Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f48254a == bVar2) {
                                                        z112 = true;
                                                    } else {
                                                        z112 = false;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z112;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    e4Var32.X1.setResellPrice(aVar32);
                                                    ph.u1 u1Var2 = e4Var32.f46802c3;
                                                    if (u1Var2 != null) {
                                                        u1Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    e4Var32.k().Q(2131623989, 36, cd.a0(null, null, 2131750037, e4Var32.z1())).j();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                    org.telegram.messenger.i0.g3(new a3.i0(e4Var22, Long.parseLong(tL_error.text.substring(26)), runnable22, 25));
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.messenger.i0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    e4Var22.k().f0(tL_error, false);
                                                    Runnable runnable32 = runnable22;
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    e4Var22.k().f0(tL_error, false);
                                                    Runnable runnable4 = runnable22;
                                                    if (runnable4 != null) {
                                                        runnable4.run();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                boolean z11 = tLObject instanceof TLRPC.Updates;
                                final e4 e4Var32 = e4Var3;
                                final Runnable runnable3 = runnable2;
                                if (z11) {
                                    vp.r1(e4Var32.f21583a).L3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                    final sf.a aVar3 = aVar2;
                                    org.telegram.messenger.i0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z112;
                                            int i102 = r5;
                                            sf.b bVar = sf.b.f48256a;
                                            sf.b bVar2 = sf.b.f48257b;
                                            Runnable runnable32 = runnable3;
                                            sf.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique322 = tL_starGiftUnique32;
                                            e4 e4Var322 = e4Var32;
                                            boolean z12 = false;
                                            switch (i102) {
                                                case 0:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    if (aVar32.f48254a == bVar2) {
                                                        z12 = true;
                                                    }
                                                    tL_starGiftUnique322.resale_ton_only = z12;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).o());
                                                    e4Var322.X1.setResellPrice(aVar32);
                                                    ph.u1 u1Var = e4Var322.f46802c3;
                                                    if (u1Var != null) {
                                                        u1Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    if (aVar32.f48254a == bVar2) {
                                                        z112 = true;
                                                    } else {
                                                        z112 = false;
                                                    }
                                                    tL_starGiftUnique322.resale_ton_only = z112;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).o());
                                                    e4Var322.X1.setResellPrice(aVar32);
                                                    ph.u1 u1Var2 = e4Var322.f46802c3;
                                                    if (u1Var2 != null) {
                                                        u1Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    e4Var322.k().Q(2131623989, 36, cd.a0(null, null, 2131750037, e4Var322.z1())).j();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.messenger.i0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    e4Var32.k().f0(tL_error, false);
                                                    Runnable runnable32 = runnable3;
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    e4Var32.k().f0(tL_error, false);
                                                    Runnable runnable4 = runnable3;
                                                    if (runnable4 != null) {
                                                        runnable4.run();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
