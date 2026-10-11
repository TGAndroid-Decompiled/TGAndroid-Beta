package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b5 implements RequestDelegate {
    public final int f52389a;
    public final d5 f52390b;

    public b5(d5 d5Var, int i10) {
        this.f52389a = i10;
        this.f52390b = d5Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52389a) {
            case 0:
                final d5 d5Var = this.f52390b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        d5 d5Var2 = d5Var;
                        switch (i10) {
                            case 0:
                                long j3 = d5Var2.f52473b;
                                int i11 = d5Var2.f52472a;
                                ArrayList arrayList = d5Var2.f52475e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    d5Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (d5Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            f5 f5Var = new f5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            f5Var.f52599c = true;
                                            f5Var.d = i13;
                                            d5Var2.h.put(Integer.valueOf(i13), f5Var);
                                        }
                                    }
                                    d5Var2.d = true;
                                    d5Var2.f52474c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), d5Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    d5Var2.j();
                                    d5Var2.d = true;
                                    d5Var2.f52474c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), d5Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                d5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = d5Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        d5Var2.f52475e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                d5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = d5Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        d5Var2.f52475e.set(f10, tL_starGiftCollection3);
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
                final d5 d5Var2 = this.f52390b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        d5 d5Var22 = d5Var2;
                        switch (i10) {
                            case 0:
                                long j3 = d5Var22.f52473b;
                                int i11 = d5Var22.f52472a;
                                ArrayList arrayList = d5Var22.f52475e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    d5Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (d5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            f5 f5Var = new f5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            f5Var.f52599c = true;
                                            f5Var.d = i13;
                                            d5Var22.h.put(Integer.valueOf(i13), f5Var);
                                        }
                                    }
                                    d5Var22.d = true;
                                    d5Var22.f52474c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), d5Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    d5Var22.j();
                                    d5Var22.d = true;
                                    d5Var22.f52474c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), d5Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                d5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = d5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        d5Var22.f52475e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                d5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = d5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        d5Var22.f52475e.set(f10, tL_starGiftCollection3);
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
                final d5 d5Var3 = this.f52390b;
                d5Var3.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        d5 d5Var22 = d5Var3;
                        switch (i10) {
                            case 0:
                                long j3 = d5Var22.f52473b;
                                int i11 = d5Var22.f52472a;
                                ArrayList arrayList = d5Var22.f52475e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    d5Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (d5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            f5 f5Var = new f5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            f5Var.f52599c = true;
                                            f5Var.d = i13;
                                            d5Var22.h.put(Integer.valueOf(i13), f5Var);
                                        }
                                    }
                                    d5Var22.d = true;
                                    d5Var22.f52474c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), d5Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    d5Var22.j();
                                    d5Var22.d = true;
                                    d5Var22.f52474c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), d5Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                d5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = d5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        d5Var22.f52475e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                d5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = d5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        d5Var22.f52475e.set(f10, tL_starGiftCollection3);
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
