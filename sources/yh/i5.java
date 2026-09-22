package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i5 implements RequestDelegate {
    public final int f47582a;
    public final k5 f47583b;

    public i5(k5 k5Var, int i10) {
        this.f47582a = i10;
        this.f47583b = k5Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47582a) {
            case 0:
                final k5 k5Var = this.f47583b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        k5 k5Var2 = k5Var;
                        switch (i10) {
                            case 0:
                                long j3 = k5Var2.f47667b;
                                int i11 = k5Var2.f47666a;
                                ArrayList arrayList = k5Var2.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k5Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k5Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            l5 l5Var = new l5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            l5Var.f47705c = true;
                                            l5Var.d = i13;
                                            k5Var2.h.put(Integer.valueOf(i13), l5Var);
                                        }
                                    }
                                    k5Var2.d = true;
                                    k5Var2.f47668c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), k5Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    k5Var2.j();
                                    k5Var2.d = true;
                                    k5Var2.f47668c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), k5Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                k5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = k5Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        k5Var2.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                k5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = k5Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        k5Var2.e.set(f10, tL_starGiftCollection3);
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
                final k5 k5Var2 = this.f47583b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        k5 k5Var22 = k5Var2;
                        switch (i10) {
                            case 0:
                                long j3 = k5Var22.f47667b;
                                int i11 = k5Var22.f47666a;
                                ArrayList arrayList = k5Var22.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k5Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            l5 l5Var = new l5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            l5Var.f47705c = true;
                                            l5Var.d = i13;
                                            k5Var22.h.put(Integer.valueOf(i13), l5Var);
                                        }
                                    }
                                    k5Var22.d = true;
                                    k5Var22.f47668c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), k5Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    k5Var22.j();
                                    k5Var22.d = true;
                                    k5Var22.f47668c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), k5Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                k5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = k5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        k5Var22.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                k5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = k5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        k5Var22.e.set(f10, tL_starGiftCollection3);
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
                final k5 k5Var3 = this.f47583b;
                k5Var3.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        k5 k5Var22 = k5Var3;
                        switch (i10) {
                            case 0:
                                long j3 = k5Var22.f47667b;
                                int i11 = k5Var22.f47666a;
                                ArrayList arrayList = k5Var22.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k5Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            l5 l5Var = new l5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            l5Var.f47705c = true;
                                            l5Var.d = i13;
                                            k5Var22.h.put(Integer.valueOf(i13), l5Var);
                                        }
                                    }
                                    k5Var22.d = true;
                                    k5Var22.f47668c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), k5Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    k5Var22.j();
                                    k5Var22.d = true;
                                    k5Var22.f47668c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), k5Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                k5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = k5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        k5Var22.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                k5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = k5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        k5Var22.e.set(f10, tL_starGiftCollection3);
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
