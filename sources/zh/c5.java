package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class c5 implements RequestDelegate {
    public final int f50348a;
    public final e5 f50349b;

    public c5(e5 e5Var, int i10) {
        this.f50348a = i10;
        this.f50349b = e5Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50348a) {
            case 0:
                final e5 e5Var = this.f50349b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        e5 e5Var2 = e5Var;
                        switch (i10) {
                            case 0:
                                long j10 = e5Var2.f50442b;
                                int i11 = e5Var2.f50441a;
                                ArrayList arrayList = e5Var2.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    e5Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (e5Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            f5 f5Var = new f5(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            f5Var.f50504c = true;
                                            f5Var.d = i13;
                                            e5Var2.h.put(Integer.valueOf(i13), f5Var);
                                        }
                                    }
                                    e5Var2.d = true;
                                    e5Var2.f50443c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), e5Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    e5Var2.j();
                                    e5Var2.d = true;
                                    e5Var2.f50443c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), e5Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                e5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = e5Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        e5Var2.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                e5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = e5Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        e5Var2.e.set(f10, tL_starGiftCollection3);
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
                final e5 e5Var2 = this.f50349b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        e5 e5Var22 = e5Var2;
                        switch (i10) {
                            case 0:
                                long j10 = e5Var22.f50442b;
                                int i11 = e5Var22.f50441a;
                                ArrayList arrayList = e5Var22.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    e5Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (e5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            f5 f5Var = new f5(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            f5Var.f50504c = true;
                                            f5Var.d = i13;
                                            e5Var22.h.put(Integer.valueOf(i13), f5Var);
                                        }
                                    }
                                    e5Var22.d = true;
                                    e5Var22.f50443c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), e5Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    e5Var22.j();
                                    e5Var22.d = true;
                                    e5Var22.f50443c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), e5Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                e5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = e5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        e5Var22.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                e5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = e5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        e5Var22.e.set(f10, tL_starGiftCollection3);
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
                final e5 e5Var3 = this.f50349b;
                e5Var3.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        e5 e5Var22 = e5Var3;
                        switch (i10) {
                            case 0:
                                long j10 = e5Var22.f50442b;
                                int i11 = e5Var22.f50441a;
                                ArrayList arrayList = e5Var22.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    e5Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (e5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            f5 f5Var = new f5(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            f5Var.f50504c = true;
                                            f5Var.d = i13;
                                            e5Var22.h.put(Integer.valueOf(i13), f5Var);
                                        }
                                    }
                                    e5Var22.d = true;
                                    e5Var22.f50443c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), e5Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    e5Var22.j();
                                    e5Var22.d = true;
                                    e5Var22.f50443c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), e5Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                e5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = e5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        e5Var22.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                e5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = e5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        e5Var22.e.set(f10, tL_starGiftCollection3);
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
