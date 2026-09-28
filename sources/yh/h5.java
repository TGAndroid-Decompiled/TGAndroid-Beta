package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class h5 implements RequestDelegate {
    public final int f47477a;
    public final j5 f47478b;

    public h5(j5 j5Var, int i10) {
        this.f47477a = i10;
        this.f47478b = j5Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47477a) {
            case 0:
                final j5 j5Var = this.f47478b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        j5 j5Var2 = j5Var;
                        switch (i10) {
                            case 0:
                                long j3 = j5Var2.f47567b;
                                int i11 = j5Var2.f47566a;
                                ArrayList arrayList = j5Var2.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j5Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j5Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            k5 k5Var = new k5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            k5Var.f47607c = true;
                                            k5Var.d = i13;
                                            j5Var2.h.put(Integer.valueOf(i13), k5Var);
                                        }
                                    }
                                    j5Var2.d = true;
                                    j5Var2.f47568c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), j5Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    j5Var2.j();
                                    j5Var2.d = true;
                                    j5Var2.f47568c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), j5Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                j5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = j5Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        j5Var2.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                j5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j5Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        j5Var2.e.set(f10, tL_starGiftCollection3);
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
                final j5 j5Var2 = this.f47478b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        j5 j5Var22 = j5Var2;
                        switch (i10) {
                            case 0:
                                long j3 = j5Var22.f47567b;
                                int i11 = j5Var22.f47566a;
                                ArrayList arrayList = j5Var22.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j5Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            k5 k5Var = new k5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            k5Var.f47607c = true;
                                            k5Var.d = i13;
                                            j5Var22.h.put(Integer.valueOf(i13), k5Var);
                                        }
                                    }
                                    j5Var22.d = true;
                                    j5Var22.f47568c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), j5Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    j5Var22.j();
                                    j5Var22.d = true;
                                    j5Var22.f47568c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), j5Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                j5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = j5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        j5Var22.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                j5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        j5Var22.e.set(f10, tL_starGiftCollection3);
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
                final j5 j5Var3 = this.f47478b;
                j5Var3.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        j5 j5Var22 = j5Var3;
                        switch (i10) {
                            case 0:
                                long j3 = j5Var22.f47567b;
                                int i11 = j5Var22.f47566a;
                                ArrayList arrayList = j5Var22.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j5Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            k5 k5Var = new k5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            k5Var.f47607c = true;
                                            k5Var.d = i13;
                                            j5Var22.h.put(Integer.valueOf(i13), k5Var);
                                        }
                                    }
                                    j5Var22.d = true;
                                    j5Var22.f47568c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), j5Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    j5Var22.j();
                                    j5Var22.d = true;
                                    j5Var22.f47568c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), j5Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                j5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = j5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        j5Var22.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                j5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        j5Var22.e.set(f10, tL_starGiftCollection3);
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
