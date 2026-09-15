package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k5 implements RequestDelegate {
    public final int f47372a;
    public final m5 f47373b;

    public k5(m5 m5Var, int i10) {
        this.f47372a = i10;
        this.f47373b = m5Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47372a) {
            case 0:
                final m5 m5Var = this.f47373b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        m5 m5Var2 = m5Var;
                        switch (i10) {
                            case 0:
                                long j3 = m5Var2.f47458b;
                                int i11 = m5Var2.f47457a;
                                ArrayList arrayList = m5Var2.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    m5Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (m5Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            n5 n5Var = new n5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            n5Var.f47492c = true;
                                            n5Var.d = i13;
                                            m5Var2.h.put(Integer.valueOf(i13), n5Var);
                                        }
                                    }
                                    m5Var2.d = true;
                                    m5Var2.f47459c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), m5Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    m5Var2.j();
                                    m5Var2.d = true;
                                    m5Var2.f47459c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), m5Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                m5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = m5Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        m5Var2.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                m5Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = m5Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        m5Var2.e.set(f10, tL_starGiftCollection3);
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
                final m5 m5Var2 = this.f47373b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        m5 m5Var22 = m5Var2;
                        switch (i10) {
                            case 0:
                                long j3 = m5Var22.f47458b;
                                int i11 = m5Var22.f47457a;
                                ArrayList arrayList = m5Var22.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    m5Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (m5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            n5 n5Var = new n5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            n5Var.f47492c = true;
                                            n5Var.d = i13;
                                            m5Var22.h.put(Integer.valueOf(i13), n5Var);
                                        }
                                    }
                                    m5Var22.d = true;
                                    m5Var22.f47459c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), m5Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    m5Var22.j();
                                    m5Var22.d = true;
                                    m5Var22.f47459c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), m5Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                m5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = m5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        m5Var22.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                m5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = m5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        m5Var22.e.set(f10, tL_starGiftCollection3);
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
                final m5 m5Var3 = this.f47373b;
                m5Var3.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        m5 m5Var22 = m5Var3;
                        switch (i10) {
                            case 0:
                                long j3 = m5Var22.f47458b;
                                int i11 = m5Var22.f47457a;
                                ArrayList arrayList = m5Var22.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    m5Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (m5Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            n5 n5Var = new n5(i11, j3, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            n5Var.f47492c = true;
                                            n5Var.d = i13;
                                            m5Var22.h.put(Integer.valueOf(i13), n5Var);
                                        }
                                    }
                                    m5Var22.d = true;
                                    m5Var22.f47459c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), m5Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    m5Var22.j();
                                    m5Var22.d = true;
                                    m5Var22.f47459c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), m5Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                m5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = m5Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        m5Var22.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                m5Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = m5Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        m5Var22.e.set(f10, tL_starGiftCollection3);
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
