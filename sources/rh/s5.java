package rh;

import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s5 implements RequestDelegate {
    public final int f47463a;
    public final u5 f47464b;

    public s5(u5 u5Var, int i10) {
        this.f47463a = i10;
        this.f47464b = u5Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47463a) {
            case 0:
                final u5 u5Var = this.f47464b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        u5 u5Var2 = u5Var;
                        switch (i10) {
                            case 0:
                                long j10 = u5Var2.f47553b;
                                int i11 = u5Var2.f47552a;
                                ArrayList arrayList = u5Var2.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    u5Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (u5Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            v5 v5Var = new v5(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            v5Var.f47590c = true;
                                            v5Var.d = i13;
                                            u5Var2.h.put(Integer.valueOf(i13), v5Var);
                                        }
                                    }
                                    u5Var2.d = true;
                                    u5Var2.f47554c = false;
                                    at.f(i11).k(231, Long.valueOf(j10), u5Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    u5Var2.j();
                                    u5Var2.d = true;
                                    u5Var2.f47554c = false;
                                    at.f(i11).k(231, Long.valueOf(j10), u5Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                u5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = u5Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        u5Var2.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                u5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = u5Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        u5Var2.e.set(f10, tL_starGiftCollection3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final u5 u5Var2 = this.f47464b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        u5 u5Var22 = u5Var2;
                        switch (i10) {
                            case 0:
                                long j10 = u5Var22.f47553b;
                                int i11 = u5Var22.f47552a;
                                ArrayList arrayList = u5Var22.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    u5Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (u5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            v5 v5Var = new v5(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            v5Var.f47590c = true;
                                            v5Var.d = i13;
                                            u5Var22.h.put(Integer.valueOf(i13), v5Var);
                                        }
                                    }
                                    u5Var22.d = true;
                                    u5Var22.f47554c = false;
                                    at.f(i11).k(231, Long.valueOf(j10), u5Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    u5Var22.j();
                                    u5Var22.d = true;
                                    u5Var22.f47554c = false;
                                    at.f(i11).k(231, Long.valueOf(j10), u5Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                u5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = u5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        u5Var22.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                u5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = u5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        u5Var22.e.set(f10, tL_starGiftCollection3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final u5 u5Var3 = this.f47464b;
                u5Var3.getClass();
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        u5 u5Var22 = u5Var3;
                        switch (i10) {
                            case 0:
                                long j10 = u5Var22.f47553b;
                                int i11 = u5Var22.f47552a;
                                ArrayList arrayList = u5Var22.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    u5Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (u5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            v5 v5Var = new v5(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            v5Var.f47590c = true;
                                            v5Var.d = i13;
                                            u5Var22.h.put(Integer.valueOf(i13), v5Var);
                                        }
                                    }
                                    u5Var22.d = true;
                                    u5Var22.f47554c = false;
                                    at.f(i11).k(231, Long.valueOf(j10), u5Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    u5Var22.j();
                                    u5Var22.d = true;
                                    u5Var22.f47554c = false;
                                    at.f(i11).k(231, Long.valueOf(j10), u5Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                u5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = u5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        u5Var22.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                u5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = u5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        u5Var22.e.set(f10, tL_starGiftCollection3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
