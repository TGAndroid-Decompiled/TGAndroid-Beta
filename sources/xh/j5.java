package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j5 implements RequestDelegate {
    public final int f45596a;
    public final l5 f45597b;

    public j5(l5 l5Var, int i10) {
        this.f45596a = i10;
        this.f45597b = l5Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45596a) {
            case 0:
                final l5 l5Var = this.f45597b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        l5 l5Var2 = l5Var;
                        switch (i10) {
                            case 0:
                                long j3 = l5Var2.f45663b;
                                int i11 = l5Var2.f45662a;
                                ArrayList arrayList = l5Var2.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    l5Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (l5Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            n5 n5Var = new n5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            n5Var.f45755c = true;
                                            n5Var.d = i13;
                                            l5Var2.h.put(Integer.valueOf(i13), n5Var);
                                        }
                                    }
                                    l5Var2.d = true;
                                    l5Var2.f45664c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), l5Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    l5Var2.j();
                                    l5Var2.d = true;
                                    l5Var2.f45664c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), l5Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                l5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = l5Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        l5Var2.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                l5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = l5Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        l5Var2.e.set(f10, tL_starGiftCollection3);
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
                final l5 l5Var2 = this.f45597b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        l5 l5Var22 = l5Var2;
                        switch (i10) {
                            case 0:
                                long j3 = l5Var22.f45663b;
                                int i11 = l5Var22.f45662a;
                                ArrayList arrayList = l5Var22.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    l5Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (l5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            n5 n5Var = new n5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            n5Var.f45755c = true;
                                            n5Var.d = i13;
                                            l5Var22.h.put(Integer.valueOf(i13), n5Var);
                                        }
                                    }
                                    l5Var22.d = true;
                                    l5Var22.f45664c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), l5Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    l5Var22.j();
                                    l5Var22.d = true;
                                    l5Var22.f45664c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), l5Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                l5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = l5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        l5Var22.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                l5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = l5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        l5Var22.e.set(f10, tL_starGiftCollection3);
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
                final l5 l5Var3 = this.f45597b;
                l5Var3.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        l5 l5Var22 = l5Var3;
                        switch (i10) {
                            case 0:
                                long j3 = l5Var22.f45663b;
                                int i11 = l5Var22.f45662a;
                                ArrayList arrayList = l5Var22.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    l5Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (l5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            n5 n5Var = new n5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            n5Var.f45755c = true;
                                            n5Var.d = i13;
                                            l5Var22.h.put(Integer.valueOf(i13), n5Var);
                                        }
                                    }
                                    l5Var22.d = true;
                                    l5Var22.f45664c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), l5Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    l5Var22.j();
                                    l5Var22.d = true;
                                    l5Var22.f45664c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), l5Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                l5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = l5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        l5Var22.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                l5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = l5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        l5Var22.e.set(f10, tL_starGiftCollection3);
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
