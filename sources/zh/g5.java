package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class g5 implements RequestDelegate {
    public final int f51953a;
    public final i5 f51954b;

    public g5(i5 i5Var, int i10) {
        this.f51953a = i10;
        this.f51954b = i5Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51953a) {
            case 0:
                final i5 i5Var = this.f51954b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        i5 i5Var2 = i5Var;
                        switch (i10) {
                            case 0:
                                long j3 = i5Var2.f52034b;
                                int i11 = i5Var2.f52033a;
                                ArrayList arrayList = i5Var2.f52036e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    i5Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (i5Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            j5 j5Var = new j5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            j5Var.f52094c = true;
                                            j5Var.d = i13;
                                            i5Var2.h.put(Integer.valueOf(i13), j5Var);
                                        }
                                    }
                                    i5Var2.d = true;
                                    i5Var2.f52035c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), i5Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    i5Var2.j();
                                    i5Var2.d = true;
                                    i5Var2.f52035c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), i5Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                i5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = i5Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        i5Var2.f52036e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                i5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = i5Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        i5Var2.f52036e.set(f10, tL_starGiftCollection3);
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
                final i5 i5Var2 = this.f51954b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        i5 i5Var22 = i5Var2;
                        switch (i10) {
                            case 0:
                                long j3 = i5Var22.f52034b;
                                int i11 = i5Var22.f52033a;
                                ArrayList arrayList = i5Var22.f52036e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    i5Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (i5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            j5 j5Var = new j5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            j5Var.f52094c = true;
                                            j5Var.d = i13;
                                            i5Var22.h.put(Integer.valueOf(i13), j5Var);
                                        }
                                    }
                                    i5Var22.d = true;
                                    i5Var22.f52035c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), i5Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    i5Var22.j();
                                    i5Var22.d = true;
                                    i5Var22.f52035c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), i5Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                i5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = i5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        i5Var22.f52036e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                i5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = i5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        i5Var22.f52036e.set(f10, tL_starGiftCollection3);
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
                final i5 i5Var3 = this.f51954b;
                i5Var3.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        i5 i5Var22 = i5Var3;
                        switch (i10) {
                            case 0:
                                long j3 = i5Var22.f52034b;
                                int i11 = i5Var22.f52033a;
                                ArrayList arrayList = i5Var22.f52036e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    i5Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (i5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            j5 j5Var = new j5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            j5Var.f52094c = true;
                                            j5Var.d = i13;
                                            i5Var22.h.put(Integer.valueOf(i13), j5Var);
                                        }
                                    }
                                    i5Var22.d = true;
                                    i5Var22.f52035c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), i5Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    i5Var22.j();
                                    i5Var22.d = true;
                                    i5Var22.f52035c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), i5Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                i5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = i5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        i5Var22.f52036e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                i5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = i5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        i5Var22.f52036e.set(f10, tL_starGiftCollection3);
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
